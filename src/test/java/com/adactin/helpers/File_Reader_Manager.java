package com.adactin.helpers;

import java.io.FileReader;

public class File_Reader_Manager {
	public File_Reader_Manager(){
		
	}
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager helper = new  File_Reader_Manager();
		return helper;
	}

	public static  Configuration_Reader_Manager getInstanceCR() throws Throwable {
		Configuration_Reader_Manager reader = new Configuration_Reader_Manager();
		return reader;
		
	}
}
