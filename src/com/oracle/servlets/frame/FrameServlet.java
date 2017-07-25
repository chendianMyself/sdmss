package com.oracle.servlets.frame;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrameServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page=request.getParameter("p");
		/*if("top".equalsIgnoreCase(page)){
			//打开top页面
			request.getRequestDispatcher("/WEB-INF/jsp/frame/top.html");
		}else if("center".equalsIgnoreCase(page)){
			//打开center页面
			request.getRequestDispatcher("/WEB-INF/jsp/frame/center.html");
		}else if("down".equalsIgnoreCase(page)){
			//打开down页面
			request.getRequestDispatcher("/WEB-INF/jsp/frame/down.html");
		}*/
		request.getRequestDispatcher("/WEB-INF/jsp/frame/"+page+".html").forward(request, response);
	}

	
}
