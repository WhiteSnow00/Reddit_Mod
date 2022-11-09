// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import j5.e;
import java.util.ArrayList;
import java.util.List;
import pg2.j;
import java.util.concurrent.Callable;

public final class r implements Callable<j>
{
    public final /* synthetic */ List f;
    public final /* synthetic */ q g;
    
    public r(final q g, final ArrayList f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        this.g.f.c();
        try {
            ((e<Object>)this.g.g).e(this.f);
            this.g.f.q();
            return j.a;
        }
        finally {
            this.g.f.m();
        }
    }
}
