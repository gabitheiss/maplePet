package maplePetShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ThanksScreen extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThanksScreen frame = new ThanksScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public ThanksScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(247, 225, 138));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Altbit\\eclipse-workspace\\maplePetShop\\src\\maplePetShop\\Images\\cat1.png"));
		lblNewLabel.setBounds(0, 232, 285, 312);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Altbit\\eclipse-workspace\\maplePetShop\\src\\maplePetShop\\Images\\logo2.png"));
		lblNewLabel_1.setBounds(155, 10, 613, 352);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAgradecemosAPreferncia = new JLabel("Agradecemos a preferência e aguardamos seu pet {...}");
		lblAgradecemosAPreferncia.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblAgradecemosAPreferncia.setBounds(337, 347, 491, 92);
		contentPane.add(lblAgradecemosAPreferncia);
		
		JLabel lblNoDia = new JLabel("no dia ${..} às ${...}");
		lblNoDia.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNoDia.setBounds(651, 392, 177, 92);
		contentPane.add(lblNoDia);
		
		JLabel lblOlusername = new JLabel("Confirmado ${userName}!");
		lblOlusername.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblOlusername.setBounds(588, 302, 242, 92);
		contentPane.add(lblOlusername);
		
		JButton buttonClose = new JButton("Sair");
		buttonClose.setForeground(Color.BLACK);
		buttonClose.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonClose.setBounds(399, 461, 131, 40);
		contentPane.add(buttonClose);
		buttonClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					try{
			            System.exit(DISPOSE_ON_CLOSE);
			        }
			        catch (Exception ex){
			            ex.printStackTrace();
			        }
				}
			});
	}

}
