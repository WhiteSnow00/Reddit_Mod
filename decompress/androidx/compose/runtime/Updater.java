// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import rg2.p;
import sg2.e;
import hg2.j;
import rg2.l;
import z0.d;

public final class Updater<T>
{
    public static final void a(final d d, final l<? super T, j> l) {
        e.f((Object)l, "block");
        if (d.r()) {
            d.a((Object)j.a, (p)new Updater$init$1((l)l));
        }
    }
    
    public static final <V> void b(final d d, final V v, final p<? super T, ? super V, j> p3) {
        e.f((Object)p3, "block");
        if (d.r() || !e.a(d.B(), (Object)v)) {
            d.w((Object)v);
            d.a((Object)v, (p)p3);
        }
    }
}
