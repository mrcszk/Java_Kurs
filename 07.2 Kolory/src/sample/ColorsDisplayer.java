package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class ColorsDisplayer extends Application {


    private List<HSVColor> createColorsToDisplay() {
        List<HSVColor> list = new ArrayList<>();
        Random random = new Random();
         for (int i = 0; i < 20; i++) {
             list.add(new HSVColor(random.nextInt(360),random.nextDouble(),random.nextDouble()));
         }

        Collections.sort(list);
        return list;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        HBox colorBox = new HBox();
        pane.setCenter(colorBox);

        for (HSVColor color : createColorsToDisplay()) {
            System.out.println(color.getHue() + " " + color.getSaturation() + " " + color.getValue());
            Rectangle colorRect = new Rectangle(20, 20);
            colorRect.setFill(Color.hsb(color.getHue(), color.getSaturation(), color.getValue()));
            colorBox.getChildren().add(colorRect);
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}