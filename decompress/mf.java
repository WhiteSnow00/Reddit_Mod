// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import h40.g;
import bv1.c;
import bv1.b;
import com.reddit.events.topic.TopicAnalytics;
import javax.inject.Provider;
import ei1.a;
import af2.e;

public final class mf
{
    public final a1 a;
    public e b;
    public e c;
    public a d;
    public zy.e e;
    public Provider<TopicAnalytics> f;
    public Provider<b> g;
    
    public mf(final a1 a, final c c, final bv1.a a2) {
        this.a = a;
        this.b = af2.e.a((Object)c);
        this.c = af2.e.a((Object)a2);
        this.d = new a((Object)a.K2, 3);
        this.e = zy.e.a((Provider)a.y, (Provider)a.e, (Provider)a.o0);
        final Provider b = af2.c.b((Provider)new qb0.b((Provider)a.h, 24));
        this.f = (Provider<TopicAnalytics>)b;
        this.g = (Provider<b>)af2.c.b((Provider)new g((Provider)this.b, (Provider)this.c, (Provider)a.z4, (Provider)this.d, (Provider)a.m, (Provider)a.c0, (Provider)a.c, (Provider)this.e, b, 5));
    }
}
