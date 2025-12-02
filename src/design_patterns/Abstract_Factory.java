package design_patterns;

	interface Button {
		void render();

	}
	
	interface CheckBox {
		void render();
	}
	
	class WindowButton implements Button {
		@Override
		public void render() {
			System.out.println("Rendering a window button.");
		}
	}
	class WindowCheckBox implements CheckBox {
		@Override
		public void render() {
			System.out.println("Rendering a window CheckBox.");
		}
	}
	class MacButton implements Button {
		@Override
		public void render() {
			System.out.println("Rendering a Mac button.");
		}
	}
	
	class MacCheckBox implements CheckBox {
		@Override
		public void render() {
			System.out.println("Rendering a Mac CheckBox.");
		}
	}
	
	interface GUIFactory{
		Button createButton();
		CheckBox createCheckBox();
	}
	class WindowFactory implements GUIFactory{

		@Override
		public Button createButton() {
			return new WindowButton();
		}

		@Override
		public CheckBox createCheckBox() {
			return new WindowCheckBox();
		}
	}
	
	class MacFactory implements GUIFactory{

		@Override
		public Button createButton() {
			return new MacButton();
		}

		@Override
		public CheckBox createCheckBox() {
			return new MacCheckBox();
		}
	}


public class Abstract_Factory {
	
	public static void main(String[] args) {
		GUIFactory windowFactory = new WindowFactory();
		
		Button windowButton = windowFactory.createButton();
		CheckBox windowCheckBox = windowFactory.createCheckBox();
		
		windowButton.render();
		windowCheckBox.render();
		
		GUIFactory macFactory=new MacFactory();
		
		Button macButton = macFactory.createButton();
		CheckBox macCheckBox = macFactory.createCheckBox();
		
		macButton.render();
		macCheckBox.render();
	}
	
	
}
