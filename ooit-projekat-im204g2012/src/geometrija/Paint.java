package geometrija;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Paint {

	private JFrame frame;
	private final ButtonGroup btnGroupBoje = new ButtonGroup();
	private final ButtonGroup btnGroupOblici = new ButtonGroup();
	
	/* Boje */
	JLabel lblBoja = new JLabel("Boja");
	JToggleButton tglbtnRed = new JToggleButton("");
	JToggleButton tglbtnBlue = new JToggleButton("");
	JToggleButton tglbtnYellow = new JToggleButton("");
	JToggleButton tglbtnBlack = new JToggleButton("");
	JToggleButton tglbtnGreen = new JToggleButton("");
	JToggleButton tglbtnWhite = new JToggleButton("");
	
	/* Oblici */
	JLabel lblOblik = new JLabel("Oblik");
	JToggleButton tglbtnTacka = new JToggleButton("Ta\u010Dka");
	JToggleButton tglbtnLinija = new JToggleButton("Linija");
	JToggleButton tglbtnKrug = new JToggleButton("Krug");
	JToggleButton tglbtnKvadrat = new JToggleButton("Kvadrat");
	JToggleButton tglbtnPravougaonik = new JToggleButton("Pravougaonik");
	
	/* Operacije */
	JButton btnUndo = new JButton("Undo");
	
	String boja;
	private final JToggleButton tglbtnSelect = new JToggleButton("Select");
	private final JToggleButton tglbtnPomeri = new JToggleButton("Pomeri");
	private final JToggleButton tglbtnObrii = new JToggleButton("Del");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint window = new Paint();
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
	public Paint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		/*---------BOJE---------*/
		
		lblBoja.setHorizontalAlignment(SwingConstants.CENTER);
		lblBoja.setBounds(72, 580, 320, 14);
		panel.add(lblBoja);
		
		/* Crvena */
		tglbtnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boja = "crvena";
			}
		});
		btnGroupBoje.add(tglbtnRed);
		tglbtnRed.setForeground(Color.RED);
		tglbtnRed.setBackground(Color.RED);
		tglbtnRed.setBounds(72, 605, 45, 45);
		panel.add(tglbtnRed);
		
		/* Plava */
		tglbtnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boja = "plava";
			}
		});
		btnGroupBoje.add(tglbtnBlue);
		tglbtnBlue.setForeground(Color.BLUE);
		tglbtnBlue.setBackground(Color.BLUE);
		tglbtnBlue.setBounds(127, 605, 45, 45);
		panel.add(tglbtnBlue);
		
		/* Žuta */
		tglbtnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boja = "zuta";
			}
		});
		btnGroupBoje.add(tglbtnYellow);
		tglbtnYellow.setForeground(Color.YELLOW);
		tglbtnYellow.setBackground(Color.YELLOW);
		tglbtnYellow.setBounds(182, 605, 45, 45);
		panel.add(tglbtnYellow);
		
		/* Crna */
		tglbtnBlack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boja = "crna";
			}
		});
		btnGroupBoje.add(tglbtnBlack);
		tglbtnBlack.setBackground(Color.BLACK);
		tglbtnBlack.setBounds(237, 605, 45, 45);
		panel.add(tglbtnBlack);
		
		/* Zelena */
		tglbtnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boja = "zelena";
			}
		});
		btnGroupBoje.add(tglbtnGreen);
		tglbtnGreen.setForeground(Color.GREEN);
		tglbtnGreen.setBackground(Color.GREEN);
		tglbtnGreen.setBounds(292, 605, 45, 45);
		panel.add(tglbtnGreen);
		
		/* Bela */
		tglbtnWhite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boja = "bela";
			}
		});
		btnGroupBoje.add(tglbtnWhite);
		tglbtnWhite.setForeground(Color.WHITE);
		tglbtnWhite.setBackground(Color.WHITE);
		tglbtnWhite.setBounds(347, 605, 45, 45);
		panel.add(tglbtnWhite);
		
		/*---------Oblici-----------*/

		lblOblik.setHorizontalAlignment(SwingConstants.CENTER);
		lblOblik.setBounds(458, 567, 392, 14);
		panel.add(lblOblik);
		
		/* Taèka */
		btnGroupOblici.add(tglbtnTacka);
		tglbtnTacka.setBounds(458, 592, 121, 23);
		panel.add(tglbtnTacka);
		
		/* Linija */
		btnGroupOblici.add(tglbtnLinija);
		tglbtnLinija.setBounds(595, 592, 121, 23);
		panel.add(tglbtnLinija);
		
		/* Krug */
		btnGroupOblici.add(tglbtnKrug);
		tglbtnKrug.setBounds(729, 592, 121, 23);
		panel.add(tglbtnKrug);
	
		/* Kvadrat */
		btnGroupOblici.add(tglbtnKvadrat);
		tglbtnKvadrat.setBounds(530, 627, 121, 23);
		panel.add(tglbtnKvadrat);
	
		/* Pravougaonik */
		btnGroupOblici.add(tglbtnPravougaonik);
		tglbtnPravougaonik.setBounds(661, 627, 121, 23);
		panel.add(tglbtnPravougaonik);
		
		/*-----------Operacije-------------*/	
		
		/* Undo */
		btnUndo.setBounds(887, 618, 65, 32);
		panel.add(btnUndo);
		tglbtnSelect.setBounds(51, 24, 121, 23);
		
		panel.add(tglbtnSelect);
		tglbtnPomeri.setBounds(196, 24, 121, 23);
		
		panel.add(tglbtnPomeri);
		tglbtnObrii.setBounds(887, 580, 65, 32);
		
		panel.add(tglbtnObrii);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 58, 964, 498);
		panel.add(panel_1);
	}
}
