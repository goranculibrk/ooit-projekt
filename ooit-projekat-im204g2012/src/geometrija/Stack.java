package geometrija;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ScrollPaneLayout;
import javax.swing.SwingConstants;

import java.awt.SystemColor;

import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Stack extends JFrame{

	private JFrame frame;
	private JPanel contentPane;
	private JTextField tfXPocetne;
	private JTextField tfYPocetne;
	private JTextField tfXKrajnje;
	private JTextField tfYKrajnje;
	DefaultListModel dlm = new DefaultListModel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack window = new Stack();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Stack() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 633);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		tfXPocetne = new JTextField();
		tfXPocetne.setBounds(10, 48, 165, 20);
		panel.add(tfXPocetne);
		tfXPocetne.setColumns(10);
		
		tfYPocetne = new JTextField();
		tfYPocetne.setBounds(209, 48, 165, 20);
		panel.add(tfYPocetne);
		tfYPocetne.setColumns(10);
		
		tfXKrajnje = new JTextField();
		tfXKrajnje.setBounds(10, 122, 165, 20);
		panel.add(tfXKrajnje);
		tfXKrajnje.setColumns(10);
		
		tfYKrajnje = new JTextField();
		tfYKrajnje.setBounds(209, 122, 165, 20);
		panel.add(tfYKrajnje);
		tfYKrajnje.setColumns(10);
		
		JLabel lblXPoetneTake = new JLabel("X po\u010Detne ta\u010Dke");
		lblXPoetneTake.setHorizontalAlignment(SwingConstants.CENTER);
		lblXPoetneTake.setBounds(10, 23, 165, 14);
		panel.add(lblXPoetneTake);
		
		JLabel lblYPoetneTake = new JLabel("Y po\u010Detne ta\u010Dke");
		lblYPoetneTake.setHorizontalAlignment(SwingConstants.CENTER);
		lblYPoetneTake.setBounds(209, 23, 165, 14);
		panel.add(lblYPoetneTake);
		
		JLabel lblXKrajnjeTake = new JLabel("X krajnje ta\u010Dke");
		lblXKrajnjeTake.setHorizontalAlignment(SwingConstants.CENTER);
		lblXKrajnjeTake.setBounds(10, 97, 165, 14);
		panel.add(lblXKrajnjeTake);
		
		JLabel lblYPoetneTake_1 = new JLabel("Y po\u010Detne ta\u010Dke");
		lblYPoetneTake_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblYPoetneTake_1.setBounds(209, 97, 165, 14);
		panel.add(lblYPoetneTake_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 292, 364, 277);
		panel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(dlm);
		
		JButton btnDodaj = new JButton("Dodaj na stack");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					int xPocetne = Integer.parseInt(tfXPocetne.getText());
					int yPocetne = Integer.parseInt(tfYPocetne.getText());
					int xKrajnje = Integer.parseInt(tfXKrajnje.getText());
					int yKrajnje = Integer.parseInt(tfYKrajnje.getText());
					Tacka pocetna = new Tacka (xPocetne, yPocetne);
					Tacka krajnja = new Tacka (xKrajnje, yKrajnje);
					Linija l = new Linija (pocetna, krajnja);
					
					if(xPocetne < 0 || yPocetne < 0 || xKrajnje < 0 || yKrajnje < 0){
						JOptionPane.showMessageDialog(null,"Unesi realnu vrednost","Error",JOptionPane.ERROR_MESSAGE);
					}
					else if(xPocetne == xKrajnje && yKrajnje == yPocetne){
						JOptionPane.showMessageDialog(null, "Pogresno unete pocetna i krajnja tacka", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else dlm.add(0,l);
					
					tfXPocetne.setText(null);
					tfYPocetne.setText(null);
					tfXKrajnje.setText(null);
					tfYKrajnje.setText(null);
						
					}
					catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Niste pravilno uneli tacke", "Error", JOptionPane.ERROR_MESSAGE);
						tfXPocetne.setText(null);
						tfYPocetne.setText(null);
						tfXKrajnje.setText(null);
						tfYKrajnje.setText(null);
						tfXPocetne.grabFocus();
						// TODO: handle exception
					}
					
				}
		});
		btnDodaj.setBounds(10, 175, 364, 23);
		panel.add(btnDodaj);
		
		
		JButton btnObrisiPoljaUnosa = new JButton("Obri\u0161i polja unosa");
		btnObrisiPoljaUnosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfXKrajnje.setText(null);
				tfYKrajnje.setText(null);
				tfXPocetne.setText(null);
				tfYPocetne.setText(null);
			}
		});
		
		btnObrisiPoljaUnosa.setBounds(10, 219, 364, 23);
		panel.add(btnObrisiPoljaUnosa);
		
		JButton btdUkloni = new JButton("Ukloni poslednji element");
		btdUkloni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.remove(0);
			}
		});
		btdUkloni.setBounds(10, 258, 364, 23);
		panel.add(btdUkloni);
		
	}
}
