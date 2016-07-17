package in.javahome.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {
	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		C bean = ioc.getBean(C.class);
	}
}
