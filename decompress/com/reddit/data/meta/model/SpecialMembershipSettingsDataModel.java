// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/SpecialMembershipSettingsDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpecialMembershipSettingsDataModel
{
    public final Long a;
    public final Boolean b;
    
    public SpecialMembershipSettingsDataModel(final Long a, final Boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpecialMembershipSettingsDataModel)) {
            return false;
        }
        final SpecialMembershipSettingsDataModel specialMembershipSettingsDataModel = (SpecialMembershipSettingsDataModel)o;
        return f.a((Object)this.a, (Object)specialMembershipSettingsDataModel.a) && f.a((Object)this.b, (Object)specialMembershipSettingsDataModel.b);
    }
    
    @Override
    public final int hashCode() {
        final Long a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SpecialMembershipSettingsDataModel(latestEndsAt=");
        k.append(this.a);
        k.append(", renew=");
        return d.m(k, this.b, ')');
    }
}
