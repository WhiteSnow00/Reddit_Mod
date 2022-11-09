// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import android.media.metrics.LogSessionId;
import bd.d0;
import bd.c0;

public final class b0
{
    public final a a;
    
    static {
        if (c0.a < 31) {
            new b0();
        }
        else {
            final int b = a.b;
        }
    }
    
    public b0() {
        this(null);
        d0.f(c0.a < 31);
    }
    
    public b0(final a a) {
        this.a = a;
    }
    
    public static final class a
    {
        public static final /* synthetic */ int b = 0;
        public final LogSessionId a;
        
        static {
            final LogSessionId log_SESSION_ID_NONE = LogSessionId.LOG_SESSION_ID_NONE;
        }
        
        public a(final LogSessionId a) {
            this.a = a;
        }
    }
}
