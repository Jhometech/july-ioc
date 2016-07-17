package in.javahome.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrimitiveMain {
	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		A bean = ioc.getBean(A.class);
		bean.display();
	}
}
