// 
// Decompiled by Procyon v0.6.0
// 

package q3;

import java.io.FileNotFoundException;
import android.os.ParcelFileDescriptor;
import android.content.ContentResolver;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;
import android.os.CancellationSignal;
import java.nio.MappedByteBuffer;
import android.net.Uri;
import ak0.n;
import android.os.Process;
import android.content.Context;
import android.os.StrictMode$ThreadPolicy;
import android.util.Log;
import java.io.FileOutputStream;
import android.os.StrictMode;
import java.io.InputStream;
import android.content.res.Resources;
import java.io.File;
import java.io.IOException;
import java.io.Closeable;

public final class q
{
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
    
    public static boolean b(final File file, final Resources resources, final int n) {
        Closeable closeable;
        try {
            final InputStream openRawResource = resources.openRawResource(n);
            try {
                final boolean c = c(file, openRawResource);
                a(openRawResource);
                return c;
            }
            finally {}
        }
        finally {
            closeable = null;
        }
        a(closeable);
    }
    
    public static boolean c(final File file, final InputStream ex) {
        final StrictMode$ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        final Closeable closeable = null;
        FileOutputStream fileOutputStream = null;
        Closeable closeable2;
        try {
            try {
                fileOutputStream = fileOutputStream;
                final FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    final byte[] array = new byte[1024];
                    while (true) {
                        final int read = ((InputStream)ex).read(array);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(array, 0, read);
                    }
                    a(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                catch (final IOException ex) {}
            }
            finally {}
        }
        catch (final IOException ex) {
            closeable2 = closeable;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Error copying resource contents to temp file: ");
        sb.append(ex.getMessage());
        Log.e("TypefaceCompatUtil", sb.toString());
        a(closeable2);
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
        return false;
        final FileOutputStream fileOutputStream2 = fileOutputStream;
        a(fileOutputStream2);
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
    }
    
    public static File d(Context cacheDir) {
        cacheDir = (Context)cacheDir.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        final StringBuilder k = a.k(".font");
        k.append(Process.myPid());
        k.append("-");
        k.append(Process.myTid());
        k.append("-");
        final String string = k.toString();
        int n = 0;
    Label_0087_Outer:
        while (true) {
            Label_0093: {
                if (n >= 100) {
                    break Label_0093;
                }
                final File file = new File((File)cacheDir, ak0.n.k(string, n));
                while (true) {
                    try {
                        if (file.createNewFile()) {
                            return file;
                        }
                        ++n;
                        continue Label_0087_Outer;
                        return null;
                    }
                    catch (final IOException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static MappedByteBuffer e(Context a, Uri uri) {
        final ContentResolver contentResolver = a.getContentResolver();
        try {
            a = (Context)q.a.a(contentResolver, uri, "r", null);
            if (a == null) {
                if (a != null) {
                    ((ParcelFileDescriptor)a).close();
                }
                return null;
            }
            try {
                uri = (Uri)new FileInputStream(((ParcelFileDescriptor)a).getFileDescriptor());
                try {
                    final FileChannel channel = ((FileInputStream)uri).getChannel();
                    final MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    ((FileInputStream)uri).close();
                    ((ParcelFileDescriptor)a).close();
                    return map;
                }
                finally {
                    try {
                        ((FileInputStream)uri).close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
            finally {
                try {
                    ((ParcelFileDescriptor)a).close();
                }
                finally {
                    final Throwable t3;
                    ((Throwable)uri).addSuppressed(t3);
                }
            }
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public static final class a
    {
        public static ParcelFileDescriptor a(final ContentResolver contentResolver, final Uri uri, final String s, final CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, s, cancellationSignal);
        }
    }
}
