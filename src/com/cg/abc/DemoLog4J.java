package com.cg.abc;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.PropertyConfigurator;

public class DemoLog4J {
	public static void main(String[] args) {

		Logger myLogger = Logger.getLogger(DemoLog4J.class.getName());

		PropertyConfigurator.configure("resources/log4j.properties");

		final int priorityVal = -1;
		final boolean flag = false;

		// myLogger.setLevel((Level) Priority.DEBUG);

		myLogger.warn(myLogger.getPriority() + "Deprecated statement");
		myLogger.info("Logging information for DemoLog4j");
		myLogger.debug("Code debugging started");
		if (priorityVal < 0) {
			myLogger.warn("This is last time warning");
		}

		if (flag == false) {
			myLogger.error("Error occured! Due to false value");
		}
	}

}
