// 
// Decompiled by Procyon v0.6.0
// 

package m72;

import ff2.o;
import f40.z;
import af2.c0;
import ff0.v0;
import javax.inject.Inject;
import ng2.e;
import ws0.p;
import com.reddit.domain.model.streaming.StreamingEntryPointType;
import q20.a;
import xd0.s;
import wa0.b0;
import android.support.v4.media.b;

public final class d extends b
{
    public final b0 g;
    public final s h;
    public final p20.b i;
    public final a j;
    public final String k;
    public final c l;
    public final StreamingEntryPointType m;
    public final p n;
    public final n o;
    public final y10.c p;
    
    @Inject
    public d(final b0 g, final s h, final p20.b i, final a j, final String k, final c l, final StreamingEntryPointType m, final p n, final n o, final y10.c p10) {
        e.f((Object)g, "streamFeatures");
        e.f((Object)h, "preferenceRepository");
        e.f((Object)i, "resourceProvider");
        e.f((Object)j, "backgroundThread");
        e.f((Object)l, "getConfig");
        e.f((Object)m, "entryPointType");
        e.f((Object)n, "streamSettings");
        e.f((Object)o, "streamDuHelper");
        e.f((Object)p10, "defaultUserIconFactory");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p10;
    }
    
    public final c0 f1(final v0 v0) {
        final d.d$a d$a = (d.d$a)v0;
        e.f((Object)d$a, "params");
        final c0 b = this.l.x1((v0)new c$a(this.m, this.k)).w((o)new z(11, (Object)this, (Object)d$a)).B((o)new ei1.a(7));
        e.e((Object)b, "getConfig.execute(\n     \u2026\n      Result.Error\n    }");
        return px1.a.K0((c0)b, (q20.d)this.j);
    }
}
