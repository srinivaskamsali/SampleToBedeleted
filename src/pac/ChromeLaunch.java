package pac;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeLaunch {
	
//	public void cl()
//	{
//		System.out.println("c1");
//	}
//	
//	public static void progA(int a) 
//		{
//	System.out.println("hiA");
//	}
//
//	public static void progB(int b,int c) 
//	{
//	System.out.println("hiBC");
//	}
	public static void main(String[] args) throws InterruptedException {
//		System.out.println("hi");
//		progA(1);
//		cl.progB(2, 3);
		
		//TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	
//	WebDriver driver=new ChromeDriver();
	
	ChromeDriver driver1=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver1;
	driver1.get("http://the-internet.herokuapp.com/login");

	String url = js.executeScript("return document.URL;").toString();
	System.out.println(url);
//	driver.get("http://the-internet.herokuapp.com/login");

//  driver.findElement(with(By.id("username")).below(By.id("password")).sendkeys("hi");
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
//	driver.findElement(By.xpath("/html/body/div(2)/div/div/form/div/div/input")).sendKeys("hi");
//	driver.findElement(By.linkText("Dropdown")).click();
//	WebElement dd=driver.findElement(By.id("dropdown"));

//	
//	Select ss=new Select(dd);
//	
//	List ops=ss.getOptions();

//	String st="MALAYALAM";
//	String st2="    ";
//	StringBuffer st3=new StringBuffer("MALAYALAM");
//	System.out.println(st.toLowerCase());
//	System.err.println(st.substring(2,5));
//	System.out.println(st.charAt(0));
//	System.out.println(st.concat(st2));
//	System.out.println(st.contentEquals(st2));
//	System.out.println(st.equals(st3));
//	System.out.println(st.replaceAll(0, 1));
//	char a[]=st.toCharArray();
//	System.out.println(a[0]);
//	
//	System.out.println(st.valueOf(a[1]));
	



//	Iterator it=ops.iterator();
//	while(it.hasNext())
//	{
//		WebElement a= (WebElement) it.next();
//		if(a.getText().equalsIgnoreCase("Option 2"))
//		{
//		a.click();	
//		}
//	}
			
	
	
	
//	String b="true";
//			Boolean bool=Boolean.parseBoolean(b);
//			System.out.println(bool);

//	List<WebElement> electElement =driver.findElements(By.id("selectElementID"));
//	 Select selectObject =newSelect(selectElement);
//	 selectObject.selectByIndex(1);
//	 selectObject.selectByValue("value1");
//	 selectObject.selectByVisibleText("Bread");

	
//	driver.close();
//	
//	String col=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).getCssValue("color");
//	System.out.println(col);
	//Set<Cookie>ck=driver.manage().getCookies();
	
	//System.out.println(ck.toString());
	

//	String s="hi";
//	String ss="Hi";
//	if (s.equalsIgnoreCase(ss))
//	{
//	System.out.println(s+ss+"i am fine");
//	}	
//		int a=0;
//		while(a<11)
//		{
//			a=++a;
//			System.out.println(a);
//			//break;	
//}
//		
//		System.out.println(a);
		
//		int a=10;
//		switch (a)
//		{
//		case 10:
//			System.out.println("its 10");
//			break;
//		case 2:
//			System.out.println("its 2");
//			break;
//		default:
//			System.out.println("its alpha");
//		
//		}
		
//		int i=1;
//		while(i<=10)
//		{
//			System.out.println(++i);
//		}
		
//		int a[]= {10,11,12,13,14};
//		int i=0;
//		while(a.length<=5)
//		{
//			System.out.println(a[i++]);
//		}

//		int feb1=0;
//		int feb2=1;
//		
//		for(int i=0;i<=9;i++)
//		{
//			int feb3=feb1+feb2;
//			System.out.println(feb3);
//			feb1=feb2;
//			feb2=feb3;
//		}
		
//		int b[]=new int[2];
//		b[0]=1;
//		b[1]=2;
//		for(int j=0;j<=1;j++)
//		{
//		System.out.println(b[j]);
//		}
//		System.out.println(Arrays.toString(b));
		
//		Object ob1[]= {1,"sri",'p'};
//		for(int j=0;j<=2;j++)
//		{
//		System.out.println(ob1[j]);
//			}
		
//		int J = 130;
//		  byte N= (byte) J;
//
//		 System.out.println(N);
		
//		ArrayList ar= new ArrayList(5);
//		ar.add(0,"sri0");
//		ar.add(1,"sri1");
//		ar.remove(1);
//		
//		System.out.println(ar.get(1));
		
		
		
		
		
	}

}
