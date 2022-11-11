// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.AssetManager;
import java.io.InputStream;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.IHostContext;
import java.io.File;
import kotlin.jvm.internal.n;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class 0cc
{
    public static final 0cc LIZ;
    public static int LIZIZ;
    public static int[] LIZJ;
    public static String[] LIZLLL;
    
    static {
        Covode.recordClassIndex(5740);
        LIZ = new 0cc();
        0cc.LIZIZ = -1;
    }
    
    private final String LIZ(int i, final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)s)) {
            while (i >= 0) {
                final String[] lizlll = 0cc.LIZLLL;
                if (lizlll == null) {
                    n.LIZ("");
                }
                final String s3 = lizlll[i];
                final StringBuilder sb = new StringBuilder();
                sb.append(s3);
                sb.append(File.separator);
                sb.append(s2);
                if (LJIIIZ(s, sb.toString())) {
                    return s3;
                }
                --i;
            }
        }
        return "";
    }
    
    public static String LIZ(final String s) {
        CTM.LIZ((Object)s);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return "asset:///".concat(String.valueOf(s));
        }
        return "";
    }
    
    public static final String LIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        return LIZ(s, s2, false);
    }
    
    public static final String LIZ(final String s, final String s2, final boolean b) {
        CTM.LIZ((Object)s, (Object)s2);
        if (TextUtils.isEmpty((CharSequence)s) || TextUtils.isEmpty((CharSequence)s2)) {
            return "";
        }
        if (b) {
            final StringBuilder sb = new StringBuilder("xhdpi");
            sb.append(File.separator);
            sb.append(s2);
            return LJIIIIZZ(s, sb.toString());
        }
        return LJIIIIZZ(s, s2);
    }
    
    public static String LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return "file://".concat(String.valueOf(s));
        }
        return "";
    }
    
    public static final String LIZIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        return LIZIZ(s, s2, false);
    }
    
    public static final String LIZIZ(final String s, final String s2, final boolean b) {
        CTM.LIZ((Object)s, (Object)s2);
        if (TextUtils.isEmpty((CharSequence)s) || TextUtils.isEmpty((CharSequence)s2)) {
            final StringBuilder sb = new StringBuilder("getGeckoPathAndUrl error,");
            sb.append(s);
            sb.append(",fileName:");
            sb.append(s2);
            0ba.LIZ(4, "Gecko_Resource_Util", sb.toString());
            return "";
        }
        String s3;
        if (TextUtils.isEmpty((CharSequence)(s3 = LJ(s, s2)))) {
            s3 = LIZJ(s, s2, b);
        }
        String liz = s3;
        if (TextUtils.isEmpty((CharSequence)s3)) {
            liz = LIZ(s, s2, b);
        }
        0ba.LIZ(4, "Gecko_Resource_Util", "getGeckoPathAndUrl,load_url:".concat(String.valueOf(liz)));
        return liz;
    }
    
    public static final File LIZJ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        if (!TextUtils.isEmpty((CharSequence)s) && !TextUtils.isEmpty((CharSequence)s2)) {
            final IHostContext hostContext = 0jR.LIZ(IHostContext.class);
            if (hostContext == null) {
                return null;
            }
            final File ttLiveGeckoResourceFile = hostContext.getTTLiveGeckoResourceFile(s, s2);
            if (ttLiveGeckoResourceFile != null && ttLiveGeckoResourceFile.exists()) {
                return ttLiveGeckoResourceFile;
            }
        }
        return null;
    }
    
    public static String LIZJ(final String s, final String s2, final boolean b) {
        CTM.LIZ((Object)s, (Object)s2);
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final String s3 = "";
        if (empty || TextUtils.isEmpty((CharSequence)s2)) {
            return "";
        }
        String liz = s3;
        if (b) {
            final 0cc liz2 = 0cc.LIZ;
            final Context applicationContext = GlobalContext.getApplicationContext();
            if (applicationContext == null) {
                liz = s3;
            }
            else {
                if (0cc.LIZIZ <= 0) {
                    0cc.LIZIZ = 0cW.LIZ(applicationContext).LIZ;
                }
                if (0cc.LIZJ == null || 0cc.LIZLLL == null) {
                    0cc.LIZJ = new int[] { 120, 160, 240, 320, 480, 640 };
                    0cc.LIZLLL = new String[] { "ldpi", "mdpi", "hdpi", "xhdpi", "xxhdpi", "xxxhdpi" };
                }
                final int[] lizj = 0cc.LIZJ;
                if (lizj == null) {
                    n.LIZ("");
                }
                final int length = lizj.length;
                final int n = 0;
                int n2 = 0;
                int n3;
                while (true) {
                    n3 = n;
                    if (n2 >= length) {
                        break;
                    }
                    final int[] lizj2 = 0cc.LIZJ;
                    if (lizj2 == null) {
                        kotlin.jvm.internal.n.LIZ("");
                    }
                    if (lizj2[n2] >= 0cc.LIZIZ) {
                        n3 = n2;
                        break;
                    }
                    ++n2;
                }
                String s4 = s3;
                if (!TextUtils.isEmpty((CharSequence)s2)) {
                    if (TextUtils.isEmpty((CharSequence)s)) {
                        s4 = s3;
                    }
                    else {
                        final int[] lizj3 = 0cc.LIZJ;
                        if (lizj3 == null) {
                            kotlin.jvm.internal.n.LIZ("");
                        }
                        final int length2 = lizj3.length;
                        int n4 = n3;
                        while (true) {
                            s4 = s3;
                            if (n4 >= length2) {
                                break;
                            }
                            final String[] lizlll = 0cc.LIZLLL;
                            if (lizlll == null) {
                                kotlin.jvm.internal.n.LIZ("");
                            }
                            s4 = lizlll[n4];
                            final StringBuilder sb = new StringBuilder();
                            sb.append(s4);
                            sb.append(File.separator);
                            sb.append(s2);
                            if (LJIIIZ(s, sb.toString())) {
                                break;
                            }
                            ++n4;
                        }
                    }
                }
                liz = s4;
                if (TextUtils.isEmpty((CharSequence)s4)) {
                    liz = liz2.LIZ(n3, s, s2);
                }
            }
        }
        if (TextUtils.isEmpty((CharSequence)liz)) {
            return LJII(s, s2);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(liz);
        sb2.append(File.separator);
        sb2.append(s2);
        return LJII(s, sb2.toString());
    }
    
    public static final String LIZLLL(String absolutePath, final String s) {
        CTM.LIZ((Object)absolutePath, (Object)s);
        final File lizj = LIZJ(absolutePath, s);
        if (lizj != null && lizj.exists()) {
            absolutePath = lizj.getAbsolutePath();
            n.LIZIZ((Object)absolutePath, "");
            return absolutePath;
        }
        return "";
    }
    
    public static final String LJ(String ljff, final String s) {
        String s2 = ljff;
        if (ljff == null) {
            s2 = "";
        }
        if ((ljff = s) == null) {
            ljff = "";
        }
        ljff = LJFF(s2, ljff);
        if (TextUtils.isEmpty((CharSequence)ljff)) {
            return "";
        }
        return LIZ(ljff);
    }
    
    public static final String LJFF(String string, final String s) {
        MethodCollector.i(9068);
        CTM.LIZ((Object)string, (Object)s);
        final 0Vq liz = 0jR.LIZ((Class<0Vq>)IHostContext.class);
        n.LIZIZ((Object)liz, "");
        if (!((IHostContext)liz).isOffline()) {
            MethodCollector.o(9068);
            return "";
        }
        Label_0182: {
            try {
                final Context lj = 0cB.LJ();
                n.LIZIZ((Object)lj, "");
                final String[] list = lj.getAssets().list(string);
                if (list != null) {
                    final int length = list.length;
                    final int n = 0;
                    if (length == 0 ^ true) {
                        Block_7: {
                            for (int length2 = list.length, i = n; i < length2; ++i) {
                                if (kotlin.jvm.internal.n.LIZ((Object)s, (Object)list[i])) {
                                    break Block_7;
                                }
                            }
                            break Label_0182;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append('/');
                        sb.append(s);
                        string = sb.toString();
                        MethodCollector.o(9068);
                        return string;
                    }
                }
            }
            catch (final Exception ex) {
                0ba.LIZ(6, "Gecko_Resource_Util", "getAssetPath,e:".concat(String.valueOf(ex)));
            }
        }
        MethodCollector.o(9068);
        return "";
    }
    
    public static final InputStream LJI(final String s, final String s2) {
        MethodCollector.i(9071);
        CTM.LIZ((Object)s, (Object)s2);
        try {
            final Context lj = 0cB.LJ();
            n.LIZIZ((Object)lj, "");
            final AssetManager assets = lj.getAssets();
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append('/');
            sb.append(s2);
            final InputStream open = assets.open(sb.toString());
            MethodCollector.o(9071);
            return open;
        }
        catch (final Exception ex) {
            0ba.LIZ("Gecko_Resource_Util", ex);
            MethodCollector.o(9071);
            return null;
        }
    }
    
    public static final String LJII(String absolutePath, final String s) {
        if (!TextUtils.isEmpty((CharSequence)absolutePath) && !TextUtils.isEmpty((CharSequence)s)) {
            final File lizj = LIZJ(absolutePath, s);
            if (lizj != null && lizj.exists()) {
                absolutePath = lizj.getAbsolutePath();
                n.LIZIZ((Object)absolutePath, "");
                return LIZIZ(absolutePath);
            }
        }
        return "";
    }
    
    public static final String LJIIIIZZ(final String s, final String s2) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        String ttLiveGeckoCdnUrl;
        final String s3 = ttLiveGeckoCdnUrl = "";
        if (!empty) {
            if (TextUtils.isEmpty((CharSequence)s2)) {
                ttLiveGeckoCdnUrl = s3;
            }
            else {
                final IHostContext hostContext = 0jR.LIZ(IHostContext.class);
                if (hostContext == null) {
                    return "";
                }
                ttLiveGeckoCdnUrl = hostContext.getTTLiveGeckoCdnUrl(s, s2);
                if (ttLiveGeckoCdnUrl == null) {
                    ttLiveGeckoCdnUrl = s3;
                }
            }
        }
        return ttLiveGeckoCdnUrl;
    }
    
    public static boolean LJIIIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final File ttLiveGeckoResourceFile = 0jR.LIZ(IHostContext.class).getTTLiveGeckoResourceFile(s, s2);
        return ttLiveGeckoResourceFile != null && ttLiveGeckoResourceFile.exists();
    }
}
