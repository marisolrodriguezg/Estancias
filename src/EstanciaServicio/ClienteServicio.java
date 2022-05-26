
package EstanciaServicio;

import EstanciaEntidades.Cliente;
import EstanciaPersistencia.DaoClientes;

public class ClienteServicio {
    private DaoClientes dao;

    public ClienteServicio() {
        this.dao =new DaoClientes();
    }
     public Cliente buscarClientePorId(int idCliente) throws Exception {

        try {

            //Validamos
//            if (id == null) {
//                throw new Exception("Debe indicar el id");
//            }

            Cliente cliente = dao.buscarClienteoPorId(idCliente);

            return cliente;
        } catch (Exception e) {
            throw e;
        }
    }
}
