package in.javahome.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	@Qualifier(value="e")
	private Engine engine;

	

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	void startCar() {
		engine.start();
		System.out.println("Car started..");
	}

	void stopCar() {
		engine.stop();
		System.out.println("Car stopped....");
	}

}
