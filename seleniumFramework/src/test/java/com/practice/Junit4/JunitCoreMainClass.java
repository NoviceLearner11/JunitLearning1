package com.practice.Junit4;

import org.junit.runner.JUnitCore;

public class JunitCoreMainClass {

		public static void main(String[] args)
		{
			JUnitCore runner = new JUnitCore();
			//Adding listener here
			runner.addListener(new JUnitExecutionListener());
			runner.run(SuitTest.class);
		}
	
}
