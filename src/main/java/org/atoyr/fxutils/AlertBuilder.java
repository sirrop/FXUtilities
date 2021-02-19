package org.atoyr.fxutils;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Window;

import java.util.Optional;

/**
 * メソッドチェーンによるAlertの作成をサポートします。
 */
public final class AlertBuilder {
    private final Alert alert;
    private AlertBuilder(Alert.AlertType type) {
        alert = new Alert(type);
    }

    public static AlertBuilder confirm() {
        return new AlertBuilder(Alert.AlertType.CONFIRMATION);
    }

    public static AlertBuilder error() {
        return new AlertBuilder(Alert.AlertType.ERROR);
    }

    public static AlertBuilder information() {
        return new AlertBuilder(Alert.AlertType.INFORMATION);
    }

    public static AlertBuilder warning() {
        return new AlertBuilder(Alert.AlertType.WARNING);
    }

    public static AlertBuilder none() {
        return new AlertBuilder(Alert.AlertType.NONE);
    }

    public AlertBuilder setContentText(String text) {
        alert.setContentText(text);
        return this;
    }

    public AlertBuilder setTitle(String title) {
        alert.setTitle(title);
        return this;
    }

    public AlertBuilder setGraphic(Node graphic) {
        alert.setGraphic(graphic);
        return this;
    }

    public AlertBuilder initOwner(Window owner) {
        alert.initOwner(owner);
        return this;
    }

    public Alert build() {
        return alert;
    }

    public void show() {
        alert.show();
    }

    public Optional<ButtonType> showAndWait() {
        return alert.showAndWait();
    }
}
