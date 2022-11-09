// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import kotlin.collections.EmptyList;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamCommunityResult;", "", "models", "", "Lcom/reddit/domain/model/streaming/StreamCommunity;", "nextCursor", "", "(Ljava/util/List;I)V", "getModels", "()Ljava/util/List;", "getNextCursor", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StreamCommunityResult
{
    private final List<StreamCommunity> models;
    private final int nextCursor;
    
    public StreamCommunityResult() {
        this(null, 0, 3, null);
    }
    
    public StreamCommunityResult(final List<StreamCommunity> models, final int nextCursor) {
        f.f((Object)models, "models");
        this.models = models;
        this.nextCursor = nextCursor;
    }
    
    public StreamCommunityResult(List instance, int n, final int n2, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x1) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        this((List<StreamCommunity>)instance, n);
    }
    
    public final List<StreamCommunity> component1() {
        return this.models;
    }
    
    public final int component2() {
        return this.nextCursor;
    }
    
    public final StreamCommunityResult copy(final List<StreamCommunity> list, final int n) {
        f.f((Object)list, "models");
        return new StreamCommunityResult(list, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamCommunityResult)) {
            return false;
        }
        final StreamCommunityResult streamCommunityResult = (StreamCommunityResult)o;
        return f.a((Object)this.models, (Object)streamCommunityResult.models) && this.nextCursor == streamCommunityResult.nextCursor;
    }
    
    public final List<StreamCommunity> getModels() {
        return this.models;
    }
    
    public final int getNextCursor() {
        return this.nextCursor;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.nextCursor) + this.models.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StreamCommunityResult(models=");
        k.append(this.models);
        k.append(", nextCursor=");
        return d.k(k, this.nextCursor, ')');
    }
}
