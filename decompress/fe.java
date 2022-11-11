// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import kz0.k;
import com.reddit.vault.h;
import mo0.b;
import android.app.Activity;
import com.reddit.screen.BaseScreen;
import android.content.Context;
import zg2.a;
import mo0.d;
import ql0.o0;

public final class fe implements o0
{
    public final a1 a;
    public d b;
    public a<? extends Context> c;
    public BaseScreen d;
    public a<? extends Activity> e;
    public b f;
    public h g;
    public no0.a h;
    
    public fe(final a1 a) {
        this.a = a;
    }
    
    public final fe a(final d b) {
        b.getClass();
        this.b = b;
        return this;
    }
    
    public final ge b() {
        k.J((Class)d.class, (Object)this.b);
        k.J((Class)a.class, (Object)this.c);
        k.J((Class)BaseScreen.class, (Object)this.d);
        k.J((Class)a.class, (Object)this.e);
        k.J((Class)b.class, (Object)this.f);
        k.J((Class)h.class, (Object)this.g);
        k.J((Class)no0.a.class, (Object)this.h);
        return new ge(this.a, this.b, (a)this.c, (a)this.e, this.f, this.g, this.h);
    }
}
