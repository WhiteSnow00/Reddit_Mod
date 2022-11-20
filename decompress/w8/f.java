// 
// Decompiled by Procyon v0.6.0
// 

package w8;

import v8.r;
import v8.o;
import v8.n$a;
import p8.g;
import java.io.InputStream;
import java.net.URL;
import v8.n;

public final class f implements n<URL, InputStream>
{
    public final n<v8.f, InputStream> a;
    
    public f(final n<v8.f, InputStream> a) {
        this.a = a;
    }
    
    public final n$a buildLoadData(final Object o, final int n, final int n2, final g g) {
        return this.a.buildLoadData((Object)new v8.f((URL)o), n, n2, g);
    }
    
    public final /* bridge */ boolean handles(final Object o) {
        final URL url = (URL)o;
        return true;
    }
    
    public static final class a implements o<URL, InputStream>
    {
        public final n<URL, InputStream> build(final r r) {
            return (n<URL, InputStream>)new f((n<v8.f, InputStream>)r.b((Class)v8.f.class, (Class)InputStream.class));
        }
        
        public final void teardown() {
        }
    }
}
