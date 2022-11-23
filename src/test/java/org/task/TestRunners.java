package org.task;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



//WAY 1
	//@RunWith(Suite.class)
	//@SuiteClasses({A.class,B.class,Sample.class})
public class TestRunners {

	//WAY 2
		@Test
		public void suiteExecution() {
			Result rs = JUnitCore.runClasses(B.class,A.class,Sample.class);
			System.out.println("run time"+rs.getRunTime());
			System.out.println("run count"+rs.getRunCount());
			System.out.println("failure count"+rs.getFailureCount());
			System.out.println("ignore count"+rs.getIgnoreCount());
			List<Failure> fail = rs.getFailures();
			for (Failure failure : fail) {
				System.out.println(failure);
			
			}

		}
	
}
