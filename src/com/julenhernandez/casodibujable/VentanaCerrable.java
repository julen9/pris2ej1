package com.julenhernandez.casodibujable;

//Fichero VentanaCerrable.java
import java.awt.*;
import java.awt.event.*;

class VentanaCerrable extends Frame implements WindowListener {
	// constructores
	public VentanaCerrable() {
		super();
	}

	public VentanaCerrable(String title) {
		super(title);
		setSize(500, 500);
		addWindowListener(this);
	}

	// métodos de la interface WindowsListener
	@Override
	public void windowActivated(WindowEvent e) {
		// Por hacer 
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// Por hacer 
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// Por hacer 
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// Por hacer 
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// Por hacer 
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// Por hacer 
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// Por hacer 
		
	}
} // fin de la clase VentanaCerrable
