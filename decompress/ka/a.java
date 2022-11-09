// 
// Decompiled by Procyon v0.6.0
// 

package ka;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import oa.c;
import oa.e;
import ci.d;
import di.b;

public final class a implements di.a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public final void configure(final b<?> b) {
        b.a((Class)g.class, (d)ka.a.a$e.a);
        b.a((Class)oa.a.class, (d)ka.a.a$a.a);
        b.a((Class)e.class, (d)ka.a.a$g.a);
        b.a((Class)c.class, (d)ka.a.a$d.a);
        b.a((Class)LogEventDropped.class, (d)ka.a.a$c.a);
        b.a((Class)oa.b.class, (d)ka.a.a$b.a);
        b.a((Class)oa.d.class, (d)ka.a.a$f.a);
    }
}
