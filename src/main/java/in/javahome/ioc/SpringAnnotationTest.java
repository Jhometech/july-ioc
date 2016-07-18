package in.javahome.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationTest {
public static void main(String[] args) {
	ApplicationContext ioc = new AnnotationConfigApplicationContext(MyApplication.class);
	Car bean =   (Car) ioc.getBean("car");
	bean.startCar();
	bean.stopCar();
}
}
