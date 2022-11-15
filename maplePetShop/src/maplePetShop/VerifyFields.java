package maplePetShop;

import javax.swing.JLabel;

public interface VerifyFields {
	
	boolean verifyFields();
	void setWarningVisible(JLabel warningText, JLabel mandatoryField);
	
}
