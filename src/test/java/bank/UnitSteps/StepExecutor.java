package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor extends SeleniumOperations
{
	public static void main(String[] args) 
	{
		//browser launch
		Object[] input = new Object[2];
		input[0]= "chrome";
		input[1]= "E:\\\\AutomationSupport\\\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input);
		
		//open application
		Object[] input1 = new Object[1];
		input1[0] = "http://primusbank.qedgetech.com/";
		SeleniumOperations.openApplication(input1);
		
		//Credentials
		/*
		 * Object[] input2 = new Object[2]; input2[0] = "//*[@name='txtuId']"; input2[1]
		 * = "Admin"; Object[] input3 = new Object[2]; input3[0] =
		 * "//*[@name='txtPword']"; input3[1] = "Admin";
		 */
		credentials("//*[@name='txtuId']", "Admin");
		credentials("//*[@name='txtPword']", "Admin");
		Login("//*[@src='images/login.jpg']");
		
		//Branches
		Object[] input2 = new Object[1];
		input2[0] = "//*[@src='images/Branches_but.jpg']";
		SeleniumOperations.Click(input2);
		
		//Country
		Object[] input3 = new Object[2];
		input3[0]="//*[@name='lst_countryS']";
		input3[1]="INDIA";
		SeleniumOperations.DropDown(input3);
		
		//State
		Object[] input4 = new Object[2];
		input4[0]="//*[@name='lst_stateS']";
		input4[1]="Andhra Pradesh";
		SeleniumOperations.DropDown(input4);
		
		//City
		Object[] input5 = new Object[2];
		input5[0]="//*[@style='font-family:Arial;font-size:Smaller;width:120px;'][@name='lst_cityS']";
		input5[1]="Hyderabad";
		SeleniumOperations.DropDown(input5);
		
		//Search
		Object[] input6 = new Object[1];
		input6[0] = "//*[@type='image'][@id='btn_search']";
		SeleniumOperations.Search(input6);
		
		
		
	}

	private static void Login(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void credentials(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	

}
