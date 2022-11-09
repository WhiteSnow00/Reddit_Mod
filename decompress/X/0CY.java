// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.abmock.SettingsManager;
import android.os.Environment;
import android.text.TextUtils;
import java.util.zip.ZipEntry;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0cY
{
    static {
        Covode.recordClassIndex(5732);
    }
    
    public static File LIZ(final Context context) {
        if (!LIZ() || !LIZJ() || LIZJ(context) == null) {
            return null;
        }
        final File file = new File(LIZJ(context).getPath());
        LIZ(file);
        final StringBuilder sb = new StringBuilder("cache path:");
        sb.append(file.getAbsolutePath());
        0ba.LIZ(3, "file_path", sb.toString());
        return file;
    }
    
    public static void LIZ(final String s, final String s2) {
        MethodCollector.i(10481);
        final ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(s)));
        final StringBuilder sb = new StringBuilder("..");
        sb.append(File.separator);
        final String string = sb.toString();
        while (true) {
            final ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.close();
                MethodCollector.o(10481);
                return;
            }
            final String name = nextEntry.getName();
            if (!5ow.LIZ(name) && name.contains(string)) {
                final IOException ex = new IOException("Unzip maybe be unsafe.");
                MethodCollector.o(10481);
                throw ex;
            }
            if (nextEntry.isDirectory()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s2);
                sb2.append(File.separator);
                sb2.append(name);
                new File(sb2.toString()).mkdirs();
            }
            else {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(s2);
                sb3.append(File.separator);
                sb3.append(name);
                final File file = new File(sb3.toString());
                if (file.exists()) {
                    LIZIZ(file);
                }
                else {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
                final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                final byte[] array = new byte[2048];
                while (true) {
                    final int read = zipInputStream.read(array);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(array, 0, read);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            }
        }
    }
    
    public static boolean LIZ() {
        String liziz;
        try {
            liziz = LIZIZ();
        }
        catch (final Exception ex) {
            liziz = null;
        }
        return "mounted".equals(liziz) || "mounted_ro".equals(liziz);
    }
    
    public static boolean LIZ(final File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }
    
    public static boolean LIZ(final String s) {
        if (LIZJ() && !TextUtils.isEmpty((CharSequence)s)) {
            final File file = new File(s);
            if (file.exists() && file.canWrite() && LIZIZ(file)) {
                return true;
            }
        }
        return false;
    }
    
    public static File LIZIZ(final Context context) {
        if (!LIZ() || !LIZJ()) {
            return null;
        }
        final File file = new File(LIZ(context), "picture");
        LIZ(file);
        final StringBuilder sb = new StringBuilder();
        sb.append("picture");
        sb.append(" cache path:");
        sb.append(file.getAbsolutePath());
        0ba.LIZ(3, "file_path", sb.toString());
        return file;
    }
    
    public static String LIZIZ() {
        if (!6Tl.LJIIIZ || TextUtils.isEmpty((CharSequence)6Tl.LJIJ)) {
            return 6Tl.LJIJ = Environment.getExternalStorageState();
        }
        return 6Tl.LJIJ;
    }
    
    public static boolean LIZIZ(final File file) {
        MethodCollector.i(10476);
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
                    MethodCollector.o(10476);
                    return false;
                }
                final boolean delete = file.delete();
                MethodCollector.o(10476);
                return delete;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean LIZIZ(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && new File(s).exists();
    }
    
    public static File LIZJ(final Context context) {
        if (5ek.LIZ == null || !5ek.LJ) {
            return 5ek.LIZ = context.getExternalCacheDir();
        }
        return 5ek.LIZ;
    }
    
    public static boolean LIZJ() {
        try {
            return "mounted".equals(LIZIZ());
        }
        catch (final Exception ex) {
            return false;
        }
    }
}
