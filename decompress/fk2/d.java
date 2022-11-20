// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import ng2.e;
import java.io.OutputStream;

public final class d extends OutputStream
{
    public final c f;
    
    public d(final c f) {
        this.f = f;
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final void flush() {
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append(".outputStream()");
        return sb.toString();
    }
    
    @Override
    public final void write(final int n) {
        this.f.S(n);
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        e.f((Object)array, "data");
        this.f.O(n, n2, array);
    }
}
