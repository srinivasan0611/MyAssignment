package week2.day1;

public class Browser {
	
	
	String launchBrowser(String browserName) {
		
		System.out.println(browserName + " launched successfully");
		return browserName;
	}
	
	void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		
		Browser sr = new Browser();
		sr.launchBrowser("Chrome");
        sr.loadUrl();
     
	}

}
