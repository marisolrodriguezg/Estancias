
package EstanciaEntidades;

public class Cliente {
   private int idCliente;
    private String nombre;
    private int calle;
    private int numero;
    private int cogidoPostal;
    private String ciudad;
    private String pais;
    private String email;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, int calle, int numero, int cogidoPostal, String ciudad, String pais, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.cogidoPostal = cogidoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalle() {
        return calle;
    }

    public void setCalle(int calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCogidoPostal() {
        return cogidoPostal;
    }

    public void setCogidoPostal(int cogidoPostal) {
        this.cogidoPostal = cogidoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
 
}
