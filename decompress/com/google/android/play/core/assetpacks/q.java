// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import eg.s0;
import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.util.List;
import eg.y0;
import java.io.File;
import eg.k1;
import dg.k;

public final class q
{
    public static final k b;
    public final c a;
    
    static {
        b = new k("VerifySliceTaskHandler");
    }
    
    public q(final c a) {
        this.a = a;
    }
    
    public final void a(final k1 k1) {
        final File i = this.a.k(k1.d, ((s0)k1).b, k1.f, k1.e);
        if (i.exists()) {
            try {
                final c a = this.a;
                final String b = ((s0)k1).b;
                final int d = k1.d;
                final long e = k1.e;
                final String f = k1.f;
                a.getClass();
                final File file = new File(new File(new File(a.c(d, b, e), "_slices"), "_metadata"), f);
                if (file.exists()) {
                    final ArrayList a2 = p.a(i, file);
                    try {
                        if (!y0.b(a2).equals(k1.g)) {
                            throw new zzck(String.format("Verification failed for slice %s.", k1.f), ((s0)k1).c);
                        }
                        q.b.j("Verification of slice %s of pack %s successful.", new Object[] { k1.f, ((s0)k1).b });
                        final File l = this.a.l(k1.d, ((s0)k1).b, k1.f, k1.e);
                        if (!l.exists()) {
                            l.mkdirs();
                        }
                        if (i.renameTo(l)) {
                            return;
                        }
                        throw new zzck(String.format("Failed to move slice %s after verification.", k1.f), ((s0)k1).c);
                    }
                    catch (final IOException ex) {
                        throw new zzck(String.format("Could not digest file during verification for slice %s.", k1.f), ex, ((s0)k1).c);
                    }
                    catch (final NoSuchAlgorithmException ex2) {
                        throw new zzck("SHA256 algorithm not supported.", ex2, ((s0)k1).c);
                    }
                }
                throw new zzck(String.format("Cannot find metadata files for slice %s.", k1.f), ((s0)k1).c);
            }
            catch (final IOException ex3) {
                throw new zzck(String.format("Could not reconstruct slice archive during verification for slice %s.", k1.f), ex3, ((s0)k1).c);
            }
        }
        throw new zzck(String.format("Cannot find unverified files for slice %s.", k1.f), ((s0)k1).c);
    }
}
