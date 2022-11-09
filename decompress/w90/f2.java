// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import kz0.k;
import hd1.a;
import com.reddit.screen.BaseScreen;
import fd1.c;
import fd1.b;

public final class f2 implements b
{
    public final a1 a;
    public c b;
    public BaseScreen c;
    public a d;
    public String e;
    public zg2.a<u81.a> f;
    
    public f2(final a1 a) {
        this.a = a;
    }
    
    public final f2 a(final a d) {
        d.getClass();
        this.d = d;
        return this;
    }
    
    public final g2 b() {
        k.J((Class)c.class, (Object)this.b);
        k.J((Class)BaseScreen.class, (Object)this.c);
        k.J((Class)a.class, (Object)this.d);
        k.J((Class)String.class, (Object)this.e);
        k.J((Class)zg2.a.class, (Object)this.f);
        return new g2(this.a, this.b, this.c, this.d, (zg2.a)this.f);
    }
}
