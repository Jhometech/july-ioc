package in.javahome.ioc;

import org.springframework.stereotype.Component;

@Component
public class WelcomeBean {
	public void myInit(){
		System.out.println("init logic");
	}
	public void myDestroy(){
		System.out.println("destroy logic");
	}
	void message() {
		System.out.println("Welcome to Spring IOC");
	}
}