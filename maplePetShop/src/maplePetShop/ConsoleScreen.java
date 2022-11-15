package maplePetShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Canvas;

public class ConsoleScreen extends JFrame implements VerifyFields {

	private JPanel contentPane;
	private JTextField userName;
	private JTextField userFone;
	private JTextField userEmail;
	private JTextField inputHora;
	private JTextField inputData;
	private JTextField petName;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsoleScreen frame = new ConsoleScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public ConsoleScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox boxTypepet = new JComboBox();
		boxTypepet.setBackground(new Color(255, 255, 255));
		boxTypepet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		boxTypepet.setMaximumRowCount(10);
		boxTypepet.setModel(new DefaultComboBoxModel(new String[] {"Cachorro", "Gato"}));
		boxTypepet.setSelectedIndex(0);
		boxTypepet.setBounds(596, 89, 214, 40);
		contentPane.add(boxTypepet);
		
		JLabel titlePetType = new JLabel("Para qual animal gostaria de atendimento?");
		titlePetType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		titlePetType.setBounds(568, 36, 288, 60);
		contentPane.add(titlePetType);
		
		JLabel titleUserIdentification = new JLabel("Identificação do tutor");
		titleUserIdentification.setFont(new Font("Tahoma", Font.PLAIN, 15));
		titleUserIdentification.setBounds(129, 302, 155, 60);
		contentPane.add(titleUserIdentification);
		
		JLabel userNameLabel = new JLabel("Nome*");
		userNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		userNameLabel.setBounds(33, 345, 56, 60);
		contentPane.add(userNameLabel);
		
		userName = new JTextField();
		userName.setBounds(99, 361, 185, 31);
		contentPane.add(userName);
		userName.setColumns(10);
		
		userFone = new JTextField();
		userFone.setColumns(10);
		userFone.setBounds(99, 421, 185, 31);
		contentPane.add(userFone);
		
		JLabel foneLabel = new JLabel("Telefone*");
		foneLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		foneLabel.setBounds(33, 405, 56, 60);
		contentPane.add(foneLabel);
		
		userEmail = new JTextField();
		userEmail.setColumns(10);
		userEmail.setBounds(99, 478, 185, 31);
		contentPane.add(userEmail);
		
		JLabel emailLabel = new JLabel("Email*");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		emailLabel.setBounds(33, 462, 56, 60);
		contentPane.add(emailLabel);
		
		JLabel iconLogo = new JLabel("");
		iconLogo.setIcon(new ImageIcon("C:\\Users\\Altbit\\eclipse-workspace\\maplePetShop\\src\\maplePetShop\\Images\\logo 1.png"));
		iconLogo.setBounds(0, 6, 472, 312);
		contentPane.add(iconLogo);
		
		inputHora = new JTextField();
		inputHora.setColumns(10);
		inputHora.setBounds(392, 447, 185, 31);
		contentPane.add(inputHora);
		
		JLabel lblHora = new JLabel("Hora*");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHora.setBounds(347, 431, 56, 60);
		contentPane.add(lblHora);
		
		inputData = new JTextField();
		inputData.setColumns(10);
		inputData.setBounds(392, 377, 185, 31);
		contentPane.add(inputData);
		
		JLabel lblData = new JLabel("Data*");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblData.setBounds(347, 361, 56, 60);
		contentPane.add(lblData);
		
		JLabel titleUserIdentification_1 = new JLabel("Data e Horário do Serviço");
		titleUserIdentification_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		titleUserIdentification_1.setBounds(398, 302, 179, 60);
		contentPane.add(titleUserIdentification_1);
		
		petName = new JTextField();
		petName.setColumns(10);
		petName.setBounds(625, 155, 185, 31);
		contentPane.add(petName);
		
		JLabel lblNomeDoPet = new JLabel("Nome do pet*");
		lblNomeDoPet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomeDoPet.setBounds(527, 139, 86, 60);
		contentPane.add(lblNomeDoPet);
		
		JLabel warningText = new JLabel("Preencher todos os campos!");
		warningText.setForeground(new Color(255, 0, 0));
		warningText.setVisible(false);
		warningText.setFocusable(false);
		warningText.setFont(new Font("Tahoma", Font.PLAIN, 15));
		warningText.setBounds(661, 360, 196, 60);
		contentPane.add(warningText);
		
		JLabel mandatoryField = new JLabel("*Campos obrigatórios");
		mandatoryField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mandatoryField.setBounds(727, 405, 153, 60);
		contentPane.add(mandatoryField);
		
		JButton saveButton = new JButton("Salvar");
		saveButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		saveButton.setForeground(new Color(0, 0, 0));
		saveButton.setBounds(725, 463, 131, 40);
		contentPane.add(saveButton);
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(verifyFields()) {
					try{
			            ThanksScreen thanksScreen = new ThanksScreen();
			            thanksScreen.setVisible(true);
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
		public void setWarningVisible(JLabel warningText, JLabel mandatoryField) {
			warningText.setVisible(true);
			mandatoryField.setVisible(false);
		}


		@Override
		public boolean verifyFields() {
			if (!userName.getText().isEmpty() && !userFone.getText().isEmpty() && !userEmail.getText().isEmpty()
					&& !inputData.getText().isEmpty() && !inputHora.getText().isEmpty()
					&& !petName.getText().isEmpty()) {

				return true;
			} else {
				return false;
			}
		}
	}
