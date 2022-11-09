// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public final class c extends FilterInputStream
{
    public final long f;
    public int g;
    
    public c(final InputStream inputStream, final long f) {
        super(inputStream);
        this.f = f;
    }
    
    @Override
    public final int available() throws IOException {
        synchronized (this) {
            return (int)Math.max(this.f - this.g, super.in.available());
        }
    }
    
    public final void b(final int n) throws IOException {
        if (n >= 0) {
            this.g += n;
        }
        else if (this.f - this.g > 0L) {
            final StringBuilder k = a.k("Failed to read all expected data, expected: ");
            k.append(this.f);
            k.append(", but read: ");
            k.append(this.g);
            throw new IOException(k.toString());
        }
    }
    
    @Override
    public final int read() throws IOException {
        synchronized (this) {
            final int read = super.read();
            int n;
            if (read >= 0) {
                n = 1;
            }
            else {
                n = -1;
            }
            this.b(n);
            return read;
        }
    }
    
    @Override
    public final int read(final byte[] array) throws IOException {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) throws IOException {
        synchronized (this) {
            read = super.read(array, read, n);
            this.b(read);
            return read;
        }
    }
}
