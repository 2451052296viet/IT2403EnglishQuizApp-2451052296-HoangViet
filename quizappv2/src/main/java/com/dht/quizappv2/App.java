package com.dht.quizappv2;

<<<<<<< HEAD
import com.dht.utils.MyConnSingleton;
=======
>>>>>>> 20aed3d3b52414984e79a890dae667f50faff958
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));
        stage.setScene(scene);
        stage.show();
    }

<<<<<<< HEAD
    @Override
    public void stop() throws Exception {
        super.stop(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        MyConnSingleton.getInstance().close();
    }
    
    

=======
>>>>>>> 20aed3d3b52414984e79a890dae667f50faff958
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}