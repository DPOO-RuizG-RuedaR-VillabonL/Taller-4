package uniandes.dpoo.triqui.interfaz;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import uniandes.dpoo.triqui.mundo.Triqui;

@SuppressWarnings("serial")
public class PanelTriqui extends JPanel implements MouseListener 
{
	private Triqui mundoTriqui = new Triqui();
	private VentanaTriqui ventanaTriqui;
	private double origenY;
	private double origenX;
	private double finY;
	private double finX;
	private double anchoTablero;
	private double altoTablero;
	private int[][] tablero;
	private int fila = -1, columna = -1;
	public static final int OS = 1;
	public static final int XS = 2;
	private int turno = XS;

	public PanelTriqui(VentanaTriqui ventanaTriqui)
	{
		this.ventanaTriqui = ventanaTriqui;
		this.addMouseListener(this);
	}

	public void actualizarTablero(Triqui triqui)
	{
		this.mundoTriqui = triqui;
		this.setSize(getWidth()+1, getHeight()+1);
		repaint();
	}

	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		pintarLineas(g2d);
		tablero = mundoTriqui.darCasillas();
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++){
				pintarJugadas(g2d, i, j, tablero[i][j]);
		}
	}

	private void pintarJugadas(Graphics2D g2d, int fila, int columna, int turno)
	{
		origenY = getHeight()*0.1;
		origenX = getWidth()*0.2;
		finY = getHeight()*0.9;
		finX = getWidth()*0.8;
		anchoTablero = finX-origenX;
		altoTablero = finY-origenY;

		if (turno== XS)
			g2d.setColor(Color.pink);
		else
			g2d.setColor(Color.CYAN);

		if (fila == 0 && columna == 0 ) {
			if (turno == XS){
				g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666*3/2));
				g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666*3/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666/2));
			}
			else if (turno == OS) {
				g2d.drawOval((int) (origenX+anchoTablero*0.1666/2) , (int) (origenY+altoTablero*0.1666/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
			}


		}else if (fila == 0 && columna == 1) {
			if (turno == XS){
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666*3/2));
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666*3/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666/2));
			}
			else if (turno == OS){
				g2d.drawOval((int) (origenX+anchoTablero*0.1666*5/2) , (int) (origenY+altoTablero*0.1666/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
			}

		}else if (fila == 0 && columna == 2){
			if (turno == XS){
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666*3/2));
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666*3/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666/2));
			}
			else if (turno == OS){
				g2d.drawOval((int) (origenX+anchoTablero*0.1666*9/2) , (int) (origenY+altoTablero*0.1666/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
			}
		}else if (fila == 1 && columna == 0) {
			if (turno == XS){
				g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666*5/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666*7/2));
				g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666*7/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666*5/2));
			}
			else if (turno == OS) {
				g2d.drawOval((int) (origenX+anchoTablero*0.1666/2) , (int) (origenY+altoTablero*0.1666*5/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
			}
		}else if (fila == 1 && columna == 1) {
			if (turno == XS){
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666*5/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666*7/2));
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666*7/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666*5/2));
			}
			else if (turno == OS){
				g2d.drawOval((int) (origenX+anchoTablero*0.1666*5/2) , (int) (origenY+altoTablero*0.1666*5/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
			}
		}else if (fila == 1 && columna == 2){
			if (turno == XS){
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666*5/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666*7/2));
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666*7/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666*5/2));
			}
			else if (turno == OS){
				g2d.drawOval((int) (origenX+anchoTablero*0.1666*9/2) , (int) (origenY+altoTablero*0.1666*5/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
			}
		}else if (fila == 2 && columna == 0) {
			if (turno == XS){
				g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666*9/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666*11/2));
				g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666*11/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666*9/2));
			}
			else if (turno == OS) {
				g2d.drawOval((int) (origenX+anchoTablero*0.1666/2) , (int) (origenY+altoTablero*0.1666*9/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
			}
		}else if (fila == 2 && columna == 1) {
			if (turno == XS){
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666*9/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666*11/2));
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666*11/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666*9/2));
			}
			else if (turno == OS) {
				g2d.drawOval((int) (origenX+anchoTablero*0.1666*5/2) , (int) (origenY+altoTablero*0.1666*9/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
			}
		}else if (fila == 2 && columna == 2) {
			if (turno == XS){
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666*9/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666*11/2));
				g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666*11/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666*9/2));
			}
			else if (turno == OS) {
				g2d.drawOval((int) (origenX+anchoTablero*0.1666*9/2) , (int) (origenY+altoTablero*0.1666*9/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
			}
		}else {
			mundoTriqui = new Triqui();
			repaint();
		}
	}

	private void pintarLineas(Graphics2D g2d)
	{
		origenY = getHeight()*0.1;
		origenX = getWidth()*0.2;
		finY = getHeight()*0.9;
		finX = getWidth()*0.8;
		anchoTablero = finX-origenX;
		altoTablero = finY-origenY;
		BasicStroke stroke = new BasicStroke(5f);
		g2d.setStroke(stroke);
		g2d.setColor(Color.BLACK);

        g2d.drawLine((int) (origenX+0.33*anchoTablero), (int) origenY, (int) (origenX+0.33*anchoTablero), (int) finY);
        g2d.drawLine((int) (origenX+0.66*anchoTablero), (int) origenY, (int) (origenX+0.66*anchoTablero), (int) finY);
        g2d.drawLine((int) origenX, (int) (origenY+0.33*altoTablero), (int) finX, (int) (origenY+0.33*altoTablero));
		g2d.drawLine((int) origenX, (int) (origenY+0.66*altoTablero), (int) finX, (int) (origenY+0.66*altoTablero));
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		Point punto = e.getPoint();

		int x = (int) punto.getX();
		int y = (int) punto.getY();

		origenY = getHeight()*0.1;
		origenX = getWidth()*0.2;
		finY = getHeight()*0.9;
		finX = getWidth()*0.8;
		anchoTablero = finX-origenX;
		altoTablero = finY-origenY;

		if (x > origenX+ anchoTablero*0.66  && x < finX){
			columna = 2;
		}else if (x > origenX + anchoTablero*0.33  && x < origenX + anchoTablero*0.66){
			columna = 1;
		}else{
			columna = 0;
		} 

		if (y > origenY + altoTablero*0.66  && y < finY){
			fila = 2;
		}else if (y > origenY + altoTablero*0.33  && y < origenY + altoTablero*0.66){
			fila = 1;
		}else{
			fila = 0;
		}

		if (mundoTriqui.jugar(fila, columna) == true){
			ventanaTriqui.jugar(fila, columna);
			if (turno == XS)
				turno = OS;
			else if (turno == OS)
				turno = XS;
		}

	}

	@Override
	public void mousePressed(MouseEvent e)
	{

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
	}

}
