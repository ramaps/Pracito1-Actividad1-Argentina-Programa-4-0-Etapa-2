package PracticoUno;

public class App
{
    public static  void main(String[] args )
    {
        //se crean algunos objetos de la clase Materia con sus nombres y códigos
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos", "201");
        Materia paradigmas = new Materia("Paradigmas de Programación", "202");
        Materia diseño = new Materia("Diseño de Sistemas", "203");

        //se agregan las materias correlativas de cada materia
        paradigmas.agregarUnaCorrelativa(algoritmos); //se necesita algoritmos para cursar paradigmas
        diseño.agregarUnaCorrelativa(paradigmas); //se necesita paradigmas para cursar diseño

        //se crea un objeto de la clase Alumno con su nombre y apellido
        Alumno ana = new Alumno("Ana", "García");

        //se agregan algunas materias al HashSet del alumno
        ana.agregarUnaMateria(algoritmos); //ana cursó algoritmos
        ana.agregarUnaMateria(paradigmas); //ana cursó paradigmas

        //se crea un objeto de la clase Inscripcion con el alumno y la materia
        Inscripcion inscripcionAMateria3 = new Inscripcion(ana, diseño); //ana se quiere inscribir a diseño

        //se muestra el resultado de la inscripción por pantalla
        System.out.println( "Ana se quiere inscribir a Diseño. ¿Es válida la inscripción? " + inscripcionAMateria3.esValida()); //debería mostrar true, porque ana tiene algoritmos y paradigmas
    }
}