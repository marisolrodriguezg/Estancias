
package EstanciaEntidades;

public class Comentarios {
    private int idComentarios;
    private int idCasa;
    private String comentario;

    public Comentarios() {
    }

    public Comentarios(int idComentarios, int idCasa, String comentario) {
        this.idComentarios = idComentarios;
        this.idCasa = idCasa;
        this.comentario = comentario;
    }

    public int getIdComentarios() {
        return idComentarios;
    }

    public void setIdComentarios(int idComentarios) {
        this.idComentarios = idComentarios;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentarios{" + "idComentarios=" + idComentarios + ", idCasa=" + idCasa + ", comentario=" + comentario + '}';
    }
    
}
