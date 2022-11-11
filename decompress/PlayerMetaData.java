// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import androidx.viewpager.widget.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/model/streaming/PlayerMetaData;", "", "volume", "", "duration", "", "position", "(IJJ)V", "getDuration", "()J", "getPosition", "getVolume", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class PlayerMetaData
{
    private final long duration;
    private final long position;
    private final int volume;
    
    public PlayerMetaData() {
        this(0, 0L, 0L, 7, null);
    }
    
    public PlayerMetaData(final int volume, final long duration, final long position) {
        this.volume = volume;
        this.duration = duration;
        this.position = position;
    }
    
    public final int component1() {
        return this.volume;
    }
    
    public final long component2() {
        return this.duration;
    }
    
    public final long component3() {
        return this.position;
    }
    
    public final PlayerMetaData copy(final int n, final long n2, final long n3) {
        return new PlayerMetaData(n, n2, n3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlayerMetaData)) {
            return false;
        }
        final PlayerMetaData playerMetaData = (PlayerMetaData)o;
        return this.volume == playerMetaData.volume && this.duration == playerMetaData.duration && this.position == playerMetaData.position;
    }
    
    public final long getDuration() {
        return this.duration;
    }
    
    public final long getPosition() {
        return this.position;
    }
    
    public final int getVolume() {
        return this.volume;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(this.position) + b.c(this.duration, Integer.hashCode(this.volume) * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("PlayerMetaData(volume=");
        k.append(this.volume);
        k.append(", duration=");
        k.append(this.duration);
        k.append(", position=");
        return c.k(k, this.position, ')');
    }
}
