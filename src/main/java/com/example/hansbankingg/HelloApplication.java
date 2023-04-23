package com.example.hansbankingg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException,NullPointerException {
        ServerForJdbc jdbcCon = new ServerForJdbc();
        try {
            jdbcCon.serverSTART();
        } catch (Throwable e) {
            System.err.println(e);
        }
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 400);
        stage.getIcons().add(new Image(this.getClass().getResource("HANSBanking.png").toString()));
        stage.setTitle("HANS Banking");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}