package EstanciaPersistencia;

import EstanciaEntidades.Cliente;

public class DaoClientes extends DAO {

    public Cliente buscarClienteoPorId(int idCliente) throws Exception {
        try {
        
            String sql = "SELECT * FROM clientes "
                    + " WHERE id_cliente = '" + idCliente + "'";

            consultarBase(sql);

            Cliente cliente = null;
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(resultado.getInt(1));

            }
            desconectarBase();
            return cliente;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
