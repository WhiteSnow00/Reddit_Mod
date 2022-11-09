// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\t¨\u0006%" }, d2 = { "Lcom/reddit/domain/model/NftBannerFeedElement;", "Lcom/reddit/domain/model/ILink;", "id", "", "title", "description", "buttonCtaText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonCtaText", "()Ljava/lang/String;", "createdUtc", "", "getCreatedUtc", "()J", "getDescription", "getId", "isBlankAd", "", "()Z", "kindWithId", "getKindWithId", "promoted", "getPromoted", "getTitle", "uniqueId", "getUniqueId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NftBannerFeedElement extends ILink
{
    private final String buttonCtaText;
    private final long createdUtc;
    private final String description;
    private final String id;
    private final boolean isBlankAd;
    private final String kindWithId;
    private final boolean promoted;
    private final String title;
    private final String uniqueId;
    
    public NftBannerFeedElement(final String id, final String title, final String description, final String buttonCtaText) {
        a.s(id, "id", title, "title", description, "description", buttonCtaText, "buttonCtaText");
        super((DefaultConstructorMarker)null);
        this.id = id;
        this.title = title;
        this.description = description;
        this.buttonCtaText = buttonCtaText;
        final StringBuilder k = a.k("nft_banner_home_feed_unit_");
        k.append(this.getId());
        this.kindWithId = k.toString();
        this.uniqueId = this.getId();
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final String component3() {
        return this.description;
    }
    
    public final String component4() {
        return this.buttonCtaText;
    }
    
    public final NftBannerFeedElement copy(final String s, final String s2, final String s3, final String s4) {
        f.f((Object)s, "id");
        f.f((Object)s2, "title");
        f.f((Object)s3, "description");
        f.f((Object)s4, "buttonCtaText");
        return new NftBannerFeedElement(s, s2, s3, s4);
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NftBannerFeedElement)) {
            return false;
        }
        final NftBannerFeedElement nftBannerFeedElement = (NftBannerFeedElement)o;
        return f.a((Object)this.getId(), (Object)nftBannerFeedElement.getId()) && f.a((Object)this.title, (Object)nftBannerFeedElement.title) && f.a((Object)this.description, (Object)nftBannerFeedElement.description) && f.a((Object)this.buttonCtaText, (Object)nftBannerFeedElement.buttonCtaText);
    }
    
    public final String getButtonCtaText() {
        return this.buttonCtaText;
    }
    
    public long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getKindWithId() {
        return this.kindWithId;
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
        return this.buttonCtaText.hashCode() + ag0.a.f(this.description, ag0.a.f(this.title, this.getId().hashCode() * 31, 31), 31);
    }
    
    public boolean isBlankAd() {
        return this.isBlankAd;
    }
    
    public String toString() {
        final StringBuilder k = a.k("NftBannerFeedElement(id=");
        k.append(this.getId());
        k.append(", title=");
        k.append(this.title);
        k.append(", description=");
        k.append(this.description);
        k.append(", buttonCtaText=");
        return b.k(k, this.buttonCtaText, ')');
    }
}
