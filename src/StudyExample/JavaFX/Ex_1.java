
package StudyExample.JavaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.text.Annotation;

public class Ex_1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene (group, 300, 400);
        stage.setScene(scene);
        stage.setTitle("Hello Bad Boy");
        stage.show();
    }



    public static void main(String[] args) {
        Application.launch();


    }}
