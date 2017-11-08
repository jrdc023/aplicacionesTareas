package proyecto;

public class Proyecto {

    String titulo;
    String periodoAcademico;
    String fechaInicio;
    String fechaFin;
    int objetivos;
    boolean estado;

    //variable de compocion
    private Componente componente;

    //variable de agregacion
    private Estudiante estudiante;

    //variable de asociacion
    private Etiqueta etiqueta;

    public Proyecto() {
        //aplicacion de compocicion
        componente = new Componente();
    }

    public Proyecto(String titulo, String periodoAcademico, String fechaInicio, String fechaFin, int objetivos, boolean estado, Etiqueta etiqueta) {
        this.titulo = titulo;
        this.periodoAcademico = periodoAcademico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.objetivos = objetivos;
        this.estado = estado;
        this.etiqueta = etiqueta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(int objetivos) {
        this.objetivos = objetivos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //agregacion de estudiante
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    //composicion de componente
    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "titulo=" + titulo + ", periodoAcademico=" + periodoAcademico + ", fechaInicio="
            + fechaInicio + ", fechaFin=" + fechaFin + ", objetivos=" + objetivos + ", estado=" + estado
            + ", componente=" + componente + ", estudiante=" + estudiante + ", etiqueta=" + etiqueta + '}';
    }

    public static void main(String[] args) {

    }
}
