// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import n5.e;
import pg2.j;
import java.util.concurrent.Callable;

public final class p implements Callable<j>
{
    public final /* synthetic */ String f;
    public final /* synthetic */ q g;
    
    public p(final q g, final String f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        final e a = this.g.i.a();
        final String f = this.f;
        if (f == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, f);
        }
        this.g.f.c();
        try {
            a.executeUpdateDelete();
            this.g.f.q();
            return j.a;
        }
        finally {
            this.g.f.m();
            this.g.i.c(a);
        }
    }
}
