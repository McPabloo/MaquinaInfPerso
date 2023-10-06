import java.util.ArrayList;
import java.util.List;

public class ListaPersonajes {
    public static void main(String[] args) {
        
        List<Personaje> personajes = new ArrayList<>();

        personajes.add(new Personaje("Kratos", "Masculino", "Ficticio", "Videojuegos"));
        personajes.add(new Personaje("El Penitente", "Masculino", "Ficticio", "Videojuegos"));
        personajes.add(new Personaje("Calamardo", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Lucifugio", "Masculino", "Ficticio", "Mitología"));
        personajes.add(new Personaje("Da Vinci", "Masculino", "Real", "Artista"));
        personajes.add(new Personaje("Beelzeebub", "Masculino", "Ficticio", "Mitología"));
        personajes.add(new Personaje("Batman", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Cristiano Ronaldo", "Masculino", "Real", "Deportes"));
        personajes.add(new Personaje("Wanda", "Femenino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Leon S. Kennedy", "Masculino", "Ficticio", "Videojuegos"));
        personajes.add(new Personaje("Gohan", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Karely Ruiz", "Femenino", "Real", "Artista"));
        personajes.add(new Personaje("Dr. Simmi", "Masculino", "Real", "Marca"));
        personajes.add(new Personaje("El Tigre Toño", "Masculino", "Ficticio", "Marca"));
        personajes.add(new Personaje("Triple H", "Masculino", "Real", "Series y Peliculas"));
        personajes.add(new Personaje("Miguel Coco", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Yoshi", "Masculino", "Ficticio", "Videojuegos"));
        personajes.add(new Personaje("Michael Jackson", "Masculino", "Real", "Artista"));
        personajes.add(new Personaje("Fredie Mercury", "Masculino", "Real", "Artista"));
        personajes.add(new Personaje("Chicharito", "Masculino", "Real", "Deportes"));
        personajes.add(new Personaje("Checo Perez", "Masculino", "Real", "Deportes"));
        personajes.add(new Personaje("Spiderman", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Juan Escutia", "Masculino", "Real", "Historia"));
        personajes.add(new Personaje("Mama Coco", "Femenino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Luis Miguel", "Masculino", "Real", "Artista"));
        personajes.add(new Personaje("Wario", "Masculino", "Ficticio", "Videojuegos"));
        personajes.add(new Personaje("Seita", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Mulan", "Femenino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Andy", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("La Mole", "Masculino", "Real", "Artista"));
        personajes.add(new Personaje("Dr. Strange", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Patricio Estrella", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Come Galletas", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Etzio", "Masculino", "Ficticio", "Videojuegos"));
        personajes.add(new Personaje("Junior H", "Masculino", "Real", "Artista"));
        personajes.add(new Personaje("Sonic", "Masculino", "Ficticio", "Videojuegos"));
        personajes.add(new Personaje("Naruto", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Cosmo", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Bambi", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Lucy", "Femenino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Dinosaurio de Google", "Masculino", "Ficticio", "Videojuegos"));
        personajes.add(new Personaje("Cheems", "Masculino", "Real", "Artista"));
        personajes.add(new Personaje("Franco Escamilla", "Masculino", "Real", "Artista"));
        personajes.add(new Personaje("Luffy", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Mr. Beats", "Masculino", "Real", "Artista"));
        personajes.add(new Personaje("AMLO", "Masculino", "Real", "Politico"));
        personajes.add(new Personaje("Mario", "Masculino", "Ficticio", "Videojuegos"));
        personajes.add(new Personaje("Napoleon", "Masculino", "Real", "Historia"));
        personajes.add(new Personaje("Hittler", "Masculino", "Real", "Historia"));
        personajes.add(new Personaje("Goku", "Masculino", "Ficticio", "Series y Peliculas"));
        personajes.add(new Personaje("Leonel Messi", "Masculino", "Real", "Deportes"));

        for (Personaje personaje : personajes) {
            if(personaje.getGenero() == "Femenino" && personaje.getTipo() == "Real")
                System.out.println(personaje);
        }
    }
}