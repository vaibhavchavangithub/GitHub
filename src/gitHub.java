import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitHub {
static {
	System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe");
}
	public static void main(String[] args) throws AWTException {
	WebDriver d = new ChromeDriver ();
	d.get("https://www.google.com/");
	d.manage().window().maximize();
	d.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
	d.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("youtube");
	d.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
	Robot chitti = new Robot();
	chitti.keyPress(KeyEvent.VK_ENTER);
	d.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
	}

}
