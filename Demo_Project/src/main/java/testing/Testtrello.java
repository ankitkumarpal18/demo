package testing;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Testtrello {

	public static WebDriver driver=null;
	
	

public static void main(String[] args) throws InterruptedException {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(co);
	driver.get("https://trello.com/");
	driver.manage().window().maximize();
	WebElement login = driver.findElement(By.xpath("(//a[text()='Log in'])[1]"));
	login.click();	
	WebElement username = driver.findElement(By.xpath("//*[@id='user']"));
    WebElement Continue = driver.findElement(By.xpath("//*[@id='login']"));
    username.sendKeys("ankitkumarpal18@gmail.com");
    Continue.click();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@class='css-1o07z2d']")));
   
    WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
    password.sendKeys("Magic@2021#");
    
    WebElement login1 = driver.findElement(By.id("login-submit"));
    login1.click();
    
    Thread.sleep(2000);
    
    WebElement newboard = driver.findElement(By.xpath("//*[text()='Create new board']"));
    newboard.click();
    
    Thread.sleep(5000);
    
    WebElement boardname = driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
    boardname.sendKeys("Testingforgithub1");
    Thread.sleep(5000);
    
    WebElement create = driver.findElement(By.xpath("//button[@data-testid='create-board-submit-button']"));
    create.click();
    
	 Thread.sleep(5000);
	 
	 WebElement ListA = driver.findElement(By.xpath("//input[@class='list-name-input']"));
	 ListA.sendKeys("List A");
	 
	 Thread.sleep(5000);
	 
	 WebElement addlist1 = driver.findElement(By.xpath("//input[@value='Add list']"));
	 addlist1.click();
	 
	 Thread.sleep(5000);
	 
	 WebElement ListB = driver.findElement(By.xpath("//input[@class='list-name-input']"));
	 ListB.sendKeys("List B");
	 
	 Thread.sleep(5000);
	 
	 WebElement addlist2 = driver.findElement(By.xpath("//input[@value='Add list']"));
	 addlist2.click(); 
	 
	 Thread.sleep(5000);
	
	 WebElement addcard = driver.findElement(By.xpath("(//span[@class='js-add-a-card'])[1]"));
	 addcard.click(); 
	 
	 Thread.sleep(5000);
	
	 WebElement Cardname = driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']"));
	 Cardname.sendKeys("Testcard");
	 
	 Thread.sleep(5000);
	 
	 WebElement addcard1 = driver.findElement(By.xpath("//input[@value='Add card']"));
	 addcard1.click(); 
	 
	 Thread.sleep(5000);
	 
	 WebElement close = driver.findElement(By.xpath("//a[@class='icon-lg icon-close dark-hover js-cancel']"));
	 close.click(); 
	 
	 Thread.sleep(5000);
	 
	 Actions builder = new Actions(driver);
	 
		WebElement from = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		 
		WebElement to = driver.findElement(By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[2]"));	 
		
		builder.dragAndDrop(from, to).perform();
		
		Thread.sleep(5000);
		WebElement card = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		Point point = card.getLocation();
		int xcord =point.getX();
		int ycord =point.getY();
		System.out.println(xcord + ", "+ycord);
	
		 WebElement icon = driver.findElement(By.xpath("//button[@aria-label='Open member menu']"));
		 icon.click(); 
		 
		 Thread.sleep(5000);
		 
		 WebElement logout = driver.findElement(By.xpath("//span[normalize-space()='Log out']"));
		 logout.click(); 
		 
		 Thread.sleep(5000);
		 
		 WebElement logout1 = driver.findElement(By.xpath("(//span[@class='css-178ag6o'])[1]"));
		 logout1.click(); 
		 }




}
