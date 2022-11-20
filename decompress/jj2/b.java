// 
// Decompiled by Procyon v0.6.0
// 

package jj2;

import kotlin.Result;
import cg2.j;
import gg2.c;
import cg.d;
import mg2.l;

public final class b implements Runnable
{
    public final a f;
    public final l g;
    
    public b(final a f, final l g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        if (this.f.l()) {
            final l g = this.g;
            final a f = this.f;
            f.getClass();
            try {
                zg.a.h0(d.e3(d.z1(g, (c)f)), Result.constructor-impl((Object)j.a), (l)null);
            }
            finally {
                final Throwable t;
                f.resumeWith(Result.constructor-impl((Object)d.B1(t)));
            }
        }
    }
}
