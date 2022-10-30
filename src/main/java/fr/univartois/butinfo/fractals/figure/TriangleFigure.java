/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 nicolas
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figure;

import java.awt.Color;

/**
 * Le type TriangleFigure
 *
 * @author nicolas
 *
 * @version 0.1.0
 */
public class TriangleFigure extends AbstractFigure {
    
    private double cote;
    
    private LineFigure premiereLigne;
    private LineFigure deuxiemeLigne;
    private LineFigure troisiemeLigne;
    
    public TriangleFigure(int x, int y, Color couleur, double cote) {
        super(x, y, couleur);
        this.premiereLigne = new LineFigure(x, y, couleur, (int) (x+cote), y);
        this.deuxiemeLigne = new LineFigure(x, y, couleur, x + (int) (cote / 2), y - getHauteur()); 
        this.troisiemeLigne = new LineFigure((int) (x+cote), y, couleur, (int) (x+cote) - (int) (cote / 2), y - getHauteur()); 
    }
    
    public int getHauteur() {
        return (int) (0.886 * cote);
    }
    
    
    /**
     * Donne l'attribut cote de cette instance de TriangleFigure.
     *
     * @return L'attribut cote de cette instance de TriangleFigure.
     */
    public double getCote() {
        return cote;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figure.IFigure#getSVG()
     */
    @Override
    public String getSVG() {
        return "<polygon points=\"" + premiereLigne.x + ", " + premiereLigne.y +
                " " +  deuxiemeLigne.x + ", " + deuxiemeLigne.y +
                " " +  troisiemeLigne.x + ", " + troisiemeLigne.y +
                "\" fill=\" rgb(" + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue() + ")"+ "\"/>";
    }
    
    
    /**
     * Donne l'attribut premiereLigne de cette instance de TriangleFigure.
     *
     * @return L'attribut premiereLigne de cette instance de TriangleFigure.
     */
    public LineFigure getPremiereLigne() {
        return premiereLigne;
    }
    
    
    /**
     * Donne l'attribut deuxiemeLigne de cette instance de TriangleFigure.
     *
     * @return L'attribut deuxiemeLigne de cette instance de TriangleFigure.
     */
    public LineFigure getDeuxiemeLigne() {
        return deuxiemeLigne;
    }
    
    
    /**
     * Donne l'attribut troisiemeLigne de cette instance de TriangleFigure.
     *
     * @return L'attribut troisiemeLigne de cette instance de TriangleFigure.
     */
    public LineFigure getTroisiemeLigne() {
        return troisiemeLigne;
    }
    
    

}

