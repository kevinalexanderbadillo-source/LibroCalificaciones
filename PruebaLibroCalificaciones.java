import java.util.Scanner; // Importación necesaria

public class PruebaLibroCalificaciones {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();

        LibroCalificaciones miLibroCalificacionesIniciado = new LibroCalificaciones(
            "Programacion II", "Ana Luisa", 4
        );

        // Se ajustan los métodos a get...
        System.out.printf("El nombre inicial del curso: %s\n El profesor es : %s\n y las horas a la semana son: %d\n\n",
            miLibroCalificacionesIniciado.getNombreDelCurso(), 
            miLibroCalificacionesIniciado.getNombreDelProfesor(),
            miLibroCalificacionesIniciado.getHorasDelCurso());

        System.out.println("Escriba el nombre del curso:");
        String elNombre = entrada.nextLine();

        System.out.println("Escriba el nombre del profesor:");
        String elProfe = entrada.nextLine();

        System.out.println("Escriba las horas por semana del curso:");
        int horasSemana = entrada.nextInt(); // Cambio a nextInt()
        entrada.nextLine(); // Limpia el salto de línea sobrante

        System.out.println();

        // Se ajusta a setParametrosDelCurso
        miLibroCalificaciones.setParametrosDelCurso(elNombre, elProfe, horasSemana);

        miLibroCalificaciones.mostrarMensaje();

        System.out.println("\nVamos a cambiar los valores del objeto mLCIniciado:");

        System.out.println("Escriba el nuevo nombre del curso para el objeto mLCIniciado:");
        elNombre = entrada.nextLine();

        System.out.println("Escriba el nuevo nombre del profesor para el objeto mLCIniciado:");
        elProfe = entrada.nextLine();

        System.out.println("Escriba las nueva cantidad de horas por semana del curso para el objeto mLCIniciado:");
        horasSemana = entrada.nextInt(); // Cambio a nextInt()
        entrada.nextLine(); // Limpia el salto de línea sobrante

        miLibroCalificacionesIniciado.setParametrosDelCurso(elNombre, elProfe, horasSemana);

        miLibroCalificacionesIniciado.mostrarMensaje();
    }
}