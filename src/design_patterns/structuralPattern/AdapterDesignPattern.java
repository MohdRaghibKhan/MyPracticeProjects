package design_patterns.structuralPattern;


interface USBTypeC{
	void connectWithTypeC();
}
class USBTypeCDevice implements USBTypeC{

	public void connectWithTypeC() {
		System.out.println("Connected With Type C");
	}
}

class Laptop{  // THIS IS THE SYSTEM WE WANT TO CONNECT
	
	public void plugInUSB(USBTypeC usbDevice) {
		System.out.println("Trying to plugin");
		usbDevice.connectWithTypeC();
	}
}

// new port
class USBTypeADevice{
	void connectWithTypeA() {
		System.out.println("Connected With Type A");
	}
}
class USBAdapter implements USBTypeC{

	
	USBTypeADevice typeADevice;
	public USBAdapter(USBTypeADevice typeADevice) {
		this.typeADevice=typeADevice;
	}
	@Override
	public void connectWithTypeC() {
		System.out.println("Converting Type C with Type A");
		typeADevice.connectWithTypeA();
	}
}



public class AdapterDesignPattern {
	
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		USBTypeCDevice typeCDevice=new USBTypeCDevice();
		laptop.plugInUSB(typeCDevice);
		
//		connecting with different port
		
		USBTypeADevice  oldPendrive=new USBTypeADevice();
		USBTypeC adapter=new USBAdapter(oldPendrive);
		laptop.plugInUSB(adapter);
		
	}
}
