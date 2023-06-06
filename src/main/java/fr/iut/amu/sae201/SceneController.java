package fr.iut.amu.sae201;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class SceneController {
    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    public void LireCSV() {
        CSVReader read = new CSVReader("/amuhome/a22021019/R202/TPTD2/SAE201/SisFrance_seismes.csv");
        read.Lire();
    }

    @FXML
    private void goToMainMenu(MouseEvent event) throws Exception {
        mainApp.showScene("MainMenu.fxml");
    }
    @FXML
    private void goToDashboard(MouseEvent event) throws Exception {
        mainApp.showScene("Dashboard.fxml");
    }
    @FXML
    private void goToCarte(MouseEvent event) throws Exception {
        mainApp.showScene("Carte.fxml");
    }
    @FXML
    private void goToCSVLoader(MouseEvent event) throws Exception {
        mainApp.showScene("CSVLoader.fxml");
    }

    // Ajoutez d'autres méthodes pour naviguer vers d'autres scènes
}
