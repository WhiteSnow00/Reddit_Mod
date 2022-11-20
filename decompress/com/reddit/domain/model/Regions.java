// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import p1.h;
import ng2.e;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/Regions;", "", "language", "", "mappings", "", "Lcom/reddit/domain/model/Mappings;", "(Ljava/lang/String;Ljava/util/List;)V", "getLanguage", "()Ljava/lang/String;", "getMappings", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Regions
{
    private final String language;
    private final List<Mappings> mappings;
    
    public Regions(final String language, final List<Mappings> mappings) {
        e.f((Object)language, "language");
        e.f((Object)mappings, "mappings");
        this.language = language;
        this.mappings = mappings;
    }
    
    public static Regions copy$default(final Regions regions, String language, List mappings, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            language = regions.language;
        }
        if ((n & 0x2) != 0x0) {
            mappings = regions.mappings;
        }
        return regions.copy(language, mappings);
    }
    
    public final String component1() {
        return this.language;
    }
    
    public final List<Mappings> component2() {
        return this.mappings;
    }
    
    public final Regions copy(final String s, final List<Mappings> list) {
        e.f((Object)s, "language");
        e.f((Object)list, "mappings");
        return new Regions(s, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Regions)) {
            return false;
        }
        final Regions regions = (Regions)o;
        return e.a((Object)this.language, (Object)regions.language) && e.a((Object)this.mappings, (Object)regions.mappings);
    }
    
    public final String getLanguage() {
        return this.language;
    }
    
    public final List<Mappings> getMappings() {
        return this.mappings;
    }
    
    @Override
    public int hashCode() {
        return this.mappings.hashCode() + this.language.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Regions(language=");
        t.append(this.language);
        t.append(", mappings=");
        return h.d(t, (List)this.mappings, ')');
    }
}
