// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!" }, d2 = { "Lcom/reddit/video/player/player/ViewModelOverride;", "", "settings", "Lcom/reddit/video/player/player/SettingsOverride;", "idle", "Lcom/reddit/video/player/player/ModelOverride;", "buffering", "paused", "playing", "ended", "(Lcom/reddit/video/player/player/SettingsOverride;Lcom/reddit/video/player/player/ModelOverride;Lcom/reddit/video/player/player/ModelOverride;Lcom/reddit/video/player/player/ModelOverride;Lcom/reddit/video/player/player/ModelOverride;Lcom/reddit/video/player/player/ModelOverride;)V", "getBuffering", "()Lcom/reddit/video/player/player/ModelOverride;", "getEnded", "getIdle", "getPaused", "getPlaying", "getSettings", "()Lcom/reddit/video/player/player/SettingsOverride;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ViewModelOverride
{
    private final ModelOverride buffering;
    private final ModelOverride ended;
    private final ModelOverride idle;
    private final ModelOverride paused;
    private final ModelOverride playing;
    private final SettingsOverride settings;
    
    public ViewModelOverride() {
        this(null, null, null, null, null, null, 63, null);
    }
    
    public ViewModelOverride(final SettingsOverride settings, final ModelOverride idle, final ModelOverride buffering, final ModelOverride paused, final ModelOverride playing, final ModelOverride ended) {
        this.settings = settings;
        this.idle = idle;
        this.buffering = buffering;
        this.paused = paused;
        this.playing = playing;
        this.ended = ended;
    }
    
    public ViewModelOverride(SettingsOverride settingsOverride, ModelOverride modelOverride, ModelOverride modelOverride2, ModelOverride modelOverride3, ModelOverride modelOverride4, ModelOverride modelOverride5, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            settingsOverride = null;
        }
        if ((n & 0x2) != 0x0) {
            modelOverride = null;
        }
        if ((n & 0x4) != 0x0) {
            modelOverride2 = null;
        }
        if ((n & 0x8) != 0x0) {
            modelOverride3 = null;
        }
        if ((n & 0x10) != 0x0) {
            modelOverride4 = null;
        }
        if ((n & 0x20) != 0x0) {
            modelOverride5 = null;
        }
        this(settingsOverride, modelOverride, modelOverride2, modelOverride3, modelOverride4, modelOverride5);
    }
    
    public static ViewModelOverride copy$default(final ViewModelOverride viewModelOverride, SettingsOverride settings, ModelOverride idle, ModelOverride buffering, ModelOverride paused, ModelOverride playing, ModelOverride ended, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            settings = viewModelOverride.settings;
        }
        if ((n & 0x2) != 0x0) {
            idle = viewModelOverride.idle;
        }
        if ((n & 0x4) != 0x0) {
            buffering = viewModelOverride.buffering;
        }
        if ((n & 0x8) != 0x0) {
            paused = viewModelOverride.paused;
        }
        if ((n & 0x10) != 0x0) {
            playing = viewModelOverride.playing;
        }
        if ((n & 0x20) != 0x0) {
            ended = viewModelOverride.ended;
        }
        return viewModelOverride.copy(settings, idle, buffering, paused, playing, ended);
    }
    
    public final SettingsOverride component1() {
        return this.settings;
    }
    
    public final ModelOverride component2() {
        return this.idle;
    }
    
    public final ModelOverride component3() {
        return this.buffering;
    }
    
    public final ModelOverride component4() {
        return this.paused;
    }
    
    public final ModelOverride component5() {
        return this.playing;
    }
    
    public final ModelOverride component6() {
        return this.ended;
    }
    
    public final ViewModelOverride copy(final SettingsOverride settingsOverride, final ModelOverride modelOverride, final ModelOverride modelOverride2, final ModelOverride modelOverride3, final ModelOverride modelOverride4, final ModelOverride modelOverride5) {
        return new ViewModelOverride(settingsOverride, modelOverride, modelOverride2, modelOverride3, modelOverride4, modelOverride5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ViewModelOverride)) {
            return false;
        }
        final ViewModelOverride viewModelOverride = (ViewModelOverride)o;
        return e.a((Object)this.settings, (Object)viewModelOverride.settings) && e.a((Object)this.idle, (Object)viewModelOverride.idle) && e.a((Object)this.buffering, (Object)viewModelOverride.buffering) && e.a((Object)this.paused, (Object)viewModelOverride.paused) && e.a((Object)this.playing, (Object)viewModelOverride.playing) && e.a((Object)this.ended, (Object)viewModelOverride.ended);
    }
    
    public final ModelOverride getBuffering() {
        return this.buffering;
    }
    
    public final ModelOverride getEnded() {
        return this.ended;
    }
    
    public final ModelOverride getIdle() {
        return this.idle;
    }
    
    public final ModelOverride getPaused() {
        return this.paused;
    }
    
    public final ModelOverride getPlaying() {
        return this.playing;
    }
    
    public final SettingsOverride getSettings() {
        return this.settings;
    }
    
    @Override
    public int hashCode() {
        final SettingsOverride settings = this.settings;
        int hashCode = 0;
        int hashCode2;
        if (settings == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = settings.hashCode();
        }
        final ModelOverride idle = this.idle;
        int hashCode3;
        if (idle == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = idle.hashCode();
        }
        final ModelOverride buffering = this.buffering;
        int hashCode4;
        if (buffering == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = buffering.hashCode();
        }
        final ModelOverride paused = this.paused;
        int hashCode5;
        if (paused == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = paused.hashCode();
        }
        final ModelOverride playing = this.playing;
        int hashCode6;
        if (playing == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = playing.hashCode();
        }
        final ModelOverride ended = this.ended;
        if (ended != null) {
            hashCode = ended.hashCode();
        }
        return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ViewModelOverride(settings=");
        t.append(this.settings);
        t.append(", idle=");
        t.append(this.idle);
        t.append(", buffering=");
        t.append(this.buffering);
        t.append(", paused=");
        t.append(this.paused);
        t.append(", playing=");
        t.append(this.playing);
        t.append(", ended=");
        t.append(this.ended);
        t.append(')');
        return t.toString();
    }
}
