package EstanciaServicio;

import EstanciaEntidades.Estancia;
import EstanciaPersistencia.DaoEstancias;
import java.util.Collection;

public class EstanciasServicio {

    private DaoEstancias dao;

    public EstanciasServicio() {
        this.dao = new DaoEstancias();
    }

    public void imprimirEstanciasD() throws Exception {

        try {

            //Listamos los mascotas
            Collection<Estancia> estancias = listarEstanciaD();
            

            //Imprimimos los mascotas
            if (estancias.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Estancia u : estancias) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Estancia> listarEstanciaD() throws Exception {

        try {

            Collection<Estancia> estancias = dao.listarEstanciasD();

            return estancias;
        } catch (Exception e) {
            throw e;
        }
    }
}
