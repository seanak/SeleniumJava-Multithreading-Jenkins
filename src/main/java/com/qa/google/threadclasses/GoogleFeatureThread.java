package com.qa.google.threadclasses;

import com.qa.google.GooglePage;

public class GoogleFeatureThread extends Thread {
	public String browserName;
	GooglePage googlePage;
	
	
	public GoogleFeatureThread(String threadName,String browserName){
		super(threadName);
		this.browserName = browserName;
		googlePage = new GooglePage();
	}
	
	@Override
	public void run(){
		System.out.println("thread --- started "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			googlePage.setUp(this.browserName);
			googlePage.googleSearchTest();
			System.out.println(" Thread --- ended"+Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		finally{
			googlePage.tearDown();
		}
		
		
	}

	
}
