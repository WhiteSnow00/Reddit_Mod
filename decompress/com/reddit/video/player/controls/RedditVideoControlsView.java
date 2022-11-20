// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.controls;

import mg2.p;
import android.transition.TransitionSet;
import com.reddit.video.player.internal.extensions.LongExtensionsKt;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import android.widget.SeekBar;
import cg2.j;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import a4.l0$g;
import a4.l0;
import com.reddit.video.player.R;
import y72.b;
import s92.g;
import android.view.View$OnClickListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.reddit.video.player.player.ModelOverride;
import wp1.f;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import ng2.e;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Handler;
import android.transition.AutoTransition;
import com.reddit.video.player.player.Model;
import com.reddit.video.player.databinding.RedditVideoControlsBinding;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 g2\u00020\u0001:\u0003ghiB'\b\u0007\u0012\u0006\u0010a\u001a\u00020`\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010b\u0012\b\b\u0002\u0010d\u001a\u00020,¢\u0006\u0004\be\u0010fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002R*\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R*\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R*\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R*\u0010&\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R.\u0010.\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00105\u001a\u000604R\u00020\u00008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010\u000fR\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u000fR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010M\u001a\u00020\f2\u0006\u0010M\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010\u0011\"\u0004\bO\u0010\u0013R$\u0010U\u001a\u00020D2\u0006\u0010P\u001a\u00020D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010X\u001a\u00020D2\u0006\u0010P\u001a\u00020D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR(\u0010_\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010Y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006j" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsView;", "Lcom/reddit/video/player/controls/RedditVideoControls;", "Lcg2/j;", "reset", "Landroidx/constraintlayout/widget/b;", "constraints", "customizeConstraints", "setInitialVisibility", "updateVisibility", "makeConstraints", "autohide", "updateMargins", "", "audio", "hasAudio", "Z", "getHasAudio", "()Z", "setHasAudio", "(Z)V", "muted", "isMuted", "setMuted", "fullscreen", "isFullscreen", "setFullscreen", "", "ms", "positionMs", "J", "getPositionMs", "()J", "setPositionMs", "(J)V", "durationMs", "getDurationMs", "setDurationMs", "Lcom/reddit/video/player/controls/Margins;", "margins", "Lcom/reddit/video/player/controls/Margins;", "getMargins", "()Lcom/reddit/video/player/controls/Margins;", "setMargins", "(Lcom/reddit/video/player/controls/Margins;)V", "", "resId", "callToActionIcon", "Ljava/lang/Integer;", "getCallToActionIcon", "()Ljava/lang/Integer;", "setCallToActionIcon", "(Ljava/lang/Integer;)V", "Lcom/reddit/video/player/controls/RedditVideoControlsView$Controls;", "controls", "Lcom/reddit/video/player/controls/RedditVideoControlsView$Controls;", "getControls", "()Lcom/reddit/video/player/controls/RedditVideoControlsView$Controls;", "Lcom/reddit/video/player/databinding/RedditVideoControlsBinding;", "binding", "Lcom/reddit/video/player/databinding/RedditVideoControlsBinding;", "Landroid/os/Handler;", "uiHandler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "autohideRunnable", "Ljava/lang/Runnable;", "seeking", "mVisible", "Lcom/reddit/video/player/player/Model;", "mViewModel", "Lcom/reddit/video/player/player/Model;", "mutePaddingRight", "I", "mutePaddingBottom", "Landroid/transition/AutoTransition;", "transition", "Landroid/transition/AutoTransition;", "visible", "getVisible", "setVisible", "model", "getViewModel", "()Lcom/reddit/video/player/player/Model;", "setViewModel", "(Lcom/reddit/video/player/player/Model;)V", "viewModel", "getInitialViewModel", "setInitialViewModel", "initialViewModel", "", "label", "getCallToActionLabel", "()Ljava/lang/String;", "setCallToActionLabel", "(Ljava/lang/String;)V", "callToActionLabel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "Controls", "SeekbarListener", "player_release" }, k = 1, mv = { 1, 7, 1 })
public class RedditVideoControlsView extends RedditVideoControls
{
    private static final long ANIMATION_DURATION_MS = 200L;
    private static final long AUTOHIDE_TIMEOUT_MS = 2000L;
    public static final Companion Companion;
    private static final int SEEK_MAX = 10000;
    private final Runnable autohideRunnable;
    private final RedditVideoControlsBinding binding;
    private Integer callToActionIcon;
    private final Controls controls;
    private long durationMs;
    private boolean hasAudio;
    private boolean isFullscreen;
    private boolean isMuted;
    private Model mViewModel;
    private boolean mVisible;
    private Margins margins;
    private int mutePaddingBottom;
    private int mutePaddingRight;
    private long positionMs;
    private boolean seeking;
    private final AutoTransition transition;
    private Handler uiHandler;
    
    static {
        Companion = new Companion(null);
    }
    
    public RedditVideoControlsView(final Context context) {
        e.f((Object)context, "context");
        this(context, null, 0, 6, null);
    }
    
    public RedditVideoControlsView(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        this(context, set, 0, 4, null);
    }
    
    public RedditVideoControlsView(final Context context, final AttributeSet set, final int n) {
        e.f((Object)context, "context");
        super(context, set, n);
        this.margins = new Margins(0, 0, 0, 0, 15, null);
        final Controls controls = new Controls();
        this.controls = controls;
        final RedditVideoControlsBinding inflate = RedditVideoControlsBinding.inflate(LayoutInflater.from(context), (ViewGroup)this, true);
        e.e((Object)inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.autohideRunnable = (Runnable)new f((Object)this, 10);
        this.mVisible = true;
        this.mViewModel = new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null);
        final AutoTransition transition = new AutoTransition();
        ((TransitionSet)transition).setDuration(200L);
        ((TransitionSet)transition).setOrdering(0);
        this.transition = transition;
        final SeekBar seekbar = controls.getSeekbar();
        ((ProgressBar)seekbar).setMax(10000);
        seekbar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new SeekbarListener());
        ((View)controls.getPlay()).setOnClickListener((View$OnClickListener)new a(this, 0));
        ((View)controls.getPause()).setOnClickListener((View$OnClickListener)new g((Object)this, 10));
        final b b = new b((Object)this, 14);
        ((View)controls.getReplay()).setOnClickListener((View$OnClickListener)b);
        ((View)controls.getReplayIcon()).setOnClickListener((View$OnClickListener)b);
        final wt1.a a = new wt1.a((Object)this, 28);
        ((View)controls.getCallToAction()).setOnClickListener((View$OnClickListener)a);
        ((View)controls.getCallToActionIcon()).setOnClickListener((View$OnClickListener)a);
        ((View)controls.getMute()).setOnClickListener((View$OnClickListener)new com.reddit.vault.feature.vault.transfer.a((Object)this, 6));
        ((View)controls.getFullscreen()).setOnClickListener((View$OnClickListener)new a(this, 1));
        this.mutePaddingRight = (int)((View)this).getResources().getDimension(R.dimen.reddit_video_controls_mute_padding);
        this.mutePaddingBottom = (int)((View)this).getResources().getDimension(R.dimen.reddit_video_controls_mute_padding_bottom);
        final WeakHashMap a2 = l0.a;
        if (l0$g.c((View)this) && !((View)this).isLayoutRequested()) {
            access$updateVisibility(this);
        }
        else {
            ((View)this).addOnLayoutChangeListener((View$OnLayoutChangeListener)new RedditVideoControlsView$special$$inlined$doOnLayout.RedditVideoControlsView$special$$inlined$doOnLayout$1(this));
        }
        this.margins.onUpdate((mg2.a<j>)new RedditVideoControlsView$3(this));
    }
    
    public RedditVideoControlsView(final Context context, AttributeSet set, int n, final int n2, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x2) != 0x0) {
            set = null;
        }
        if ((n2 & 0x4) != 0x0) {
            n = 0;
        }
        this(context, set, n);
    }
    
    public static void a(final RedditVideoControlsView redditVideoControlsView, final View view) {
        lambda-12$lambda-4(redditVideoControlsView, view);
    }
    
    public static final void access$autohide(final RedditVideoControlsView redditVideoControlsView) {
        redditVideoControlsView.autohide();
    }
    
    public static final Runnable access$getAutohideRunnable$p(final RedditVideoControlsView redditVideoControlsView) {
        return redditVideoControlsView.autohideRunnable;
    }
    
    public static final RedditVideoControlsBinding access$getBinding$p(final RedditVideoControlsView redditVideoControlsView) {
        return redditVideoControlsView.binding;
    }
    
    public static final Handler access$getUiHandler$p(final RedditVideoControlsView redditVideoControlsView) {
        return redditVideoControlsView.uiHandler;
    }
    
    public static final void access$setSeeking$p(final RedditVideoControlsView redditVideoControlsView, final boolean seeking) {
        redditVideoControlsView.seeking = seeking;
    }
    
    public static final void access$updateMargins(final RedditVideoControlsView redditVideoControlsView) {
        redditVideoControlsView.updateMargins();
    }
    
    public static final void access$updateVisibility(final RedditVideoControlsView redditVideoControlsView) {
        redditVideoControlsView.updateVisibility();
    }
    
    private final void autohide() {
        this.uiHandler.removeCallbacks(this.autohideRunnable);
        if (this.getViewModel().getAutohide()) {
            this.uiHandler.postDelayed(this.autohideRunnable, 2000L);
        }
    }
    
    private static final void autohideRunnable$lambda-1(final RedditVideoControlsView redditVideoControlsView) {
        e.f((Object)redditVideoControlsView, "this$0");
        redditVideoControlsView.setVisible(false);
    }
    
    public static void b(final RedditVideoControlsView redditVideoControlsView, final View view) {
        lambda-12$lambda-6(redditVideoControlsView, view);
    }
    
    public static void c(final RedditVideoControlsView redditVideoControlsView, final View view) {
        lambda-12$lambda-10(redditVideoControlsView, view);
    }
    
    public static void d(final RedditVideoControlsView redditVideoControlsView) {
        autohideRunnable$lambda-1(redditVideoControlsView);
    }
    
    public static void e(final RedditVideoControlsView redditVideoControlsView, final View view) {
        lambda-12$lambda-11(redditVideoControlsView, view);
    }
    
    public static void f(final RedditVideoControlsView redditVideoControlsView, final View view) {
        lambda-12$lambda-8(redditVideoControlsView, view);
    }
    
    public static void g(final RedditVideoControlsView redditVideoControlsView, final View view) {
        lambda-12$lambda-5(redditVideoControlsView, view);
    }
    
    private static final void lambda-12$lambda-10(final RedditVideoControlsView redditVideoControlsView, final View view) {
        e.f((Object)redditVideoControlsView, "this$0");
        redditVideoControlsView.mute();
        redditVideoControlsView.autohide();
    }
    
    private static final void lambda-12$lambda-11(final RedditVideoControlsView redditVideoControlsView, final View view) {
        e.f((Object)redditVideoControlsView, "this$0");
        redditVideoControlsView.fullscreen();
        redditVideoControlsView.autohide();
    }
    
    private static final void lambda-12$lambda-4(final RedditVideoControlsView redditVideoControlsView, final View view) {
        e.f((Object)redditVideoControlsView, "this$0");
        redditVideoControlsView.play();
        redditVideoControlsView.autohide();
    }
    
    private static final void lambda-12$lambda-5(final RedditVideoControlsView redditVideoControlsView, final View view) {
        e.f((Object)redditVideoControlsView, "this$0");
        redditVideoControlsView.pause();
        redditVideoControlsView.autohide();
    }
    
    private static final void lambda-12$lambda-6(final RedditVideoControlsView redditVideoControlsView, final View view) {
        e.f((Object)redditVideoControlsView, "this$0");
        redditVideoControlsView.replay();
        redditVideoControlsView.autohide();
    }
    
    private static final void lambda-12$lambda-8(final RedditVideoControlsView redditVideoControlsView, final View view) {
        e.f((Object)redditVideoControlsView, "this$0");
        redditVideoControlsView.callToAction();
    }
    
    private final androidx.constraintlayout.widget.b makeConstraints() {
        final androidx.constraintlayout.widget.b b = new androidx.constraintlayout.widget.b();
        b.e(this.binding.getRoot());
        final RedditVideoControlsView$makeConstraints$visibleOrGone$1 redditVideoControlsView$makeConstraints$visibleOrGone$1 = new RedditVideoControlsView$makeConstraints$visibleOrGone$1(b, this);
        final RedditVideoControlsView$makeConstraints$visibleOrInvisible$1 redditVideoControlsView$makeConstraints$visibleOrInvisible$1 = new RedditVideoControlsView$makeConstraints$visibleOrInvisible$1(b, this);
        final RedditVideoControlsView$makeConstraints$toggleTopBottomConstraint$1 redditVideoControlsView$makeConstraints$toggleTopBottomConstraint$1 = new RedditVideoControlsView$makeConstraints$toggleTopBottomConstraint$1(b);
        final Controls controls = this.controls;
        final ConstraintLayout controlsBar = controls.getControlsBar();
        e.e((Object)controlsBar, "controlsBar");
        final boolean visible = this.getVisible();
        final boolean b2 = true;
        int j = 0;
        ((p)redditVideoControlsView$makeConstraints$toggleTopBottomConstraint$1).invoke((Object)controlsBar, (Object)(visible && this.getViewModel().getControls()));
        final ImageView mute = controls.getMute();
        e.e((Object)mute, "mute");
        boolean b3 = b2;
        if (!this.getViewModel().getMuteAlwaysVisible()) {
            b3 = (this.getVisible() && this.getViewModel().getControls() && b2);
        }
        ((p)redditVideoControlsView$makeConstraints$toggleTopBottomConstraint$1).invoke((Object)mute, (Object)b3);
        final ConstraintLayout controlsBar2 = controls.getControlsBar();
        e.e((Object)controlsBar2, "controlsBar");
        ((p)redditVideoControlsView$makeConstraints$visibleOrInvisible$1).invoke((Object)controlsBar2, (Object)this.getViewModel().getControls());
        final View shadow = controls.getShadow();
        e.e((Object)shadow, "shadow");
        ((p)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((Object)shadow, (Object)this.getViewModel().getShadow());
        final ProgressBar bufferingSpinner = controls.getBufferingSpinner();
        e.e((Object)bufferingSpinner, "bufferingSpinner");
        ((p)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((Object)bufferingSpinner, (Object)this.getViewModel().getBufferingSpinner());
        final ImageView play = controls.getPlay();
        e.e((Object)play, "play");
        ((p)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((Object)play, (Object)this.getViewModel().getPlay());
        final ImageView pause = controls.getPause();
        e.e((Object)pause, "pause");
        ((p)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((Object)pause, (Object)this.getViewModel().getPause());
        final TextView replay = controls.getReplay();
        e.e((Object)replay, "replay");
        ((p)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((Object)replay, (Object)this.getViewModel().getReplay());
        final ImageView replayIcon = controls.getReplayIcon();
        e.e((Object)replayIcon, "replayIcon");
        ((p)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((Object)replayIcon, (Object)this.getViewModel().getReplay());
        final TextView callToAction = controls.getCallToAction();
        e.e((Object)callToAction, "callToAction");
        ((p)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((Object)callToAction, (Object)this.getViewModel().getCallToAction());
        final ImageView callToActionIcon = controls.getCallToActionIcon();
        e.e((Object)callToActionIcon, "callToActionIcon");
        ((p)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((Object)callToActionIcon, (Object)this.getViewModel().getCallToAction());
        b.o(((View)controls.getMute()).getId(), 7, Math.max(this.mutePaddingRight, this.margins.getRight()));
        b.o(((View)controls.getMute()).getId(), 4, Math.max(this.mutePaddingBottom, this.margins.getBottom()));
        final androidx.constraintlayout.widget.b b4 = new androidx.constraintlayout.widget.b();
        b4.e(controls.getControlsBar());
        final int id = ((View)controls.getFullscreen()).getId();
        if (!this.getVisible() || !this.getViewModel().getFullscreen()) {
            j = 8;
        }
        b4.l(id).J = j;
        b4.b(controls.getControlsBar());
        this.customizeConstraints(b);
        return b;
    }
    
    private final void setInitialVisibility() {
        this.binding.getRoot().setConstraintSet(this.makeConstraints());
    }
    
    private final void updateMargins() {
        ((View)this.controls.getControlsBar()).setPadding(this.margins.getLeft(), 0, this.margins.getRight(), this.margins.getBottom());
    }
    
    private final void updateVisibility() {
        TransitionManager.endTransitions((ViewGroup)this.binding.getRoot());
        TransitionManager.beginDelayedTransition((ViewGroup)this.binding.getRoot(), (Transition)this.transition);
        this.makeConstraints().b(this.binding.getRoot());
        this.autohide();
        this.visibilityChanged(this.getVisible());
    }
    
    public final void customizeConstraints(final androidx.constraintlayout.widget.b b) {
        e.f((Object)b, "constraints");
    }
    
    @Override
    public final Integer getCallToActionIcon() {
        return this.callToActionIcon;
    }
    
    @Override
    public final String getCallToActionLabel() {
        return this.controls.getCallToAction().getText().toString();
    }
    
    public final Controls getControls() {
        return this.controls;
    }
    
    @Override
    public final long getDurationMs() {
        return this.durationMs;
    }
    
    @Override
    public final boolean getHasAudio() {
        return this.hasAudio;
    }
    
    @Override
    public final Model getInitialViewModel() {
        return this.mViewModel;
    }
    
    @Override
    public final Margins getMargins() {
        return this.margins;
    }
    
    @Override
    public final long getPositionMs() {
        return this.positionMs;
    }
    
    @Override
    public final Model getViewModel() {
        return this.mViewModel;
    }
    
    @Override
    public final boolean getVisible() {
        return this.mVisible;
    }
    
    @Override
    public final boolean isFullscreen() {
        return this.isFullscreen;
    }
    
    @Override
    public final boolean isMuted() {
        return this.isMuted;
    }
    
    @Override
    public void reset() {
        final Controls controls = this.controls;
        ((ProgressBar)controls.getSeekbar()).setProgress(0);
        controls.getPosition().setText((CharSequence)LongExtensionsKt.getMsToTimeString(0L));
        controls.getDuration().setText((CharSequence)LongExtensionsKt.getMsToTimeString(0L));
        this.setHasAudio(false);
        this.setVisible(false);
    }
    
    @Override
    public final void setCallToActionIcon(final Integer callToActionIcon) {
        this.callToActionIcon = callToActionIcon;
        final ImageView callToActionIcon2 = this.controls.getCallToActionIcon();
        final Integer callToActionIcon3 = this.callToActionIcon;
        int intValue;
        if (callToActionIcon3 != null) {
            intValue = callToActionIcon3;
        }
        else {
            intValue = 0;
        }
        callToActionIcon2.setImageResource(intValue);
    }
    
    @Override
    public final void setCallToActionLabel(final String text) {
        this.controls.getCallToAction().setText((CharSequence)text);
    }
    
    @Override
    public final void setDurationMs(final long n) {
        this.durationMs = Math.max(0L, n);
        this.controls.getDuration().setText((CharSequence)LongExtensionsKt.getMsToTimeString(n));
        this.setPositionMs(this.positionMs);
    }
    
    @Override
    public final void setFullscreen(final boolean isFullscreen) {
        this.isFullscreen = isFullscreen;
        final ImageView fullscreen = this.controls.getFullscreen();
        int imageResource;
        if (isFullscreen) {
            imageResource = R.drawable.icon_fullscreen_exit;
        }
        else {
            imageResource = R.drawable.icon_fullscreen;
        }
        fullscreen.setImageResource(imageResource);
    }
    
    @Override
    public final void setHasAudio(final boolean hasAudio) {
        this.hasAudio = hasAudio;
        final Controls controls = this.controls;
        final ImageView mute = controls.getMute();
        e.e((Object)mute, "mute");
        int visibility = 8;
        int visibility2;
        if (hasAudio) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        ((View)mute).setVisibility(visibility2);
        final ImageView muteBg = controls.getMuteBg();
        e.e((Object)muteBg, "muteBg");
        final ImageView mute2 = controls.getMute();
        e.e((Object)mute2, "mute");
        if (((View)mute2).getVisibility() == 0) {
            visibility = 0;
        }
        ((View)muteBg).setVisibility(visibility);
    }
    
    @Override
    public final void setInitialViewModel(final Model mViewModel) {
        e.f((Object)mViewModel, "model");
        this.mViewModel = mViewModel;
        if (mViewModel.getShowOnStateChange()) {
            this.mVisible = true;
        }
        else if (mViewModel.getHideOnStateChange()) {
            this.mVisible = false;
        }
        this.setInitialVisibility();
    }
    
    @Override
    public final void setMargins(final Margins margins) {
        e.f((Object)margins, "margins");
        (this.margins = margins).onUpdate((mg2.a<j>)new RedditVideoControlsView$margins$1(this));
        this.updateMargins();
    }
    
    @Override
    public final void setMuted(final boolean isMuted) {
        this.isMuted = isMuted;
        final ImageView mute = this.controls.getMute();
        int imageResource;
        if (isMuted) {
            imageResource = R.drawable.icon_audio_on;
        }
        else {
            imageResource = R.drawable.icon_audio_off;
        }
        mute.setImageResource(imageResource);
    }
    
    @Override
    public final void setPositionMs(final long n) {
        this.positionMs = Math.max(0L, n);
        if (!this.seeking) {
            this.controls.getPosition().setText((CharSequence)LongExtensionsKt.getMsToTimeString(n));
            if (this.durationMs > 0L) {
                ((ProgressBar)this.controls.getSeekbar()).setProgress((int)(n / (float)this.durationMs * 10000));
            }
        }
    }
    
    @Override
    public final void setViewModel(final Model mViewModel) {
        e.f((Object)mViewModel, "model");
        this.mViewModel = mViewModel;
        if (mViewModel.getShowOnStateChange()) {
            this.setVisible(true);
        }
        else if (mViewModel.getHideOnStateChange()) {
            this.setVisible(false);
        }
        else {
            this.updateVisibility();
        }
    }
    
    @Override
    public final void setVisible(final boolean mVisible) {
        this.mVisible = mVisible;
        this.updateVisibility();
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsView$Companion;", "", "()V", "ANIMATION_DURATION_MS", "", "AUTOHIDE_TIMEOUT_MS", "SEEK_MAX", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010#\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\"R\u001b\u0010)\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u001aR\u001b\u0010,\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\"R\u001b\u0010/\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u001aR\u001b\u00102\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\"R\u001b\u00105\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\"R\u001b\u00108\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\"R\u001b\u0010;\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\"¨\u0006>" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsView$Controls;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "controlsBar$delegate", "Lcg2/f;", "getControlsBar", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "controlsBar", "Landroid/view/View;", "shadow$delegate", "getShadow", "()Landroid/view/View;", "shadow", "Landroid/widget/ProgressBar;", "bufferingSpinner$delegate", "getBufferingSpinner", "()Landroid/widget/ProgressBar;", "bufferingSpinner", "Landroid/widget/SeekBar;", "seekbar$delegate", "getSeekbar", "()Landroid/widget/SeekBar;", "seekbar", "Landroid/widget/TextView;", "duration$delegate", "getDuration", "()Landroid/widget/TextView;", "duration", "position$delegate", "getPosition", "position", "Landroid/widget/ImageView;", "play$delegate", "getPlay", "()Landroid/widget/ImageView;", "play", "pause$delegate", "getPause", "pause", "replay$delegate", "getReplay", "replay", "replayIcon$delegate", "getReplayIcon", "replayIcon", "callToAction$delegate", "getCallToAction", "callToAction", "callToActionIcon$delegate", "getCallToActionIcon", "callToActionIcon", "mute$delegate", "getMute", "mute", "muteBg$delegate", "getMuteBg", "muteBg", "fullscreen$delegate", "getFullscreen", "fullscreen", "<init>", "(Lcom/reddit/video/player/controls/RedditVideoControlsView;)V", "player_release" }, k = 1, mv = { 1, 7, 1 })
    public final class Controls
    {
        private final cg2.f bufferingSpinner$delegate;
        private final cg2.f callToAction$delegate;
        private final cg2.f callToActionIcon$delegate;
        private final cg2.f controlsBar$delegate;
        private final cg2.f duration$delegate;
        private final cg2.f fullscreen$delegate;
        private final cg2.f mute$delegate;
        private final cg2.f muteBg$delegate;
        private final cg2.f pause$delegate;
        private final cg2.f play$delegate;
        private final cg2.f position$delegate;
        private final cg2.f replay$delegate;
        private final cg2.f replayIcon$delegate;
        private final cg2.f seekbar$delegate;
        private final cg2.f shadow$delegate;
        public final RedditVideoControlsView this$0;
        
        public Controls(final RedditVideoControlsView this$0) {
            this.this$0 = this$0;
            this.controlsBar$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$controlsBar$2(this$0));
            this.shadow$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$shadow$2(this$0));
            this.bufferingSpinner$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$bufferingSpinner$2(this$0));
            this.seekbar$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$seekbar$2(this$0));
            this.duration$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$duration$2(this$0));
            this.position$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$position$2(this$0));
            this.play$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$play$2(this$0));
            this.pause$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$pause$2(this$0));
            this.replay$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$replay$2(this$0));
            this.replayIcon$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$replayIcon$2(this$0));
            this.callToAction$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$callToAction$2(this$0));
            this.callToActionIcon$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$callToActionIcon$2(this$0));
            this.mute$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$mute$2(this$0));
            this.muteBg$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$muteBg$2(this$0));
            this.fullscreen$delegate = kotlin.a.b((mg2.a)new RedditVideoControlsView$Controls$fullscreen$2(this$0));
        }
        
        public final ProgressBar getBufferingSpinner() {
            return (ProgressBar)this.bufferingSpinner$delegate.getValue();
        }
        
        public final TextView getCallToAction() {
            return (TextView)this.callToAction$delegate.getValue();
        }
        
        public final ImageView getCallToActionIcon() {
            return (ImageView)this.callToActionIcon$delegate.getValue();
        }
        
        public final ConstraintLayout getControlsBar() {
            return (ConstraintLayout)this.controlsBar$delegate.getValue();
        }
        
        public final TextView getDuration() {
            return (TextView)this.duration$delegate.getValue();
        }
        
        public final ImageView getFullscreen() {
            return (ImageView)this.fullscreen$delegate.getValue();
        }
        
        public final ImageView getMute() {
            return (ImageView)this.mute$delegate.getValue();
        }
        
        public final ImageView getMuteBg() {
            return (ImageView)this.muteBg$delegate.getValue();
        }
        
        public final ImageView getPause() {
            return (ImageView)this.pause$delegate.getValue();
        }
        
        public final ImageView getPlay() {
            return (ImageView)this.play$delegate.getValue();
        }
        
        public final TextView getPosition() {
            return (TextView)this.position$delegate.getValue();
        }
        
        public final TextView getReplay() {
            return (TextView)this.replay$delegate.getValue();
        }
        
        public final ImageView getReplayIcon() {
            return (ImageView)this.replayIcon$delegate.getValue();
        }
        
        public final SeekBar getSeekbar() {
            return (SeekBar)this.seekbar$delegate.getValue();
        }
        
        public final View getShadow() {
            return (View)this.shadow$delegate.getValue();
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsView$SeekbarListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/SeekBar;", "seekBar", "Lcg2/j;", "onStartTrackingTouch", "", "progress", "", "fromUser", "onProgressChanged", "onStopTrackingTouch", "<init>", "(Lcom/reddit/video/player/controls/RedditVideoControlsView;)V", "player_release" }, k = 1, mv = { 1, 7, 1 })
    public final class SeekbarListener implements SeekBar$OnSeekBarChangeListener
    {
        public final RedditVideoControlsView this$0;
        
        public SeekbarListener(final RedditVideoControlsView this$0) {
            this.this$0 = this$0;
        }
        
        public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
            this.this$0.getControls().getPosition().setText((CharSequence)LongExtensionsKt.getMsToTimeString((long)(n / (float)10000 * this.this$0.getDurationMs())));
        }
        
        public void onStartTrackingTouch(final SeekBar seekBar) {
            RedditVideoControlsView.access$getUiHandler$p(this.this$0).removeCallbacks(RedditVideoControlsView.access$getAutohideRunnable$p(this.this$0));
            RedditVideoControlsView.access$setSeeking$p(this.this$0, true);
        }
        
        public void onStopTrackingTouch(final SeekBar seekBar) {
            RedditVideoControlsView.access$setSeeking$p(this.this$0, false);
            if (seekBar != null) {
                this.this$0.seek(((ProgressBar)seekBar).getProgress() / (float)10000);
            }
            RedditVideoControlsView.access$autohide(this.this$0);
        }
    }
}
