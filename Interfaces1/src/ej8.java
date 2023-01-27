import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ej8 extends JFrame {

	private JPanel contentPane;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej8 frame = new ej8();
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
	public ej8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow]", "[][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Ciudad:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel, "cell 1 1,alignx trailing");
		
		JComboBox comboBoxCiudad = new JComboBox();
		comboBoxCiudad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxCiudad.setModel(new DefaultComboBoxModel(new String[] {"Cordoba", "Cabra", "Adamuz", "Lucena", "Montalban"}));
		comboBoxCiudad.setToolTipText("");
		contentPane.add(comboBoxCiudad, "cell 2 1,growx");
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				String ciudad = (String) comboBoxCiudad.getSelectedItem();
				
				switch (ciudad) {
				case "Cordoba": lblResultado.setText("Cordoba") ;break;
				case "Adamuz": lblResultado.setText("Adamuz");break;
				case "Lucena": lblResultado.setText("Lucena");break;
				case "Montalban": lblResultado.setText("Montalban");break;
				case "Cabra": lblResultado.setText("Cabra");break;
				}
		
			
			}
		});
		contentPane.add(btnNewButton, "cell 1 6");
		
		lblResultado = new JLabel("");
		contentPane.add(lblResultado, "cell 2 6");
	}

}
