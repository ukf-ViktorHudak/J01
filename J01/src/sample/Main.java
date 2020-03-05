package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scena = new Scene(root, 500, 400);
        Label cs = new Label("Napíš sem niečo --> ");
        cs.setLayoutX(65);
        cs.setLayoutY(15);
        Label cs1 = new Label("<-- Napíš sem niečo");
        cs1.setLayoutX(325);
        cs1.setLayoutY(15);


        Button but = new Button("Vyskúšaj čo to spraví");
        but.setLayoutX(175);
        but.setLayoutY(35);

        TextField txt = new TextField();
        txt.setLayoutX(175);
        txt.setLayoutY(10);

        Text text = new Text();
        text.setLayoutY(-2);
        text.setLayoutX(-30);
        root.getChildren().addAll(text,txt,but,cs,cs1);

        primaryStage.setTitle("Zmena farby pozadia");
        primaryStage.setScene(scena);
        primaryStage.show();

        but.setOnAction(actionEvent -> {
                text.setText(txt.getText());
        String b = text.getText();
        int[] clr = new int[3];

        for (int i = 0; i < b.length(); i++) {
            switch (b.charAt(i)) {
                case 'W':
                case 'R':
                case 'T':
                case 'P':
                case 'S':
                case 'D':
                case 'F':
                case 'G':
                case 'H':
                case 'J':
                case 'K':
                case 'L':
                case 'X':
                case 'C':
                case 'V':
                case 'B':
                case 'N':
                case 'M':
                case 'w':
                case 'r':
                case 't':
                case 'p':
                case 's':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'x':
                case 'c':
                case 'v':
                case 'b':
                case 'n':
                case 'm':
                    clr[1] = clr[1] * 24;
                    break;

                case 'a':
                case 'q':
                case 'Q':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':
                    clr[0] = clr[0] * 16;
                    break;
            }
        }
        clr[2] = (b.length() % 25) * 10;
        for (int i = 0; i < 2; i++) {
            if (clr[i] > 255) {
                clr[i] = 255;
            }}

        if(clr[0]<150 && clr[1]<150 && clr[2]<150){
            cs.setTextFill(Color.WHITESMOKE);
            cs1.setTextFill(Color.WHITESMOKE);
        }else cs.setTextFill(Color.BLACK); cs1.setTextFill(Color.BLACK);

            scena.setFill(Color.rgb(clr[0], clr[1], clr[2]));
        });
        }

    public static void main(String[] args) {
        launch(args);
    }
}

