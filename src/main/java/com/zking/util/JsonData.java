package com.zking.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

//import org.apache.struts2.ServletActionContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonData {
	
	
	
	public void  JsonVaString(Object object) {
		

			try {
				// 开始对数据JSON化并判空
				ObjectMapper mapper = new ObjectMapper();
				String outstr = "";

				if (object != null) {

					outstr = mapper.writeValueAsString(object);

					System.out.println("输出转换-------------------------------------");
					System.out.println(outstr);
					System.out.println("-------------------------------------输出转换");

				} else {
					
					outstr = mapper.writeValueAsString("{msg:no}");
				}

//
//				//设置utf-8格式
//				ServletActionContext.getResponse().setCharacterEncoding("utf-8");
//				ServletActionContext.getRequest().setCharacterEncoding("utf-8");
//				// 输出并提交
//				ServletActionContext.getResponse().getWriter().write(outstr);
//				ServletActionContext.getResponse().getWriter().flush();
				
				
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
