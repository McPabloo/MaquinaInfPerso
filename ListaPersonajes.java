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
        personajes.add(new Personaje("Juan Escutia", "Masculino", "Real", "Histora"));
        personajes.add(new Personaje("Mama Coco", "Femenino", "Ficticio", "Series y Peliculas"));


        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }
    }
}