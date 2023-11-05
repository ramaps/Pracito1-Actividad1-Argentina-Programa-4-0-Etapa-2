package PracticoUno;

import java.util.ArrayList;

public class Materia {
    //declaramos los atributos
    private String codigo; // le ponemos un codigo por materia para diferenciar mejor de otros objetos
    private String nombre;
    private ArrayList<Materia> correlativas; //este es el array de las materias correlativas para esta materi

    // creamos el constructor
    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correlativas = new ArrayList<Materia>();
    }

    // declaramos los metodos get y el set

    //con este verificamos si una materia es correlativa de otra
    public void agregarUnaCorrelativa(Materia m) {
        this.correlativas.add(m);
    }

    //
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(ArrayList<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}
