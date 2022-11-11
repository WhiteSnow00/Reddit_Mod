// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.remote;

import av2.f;
import com.reddit.data.meta.model.MetaBillingProductDataModel;
import java.util.Map;
import nf2.c0;
import av2.t;
import av2.s;
import av2.o;
import av2.a;
import com.reddit.data.meta.model.MetaBillingOrderDataModel;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'J\u0012\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH'¨\u0006\r" }, d2 = { "Lcom/reddit/data/meta/remote/RemoteMetaBillingDataSource;", "", "", "subredditId", "types", "Lnf2/c0;", "", "Lcom/reddit/data/meta/model/MetaBillingProductDataModel;", "products", "Lcom/reddit/data/meta/model/MetaBillingOrderDataModel;", "model", "Lnf2/a;", "order", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteMetaBillingDataSource
{
    @o("orders")
    nf2.a order(@a final MetaBillingOrderDataModel p0);
    
    @f("products/{subredditId}")
    c0<Map<String, MetaBillingProductDataModel>> products(@s("subredditId") final String p0, @t("types") final String p1);
}
