// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import bd.d0;
import java.io.IOException;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;
import java.io.InputStream;

public final class i extends InputStream
{
    public final a f;
    public final b g;
    public final byte[] h;
    public boolean i;
    public boolean j;
    
    public i(final a f, final b g) {
        this.i = false;
        this.j = false;
        this.f = f;
        this.g = g;
        this.h = new byte[1];
    }
    
    public final void b() throws IOException {
        if (!this.i) {
            this.f.a(this.g);
            this.i = true;
        }
    }
    
    @Override
    public final void close() throws IOException {
        if (!this.j) {
            this.f.close();
            this.j = true;
        }
    }
    
    @Override
    public final int read() throws IOException {
        final int read = this.read(this.h);
        int n = -1;
        if (read != -1) {
            n = (this.h[0] & 0xFF);
        }
        return n;
    }
    
    @Override
    public final int read(final byte[] array) throws IOException {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) throws IOException {
        d0.f(this.j ^ true);
        this.b();
        read = ((f)this.f).read(array, read, n);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
