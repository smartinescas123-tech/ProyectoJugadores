package proyectojugadores;

/**
 * Subclase que representa a un jugador especializado en la posición de
 * delantero. Hereda los datos generales de Jugador y añade información
 * propia del rol ofensivo.
 */
public class Delantero extends Jugador {

    // 4 atributos propios adicionales, de tipos diferentes entre sí
    private int golesAnotados;
    private double promedioGolesPorPartido;
    private String pieDominante;
    private boolean esCapitan;

    /**
     * Constructor 1: nombre, edad y goles anotados.
     * Se usa cuando solo se conoce el rendimiento goleador básico del
     * jugador (por ejemplo, al importarlo desde una planilla histórica).
     * Invoca explícitamente el constructor de 2 parámetros de la superclase.
     */
    public Delantero(String nombre, int edad, int golesAnotados) {
        super(nombre, edad);
        this.golesAnotados = golesAnotados;
        this.promedioGolesPorPartido = 0.0;
        this.pieDominante = "Derecho";
        this.esCapitan = false;
    }

    /**
     * Constructor 2: nombre, edad, goles anotados y pie dominante.
     * Se usa cuando además del dato goleador se conoce con qué pierna
     * define mejor el jugador (dato relevante para el cuerpo técnico).
     * Invoca explícitamente el constructor de 2 parámetros de la superclase.
     */
    public Delantero(String nombre, int edad, int golesAnotados, String pieDominante) {
        super(nombre, edad);
        this.golesAnotados = golesAnotados;
        this.promedioGolesPorPartido = 0.0;
        this.pieDominante = pieDominante;
        this.esCapitan = false;
    }

    /**
     * Constructor 3: completo, con todos los atributos heredados y propios.
     * Se usa cuando se tiene la ficha completa del delantero titular,
     * incluyendo si es el capitán del equipo.
     * Invoca explícitamente el constructor completo (4 parámetros) de la superclase.
     */
    public Delantero(String nombre, int edad, double estatura, boolean esTitular,
                      int golesAnotados, double promedioGolesPorPartido,
                      String pieDominante, boolean esCapitan) {
        super(nombre, edad, estatura, esTitular);
        this.golesAnotados = golesAnotados;
        this.promedioGolesPorPartido = promedioGolesPorPartido;
        this.pieDominante = pieDominante;
        this.esCapitan = esCapitan;
    }

    // Getters y setters
    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public double getPromedioGolesPorPartido() {
        return promedioGolesPorPartido;
    }

    public void setPromedioGolesPorPartido(double promedioGolesPorPartido) {
        this.promedioGolesPorPartido = promedioGolesPorPartido;
    }

    public String getPieDominante() {
        return pieDominante;
    }

    public void setPieDominante(String pieDominante) {
        this.pieDominante = pieDominante;
    }

    public boolean isEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    @Override
    public String toString() {
        return "[Delantero] " + super.toString()
                + " | Goles: " + golesAnotados
                + " | Prom. goles/partido: " + promedioGolesPorPartido
                + " | Pie dominante: " + pieDominante
                + " | Capitán: " + (esCapitan ? "Sí" : "No");
    }
}
