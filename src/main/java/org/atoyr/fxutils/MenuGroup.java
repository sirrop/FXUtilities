package org.atoyr.fxutils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.MenuItem;

import java.util.Collection;

/**
 * 複数のメニュー・メニューアイテムをまとめ、有効化・無効化の切り替えをサポートします。
 */
public class MenuGroup {
    private final ObservableList<MenuItem> delegate;

    public MenuGroup(Collection<? extends MenuItem> c) {
        delegate = FXCollections.observableArrayList(c);
    }

    public MenuGroup(MenuItem... menuItems) {
        delegate = FXCollections.observableArrayList(menuItems);
    }

    public MenuGroup() {
        delegate = FXCollections.observableArrayList();
    }

    /**
     * このグループに登録されているすべてのMenuItemのdisableを設定します
     * @param value disable
     */
    public void setDisable(boolean value) {
        for (MenuItem mi: delegate) {
            mi.setDisable(value);
        }
    }

    public boolean add(MenuItem menuItem) {
        return delegate.add(menuItem);
    }

    public boolean addAll(MenuItem... menuItems) {
        return delegate.addAll(menuItems);
    }

    public boolean addAll(Collection<? extends MenuItem> c) {
        return delegate.addAll(c);
    }

    public boolean remove(MenuItem menuItem) {
        return delegate.remove(menuItem);
    }

    public boolean removeAll(MenuItem... menuItems) {
        return delegate.removeAll(menuItems);
    }

    public boolean removeAll(Collection<? extends MenuItem> c) {
        return delegate.removeAll(c);
    }
}
