import ru.mtuci.laba_java.model.Artikle;
import ru.mtuci.laba_java.model.Manufaturer;
import ru.mtuci.laba_java.repository.ArtikleRepository;

import java.security.acl.Group;

/*public class Main {

    public static void main(String[] args) {
        Manufaturer Man1 = new Manufaturer(1L,"PLANT 25","Moscow, Aviamotornaya street 51",7682353);*/


public class Main {
    public static void main(String[] args) {
        /* создадим переменную "stud1" класса "Student" зададим ей экземпляр класса "Student",
         * которой будут переданы параметры конструктора*/
        Manufaturer Man1 = new Manufaturer( );

        Artikle art1 = new Artikle();

        ArtikleRepository artikleRepositorya = new ArtikleRepository();
        artikleRepositorya.save(art1);

    }
}
