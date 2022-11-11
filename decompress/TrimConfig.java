// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.data.videoEditor;

import lw0.b;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n" }, d2 = { "Lcom/reddit/video/creation/video/trim/data/videoEditor/TrimConfig;", "", "trimStart", "", "trimEnd", "(JJ)V", "range", "", "getRange", "()Ljava/util/List;", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class TrimConfig
{
    public static final int $stable = 8;
    private final List<Long> range;
    
    public TrimConfig(final long n, final long n2) {
        this.range = b.s1((Object[])new Long[] { n, n2 });
    }
    
    public final List<Long> getRange() {
        return this.range;
    }
}
