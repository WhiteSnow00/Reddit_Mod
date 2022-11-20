// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.content.Context;
import android.view.SubMenu;

public final class l extends MenuBuilder implements SubMenu
{
    public MenuBuilder a;
    public g b;
    
    public l(final Context context, final MenuBuilder a, final g b) {
        super(context);
        this.a = a;
        this.b = b;
    }
    
    public final boolean collapseItemActionView(final g g) {
        return this.a.collapseItemActionView(g);
    }
    
    public final boolean dispatchMenuItemSelected(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        return super.dispatchMenuItemSelected(menuBuilder, menuItem) || this.a.dispatchMenuItemSelected(menuBuilder, menuItem);
    }
    
    public final boolean expandItemActionView(final g g) {
        return this.a.expandItemActionView(g);
    }
    
    public final String getActionViewStatesKey() {
        final g b = this.b;
        int a;
        if (b != null) {
            a = b.a;
        }
        else {
            a = 0;
        }
        if (a == 0) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(super.getActionViewStatesKey());
        sb.append(":");
        sb.append(a);
        return sb.toString();
    }
    
    public final MenuItem getItem() {
        return (MenuItem)this.b;
    }
    
    public final MenuBuilder getRootMenu() {
        return this.a.getRootMenu();
    }
    
    public final boolean isGroupDividerEnabled() {
        return this.a.isGroupDividerEnabled();
    }
    
    public final boolean isQwertyMode() {
        return this.a.isQwertyMode();
    }
    
    public final boolean isShortcutsVisible() {
        return this.a.isShortcutsVisible();
    }
    
    public final void setCallback(final MenuBuilder$a callback) {
        this.a.setCallback(callback);
    }
    
    public final void setGroupDividerEnabled(final boolean groupDividerEnabled) {
        this.a.setGroupDividerEnabled(groupDividerEnabled);
    }
    
    public final SubMenu setHeaderIcon(final int headerIconInt) {
        return (SubMenu)super.setHeaderIconInt(headerIconInt);
    }
    
    public final SubMenu setHeaderIcon(final Drawable headerIconInt) {
        return (SubMenu)super.setHeaderIconInt(headerIconInt);
    }
    
    public final SubMenu setHeaderTitle(final int headerTitleInt) {
        return (SubMenu)super.setHeaderTitleInt(headerTitleInt);
    }
    
    public final SubMenu setHeaderTitle(final CharSequence headerTitleInt) {
        return (SubMenu)super.setHeaderTitleInt(headerTitleInt);
    }
    
    public final SubMenu setHeaderView(final View headerViewInt) {
        return (SubMenu)super.setHeaderViewInt(headerViewInt);
    }
    
    public final SubMenu setIcon(final int icon) {
        this.b.setIcon(icon);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final Drawable icon) {
        this.b.setIcon(icon);
        return (SubMenu)this;
    }
    
    public final void setQwertyMode(final boolean qwertyMode) {
        this.a.setQwertyMode(qwertyMode);
    }
    
    public final void setShortcutsVisible(final boolean shortcutsVisible) {
        this.a.setShortcutsVisible(shortcutsVisible);
    }
}
