// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import android.os.Parcel;
import a2.b;
import com.reddit.domain.model.Variant;
import java.util.Iterator;
import com.reddit.domain.model.Variants;
import java.util.ArrayList;
import qg2.m;
import com.reddit.domain.model.Image;
import com.reddit.domain.model.Preview;
import kotlin.collections.EmptyList;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;
import java.io.Serializable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0001\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bK\u0010LB\u0011\b\u0016\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bK\u0010OJ\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0085\u0001\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010!\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001bH\u00d6\u0001R$\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010'\u001a\u0004\b1\u0010)\"\u0004\b2\u0010+R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R$\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b5\u0010)\"\u0004\b6\u0010+R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010,\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R$\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010'\u001a\u0004\b9\u0010)\"\u0004\b:\u0010+R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R$\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0013\u0010D\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010F\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0013\u0010H\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0013\u0010J\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bI\u0010C¨\u0006P" }, d2 = { "Lcom/reddit/data/model/v1/LinkPreview;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "Lcom/reddit/data/model/v1/ImageResolution;", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "Lcom/reddit/data/model/v1/RedditVideo;", "component9", "source", "sourceResolutions", "obfuscated", "obfuscatedResolutions", "gif", "gifResolutions", "mp4", "mp4Resolutions", "redditVideoPreview", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/data/model/v1/ImageResolution;", "getSource", "()Lcom/reddit/data/model/v1/ImageResolution;", "setSource", "(Lcom/reddit/data/model/v1/ImageResolution;)V", "Ljava/util/List;", "getSourceResolutions", "()Ljava/util/List;", "setSourceResolutions", "(Ljava/util/List;)V", "getObfuscated", "setObfuscated", "getObfuscatedResolutions", "setObfuscatedResolutions", "getGif", "setGif", "getGifResolutions", "setGifResolutions", "getMp4", "setMp4", "getMp4Resolutions", "setMp4Resolutions", "Lcom/reddit/data/model/v1/RedditVideo;", "getRedditVideoPreview", "()Lcom/reddit/data/model/v1/RedditVideo;", "setRedditVideoPreview", "(Lcom/reddit/data/model/v1/RedditVideo;)V", "getSourceUrl", "()Ljava/lang/String;", "sourceUrl", "getObfuscatedUrl", "obfuscatedUrl", "getGifUrl", "gifUrl", "getMp4Url", "mp4Url", "<init>", "(Lcom/reddit/data/model/v1/ImageResolution;Ljava/util/List;Lcom/reddit/data/model/v1/ImageResolution;Ljava/util/List;Lcom/reddit/data/model/v1/ImageResolution;Ljava/util/List;Lcom/reddit/data/model/v1/ImageResolution;Ljava/util/List;Lcom/reddit/data/model/v1/RedditVideo;)V", "Lcom/reddit/domain/model/Preview;", "preview", "(Lcom/reddit/domain/model/Preview;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkPreview implements Serializable, Parcelable
{
    public static final Parcelable$Creator<LinkPreview> CREATOR;
    private ImageResolution gif;
    private List<ImageResolution> gifResolutions;
    private ImageResolution mp4;
    private List<ImageResolution> mp4Resolutions;
    private ImageResolution obfuscated;
    private List<ImageResolution> obfuscatedResolutions;
    private RedditVideo redditVideoPreview;
    private ImageResolution source;
    private List<ImageResolution> sourceResolutions;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public LinkPreview() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
    
    public LinkPreview(final ImageResolution source, final List<ImageResolution> sourceResolutions, final ImageResolution obfuscated, final List<ImageResolution> obfuscatedResolutions, final ImageResolution gif, final List<ImageResolution> gifResolutions, final ImageResolution mp4, final List<ImageResolution> mp4Resolutions, final RedditVideo redditVideoPreview) {
        f.f((Object)sourceResolutions, "sourceResolutions");
        f.f((Object)obfuscatedResolutions, "obfuscatedResolutions");
        f.f((Object)gifResolutions, "gifResolutions");
        f.f((Object)mp4Resolutions, "mp4Resolutions");
        this.source = source;
        this.sourceResolutions = sourceResolutions;
        this.obfuscated = obfuscated;
        this.obfuscatedResolutions = obfuscatedResolutions;
        this.gif = gif;
        this.gifResolutions = gifResolutions;
        this.mp4 = mp4;
        this.mp4Resolutions = mp4Resolutions;
        this.redditVideoPreview = redditVideoPreview;
    }
    
    public LinkPreview(ImageResolution imageResolution, List instance, ImageResolution imageResolution2, List instance2, ImageResolution imageResolution3, List instance3, ImageResolution imageResolution4, List instance4, RedditVideo redditVideo, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        final RedditVideo redditVideo2 = null;
        if ((n & 0x1) != 0x0) {
            imageResolution = null;
        }
        if ((n & 0x2) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n & 0x4) != 0x0) {
            imageResolution2 = null;
        }
        if ((n & 0x8) != 0x0) {
            instance2 = EmptyList.INSTANCE;
        }
        if ((n & 0x10) != 0x0) {
            imageResolution3 = null;
        }
        if ((n & 0x20) != 0x0) {
            instance3 = EmptyList.INSTANCE;
        }
        if ((n & 0x40) != 0x0) {
            imageResolution4 = null;
        }
        if ((n & 0x80) != 0x0) {
            instance4 = EmptyList.INSTANCE;
        }
        if ((n & 0x100) != 0x0) {
            redditVideo = redditVideo2;
        }
        this(imageResolution, (List<ImageResolution>)instance, imageResolution2, (List<ImageResolution>)instance2, imageResolution3, (List<ImageResolution>)instance3, imageResolution4, (List<ImageResolution>)instance4, redditVideo);
    }
    
    public LinkPreview(final Preview preview) {
        f.f((Object)preview, "preview");
        this(null, null, null, null, null, null, null, null, null, 511, null);
        final Image image = preview.getImages().get(0);
        final List<com.reddit.domain.image.model.ImageResolution> component1 = image.component1();
        final com.reddit.domain.image.model.ImageResolution component2 = image.component2();
        final Variants component3 = image.component3();
        this.source = new ImageResolution(component2);
        final ArrayList sourceResolutions = new ArrayList(m.P0((Iterable)component1, 10));
        final Iterator<Object> iterator = component1.iterator();
        while (iterator.hasNext()) {
            sourceResolutions.add((Object)new ImageResolution((com.reddit.domain.image.model.ImageResolution)iterator.next()));
        }
        this.sourceResolutions = (List<ImageResolution>)sourceResolutions;
        final Variant obfuscated = component3.getObfuscated();
        if (obfuscated != null) {
            this.obfuscated = new ImageResolution(obfuscated.getSource());
            final List<com.reddit.domain.image.model.ImageResolution> resolutions = obfuscated.getResolutions();
            final ArrayList obfuscatedResolutions = new ArrayList(m.P0((Iterable)resolutions, 10));
            final Iterator<Object> iterator2 = resolutions.iterator();
            while (iterator2.hasNext()) {
                obfuscatedResolutions.add((Object)new ImageResolution((com.reddit.domain.image.model.ImageResolution)iterator2.next()));
            }
            this.obfuscatedResolutions = (List<ImageResolution>)obfuscatedResolutions;
        }
        final Variant gif = component3.getGif();
        if (gif != null) {
            this.gif = new ImageResolution(gif.getSource());
            final List<com.reddit.domain.image.model.ImageResolution> resolutions2 = gif.getResolutions();
            final ArrayList gifResolutions = new ArrayList(m.P0((Iterable)resolutions2, 10));
            final Iterator<Object> iterator3 = resolutions2.iterator();
            while (iterator3.hasNext()) {
                gifResolutions.add((Object)new ImageResolution((com.reddit.domain.image.model.ImageResolution)iterator3.next()));
            }
            this.gifResolutions = (List<ImageResolution>)gifResolutions;
        }
        final Variant mp4 = component3.getMp4();
        if (mp4 != null) {
            this.mp4 = new ImageResolution(mp4.getSource());
            final List<com.reddit.domain.image.model.ImageResolution> resolutions3 = mp4.getResolutions();
            final ArrayList mp4Resolutions = new ArrayList<ImageResolution>(m.P0((Iterable)resolutions3, 10));
            final Iterator<Object> iterator4 = resolutions3.iterator();
            while (iterator4.hasNext()) {
                mp4Resolutions.add(new ImageResolution((com.reddit.domain.image.model.ImageResolution)iterator4.next()));
            }
            this.mp4Resolutions = (List<ImageResolution>)mp4Resolutions;
        }
        final com.reddit.domain.model.RedditVideo redditVideoPreview = preview.getRedditVideoPreview();
        RedditVideo redditVideoPreview2;
        if (redditVideoPreview != null) {
            redditVideoPreview2 = new RedditVideo(redditVideoPreview);
        }
        else {
            redditVideoPreview2 = null;
        }
        this.redditVideoPreview = redditVideoPreview2;
    }
    
    public final ImageResolution component1() {
        return this.source;
    }
    
    public final List<ImageResolution> component2() {
        return this.sourceResolutions;
    }
    
    public final ImageResolution component3() {
        return this.obfuscated;
    }
    
    public final List<ImageResolution> component4() {
        return this.obfuscatedResolutions;
    }
    
    public final ImageResolution component5() {
        return this.gif;
    }
    
    public final List<ImageResolution> component6() {
        return this.gifResolutions;
    }
    
    public final ImageResolution component7() {
        return this.mp4;
    }
    
    public final List<ImageResolution> component8() {
        return this.mp4Resolutions;
    }
    
    public final RedditVideo component9() {
        return this.redditVideoPreview;
    }
    
    public final LinkPreview copy(final ImageResolution imageResolution, final List<ImageResolution> list, final ImageResolution imageResolution2, final List<ImageResolution> list2, final ImageResolution imageResolution3, final List<ImageResolution> list3, final ImageResolution imageResolution4, final List<ImageResolution> list4, final RedditVideo redditVideo) {
        f.f((Object)list, "sourceResolutions");
        f.f((Object)list2, "obfuscatedResolutions");
        f.f((Object)list3, "gifResolutions");
        f.f((Object)list4, "mp4Resolutions");
        return new LinkPreview(imageResolution, list, imageResolution2, list2, imageResolution3, list3, imageResolution4, list4, redditVideo);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkPreview)) {
            return false;
        }
        final LinkPreview linkPreview = (LinkPreview)o;
        return f.a((Object)this.source, (Object)linkPreview.source) && f.a((Object)this.sourceResolutions, (Object)linkPreview.sourceResolutions) && f.a((Object)this.obfuscated, (Object)linkPreview.obfuscated) && f.a((Object)this.obfuscatedResolutions, (Object)linkPreview.obfuscatedResolutions) && f.a((Object)this.gif, (Object)linkPreview.gif) && f.a((Object)this.gifResolutions, (Object)linkPreview.gifResolutions) && f.a((Object)this.mp4, (Object)linkPreview.mp4) && f.a((Object)this.mp4Resolutions, (Object)linkPreview.mp4Resolutions) && f.a((Object)this.redditVideoPreview, (Object)linkPreview.redditVideoPreview);
    }
    
    public final ImageResolution getGif() {
        return this.gif;
    }
    
    public final List<ImageResolution> getGifResolutions() {
        return this.gifResolutions;
    }
    
    public final String getGifUrl() {
        final ImageResolution gif = this.gif;
        String url;
        if (gif != null) {
            url = gif.getUrl();
        }
        else {
            url = null;
        }
        return url;
    }
    
    public final ImageResolution getMp4() {
        return this.mp4;
    }
    
    public final List<ImageResolution> getMp4Resolutions() {
        return this.mp4Resolutions;
    }
    
    public final String getMp4Url() {
        final ImageResolution mp4 = this.mp4;
        String url;
        if (mp4 != null) {
            url = mp4.getUrl();
        }
        else {
            url = null;
        }
        return url;
    }
    
    public final ImageResolution getObfuscated() {
        return this.obfuscated;
    }
    
    public final List<ImageResolution> getObfuscatedResolutions() {
        return this.obfuscatedResolutions;
    }
    
    public final String getObfuscatedUrl() {
        final ImageResolution obfuscated = this.obfuscated;
        String url;
        if (obfuscated != null) {
            url = obfuscated.getUrl();
        }
        else {
            url = null;
        }
        return url;
    }
    
    public final RedditVideo getRedditVideoPreview() {
        return this.redditVideoPreview;
    }
    
    public final ImageResolution getSource() {
        return this.source;
    }
    
    public final List<ImageResolution> getSourceResolutions() {
        return this.sourceResolutions;
    }
    
    public final String getSourceUrl() {
        final ImageResolution source = this.source;
        String url;
        if (source != null) {
            url = source.getUrl();
        }
        else {
            url = null;
        }
        return url;
    }
    
    @Override
    public int hashCode() {
        final ImageResolution source = this.source;
        final int n = 0;
        int hashCode;
        if (source == null) {
            hashCode = 0;
        }
        else {
            hashCode = source.hashCode();
        }
        final int a = b.a((List)this.sourceResolutions, hashCode * 31, 31);
        final ImageResolution obfuscated = this.obfuscated;
        int hashCode2;
        if (obfuscated == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = obfuscated.hashCode();
        }
        final int a2 = b.a((List)this.obfuscatedResolutions, (a + hashCode2) * 31, 31);
        final ImageResolution gif = this.gif;
        int hashCode3;
        if (gif == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = gif.hashCode();
        }
        final int a3 = b.a((List)this.gifResolutions, (a2 + hashCode3) * 31, 31);
        final ImageResolution mp4 = this.mp4;
        int hashCode4;
        if (mp4 == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = mp4.hashCode();
        }
        final int a4 = b.a((List)this.mp4Resolutions, (a3 + hashCode4) * 31, 31);
        final RedditVideo redditVideoPreview = this.redditVideoPreview;
        int hashCode5;
        if (redditVideoPreview == null) {
            hashCode5 = n;
        }
        else {
            hashCode5 = redditVideoPreview.hashCode();
        }
        return a4 + hashCode5;
    }
    
    public final void setGif(final ImageResolution gif) {
        this.gif = gif;
    }
    
    public final void setGifResolutions(final List<ImageResolution> gifResolutions) {
        f.f((Object)gifResolutions, "<set-?>");
        this.gifResolutions = gifResolutions;
    }
    
    public final void setMp4(final ImageResolution mp4) {
        this.mp4 = mp4;
    }
    
    public final void setMp4Resolutions(final List<ImageResolution> mp4Resolutions) {
        f.f((Object)mp4Resolutions, "<set-?>");
        this.mp4Resolutions = mp4Resolutions;
    }
    
    public final void setObfuscated(final ImageResolution obfuscated) {
        this.obfuscated = obfuscated;
    }
    
    public final void setObfuscatedResolutions(final List<ImageResolution> obfuscatedResolutions) {
        f.f((Object)obfuscatedResolutions, "<set-?>");
        this.obfuscatedResolutions = obfuscatedResolutions;
    }
    
    public final void setRedditVideoPreview(final RedditVideo redditVideoPreview) {
        this.redditVideoPreview = redditVideoPreview;
    }
    
    public final void setSource(final ImageResolution source) {
        this.source = source;
    }
    
    public final void setSourceResolutions(final List<ImageResolution> sourceResolutions) {
        f.f((Object)sourceResolutions, "<set-?>");
        this.sourceResolutions = sourceResolutions;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LinkPreview(source=");
        k.append(this.source);
        k.append(", sourceResolutions=");
        k.append(this.sourceResolutions);
        k.append(", obfuscated=");
        k.append(this.obfuscated);
        k.append(", obfuscatedResolutions=");
        k.append(this.obfuscatedResolutions);
        k.append(", gif=");
        k.append(this.gif);
        k.append(", gifResolutions=");
        k.append(this.gifResolutions);
        k.append(", mp4=");
        k.append(this.mp4);
        k.append(", mp4Resolutions=");
        k.append(this.mp4Resolutions);
        k.append(", redditVideoPreview=");
        k.append(this.redditVideoPreview);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        final ImageResolution source = this.source;
        if (source == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            source.writeToParcel(parcel, n);
        }
        final Iterator n2 = b.n((List)this.sourceResolutions, parcel);
        while (n2.hasNext()) {
            ((ImageResolution)n2.next()).writeToParcel(parcel, n);
        }
        final ImageResolution obfuscated = this.obfuscated;
        if (obfuscated == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            obfuscated.writeToParcel(parcel, n);
        }
        final Iterator n3 = b.n((List)this.obfuscatedResolutions, parcel);
        while (n3.hasNext()) {
            ((ImageResolution)n3.next()).writeToParcel(parcel, n);
        }
        final ImageResolution gif = this.gif;
        if (gif == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            gif.writeToParcel(parcel, n);
        }
        final Iterator n4 = b.n((List)this.gifResolutions, parcel);
        while (n4.hasNext()) {
            ((ImageResolution)n4.next()).writeToParcel(parcel, n);
        }
        final ImageResolution mp4 = this.mp4;
        if (mp4 == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            mp4.writeToParcel(parcel, n);
        }
        final Iterator n5 = b.n((List)this.mp4Resolutions, parcel);
        while (n5.hasNext()) {
            ((ImageResolution)n5.next()).writeToParcel(parcel, n);
        }
        final RedditVideo redditVideoPreview = this.redditVideoPreview;
        if (redditVideoPreview == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            redditVideoPreview.writeToParcel(parcel, n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<LinkPreview>
    {
        public final LinkPreview createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final RedditVideo redditVideo = null;
            Object fromParcel;
            if (int1 == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = ImageResolution.CREATOR.createFromParcel(parcel);
            }
            final ImageResolution imageResolution = (ImageResolution)fromParcel;
            final int int2 = parcel.readInt();
            final ArrayList list = new ArrayList(int2);
            final int n = 0;
            for (int i = 0; i != int2; i = a.c(ImageResolution.CREATOR, parcel, list, i, 1)) {}
            Object fromParcel2;
            if (parcel.readInt() == 0) {
                fromParcel2 = null;
            }
            else {
                fromParcel2 = ImageResolution.CREATOR.createFromParcel(parcel);
            }
            final ImageResolution imageResolution2 = (ImageResolution)fromParcel2;
            final int int3 = parcel.readInt();
            final ArrayList list2 = new ArrayList<ImageResolution>(int3);
            for (int j = 0; j != int3; j = a.c(ImageResolution.CREATOR, parcel, list2, j, 1)) {}
            Object fromParcel3;
            if (parcel.readInt() == 0) {
                fromParcel3 = null;
            }
            else {
                fromParcel3 = ImageResolution.CREATOR.createFromParcel(parcel);
            }
            final ImageResolution imageResolution3 = (ImageResolution)fromParcel3;
            final int int4 = parcel.readInt();
            final ArrayList list3 = new ArrayList<ImageResolution>(int4);
            for (int k = 0; k != int4; k = a.c(ImageResolution.CREATOR, parcel, list3, k, 1)) {}
            Object fromParcel4;
            if (parcel.readInt() == 0) {
                fromParcel4 = null;
            }
            else {
                fromParcel4 = ImageResolution.CREATOR.createFromParcel(parcel);
            }
            final ImageResolution imageResolution4 = (ImageResolution)fromParcel4;
            final int int5 = parcel.readInt();
            final ArrayList list4 = new ArrayList<ImageResolution>(int5);
            for (int l = n; l != int5; l = a.c(ImageResolution.CREATOR, parcel, list4, l, 1)) {}
            Object fromParcel5;
            if (parcel.readInt() == 0) {
                fromParcel5 = redditVideo;
            }
            else {
                fromParcel5 = RedditVideo.CREATOR.createFromParcel(parcel);
            }
            return new LinkPreview(imageResolution, (List<ImageResolution>)list, imageResolution2, (List<ImageResolution>)list2, imageResolution3, (List<ImageResolution>)list3, imageResolution4, (List<ImageResolution>)list4, (RedditVideo)fromParcel5);
        }
        
        public final LinkPreview[] newArray(final int n) {
            return new LinkPreview[n];
        }
    }
}
