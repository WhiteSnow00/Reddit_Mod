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
import ra.n;
import java.util.logging.Logger;

public final class c implements e
{
    public static final Logger f;
    public final n a;
    public final Executor b;
    public final d c;
    public final sa.d d;
    public final a e;
    
    static {
        f = Logger.getLogger(com.google.android.datatransport.runtime.d.class.getName());
    }
    
    @Inject
    public c(final Executor b, final d c, final n a, final sa.d d, final a e) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a(final g g, final com.google.android.datatransport.runtime.a a, final b b) {
        this.b.execute(new qa.a(this, b, g, a, 0));
    }
}
