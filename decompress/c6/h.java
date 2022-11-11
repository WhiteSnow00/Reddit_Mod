// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import java.util.concurrent.Future;
import cg.r0;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import ej2.k;
import com.google.android.play.core.assetpacks.b;
import android.content.Intent;
import cg.v0;
import cg.g1;
import lg.c;
import ng.a;
import og.o;

public final class h implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    
    public h(final og.h h, final o g) {
        this.f = 5;
        this.h = h;
        this.g = g;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                synchronized (((og.h)this.h).b) {
                    final Object h = this.h;
                    if (((og.h)h).c != null) {
                        final og.b c = ((og.h)h).c;
                        final o o = (o)this.g;
                        synchronized (o.a) {
                            final Exception e = o.e;
                            monitorexit(o.a);
                            c.a(e);
                        }
                    }
                    return;
                }
                break;
            }
            case 4: {
                final a a = (a)this.g;
                final c c2 = (c)this.h;
                a.f.L(c2);
                a.g.L(c2);
                return;
            }
            case 3: {
                final com.google.android.play.core.assetpacks.o o2 = (com.google.android.play.core.assetpacks.o)this.g;
                final g1 g1 = (g1)this.h;
                o2.a.a(g1.d, ((r0)g1).b, g1.e);
                return;
            }
            case 2: {
                final v0 v0 = (v0)this.g;
                v0.b.a(v0.c, (Intent)this.h);
                return;
            }
            case 1: {
                ((hg.c)this.g).c((Object)this.h);
                return;
            }
            case 0: {
                try {
                    ((lg2.c)this.g).resumeWith(Result.constructor-impl(((Future<Object>)this.h).get()));
                }
                finally {
                    final Throwable t;
                    Throwable cause;
                    if ((cause = t.getCause()) == null) {
                        cause = t;
                    }
                    if (t instanceof CancellationException) {
                        ((k)this.g).o(cause);
                    }
                    else {
                        ((lg2.c)this.g).resumeWith(Result.constructor-impl((Object)yd.b.o(cause)));
                    }
                }
            }
        }
    }
}
