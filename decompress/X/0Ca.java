// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import java.util.Map;
import com.bytedance.android.livesdk.util.GlobalContext;
import java.util.HashMap;
import kotlin.jvm.internal.n;
import java.util.Objects;
import kotlin.n.y;
import java.util.Iterator;
import java.util.List;
import kotlin.n.z;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Set;

public final class 0ca
{
    public static final 0ca LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static Set<String> LJ;
    
    static {
        Covode.recordClassIndex(5734);
        LIZ = new 0ca();
        0ca.LIZIZ = -1;
        0ca.LIZJ = -1;
        0ca.LIZLLL = -1;
    }
    
    private final String LIZ(int i, final String s) {
        if (i != 2) {
            return "";
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "-1.0.0";
        }
        i = 0;
        if (s != null) {
            final List liz = z.LIZ((CharSequence)s, new String[] { "/" }, 0, 6);
            if (liz != null && (liz.isEmpty() ^ true)) {
                final int size = liz.size();
                while (i < liz.size()) {
                    final String s2 = liz.get(size - i - 1);
                    if (0ca.LIZ.LIZLLL(s2)) {
                        return s2;
                    }
                    ++i;
                }
            }
        }
        return "-1.0.0";
    }
    
    private final String LIZ(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "";
        }
        this.LIZ();
        final Set<String> lj = 0ca.LJ;
        if (lj != null) {
            for (final String s2 : lj) {
                if (s != null && z.LIZ((CharSequence)s, (CharSequence)s2, false)) {
                    return s2;
                }
            }
        }
        return "";
    }
    
    private final void LIZ() {
        if (0ca.LJ == null) {
            0ca.LJ = 4Lu.LIZ((Object[])new String[] { "tiktok_live_broadcast_resource", "tiktok_live_watch_resource", "tiktok_live_consume_resource", "tiktok_live_business_resource", "tiktok_live_interaction_resource", "tiktok_live_basic_resource", "tiktok_live_lottie_resource", "tiktok_live_link_mic" });
        }
    }
    
    private final boolean LIZIZ(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        this.LIZ();
        final Set<String> lj = 0ca.LJ;
        if (lj != null) {
            for (final String s2 : lj) {
                if (s != null && y.LIZIZ(s, s2, false)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private final String LIZJ(final String s) {
        String substring;
        final String s2 = substring = "";
        if (s != null) {
            if (!z.LIZ((CharSequence)s, (CharSequence)"/", false)) {
                return "";
            }
            substring = s2;
            if (s != null) {
                int liz = z.LIZ((CharSequence)s, "/");
                final int length = s.length();
                ++liz;
                substring = s2;
                if (length > liz) {
                    substring = s2;
                    if (length > 0) {
                        substring = s2;
                        if (s != null) {
                            Objects.requireNonNull(s, "null cannot be cast to non-null type java.lang.String");
                            substring = s.substring(liz, length);
                            n.LIZIZ((Object)substring, "");
                            if (substring == null) {
                                substring = s2;
                            }
                        }
                    }
                }
            }
        }
        return substring;
    }
    
    private final boolean LIZLLL(final String s) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                return false;
            }
            for (int length = s.length(), i = 0; i < length; ++i) {
                final char char1 = s.charAt(i);
                if (n.LIZ((int)char1, 48) < 0 || n.LIZ((int)char1, 57) > 0) {
                    return false;
                }
            }
            return true;
        }
        catch (final Exception ex) {
            0ba.LIZ("Gecko_Report_Util", ex);
            return false;
        }
    }
    
    public final void LIZ(final String s, final long n, String s2, String liz, final boolean b, final String s3) {
        CTM.LIZ((Object)s2, (Object)liz, (Object)s3);
        String lizj = liz;
        if (TextUtils.isEmpty((CharSequence)liz)) {
            lizj = this.LIZJ(s);
        }
        liz = s2;
        if (TextUtils.isEmpty((CharSequence)s2)) {
            liz = this.LIZ(s);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("channel", liz);
        hashMap.put("filename", lizj);
        if (s == null) {
            s2 = "";
        }
        else {
            s2 = s;
        }
        hashMap.put("path", s2);
        hashMap.put("cost_time", (System.nanoTime() - n) / 1000000L);
        hashMap.put("is_load_success", b);
        while (true) {
            Label_0370: {
                Label_0362: {
                    if (s == null) {
                        break Label_0362;
                    }
                    int n2;
                    if (y.LIZIZ(s, "file:", false) || y.LIZIZ(s, "/data/", false)) {
                        n2 = 2;
                    }
                    else if (y.LIZIZ(s, "http:", false) || y.LIZIZ(s, "https:", false)) {
                        n2 = 3;
                    }
                    else {
                        if (!y.LIZIZ(s, "asset:", false)) {
                            break Label_0362;
                        }
                        break Label_0370;
                    }
                    hashMap.put("load_resource_type", n2);
                    hashMap.put("version", this.LIZ(n2, s));
                    if (0ca.LIZIZ <= 0 || 0ca.LIZJ <= 0 || 0ca.LIZLLL <= 0) {
                        final Context applicationContext = GlobalContext.getApplicationContext();
                        if (applicationContext != null) {
                            final 1HX liz2 = 0cW.LIZ(applicationContext);
                            0ca.LIZIZ = liz2.LIZ;
                            0ca.LIZJ = liz2.LIZIZ;
                            0ca.LIZLLL = liz2.LIZJ;
                        }
                    }
                    hashMap.put("dpi", 0ca.LIZIZ);
                    hashMap.put("width", 0ca.LIZJ);
                    hashMap.put("height", 0ca.LIZLLL);
                    hashMap.put("extra_info", s3);
                    0d8.LIZ("ttlive_gecko_file_info_report", 1, hashMap, 0);
                    return;
                }
                if (!this.LIZIZ(s)) {
                    final int n2 = 0;
                    continue;
                }
            }
            int n2 = 1;
            continue;
        }
    }
    
    public final void LIZ(final String s, final long n, final boolean b, final String s2) {
        CTM.LIZ((Object)s2);
        this.LIZ(s, n, "", "", b, s2);
    }
}
