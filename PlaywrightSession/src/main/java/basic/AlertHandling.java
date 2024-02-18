package basic;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = bw.newPage();
		page.navigate("https://letcode.in/alert"); 
		
		//---------------simple alert-----------------
	
//		page.onDialog(dialog-> {System.out.println(dialog.message());
//		dialog.dismiss(); });
//		
//		Thread.sleep(2000);
//	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Simple Alert")).click();
	    
	    //----------prompt alert----------
	    
		page.onDialog(dialog-> {System.out.println(dialog.message());
		dialog.accept("Riku"); });
		
		Thread.sleep(2000);
	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Prompt Alert")).click();
	    String alertname=page.locator("id=myName").textContent();
	    System.out.println(alertname);

	}

}
