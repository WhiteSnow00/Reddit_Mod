// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor;

import android.view.ViewParent;
import java.util.Iterator;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class b implements c$c
{
    public final Controller a;
    public final c b;
    public final ControllerChangeType c;
    public final Controller d;
    public final ControllerChangeType e;
    public final List f;
    public final boolean g;
    public final ViewGroup h;
    public final View i;
    
    public b(final Controller a, final c b, final ControllerChangeType c, final Controller d, final ControllerChangeType e, final List f, final boolean g, final ViewGroup h, final View i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void a() {
        final Controller a = this.a;
        if (a != null) {
            a.JA(this.b, this.c);
        }
        final Controller d = this.d;
        if (d != null) {
            com.bluelinelabs.conductor.c.h.remove(d.s);
            this.d.JA(this.b, this.e);
        }
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ((c$d)iterator.next()).a(this.d, this.a, this.g, this.h, this.b);
        }
        if (this.b.f) {
            final View i = this.i;
            if (i != null) {
                final ViewParent parent = i.getParent();
                if (parent != null && parent instanceof ViewGroup) {
                    ((ViewGroup)parent).removeView(this.i);
                }
            }
        }
        if (this.b.i()) {
            final Controller a2 = this.a;
            if (a2 != null) {
                a2.u = false;
            }
        }
    }
}
