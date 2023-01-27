import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ej9 extends JFrame {

	private JPanel contentPane;
	private JTextField textPeli;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej9 frame = new ej9();
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
	public ej9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow]", "[][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Nombre de la pelicula:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 1 1,alignx trailing");
		
		JLabel lblPeliculas = new JLabel("Peliculas:");
		lblPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblPeliculas, "cell 2 1,alignx center");
		
		textPeli = new JTextField();
		contentPane.add(textPeli, "cell 1 2,growx");
		textPeli.setColumns(10);
		
		JComboBox comboBoxPeli = new JComboBox();
		contentPane.add(comboBoxPeli, "cell 2 2,growx");
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String peli = textPeli.getText();
				
				comboBoxPeli.addItem(peli);
				
			}
		});
		contentPane.add(btnAnadir, "cell 1 4");
	}

}
