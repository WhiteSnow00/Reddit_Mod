// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/CommunityInfoDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommunityInfoDataModel
{
    public final SpecialMembershipsDataModel a;
    public final CommunityInfoMetaDataModel b;
    public final String c;
    
    public CommunityInfoDataModel(final SpecialMembershipsDataModel a, final CommunityInfoMetaDataModel b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommunityInfoDataModel)) {
            return false;
        }
        final CommunityInfoDataModel communityInfoDataModel = (CommunityInfoDataModel)o;
        return f.a((Object)this.a, (Object)communityInfoDataModel.a) && f.a((Object)this.b, (Object)communityInfoDataModel.b) && f.a((Object)this.c, (Object)communityInfoDataModel.c);
    }
    
    @Override
    public final int hashCode() {
        final SpecialMembershipsDataModel a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final int hashCode3 = this.b.hashCode();
        final String c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode3 + hashCode2 * 31) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CommunityInfoDataModel(specialMemberships=");
        k.append(this.a);
        k.append(", meta=");
        k.append(this.b);
        k.append(", productsCurrency=");
        return b.k(k, this.c, ')');
    }
}
