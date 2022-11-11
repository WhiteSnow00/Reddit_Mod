// 
// Decompiled by Procyon v0.6.0
// 

package vd2;

import java.io.Closeable;
import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import android.content.ContentResolver;
import com.tonyodev.fetch2core.Downloader$b;
import java.io.IOException;
import nn0.a;
import android.net.Uri;
import sg2.e;
import android.content.Context;

public final class b implements k
{
    public final Context a;
    public final String b;
    
    public b(final Context a, final String b) {
        e.g((Object)a, "context");
        e.g((Object)b, "defaultTempDir");
        this.a = a;
        this.b = b;
    }
    
    public final String a(String s, final boolean b) {
        e.g((Object)s, "file");
        final Context a = this.a;
        e.g((Object)a, "context");
        if (b.o1(s)) {
            final Uri parse = Uri.parse(s);
            e.b((Object)parse, "uri");
            if (e.a((Object)parse.getScheme(), (Object)"file")) {
                final String path = parse.getPath();
                if (path != null) {
                    s = path;
                }
                s = nn0.a.p(s, b);
            }
            else {
                if (!e.a((Object)parse.getScheme(), (Object)"content")) {
                    throw new IOException("FNC");
                }
                if (a.getContentResolver().openFileDescriptor(parse, "w") == null) {
                    throw new IOException("FNC");
                }
            }
        }
        else {
            s = nn0.a.p(s, b);
        }
        return s;
    }
    
    public final j b(final Downloader$b downloader$b) {
        final String c = downloader$b.c;
        final ContentResolver contentResolver = this.a.getContentResolver();
        e.b((Object)contentResolver, "context.contentResolver");
        return nn0.a.x(c, contentResolver);
    }
    
    public final boolean c(final String s) {
        e.g((Object)s, "file");
        final int length = s.length();
        boolean b = true;
        if (length == 0) {
            return false;
        }
        try {
            final ContentResolver contentResolver = this.a.getContentResolver();
            e.b((Object)contentResolver, "context.contentResolver");
            ((Closeable)nn0.a.x(s, contentResolver)).close();
        }
        catch (final Exception ex) {
            b = false;
        }
        return b;
    }
    
    public final String d(final Downloader$b downloader$b) {
        return this.b;
    }
    
    public final void e(final long n, String s) {
        e.g((Object)s, "file");
        if (s.length() == 0) {
            throw new FileNotFoundException(al0.b.h(s, " file_not_found"));
        }
        if (n < 1L) {
            return;
        }
        final Context a = this.a;
        e.g((Object)a, "context");
        if (lw0.b.o1(s)) {
            final Uri parse = Uri.parse(s);
            e.b((Object)parse, "uri");
            if (e.a((Object)parse.getScheme(), (Object)"file")) {
                final String path = parse.getPath();
                if (path != null) {
                    s = path;
                }
                nn0.a.i(new File(s), n);
            }
            else {
                if (e.a((Object)parse.getScheme(), (Object)"content")) {
                    final ParcelFileDescriptor openFileDescriptor = a.getContentResolver().openFileDescriptor(parse, "w");
                    if (openFileDescriptor != null) {
                        if (n <= 0L) {
                            return;
                        }
                        try {
                            final FileOutputStream fileOutputStream = new FileOutputStream(openFileDescriptor.getFileDescriptor());
                            if (fileOutputStream.getChannel().size() == n) {
                                return;
                            }
                            fileOutputStream.getChannel().position(n - 1L);
                            fileOutputStream.write(1);
                            return;
                        }
                        catch (final Exception ex) {
                            throw new IOException("file_allocation_error");
                        }
                    }
                    throw new IOException("file_allocation_error");
                }
                throw new IOException("file_allocation_error");
            }
        }
        else {
            nn0.a.i(new File(s), n);
        }
    }
}
