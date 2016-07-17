package in.javahome.ioc;

public class Car {
	private Engine engine;

	public Car(Engine engine) {
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
