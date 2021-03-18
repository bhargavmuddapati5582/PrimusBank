package bank.methods;

import java.net.UnknownHostException;

import org.junit.After;
import org.junit.Before;

import cucumber.api.Scenario;

public class Hookable
{
	@Before
	public void before(Scenario scenario)throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("E:\\AutomationSupport\\bank.html","PrimusBank");
		HTMLReportGenerator.TestCaseStart(scenario.getName(),scenario.getStatus());
		System.out.println("------------------Scenario Start------------------------");
	
	}
	@After
	public void after(Scenario scenario)
	{
		System.out.println("------------------Scenario End------------------------");
		HTMLReportGenerator.TestSuiteEnd();
		HTMLReportGenerator.TestCaseEnd();
		
		
	}

}
