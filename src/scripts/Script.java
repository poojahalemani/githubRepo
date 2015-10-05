package scripts;
import Library.UI5_testaddon.*;
public class Script{
public static void main(String[] args)throws Exception{
UI5Controls.sap_editbox(input.sap_input__screen0_user.class, "GET");
UI5Controls.sap_editbox(input.sap_input__screen0_pass.class, "GET");
UI5Controls.sap_button(button.sap_button__screen0_loginBtn.class, "CLICK");
}
}
