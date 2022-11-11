// 
// Decompiled by Procyon v0.6.0
// 

package a7;

import java.io.IOException;
import java.io.File;
import java.util.zip.ZipInputStream;
import java.io.FileInputStream;
import q6.r;
import com.airbnb.lottie.network.FileExtension;
import c7.c;
import q6.h;
import q6.h0;
import java.io.InputStream;

public final class e
{
    public final d a;
    public final b b;
    
    public e(final d a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    public final h0<h> a(String a, final InputStream inputStream, final String s, final String s2) throws IOException {
        String s3 = s;
        if (s == null) {
            s3 = "application/json";
        }
        FileExtension fileExtension;
        h0 h0;
        if (!s3.contains("application/zip") && !s3.contains("application/x-zip") && !s3.contains("application/x-zip-compressed") && !a.split("\\?")[0].endsWith(".lottie")) {
            c.a();
            fileExtension = FileExtension.JSON;
            if (s2 == null) {
                h0 = r.d(inputStream, (String)null);
            }
            else {
                h0 = r.d((InputStream)new FileInputStream(this.a.c(a, inputStream, fileExtension).getAbsolutePath()), a);
            }
        }
        else {
            c.a();
            fileExtension = FileExtension.ZIP;
            if (s2 == null) {
                h0 = r.h(new ZipInputStream(inputStream), (String)null);
            }
            else {
                h0 = r.h(new ZipInputStream(new FileInputStream(this.a.c(a, inputStream, fileExtension))), a);
            }
        }
        if (s2 != null && h0.a != null) {
            final d a2 = this.a;
            a2.getClass();
            a = d.a(a, fileExtension, true);
            final File file = new File(a2.b(), a);
            final File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            final boolean renameTo = file.renameTo(file2);
            file2.toString();
            c.a();
            if (!renameTo) {
                final StringBuilder r = a.r("Unable to rename cache file ");
                r.append(file.getAbsolutePath());
                r.append(" to ");
                r.append(file2.getAbsolutePath());
                r.append(".");
                c.b(r.toString());
            }
        }
        return (h0<h>)h0;
    }
}
