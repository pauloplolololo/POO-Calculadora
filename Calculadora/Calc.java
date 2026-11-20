package Calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frmPaulohenriquealmeida;
	private JTextField JTFResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frmPaulohenriquealmeida.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}
	
	double valor1, valor2;
	String op;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPaulohenriquealmeida = new JFrame();
		frmPaulohenriquealmeida.setTitle("PauloHenriqueAlmeida0025195");
		frmPaulohenriquealmeida.getContentPane().setBackground(new Color(112, 112, 206));
		frmPaulohenriquealmeida.getContentPane().setLayout(null);
		
		JTFResultado = new JTextField();
		JTFResultado.setBackground(new Color(0, 0, 0));
		JTFResultado.setForeground(new Color(255, 255, 255));
		JTFResultado.setFont(new Font("Arial Black", Font.BOLD, 60));
		JTFResultado.setBounds(10, 30, 439, 73);
		frmPaulohenriquealmeida.getContentPane().add(JTFResultado);
		JTFResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "0");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton.setBounds(104, 427, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTFResultado.setText(JTFResultado.getText() + "1");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_1.setBounds(10, 341, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("2");
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "2");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_3.setBounds(104, 341, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("3");
		btnNewButton_4.setBackground(new Color(0, 0, 0));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "3");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_4.setBounds(201, 341, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_3_1 = new JButton("8");
		btnNewButton_3_1.setBackground(new Color(0, 0, 0));
		btnNewButton_3_1.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "8");
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_3_1.setBounds(104, 193, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_1_1 = new JButton("7");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "7");
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_1_1.setBounds(10, 193, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_4_1 = new JButton("9");
		btnNewButton_4_1.setForeground(new Color(255, 255, 255));
		btnNewButton_4_1.setBackground(new Color(0, 0, 0));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "9");
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_4_1.setBounds(201, 193, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_3_2 = new JButton("5");
		btnNewButton_3_2.setBackground(new Color(0, 0, 0));
		btnNewButton_3_2.setForeground(new Color(255, 255, 255));
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "5");
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_3_2.setBounds(104, 268, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.setBackground(new Color(0, 0, 0));
		btnNewButton_1_2.setForeground(new Color(255, 255, 255));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTFResultado.setText(JTFResultado.getText() + "4");
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_1_2.setBounds(10, 268, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_4_2 = new JButton("6");
		btnNewButton_4_2.setBackground(new Color(0, 0, 0));
		btnNewButton_4_2.setForeground(new Color(255, 255, 255));
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "6");
			}
		});
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_4_2.setBounds(201, 268, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnNewButton_4_2);
		
		JButton btnC = new JButton("c");
		btnC.setBackground(new Color(0, 0, 0));
		btnC.setForeground(new Color(255, 255, 255));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("");
				valor1 = 0;
				valor2 = 0;
				op = null;
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnC.setBounds(10, 114, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnC);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setBackground(new Color(0, 0, 0));
		btnSoma.setForeground(new Color(255, 255, 255));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!JTFResultado.getText().isEmpty()) {
					valor1 = Double.parseDouble(JTFResultado.getText());
					JTFResultado.setText("");
					op = "soma";
				}
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnSoma.setBounds(364, 374, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnSoma);
		
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!JTFResultado.getText().isEmpty()) {
					valor1 = Double.parseDouble(JTFResultado.getText());
					JTFResultado.setText("");
					op = "multiplicacao";
				}
			}
		});
		btnMultiplicacao.setBackground(new Color(0, 0, 0));
		btnMultiplicacao.setForeground(new Color(255, 255, 255));
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnMultiplicacao.setBounds(364, 247, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.setBackground(new Color(0, 0, 0));
		btnDivisao.setForeground(new Color(255, 255, 255));
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!JTFResultado.getText().isEmpty()) {
					valor1 = Double.parseDouble(JTFResultado.getText());
					JTFResultado.setText("");
					op = "divisao";
				}
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnDivisao.setBounds(364, 183, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnDivisao);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!JTFResultado.getText().isEmpty()) {
					valor1 = Double.parseDouble(JTFResultado.getText());
					JTFResultado.setText("");
					op = "subtracao";
				}
			}
		});
		btnSubtracao.setBackground(new Color(0, 0, 0));
		btnSubtracao.setForeground(new Color(255, 255, 255));
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnSubtracao.setBounds(364, 310, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnSubtracao);
		
		JButton btnPotencia = new JButton("^");
		btnPotencia.setBackground(new Color(0, 0, 0));
		btnPotencia.setForeground(new Color(255, 255, 255));
		btnPotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!JTFResultado.getText().isEmpty()) {
					valor1 = Double.parseDouble(JTFResultado.getText());
					JTFResultado.setText("");
					op = "potencia";
				}
			}
		});
		btnPotencia.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnPotencia.setBounds(364, 119, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnPotencia);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(new Color(0, 0, 0));
		btnIgual.setForeground(new Color(255, 255, 255));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!JTFResultado.getText().isEmpty() && op != null) {
					valor2 = Double.parseDouble(JTFResultado.getText());
					
					if("soma".equals(op)) {
						JTFResultado.setText(String.valueOf(valor1 + valor2));
					}
					if("subtracao".equals(op)) {
						JTFResultado.setText(String.valueOf(valor1 - valor2));
					}
					if("multiplicacao".equals(op)) {
						JTFResultado.setText(String.valueOf(valor1 * valor2));
					}
					if("divisao".equals(op)) {
						if(valor2 == 0) {
							JOptionPane.showMessageDialog(null, "Não é possível dividir por zero");
							JTFResultado.setText("");
						} else {
							JTFResultado.setText(String.valueOf(valor1 / valor2));
						}
					}
					if("potencia".equals(op)) {
						JTFResultado.setText(String.valueOf(Math.pow(valor1, valor2)));
					}
					op = null;
				}
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnIgual.setBounds(364, 437, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnIgual);
		
		JButton btnPonto = new JButton(",");
		btnPonto.setBackground(new Color(0, 0, 0));
		btnPonto.setForeground(new Color(255, 255, 255));
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!JTFResultado.getText().contains(".")) {
					JTFResultado.setText(JTFResultado.getText() + ".");
				}
			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnPonto.setBounds(255, 437, 72, 64);
		frmPaulohenriquealmeida.getContentPane().add(btnPonto);
		frmPaulohenriquealmeida.setBackground(new Color(192, 192, 192));
		frmPaulohenriquealmeida.setBounds(100, 100, 475, 565);
		frmPaulohenriquealmeida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
