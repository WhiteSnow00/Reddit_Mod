// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.regex.Pattern;
import android.text.TextUtils;
import java.io.File;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.alog.Alog;

public final class 0T6
{
    public static Alog LIZ;
    
    static {
        Covode.recordClassIndex(4577);
    }
    
    public static void LIZ() {
        MethodCollector.i(7103);
        Alog.nativeSetDefaultInstance(0L);
        0T6.LIZ.LIZ();
        0T6.LIZ = null;
        MethodCollector.o(7103);
    }
    
    public static void LIZ(final int n, final String s, final String s2) {
        final Alog liz = 0T6.LIZ;
        if (liz != null) {
            liz.LIZ(n, s, s2);
        }
    }
    
    public static File[] LIZ(String s, final String s2, final long liziz, final long lizj) {
        final Alog liz = 0T6.LIZ;
        if (liz == null) {
            return new File[0];
        }
        final String ljiiiz = liz.LJIIIZ;
        0T4.LIZIZ = liziz;
        0T4.LIZJ = lizj;
        0T4.LJ = null;
        0T4.LIZLLL = null;
        if (liziz > lizj) {
            0T4.LJ = "time interval is invalid";
            return new File[0];
        }
        final File file = new File(ljiiiz);
        if (!file.exists() || !file.isDirectory()) {
            0T4.LJ = "log dir not exists";
            return new File[0];
        }
        String replace = s;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            replace = s.replace(':', '-');
        }
        final StringBuilder sb = new StringBuilder("^\\d{4}_\\d{2}_\\d{2}_(\\d+)__");
        final boolean empty = TextUtils.isEmpty((CharSequence)replace);
        final String s3 = "\\S+";
        if (empty) {
            s = "\\S+";
        }
        else {
            s = Pattern.quote(replace);
        }
        sb.append(s);
        sb.append("__");
        if (TextUtils.isEmpty((CharSequence)s2)) {
            s = s3;
        }
        else {
            s = Pattern.quote(s2);
        }
        sb.append(s);
        sb.append("\\.alog\\.hot$");
        final Pattern compile = Pattern.compile(sb.toString());
        final ArrayList lizlll = new ArrayList();
        final File[] listFiles = file.listFiles(new 0T3(lizlll, compile, lizj, liziz));
        if (listFiles == null || listFiles.length == 0) {
            0T4.LJ = "log file not found";
            0T4.LIZLLL = lizlll;
            if (listFiles == null) {
                return new File[0];
            }
        }
        return listFiles;
    }
    
    public static void LIZIZ() {
        final Alog liz = 0T6.LIZ;
        if (liz != null) {
            liz.LIZIZ();
        }
    }
    
    public static long LIZJ() {
        MethodCollector.i(7110);
        final Alog liz = 0T6.LIZ;
        if (liz == null) {
            MethodCollector.o(7110);
            return 0L;
        }
        if (liz.LJIILL != 0L) {
            final long nativeGetLegacyWriteFuncAddr = Alog.nativeGetLegacyWriteFuncAddr();
            MethodCollector.o(7110);
            return nativeGetLegacyWriteFuncAddr;
        }
        MethodCollector.o(7110);
        return 0L;
    }
}
