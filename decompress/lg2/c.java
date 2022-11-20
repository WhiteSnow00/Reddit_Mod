// 
// Decompiled by Procyon v0.6.0
// 

package lg2;

import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.io.NoSuchFileException;
import java.io.Closeable;
import zd.b;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import kotlin.io.FileSystemException;
import kotlin.io.FileAlreadyExistsException;
import ng2.e;
import java.io.File;
import zg.a;

public class c extends a
{
    public static void B0(File file, final File file2, boolean b, final int n) {
        int n2 = 0;
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        if ((n & 0x4) != 0x0) {
            n2 = 8192;
        }
        e.f((Object)file, "<this>");
        e.f((Object)file2, "target");
        if (file.exists()) {
            if (file2.exists()) {
                if (!b) {
                    throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
                }
                if (!file2.delete()) {
                    throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                }
            }
            if (file.isDirectory()) {
                if (file2.mkdirs()) {
                    return;
                }
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            else {
                final File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            file = (File)new FileInputStream(file);
            try {
                final FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    xd.a.M((InputStream)file, (OutputStream)fileOutputStream, n2);
                    b.u(fileOutputStream, null);
                    b.u((Closeable)file, null);
                    return;
                }
                finally {
                    try {}
                    finally {
                        b.u(fileOutputStream, (Throwable)file2);
                    }
                }
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    b.u((Closeable)file, t);
                }
            }
        }
        throw new NoSuchFileException(file, (File)null, "The source file doesn't exist.", 2, (DefaultConstructorMarker)null);
    }
    
    public static final boolean C0(final File file) {
        e.f((Object)file, "<this>");
        final FileWalkDirection bottom_UP = FileWalkDirection.BOTTOM_UP;
        e.f((Object)bottom_UP, "direction");
        final lg2.b.b b = new lg2.b.b();
        boolean b2 = false;
    Label_0033:
        while (true) {
            b2 = true;
            while (b.hasNext()) {
                final File file2 = (File)b.next();
                if ((file2.delete() || !file2.exists()) && b2) {
                    continue Label_0033;
                }
                b2 = false;
            }
            break;
        }
        return b2;
    }
}
