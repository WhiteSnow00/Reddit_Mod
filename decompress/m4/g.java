// 
// Decompiled by Procyon v0.6.0
// 

package m4;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public final class g
{
    public final ByteBuffer a;
    
    public g(final ByteBuffer a) {
        (this.a = a).order(ByteOrder.BIG_ENDIAN);
    }
    
    public final long a() throws IOException {
        return (long)this.a.getInt() & 0xFFFFFFFFL;
    }
    
    public final void b(final int n) throws IOException {
        final ByteBuffer a = this.a;
        a.position(a.position() + n);
    }
}
