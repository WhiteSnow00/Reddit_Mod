// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.awards;

import com.reddit.queries.u$b$a;
import java.util.Iterator;
import com.reddit.queries.u$a;
import com.reddit.queries.u$d;
import mr0.g;
import kotlin.collections.EmptyList;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import com.reddit.queries.u$c;
import java.util.ArrayList;
import ig2.m;
import com.reddit.queries.u$f;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import mr0.e;
import h7.k;
import mr0.e$a;
import com.reddit.queries.u;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import com.reddit.domain.awards.model.Award;
import java.util.List;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "", "Lcom/reddit/domain/awards/model/Award;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.data.awards.RemoteGqlAwardDataSource$getAwardsForComment$2", f = "RemoteGqlAwardDataSource.kt", l = { 182 }, m = "invokeSuspend")
final class RemoteGqlAwardDataSource$getAwardsForComment$2 extends SuspendLambda implements p<b0, c<? super List<? extends Award>>, Object>
{
    public final /* synthetic */ String $commentKindWithId;
    public int label;
    public final /* synthetic */ RemoteGqlAwardDataSource this$0;
    
    public RemoteGqlAwardDataSource$getAwardsForComment$2(final RemoteGqlAwardDataSource this$0, final String $commentKindWithId, final c<? super RemoteGqlAwardDataSource$getAwardsForComment$2> c) {
        this.this$0 = this$0;
        this.$commentKindWithId = $commentKindWithId;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new RemoteGqlAwardDataSource$getAwardsForComment$2(this.this$0, this.$commentKindWithId, (c<? super RemoteGqlAwardDataSource$getAwardsForComment$2>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super List<Award>> c) {
        return ((RemoteGqlAwardDataSource$getAwardsForComment$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object b) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(b);
        }
        else {
            b.k0(b);
            final g a = this.this$0.a;
            final u u = new u(this.$commentKindWithId);
            this.label = 1;
            if ((b = e$a.b(14, (k)u, (e)a, (RetryAlgo)null, (Map)null, (c)this, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final u$d a2 = ((u$f)b).a;
        if (a2 != null) {
            final u$a b2 = a2.b;
            if (b2 != null) {
                final List b3 = b2.b;
                if (b3 != null) {
                    final ArrayList list = new ArrayList(m.c3((Iterable)b3, 10));
                    final Iterator iterator = b3.iterator();
                    while (true) {
                        final Object instance = list;
                        if (!iterator.hasNext()) {
                            return instance;
                        }
                        final u$c u$c = (u$c)iterator.next();
                        final u$b$a b4 = u$c.b.b;
                        list.add((Object)GqlDataToDomainModelMapperKt.apolloAwardFragmentsToDomainAward$default(b4.a, b4.b, u$c.c.a.c, (String)null, (List)null, 24, (Object)null));
                    }
                }
            }
        }
        return EmptyList.INSTANCE;
    }
}
