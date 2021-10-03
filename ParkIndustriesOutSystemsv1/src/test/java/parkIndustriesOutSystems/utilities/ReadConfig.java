package parkIndustriesOutSystems.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	//properties object
	Properties pro;
	
	//constructor to load the config file
	public ReadConfig()
	{
		File  src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis); 
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	//methods for reading each variable in config.properties
	//use properties class objects
	
	public String getURL() 
	{ 
		  String url =pro.getProperty("baseURL"); 
		  return url;
	}
	  
	public String getEmail() 
	{ 
		  String email =pro.getProperty("email"); 
		  return email;   
	}
	 	
	public String getChromePath()
	{
		String chromePath =pro.getProperty("chromedriverPath");
		return chromePath;
	}
	
	public String getFirefoxPath()
	{
		String firefoxPath =pro.getProperty("geckodriverPath");
		return firefoxPath;
	}
	
	public String getMsEdgePath()
	{
		String msedgePath =pro.getProperty("msedgedriverPath");
		return msedgePath;
	}
	
	public String getOperaPath()
	{
		String operaPath =pro.getProperty("operadriverPath");
		return operaPath;
	}
	
	public String getLuggageReceiptPath()
	{
		String luggageReceiptPath =pro.getProperty("luggageReceiptPath");
		return luggageReceiptPath;
	}
	
	public String getUploadPath()
	{
		String uploadPath =pro.getProperty("uploadFile");
		return uploadPath;
	}

	public String getComment() 
	{
		String comment = pro.getProperty("comment");
		return comment;
	}

	public String getText() 
	{
		String text = pro.getProperty("text");
		return text;
	}

	public String getNum() 
	{
		String number = pro.getProperty("number");
		return number;
	}

	public String getUni() 
	{
		String uni = pro.getProperty("uni");
		return uni;
	}

	public String getLoc() 
	{
		String Loc = pro.getProperty("Loc");
		return Loc;
	}

	public String getDegree() 
	{
		String degree = pro.getProperty("degree");
		return degree;
	}

	public String getMajor() 
	{
		String major = pro.getProperty("Major");
		return major;
	}

	public String getDescrip() 
	{
		String description = pro.getProperty("description");
		return description;
	}

	public String getCost() 
	{
		String cost = pro.getProperty("cost");
		return cost;
	}

	public String getCareer() 
	{
		String Career = pro.getProperty("Career");
		return Career;
	}

}
