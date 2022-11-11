// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 0y9
{
    public static final 0y9 LIZ;
    public static final 5DO LIZIZ;
    
    static {
        Covode.recordClassIndex(10372);
        LIZ = new 0y9();
        LIZIZ = 3Os.LIZ((QgG)29Q.LIZ);
    }
    
    private final Map<String, Long> LIZ() {
        return (Map)0y9.LIZIZ.getValue();
    }
    
    private final boolean LIZ(long longValue, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(longValue);
        sb.append('-');
        sb.append(s);
        final String string = sb.toString();
        final Long n = this.LIZ().get(string);
        if (n != null) {
            longValue = n;
        }
        else {
            longValue = 0L;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        boolean b;
        if (currentTimeMillis - longValue < 60000L) {
            b = true;
        }
        else {
            b = false;
            0y9.LIZ.LIZ().put(string, currentTimeMillis);
        }
        return b;
    }
    
    public final a LIZ(final String s) {
        CTM.LIZ((Object)s);
        return new a(s);
    }
    
    public final void LIZ(final a a) {
        CTM.LIZ((Object)a);
        if (this.LIZ(a.LIZ, a.LIZIZ)) {
            return;
        }
        final Gkn liz = Gkn.LJFF.LIZ("anchor_audio_guest_voice_wave_show");
        liz.LIZ();
        liz.LIZ("user_id", a.LIZ);
        liz.LIZ("user_type", a.LIZIZ);
        liz.LIZ("to_user_id", a.LJ);
        liz.LIZ("to_user_type", a.LIZLLL);
        liz.LIZ("show_position", a.LIZJ);
        liz.LIZLLL();
    }
    
    public static final class a
    {
        public long LIZ;
        public String LIZIZ;
        public String LIZJ;
        public final String LIZLLL;
        public final long LJ;
        
        static {
            Covode.recordClassIndex(10373);
        }
        
        public a(final String lizlll, final long lj) {
            CTM.LIZ((Object)lizlll);
            this.LIZLLL = lizlll;
            this.LJ = lj;
            this.LIZIZ = "guest";
            this.LIZJ = "room";
        }
        
        public final a LIZ(final long liz, final String liziz) {
            CTM.LIZ((Object)liziz);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof a) {
                    final a a = (a)o;
                    if (n.LIZ((Object)this.LIZLLL, (Object)a.LIZLLL) && this.LJ == a.LJ) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final String lizlll = this.LIZLLL;
            int hashCode;
            if (lizlll != null) {
                hashCode = lizlll.hashCode();
            }
            else {
                hashCode = 0;
            }
            final long lj = this.LJ;
            return hashCode * 31 + (int)(lj ^ lj >>> 32);
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("TalkEvent(toUserType=");
            sb.append(this.LIZLLL);
            sb.append(", toUserId=");
            sb.append(this.LJ);
            sb.append(")");
            return sb.toString();
        }
    }
}
