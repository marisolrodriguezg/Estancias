
package EstanciaServicio;

import EstanciaEntidades.Familia;
import EstanciaPersistencia.DaoFamilias;
import java.util.Collection;

public class FamiliasSevicio {
    private DaoFamilias dao;
    public FamiliasSevicio(){
        this.dao=new DaoFamilias();
    }
      
    //PUNTO A
    public void  imprimirFamiliasTresHijosMenos10() throws Exception {

        try {

            //Listamos los productos
           Collection<Familia> familias = listarFamiliasTresHijosMenos10();

            //Imprimimos los productos
            if (familias.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Familia u : familias) {
                    
                    System.out.println("Nombre: " +u.getNombre() + " | " + " edad maxima " + u.getEdadMaxima() +" | " + " cantidad hijos: " + u.getNumHijos() +  "\n");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
       
    
//PUNTO A
   public Collection<Familia> listarFamiliasTresHijosMenos10() throws Exception {

        try {

            Collection<Familia> familias = dao.listarFamiliasTresHijosMenos10();

            return familias;
        } catch (Exception e) {
            throw e;
        }
    }
   public Collection<Familia> listarFamilias() throws Exception {

        try {

            Collection<Familia> familias = dao.listarFamilias();

            return familias;
        } catch (Exception e) {
            throw e;
        }
    }
    public void  imprimirFamilias() throws Exception {

        try {

            //Listamos los productos
           Collection<Familia> familias = listarFamilias();

            //Imprimimos los productos
            if (familias.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Familia u : familias) {
                    
                    System.out.println("Nombre: " +u.getNombre() + " | " + " edad maxima " + u.getEdadMaxima() +" | " + " cantidad hijos: " + u.getNumHijos() +  "\n");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    //PUNTO C
    public Collection<Familia> listarFamiliasMailHotmail() throws Exception {

        try {

            Collection<Familia> familias = dao.listarFamiliasMailHotmail();

            return familias;
        } catch (Exception e) {
            throw e;
        }
    }
    //PUNTO C
    public void  imprimirFamiliasMailHotmail() throws Exception {

        try {

            //Listamos los productos
           Collection<Familia> familias = listarFamiliasMailHotmail();

            //Imprimimos los productos
            if (familias.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Familia u : familias) {
                    
                    System.out.println("Nombre: " +u.getNombre() + " | " + " email " + u.getEmail() +" | " + " cantidad hijos: " + u.getNumHijos() +  "\n");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
