// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/CommunityInfoImagesDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommunityInfoImagesDataModel
{
    public final String a;
    public final String b;
    
    public CommunityInfoImagesDataModel(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommunityInfoImagesDataModel)) {
            return false;
        }
        final CommunityInfoImagesDataModel communityInfoImagesDataModel = (CommunityInfoImagesDataModel)o;
        return f.a((Object)this.a, (Object)communityInfoImagesDataModel.a) && f.a((Object)this.b, (Object)communityInfoImagesDataModel.b);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CommunityInfoImagesDataModel(filled=");
        k.append(this.a);
        k.append(", grey=");
        return b.k(k, this.b, ')');
    }
}
