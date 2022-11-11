// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.controls;

import rg2.p;
import android.transition.TransitionSet;
import hg2.f;
import com.reddit.video.player.internal.extensions.LongExtensionsKt;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import a4.t1;
import java.util.WeakHashMap;
import android.widget.SeekBar;
import java.util.Map;
import o90.xt;
import o90.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import hg2.j;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import a4.q0$g;
import a4.q0;
import com.reddit.video.player.R;
import android.view.View$OnClickListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import o90.yt;
import o90.d;
import o90.tt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o90.ut;
import java.util.ArrayList;
import o90.b;
import com.reddit.video.player.player.ModelOverride;
import androidx.appcompat.widget.a1;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import sg2.e;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import javax.inject.Inject;
import va0.f0;
import android.os.Handler;
import android.transition.AutoTransition;
import com.reddit.video.player.player.Model;
import com.reddit.video.player.databinding.RedditVideoControlsBinding;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 n2\u00020\u0001:\u0003nopB'\b\u0007\u0012\u0006\u0010h\u001a\u00020g\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010i\u0012\b\b\u0002\u0010k\u001a\u00020,¢\u0006\u0004\bl\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002R*\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R*\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R*\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R*\u0010&\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R.\u0010.\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00105\u001a\u000604R\u00020\u00008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010\u000fR\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u000fR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010N\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010T\u001a\u00020\f2\u0006\u0010T\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010\u0011\"\u0004\bV\u0010\u0013R$\u0010\\\u001a\u00020D2\u0006\u0010W\u001a\u00020D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010_\u001a\u00020D2\u0006\u0010W\u001a\u00020D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010Y\"\u0004\b^\u0010[R(\u0010f\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e¨\u0006q" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsView;", "Lcom/reddit/video/player/controls/RedditVideoControls;", "Lhg2/j;", "reset", "Landroidx/constraintlayout/widget/b;", "constraints", "customizeConstraints", "setInitialVisibility", "updateVisibility", "makeConstraints", "autohide", "updateMargins", "", "audio", "hasAudio", "Z", "getHasAudio", "()Z", "setHasAudio", "(Z)V", "muted", "isMuted", "setMuted", "fullscreen", "isFullscreen", "setFullscreen", "", "ms", "positionMs", "J", "getPositionMs", "()J", "setPositionMs", "(J)V", "durationMs", "getDurationMs", "setDurationMs", "Lcom/reddit/video/player/controls/Margins;", "margins", "Lcom/reddit/video/player/controls/Margins;", "getMargins", "()Lcom/reddit/video/player/controls/Margins;", "setMargins", "(Lcom/reddit/video/player/controls/Margins;)V", "", "resId", "callToActionIcon", "Ljava/lang/Integer;", "getCallToActionIcon", "()Ljava/lang/Integer;", "setCallToActionIcon", "(Ljava/lang/Integer;)V", "Lcom/reddit/video/player/controls/RedditVideoControlsView$Controls;", "controls", "Lcom/reddit/video/player/controls/RedditVideoControlsView$Controls;", "getControls", "()Lcom/reddit/video/player/controls/RedditVideoControlsView$Controls;", "Lcom/reddit/video/player/databinding/RedditVideoControlsBinding;", "binding", "Lcom/reddit/video/player/databinding/RedditVideoControlsBinding;", "Landroid/os/Handler;", "uiHandler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "autohideRunnable", "Ljava/lang/Runnable;", "seeking", "mVisible", "Lcom/reddit/video/player/player/Model;", "mViewModel", "Lcom/reddit/video/player/player/Model;", "mutePaddingRight", "I", "mutePaddingBottom", "Landroid/transition/AutoTransition;", "transition", "Landroid/transition/AutoTransition;", "Lva0/f0;", "videoFeatures", "Lva0/f0;", "getVideoFeatures", "()Lva0/f0;", "setVideoFeatures", "(Lva0/f0;)V", "visible", "getVisible", "setVisible", "model", "getViewModel", "()Lcom/reddit/video/player/player/Model;", "setViewModel", "(Lcom/reddit/video/player/player/Model;)V", "viewModel", "getInitialViewModel", "setInitialViewModel", "initialViewModel", "", "label", "getCallToActionLabel", "()Ljava/lang/String;", "setCallToActionLabel", "(Ljava/lang/String;)V", "callToActionLabel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "Controls", "SeekbarListener", "player_release" }, k = 1, mv = { 1, 7, 1 })
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
    @Inject
    public f0 videoFeatures;
    
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
        this.controls = new Controls();
        final RedditVideoControlsBinding inflate = RedditVideoControlsBinding.inflate(LayoutInflater.from(context), (ViewGroup)this, true);
        e.e((Object)inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.autohideRunnable = (Runnable)new a1((Object)this, 22);
        this.mVisible = true;
        this.mViewModel = new Model(false, false, false, false, false, false, false, false, false, false, false, false, false, null, 16383, null);
        final AutoTransition transition = new AutoTransition();
        ((TransitionSet)transition).setDuration(200L);
        ((TransitionSet)transition).setOrdering(0);
        this.transition = transition;
        final RedditVideoControlsView$special$$inlined$injectFeature.RedditVideoControlsView$special$$inlined$injectFeature$1 instance = RedditVideoControlsView$special$$inlined$injectFeature.RedditVideoControlsView$special$$inlined$injectFeature$1.INSTANCE;
        final Object d4;
        Label_0360: {
            if (b.a) {
                synchronized (b.b) {
                    final LinkedHashSet c = b.c;
                    final ArrayList<Object> list = new ArrayList<Object>();
                    for (final Object next : c) {
                        if (next instanceof ut) {
                            list.add(next);
                        }
                    }
                    if (CollectionsKt___CollectionsKt.d4((List)list) != null) {
                        break Label_0360;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find a component of type ");
                    sb.append(ut.class.getSimpleName());
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            final LinkedHashSet c2 = b.c;
            final ArrayList list2 = new ArrayList();
            for (final Object next2 : c2) {
                if (next2 instanceof ut) {
                    list2.add(next2);
                }
            }
            d4 = CollectionsKt___CollectionsKt.d4((List)list2);
            if (d4 == null) {
                throw new IllegalStateException(aw.b.e((Class)ut.class, a.r("Unable to find a component of type ")));
            }
        }
        final tt<?, ?> value = ((ut)d4).k().get(RedditVideoControlsView.class);
        final boolean b = value instanceof tt;
        final tt tt = null;
        tt<?, ?> tt2;
        if (b) {
            tt2 = value;
        }
        else {
            tt2 = null;
        }
        tt<?, ?> tt3 = tt2;
        if (tt2 == null) {
            tt3 = tt2;
            if (this instanceof d) {
                final c zk = ((d)this).Zk();
                tt tt4 = null;
                Label_0529: {
                    if (zk != null) {
                        final xt se = zk.se();
                        if (se != null) {
                            Object a;
                            if (!((a = se.a) instanceof yt)) {
                                a = null;
                            }
                            final yt yt = (yt)a;
                            if (yt == null) {
                                throw new IllegalStateException(android.support.v4.media.a.i(se.a, a.r("Component("), ") is not an instance of (", (Class)yt.class, ')'));
                            }
                            final Map subFeatureInjectors = yt.getSubFeatureInjectors();
                            if (subFeatureInjectors != null) {
                                tt4 = subFeatureInjectors.get(RedditVideoControlsView.class);
                                break Label_0529;
                            }
                        }
                    }
                    tt4 = null;
                }
                tt3 = tt;
                if (tt4 instanceof tt) {
                    tt3 = tt4;
                }
            }
        }
        if (tt3 != null && tt3.inject(this, (rg2.a<?>)instance) != null) {
            final Controls controls = this.controls;
            final SeekBar seekbar = controls.getSeekbar();
            ((ProgressBar)seekbar).setMax(10000);
            seekbar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new SeekbarListener());
            ((View)controls.getPlay()).setOnClickListener((View$OnClickListener)new zv1.a((Object)this, 18));
            ((View)controls.getPause()).setOnClickListener((View$OnClickListener)new x62.a((Object)this, 15));
            final dv1.a a2 = new dv1.a((Object)this, 20);
            ((View)controls.getReplay()).setOnClickListener((View$OnClickListener)a2);
            ((View)controls.getReplayIcon()).setOnClickListener((View$OnClickListener)a2);
            final com.reddit.video.creation.widgets.crop.view.a a3 = new com.reddit.video.creation.widgets.crop.view.a((Object)this, 5);
            ((View)controls.getCallToAction()).setOnClickListener((View$OnClickListener)a3);
            ((View)controls.getCallToActionIcon()).setOnClickListener((View$OnClickListener)a3);
            ((View)controls.getMute()).setOnClickListener((View$OnClickListener)new m42.a((Object)this, 16));
            ((View)controls.getFullscreen()).setOnClickListener((View$OnClickListener)new t32.e((Object)this, 19));
            this.mutePaddingRight = (int)((View)this).getResources().getDimension(R.dimen.reddit_video_controls_mute_padding);
            this.mutePaddingBottom = (int)((View)this).getResources().getDimension(R.dimen.reddit_video_controls_mute_padding_bottom);
            final WeakHashMap<View, t1> a4 = q0.a;
            if (q0$g.c((View)this) && !((View)this).isLayoutRequested()) {
                this.updateVisibility();
            }
            else {
                ((View)this).addOnLayoutChangeListener((View$OnLayoutChangeListener)new RedditVideoControlsView$special$$inlined$doOnLayout.RedditVideoControlsView$special$$inlined$doOnLayout$1(this));
            }
            this.margins.onUpdate((rg2.a<j>)new RedditVideoControlsView$3(this));
            return;
        }
        throw new IllegalStateException(aw.b.f((Class)j.class, al0.a.p("\n    Unable to find any FeatureInjector for target class ", "RedditVideoControlsView", " with a\n    dependency factory of type "), ".\n\n    Check to see if you have added the Anvil compiler to your build.gradle file like so:\n\n    reddit {\n      dagger {\n        anvil {\n          anvilGeneratorProjects = [project(\":di:feature:compiler\")]\n        }\n      }\n    }\n\n    and that you have annotated ", "RedditVideoControlsView", " with @InjectWith\n\n    If you're injecting a child screen, make sure that the parent screen implements\n    ComponentParent.\n    "));
    }
    
    public static final /* synthetic */ Runnable access$getAutohideRunnable$p(final RedditVideoControlsView redditVideoControlsView) {
        return redditVideoControlsView.autohideRunnable;
    }
    
    public static final /* synthetic */ Handler access$getUiHandler$p(final RedditVideoControlsView redditVideoControlsView) {
        return redditVideoControlsView.uiHandler;
    }
    
    public static final /* synthetic */ void access$setSeeking$p(final RedditVideoControlsView redditVideoControlsView, final boolean seeking) {
        redditVideoControlsView.seeking = seeking;
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
        final RedditVideoControlsView$makeConstraints$visibleOrGone.RedditVideoControlsView$makeConstraints$visibleOrGone$1 redditVideoControlsView$makeConstraints$visibleOrGone$1 = new RedditVideoControlsView$makeConstraints$visibleOrGone.RedditVideoControlsView$makeConstraints$visibleOrGone$1(b, this);
        final RedditVideoControlsView$makeConstraints$visibleOrInvisible.RedditVideoControlsView$makeConstraints$visibleOrInvisible$1 redditVideoControlsView$makeConstraints$visibleOrInvisible$1 = new RedditVideoControlsView$makeConstraints$visibleOrInvisible.RedditVideoControlsView$makeConstraints$visibleOrInvisible$1(b, this);
        final RedditVideoControlsView$makeConstraints$toggleTopBottomConstraint.RedditVideoControlsView$makeConstraints$toggleTopBottomConstraint$1 redditVideoControlsView$makeConstraints$toggleTopBottomConstraint$1 = new RedditVideoControlsView$makeConstraints$toggleTopBottomConstraint.RedditVideoControlsView$makeConstraints$toggleTopBottomConstraint$1(b);
        final Controls controls = this.controls;
        final ConstraintLayout controlsBar = controls.getControlsBar();
        e.e((Object)controlsBar, "controlsBar");
        final boolean visible = this.getVisible();
        boolean b2 = true;
        final int n = 0;
        ((p<ConstraintLayout, Boolean, Object>)redditVideoControlsView$makeConstraints$toggleTopBottomConstraint$1).invoke(controlsBar, Boolean.valueOf(visible && this.getViewModel().getControls()));
        final ImageView mute = controls.getMute();
        e.e((Object)mute, "mute");
        ((p<ConstraintLayout, Boolean, Object>)redditVideoControlsView$makeConstraints$toggleTopBottomConstraint$1).invoke((ConstraintLayout)mute, Boolean.valueOf(this.getViewModel().getMuteAlwaysVisible() || (this.getVisible() && this.getViewModel().getControls())));
        final ConstraintLayout controlsBar2 = controls.getControlsBar();
        e.e((Object)controlsBar2, "controlsBar");
        ((p<ConstraintLayout, Boolean, Object>)redditVideoControlsView$makeConstraints$visibleOrInvisible$1).invoke(controlsBar2, Boolean.valueOf(this.getViewModel().getControls()));
        final View shadow = controls.getShadow();
        e.e((Object)shadow, "shadow");
        ((p<View, Boolean, Object>)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke(shadow, Boolean.valueOf(this.getViewModel().getShadow()));
        final ProgressBar bufferingSpinner = controls.getBufferingSpinner();
        e.e((Object)bufferingSpinner, "bufferingSpinner");
        ((p<View, Boolean, Object>)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((View)bufferingSpinner, Boolean.valueOf(this.getViewModel().getBufferingSpinner()));
        final ImageView play = controls.getPlay();
        e.e((Object)play, "play");
        ((p<View, Boolean, Object>)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((View)play, Boolean.valueOf(this.getViewModel().getPlay()));
        final ImageView pause = controls.getPause();
        e.e((Object)pause, "pause");
        ((p<View, Boolean, Object>)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((View)pause, Boolean.valueOf(this.getViewModel().getPause()));
        final TextView replay = controls.getReplay();
        e.e((Object)replay, "replay");
        ((p<View, Boolean, Object>)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((View)replay, Boolean.valueOf(this.getViewModel().getReplay()));
        final ImageView replayIcon = controls.getReplayIcon();
        e.e((Object)replayIcon, "replayIcon");
        ((p<View, Boolean, Object>)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((View)replayIcon, Boolean.valueOf(this.getViewModel().getReplay()));
        final TextView callToAction = controls.getCallToAction();
        e.e((Object)callToAction, "callToAction");
        ((p<View, Boolean, Object>)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((View)callToAction, Boolean.valueOf(this.getViewModel().getCallToAction()));
        final ImageView callToActionIcon = controls.getCallToActionIcon();
        e.e((Object)callToActionIcon, "callToActionIcon");
        ((p<View, Boolean, Object>)redditVideoControlsView$makeConstraints$visibleOrGone$1).invoke((View)callToActionIcon, Boolean.valueOf(this.getViewModel().getCallToAction()));
        if (!this.getVideoFeatures().X7()) {
            final int id = ((View)controls.getMuteBg()).getId();
            int n2 = 0;
            Label_0552: {
                if (!this.getVisible()) {
                    final ImageView mute2 = controls.getMute();
                    e.e((Object)mute2, "mute");
                    if (((View)mute2).getVisibility() != 0) {
                        b2 = false;
                    }
                    if (b2 && this.getViewModel().getMuteAlwaysVisible()) {
                        n2 = 0;
                        break Label_0552;
                    }
                }
                n2 = 8;
            }
            b.p(id, n2);
        }
        b.o(((View)controls.getMute()).getId(), 7, Math.max(this.mutePaddingRight, this.margins.getRight()));
        b.o(((View)controls.getMute()).getId(), 4, Math.max(this.mutePaddingBottom, this.margins.getBottom()));
        final androidx.constraintlayout.widget.b b3 = new androidx.constraintlayout.widget.b();
        b3.e(controls.getControlsBar());
        final int id2 = ((View)controls.getFullscreen()).getId();
        int n3;
        if (this.getVisible() && this.getViewModel().getFullscreen()) {
            n3 = n;
        }
        else {
            n3 = 8;
        }
        b3.p(id2, n3);
        b3.b(controls.getControlsBar());
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
    
    public final f0 getVideoFeatures() {
        final f0 videoFeatures = this.videoFeatures;
        if (videoFeatures != null) {
            return videoFeatures;
        }
        e.n("videoFeatures");
        throw null;
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
        final boolean x7 = this.getVideoFeatures().X7();
        boolean b = true;
        Label_0126: {
            if (x7) {
                final ImageView mute2 = controls.getMute();
                e.e((Object)mute2, "mute");
                if (((View)mute2).getVisibility() == 0) {
                    break Label_0126;
                }
            }
            else if (hasAudio && !this.getVisible() && this.getViewModel().getMuteAlwaysVisible()) {
                break Label_0126;
            }
            b = false;
        }
        if (b) {
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
        (this.margins = margins).onUpdate((rg2.a<j>)new RedditVideoControlsView$margins.RedditVideoControlsView$margins$1(this));
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
    
    public final void setVideoFeatures(final f0 videoFeatures) {
        e.f((Object)videoFeatures, "<set-?>");
        this.videoFeatures = videoFeatures;
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
    }
    
    @Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010#\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\"R\u001b\u0010)\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u001aR\u001b\u0010,\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\"R\u001b\u0010/\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u001aR\u001b\u00102\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\"R\u001b\u00105\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\"R\u001b\u00108\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\"R\u001b\u0010;\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\"¨\u0006>" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsView$Controls;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "controlsBar$delegate", "Lhg2/f;", "getControlsBar", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "controlsBar", "Landroid/view/View;", "shadow$delegate", "getShadow", "()Landroid/view/View;", "shadow", "Landroid/widget/ProgressBar;", "bufferingSpinner$delegate", "getBufferingSpinner", "()Landroid/widget/ProgressBar;", "bufferingSpinner", "Landroid/widget/SeekBar;", "seekbar$delegate", "getSeekbar", "()Landroid/widget/SeekBar;", "seekbar", "Landroid/widget/TextView;", "duration$delegate", "getDuration", "()Landroid/widget/TextView;", "duration", "position$delegate", "getPosition", "position", "Landroid/widget/ImageView;", "play$delegate", "getPlay", "()Landroid/widget/ImageView;", "play", "pause$delegate", "getPause", "pause", "replay$delegate", "getReplay", "replay", "replayIcon$delegate", "getReplayIcon", "replayIcon", "callToAction$delegate", "getCallToAction", "callToAction", "callToActionIcon$delegate", "getCallToActionIcon", "callToActionIcon", "mute$delegate", "getMute", "mute", "muteBg$delegate", "getMuteBg", "muteBg", "fullscreen$delegate", "getFullscreen", "fullscreen", "<init>", "(Lcom/reddit/video/player/controls/RedditVideoControlsView;)V", "player_release" }, k = 1, mv = { 1, 7, 1 })
    public final class Controls
    {
        private final f bufferingSpinner$delegate;
        private final f callToAction$delegate;
        private final f callToActionIcon$delegate;
        private final f controlsBar$delegate;
        private final f duration$delegate;
        private final f fullscreen$delegate;
        private final f mute$delegate;
        private final f muteBg$delegate;
        private final f pause$delegate;
        private final f play$delegate;
        private final f position$delegate;
        private final f replay$delegate;
        private final f replayIcon$delegate;
        private final f seekbar$delegate;
        private final f shadow$delegate;
        
        public Controls() {
            this.controlsBar$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$controlsBar.RedditVideoControlsView$Controls$controlsBar$2(RedditVideoControlsView.this));
            this.shadow$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$shadow.RedditVideoControlsView$Controls$shadow$2(RedditVideoControlsView.this));
            this.bufferingSpinner$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$bufferingSpinner.RedditVideoControlsView$Controls$bufferingSpinner$2(RedditVideoControlsView.this));
            this.seekbar$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$seekbar.RedditVideoControlsView$Controls$seekbar$2(RedditVideoControlsView.this));
            this.duration$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$duration.RedditVideoControlsView$Controls$duration$2(RedditVideoControlsView.this));
            this.position$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$position.RedditVideoControlsView$Controls$position$2(RedditVideoControlsView.this));
            this.play$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$play.RedditVideoControlsView$Controls$play$2(RedditVideoControlsView.this));
            this.pause$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$pause.RedditVideoControlsView$Controls$pause$2(RedditVideoControlsView.this));
            this.replay$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$replay.RedditVideoControlsView$Controls$replay$2(RedditVideoControlsView.this));
            this.replayIcon$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$replayIcon.RedditVideoControlsView$Controls$replayIcon$2(RedditVideoControlsView.this));
            this.callToAction$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$callToAction.RedditVideoControlsView$Controls$callToAction$2(RedditVideoControlsView.this));
            this.callToActionIcon$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$callToActionIcon.RedditVideoControlsView$Controls$callToActionIcon$2(RedditVideoControlsView.this));
            this.mute$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$mute.RedditVideoControlsView$Controls$mute$2(RedditVideoControlsView.this));
            this.muteBg$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$muteBg.RedditVideoControlsView$Controls$muteBg$2(RedditVideoControlsView.this));
            this.fullscreen$delegate = kotlin.a.b((rg2.a)new RedditVideoControlsView$Controls$fullscreen.RedditVideoControlsView$Controls$fullscreen$2(RedditVideoControlsView.this));
        }
        
        public final ProgressBar getBufferingSpinner() {
            return this.bufferingSpinner$delegate.getValue();
        }
        
        public final TextView getCallToAction() {
            return this.callToAction$delegate.getValue();
        }
        
        public final ImageView getCallToActionIcon() {
            return this.callToActionIcon$delegate.getValue();
        }
        
        public final ConstraintLayout getControlsBar() {
            return this.controlsBar$delegate.getValue();
        }
        
        public final TextView getDuration() {
            return this.duration$delegate.getValue();
        }
        
        public final ImageView getFullscreen() {
            return this.fullscreen$delegate.getValue();
        }
        
        public final ImageView getMute() {
            return this.mute$delegate.getValue();
        }
        
        public final ImageView getMuteBg() {
            return this.muteBg$delegate.getValue();
        }
        
        public final ImageView getPause() {
            return this.pause$delegate.getValue();
        }
        
        public final ImageView getPlay() {
            return this.play$delegate.getValue();
        }
        
        public final TextView getPosition() {
            return this.position$delegate.getValue();
        }
        
        public final TextView getReplay() {
            return this.replay$delegate.getValue();
        }
        
        public final ImageView getReplayIcon() {
            return this.replayIcon$delegate.getValue();
        }
        
        public final SeekBar getSeekbar() {
            return this.seekbar$delegate.getValue();
        }
        
        public final View getShadow() {
            return this.shadow$delegate.getValue();
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsView$SeekbarListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/SeekBar;", "seekBar", "Lhg2/j;", "onStartTrackingTouch", "", "progress", "", "fromUser", "onProgressChanged", "onStopTrackingTouch", "<init>", "(Lcom/reddit/video/player/controls/RedditVideoControlsView;)V", "player_release" }, k = 1, mv = { 1, 7, 1 })
    public final class SeekbarListener implements SeekBar$OnSeekBarChangeListener
    {
        public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
            RedditVideoControlsView.this.getControls().getPosition().setText((CharSequence)LongExtensionsKt.getMsToTimeString((long)(n / (float)10000 * RedditVideoControlsView.this.getDurationMs())));
        }
        
        public void onStartTrackingTouch(final SeekBar seekBar) {
            RedditVideoControlsView.access$getUiHandler$p(RedditVideoControlsView.this).removeCallbacks(RedditVideoControlsView.access$getAutohideRunnable$p(RedditVideoControlsView.this));
            RedditVideoControlsView.access$setSeeking$p(RedditVideoControlsView.this, true);
        }
        
        public void onStopTrackingTouch(final SeekBar seekBar) {
            RedditVideoControlsView.access$setSeeking$p(RedditVideoControlsView.this, false);
            if (seekBar != null) {
                RedditVideoControlsView.this.seek(((ProgressBar)seekBar).getProgress() / (float)10000);
            }
            RedditVideoControlsView.this.autohide();
        }
    }
}
