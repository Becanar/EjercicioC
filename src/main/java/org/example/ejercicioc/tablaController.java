package org.example.ejercicioc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class tablaController {

    @FXML
    private Button btAgregar;

    @FXML
    private Button btEliminar;

    @FXML
    private Button btModificar;

    @FXML
    private TableColumn<?, ?> columnaApellidos;

    @FXML
    private TableColumn<?, ?> columnaEdad;

    @FXML
    private TableColumn<?, ?> columnaNombre;

    @FXML
    private HBox contenedorBotones;

    @FXML
    private VBox contenedorTabla;

    @FXML
    private Label lblApellidos;

    @FXML
    private Label lblEdad;

    @FXML
    private Label lblNombre;

    @FXML
    private VBox panelDatos;

    @FXML
    private BorderPane panelRoot;

    @FXML
    private TableView<?> tablaVista;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    void agregarPersona(ActionEvent event) {

    }

    @FXML
    void eliminar(ActionEvent event) {

    }

    @FXML
    void modificar(ActionEvent event) {

    }

}
