// 
// Decompiled by Procyon v0.6.0
// 

package ol2;

import dl2.b;
import java.security.MessageDigest;

public class a extends MessageDigest
{
    public b f;
    public int g;
    
    public a(final el2.b f) {
        super(f.e());
        this.f = (b)f;
        this.g = f.e / 8;
    }
    
    public final byte[] engineDigest() {
        final byte[] array = new byte[this.g];
        this.f.g(0, array);
        return array;
    }
    
    public final int engineGetDigestLength() {
        return this.g;
    }
    
    public final void engineReset() {
        this.f.reset();
    }
    
    public final void engineUpdate(final byte b) {
        this.f.c(b);
    }
    
    public final void engineUpdate(final byte[] array, final int n, final int n2) {
        this.f.b(n, n2, array);
    }
}
