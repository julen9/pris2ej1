package com.julenhernandez.casodibujable;

//fichero Ejemplo1.java
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;

class Ejemplo1 {
	private static final Logger log = Logger.getLogger(Ejemplo1.class.getName());
	
	public static void main(String arg[]) throws InterruptedException {
 
		log.log(Level.SEVERE,"Comienza","Comienza main()...");
		Circulo c = new Circulo(2.0, 2.0, 4.0);
		log.log(Level.SEVERE,"Radio","Radio = " + c.getR() + " unidades.");
		log.log(Level.SEVERE,"Centro","Centro = (" + c.getX() + "," + c.getY() + ") unidades.");
		Circulo c1 = new Circulo(1.0, 1.0, 2.0);
		Circulo c2 = new Circulo(0.0, 0.0, 3.0);
		c = c1.elMayor(c2);
		log.log(Level.SEVERE,"El mayor","El mayor radio es " + c.getR() + ".");
		c = Circulo.elMayor(c1, c2);
		log.log(Level.SEVERE,"El mayor","El mayor radio es " + c.getR() + ".");
		VentanaCerrable ventana = new VentanaCerrable("Ventana abierta al mundo...");
		ArrayList v = new ArrayList();
		CirculoGrafico cg1 = new CirculoGrafico(200, 200, 100, Color.red);
		CirculoGrafico cg2 = new CirculoGrafico(300, 200, 100, Color.blue);
		RectanguloGrafico rg = new RectanguloGrafico(50, 50, 450, 350, Color.green);
		v.add(cg1);
		v.add(cg2);
		v.add(rg);
		PanelDibujo mipanel = new PanelDibujo(v);
		ventana.add(mipanel);
		ventana.setSize(500, 400);
		ventana.setVisible(true);
		log.log(Level.SEVERE,"Termina","Termina main()...");
	} // fin de main()
} // fin de class Ejemplo1