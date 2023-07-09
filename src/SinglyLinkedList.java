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
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField element1;
	private JTextField displaybox;

	class Node {
		int data;
		Node link;
	}

	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblNewLabel.setBounds(73, 11, 383, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(43, 84, 171, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(43, 174, 171, 24);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setBounds(224, 86, 96, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		element1 = new JTextField();
		element1.setBounds(224, 176, 96, 20);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JButton insertbutton = new JButton("INSERT REAR");
		insertbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				Node temp ;
				int ele= Integer.valueOf(element.getText());
				Node newnode = new Node();
				newnode.data=ele;
				newnode.link=null;
				if(first==null)
				{
				first=newnode;
				String msg ="Elemente :"+" "+ele+" "+"Inserted at Rear";
				JOptionPane.showMessageDialog( contentPane, msg);
				element.setText("");
				//displaybox.setText("");//
				}
				else
				{
				temp = first;
				while (temp.link!=null) 
				{
				temp=temp.link;
				}
				temp.link=newnode;
				String msg ="Elemente :"+" "+ele+" "+"Inserted at Rear";
				JOptionPane.showMessageDialog( contentPane, 
				msg);
				element.setText("");
				//displaybox.setText("");//
				}
			}
		});
		insertbutton.setFont(new Font("Tahoma", Font.BOLD, 14));
		insertbutton.setForeground(new Color(218, 112, 214));
		insertbutton.setBounds(354, 82, 139, 25);
		contentPane.add(insertbutton);
		
		JButton insertbutton2 = new JButton("INSERT FRONT");
		insertbutton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				int ele=Integer.valueOf(element1.getText());
				Node newnode = new Node();
				newnode.data=ele;
				newnode.link=null;
				if(first==null)
				{
				first=newnode;
				String msg ="Elemente :"+" "+ele+" "+"Inserted at Front";
				JOptionPane.showMessageDialog( contentPane, 
				msg);
				element1.setText("");
				//displaybox.setText("");//
				}
				else
				{
				newnode.link=first;
				first=newnode;
				String msg ="Elemente :"+" "+ele+" "+"Inserted at Front";
				JOptionPane.showMessageDialog( contentPane, 
				msg);
				element.setText("");
				//displaybox.setText("");//
				}


			}
		});
		insertbutton2.setFont(new Font("Tahoma", Font.BOLD, 14));
		insertbutton2.setForeground(new Color(255, 0, 255));
		insertbutton2.setBounds(344, 172, 163, 25);
		contentPane.add(insertbutton2);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete rear
				Node temp ;
				if(first==null)
				{
				JOptionPane.showMessageDialog(contentPane,"Deletion Not Possibile");
				//displaybox.setText("");//
				}
				else if(first.link==null)
				{
					String msg ="The Deleted Element Is :"+first.data;
					JOptionPane.showMessageDialog( contentPane, msg);
					//displaybox.setText("");//
					first =null;
					}
					else
					{
					temp = first;
					while(temp.link.link!=null)
					{
					temp=temp.link;
					}
					String msg ="The Deleted Element Is :"+temp.link.data;
					JOptionPane.showMessageDialog( contentPane, 
					msg);
					//displaybox.setText("");//
					temp.link=null;
					}

			}
		});
		deleterear.setFont(new Font("Tahoma", Font.BOLD, 14));
		deleterear.setForeground(new Color(139, 69, 19));
		deleterear.setBounds(201, 231, 145, 25);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for delete front
				if(first==null)
				{
				JOptionPane.showMessageDialog( 
				contentPane,"Deletion Not Possibile");
				//displaybox.setText("");//
				}
				if(first.link==null)
				{
					String msg ="The Deleted Element Is :"+first.data;
							JOptionPane.showMessageDialog( contentPane, msg);
							//displaybox.setText("");//
							first=null;
							}
							else
							{
							String msg ="The Deleted Element Is :"+first.data;
							JOptionPane.showMessageDialog( contentPane, 
							msg);
							//displaybox.setText("");//
							first=first.link;
							}

			}
		});
		deletefront.setFont(new Font("Tahoma", Font.BOLD, 14));
		deletefront.setForeground(new Color(148, 0, 211));
		deletefront.setBounds(201, 267, 145, 25);
		contentPane.add(deletefront);
		
		JButton displaybutton = new JButton("DISPLAY");
		displaybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				Node temp;
				if(first==null)
				{
				JOptionPane.showMessageDialog(contentPane,"Display Not Possibile");
				}
				else if(first.link==null)
				{
				displaybox.setText(String.valueOf( first.data));//
				}
				else
				{
				String msg = "";
				temp=first;
				while(temp!=null)
				{
				msg = msg +" "+temp.data;
				temp=temp.link;
				}
				displaybox.setText(msg);//
				}
			}
		});
		displaybutton.setForeground(new Color(255, 69, 0));
		displaybutton.setFont(new Font("Tahoma", Font.BOLD, 14));
		displaybutton.setBounds(224, 327, 95, 25);
		contentPane.add(displaybutton);
		
		displaybox = new JTextField();
		displaybox.setForeground(Color.RED);
		displaybox.setBackground(UIManager.getColor("Button.light"));
		displaybox.setBounds(43, 375, 440, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
