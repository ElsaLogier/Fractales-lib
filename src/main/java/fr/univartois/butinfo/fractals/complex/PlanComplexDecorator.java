/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 nicolas
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;


/**
 * Le type PlanComplexDecorator
 *
 * @author nicolas
 *
 * @version 0.1.0
 */
public abstract class PlanComplexDecorator implements IPlanComplex {
    
    private IPlanComplex plan;
    private int width;
    private int height;
    
    /**
     * 
     * Crée une nouvelle instance de PlanComplexDecorator.
     * 
     * @param plan plan du décorateur
     * 
     * @param width longueur du plan du décorateur
     * 
     * @param height largeur du plan du décorateur
     */
    protected PlanComplexDecorator(IPlanComplex plan, int width, int height) {
        this.plan = plan;
        this.width = width;
        this.height = height;
    }
    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IPlanComplex#asComplex(int, int)
     */
    @Override
    public IComplex asComplex(int row, int column) {
        return plan.asComplex(row, column);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IPlanComplex#getWidth()
     */
    @Override
    public int getWidth() {
        return plan.getWidth();
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IPlanComplex#getHeight()
     */
    @Override
    public int getHeight() {
        return plan.getHeight();
    }
    
    /**
     * methode abstraite, appeléee pour lancer les opérations des décorateurs enfants.
     */
    public abstract void operation();
    

}

