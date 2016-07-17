package in.javahome.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCarMain {
	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		WelcomeBean bean = ioc.getBean(WelcomeBean.class);
		bean.message();
	}
}
