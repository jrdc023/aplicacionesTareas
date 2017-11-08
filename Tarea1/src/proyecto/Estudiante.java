package proyecto;

public class Estudiante {

    private String correo;
    private String apillidos;
    private String nombres;

    public Estudiante() {
    }

    public Estudiante(String correo, String apillidos, String nombres) {
        this.correo = correo;
        this.apillidos = apillidos;
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApillidos() {
        return apillidos;
    }

    public void setApillidos(String apillidos) {
        this.apillidos = apillidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "apillidos=" + apillidos + ", nombres=" + nombres + '}';
    }
}
