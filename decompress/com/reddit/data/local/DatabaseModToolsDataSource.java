// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import sf2.o;
import nf2.r;
import qw.b;
import nf2.n;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import c50.s;
import com.reddit.domain.model.mod.ModeratorsResponse;
import javax.inject.Inject;
import kotlin.a;
import java.util.concurrent.TimeUnit;
import pg2.f;
import h60.f0;
import javax.inject.Provider;
import com.squareup.moshi.y;
import c50.j0;

public final class DatabaseModToolsDataSource implements j0
{
    public static final long d;
    public final y a;
    public final Provider<f0> b;
    public final f c;
    
    static {
        d = TimeUnit.MINUTES.toMillis(10L);
    }
    
    @Inject
    public DatabaseModToolsDataSource(final y a, final Provider<f0> b) {
        ah2.f.f((Object)a, "moshi");
        ah2.f.f((Object)b, "moderatorResponseDaoProvider");
        this.a = a;
        this.b = b;
        this.c = kotlin.a.b((zg2.a)new DatabaseModToolsDataSource$adapter.DatabaseModToolsDataSource$adapter$2(this));
    }
    
    @Override
    public final nf2.a a(final ModeratorsResponse moderatorsResponse, final String s, final String s2) {
        ah2.f.f((Object)moderatorsResponse, "moderatorsResponse");
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new xf2.f((Callable)new s(this, moderatorsResponse, s, s2)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      mod\u2026ditName, username))\n    }");
        return onAssembly;
    }
    
    @Override
    public final n<ModeratorsResponse> b(final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)s2, "username");
        final Object value = this.b.get();
        ah2.f.e(value, "moderatorResponseDaoProvider.get()");
        final n f0 = ((f0)value).f0(System.currentTimeMillis() - DatabaseModToolsDataSource.d, s, s2);
        final b b = new b((Object)this, 6);
        f0.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((r)f0, (o)b));
        ah2.f.e((Object)onAssembly, "moderatorResponseDao.fin\u2026Json(it.responseJson)!! }");
        return (n<ModeratorsResponse>)onAssembly;
    }
    
    @Override
    public final void c(final String s, final String s2) {
        final Object value = this.b.get();
        ah2.f.e(value, "moderatorResponseDaoProvider.get()");
        ((f0)value).W0(s, s2);
    }
}
