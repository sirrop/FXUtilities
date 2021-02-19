package org.atoyr.fxutils;

import javafx.scene.Node;

public final class NodeUtils {
    private NodeUtils() {}

    public static void show(Node node) {
        node.setVisible(true);
        node.setManaged(true);
    }

    public static void hide(Node node) {
        node.setVisible(false);
        node.setManaged(false);
    }

    public static Anchoring anchoring(Node node) {
        return Anchoring.anchoring(node);
    }
}
