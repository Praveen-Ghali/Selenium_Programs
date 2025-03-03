package com.actiTime.generic;

import java.io.IOException;

public class DemoFileLibrary {

	public static void main(String[] args) throws IOException {
		FileLibrary f=new FileLibrary();
		System.out.println(f.getPropertyData("url"));
		System.out.println(f.getPropertyData("username"));
		System.out.println(f.getPropertyData("password"));
		System.out.println(f.getExceldata("Sheet1", 1, 2));
		System.out.println(f.getExceldata("Sheet1", 1, 1, "Giri"));
	}

}
