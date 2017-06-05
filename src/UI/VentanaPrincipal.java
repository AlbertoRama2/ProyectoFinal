package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal {

	private JFrame frame;
	private JButton btnCajadelDia;
	private JButton btnSubidaViajero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		btnCajadelDia=new JButton("Caja del Dia");
		btnSubidaViajero = new JButton("Subida Viajero");
		
		setComponetProperties();
		setComponentAdapters();
		
	}
		private void setComponetProperties(){
		btnSubidaViajero.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnSubidaViajero.setBounds(0, 0, 182, 171);
		frame.getContentPane().add(btnSubidaViajero);
		
		
		btnCajadelDia.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnCajadelDia.setBounds(181, 0, 195, 171);
		frame.getContentPane().add(btnCajadelDia);
		
		frame.setBounds(100, 100, 392, 210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		}
		
		private void setComponentAdapters(){
			btnSubidaViajero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				NuevoCliente pantallita = new NuevoCliente();
				pantallita.getFrame().setVisible(true);
				frame.dispose();
			}
			
		});
		}
		
		
		
}

