// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import p1.h;
import aq2.a;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/model/Region;", "", "id", "", "name", "geoFilter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGeoFilter", "()Ljava/lang/String;", "getId", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Region
{
    public static final Companion Companion;
    public static final Region DEFAULT;
    private final String geoFilter;
    private final String id;
    private final String name;
    
    static {
        Companion = new Companion(null);
        DEFAULT = new Region("", "Global", "GLOBAL");
    }
    
    public Region(final String id, final String name, final String geoFilter) {
        b.w(id, "id", name, "name", geoFilter, "geoFilter");
        this.id = id;
        this.name = name;
        this.geoFilter = geoFilter;
    }
    
    public static Region copy$default(final Region region, String id, String name, String geoFilter, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            id = region.id;
        }
        if ((n & 0x2) != 0x0) {
            name = region.name;
        }
        if ((n & 0x4) != 0x0) {
            geoFilter = region.geoFilter;
        }
        return region.copy(id, name, geoFilter);
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.geoFilter;
    }
    
    public final Region copy(final String s, final String s2, final String s3) {
        e.f((Object)s, "id");
        e.f((Object)s2, "name");
        e.f((Object)s3, "geoFilter");
        return new Region(s, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Region)) {
            return false;
        }
        final Region region = (Region)o;
        return e.a((Object)this.id, (Object)region.id) && e.a((Object)this.name, (Object)region.name) && e.a((Object)this.geoFilter, (Object)region.geoFilter);
    }
    
    public final String getGeoFilter() {
        return this.geoFilter;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        return this.geoFilter.hashCode() + a.e(this.name, this.id.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Region(id=");
        t.append(this.id);
        t.append(", name=");
        t.append(this.name);
        t.append(", geoFilter=");
        return h.c(t, this.geoFilter, ')');
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/Region$Companion;", "", "()V", "DEFAULT", "Lcom/reddit/domain/model/Region;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
