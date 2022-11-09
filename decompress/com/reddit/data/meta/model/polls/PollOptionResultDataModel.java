// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model.polls;

import ah2.f;
import java.math.BigInteger;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/polls/PollOptionResultDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class PollOptionResultDataModel
{
    public final boolean a;
    public final BigInteger b;
    
    public PollOptionResultDataModel(final BigInteger b, final boolean a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PollOptionResultDataModel)) {
            return false;
        }
        final PollOptionResultDataModel pollOptionResultDataModel = (PollOptionResultDataModel)o;
        return this.a == pollOptionResultDataModel.a && f.a((Object)this.b, (Object)pollOptionResultDataModel.b);
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return this.b.hashCode() + a * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PollOptionResultDataModel(userSelected=");
        k.append(this.a);
        k.append(", votes=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
