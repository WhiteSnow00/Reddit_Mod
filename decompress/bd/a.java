// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import wi.b;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import a40.f;
import android.util.Log;
import androidx.viewpager.widget.c;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;

public final class a
{
    public final File a;
    public final File b;
    
    public a(final File a) {
        this.a = a;
        this.b = new File(String.valueOf(a.getPath()).concat(".bak"));
    }
    
    public final FileInputStream a() throws FileNotFoundException {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
        return new FileInputStream(this.a);
    }
    
    public final a b() throws IOException {
        if (this.a.exists()) {
            if (!this.b.exists()) {
                if (!this.a.renameTo(this.b)) {
                    final String value = String.valueOf(this.a);
                    final String value2 = String.valueOf(this.b);
                    Log.w("AtomicFile", c.f(value2.length() + (value.length() + 37), "Couldn't rename file ", value, " to backup file ", value2));
                }
            }
            else {
                this.a.delete();
            }
        }
        try {
            return new a(this.a);
        }
        catch (final FileNotFoundException ex) {
            final File parentFile = this.a.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new a(this.a);
                }
                catch (final FileNotFoundException ex2) {
                    final String value3 = String.valueOf(this.a);
                    throw new IOException(f.k(value3.length() + 16, "Couldn't create ", value3), ex2);
                }
            }
            final String value4 = String.valueOf(this.a);
            throw new IOException(f.k(value4.length() + 16, "Couldn't create ", value4), ex);
        }
    }
    
    public static final class a extends OutputStream
    {
        public final FileOutputStream f;
        public boolean g;
        
        public a(final File file) throws FileNotFoundException {
            this.g = false;
            this.f = new FileOutputStream(file);
        }
        
        @Override
        public final void close() throws IOException {
            if (this.g) {
                return;
            }
            this.g = true;
            this.flush();
            try {
                this.f.getFD().sync();
            }
            catch (final IOException ex) {
                wi.b.n0("AtomicFile", "Failed to sync file descriptor:", (Throwable)ex);
            }
            this.f.close();
        }
        
        @Override
        public final void flush() throws IOException {
            this.f.flush();
        }
        
        @Override
        public final void write(final int n) throws IOException {
            this.f.write(n);
        }
        
        @Override
        public final void write(final byte[] array) throws IOException {
            this.f.write(array);
        }
        
        @Override
        public final void write(final byte[] array, final int n, final int n2) throws IOException {
            this.f.write(array, n, n2);
        }
    }
}
