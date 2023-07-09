import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	int rear = -1;
	int front = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 468);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setBounds(192, 25, 223, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(100, 149, 237));
		lblNewLabel_1.setBounds(52, 91, 135, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(100, 149, 237));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(52, 203, 142, 18);
		contentPane.add(lblNewLabel_1_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(241, 88, 96, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(241, 200, 96, 20);
		contentPane.add(element);
		
		JButton createbutton = new JButton("CREATE QUEUE");
		createbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR CREATING QUEUE
				size=Integer.valueOf(sizefield.getText());
				q=new int[size];
				String message="Queue of size "+ size+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		createbutton.setFont(new Font("Tahoma", Font.BOLD, 14));
		createbutton.setForeground(new Color(138, 43, 226));
		createbutton.setBounds(174, 140, 163, 25);
		contentPane.add(createbutton);
		
		JButton insertbutton = new JButton("INSERT");
		insertbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for inserting element
				if (rear == size-1) {
					JOptionPane.showMessageDialog(contentPane, "push is not possible");
				} else {
					
					int elem = Integer.valueOf(element.getText());
					++rear;
					q[rear] = elem;
					JOptionPane.showMessageDialog(contentPane,"push succesful");
					element.setText("");
				}
			}
		});
		insertbutton.setForeground(new Color(50, 205, 50));
		insertbutton.setFont(new Font("Tahoma", Font.BOLD, 14));
		insertbutton.setBounds(352, 196, 141, 25);
		contentPane.add(insertbutton);
		
		JButton deletebutton = new JButton("DELETE");
		deletebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				if (rear == -1 && front > rear) {
					JOptionPane.showMessageDialog(contentPane, "pop is not possible");
				} else {
					JOptionPane.showMessageDialog(contentPane, "deleted element is "+q[front]);
					++front;
				}
			}
		});
		deletebutton.setForeground(new Color(255, 0, 0));
		deletebutton.setFont(new Font("Tahoma", Font.BOLD, 14));
		deletebutton.setBounds(208, 248, 141, 25);
		contentPane.add(deletebutton);
		
		JButton displaybutton = new JButton("DISPLAY");
		displaybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if (rear == -1 && front > rear) {
					JOptionPane.showMessageDialog(contentPane, "pop is not possible");
				}
				else {
					for (int i = front; i <= rear; i++) {
						msg=msg+" "+q[i];
					}
				}
				displaybox.setText(msg);
			}
		});
		displaybutton.setForeground(new Color(255, 127, 80));
		displaybutton.setFont(new Font("Tahoma", Font.BOLD, 14));
		displaybutton.setBounds(208, 299, 141, 25);
		contentPane.add(displaybutton);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 240, 245));
		displaybox.setColumns(10);
		displaybox.setBounds(90, 366, 364, 20);
		contentPane.add(displaybox);
	}
}
