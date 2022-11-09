// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/model/VideoModel;", "", "filePath", "", "(Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class VideoModel
{
    private final String filePath;
    
    public VideoModel(final String filePath) {
        f.f((Object)filePath, "filePath");
        this.filePath = filePath;
    }
    
    public final String component1() {
        return this.filePath;
    }
    
    public final VideoModel copy(final String s) {
        f.f((Object)s, "filePath");
        return new VideoModel(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof VideoModel && f.a((Object)this.filePath, (Object)((VideoModel)o).filePath));
    }
    
    public final String getFilePath() {
        return this.filePath;
    }
    
    @Override
    public int hashCode() {
        return this.filePath.hashCode();
    }
    
    @Override
    public String toString() {
        return b.k(a.k("VideoModel(filePath="), this.filePath, ')');
    }
}
