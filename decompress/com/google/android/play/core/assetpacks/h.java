// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import kc.f;
import eg.r0;
import g3.d;
import java.util.concurrent.atomic.AtomicBoolean;
import eg.u1;
import ig.k0;
import dg.k;

public final class h
{
    public static final k k;
    public final i a;
    public final g b;
    public final q c;
    public final com.google.android.play.core.assetpacks.k d;
    public final l e;
    public final m f;
    public final n g;
    public final k0<u1> h;
    public final j i;
    public final AtomicBoolean j;
    
    static {
        k = new k("ExtractorLooper");
    }
    
    public h(final i a, final k0<u1> h, final g b, final q c, final com.google.android.play.core.assetpacks.k d, final l e, final m f, final n g, final j i) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.i = i;
        this.j = new AtomicBoolean(false);
    }
    
    public final void a(final int n, final Exception ex) {
        try {
            final i a = this.a;
            a.getClass();
            a.d((eg.r0<Object>)new d(a, n));
            final i a2 = this.a;
            a2.getClass();
            a2.d((eg.r0<Object>)new f(a2, n));
        }
        catch (final zzck zzck) {
            com.google.android.play.core.assetpacks.h.k.h("Error during error handling: %s", new Object[] { ex.getMessage() });
        }
    }
}
