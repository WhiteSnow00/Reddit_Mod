// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import java.util.Iterator;
import f8.h;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class b implements ViewTreeObserver$OnPreDrawListener
{
    public boolean f;
    public final /* synthetic */ View g;
    public final /* synthetic */ n.a h;
    public final /* synthetic */ j i;
    
    public b(final j i, final View g, final a h) {
        this.i = i;
        this.g = g;
        this.h = h;
    }
    
    public final boolean onPreDraw() {
        final ArrayList list = new ArrayList();
        while (true) {
            for (final String s : this.i.m) {
                if (f8.h.b(this.g, s) == null) {
                    final boolean b = false;
                    if (b && !this.f) {
                        this.f = true;
                        final j i = this.i;
                        final View g = this.g;
                        final n.a h = this.h;
                        i.getClass();
                        for (final View view : list) {
                            j.a.a(view, new c(i, view, g, (ViewTreeObserver$OnPreDrawListener)this, h));
                        }
                    }
                    return false;
                }
                list.add(f8.h.b(this.g, s));
            }
            final boolean b = true;
            continue;
        }
    }
}
