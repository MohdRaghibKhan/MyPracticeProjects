package Java_8;

interface Engine {
    default void start() {
        System.out.println("Engine starting...");
    }
}

interface Electric {
    default void start() {
        System.out.println("Electric start...");
    }
}

class HybridCar implements Engine, Electric {

	@Override
	public void start() {
		Electric.super.start();
	}
    
}

public class DefaultMethod {

	public static void main(String[] args) {
		HybridCar car=new HybridCar();
		car.start();
	}
	
}
