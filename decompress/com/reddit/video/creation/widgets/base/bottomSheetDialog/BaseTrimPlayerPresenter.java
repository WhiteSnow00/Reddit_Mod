// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.base.bottomSheetDialog;

import com.reddit.video.creation.widgets.base.AbstractPresenter;
import com.reddit.video.creation.widgets.base.BaseMVPView;
import io.reactivex.disposables.CompositeDisposable;
import p21.c;
import af2.t;
import ff2.g;
import m72.a;
import cg2.j;
import ng2.e;
import com.reddit.video.creation.state.AspectRatioConfig;
import com.google.android.exoplayer2.a0;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import kotlin.Metadata;
import com.reddit.video.creation.widgets.base.VideoPlayerAbstractPresenter;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000e\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010 ¨\u0006*" }, d2 = { "Lcom/reddit/video/creation/widgets/base/bottomSheetDialog/BaseTrimPlayerPresenter;", "Lcom/reddit/video/creation/widgets/base/bottomSheetDialog/BaseTrimView;", "V", "Lcom/reddit/video/creation/widgets/base/VideoPlayerAbstractPresenter;", "view", "Lcg2/j;", "observeLengthWarnings$creation_release", "(Lcom/reddit/video/creation/widgets/base/bottomSheetDialog/BaseTrimView;)V", "observeLengthWarnings", "Laf2/t;", "", "isPlayingObservable", "togglePlayerState$creation_release", "(Laf2/t;)V", "togglePlayerState", "stopPlayer$creation_release", "()V", "stopPlayer", "onPause", "onDestroyView", "onDestroy", "Lcom/google/android/exoplayer2/a0;", "player", "Lcom/google/android/exoplayer2/a0;", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;", "adjustableClip", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;", "getAdjustableClip$creation_release", "()Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;", "setAdjustableClip$creation_release", "(Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;)V", "isCurrentlyPlaying", "Z", "isCurrentlyPlaying$creation_release", "()Z", "setCurrentlyPlaying$creation_release", "(Z)V", "isStopped", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "aspectRatioConfig", "<init>", "(Lcom/google/android/exoplayer2/a0;Lcom/reddit/video/creation/state/AspectRatioConfig;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public abstract class BaseTrimPlayerPresenter<V extends BaseTrimView> extends VideoPlayerAbstractPresenter<V>
{
    public static final int $stable = 8;
    public AdjustableClip adjustableClip;
    private boolean isCurrentlyPlaying;
    private boolean isStopped;
    private final a0 player;
    
    public BaseTrimPlayerPresenter(final a0 player, final AspectRatioConfig aspectRatioConfig) {
        e.f((Object)player, "player");
        e.f((Object)aspectRatioConfig, "aspectRatioConfig");
        super(aspectRatioConfig);
        this.player = player;
    }
    
    public static void d(final BaseTrimPlayerPresenter baseTrimPlayerPresenter, final Boolean b) {
        togglePlayerState$lambda-1(baseTrimPlayerPresenter, b);
    }
    
    public static void e(final BaseTrimView baseTrimView, final j j) {
        observeLengthWarnings$lambda-0(baseTrimView, j);
    }
    
    private static final void observeLengthWarnings$lambda-0(final BaseTrimView baseTrimView, final j j) {
        e.f((Object)baseTrimView, "$view");
        ((BaseMVPView)baseTrimView).showLongToast(2131955713);
    }
    
    private static final void togglePlayerState$lambda-1(final BaseTrimPlayerPresenter baseTrimPlayerPresenter, final Boolean b) {
        e.f((Object)baseTrimPlayerPresenter, "this$0");
        e.e((Object)b, "isPlaying");
        if (b) {
            if (baseTrimPlayerPresenter.isStopped) {
                baseTrimPlayerPresenter.player.prepare();
                baseTrimPlayerPresenter.isStopped = false;
            }
            baseTrimPlayerPresenter.isCurrentlyPlaying = true;
            baseTrimPlayerPresenter.player.C(true);
        }
        else {
            baseTrimPlayerPresenter.isCurrentlyPlaying = false;
            baseTrimPlayerPresenter.player.C(false);
        }
    }
    
    public final AdjustableClip getAdjustableClip$creation_release() {
        final AdjustableClip adjustableClip = this.adjustableClip;
        if (adjustableClip != null) {
            return adjustableClip;
        }
        e.n("adjustableClip");
        throw null;
    }
    
    public final boolean isCurrentlyPlaying$creation_release() {
        return this.isCurrentlyPlaying;
    }
    
    public final void observeLengthWarnings$creation_release(final V v) {
        e.f((Object)v, "view");
        final df2.a subscribe = v.getUserSeekMaximumReachedObservable().subscribe((g)new a((Object)v, 6));
        e.e((Object)subscribe, "view.userSeekMaximumReac\u2026x_video_length_reached) }");
        p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), subscribe);
    }
    
    public void onDestroy() {
        this.player.release();
        super.onDestroy();
    }
    
    public void onDestroyView() {
        ((AbstractPresenter)this).getCompositeDisposable().clear();
        super.onDestroyView();
    }
    
    public void onPause() {
        this.player.C(false);
        super.onPause();
    }
    
    public final void setAdjustableClip$creation_release(final AdjustableClip adjustableClip) {
        e.f((Object)adjustableClip, "<set-?>");
        this.adjustableClip = adjustableClip;
    }
    
    public final void setCurrentlyPlaying$creation_release(final boolean isCurrentlyPlaying) {
        this.isCurrentlyPlaying = isCurrentlyPlaying;
    }
    
    public final void stopPlayer$creation_release() {
        this.player.stop();
        this.isStopped = true;
    }
    
    public final void togglePlayerState$creation_release(final t<Boolean> t) {
        e.f((Object)t, "isPlayingObservable");
        final CompositeDisposable compositeDisposable = ((AbstractPresenter)this).getCompositeDisposable();
        final df2.a subscribe = t.subscribe((ff2.g<? super Boolean>)new c((Object)this, 28));
        e.e((Object)subscribe, "isPlayingObservable.subs\u2026yer.pause()\n      }\n    }");
        p7.a.J(compositeDisposable, subscribe);
    }
}
