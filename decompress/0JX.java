// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import webcast.data.EventCard;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.LiveEventMessage;

public final class 0jx
{
    public final long LIZ;
    public LiveEventMessage LIZIZ;
    public boolean LIZJ;
    public 0jy LIZLLL;
    
    static {
        Covode.recordClassIndex(7010);
    }
    
    public 0jx(final long liz, final LiveEventMessage liziz, final boolean lizj, final 0jy lizlll) {
        CTM.LIZ((Object)lizlll);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof 0jx) {
                final LiveEventMessage liziz = this.LIZIZ;
                if (liziz != null) {
                    final Object o2 = null;
                    final EventCard liziz2 = liziz.LIZIZ;
                    while (true) {
                        Label_0176: {
                            if (liziz2 == null) {
                                break Label_0176;
                            }
                            final LiveEventInfo liz = liziz2.LIZ;
                            if (liz == null) {
                                break Label_0176;
                            }
                            final Long liz2 = liz.LIZ;
                            final 0jx 0jx = (0jx)o;
                            final LiveEventMessage liziz3 = 0jx.LIZIZ;
                            while (true) {
                                Label_0171: {
                                    if (liziz3 == null) {
                                        break Label_0171;
                                    }
                                    final EventCard liziz4 = liziz3.LIZIZ;
                                    if (liziz4 == null) {
                                        break Label_0171;
                                    }
                                    final LiveEventInfo liz3 = liziz4.LIZ;
                                    if (liz3 == null) {
                                        break Label_0171;
                                    }
                                    final Long liz4 = liz3.LIZ;
                                    if (n.LIZ((Object)liz2, (Object)liz4)) {
                                        final LiveEventMessage liziz5 = this.LIZIZ;
                                        while (true) {
                                            Label_0166: {
                                                if (liziz5 == null) {
                                                    break Label_0166;
                                                }
                                                final CommonMessageData baseMessage = ((HDi)liziz5).baseMessage;
                                                if (baseMessage == null) {
                                                    break Label_0166;
                                                }
                                                final Long value = baseMessage.LIZ;
                                                final LiveEventMessage liziz6 = 0jx.LIZIZ;
                                                Object value2 = o2;
                                                if (liziz6 != null) {
                                                    final CommonMessageData baseMessage2 = ((HDi)liziz6).baseMessage;
                                                    value2 = o2;
                                                    if (baseMessage2 != null) {
                                                        value2 = baseMessage2.LIZ;
                                                    }
                                                }
                                                if (n.LIZ((Object)value, value2)) {
                                                    return true;
                                                }
                                                return false;
                                            }
                                            final Long value = null;
                                            continue;
                                        }
                                    }
                                    return false;
                                }
                                final Long liz4 = null;
                                continue;
                            }
                        }
                        final Long liz2 = null;
                        continue;
                    }
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
        final LiveEventMessage liziz = this.LIZIZ;
        int hashCode = 0;
        int hashCode2;
        if (liziz != null) {
            hashCode2 = liziz.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        int lizj;
        if ((lizj = (this.LIZJ ? 1 : 0)) != 0) {
            lizj = 1;
        }
        final 0jy lizlll = this.LIZLLL;
        if (lizlll != null) {
            hashCode = lizlll.hashCode();
        }
        return ((n * 31 + hashCode2) * 31 + lizj) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("LiveEventDescCardInfo(roomId=");
        sb.append(this.LIZ);
        sb.append(", liveEventMessage=");
        sb.append(this.LIZIZ);
        sb.append(", pinAvailable=");
        sb.append(this.LIZJ);
        sb.append(", unPinReason=");
        sb.append(this.LIZLLL);
        sb.append(")");
        return sb.toString();
    }
}
