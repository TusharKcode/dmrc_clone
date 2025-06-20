package com.dmrc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.*;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage){
                                                                                //Title Part of the Screen
        Label title = new Label("Welcome to DMRC Ticket Machine.");
        title.setStyle("-fx-font-size : 20px, -fx-font-weight : bold");

                                                                                //Buttons
        Button buyTicketBtn = new Button("Buy Ticket");
        Button rechargeCardBtn = new Button("Recharge Card");
        Button viewTicketBtn = new Button("View Ticket");
        Button exitBtn = new Button("Exit");

                                                                                //Styling Buttons
        buyTicketBtn.setMinWidth(200);
        rechargeCardBtn.setMinWidth(200);
        viewTicketBtn.setMinWidth(200);
        exitBtn.setMinWidth(200);
                                                                                //Buttons actions
        buyTicketBtn.setOnAction(e -> System.out.println("Buy Ticket screen will open!"));
        rechargeCardBtn.setOnAction(e -> System.out.println("Recharge Card screen will open!"));
        viewTicketBtn.setOnAction(e -> System.out.println("Ticket info screen will open!"));
        exitBtn.setOnAction(e -> primaryStage.close());

                                                                                //Layout
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(30, 20,30,20));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(title, buyTicketBtn, rechargeCardBtn, viewTicketBtn, exitBtn);

                                                                                //Scene
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DMRC Ticket Machine");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}












