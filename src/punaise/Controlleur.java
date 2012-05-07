package punaise;

import java.util.List;

/**
 *
 * @author Manuel DAHMEN
 */
public interface Controlleur {

    public class Papier {

        public Papier() {
        }
    }
    public void ajouter(List<Papier> papiers);
    public void deformer(Papier p);
    public void mettreAuRebut(Papier p);
    public void mettreEnValeur(Papier p);
    public void mettreAJour(Papier orig, Papier dest);
}
