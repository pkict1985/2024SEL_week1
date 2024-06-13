package homeassignment;

public class LoginPage extends BasePage {
	@Override
	public void performCommonTasks() {
		// TODO Auto-generated method stub
		System.out.println("performCommonTasks from LoginPage");
	}
	public static void main(String[] args) {
		System.out.println("LoginPage objLPDrived=new LoginPage();");
		LoginPage objLPDrived=new LoginPage();
		objLPDrived.findElement();
		objLPDrived.clickElement();
		objLPDrived.enterText();
		objLPDrived.performCommonTasks();
		System.out.println();
		
		System.out.println("BasePage objBPBase=new BasePage();");
		BasePage objBPBase=new BasePage();
		objBPBase.findElement();
		objBPBase.clickElement();
		objBPBase.enterText();
		objBPBase.performCommonTasks();
		System.out.println();
		
		System.out.println("BasePage objBPBaseType=new LoginPage();");
		BasePage objBPBaseType=new LoginPage();
		objBPBaseType.findElement();
		objBPBaseType.clickElement();
		objBPBaseType.enterText();
		objBPBaseType.performCommonTasks();
	}
}




