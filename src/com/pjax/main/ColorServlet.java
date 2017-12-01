package com.pjax.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pjax.utils.SysUtils;


//@WebServlet("/ColorServlet")
public class ColorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String color=request.getParameter("color");
		String uid=SysUtils.getOrderIdByUUId(1);
		if(color!=null){
			String html="<div id=\"color\" style=\"background-color:"+color+";width:100%;height:100%;\">非常之地，"+uid+"非常之战</div>";
			SysUtils.StringOfReturn(response,html);  	
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
