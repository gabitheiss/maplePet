package maplePetShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class WelcomeScreen extends JFrame implements VerifyFields {

	private JPanel contentPane;
	private JTextField loginField;
	private JTextField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen frame = new WelcomeScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WelcomeScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Altbit\\eclipse-workspace\\maplePetShop\\src\\maplePetShop\\Images\\dog2.png"));
		lblNewLabel.setBounds(10, 56, 602, 370);
		contentPane.add(lblNewLabel);
		
		loginField = new JTextField();
		loginField.setColumns(10);
		loginField.setBounds(633, 191, 185, 31);
		contentPane.add(loginField);
		
		JLabel lblLogin = new JLabel("Login*");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogin.setBounds(567, 175, 56, 60);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha*");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(567, 232, 56, 60);
		contentPane.add(lblSenha);
		
		JLabel lblBemVindosAo = new JLabel("Bem vindos ao Maple Pet");
		lblBemVindosAo.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblBemVindosAo.setBounds(219, 334, 383, 92);
		contentPane.add(lblBemVindosAo);
		
		JLabel lblFaaLoginPara = new JLabel("Faça login para agendar atendimento para seu pet:");
		lblFaaLoginPara.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblFaaLoginPara.setBounds(495, 105, 361, 60);
		contentPane.add(lblFaaLoginPara);
		
		JLabel mandatoryField = new JLabel("*Campos obrigatórios");
		mandatoryField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mandatoryField.setBounds(695, 268, 153, 60);
		contentPane.add(mandatoryField);
		
		JLabel warningText = new JLabel("Preencher todos os campos!");
		warningText.setVisible(false);
		warningText.setForeground(new Color(255, 0, 0));
		warningText.setFont(new Font("SansSerif", Font.PLAIN, 15));
		warningText.setBounds(633, 375, 206, 60);
		contentPane.add(warningText);
		
		JButton buttonLogin = new JButton("Login");
		buttonLogin.setForeground(Color.BLACK);
		buttonLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonLogin.setBounds(661, 325, 131, 40);
		contentPane.add(buttonLogin);
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBounds(633, 248, 185, 31);
		contentPane.add(passwordField);
		buttonLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(verifyFields()) {
					try{
			            ConsoleScreen consoleScreen = new ConsoleScreen();
			            consoleScreen.setVisible(true);
			        }
			        catch (Exception ex){
			            ex.printStackTrace();
			        }
				} else {
					setWarningVisible(warningText, mandatoryField);
				}
			}
			
		});
	}

	@Override
	public boolean verifyFields() {
		if (!loginField.getText().isEmpty() && !passwordField.getText().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setWarningVisible(JLabel warningText, JLabel mandatoryField) {
		warningText.setVisible(true);
		mandatoryField.setVisible(false);
	}
}
