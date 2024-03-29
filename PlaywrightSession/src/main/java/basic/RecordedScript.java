package basic;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class RecordedScript {

	public static void main(String[] args) {
		
		      Playwright playwright = Playwright.create();
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = context.newPage();
		      page.navigate("https://letcode.in/");
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Log in")).click();
//		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter registered email")).click();
//		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter registered email")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter registered email")).fill("ghorairitabrata@gmail.com");
		      //page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter registered email")).press("Tab");
//		      page.getByPlaceholder("Enter password").click();
//		      page.getByPlaceholder("Enter password").press("CapsLock");
//		      page.getByPlaceholder("Enter password").fill("R");
//		      page.getByPlaceholder("Enter password").press("CapsLock");
		      page.getByPlaceholder("Enter password").fill("Riku72@benz");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("LOGIN")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign out")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Work-Space")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Drop-Down")).click();
		      page.locator("#fruits").selectOption("3");
		      
		      try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      browser.close();
		    }
		  }

	