// 
// Decompiled by Procyon v0.6.0
// 

package l;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import t3.a;
import android.content.Context;
import t3.c;
import android.view.SubMenu;

public final class g extends e implements SubMenu
{
    public final c e;
    
    public g(final Context context, final c e) {
        super(context, (a)e);
        this.e = e;
    }
    
    public final void clearHeader() {
        ((SubMenu)this.e).clearHeader();
    }
    
    public final MenuItem getItem() {
        return ((b)this).c(((SubMenu)this.e).getItem());
    }
    
    public final SubMenu setHeaderIcon(final int headerIcon) {
        ((SubMenu)this.e).setHeaderIcon(headerIcon);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderIcon(final Drawable headerIcon) {
        ((SubMenu)this.e).setHeaderIcon(headerIcon);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final int headerTitle) {
        ((SubMenu)this.e).setHeaderTitle(headerTitle);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final CharSequence headerTitle) {
        ((SubMenu)this.e).setHeaderTitle(headerTitle);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderView(final View headerView) {
        ((SubMenu)this.e).setHeaderView(headerView);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final int icon) {
        ((SubMenu)this.e).setIcon(icon);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final Drawable icon) {
        ((SubMenu)this.e).setIcon(icon);
        return (SubMenu)this;
    }
}
