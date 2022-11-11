// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model.polls;

import a2.b;
import ah2.f;
import java.math.BigInteger;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/polls/PollDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class PollDataModel
{
    public final String a;
    public final List<PollOptionDataModel> b;
    public final long c;
    public final String d;
    public final BigInteger e;
    
    public PollDataModel(final String a, final List<PollOptionDataModel> b, final long c, final String d, final BigInteger e) {
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
        if (!(o instanceof PollDataModel)) {
            return false;
        }
        final PollDataModel pollDataModel = (PollDataModel)o;
        return f.a((Object)this.a, (Object)pollDataModel.a) && f.a((Object)this.b, (Object)pollDataModel.b) && this.c == pollDataModel.c && f.a((Object)this.d, (Object)pollDataModel.d) && f.a((Object)this.e, (Object)pollDataModel.e);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.c, a2.b.a((List)this.b, this.a.hashCode() * 31, 31), 31);
        final String d = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final BigInteger e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (c + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PollDataModel(id=");
        k.append(this.a);
        k.append(", options=");
        k.append(this.b);
        k.append(", endsAt=");
        k.append(this.c);
        k.append(", type=");
        k.append(this.d);
        k.append(", decisionThreshold=");
        k.append(this.e);
        k.append(')');
        return k.toString();
    }
}
