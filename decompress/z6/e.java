// 
// Decompiled by Procyon v0.6.0
// 

package z6;

import java.io.IOException;
import java.io.File;
import java.util.zip.ZipInputStream;
import java.io.FileInputStream;
import p6.r;
import com.airbnb.lottie.network.FileExtension;
import b7.c;
import p6.h;
import p6.i0;
import java.io.InputStream;

public final class e
{
    public final d a;
    public final b b;
    
    public e(final d a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    public final i0<h> a(String a, final InputStream inputStream, final String s, final String s2) throws IOException {
        String s3 = s;
        if (s == null) {
            s3 = "application/json";
        }
        FileExtension fileExtension;
        i0<h> i0;
        if (!s3.contains("application/zip") && !s3.contains("application/x-zip") && !s3.contains("application/x-zip-compressed") && !a.split("\\?")[0].endsWith(".lottie")) {
            c.a();
            fileExtension = FileExtension.JSON;
            if (s2 == null) {
                i0 = r.d(inputStream, null);
            }
            else {
                i0 = r.d(new FileInputStream(this.a.c(a, inputStream, fileExtension).getAbsolutePath()), a);
            }
        }
        else {
            c.a();
            fileExtension = FileExtension.ZIP;
            if (s2 == null) {
                i0 = r.h(new ZipInputStream(inputStream), null);
            }
            else {
                i0 = r.h(new ZipInputStream(new FileInputStream(this.a.c(a, inputStream, fileExtension))), a);
            }
        }
        if (s2 != null && i0.a != null) {
            final d a2 = this.a;
            a2.getClass();
            a = d.a(a, fileExtension, true);
            final File file = new File(a2.b(), a);
            final File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            final boolean renameTo = file.renameTo(file2);
            file2.toString();
            c.a();
            if (!renameTo) {
                final StringBuilder t = a.t("Unable to rename cache file ");
                t.append(file.getAbsolutePath());
                t.append(" to ");
                t.append(file2.getAbsolutePath());
                t.append(".");
                c.b(t.toString());
            }
        }
        return i0;
    }
}
