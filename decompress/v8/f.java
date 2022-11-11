// 
// Decompiled by Procyon v0.6.0
// 

package v8;

import u8.r;
import u8.o;
import u8.n$a;
import o8.g;
import java.io.InputStream;
import java.net.URL;
import u8.n;

public final class f implements n<URL, InputStream>
{
    public final n<u8.f, InputStream> a;
    
    public f(final n<u8.f, InputStream> a) {
        this.a = a;
    }
    
    public final n$a buildLoadData(final Object o, final int n, final int n2, final g g) {
        return this.a.buildLoadData((Object)new u8.f((URL)o), n, n2, g);
    }
    
    public static final class a implements o<URL, InputStream>
    {
        public final n<URL, InputStream> build(final r r) {
            return (n<URL, InputStream>)new f((n<u8.f, InputStream>)r.b((Class)u8.f.class, (Class)InputStream.class));
        }
        
        public final void teardown() {
        }
    }
}
