// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.avframework.livestreamv2.core.interact.model.Config$Vendor;
import java.util.Map;
import java.util.HashMap;
import android.os.Looper;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 0xo
{
    public static final 0xo LIZ;
    
    static {
        Covode.recordClassIndex(10331);
        LIZ = new 0xo();
    }
    
    public static final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        LIZJ(s, "");
    }
    
    public static final void LIZ(final String s, final String s2) {
        CTM.LIZ((Object)s);
        final String concat = "InteractALog_".concat(String.valueOf(s));
        final StringBuilder sb = new StringBuilder();
        final Thread currentThread = Thread.currentThread();
        n.LIZIZ((Object)currentThread, "");
        sb.append(currentThread.getId());
        sb.append('_');
        sb.append('[');
        sb.append(n.LIZ((Object)Looper.myLooper(), (Object)Looper.getMainLooper()));
        sb.append("] ");
        sb.append(s2);
        0ba.LIZ(3, concat, sb.toString());
    }
    
    public static final void LIZ(final String s, final boolean b) {
        CTM.LIZ((Object)s);
        LIZ(s, b, "");
    }
    
    public static final void LIZ(final String s, final boolean b, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        hashMap.put("event", s);
        hashMap.put("extra", s2);
        0xo.LIZ.LIZ(b, hashMap);
        LIZ(hashMap);
    }
    
    public static final void LIZ(final Map<String, ?> map) {
        CTM.LIZ((Object)map);
        ((0bf)Fjw.LIZIZ()).LIZ("ttlive_interact", map);
    }
    
    private final void LIZ(final boolean b, final Map<String, Object> map) {
        final 1NN liz = 1NN.LLFF.LIZ();
        String s;
        if (b) {
            if (liz.LJIIZILJ) {
                s = "inviter";
            }
            else {
                s = "invitee";
            }
        }
        else {
            s = "audience";
        }
        map.put("role", s);
        map.put("inviteType", liz.LJIILL.getType());
        map.put("channelId", liz.LJ);
        map.put("fromRoomId", liz.LJII);
        map.put("currentRoomId", liz.LJZL);
        map.put("linkMicId", liz.LJJJJZI);
        map.put("guestLinkMicId", liz.LJJJLIIL);
        map.put("guestUserId", liz.LJFF);
        map.put("linkMicVendor", liz.LIZLLL().getValue());
        map.put("rtcExtInfo", liz.LJJIJIL);
        map.put("duration", liz.LJIJ);
    }
    
    public static final void LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        LIZLLL(s, "");
    }
    
    public static final void LIZIZ(final String s, final String s2) {
        CTM.LIZ((Object)s);
        if (0sH.LIZ.LIZ()) {
            final Thread currentThread = Thread.currentThread();
            n.LIZIZ((Object)currentThread, "");
            final StackTraceElement[] stackTrace = currentThread.getStackTrace();
            int n = 2;
            do {
                if (n < stackTrace.length) {
                    final String concat = "InteractALog_".concat(String.valueOf(s));
                    final StringBuilder sb = new StringBuilder("log trace");
                    sb.append(n);
                    final StackTraceElement stackTraceElement = stackTrace[n];
                    kotlin.jvm.internal.n.LIZIZ((Object)stackTraceElement, "");
                    sb.append(stackTraceElement.getClassName());
                    sb.append(" ");
                    final StackTraceElement stackTraceElement2 = stackTrace[n];
                    kotlin.jvm.internal.n.LIZIZ((Object)stackTraceElement2, "");
                    sb.append(stackTraceElement2.getMethodName());
                    0ba.LIZ(3, concat, sb.toString());
                }
            } while (++n <= 5);
        }
        LIZ(s, s2);
    }
    
    private final void LIZIZ(final Map<String, Object> map) {
        final GCe liz = GCe.LIZ();
        final 1Uo 1Uo = (1Uo)1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        n.LIZIZ((Object)liz, "");
        map.put("opened", ((G1k)liz).LJIIIZ);
        map.put("anchorLinkMicId", liz.LJII);
        map.put("linkMicId", liz.LIZIZ());
        final Config$Vendor fromValue = Config$Vendor.fromValue(liz.LJIIJJI);
        n.LIZIZ((Object)fromValue, "");
        map.put("linkMicVendor", fromValue.getValue());
        String s;
        if (1Uo == null || (s = 1Uo.LJIILLIIL) == null) {
            s = liz.LJIIL;
        }
        map.put("rtcExtInfo", s);
    }
    
    public static final void LIZJ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        hashMap.put("event", s);
        hashMap.put("extra", s2);
        LIZ(hashMap);
    }
    
    public static final void LIZLLL(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        hashMap.put("event", s);
        hashMap.put("extra", s2);
        0xo.LIZ.LIZIZ(hashMap);
        LIZ(hashMap);
    }
}
