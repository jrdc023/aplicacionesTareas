package proyecto;

public class ProyectoProgramacion extends Proyecto {

    private String urlGit;
    private String lenguajeProgramacion;

    public ProyectoProgramacion() {
    }

    public ProyectoProgramacion(String titulo, String periodoAcademico, String fechaInicio, String fechaFin, int objetivos, boolean estado, Etiqueta etiqueta,
        String urlGit, String lenguajeProgramacion) {
        super(titulo, periodoAcademico, fechaInicio, fechaFin, objetivos, estado, etiqueta);
    }

    public String getUrlGit() {
        return urlGit;
    }

    public void setUrlGit(String urlGit) {
        this.urlGit = urlGit;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
}
