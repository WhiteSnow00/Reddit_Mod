// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.degrade.AlogAsycSendOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.covode.number.Covode;

public final class 0ba
{
    static {
        Covode.recordClassIndex(5660);
    }
    
    public static void LIZ(final int n, final String s, final String s2) {
        if (!LiveEnableALogSetting.INSTANCE.isDisable() && !2X0.LIZ.LIZ(s)) {
            if (AlogAsycSendOptSetting.INSTANCE.getEnable()) {
                6v3.LIZJ().submit(new 0bb(n, s, s2));
                return;
            }
            LIZIZ(n, s, s2);
        }
    }
    
    public static void LIZ(final int n, final String s, final String s2, final Throwable t) {
        if (!LiveEnableALogSetting.INSTANCE.isDisable() && !2X0.LIZ.LIZ(s)) {
            if (AlogAsycSendOptSetting.INSTANCE.getEnable()) {
                6v3.LIZJ().submit(new 0bc(n, s, s2, t));
                return;
            }
            LIZIZ(n, s, s2, t);
        }
    }
    
    public static void LIZ(final int n, final String s, final StackTraceElement[] array) {
        if (LiveEnableALogSetting.INSTANCE.isEnable()) {
            if (AlogAsycSendOptSetting.INSTANCE.getEnable()) {
                6v3.LIZJ().submit(new 0be(n, s, array));
                return;
            }
            7Ho.LIZ(n, s, array);
        }
    }
    
    public static void LIZ(final String s) {
        LIZ(3, "ALogger", s);
    }
    
    public static void LIZ(final String s, final String s2, final Throwable t) {
        LIZ(6, s, s2, t);
    }
    
    public static void LIZ(final String s, final Throwable t) {
        LIZ(6, s, null, t);
    }
    
    public static void LIZIZ(final int n, final String s, final String s2) {
        if (n == 2) {
            7Ho.LIZ(s, s2);
            return;
        }
        if (n == 3) {
            7Ho.LIZIZ(s, s2);
            return;
        }
        if (n == 4) {
            7Ho.LIZJ(s, s2);
            return;
        }
        if (n != 5) {
            if (n == 6) {
                7Ho.LJ(s, s2);
            }
            return;
        }
        7Ho.LIZLLL(s, s2);
    }
    
    public static void LIZIZ(final int n, final String s, final String s2, final Throwable t) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s2);
        if (n != 5) {
            if (n == 6) {
                if (empty) {
                    7Ho.LIZIZ(s, t);
                    return;
                }
                7Ho.LIZIZ(s, s2, t);
            }
            return;
        }
        if (empty) {
            7Ho.LIZ(s, t);
            return;
        }
        7Ho.LIZ(s, s2, t);
    }
    
    public static void LIZIZ(final String s) {
        LIZ(4, "ALogger", s);
    }
    
    public static void LIZJ(final String s) {
        LIZ(6, "ALogger", s);
    }
}
