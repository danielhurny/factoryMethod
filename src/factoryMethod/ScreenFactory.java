package factoryMethod;

public class ScreenFactory {

	public static void main(String[] args) {
		
		Screen screen1= ScreenFactory.getScreen("small");
		screen1.size();
		
		Screen screen2 = ScreenFactory.getScreen("large");
		screen2.size();

		Screen screen3 = ScreenFactory.getScreen("mid");
		screen3.size();
	}
	
	public static Screen getScreen(String size) {
		switch(size.toLowerCase()){
		case  "small":
			return new Small();
		case  "mid":
			return new Mid();
		case  "large":
			return new Large();
		
		default: 
			return null;
		}
		
	}

}
