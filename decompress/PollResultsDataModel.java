// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model.polls;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/polls/PollResultsDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class PollResultsDataModel
{
    public final PollResultDataModel a;
    public final PollResultDataModel b;
    
    public PollResultsDataModel(final PollResultDataModel a, final PollResultDataModel b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PollResultsDataModel)) {
            return false;
        }
        final PollResultsDataModel pollResultsDataModel = (PollResultsDataModel)o;
        return f.a((Object)this.a, (Object)pollResultsDataModel.a) && f.a((Object)this.b, (Object)pollResultsDataModel.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PollResultsDataModel(byVotingPower=");
        k.append(this.a);
        k.append(", byVoters=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
