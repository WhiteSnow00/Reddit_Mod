// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ag0.a;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001'BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0000H\u0096\u0002J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0002\u0010\u0010J^\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010\u0018\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020\u0017H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006(" }, d2 = { "Lcom/reddit/domain/model/Trophy;", "", "id", "", "awardId", "name", "description", "iconUrl", "url", "grantedAt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getAwardId", "()Ljava/lang/String;", "getDescription", "getGrantedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIconUrl", "getId", "getName", "getUrl", "compareTo", "", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/reddit/domain/model/Trophy;", "equals", "", "", "hashCode", "toString", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Trophy implements Comparable<Trophy>
{
    public static final Companion Companion;
    private static final Comparator<Trophy> recencyComparator;
    private final String awardId;
    private final String description;
    private final Long grantedAt;
    private final String iconUrl;
    private final String id;
    private final String name;
    private final String url;
    
    static {
        Companion = new Companion(null);
        recencyComparator = (Comparator)new Trophy$special$$inlined$compareByDescending.Trophy$special$$inlined$compareByDescending$1();
    }
    
    public Trophy(final String id, final String awardId, final String name, final String description, final String iconUrl, final String url, final Long grantedAt) {
        f.f((Object)name, "name");
        f.f((Object)iconUrl, "iconUrl");
        this.id = id;
        this.awardId = awardId;
        this.name = name;
        this.description = description;
        this.iconUrl = iconUrl;
        this.url = url;
        this.grantedAt = grantedAt;
    }
    
    public static final /* synthetic */ Comparator access$getRecencyComparator$cp() {
        return Trophy.recencyComparator;
    }
    
    @Override
    public int compareTo(final Trophy trophy) {
        f.f((Object)trophy, "other");
        return Trophy.recencyComparator.compare(this, trophy);
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.awardId;
    }
    
    public final String component3() {
        return this.name;
    }
    
    public final String component4() {
        return this.description;
    }
    
    public final String component5() {
        return this.iconUrl;
    }
    
    public final String component6() {
        return this.url;
    }
    
    public final Long component7() {
        return this.grantedAt;
    }
    
    public final Trophy copy(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final Long n) {
        f.f((Object)s3, "name");
        f.f((Object)s5, "iconUrl");
        return new Trophy(s, s2, s3, s4, s5, s6, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Trophy)) {
            return false;
        }
        final Trophy trophy = (Trophy)o;
        return f.a((Object)this.id, (Object)trophy.id) && f.a((Object)this.awardId, (Object)trophy.awardId) && f.a((Object)this.name, (Object)trophy.name) && f.a((Object)this.description, (Object)trophy.description) && f.a((Object)this.iconUrl, (Object)trophy.iconUrl) && f.a((Object)this.url, (Object)trophy.url) && f.a((Object)this.grantedAt, (Object)trophy.grantedAt);
    }
    
    public final String getAwardId() {
        return this.awardId;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final Long getGrantedAt() {
        return this.grantedAt;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        final int n = 0;
        int hashCode;
        if (id == null) {
            hashCode = 0;
        }
        else {
            hashCode = id.hashCode();
        }
        final String awardId = this.awardId;
        int hashCode2;
        if (awardId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = awardId.hashCode();
        }
        final int f = a.f(this.name, (hashCode * 31 + hashCode2) * 31, 31);
        final String description = this.description;
        int hashCode3;
        if (description == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = description.hashCode();
        }
        final int f2 = a.f(this.iconUrl, (f + hashCode3) * 31, 31);
        final String url = this.url;
        int hashCode4;
        if (url == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = url.hashCode();
        }
        final Long grantedAt = this.grantedAt;
        int hashCode5;
        if (grantedAt == null) {
            hashCode5 = n;
        }
        else {
            hashCode5 = grantedAt.hashCode();
        }
        return (f2 + hashCode4) * 31 + hashCode5;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Trophy(id=");
        k.append(this.id);
        k.append(", awardId=");
        k.append(this.awardId);
        k.append(", name=");
        k.append(this.name);
        k.append(", description=");
        k.append(this.description);
        k.append(", iconUrl=");
        k.append(this.iconUrl);
        k.append(", url=");
        k.append(this.url);
        k.append(", grantedAt=");
        return a40.f.o(k, this.grantedAt, ')');
    }
    
    @Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/Trophy$Companion;", "", "()V", "recencyComparator", "Ljava/util/Comparator;", "Lcom/reddit/domain/model/Trophy;", "Lkotlin/Comparator;", "getRecencyComparator", "()Ljava/util/Comparator;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final Comparator<Trophy> getRecencyComparator() {
            return Trophy.access$getRecencyComparator$cp();
        }
    }
}
