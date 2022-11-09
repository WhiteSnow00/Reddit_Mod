// 
// Decompiled by Procyon v0.6.0
// 

package e60;

import af2.c;
import ah2.f;
import bt0.g;
import okhttp3.OkHttpClient;
import javax.inject.Provider;
import af2.d;

public final class b implements d<a>
{
    public final Provider<OkHttpClient> a;
    public final Provider<g> b;
    public final Provider<r20.a> c;
    
    public b(final Provider<OkHttpClient> a, final Provider<g> b, final Provider<r20.a> c) {
        f.f((Object)a, "okHttpClient");
        f.f((Object)b, "hostSettings");
        f.f((Object)c, "backgroundThread");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final b a(final Provider<OkHttpClient> provider, final Provider<g> provider2, final Provider<r20.a> provider3) {
        f.f((Object)provider, "okHttpClient");
        f.f((Object)provider2, "hostSettings");
        f.f((Object)provider3, "backgroundThread");
        return new b(provider, provider2, provider3);
    }
    
    public final Object get() {
        final xe2.a a = af2.c.a((Provider)this.a);
        f.e((Object)a, "lazy(okHttpClient)");
        final Object value = this.b.get();
        f.e(value, "hostSettings.get()");
        final g g = (g)value;
        final Object value2 = this.c.get();
        f.e(value2, "backgroundThread.get()");
        return new a(a, g, (r20.a)value2);
    }
}
