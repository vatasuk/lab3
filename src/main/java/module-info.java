module com.example.lab3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;
    requires java.xml;
    requires java.xml.bind;
    opens com.example.lab3 to javafx.fxml,java.xml.bind,com.sun.xml.bind;
    exports com.example.lab3;
}