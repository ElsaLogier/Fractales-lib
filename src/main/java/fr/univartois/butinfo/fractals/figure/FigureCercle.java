/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 nicolas
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figure;

import java.awt.Color;

/**
 * Le type FigureCercle
 *
 * @author nicolas
 *
 * @version 0.1.0
 */
public class FigureCercle extends AbstractFigure {
    
    private double rayon;
    
    public FigureCercle(int x, int y, Color color, double rayon) {
        super(x, y, color);
        this.rayon = rayon;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figure.AbstractFigure#getSVG()
     */
    @Override
    public String getSVG() {
        // TODO Auto-generated method stub.
       return "<circle "
              + "\"cx=\"" + x
              + "\"cy=\"" + y
              + "\"r=\"" + rayon
               + "\"/>";
    }
    
    

}

