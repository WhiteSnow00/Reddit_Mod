// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.data.source.remote;

import ng2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/devplatform/data/source/remote/SubredditInfoResponse;", "", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditInfoResponse
{
    public final SubredditInfoData a;
    
    public SubredditInfoResponse(final SubredditInfoData a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof SubredditInfoResponse && e.a((Object)this.a, (Object)((SubredditInfoResponse)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("SubredditInfoResponse(data=");
        t.append(this.a);
        t.append(')');
        return t.toString();
    }
}
