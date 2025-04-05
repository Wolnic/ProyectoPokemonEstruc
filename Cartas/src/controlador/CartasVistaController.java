/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void selectCharizard(MouseEvent event) {
        System.out.println("CHARIZARD");
    }
    
}
