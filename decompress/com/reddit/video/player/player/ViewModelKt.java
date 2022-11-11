// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/video/player/player/ViewModel;", "Lhg2/j;", "repair", "autoplayOverrides", "DEFAULT_VIEW_MODEL", "Lcom/reddit/video/player/player/ViewModel;", "getDEFAULT_VIEW_MODEL", "()Lcom/reddit/video/player/player/ViewModel;", "player_release" }, k = 2, mv = { 1, 7, 1 })
public final class ViewModelKt
{
    private static final ViewModel DEFAULT_VIEW_MODEL;
    
    static {
        DEFAULT_VIEW_MODEL = new ViewModel(null, new Model(false, false, false, true, true, false, false, false, false, false, false, false, false, null, 16359, null), new Model(true, false, false, true, false, false, false, false, false, true, false, false, false, null, 15858, null), new Model(false, false, false, true, true, false, false, false, false, false, false, false, false, null, 16359, null), new Model(false, true, false, true, false, true, false, false, false, false, true, false, false, null, 15317, null), new Model(false, false, false, true, false, false, true, false, false, true, false, false, false, null, 15799, null), new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null), 1, null);
    }
    
    public static final void autoplayOverrides(final ViewModel viewModel) {
        e.f((Object)viewModel, "<this>");
        ViewModelOverrideKt.override(viewModel.getIdle(), viewModel.getIdle().getAutoplayOverrides());
        ViewModelOverrideKt.override(viewModel.getBuffering(), viewModel.getBuffering().getAutoplayOverrides());
        ViewModelOverrideKt.override(viewModel.getPaused(), viewModel.getPaused().getAutoplayOverrides());
        ViewModelOverrideKt.override(viewModel.getPlaying(), viewModel.getPlaying().getAutoplayOverrides());
        ViewModelOverrideKt.override(viewModel.getEnded(), viewModel.getEnded().getAutoplayOverrides());
    }
    
    public static final ViewModel getDEFAULT_VIEW_MODEL() {
        return ViewModelKt.DEFAULT_VIEW_MODEL;
    }
    
    public static final void repair(final ViewModel viewModel) {
        e.f((Object)viewModel, "<this>");
        if (viewModel.getIdle() == null) {
            viewModel.setIdle(new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null));
        }
        if (viewModel.getBuffering() == null) {
            viewModel.setBuffering(new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null));
        }
        if (viewModel.getPaused() == null) {
            viewModel.setPaused(new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null));
        }
        if (viewModel.getPlaying() == null) {
            viewModel.setPlaying(new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null));
        }
        if (viewModel.getEnded() == null) {
            viewModel.setEnded(new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null));
        }
    }
}
