// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior$b;

public final class g implements SwipeDismissBehavior$b
{
    public final /* synthetic */ BaseTransientBottomBar a;
    
    public g(final BaseTransientBottomBar a) {
        this.a = a;
    }
    
    public final void a(final View view) {
        view.setVisibility(8);
        this.a.b(0);
    }
    
    public final void b(final int n) {
        if (n != 0) {
            if (n != 1 && n != 2) {
                return;
            }
            final i b = i.b();
            final i.b m = this.a.m;
            synchronized (b.a) {
                if (!b.c(m)) {
                    return;
                }
                final i.c c = b.c;
                if (!c.c) {
                    c.c = true;
                    b.b.removeCallbacksAndMessages((Object)c);
                }
                return;
            }
        }
        final i b2 = i.b();
        final i.b i = this.a.m;
        synchronized (b2.a) {
            if (b2.c(i)) {
                final i.c c2 = b2.c;
                if (c2.c) {
                    c2.c = false;
                    b2.d(c2);
                }
            }
        }
    }
}
