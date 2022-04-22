package uniandes.dpoo.triqui.interfaz;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import uniandes.dpoo.triqui.mundo.Triqui;

@SuppressWarnings("serial")
public class PanelTriqui extends JPanel implements MouseListener 
{
	private double origenY;
	private double origenX;
	private double finY;
	private double finX;
	private double anchoTablero;
	private double altoTablero;

	public PanelTriqui(VentanaTriqui ventanaTriqui)
	{
	}

	public void actualizarTablero(Triqui triqui)
	{
		repaint();
	}

	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;

		pintarLineas(g2d);
		pintarJugadas(g2d);
	}

	private void pintarJugadas(Graphics2D g2d)
	{
		origenY = getHeight()*0.1;
		origenX = getWidth()*0.2;
		finY = getHeight()*0.9;
		finX = getWidth()*0.8;
		anchoTablero = finX-origenX;
		altoTablero = finY-origenY;

		g2d.setColor(Color.BLUE);
		g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666*3/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666*3/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666*3/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666*3/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666*3/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666*3/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666/2));

		g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666*5/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666*7/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666*7/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666*5/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666*5/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666*7/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666*7/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666*5/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666*5/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666*7/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666*7/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666*5/2));

		g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666*9/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666*11/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666/2), (int) (origenY+altoTablero*0.1666*11/2), (int) (origenX+anchoTablero*0.1666*3/2), (int) (origenY+altoTablero*0.1666*9/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666*9/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666*11/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*5/2), (int) (origenY+altoTablero*0.1666*11/2), (int) (origenX+anchoTablero*0.1666*7/2), (int) (origenY+altoTablero*0.1666*9/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666*9/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666*11/2));
		g2d.drawLine((int) (origenX+anchoTablero*0.1666*9/2), (int) (origenY+altoTablero*0.1666*11/2), (int) (origenX+anchoTablero*0.1666*11/2), (int) (origenY+altoTablero*0.1666*9/2));

		g2d.setColor(Color.MAGENTA);
		g2d.drawOval((int) (origenX+anchoTablero*0.1666/2) , (int) (origenY+altoTablero*0.1666/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
		g2d.drawOval((int) (origenX+anchoTablero*0.1666*5/2) , (int) (origenY+altoTablero*0.1666/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
		g2d.drawOval((int) (origenX+anchoTablero*0.1666*9/2) , (int) (origenY+altoTablero*0.1666/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));

		g2d.drawOval((int) (origenX+anchoTablero*0.1666/2) , (int) (origenY+altoTablero*0.1666*5/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
		g2d.drawOval((int) (origenX+anchoTablero*0.1666*5/2) , (int) (origenY+altoTablero*0.1666*5/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
		g2d.drawOval((int) (origenX+anchoTablero*0.1666*9/2) , (int) (origenY+altoTablero*0.1666*5/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));

		g2d.drawOval((int) (origenX+anchoTablero*0.1666/2) , (int) (origenY+altoTablero*0.1666*9/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
		g2d.drawOval((int) (origenX+anchoTablero*0.1666*5/2) , (int) (origenY+altoTablero*0.1666*9/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
		g2d.drawOval((int) (origenX+anchoTablero*0.1666*9/2) , (int) (origenY+altoTablero*0.1666*9/2) , (int) (getHeight()*getWidth()*0.00014), (int) ((getHeight()*getWidth())*0.00014));
	}

	private void pintarLineas(Graphics2D g2d)
	{
		origenY = getHeight()*0.1;
		origenX = getWidth()*0.2;
		finY = getHeight()*0.9;
		finX = getWidth()*0.8;
		anchoTablero = finX-origenX;
		altoTablero = finY-origenY;
		BasicStroke stroke = new BasicStroke(3f);
		g2d.setStroke(stroke);

        g2d.drawLine((int) (origenX+0.33*anchoTablero), (int) origenY, (int) (origenX+0.33*anchoTablero), (int) finY);
        g2d.drawLine((int) (origenX+0.66*anchoTablero), (int) origenY, (int) (origenX+0.66*anchoTablero), (int) finY);
        g2d.drawLine((int) origenX, (int) (origenY+0.33*altoTablero), (int) finX, (int) (origenY+0.33*altoTablero));
		g2d.drawLine((int) origenX, (int) (origenY+0.66*altoTablero), (int) finX, (int) (origenY+0.66*altoTablero));
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{

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
