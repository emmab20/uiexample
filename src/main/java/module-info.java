module com.uiexample {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.uiexample to javafx.fxml;
    exports com.uiexample;
}
