// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import android.media.metrics.LogSessionId;
import ad.d0;

public final class c0
{
    public final a a;
    
    static {
        if (ad.c0.a < 31) {
            new c0();
        }
        else {
            final int b = a.b;
        }
    }
    
    public c0() {
        this(null);
        d0.f(ad.c0.a < 31);
    }
    
    public c0(final a a) {
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
