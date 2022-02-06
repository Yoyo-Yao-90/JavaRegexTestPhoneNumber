module com.example.javaregextestphonenumber {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaregextestphonenumber to javafx.fxml;
    exports com.example.javaregextestphonenumber;
}