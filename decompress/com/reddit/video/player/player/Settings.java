// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/reddit/video/player/player/Settings;", "", "autoplay", "", "loop", "disabled", "(ZZZ)V", "getAutoplay", "()Z", "getDisabled", "getLoop", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Settings
{
    private final boolean autoplay;
    private final boolean disabled;
    private final boolean loop;
    
    public Settings() {
        this(false, false, false, 7, null);
    }
    
    public Settings(final boolean autoplay, final boolean loop, final boolean disabled) {
        this.autoplay = autoplay;
        this.loop = loop;
        this.disabled = disabled;
    }
    
    public Settings(boolean b, boolean b2, boolean b3, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        if ((n & 0x2) != 0x0) {
            b2 = false;
        }
        if ((n & 0x4) != 0x0) {
            b3 = false;
        }
        this(b, b2, b3);
    }
    
    public static Settings copy$default(final Settings settings, boolean autoplay, boolean loop, boolean disabled, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            autoplay = settings.autoplay;
        }
        if ((n & 0x2) != 0x0) {
            loop = settings.loop;
        }
        if ((n & 0x4) != 0x0) {
            disabled = settings.disabled;
        }
        return settings.copy(autoplay, loop, disabled);
    }
    
    public final boolean component1() {
        return this.autoplay;
    }
    
    public final boolean component2() {
        return this.loop;
    }
    
    public final boolean component3() {
        return this.disabled;
    }
    
    public final Settings copy(final boolean b, final boolean b2, final boolean b3) {
        return new Settings(b, b2, b3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Settings)) {
            return false;
        }
        final Settings settings = (Settings)o;
        return this.autoplay == settings.autoplay && this.loop == settings.loop && this.disabled == settings.disabled;
    }
    
    public final boolean getAutoplay() {
        return this.autoplay;
    }
    
    public final boolean getDisabled() {
        return this.disabled;
    }
    
    public final boolean getLoop() {
        return this.loop;
    }
    
    @Override
    public int hashCode() {
        final int autoplay = this.autoplay ? 1 : 0;
        int n = 1;
        int n2 = autoplay;
        if (autoplay != 0) {
            n2 = 1;
        }
        int loop;
        if ((loop = (this.loop ? 1 : 0)) != 0) {
            loop = 1;
        }
        final int disabled = this.disabled ? 1 : 0;
        if (disabled == 0) {
            n = disabled;
        }
        return (n2 * 31 + loop) * 31 + n;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Settings(autoplay=");
        t.append(this.autoplay);
        t.append(", loop=");
        t.append(this.loop);
        t.append(", disabled=");
        return d.n(t, this.disabled, ')');
    }
}
