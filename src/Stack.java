import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNewLabel.setBounds(146, 11, 223, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheStack = new JLabel("ENTER THE STACK SIZE");
		lblEnterTheStack.setForeground(Color.RED);
		lblEnterTheStack.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterTheStack.setBounds(36, 71, 178, 20);
		contentPane.add(lblEnterTheStack);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement.setForeground(new Color(139, 0, 0));
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterAnElement.setBounds(23, 176, 142, 18);
		contentPane.add(lblEnterAnElement);
		
		sizefield = new JTextField();
		sizefield.setBounds(257, 69, 96, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(228, 173, 96, 20);
		contentPane.add(element);
		
		JButton createbutton = new JButton("CREATE STACK");
		createbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//STACK CREATION CODE
				size=Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message="Stack of size "+ size+ " created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createbutton.setForeground(new Color(0, 191, 255));
		createbutton.setFont(new Font("Constantia", Font.BOLD, 13));
		createbutton.setBounds(159, 117, 178, 23);
		contentPane.add(createbutton);
		
		JButton pushbutton = new JButton("PUSH");
		pushbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR PUSH OPERATION
				int elem;
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane,"Push not possible");
				}
				else {
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane,"Push Succesful");
					element.setText("");
				}
			}
		});
		pushbutton.setForeground(new Color(0, 250, 154));
		pushbutton.setFont(new Font("Constantia", Font.BOLD, 13));
		pushbutton.setBounds(345, 171, 89, 23);
		contentPane.add(pushbutton);
		
		JButton popbutton = new JButton("POP");
		popbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR POP OPERATION
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Pop is Not Possible");
				}else {
					String message="Element deleted is : "+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		popbutton.setForeground(new Color(255, 0, 255));
		popbutton.setFont(new Font("Constantia", Font.BOLD, 13));
		popbutton.setBounds(202, 226, 89, 23);
		contentPane.add(popbutton);
		
		JButton displaybutton = new JButton("DISPLAY");
		displaybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY OPERATION
				String msg="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Stack is empty");
				}
				else {
					for(int i=top;i>=0;i--) {
						msg=msg+" "+s[i];
					}
				}
				displaybox.setText(msg);
			}
		});
		displaybutton.setForeground(new Color(0, 191, 255));
		displaybutton.setFont(new Font("Constantia", Font.BOLD, 13));
		displaybutton.setBounds(190, 291, 101, 23);
		contentPane.add(displaybutton);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(240, 255, 240));
		displaybox.setForeground(new Color(0, 0, 205));
		displaybox.setBounds(46, 344, 426, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
