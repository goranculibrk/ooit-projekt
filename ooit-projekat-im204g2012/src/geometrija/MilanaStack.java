package geometrija;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class MilanaStack extends JFrame{

	private JFrame frmStack1;
	private JPanel contentPane;
	private JTextField textFieldXPoc;
	private JTextField textFieldYPoc;
	private JTextField textFieldXKraj;
	private JTextField textFieldYKraj;
	DefaultListModel dlm = new DefaultListModel();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MilanaStack frame = new MilanaStack();
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
	public MilanaStack() {
		setTitle("Stack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblXPoc = new JLabel("X pocetne:");
		lblXPoc.setBounds(22, 11, 71, 26);
		contentPane.add(lblXPoc);

		JLabel lblYPoc = new JLabel("Y pocetne:");
		lblYPoc.setBounds(224, 13, 66, 23);
		contentPane.add(lblYPoc);

		JLabel lblXKraj = new JLabel("X krajnje:");
		lblXKraj.setBounds(22, 48, 59, 26);
		contentPane.add(lblXKraj);

		JLabel lblYKraj = new JLabel("Y krajnje:");
		lblYKraj.setBounds(224, 47, 66, 14);
		contentPane.add(lblYKraj);

		textFieldXPoc = new JTextField();
		textFieldXPoc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
					textFieldYPoc.grabFocus();
			}
		});
		textFieldXPoc.setColumns(10);
		textFieldXPoc.setBounds(91, 14, 86, 20);
		contentPane.add(textFieldXPoc);

		textFieldYPoc = new JTextField();
		textFieldYPoc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
					textFieldXKraj.grabFocus();
			}
		});
		textFieldYPoc.setColumns(10);
		textFieldYPoc.setBounds(300, 14, 86, 20);
		contentPane.add(textFieldYPoc);

		textFieldXKraj = new JTextField();
		textFieldXKraj.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
					textFieldYKraj.grabFocus();
			}
		});
		textFieldXKraj.setColumns(10);
		textFieldXKraj.setBounds(91, 51, 86, 20);
		contentPane.add(textFieldXKraj);

		textFieldYKraj = new JTextField();
		textFieldYKraj.setColumns(10);
		textFieldYKraj.setBounds(300, 51, 86, 20);
		contentPane.add(textFieldYKraj);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 85, 162, 166);
		contentPane.add(scrollPane);

		JList list = new JList();
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBackground(SystemColor.textHighlight);
		scrollPane.setViewportView(list);
		list.setModel(dlm);


		JButton btnStavi = new JButton("STAVI");
		btnStavi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int unosXP = Integer.parseInt(textFieldXPoc.getText());
					int unosYP = Integer.parseInt(textFieldYPoc.getText());
					int unosXK = Integer.parseInt(textFieldXKraj.getText());
					int unosYK = Integer.parseInt(textFieldYKraj.getText());

					Tacka p = new Tacka (unosXP, unosYP);
					Tacka k = new Tacka (unosXK, unosYK);
					Linija l = new Linija(p, k);

					if(unosXP < 0 || unosYP < 0 && unosXK < 0 || unosYK < 0){
						JOptionPane.showMessageDialog(null, "Unesite pozitivan broj!", "Greska", JOptionPane.ERROR_MESSAGE);
					} 
					else if(unosXP == unosXK && unosYP == unosYK){ 
						JOptionPane.showMessageDialog(null, "Niste pravilno uneli koordinate!", "Greska", JOptionPane.ERROR_MESSAGE);
					}
					else
						dlm.add(0,l);			
					textFieldXPoc.setText("");
					textFieldYPoc.setText("");
					textFieldXKraj.setText("");
					textFieldYKraj.setText("");
					textFieldXPoc.grabFocus();
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Unesite odgovarajuce koordinate!", "Greska", JOptionPane.ERROR_MESSAGE);
					textFieldXPoc.setText("");
					textFieldYPoc.setText("");
					textFieldXKraj.setText("");
					textFieldYKraj.setText("");
					textFieldXPoc.grabFocus();
				}
			}
		});
		btnStavi.setBounds(211, 141, 89, 23);
		contentPane.add(btnStavi);


		JButton btnUkloni = new JButton("UKLONI");
		btnUkloni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Linija l = (Linija) dlm.getElementAt(0);
					textFieldXPoc.setText(String.valueOf(l.getPocetna().getX()));
					textFieldYPoc.setText(String.valueOf(l.getPocetna().getY()));
					textFieldXKraj.setText(String.valueOf(l.getKrajnja().getX()));
					textFieldYKraj.setText(String.valueOf(l.getKrajnja().getY()));
					if(textFieldXPoc.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Neophodno je popuniti listu", "Greska", JOptionPane.ERROR_MESSAGE);
					} else
						dlm.remove(0);
				}
				catch(Exception e2){
					JOptionPane.showMessageDialog(null, "Lista je prazna!", "Greska", JOptionPane.ERROR_MESSAGE);
					textFieldXPoc.setText(null);
					textFieldYPoc.setText(null);
					textFieldXKraj.setText(null);
					textFieldYKraj.setText(null);
					textFieldXPoc.grabFocus();
				}
			}
		});
		btnUkloni.setBounds(310, 141, 89, 23);
		contentPane.add(btnUkloni);

		JButton btnObrisi = new JButton("OBRISI");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(textFieldXPoc.getText().isEmpty() && textFieldYPoc.getText().isEmpty() 
							&& textFieldXKraj.getText().isEmpty() && textFieldYKraj.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Polja su prazna!", "Greska", EXIT_ON_CLOSE);
					}
					if(textFieldXPoc.getText().isEmpty() || textFieldYPoc.getText().isEmpty() 
							|| textFieldXKraj.getText().isEmpty() || textFieldYKraj.getText().isEmpty()){
						textFieldXPoc.setText(null);
						textFieldYPoc.setText(null);
						textFieldXKraj.setText(null);
						textFieldYKraj.setText(null);	
						textFieldXPoc.grabFocus();
					}
					if(!textFieldXPoc.getText().isEmpty() || !textFieldYPoc.getText().isEmpty() 
							|| !textFieldXKraj.getText().isEmpty() || !textFieldYKraj.getText().isEmpty()){
						textFieldXPoc.setText(null);
						textFieldYPoc.setText(null);
						textFieldXKraj.setText(null);
						textFieldYKraj.setText(null);
						textFieldXPoc.grabFocus();
					}
				}
				catch(Exception e3){
					textFieldXPoc.setText(null);
					textFieldYPoc.setText(null);
					textFieldXKraj.setText(null);
					textFieldYKraj.setText(null);
					textFieldXPoc.grabFocus();
				}
			}
		});
		btnObrisi.setBounds(211, 190, 89, 23);
		contentPane.add(btnObrisi);
	}

}


