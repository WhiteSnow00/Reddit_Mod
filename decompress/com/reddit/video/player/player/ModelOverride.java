// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0012Jª\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u000202H\u00d6\u0001J\t\u00103\u001a\u000204H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0019\u0010\u0012R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001a\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001c\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001e\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001f\u0010\u0012¨\u00065" }, d2 = { "Lcom/reddit/video/player/player/ModelOverride;", "", "bufferingSpinner", "", "autohide", "canhide", "controls", "play", "pause", "replay", "callToAction", "shadow", "showOnStateChange", "hideOnStateChange", "fullscreen", "muteAlwaysVisible", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAutohide", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBufferingSpinner", "getCallToAction", "getCanhide", "getControls", "getFullscreen", "getHideOnStateChange", "getMuteAlwaysVisible", "getPause", "getPlay", "getReplay", "getShadow", "getShowOnStateChange", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/reddit/video/player/player/ModelOverride;", "equals", "other", "hashCode", "", "toString", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ModelOverride
{
    private final Boolean autohide;
    private final Boolean bufferingSpinner;
    private final Boolean callToAction;
    private final Boolean canhide;
    private final Boolean controls;
    private final Boolean fullscreen;
    private final Boolean hideOnStateChange;
    private final Boolean muteAlwaysVisible;
    private final Boolean pause;
    private final Boolean play;
    private final Boolean replay;
    private final Boolean shadow;
    private final Boolean showOnStateChange;
    
    public ModelOverride() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
    
    public ModelOverride(final Boolean bufferingSpinner, final Boolean autohide, final Boolean canhide, final Boolean controls, final Boolean play, final Boolean pause, final Boolean replay, final Boolean callToAction, final Boolean shadow, final Boolean showOnStateChange, final Boolean hideOnStateChange, final Boolean fullscreen, final Boolean muteAlwaysVisible) {
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
    }
    
    public ModelOverride(Boolean b, Boolean b2, Boolean b3, Boolean b4, Boolean b5, Boolean b6, Boolean b7, Boolean b8, Boolean b9, Boolean b10, Boolean b11, Boolean b12, Boolean b13, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        final Boolean b14 = null;
        if ((n & 0x1) != 0x0) {
            b = null;
        }
        if ((n & 0x2) != 0x0) {
            b2 = null;
        }
        if ((n & 0x4) != 0x0) {
            b3 = null;
        }
        if ((n & 0x8) != 0x0) {
            b4 = null;
        }
        if ((n & 0x10) != 0x0) {
            b5 = null;
        }
        if ((n & 0x20) != 0x0) {
            b6 = null;
        }
        if ((n & 0x40) != 0x0) {
            b7 = null;
        }
        if ((n & 0x80) != 0x0) {
            b8 = null;
        }
        if ((n & 0x100) != 0x0) {
            b9 = null;
        }
        if ((n & 0x200) != 0x0) {
            b10 = null;
        }
        if ((n & 0x400) != 0x0) {
            b11 = null;
        }
        if ((n & 0x800) != 0x0) {
            b12 = null;
        }
        if ((n & 0x1000) != 0x0) {
            b13 = b14;
        }
        this(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13);
    }
    
    public static ModelOverride copy$default(final ModelOverride modelOverride, Boolean bufferingSpinner, Boolean autohide, Boolean canhide, Boolean controls, Boolean play, Boolean pause, Boolean replay, Boolean callToAction, Boolean shadow, Boolean showOnStateChange, Boolean hideOnStateChange, Boolean fullscreen, Boolean muteAlwaysVisible, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            bufferingSpinner = modelOverride.bufferingSpinner;
        }
        if ((n & 0x2) != 0x0) {
            autohide = modelOverride.autohide;
        }
        if ((n & 0x4) != 0x0) {
            canhide = modelOverride.canhide;
        }
        if ((n & 0x8) != 0x0) {
            controls = modelOverride.controls;
        }
        if ((n & 0x10) != 0x0) {
            play = modelOverride.play;
        }
        if ((n & 0x20) != 0x0) {
            pause = modelOverride.pause;
        }
        if ((n & 0x40) != 0x0) {
            replay = modelOverride.replay;
        }
        if ((n & 0x80) != 0x0) {
            callToAction = modelOverride.callToAction;
        }
        if ((n & 0x100) != 0x0) {
            shadow = modelOverride.shadow;
        }
        if ((n & 0x200) != 0x0) {
            showOnStateChange = modelOverride.showOnStateChange;
        }
        if ((n & 0x400) != 0x0) {
            hideOnStateChange = modelOverride.hideOnStateChange;
        }
        if ((n & 0x800) != 0x0) {
            fullscreen = modelOverride.fullscreen;
        }
        if ((n & 0x1000) != 0x0) {
            muteAlwaysVisible = modelOverride.muteAlwaysVisible;
        }
        return modelOverride.copy(bufferingSpinner, autohide, canhide, controls, play, pause, replay, callToAction, shadow, showOnStateChange, hideOnStateChange, fullscreen, muteAlwaysVisible);
    }
    
    public final Boolean component1() {
        return this.bufferingSpinner;
    }
    
    public final Boolean component10() {
        return this.showOnStateChange;
    }
    
    public final Boolean component11() {
        return this.hideOnStateChange;
    }
    
    public final Boolean component12() {
        return this.fullscreen;
    }
    
    public final Boolean component13() {
        return this.muteAlwaysVisible;
    }
    
    public final Boolean component2() {
        return this.autohide;
    }
    
    public final Boolean component3() {
        return this.canhide;
    }
    
    public final Boolean component4() {
        return this.controls;
    }
    
    public final Boolean component5() {
        return this.play;
    }
    
    public final Boolean component6() {
        return this.pause;
    }
    
    public final Boolean component7() {
        return this.replay;
    }
    
    public final Boolean component8() {
        return this.callToAction;
    }
    
    public final Boolean component9() {
        return this.shadow;
    }
    
    public final ModelOverride copy(final Boolean b, final Boolean b2, final Boolean b3, final Boolean b4, final Boolean b5, final Boolean b6, final Boolean b7, final Boolean b8, final Boolean b9, final Boolean b10, final Boolean b11, final Boolean b12, final Boolean b13) {
        return new ModelOverride(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelOverride)) {
            return false;
        }
        final ModelOverride modelOverride = (ModelOverride)o;
        return e.a((Object)this.bufferingSpinner, (Object)modelOverride.bufferingSpinner) && e.a((Object)this.autohide, (Object)modelOverride.autohide) && e.a((Object)this.canhide, (Object)modelOverride.canhide) && e.a((Object)this.controls, (Object)modelOverride.controls) && e.a((Object)this.play, (Object)modelOverride.play) && e.a((Object)this.pause, (Object)modelOverride.pause) && e.a((Object)this.replay, (Object)modelOverride.replay) && e.a((Object)this.callToAction, (Object)modelOverride.callToAction) && e.a((Object)this.shadow, (Object)modelOverride.shadow) && e.a((Object)this.showOnStateChange, (Object)modelOverride.showOnStateChange) && e.a((Object)this.hideOnStateChange, (Object)modelOverride.hideOnStateChange) && e.a((Object)this.fullscreen, (Object)modelOverride.fullscreen) && e.a((Object)this.muteAlwaysVisible, (Object)modelOverride.muteAlwaysVisible);
    }
    
    public final Boolean getAutohide() {
        return this.autohide;
    }
    
    public final Boolean getBufferingSpinner() {
        return this.bufferingSpinner;
    }
    
    public final Boolean getCallToAction() {
        return this.callToAction;
    }
    
    public final Boolean getCanhide() {
        return this.canhide;
    }
    
    public final Boolean getControls() {
        return this.controls;
    }
    
    public final Boolean getFullscreen() {
        return this.fullscreen;
    }
    
    public final Boolean getHideOnStateChange() {
        return this.hideOnStateChange;
    }
    
    public final Boolean getMuteAlwaysVisible() {
        return this.muteAlwaysVisible;
    }
    
    public final Boolean getPause() {
        return this.pause;
    }
    
    public final Boolean getPlay() {
        return this.play;
    }
    
    public final Boolean getReplay() {
        return this.replay;
    }
    
    public final Boolean getShadow() {
        return this.shadow;
    }
    
    public final Boolean getShowOnStateChange() {
        return this.showOnStateChange;
    }
    
    @Override
    public int hashCode() {
        final Boolean bufferingSpinner = this.bufferingSpinner;
        int hashCode = 0;
        int hashCode2;
        if (bufferingSpinner == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = bufferingSpinner.hashCode();
        }
        final Boolean autohide = this.autohide;
        int hashCode3;
        if (autohide == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = autohide.hashCode();
        }
        final Boolean canhide = this.canhide;
        int hashCode4;
        if (canhide == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = canhide.hashCode();
        }
        final Boolean controls = this.controls;
        int hashCode5;
        if (controls == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = controls.hashCode();
        }
        final Boolean play = this.play;
        int hashCode6;
        if (play == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = play.hashCode();
        }
        final Boolean pause = this.pause;
        int hashCode7;
        if (pause == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = pause.hashCode();
        }
        final Boolean replay = this.replay;
        int hashCode8;
        if (replay == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = replay.hashCode();
        }
        final Boolean callToAction = this.callToAction;
        int hashCode9;
        if (callToAction == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = callToAction.hashCode();
        }
        final Boolean shadow = this.shadow;
        int hashCode10;
        if (shadow == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = shadow.hashCode();
        }
        final Boolean showOnStateChange = this.showOnStateChange;
        int hashCode11;
        if (showOnStateChange == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = showOnStateChange.hashCode();
        }
        final Boolean hideOnStateChange = this.hideOnStateChange;
        int hashCode12;
        if (hideOnStateChange == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = hideOnStateChange.hashCode();
        }
        final Boolean fullscreen = this.fullscreen;
        int hashCode13;
        if (fullscreen == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = fullscreen.hashCode();
        }
        final Boolean muteAlwaysVisible = this.muteAlwaysVisible;
        if (muteAlwaysVisible != null) {
            hashCode = muteAlwaysVisible.hashCode();
        }
        return (((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ModelOverride(bufferingSpinner=");
        t.append(this.bufferingSpinner);
        t.append(", autohide=");
        t.append(this.autohide);
        t.append(", canhide=");
        t.append(this.canhide);
        t.append(", controls=");
        t.append(this.controls);
        t.append(", play=");
        t.append(this.play);
        t.append(", pause=");
        t.append(this.pause);
        t.append(", replay=");
        t.append(this.replay);
        t.append(", callToAction=");
        t.append(this.callToAction);
        t.append(", shadow=");
        t.append(this.shadow);
        t.append(", showOnStateChange=");
        t.append(this.showOnStateChange);
        t.append(", hideOnStateChange=");
        t.append(this.hideOnStateChange);
        t.append(", fullscreen=");
        t.append(this.fullscreen);
        t.append(", muteAlwaysVisible=");
        return android.support.v4.media.a.m(t, this.muteAlwaysVisible, ')');
    }
}
