// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J±\u0001\u0010/\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u000206H\u00d6\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00067" }, d2 = { "Lcom/reddit/data/model/AnimatedMedia;", "", "mp4Source", "Lcom/reddit/data/model/MediaSource;", "mp4Small", "mp4Medium", "mp4Large", "mp4Xlarge", "mp4Xxlarge", "mp4Xxxlarge", "gifSource", "gifSmall", "gifMedium", "gifLarge", "gifXlarge", "gifXxlarge", "gifXxxlarge", "(Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;)V", "getGifLarge", "()Lcom/reddit/data/model/MediaSource;", "getGifMedium", "getGifSmall", "getGifSource", "getGifXlarge", "getGifXxlarge", "getGifXxxlarge", "getMp4Large", "getMp4Medium", "getMp4Small", "getMp4Source", "getMp4Xlarge", "getMp4Xxlarge", "getMp4Xxxlarge", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AnimatedMedia
{
    private final MediaSource gifLarge;
    private final MediaSource gifMedium;
    private final MediaSource gifSmall;
    private final MediaSource gifSource;
    private final MediaSource gifXlarge;
    private final MediaSource gifXxlarge;
    private final MediaSource gifXxxlarge;
    private final MediaSource mp4Large;
    private final MediaSource mp4Medium;
    private final MediaSource mp4Small;
    private final MediaSource mp4Source;
    private final MediaSource mp4Xlarge;
    private final MediaSource mp4Xxlarge;
    private final MediaSource mp4Xxxlarge;
    
    public AnimatedMedia(@n(name = "mp4_source") final MediaSource mp4Source, @n(name = "mp4_small") final MediaSource mp4Small, @n(name = "mp4_medium") final MediaSource mp4Medium, @n(name = "mp4_large") final MediaSource mp4Large, @n(name = "mp4_xlarge") final MediaSource mp4Xlarge, @n(name = "mp4_xxlarge") final MediaSource mp4Xxlarge, @n(name = "mp4_xxxlarge") final MediaSource mp4Xxxlarge, @n(name = "gif_source") final MediaSource gifSource, @n(name = "gif_small") final MediaSource gifSmall, @n(name = "gif_medium") final MediaSource gifMedium, @n(name = "gif_large") final MediaSource gifLarge, @n(name = "gif_xlarge") final MediaSource gifXlarge, @n(name = "gif_xxlarge") final MediaSource gifXxlarge, @n(name = "gif_xxxlarge") final MediaSource gifXxxlarge) {
        this.mp4Source = mp4Source;
        this.mp4Small = mp4Small;
        this.mp4Medium = mp4Medium;
        this.mp4Large = mp4Large;
        this.mp4Xlarge = mp4Xlarge;
        this.mp4Xxlarge = mp4Xxlarge;
        this.mp4Xxxlarge = mp4Xxxlarge;
        this.gifSource = gifSource;
        this.gifSmall = gifSmall;
        this.gifMedium = gifMedium;
        this.gifLarge = gifLarge;
        this.gifXlarge = gifXlarge;
        this.gifXxlarge = gifXxlarge;
        this.gifXxxlarge = gifXxxlarge;
    }
    
    public final MediaSource component1() {
        return this.mp4Source;
    }
    
    public final MediaSource component10() {
        return this.gifMedium;
    }
    
    public final MediaSource component11() {
        return this.gifLarge;
    }
    
    public final MediaSource component12() {
        return this.gifXlarge;
    }
    
    public final MediaSource component13() {
        return this.gifXxlarge;
    }
    
    public final MediaSource component14() {
        return this.gifXxxlarge;
    }
    
    public final MediaSource component2() {
        return this.mp4Small;
    }
    
    public final MediaSource component3() {
        return this.mp4Medium;
    }
    
    public final MediaSource component4() {
        return this.mp4Large;
    }
    
    public final MediaSource component5() {
        return this.mp4Xlarge;
    }
    
    public final MediaSource component6() {
        return this.mp4Xxlarge;
    }
    
    public final MediaSource component7() {
        return this.mp4Xxxlarge;
    }
    
    public final MediaSource component8() {
        return this.gifSource;
    }
    
    public final MediaSource component9() {
        return this.gifSmall;
    }
    
    public final AnimatedMedia copy(@n(name = "mp4_source") final MediaSource mediaSource, @n(name = "mp4_small") final MediaSource mediaSource2, @n(name = "mp4_medium") final MediaSource mediaSource3, @n(name = "mp4_large") final MediaSource mediaSource4, @n(name = "mp4_xlarge") final MediaSource mediaSource5, @n(name = "mp4_xxlarge") final MediaSource mediaSource6, @n(name = "mp4_xxxlarge") final MediaSource mediaSource7, @n(name = "gif_source") final MediaSource mediaSource8, @n(name = "gif_small") final MediaSource mediaSource9, @n(name = "gif_medium") final MediaSource mediaSource10, @n(name = "gif_large") final MediaSource mediaSource11, @n(name = "gif_xlarge") final MediaSource mediaSource12, @n(name = "gif_xxlarge") final MediaSource mediaSource13, @n(name = "gif_xxxlarge") final MediaSource mediaSource14) {
        return new AnimatedMedia(mediaSource, mediaSource2, mediaSource3, mediaSource4, mediaSource5, mediaSource6, mediaSource7, mediaSource8, mediaSource9, mediaSource10, mediaSource11, mediaSource12, mediaSource13, mediaSource14);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnimatedMedia)) {
            return false;
        }
        final AnimatedMedia animatedMedia = (AnimatedMedia)o;
        return f.a((Object)this.mp4Source, (Object)animatedMedia.mp4Source) && f.a((Object)this.mp4Small, (Object)animatedMedia.mp4Small) && f.a((Object)this.mp4Medium, (Object)animatedMedia.mp4Medium) && f.a((Object)this.mp4Large, (Object)animatedMedia.mp4Large) && f.a((Object)this.mp4Xlarge, (Object)animatedMedia.mp4Xlarge) && f.a((Object)this.mp4Xxlarge, (Object)animatedMedia.mp4Xxlarge) && f.a((Object)this.mp4Xxxlarge, (Object)animatedMedia.mp4Xxxlarge) && f.a((Object)this.gifSource, (Object)animatedMedia.gifSource) && f.a((Object)this.gifSmall, (Object)animatedMedia.gifSmall) && f.a((Object)this.gifMedium, (Object)animatedMedia.gifMedium) && f.a((Object)this.gifLarge, (Object)animatedMedia.gifLarge) && f.a((Object)this.gifXlarge, (Object)animatedMedia.gifXlarge) && f.a((Object)this.gifXxlarge, (Object)animatedMedia.gifXxlarge) && f.a((Object)this.gifXxxlarge, (Object)animatedMedia.gifXxxlarge);
    }
    
    public final MediaSource getGifLarge() {
        return this.gifLarge;
    }
    
    public final MediaSource getGifMedium() {
        return this.gifMedium;
    }
    
    public final MediaSource getGifSmall() {
        return this.gifSmall;
    }
    
    public final MediaSource getGifSource() {
        return this.gifSource;
    }
    
    public final MediaSource getGifXlarge() {
        return this.gifXlarge;
    }
    
    public final MediaSource getGifXxlarge() {
        return this.gifXxlarge;
    }
    
    public final MediaSource getGifXxxlarge() {
        return this.gifXxxlarge;
    }
    
    public final MediaSource getMp4Large() {
        return this.mp4Large;
    }
    
    public final MediaSource getMp4Medium() {
        return this.mp4Medium;
    }
    
    public final MediaSource getMp4Small() {
        return this.mp4Small;
    }
    
    public final MediaSource getMp4Source() {
        return this.mp4Source;
    }
    
    public final MediaSource getMp4Xlarge() {
        return this.mp4Xlarge;
    }
    
    public final MediaSource getMp4Xxlarge() {
        return this.mp4Xxlarge;
    }
    
    public final MediaSource getMp4Xxxlarge() {
        return this.mp4Xxxlarge;
    }
    
    @Override
    public int hashCode() {
        final MediaSource mp4Source = this.mp4Source;
        int hashCode = 0;
        int hashCode2;
        if (mp4Source == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = mp4Source.hashCode();
        }
        final MediaSource mp4Small = this.mp4Small;
        int hashCode3;
        if (mp4Small == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = mp4Small.hashCode();
        }
        final MediaSource mp4Medium = this.mp4Medium;
        int hashCode4;
        if (mp4Medium == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = mp4Medium.hashCode();
        }
        final MediaSource mp4Large = this.mp4Large;
        int hashCode5;
        if (mp4Large == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = mp4Large.hashCode();
        }
        final MediaSource mp4Xlarge = this.mp4Xlarge;
        int hashCode6;
        if (mp4Xlarge == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = mp4Xlarge.hashCode();
        }
        final MediaSource mp4Xxlarge = this.mp4Xxlarge;
        int hashCode7;
        if (mp4Xxlarge == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = mp4Xxlarge.hashCode();
        }
        final MediaSource mp4Xxxlarge = this.mp4Xxxlarge;
        int hashCode8;
        if (mp4Xxxlarge == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = mp4Xxxlarge.hashCode();
        }
        final MediaSource gifSource = this.gifSource;
        int hashCode9;
        if (gifSource == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = gifSource.hashCode();
        }
        final MediaSource gifSmall = this.gifSmall;
        int hashCode10;
        if (gifSmall == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = gifSmall.hashCode();
        }
        final MediaSource gifMedium = this.gifMedium;
        int hashCode11;
        if (gifMedium == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = gifMedium.hashCode();
        }
        final MediaSource gifLarge = this.gifLarge;
        int hashCode12;
        if (gifLarge == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = gifLarge.hashCode();
        }
        final MediaSource gifXlarge = this.gifXlarge;
        int hashCode13;
        if (gifXlarge == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = gifXlarge.hashCode();
        }
        final MediaSource gifXxlarge = this.gifXxlarge;
        int hashCode14;
        if (gifXxlarge == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = gifXxlarge.hashCode();
        }
        final MediaSource gifXxxlarge = this.gifXxxlarge;
        if (gifXxxlarge != null) {
            hashCode = gifXxxlarge.hashCode();
        }
        return ((((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AnimatedMedia(mp4Source=");
        k.append(this.mp4Source);
        k.append(", mp4Small=");
        k.append(this.mp4Small);
        k.append(", mp4Medium=");
        k.append(this.mp4Medium);
        k.append(", mp4Large=");
        k.append(this.mp4Large);
        k.append(", mp4Xlarge=");
        k.append(this.mp4Xlarge);
        k.append(", mp4Xxlarge=");
        k.append(this.mp4Xxlarge);
        k.append(", mp4Xxxlarge=");
        k.append(this.mp4Xxxlarge);
        k.append(", gifSource=");
        k.append(this.gifSource);
        k.append(", gifSmall=");
        k.append(this.gifSmall);
        k.append(", gifMedium=");
        k.append(this.gifMedium);
        k.append(", gifLarge=");
        k.append(this.gifLarge);
        k.append(", gifXlarge=");
        k.append(this.gifXlarge);
        k.append(", gifXxlarge=");
        k.append(this.gifXxlarge);
        k.append(", gifXxxlarge=");
        k.append(this.gifXxxlarge);
        k.append(')');
        return k.toString();
    }
}
