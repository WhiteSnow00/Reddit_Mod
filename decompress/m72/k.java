// 
// Decompiled by Procyon v0.6.0
// 

package m72;

import af2.c0;
import y30.a;
import f40.z;
import af2.g;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.o;
import af2.g0;
import io.reactivex.internal.operators.single.SingleFlatMapPublisher;
import es1.h;
import af2.t;
import ff0.v0;
import javax.inject.Inject;
import ng2.e;
import com.reddit.domain.model.streaming.StreamingEntryPointType;
import xd0.s;
import wa0.b0;
import java.util.concurrent.TimeUnit;
import android.support.v4.media.b;

public final class k extends b
{
    public static final TimeUnit n;
    public final b0 g;
    public final s h;
    public final i i;
    public final p20.b j;
    public final StreamingEntryPointType k;
    public final c l;
    public final y10.c m;
    
    static {
        n = TimeUnit.SECONDS;
    }
    
    @Inject
    public k(final b0 g, final s h, final i i, final p20.b j, final StreamingEntryPointType k, final c l, final y10.c m) {
        e.f((Object)g, "streamFeatures");
        e.f((Object)h, "preferenceRepository");
        e.f((Object)i, "getStreams");
        e.f((Object)j, "resourceProvider");
        e.f((Object)k, "entryPointType");
        e.f((Object)l, "getConfig");
        e.f((Object)m, "defaultUserIconFactory");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public final t S2(final v0 v0) {
        final k.k$a k$a = (k.k$a)v0;
        final c l = this.l;
        final c$a c$a = new c$a(this.k, k$a.b);
        l.getClass();
        final c0 f1 = l.f1((v0)c$a);
        final t observable = RxJavaPlugins.onAssembly((g)new SingleFlatMapPublisher((g0)f1, (o)new h((Object)f1, 6))).switchMap((o)new z(12, (Object)this, (Object)k$a)).map((o)new a(19, (Object)this, (Object)k$a)).onErrorReturn((o)new tf0.a(22)).toObservable();
        e.e((Object)observable, "configurationRequest\n   \u2026  }\n      .toObservable()");
        return observable;
    }
}
