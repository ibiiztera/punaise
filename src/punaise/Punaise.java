/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punaise;

import be.ibiiztera.md.punaise.PunaiseForme;

/**
 *
 * @author Manuel DAHMEN
 */
public class Punaise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Thread()
        {
            @Override
            public void run()
            {
                PunaiseForme pf = new PunaiseForme();
                pf.setVisible(true);
            }
        } .start();    
    }
}
