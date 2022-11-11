// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.awards;

import java.util.Iterator;
import com.reddit.mutations.l3$k;
import mr0.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import com.reddit.mutations.l3$j;
import java.util.ArrayList;
import ig2.m;
import com.reddit.mutations.l3$i;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import mr0.e;
import h7.k;
import mr0.e$a;
import com.reddit.mutations.l3;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import g22.h1;
import kotlin.Metadata;
import com.reddit.domain.awards.model.AwardResponse;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lcom/reddit/domain/awards/model/AwardResponse;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.data.awards.RemoteGqlAwardDataSource$giveAward$2", f = "RemoteGqlAwardDataSource.kt", l = { 57 }, m = "invokeSuspend")
final class RemoteGqlAwardDataSource$giveAward$2 extends SuspendLambda implements p<b0, c<? super AwardResponse>, Object>
{
    public final /* synthetic */ h1 $input;
    public int label;
    public final /* synthetic */ RemoteGqlAwardDataSource this$0;
    
    public RemoteGqlAwardDataSource$giveAward$2(final RemoteGqlAwardDataSource this$0, final h1 $input, final c<? super RemoteGqlAwardDataSource$giveAward$2> c) {
        this.this$0 = this$0;
        this.$input = $input;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new RemoteGqlAwardDataSource$giveAward$2(this.this$0, this.$input, (c<? super RemoteGqlAwardDataSource$giveAward$2>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super AwardResponse> c) {
        return ((RemoteGqlAwardDataSource$giveAward$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(o);
        }
        else {
            b.k0(o);
            final g a = this.this$0.a;
            final l3 l3 = new l3(this.$input);
            this.label = 1;
            if ((o = e$a.b(14, (k)l3, (e)a, (RetryAlgo)null, (Map)null, (c)this, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final RemoteGqlAwardDataSource this$0 = this.this$0;
        final l3$k a2 = ((l3$i)o).a;
        if (a2 != null) {
            this$0.d.getClass();
            o = c50.e.a(a2);
        }
        else {
            if (a2 != null) {
                final List c = a2.c;
                if (c != null) {
                    final ArrayList list = new ArrayList<String>(m.c3((Iterable)c, 10));
                    final Iterator iterator = c.iterator();
                    while (iterator.hasNext()) {
                        list.add(((l3$j)iterator.next()).b);
                    }
                    o = new AwardResponse(false, -1, 0L, null, list, null, 32, null);
                    return o;
                }
            }
            o = new AwardResponse(false, -1, 0L, null, null, null, 32, null);
        }
        return o;
    }
}
