package org.atoyr.fxutils;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

/**
 * Nodeにアンカーを設定するためのメソッドを提供します。
 *
 * このクラスはスレッドセーフではありません。
 */
public final class Anchoring {
    private static final Anchoring SINGLETON = new Anchoring(null);

    private Node node;

    public Anchoring(Node node) {
        this.node = node;
    }

    public Anchoring setNode(Node node) {
        this.node = node;
        return this;
    }

    public Node getNode() {
        return node;
    }

    /**
     * nodeのアンカーを設定するAnchoringオブジェクトを返します。
     * このメソッドで返されるオブジェクトは事前に生成されたシングルトンを使用します。
     * @param node アンカーを設定するNode
     * @return nodeを保持するシングルトンAnchoringオブジェクト
     */
    public static Anchoring anchoring(Node node) {
        return SINGLETON.setNode(node);
    }

    public Anchoring top(double value)
    {
        AnchorPane.setTopAnchor(node, value);
        return this;
    }

    public Anchoring bottom(double value) {
        AnchorPane.setBottomAnchor(node, value);
        return this;
    }

    public Anchoring left(double value) {
        AnchorPane.setLeftAnchor(node, value);
        return this;
    }

    public Anchoring right(double value) {
        AnchorPane.setRightAnchor(node, value);
        return this;
    }
}
