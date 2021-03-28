package com.qa.ThreadClass;

import com.qa.pageActions.GooglePageActions;

public class MultiThreadFeature extends Thread {

	public String browserName;
	GooglePageActions googlePageActions;

	public MultiThreadFeature(String ThreadName, String brwoserName) {
		super(ThreadName);
		this.browserName = brwoserName;
		googlePageActions = new GooglePageActions();
	}

	@Override
	public void run() {
		System.out.println("Thread started-------------:>" + Thread.currentThread().getName());

		try {
			Thread.sleep(1000);
			googlePageActions.setup(browserName);
			googlePageActions.googleSearch();

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			googlePageActions.tearDown();
		}

		System.out.println("Thread ended-------------:>" + Thread.currentThread().getName());

	}

}
