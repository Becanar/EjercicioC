package org.example.ejercicioc;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;
//del b al c he cambiado el tipo de datos ya que no conseguía que al modificar la tabla mostrara los resultados
/**
 * Clase que representa una persona con nombre, apellidos y edad.
 * Esta clase utiliza propiedades de JavaFX para permitir la actualización automática
 * de la interfaz gráfica cuando se cambian los valores de sus atributos.
 */
public class Persona {
    private final StringProperty nombre;
    private final StringProperty apellidos;
    private final IntegerProperty edad;
    /**
     * Constructor de la clase Persona.
     *
     * @param nombre    El nombre de la persona.
     * @param apellidos Los apellidos de la persona.
     * @param edad      La edad de la persona.
     */
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = new SimpleStringProperty(nombre);
        this.apellidos = new SimpleStringProperty(apellidos);
        this.edad = new SimpleIntegerProperty(edad);
    }
    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre.get();
    }
    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }
    /**
     * Devuelve la propiedad de nombre.
     *
     * @return La propiedad de nombre.
     */
    public StringProperty nombreProperty() {
        return nombre;
    }
    /**
     * Obtiene los apellidos de la persona.
     *
     * @return Los apellidos de la persona.
     */
    public String getApellidos() {
        return apellidos.get();
    }
    /**
     * Establece los apellidos de la persona.
     *
     * @param apellidos Los nuevos apellidos de la persona.
     */
    public void setApellidos(String apellidos) {
        this.apellidos.set(apellidos);
    }
    /**
     * Devuelve la propiedad de apellidos.
     *
     * @return La propiedad de apellidos.
     */
    public StringProperty apellidosProperty() {
        return apellidos;
    }
    /**
     * Obtiene la edad de la persona.
     *
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad.get();
    }
    /**
     * Establece la edad de la persona.
     *
     * @param edad La nueva edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad.set(edad);
    }

    /**
     * Devuelve la propiedad de edad.
     *
     * @return La propiedad de edad.
     */
    public IntegerProperty edadProperty() {
        return edad;
    }
    /**
     * Compara esta persona con otra para determinar si son iguales.
     * Dos personas se consideran iguales si tienen el mismo nombre, apellidos y edad.
     *
     * @param obj El objeto con el que se va a comparar.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return getNombre().equals(persona.getNombre()) &&
                getApellidos().equals(persona.getApellidos()) &&
                getEdad() == persona.getEdad();
    }
}