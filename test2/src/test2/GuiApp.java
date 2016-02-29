package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;

public class GuiApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	String [] planety = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune", "pluto"};
	Random rdm = new Random();
	int number;
	
								
	//number = number + 1;
	String answer = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiApp frame = new GuiApp();
					frame.setTitle("Moje pierwsze gui in java");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(35, 40, 135, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(35, 105, 46, 14);
		contentPane.add(lblAnswer);
		
		JLabel lblGiveTheNumber = new JLabel("Give the number from the sun planet:");
		lblGiveTheNumber.setBounds(35, 15, 245, 14);
		contentPane.add(lblGiveTheNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(35, 134, 135, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnGo = new JButton("Go!!!");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = textField_1.getText();
				number = number + 1;
				int answer2 = Integer.parseInt(answer);
				if (answer2 == number){
					textField_2.setText("You are right.");
					
				}
				else {
					textField_2.setText("You are wrong.");
				}
				
			}
		});
		btnGo.setBounds(35, 184, 89, 23);
		contentPane.add(btnGo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(232, 185, 174, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String choice = planety[rdm.nextInt(planety.length)];
				number = (Arrays.asList(planety)).indexOf(choice);
				textField.setText(choice);
				textField_1.setText("");
				textField_2.setText("");
				
			}
		});
		btnStart.setBounds(271, 39, 89, 23);
		contentPane.add(btnStart);
	}
}
