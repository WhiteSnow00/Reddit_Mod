// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.nytimes.android.external.store3.base.RecordState;
import com.nytimes.android.external.store3.base.impl.Store;
import b60.q0;
import af2.n;
import l10.l;
import com.reddit.mutations.n2;
import com.reddit.type.DeleteSocialLinksInput;
import cg2.j;
import cj2.s;
import io.reactivex.plugins.RxJavaPlugins;
import af2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import com.reddit.domain.model.SocialLinkDeleteResponse;
import xd0.y;
import gg2.c;
import ff2.o;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e$a;
import com.reddit.mutations.y4;
import java.util.List;
import com.reddit.type.ReorderSocialLinksInput;
import af2.c0;
import java.util.ArrayList;
import q20.d;
import mg.d0;
import javax.inject.Inject;
import ng2.e;
import cg2.f;
import com.reddit.domain.model.Account;
import io.reactivex.subjects.PublishSubject;
import wa0.m;
import wa0.v;
import com.reddit.data.remote.RemoteGqlAccountDataSource;
import x40.z;
import com.reddit.data.remote.RemoteAccountDataSource;
import d20.a;
import xd0.b;

public final class RedditAccountRepository implements b
{
    public final d20.a a;
    public final q20.a b;
    public final RemoteAccountDataSource c;
    public final z d;
    public final RemoteGqlAccountDataSource e;
    public final v f;
    public final m g;
    public final PublishSubject<Account> h;
    public final f i;
    
    @Inject
    public RedditAccountRepository(final d20.a a, final q20.a b, final RemoteAccountDataSource c, final z d, final RemoteGqlAccountDataSource e, final v f, final m g) {
        ng2.e.f((Object)a, "dispatcherProvider");
        ng2.e.f((Object)b, "backgroundThread");
        ng2.e.f((Object)c, "remote");
        ng2.e.f((Object)d, "local");
        ng2.e.f((Object)e, "remoteGQL");
        ng2.e.f((Object)f, "profileFeatures");
        ng2.e.f((Object)g, "talkFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final PublishSubject create = PublishSubject.create();
        ng2.e.e((Object)create, "create<Account>()");
        this.h = (PublishSubject<Account>)create;
        this.i = kotlin.a.b((mg2.a)new RedditAccountRepository$store$2(this));
    }
    
    @Override
    public final af2.a a(final String s) {
        ng2.e.f((Object)s, "userId");
        return d0.S0(this.d.a(s), (d)this.b);
    }
    
    @Override
    public final c0 b(final ArrayList list) {
        final RemoteGqlAccountDataSource e = this.e;
        e.getClass();
        final c0 w = e$a.a((mr0.e)e.a, (k)new y4(new ReorderSocialLinksInput((List)list)), (OkHttpClient)null, (Map)null, 14).w((o)new l10.e((Object)e, 5));
        ng2.e.e((Object)w, "graphQlClient.execute(re\u2026map { it.message })\n    }");
        return px1.a.K0((c0)w, (d)this.b);
    }
    
    @Override
    public final Object c(final List<String> list, final c<? super y<SocialLinkDeleteResponse>> c) {
        return zi2.g.j((CoroutineContext)this.a.c(), (p)new RedditAccountRepository$deleteSocialLinksSuspend$2(this, (List)list, (c)null), c);
    }
    
    @Override
    public final c0<Account> d(final String s) {
        ng2.e.f((Object)s, "username");
        final c0 value = this.k().get((Object)s);
        final b60.o o = new b60.o((Object)this, 0);
        value.getClass();
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)value, (o)o));
        ng2.e.e((Object)onAssembly, "store.get(username).flat\u2026eGQL.getAccount(it)\n    }");
        return onAssembly;
    }
    
    @Override
    public final Object e(final ArrayList list, final c c) {
        return zi2.g.j((CoroutineContext)this.a.c(), (p)new RedditAccountRepository$reorderSocialLinksSuspend$2(this, (List)list, (c)null), c);
    }
    
    @Override
    public final af2.g<Account> f(final String s, final boolean b) {
        ng2.e.f((Object)s, "username");
        if (b) {
            final af2.g l = this.k().m((Object)s).L();
            ng2.e.e((Object)l, "store.fetch(username).toFlowable()");
            a01.a.Y((af2.g)l, this.b).subscribe();
        }
        return a01.a.Y((af2.g)this.d.e(s), this.b);
    }
    
    @Override
    public final s g(final String s) {
        ng2.e.f((Object)s, "username");
        return new s((p<? super cj2.f<? super T>, ? super c<? super j>, ?>)new RedditAccountRepository$fetchAccount$1(this, s, (c)null));
    }
    
    @Override
    public final c0<Account> getAccount(final String s) {
        ng2.e.f((Object)s, "username");
        final c0 value = this.k().get((Object)s);
        ng2.e.e((Object)value, "store.get(username)");
        return px1.a.K0(value, (d)this.b);
    }
    
    @Override
    public final c0<Account> h(final String s) {
        ng2.e.f((Object)s, "username");
        final c0 m = this.k().m((Object)s);
        ng2.e.e((Object)m, "store.fetch(username)");
        return px1.a.K0(m, (d)this.b);
    }
    
    @Override
    public final c0<y<SocialLinkDeleteResponse>> i(final List<String> list) {
        final RemoteGqlAccountDataSource e = this.e;
        e.getClass();
        final c0 w = e$a.a((mr0.e)e.a, (k)new n2(new DeleteSocialLinksInput((List)list)), (OkHttpClient)null, (Map)null, 14).w((o)new l((Object)e, 9));
        ng2.e.e((Object)w, "graphQlClient.execute(De\u2026p { it.message })\n      }");
        return px1.a.K0((c0)w, (d)this.b);
    }
    
    @Override
    public final c0<Boolean> j(final String s) {
        ng2.e.f((Object)s, "username");
        final c0 w = RxJavaPlugins.onAssembly((c0)new mf2.l(px1.a.J0((n)this.d.c(s), (d)this.b))).w((o)new q0(1));
        ng2.e.e((Object)w, "local.getAccountByUserna\u2026sEmpty\n      .map { !it }");
        return w;
    }
    
    public final Store<Account, String> k() {
        final Object value = this.i.getValue();
        ng2.e.e(value, "<get-store>(...)");
        return (Store<Account, String>)value;
    }
    
    public static final class a implements pt.d<Account, String>, pt.e<String>
    {
        public final z a;
        public final q20.a b;
        
        public a(final z a, final q20.a b) {
            e.f((Object)a, "local");
            e.f((Object)b, "backgroundThread");
            this.a = a;
            this.b = b;
        }
        
        public final RecordState a(final Object o) {
            ng2.e.f((Object)o, "key");
            return RecordState.STALE;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final String s = (String)o;
            final Account account = (Account)o2;
            ng2.e.f((Object)s, "key");
            ng2.e.f((Object)account, "account");
            return px1.a.K0((c0)this.a.b(account), (d)this.b);
        }
        
        public final n c(final Object o) {
            final String s = (String)o;
            ng2.e.f((Object)s, "username");
            return px1.a.J0((n)this.a.c(s), (d)this.b);
        }
    }
}
