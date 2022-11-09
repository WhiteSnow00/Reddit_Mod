// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import eg.s0;
import eg.r0;
import ie.e;
import com.android.billingclient.api.l0;
import java.io.IOException;
import com.android.billingclient.api.m0;
import java.io.File;
import eg.c1;
import eg.e1;
import gg.b;
import java.util.concurrent.Executor;
import eg.u1;
import ig.k0;

public final class l
{
    public final c a;
    public final k0<u1> b;
    public final i c;
    public final k0<Executor> d;
    public final eg.k0 e;
    public final b f;
    public final e1 g;
    
    public l(final c a, final k0<u1> b, final i c, final k0<Executor> d, final eg.k0 e, final b f, final e1 g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void a(final c1 c1) {
        final c a = this.a;
        final String b = ((s0)c1).b;
        final int d = c1.d;
        final long e = c1.e;
        a.getClass();
        final File file = new File(a.c(d, b, e), "_packs");
        final c a2 = this.a;
        final String b2 = ((s0)c1).b;
        final int d2 = c1.d;
        final long e2 = c1.e;
        a2.getClass();
        final File file2 = new File(new File(a2.c(d2, b2, e2), "_slices"), "_metadata");
        if (!file.exists() || !file2.exists()) {
            throw new zzck(String.format("Cannot find pack files to move for pack %s.", ((s0)c1).b), ((s0)c1).c);
        }
        final File j = this.a.j(c1.d, ((s0)c1).b, c1.e);
        j.mkdirs();
        if (!file.renameTo(j)) {
            throw new zzck("Cannot move merged pack files to final location.", ((s0)c1).c);
        }
        new File(this.a.j(c1.d, ((s0)c1).b, c1.e), "merge.tmp").delete();
        final c a3 = this.a;
        final String b3 = ((s0)c1).b;
        final int d3 = c1.d;
        final long e3 = c1.e;
        a3.getClass();
        final File file3 = new File(a3.j(d3, b3, e3), "_metadata");
        file3.mkdirs();
        if (file2.renameTo(file3)) {
            Label_0413: {
                if (this.f.a()) {
                    try {
                        this.g.b(c1.d, ((s0)c1).b, c1.f, c1.e);
                        ((Executor)this.d.zza()).execute(new m0(7, this, c1));
                        break Label_0413;
                    }
                    catch (final IOException ex) {
                        throw new zzck(String.format("Could not write asset pack version tag for pack %s: %s", ((s0)c1).b, ex.getMessage()), ((s0)c1).c);
                    }
                }
                final Executor executor = (Executor)this.d.zza();
                final c a4 = this.a;
                a4.getClass();
                executor.execute(new l0(a4, 7));
            }
            final i c2 = this.c;
            final String b4 = ((s0)c1).b;
            final int d4 = c1.d;
            final long e4 = c1.e;
            c2.getClass();
            c2.d((eg.r0<Object>)new e(c2, b4, d4, e4));
            this.e.a(((s0)c1).b);
            ((u1)this.b.zza()).b(((s0)c1).c, ((s0)c1).b);
            return;
        }
        throw new zzck("Cannot move metadata files to final location.", ((s0)c1).c);
    }
}
