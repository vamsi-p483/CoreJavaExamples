package com.Package1.logic;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringEmpty {
	static Logger logger = LoggerFactory.getLogger(StringEmpty.class);

	public static void main(String args[]) {
		   
        String input1 = "";
        String input2 = null;
        String input3 ="abc";
      
        //determine if String is empty using length method , also checks if string is null
        logger.info("checking if String empty using length");
        logger.info("String " + input1 + " is empty :" +isStringEmpty(input1) );
        logger.info("String " + input2 + " is empty :" +isStringEmpty(input2) );
        logger.info("String " + input3 + " is empty :" +isStringEmpty(input3) );
      
        //determine if String is empty using equals method
        logger.info("find if String empty using equals");
        logger.info("String " + input2 + " is empty :" +isStringEmptyByEquals(input2) );
      
         //determine if String is empty using isEmpty of Java 6
        logger.info("find if String empty using isEmpty method of Java 6");
        logger.info("String " + input3 + " is empty :" + input3.isEmpty());
      
        //determine if String is empty by Apache commons StringUtils
        logger.info("check if String empty by commons StringUtils");
        logger.info("String " + input2 + " is empty :" + StringUtils.isEmpty(input2));  
             
    }
  
    public static boolean isStringEmpty(String input){
        if(input != null && input.length() == 0){
            return true;
        }
        return false;
    }
  
    public static boolean isStringEmptyByEquals(String input){
        return "".equals(input);
    }
}



