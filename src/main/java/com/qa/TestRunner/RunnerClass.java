package com.qa.TestRunner;

import com.qa.ThreadClass.MultiThreadFeature;

public class RunnerClass {

	public static void main(String args[]) {

		System.out.println("Thread started");

		// -DchromeBrowser=2 -DedgeBrowser=2

		int chromeBrowser = Integer.parseInt(System.getProperty("chrome"));
		int edgeBrowser = Integer.parseInt(System.getProperty("edge"));

		for (int i = 1, j = 1; i <= chromeBrowser || j <= edgeBrowser; i++, j++) {

			new MultiThreadFeature("Chrome thread", "chrome").start();
			new MultiThreadFeature("Edge Thread", "edge").start();
		}
	}

}
