// 
// Decompiled by Procyon v0.6.0
// 

package z8;

import com.bumptech.glide.load.data.e$a;
import java.io.IOException;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.data.e;

public final class a implements e<ByteBuffer>
{
    public final ByteBuffer a;
    
    public a(final ByteBuffer a) {
        this.a = a;
    }
    
    public final Object a() throws IOException {
        this.a.position(0);
        return this.a;
    }
    
    public final void b() {
    }
    
    public static final class a implements e$a<ByteBuffer>
    {
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }
        
        public final e b(final Object o) {
            return (e)new z8.a((ByteBuffer)o);
        }
    }
}
