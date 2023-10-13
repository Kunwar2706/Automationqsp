package com.actitime.textscript1;

import java.io.IOException;

import com.actitime.generic1.Filelib;

public class DemoLibrary {

	public static void main(String[] args) throws IOException {
		Filelib f=new Filelib();
		 String url = f.getPropertyData("url");
		 System.out.println(url);
		String data = f. getExeldata("sheet1",1,0);
		System.out.println(data);
	 f.setExelData("sheet1",1,4,"skiped");
	
	}

}
