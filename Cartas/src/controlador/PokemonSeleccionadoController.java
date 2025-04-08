package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;

public class PokemonSeleccionadoController implements Initializable {

    @FXML
    private ImageView imgCarta; // Asegúrate de que tengas un ImageView para mostrar la carta.

    // Método para mostrar la carta del Pokémon
    public void mostrarCarta(String rutaImagen) {
        try {
            // Validar que la ruta de la imagen no sea nula o vacía
            if (rutaImagen == null || rutaImagen.isEmpty()) {
                throw new IllegalArgumentException("La ruta de la imagen no puede ser nula o vacía.");
            }
            
            // Intentar cargar la imagen desde la ruta proporcionada
            Image image = new Image(getClass().getResource(rutaImagen).toString());
            imgCarta.setImage(image);
        } catch (Exception e) {
            // Mostrar un alerta si ocurre un error al cargar la imagen
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de Carga de Imagen");
            alert.setHeaderText(null);
            alert.setContentText("No se pudo cargar la imagen: " + e.getMessage());
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Inicialización adicional si fuera necesario en el futuro
    }
}
