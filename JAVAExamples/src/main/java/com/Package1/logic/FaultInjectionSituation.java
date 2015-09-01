package com.Package1.logic;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FaultInjectionSituation {
	static Logger logger = LoggerFactory.getLogger(StringEmpty.class);
	public String action() {
		Writer w;
		try {
			w = new Writer("test");
		} catch (IOException e) {
			logger.info("thrown: " + e.getMessage());
			return e.getLocalizedMessage();
		}
		return "returned without throw";
	}

}
