package uniandes.dpoo.triqui.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{
	// -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Comando para activar el modo oprimido.
     */
	private static final String BOTON_MODO_OPRIMIDO = "Oprimido";

	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es una referencia a la clase principal de la interfaz.
     */
	private VentanaTriqui principal;

	// -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Es el boton para reiniciar el juego
     */
	private JButton botonReiniciar;

	/**
     * Texto da la cantidad de movimientos
     */
	private JLabel etiquetaJugadas;
	
	public PanelBotones(VentanaTriqui padre)
	{
		principal = padre;
        setLayout(new GridLayout(1,2));

		// Inicializa el botonReiniciar
		botonReiniciar = new JButton(); 
        botonReiniciar.setToolTipText("Reiniciar");
        botonReiniciar.setActionCommand(BOTON_MODO_OPRIMIDO);
        botonReiniciar.addActionListener(this);
        botonReiniciar.setContentAreaFilled( false );
        botonReiniciar.setEnabled( false );
        add(botonReiniciar);
	}

	public void actionPerformed(ActionEvent e)
	{
		
	}

	public void actualizarCantidadJugadas(int numero)
	{
		etiquetaJugadas.setText( "Quedan " + numero + " minas" );
	} 
}