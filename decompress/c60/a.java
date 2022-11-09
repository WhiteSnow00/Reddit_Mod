// 
// Decompiled by Procyon v0.6.0
// 

package c60;

import okhttp3.Call$Factory;
import okhttp3.OkHttpClient;
import wu2.j$a;
import java.util.Objects;
import wu2.x$b;
import wu2.x;
import com.reddit.session.r;
import javax.inject.Inject;
import ah2.f;
import com.squareup.moshi.y;
import bt0.g;

public final class a
{
    public final b a;
    public final g b;
    public final y c;
    
    @Inject
    public a(final b a, final g b, final y c) {
        f.f((Object)a, "okHttpClientProvider");
        f.f((Object)b, "hostSettings");
        f.f((Object)c, "moshi");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final x a(final r r) {
        f.f((Object)r, "sessionView");
        final OkHttpClient b = this.a.b(r);
        final x$b x$b = new x$b();
        Objects.requireNonNull(b, "factory == null");
        x$b.b = (Call$Factory)b;
        x$b.c(this.b.U());
        x$b.a(new xu2.g());
        x$b.b((j$a)zu2.a.a(this.c));
        return x$b.d();
    }
}
