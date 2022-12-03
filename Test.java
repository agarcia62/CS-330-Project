package parts;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame implements ActionListener {

	private int number, guess;
	private int time = 0;
	private int result;
	private JButton btnStart;
	private JTextField ttf, gtf;
	private String msg;

	private String unlockCode;
	private String lockCode;
	private String status;

//Constructor

	public Test() {
		unlockCode = "917831";
		lockCode = "917834";
		status = " ";
		ttf = new JTextField();
		gtf = new JTextField();

		btnStart = new JButton("Enter");
		btnStart.addActionListener(this);
		gtf.addActionListener(this);
		gtf.setEditable(false);
		ttf.setEditable(false);
		msg = ("PIN");

		Container c = getContentPane();

		c.setLayout(new BorderLayout());
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("Click to enter PIN ", JLabel.RIGHT));
		c.add(btnStart);
		JLabel msglabel = new JLabel(msg, JLabel.RIGHT);
		msglabel.setForeground(Color.red);
		c.add(msglabel);
		c.add(gtf);
		c.add(new JLabel("Status ", JLabel.RIGHT));
		c.add(ttf);

		setSize(600, 100);
		setTitle("Test");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		


	}

	public void actionPerformed(ActionEvent e) {
		gtf.setEditable(true);
		btnStart.setEnabled(false);
		boolean locked = true;
		String code = "";
		
			if(locked == true) {
				ttf.setText("locked");
			}
			else if (locked == false) {
				ttf.setText("unlocked");
			}
			String input = gtf.getText();
			int inputLength = input.length();
			code=input;
			System.out.print(code);
			if(inputLength < 6) {
				code = "000000";
			}
			
			if(locked == true) {
				if(code.equals(unlockCode)) {
					locked = false;
					ttf.setText("unlocked");
				}
				else if(code.equals(lockCode)){
				}
				else {
					ttf.setText("");
				}
			}
			else if (locked == false) {
				if(code.equals(lockCode)) {
					locked = true;
					ttf.setText("locked");
				}
				else if(code.equals(unlockCode)){
				}
				else {
					ttf.setText("");
				}
			}
			}

			

	

	public static void main(String[] args) {
		new Test();

	}

}