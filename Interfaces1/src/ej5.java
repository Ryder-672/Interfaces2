import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ej5 extends JFrame {

	private JPanel contentPane;
	private JButton btnHabilitar;
	private JButton btnDeshabilita;
	private AbstractButton btnCentral;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej5 frame = new ej5();
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
	public ej5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		btnDeshabilita = new JButton("Deshabilita Central");
		btnDeshabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHabilitar.setEnabled(true);
				btnDeshabilita.setEnabled(false);
				btnCentral.setEnabled(false);
				
				
			}
		});
		contentPane.add(btnDeshabilita, BorderLayout.WEST);
		
		btnCentral = new JButton("Central");
		btnCentral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		contentPane.add(btnCentral, BorderLayout.CENTER);
		
		btnHabilitar = new JButton("Habilita Central");
		btnHabilitar.setEnabled(false);
		btnHabilitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnCentral.setEnabled(true);
				btnDeshabilita.setEnabled(true);
				btnHabilitar.setEnabled(false);
				
			}
		});
		contentPane.add(btnHabilitar, BorderLayout.EAST);
	}

}
