package com.loginregistration.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.loginregistration.model.User;
import com.loginregistration.service.UserService;
import com.loginregistration.service.UserServiceImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/resetPassword")
public class ResetPasswordController extends HttpServlet {
	UserService userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/resetPassword.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String newPassword = req.getParameter("newPassword");
		String confirmPassword = req.getParameter("confirmPassword");
		String email = (String) req.getSession().getAttribute("resetEmail");

		if (newPassword != null && confirmPassword != null && newPassword.equals(confirmPassword)) {
			try {
				User user = userService.findByEmail(email);
				if (user != null) {
					userService.updatePassword(user.getUserName(), newPassword);
					req.setAttribute("mess", "Đổi mật khẩu thành công.");
					req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
				} else {
					req.setAttribute("error", "Lỗi hệ thống.");
					req.getRequestDispatcher("/views/resetPassword.jsp").forward(req, resp);
				}

			} catch (Exception e) {
				req.setAttribute("error", "Lỗi hệ thống.");
				req.getRequestDispatcher("/views/resetPassword.jsp").forward(req, resp);
				e.printStackTrace();
			}

		} else {
			req.setAttribute("error", "Mật khẩu không khớp.");
			req.getRequestDispatcher("/views/resetPassword.jsp").forward(req, resp);
		}
	}
}
