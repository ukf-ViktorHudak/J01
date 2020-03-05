package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.effect.GaussianBlur;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import org.w3c.dom.css.RGBColor;

import java.awt.*;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scena = new Scene(root, 1000,500);
        scena.setFill(Color.BLACK);
        GaussianBlur blur1 = new GaussianBlur();
        int glowsize = 10;


        Polyline l1 = new Polyline(185.0, 252.0, 170.0, 270.0, 210.0, 270.0, 170.0, 220.0, 210.0, 220.0, 195.0, 238.0);
        l1.setStrokeWidth(glowsize);
        l1.setStroke(Color.PURPLE);
        l1.setEffect(blur1);

        Polyline l2 = new Polyline(185.0, 252.0, 170.0, 270.0, 210.0, 270.0, 170.0, 220.0, 210.0, 220.0, 195.0, 238.0);
        l2.setStrokeWidth(3);
        l2.setStroke(Color.WHITE);


        Polyline l3 = new Polyline( 500.0, 220.0, 470.0, 270.0, 530.0, 270.0, 507.0, 230.0);
        l3.setStrokeWidth(glowsize);
        l3.setStroke(Color.RED);
        l3.setEffect(blur1);

        Polyline l4 = new Polyline( 500.0, 220.0, 470.0, 270.0, 530.0, 270.0, 507.0, 230.0);
        l4.setStrokeWidth(3);
        l4.setStroke(Color.WHITE);

        Polyline l5 = new Polyline(345.0, 240.0, 360.0, 240.0, 370.0, 225.0, 310.0, 225.0, 340.0, 270.0, 351.0, 254.0);
        l5.setStrokeWidth(glowsize);
        l5.setStroke(Color.YELLOW);
        l5.setEffect(blur1);

        Polyline l6 = new Polyline(345.0, 240.0, 360.0, 240.0, 370.0, 225.0, 310.0, 225.0, 340.0, 270.0, 351.0, 254.0);
        l6.setStrokeWidth(3);
        l6.setStroke(Color.WHITE);

        Polyline l7 = new Polyline(700.0, 220.0, 640.0, 220.0, 670.0, 270.0, 693.0, 232.0);
        l7.setStroke(Color.GREEN);
        l7.setStrokeWidth(glowsize);
        l7.setEffect(blur1);

        Polyline l8 = new Polyline(700.0, 220.0, 640.0, 220.0, 670.0, 270.0, 693.0, 232.0);
        l8.setStroke(Color.WHITE);
        l8.setStrokeWidth(3);

        Polyline l9 = new Polyline(810.0, 238.0, 820.0, 220.0, 850.0, 270.0, 790.0, 270.0, 800.0, 253.0, 814.0, 253.0);
        l9.setStroke(Color.BLUEVIOLET);
        l9.setStrokeWidth(glowsize);
        l9.setEffect(blur1);

        Polyline l10 = new Polyline(810.0, 238.0, 820.0, 220.0, 850.0, 270.0, 790.0, 270.0, 800.0, 253.0, 814.0, 253.0);
        l10.setStroke(Color.WHITE);
        l10.setStrokeWidth(3);
        root.getChildren().addAll(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10);

        primaryStage.setTitle("Witcher");
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
