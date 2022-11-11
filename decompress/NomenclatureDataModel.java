// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ag0.a;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/NomenclatureDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class NomenclatureDataModel
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    
    public NomenclatureDataModel(final String a, final String b, final String c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NomenclatureDataModel)) {
            return false;
        }
        final NomenclatureDataModel nomenclatureDataModel = (NomenclatureDataModel)o;
        return f.a((Object)this.a, (Object)nomenclatureDataModel.a) && f.a((Object)this.b, (Object)nomenclatureDataModel.b) && f.a((Object)this.c, (Object)nomenclatureDataModel.c) && f.a((Object)this.d, (Object)nomenclatureDataModel.d) && f.a((Object)this.e, (Object)nomenclatureDataModel.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + ag0.a.f(this.d, ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("NomenclatureDataModel(membershipAlt=");
        k.append(this.a);
        k.append(", membership=");
        k.append(this.b);
        k.append(", memberAlt=");
        k.append(this.c);
        k.append(", memberAltPlural=");
        k.append(this.d);
        k.append(", member=");
        return b.k(k, this.e, ')');
    }
}
