package controlador;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gjche
 */
public class CartasVistaController implements Initializable {

    @FXML
    private StackPane stpCharizard;
    @FXML
    private AnchorPane anpFrame;
    @FXML
    private ImageView imgFondoSelect;
    @FXML
    private ImageView imgCharizard;
    @FXML
    private Label lblCharizard;
    @FXML
    private ProgressBar barVida;
    @FXML
    private Label lblAtaque;
    @FXML
    private Label lblDefensa;
    @FXML
    private Label lblAtaqueEspecial;
    @FXML
    private Label lblDefensaEspecial;
    @FXML
    private Label lblVida;
    @FXML
    private StackPane stpBlaziken;
    @FXML
    private Label lblBlaziken;
    @FXML
    private ProgressBar barVida1;
    @FXML
    private ImageView imgBlaziken;
    @FXML
    private Label lblAtaque1;
    @FXML
    private Label lblDefensa1;
    @FXML
    private Label lblAtaqueEspecial1;
    @FXML
    private Label lblDefensaEspecial1;
    @FXML
    private Label lblVida1;
    @FXML
    private StackPane stpVolcarona;
    @FXML
    private Label lblVolcarona;
    @FXML
    private ProgressBar barVida11;
    @FXML
    private ImageView imgVolcarona;
    @FXML
    private Label lblAtaque11;
    @FXML
    private Label lblDefensa11;
    @FXML
    private Label lblAtaqueEspecial11;
    @FXML
    private Label lblDefensaEspecial11;
    @FXML
    private Label lblVida11;
    @FXML
    private StackPane stpArcanine;
    @FXML
    private Label lblArcanine;
    @FXML
    private ProgressBar barVida111;
    @FXML
    private ImageView imgArcanine;
    @FXML
    private Label lblAtaque111;
    @FXML
    private Label lblDefensa111;
    @FXML
    private Label lblAtaqueEspecial111;
    @FXML
    private Label lblDefensaEspecial111;
    @FXML
    private Label lblVida111;
    @FXML
    private StackPane stpGreninja;
    @FXML
    private Label lblGreninja;
    @FXML
    private ProgressBar barVida2;
    @FXML
    private ImageView imgGreninja;
    @FXML
    private Label lblAtaque2;
    @FXML
    private Label lblDefensa2;
    @FXML
    private Label lblAtaqueEspecial2;
    @FXML
    private Label lblDefensaEspecial2;
    @FXML
    private Label lblVida2;
    @FXML
    private StackPane stpEmpoleon;
    @FXML
    private Label lblEmpoleon;
    @FXML
    private ProgressBar barVida21;
    @FXML
    private ImageView imgEmpoleon;
    @FXML
    private Label lblAtaque21;
    @FXML
    private Label lblDefensa21;
    @FXML
    private Label lblAtaqueEspecial21;
    @FXML
    private Label lblDefensaEspecial21;
    @FXML
    private Label lblVida21;
    @FXML
    private ProgressBar barVida211;
    @FXML
    private Label lblAtaque211;
    @FXML
    private Label lblDefensa211;
    @FXML
    private Label lblAtaqueEspecial211;
    @FXML
    private Label lblDefensaEspecial211;
    @FXML
    private Label lblVida211;
    @FXML
    private StackPane stpCloyster;
    @FXML
    private Label lblCloyster;
    @FXML
    private ProgressBar barVida2111;
    @FXML
    private ImageView imgCloyster;
    @FXML
    private Label lblAtaque2111;
    @FXML
    private Label lblDefensa2111;
    @FXML
    private Label lblAtaqueEspecial2111;
    @FXML
    private Label lblDefensaEspecial2111;
    @FXML
    private Label lblVida2111;
    @FXML
    private ProgressBar barVida3;
    @FXML
    private Label lblAtaque3;
    @FXML
    private Label lblDefensa3;
    @FXML
    private Label lblAtaqueEspecial3;
    @FXML
    private Label lblDefensaEspecial3;
    @FXML
    private Label lblVida3;
    @FXML
    private StackPane stpSnorlax;
    @FXML
    private Label lblSnorlax;
    @FXML
    private ImageView imgSnorlax;
    @FXML
    private Label lblSnorlax1;
    @FXML
    private ProgressBar barVida31;
    @FXML
    private Label lblAtaque31;
    @FXML
    private Label lblDefensa31;
    @FXML
    private Label lblAtaqueEspecial31;
    @FXML
    private Label lblDefensaEspecial31;
    @FXML
    private Label lblVida31;
    @FXML
    private StackPane stpStaraptor;
    @FXML
    private ImageView imgStaraptor;
    @FXML
    private StackPane stpMewto;
    @FXML
    private Label lblMewto;
    @FXML
    private ProgressBar barVida311;
    @FXML
    private ImageView imgMewto;
    @FXML
    private Label lblAtaque311;
    @FXML
    private Label lblDefensa311;
    @FXML
    private Label lblAtaqueEspecial311;
    @FXML
    private Label lblDefensaEspecial311;
    @FXML
    private Label lblVida311;
    @FXML
    private StackPane stpBlastoise;
    @FXML
    private Label lblBlastoise;
    @FXML
    private ImageView imgBlastoise;
    @FXML
    private StackPane stpBulbasaur;
    @FXML
    private Label lblBulbasaur;
    @FXML
    private ProgressBar barVida3111;
    @FXML
    private ImageView imgBulbasaur;
    @FXML
    private Label lblAtaque3111;
    @FXML
    private Label lblDefensa3111;
    @FXML
    private Label lblAtaqueEspecial3111;
    @FXML
    private Label lblDefensaEspecial3111;
    @FXML
    private Label lblVida3111;
    @FXML
    private Label lblTitulo;
    @FXML
    private Button btnAgregarPokemon;
    @FXML
    private ScrollPane scrPokedex;
    @FXML
    private ImageView imgPokeball1;
    @FXML
    private ImageView imgPokeball2;
    @FXML
    private ImageView imgPokeball3;
    @FXML
    private ImageView imgPokeball4;

    private int pokemonesAgregados = 0;

    private ImageView[] pokebolas = new ImageView[4];

    private String[] pokemonesEnPokebolas = new String[4];

    private StackPane cartaSeleccionada = null;
    @FXML
    private Label lblPokemonSeleccionado;

    private HashMap<String, String> rutaCartas;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // Inicializamos el HashMap
        rutaCartas = new HashMap<>();

        // Añadimos las relaciones nombre - ruta
        rutaCartas.put("Charizard", "/resources/cartaCharizard.png");
        rutaCartas.put("Blaziken", "/resources/cartaBlaziken.png");
        rutaCartas.put("Greninja", "/resources/cartaGreninja.png");
        rutaCartas.put("Staraptor", "/resources/cartaStaraptor.png");
        rutaCartas.put("Volcarona", "/resources/cartaVolcarona.png");
        rutaCartas.put("Arcanine", "/resources/cartaArcanine.png");
        rutaCartas.put("Cloyster", "/resources/cartaCloyster.png");
        rutaCartas.put("Empoleon", "/resources/cartaEmpoleon.png");
        rutaCartas.put("Blastoise", "/resources/cartaBlastoise.png");
        rutaCartas.put("Bulbasaur", "/resources/cartaBulbasaur.png");
        rutaCartas.put("Snorlax", "/resources/cartaSnorlax.png");
        rutaCartas.put("Mewto", "/resources/cartaMewto.png");

        StackPane[] cartas = {
            stpSnorlax, stpCharizard, stpGreninja, stpStaraptor,
            stpBlaziken, stpEmpoleon, stpMewto, stpVolcarona,
            stpBlastoise, stpBulbasaur, stpArcanine, stpCloyster
        };

        for (int i = 0; i < cartas.length; i++) {
            StackPane carta = cartas[i];
            int delay = i * 500;
            animarEntradaConDelay(carta, delay);
        }

        pokebolas[0] = imgPokeball1;
        pokebolas[1] = imgPokeball2;
        pokebolas[2] = imgPokeball3;
        pokebolas[3] = imgPokeball4;

        cambiarImgPokeball(0, "/resources/openPokeball.png");
    }

    private void cambiarImgPokeball(int index, String imagen) {
        if (index < pokebolas.length) {
            pokebolas[index].setImage(new Image(imagen));
            cambiarImgPokeball(index + 1, imagen);
        }
    }

    private void animarEntradaConDelay(StackPane card, int delayMillis) {
        card.setTranslateY(300);
        card.setOpacity(0);

        // Entrada principal
        TranslateTransition translateIn = new TranslateTransition(Duration.millis(500), card);
        translateIn.setToY(-20); // Pasa un poco hacia arriba (rebote)
        translateIn.setDelay(Duration.millis(delayMillis));
        translateIn.setInterpolator(javafx.animation.Interpolator.EASE_OUT);

        FadeTransition fadeIn = new FadeTransition(Duration.millis(500), card);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.setDelay(Duration.millis(delayMillis));

        // Rebote hacia posición final
        TranslateTransition bounceBack = new TranslateTransition(Duration.millis(200), card);
        bounceBack.setToY(0);
        bounceBack.setInterpolator(javafx.animation.Interpolator.EASE_IN);

        // Al terminar la primera animación, hace el rebote
        translateIn.setOnFinished(e -> bounceBack.play());

        translateIn.play();
        fadeIn.play();
    }

    private void seleccionarCarta(StackPane carta) {
        if (cartaSeleccionada != null) {
            cartaSeleccionada.setStyle("");
        }

        cartaSeleccionada = carta;
        cartaSeleccionada.setStyle("-fx-border-color: gold; -fx-border-width: 3;");

        String nombrePokemon = obtenerNombrePokemon(carta);
        lblPokemonSeleccionado.setText("Pokémon Seleccionado: " + nombrePokemon);
    }

    @FXML
    private void agregarPokemon(ActionEvent event) {
        if (cartaSeleccionada != null) {
            String nombrePokemon = obtenerNombrePokemon(cartaSeleccionada);

            if (pokemonesAgregados < pokebolas.length) {
                pokemonesEnPokebolas[pokemonesAgregados] = nombrePokemon;

                pokebolas[pokemonesAgregados].setImage(new Image("/resources/pokeball.png"));
                pokemonesAgregados++;
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("Ya hay 4 Pokémon agregados.");
                alert.showAndWait();
            }

            // Limpiar la carta seleccionada
            cartaSeleccionada.setStyle("");
            cartaSeleccionada = null;
        }
    }

    private String obtenerNombrePokemon(StackPane carta) {
        if (carta == stpCharizard) {
            return "Charizard";
        } else if (carta == stpBlaziken) {
            return "Blaziken";
        } else if (carta == stpGreninja) {
            return "Greninja";
        } else if (carta == stpStaraptor) {
            return "Staraptor";
        } else if (carta == stpVolcarona) {
            return "Volcarona";
        } else if (carta == stpArcanine) {
            return "Arcanine";
        } else if (carta == stpCloyster) {
            return "Cloyster";
        } else if (carta == stpEmpoleon) {
            return "Empoleon";
        } else if (carta == stpBlastoise) {
            return "Blastoise";
        } else if (carta == stpBulbasaur) {
            return "Bulbasaur";
        } else if (carta == stpSnorlax) {
            return "Snorlax";
        } else if (carta == stpMewto) {
            return "Mewtwo";
        }
        return "Desconocido";  // En caso de que no se encuentre la carta
    }

    private String obtenerNombrePokemonPorPokebola(int index) {
        // Verificar que el índice esté dentro del rango
        if (index >= 0 && index < pokemonesEnPokebolas.length) {
            String nombrePokemon = pokemonesEnPokebolas[index];
            if (nombrePokemon != null) {
                return nombrePokemon;
            }
        }
        return "Desconocido";
    }

    @FXML
    private void selectCharizard(MouseEvent event) {
        seleccionarCarta(stpCharizard);
    }

    @FXML
    private void selectBlaziken(MouseEvent event) {
        seleccionarCarta(stpBlaziken);
    }

    @FXML
    private void selectVolcarona(MouseEvent event) {
        seleccionarCarta(stpVolcarona);

    }

    @FXML
    private void selectArcanine(MouseEvent event) {
        seleccionarCarta(stpArcanine);

    }

    @FXML
    private void selectGreninja(MouseEvent event) {
        seleccionarCarta(stpGreninja);
    }

    @FXML
    private void selectEmpoleon(MouseEvent event) {
        seleccionarCarta(stpEmpoleon);
    }

    @FXML
    private void selectBlastoise(MouseEvent event) {
        seleccionarCarta(stpBlastoise);
    }

    @FXML
    private void selectCloyster(MouseEvent event) {
        seleccionarCarta(stpCloyster);

    }

    @FXML
    private void selectSnorlax(MouseEvent event) {
        seleccionarCarta(stpSnorlax);

    }

    @FXML
    private void selectStaraptor(MouseEvent event) {
        seleccionarCarta(stpStaraptor);

    }

    @FXML
    private void selectMewto(MouseEvent event) {
        seleccionarCarta(stpMewto);
    }

    @FXML
    private void selectBulbasaur(MouseEvent event) {
        seleccionarCarta(stpBulbasaur);

    }

    @FXML
    private void clickPokebola1(MouseEvent event) {
        mostrarCartaSeleccionada(0);
    }

    @FXML
    private void clickPokebola2(MouseEvent event) {
        mostrarCartaSeleccionada(1);
    }

    @FXML
    private void clickPokebola3(MouseEvent event) {
        mostrarCartaSeleccionada(2);
    }

    @FXML
    private void clickPokebola4(MouseEvent event) {
        mostrarCartaSeleccionada(3);
    }

    private void mostrarCartaSeleccionada(int index) {
        String nombrePokemon = obtenerNombrePokemonPorPokebola(index);

        // Ahora abrir la ventana con el nombre del Pokémon seleccionado
        abrirVentanaCarta(nombrePokemon);
    }

    private void abrirVentanaCarta(String nombrePokemon) {
        try {
            // Verificar si existe la ruta para el Pokémon seleccionado
            String rutaImagen = rutaCartas.get(nombrePokemon);
            if (rutaImagen == null) {
                throw new Exception("No se encontró la ruta de la carta para " + nombrePokemon);
            }

            // Cargar el FXML para la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/PokemonSeleccionado.fxml"));
            AnchorPane root = loader.load();

            // Obtener el controlador de la nueva ventana
            PokemonSeleccionadoController SeleccionController = loader.getController();

            // Mostrar la carta del Pokémon, pasándole el nombre del archivo de la carta
            SeleccionController.mostrarCarta(rutaImagen);

            // Crear y mostrar la nueva escena
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Carta de Pokémon");
            stage.show();
        } catch (Exception e) {
            // Mostrar alerta si ocurre un error
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error al abrir la ventana");
            alert.setContentText("Hubo un problema al cargar la carta del Pokémon: " + e.getMessage());
            alert.showAndWait();

            e.printStackTrace();
        }
    }

}
