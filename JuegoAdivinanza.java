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
        personajes.add(new Personaje("Karely Ruiz", "Femenino", "Real", "Artista", null, null, "Productor", null));
        personajes.add(new Personaje("Dr. Simmi", "Masculino", "Ficticio", "Marca", null, "Farmacia", null, null));
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
        if (!realizarPregunta("¿Tu personaje es masculino? (Aunque sea una botarga, o un personaje ficticio tiene un género pa)")) {
            personajesRestantes = filtrarPersonajes(personajesRestantes, "Masculino", false, false);
            
        } else {
            personajesRestantes = filtrarPersonajes(personajesRestantes, "Masculino", true, false);
            
        }
    
        // Segunda pregunta
        if (!personajesRestantes.isEmpty() && !realizarPregunta("¿Tu personaje es real?")) {
            personajesRestantes = filtrarPersonajes(personajesRestantes, "Real", false, false);
            
        } else if (!personajesRestantes.isEmpty()) {
            personajesRestantes = filtrarPersonajes(personajesRestantes, "Real", true, false);
            
        }
    
        // Tercera pregunta
        if (!personajesRestantes.isEmpty() && !realizarPregunta("¿Tu personaje es de videojuegos? (No incluye mugens ni proyectos de código abierto, y ten en cuenta que los personajes históricos, o que aprecen en filmes no entran en esta actegoríasi)")) {
            if (!realizarPregunta("¿Tu personaje aperece mayormente en series o películas?")) {
                if (!realizarPregunta("¿Tu personaje es deportista profesional?")) {
                    if (!realizarPregunta("¿Tu personaje es un artista?")) {
                            if (!realizarPregunta("¿Tu personaje es la imagen de una marca?")) {
                                if (!realizarPregunta("¿Tu personaje es un personaje histórico?")) {
                                    if (!realizarPregunta("¿Tu personaje es un personaje mitológico?")) {
                                        System.out.println("No me lo sé jaja");
                                    } else {
                                        personajesRestantes = filtrarPersonajes(personajesRestantes, "Mitología", true, false);
                                        
                                    }
                                } else {
                                    personajesRestantes = filtrarPersonajes(personajesRestantes, "Historia", true, false);
                                    
                                }
                            } else {
                                personajesRestantes = filtrarPersonajes(personajesRestantes, "Marca", true, false);
                                
                            }
                    } else {
                        personajesRestantes = filtrarPersonajes(personajesRestantes, "Artista", true, false);
                        
                        if (!realizarPregunta("¿Tu personaje es Cantante?")) {
                            if (!realizarPregunta("¿Tu personaje es Comediante?")) {
                                if (!realizarPregunta("¿Tu personaje es Pintor?")) {
                                    if (!realizarPregunta("¿Tu personaje es Productor/Youtuber?")) {
                                        System.out.println("No puedo adivinar:(");
                                    } else {
                                        personajesRestantes = filtrarPersonajes(personajesRestantes, "Productor", true, false);
                                        
                                    }
                                } else {
                                    personajesRestantes = filtrarPersonajes(personajesRestantes, "Pintor", true, false);
                                    
                                }
                            } else {
                                personajesRestantes = filtrarPersonajes(personajesRestantes, "Comediante", true, false);
                                
                            }
                        } else {
                            personajesRestantes = filtrarPersonajes(personajesRestantes, "Cantante", true, false);
                            
                        }
                    }
                } else {
                    personajesRestantes = filtrarPersonajes(personajesRestantes, "Deportes", true, false);
                    
                    if (!realizarPregunta("¿Tu personaje juega Futbol profesional?")) {
                        if (!realizarPregunta("¿Tu personaje corre carreras de forma profesional?")) {
                            System.out.println("No puedo adivinar:(");
                        } else {
                            personajesRestantes = filtrarPersonajes(personajesRestantes, "Carreras", true, false);
                            
                        }
                    } else {
                        personajesRestantes = filtrarPersonajes(personajesRestantes, "Futbol", true, false);
                        
                    }
                }
            } else {
                personajesRestantes = filtrarPersonajes(personajesRestantes, "Series y Peliculas", true, false);
                
                if (!realizarPregunta("¿Tu personaje es de Anime?")) {
                    if (!realizarPregunta("¿Tu personaje es de Animación?")) {
                        if (!realizarPregunta("¿Tu personaje es de Caricaturas?")) {
                            if (!realizarPregunta("¿Tu personaje es Luchador?")) {
                                if (!realizarPregunta("¿Tu personaje es un Superhéroe?")) {
                                    System.out.println("No puedo adivinar:(");
                                } else {
                                    personajesRestantes = filtrarPersonajes(personajesRestantes, "Superhéroe", true, false);
                                    
                                }
                            } else {
                                personajesRestantes = filtrarPersonajes(personajesRestantes, "Luchador", true, false);
                                
                            }
                        } else {
                            personajesRestantes = filtrarPersonajes(personajesRestantes, "Caricaturas", true, false);
                            
                        }
                    } else {
                        personajesRestantes = filtrarPersonajes(personajesRestantes, "Animación", true, false);
                        
                    }
                } else {
                    personajesRestantes = filtrarPersonajes(personajesRestantes, "Anime", true, false);
                    
                }
            }
        } else if (!personajesRestantes.isEmpty()) {
            personajesRestantes = filtrarPersonajes(personajesRestantes, "Videojuegos", true, false);
            
                    if (!realizarPregunta("¿Tu personaje es de la Marca Nintendo?")) {
                         //En caso de responder "no", pregunta otra cosa
                        if (!realizarPregunta("¿Tu personaje es de la Marca Play Station?")) {
                             //En caso de responder "no", pregunta otra cosa
                            if (!realizarPregunta("¿Tu personaje es la imagen de una marca de comida?")) {
                                 //En caso de responder "no", pregunta otra cosa
                                if (!realizarPregunta("¿Tu personaje es la imagen de una Farmacia?")) {
                                     //En caso de responder "no", pregunta otra cosa
                                    if (!realizarPregunta("¿Tu personaje es de la Marca Sega?")) {
                                        System.out.println("No puedo adivinar:(");
                                    } else {
                                        personajesRestantes = filtrarPersonajes(personajesRestantes, "Sega", true, false);
                                        
                                    }
                                } else {
                                    personajesRestantes = filtrarPersonajes(personajesRestantes, "Farmacia", true, false);
                                    
                                }
                            } else {
                                personajesRestantes = filtrarPersonajes(personajesRestantes, "Comida", true, false);
                                
                            }
                        } else {
                            personajesRestantes = filtrarPersonajes(personajesRestantes, "Play Station", true, false);
                            
                        }
                    } else {
                        personajesRestantes = filtrarPersonajes(personajesRestantes, "Nintendo", true, false);
                        
                    }
        }
        
        
        if (personajesRestantes.isEmpty()) {
            System.out.println("No puedo adivinar tu personaje. ¡Has ganado!");
        } else if (personajesRestantes.size() == 1) {
            Personaje personajeAdivinado = personajesRestantes.get(new Random().nextInt(personajesRestantes.size()));
            System.out.println("¡Adiviné! Tu personaje es:");
            System.out.println(personajeAdivinado.getNombre());
        } else if (personajesRestantes.size() >= 1) {
            boolean adivinado = false;
        
            do {
                Personaje personajeAdivinado = personajesRestantes.get(new Random().nextInt(personajesRestantes.size()));
                System.out.println("¿Tu personaje es " + personajeAdivinado.getNombre() + "? (si/no)");
                String respuesta = scanner.nextLine();
        
                if (respuesta.equalsIgnoreCase("si")) {
                    System.out.println("¡Adiviné! Tu personaje es " + personajeAdivinado.getNombre());
                    adivinado = true;
                } else {
                    personajesRestantes.remove(personajeAdivinado);
                }
            } while (!adivinado && !personajesRestantes.isEmpty());
        }
        
        
        
        

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

            // Agregar filtrado para el atributo "Historia" si adivinar es true:
            if (atributo.equals("Historia")) {
                if (valor && personaje.getDescripcion().equalsIgnoreCase("Historia")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Mitología" si adivinar es true:
            if (atributo.equals("Mitología")) {
                if (valor && personaje.getDescripcion().equalsIgnoreCase("Mitología")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Marca" si adivinar es true:
            if (atributo.equals("Marca")) {
                if (valor && personaje.getDescripcion().equalsIgnoreCase("Marca")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Deportes" si adivinar es true:
            if (atributo.equals("Deportes")) {
                if (valor && personaje.getDescripcion().equalsIgnoreCase("Deportes")) {
                    personajesFiltrados.add(personaje);
                } 
            }

             // Agregar filtrado para el atributo "Artista" si adivinar es true:
            if (atributo.equals("Artista")) {
                if (valor && personaje.getDescripcion().equalsIgnoreCase("Artista")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Nintendo" si adivinar es true:
            if (atributo.equals("Nintendo")) {
                if (valor && personaje.getMarca().equalsIgnoreCase("Nintendo")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Nintendo" si adivinar es true:
            if (atributo.equals("Play Station")) {
                if (valor && personaje.getMarca().equalsIgnoreCase("Play Station")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Nintendo" si adivinar es true:
            if (atributo.equals("Comida")) {
                if (valor && personaje.getMarca().equalsIgnoreCase("Comida")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Nintendo" si adivinar es true:
            if (atributo.equals("Farmacia")) {
                if (valor && personaje.getMarca().equalsIgnoreCase("Farmacia")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Nintendo" si adivinar es true:
            if (atributo.equals("Sega")) {
                if (valor && personaje.getMarca().equalsIgnoreCase("Sega")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Futbol" si adivinar es true:
            if (atributo.equals("Futbol")) {
                if (valor && personaje.getDeporte().equalsIgnoreCase("Futbol")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            // Agregar filtrado para el atributo "Carreras" si adivinar es true:
            if (atributo.equals("Carreras")) {
                if (valor && personaje.getDeporte().equalsIgnoreCase("Carreras")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            if (atributo.equals("Comediante")) {
                if (valor && personaje.getTipoArtista().equalsIgnoreCase("Comediante")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            if (atributo.equals("Cantante")) {
                if (valor && personaje.getTipoArtista().equalsIgnoreCase("Cantante")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            if (atributo.equals("Pintor")) {
                if (valor && personaje.getTipoArtista().equalsIgnoreCase("Pintor")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            if (atributo.equals("Productor")) {
                if (valor && personaje.getTipoArtista().equalsIgnoreCase("Productor")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            if (atributo.equals("Caricaturas")) {
                if (valor && personaje.getTipoEntretenimiento().equalsIgnoreCase("Caricaturas")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            if (atributo.equals("Anime")) {
                if (valor && personaje.getTipoEntretenimiento().equalsIgnoreCase("Anime")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            if (atributo.equals("Animación")) {
                if (valor && personaje.getTipoEntretenimiento().equalsIgnoreCase("Animación")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            if (atributo.equals("Luchador")) {
                if (valor && personaje.getTipoEntretenimiento().equalsIgnoreCase("Luchador")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            if (atributo.equals("Superhéroe")) {
                if (valor && personaje.getTipoEntretenimiento().equalsIgnoreCase("Superhéroe")) {
                    personajesFiltrados.add(personaje);
                } 
            }

            
        }
    
        return personajesFiltrados;
    }
   
}
