// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.internal.batch;

import ah2.f;
import kotlin.Metadata;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import t7.d;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n" }, d2 = { "Lt7/d;", "it", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor$b;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class BatchHttpCallImpl$execute$firstRequest$1 extends Lambda implements l<d, ApolloInterceptor.b>
{
    public static final BatchHttpCallImpl$execute$firstRequest$1 INSTANCE;
    
    static {
        INSTANCE = new BatchHttpCallImpl$execute$firstRequest$1();
    }
    
    public BatchHttpCallImpl$execute$firstRequest$1() {
        super(1);
    }
    
    public final ApolloInterceptor.b invoke(final d d) {
        f.g((Object)d, "it");
        return d.a;
    }
}
