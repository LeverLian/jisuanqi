package art;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;

public class b1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					b1 frame = new b1();
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
	public b1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(245, 245, 245));
		textPane.setBounds(14, 129, 381, 113);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(new Color(245, 245, 245));
		textPane_1.setBounds(14, 13, 381, 113);
		contentPane.add(textPane_1);
		
		
		JButton btnNewButton = new JButton("^");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorderPainted(false);				//按钮设置为无边框
		btnNewButton.setBounds(14, 501, 96, 61);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button.setBackground(Color.WHITE);
		button.setBorderPainted(false);				//按钮设置为无边框
		button.setBounds(112, 501, 96, 61);
		contentPane.add(button);
		
		JButton button_1 = new JButton(".");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(210, 501, 96, 61);
	//	button_1.setContentAreaFilled(false);           //按钮设置为透明
		button_1.setBorderPainted(false);				//按钮设置为无边框
	//	button_1.setBorder(BorderFactory.createRaisedBevelBorder());	//按钮设置为凸起来
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("=");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(308, 501, 96, 61);
		button_2.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("1");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(14, 438, 96, 61);
		button_3.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(112, 438, 96, 61);
		button_4.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("3");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(210, 438, 96, 61);
		button_5.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("+");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(308, 438, 96, 61);
		button_6.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(14, 376, 96, 61);
		button_7.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_8.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(112, 376, 96, 61);
		button_8.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_9.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(210, 376, 96, 61);
		button_9.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_10.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(308, 376, 96, 61);
		button_10.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("7");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_11.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(14, 313, 96, 61);
		button_11.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("8");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_12.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_12.setBackground(Color.WHITE);
		button_12.setBounds(112, 313, 96, 61);
		button_12.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("9");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_13.setBackground(Color.WHITE);
		button_13.setBounds(210, 313, 96, 61);
		button_13.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("×");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_14.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_14.setBackground(Color.WHITE);
		button_14.setBounds(308, 313, 96, 61);
		button_14.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("AC");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_15.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_15.setBackground(Color.WHITE);
		button_15.setBounds(14, 251, 96, 61);
		button_15.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("❎ ");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_16.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_16.setBackground(Color.WHITE);
		button_16.setBounds(112, 251, 96, 61);
		button_16.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("%");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_17.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_17.setBackground(Color.WHITE);
		button_17.setBounds(210, 251, 96, 61);
		button_17.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("÷");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_18.setFont(new Font("思源黑体 CN Light", Font.PLAIN, 19));
		button_18.setBackground(Color.WHITE);
		button_18.setBounds(308, 251, 96, 61);
		button_18.setBorderPainted(false);				//按钮设置为无边框
		contentPane.add(button_18);
		
	}
	

}
