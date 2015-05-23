package geometrija;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class Sortiranje {

	private JFrame frame;
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
					Sortiranje window = new Sortiranje();
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
	public Sortiranje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 650);
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
		
		JLabel lblXPocetne = new JLabel("X Po\u010Detne ta\u010Dke");
		lblXPocetne.setHorizontalAlignment(SwingConstants.CENTER);
		lblXPocetne.setBounds(10, 26, 165, 14);
		panel.add(lblXPocetne);
		
		JLabel lblYPoetneTake = new JLabel("Y Po\u010Detne ta\u010Dke");
		lblYPoetneTake.setHorizontalAlignment(SwingConstants.CENTER);
		lblYPoetneTake.setBounds(209, 26, 165, 14);
		panel.add(lblYPoetneTake);
		
		JLabel lblXKrajnjeTake = new JLabel("X Krajnje ta\u010Dke");
		lblXKrajnjeTake.setHorizontalAlignment(SwingConstants.CENTER);
		lblXKrajnjeTake.setBounds(10, 97, 165, 14);
		panel.add(lblXKrajnjeTake);
		
		JLabel lblYKrajnjeTake = new JLabel("Y Krajnje ta\u010Dke");
		lblYKrajnjeTake.setHorizontalAlignment(SwingConstants.CENTER);
		lblYKrajnjeTake.setBounds(209, 97, 165, 14);
		panel.add(lblYKrajnjeTake);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 269, 364, 299);
		panel.add(scrollPane);
		JList list = new JList();		
		scrollPane.setViewportView(list);
		list.setModel(dlm);
		
		JButton btnDodajNaListu = new JButton("Dodaj na listu");
		btnDodajNaListu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int xPocetne = Integer.parseInt(tfXPocetne.getText());
					int yPocetne = Integer.parseInt(tfYPocetne.getText());
					int xKrajnje = Integer.parseInt(tfXKrajnje.getText());
					int yKrajnje = Integer.parseInt(tfYKrajnje.getText());
					
					Tacka pocetna = new Tacka(xPocetne, yPocetne);
					Tacka krajnja = new Tacka(xKrajnje, yKrajnje);
					
					Linija linija = new Linija(pocetna, krajnja);
					if(xPocetne < 0 || yPocetne < 0 || xKrajnje < 0 || yKrajnje < 0){
						JOptionPane.showMessageDialog(null,"Unesi realnu vrednost","Error",JOptionPane.ERROR_MESSAGE);
					}
					else if(xPocetne == xKrajnje && yKrajnje == yPocetne){
						JOptionPane.showMessageDialog(null, "Pogresno unete pocetna i krajnja tacka", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else dlm.add(0,linija);
					
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
		btnDodajNaListu.setBounds(10, 167, 364, 23);
		panel.add(btnDodajNaListu);
		
		JButton btnObriiUnetaPolja = new JButton("Obri\u0161i uneta polja");
		btnObriiUnetaPolja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfXKrajnje.setText(null);
				tfYKrajnje.setText(null);
				tfXPocetne.setText(null);
				tfYPocetne.setText(null);
			}
		});
		btnObriiUnetaPolja.setBounds(10, 201, 364, 23);
		panel.add(btnObriiUnetaPolja);
		
		JButton btnSortiraj = new JButton("Sortiraj");
		btnSortiraj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[] obj = dlm.toArray();
				
				Arrays.sort(obj);
				
				dlm.clear();
				
				for(int i=0; i < obj.length; i++){
					dlm.addElement(obj[i]);
				}
				
				if(dlm.isEmpty()){
					JOptionPane.showMessageDialog(null, "Ne možete sortirati. Prazan niz.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnSortiraj.setBounds(10, 235, 364, 23);
		panel.add(btnSortiraj);
		
		JButton btnObriiListu = new JButton("Obri\u0161i listu");
		btnObriiListu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.clear();
			}
		});
		btnObriiListu.setBounds(10, 577, 364, 23);
		panel.add(btnObriiListu);
	}
}
