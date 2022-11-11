// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.remote;

import com.reddit.data.meta.model.MetaProductDataModel;
import av2.t;
import av2.f;
import com.reddit.data.meta.model.ProductCollectionDataModel;
import java.util.Map;
import nf2.c0;
import av2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J:\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¨\u0006\f" }, d2 = { "Lcom/reddit/data/meta/remote/RemoteMetaProductsDataSource;", "", "", "subredditId", "Lnf2/c0;", "", "Lcom/reddit/data/meta/model/ProductCollectionDataModel;", "productCollections", "typesCommaSeparated", "ownersCommaSeparated", "Lcom/reddit/data/meta/model/MetaProductDataModel;", "products", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteMetaProductsDataSource
{
    @f("product-collections/{subredditId}")
    c0<Map<String, ProductCollectionDataModel>> productCollections(@s("subredditId") final String p0);
    
    @f("products/{subredditId}")
    c0<Map<String, MetaProductDataModel>> products(@s("subredditId") final String p0, @t("types") final String p1, @t("owners") final String p2);
}
