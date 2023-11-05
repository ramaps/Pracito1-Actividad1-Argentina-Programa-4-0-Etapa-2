package PracticoUno;

import java.util.HashSet; //se importa la clase HashSet

public class Alumno {
    //los atributos de la clase alumno
    private String nombre;
    private String apellido;
    private HashSet<Materia> materias; // se usa un HashSet para guardar las materias

    // el constructor de la clase alumno
    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = new HashSet<Materia>(); // se inicia el HashSet vacio
    }

    // con este metodo agregamos una materia en el HashSet
    public void agregarUnaMateria(Materia materia) {
        this.materias.add(materia);
    }

    // este metodo es para eliminar una materia del HashSet
    public void eliminarUnaMateria(Materia materia) {
        this.materias.remove(materia);
    }

    //con este metodo podemos obtener el HashSet de materias
    public HashSet<Materia> getMaterias() {
        return this.materias;
    }
}
