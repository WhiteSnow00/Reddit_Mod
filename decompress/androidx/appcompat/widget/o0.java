// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.PopupWindow$OnDismissListener;
import android.view.MenuItem;
import android.view.Menu;
import k.g;
import androidx.appcompat.view.menu.h;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import android.content.Context;

public class o0
{
    public final Context a;
    public final MenuBuilder b;
    public final View c;
    public final h d;
    public a e;
    public n0 f;
    
    public o0(final Context a, final View c, final int g) {
        this.a = a;
        this.c = c;
        final MenuBuilder b = new MenuBuilder(a);
        (this.b = b).setCallback((MenuBuilder.MenuBuilder$a)new l0(this));
        final h d = new h(2130969481, 0, a, c, b, false);
        this.d = d;
        d.g = g;
        d.k = (PopupWindow$OnDismissListener)new m0(this);
    }
    
    public final void a(final int n) {
        new g(this.a).inflate(n, (Menu)this.b);
    }
    
    public void b() {
        final h d = this.d;
        final boolean b = d.b();
        boolean b2 = true;
        if (!b) {
            if (d.f == null) {
                b2 = false;
            }
            else {
                d.d(0, 0, false, false);
            }
        }
        if (b2) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
    
    public interface a
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
}
