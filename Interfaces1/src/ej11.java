import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ej11 extends JFrame {

	private JPanel contentPane;
	private JTextField textCantidad;
	private final ButtonGroup buttonGroupOrigen = new ButtonGroup();
	private final ButtonGroup buttonGroupResultado = new ButtonGroup();
	private AbstractButton btnCalcular;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej11 frame = new ej11();
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
	public ej11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow]", "[][][][][][][][]"));
		
		JRadioButton rdbtnDolares = new JRadioButton("Dolares");
		rdbtnDolares.setActionCommand("Dolares");
		buttonGroupOrigen.add(rdbtnDolares);

		contentPane.add(rdbtnDolares, "cell 1 1,alignx center");
		
		JRadioButton rdbtnEuros = new JRadioButton("Euros");
		rdbtnEuros.setActionCommand("Euros");
		buttonGroupOrigen.add(rdbtnEuros);

		contentPane.add(rdbtnEuros, "flowx,cell 2 1,alignx center");
		
		JRadioButton rdbtnYenes = new JRadioButton("Yenes");
		rdbtnYenes.setActionCommand("Yenes");
		buttonGroupOrigen.add(rdbtnYenes);

		contentPane.add(rdbtnYenes, "cell 3 1,alignx center");
		
		JLabel lblNewLabel = new JLabel("Cantidad:");
		contentPane.add(lblNewLabel, "cell 0 2,alignx trailing");
		
		textCantidad = new JTextField();
		contentPane.add(textCantidad, "cell 1 2 3 1,growx");
		textCantidad.setColumns(10);
		
		
		
		
		JRadioButton rdbtnDolares_1 = new JRadioButton("Dolares");
		rdbtnDolares_1.setActionCommand("Dolares");
		buttonGroupResultado.add(rdbtnDolares_1);
		contentPane.add(rdbtnDolares_1, "cell 1 5,alignx center");
		
		JRadioButton rdbtnEuros_1 = new JRadioButton("Euros");
		rdbtnEuros_1.setActionCommand("Euros");
		buttonGroupResultado.add(rdbtnEuros_1);
		contentPane.add(rdbtnEuros_1, "cell 2 5,alignx center");
		
		JRadioButton rdbtnYenes_1 = new JRadioButton("Yenes");
		rdbtnYenes_1.setActionCommand("Yenes");
		buttonGroupResultado.add(rdbtnYenes_1);
		contentPane.add(rdbtnYenes_1, "cell 3 5,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		contentPane.add(lblNewLabel_1, "cell 1 7");
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblResultado, "cell 2 7");
		
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String monedaOrigen = buttonGroupOrigen.getSelection().getActionCommand();
				String monedaDestino = buttonGroupResultado.getSelection().getActionCommand();
				double dinero = Double.parseDouble(textCantidad.getText());
				double resultado= 0.0;
				
				if (monedaOrigen.equals(monedaDestino)) {
					lblResultado.setText("Son la misma moneda:"+ dinero   );
					
				} else if (monedaOrigen=="Dolares" && monedaDestino=="Euros") {
					resultado = dinero * 0.92;
					lblResultado.setText(resultado+"Euros");
				}else if (monedaOrigen=="Dolares" && monedaDestino=="Yenes") {
					resultado = dinero * 129.87;
					lblResultado.setText(resultado+"Yenes");
				}else if (monedaOrigen=="Euros" && monedaDestino=="Dolares") {
					resultado = dinero * 1.09;
					lblResultado.setText(resultado+"Dolares");
				}else if (monedaOrigen=="Euros" && monedaDestino=="Yenes") {
					resultado = dinero * 141.35;
					lblResultado.setText(resultado+"Yenes");
				}else if (monedaOrigen=="Yenes" && monedaDestino=="Dolares") {
					resultado = dinero * 0.0077;
					lblResultado.setText(resultado+"Dolares");
				}else if (monedaOrigen=="Yenes" && monedaDestino=="Euros ") {
					resultado = dinero * 0.0077;
					lblResultado.setText(resultado+"Dolares");
				}
				
		
				
			}
		});
		contentPane.add(btnCalcular, "cell 2 4,alignx center,aligny center");
	}

}
