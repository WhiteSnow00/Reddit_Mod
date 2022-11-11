// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import kj2.j;
import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;
import java.io.Serializable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¯\u0001\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bF\u0010GJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J¸\u0001\u0010%\u001a\u00020\u00002\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0010\b\u0003\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0010\b\u0003\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0005H\u00d6\u0001J\t\u0010(\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010,\u001a\u00020\u0012H\u00d6\u0001J\u0019\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0012H\u00d6\u0001R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b5\u00104R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b6\u00104R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010:\u001a\u0004\b;\u0010<R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010:\u001a\u0004\b=\u0010<R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b>\u00104R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\b?\u00104R\u0019\u0010 \u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010@\u001a\u0004\b \u0010\u0011R\u0019\u0010!\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b!\u0010A\u001a\u0004\bB\u0010\u0014R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\"\u0010A\u001a\u0004\bC\u0010\u0014R\u0019\u0010#\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\bD\u00104R\u0019\u0010$\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\bE\u00104¨\u0006H" }, d2 = { "Lcom/reddit/domain/model/MediaMetaData;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "isValid", "", "component1", "component2", "component3", "Lcom/reddit/domain/model/MediaDescriptor;", "component4", "", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "mediaType", "media", "mediaAssetId", "sourceImageDescriptor", "previewImageDescriptor", "obfuscatedImageDescriptor", "dashUrl", "hlsUrl", "isGif", "videoNativeWidth", "videoNativeHeight", "elementType", "externalLink", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/MediaDescriptor;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/reddit/domain/model/MediaMetaData;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getMediaType", "()Ljava/lang/String;", "getMedia", "getMediaAssetId", "Lcom/reddit/domain/model/MediaDescriptor;", "getSourceImageDescriptor", "()Lcom/reddit/domain/model/MediaDescriptor;", "Ljava/util/List;", "getPreviewImageDescriptor", "()Ljava/util/List;", "getObfuscatedImageDescriptor", "getDashUrl", "getHlsUrl", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getVideoNativeWidth", "getVideoNativeHeight", "getElementType", "getExternalLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/MediaDescriptor;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class MediaMetaData implements Serializable, Parcelable
{
    public static final Parcelable$Creator<MediaMetaData> CREATOR;
    private final String dashUrl;
    private final String elementType;
    private final String externalLink;
    private final String hlsUrl;
    private final Boolean isGif;
    private final String media;
    private final String mediaAssetId;
    private final String mediaType;
    private final List<MediaDescriptor> obfuscatedImageDescriptor;
    private final List<MediaDescriptor> previewImageDescriptor;
    private final MediaDescriptor sourceImageDescriptor;
    private final Integer videoNativeHeight;
    private final Integer videoNativeWidth;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public MediaMetaData(@n(name = "e") final String mediaType, @n(name = "m") final String media, @n(name = "id") final String mediaAssetId, @n(name = "s") final MediaDescriptor sourceImageDescriptor, @n(name = "p") final List<MediaDescriptor> previewImageDescriptor, @n(name = "o") final List<MediaDescriptor> obfuscatedImageDescriptor, @n(name = "dashUrl") final String dashUrl, @n(name = "hlsUrl") final String hlsUrl, @n(name = "isGif") final Boolean isGif, @n(name = "x") final Integer videoNativeWidth, @n(name = "y") final Integer videoNativeHeight, @n(name = "t") final String elementType, @n(name = "ext") final String externalLink) {
        this.mediaType = mediaType;
        this.media = media;
        this.mediaAssetId = mediaAssetId;
        this.sourceImageDescriptor = sourceImageDescriptor;
        this.previewImageDescriptor = previewImageDescriptor;
        this.obfuscatedImageDescriptor = obfuscatedImageDescriptor;
        this.dashUrl = dashUrl;
        this.hlsUrl = hlsUrl;
        this.isGif = isGif;
        this.videoNativeWidth = videoNativeWidth;
        this.videoNativeHeight = videoNativeHeight;
        this.elementType = elementType;
        this.externalLink = externalLink;
    }
    
    public final String component1() {
        return this.mediaType;
    }
    
    public final Integer component10() {
        return this.videoNativeWidth;
    }
    
    public final Integer component11() {
        return this.videoNativeHeight;
    }
    
    public final String component12() {
        return this.elementType;
    }
    
    public final String component13() {
        return this.externalLink;
    }
    
    public final String component2() {
        return this.media;
    }
    
    public final String component3() {
        return this.mediaAssetId;
    }
    
    public final MediaDescriptor component4() {
        return this.sourceImageDescriptor;
    }
    
    public final List<MediaDescriptor> component5() {
        return this.previewImageDescriptor;
    }
    
    public final List<MediaDescriptor> component6() {
        return this.obfuscatedImageDescriptor;
    }
    
    public final String component7() {
        return this.dashUrl;
    }
    
    public final String component8() {
        return this.hlsUrl;
    }
    
    public final Boolean component9() {
        return this.isGif;
    }
    
    public final MediaMetaData copy(@n(name = "e") final String s, @n(name = "m") final String s2, @n(name = "id") final String s3, @n(name = "s") final MediaDescriptor mediaDescriptor, @n(name = "p") final List<MediaDescriptor> list, @n(name = "o") final List<MediaDescriptor> list2, @n(name = "dashUrl") final String s4, @n(name = "hlsUrl") final String s5, @n(name = "isGif") final Boolean b, @n(name = "x") final Integer n, @n(name = "y") final Integer n2, @n(name = "t") final String s6, @n(name = "ext") final String s7) {
        return new MediaMetaData(s, s2, s3, mediaDescriptor, list, list2, s4, s5, b, n, n2, s6, s7);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaMetaData)) {
            return false;
        }
        final MediaMetaData mediaMetaData = (MediaMetaData)o;
        return f.a((Object)this.mediaType, (Object)mediaMetaData.mediaType) && f.a((Object)this.media, (Object)mediaMetaData.media) && f.a((Object)this.mediaAssetId, (Object)mediaMetaData.mediaAssetId) && f.a((Object)this.sourceImageDescriptor, (Object)mediaMetaData.sourceImageDescriptor) && f.a((Object)this.previewImageDescriptor, (Object)mediaMetaData.previewImageDescriptor) && f.a((Object)this.obfuscatedImageDescriptor, (Object)mediaMetaData.obfuscatedImageDescriptor) && f.a((Object)this.dashUrl, (Object)mediaMetaData.dashUrl) && f.a((Object)this.hlsUrl, (Object)mediaMetaData.hlsUrl) && f.a((Object)this.isGif, (Object)mediaMetaData.isGif) && f.a((Object)this.videoNativeWidth, (Object)mediaMetaData.videoNativeWidth) && f.a((Object)this.videoNativeHeight, (Object)mediaMetaData.videoNativeHeight) && f.a((Object)this.elementType, (Object)mediaMetaData.elementType) && f.a((Object)this.externalLink, (Object)mediaMetaData.externalLink);
    }
    
    public final String getDashUrl() {
        return this.dashUrl;
    }
    
    public final String getElementType() {
        return this.elementType;
    }
    
    public final String getExternalLink() {
        return this.externalLink;
    }
    
    public final String getHlsUrl() {
        return this.hlsUrl;
    }
    
    public final String getMedia() {
        return this.media;
    }
    
    public final String getMediaAssetId() {
        return this.mediaAssetId;
    }
    
    public final String getMediaType() {
        return this.mediaType;
    }
    
    public final List<MediaDescriptor> getObfuscatedImageDescriptor() {
        return this.obfuscatedImageDescriptor;
    }
    
    public final List<MediaDescriptor> getPreviewImageDescriptor() {
        return this.previewImageDescriptor;
    }
    
    public final MediaDescriptor getSourceImageDescriptor() {
        return this.sourceImageDescriptor;
    }
    
    public final Integer getVideoNativeHeight() {
        return this.videoNativeHeight;
    }
    
    public final Integer getVideoNativeWidth() {
        return this.videoNativeWidth;
    }
    
    @Override
    public int hashCode() {
        final String mediaType = this.mediaType;
        int hashCode = 0;
        int hashCode2;
        if (mediaType == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = mediaType.hashCode();
        }
        final String media = this.media;
        int hashCode3;
        if (media == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = media.hashCode();
        }
        final String mediaAssetId = this.mediaAssetId;
        int hashCode4;
        if (mediaAssetId == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = mediaAssetId.hashCode();
        }
        final MediaDescriptor sourceImageDescriptor = this.sourceImageDescriptor;
        int hashCode5;
        if (sourceImageDescriptor == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = sourceImageDescriptor.hashCode();
        }
        final List<MediaDescriptor> previewImageDescriptor = this.previewImageDescriptor;
        int hashCode6;
        if (previewImageDescriptor == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = previewImageDescriptor.hashCode();
        }
        final List<MediaDescriptor> obfuscatedImageDescriptor = this.obfuscatedImageDescriptor;
        int hashCode7;
        if (obfuscatedImageDescriptor == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = obfuscatedImageDescriptor.hashCode();
        }
        final String dashUrl = this.dashUrl;
        int hashCode8;
        if (dashUrl == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = dashUrl.hashCode();
        }
        final String hlsUrl = this.hlsUrl;
        int hashCode9;
        if (hlsUrl == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = hlsUrl.hashCode();
        }
        final Boolean isGif = this.isGif;
        int hashCode10;
        if (isGif == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = isGif.hashCode();
        }
        final Integer videoNativeWidth = this.videoNativeWidth;
        int hashCode11;
        if (videoNativeWidth == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = videoNativeWidth.hashCode();
        }
        final Integer videoNativeHeight = this.videoNativeHeight;
        int hashCode12;
        if (videoNativeHeight == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = videoNativeHeight.hashCode();
        }
        final String elementType = this.elementType;
        int hashCode13;
        if (elementType == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = elementType.hashCode();
        }
        final String externalLink = this.externalLink;
        if (externalLink != null) {
            hashCode = externalLink.hashCode();
        }
        return (((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode;
    }
    
    public final Boolean isGif() {
        return this.isGif;
    }
    
    public final boolean isValid() {
        final Integer videoNativeWidth = this.videoNativeWidth;
        boolean b = true;
        if (videoNativeWidth != null && this.videoNativeHeight != null && this.isGif != null) {
            final String dashUrl = this.dashUrl;
            if (dashUrl != null && !j.X1((CharSequence)dashUrl)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("MediaMetaData(mediaType=");
        k.append(this.mediaType);
        k.append(", media=");
        k.append(this.media);
        k.append(", mediaAssetId=");
        k.append(this.mediaAssetId);
        k.append(", sourceImageDescriptor=");
        k.append(this.sourceImageDescriptor);
        k.append(", previewImageDescriptor=");
        k.append(this.previewImageDescriptor);
        k.append(", obfuscatedImageDescriptor=");
        k.append(this.obfuscatedImageDescriptor);
        k.append(", dashUrl=");
        k.append(this.dashUrl);
        k.append(", hlsUrl=");
        k.append(this.hlsUrl);
        k.append(", isGif=");
        k.append(this.isGif);
        k.append(", videoNativeWidth=");
        k.append(this.videoNativeWidth);
        k.append(", videoNativeHeight=");
        k.append(this.videoNativeHeight);
        k.append(", elementType=");
        k.append(this.elementType);
        k.append(", externalLink=");
        return b.k(k, this.externalLink, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.mediaType);
        parcel.writeString(this.media);
        parcel.writeString(this.mediaAssetId);
        final MediaDescriptor sourceImageDescriptor = this.sourceImageDescriptor;
        if (sourceImageDescriptor == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            sourceImageDescriptor.writeToParcel(parcel, n);
        }
        final List<MediaDescriptor> previewImageDescriptor = this.previewImageDescriptor;
        if (previewImageDescriptor == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator o = b.o(parcel, 1, (List)previewImageDescriptor);
            while (o.hasNext()) {
                ((MediaDescriptor)o.next()).writeToParcel(parcel, n);
            }
        }
        final List<MediaDescriptor> obfuscatedImageDescriptor = this.obfuscatedImageDescriptor;
        if (obfuscatedImageDescriptor == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator o2 = b.o(parcel, 1, (List)obfuscatedImageDescriptor);
            while (o2.hasNext()) {
                ((MediaDescriptor)o2.next()).writeToParcel(parcel, n);
            }
        }
        parcel.writeString(this.dashUrl);
        parcel.writeString(this.hlsUrl);
        final Boolean isGif = this.isGif;
        if (isGif == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.w(parcel, 1, isGif);
        }
        final Integer videoNativeWidth = this.videoNativeWidth;
        if (videoNativeWidth == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, videoNativeWidth);
        }
        final Integer videoNativeHeight = this.videoNativeHeight;
        if (videoNativeHeight == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, videoNativeHeight);
        }
        parcel.writeString(this.elementType);
        parcel.writeString(this.externalLink);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<MediaMetaData>
    {
        public final MediaMetaData createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final int int1 = parcel.readInt();
            Integer value = null;
            Object fromParcel;
            if (int1 == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = MediaDescriptor.CREATOR.createFromParcel(parcel);
            }
            final MediaDescriptor mediaDescriptor = (MediaDescriptor)fromParcel;
            final int int2 = parcel.readInt();
            boolean b = false;
            List<MediaDescriptor> list;
            if (int2 == 0) {
                list = null;
            }
            else {
                final int int3 = parcel.readInt();
                final ArrayList list2 = new ArrayList<MediaDescriptor>(int3);
                int c = 0;
                while (true) {
                    list = (List<MediaDescriptor>)list2;
                    if (c == int3) {
                        break;
                    }
                    c = a.c((Parcelable$Creator)MediaDescriptor.CREATOR, parcel, list2, c, 1);
                }
            }
            List<MediaDescriptor> list3;
            if (parcel.readInt() == 0) {
                list3 = null;
            }
            else {
                final int int4 = parcel.readInt();
                final ArrayList list4 = new ArrayList<MediaDescriptor>(int4);
                int c2 = 0;
                while (true) {
                    list3 = (List<MediaDescriptor>)list4;
                    if (c2 == int4) {
                        break;
                    }
                    c2 = a.c((Parcelable$Creator)MediaDescriptor.CREATOR, parcel, list4, c2, 1);
                }
            }
            final String string4 = parcel.readString();
            final String string5 = parcel.readString();
            Boolean value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                if (parcel.readInt() != 0) {
                    b = true;
                }
                value2 = b;
            }
            Integer value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = parcel.readInt();
            }
            if (parcel.readInt() != 0) {
                value = parcel.readInt();
            }
            return new MediaMetaData(string, string2, string3, mediaDescriptor, list, list3, string4, string5, value2, value3, value, parcel.readString(), parcel.readString());
        }
        
        public final MediaMetaData[] newArray(final int n) {
            return new MediaMetaData[n];
        }
    }
}
