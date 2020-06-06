public class Persona{
   
    protected PerfilCalendario perfil;

    public Persona(PerfilCalendario perfil) {
        this.perfil = perfil;
    }

    public PerfilCalendario getPerfilCalendario() {
        return perfil;
    }

    public void setPerfilCalendario(PerfilCalendario perfil) {
      this.perfil = perfil;
    }

    void aniadirPerfilCalendario(String nombrePerfil){
        if (nombrePerfil.equals("PAS")){
            setPerfilCalendario (new PerfilCalendarioPAS(getPerfilCalendario()));
        } else if (nombrePerfil.equals("Alumno")){
            setPerfilCalendario (new PerfilCalendarioAlumno(getPerfilCalendario()));
        } else if (nombrePerfil.equals("Profesor")){
            setPerfilCalendario (new PerfilCalendarioProfesor(getPerfilCalendario()));
        }
    }

}