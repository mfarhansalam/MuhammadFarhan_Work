package AutomationPractice;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  // Example 1: Enter text into the text box
	        WebElement textBox = driver.findElement(By.id("name"));
	        textBox.sendKeys("Johan");
	        
	        // Example 2: Click on the alert button
	        WebElement alertButton = driver.findElement(By.id("alertbtn"));
	        alertButton.click();
	        
	     // Example 3: Switch to the alert and accept it
	        driver.switchTo().alert().accept();

	        // Example 4: Verify if the checkbox is selected
	        WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
	        if (!checkBox.isSelected()) {
	            checkBox.click();
	        }

	        // Example 5: Get the text of a displayed message
	        WebElement message = driver.findElement(By.id("displayed-text"));
	        String messageText = message.getText();
	        System.out.println("Displayed message: " + messageText);
	        
	        //example 6: switch tab
	        // Click on the button that opens a new tab
	        WebElement newTabButton = driver.findElement(By.id("openwindow"));
	        newTabButton.click();

	        // Get all window handles
	        Set<String> windowHandles = driver.getWindowHandles();

	        // Switch to the new tab
	        for (String windowHandle : windowHandles) {
	            driver.switchTo().window(windowHandle);
	        }

	        // Perform actions in the new tab (e.g., get the title)
	        System.out.println("Title of the new tab: " + driver.getTitle());
	        driver.close();

	        // Switch back to the original tab
	        driver.switchTo().window(windowHandles.iterator().next());
	        
	        //example 7:mouse over
	        WebElement mouseHoverElement = driver.findElement(By.id("mousehover"));

	        // Create an instance of Actions class
	        Actions actions = new Actions(driver);

	        // Perform mouse hover action
	        actions.moveToElement(mouseHoverElement).perform();

	        // Now, you can interact with the sub-menu items if they appear
	        // For example, let's click on a sub-menu item
	        WebElement subMenuItem = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Reload']"));
	        subMenuItem.click();

	        // Close the browser
	        driver.quit();

	}

}
