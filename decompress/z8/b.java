// 
// Decompiled by Procyon v0.6.0
// 

package z8;

import ng.f0;
import r8.l;

public final class b implements l<byte[]>
{
    public final byte[] f;
    
    public b(final byte[] f) {
        f0.a2(f);
        this.f = f;
    }
    
    @Override
    public final Object get() {
        return this.f;
    }
    
    @Override
    public final Class<byte[]> getResourceClass() {
        return byte[].class;
    }
    
    @Override
    public final int getSize() {
        return this.f.length;
    }
    
    @Override
    public final void recycle() {
    }
}
