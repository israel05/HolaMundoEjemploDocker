module es.israeldelamo.holamundofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.israeldelamo.holamundofx to javafx.fxml;
    exports es.israeldelamo.holamundofx;
}