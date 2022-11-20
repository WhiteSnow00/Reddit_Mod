// 
// Decompiled by Procyon v0.6.0
// 

package m72;

import com.reddit.domain.model.streaming.StreamVideoData;
import io.reactivex.internal.operators.mixed.MaybeFlatMapPublisher;
import ik1.d;
import af2.r;
import ff2.q;
import mf2.f;
import sa.j;
import ff2.o;
import io.reactivex.internal.operators.single.SingleFlatMap;
import ru1.n;
import af2.c0;
import io.reactivex.plugins.RxJavaPlugins;
import af2.g0;
import pf2.h;
import af2.g;
import ff0.v0;
import javax.inject.Inject;
import ng2.e;
import java.util.LinkedHashMap;
import android.content.Context;
import com.reddit.mapping.ChatMapper;
import ff0.p;
import xd0.e0;
import s10.a;

public final class b extends android.support.v4.media.b
{
    public final a g;
    public final e0 h;
    public final p i;
    public final n10.a j;
    public final ChatMapper k;
    public final Context l;
    public final LinkedHashMap m;
    
    @Inject
    public b(final a g, final e0 h, final p i, final n10.a j, final ChatMapper k, final Context l) {
        e.f((Object)g, "commentRepository");
        e.f((Object)h, "streamRepository");
        e.f((Object)i, "getLiveComments");
        e.f((Object)j, "localCommentFetcher");
        e.f((Object)k, "chatMapper");
        e.f((Object)l, "context");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = new LinkedHashMap();
    }
    
    public final g S2(final v0 v0) {
        final c0<StreamVideoData> stream = this.h.getStream(((b.b$a)v0).a);
        final m72.a a = new m72.a((Object)this, 0);
        stream.getClass();
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new h((g0)stream, (ff2.g)a));
        final n n = new n((Object)this, 1);
        onAssembly.getClass();
        final c0 onAssembly2 = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)onAssembly, (o)n));
        final j j = new j(26);
        onAssembly2.getClass();
        final af2.n onAssembly3 = RxJavaPlugins.onAssembly((af2.n)new f((g0)onAssembly2, (q)j));
        final q61.b b = new q61.b(4);
        onAssembly3.getClass();
        final af2.n onAssembly4 = RxJavaPlugins.onAssembly((af2.n)new io.reactivex.internal.operators.maybe.a((r)onAssembly3, (o)b));
        final d d = new d((Object)this, 6);
        onAssembly4.getClass();
        final af2.n onAssembly5 = RxJavaPlugins.onAssembly((af2.n)new io.reactivex.internal.operators.maybe.a((r)onAssembly4, (o)d));
        final z12.a a2 = new z12.a((Object)this, 1);
        onAssembly5.getClass();
        final g onErrorReturn = RxJavaPlugins.onAssembly((g)new MaybeFlatMapPublisher(onAssembly5, a2)).onErrorReturn((o)new q61.a(9));
        e.e((Object)onErrorReturn, "streamRepository.getStre\u2026orReturn { Result.Error }");
        return onErrorReturn;
    }
}
