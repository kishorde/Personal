package com.cybage.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4jDemo {

	static Logger logger = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logger = Logger.getLogger(Log4jDemo.class);
//		logger.setLevel(Level.INFO);
		
		logger.debug("debug msg");
		logger.info("general info");
		logger.warn("warning msg");
		
		logger.fatal("Fatal");
		logger.error("error");
		
		

	}

}
