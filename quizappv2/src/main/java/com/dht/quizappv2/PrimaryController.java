package com.dht.quizappv2;

<<<<<<< HEAD
import com.dht.utils.MyAlertSingleton;
import com.dht.utils.MyStageSingleton;
=======
import com.dht.utils.MyAlert;
>>>>>>> 20aed3d3b52414984e79a890dae667f50faff958
import com.dht.utils.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

<<<<<<< HEAD

=======
>>>>>>> 20aed3d3b52414984e79a890dae667f50faff958
public class PrimaryController implements Initializable {
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
<<<<<<< HEAD
    public void manageQuestions(ActionEvent e) {
        MyStageSingleton.getInstance().showStage("questions");
    }
    
    public void practice(ActionEvent e) {
        MyAlertSingleton.getInstance().showAlert("Comming soon...");
    }
    
    public void exam(ActionEvent e) {
        MyAlertSingleton.getInstance().showAlert("Comming soon...");
    }

    public void changeTheme(ActionEvent e) {
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
=======
    public void manageQuestion(ActionEvent e) {
        MyAlert.getInstance().showAlert("Coming soon...");
    }
    
    public void practice(ActionEvent e) {
        MyAlert.getInstance().showAlert("Coming soon...");
    }
    
    public void exam(ActionEvent e) {
        MyAlert.getInstance().showAlert("Coming soon...");
    }

    public void changeTheme(ActionEvent e) {
        switch (this.cbThemes.getSelectionModel().getSelectedItem()) {
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
                break;
            case LIGHT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                break;
            default:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
        }
>>>>>>> 20aed3d3b52414984e79a890dae667f50faff958
    }
}
