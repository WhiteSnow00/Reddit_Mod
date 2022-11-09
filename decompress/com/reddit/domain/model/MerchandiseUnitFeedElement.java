// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fH\u00c6\u0003Jm\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u00101\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u000205H\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0014\u0010 \u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0010R\u0014\u0010#\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00067" }, d2 = { "Lcom/reddit/domain/model/MerchandiseUnitFeedElement;", "Lcom/reddit/domain/model/ILink;", "id", "", "format", "Lcom/reddit/domain/model/MerchandisingFormat;", "title", "body", "url", "ctaText", "images", "", "Lcom/reddit/domain/model/MediaAsset;", "video", "(Ljava/lang/String;Lcom/reddit/domain/model/MerchandisingFormat;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/reddit/domain/model/MediaAsset;)V", "getBody", "()Ljava/lang/String;", "createdUtc", "", "getCreatedUtc", "()J", "getCtaText", "getFormat", "()Lcom/reddit/domain/model/MerchandisingFormat;", "getId", "getImages", "()Ljava/util/List;", "isBlankAd", "", "()Z", "kindWithId", "getKindWithId", "promoted", "getPromoted", "getTitle", "uniqueId", "getUniqueId", "getUrl", "getVideo", "()Lcom/reddit/domain/model/MediaAsset;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MerchandiseUnitFeedElement extends ILink
{
    private final String body;
    private final long createdUtc;
    private final String ctaText;
    private final MerchandisingFormat format;
    private final String id;
    private final List<MediaAsset> images;
    private final boolean isBlankAd;
    private final String kindWithId;
    private final boolean promoted;
    private final String title;
    private final String uniqueId;
    private final String url;
    private final MediaAsset video;
    
    public MerchandiseUnitFeedElement(final String id, final MerchandisingFormat format, final String title, final String body, final String url, final String ctaText, final List<MediaAsset> images, final MediaAsset video) {
        f.f((Object)id, "id");
        super((DefaultConstructorMarker)null);
        this.id = id;
        this.format = format;
        this.title = title;
        this.body = body;
        this.url = url;
        this.ctaText = ctaText;
        this.images = images;
        this.video = video;
        final StringBuilder k = a.k("merchandise_unit_");
        k.append(this.getId());
        this.kindWithId = k.toString();
        this.uniqueId = this.getId();
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final MerchandisingFormat component2() {
        return this.format;
    }
    
    public final String component3() {
        return this.title;
    }
    
    public final String component4() {
        return this.body;
    }
    
    public final String component5() {
        return this.url;
    }
    
    public final String component6() {
        return this.ctaText;
    }
    
    public final List<MediaAsset> component7() {
        return this.images;
    }
    
    public final MediaAsset component8() {
        return this.video;
    }
    
    public final MerchandiseUnitFeedElement copy(final String s, final MerchandisingFormat merchandisingFormat, final String s2, final String s3, final String s4, final String s5, final List<MediaAsset> list, final MediaAsset mediaAsset) {
        f.f((Object)s, "id");
        return new MerchandiseUnitFeedElement(s, merchandisingFormat, s2, s3, s4, s5, list, mediaAsset);
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MerchandiseUnitFeedElement)) {
            return false;
        }
        final MerchandiseUnitFeedElement merchandiseUnitFeedElement = (MerchandiseUnitFeedElement)o;
        return f.a((Object)this.getId(), (Object)merchandiseUnitFeedElement.getId()) && this.format == merchandiseUnitFeedElement.format && f.a((Object)this.title, (Object)merchandiseUnitFeedElement.title) && f.a((Object)this.body, (Object)merchandiseUnitFeedElement.body) && f.a((Object)this.url, (Object)merchandiseUnitFeedElement.url) && f.a((Object)this.ctaText, (Object)merchandiseUnitFeedElement.ctaText) && f.a((Object)this.images, (Object)merchandiseUnitFeedElement.images) && f.a((Object)this.video, (Object)merchandiseUnitFeedElement.video);
    }
    
    public final String getBody() {
        return this.body;
    }
    
    public long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final String getCtaText() {
        return this.ctaText;
    }
    
    public final MerchandisingFormat getFormat() {
        return this.format;
    }
    
    public String getId() {
        return this.id;
    }
    
    public final List<MediaAsset> getImages() {
        return this.images;
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
    
    public final String getUrl() {
        return this.url;
    }
    
    public final MediaAsset getVideo() {
        return this.video;
    }
    
    public int hashCode() {
        final int hashCode = this.getId().hashCode();
        final MerchandisingFormat format = this.format;
        int hashCode2 = 0;
        int hashCode3;
        if (format == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = format.hashCode();
        }
        final String title = this.title;
        int hashCode4;
        if (title == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = title.hashCode();
        }
        final String body = this.body;
        int hashCode5;
        if (body == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = body.hashCode();
        }
        final String url = this.url;
        int hashCode6;
        if (url == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = url.hashCode();
        }
        final String ctaText = this.ctaText;
        int hashCode7;
        if (ctaText == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = ctaText.hashCode();
        }
        final List<MediaAsset> images = this.images;
        int hashCode8;
        if (images == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = images.hashCode();
        }
        final MediaAsset video = this.video;
        if (video != null) {
            hashCode2 = video.hashCode();
        }
        return ((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode2;
    }
    
    public boolean isBlankAd() {
        return this.isBlankAd;
    }
    
    public String toString() {
        final StringBuilder k = a.k("MerchandiseUnitFeedElement(id=");
        k.append(this.getId());
        k.append(", format=");
        k.append(this.format);
        k.append(", title=");
        k.append(this.title);
        k.append(", body=");
        k.append(this.body);
        k.append(", url=");
        k.append(this.url);
        k.append(", ctaText=");
        k.append(this.ctaText);
        k.append(", images=");
        k.append(this.images);
        k.append(", video=");
        k.append(this.video);
        k.append(')');
        return k.toString();
    }
}
