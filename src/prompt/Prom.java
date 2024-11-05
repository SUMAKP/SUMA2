package prompt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prom {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usn;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement go;
	
	@FindBy(xpath="//a[@href='/pim/viewPimModule']")
	private WebElement pim;
	
	@FindBy(xpath="//a[.='Add Employee']")
	private WebElement add;
	

	@FindBy(xpath="//input[@name='firstName']")
	private WebElement first_name;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement last_name;
	

	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;
	
	@FindBy(xpath="//p[.='Yassir Arrakhiz']")
	private WebElement dropdown;
	
	public Prom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void name3(String data)
	{
		usn.sendKeys(data);
	}
	
	public void name4(String data)
	{
		pwd.sendKeys(data);
	}
	public void name5()
	{
		go.click();
	}

	public void abc()
	{
		pim.click();
	}
	public void def( )
	{
		add.click();
	}
	public void name(String data)
	{
		first_name.sendKeys(data);
	}
	public void name1(String data1)
	{
		last_name.sendKeys(data1);
	}
	public void ghi( )
	{
		save.click();
	}
	public void jk( )
	{
		dropdown.click();
	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	