package Handlingstaticdropdowns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingstaticdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Katiusca\\MiscelaneosSelenium\\Handlingstaticdropdowns\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://spicejet.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	Thread.sleep(4000);
	
	//Seleción de pasajeros- Almacena el elemento en adultos 
	WebElement adultos = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
	//Nuevo objeto select para seleccionar el numero de pasajeros 
	Select adultosdrp = new Select(adultos);
	//selecciono por el visible texto
	adultosdrp.selectByValue("2");
	 

   	
	//Selección de niños
	WebElement childs = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
	Select child = new Select(childs);
	child.selectByValue("2");
	
	
	//Obtener el texto seleccionado de pasajeros
	driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
	System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());
	
}
}
	



