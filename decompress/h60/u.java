// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import j5.e;
import com.reddit.data.room.dao.b;
import i60.h;
import java.util.concurrent.Callable;

public final class u implements Callable<Long>
{
    public final /* synthetic */ h f;
    public final /* synthetic */ b g;
    
    public u(final b g, final h f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        this.g.f.c();
        try {
            final long h = ((e<h>)this.g.h).h(this.f);
            this.g.f.q();
            this.g.f.m();
            return h;
        }
        finally {
            this.g.f.m();
        }
    }
}
