package Demo.Assignment;

import org.springframework.stereotype.Component;

@Component
public class MorningGreeting implements Greeting{

	String greeting = "Good morning";
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public MorningGreeting() {
		super();
		System.out.println(greeting);
	}

	public String greet() {
		// TODO Auto-generated method stub
		return null;
	}
}
