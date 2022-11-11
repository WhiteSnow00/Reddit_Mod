// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/CommunityInfoMetaDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommunityInfoMetaDataModel
{
    public final CommunityInfoMetaExtraDataModel a;
    public final String b;
    public final CommunityInfoImagesDataModel c;
    public final CommunityInfoWalletProvider d;
    
    public CommunityInfoMetaDataModel(final CommunityInfoMetaExtraDataModel a, final String b, final CommunityInfoImagesDataModel c, final CommunityInfoWalletProvider d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommunityInfoMetaDataModel)) {
            return false;
        }
        final CommunityInfoMetaDataModel communityInfoMetaDataModel = (CommunityInfoMetaDataModel)o;
        return f.a((Object)this.a, (Object)communityInfoMetaDataModel.a) && f.a((Object)this.b, (Object)communityInfoMetaDataModel.b) && f.a((Object)this.c, (Object)communityInfoMetaDataModel.c) && f.a((Object)this.d, (Object)communityInfoMetaDataModel.d);
    }
    
    @Override
    public final int hashCode() {
        final CommunityInfoMetaExtraDataModel a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final CommunityInfoImagesDataModel c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final CommunityInfoWalletProvider d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CommunityInfoMetaDataModel(extra=");
        k.append(this.a);
        k.append(", name=");
        k.append(this.b);
        k.append(", images=");
        k.append(this.c);
        k.append(", walletProvider=");
        k.append(this.d);
        k.append(')');
        return k.toString();
    }
}
