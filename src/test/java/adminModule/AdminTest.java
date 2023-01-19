package adminModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AdminTest {
	@Test
	public void adminLoginTest() {
		Reporter.log("Admin login is tested", true);
	}
	
	@Test
	public void adminDashBoardTest() {
		Reporter.log("DashBoard is displayed sucessfully",true);
	}

}
