package in.javahome.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		
		Car bean = ioc.getBean(Car.class);
		bean.startCar();
		bean.stopCar();
	}
}
