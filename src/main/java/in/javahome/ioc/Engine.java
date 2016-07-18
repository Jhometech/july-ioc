package in.javahome.ioc;

import org.springframework.stereotype.Component;

@Component(value="e")
public class Engine {
	void start() {
		System.out.println("Engine started..");
	}

	void stop() {
		System.out.println("Engine stopped..");
	}
}
