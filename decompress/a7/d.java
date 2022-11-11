// 
// Decompiled by Procyon v0.6.0
// 

package a7;

import java.io.OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.File;
import com.airbnb.lottie.network.FileExtension;

public final class d
{
    public final c a;
    
    public d(final q6.c a) {
        this.a = (c)a;
    }
    
    public static String a(String s, final FileExtension fileExtension, final boolean b) {
        final StringBuilder r = a.r("lottie_cache_");
        r.append(s.replaceAll("\\W+", ""));
        if (b) {
            s = fileExtension.tempExtension();
        }
        else {
            s = fileExtension.extension;
        }
        r.append(s);
        return r.toString();
    }
    
    public final File b() {
        final q6.c c = (q6.c)this.a;
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
