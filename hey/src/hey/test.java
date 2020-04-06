package hey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String a[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhinesh_k01\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver a2=new ChromeDriver();
		a2.navigate().to("https://www.selenium.dev/downloads/");		
	}

}
