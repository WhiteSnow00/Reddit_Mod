// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import androidx.appcompat.widget.s0;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/BadgePatchRequestBodyDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class BadgePatchRequestBodyDataModel
{
    public final boolean a;
    
    public BadgePatchRequestBodyDataModel(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof BadgePatchRequestBodyDataModel && this.a == ((BadgePatchRequestBodyDataModel)o).a);
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return a;
    }
    
    @Override
    public final String toString() {
        return s0.o(a.k("BadgePatchRequestBodyDataModel(selected="), this.a, ')');
    }
}
