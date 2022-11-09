// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import android.util.Log;
import androidx.appcompat.widget.s0;
import java.util.HashSet;
import java.io.IOException;
import android.content.pm.PackageManager$NameNotFoundException;
import java.io.File;
import android.content.Context;

public final class f
{
    public final long a;
    public final Context b;
    public File c;
    
    public f(final Context b) throws PackageManager$NameNotFoundException {
        this.b = b;
        this.a = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionCode;
    }
    
    public static void d(final File file) throws IOException {
        if (file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (int length = listFiles.length, i = 0; i < length; ++i) {
                    d(listFiles[i]);
                }
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }
    
    public static File e(final File file, final String s) throws IOException {
        final File file2 = new File(file, s);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }
    
    public static void f(final File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
        else {
            file.mkdirs();
            if (!file.isDirectory()) {
                final String value = String.valueOf(file.getAbsolutePath());
                String concat;
                if (value.length() != 0) {
                    concat = "Unable to create directory: ".concat(value);
                }
                else {
                    concat = new String("Unable to create directory: ");
                }
                throw new IOException(concat);
            }
        }
    }
    
    public final File a(final String s) throws IOException {
        final File file = new File(this.h(), "verified-splits");
        f(file);
        return e(file, String.valueOf(s).concat(".apk"));
    }
    
    public final HashSet b() throws IOException {
        final File file = new File(this.h(), "verified-splits");
        f(file);
        final HashSet set = new HashSet();
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (final File file2 : listFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && (file2.canWrite() ^ true)) {
                    final String name = file2.getName();
                    set.add(new d(file2, name.substring(0, name.length() - 4)));
                }
            }
        }
        return set;
    }
    
    public final void c() throws IOException {
        final File g = this.g();
        final String[] list = g.list();
        if (list != null) {
            for (final String s : list) {
                if (!s.equals(Long.toString(this.a))) {
                    final File file = new File(g, s);
                    final String value = String.valueOf(file);
                    final long a = this.a;
                    final StringBuilder sb = new StringBuilder(value.length() + 118);
                    s0.v(sb, "FileStorage: removing directory for different version code (directory = ", value, ", current version code = ");
                    sb.append(a);
                    sb.append(")");
                    Log.d("SplitCompat", sb.toString());
                    d(file);
                }
            }
        }
    }
    
    public final File g() throws IOException {
        if (this.c == null) {
            final Context b = this.b;
            if (b == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.c = b.getFilesDir();
        }
        final File file = new File(this.c, "splitcompat");
        f(file);
        return file;
    }
    
    public final File h() throws IOException {
        final File file = new File(this.g(), Long.toString(this.a));
        f(file);
        return file;
    }
}
