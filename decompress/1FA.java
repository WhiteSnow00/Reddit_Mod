// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.SubMenu;

public final class 1fa extends 135 implements SubMenu
{
    public final 13w LIZIZ;
    
    static {
        Covode.recordClassIndex(373);
    }
    
    public 1fa(final Context context, final 13w liziz) {
        super(context, liziz);
        this.LIZIZ = liziz;
    }
    
    public final void clearHeader() {
        this.LIZIZ.clearHeader();
    }
    
    public final MenuItem getItem() {
        return this.LIZ(this.LIZIZ.getItem());
    }
    
    public final SubMenu setHeaderIcon(final int headerIcon) {
        this.LIZIZ.setHeaderIcon(headerIcon);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderIcon(final Drawable headerIcon) {
        this.LIZIZ.setHeaderIcon(headerIcon);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final int headerTitle) {
        this.LIZIZ.setHeaderTitle(headerTitle);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final CharSequence headerTitle) {
        this.LIZIZ.setHeaderTitle(headerTitle);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderView(final View headerView) {
        this.LIZIZ.setHeaderView(headerView);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final int icon) {
        this.LIZIZ.setIcon(icon);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final Drawable icon) {
        this.LIZIZ.setIcon(icon);
        return (SubMenu)this;
    }
}
