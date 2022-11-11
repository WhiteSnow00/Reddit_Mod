// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed;

import ea2.m;
import x82.k;
import yd.b;
import java.util.Map;
import x82.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import x82.h;
import x82.k0;
import kotlin.Metadata;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.vault.feed.VaultFeedPresenter$queryForMemberships$2$1", f = "VaultFeedPresenter.kt", l = { 317, 322 }, m = "invokeSuspend")
final class VaultFeedPresenter$queryForMemberships$2$1 extends SuspendLambda implements p<b0, c<? super Object>, Object>
{
    public final /* synthetic */ k0 $balance;
    public final /* synthetic */ h $community;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ VaultFeedPresenter this$0;
    
    public VaultFeedPresenter$queryForMemberships$2$1(final VaultFeedPresenter this$0, final k0 $balance, final h $community, final c<? super VaultFeedPresenter$queryForMemberships$2$1> c) {
        this.this$0 = this$0;
        this.$balance = $balance;
        this.$community = $community;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new VaultFeedPresenter$queryForMemberships$2$1(this.this$0, this.$balance, this.$community, (c<? super VaultFeedPresenter$queryForMemberships$2$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<Object> c) {
        return ((VaultFeedPresenter$queryForMemberships$2$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        i i = null;
        h $community = null;
        String f = null;
        Map c = null;
        Object a = null;
        Label_0241: {
            if (label != 0) {
                if (label != 1) {
                    if (label == 2) {
                        i = (i)this.L$3;
                        $community = (h)this.L$2;
                        f = (String)this.L$1;
                        c = (Map)this.L$0;
                        b.k0(o);
                        a = o;
                        break Label_0241;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    b.k0(o);
                }
            }
            else {
                b.k0(o);
                final y82.c o2 = this.this$0.o;
                final String f2 = this.$balance.f;
                this.label = 1;
                if ((o = o2.b(f2, (c<? super i>)this)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final i l$3 = (i)o;
            if (l$3 == null || l$3.j != null) {
                o = this.this$0.C.remove(this.$balance.f);
                return o;
            }
            final VaultFeedPresenter this$0 = this.this$0;
            c = this$0.C;
            f = this.$balance.f;
            $community = this.$community;
            final y82.c o3 = this$0.o;
            final String x = $community.x;
            this.L$0 = c;
            this.L$1 = f;
            this.L$2 = $community;
            this.L$3 = l$3;
            this.label = 2;
            a = o3.a(x, (c<? super k>)this);
            if (a == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            i = l$3;
        }
        c.put(f, new m($community, i, (k)a));
        o = j.a;
        return o;
    }
}
