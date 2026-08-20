
public class LibroCalificaciones{
    private String nombreDelCurso, nombreDelProfesor;
    private int horasDelCurso;
    //encapsulacion
    public LibroCalificaciones(){

    }

public LibroCalificaciones(String nombre, String profesor, int horas){
    this.horasDelCurso = horas;
    this.nombreDelProfesor = profesor;
    this.nombreDelCurso = nombre;
}
public void setParametrosDelCurso(String nombre, String profesor, int horas)
{
    nombreDelCurso = nombre;
    nombreDelProfesor = profesor;
    horasDelCurso = horas;
    }
    public String getNombreDelCurso() {
    return nombreDelCurso;
}
public String getNombreDelProfesor() {
    return nombreDelProfesor;
}
public int getHorasDelCurso() {
    return horasDelCurso;
}
public void setNombreDelCurso(String nombreDelCurso){
    this.nombreDelCurso = nombreDelCurso;
}
public void setNombreProfesor(String nombreDelProfesor){
    this.nombreDelProfesor = nombreDelProfesor;
}
public void setHorasDelCurso(int horasDelCurso){
    this.horasDelCurso = horasDelCurso;
}

    public void mostrarMensaje()
    {
        System.out.printf(" Bienvenido al libro de calificaciones para \n%s!\n",
        getNombreDelCurso());
        System.out.printf(" Tu profesor asigando es: %s!\n",
        getNombreDelProfesor());
        System.out.printf(" Tienes %d horas a la semana\n",
        getHorasDelCurso());
        }


}

