package proyectojugadores;

/**
 * Subclase que representa a un jugador especializado en la posición de
 * portero (arquero). Hereda los datos generales de Jugador y añade
 * información propia del rol de guardameta.
 */
public class Portero extends Jugador {

    // 4 atributos propios adicionales, de tipos diferentes entre sí
    private int atajadas;
    private double porcentajeAtajadasEfectivas;
    private String tipoGuante;
    private boolean vieneDeCantera;

    /**
     * Constructor 1: nombre, edad y número de atajadas.
     * Se usa cuando solo se tiene el dato estadístico principal de un portero
     * (por ejemplo, al registrarlo rápidamente tras un partido).
     * Invoca explícitamente el constructor de 2 parámetros de la superclase.
     */
    public Portero(String nombre, int edad, int atajadas) {
        super(nombre, edad);
        this.atajadas = atajadas;
        this.porcentajeAtajadasEfectivas = 0.0;
        this.tipoGuante = "Estándar";
        this.vieneDeCantera = false;
    }

    /**
     * Constructor 2: nombre, edad, atajadas y porcentaje de efectividad.
     * Se usa cuando ya se calculó el rendimiento porcentual del portero
     * en la temporada. Invoca explícitamente el constructor de 2 parámetros
     * de la superclase.
     */
    public Portero(String nombre, int edad, int atajadas, double porcentajeAtajadasEfectivas) {
        super(nombre, edad);
        this.atajadas = atajadas;
        this.porcentajeAtajadasEfectivas = porcentajeAtajadasEfectivas;
        this.tipoGuante = "Estándar";
        this.vieneDeCantera = false;
    }

    /**
     * Constructor 3: completo, con todos los atributos heredados y propios.
     * Se usa cuando se tiene la ficha completa del portero titular del equipo.
     * Invoca explícitamente el constructor completo (4 parámetros) de la superclase.
     */
    public Portero(String nombre, int edad, double estatura, boolean esTitular,
                    int atajadas, double porcentajeAtajadasEfectivas,
                    String tipoGuante, boolean vieneDeCantera) {
        super(nombre, edad, estatura, esTitular);
        this.atajadas = atajadas;
        this.porcentajeAtajadasEfectivas = porcentajeAtajadasEfectivas;
        this.tipoGuante = tipoGuante;
        this.vieneDeCantera = vieneDeCantera;
    }

    // Getters y setters
    public int getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(int atajadas) {
        this.atajadas = atajadas;
    }

    public double getPorcentajeAtajadasEfectivas() {
        return porcentajeAtajadasEfectivas;
    }

    public void setPorcentajeAtajadasEfectivas(double porcentajeAtajadasEfectivas) {
        this.porcentajeAtajadasEfectivas = porcentajeAtajadasEfectivas;
    }

    public String getTipoGuante() {
        return tipoGuante;
    }

    public void setTipoGuante(String tipoGuante) {
        this.tipoGuante = tipoGuante;
    }

    public boolean isVieneDeCantera() {
        return vieneDeCantera;
    }

    public void setVieneDeCantera(boolean vieneDeCantera) {
        this.vieneDeCantera = vieneDeCantera;
    }

    @Override
    public String toString() {
        return "[Portero] " + super.toString()
                + " | Atajadas: " + atajadas
                + " | Efectividad: " + porcentajeAtajadasEfectivas + "%"
                + " | Guante: " + tipoGuante
                + " | De cantera: " + (vieneDeCantera ? "Sí" : "No");
    }
}
