// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ah2.f;
import java.util.Map;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/SpecialMembershipsDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpecialMembershipsDataModel
{
    public final Boolean a;
    public final Map<String, MetaProductDataModel> b;
    public final SpecialMembershipSettingsDataModel c;
    
    public SpecialMembershipsDataModel(final Boolean a, final Map<String, MetaProductDataModel> b, final SpecialMembershipSettingsDataModel c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpecialMembershipsDataModel)) {
            return false;
        }
        final SpecialMembershipsDataModel specialMembershipsDataModel = (SpecialMembershipsDataModel)o;
        return f.a((Object)this.a, (Object)specialMembershipsDataModel.a) && f.a((Object)this.b, (Object)specialMembershipsDataModel.b) && f.a((Object)this.c, (Object)specialMembershipsDataModel.c);
    }
    
    @Override
    public final int hashCode() {
        final Boolean a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Map<String, MetaProductDataModel> b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final SpecialMembershipSettingsDataModel c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SpecialMembershipsDataModel(on=");
        k.append(this.a);
        k.append(", active=");
        k.append(this.b);
        k.append(", settings=");
        k.append(this.c);
        k.append(')');
        return k.toString();
    }
}
