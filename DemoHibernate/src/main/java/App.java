import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Alien alien = new Alien();
        alien.setAid(101);
        alien.setAname("soojong");
        alien.setColor("black");


        Configuration con = new Configuration();

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();
        session.save(alien);


    }
}
