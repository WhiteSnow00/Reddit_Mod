// 
// Decompiled by Procyon v0.6.0
// 

package t0;

import android.graphics.Rect;
import pg2.j;
import c2.l;
import n1.d;
import ah2.f;
import android.view.View;

public final class a implements c
{
    public final View f;
    
    public a(final View f) {
        ah2.f.f((Object)f, "view");
        this.f = f;
    }
    
    @Override
    public final Object a(d e, final l l, final tg2.c<? super j> c) {
        e = e.e(gn.a.Q1(l));
        this.f.requestRectangleOnScreen(new Rect((int)e.a, (int)e.b, (int)e.c, (int)e.d), false);
        return j.a;
    }
}
