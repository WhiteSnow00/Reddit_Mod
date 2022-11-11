// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.text.TextUtils;
import java.io.File;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0Mi
{
    public static volatile int LIZ;
    
    static {
        Covode.recordClassIndex(2753);
    }
    
    public static long LIZ(final Context context) {
        long totalSpace = 0L;
        try {
            final File lizlll = LIZLLL(context);
            if (lizlll == null) {
                return 0L;
            }
            totalSpace = lizlll.getTotalSpace();
            return totalSpace;
        }
        catch (final Exception ex) {
            return totalSpace;
        }
    }
    
    public static long LIZ(File file) {
        long n2;
        long n = n2 = 0L;
        if (file != null) {
            if (!file.exists()) {
                n2 = n;
            }
            else {
                if (file.isFile()) {
                    return file.length();
                }
                final File[] listFiles = file.listFiles();
                n2 = n;
                if (listFiles != null) {
                    final int length = listFiles.length;
                    int n3 = 0;
                    while (true) {
                        n2 = n;
                        if (n3 >= length) {
                            break;
                        }
                        file = listFiles[n3];
                        long n4 = n;
                        if (file != null) {
                            n4 = n;
                            if (file.isFile()) {
                                n4 = n;
                                if (file.exists()) {
                                    n4 = n + file.length();
                                }
                            }
                        }
                        ++n3;
                        n = n4;
                    }
                }
            }
        }
        return n2;
    }
    
    public static long LIZ(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return 0L;
        }
        final File file = new File(s);
        if (!file.exists()) {
            return 0L;
        }
        long length;
        long n = length = file.length();
        if (file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            length = n;
            if (listFiles != null) {
                final int length2 = listFiles.length;
                int n2 = 0;
                while (true) {
                    length = n;
                    if (n2 < length2) {
                        final File file2 = listFiles[n2];
                        try {
                            n += LIZ(file2.getAbsolutePath());
                            ++n2;
                            continue;
                        }
                        catch (final OutOfMemoryError outOfMemoryError) {
                            outOfMemoryError.printStackTrace();
                            return 0L;
                        }
                        catch (final StackOverflowError stackOverflowError) {
                            stackOverflowError.printStackTrace();
                            return 0L;
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return length;
    }
    
    public static boolean LIZ(final Context context, final long n) {
        if (context == null) {
            return false;
        }
        final File lizlll = LIZLLL(context);
        return lizlll != null && lizlll.getFreeSpace() < n;
    }
    
    public static long LIZIZ(final Context context) {
        final long n = 0L;
        try {
            final File lizlll = LIZLLL(context);
            if (lizlll == null) {
                return 0L;
            }
            return lizlll.getFreeSpace();
        }
        catch (final Exception ex) {
            return n;
        }
    }
    
    public static void LIZIZ(final File file) {
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory()) {
                    final File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        return;
                    }
                    if (listFiles.length == 0) {
                        LIZJ(file);
                        return;
                    }
                    for (final File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            LIZIZ(file2);
                        }
                        else {
                            LIZJ(file2);
                        }
                    }
                    LIZJ(file);
                }
            }
            catch (final Exception ex) {
                0II.LIZ(ex);
            }
        }
    }
    
    public static boolean LIZIZ(final Context context, final long n) {
        if (context == null) {
            return false;
        }
        if (5ek.LIZIZ == null || !5ek.LJ) {
            5ek.LIZIZ = context.getCacheDir();
        }
        final File liziz = 5ek.LIZIZ;
        return liziz != null && liziz.getFreeSpace() < n;
    }
    
    public static boolean LIZJ(final Context context) {
        if (0Mi.LIZ <= 0) {
            return false;
        }
        final long n = 0Mi.LIZ * 1024L * 1024L;
        return LIZ(context, n) || LIZIZ(context, n);
    }
    
    public static boolean LIZJ(final File file) {
        MethodCollector.i(17986);
        while (true) {
            try {
                609 liz;
                if (NIJ.LIZIZ()) {
                    liz = (609)SettingsManager.LIZ().LIZ("storage_intercepter_key", (Class)609.class, (Object)4F0.LIZ);
                }
                else {
                    liz = 4F0.LIZ;
                }
                if (608.LIZ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_delete_log", 608.LIZ(liz));
                }
                if (608.LIZJ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_handle", 608.LIZ(liz));
                    MethodCollector.o(17986);
                    return false;
                }
                final boolean delete = file.delete();
                MethodCollector.o(17986);
                return delete;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static File LIZLLL(final Context context) {
        if (5ek.LIZ == null || !5ek.LJ) {
            return 5ek.LIZ = context.getExternalCacheDir();
        }
        return 5ek.LIZ;
    }
}
