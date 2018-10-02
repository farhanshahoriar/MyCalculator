package view;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.crypto.spec.GCMParameterSpec;
import javax.lang.model.type.PrimitiveType;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

public class CalculatorUI {
	public int oprand1=0,oprand2=0,opcode,ans;
	char [] btnid= new char[1];
	char [] btnval=new char[12];
	public CalculatorUI() {
		final Font bfont=new Font("Arial",Font.PLAIN,40);
		final Font disfont=new Font("Arial",Font.PLAIN,30);
		JFrame frame1=new JFrame("Calculator");
		frame1.setVisible(true);
		frame1.setSize(260, 330);
		frame1.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.HORIZONTAL;
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel displaypnl=new JPanel();
		displaypnl.setLayout(new GridLayout(1,1));
		
		JTextArea display= new JTextArea();
		
		display.setText("");
		display.setFont(disfont);
		displaypnl.add(display);
		gbc.gridx=0;
		gbc.gridy=0;
		frame1.add(displaypnl,gbc);
		
		JPanel panelbtn=new JPanel();
		panelbtn.setLayout(new GridBagLayout());
		//GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
		JButton [] btns= {new JButton("0"),new JButton("1"),new JButton("2"),new JButton("3"),new JButton("4"),new JButton("5"),new JButton("6"),new JButton("7"),new JButton("8"),new JButton("9")};
		JButton btnadd=new JButton("+");
		JButton btnsub=new JButton("-");
		JButton btnmul=new JButton("*");
		JButton btndiv=new JButton("/");
		JButton btneql=new JButton("=");
		JButton btnclear=new JButton("C");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				gbc.gridx=j;
				gbc.gridy=i;
				btns[i*3+j+1].setFont(bfont);
				panelbtn.add(btns[i*3+j+1],gbc);
				
			}
		}
		//font set
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
		gbc.gridy=2;
		frame1.add(panelbtn,gbc);
		
		// Button ActionListeners
		btnclear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.setText("");
				oprand1=0;
			}
		});
		
		btnadd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				oprand1+=Integer.valueOf(display.getText());
				opcode=1;
				display.setText("");
			}
		});

		
		btnsub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				oprand1=Integer.valueOf(display.getText());
				opcode=2;
				display.setText("");
			}
		});
		
		btnmul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				oprand1=Integer.valueOf(display.getText());
				opcode=3;
				display.setText("");
			}
		});
		
		btndiv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				oprand1=Integer.valueOf(display.getText());
				opcode=4;
				display.setText("");
			}
		});
		
		btneql.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				oprand2=Integer.valueOf(display.getText());
				ans=oprand2;
				if(opcode==1) {
					ans=oprand1+oprand2;
				}
				else if(opcode==2) {
					ans=oprand1-oprand2;
				}
				else if(opcode==3) {
					ans=oprand1*oprand2;
				}
				else if(opcode==4) {
					if(oprand2==0) {
						display.setText("Divide by Zero");
						return;
					}
					else ans=oprand1/oprand2;
				}
				oprand1=0;
				display.setText(Integer.toString(ans));
			}
		});

		//digits	
		
		btns[0].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					display.append("0");
				}
			});
	
		btns[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.append("1");
			}
		});
	
		btns[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.append("2");
			}
		});
			
		btns[3].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					display.append("3");
				}
			});
		
		btns[4].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.append("4");
			}
		});
		
		btns[5].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.append("5");
			}
		});
		
		btns[6].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					display.append("6");
				}
			});
		
		btns[7].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.append("7");
			}
		});
		
		btns[8].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				display.append("8");
			}
		});
		
		btns[9].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					display.append("9");
				}
			});
		


		
	}

}
