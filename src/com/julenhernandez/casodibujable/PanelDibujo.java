package com.julenhernandez.casodibujable;

// fichero PanelDibujo.java
import java.awt.*;
import java.util.List;
import java.util.Iterator;

public class PanelDibujo extends Panel {
	// variable miembro
	private List<Geometria> v;

	// constructor
	public PanelDibujo(List<Geometria> va) {
		super(new FlowLayout());
		this.v = va;
	}

	// redefinición del método paint()
	@Override
	public void paint(Graphics g) {
		Dibujable dib;
		Iterator it;
		it = v.iterator();
		while (it.hasNext()) {
			dib = (Dibujable) it.next();
			dib.dibujar(g);
		}
	}
} // Fin de la clase PanelDibujo