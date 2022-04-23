package uniandes.dpoo.triqui.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{
	private VentanaTriqui ventanaTriqui; 
	private JButton boton;
	private JLabel label;

	public PanelBotones(VentanaTriqui padre)
	{
		this.ventanaTriqui = padre;
		boton = new JButton();
		boton.setText("Reiniciar");
		boton.addActionListener(this);
		this.add(boton);

		label = new JLabel();
		this.add(label);

	}

    // -----------------------------------------------------------------
    // Metodos
    // -----------------------------------------------------------------

	public void actionPerformed(ActionEvent e)
	{
		ventanaTriqui.reiniciar();
	}

	public void actualizarCantidadJugadas(int numero)
	{
		label.setText(numero + " jugadas");
	}
}
