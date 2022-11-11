// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0017" }, d2 = { "Lcom/reddit/video/player/player/SettingsOverride;", "", "autoplay", "", "loop", "disabled", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAutoplay", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisabled", "getLoop", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/reddit/video/player/player/SettingsOverride;", "equals", "other", "hashCode", "", "toString", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SettingsOverride
{
    private final Boolean autoplay;
    private final Boolean disabled;
    private final Boolean loop;
    
    public SettingsOverride() {
        this(null, null, null, 7, null);
    }
    
    public SettingsOverride(final Boolean autoplay, final Boolean loop, final Boolean disabled) {
        this.autoplay = autoplay;
        this.loop = loop;
        this.disabled = disabled;
    }
    
    public final Boolean component1() {
        return this.autoplay;
    }
    
    public final Boolean component2() {
        return this.loop;
    }
    
    public final Boolean component3() {
        return this.disabled;
    }
    
    public final SettingsOverride copy(final Boolean b, final Boolean b2, final Boolean b3) {
        return new SettingsOverride(b, b2, b3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SettingsOverride)) {
            return false;
        }
        final SettingsOverride settingsOverride = (SettingsOverride)o;
        return e.a((Object)this.autoplay, (Object)settingsOverride.autoplay) && e.a((Object)this.loop, (Object)settingsOverride.loop) && e.a((Object)this.disabled, (Object)settingsOverride.disabled);
    }
    
    public final Boolean getAutoplay() {
        return this.autoplay;
    }
    
    public final Boolean getDisabled() {
        return this.disabled;
    }
    
    public final Boolean getLoop() {
        return this.loop;
    }
    
    @Override
    public int hashCode() {
        final Boolean autoplay = this.autoplay;
        int hashCode = 0;
        int hashCode2;
        if (autoplay == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = autoplay.hashCode();
        }
        final Boolean loop = this.loop;
        int hashCode3;
        if (loop == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = loop.hashCode();
        }
        final Boolean disabled = this.disabled;
        if (disabled != null) {
            hashCode = disabled.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SettingsOverride(autoplay=");
        r.append(this.autoplay);
        r.append(", loop=");
        r.append(this.loop);
        r.append(", disabled=");
        return android.support.v4.media.a.j(r, this.disabled, ')');
    }
}
