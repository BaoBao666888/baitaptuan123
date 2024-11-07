package com.loginregistration.controller;

import java.io.IOException;

import com.loginregistration.model.User;
import com.loginregistration.service.UserService;
import com.loginregistration.service.UserServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/forgot")
public class ForgotController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/forgot.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		try {
			
            UserService userService = new UserServiceImpl();
            User user = userService.findByEmail(email);

            if (user != null) {
                // Lưu email vào session để sử dụng ở bước tiếp theo
                req.getSession().setAttribute("resetEmail", email); 
                resp.sendRedirect("resetPassword"); // Chuyển hướng đến trang reset mật khẩu
            } else {
                req.setAttribute("error", "Email không tồn tại trong hệ thống.");
                req.getRequestDispatcher("/views/forgot.jsp").forward(req, resp);
            }
        } catch (Exception e) {
			req.setAttribute("error", e.getMessage());
			req.getRequestDispatcher("/views/forgot.jsp").forward(req, resp);
		}
	}
}
