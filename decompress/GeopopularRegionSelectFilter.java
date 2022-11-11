// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/model/GeopopularRegionSelectFilter;", "", "filter", "", "displayName", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "getFilter", "setFilter", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class GeopopularRegionSelectFilter
{
    public static final Companion Companion;
    private String displayName;
    private String filter;
    
    static {
        Companion = new Companion(null);
    }
    
    public GeopopularRegionSelectFilter(final String filter, final String displayName) {
        f.f((Object)filter, "filter");
        f.f((Object)displayName, "displayName");
        this.filter = filter;
        this.displayName = displayName;
    }
    
    public final String component1() {
        return this.filter;
    }
    
    public final String component2() {
        return this.displayName;
    }
    
    public final GeopopularRegionSelectFilter copy(final String s, final String s2) {
        f.f((Object)s, "filter");
        f.f((Object)s2, "displayName");
        return new GeopopularRegionSelectFilter(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeopopularRegionSelectFilter)) {
            return false;
        }
        final GeopopularRegionSelectFilter geopopularRegionSelectFilter = (GeopopularRegionSelectFilter)o;
        return f.a((Object)this.filter, (Object)geopopularRegionSelectFilter.filter) && f.a((Object)this.displayName, (Object)geopopularRegionSelectFilter.displayName);
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getFilter() {
        return this.filter;
    }
    
    @Override
    public int hashCode() {
        return this.displayName.hashCode() + this.filter.hashCode() * 31;
    }
    
    public final void setDisplayName(final String displayName) {
        f.f((Object)displayName, "<set-?>");
        this.displayName = displayName;
    }
    
    public final void setFilter(final String filter) {
        f.f((Object)filter, "<set-?>");
        this.filter = filter;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("GeopopularRegionSelectFilter(filter=");
        k.append(this.filter);
        k.append(", displayName=");
        return b.k(k, this.displayName, ')');
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/GeopopularRegionSelectFilter$Companion;", "", "()V", "DEFAULT", "Lcom/reddit/domain/model/GeopopularRegionSelectFilter;", "getDEFAULT", "()Lcom/reddit/domain/model/GeopopularRegionSelectFilter;", "GLOBAL", "getGLOBAL", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final GeopopularRegionSelectFilter getDEFAULT() {
            return new GeopopularRegionSelectFilter("", "Global");
        }
        
        public final GeopopularRegionSelectFilter getGLOBAL() {
            return new GeopopularRegionSelectFilter("GLOBAL", "Global");
        }
    }
}
