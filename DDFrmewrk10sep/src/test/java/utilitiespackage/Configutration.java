package utilitiespackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configutration {
	
 public static Properties pro;
 String path="C:\\Users\\D. hussain\\eclipse-workspace\\DDFrmewrk10sep\\configrutation\\config11.properties";
 
 public Configutration()
 {
	 FileInputStream fn=null;
	  try {
		fn= new  FileInputStream(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	  pro=new Properties();
	  
	  try {
		pro.load(fn);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 
 public String geturl()
 {
	 String s1=pro.getProperty("url");
	 
	 if(s1!=null)
	 {
		 return s1;
	 }
	 else
	 {
		 throw new RuntimeException("url not found");
	 }
 }
 public String getbrowser()
 {
	 String s1=pro.getProperty("browser");
	 
	 if(s1!=null)
	 {
		 return s1;
	 }
	 else
	 {
		 throw new RuntimeException("browser not found");
	 }
 }
 

}
