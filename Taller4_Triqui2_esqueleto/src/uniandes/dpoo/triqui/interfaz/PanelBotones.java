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
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    private VentanaTriqui principal; 

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
        this.principal = padre;
        setLayout(new GridLayout(1,2));

		// Inicializa el botonReiniciar
		botonReiniciar = new JButton(); 
        botonReiniciar.setToolTipText("Reiniciar");
        this.add(botonReiniciar);
	}

    // -----------------------------------------------------------------
    // Metodos
    // -----------------------------------------------------------------

	public void actionPerformed(ActionEvent e)
	{
	}

	public void actualizarCantidadJugadas(int numero)
	{
		etiquetaJugadas.setText( "Es la jugada ");
	} 
}