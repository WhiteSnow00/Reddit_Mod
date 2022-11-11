// 
// Decompiled by Procyon v0.6.0
// 

package vd2;

import java.io.RandomAccessFile;

public final class m extends j
{
    public final RandomAccessFile f;
    
    public m(final RandomAccessFile f) {
        (this.f = f).seek(0L);
    }
    
    public final void close() {
        this.f.close();
    }
    
    public final void f(final long n) {
        this.f.seek(n);
    }
    
    public final void flush() {
    }
    
    public final void g(final byte[] array, final int n) {
        this.f.write(array, 0, n);
    }
}
