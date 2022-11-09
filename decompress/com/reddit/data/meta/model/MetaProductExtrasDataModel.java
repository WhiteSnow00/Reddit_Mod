// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ah2.f;
import java.util.Map;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/MetaProductExtrasDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaProductExtrasDataModel
{
    public final Map<String, MetaProductAssetsDataModel> a;
    public final BadgeStyleDataModel b;
    
    public MetaProductExtrasDataModel(final Map<String, MetaProductAssetsDataModel> a, final BadgeStyleDataModel b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetaProductExtrasDataModel)) {
            return false;
        }
        final MetaProductExtrasDataModel metaProductExtrasDataModel = (MetaProductExtrasDataModel)o;
        return f.a((Object)this.a, (Object)metaProductExtrasDataModel.a) && f.a((Object)this.b, (Object)metaProductExtrasDataModel.b);
    }
    
    @Override
    public final int hashCode() {
        final Map<String, MetaProductAssetsDataModel> a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final BadgeStyleDataModel b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("MetaProductExtrasDataModel(assets=");
        k.append(this.a);
        k.append(", style=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
