package com.pjax.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

public class SysUtils {

	public static String getOrderIdByUUId(int mid) {
		int machineId = 1;// 最大支持1-9个集群机器部署
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		if (hashCodeV < 0) {// 有可能是负数
			hashCodeV = -hashCodeV;
		}
		if(mid>1){machineId=mid;}
		// 0 代表前面补充0
		// 4 代表长度为4
		// d 代表参数为正数型
		return machineId + String.format("%015d", hashCodeV);
	}
	
	
	public static void StringOfReturn(HttpServletResponse response,String str) {
		response.setContentType("text/html");  
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=null;
		try {
			out = response.getWriter();
			out.println(str);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	
}
