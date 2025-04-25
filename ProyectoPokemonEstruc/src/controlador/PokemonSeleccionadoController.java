package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PokemonSeleccionadoController implements Initializable {

    @FXML
    private ImageView imgCarta; 
    @FXML
    private ImageView imgFondoSeleccion;
    @FXML
    private Button btnVolver;
    @FXML
    private Label lblPokemonSelecc;

    public void mostrarCarta(String rutaImagen, String nombre) {
    try {
        if (rutaImagen == null || rutaImagen.isEmpty()) {
            throw new IllegalArgumentException("La ruta de la imagen no puede ser nula o vacía.");
        }

        Image image = new Image(getClass().getResource(rutaImagen).toString());
        imgCarta.setImage(image);
        lblPokemonSelecc.setText("Has seleccionado a: " + nombre);
    } catch (Exception e) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error de Carga de Imagen");
        alert.setHeaderText(null);
        alert.setContentText("No se pudo cargar la imagen: " + e.getMessage());
        alert.showAndWait();
    }
}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void volver(MouseEvent event) {
        Stage stage = (Stage) btnVolver.getScene().getWindow();
    stage.close();
    }
}
