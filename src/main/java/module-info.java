module com.example.wordoccurences1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.wordoccurences1 to javafx.fxml;
    exports com.example.wordoccurences1;
}