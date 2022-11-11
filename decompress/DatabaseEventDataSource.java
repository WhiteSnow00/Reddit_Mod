// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.datasource.local;

import com.squareup.moshi.JsonAdapter;
import com.reddit.data.events.models.EventsResult;
import jj2.g;
import java.util.Collection;
import nf2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import java.util.concurrent.Callable;
import cg2.j;
import nf2.c0;
import com.reddit.data.events.models.Event;
import zg2.l;
import jj2.k;
import zg2.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import io.reactivex.plugins.RxJavaPlugins;
import sf2.o;
import nf2.r;
import nf2.n;
import javax.inject.Inject;
import pg2.f;
import kh0.a;
import com.squareup.moshi.y;
import u40.b;

public final class DatabaseEventDataSource implements b
{
    public final y a;
    public final a b;
    public final f c;
    
    @Inject
    public DatabaseEventDataSource(final y a, final a b) {
        ah2.f.f((Object)a, "moshi");
        ah2.f.f((Object)b, "eventDao");
        this.a = a;
        this.b = b;
        this.c = kotlin.a.b((zg2.a)new DatabaseEventDataSource$adapter.DatabaseEventDataSource$adapter$2(this));
    }
    
    public final n a() {
        final n f = this.b.f();
        final wu.f f2 = new wu.f((Object)this, 11);
        f.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((r)f, (o)f2));
        ah2.f.e((Object)onAssembly, "if (descending) {\n      \u2026ring(it.event))!! }\n    }");
        return onAssembly;
    }
    
    public final Object b(final long n, final c<? super Integer> c) {
        DatabaseEventDataSource$postsConsumedCount.DatabaseEventDataSource$postsConsumedCount$1 databaseEventDataSource$postsConsumedCount$2 = null;
        Label_0054: {
            if (c instanceof DatabaseEventDataSource$postsConsumedCount.DatabaseEventDataSource$postsConsumedCount$1) {
                final DatabaseEventDataSource$postsConsumedCount.DatabaseEventDataSource$postsConsumedCount$1 databaseEventDataSource$postsConsumedCount$1 = (DatabaseEventDataSource$postsConsumedCount.DatabaseEventDataSource$postsConsumedCount$1)c;
                final int label = databaseEventDataSource$postsConsumedCount$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseEventDataSource$postsConsumedCount$1.label = label + Integer.MIN_VALUE;
                    databaseEventDataSource$postsConsumedCount$2 = databaseEventDataSource$postsConsumedCount$1;
                    break Label_0054;
                }
            }
            databaseEventDataSource$postsConsumedCount$2 = new DatabaseEventDataSource$postsConsumedCount.DatabaseEventDataSource$postsConsumedCount$1(this, (c)c);
        }
        Object result = databaseEventDataSource$postsConsumedCount$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = databaseEventDataSource$postsConsumedCount$2.label;
        DatabaseEventDataSource databaseEventDataSource;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            databaseEventDataSource = (DatabaseEventDataSource)databaseEventDataSource$postsConsumedCount$2.L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            databaseEventDataSource$postsConsumedCount$2.L$0 = this;
            databaseEventDataSource$postsConsumedCount$2.label = 1;
            result = new jj2.n((p)new DatabaseEventDataSource$getEvents$3(this, n, (c)null));
            if (result == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            databaseEventDataSource = this;
        }
        return new Integer(kotlin.sequences.b.Q0((k)kotlin.sequences.b.U0((k)kotlin.sequences.b.d1((k)result, (l)new DatabaseEventDataSource$postsConsumedCount.DatabaseEventDataSource$postsConsumedCount$2(databaseEventDataSource)), (l)DatabaseEventDataSource$postsConsumedCount.DatabaseEventDataSource$postsConsumedCount$3.INSTANCE)));
    }
    
    public final c0<Boolean> c(final Event event) {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new j((Callable)new u40.a(0, (Object)event, (Object)this)));
        final he0.b b = new he0.b((Object)this, 6);
        onAssembly.getClass();
        final c0 onAssembly2 = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)onAssembly, (o)b));
        ah2.f.e((Object)onAssembly2, "fromCallable {\n      Eve\u2026SingleDefault(true)\n    }");
        return (c0<Boolean>)onAssembly2;
    }
    
    public final c0<Boolean> d(final long n) {
        final c0 c = this.b.a(n).C((Object)Boolean.TRUE).C((Object)Boolean.FALSE);
        ah2.f.e((Object)c, "eventDao.deleteByTimesta\u2026.onErrorReturnItem(false)");
        return (c0<Boolean>)c;
    }
    
    public final c0<Boolean> e(final Collection<Long> collection) {
        ah2.f.f((Object)collection, "eventIds");
        final c0 c = this.b.g((Collection)collection).C((Object)Boolean.TRUE).C((Object)Boolean.FALSE);
        ah2.f.e((Object)c, "eventDao.setDispatched(\n\u2026.onErrorReturnItem(false)");
        return (c0<Boolean>)c;
    }
    
    public final c0<Boolean> f() {
        final c0 w = this.b.e().w((o)new ov.c(6));
        ah2.f.e((Object)w, "eventDao.countEvents(dis\u2026d = false).map { it > 0 }");
        return (c0<Boolean>)w;
    }
    
    public final g g(final long n, final long n2, final int n3) {
        return kotlin.sequences.b.e1((k)kotlin.sequences.b.U0((k)kotlin.sequences.b.d1((k)new jj2.n((p)new DatabaseEventDataSource$postDetailsViewed$2(this, n, n2, n3, (c)null)), (l)new DatabaseEventDataSource$postDetailsViewed$3(this)), (l)DatabaseEventDataSource$postDetailsViewed$4.INSTANCE), (l)DatabaseEventDataSource$postDetailsViewed$5.INSTANCE);
    }
    
    public final n<EventsResult> h(final int n) {
        final n b = this.b.b(n);
        final qw.c c = new qw.c((Object)this, 6);
        b.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((r)b, (o)c));
        ah2.f.e((Object)onAssembly, "eventDao.findAllOrderTim\u2026s.toList(),\n      )\n    }");
        return (n<EventsResult>)onAssembly;
    }
    
    public final JsonAdapter<Event> i() {
        final Object value = this.c.getValue();
        ah2.f.e(value, "<get-adapter>(...)");
        return (JsonAdapter<Event>)value;
    }
}
