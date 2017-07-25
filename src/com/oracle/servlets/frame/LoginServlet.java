package com.oracle.servlets.frame;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//打开登录页面
		request.getRequestDispatcher("/WEB-INF/jsp/frame/main.html").forward(request, response);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//执行登录操作
		
		//登录成功
		
		//进入后台
		
		//登录失败
		
		//重新返回登录页面(给出错误提示)
		
	}

	
	
}
