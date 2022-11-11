// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import ak0.m;
import ah2.f;
import com.squareup.moshi.n;
import com.reddit.domain.image.model.ImageResolution;
import com.reddit.ads.link.models.AdEvent;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n\u0012\u0010\b\u0001\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\bE\u0010FJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\u000f\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\nH\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003J\u00ca\u0001\u0010$\u001a\u00020\u00002\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n2\u0010\b\u0003\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0001¢\u0006\u0004\b$\u0010%J\t\u0010&\u001a\u00020\u0002H\u00d6\u0001J\t\u0010'\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010,\u001a\u00020\u0004H\u00d6\u0001J\u0019\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0004H\u00d6\u0001R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\b6\u0010\u0006R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b7\u00104R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b8\u00104R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b9\u00104R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b=\u00104R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\b>\u00104R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u00105\u001a\u0004\b?\u0010\u0006R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\b@\u00104R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bA\u00104R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\bB\u00104R\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010:\u001a\u0004\bC\u0010<R\u001f\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010:\u001a\u0004\bD\u0010<¨\u0006G" }, d2 = { "Lcom/reddit/domain/model/PostGalleryItem;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "", "Lcom/reddit/domain/image/model/ImageResolution;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "Lcom/reddit/ads/link/models/AdEvent;", "component13", "component14", "caption", "height", "mediaId", "mimeType", "outboundUrl", "resolutions", "url", "userId", "width", "callToAction", "displayAddress", "displayUrl", "adEvents", "obfuscatedResolutions", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/reddit/domain/model/PostGalleryItem;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getCaption", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getHeight", "getMediaId", "getMimeType", "getOutboundUrl", "Ljava/util/List;", "getResolutions", "()Ljava/util/List;", "getUrl", "getUserId", "getWidth", "getCallToAction", "getDisplayAddress", "getDisplayUrl", "getAdEvents", "getObfuscatedResolutions", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostGalleryItem implements Parcelable
{
    public static final Parcelable$Creator<PostGalleryItem> CREATOR;
    private final List<AdEvent> adEvents;
    private final String callToAction;
    private final String caption;
    private final String displayAddress;
    private final String displayUrl;
    private final Integer height;
    private final String mediaId;
    private final String mimeType;
    private final List<ImageResolution> obfuscatedResolutions;
    private final String outboundUrl;
    private final List<ImageResolution> resolutions;
    private final String url;
    private final String userId;
    private final Integer width;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public PostGalleryItem(@n(name = "caption") final String caption, final Integer height, @n(name = "media_id") final String mediaId, final String mimeType, @n(name = "outbound_url") final String outboundUrl, final List<ImageResolution> resolutions, final String url, final String userId, final Integer width, @n(name = "call_to_action") final String callToAction, @n(name = "display_address") final String displayAddress, @n(name = "display_url") final String displayUrl, @n(name = "adEvents") final List<AdEvent> adEvents, @n(name = "obfuscated_resolutions") final List<ImageResolution> obfuscatedResolutions) {
        this.caption = caption;
        this.height = height;
        this.mediaId = mediaId;
        this.mimeType = mimeType;
        this.outboundUrl = outboundUrl;
        this.resolutions = resolutions;
        this.url = url;
        this.userId = userId;
        this.width = width;
        this.callToAction = callToAction;
        this.displayAddress = displayAddress;
        this.displayUrl = displayUrl;
        this.adEvents = adEvents;
        this.obfuscatedResolutions = obfuscatedResolutions;
    }
    
    public final String component1() {
        return this.caption;
    }
    
    public final String component10() {
        return this.callToAction;
    }
    
    public final String component11() {
        return this.displayAddress;
    }
    
    public final String component12() {
        return this.displayUrl;
    }
    
    public final List<AdEvent> component13() {
        return this.adEvents;
    }
    
    public final List<ImageResolution> component14() {
        return this.obfuscatedResolutions;
    }
    
    public final Integer component2() {
        return this.height;
    }
    
    public final String component3() {
        return this.mediaId;
    }
    
    public final String component4() {
        return this.mimeType;
    }
    
    public final String component5() {
        return this.outboundUrl;
    }
    
    public final List<ImageResolution> component6() {
        return this.resolutions;
    }
    
    public final String component7() {
        return this.url;
    }
    
    public final String component8() {
        return this.userId;
    }
    
    public final Integer component9() {
        return this.width;
    }
    
    public final PostGalleryItem copy(@n(name = "caption") final String s, final Integer n, @n(name = "media_id") final String s2, final String s3, @n(name = "outbound_url") final String s4, final List<ImageResolution> list, final String s5, final String s6, final Integer n2, @n(name = "call_to_action") final String s7, @n(name = "display_address") final String s8, @n(name = "display_url") final String s9, @n(name = "adEvents") final List<AdEvent> list2, @n(name = "obfuscated_resolutions") final List<ImageResolution> list3) {
        return new PostGalleryItem(s, n, s2, s3, s4, list, s5, s6, n2, s7, s8, s9, list2, list3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostGalleryItem)) {
            return false;
        }
        final PostGalleryItem postGalleryItem = (PostGalleryItem)o;
        return f.a((Object)this.caption, (Object)postGalleryItem.caption) && f.a((Object)this.height, (Object)postGalleryItem.height) && f.a((Object)this.mediaId, (Object)postGalleryItem.mediaId) && f.a((Object)this.mimeType, (Object)postGalleryItem.mimeType) && f.a((Object)this.outboundUrl, (Object)postGalleryItem.outboundUrl) && f.a((Object)this.resolutions, (Object)postGalleryItem.resolutions) && f.a((Object)this.url, (Object)postGalleryItem.url) && f.a((Object)this.userId, (Object)postGalleryItem.userId) && f.a((Object)this.width, (Object)postGalleryItem.width) && f.a((Object)this.callToAction, (Object)postGalleryItem.callToAction) && f.a((Object)this.displayAddress, (Object)postGalleryItem.displayAddress) && f.a((Object)this.displayUrl, (Object)postGalleryItem.displayUrl) && f.a((Object)this.adEvents, (Object)postGalleryItem.adEvents) && f.a((Object)this.obfuscatedResolutions, (Object)postGalleryItem.obfuscatedResolutions);
    }
    
    public final List<AdEvent> getAdEvents() {
        return this.adEvents;
    }
    
    public final String getCallToAction() {
        return this.callToAction;
    }
    
    public final String getCaption() {
        return this.caption;
    }
    
    public final String getDisplayAddress() {
        return this.displayAddress;
    }
    
    public final String getDisplayUrl() {
        return this.displayUrl;
    }
    
    public final Integer getHeight() {
        return this.height;
    }
    
    public final String getMediaId() {
        return this.mediaId;
    }
    
    public final String getMimeType() {
        return this.mimeType;
    }
    
    public final List<ImageResolution> getObfuscatedResolutions() {
        return this.obfuscatedResolutions;
    }
    
    public final String getOutboundUrl() {
        return this.outboundUrl;
    }
    
    public final List<ImageResolution> getResolutions() {
        return this.resolutions;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    public final String getUserId() {
        return this.userId;
    }
    
    public final Integer getWidth() {
        return this.width;
    }
    
    @Override
    public int hashCode() {
        final String caption = this.caption;
        int hashCode = 0;
        int hashCode2;
        if (caption == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = caption.hashCode();
        }
        final Integer height = this.height;
        int hashCode3;
        if (height == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = height.hashCode();
        }
        final String mediaId = this.mediaId;
        int hashCode4;
        if (mediaId == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = mediaId.hashCode();
        }
        final String mimeType = this.mimeType;
        int hashCode5;
        if (mimeType == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = mimeType.hashCode();
        }
        final String outboundUrl = this.outboundUrl;
        int hashCode6;
        if (outboundUrl == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = outboundUrl.hashCode();
        }
        final List<ImageResolution> resolutions = this.resolutions;
        int hashCode7;
        if (resolutions == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = resolutions.hashCode();
        }
        final String url = this.url;
        int hashCode8;
        if (url == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = url.hashCode();
        }
        final String userId = this.userId;
        int hashCode9;
        if (userId == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = userId.hashCode();
        }
        final Integer width = this.width;
        int hashCode10;
        if (width == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = width.hashCode();
        }
        final String callToAction = this.callToAction;
        int hashCode11;
        if (callToAction == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = callToAction.hashCode();
        }
        final String displayAddress = this.displayAddress;
        int hashCode12;
        if (displayAddress == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = displayAddress.hashCode();
        }
        final String displayUrl = this.displayUrl;
        int hashCode13;
        if (displayUrl == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = displayUrl.hashCode();
        }
        final List<AdEvent> adEvents = this.adEvents;
        int hashCode14;
        if (adEvents == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = adEvents.hashCode();
        }
        final List<ImageResolution> obfuscatedResolutions = this.obfuscatedResolutions;
        if (obfuscatedResolutions != null) {
            hashCode = obfuscatedResolutions.hashCode();
        }
        return ((((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("PostGalleryItem(caption=");
        k.append(this.caption);
        k.append(", height=");
        k.append(this.height);
        k.append(", mediaId=");
        k.append(this.mediaId);
        k.append(", mimeType=");
        k.append(this.mimeType);
        k.append(", outboundUrl=");
        k.append(this.outboundUrl);
        k.append(", resolutions=");
        k.append(this.resolutions);
        k.append(", url=");
        k.append(this.url);
        k.append(", userId=");
        k.append(this.userId);
        k.append(", width=");
        k.append(this.width);
        k.append(", callToAction=");
        k.append(this.callToAction);
        k.append(", displayAddress=");
        k.append(this.displayAddress);
        k.append(", displayUrl=");
        k.append(this.displayUrl);
        k.append(", adEvents=");
        k.append(this.adEvents);
        k.append(", obfuscatedResolutions=");
        return m.n(k, (List)this.obfuscatedResolutions, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.caption);
        final Integer height = this.height;
        if (height == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, height);
        }
        parcel.writeString(this.mediaId);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.outboundUrl);
        final List<ImageResolution> resolutions = this.resolutions;
        if (resolutions == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator o = b.o(parcel, 1, (List)resolutions);
            while (o.hasNext()) {
                parcel.writeParcelable((Parcelable)o.next(), n);
            }
        }
        parcel.writeString(this.url);
        parcel.writeString(this.userId);
        final Integer width = this.width;
        if (width == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, width);
        }
        parcel.writeString(this.callToAction);
        parcel.writeString(this.displayAddress);
        parcel.writeString(this.displayUrl);
        final List<AdEvent> adEvents = this.adEvents;
        if (adEvents == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator o2 = b.o(parcel, 1, (List)adEvents);
            while (o2.hasNext()) {
                parcel.writeParcelable((Parcelable)o2.next(), n);
            }
        }
        final List<ImageResolution> obfuscatedResolutions = this.obfuscatedResolutions;
        if (obfuscatedResolutions == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator o3 = b.o(parcel, 1, (List)obfuscatedResolutions);
            while (o3.hasNext()) {
                parcel.writeParcelable((Parcelable)o3.next(), n);
            }
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<PostGalleryItem>
    {
        public final PostGalleryItem createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            Integer value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = parcel.readInt();
            }
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            ArrayList list;
            if (parcel.readInt() == 0) {
                list = null;
            }
            else {
                final int int1 = parcel.readInt();
                list = new ArrayList(int1);
                for (int i = 0; i != int1; i = d.e((Class)PostGalleryItem.class, parcel, list, i, 1)) {}
            }
            final String string5 = parcel.readString();
            final String string6 = parcel.readString();
            Integer value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readInt();
            }
            final String string7 = parcel.readString();
            final String string8 = parcel.readString();
            final String string9 = parcel.readString();
            String s;
            List<AdEvent> list3;
            if (parcel.readInt() == 0) {
                final List<AdEvent> list2 = null;
                s = string9;
                list3 = list2;
            }
            else {
                final int int2 = parcel.readInt();
                final ArrayList list4 = new ArrayList<AdEvent>(int2);
                for (int j = 0; j != int2; j = d.e((Class)PostGalleryItem.class, parcel, list4, j, 1)) {}
                s = string9;
                list3 = (List<AdEvent>)list4;
            }
            List<AdEvent> list6;
            List<ImageResolution> list7;
            if (parcel.readInt() == 0) {
                final List<ImageResolution> list5 = null;
                list6 = list3;
                list7 = list5;
            }
            else {
                final int int3 = parcel.readInt();
                final ArrayList list8 = new ArrayList<ImageResolution>(int3);
                for (int k = 0; k != int3; k = d.e((Class)PostGalleryItem.class, parcel, list8, k, 1)) {}
                list6 = list3;
                list7 = (List<ImageResolution>)list8;
            }
            return new PostGalleryItem(string, value, string2, string3, string4, list, string5, string6, value2, string7, string8, s, list6, list7);
        }
        
        public final PostGalleryItem[] newArray(final int n) {
            return new PostGalleryItem[n];
        }
    }
}
