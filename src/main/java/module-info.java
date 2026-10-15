module ni.edu.uam.crud {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens ni.edu.uam.crud to javafx.fxml;
    opens ni.edu.uam.crud.controller to javafx.fxml;
    opens ni.edu.uam.crud.model to javafx.fxml;

    exports ni.edu.uam.crud;
    exports ni.edu.uam.crud.controller;
    exports ni.edu.uam.crud.model;
}