package retryfailedTc;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class RetryLogic implements IRetryAnalyzer{
	int counter = 0;
	int retryLimit = 2;
	/*
	 * (non-Javadoc)
	 * @see org.testng.IRetryAnalyzer#retry(org.testng.ITestResult)
	 * 
	 * This method decides how many times a test needs to be rerun.
	 * TestNg will call this method every time a test fails. So we 
	 * can put some code in here to decide when to rerun the test.
	 * 
	 * Note: This method will return true if a tests needs to be retried
	 * and false it not.
	 *
	 */
	public boolean retry(ITestResult result) {
	
		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		return false;
	}
	public boolean retry1(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}
}
