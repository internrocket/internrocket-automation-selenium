package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Discovertest {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:8443/?login");		
		driver.findElement(By.id("email")).sendKeys("satya3666@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("satya2019");
		driver.findElement(By.id("login")).click();
	    Thread.sleep(3000);
		driver.findElement(By.id("profile")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[2]/ul/div/div/li[1]/a/div[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("Activity")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("vanityurl")).sendKeys("satya449");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[1]/div[4]/div[2]/button[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("status")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("seeking internships")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("confidence")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("i am certain of my life's calling")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("callingage")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("toto")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("next2")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("about")).sendKeys("The pleasant, earthy smell after rain. Example: Although I do love the pleasant, dewy petrichor of the post-rain afternoon, I still hope the weather stays sunny.");
	    Thread.sleep(5000);
	    driver.findElement(By.id("singlePicker")).sendKeys("72070");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div[1]/div/div/div[2]/ul/li[1]/p")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/button[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[3]/div/div/div[1]/tags-input/div/div/input")).sendKeys("html,css,angular,java");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[3]/div/div/div[1]/tags-input/div/auto-complete/div/ul/li")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[4]/div/div/div[1]/tags-input/div/div/input")).sendKeys("java");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[4]/div/div/div[1]/tags-input/div/auto-complete/div/ul/li[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[5]/div/button[2]")).click();
	    Thread.sleep(3000);
	    //driver.findElement(By.id("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[5]/div[1]/div/div[3]/div/div/div/button[1]")).click();
	    //Thread.sleep(3000);
	    driver.findElement(By.id("yes")).click();
	    Thread.sleep(6000);
	    //driver.findElement(By.id("yesc")).click();
	    //Thread.sleep(2000);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[5]/button[1]")).click();
	    driver.findElement(By.id("call")).click();
		Thread.sleep(3000);
        driver.findElement(By.id("Advance")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("findname")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("find-field")).sendKeys("satya6892");
        Thread.sleep(3000);
        driver.findElement(By.id("find-button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[1]/div")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[1]/div/div/div/div/div/div[2]/div[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Activity")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("followclick")).click();
        Thread.sleep(3000);        
        driver.findElement(By.id("messageid")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("replyField")).sendKeys("Hi satya");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div/form/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[2]/span/div[1]/div/div[2]/div/span")).click();
        //Discoverusermodule Discoverusermodule= new Discoverusermodule();
	    //Discoverusermodule.discover();
        Thread.sleep(4000);
        driver.findElement(By.id("call")).click();
		Thread.sleep(3000);
        driver.findElement(By.id("Advance")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("advanceid")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("proid")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("pay")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("unpaid")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("typel")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Full Internship")).click();        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[2]/div/div[1]/div[4]/div/div[2]/div/div[2]/tags-input/div/div/input")).sendKeys("html,css");
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[2]/div/div[1]/div[4]/div/div[2]/div/div[3]/tags-input/div/div/input")).sendKeys("ceo");
        //Thread.sleep(5000);
        //driver.findElement(By.id("networkclick")).click();
        //Thread.sleep(5000);
       //driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[2]/div/div[1]/div[4]/div/div[2]/div/div[3]/tags-input/div/auto-complete/div/ul/li")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("sear")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("microclick")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("viewjob")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("applyclick")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"recentChatInbox\"]/span/div[1]/div/div[2]/span[2]")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("newMessageId")).sendKeys("Hi Testing");
       Thread.sleep(3000);
       driver.findElement(By.id("send")).click();  
       Thread.sleep(4000);
		driver.findElement(By.id("account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout")).click();
		
	
	    
	} 

}


