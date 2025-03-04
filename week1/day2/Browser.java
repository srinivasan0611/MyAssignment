package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public void loadurl()
	{
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser launch1 = new Browser();
		
		String browserName = launch1.launchBrowser("Google Chrome");
        System.out.println("Launched Browser: " + browserName);
        launch1.loadurl();
	}

}
