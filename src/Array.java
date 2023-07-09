import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deleteposition;
	private JTextField position;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Array Data Structure");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(176, 11, 233, 42);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(34, 64, 162, 18);
		contentPane.add(lblNewLabel_1);

		length = new JTextField();
		length.setBounds(227, 64, 96, 20);
		contentPane.add(length);
		length.setColumns(10);

		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for creating the array
				// String len=length.getText();
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				String message = "Array of length " + len + " created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		create.setForeground(new Color(128, 0, 0));
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(137, 110, 148, 18);
		contentPane.add(create);

		JLabel lblNewLabel_1_1 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 176, 214, 18);
		contentPane.add(lblNewLabel_1_1);

		element = new JTextField();
		element.setColumns(10);
		element.setBounds(228, 173, 40, 20);
		contentPane.add(element);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insertion

				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(position.getText());
				if (pos >=arr.length ) {
					String message ="Position should be from 0 to "+Integer.toString(arr.length -1) ;
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(pos<0){
					String message="Position should be positive";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				
				else {
					arr[pos] = elem;
					String message = "Element " + elem + " inserted @ position" + pos;
					JOptionPane.showMessageDialog(contentPane, message);
				}
				element.setText("");
				position.setText("");
			}
		});
		insert.setForeground(new Color(128, 0, 0));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(420, 174, 99, 23);
		contentPane.add(insert);

		JLabel btndeleteposition = new JLabel("DELETE POSITION");
		btndeleteposition.setForeground(new Color(255, 0, 255));
		btndeleteposition.setFont(new Font("Constantia", Font.BOLD, 14));
		btndeleteposition.setBounds(23, 253, 148, 18);
		contentPane.add(btndeleteposition);

		deleteposition = new JTextField();
		deleteposition.setColumns(10);
		deleteposition.setBounds(199, 250, 96, 20);
		contentPane.add(deleteposition);

		JLabel btnposition = new JLabel("POSITION");
		btnposition.setForeground(new Color(128, 0, 128));
		btnposition.setFont(new Font("Constantia", Font.BOLD, 14));
		btnposition.setBounds(278, 176, 85, 18);
		contentPane.add(btnposition);

		position = new JTextField();
		position.setColumns(10);
		position.setBounds(360, 173, 40, 20);
		contentPane.add(position);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for deletion
				int pos = Integer.valueOf(deleteposition.getText());
				if(pos>=arr.length) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				arr[pos] = 0;
				String message = "Element deleted @ position " + pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		delete.setForeground(new Color(240, 128, 128));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(324, 249, 87, 27);
		contentPane.add(delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for display
				String msg = "";
				for (int i = 0; i < arr.length; i++) {
					msg = msg + " " + arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(138, 43, 226));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(199, 292, 93, 27);
		contentPane.add(display);

		displaybox = new JTextField();
		displaybox.setBackground(new Color(240, 255, 240));
		displaybox.setColumns(10);
		displaybox.setBounds(93, 354, 359, 20);
		contentPane.add(displaybox);
	}
}
