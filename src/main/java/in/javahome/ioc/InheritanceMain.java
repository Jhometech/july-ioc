package in.javahome.ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceMain {
	public static void main(String[] args) {
		AbstractApplicationContext ioc = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		Employee bean = ioc.getBean(Employee.class);
		bean.display();
	}
}
