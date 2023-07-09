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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField element1;
	private JTextField displaybox;
	class Node
	{
	Node prelink;
	int data;
	Node nextlink;
	}
	private Node first;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(84, 22, 393, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1.setForeground(new Color(255, 0, 255));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(57, 91, 142, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(Color.MAGENTA);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(57, 161, 142, 18);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setBounds(211, 88, 96, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		element1 = new JTextField();
		element1.setBounds(209, 158, 96, 20);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				Node temp=first;
				int ele=Integer.valueOf(element.getText());
				Node newnode=new Node();
				newnode.data=ele;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
				first=newnode;
				String msg ="Elemente :"+" "+ele+" "+"Inserted at Rear";
				JOptionPane.showMessageDialog( contentPane, msg);
				element.setText("");
				displaybox.setText("");
				}
				else
				{
				while(temp.nextlink!=null)
				{
				temp=temp.nextlink;
				}
				temp.nextlink=newnode;
				newnode.prelink=temp;
				String msg ="Elemente :"+" "+ele+" "+"Inserted at Rear";
				JOptionPane.showMessageDialog( contentPane, msg);
				element.setText("");
				displaybox.setText("");
				}
			}
		});
		insertrear.setFont(new Font("Tahoma", Font.BOLD, 14));
		insertrear.setForeground(new Color(123, 104, 238));
		insertrear.setBounds(350, 84, 142, 25);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				int ele=Integer.valueOf(element1.getText());
				Node newnode=new Node();
				newnode.data=ele;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
				first=newnode;
				String msg ="Elemente :"+" "+ele+" "+"Inserted at front";
				JOptionPane.showMessageDialog( contentPane, msg);
				element1.setText("");
				displaybox.setText("");
				}
				else
				{
				newnode.nextlink=first;
				first.prelink=newnode;
				first=newnode;
				String msg ="Elemente :"+" "+ele+" "+"Inserted at front";
				JOptionPane.showMessageDialog( contentPane, msg);
				element1.setText("");
				displaybox.setText("");
				}

			}
		});
		insertfront.setFont(new Font("Tahoma", Font.BOLD, 14));
		insertfront.setForeground(new Color(123, 104, 238));
		insertfront.setBounds(350, 154, 153, 25);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete rear
				Node temp;
				if(first==null)
				{
				JOptionPane.showMessageDialog(contentPane,"Deletion Not Possibile");
				displaybox.setText("");
				}
				else if(first.nextlink==null)
				{
				String msg ="The Deleted Element G.S.P Is :"+first.data;
				JOptionPane.showMessageDialog( contentPane, 
				msg);
				displaybox.setText("");
				first=null;
				}
				else
				{ 
				temp=first;
				while(temp.nextlink.nextlink!=null)
				{
				temp=temp.nextlink;
				}
				String msg ="The Deleted Element Is :"+temp.nextlink.data;
				JOptionPane.showMessageDialog( contentPane, msg);
				displaybox.setText("");
				temp.nextlink=null;
				}
			}
		});
		deleterear.setFont(new Font("Tahoma", Font.BOLD, 14));
		deleterear.setForeground(new Color(240, 128, 128));
		deleterear.setBounds(187, 215, 139, 25);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				if(first==null)
				{
				JOptionPane.showMessageDialog(contentPane,"Deletion Not Possibile");
				displaybox.setText("");
				}
				else if(first.nextlink==null)
				{
				String msg ="The Deleted Element G.S.P Is :"+first.data;
				JOptionPane.showMessageDialog( contentPane, msg);
				displaybox.setText("");
				first=null;
				}
				else
				{
				String msg ="The Deleted Element Is :"+first.data;
				JOptionPane.showMessageDialog( contentPane, msg);
				displaybox.setText("");
				first=first.nextlink;
				first.prelink=null;
				}
			}
		});
		deletefront.setForeground(new Color(244, 164, 96));
		deletefront.setFont(new Font("Tahoma", Font.BOLD, 14));
		deletefront.setBounds(187, 280, 153, 25);
		contentPane.add(deletefront);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display forward
				Node temp;
				if(first==null)
				{
				JOptionPane.showMessageDialog(contentPane,"Deletion Not Possibile");
				}
				else if(first.nextlink==null)
				{
				displaybox.setText(String.valueOf( first.data));
				}
				else
				{ 
				String msg = "";
				temp=first;
				while(temp!=null)
				{
				msg = msg +" "+temp.data;
				temp=temp.nextlink;
				}
				displaybox.setText(msg);
				}
			}
		});
		displayforward.setForeground(new Color(128, 0, 0));
		displayforward.setFont(new Font("Tahoma", Font.BOLD, 14));
		displayforward.setBounds(10, 333, 197, 25);
		contentPane.add(displayforward);
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display reverse
				Node temp;
				if(first==null)
				{
				JOptionPane.showMessageDialog(contentPane,"Deletion Not Possibile");
				}
				else if(first.nextlink==null)
				{
				displaybox.setText(String.valueOf( first.data));
				}
				else
				{ 
				String msg = "";
				temp=first;
				while(temp.nextlink!=null)
				{
				temp=temp.nextlink;
				}
				while(temp!=null)
				{
				msg = msg +" "+temp.data;
				temp=temp.prelink;
				}
				displaybox.setText(msg);
				}
			}
		});
		displayreverse.setForeground(new Color(128, 0, 0));
		displayreverse.setFont(new Font("Tahoma", Font.BOLD, 14));
		displayreverse.setBounds(306, 333, 197, 25);
		contentPane.add(displayreverse);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(245, 255, 250));
		displaybox.setBounds(57, 369, 401, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
