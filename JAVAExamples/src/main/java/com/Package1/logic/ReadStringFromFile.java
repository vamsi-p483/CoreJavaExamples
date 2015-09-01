package com.Package1.logic;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.apache.log4j.Logger;
import com.Package1.logic.MyGroupRegex;

public class ReadStringFromFile{
	final static Logger logger = Logger.getLogger(ReadStringFromFile.class);
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		try {
			
			File file = new File("test.txt");
			FileReader fileReader = new FileReader(file);
			StringBuffer stringBuffer = new StringBuffer();
			int numCharsRead;
			char[] charArray = new char[1024];
			while ((numCharsRead = fileReader.read(charArray)) > 0) {
				stringBuffer.append(charArray, 0, numCharsRead);
			}
			fileReader.close();
			MyGroupRegex mgr=new MyGroupRegex();
			
			String str=stringBuffer.toString();
			
			logger.info(mgr.captureValues(str));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
