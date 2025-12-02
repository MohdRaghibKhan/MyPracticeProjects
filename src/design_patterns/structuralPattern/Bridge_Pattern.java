package design_patterns.structuralPattern;

interface Engine {
	void start();
}

class ElectricEngine implements Engine {
	@Override
	public void start() {
		System.out.println("Starting electric engine... Silent start ⚡");
	}
}

class PetrolEngine implements Engine {
	@Override
	public void start() {
		System.out.println("Starting petrol engine... Vroom Vroom!");
	}
}

class DieselEngine implements Engine {
	@Override
	public void start() {
		System.out.println("Starting diesel engine... Rumble Rumble!");
	}
}
 abstract class Car {
    protected Engine engine; // Bridge between Car and Engine

    protected Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}

class SUVCar extends Car {
	protected SUVCar(Engine engine) {
		super(engine);
	}

	@Override
	public void drive() {
		engine.start();
		System.out.print("SUV -> ");
        System.out.println("Driving fast on the race track!\n");

	}
}
class SportsCar extends Car {
	protected SportsCar(Engine engine) {
		super(engine);
	}

	@Override
	public void drive() {
		engine.start();
		System.out.println("Sports Car -> ");
        System.out.println("Driving comfortably on rough terrain!\n");

	}
}

public class Bridge_Pattern {

	public static void main(String[] args) {

		PetrolEngine petrolEngine=new PetrolEngine();
		SUVCar suvCar=new SUVCar(petrolEngine);
		suvCar.drive();
		SportsCar sportsCar=new SportsCar(petrolEngine);
		sportsCar.drive();
		
	}

}
