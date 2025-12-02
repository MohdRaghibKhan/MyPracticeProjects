package design_patterns.factory_methods;

interface Engine {
	void createEngine();
}

interface Tyre {
	void createTyre();
}

//Luxury Car Parts
class LuxuryEngine implements Engine {
	public void createEngine() {
		System.out.println("Luxury Engine Created");
	}
}

class LuxuryTyre implements Tyre {
	public void createTyre() {
		System.out.println("Luxury Tyre Created");
	}
}

//Sports Car Parts
class SportsEngine implements Engine {
	public void createEngine() {
		System.out.println("Sports Engine Created");
	}
}

class SportsTyre implements Tyre {
	public void createTyre() {
		System.out.println("Sports Tyre Created");
	}
}

interface CarFactory {
	Engine createEngine();

	Tyre createTyre();
}

class LuxuryCarFactory implements CarFactory {
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	public Tyre createTyre() {
		return new LuxuryTyre();
	}
}

class SportsCarFactory implements CarFactory {
	public Engine createEngine() {
		return new SportsEngine();
	}

	public Tyre createTyre() {
		return new SportsTyre();
	}
}

public class AbstractFactoryExample {
	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();

		Engine engine = factory.createEngine();
		Tyre tyre = factory.createTyre();

		engine.createEngine();
		tyre.createTyre();
	}
}
