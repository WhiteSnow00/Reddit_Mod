// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ah2.f;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;
import java.io.Serializable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b)\u0010*J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bH\u00c6\u0003¢\u0006\u0004\b\u000b\u0010\nJX\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\bH\u00c6\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bH\u00d6\u0001R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b%\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010\nR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b(\u0010\n¨\u0006+" }, d2 = { "Lcom/reddit/domain/model/MediaDescriptor;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Integer;", "component6", "previewUrl", "imageUrl", "mp4Url", "gifUrl", "previewWidth", "previewHeight", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/reddit/domain/model/MediaDescriptor;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getPreviewUrl", "()Ljava/lang/String;", "getImageUrl", "getMp4Url", "getGifUrl", "Ljava/lang/Integer;", "getPreviewWidth", "getPreviewHeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class MediaDescriptor implements Serializable, Parcelable
{
    public static final Parcelable$Creator<MediaDescriptor> CREATOR;
    private final String gifUrl;
    private final String imageUrl;
    private final String mp4Url;
    private final Integer previewHeight;
    private final String previewUrl;
    private final Integer previewWidth;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public MediaDescriptor(@n(name = "p") final String previewUrl, @n(name = "u") final String imageUrl, @n(name = "mp4") final String mp4Url, @n(name = "gif") final String gifUrl, @n(name = "x") final Integer previewWidth, @n(name = "y") final Integer previewHeight) {
        this.previewUrl = previewUrl;
        this.imageUrl = imageUrl;
        this.mp4Url = mp4Url;
        this.gifUrl = gifUrl;
        this.previewWidth = previewWidth;
        this.previewHeight = previewHeight;
    }
    
    public final String component1() {
        return this.previewUrl;
    }
    
    public final String component2() {
        return this.imageUrl;
    }
    
    public final String component3() {
        return this.mp4Url;
    }
    
    public final String component4() {
        return this.gifUrl;
    }
    
    public final Integer component5() {
        return this.previewWidth;
    }
    
    public final Integer component6() {
        return this.previewHeight;
    }
    
    public final MediaDescriptor copy(@n(name = "p") final String s, @n(name = "u") final String s2, @n(name = "mp4") final String s3, @n(name = "gif") final String s4, @n(name = "x") final Integer n, @n(name = "y") final Integer n2) {
        return new MediaDescriptor(s, s2, s3, s4, n, n2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaDescriptor)) {
            return false;
        }
        final MediaDescriptor mediaDescriptor = (MediaDescriptor)o;
        return f.a((Object)this.previewUrl, (Object)mediaDescriptor.previewUrl) && f.a((Object)this.imageUrl, (Object)mediaDescriptor.imageUrl) && f.a((Object)this.mp4Url, (Object)mediaDescriptor.mp4Url) && f.a((Object)this.gifUrl, (Object)mediaDescriptor.gifUrl) && f.a((Object)this.previewWidth, (Object)mediaDescriptor.previewWidth) && f.a((Object)this.previewHeight, (Object)mediaDescriptor.previewHeight);
    }
    
    public final String getGifUrl() {
        return this.gifUrl;
    }
    
    public final String getImageUrl() {
        return this.imageUrl;
    }
    
    public final String getMp4Url() {
        return this.mp4Url;
    }
    
    public final Integer getPreviewHeight() {
        return this.previewHeight;
    }
    
    public final String getPreviewUrl() {
        return this.previewUrl;
    }
    
    public final Integer getPreviewWidth() {
        return this.previewWidth;
    }
    
    @Override
    public int hashCode() {
        final String previewUrl = this.previewUrl;
        int hashCode = 0;
        int hashCode2;
        if (previewUrl == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = previewUrl.hashCode();
        }
        final String imageUrl = this.imageUrl;
        int hashCode3;
        if (imageUrl == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = imageUrl.hashCode();
        }
        final String mp4Url = this.mp4Url;
        int hashCode4;
        if (mp4Url == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = mp4Url.hashCode();
        }
        final String gifUrl = this.gifUrl;
        int hashCode5;
        if (gifUrl == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = gifUrl.hashCode();
        }
        final Integer previewWidth = this.previewWidth;
        int hashCode6;
        if (previewWidth == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = previewWidth.hashCode();
        }
        final Integer previewHeight = this.previewHeight;
        if (previewHeight != null) {
            hashCode = previewHeight.hashCode();
        }
        return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("MediaDescriptor(previewUrl=");
        k.append(this.previewUrl);
        k.append(", imageUrl=");
        k.append(this.imageUrl);
        k.append(", mp4Url=");
        k.append(this.mp4Url);
        k.append(", gifUrl=");
        k.append(this.gifUrl);
        k.append(", previewWidth=");
        k.append(this.previewWidth);
        k.append(", previewHeight=");
        return s0.m(k, this.previewHeight, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.mp4Url);
        parcel.writeString(this.gifUrl);
        final Integer previewWidth = this.previewWidth;
        if (previewWidth == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, previewWidth);
        }
        final Integer previewHeight = this.previewHeight;
        if (previewHeight == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, previewHeight);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<MediaDescriptor>
    {
        public final MediaDescriptor createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            Integer value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = parcel.readInt();
            }
            Integer value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readInt();
            }
            return new MediaDescriptor(string, string2, string3, string4, value, value2);
        }
        
        public final MediaDescriptor[] newArray(final int n) {
            return new MediaDescriptor[n];
        }
    }
}
