package net.ouardia.metier;
import net.ouardia.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("d")
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
