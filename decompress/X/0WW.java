// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0WW
{
    public static final a LIZ;
    
    static {
        Covode.recordClassIndex(5052);
        LIZ = new a((byte)0);
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(5053);
        }
        
        public final GGc LIZ(final String s, final Throwable t) {
            CTM.LIZ((Object)s, (Object)t);
            final GGc lizj = 0WY.LIZ.LIZJ(s);
            lizj.LIZ(t);
            return lizj;
        }
        
        public final GGc LIZIZ(final String s, final Throwable t) {
            CTM.LIZ((Object)s, (Object)t);
            final GGc lizj = 0WY.LIZ.LIZJ(s);
            CTM.LIZ((Object)t);
            if (t instanceof 1mo) {
                final 1mo 1mo = (1mo)t;
                lizj.LIZ("url", 1mo.getUrl());
                lizj.LIZIZ("error_code", Integer.valueOf(1mo.getErrorCode()));
                lizj.LIZIZ("error_msg", 1mo.getErrorMsg());
                lizj.LIZ("error_alert", 1mo.getAlert());
                lizj.LIZ("error_prompt", 1mo.getPrompt());
                return lizj;
            }
            if (t instanceof 1Ev) {
                final 1Ev 1Ev = (1Ev)t;
                lizj.LIZIZ("error_code", Integer.valueOf(1Ev.getErrorCode()));
                lizj.LIZIZ("error_msg", 1Ev.getErrorMsg());
                lizj.LIZ("error_alert", 1Ev.getAlert());
                lizj.LIZ("error_prompt", 1Ev.getPrompt());
                return lizj;
            }
            if (t instanceof 1i1) {
                lizj.LIZIZ("error_code", Integer.valueOf(1));
                lizj.LIZIZ("error_msg", t.getMessage());
                return lizj;
            }
            0ba.LIZ("LiveBroadcastBusinessLog", t);
            lizj.LIZIZ("error_code", Integer.valueOf(1));
            lizj.LIZIZ("error_msg", t.getMessage());
            return lizj;
        }
    }
}
