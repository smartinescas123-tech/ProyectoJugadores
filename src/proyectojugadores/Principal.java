package proyectojugadores;

/**
 * Clase principal del proyecto. Aquí se instancian los objetos de la
 * superclase Jugador y de sus tres subclases (Delantero, Defensa, Portero),
 * utilizando distintos constructores según la información disponible en
 * cada escenario simulado.
 */
public class Principal {

    public static void main(String[] args) {

        System.out.println("=== JUGADORES GENERALES (superclase Jugador) ===");

        // Se usa el constructor vacío porque este jugador acaba de llegar
        // al club y todavía no se han registrado sus datos físicos.
        Jugador jugadorSinDatos = new Jugador();

        // Se usa el constructor de 4 parámetros (completo) porque ya se
        // cuenta con la ficha física y de titularidad de este jugador.
        Jugador jugadorCompleto = new Jugador("Andres Cabrera", 29, 1.78, true);

        System.out.println(jugadorSinDatos);
        System.out.println(jugadorCompleto);

        System.out.println("\n=== DELANTEROS ===");

        // Se usa el constructor de 3 parámetros porque solo se conoce
        // el nombre, la edad y los goles anotados en la temporada pasada.
        Delantero delantero1 = new Delantero("Sebastian Rios", 22, 15);

        // Se usa el constructor de 4 parámetros porque además del dato
        // goleador ya se sabe con qué pierna define mejor el jugador.
        Delantero delantero2 = new Delantero("Camilo Torres", 26, 20, "Izquierdo");

        // Se usa el constructor completo porque este delantero es titular
        // indiscutido y capitán del equipo, y se tiene toda su ficha.
        Delantero delantero3 = new Delantero("Julian Mora", 30, 1.82, true,
                34, 0.9, "Derecho", true);

        System.out.println(delantero1);
        System.out.println(delantero2);
        System.out.println(delantero3);

        System.out.println("\n=== DEFENSAS ===");

        // Se usa el constructor de 3 parámetros porque solo se tiene el
        // reporte parcial de barridas exitosas de este jugador.
        Defensa defensa1 = new Defensa("Kevin Salazar", 24, 40);

        // Se usa el constructor de 4 parámetros porque ya se definió que
        // este defensa jugará como lateral derecho en el sistema táctico.
        Defensa defensa2 = new Defensa("Nicolas Peña", 27, 55, "Lateral derecho");

        // Se usa el constructor completo porque es el defensa central
        // titular y se conoce toda su ficha física y táctica, incluyendo
        // que además cumple funciones de líbero.
        Defensa defensa3 = new Defensa("David Gomez", 31, 1.85, true,
                62, 10.4, "Central", true);

        System.out.println(defensa1);
        System.out.println(defensa2);
        System.out.println(defensa3);

        System.out.println("\n=== PORTEROS ===");

        // Se usa el constructor de 3 parámetros porque solo se registró
        // rápidamente el número de atajadas tras el último partido.
        Portero portero1 = new Portero("Esteban Villa", 25, 5);

        // Se usa el constructor de 4 parámetros porque ya se calculó el
        // porcentaje de efectividad de este portero en la temporada.
        Portero portero2 = new Portero("Mateo Reyes", 28, 8, 78.5);

        // Se usa el constructor completo porque es el portero titular del
        // equipo y se cuenta con toda su ficha, incluyendo si es de cantera.
        Portero portero3 = new Portero("Simon Duarte", 33, 1.90, true,
                9, 85.2, "Guante profesional", true);

        System.out.println(portero1);
        System.out.println(portero2);
        System.out.println(portero3);
    }
}
