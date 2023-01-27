import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ej7 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup grupoColores = new ButtonGroup();
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej7 frame = new ej7();
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
	public ej7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Selecciona un color");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel, "cell 1 1");
		
		JRadioButton rdbtnAzul = new JRadioButton("Azul");
		rdbtnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor(Color.BLUE);
			}
		});
		grupoColores.add(rdbtnAzul);
		contentPane.add(rdbtnAzul, "cell 1 2");
		
		JRadioButton rdbtnRojo = new JRadioButton("Rojo");
		rdbtnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor(Color.RED);
			}
		});
		grupoColores.add(rdbtnRojo);
		contentPane.add(rdbtnRojo, "cell 1 3");
		
		JRadioButton rdbtnVerde = new JRadioButton("Verde");
		rdbtnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor(Color.GREEN);
			}
		});
		grupoColores.add(rdbtnVerde);
		contentPane.add(rdbtnVerde, "cell 1 4");
		
		panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		contentPane.add(panel, "cell 3 2 1 4,grow");
		
		JRadioButton rdbtnMagenta = new JRadioButton("Magenta");
		rdbtnMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor(Color.MAGENTA);
			}
		});
		grupoColores.add(rdbtnMagenta);
		contentPane.add(rdbtnMagenta, "cell 1 5");
	}

	protected void cambiarColor(Color color) {
		panel.setBackground(color);
	}

}
