// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import g60.u1;
import com.reddit.screen.BaseScreen;
import cv1.c;
import com.reddit.events.topic.TopicAnalytics;
import javax.inject.Provider;
import kf1.b;
import af2.e;
import cv1.a;

public final class of
{
    public final a a;
    public final a1 b;
    public e c;
    public e d;
    public b e;
    public Provider<TopicAnalytics> f;
    public Provider<cv1.b> g;
    
    public of(final a1 b, final c c, final a a, final zg2.a a2, final BaseScreen baseScreen) {
        this.b = b;
        this.a = a;
        this.c = af2.e.a((Object)c);
        this.d = af2.e.a((Object)a);
        this.e = new b((Provider)b.m, (Provider)af2.e.a((Object)a2), 3);
        this.f = (Provider<TopicAnalytics>)af2.c.b((Provider)new qb0.b((Provider)b.h, 24));
        this.g = (Provider<cv1.b>)af2.c.b((Provider)new u1((Provider)this.c, (Provider)this.d, (Provider)b.m, (Provider)this.e, (Provider)b.z4, this.f, (Provider)b.w, (Provider)af2.e.a((Object)baseScreen), 5));
    }
}
