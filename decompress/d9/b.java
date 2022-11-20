// 
// Decompiled by Procyon v0.6.0
// 

package d9;

import java.util.concurrent.ScheduledFuture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p8.g;
import r8.m;
import he.w5;
import ai2.h;
import mg.d0;
import he.bd;
import he.cc;
import ih.i;
import java.util.concurrent.ConcurrentHashMap;
import ng2.e;
import hh2.d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.a;
import he.r5;
import he.od;
import he.q5;
import he.jc;

public final class b implements c, we.c, jc
{
    public Object f;
    public Object g;
    public Object h;
    
    public b() {
        this.f = new int[] { 0 };
        this.g = new int[] { 0 };
        this.h = new int[] { 0 };
    }
    
    public b(final q5 h, final od f, final r5 g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    public b(final Object f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public b(final a f, final d g) {
        e.f((Object)f, "resolver");
        this.f = f;
        this.g = g;
        this.h = new ConcurrentHashMap();
    }
    
    public final void a(final String s) {
        ((r5)this.g).d(i.a(s));
    }
    
    public final void c(final cc cc) {
        final bd bd = (bd)cc;
        final od od = (od)this.f;
        od.t = true;
        final String g = bd.g;
        od.getClass();
        d0.v(g);
        od.g = g;
        ((h)((q5)this.h).f).n0((od)this.f, (jc)new w5(this, (jc)this));
    }
    
    public final m f(final m m, final g g) {
        final Drawable drawable = m.get();
        if (drawable instanceof BitmapDrawable) {
            return ((c)this.g).f((m)y8.e.b((s8.d)this.f, ((BitmapDrawable)drawable).getBitmap()), g);
        }
        if (drawable instanceof c9.c) {
            return ((c)this.h).f(m, g);
        }
        return null;
    }
    
    public final void k(final we.g g) {
        final md.c c = (md.c)this.f;
        final String s = (String)this.g;
        final ScheduledFuture scheduledFuture = (ScheduledFuture)this.h;
        synchronized (c.a) {
            c.a.remove((Object)s);
            monitorexit(c.a);
            scheduledFuture.cancel(false);
        }
    }
}
