module com.codedotorg {
    requires javafx.controls;
    requires javafx.fxml;
    requires okhttp3;
    requires transitive org.json;

    opens com.codedotorg to javafx.fxml;
    exports com.codedotorg;
}
