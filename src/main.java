import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.swing.*;

public class main<tx> extends Application {
    Stage window;
    Pane pane6 ;
    Stage stage;
    public void venu(TextField txt){
        //link the keyboard buttons to the textfields by creating actions

        final int[] j = {0};

        Button button1 = new Button("0");
        button1.setPrefSize(30,30);
        button1.setOnAction(event ->{
            txt.insertText(j[0],"0");
            j[0] = j[0] +1;
        });
        button1.setStyle("-fx-background-radius:12");//edit the radius of the buttons

        Button button2 = new Button("1");
        button2.setPrefSize(30,30);//edit the size of the buttons
        button2 .setOnAction(event ->{
            txt.insertText(j[0],"1");
            j[0] = j[0] +1;});
        button2.setStyle("-fx-background-radius:12");

        Button button3 = new Button("2");
        button3.setPrefSize(30,30);
        button3 .setOnAction(event ->{
            txt.insertText(j[0],"2");
            j[0] = j[0] +1;});
        button3.setStyle("-fx-background-radius:12");

        Button button4 = new Button("3");
        button4.setPrefSize(30,30);
        button4 .setOnAction(event ->{
            txt.insertText(j[0],"3");
            j[0] = j[0] +1;});
        button4.setStyle("-fx-background-radius:12");

        Button button5 = new Button("4");
        button5.setPrefSize(30,30);
        button5 .setOnAction(event ->{
            txt.insertText(j[0],"4");
            j[0] = j[0] +1;});
        button5.setStyle("-fx-background-radius:12");
        Button button6 = new Button("5");

        button6.setPrefSize(30,30);
        button6 .setOnAction(event ->{
            txt.insertText(j[0],"5");
            j[0] = j[0] +1;});
        button6.setStyle("-fx-background-radius:12");
        Button button7 = new Button("6");

        button7.setPrefSize(30,30);
        button7 .setOnAction(event ->{
            txt.insertText(j[0],"6");
            j[0] = j[0] +1;});
        button7.setStyle("-fx-background-radius:12");
        Button button8 = new Button("7");

        button8.setPrefSize(30,30);
        button8 .setOnAction(event ->{
            txt.insertText(j[0],"7");
            j[0] = j[0] +1;});
        button8.setStyle("-fx-background-radius:12");

        Button button9 = new Button("8");
        button9.setPrefSize(30,30);
        button9 .setOnAction(event ->{
            txt.insertText(j[0],"8");
            j[0] = j[0] +1;});
        button9.setStyle("-fx-background-radius:12");

        Button button10 = new Button("9");
        button10.setPrefSize(30,30);
        button10 .setOnAction(event ->{
            txt.insertText(j[0],"9");
            j[0] = j[0] +1;});
        button10.setStyle("-fx-background-radius:12");

        Button button11 = new Button(".");
        button11.setPrefSize(30,30);
        button11 .setOnAction(event ->{
            txt.insertText(j[0],".");
            j[0] = j[0] +1;});
        button11.setStyle("-fx-background-radius:12");

        Button button12 = new Button("C");//create the delete button
        button12.setPrefSize(30,30);
        button12 .setOnAction(event ->{
            txt.setText(" ");
            j[0] =0;});
        button12.setStyle("-fx-background-radius:12");

        HBox hBox1 = new HBox();
        hBox1.setSpacing(10);
        hBox1.getChildren().addAll(button1,button2,button3);
        hBox1.setLayoutX(25);
        hBox1.setLayoutY(50);
        HBox hBox2 = new HBox();
        hBox2.setSpacing(10);
        hBox2.getChildren().addAll(button4,button5,button6);
        hBox2.setLayoutX(25);
        hBox2.setLayoutY(100);
        HBox hBox3 = new HBox();
        hBox3.setSpacing(10);
        hBox3.getChildren().addAll(button7,button8,button9);
        hBox3.setLayoutX(25);
        hBox3.setLayoutY(150);
        HBox hBox4=new HBox();
        hBox4.setSpacing(10);
        hBox4.getChildren().addAll(button10,button11,button12);
        hBox4.setLayoutX(25);
        hBox4.setLayoutY(200);//create the hbox to get button of the cal to a line


        pane6.setStyle("-fx-background-color: #7CAFC2");
        pane6.getChildren().addAll(hBox1,hBox2,hBox3,hBox4);

    }
    public static void main(String[] args) {
        launch();
    }

    public void start (Stage primaryStage) throws Exception {
        window =primaryStage;
        window.setTitle("Finance calculator");//create the title of the window

        pane6 = new Pane();//this pane belongs to the keyboard

        Button btn1 = new Button();
        btn1.setText("Home");
        btn1.setPrefSize(116, 40);
        btn1.setStyle("-fx-font-weight:bold ; -fx-background-color:#7CAFC2");//change the background colour and bold the fonts of the button an
        btn1.setFont(Font.font("verdana",FontWeight.BOLD,FontPosture.REGULAR,15));
        //change the font to bold,family and the size

/**
 * I created buttons to visit the mortgage,savings,fd,loan calculators and to help tab
 * when these buttons will press,user can visit these panes
 */
        Button btn2 = new Button();

        btn2.setText("Mortgage");
        btn2.setPrefSize(116, 40);
        btn2.setStyle("-fx-font-weight:bold");
        btn2.setFont(Font.font("verdana",FontWeight.BOLD,FontPosture.REGULAR,15));

        Button btn3 = new Button();
        btn3.setText("FD");//fixed deposit
        btn3.setPrefSize(116, 40);
        btn3.setStyle("-fx-font-weight:bold;-fx-background-color:#7CAFC2");
        btn3.setFont(Font.font("verdana",FontWeight.BOLD,FontPosture.REGULAR,15));

        Button btn3a = new Button();
        btn3a.setText("Savings");
        btn3a.setPrefSize(116, 40);
        btn3a.setStyle("-fx-font-weight:bold;");
        btn3a.setFont(Font.font("verdana",FontWeight.BOLD,FontPosture.REGULAR,15));


        Button btn4 = new Button();
        btn4.setText("Loan");
        btn4.setPrefSize(116, 40);
        btn4.setStyle("-fx-font-weight:bold;-fx-background-color:#7CAFC2");
        btn4.setFont(Font.font("verdana",FontWeight.BOLD,FontPosture.REGULAR,15));

        Button btn5 = new Button();
        btn5.setText("Help");//create the help button to popup a window and put some advices about the app
        btn5.setPrefSize(140, 40);
        btn5.setStyle("-fx-font-weight:bold;");
        btn5.setFont(Font.font("verdana",FontWeight.BOLD,FontPosture.REGULAR,15));

        HBox hBox = new HBox();
        hBox.getChildren().addAll(btn1,btn2,btn3,btn3a,btn4,btn5);

        /**
         * to the home pane,i prepared two labels and these are giving some introduction about this
         */

        Label label1 = new Label();
        label1.setText("Home");
        label1.setFont(Font.font("verdana",20));
        label1.setLayoutX(100);
        label1.setLayoutY(50);
        Label label1a=new Label();
        label1a.setText("WELCOME TO ONLINE BANKING!!!");
        label1a.setFont(Font.font("verdana",FontWeight.BOLD,20));
        label1a.setStyle("-fx-text-fill:#FFFFFF;");
        label1a.setLayoutX(100);
        label1a.setLayoutY(100);//set layout to get a correct position

        Label label1b=new Label();
        label1b.setText("Choose your calculator from above");
        label1b.setFont(Font.font("verdana",FontWeight.BOLD,15));
        label1b.setStyle("-fx-text-fill:#FFFFFF;");
        label1b.setLayoutX(100);
        label1b.setLayoutY(130);
        Pane pane1 = new Pane();
        pane1.setStyle("-fx-background-color: #585858;-fx-font-weight:bold");
        pane1.getChildren().addAll(label1,label1a,label1b);


/**
 * in this mortgage pane i created a keybord and when the user mouse click on the text feild and the key bord will
 * appeared
 */
        Label label2 = new Label();
        label2.setText("Mortgage");
        label2.setStyle("-fx-text-fill:#FFFFFF;");
        label2.setFont(Font.font("verdana",20));
        label2.setLayoutX(100);
        label2.setLayoutY(50);
        Pane pane2 = new Pane();
        pane2.setStyle("-fx-background-color: #585858;-fx-font-weight:bold");

        TextField tf1=new TextField();
        tf1.setOnMouseClicked(e -> venu(tf1));//these textfeilds are called by the venu method
        TextField tf2=new TextField();
        tf2.setOnMouseClicked(e -> venu(tf2));
        TextField tf3=new TextField();
        tf3.setOnMouseClicked(e -> venu(tf3));
        TextField tf4=new TextField();
        tf4.setOnMouseClicked(e -> venu(tf4));

        Label lbl1=new Label("Principle amount");
        Label lbl2=new Label("Monthly payment");
        Label lbl3=new Label("Loan term");
        Label lbl4=new Label("Interest rate");

        tf1.setLayoutX(400);
        tf1.setLayoutY(80);
        tf2.setLayoutX(400);
        tf2.setLayoutY(110);
        tf3.setLayoutX(400);
        tf3.setLayoutY(140);
        tf4.setLayoutX(400);
        tf4.setLayoutY(170);

        lbl1.setLayoutX(100);
        lbl1.setLayoutY(80);
        lbl2.setLayoutX(100);
        lbl2.setLayoutY(110);
        lbl3.setLayoutX(100);
        lbl3.setLayoutY(140);
        lbl4.setLayoutX(100);
        lbl4.setLayoutY(170);

        //put calculate buttons separetlly to calculate saveral equations
        Button morcal=new Button("Calculate-Principle amount");
        morcal.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        morcal.setPrefSize(150,50);
        morcal.setLayoutX(100);
        morcal.setLayoutY(250);
        Button morcal1=new Button("Calculate-Monthly payment");
        morcal1.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        morcal1.setPrefSize(150,50);
        morcal1.setLayoutX(300);
        morcal1.setLayoutY(250);
        Button morcal2=new Button("Calculate-Loan term");
        morcal2.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        morcal2.setPrefSize(150,50);
        morcal2.setLayoutX(100);
        morcal2.setLayoutY(350);
        Button morcal3=new Button("Calculate-Interest rate");
        morcal3.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        morcal3.setPrefSize(150,50);
        morcal3.setLayoutX(300);
        morcal3.setLayoutY(350);

        //calculate the principle value(p),payment(PMT),time period(t),interest rate(r)


        morcal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double r= Double.parseDouble(tf4.getText());
                Double PMT= Double.parseDouble(tf2.getText());
                Double t= Double.parseDouble(tf3.getText());

                Double p=PMT*(Math.pow((1+r/12),12*t)-1)/(r/12)*Math.pow((1+r/12),12*t);
                String.valueOf(p);
                tf1.setText(String.valueOf(p));


            }
        });
        morcal1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double r= Double.parseDouble(tf4.getText());
                Double P= Double.parseDouble(tf1.getText());
                Double t= Double.parseDouble(tf3.getText());

                Double PMT=(P*r/1200)*Math.pow((1+r/1200),12*t)/(Math.pow(1+r/1200,12*t))-1;
                String.valueOf(PMT);
                tf2.setText(String.valueOf(PMT));


            }
        });
        morcal2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double PMT= Double.parseDouble(tf2.getText());
                Double p= Double.parseDouble(tf1.getText());
                Double r= Double.parseDouble(tf4.getText());

                Double t=Math.log(1-r*p/100*PMT)/Math.log(1+r/100)*12;
                String.valueOf(t);
                tf3.setText(String.valueOf(t));



            }
        });

        pane2.getChildren().addAll(label2,tf1,tf2,tf3,tf4,morcal,lbl1,lbl2,lbl3,lbl4,morcal1,morcal2,morcal3);


        Label label3 = new Label();
        label3.setText("Fixed deposit");
        label3.setFont(Font.font("verdana",20));
        label3.setStyle("-fx-text-fill:#FFFFFF;");
        label3.setLayoutX(100);
        label3.setLayoutY(50);
        Pane pane3 = new Pane();
        pane3.setStyle("-fx-background-color: #585858;-fx-font-weight:bold");

        //these textfeilds are called by the venu method
        TextField tf5=new TextField();
        tf5.setOnMouseClicked(e -> venu(tf5));
        TextField tf6=new TextField();
        tf6.setOnMouseClicked(e -> venu(tf6));
        TextField tf7=new TextField();
        tf7.setOnMouseClicked(e -> venu(tf7));
        TextField tf8=new TextField();
        tf8.setOnMouseClicked(e -> venu(tf8));

        Label lbl5=new Label("Principle amount");
        Label lbl6=new Label("Interest term");
        Label lbl7=new Label("Period");
        Label lbl8=new Label("Future value");

        tf5.setLayoutX(400);
        tf5.setLayoutY(80);
        tf6.setLayoutX(400);
        tf6.setLayoutY(110);
        tf7.setLayoutX(400);
        tf7.setLayoutY(140);
        tf8.setLayoutX(400);
        tf8.setLayoutY(170);

        lbl5.setLayoutX(100);
        lbl5.setLayoutY(80);
        lbl6.setLayoutX(100);
        lbl6.setLayoutY(110);
        lbl7.setLayoutX(100);
        lbl7.setLayoutY(140);
        lbl8.setLayoutX(100);
        lbl8.setLayoutY(170);

        Button fdcal=new Button("Calculate-Principle amount");
        fdcal.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        fdcal.setPrefSize(150,50);
        fdcal.setLayoutX(100);
        fdcal.setLayoutY(250);
        Button fdcal1=new Button("Calculate-Interest term");
        fdcal1.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        fdcal1.setPrefSize(150,50);
        fdcal1.setLayoutX(300);
        fdcal1.setLayoutY(250);
        Button fdcal2=new Button("Calculate-Period");
        fdcal2.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        fdcal2.setPrefSize(150,50);
        fdcal2.setLayoutX(100);
        fdcal2.setLayoutY(350);
        Button fdcal3=new Button("Calculate-Future value");
        fdcal3.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        fdcal3.setPrefSize(150,50);
        fdcal3.setLayoutX(300);
        fdcal3.setLayoutY(350);
//calculate principle amount(p),interest term(r),period(t),future value(A)
        fdcal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double r = Double.parseDouble(tf6.getText());
                Double t = Double.parseDouble(tf7.getText());
                Double A = Double.parseDouble(tf8.getText());

                Double p =A/Math.pow(1+r/12,12*t);
                String.valueOf(p);
                tf5.setText(String.valueOf(p));
            }
        });

        fdcal1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double p = Double.parseDouble(tf5.getText());
                Double t = Double.parseDouble(tf7.getText());
                Double A = Double.parseDouble(tf8.getText());
                Double n=12.00;

                Double r =n*(Math.pow(A/p,1/n*t)-1);

                String.valueOf(r);
                tf6.setText(String.valueOf(r));
            }
        });

        fdcal2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double p = Double.parseDouble(tf5.getText());
                Double r = Double.parseDouble(tf6.getText());
                Double A = Double.parseDouble(tf8.getText());
                Double n=12.00;

                Double t =Math.log(A/p)/12*Math.log(1+r/12);

                String.valueOf(t);
                tf7.setText(String.valueOf(t));
            }
        });

        fdcal3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double p = Double.parseDouble(tf5.getText());
                Double t = Double.parseDouble(tf7.getText());
                Double r = Double.parseDouble(tf6.getText());
                Double n=12.00;

                Double A=p*Math.pow(1+r/12,12*t);

                String.valueOf(A);
                tf8.setText(String.valueOf(A));
            }
        });



        pane3.getChildren().addAll(label3,tf5,tf6,tf7,tf8,lbl5,lbl6,lbl7,lbl8,fdcal,fdcal1,fdcal2,fdcal3);

        Label label3a = new Label();
        label3a.setText("Savings");
        label3a.setFont(Font.font("verdana",20));
        label3a.setLayoutX(100);
        label3a.setLayoutY(50);
        label3a.setStyle("-fx-text-fill:#FFFFFF;");
        Pane pane3a = new Pane();
        pane3a.setStyle("-fx-background-color: #585858;-fx-font-weight:bold");
        TextField tf5a=new TextField();
        tf5a.setOnMouseClicked(e -> venu(tf5a));
        TextField tf6a=new TextField();
        tf6a.setOnMouseClicked(e -> venu(tf6a));
        TextField tf7a=new TextField();
        tf7a.setOnMouseClicked(e -> venu(tf7a));
        TextField tf8a=new TextField();
        tf8a.setOnMouseClicked(e -> venu(tf8a));
        TextField tf9a=new TextField();
        tf9a.setOnMouseClicked(e -> venu(tf9a));

        Label lbl5a=new Label("Start Principal");
        Label lbl6a=new Label("Period");
        Label lbl7a=new Label("Interest value");
        Label lbl8a=new Label("PMT");
        Label lbl9a=new Label("Future value");

        tf5a.setLayoutX(400);
        tf5a.setLayoutY(80);
        tf6a.setLayoutX(400);
        tf6a.setLayoutY(110);
        tf7a.setLayoutX(400);
        tf7a.setLayoutY(140);
        tf8a.setLayoutX(400);
        tf8a.setLayoutY(170);
        tf9a.setLayoutX(400);
        tf9a.setLayoutY(200);

        lbl5a.setLayoutX(100);
        lbl5a.setLayoutY(80);
        lbl6a.setLayoutX(100);
        lbl6a.setLayoutY(110);
        lbl7a.setLayoutX(100);
        lbl7a.setLayoutY(140);
        lbl8a.setLayoutX(100);
        lbl8a.setLayoutY(170);
        lbl9a.setLayoutX(100);
        lbl9a.setLayoutY(200);

        Button savcal=new Button("Calculate-Start principal");
        savcal.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        savcal.setPrefSize(150,50);
        savcal.setLayoutX(100);
        savcal.setLayoutY(250);
        Button savcal1=new Button("Calculate-Period");
        savcal1.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        savcal1.setPrefSize(150,50);
        savcal1.setLayoutX(300);
        savcal1.setLayoutY(250);
        Button savcal2=new Button("Calculate-Interest value");
        savcal2.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        savcal2.setPrefSize(150,50);
        savcal2.setLayoutX(100);
        savcal2.setLayoutY(325);
        Button savcal3=new Button("Calculate-PMT");
        savcal3.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        savcal3.setPrefSize(150,50);
        savcal3.setLayoutX(300);
        savcal3.setLayoutY(325);
        Button savcal4=new Button("Calculate-Future value");
        savcal4.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        savcal4.setPrefSize(150,50);
        savcal4.setLayoutX(200);
        savcal4.setLayoutY(400);
//calculate the start period(p),calculate period(t),interest value(r),PMT,future value(A)
        savcal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double t = Double.parseDouble(tf6a.getText());
                Double r = Double.parseDouble(tf7a.getText());
                Double A = Double.parseDouble(tf9a.getText());
                Double PMT=Double.parseDouble(tf8a.getText());
                Double n=12.00;

                Double p =A-PMT*((Math.pow(1+r/n,n*t)-1)*(n/r)/(Math.pow(1+r/1200,12*t)));

                String.valueOf(p);
                tf5a.setText(String.valueOf(p));
            }
        });
        savcal1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double p = Double.parseDouble(tf5a.getText());
                Double r = Double.parseDouble(tf7a.getText());
                Double A = Double.parseDouble(tf9a.getText());
                Double PMT=Double.parseDouble(tf8a.getText());
                Double n=12.00;

                Double t =Math.log(A/p)/12*Math.log(1+r/12);

                String.valueOf(t);
                tf6a.setText(String.valueOf(t));
            }
        });
        savcal2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double p = Double.parseDouble(tf5a.getText());
                Double t = Double.parseDouble(tf6a.getText());
                Double A = Double.parseDouble(tf9a.getText());
                Double PMT=Double.parseDouble(tf8a.getText());
                Double n=12.00;

                Double r =n*(Math.pow(A/p,1/n*t)-1);

                String.valueOf(r);
                tf7a.setText(String.valueOf(r));
            }
        });
        savcal3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double p = Double.parseDouble(tf5a.getText());
                Double t = Double.parseDouble(tf6a.getText());
                Double A = Double.parseDouble(tf9a.getText());
                Double r=Double.parseDouble(tf7a.getText());
                Double n=12.00;

                Double PMT =((A-p)*Math.pow(1+r/1200,12*t))*(r/1200)/Math.pow(1+r/1200,12*t)-1;

                String.valueOf(PMT);
                tf8a.setText(String.valueOf(PMT));
            }
        });
        savcal4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double p = Double.parseDouble(tf5a.getText());
                Double t = Double.parseDouble(tf6a.getText());
                Double PMT = Double.parseDouble(tf8a.getText());
                Double r=Double.parseDouble(tf7a.getText());
                Double n=12.00;

                Double A =p*(Math.pow(1+r/1200,12*t))+PMT*(Math.pow(1+r/1200,12*t)-1/(r/1200));

                String.valueOf(A);
                tf9a.setText(String.valueOf(A));
            }
        });


        pane3a.getChildren().addAll(label3a,tf5a,tf6a,tf7a,tf8a,tf9a,lbl5a,lbl6a,lbl7a,lbl8a,lbl9a,savcal,savcal1,savcal2,savcal3,savcal4);

        Label label4 = new Label();
        label4.setText("Loan");
        label4.setFont(Font.font("verdana",20));
        label4.setLayoutX(100);
        label4.setLayoutY(50);
        label4.setStyle("-fx-text-fill:#FFFFFF;");
        Pane pane4 = new Pane();
        TextField tf9=new TextField();
        tf9.setOnMouseClicked(e -> venu(tf9));
        TextField tf10=new TextField();
        tf10.setOnMouseClicked(e -> venu(tf10));
        TextField tf11=new TextField();
        tf11.setOnMouseClicked(e -> venu(tf11));
        TextField tf12=new TextField();
        tf12.setOnMouseClicked(e -> venu(tf12));

        Label lbla=new Label("Auto price");
        Label lblb=new Label("Long term");
        Label lblc=new Label("Interest term");
        Label lbld=new Label("Monthly payment");

        tf9.setLayoutX(400);
        tf9.setLayoutY(80);
        tf10.setLayoutX(400);
        tf10.setLayoutY(110);
        tf11.setLayoutX(400);
        tf11.setLayoutY(140);
        tf12.setLayoutX(400);
        tf12.setLayoutY(170);

        lbla.setLayoutX(100);
        lbla.setLayoutY(80);
        lblb.setLayoutX(100);
        lblb.setLayoutY(110);
        lblc.setLayoutX(100);
        lblc.setLayoutY(140);
        lbld.setLayoutX(100);
        lbld.setLayoutY(170);


        Button loancal=new Button("Calculate-Auto price");
        loancal.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        loancal.setPrefSize(150,50);
        loancal.setLayoutX(100);
        loancal.setLayoutY(250);

        pane4.setStyle("-fx-background-color: #585858;-fx-font-weight:bold");

        Button loancal1=new Button("Calculate-Long term");
        loancal1.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        loancal1.setPrefSize(150,50);
        loancal1.setLayoutX(300);
        loancal1.setLayoutY(250);
        Button loancal2=new Button("Calculate-Interest term");
        loancal2.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        loancal2.setPrefSize(150,50);
        loancal2.setLayoutX(100);
        loancal2.setLayoutY(350);
        Button loancal3=new Button("Calculate-Monthly payment");
        loancal3.setStyle("-fx-font-weight:bold; -fx-background-color:#BA8BAF; -fx-text-fill:#FFFFFF; -fx-background-radius:6");
        loancal3.setPrefSize(150,50);
        loancal3.setLayoutX(300);
        loancal3.setLayoutY(350);

        //calculate the auto price(p),long term(t),monthly payment(PMT)

        loancal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double r= Double.parseDouble(tf11.getText());
                Double PMT= Double.parseDouble(tf12.getText());
                Double t= Double.parseDouble(tf10.getText());

                Double p=PMT*(Math.pow((1+r/12),12*t)-1)/(r/12)*Math.pow((1+r/12),12*t);
                String.valueOf(p);
                tf9.setText(String.valueOf(p));


            }
        });
        loancal3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double r = Double.parseDouble(tf11.getText());
                Double P = Double.parseDouble(tf9.getText());
                Double t = Double.parseDouble(tf10.getText());

                Double PMT = (P * r / 1200) * Math.pow((1 + r / 1200), 12 * t)/(Math.pow(1+r/1200,12*t))-1;
                String.valueOf(PMT);
                tf12.setText(String.valueOf(PMT));


            }
        });
        loancal2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double PMT= Double.parseDouble(tf12.getText());
                Double p= Double.parseDouble(tf9.getText());
                Double r= Double.parseDouble(tf11.getText());

                Double t=Math.log(1-r*p/100*PMT)/Math.log(1+r/100)*12;
                String.valueOf(t);
                tf10.setText(String.valueOf(t));




            }
        });

        pane4.getChildren().addAll(label4,tf9,tf10,tf11,tf12,lbla,lblb,lblc,lbld,loancal,loancal1,loancal2,loancal3);

        Label label5 = new Label();
        label5.setText("Help");
        label5.setFont(Font.font("verdana",20));
        label1.setLayoutX(100);
        label1.setLayoutY(50);
        Pane pane5 = new Pane();

        pane5.setStyle("-fx-background-color: #585858;-fx-font-weight-bold");
        pane5.getChildren().add(label5);



        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);
        borderPane.setCenter(pane1);
        borderPane.setRight(null);

        btn1.setOnAction(event -> {
            borderPane.setCenter(pane1);
            borderPane.setRight(null);
        });

        btn2.setOnAction(event -> {
            borderPane.setCenter(pane2);

            borderPane.setRight(pane6);
        });

        btn3.setOnAction(event -> {
            borderPane.setCenter(pane3);
            borderPane.setRight(pane6);
        });

        btn3a.setOnAction(event -> {
            borderPane.setCenter(pane3a);
            borderPane.setRight(pane6);
        });

        btn4.setOnAction(event -> {
            borderPane.setCenter(pane4);
            borderPane.setRight(pane6);
        });

        btn5.setOnAction(event -> {
            //borderPane.setCenter(pane5);
            //borderPane.setRight(null);
            /**
             * i put this help button on behalf of the user's comforty
             * user might get some quires about this app's opperation.
             * so i used this popup window for this.
             */
            Label label = new Label("This will be helpful for you..");
            Label labelhlp=new Label("* Note that you should complete the blank one by one.  *If you want to del" +
                    "ete your value press 'C'button.  *Keep empty the text box" +
                    " that you want to know and then press the suitable calculate button.");
            labelhlp.setLayoutX(50);
            labelhlp.setLayoutY(100);
            Pane pane = new Pane();
            pane.getChildren().addAll(label,labelhlp);
            Stage stage = new Stage();
            stage.setScene(new Scene(pane,400, 400));
            stage.showAndWait();

        });


        stage = new Stage();
        Scene scene = new Scene(borderPane, 700, 500);
        stage.setScene(scene);
        stage.showAndWait();










}

    }

