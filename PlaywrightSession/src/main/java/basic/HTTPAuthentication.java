package basic;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class HTTPAuthentication {

	public static void main(String[] args) {
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch();
		BrowserContext context=bw.newContext(new Browser.NewContextOptions().setHttpCredentials("admin","admin"));
		Page page = context.newPage();
		page.navigate("https://the-internet.herokuapp.com/basic_auth");
		System.out.println(page.locator("h3").textContent());
		pw.close();
		
	}

}
