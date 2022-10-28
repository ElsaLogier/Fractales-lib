package fr.univartois.butinfo.couleurs;

import java.awt.Color;

public class CouleurDecorateurV extends CouleurDecorateur {
	
	public CouleurDecorateurV(IStrategieCouleurs palette) {
		super(palette);
	}
	
	/**
	 * Crée une palette de couleur et met un masque sur la couleur verte
	 * @param nbItMax le nombre d'itérations max
	 * @param nbIterations le nombre d'itérations
	 */
	@Override
	public Color palette(int nbItMax, int nbIterations) {
		Color couleur = palette.palette(nbItMax, nbIterations);
		return new Color(couleur.getRed(),0,couleur.getBlue());
	}
}
