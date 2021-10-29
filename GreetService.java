package Demo.Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetService implements Greeting{
	
	@Autowired
	@Qualifier("GoodDayGreeting")
	Greeting greeting;

	public GreetService() {
		super();
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}



	public void printGreeting() {
		// TODO Auto-generated method stub
		greeting.greet();
	}

	public String greet() {
		// TODO Auto-generated method stub
		return null;
	}

}
