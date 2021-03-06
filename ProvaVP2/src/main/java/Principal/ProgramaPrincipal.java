package Principal;

import Correspondencias.*;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Correspondencia ca = new Correspondencia(120, 1.5, "16/07/2020");
        Correspondencia ca2 = new Correspondencia(230, 2.5, "06/08/2020");
        Correspondencia ca3 = new Correspondencia(150, 1.40, "05-05-2005");

        CorrespondenciaAR car = new CorrespondenciaAR(250, 5.0, "08/09/2020");
        CorrespondenciaAR car2 = new CorrespondenciaAR(350, 6.0, "12/10/2020");

        Malote ma = new Malote("18/10/2020", "Brasilia");

        ma.adicionar(ca);
        ma.adicionar(ca2);
        ma.adicionar(ca3);
        ma.adicionar(car);
        ma.adicionar(car2);

        ma.conferirPrecos();

        ma.remover(ca2);

        ma.remeter();

    }

}
