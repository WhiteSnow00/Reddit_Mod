// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/MetaEmoteImageDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaEmoteImageDataModel
{
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    
    public MetaEmoteImageDataModel(final String a, final String b, final int c, final int d) {
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
        if (!(o instanceof MetaEmoteImageDataModel)) {
            return false;
        }
        final MetaEmoteImageDataModel metaEmoteImageDataModel = (MetaEmoteImageDataModel)o;
        return f.a((Object)this.a, (Object)metaEmoteImageDataModel.a) && f.a((Object)this.b, (Object)metaEmoteImageDataModel.b) && this.c == metaEmoteImageDataModel.c && this.d == metaEmoteImageDataModel.d;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.d) + s0.e(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("MetaEmoteImageDataModel(path=");
        k.append(this.a);
        k.append(", type=");
        k.append(this.b);
        k.append(", x=");
        k.append(this.c);
        k.append(", y=");
        return d.k(k, this.d, ')');
    }
}
