// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import eg.s0;
import java.io.File;
import eg.r0;
import ie.e;
import eg.r;
import eg.h1;
import java.util.concurrent.Executor;
import eg.u1;
import ig.k0;

public final class n
{
    public final c a;
    public final k0<u1> b;
    public final i c;
    public final k0<Executor> d;
    public final eg.k0 e;
    
    public n(final c a, final k0<u1> b, final i c, final k0<Executor> d, final eg.k0 e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final h1 h1) {
        final File j = this.a.j(h1.d, ((s0)h1).b, h1.f);
        if (!j.exists()) {
            throw new zzck(String.format("Cannot find pack files to promote for pack %s at %s", ((s0)h1).b, j.getAbsolutePath()), ((s0)h1).c);
        }
        final File i = this.a.j(h1.e, ((s0)h1).b, h1.f);
        i.mkdirs();
        if (j.renameTo(i)) {
            ((Executor)this.d.zza()).execute((Runnable)new r(2, (Object)this, (Object)h1));
            final i c = this.c;
            final String b = ((s0)h1).b;
            final int e = h1.e;
            final long f = h1.f;
            c.getClass();
            c.d((eg.r0<Object>)new e(c, b, e, f));
            this.e.a(((s0)h1).b);
            ((u1)this.b.zza()).b(((s0)h1).c, ((s0)h1).b);
            return;
        }
        throw new zzck(String.format("Cannot promote pack %s from %s to %s", ((s0)h1).b, j.getAbsolutePath(), i.getAbsolutePath()), ((s0)h1).c);
    }
}
