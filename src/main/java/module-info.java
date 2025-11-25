module com.example.cifelsokningdemo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cifelsok to javafx.fxml;
    exports cifelsok;
}