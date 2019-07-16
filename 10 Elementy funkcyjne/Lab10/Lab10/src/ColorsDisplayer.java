import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorsDisplayer extends Application {

	private List<HSVColor> createColorsToDisplay() throws FileNotFoundException {
		List<HSVColor> colors = ColorsLoader.loadColors("colors.csv");
		colors.sort(new ValueComparator());
		return getBrightColors(colors);
	}

	private List<HSVColor> getBrightColors(List<HSVColor> colors) {
		return colors;
	}

	private List<Color> convertColors(List<HSVColor> hsvColors) {
		List<Color> colors = new ArrayList<>();
		for (HSVColor hsvColor : hsvColors) {
			Color convertedColor = Color.hsb(hsvColor.getHue(), hsvColor.getSaturation(), hsvColor.getValue());
			colors.add(convertedColor);
		}
		return colors;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();

		Button btn = new Button();
		btn.setText("click me");

		HBox colorBox = new HBox();
		pane.setCenter(colorBox);

		for (Color color : convertColors(createColorsToDisplay())) {
			Rectangle colorRect = new Rectangle(20, 20);
			colorRect.setFill(color);
			colorBox.getChildren().add(colorRect);
		}

		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(ColorsDisplayer.class, args);
	}
}
