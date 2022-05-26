package EstanciaServicio;

import EstanciaEntidades.Casa;
import EstanciaEntidades.Familia;
import EstanciaPersistencia.DaoCasas;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

public class CasasServicios {

    private DaoCasas dao;
 

    public CasasServicios() {
        this.dao = new DaoCasas();

    }
    //PUNTO B
public Collection<Casa> listarCasas() throws Exception {

        try {

            Collection<Casa> casas = dao.listarCasas();

            return casas;
        } catch (Exception e) {
            throw e;
        }
    }
    public void imprimirCasas() throws Exception {

        try {

            //Listamos los productos
            Collection<Casa> casas = listarCasas();

            //Imprimimos los productos
            if (casas.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Casa u : casas) {

                    System.out.println("IdCasa " + u.getIdCasa() + " | " + " pais: "  + u.getPais() + " | " +" Fecha Desde: " + u.getFechaDesde()+"fecha hasta " + u.getFechaHasta() +  "\n");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
//        //PUNTO D
//public Collection<Casa> listarCasasD(LocalDate fechaX, int cantDias) throws Exception {
//
//        try {
//
//            Collection<Casa> casas = dao.listarCasasD(fechaX, cantDias);
//
//            return casas;
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//    public void imprimirCasasD(LocalDate fechaX, int cantDias) throws Exception {
//
//        try {
//
//            //Listamos los productos
//            Collection<Casa> casas = listarCasasD(fechaX, cantDias);
//
//            //Imprimimos los productos
//            if (casas.isEmpty()) {
//                throw new Exception("No existen productos para imprimir");
//            } else {
//                for (Casa u : casas) {
//
//                    System.out.println("IdCasa " + u.getIdCasa() + " | " + " pais: "  + u.getPais() + " | " +" Fecha Desde: " + u.getFechaDesde()+" fecha hasta " + u.getFechaHasta() +  "\n");
//                }
//            }
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//public Collection<Casa> listarCasasE() throws Exception {
//
//        try {
//
//            Collection<Casa> casas = dao.buscarCasaPorId();
//
//            return casas;
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//    public void imprimirCasasE() throws Exception {
//
//        try {
//
//            //Listamos los productos
//            Collection<Casa> casas =listarCasasE();
//
//            //Imprimimos los productos
//            if (casas.isEmpty()) {
//                throw new Exception("No existen productos para imprimir");
//            } else {
//                for (Casa u : casas) {
//
//                    System.out.println("IdCasa " + u.getIdCasa() + " | " + " pais: "  + u.getPais() + " | " +" Fecha Desde: " + u.getFechaDesde()+"fecha hasta " + u.getFechaHasta() +  "\n");
//                }
//            }
//        } catch (Exception e) {
//            throw e;
//        }
//    }
}
