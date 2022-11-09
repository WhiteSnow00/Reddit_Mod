// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.Text;
import com.google.gson.a.c;

public final class 10t
{
    @c(LIZ = "room_id")
    public final long LIZ;
    @c(LIZ = "anchor_id")
    public final long LIZIZ;
    @c(LIZ = "sec_anchor_id")
    public final String LIZJ;
    @c(LIZ = "texts")
    public final Text[] LIZLLL;
    
    static {
        Covode.recordClassIndex(10760);
    }
    
    public 10t(final long liz, final long liziz, final String lizj, final Text[] lizlll) {
        CTM.LIZ((Object)lizj, (Object)lizlll);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof 10t) {
                final 10t 10t = (10t)o;
                if (this.LIZ == 10t.LIZ && this.LIZIZ == 10t.LIZIZ && n.LIZ((Object)this.LIZJ, (Object)10t.LIZJ) && n.LIZ((Object)this.LIZLLL, (Object)10t.LIZLLL)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final long liz = this.LIZ;
        final int n = (int)(liz ^ liz >>> 32);
        final long liziz = this.LIZIZ;
        final int n2 = (int)(liziz ^ liziz >>> 32);
        final String lizj = this.LIZJ;
        int hashCode = 0;
        int hashCode2;
        if (lizj != null) {
            hashCode2 = lizj.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Text[] lizlll = this.LIZLLL;
        if (lizlll != null) {
            hashCode = Arrays.hashCode(lizlll);
        }
        return ((n * 31 + n2) * 31 + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AutoTranslateParams(roomId=");
        sb.append(this.LIZ);
        sb.append(", anchorId=");
        sb.append(this.LIZIZ);
        sb.append(", secAnchorId=");
        sb.append(this.LIZJ);
        sb.append(", texts=");
        sb.append(Arrays.toString(this.LIZLLL));
        sb.append(")");
        return sb.toString();
    }
}
