import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ej6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej6 frame = new ej6();
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
	public ej6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Hobbies:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 0 1 2 1");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "flowx,cell 5 1 3 1");
		
		JCheckBox chckbxDeportes = new JCheckBox("Deportes");
		contentPane.add(chckbxDeportes, "cell 1 2");
		
		JLabel lblDeportes = new JLabel("");
		lblDeportes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblDeportes, "cell 6 2");
		
		JCheckBox chckbxTecnologia = new JCheckBox("Tecnologia");
		contentPane.add(chckbxTecnologia, "cell 1 3");
		
		JLabel lblTecnologia = new JLabel("");
		lblTecnologia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblTecnologia, "cell 6 3");
		
		JCheckBox chckbxJuegos = new JCheckBox("Juegos");
		contentPane.add(chckbxJuegos, "cell 1 4");
		
		JLabel lblJuegos = new JLabel("");
		lblJuegos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblJuegos, "cell 6 4");
		
		JCheckBox chckbxCocina = new JCheckBox("Cocina");
		contentPane.add(chckbxCocina, "cell 1 5");
		
		JLabel lblCocina = new JLabel("");
		lblCocina.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblCocina, "cell 6 5");
		
		JLabel lblTusHobbies = new JLabel("Has seleccionado:");
		lblTusHobbies.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblTusHobbies, "cell 5 1 3 1");
		
		JButton button = new JButton("Comporbar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxCocina.isSelected()) {
					lblCocina.setText("Cocina");
				}else {
					lblCocina.setText("");
				}
				
				if (chckbxDeportes.isSelected()) {
					lblDeportes.setText("Deportes");
				}else {
					lblDeportes.setText("");
				}
				if (chckbxJuegos.isSelected()) {
					lblJuegos.setText("Juegos");
				}else {
					lblJuegos.setText("");
				}
				if (chckbxTecnologia.isSelected()) {
					lblTecnologia.setText("Tecnologia");
				}else {
					lblJuegos.setText("");
				}
				
				
			}
		});
		contentPane.add(button, "cell 5 7");
	}

}
