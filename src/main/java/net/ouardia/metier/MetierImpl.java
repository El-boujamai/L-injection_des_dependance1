package net.ouardia.metier;
import net.ouardia.dao.IDao;
public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
       double t=dao.getData();
       double res =t*12*Math.PI/2 * Math.cos(t);

        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }
}
