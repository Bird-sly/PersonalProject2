package com.company;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Wagon wagon = new Wagon(2002,"Mercedes", "C320",Color.Silver, new WagonCharacteristics(EngineType.FourCylinder,Doors.Four,WDrive.ALL_WHEEL_DRIVE,GasType.Diesel,WagonType.Hatchback));
        System.out.println(wagon.toString());
    }
}