// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import n5.e;
import java.util.concurrent.Callable;

public final class y0 implements Callable<Void>
{
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ v0 h;
    
    public y0(final v0 h, final boolean f, final String g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object call() throws Exception {
        final e a = this.h.m.a();
        a.bindLong(1, this.f ? 1 : 0);
        final String g = this.g;
        if (g == null) {
            a.bindNull(2);
        }
        else {
            a.bindString(2, g);
        }
        this.h.f.c();
        try {
            a.executeUpdateDelete();
            this.h.f.q();
            return null;
        }
        finally {
            this.h.f.m();
            this.h.m.c(a);
        }
    }
}
