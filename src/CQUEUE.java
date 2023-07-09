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

public class CQUEUE extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int rear=-1;
	private int front=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CQUEUE frame = new CQUEUE();
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
	public CQUEUE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 458);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(199, 21, 133));
		lblNewLabel.setBounds(191, 11, 173, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(77, 79, 135, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(54, 198, 142, 18);
		contentPane.add(lblNewLabel_1_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(236, 76, 96, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(236, 198, 96, 20);
		contentPane.add(element);
		
		JButton createbutton = new JButton("CREATE QUEUE");
		createbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(sizefield.getText());
				cq=new int[size];
				String message="queue of size "+size+ " created";
				JOptionPane.showMessageDialog(contentPane, 
				message);
				displaybox.setText("");
			}
		});
		createbutton.setForeground(new Color(139, 0, 0));
		createbutton.setFont(new Font("Constantia", Font.BOLD, 14));
		createbutton.setBounds(168, 122, 156, 27);
		contentPane.add(createbutton);
		
		JButton insertbuttton = new JButton("INSERT");
		insertbuttton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==size)
				{
				JOptionPane.showMessageDialog(contentPane,"Insertion not possible");
				displaybox.setText("");
				}
				else
				{
				int elem=Integer.valueOf(element.getText());
				rear=(rear+1)%size;
				cq[rear]=elem;
				count++;
				String msg="element "+elem+" is inserted at position "+ rear;
				JOptionPane.showMessageDialog(contentPane,msg);
				element.setText("");
				displaybox.setText("");
			}
			}
		});
		insertbuttton.setForeground(new Color(64, 224, 208));
		insertbuttton.setFont(new Font("Constantia", Font.BOLD, 14));
		insertbuttton.setBounds(366, 194, 143, 27);
		contentPane.add(insertbuttton);
		
		JButton deletebutton = new JButton("DELETE");
		deletebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0)
				{
				JOptionPane.showMessageDialog(contentPane,"Deletion not possible");
				displaybox.setText("");
				}
				else
				{
				String message="element "+cq[front]+" is deleted";
				JOptionPane.showMessageDialog(contentPane, 
				message);
				front=(front+1)%size;
				count--;
				displaybox.setText("");
			}
			}
		});
		deletebutton.setForeground(new Color(255, 0, 0));
		deletebutton.setFont(new Font("Constantia", Font.BOLD, 14));
		deletebutton.setBounds(191, 257, 143, 27);
		contentPane.add(deletebutton);
		
		JButton displaybutton = new JButton("DISPLAY");
		displaybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0)
				{
				JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else
				{
				String msg="";
				int f1=front;
				for (int i=1;i<=count;i++) 
				{
					msg=msg+" "+cq[f1];
					f1=(f1+1)%size;
					}
					displaybox.setText(msg);
					}
					}

			
		});
		displaybutton.setForeground(new Color(139, 0, 0));
		displaybutton.setFont(new Font("Constantia", Font.BOLD, 14));
		displaybutton.setBounds(191, 315, 143, 27);
		contentPane.add(displaybutton);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(54, 364, 388, 20);
		contentPane.add(displaybox);
	}

}
