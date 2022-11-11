// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/LinkTitleResponseJson;", "", "data", "Lcom/reddit/domain/model/LinkTitleResponseData;", "(Lcom/reddit/domain/model/LinkTitleResponseData;)V", "getData", "()Lcom/reddit/domain/model/LinkTitleResponseData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class LinkTitleResponseJson
{
    private final LinkTitleResponseData data;
    
    public LinkTitleResponseJson(final LinkTitleResponseData data) {
        f.f((Object)data, "data");
        this.data = data;
    }
    
    public final LinkTitleResponseData component1() {
        return this.data;
    }
    
    public final LinkTitleResponseJson copy(final LinkTitleResponseData linkTitleResponseData) {
        f.f((Object)linkTitleResponseData, "data");
        return new LinkTitleResponseJson(linkTitleResponseData);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof LinkTitleResponseJson && f.a((Object)this.data, (Object)((LinkTitleResponseJson)o).data));
    }
    
    public final LinkTitleResponseData getData() {
        return this.data;
    }
    
    @Override
    public int hashCode() {
        return this.data.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LinkTitleResponseJson(data=");
        k.append(this.data);
        k.append(')');
        return k.toString();
    }
}
