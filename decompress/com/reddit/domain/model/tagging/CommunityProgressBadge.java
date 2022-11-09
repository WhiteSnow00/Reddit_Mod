// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/tagging/CommunityProgressBadge;", "", "count", "", "style", "Lcom/reddit/domain/model/tagging/CommunityProgressBadge$Style;", "(ILcom/reddit/domain/model/tagging/CommunityProgressBadge$Style;)V", "getCount", "()I", "getStyle", "()Lcom/reddit/domain/model/tagging/CommunityProgressBadge$Style;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Style", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CommunityProgressBadge
{
    private final int count;
    private final Style style;
    
    public CommunityProgressBadge(final int count, final Style style) {
        f.f((Object)style, "style");
        this.count = count;
        this.style = style;
    }
    
    public final int component1() {
        return this.count;
    }
    
    public final Style component2() {
        return this.style;
    }
    
    public final CommunityProgressBadge copy(final int n, final Style style) {
        f.f((Object)style, "style");
        return new CommunityProgressBadge(n, style);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommunityProgressBadge)) {
            return false;
        }
        final CommunityProgressBadge communityProgressBadge = (CommunityProgressBadge)o;
        return this.count == communityProgressBadge.count && this.style == communityProgressBadge.style;
    }
    
    public final int getCount() {
        return this.count;
    }
    
    public final Style getStyle() {
        return this.style;
    }
    
    @Override
    public int hashCode() {
        return this.style.hashCode() + Integer.hashCode(this.count) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CommunityProgressBadge(count=");
        k.append(this.count);
        k.append(", style=");
        k.append(this.style);
        k.append(')');
        return k.toString();
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/tagging/CommunityProgressBadge$Style;", "", "(Ljava/lang/String;I)V", "NUMBERED", "FILLED", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Style
    {
        FILLED, 
        NUMBERED;
    }
}
