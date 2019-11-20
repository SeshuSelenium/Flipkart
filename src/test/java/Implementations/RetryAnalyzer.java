package Implementations;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int count = 1;
	
	int retryLimit = 2;
	
	public boolean retry(ITestResult result) {
	
		if (count<retryLimit) {
			
			count ++;
			
			return true;
			
		}
		
		
		return false;
	}
	
	
}