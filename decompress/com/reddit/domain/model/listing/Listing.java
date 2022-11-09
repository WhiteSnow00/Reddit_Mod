// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.listing;

import ak0.m;
import kotlin.collections.EmptyList;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.experience.UxExperience;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B_\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u00c6\u0003Ji\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u00c6\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006&" }, d2 = { "Lcom/reddit/domain/model/listing/Listing;", "T", "", "children", "", "after", "", "before", "adDistance", "geoFilter", "hasRecommendations", "", "uxExperiences", "Lcom/reddit/domain/model/experience/UxExperience;", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getAdDistance", "()Ljava/lang/String;", "getAfter", "getBefore", "getChildren", "()Ljava/util/List;", "getGeoFilter", "getHasRecommendations", "()Z", "getUxExperiences", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Listing<T>
{
    private final String adDistance;
    private final String after;
    private final String before;
    private final List<T> children;
    private final String geoFilter;
    private final boolean hasRecommendations;
    private final List<UxExperience> uxExperiences;
    
    public Listing() {
        this(null, null, null, null, null, false, null, 127, null);
    }
    
    public Listing(final List<? extends T> children, final String after, final String before, final String adDistance, final String geoFilter, final boolean hasRecommendations, final List<? extends UxExperience> uxExperiences) {
        f.f((Object)children, "children");
        f.f((Object)uxExperiences, "uxExperiences");
        this.children = (List<T>)children;
        this.after = after;
        this.before = before;
        this.adDistance = adDistance;
        this.geoFilter = geoFilter;
        this.hasRecommendations = hasRecommendations;
        this.uxExperiences = (List<UxExperience>)uxExperiences;
    }
    
    public Listing(List instance, String s, String s2, String s3, String s4, boolean b, List instance2, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        final String s5 = null;
        if ((n & 0x2) != 0x0) {
            s = null;
        }
        if ((n & 0x4) != 0x0) {
            s2 = null;
        }
        if ((n & 0x8) != 0x0) {
            s3 = null;
        }
        if ((n & 0x10) != 0x0) {
            s4 = s5;
        }
        if ((n & 0x20) != 0x0) {
            b = false;
        }
        if ((n & 0x40) != 0x0) {
            instance2 = EmptyList.INSTANCE;
        }
        this((List)instance, s, s2, s3, s4, b, (List)instance2);
    }
    
    public final List<T> component1() {
        return this.children;
    }
    
    public final String component2() {
        return this.after;
    }
    
    public final String component3() {
        return this.before;
    }
    
    public final String component4() {
        return this.adDistance;
    }
    
    public final String component5() {
        return this.geoFilter;
    }
    
    public final boolean component6() {
        return this.hasRecommendations;
    }
    
    public final List<UxExperience> component7() {
        return this.uxExperiences;
    }
    
    public final Listing<T> copy(final List<? extends T> list, final String s, final String s2, final String s3, final String s4, final boolean b, final List<? extends UxExperience> list2) {
        f.f((Object)list, "children");
        f.f((Object)list2, "uxExperiences");
        return new Listing<T>(list, s, s2, s3, s4, b, list2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Listing)) {
            return false;
        }
        final Listing listing = (Listing)o;
        return f.a((Object)this.children, (Object)listing.children) && f.a((Object)this.after, (Object)listing.after) && f.a((Object)this.before, (Object)listing.before) && f.a((Object)this.adDistance, (Object)listing.adDistance) && f.a((Object)this.geoFilter, (Object)listing.geoFilter) && this.hasRecommendations == listing.hasRecommendations && f.a((Object)this.uxExperiences, (Object)listing.uxExperiences);
    }
    
    public final String getAdDistance() {
        return this.adDistance;
    }
    
    public final String getAfter() {
        return this.after;
    }
    
    public final String getBefore() {
        return this.before;
    }
    
    public final List<T> getChildren() {
        return this.children;
    }
    
    public final String getGeoFilter() {
        return this.geoFilter;
    }
    
    public final boolean getHasRecommendations() {
        return this.hasRecommendations;
    }
    
    public final List<UxExperience> getUxExperiences() {
        return this.uxExperiences;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.children.hashCode();
        final String after = this.after;
        int hashCode2 = 0;
        int hashCode3;
        if (after == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = after.hashCode();
        }
        final String before = this.before;
        int hashCode4;
        if (before == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = before.hashCode();
        }
        final String adDistance = this.adDistance;
        int hashCode5;
        if (adDistance == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = adDistance.hashCode();
        }
        final String geoFilter = this.geoFilter;
        if (geoFilter != null) {
            hashCode2 = geoFilter.hashCode();
        }
        int hasRecommendations;
        if ((hasRecommendations = (this.hasRecommendations ? 1 : 0)) != 0) {
            hasRecommendations = 1;
        }
        return this.uxExperiences.hashCode() + (((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2) * 31 + hasRecommendations) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Listing(children=");
        k.append(this.children);
        k.append(", after=");
        k.append(this.after);
        k.append(", before=");
        k.append(this.before);
        k.append(", adDistance=");
        k.append(this.adDistance);
        k.append(", geoFilter=");
        k.append(this.geoFilter);
        k.append(", hasRecommendations=");
        k.append(this.hasRecommendations);
        k.append(", uxExperiences=");
        return m.n(k, (List)this.uxExperiences, ')');
    }
}
