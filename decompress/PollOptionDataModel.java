// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model.polls;

import androidx.appcompat.widget.s0;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/polls/PollOptionDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class PollOptionDataModel
{
    public final int a;
    public final int b;
    public final String c;
    
    public PollOptionDataModel(final int a, final int b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PollOptionDataModel)) {
            return false;
        }
        final PollOptionDataModel pollOptionDataModel = (PollOptionDataModel)o;
        return this.a == pollOptionDataModel.a && this.b == pollOptionDataModel.b && f.a((Object)this.c, (Object)pollOptionDataModel.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + s0.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PollOptionDataModel(id=");
        k.append(this.a);
        k.append(", order=");
        k.append(this.b);
        k.append(", text=");
        return b.k(k, this.c, ')');
    }
}
