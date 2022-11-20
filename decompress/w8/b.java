// 
// Decompiled by Procyon v0.6.0
// 

package w8;

import java.util.ArrayDeque;
import v8.r;
import v8.o;
import p8.d;
import com.bumptech.glide.load.data.j;
import v8.m$a;
import v8.n$a;
import p8.g;
import v8.m;
import java.io.InputStream;
import v8.f;
import v8.n;

public final class b implements n<f, InputStream>
{
    public static final p8.f<Integer> b;
    public final m<f, f> a;
    
    static {
        b = p8.f.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    }
    
    public b(final m<f, f> a) {
        this.a = a;
    }
    
    public final n$a buildLoadData(final Object o, final int n, final int n2, final g g) {
        final f f = (f)o;
        final m<f, f> a = this.a;
        final f f2 = f;
        if (a != null) {
            final m$a a2 = m$a.a(0, 0, (Object)f);
            final Object a3 = ((l9.g)a.a).a((Object)a2);
            Object o2 = m$a.d;
            synchronized (o2) {
                ((ArrayDeque<m$a>)o2).offer(a2);
                monitorexit(o2);
                if (a3 == null) {
                    o2 = this.a;
                    ((ArrayDeque)o2).getClass();
                    ((l9.g)((m)o2).a).d((Object)m$a.a(0, 0, (Object)f), (Object)f);
                }
            }
        }
        return new n$a((d)f2, (com.bumptech.glide.load.data.d)new j(f2, g.a(w8.b.b)));
    }
    
    public final /* bridge */ boolean handles(final Object o) {
        final f f = (f)o;
        return true;
    }
    
    public static final class a implements o<f, InputStream>
    {
        public final m<f, f> a;
        
        public a() {
            this.a = (m<f, f>)new m();
        }
        
        public final n<f, InputStream> build(final r r) {
            return (n<f, InputStream>)new b(this.a);
        }
        
        public final void teardown() {
        }
    }
}
