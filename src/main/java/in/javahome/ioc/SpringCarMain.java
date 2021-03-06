package in.javahome.ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCarMain {
	public static void main(String[] args) {
		AbstractApplicationContext ioc = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		ioc.registerShutdownHook();
		WelcomeBean bean = ioc.getBean(WelcomeBean.class);
		bean.message();
	}
}
