package Test.CamundaP;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class TestCaseBDelegate implements JavaDelegate {

	public static String name;
	public static String address;
	public static String gender;
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		name = (String) execution.getVariable("name");
		address = (String) execution.getVariable("address");
		gender = (String) execution.getVariable("gender");
		System.out.println("Name: " + name + ", Adresse: " + address +  ", Gender: " + gender );
	}
}
