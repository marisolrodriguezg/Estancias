
package EstanciaEntidades;

import java.util.Date;

public class Casa {
    private int idCasa;
    private String calle;
    private int numero;
    private int codPostal;
    private String ciudad;
    private String pais;
    private Date fechaDesde;
    private Date fechaHasta;
    private int tiempoMin;
    private int tiempoMax;
    private double precioHabitacion;
    private String tipoVivienda;

    public Casa() {
    }

    public Casa(int idCasa, String calle, int numero, int codPostal, String ciudad, String pais, Date fechaDesde, Date fechaHasta, int tiempoMin, int tiempoMax, double precioHabitacion, String tipoVivienda) {
        this.idCasa = idCasa;
        this.calle = calle;
        this.numero = numero;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.tiempoMin = tiempoMin;
        this.tiempoMax = tiempoMax;
        this.precioHabitacion = precioHabitacion;
        this.tipoVivienda = tipoVivienda;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
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

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public int getTiempoMin() {
        return tiempoMin;
    }

    public void setTiempoMin(int tiempoMin) {
        this.tiempoMin = tiempoMin;
    }

    public int getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(int tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public String toString() {
        return "Casas{" + "idCasa=" + idCasa + ", calle=" + calle + ", numero=" + numero + ", codPostal=" + codPostal + ", ciudad=" + ciudad + ", pais=" + pais + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", tiempoMin=" + tiempoMin + ", tiempoMax=" + tiempoMax + ", precioHabitacion=" + precioHabitacion + ", tipoVivienda=" + tipoVivienda + '}';
    }
    
}
