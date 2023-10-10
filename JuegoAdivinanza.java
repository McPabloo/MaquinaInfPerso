import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    private List<Personaje> personajes;
    private Scanner scanner;

    public JuegoAdivinanza() {
        personajes = new ArrayList<>();
        personajes.add(new Personaje("Kratos", "Masculino", "Ficticio", "Videojuegos", null, "Play Station", null, null));
        personajes.add(new Personaje("El Penitente", "Masculino", "Ficticio", "Videojuegos", null, "Play Station", null, null));
        personajes.add(new Personaje("Calamardo", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Caricaturas"));
        personajes.add(new Personaje("Lucifugio", "Masculino", "Ficticio", "Mitología", null, null, null, null));
        personajes.add(new Personaje("Da Vinci", "Masculino", "Real", "Artista", null, null, "Pintor", null));
        personajes.add(new Personaje("Beelzeebub", "Masculino", "Ficticio", "Mitología", null, null, null, null));
        personajes.add(new Personaje("Batman", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Superhéroe"));
        personajes.add(new Personaje("Cristiano Ronaldo", "Masculino", "Real", "Deportes", "Futbol", null, null, null));
        personajes.add(new Personaje("Wanda", "Femenino", "Ficticio", "Series y Peliculas", null, null, null, "Superhéroes"));
        personajes.add(new Personaje("Leon S. Kennedy", "Masculino", "Ficticio", "Videojuegos", null, "Play Station", null, null));
        personajes.add(new Personaje("Gohan", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Anime"));
        personajes.add(new Personaje("Karely Ruiz", "Femenino", "Real", "Artista", null, null, "Cantante", null));
        personajes.add(new Personaje("Dr. Simmi", "Masculino", "Real", "Marca", null, "Farmacia", null, null));
        personajes.add(new Personaje("El Tigre Toño", "Masculino", "Ficticio", "Marca", null, "Comida", null, null));
        personajes.add(new Personaje("Triple H", "Masculino", "Real", "Series y Peliculas", null, null, null, "Luchador"));
        personajes.add(new Personaje("Miguel Coco", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Animación"));
        personajes.add(new Personaje("Yoshi", "Masculino", "Ficticio", "Videojuegos", null, "Nintendo", null, null));
        personajes.add(new Personaje("Michael Jackson", "Masculino", "Real", "Artista", null, null, "Cantante", null));
        personajes.add(new Personaje("Fredie Mercury", "Masculino", "Real", "Artista", null, null, "Cantante", null));
        personajes.add(new Personaje("Chicharito", "Masculino", "Real", "Deportes", "Futbol", null, null, null));
        personajes.add(new Personaje("Checo Perez", "Masculino", "Real", "Deportes", "Carreras", null, null, null));
        personajes.add(new Personaje("Spiderman", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Superhéroe"));
        personajes.add(new Personaje("Juan Escutia", "Masculino", "Real", "Historia", null, null, null, null));
        personajes.add(new Personaje("Mama Coco", "Femenino", "Ficticio", "Series y Peliculas", null, null, null, "Animación"));
        personajes.add(new Personaje("Luis Miguel", "Masculino", "Real", "Artista", null, null, "Cantante", null));
        personajes.add(new Personaje("Wario", "Masculino", "Ficticio", "Videojuegos", null, "Nintendo", null, null));
        personajes.add(new Personaje("Seita", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Anime"));
        personajes.add(new Personaje("Mulan", "Femenino", "Ficticio", "Series y Peliculas", null, null, null, "Animación"));
        personajes.add(new Personaje("Andy", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Animación"));
        personajes.add(new Personaje("La Mole", "Masculino", "Real", "Artista", null, null, "Comediante", null));
        personajes.add(new Personaje("Dr. Strange", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Superhéroe"));
        personajes.add(new Personaje("Patricio Estrella", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Caricaturas"));
        personajes.add(new Personaje("Come Galletas", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Caricaturas"));
        personajes.add(new Personaje("Etzio", "Masculino", "Ficticio", "Videojuegos", null, "Play Station", null, null));
        personajes.add(new Personaje("Junior H", "Masculino", "Real", "Artista", null, null, "Cantante", null));
        personajes.add(new Personaje("Sonic", "Masculino", "Ficticio", "Videojuegos", null, "Sega", null, null));
        personajes.add(new Personaje("Naruto", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Anime"));
        personajes.add(new Personaje("Cosmo", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Caricaturas"));
        personajes.add(new Personaje("Bambi", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Animación"));
        personajes.add(new Personaje("Lucy", "Femenino", "Ficticio", "Series y Peliculas", null, null, null, "Caricaturas"));
        personajes.add(new Personaje("Dinosaurio de Google", "Masculino", "Ficticio", "Videojuegos", null, "Google", null, null));
        personajes.add(new Personaje("Cheems", "Masculino", "Real", "Artista", null, null, "Meme", null));
        personajes.add(new Personaje("Franco Escamilla", "Masculino", "Real", "Artista", null, null, "Comediante", null));
        personajes.add(new Personaje("Luffy", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Anime"));
        personajes.add(new Personaje("Mr. Beats", "Masculino", "Real", "Artista", null, null, "Productor", null));
        personajes.add(new Personaje("AMLO", "Masculino", "Real", "Artista", null, null, "Meme", null));
        personajes.add(new Personaje("Mario", "Masculino", "Ficticio", "Videojuegos", null, "Nintendo", null, null));
        personajes.add(new Personaje("Napoleon", "Masculino", "Real", "Historia", null, null, null, null));
        personajes.add(new Personaje("Hittler", "Masculino", "Real", "Historia", null, null, null, null));
        personajes.add(new Personaje("Goku", "Masculino", "Ficticio", "Series y Peliculas", null, null, null, "Anime"));
        personajes.add(new Personaje("Leonel Messi", "Masculino", "Real", "Deportes", "Futbol", null, null, null));        



        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        JuegoAdivinanza juego = new JuegoAdivinanza();
        juego.iniciarJuego();
    }

    public void iniciarJuego() {
        System.out.println("¡Bienvenido al juego de adivinanza de personajes!");
        System.out.println("Piensa en un personaje y yo trataré de adivinarlo.");
        System.out.println("Por favor, responde las siguientes preguntas con 'si' o 'no'.");
    
        List<Personaje> personajesRestantes = new ArrayList<>(personajes);
    
        // Primera pregunta
        if (!realizarPregunta("¿Tu personaje es masculino?")) {
            personajesRestantes = filtrarPersonajes(personajesRestantes, "Masculino", false, false);
            for (Personaje personaje : personajesRestantes) {
                System.out.println(personaje.getNombre());
            }
        } else {
            personajesRestantes = filtrarPersonajes(personajesRestantes, "Masculino", true, false);
            for (Personaje personaje : personajesRestantes) {
                System.out.println(personaje.getNombre());
            }
        }
    
        // Segunda pregunta
        if (!personajesRestantes.isEmpty() && !realizarPregunta("¿Tu personaje es real?")) {
            personajesRestantes = filtrarPersonajes(personajesRestantes, "Real", false, false);
            for (Personaje personaje : personajesRestantes) {
                System.out.println(personaje.getNombre());
            }
        } else if (!personajesRestantes.isEmpty()) {
            personajesRestantes = filtrarPersonajes(personajesRestantes, "Real", true, false);
            for (Personaje personaje : personajesRestantes) {
                System.out.println(personaje.getNombre());
            }
        }
    
        // Tercera pregunta
        if (!personajesRestantes.isEmpty() && !realizarPregunta("¿Tu personaje es de videojuegos?")) {
            if (!realizarPregunta("¿Tu personaje es de series o películas?")) {
                if (!realizarPregunta("¿Tu personaje es de deportes?")) {
                    // Si el usuario respondió "no" a todas las preguntas anteriores,
                    // aquí puedes agregar otra pregunta.
                } else {
                    personajesRestantes = filtrarPersonajes(personajesRestantes, "Deportes", true, false);
                    for (Personaje personaje : personajesRestantes) {
                        System.out.println(personaje.getNombre());
                    }
                }
            } else {
                personajesRestantes = filtrarPersonajes(personajesRestantes, "Series y Peliculas", true, false);
                for (Personaje personaje : personajesRestantes) {
                    System.out.println(personaje.getNombre());
                }
            }
        } else if (!personajesRestantes.isEmpty()) {
            personajesRestantes = filtrarPersonajes(personajesRestantes, "Videojuegos", true, false);
            for (Personaje personaje : personajesRestantes) {
                System.out.println(personaje.getNombre());
            }
        }
    
        /* 
        if (personajesRestantes.isEmpty()) {
            System.out.println("No puedo adivinar tu personaje. ¡Has ganado!");
        } else {
            Personaje personajeAdivinado = personajesRestantes.get(new Random().nextInt(personajesRestantes.size()));
            System.out.println("¡Adiviné! Tu personaje es:");
            System.out.println(personajeAdivinado);
        }
        */

    }    

    private boolean realizarPregunta(String pregunta) {
        System.out.println(pregunta);
        String respuesta = scanner.nextLine().toLowerCase();
        return respuesta.equals("si");
    }

    private List<Personaje> filtrarPersonajes(List<Personaje> personajes, String atributo, boolean valor, boolean adivinar) {
        List<Personaje> personajesFiltrados = new ArrayList<>();
    
        for (Personaje personaje : personajes) {
            // Ejemplo de filtrado para el atributo "Masculino":
            if (atributo.equals("Masculino")) {
                if (valor && personaje.getGenero().equalsIgnoreCase("Masculino")) {
                    personajesFiltrados.add(personaje);
                } else if (!valor && !personaje.getGenero().equalsIgnoreCase("Masculino")) {
                    personajesFiltrados.add(personaje);
                }
            }
    
            // Agregar filtrado para el atributo "Real" si adivinar es true:
            if (atributo.equals("Real")) {
                if (valor && personaje.getTipo().equalsIgnoreCase("Real")) {
                    personajesFiltrados.add(personaje);
                } else if (!valor && !personaje.getTipo().equalsIgnoreCase("Real")) {
                    personajesFiltrados.add(personaje);
                }
            }
            
            // Agregar filtrado para el atributo "Videojuegos" si adivinar es true:
            if (atributo.equals("Videojuegos")) {
                if (valor && personaje.getDescripcion().equalsIgnoreCase("Videojuegos")) {
                    personajesFiltrados.add(personaje);
                }
            }

            // Agregar filtrado para el atributo "Series y Peliculas" si adivinar es true:
            if (atributo.equals("Series y Peliculas")) {
                if (valor && personaje.getDescripcion().equalsIgnoreCase("Series y Peliculas")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Deportes" si adivinar es true:
            if (atributo.equals("Deportes")) {
                if (valor && personaje.getDescripcion().equalsIgnoreCase("Deportes")) {
                    personajesFiltrados.add(personaje);
                } 
            }
        }
    
        return personajesFiltrados;
    }
    
    
}

