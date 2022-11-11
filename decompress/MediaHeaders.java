// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player;

import java.util.Arrays;
import java.util.Locale;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.Pair;
import java.util.LinkedHashMap;
import ig2.m;
import java.util.Map;
import com.reddit.common.experiments.model.video.VideoDeliveryHttpVersion;
import javax.inject.Inject;
import sg2.e;
import d41.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import va0.f0;
import com.google.android.exoplayer2.mediacodec.d;
import rg2.l;
import hg2.f;
import com.reddit.video.player.internal.AppVersionProvider;
import rg2.a;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0002!\"BE\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0004\b\u001c\u0010\u001dB)\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010 J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006#" }, d2 = { "Lcom/reddit/video/player/MediaHeaders;", "", "Lcom/reddit/video/player/MediaHeaders$Header;", "httpDeliveryVariant", "qos", "", "", "headerMap", "Lcom/reddit/video/player/internal/AppVersionProvider;", "appVersionInfoProvider", "Lcom/reddit/video/player/internal/AppVersionProvider;", "userAgent$delegate", "Lhg2/f;", "getUserAgent", "()Lcom/reddit/video/player/MediaHeaders$Header;", "userAgent", "availableCodecs$delegate", "getAvailableCodecs", "availableCodecs", "Lva0/f0;", "videoFeatures", "Ll41/d;", "networkBandwidthProvider", "Lkotlin/Function1;", "Lcom/google/android/exoplayer2/mediacodec/d;", "mediaCodecInfoProvider", "Lkotlin/Function0;", "androidReleaseProvider", "<init>", "(Lcom/reddit/video/player/internal/AppVersionProvider;Lva0/f0;Ll41/d;Lrg2/l;Lrg2/a;)V", "Ld41/b;", "networkFeatures", "(Lcom/reddit/video/player/internal/AppVersionProvider;Ld41/b;Lva0/f0;Ll41/d;)V", "Companion", "Header", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class MediaHeaders
{
    private static final String AVAILABLE_CODECS_FMT = "available-codecs=%s";
    public static final MediaHeaders.MediaHeaders$Companion Companion;
    private static final String DOWN_RATE_MBPS_VALUE = "down-rate-mbps=%.3f";
    private static final String USER_AGENT_FMT = "RedditVideo/Version %s/Build %d/Android %s";
    private static final String USER_AGENT_KEY = "User-Agent";
    private static final String X_REDDIT_HTTP_VIDEO_VARIANT = "X-Reddit-Http-Video-Variant";
    private static final String X_REDDIT_MEDIA_CODECS_KEY = "X-Reddit-Media-Codecs";
    private static final String X_REDDIT_QOS_KEY = "X-Reddit-QoS";
    private final a<String> androidReleaseProvider;
    private final AppVersionProvider appVersionInfoProvider;
    private final f availableCodecs$delegate;
    private final l<String, d> mediaCodecInfoProvider;
    private final l41.d networkBandwidthProvider;
    private final f userAgent$delegate;
    private final f0 videoFeatures;
    
    static {
        Companion = new MediaHeaders.MediaHeaders$Companion((DefaultConstructorMarker)null);
    }
    
    @Inject
    public MediaHeaders(final AppVersionProvider appVersionProvider, final b b, final f0 f0, final l41.d d) {
        e.f((Object)appVersionProvider, "appVersionInfoProvider");
        e.f((Object)b, "networkFeatures");
        e.f((Object)f0, "videoFeatures");
        e.f((Object)d, "networkBandwidthProvider");
        this(appVersionProvider, f0, d, (l<? super String, d>)MediaHeaders$1.INSTANCE, (a<String>)MediaHeaders$2.INSTANCE);
    }
    
    public MediaHeaders(final AppVersionProvider appVersionInfoProvider, final f0 videoFeatures, final l41.d networkBandwidthProvider, final l<? super String, d> mediaCodecInfoProvider, final a<String> androidReleaseProvider) {
        e.f((Object)appVersionInfoProvider, "appVersionInfoProvider");
        e.f((Object)videoFeatures, "videoFeatures");
        e.f((Object)networkBandwidthProvider, "networkBandwidthProvider");
        e.f((Object)mediaCodecInfoProvider, "mediaCodecInfoProvider");
        e.f((Object)androidReleaseProvider, "androidReleaseProvider");
        this.appVersionInfoProvider = appVersionInfoProvider;
        this.videoFeatures = videoFeatures;
        this.networkBandwidthProvider = networkBandwidthProvider;
        this.mediaCodecInfoProvider = (l<String, d>)mediaCodecInfoProvider;
        this.androidReleaseProvider = androidReleaseProvider;
        this.availableCodecs$delegate = kotlin.a.b((a)new MediaHeaders$availableCodecs$2(this));
        this.userAgent$delegate = kotlin.a.b((a)new MediaHeaders$userAgent$2(this));
    }
    
    private final Header getUserAgent() {
        return this.userAgent$delegate.getValue();
    }
    
    private final Header httpDeliveryVariant() {
        final VideoDeliveryHttpVersion m8 = this.videoFeatures.m8();
        Header header = null;
        if (m8 != null) {
            final int n = WhenMappings.$EnumSwitchMapping$0[((Enum)m8).ordinal()];
            if (n != 1 && n != 2) {
                header = header;
            }
            else {
                header = new Header("X-Reddit-Http-Video-Variant", m8.getVariant());
            }
        }
        return header;
    }
    
    public final Header getAvailableCodecs() {
        return this.availableCodecs$delegate.getValue();
    }
    
    public final Map<String, String> headerMap() {
        final ArrayList v0 = kotlin.collections.b.V0(new Header[] { this.getUserAgent(), this.qos(), this.getAvailableCodecs(), this.httpDeliveryVariant() });
        int o0;
        if ((o0 = bg.d.o0(m.c3((Iterable)v0, 10))) < 16) {
            o0 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(o0);
        for (final Header header : v0) {
            final Pair pair = new Pair((Object)header.getKey(), (Object)header.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return (Map<String, String>)linkedHashMap;
    }
    
    public final Header qos() {
        final String format = String.format(Locale.US, "down-rate-mbps=%.3f", Arrays.copyOf(new Object[] { ((l41.a)this.networkBandwidthProvider.b().getValue()).a / 1000000.0 }, 1));
        e.e((Object)format, "format(locale, this, *args)");
        return new Header("X-Reddit-QoS", format);
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/video/player/MediaHeaders$Header;", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Header
    {
        private final String key;
        private final String value;
        
        public Header(final String key, final String value) {
            e.f((Object)key, "key");
            e.f((Object)value, "value");
            this.key = key;
            this.value = value;
        }
        
        public final String component1() {
            return this.key;
        }
        
        public final String component2() {
            return this.value;
        }
        
        public final Header copy(final String s, final String s2) {
            e.f((Object)s, "key");
            e.f((Object)s2, "value");
            return new Header(s, s2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Header)) {
                return false;
            }
            final Header header = (Header)o;
            return e.a((Object)this.key, (Object)header.key) && e.a((Object)this.value, (Object)header.value);
        }
        
        public final String getKey() {
            return this.key;
        }
        
        public final String getValue() {
            return this.value;
        }
        
        @Override
        public int hashCode() {
            return this.value.hashCode() + this.key.hashCode() * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("Header(key=");
            r.append(this.key);
            r.append(", value=");
            return al0.f0.n(r, this.value, ')');
        }
    }
}
