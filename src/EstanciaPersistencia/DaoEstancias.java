
package EstanciaPersistencia;

import EstanciaEntidades.Casa;
import EstanciaEntidades.Cliente;
import EstanciaEntidades.Estancia;
import EstanciaServicio.CasasServicios;
import EstanciaServicio.ClienteServicio;
import java.util.ArrayList;
import java.util.Collection;


public class DaoEstancias extends DAO{
     private  ClienteServicio clienteServicio;
private CasasServicios casasServicios;

    public DaoEstancias() {
        this.clienteServicio = new ClienteServicio();   
        this.casasServicios = new CasasServicios();     
    }
    
    
    
             public Collection<Estancia> listarEstanciasD() throws Exception {
        try {
            String sql = "SELECT * FROM estancias e, casas c where e.id_casa=c.id_casa  ";
            consultarBase(sql);
            Estancia estancia = null;
            Casa casa =null;
            Collection<Estancia> estancias= new ArrayList();
            Collection <Casa>casas=new ArrayList();
            while (resultado.next()) {
                estancia = new Estancia();
                casa =new Casa();
                estancia.setIdEstancia(resultado.getInt(1));
                //estancia.setIdCliente(resultado.getInt(2));
                int idCliente=resultado.getInt(2);
               // estancia.setIdCasa(resultado.getInt(3));
                int idCasa=resultado.getInt(3);
                estancia.setNombreHuesped(resultado.getString(4));
                estancia.setFechaDesde(resultado.getDate(5));
                estancia.setFechaHasta(resultado.getDate(6));
                casa.setIdCasa(resultado.getInt(1));
           //     casa.setCalle(resultado.getNString(2));
                
          // Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
           estancia.setIdCliente(idCliente);
           estancia.setIdCasa(idCasa);
         estancias.add(estancia);
         casas.add(casa);
       
            }
            desconectarBase();
            return estancias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }


}
