import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ej2 extends JFrame {

	private JPanel contentPane;
	private int cont1 =0;
	private int cont2 =0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej2 frame = new ej2();
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
	public ej2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][][grow][]", "[][grow][33.00][]"));
		
		JLabel lblBoton1 = new JLabel("Boton 1: 0 veces");
		lblBoton1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblBoton1, "cell 1 0,alignx center");
		
		JLabel lblBoton2 = new JLabel("Boton 2: 0 veces");
		lblBoton2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblBoton2, "cell 4 0,alignx center");
		
		JButton btnBoton1 = new JButton("Boton 1");
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				cont1++;
				lblBoton1.setText("Boton 1: "+ cont1 +" veces");
			}
		});
		contentPane.add(btnBoton1, "cell 1 2,alignx center,aligny center");
		
		JButton btnBoton2 = new JButton("Boton 2");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont2++;
				
				lblBoton2.setText("Boton 2: "+ cont2 +" veces");

			}
		});
		contentPane.add(btnBoton2, "cell 4 2,alignx center");
	}

}
