package sample;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
public class ColorsDisplayer extends Application {


    private List<HSVColor> createColorsToDisplay() throws FileNotFoundException {
        List<HSVColor> list = new ArrayList<>();
        File file = new File("colors.csv");
        Scanner scanner = new Scanner(file);
        boolean check = true;
        while(check){
        try {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineArgs = line.split(",");
                int hue = Integer.parseInt(lineArgs[0]);
                double saturation = Double.parseDouble(lineArgs[1]);
                double value = Double.parseDouble(lineArgs[2]);
//            list.add(new HSVColor(40, 0.5, 0.5));
//            list.add(new HSVColor(400, 0.5, 0.5));
//            list.add(new HSVColor(140, 0.5, 0.5));
                list.add(new HSVColor(hue,saturation,value));}
                check = false;
            }
        catch (ColorFormatException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();}
        }
        }
        Collections.sort(list);
        return list;
    }
//		int hue = scanner.nextInt();
//		double saturation = scanner.nextDouble();
//		double value = scanner.nextDouble();


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