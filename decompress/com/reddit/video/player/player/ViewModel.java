// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006-" }, d2 = { "Lcom/reddit/video/player/player/ViewModel;", "", "settings", "Lcom/reddit/video/player/player/Settings;", "idle", "Lcom/reddit/video/player/player/Model;", "buffering", "paused", "playing", "ended", "transitional", "(Lcom/reddit/video/player/player/Settings;Lcom/reddit/video/player/player/Model;Lcom/reddit/video/player/player/Model;Lcom/reddit/video/player/player/Model;Lcom/reddit/video/player/player/Model;Lcom/reddit/video/player/player/Model;Lcom/reddit/video/player/player/Model;)V", "getBuffering", "()Lcom/reddit/video/player/player/Model;", "setBuffering", "(Lcom/reddit/video/player/player/Model;)V", "getEnded", "setEnded", "getIdle", "setIdle", "getPaused", "setPaused", "getPlaying", "setPlaying", "getSettings", "()Lcom/reddit/video/player/player/Settings;", "setSettings", "(Lcom/reddit/video/player/player/Settings;)V", "getTransitional", "setTransitional", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ViewModel
{
    private Model buffering;
    private Model ended;
    private Model idle;
    private Model paused;
    private Model playing;
    private Settings settings;
    private Model transitional;
    
    public ViewModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }
    
    public ViewModel(final Settings settings, final Model idle, final Model buffering, final Model paused, final Model playing, final Model ended, final Model transitional) {
        e.f((Object)settings, "settings");
        e.f((Object)idle, "idle");
        e.f((Object)buffering, "buffering");
        e.f((Object)paused, "paused");
        e.f((Object)playing, "playing");
        e.f((Object)ended, "ended");
        e.f((Object)transitional, "transitional");
        this.settings = settings;
        this.idle = idle;
        this.buffering = buffering;
        this.paused = paused;
        this.playing = playing;
        this.ended = ended;
        this.transitional = transitional;
    }
    
    public ViewModel(Settings settings, Model model, Model model2, Model model3, Model model4, Model model5, Model model6, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            settings = new Settings(false, false, false, 7, null);
        }
        if ((n & 0x2) != 0x0) {
            model = new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null);
        }
        if ((n & 0x4) != 0x0) {
            model2 = new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null);
        }
        if ((n & 0x8) != 0x0) {
            model3 = new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null);
        }
        if ((n & 0x10) != 0x0) {
            model4 = new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null);
        }
        if ((n & 0x20) != 0x0) {
            model5 = new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null);
        }
        if ((n & 0x40) != 0x0) {
            model6 = new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null);
        }
        this(settings, model, model2, model3, model4, model5, model6);
    }
    
    public static ViewModel copy$default(final ViewModel viewModel, Settings settings, Model idle, Model buffering, Model paused, Model playing, Model ended, Model transitional, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            settings = viewModel.settings;
        }
        if ((n & 0x2) != 0x0) {
            idle = viewModel.idle;
        }
        if ((n & 0x4) != 0x0) {
            buffering = viewModel.buffering;
        }
        if ((n & 0x8) != 0x0) {
            paused = viewModel.paused;
        }
        if ((n & 0x10) != 0x0) {
            playing = viewModel.playing;
        }
        if ((n & 0x20) != 0x0) {
            ended = viewModel.ended;
        }
        if ((n & 0x40) != 0x0) {
            transitional = viewModel.transitional;
        }
        return viewModel.copy(settings, idle, buffering, paused, playing, ended, transitional);
    }
    
    public final Settings component1() {
        return this.settings;
    }
    
    public final Model component2() {
        return this.idle;
    }
    
    public final Model component3() {
        return this.buffering;
    }
    
    public final Model component4() {
        return this.paused;
    }
    
    public final Model component5() {
        return this.playing;
    }
    
    public final Model component6() {
        return this.ended;
    }
    
    public final Model component7() {
        return this.transitional;
    }
    
    public final ViewModel copy(final Settings settings, final Model model, final Model model2, final Model model3, final Model model4, final Model model5, final Model model6) {
        e.f((Object)settings, "settings");
        e.f((Object)model, "idle");
        e.f((Object)model2, "buffering");
        e.f((Object)model3, "paused");
        e.f((Object)model4, "playing");
        e.f((Object)model5, "ended");
        e.f((Object)model6, "transitional");
        return new ViewModel(settings, model, model2, model3, model4, model5, model6);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ViewModel)) {
            return false;
        }
        final ViewModel viewModel = (ViewModel)o;
        return e.a((Object)this.settings, (Object)viewModel.settings) && e.a((Object)this.idle, (Object)viewModel.idle) && e.a((Object)this.buffering, (Object)viewModel.buffering) && e.a((Object)this.paused, (Object)viewModel.paused) && e.a((Object)this.playing, (Object)viewModel.playing) && e.a((Object)this.ended, (Object)viewModel.ended) && e.a((Object)this.transitional, (Object)viewModel.transitional);
    }
    
    public final Model getBuffering() {
        return this.buffering;
    }
    
    public final Model getEnded() {
        return this.ended;
    }
    
    public final Model getIdle() {
        return this.idle;
    }
    
    public final Model getPaused() {
        return this.paused;
    }
    
    public final Model getPlaying() {
        return this.playing;
    }
    
    public final Settings getSettings() {
        return this.settings;
    }
    
    public final Model getTransitional() {
        return this.transitional;
    }
    
    @Override
    public int hashCode() {
        return this.transitional.hashCode() + (this.ended.hashCode() + (this.playing.hashCode() + (this.paused.hashCode() + (this.buffering.hashCode() + (this.idle.hashCode() + this.settings.hashCode() * 31) * 31) * 31) * 31) * 31) * 31;
    }
    
    public final void setBuffering(final Model buffering) {
        e.f((Object)buffering, "<set-?>");
        this.buffering = buffering;
    }
    
    public final void setEnded(final Model ended) {
        e.f((Object)ended, "<set-?>");
        this.ended = ended;
    }
    
    public final void setIdle(final Model idle) {
        e.f((Object)idle, "<set-?>");
        this.idle = idle;
    }
    
    public final void setPaused(final Model paused) {
        e.f((Object)paused, "<set-?>");
        this.paused = paused;
    }
    
    public final void setPlaying(final Model playing) {
        e.f((Object)playing, "<set-?>");
        this.playing = playing;
    }
    
    public final void setSettings(final Settings settings) {
        e.f((Object)settings, "<set-?>");
        this.settings = settings;
    }
    
    public final void setTransitional(final Model transitional) {
        e.f((Object)transitional, "<set-?>");
        this.transitional = transitional;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ViewModel(settings=");
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
        t.append(", transitional=");
        t.append(this.transitional);
        t.append(')');
        return t.toString();
    }
}
