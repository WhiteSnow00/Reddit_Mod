// 
// Decompiled by Procyon v0.6.0
// 

package i5;

import m5.f;
import jw1.a$a;
import ng2.e;
import com.reddit.session.RedditSessionManager;
import jw1.d;
import o.a;

public final class b implements a
{
    public final int f;
    
    public b(final int f) {
        this.f = f;
    }
    
    @Override
    public final Object apply(Object n) {
        switch (this.f) {
            default: {
                final d d = (d)n;
                n = RedditSessionManager.N;
                e.f((Object)d, "prototype");
                return jw1.a.p(a$a.a(d), (String)null, (String)null, (Long)null, (String)null, (String)null, (Long)null, (String)null, (String)null, 1019);
            }
            case 1: {
                return ((f)n).executeUpdateDelete();
            }
            case 0: {
                final m5.b b = (m5.b)n;
                return null;
            }
        }
    }
}
