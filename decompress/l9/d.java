// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import java.io.IOException;
import java.util.ArrayDeque;
import java.io.InputStream;

public final class d extends InputStream
{
    public static final ArrayDeque h;
    public InputStream f;
    public IOException g;
    
    static {
        final char[] a = j.a;
        h = new ArrayDeque(0);
    }
    
    @Override
    public final int available() throws IOException {
        return this.f.available();
    }
    
    @Override
    public final void close() throws IOException {
        this.f.close();
    }
    
    @Override
    public final void mark(final int n) {
        this.f.mark(n);
    }
    
    @Override
    public final boolean markSupported() {
        return this.f.markSupported();
    }
    
    @Override
    public final int read() throws IOException {
        try {
            return this.f.read();
        }
        catch (final IOException g) {
            throw this.g = g;
        }
    }
    
    @Override
    public final int read(final byte[] array) throws IOException {
        try {
            return this.f.read(array);
        }
        catch (final IOException g) {
            throw this.g = g;
        }
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) throws IOException {
        try {
            read = this.f.read(array, read, n);
            return read;
        }
        catch (final IOException g) {
            throw this.g = g;
        }
    }
    
    @Override
    public final void reset() throws IOException {
        synchronized (this) {
            this.f.reset();
        }
    }
    
    @Override
    public final long skip(long skip) throws IOException {
        try {
            skip = this.f.skip(skip);
            return skip;
        }
        catch (final IOException g) {
            throw this.g = g;
        }
    }
}
