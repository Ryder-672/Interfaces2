import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class ej3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JLabel lblResultado;
	private JPasswordField passPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej3 frame = new ej3();
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
	public ej3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][][]", "[][][][][31.00][grow][grow]"));
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblUser, "cell 1 1,alignx trailing,aligny center");
		
		txtUser = new JTextField();
		contentPane.add(txtUser, "cell 2 1 2 1,growx");
		txtUser.setColumns(10);
		
		JLabel lblPass = new JLabel("Contraseña:");
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblPass, "cell 1 3,alignx trailing,aligny center");
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = txtUser.getText();
				String pass = new String(passPass.getPassword());

				if (user.equals("pepe") && pass.equals("pepe")) {
					lblResultado.setText("correcto");
				}else {
					lblResultado.setText("incorrecto");

				}
				
			}
		});
		
		passPass = new JPasswordField();
		contentPane.add(passPass, "cell 2 3 2 1,growx");
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblResultado, "cell 1 5");
		contentPane.add(btnNewButton, "cell 3 5,aligny top");
	}

}
