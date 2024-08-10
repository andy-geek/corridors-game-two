module com.davydov.corridorsgametwo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    requires java.jws;
    requires java.xml.ws;
    requires java.sql;

    requires org.eclipse.persistence.asm;
    requires org.eclipse.persistence.core;
    requires org.eclipse.persistence.moxy;
    requires org.eclipse.persistence.sdo;

    opens com.davydov.corridorsgametwo.client to javafx.fxml;
    opens com.davydov.corridorsgametwo.webservice;

    exports com.davydov.corridorsgametwo.client;
    exports com.davydov.corridorsgametwo.commands;
    exports com.davydov.corridorsgametwo.server;
}