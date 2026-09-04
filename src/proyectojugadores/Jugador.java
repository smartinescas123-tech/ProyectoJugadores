package proyectojugadores;

/**
 * Superclase que representa el concepto general de un jugador de fútbol/futsal.
 * Contiene los atributos y comportamientos comunes a cualquier tipo de jugador,
 * sin importar la posición específica que ocupe en la cancha.
 */
public class Jugador {

    // 4 atributos de tipos diferentes entre sí
    private String nombre;
    private int edad;
    private double estatura;
    private boolean esTitular;

    /**
     * Constructor 1: vacío.
     * Se usa cuando aún no se conoce ningún dato del jugador (por ejemplo,
     * un registro que se completará más adelante en el sistema).
     * Reutiliza el constructor de 2 parámetros mediante this(...).
     */
    public Jugador() {
        this("Sin nombre", 0);
    }

    /**
     * Constructor 2: nombre y edad.
     * Se usa cuando en el escenario solo se conocen esos dos datos básicos
     * (por ejemplo, un jugador recién fichado del cual aún no se tiene
     * ficha médica completa). Reutiliza el constructor completo con this(...),
     * asignando valores por defecto razonables a estatura y esTitular.
     */
    public Jugador(String nombre, int edad) {
        this(nombre, edad, 1.70, false);
    }

    /**
     * Constructor 3: completo (nombre, edad, estatura, esTitular).
     * Se usa cuando ya se cuenta con la ficha técnica completa del jugador.
     * Es el constructor "base" que los demás terminan invocando.
     */
    public Jugador(String nombre, int edad, double estatura, boolean esTitular) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.esTitular = esTitular;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean isEsTitular() {
        return esTitular;
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " | Edad: " + edad
                + " | Estatura: " + estatura + "m"
                + " | Titular: " + (esTitular ? "Sí" : "No");
    }
}
