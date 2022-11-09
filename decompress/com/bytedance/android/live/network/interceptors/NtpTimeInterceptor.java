// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.network.interceptors;

import java.util.Map;
import java.util.HashMap;
import X.Gl0;
import X.0z4;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNtpOpt;
import android.os.SystemClock;
import X.6yM;
import X.5l6;
import com.bytedance.covode.number.Covode;
import X.5ky;

public final class NtpTimeInterceptor implements 5ky
{
    static {
        Covode.recordClassIndex(10453);
    }
    
    public final 6yM<?> intercept(final 5l6 5l6) {
        final long currentTimeMillis = System.currentTimeMillis();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        6yM<?> 6yM;
        if (5l6 != null) {
            final 6yM liz = 5l6.LIZ(5l6.LIZ());
            if ((6yM = (6yM<?>)liz) != null) {
                6yM = (6yM<?>)liz;
                if (LiveNtpOpt.INSTANCE.isOptEnable()) {
                    final long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    final Object liziz = liz.LIZIZ;
                    6yM = (6yM<?>)liz;
                    if (liziz != null) {
                        6yM = (6yM<?>)liz;
                        if (liziz instanceof 0z4) {
                            final 0z4 0z4 = (0z4)liziz;
                            6yM = (6yM<?>)liz;
                            if (0z4.extra != null) {
                                6yM = (6yM<?>)liz;
                                if (0z4.extra.now > 0L) {
                                    final long n = 0z4.extra.now + (elapsedRealtime2 - elapsedRealtime) / 2L;
                                    6yM = (6yM<?>)liz;
                                    if (n > 0L) {
                                        Gl0.LIZ = n - currentTimeMillis;
                                        Gl0.LIZIZ = n - elapsedRealtime;
                                        final long n2 = System.currentTimeMillis() + Gl0.LIZ;
                                        final long n3 = SystemClock.elapsedRealtime() + Gl0.LIZIZ;
                                        final HashMap hashMap = new HashMap();
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(Gl0.LIZ);
                                        hashMap.put("gap_current", sb.toString());
                                        hashMap.put("server_time_old", String.valueOf(n2));
                                        hashMap.put("server_time_new", String.valueOf(n3));
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append(n2 - n3);
                                        hashMap.put("diff", sb2.toString());
                                        hashMap.put("source", "server");
                                        Gl0.LIZ("server_time", (Map)hashMap);
                                        6yM = (6yM<?>)liz;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            6yM = null;
        }
        return 6yM;
    }
}
