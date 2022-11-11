// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model.polls;

import ah2.f;
import java.util.Map;
import java.math.BigInteger;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/polls/PollResultDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class PollResultDataModel
{
    public final BigInteger a;
    public final Map<Integer, PollOptionResultDataModel> b;
    
    public PollResultDataModel(final BigInteger a, final Map<Integer, PollOptionResultDataModel> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PollResultDataModel)) {
            return false;
        }
        final PollResultDataModel pollResultDataModel = (PollResultDataModel)o;
        return f.a((Object)this.a, (Object)pollResultDataModel.a) && f.a((Object)this.b, (Object)pollResultDataModel.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PollResultDataModel(totalVotes=");
        k.append(this.a);
        k.append(", options=");
        return a40.f.p(k, (Map)this.b, ')');
    }
}
