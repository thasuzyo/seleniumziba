    package webdriverPackage;

    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    public class Mercurytours {

    public staic void main(String[] args){

	// Open Firefox web browser
    // Author: Bahaa
    	WebDriver driver = new FirefoxDriver();
    //	 Launch Mercury Website
	//print the titleof the page
    driver.get("http://newtours.demoaut.com/");
     //Print the title of the page 
     driver.getTitle();
     System.out.println(driver.getTitle() );
     // click on Register Link
     driver.findElement((by.linktext("REGISTER")) CLICK();
     // Enter first name
     driver.findElement (By.name("Firstname")). send keys("Suzyo");
     driver.findElement(by.name(".last name").send keys(ziba");
     //Enter phone number
     Driver.findElement(By.name"phone)).sendkeys(180018001800);"
     // Enter Email address
    		 driver.findElement(By.id(username))