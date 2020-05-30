/**
 * Name: Arjina Khanom
 * CST 3613
 * Assignment - 12
 * Due Date: Tuesday, April 28, 2020 at 6:00 PM
 * Question: //Write a program that displays a drawing for the popular hangmangame, as shown in Figure.
 */


package hangman;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class project12 extends Application {

    private static double HEIGHT = 400;
    private static double WIDTH = 400;

   
    public void start(Stage primaryStage) {

        Pane pane1 = new Pane();
        ObservableList<Node> list = pane1.getChildren();

        primaryStage.setTitle("Hangman in Hangmangame.");
        primaryStage.setScene(new Scene(pane1, WIDTH, WIDTH));
        Arc arc1 = new Arc(WIDTH / 4, HEIGHT - HEIGHT / 12, WIDTH / 5, HEIGHT / 12, 0, 180);
        arc1.setFill(Color.TRANSPARENT);
        arc1.setStroke(Color.BLACK);
        list.add(arc1);

        Line pole1 = new Line(arc1.getCenterX(), arc1.getCenterY() - arc1.getRadiusY(), arc1.getCenterX(), pane1.getHeight() / 12);
        list.add(pole1);

        Line holder1 = new Line(pole1.getEndX(), pole1.getEndY(), pane1.getWidth() / 1.5, pole1.getEndY());
        list.add(holder1);
        
        //to create the hang line to hang the man. 
        Line hangline = new Line(holder1.getEndX(), holder1.getEndY(), holder1.getEndX(), pane1.getHeight() / 6);
        list.add(hangline);
        
        // to create the head which is a circle
        double radius = WIDTH / 10;
        Circle head = new Circle(holder1.getEndX(), pane1.getHeight()/ 6 + radius, radius);
        head.setFill(Color.TRANSPARENT);
        head.setStroke(Color.BLACK);
        list.add(head);
        

        double[] pnt = getPointAtAngle(head, 220);
        // To create the left arm
        Line Arm1 = new Line(pane1.getWidth() / 2, pane1.getHeight() / 2, pnt[0], pnt[1]);
        list.add(Arm1);
        
        pnt = getPointAtAngle(head, 315);
        // to create the right arm
         Line Arm2 = new Line(pane1.getWidth() / 1.2, pane1.getHeight() / 2, pnt[0], pnt[1]);
         list.add(Arm2);
        

        pnt = getPointAtAngle(head, 270);
        Line body = new Line(pnt[0], pnt[1], pnt[0], pane1.getHeight() / 1.6);
        list.add(body);

        //to create the left leg
       Line Leg1 = new Line(body.getEndX(), body.getEndY(), pane1.getWidth() / 2, pane1.getHeight() / 1.3);
       list.add(Leg1);
        
       //to create the right leg
       Line Leg2 = new Line(body.getEndX(), body.getEndY(), pane1.getWidth() / 1.2, pane1.getHeight() / 1.3);
       list.add(Leg2);


        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);

    }

    private double[] getPointAtAngle(Circle c, double angle) {
        double x = c.getCenterX() + c.getRadius() * Math.cos(Math.toRadians(angle));
        double y = c.getCenterY() - c.getRadius() * Math.sin(Math.toRadians(angle));

        return new double[]{x, y};
    }
}