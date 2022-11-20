// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import android.os.Parcel;
import p1.h;
import aq2.a;
import ng2.e;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003JM\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006'" }, d2 = { "Lcom/reddit/domain/chat/model/LinkEmbed;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "component6", "url", "siteName", "title", "description", "favicon", "image", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getSiteName", "getTitle", "getDescription", "getFavicon", "getImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkEmbed implements Parcelable
{
    public static final Parcelable$Creator<LinkEmbed> CREATOR;
    private final String description;
    private final String favicon;
    private final String image;
    private final String siteName;
    private final String title;
    private final String url;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public LinkEmbed(final String url, final String siteName, final String title, final String description, final String favicon, final String image) {
        e.f((Object)url, "url");
        e.f((Object)siteName, "siteName");
        this.url = url;
        this.siteName = siteName;
        this.title = title;
        this.description = description;
        this.favicon = favicon;
        this.image = image;
    }
    
    public static LinkEmbed copy$default(final LinkEmbed linkEmbed, String url, String siteName, String title, String description, String favicon, String image, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            url = linkEmbed.url;
        }
        if ((n & 0x2) != 0x0) {
            siteName = linkEmbed.siteName;
        }
        if ((n & 0x4) != 0x0) {
            title = linkEmbed.title;
        }
        if ((n & 0x8) != 0x0) {
            description = linkEmbed.description;
        }
        if ((n & 0x10) != 0x0) {
            favicon = linkEmbed.favicon;
        }
        if ((n & 0x20) != 0x0) {
            image = linkEmbed.image;
        }
        return linkEmbed.copy(url, siteName, title, description, favicon, image);
    }
    
    public final String component1() {
        return this.url;
    }
    
    public final String component2() {
        return this.siteName;
    }
    
    public final String component3() {
        return this.title;
    }
    
    public final String component4() {
        return this.description;
    }
    
    public final String component5() {
        return this.favicon;
    }
    
    public final String component6() {
        return this.image;
    }
    
    public final LinkEmbed copy(final String s, final String s2, final String s3, final String s4, final String s5, final String s6) {
        e.f((Object)s, "url");
        e.f((Object)s2, "siteName");
        return new LinkEmbed(s, s2, s3, s4, s5, s6);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkEmbed)) {
            return false;
        }
        final LinkEmbed linkEmbed = (LinkEmbed)o;
        return e.a((Object)this.url, (Object)linkEmbed.url) && e.a((Object)this.siteName, (Object)linkEmbed.siteName) && e.a((Object)this.title, (Object)linkEmbed.title) && e.a((Object)this.description, (Object)linkEmbed.description) && e.a((Object)this.favicon, (Object)linkEmbed.favicon) && e.a((Object)this.image, (Object)linkEmbed.image);
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final String getFavicon() {
        return this.favicon;
    }
    
    public final String getImage() {
        return this.image;
    }
    
    public final String getSiteName() {
        return this.siteName;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final int e = a.e(this.siteName, this.url.hashCode() * 31, 31);
        final String title = this.title;
        int hashCode = 0;
        int hashCode2;
        if (title == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = title.hashCode();
        }
        final String description = this.description;
        int hashCode3;
        if (description == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = description.hashCode();
        }
        final String favicon = this.favicon;
        int hashCode4;
        if (favicon == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = favicon.hashCode();
        }
        final String image = this.image;
        if (image != null) {
            hashCode = image.hashCode();
        }
        return (((e + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("LinkEmbed(url=");
        t.append(this.url);
        t.append(", siteName=");
        t.append(this.siteName);
        t.append(", title=");
        t.append(this.title);
        t.append(", description=");
        t.append(this.description);
        t.append(", favicon=");
        t.append(this.favicon);
        t.append(", image=");
        return h.c(t, this.image, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.url);
        parcel.writeString(this.siteName);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.favicon);
        parcel.writeString(this.image);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<LinkEmbed>
    {
        public final LinkEmbed createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new LinkEmbed(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final LinkEmbed[] newArray(final int n) {
            return new LinkEmbed[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}
