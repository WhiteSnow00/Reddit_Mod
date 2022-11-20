// 
// Decompiled by Procyon v0.6.0
// 

package z6;

import java.io.OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.File;
import com.airbnb.lottie.network.FileExtension;

public final class d
{
    public final c a;
    
    public d(final p6.c a) {
        this.a = a;
    }
    
    public static String a(String s, final FileExtension fileExtension, final boolean b) {
        final StringBuilder t = a.t("lottie_cache_");
        t.append(s.replaceAll("\\W+", ""));
        if (b) {
            s = fileExtension.tempExtension();
        }
        else {
            s = fileExtension.extension;
        }
        t.append(s);
        return t.toString();
    }
    
    public final File b() {
        final p6.c c = (p6.c)this.a;
        c.getClass();
        final File file = new File(c.a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
    
    public final File c(String a, final InputStream inputStream, final FileExtension fileExtension) throws IOException {
        a = a((String)a, fileExtension, true);
        final File file = new File(this.b(), (String)a);
        try {
            a = new FileOutputStream(file);
            try {
                final byte[] array = new byte[1024];
                while (true) {
                    final int read = inputStream.read(array);
                    if (read == -1) {
                        break;
                    }
                    ((OutputStream)a).write(array, 0, read);
                }
                ((OutputStream)a).flush();
                return file;
            }
            finally {
                ((OutputStream)a).close();
            }
        }
        finally {
            inputStream.close();
        }
    }
}
