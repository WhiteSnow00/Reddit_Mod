// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import db0.l;
import e80.h;
import com.reddit.session.Session;
import com.reddit.session.q;
import kz0.k;
import af2.c;
import bh1.a$a;
import kotlin.random.Random;
import javax.inject.Provider;
import mj2.b0;
import android.app.Activity;
import android.content.Context;
import zg2.a;

public final class eo implements du
{
    public final a<? extends Context> a;
    public final a<? extends Activity> b;
    public final b0 c;
    public final kl d;
    public Provider<Random> e;
    
    public eo(final kl d, final a b, final a a, final b0 c) {
        this.d = d;
        this.a = (a<? extends Context>)a;
        this.b = (a<? extends Activity>)b;
        this.c = c;
        this.e = (Provider<Random>)af2.c.b((Provider)a$a.a);
    }
    
    public final fh1.c a() {
        final q e = ((e0)this.d.a).E();
        k.N((Object)e);
        final a<? extends Activity> b = this.b;
        final Session c = ((e0)this.d.a).c();
        k.N((Object)c);
        final h i0 = ((e0)this.d.a).I0();
        k.N((Object)i0);
        final Context l = ((e0)this.d.a).l();
        k.N((Object)l);
        final l d = ((e0)this.d.a).D();
        k.N((Object)d);
        final fh1.a a = new fh1.a(i0, l, d);
        final db0.c m6 = ((e0)this.d.a).M6();
        k.N((Object)m6);
        final jx.k d2 = ((e0)this.d.a).d5();
        k.N((Object)d2);
        return new fh1.c(e, (a)b, c, a, m6, d2);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.d.k();
    }
}
