package com.qa.google.TestRunner;

import com.qa.google.threadclasses.GoogleFeatureThread;

public class GoogleTestRunner {

	public static void main(String[] args) {
	/*	
	Thread t1 =	new GoogleFeatureThread("chrome thread", "chrome");
	Thread t2 =	new GoogleFeatureThread("firefox thread", "firefox");
	
	t1.start();
	t2.start();
	*/
		
		for(int i=0;i<5;i++){
			new GoogleFeatureThread("chrome thread", "chrome").start();
			
		}

	}

}
