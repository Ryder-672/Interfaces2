import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ej4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblPromedio;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej4 frame = new ej4();
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
	public ej4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][grow][grow][][grow]", "[46.00][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("CALCULAR PROMEDIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(SystemColor.activeCaptionText);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		contentPane.add(lblNewLabel, "cell 0 0 7 1,grow");
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 1 2,alignx center,aligny center");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 2 2 5 1,growx");
		textField.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota1:");
		lblNota1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNota1, "cell 1 3,alignx trailing");
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		contentPane.add(txtNota1, "cell 2 3,growx");
		
		JLabel lblNota2 = new JLabel("Nota2:");
		lblNota2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNota2, "cell 3 3,alignx trailing");
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		contentPane.add(txtNota2, "cell 4 3,growx");
		
		JLabel lblNota3 = new JLabel("Nota3:");
		lblNota3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNota3, "cell 5 3,alignx trailing");
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		contentPane.add(txtNota3, "cell 6 3,growx");
		
		btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				double nota3 = Double.parseDouble(txtNota3.getText());
				double promedio = (nota1+nota2+nota3)/3;
				
				lblPromedio.setText(""+promedio );
				if (promedio >= 5.0) {
					lblResultado.setText("has aprovado");
				}else {
					lblResultado.setText("toca recuperar");

				}
				
				
			}
		});
		contentPane.add(btnNewButton, "cell 5 4 2 1");
		
		lblNewLabel_2 = new JLabel("Promedio:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2, "cell 1 5");
		
		lblPromedio = new JLabel("");
		lblPromedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblPromedio, "cell 2 5");
		
		lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3, "cell 1 6");
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblResultado, "cell 2 6");
	}

}
