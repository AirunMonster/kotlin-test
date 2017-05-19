package proyectokotlin.ejemplo.app.morales.nuria.myapplication;

/**
 * Created by Android on 04/05/2017.
 */

public class Persona {
    private int edad;

    Persona(int edad){
        this.edad = edad;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public int getEdad () {
        return this.edad;
    }
}
