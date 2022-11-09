// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.sociallink;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003JG\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b%\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b&\u0010 R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)¨\u0006," }, d2 = { "Lcom/reddit/domain/model/sociallink/SocialLink;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "component4", "component5", "Lcom/reddit/domain/model/sociallink/SocialLinkType;", "component6", "id", "url", "position", "title", "handle", "type", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getUrl", "I", "getPosition", "()I", "getTitle", "getHandle", "Lcom/reddit/domain/model/sociallink/SocialLinkType;", "getType", "()Lcom/reddit/domain/model/sociallink/SocialLinkType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/sociallink/SocialLinkType;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SocialLink implements Parcelable
{
    public static final Parcelable$Creator<SocialLink> CREATOR;
    private final String handle;
    private final String id;
    private final int position;
    private final String title;
    private final SocialLinkType type;
    private final String url;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SocialLink(final String id, final String url, final int position, final String title, final String handle, final SocialLinkType type) {
        f.f((Object)id, "id");
        f.f((Object)url, "url");
        f.f((Object)title, "title");
        f.f((Object)type, "type");
        this.id = id;
        this.url = url;
        this.position = position;
        this.title = title;
        this.handle = handle;
        this.type = type;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.url;
    }
    
    public final int component3() {
        return this.position;
    }
    
    public final String component4() {
        return this.title;
    }
    
    public final String component5() {
        return this.handle;
    }
    
    public final SocialLinkType component6() {
        return this.type;
    }
    
    public final SocialLink copy(final String s, final String s2, final int n, final String s3, final String s4, final SocialLinkType socialLinkType) {
        f.f((Object)s, "id");
        f.f((Object)s2, "url");
        f.f((Object)s3, "title");
        f.f((Object)socialLinkType, "type");
        return new SocialLink(s, s2, n, s3, s4, socialLinkType);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SocialLink)) {
            return false;
        }
        final SocialLink socialLink = (SocialLink)o;
        return f.a((Object)this.id, (Object)socialLink.id) && f.a((Object)this.url, (Object)socialLink.url) && this.position == socialLink.position && f.a((Object)this.title, (Object)socialLink.title) && f.a((Object)this.handle, (Object)socialLink.handle) && this.type == socialLink.type;
    }
    
    public final String getHandle() {
        return this.handle;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final int getPosition() {
        return this.position;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final SocialLinkType getType() {
        return this.type;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.title, s0.e(this.position, a.f(this.url, this.id.hashCode() * 31, 31), 31), 31);
        final String handle = this.handle;
        int hashCode;
        if (handle == null) {
            hashCode = 0;
        }
        else {
            hashCode = handle.hashCode();
        }
        return this.type.hashCode() + (f + hashCode) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SocialLink(id=");
        k.append(this.id);
        k.append(", url=");
        k.append(this.url);
        k.append(", position=");
        k.append(this.position);
        k.append(", title=");
        k.append(this.title);
        k.append(", handle=");
        k.append(this.handle);
        k.append(", type=");
        k.append(this.type);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.url);
        parcel.writeInt(this.position);
        parcel.writeString(this.title);
        parcel.writeString(this.handle);
        parcel.writeString(this.type.name());
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SocialLink>
    {
        public final SocialLink createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new SocialLink(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), SocialLinkType.valueOf(parcel.readString()));
        }
        
        public final SocialLink[] newArray(final int n) {
            return new SocialLink[n];
        }
    }
}
