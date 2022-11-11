// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import java.util.concurrent.Callable;
import java.io.IOException;
import com.danikula.videocache.ProxyCacheException;
import java.io.RandomAccessFile;
import java.io.File;
import u9.a;

public final class b implements a
{
    public final v9.a a;
    public File b;
    public RandomAccessFile c;
    
    public b(final File file, final v9.a a) throws ProxyCacheException {
        Label_0122: {
            if (a == null) {
                break Label_0122;
            }
            try {
                this.a = a;
                v9.c.a(file.getParentFile());
                final boolean exists = file.exists();
                File b;
                if (exists) {
                    b = file;
                }
                else {
                    final File parentFile = file.getParentFile();
                    final StringBuilder sb = new StringBuilder();
                    sb.append(file.getName());
                    sb.append(".download");
                    b = new File(parentFile, sb.toString());
                }
                this.b = b;
                final File b2 = this.b;
                String s;
                if (exists) {
                    s = "r";
                }
                else {
                    s = "rw";
                }
                this.c = new RandomAccessFile(b2, s);
                return;
                throw new NullPointerException();
            }
            catch (final IOException ex) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Error using file ");
                sb2.append(file);
                sb2.append(" as disc cache");
                throw new ProxyCacheException(sb2.toString(), (Throwable)ex);
            }
        }
    }
    
    public final int a(final long n, final byte[] array) throws ProxyCacheException {
        monitorenter(this);
        try {
            try {
                this.c.seek(n);
                final int read = this.c.read(array, 0, 8192);
                monitorexit(this);
                return read;
            }
            finally {}
        }
        catch (final IOException ex) {
            throw new ProxyCacheException(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", 8192, n, this.available(), array.length), (Throwable)ex);
        }
        monitorexit(this);
    }
    
    public final long available() throws ProxyCacheException {
        monitorenter(this);
        try {
            try {
                final long n = (int)this.c.length();
                monitorexit(this);
                return n;
            }
            finally {}
        }
        catch (final IOException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Error reading length of file ");
            sb.append(this.b);
            throw new ProxyCacheException(sb.toString(), (Throwable)ex);
        }
        monitorexit(this);
    }
    
    public final void b(final int n, final byte[] array) throws ProxyCacheException {
        monitorenter(this);
        try {
            if (!this.h()) {
                this.c.seek(this.available());
                this.c.write(array, 0, n);
                monitorexit(this);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Error append cache: cache file ");
            sb.append(this.b);
            sb.append(" is completed!");
            throw new ProxyCacheException(sb.toString());
        }
        catch (final IOException ex) {
            throw new ProxyCacheException(String.format("Error writing %d bytes to %s from buffer with size %d", n, this.c, array.length), (Throwable)ex);
        }
        monitorexit(this);
    }
    
    public final void close() throws ProxyCacheException {
        monitorenter(this);
        try {
            try {
                this.c.close();
                final v9.a a = this.a;
                final File b = this.b;
                final d d = (d)a;
                d.a.submit((Callable<Object>)new d$a(d, b));
                monitorexit(this);
                return;
            }
            finally {}
        }
        catch (final IOException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Error closing file ");
            sb.append(this.b);
            throw new ProxyCacheException(sb.toString(), (Throwable)ex);
        }
        monitorexit(this);
    }
    
    public final void complete() throws ProxyCacheException {
        synchronized (this) {
            if (this.h()) {
                return;
            }
            this.close();
            final File b = new File(this.b.getParentFile(), this.b.getName().substring(0, this.b.getName().length() - 9));
            if (this.b.renameTo(b)) {
                this.b = b;
                try {
                    this.c = new RandomAccessFile(this.b, "r");
                    final v9.a a = this.a;
                    final File b2 = this.b;
                    final d d = (d)a;
                    d.a.submit((Callable<Object>)new d$a(d, b2));
                    return;
                }
                catch (final IOException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Error opening ");
                    sb.append(this.b);
                    sb.append(" as disc cache");
                    throw new ProxyCacheException(sb.toString(), (Throwable)ex);
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Error renaming file ");
            sb2.append(this.b);
            sb2.append(" to ");
            sb2.append(b);
            sb2.append(" for completion!");
            throw new ProxyCacheException(sb2.toString());
        }
    }
    
    public final boolean h() {
        synchronized (this) {
            return this.b.getName().endsWith(".download") ^ true;
        }
    }
}
