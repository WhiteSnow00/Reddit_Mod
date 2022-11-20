// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0007" }, d2 = { "Lcom/reddit/video/player/player/ViewModel;", "Lcom/reddit/video/player/player/ViewModelOverride;", "other", "Lcg2/j;", "override", "Lcom/reddit/video/player/player/Model;", "Lcom/reddit/video/player/player/ModelOverride;", "player_release" }, k = 2, mv = { 1, 7, 1 })
public final class ViewModelOverrideKt
{
    public static final Model override(final Model model, final ModelOverride modelOverride) {
        e.f((Object)model, "<this>");
        if (modelOverride == null) {
            return model;
        }
        final Boolean bufferingSpinner = modelOverride.getBufferingSpinner();
        boolean b;
        if (bufferingSpinner != null) {
            b = bufferingSpinner;
        }
        else {
            b = model.getBufferingSpinner();
        }
        final Boolean autohide = modelOverride.getAutohide();
        boolean b2;
        if (autohide != null) {
            b2 = autohide;
        }
        else {
            b2 = model.getAutohide();
        }
        final Boolean canhide = modelOverride.getCanhide();
        boolean b3;
        if (canhide != null) {
            b3 = canhide;
        }
        else {
            b3 = model.getCanhide();
        }
        final Boolean controls = modelOverride.getControls();
        boolean b4;
        if (controls != null) {
            b4 = controls;
        }
        else {
            b4 = model.getControls();
        }
        final Boolean play = modelOverride.getPlay();
        boolean b5;
        if (play != null) {
            b5 = play;
        }
        else {
            b5 = model.getPlay();
        }
        final Boolean pause = modelOverride.getPause();
        boolean b6;
        if (pause != null) {
            b6 = pause;
        }
        else {
            b6 = model.getPause();
        }
        final Boolean replay = modelOverride.getReplay();
        boolean b7;
        if (replay != null) {
            b7 = replay;
        }
        else {
            b7 = model.getReplay();
        }
        final Boolean callToAction = modelOverride.getCallToAction();
        boolean b8;
        if (callToAction != null) {
            b8 = callToAction;
        }
        else {
            b8 = model.getCallToAction();
        }
        final Boolean shadow = modelOverride.getShadow();
        boolean b9;
        if (shadow != null) {
            b9 = shadow;
        }
        else {
            b9 = model.getShadow();
        }
        final Boolean showOnStateChange = modelOverride.getShowOnStateChange();
        boolean b10;
        if (showOnStateChange != null) {
            b10 = showOnStateChange;
        }
        else {
            b10 = model.getShowOnStateChange();
        }
        final Boolean hideOnStateChange = modelOverride.getHideOnStateChange();
        boolean b11;
        if (hideOnStateChange != null) {
            b11 = hideOnStateChange;
        }
        else {
            b11 = model.getHideOnStateChange();
        }
        final Boolean fullscreen = modelOverride.getFullscreen();
        boolean b12;
        if (fullscreen != null) {
            b12 = fullscreen;
        }
        else {
            b12 = model.getFullscreen();
        }
        final Boolean muteAlwaysVisible = modelOverride.getMuteAlwaysVisible();
        boolean b13;
        if (muteAlwaysVisible != null) {
            b13 = muteAlwaysVisible;
        }
        else {
            b13 = model.getMuteAlwaysVisible();
        }
        return new Model(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, null, 8192, null);
    }
    
    public static final void override(final ViewModel viewModel, final ViewModelOverride viewModelOverride) {
        e.f((Object)viewModel, "<this>");
        e.f((Object)viewModelOverride, "other");
        final SettingsOverride settings = viewModelOverride.getSettings();
        if (settings != null) {
            final Boolean autoplay = settings.getAutoplay();
            boolean b;
            if (autoplay != null) {
                b = autoplay;
            }
            else {
                b = viewModel.getSettings().getAutoplay();
            }
            final Boolean loop = settings.getLoop();
            boolean b2;
            if (loop != null) {
                b2 = loop;
            }
            else {
                b2 = viewModel.getSettings().getLoop();
            }
            final Boolean disabled = settings.getDisabled();
            boolean b3;
            if (disabled != null) {
                b3 = disabled;
            }
            else {
                b3 = viewModel.getSettings().getDisabled();
            }
            viewModel.setSettings(new Settings(b, b2, b3));
        }
        viewModel.setIdle(override(viewModel.getIdle(), viewModelOverride.getIdle()));
        viewModel.setBuffering(override(viewModel.getBuffering(), viewModelOverride.getBuffering()));
        viewModel.setPaused(override(viewModel.getPaused(), viewModelOverride.getPaused()));
        viewModel.setPlaying(override(viewModel.getPlaying(), viewModelOverride.getPlaying()));
        viewModel.setEnded(override(viewModel.getEnded(), viewModelOverride.getEnded()));
    }
}
