// 
// Decompiled by Procyon v0.6.0
// 

package x50;

import okhttp3.Call$Factory;
import okhttp3.OkHttpClient;
import ku2.j$a;
import java.util.Objects;
import ku2.x$b;
import ku2.x;
import com.reddit.session.o;
import javax.inject.Inject;
import ng2.e;
import com.squareup.moshi.y;
import ws0.g;

public final class a
{
    public final b a;
    public final g b;
    public final y c;
    
    @Inject
    public a(final b a, final g b, final y c) {
        e.f((Object)a, "okHttpClientProvider");
        e.f((Object)b, "hostSettings");
        e.f((Object)c, "moshi");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final x a(final o o) {
        e.f((Object)o, "sessionView");
        final OkHttpClient b = this.a.b(o);
        final x$b x$b = new x$b();
        Objects.requireNonNull(b, "factory == null");
        x$b.b = (Call$Factory)b;
        x$b.c(this.b.s());
        x$b.a(new lu2.g());
        x$b.b((j$a)nu2.a.a(this.c));
        return x$b.d();
    }
}
