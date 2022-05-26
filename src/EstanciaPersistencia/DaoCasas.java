
package EstanciaPersistencia;

import EstanciaEntidades.Casa;
import EstanciaEntidades.Cliente;
import EstanciaEntidades.Estancia;
import EstanciaServicio.ClienteServicio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public final class DaoCasas extends DAO {
    
        private  ClienteServicio clienteServicio;

    public DaoCasas() {
        this.clienteServicio = new ClienteServicio();
    }
    //PUNTO B
        public Collection<Casa> listarCasas() throws Exception {
        try {
            String sql = "SELECT * FROM casas where pais='reino unido' and fecha_desde>='2020-08-01'and fecha_hasta<='2020-08-31'  ";
            consultarBase(sql);
            Casa casa = null;
            Collection<Casa> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casa();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodPostal(resultado.getInt(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMin(resultado.getInt(9));
                casa.setTiempoMax(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getInt(11));
                casa.setTipoVivienda(resultado.getString(12));
           
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
        //punto d
        public Collection<Casa> listarCasasD( LocalDate fechaX, int cantDias) throws Exception {
        try {
            
            
            String sql = "SELECT * FROM casas where fecha_desde>= '"+ fechaX+ "' and tiempo_minimo<= "+cantDias+" and tiempo_maximo>= "+cantDias+" ";
            consultarBase(sql);
            Casa casa = null;
            Collection<Casa> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casa();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodPostal(resultado.getInt(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMin(resultado.getInt(9));
                casa.setTiempoMax(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getInt(11));
                casa.setTipoVivienda(resultado.getString(12));
           
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
//         public Collection<Casa> buscarCasaPorId() throws Exception {
//        try {
//            String sql = "select c.id_casa,c.tipo_vivienda ,c.ciudad, e.id_estancia , cl.id_cliente from casas c, estancias e, clientes cl where cl.id_cliente= e.id_cliente and e.id_casa=c.id_casa ";
//            consultarBase(sql);
//          
//            Casa casa = null;
//            Cliente cliente=null;
//            Estancia estancia=null;
//             Collection<Casa> busqueda= new ArrayList();
////            Collection<Casa> casas = new ArrayList();
////             Collection<Cliente> clientes = new ArrayList();
////              Collection<Estancia> estancias = new ArrayList();
//            while (resultado.next()) {
//                casa = new Casa();
//                casa.setIdCasa(resultado.getInt(1));
//                casa.setCalle(resultado.getString(2));
//                casa.setNumero(resultado.getInt(3));
//                casa.setCodPostal(resultado.getInt(4));
//                casa.setCiudad(resultado.getString(5));
//                casa.setPais(resultado.getString(6));
//                casa.setFechaDesde(resultado.getDate(7));
//                casa.setFechaHasta(resultado.getDate(8));
//                casa.setTiempoMin(resultado.getInt(9));
//                casa.setTiempoMax(resultado.getInt(10));
//                casa.setPrecioHabitacion(resultado.getInt(11));
//                casa.setTipoVivienda(resultado.getString(12));
//                
//                cliente = new Cliente();
//                         
//               cliente.setIdCliente(resultado.getInt(1));
//                 estancia=new Estancia ();
//                 estancia.setIdCliente(1);
//                 busqueda.add(casa);
//           
//            }
//            
//                        
//            desconectarBase();
//            return busqueda;
//        } catch (Exception e) {
//            e.printStackTrace();
//            desconectarBase();
//            throw e;
//        }
//    }
//         public Collection<Casa> listarCasasD(int id) throws Exception {
//        try {
//            String sql = "SELECT * FROM casas  ";
//            consultarBase(sql);
//            Casa casa = null;
//            Collection<Casa> casas = new ArrayList();
//            while (resultado.next()) {
//                casa = new Casa();
//                casa.setIdCasa(resultado.getInt(1));
//                casa.setCalle(resultado.getString(2));
//                casa.setNumero(resultado.getInt(3));
//                casa.setCodPostal(resultado.getInt(4));
//                casa.setCiudad(resultado.getString(5));
//                casa.setPais(resultado.getString(6));
//                casa.setFechaDesde(resultado.getDate(7));
//                casa.setFechaHasta(resultado.getDate(8));
//                casa.setTiempoMin(resultado.getInt(9));
//                casa.setTiempoMax(resultado.getInt(10));
//                casa.setPrecioHabitacion(resultado.getInt(11));
//                casa.setTipoVivienda(resultado.getString(12));
//           Cliente cliente = clienteServicio.buscarUsuarioPorId(id);
//           casa.setIdCasa(cliente);
//                casas.add(casa);
//            }
//            desconectarBase();
//            return casas;
//        } catch (Exception e) {
//            e.printStackTrace();
//            desconectarBase();
//            throw e;
//        }
//    }
}
