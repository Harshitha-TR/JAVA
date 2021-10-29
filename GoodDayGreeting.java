package Demo.Assignment;

import org.springframework.stereotype.Component;

@Component
public class GoodDayGreeting implements Greeting{

	String greeting = "Have a Good Day";
	
	
	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	public GoodDayGreeting() {
		super();
		System.out.println(greeting);
	}


	public String greet() {
		// TODO Auto-generated method stub
		return null;
	}
}
