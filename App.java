import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
       Rings obj =new Rings();
       obj.setGold("mounikanaidu");
       obj.setSilver("yasminipriram");
       obj.setPlatinum("yamunamaha");
       Configuration con=new Configuration().configure().addAnnotatedClass(Rings.class);
       ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf= con.buildSessionFactory(reg);
       Session session=sf.openSession();
       Transaction tx=session.beginTransaction();
       session.save(obj);
       tx.commit();
    }
}
