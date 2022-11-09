// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.live.base.model.user.User;

public final class 10h
{
    public static final a LJIIIZ;
    public final long LIZ;
    public User LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public H31 LJFF;
    public PinMessage LJI;
    public long LJII;
    public b LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(10729);
        LJIIIZ = new a((byte)0);
    }
    
    public 10h(final long liz, final b ljiiiizz) {
        CTM.LIZ((Object)ljiiiizz);
        this.LIZ = liz;
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = 0L;
        this.LJIIIIZZ = ljiiiizz;
    }
    
    public final long LIZ() {
        final long ljii = this.LJII;
        if (ljii > 0L) {
            return (long)Math.ceil(ljii / 1000.0);
        }
        return -1L;
    }
    
    public final void LIZ(final b ljiiiizz) {
        CTM.LIZ((Object)ljiiiizz);
        this.LJIIIIZZ = ljiiiizz;
    }
    
    public final long LIZIZ() {
        final PinMessage lji = this.LJI;
        if (lji != null) {
            return lji.LJIIJ;
        }
        return 0L;
    }
    
    public final long LIZJ() {
        final PinMessage lji = this.LJI;
        if (lji != null) {
            return ((H31)lji).getMessageId();
        }
        return 0L;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof 10h) {
                final PinMessage lji = this.LJI;
                final Object o2 = null;
                Long value;
                if (lji != null) {
                    value = lji.LJIIJ;
                }
                else {
                    value = null;
                }
                final PinMessage lji2 = ((10h)o).LJI;
                Object value2 = o2;
                if (lji2 != null) {
                    value2 = lji2.LJIIJ;
                }
                if (n.LIZ((Object)value, value2)) {
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
        final User liziz = this.LIZIZ;
        int hashCode = 0;
        int hashCode2;
        if (liziz != null) {
            hashCode2 = liziz.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int lizj = this.LIZJ ? 1 : 0;
        int n2 = 1;
        int n3 = lizj;
        if (lizj != 0) {
            n3 = 1;
        }
        int lizlll;
        if ((lizlll = (this.LIZLLL ? 1 : 0)) != 0) {
            lizlll = 1;
        }
        if (!this.LJ) {
            n2 = 0;
        }
        final H31 ljff = this.LJFF;
        int hashCode3;
        if (ljff != null) {
            hashCode3 = ljff.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final PinMessage lji = this.LJI;
        int hashCode4;
        if (lji != null) {
            hashCode4 = lji.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final long ljii = this.LJII;
        final int n4 = (int)(ljii ^ ljii >>> 32);
        final b ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            hashCode = ljiiiizz.hashCode();
        }
        return (((((((n * 31 + hashCode2) * 31 + n3) * 31 + lizlll) * 31 + n2) * 31 + hashCode3) * 31 + hashCode4) * 31 + n4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PinModel(roomId=");
        sb.append(this.LIZ);
        sb.append(", pinUser=");
        sb.append(this.LIZIZ);
        sb.append(", isUnderReview=");
        sb.append(this.LIZJ);
        sb.append(", isRejected=");
        sb.append(this.LIZLLL);
        sb.append(", hasUnpinPermission=");
        sb.append(this.LJ);
        sb.append(", message=");
        sb.append(this.LJFF);
        sb.append(", pinMessage=");
        sb.append(this.LJI);
        sb.append(", timeLeft=");
        sb.append(this.LJII);
        sb.append(", unPinReason=");
        sb.append(this.LJIIIIZZ);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(10730);
        }
        
        public final H31 LIZ(final PinMessage pinMessage) {
            if (pinMessage != null) {
                final String ljff = pinMessage.LJFF;
                if (n.LIZ((Object)ljff, (Object)HDh.CHAT.getWsMethod())) {
                    return (H31)pinMessage.LIZ;
                }
                if (n.LIZ((Object)ljff, (Object)HDh.SOCIAL.getWsMethod())) {
                    return (H31)pinMessage.LIZIZ;
                }
                if (n.LIZ((Object)ljff, (Object)HDh.MEMBER.getWsMethod())) {
                    return (H31)pinMessage.LIZLLL;
                }
                if (n.LIZ((Object)ljff, (Object)HDh.GIFT.getWsMethod())) {
                    return (H31)pinMessage.LIZJ;
                }
                if (n.LIZ((Object)ljff, (Object)HDh.LIKE.getWsMethod())) {
                    return (H31)pinMessage.LJ;
                }
            }
            return null;
        }
    }
    
    public enum b
    {
        CANCEL, 
        INTERRUPT, 
        NULL, 
        REPLACE, 
        TIME_OUT;
        
        static {
            Covode.recordClassIndex(10731);
        }
    }
}
