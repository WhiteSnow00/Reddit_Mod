// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import vx.d;
import af2.e;
import af2.h;
import jl0.g;
import com.reddit.events.creatorstats.CreatorStatsAnalytics;
import iv0.b;
import javax.inject.Provider;
import com.reddit.screen.BaseScreen;
import zg2.l;
import j$.time.ZonedDateTime;
import as1.c;
import pg2.j;
import zg2.p;
import zg2.a;

public final class h3
{
    public final a<Boolean> a;
    public final p<? super Integer, ? super String, String> b;
    public final a<j> c;
    public final c d;
    public final a<ZonedDateTime> e;
    public final l<? super ZonedDateTime, String> f;
    public final BaseScreen g;
    public final a1 h;
    public Provider<jl0.a> i;
    public b j;
    public Provider<cs1.a> k;
    public Provider<CreatorStatsAnalytics> l;
    
    public h3(final a1 h, final BaseScreen g, final a c, final a a, final p b, final c d, final a e, final l f) {
        this.h = h;
        this.a = (a<Boolean>)a;
        this.b = (p<? super Integer, ? super String, String>)b;
        this.c = (a<j>)c;
        this.d = d;
        this.e = (a<ZonedDateTime>)e;
        this.f = (l<? super ZonedDateTime, String>)f;
        this.g = g;
        this.i = (Provider<jl0.a>)af2.h.a((Provider)jl0.g.a((Provider)h.m));
        this.j = iv0.b.b((Provider)af2.e.a((Object)g));
        this.k = (Provider<cs1.a>)af2.c.b((Provider)new d((Provider)this.j, (Provider)h.c1, (Provider)r40.a.a((Provider)this.j, ms1.a.a((Provider)h.b0, (Provider)h.y), (Provider)h.m, (Provider)h.z0, (Provider)h.A0), 23));
        this.l = (Provider<CreatorStatsAnalytics>)af2.c.b((Provider)ug0.a.d((Provider)h.h));
    }
}
