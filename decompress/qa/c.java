// 
// Decompiled by Procyon v0.6.0
// 

package qa;

import com.google.android.datatransport.runtime.b;
import ha.g;
import javax.inject.Inject;
import ta.a;
import la.d;
import java.util.concurrent.Executor;
import ra.o;
import java.util.logging.Logger;

public final class c implements e
{
    public static final Logger f;
    public final o a;
    public final Executor b;
    public final d c;
    public final sa.d d;
    public final a e;
    
    static {
        f = Logger.getLogger(com.google.android.datatransport.runtime.d.class.getName());
    }
    
    @Inject
    public c(final Executor b, final d c, final o a, final sa.d d, final a e) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final g g, final com.google.android.datatransport.runtime.a a, final b b) {
        this.b.execute((Runnable)new qa.a((Object)this, (Object)b, (Object)g, (Object)a, 0));
    }
}
