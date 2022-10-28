package fr.univartois.butinfo.fractals.figure;

import java.awt.Color;
import java.io.IOException;
import java.io.Writer;

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 nicolas
 * Tous droits réservés.
 */

/**
 * Le type TapisSierpinski
 *
 * @author nicolas
 *
 * @version 0.1.0
 */
public class TapisSierpinski extends AbstractFractalesSVG {
    
    public TapisSierpinski(int width, int height, IFigure figure, int iteration) {
        super(width, height, figure, iteration);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figure.AbstractFractalesSVG#formerFractale(java.io.Writer, fr.univartois.butino.fractals.figure.IFigure, int)
     */
    @Override
    public Writer formerFractale(Writer file, IFigure figure, int iterations) throws IOException {
        int x = ((FigureCarre) figure).x;
        int y = ((FigureCarre) figure).y;
        int width = ((FigureCarre) figure).getWidth();
        if (iterations == getIterations()) return file;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == j && i == 1)) {
                    System.out.println("x: " + j + " y: " + i);
                    IFigure fig = new FigureCarre(x + (j * width / 3), y + (i * width / 3), Color.white, width / 3);
                    creerFormesBase(file, fig);
                    formerFractale(file, fig, iterations+1);
                } else {
                    IFigure fig = new FigureCarre(x + (j * width / 3), y + (i * width / 3), Color.black, width / 3);
                    creerFormesBase(file, fig);
                }
            }
        } return file;
        
    }
    
    public static void main(String[] args) {
        TapisSierpinski t = new TapisSierpinski(600, 600, new FigureCarre(0, 0, Color.black, 600), 5);
        try {
            t.creerFractalesSvg();
        } catch (IOException e) {
            System.err.println("oops");
        }
    }

}

