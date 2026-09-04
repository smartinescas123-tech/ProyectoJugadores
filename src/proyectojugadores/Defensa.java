package proyectojugadores;

/**
 * Subclase que representa a un jugador especializado en la posición de
 * defensa. Hereda los datos generales de Jugador y añade información
 * propia del rol defensivo.
 */
public class Defensa extends Jugador {

    // 4 atributos propios adicionales, de tipos diferentes entre sí
    private int barridasExitosas;
    private double distanciaRecorridaKm;
    private String posicionEspecifica;
    private boolean esLibero;

    /**
     * Constructor 1: nombre, edad y barridas exitosas.
     * Se usa cuando solo se tiene el dato estadístico básico de recuperación
     * de balón (por ejemplo, un reporte parcial de scouting).
     * Invoca explícitamente el constructor de 2 parámetros de la superclase.
     */
    public Defensa(String nombre, int edad, int barridasExitosas) {
        super(nombre, edad);
        this.barridasExitosas = barridasExitosas;
        this.distanciaRecorridaKm = 0.0;
        this.posicionEspecifica = "Central";
        this.esLibero = false;
    }

    /**
     * Constructor 2: nombre, edad, barridas exitosas y posición específica.
     * Se usa cuando ya se sabe si el defensa juega como central, lateral, etc.
     * Invoca explícitamente el constructor de 2 parámetros de la superclase.
     */
    public Defensa(String nombre, int edad, int barridasExitosas, String posicionEspecifica) {
        super(nombre, edad);
        this.barridasExitosas = barridasExitosas;
        this.distanciaRecorridaKm = 0.0;
        this.posicionEspecifica = posicionEspecifica;
        this.esLibero = false;
    }

    /**
     * Constructor 3: completo, con todos los atributos heredados y propios.
     * Se usa cuando se tiene la ficha física y táctica completa del defensa titular.
     * Invoca explícitamente el constructor completo (4 parámetros) de la superclase.
     */
    public Defensa(String nombre, int edad, double estatura, boolean esTitular,
                    int barridasExitosas, double distanciaRecorridaKm,
                    String posicionEspecifica, boolean esLibero) {
        super(nombre, edad, estatura, esTitular);
        this.barridasExitosas = barridasExitosas;
        this.distanciaRecorridaKm = distanciaRecorridaKm;
        this.posicionEspecifica = posicionEspecifica;
        this.esLibero = esLibero;
    }

    // Getters y setters
    public int getBarridasExitosas() {
        return barridasExitosas;
    }

    public void setBarridasExitosas(int barridasExitosas) {
        this.barridasExitosas = barridasExitosas;
    }

    public double getDistanciaRecorridaKm() {
        return distanciaRecorridaKm;
    }

    public void setDistanciaRecorridaKm(double distanciaRecorridaKm) {
        this.distanciaRecorridaKm = distanciaRecorridaKm;
    }

    public String getPosicionEspecifica() {
        return posicionEspecifica;
    }

    public void setPosicionEspecifica(String posicionEspecifica) {
        this.posicionEspecifica = posicionEspecifica;
    }

    public boolean isEsLibero() {
        return esLibero;
    }

    public void setEsLibero(boolean esLibero) {
        this.esLibero = esLibero;
    }

    @Override
    public String toString() {
        return "[Defensa] " + super.toString()
                + " | Barridas exitosas: " + barridasExitosas
                + " | Distancia recorrida: " + distanciaRecorridaKm + "km"
                + " | Posicion: " + posicionEspecifica
                + " | Líbero: " + (esLibero ? "Si" : "No");
    }
}
