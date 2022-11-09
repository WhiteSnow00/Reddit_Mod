// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.nytimes.android.external.store3.base.RecordState;
import com.nytimes.android.external.store3.base.impl.Store;
import g60.y0;
import zf2.l;
import nf2.n;
import a40.h;
import com.reddit.mutations.n2;
import com.reddit.type.DeleteSocialLinksInput;
import pj2.s;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.single.SingleFlatMap;
import com.reddit.domain.model.SocialLinkDeleteResponse;
import ge0.g0;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import tg2.c;
import a4.u1;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e;
import ur0.e$a;
import com.reddit.mutations.y4;
import java.util.List;
import com.reddit.type.ReorderSocialLinksInput;
import nf2.c0;
import java.util.ArrayList;
import r20.d;
import javax.inject.Inject;
import pg2.f;
import com.reddit.domain.model.Account;
import io.reactivex.subjects.PublishSubject;
import db0.o;
import db0.x;
import com.reddit.data.remote.RemoteGqlAccountDataSource;
import c50.d0;
import com.reddit.data.remote.RemoteAccountDataSource;
import e20.a;
import ge0.b;

public final class RedditAccountRepository implements b
{
    public final e20.a a;
    public final r20.a b;
    public final RemoteAccountDataSource c;
    public final d0 d;
    public final RemoteGqlAccountDataSource e;
    public final x f;
    public final o g;
    public final PublishSubject<Account> h;
    public final f i;
    
    @Inject
    public RedditAccountRepository(final e20.a a, final r20.a b, final RemoteAccountDataSource c, final d0 d, final RemoteGqlAccountDataSource e, final x f, final o g) {
        ah2.f.f((Object)a, "dispatcherProvider");
        ah2.f.f((Object)b, "backgroundThread");
        ah2.f.f((Object)c, "remote");
        ah2.f.f((Object)d, "local");
        ah2.f.f((Object)e, "remoteGQL");
        ah2.f.f((Object)f, "profileFeatures");
        ah2.f.f((Object)g, "talkFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final PublishSubject create = PublishSubject.create();
        ah2.f.e((Object)create, "create<Account>()");
        this.h = (PublishSubject<Account>)create;
        this.i = kotlin.a.b((zg2.a)new RedditAccountRepository$store.RedditAccountRepository$store$2(this));
    }
    
    public final nf2.a a(final String s) {
        ah2.f.f((Object)s, "userId");
        return o72.f.t(this.d.a(s), (d)this.b);
    }
    
    public final c0 b(final ArrayList list) {
        final RemoteGqlAccountDataSource e = this.e;
        e.getClass();
        final c0 w = e$a.a((e)e.a, (k)new y4(new ReorderSocialLinksInput((List)list)), (OkHttpClient)null, (Map)null, 14).w((sf2.o)new qw.b((Object)e, 7));
        ah2.f.e((Object)w, "graphQlClient.execute(re\u2026map { it.message })\n    }");
        return u1.j1(w, (d)this.b);
    }
    
    public final Object c(final ArrayList list, final c c) {
        return mj2.g.l((CoroutineContext)this.a.c(), (p)new RedditAccountRepository$reorderSocialLinksSuspend$2(this, (List)list, (c)null), c);
    }
    
    public final Object d(final List<String> list, final c<? super g0<SocialLinkDeleteResponse>> c) {
        return mj2.g.l((CoroutineContext)this.a.c(), (p)new RedditAccountRepository$deleteSocialLinksSuspend$2(this, (List)list, (c)null), (c)c);
    }
    
    public final c0<Account> e(final String s) {
        ah2.f.f((Object)s, "username");
        final c0 value = this.k().get((Object)s);
        final g60.o o = new g60.o(this, 0);
        value.getClass();
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((nf2.g0)value, (sf2.o)o));
        ah2.f.e((Object)onAssembly, "store.get(username).flat\u2026eGQL.getAccount(it)\n    }");
        return (c0<Account>)onAssembly;
    }
    
    public final nf2.g<Account> f(final String s, final boolean b) {
        ah2.f.f((Object)s, "username");
        if (this.f.P() || b) {
            final nf2.g l = this.k().b((Object)s).L();
            ah2.f.e((Object)l, "store.fetch(username).toFlowable()");
            gn.a.B2(l, this.b).subscribe();
        }
        return (nf2.g<Account>)gn.a.B2((nf2.g)this.d.i(s), this.b);
    }
    
    public final s g(final String s) {
        ah2.f.f((Object)s, "username");
        return new s((p)new RedditAccountRepository$fetchAccount$1(this, s, (c)null));
    }
    
    public final c0<Account> getAccount(final String s) {
        ah2.f.f((Object)s, "username");
        final c0 value = this.k().get((Object)s);
        ah2.f.e((Object)value, "store.get(username)");
        return (c0<Account>)u1.j1(value, (d)this.b);
    }
    
    public final c0<Account> h(final String s) {
        ah2.f.f((Object)s, "username");
        final c0 b = this.k().b((Object)s);
        ah2.f.e((Object)b, "store.fetch(username)");
        return (c0<Account>)u1.j1(b, (d)this.b);
    }
    
    public final c0<g0<SocialLinkDeleteResponse>> i(final List<String> list) {
        final RemoteGqlAccountDataSource e = this.e;
        e.getClass();
        final c0 w = e$a.a((e)e.a, (k)new n2(new DeleteSocialLinksInput((List)list)), (OkHttpClient)null, (Map)null, 14).w((sf2.o)new h((Object)e, 3));
        ah2.f.e((Object)w, "graphQlClient.execute(De\u2026p { it.message })\n      }");
        return (c0<g0<SocialLinkDeleteResponse>>)u1.j1(w, (d)this.b);
    }
    
    public final c0<Boolean> j(final String s) {
        ah2.f.f((Object)s, "username");
        final c0 w = RxJavaPlugins.onAssembly((c0)new l(dg.d.A1((n)this.d.h(s), (d)this.b))).w((sf2.o)new y0(3));
        ah2.f.e((Object)w, "local.getAccountByUserna\u2026sEmpty\n      .map { !it }");
        return (c0<Boolean>)w;
    }
    
    public final Store<Account, String> k() {
        final Object value = this.i.getValue();
        ah2.f.e(value, "<get-store>(...)");
        return (Store<Account, String>)value;
    }
    
    public static final class a implements tt.d<Account, String>, tt.e<String>
    {
        public final d0 a;
        public final r20.a b;
        
        public a(final d0 a, final r20.a b) {
            ah2.f.f((Object)a, "local");
            ah2.f.f((Object)b, "backgroundThread");
            this.a = a;
            this.b = b;
        }
        
        public final RecordState a(final Object o) {
            ah2.f.f((Object)o, "key");
            return RecordState.STALE;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final String s = (String)o;
            final Account account = (Account)o2;
            ah2.f.f((Object)s, "key");
            ah2.f.f((Object)account, "account");
            return u1.j1((c0)this.a.g(account), (d)this.b);
        }
        
        public final n c(final Object o) {
            final String s = (String)o;
            ah2.f.f((Object)s, "username");
            return dg.d.A1((n)this.a.h(s), (d)this.b);
        }
    }
}
