// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/data/model/ListingEnvelope;", "T", "", "data", "Lcom/reddit/data/model/ChildrenEnvelope;", "(Lcom/reddit/data/model/ChildrenEnvelope;)V", "getData", "()Lcom/reddit/data/model/ChildrenEnvelope;", "remote_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ListingEnvelope<T>
{
    private final ChildrenEnvelope<T> data;
    
    public ListingEnvelope(final ChildrenEnvelope<? extends T> data) {
        f.f((Object)data, "data");
        this.data = (ChildrenEnvelope<T>)data;
    }
    
    public final ChildrenEnvelope<T> getData() {
        return this.data;
    }
}
