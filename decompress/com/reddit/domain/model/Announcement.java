// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import al0.f0;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BR\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u00f8\u0001\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\f\u001a\u00020\bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u00c6\u0003Jj\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\rH\u00d6\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003R \u0010\u0010\u001a\u00020\u00028\u0006\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b&\u0010\u0004R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b'\u0010\u0004R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b(\u0010\u0004R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b)\u0010\u0004R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b-\u0010\u0004R\u001a\u0010.\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010\u0004R\u001a\u00100\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010\u0004R\u001a\u00102\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b3\u0010\u0004R\u001a\u00104\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b8\u00107\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006;" }, d2 = { "Lcom/reddit/domain/model/Announcement;", "Lcom/reddit/domain/model/ILink;", "Luw/a;", "component1-ldoH_W0", "()Ljava/lang/String;", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "", "component7", "component8", "announcementId", "createdUtc", "description", "title", "iconUrl", "announcementUrl", "maxImpressionsCount", "experimentName", "copy-NIQgPbM", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/reddit/domain/model/Announcement;", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAnnouncementId-ldoH_W0", "J", "getCreatedUtc", "()J", "getDescription", "getTitle", "getIconUrl", "getAnnouncementUrl", "I", "getMaxImpressionsCount", "()I", "getExperimentName", "id", "getId", "kindWithId", "getKindWithId", "uniqueId", "getUniqueId", "promoted", "Z", "getPromoted", "()Z", "isBlankAd", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Announcement extends ILink
{
    private final String announcementId;
    private final String announcementUrl;
    private final long createdUtc;
    private final String description;
    private final String experimentName;
    private final String iconUrl;
    private final String id;
    private final boolean isBlankAd;
    private final String kindWithId;
    private final int maxImpressionsCount;
    private final boolean promoted;
    private final String title;
    private final String uniqueId;
    
    private Announcement(final String s, final long createdUtc, final String description, final String title, final String iconUrl, final String announcementUrl, final int maxImpressionsCount, final String experimentName) {
        super((DefaultConstructorMarker)null);
        this.announcementId = s;
        this.createdUtc = createdUtc;
        this.description = description;
        this.title = title;
        this.iconUrl = iconUrl;
        this.announcementUrl = announcementUrl;
        this.maxImpressionsCount = maxImpressionsCount;
        this.experimentName = experimentName;
        this.id = s;
        final StringBuilder r = a.r("announcement_");
        r.append(this.getId());
        this.kindWithId = r.toString();
        this.uniqueId = this.getId();
    }
    
    public final String component1-ldoH_W0() {
        return this.announcementId;
    }
    
    public final long component2() {
        return this.getCreatedUtc();
    }
    
    public final String component3() {
        return this.description;
    }
    
    public final String component4() {
        return this.title;
    }
    
    public final String component5() {
        return this.iconUrl;
    }
    
    public final String component6() {
        return this.announcementUrl;
    }
    
    public final int component7() {
        return this.maxImpressionsCount;
    }
    
    public final String component8() {
        return this.experimentName;
    }
    
    public final Announcement copy-NIQgPbM(final String s, @n(name = "created_utc") final long n, final String s2, final String s3, final String s4, @n(name = "announcement_url") final String s5, final int n2, final String s6) {
        e.f((Object)s, "announcementId");
        e.f((Object)s2, "description");
        e.f((Object)s3, "title");
        e.f((Object)s5, "announcementUrl");
        return new Announcement(s, n, s2, s3, s4, s5, n2, s6, null);
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Announcement)) {
            return false;
        }
        final Announcement announcement = (Announcement)o;
        return e.a((Object)this.announcementId, (Object)announcement.announcementId) && this.getCreatedUtc() == announcement.getCreatedUtc() && e.a((Object)this.description, (Object)announcement.description) && e.a((Object)this.title, (Object)announcement.title) && e.a((Object)this.iconUrl, (Object)announcement.iconUrl) && e.a((Object)this.announcementUrl, (Object)announcement.announcementUrl) && this.maxImpressionsCount == announcement.maxImpressionsCount && e.a((Object)this.experimentName, (Object)announcement.experimentName);
    }
    
    public final String getAnnouncementId-ldoH_W0() {
        return this.announcementId;
    }
    
    public final String getAnnouncementUrl() {
        return this.announcementUrl;
    }
    
    public long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final String getExperimentName() {
        return this.experimentName;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getKindWithId() {
        return this.kindWithId;
    }
    
    public final int getMaxImpressionsCount() {
        return this.maxImpressionsCount;
    }
    
    public boolean getPromoted() {
        return this.promoted;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public String getUniqueId() {
        return this.uniqueId;
    }
    
    public int hashCode() {
        final int c = b.c(this.title, b.c(this.description, (Long.hashCode(this.getCreatedUtc()) + this.announcementId.hashCode() * 31) * 31, 31), 31);
        final String iconUrl = this.iconUrl;
        final int n = 0;
        int hashCode;
        if (iconUrl == null) {
            hashCode = 0;
        }
        else {
            hashCode = iconUrl.hashCode();
        }
        final int c2 = a.c(this.maxImpressionsCount, b.c(this.announcementUrl, (c + hashCode) * 31, 31), 31);
        final String experimentName = this.experimentName;
        int hashCode2;
        if (experimentName == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = experimentName.hashCode();
        }
        return c2 + hashCode2;
    }
    
    public boolean isBlankAd() {
        return this.isBlankAd;
    }
    
    public String toString() {
        final StringBuilder r = a.r("Announcement(announcementId=");
        r.append((Object)uw.a.a(this.announcementId));
        r.append(", createdUtc=");
        r.append(this.getCreatedUtc());
        r.append(", description=");
        r.append(this.description);
        r.append(", title=");
        r.append(this.title);
        r.append(", iconUrl=");
        r.append(this.iconUrl);
        r.append(", announcementUrl=");
        r.append(this.announcementUrl);
        r.append(", maxImpressionsCount=");
        r.append(this.maxImpressionsCount);
        r.append(", experimentName=");
        return f0.n(r, this.experimentName, ')');
    }
}
