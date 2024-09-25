package com.loginregistration.controller;

import java.io.IOException;
//import java.io.PrintWriter;

//import com.loginregistration.model.Constant;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/home")
public class HomeController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * resp.setContentType("text/html"); PrintWriter printW = resp.getWriter();
		 * printW.println("<h1>HelloWorld</h1>"); printW.close();
		 * req.getRequestDispatcher(Constant.Path.TOPBAR).forward(req, resp);
		 */
		req.getRequestDispatcher("/views/home.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
