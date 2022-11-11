// 
// Decompiled by Procyon v0.6.0
// 

package vd2;

import java.io.FileOutputStream;

public final class l extends j
{
    public final FileOutputStream f;
    
    public l(final FileOutputStream f) {
        this.f = f;
        f.getChannel().position(0L);
    }
    
    public final void close() {
        this.f.close();
    }
    
    public final void f(final long n) {
        this.f.getChannel().position(n);
    }
    
    public final void flush() {
        this.f.flush();
    }
    
    public final void g(final byte[] array, final int n) {
        this.f.write(array, 0, n);
    }
}
