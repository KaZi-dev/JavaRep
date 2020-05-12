package Test.CamundaP;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class TestCaseDelegate implements JavaDelegate
{
	public static String name;
	public static String address;
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		name = (String) execution.getVariable("name");
		address = (String) execution.getVariable("address");
		System.out.println("Name: " + name + " Adresse: " + address);
	}
}
