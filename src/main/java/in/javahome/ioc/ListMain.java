package in.javahome.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListMain {
	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		B bean = ioc.getBean(B.class);
		bean.display();
	}
}
