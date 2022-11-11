// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.nytimes.android.external.store3.base.RecordState;
import com.nytimes.android.external.store3.base.impl.Store;
import bm0.p0;
import rf2.l;
import com.reddit.mutations.n2;
import com.reddit.type.DeleteSocialLinksInput;
import kotlin.coroutines.CoroutineContext;
import com.reddit.domain.model.SocialLinkDeleteResponse;
import xd0.y;
import rg2.p;
import lg2.c;
import hj2.v;
import ff2.g;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import kf2.o;
import bm0.q0;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e$a;
import com.reddit.mutations.y4;
import java.util.List;
import com.reddit.type.ReorderSocialLinksInput;
import ff2.c0;
import java.util.ArrayList;
import n20.d;
import javax.inject.Inject;
import sg2.e;
import hg2.f;
import com.reddit.domain.model.Account;
import io.reactivex.subjects.PublishSubject;
import va0.n;
import va0.w;
import com.reddit.data.remote.RemoteGqlAccountDataSource;
import v40.b0;
import com.reddit.data.remote.RemoteAccountDataSource;
import a20.a;
import xd0.b;

public final class RedditAccountRepository implements b
{
    public final a20.a a;
    public final n20.a b;
    public final RemoteAccountDataSource c;
    public final b0 d;
    public final RemoteGqlAccountDataSource e;
    public final w f;
    public final n g;
    public final PublishSubject<Account> h;
    public final f i;
    
    @Inject
    public RedditAccountRepository(final a20.a a, final n20.a b, final RemoteAccountDataSource c, final b0 d, final RemoteGqlAccountDataSource e, final w f, final n g) {
        sg2.e.f((Object)a, "dispatcherProvider");
        sg2.e.f((Object)b, "backgroundThread");
        sg2.e.f((Object)c, "remote");
        sg2.e.f((Object)d, "local");
        sg2.e.f((Object)e, "remoteGQL");
        sg2.e.f((Object)f, "profileFeatures");
        sg2.e.f((Object)g, "talkFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final PublishSubject<Object> create = (PublishSubject<Object>)PublishSubject.create();
        sg2.e.e((Object)create, "create<Account>()");
        this.h = (PublishSubject<Account>)create;
        this.i = kotlin.a.b((rg2.a)new RedditAccountRepository$store$2(this));
    }
    
    public final ff2.a a(final String s) {
        sg2.e.f((Object)s, "userId");
        return yd.b.i0(this.d.a(s), (d)this.b);
    }
    
    public final c0 b(final ArrayList list) {
        final RemoteGqlAccountDataSource e = this.e;
        e.getClass();
        final c0 w = e$a.a((mr0.e)e.a, (k)new y4(new ReorderSocialLinksInput((List)list)), (OkHttpClient)null, (Map)null, 14).w((o)new q0((Object)e, 9));
        sg2.e.e((Object)w, "graphQlClient.execute(re\u2026map { it.message })\n    }");
        return nn0.a.V((c0)w, (d)this.b);
    }
    
    public final c0<Account> c(final String s) {
        sg2.e.f((Object)s, "username");
        final c0 value = this.k().get((Object)s);
        final z50.o o = new z50.o((Object)this, 0);
        value.getClass();
        final c0<Object> onAssembly = RxJavaPlugins.onAssembly((c0<Object>)new SingleFlatMap((g0)value, (o)o));
        sg2.e.e((Object)onAssembly, "store.get(username).flat\u2026eGQL.getAccount(it)\n    }");
        return (c0<Account>)onAssembly;
    }
    
    public final g<Account> d(final String s, final boolean b) {
        sg2.e.f((Object)s, "username");
        if (this.f.R() || b) {
            final g l = this.k().j((Object)s).L();
            sg2.e.e((Object)l, "store.fetch(username).toFlowable()");
            wd.a.w0((g)l, this.b).subscribe();
        }
        return wd.a.w0(this.d.e(s), this.b);
    }
    
    public final v e(final String s) {
        sg2.e.f((Object)s, "username");
        return new v((p)new RedditAccountRepository$fetchAccount$1(this, s, (c)null));
    }
    
    public final c0<Account> f(final String s) {
        sg2.e.f((Object)s, "username");
        final c0 j = this.k().j((Object)s);
        sg2.e.e((Object)j, "store.fetch(username)");
        return nn0.a.V(j, (d)this.b);
    }
    
    public final Object g(final List<String> list, final c<? super y<SocialLinkDeleteResponse>> c) {
        return ej2.g.l((CoroutineContext)this.a.c(), (p)new RedditAccountRepository$deleteSocialLinksSuspend$2(this, (List)list, (c)null), (c)c);
    }
    
    public final c0<Account> getAccount(final String s) {
        sg2.e.f((Object)s, "username");
        final c0 value = this.k().get((Object)s);
        sg2.e.e((Object)value, "store.get(username)");
        return nn0.a.V(value, (d)this.b);
    }
    
    public final Object h(final ArrayList list, final c c) {
        return ej2.g.l((CoroutineContext)this.a.c(), (p)new RedditAccountRepository$reorderSocialLinksSuspend$2(this, (List)list, (c)null), c);
    }
    
    public final c0<y<SocialLinkDeleteResponse>> i(final List<String> list) {
        final RemoteGqlAccountDataSource e = this.e;
        e.getClass();
        final c0 w = e$a.a((mr0.e)e.a, (k)new n2(new DeleteSocialLinksInput((List)list)), (OkHttpClient)null, (Map)null, 14).w((o)new nw.b((Object)e, 4));
        sg2.e.e((Object)w, "graphQlClient.execute(De\u2026p { it.message })\n      }");
        return nn0.a.V((c0)w, (d)this.b);
    }
    
    public final c0<Boolean> j(final String s) {
        sg2.e.f((Object)s, "username");
        final c0<Object> w = RxJavaPlugins.onAssembly((c0<Object>)new l(a92.b.a0(this.d.c(s), (d)this.b))).w((kf2.o<? super Object, ?>)new p0(3));
        sg2.e.e((Object)w, "local.getAccountByUserna\u2026sEmpty\n      .map { !it }");
        return (c0<Boolean>)w;
    }
    
    public final Store<Account, String> k() {
        final Store value = this.i.getValue();
        sg2.e.e((Object)value, "<get-store>(...)");
        return (Store<Account, String>)value;
    }
    
    public static final class a implements pt.d<Account, String>, pt.e<String>
    {
        public final b0 a;
        public final n20.a b;
        
        public a(final b0 a, final n20.a b) {
            e.f((Object)a, "local");
            e.f((Object)b, "backgroundThread");
            this.a = a;
            this.b = b;
        }
        
        public final RecordState a(final Object o) {
            sg2.e.f((Object)o, "key");
            return RecordState.STALE;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final String s = (String)o;
            final Account account = (Account)o2;
            sg2.e.f((Object)s, "key");
            sg2.e.f((Object)account, "account");
            return nn0.a.V(this.a.b(account), (d)this.b);
        }
        
        public final ff2.n c(final Object o) {
            final String s = (String)o;
            sg2.e.f((Object)s, "username");
            return a92.b.a0(this.a.c(s), (d)this.b);
        }
    }
}
