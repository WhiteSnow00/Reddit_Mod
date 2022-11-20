// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import p1.h;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/chat/model/MediaSheetParams;", "", "initialQuery", "", "(Ljava/lang/String;)V", "getInitialQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MediaSheetParams
{
    private final String initialQuery;
    
    public MediaSheetParams(final String initialQuery) {
        this.initialQuery = initialQuery;
    }
    
    public static MediaSheetParams copy$default(final MediaSheetParams mediaSheetParams, String initialQuery, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            initialQuery = mediaSheetParams.initialQuery;
        }
        return mediaSheetParams.copy(initialQuery);
    }
    
    public final String component1() {
        return this.initialQuery;
    }
    
    public final MediaSheetParams copy(final String s) {
        return new MediaSheetParams(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof MediaSheetParams && e.a((Object)this.initialQuery, (Object)((MediaSheetParams)o).initialQuery));
    }
    
    public final String getInitialQuery() {
        return this.initialQuery;
    }
    
    @Override
    public int hashCode() {
        final String initialQuery = this.initialQuery;
        int hashCode;
        if (initialQuery == null) {
            hashCode = 0;
        }
        else {
            hashCode = initialQuery.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        return h.c(a.t("MediaSheetParams(initialQuery="), this.initialQuery, ')');
    }
}
