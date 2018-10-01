package view;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.crypto.spec.GCMParameterSpec;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalculatorUI {
	public CalculatorUI() {
		final Font bfont=new Font("Arial",Font.PLAIN,40);
		JFrame frame1=new JFrame("Calculator");
		frame1.setVisible(true);
		frame1.setSize(260, 450);
		frame1.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.HORIZONTAL;
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel displaypnl=new JPanel();
		displaypnl.setLayout(new GridLayout(1,1));
		//JTextArea dis = new JTextArea();
		
		JTextArea display= new JTextArea();
		//display.setBounds(10, 10, 10, 80);
		//.setLayout(new FlowLayout());
		display.setText("Display");
		displaypnl.add(display);
		gbc.gridx=0;
		gbc.gridy=0;
		frame1.add(displaypnl,gbc);
		
		JPanel panelbtn=new JPanel();
		panelbtn.setLayout(new GridBagLayout());
		//GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
		JButton [] btns= {new JButton("0"),new JButton("1"),new JButton("2"),new JButton("3"),new JButton("4"),new JButton("5"),new JButton("6"),new JButton("7"),new JButton("8"),new JButton("9"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1"),new JButton("1")};
		JButton btnadd=new JButton("+");
		JButton btnsub=new JButton("-");
		JButton btnmul=new JButton("*");
		JButton btndiv=new JButton("/");
		JButton btneql=new JButton("=");
		JButton btnclear=new JButton("C");
		//gbc.gridheight(40);
		//gbc.gridwidth(70)
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				gbc.gridx=j;
				gbc.gridy=i;
				btns[i*3+j+1].setFont(bfont);
				panelbtn.add(btns[i*3+j+1],gbc);
				
			}
		}
		btnadd.setFont(bfont);
		btnclear.setFont(bfont);
		btndiv.setFont(bfont);
		btnmul.setFont(bfont);
		btnsub.setFont(bfont);
		btneql.setFont(bfont);
		gbc.gridx=0;
		gbc.gridy=3;
		btns[0].setFont(bfont);
		panelbtn.add(btns[0],gbc);
		gbc.gridx=1;
		gbc.gridy=3;

		panelbtn.add(btnadd,gbc);
		gbc.gridx=2;
		gbc.gridy=3;
		
		panelbtn.add(btnsub,gbc);
		
		
		gbc.gridx=3;
		gbc.gridy=0;
		panelbtn.add(btnclear,gbc);
		gbc.gridx=3;
		gbc.gridy=1;
		panelbtn.add(btneql,gbc);
		gbc.gridx=3;
		gbc.gridy=2;
		panelbtn.add(btndiv,gbc);
		gbc.gridx=3;
		gbc.gridy=3;
		panelbtn.add(btnmul,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		frame1.add(panelbtn,gbc);

		
	}

}
