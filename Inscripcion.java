package PracticoUno;

public class Inscripcion {
    //atributos de la clase
    private Alumno alumno;
    private Materia materia;
    private boolean validacion;

    //constructor de la clase
    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.validacion = aprobada(); //se llama al método aprobada al crear la inscripción
    }

    //metodo que verifica si el alumno cumple con las correlatividades de la materia
    public boolean aprobada() {
        for (Materia m : materia.getCorrelativas()) { //se recorre el ArrayList de correlativas
            if (!alumno.getMaterias().contains(m)) { //se comprueba si el HashSet del alumno contiene la materia
                return false; //si no la contiene, se devuelve false
            }
        }
        return true;
    }
         //si todas las materias están en el HashSet, se devuelve true

    //getters y setters de los atributos
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public boolean esValida() {
        return validacion;
    }

    public void setesValida(boolean validacion) {
        this.validacion = validacion;
    }
}