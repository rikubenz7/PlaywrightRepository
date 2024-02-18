package basic;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Playwright.*;
import com.microsoft.playwright.options.*;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.SelectOption;

public class Basic {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		// ------------------------locator-------------------------------
		Playwright pw = Playwright.create();
//		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//		Page page = bw.newPage();
//		page.navigate("https://letcode.in/signup");
//		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter your name")).fill("xyz");
//		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter valid email address")).fill("abc@gmail.com");
//		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter your password")).fill("sdfwfw");
//		
//		page.locator("id=agree").click();
//		
//		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SIGN UP")).click();
//		System.out.println(page.title());

		// page.locator("id=name").clear();
//
//		bw.close();
//		pw.close();

		// ----------------------------------------------------- handling dropdown--------------------------------------------------
//		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//		Page page = bw.newPage();
//		page.navigate("https://formstone.it/components/dropdown/demo/");
//		Locator labeldd=page.locator("id=demo_basic");
//		labeldd.selectOption(new SelectOption().setIndex(2));

//		List<String> ele=labeldd.selectOption(new SelectOption().setIndex(1));
//		System.out.println(ele);
//		Locator options=labeldd.locator("option");
//		int count=options.count();
//		
//		List<String> TEXTOPT=options.allInnerTexts();
//		TEXTOPT.forEach(i->System.out.println(i));
//		for(int i=0;i<TEXTOPT.size();i++)
//		{
//			System.out.println(i);
//		}

//		System.out.println(count);

//	  Thread.sleep(1000);

//		bw.close();

	}

}
