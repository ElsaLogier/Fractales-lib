/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 nicolas
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figure;

import java.awt.Color;
import java.io.IOException;
import java.io.Writer;

/**
 * Le type TapisSierpinskiDiagonale
 *
 * @author nicolas
 *
 * @version 0.1.0
 */
public class TapisSierpinskiDiagonale extends AbstractFractalesSVG {
    
    public TapisSierpinskiDiagonale(int width, int height, IFigure figure, int iteration) {
        super(width, height, figure, iteration);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figure.AbstractFractalesSVG#formerFractale(java.io.Writer, fr.univartois.butinfo.fractals.figure.IFigure, int)
     */
    @Override
    public Writer formerFractale(Writer file, IFigure figure, int iterations) throws IOException {
        int x = ((FigureCarre) figure).x;
        int y = ((FigureCarre) figure).y;
        int width = ((FigureCarre) figure).getWidth();
        if (iterations == getIterations()) return file;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == j)) {
                    IFigure fig = new FigureCarre(x + (j * width / 3), y + (i * width / 3), Color.black, width / 3);
                    creerFormesBase(file, fig);
                    formerFractale(file, fig, iterations+1);
                } else {
                    IFigure fig = new FigureCarre(x + (j * width / 3), y + (i * width / 3), new Color(254 / (iterations+1), 254 / (iterations+1), 254 / (iterations+1)), width / 3);
                    creerFormesBase(file, fig);
                }
            }
        } return file;
    }

    public static void creation(int width, int iteration, String outputFile){
        TapisSierpinskiDiagonale t = new TapisSierpinskiDiagonale(width, width, new FigureCarre(0, 0, Color.black, width), iteration);
        t.creerFractalesSvg(outputFile);
    }

    public static void main(String[] args) {
        TapisSierpinskiDiagonale t = new TapisSierpinskiDiagonale(2048, 2048, new FigureCarre(0, 0, Color.black, 2048), 6);
        t.creerFractalesSvg("file.svg");
    }
    

}

