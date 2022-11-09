// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ag0.a;
import ah2.f;
import java.math.BigInteger;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/LeaderboardItemDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class LeaderboardItemDataModel
{
    public final int a;
    public final BigInteger b;
    public final String c;
    public final String d;
    
    public LeaderboardItemDataModel(final int a, final String c, final String d, final BigInteger b) {
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
        if (!(o instanceof LeaderboardItemDataModel)) {
            return false;
        }
        final LeaderboardItemDataModel leaderboardItemDataModel = (LeaderboardItemDataModel)o;
        return this.a == leaderboardItemDataModel.a && f.a((Object)this.b, (Object)leaderboardItemDataModel.b) && f.a((Object)this.c, (Object)leaderboardItemDataModel.c) && f.a((Object)this.d, (Object)leaderboardItemDataModel.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + ag0.a.f(this.c, d.g(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("LeaderboardItemDataModel(position=");
        k.append(this.a);
        k.append(", score=");
        k.append(this.b);
        k.append(", userId=");
        k.append(this.c);
        k.append(", userName=");
        return b.k(k, this.d, ')');
    }
}
