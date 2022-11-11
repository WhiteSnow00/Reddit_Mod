// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player.analytics;

import al0.f0;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e" }, d2 = { "Lcom/reddit/video/player/player/analytics/FileDownloadPayload;", "", "bitrate", "", "domainName", "", "bytesLoaded", "", "format", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBytesLoaded", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDomainName", "()Ljava/lang/String;", "getFormat", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/reddit/video/player/player/analytics/FileDownloadPayload;", "equals", "", "other", "hashCode", "toString", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class FileDownloadPayload
{
    private final Integer bitrate;
    private final Long bytesLoaded;
    private final String domainName;
    private final String format;
    
    public FileDownloadPayload() {
        this(null, null, null, null, 15, null);
    }
    
    public FileDownloadPayload(final Integer bitrate, final String domainName, final Long bytesLoaded, final String format) {
        this.bitrate = bitrate;
        this.domainName = domainName;
        this.bytesLoaded = bytesLoaded;
        this.format = format;
    }
    
    public final Integer component1() {
        return this.bitrate;
    }
    
    public final String component2() {
        return this.domainName;
    }
    
    public final Long component3() {
        return this.bytesLoaded;
    }
    
    public final String component4() {
        return this.format;
    }
    
    public final FileDownloadPayload copy(final Integer n, final String s, final Long n2, final String s2) {
        return new FileDownloadPayload(n, s, n2, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileDownloadPayload)) {
            return false;
        }
        final FileDownloadPayload fileDownloadPayload = (FileDownloadPayload)o;
        return e.a((Object)this.bitrate, (Object)fileDownloadPayload.bitrate) && e.a((Object)this.domainName, (Object)fileDownloadPayload.domainName) && e.a((Object)this.bytesLoaded, (Object)fileDownloadPayload.bytesLoaded) && e.a((Object)this.format, (Object)fileDownloadPayload.format);
    }
    
    public final Integer getBitrate() {
        return this.bitrate;
    }
    
    public final Long getBytesLoaded() {
        return this.bytesLoaded;
    }
    
    public final String getDomainName() {
        return this.domainName;
    }
    
    public final String getFormat() {
        return this.format;
    }
    
    @Override
    public int hashCode() {
        final Integer bitrate = this.bitrate;
        int hashCode = 0;
        int hashCode2;
        if (bitrate == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = bitrate.hashCode();
        }
        final String domainName = this.domainName;
        int hashCode3;
        if (domainName == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = domainName.hashCode();
        }
        final Long bytesLoaded = this.bytesLoaded;
        int hashCode4;
        if (bytesLoaded == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = bytesLoaded.hashCode();
        }
        final String format = this.format;
        if (format != null) {
            hashCode = format.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("FileDownloadPayload(bitrate=");
        r.append(this.bitrate);
        r.append(", domainName=");
        r.append(this.domainName);
        r.append(", bytesLoaded=");
        r.append(this.bytesLoaded);
        r.append(", format=");
        return f0.n(r, this.format, ')');
    }
}
