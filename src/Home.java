import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 456);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 20));
		lblNewLabel.setBounds(106, 25, 319, 25);
		contentPane.add(lblNewLabel);
		
		JButton Array = new JButton("ARRAY");
		Array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place Array window opening code here
				//Array a=new Array();
				//a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		Array.setForeground(new Color(255, 0, 0));
		Array.setFont(new Font("Constantia", Font.BOLD, 18));
		Array.setBounds(189, 81, 111, 31);
		contentPane.add(Array);
		
		JButton Stack = new JButton("STACK");
		Stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Stack window opening code
				new Stack().setVisible(true);
			}
		});
		Stack.setForeground(new Color(30, 144, 255));
		Stack.setFont(new Font("Constantia", Font.BOLD, 18));
		Stack.setBounds(62, 153, 111, 31);
		contentPane.add(Stack);
		
		JButton Queue = new JButton("QUEUE");
		Queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
			}
		});
		Queue.setForeground(new Color(50, 205, 50));
		Queue.setFont(new Font("Constantia", Font.BOLD, 18));
		Queue.setBounds(266, 153, 111, 31);
		contentPane.add(Queue);
		
		JButton SLL = new JButton("SINGLY LINKED LIST");
		SLL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//singly linked list opening code
				new SinglyLinkedList().setVisible(true);
			}
		});
		SLL.setForeground(new Color(238, 130, 238));
		SLL.setFont(new Font("Constantia", Font.BOLD, 18));
		SLL.setBounds(258, 229, 228, 31);
		contentPane.add(SLL);
		
		JButton CQueue = new JButton("CIRCULAR QUEUE");
		CQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//circular 	queue opening code
				new CQUEUE().setVisible(true);
			}
		});
		CQueue.setForeground(new Color(65, 105, 225));
		CQueue.setFont(new Font("Constantia", Font.BOLD, 18));
		CQueue.setBounds(25, 231, 217, 31);
		contentPane.add(CQueue);
		
		JButton DLL = new JButton("DOUBLY LINKED LIST");
		DLL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//doubly linked list opening code
				new DoublyLinkedList().setVisible(true);
			}
		});
		DLL.setForeground(new Color(188, 143, 143));
		DLL.setFont(new Font("Constantia", Font.BOLD, 18));
		DLL.setBounds(128, 325, 270, 27);
		contentPane.add(DLL);
	}
}
