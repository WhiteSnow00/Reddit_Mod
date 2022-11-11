// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u0097\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u000205H\u00d6\u0001J\t\u00106\u001a\u000207H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00068" }, d2 = { "Lcom/reddit/video/player/player/Model;", "", "bufferingSpinner", "", "autohide", "canhide", "controls", "play", "pause", "replay", "callToAction", "shadow", "showOnStateChange", "hideOnStateChange", "fullscreen", "muteAlwaysVisible", "autoplayOverrides", "Lcom/reddit/video/player/player/ModelOverride;", "(ZZZZZZZZZZZZZLcom/reddit/video/player/player/ModelOverride;)V", "getAutohide", "()Z", "getAutoplayOverrides", "()Lcom/reddit/video/player/player/ModelOverride;", "getBufferingSpinner", "getCallToAction", "getCanhide", "getControls", "getFullscreen", "getHideOnStateChange", "getMuteAlwaysVisible", "getPause", "getPlay", "getReplay", "getShadow", "getShowOnStateChange", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Model
{
    private final boolean autohide;
    private final ModelOverride autoplayOverrides;
    private final boolean bufferingSpinner;
    private final boolean callToAction;
    private final boolean canhide;
    private final boolean controls;
    private final boolean fullscreen;
    private final boolean hideOnStateChange;
    private final boolean muteAlwaysVisible;
    private final boolean pause;
    private final boolean play;
    private final boolean replay;
    private final boolean shadow;
    private final boolean showOnStateChange;
    
    public Model() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null);
    }
    
    public Model(final boolean bufferingSpinner, final boolean autohide, final boolean canhide, final boolean controls, final boolean play, final boolean pause, final boolean replay, final boolean callToAction, final boolean shadow, final boolean showOnStateChange, final boolean hideOnStateChange, final boolean fullscreen, final boolean muteAlwaysVisible, final ModelOverride autoplayOverrides) {
        this.bufferingSpinner = bufferingSpinner;
        this.autohide = autohide;
        this.canhide = canhide;
        this.controls = controls;
        this.play = play;
        this.pause = pause;
        this.replay = replay;
        this.callToAction = callToAction;
        this.shadow = shadow;
        this.showOnStateChange = showOnStateChange;
        this.hideOnStateChange = hideOnStateChange;
        this.fullscreen = fullscreen;
        this.muteAlwaysVisible = muteAlwaysVisible;
        this.autoplayOverrides = autoplayOverrides;
    }
    
    public final boolean component1() {
        return this.bufferingSpinner;
    }
    
    public final boolean component10() {
        return this.showOnStateChange;
    }
    
    public final boolean component11() {
        return this.hideOnStateChange;
    }
    
    public final boolean component12() {
        return this.fullscreen;
    }
    
    public final boolean component13() {
        return this.muteAlwaysVisible;
    }
    
    public final ModelOverride component14() {
        return this.autoplayOverrides;
    }
    
    public final boolean component2() {
        return this.autohide;
    }
    
    public final boolean component3() {
        return this.canhide;
    }
    
    public final boolean component4() {
        return this.controls;
    }
    
    public final boolean component5() {
        return this.play;
    }
    
    public final boolean component6() {
        return this.pause;
    }
    
    public final boolean component7() {
        return this.replay;
    }
    
    public final boolean component8() {
        return this.callToAction;
    }
    
    public final boolean component9() {
        return this.shadow;
    }
    
    public final Model copy(final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10, final boolean b11, final boolean b12, final boolean b13, final ModelOverride modelOverride) {
        return new Model(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, modelOverride);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Model)) {
            return false;
        }
        final Model model = (Model)o;
        return this.bufferingSpinner == model.bufferingSpinner && this.autohide == model.autohide && this.canhide == model.canhide && this.controls == model.controls && this.play == model.play && this.pause == model.pause && this.replay == model.replay && this.callToAction == model.callToAction && this.shadow == model.shadow && this.showOnStateChange == model.showOnStateChange && this.hideOnStateChange == model.hideOnStateChange && this.fullscreen == model.fullscreen && this.muteAlwaysVisible == model.muteAlwaysVisible && e.a((Object)this.autoplayOverrides, (Object)model.autoplayOverrides);
    }
    
    public final boolean getAutohide() {
        return this.autohide;
    }
    
    public final ModelOverride getAutoplayOverrides() {
        return this.autoplayOverrides;
    }
    
    public final boolean getBufferingSpinner() {
        return this.bufferingSpinner;
    }
    
    public final boolean getCallToAction() {
        return this.callToAction;
    }
    
    public final boolean getCanhide() {
        return this.canhide;
    }
    
    public final boolean getControls() {
        return this.controls;
    }
    
    public final boolean getFullscreen() {
        return this.fullscreen;
    }
    
    public final boolean getHideOnStateChange() {
        return this.hideOnStateChange;
    }
    
    public final boolean getMuteAlwaysVisible() {
        return this.muteAlwaysVisible;
    }
    
    public final boolean getPause() {
        return this.pause;
    }
    
    public final boolean getPlay() {
        return this.play;
    }
    
    public final boolean getReplay() {
        return this.replay;
    }
    
    public final boolean getShadow() {
        return this.shadow;
    }
    
    public final boolean getShowOnStateChange() {
        return this.showOnStateChange;
    }
    
    @Override
    public int hashCode() {
        final int bufferingSpinner = this.bufferingSpinner ? 1 : 0;
        int n = 1;
        int n2 = bufferingSpinner;
        if (bufferingSpinner != 0) {
            n2 = 1;
        }
        int autohide;
        if ((autohide = (this.autohide ? 1 : 0)) != 0) {
            autohide = 1;
        }
        int canhide;
        if ((canhide = (this.canhide ? 1 : 0)) != 0) {
            canhide = 1;
        }
        int controls;
        if ((controls = (this.controls ? 1 : 0)) != 0) {
            controls = 1;
        }
        int play;
        if ((play = (this.play ? 1 : 0)) != 0) {
            play = 1;
        }
        int pause;
        if ((pause = (this.pause ? 1 : 0)) != 0) {
            pause = 1;
        }
        int replay;
        if ((replay = (this.replay ? 1 : 0)) != 0) {
            replay = 1;
        }
        int callToAction;
        if ((callToAction = (this.callToAction ? 1 : 0)) != 0) {
            callToAction = 1;
        }
        int shadow;
        if ((shadow = (this.shadow ? 1 : 0)) != 0) {
            shadow = 1;
        }
        int showOnStateChange;
        if ((showOnStateChange = (this.showOnStateChange ? 1 : 0)) != 0) {
            showOnStateChange = 1;
        }
        int hideOnStateChange;
        if ((hideOnStateChange = (this.hideOnStateChange ? 1 : 0)) != 0) {
            hideOnStateChange = 1;
        }
        int fullscreen;
        if ((fullscreen = (this.fullscreen ? 1 : 0)) != 0) {
            fullscreen = 1;
        }
        final int muteAlwaysVisible = this.muteAlwaysVisible ? 1 : 0;
        if (muteAlwaysVisible == 0) {
            n = muteAlwaysVisible;
        }
        final ModelOverride autoplayOverrides = this.autoplayOverrides;
        int hashCode;
        if (autoplayOverrides == null) {
            hashCode = 0;
        }
        else {
            hashCode = autoplayOverrides.hashCode();
        }
        return ((((((((((((n2 * 31 + autohide) * 31 + canhide) * 31 + controls) * 31 + play) * 31 + pause) * 31 + replay) * 31 + callToAction) * 31 + shadow) * 31 + showOnStateChange) * 31 + hideOnStateChange) * 31 + fullscreen) * 31 + n) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Model(bufferingSpinner=");
        r.append(this.bufferingSpinner);
        r.append(", autohide=");
        r.append(this.autohide);
        r.append(", canhide=");
        r.append(this.canhide);
        r.append(", controls=");
        r.append(this.controls);
        r.append(", play=");
        r.append(this.play);
        r.append(", pause=");
        r.append(this.pause);
        r.append(", replay=");
        r.append(this.replay);
        r.append(", callToAction=");
        r.append(this.callToAction);
        r.append(", shadow=");
        r.append(this.shadow);
        r.append(", showOnStateChange=");
        r.append(this.showOnStateChange);
        r.append(", hideOnStateChange=");
        r.append(this.hideOnStateChange);
        r.append(", fullscreen=");
        r.append(this.fullscreen);
        r.append(", muteAlwaysVisible=");
        r.append(this.muteAlwaysVisible);
        r.append(", autoplayOverrides=");
        r.append(this.autoplayOverrides);
        r.append(')');
        return r.toString();
    }
}
