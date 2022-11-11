// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.controls;

import com.reddit.video.player.player.Model;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.util.AttributeSet;
import sg2.e;
import android.content.Context;
import android.widget.SeekBar$OnSeekBarChangeListener;
import rg2.l;
import hg2.j;
import rg2.a;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010g\u001a\u00020f\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010h\u0012\b\b\u0002\u0010j\u001a\u00020`¢\u0006\u0004\bk\u0010lJ\b\u0010\u0003\u001a\u00020\u0002H&J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0017\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0019\u001a\u00020\u00022\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00022\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J%\u0010\u001d\u001a\u00020\u00022\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0000¢\u0006\u0004\b\u001c\u0010\u0018J%\u0010\u001f\u001a\u00020\u00022\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0000¢\u0006\u0004\b\u001e\u0010\u0018J%\u0010!\u001a\u00020\u00022\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0000¢\u0006\u0004\b \u0010\u0018J+\u0010&\u001a\u00020\u00022\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"j\u0004\u0018\u0001`#H\u0000¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u00022\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0000¢\u0006\u0004\b'\u0010\u0018J%\u0010*\u001a\u00020\u00022\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0000¢\u0006\u0004\b)\u0010\u0018J+\u0010-\u001a\u00020\u00022\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"j\u0004\u0018\u0001`+H\u0000¢\u0006\u0004\b,\u0010%J\u0019\u00102\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b0\u00101R$\u00103\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b2\u00101R\u001c\u0010\u0011\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010=\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R\u001c\u0010>\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u00108\"\u0004\b?\u0010:R\u001c\u0010@\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u00108\"\u0004\bA\u0010:R\u001c\u0010G\u001a\u00020B8&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010J\u001a\u00020B8&@&X¦\u000e¢\u0006\f\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\u001c\u0010P\u001a\u00020K8&@&X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010S\u001a\u00020K8&@&X¦\u000e¢\u0006\f\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\u001c\u0010Y\u001a\u00020T8&@&X¦\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001e\u0010_\u001a\u0004\u0018\u00010Z8&@&X¦\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001e\u0010e\u001a\u0004\u0018\u00010`8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006m" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControls;", "Landroid/widget/FrameLayout;", "Lhg2/j;", "reset", "play", "()Lhg2/j;", "pause", "nonUserPause", "replay", "callToAction", "", "percent", "seek", "(F)Lhg2/j;", "fullscreen", "mute", "", "visible", "visibilityChanged", "(Z)Lhg2/j;", "Lkotlin/Function0;", "Lcom/reddit/video/player/internal/Delegate;", "callback", "setOnPlay$player_release", "(Lrg2/a;)V", "setOnPlay", "setOnPause$player_release", "setOnPause", "setOnNonUserPause$player_release", "setOnNonUserPause", "setOnReplay$player_release", "setOnReplay", "setOnCallToAction$player_release", "setOnCallToAction", "Lkotlin/Function1;", "Lcom/reddit/video/player/internal/FloatDelegate;", "setOnSeek$player_release", "(Lrg2/l;)V", "setOnSeek", "setOnFullscreen$player_release", "setOnFullscreen", "setOnMute$player_release", "setOnMute", "Lcom/reddit/video/player/internal/BooleanDelegate;", "setOnVisibilityChanged$player_release", "setOnVisibilityChanged", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "listener", "setSeekBarChangeListener$player_release", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", "setSeekBarChangeListener", "seekBarChangeListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "getSeekBarChangeListener", "()Landroid/widget/SeekBar$OnSeekBarChangeListener;", "getVisible", "()Z", "setVisible", "(Z)V", "getHasAudio", "setHasAudio", "hasAudio", "isMuted", "setMuted", "isFullscreen", "setFullscreen", "", "getPositionMs", "()J", "setPositionMs", "(J)V", "positionMs", "getDurationMs", "setDurationMs", "durationMs", "Lcom/reddit/video/player/player/Model;", "getViewModel", "()Lcom/reddit/video/player/player/Model;", "setViewModel", "(Lcom/reddit/video/player/player/Model;)V", "viewModel", "getInitialViewModel", "setInitialViewModel", "initialViewModel", "Lcom/reddit/video/player/controls/Margins;", "getMargins", "()Lcom/reddit/video/player/controls/Margins;", "setMargins", "(Lcom/reddit/video/player/controls/Margins;)V", "margins", "", "getCallToActionLabel", "()Ljava/lang/String;", "setCallToActionLabel", "(Ljava/lang/String;)V", "callToActionLabel", "", "getCallToActionIcon", "()Ljava/lang/Integer;", "setCallToActionIcon", "(Ljava/lang/Integer;)V", "callToActionIcon", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "player_release" }, k = 1, mv = { 1, 7, 1 })
public abstract class RedditVideoControls extends FrameLayout
{
    private a<j> onCallToAction;
    private a<j> onFullscreen;
    private a<j> onMute;
    private a<j> onNonUserPause;
    private a<j> onPause;
    private a<j> onPlay;
    private a<j> onReplay;
    private l<? super Float, j> onSeek;
    private l<? super Boolean, j> onVisibilityChanged;
    private SeekBar$OnSeekBarChangeListener seekBarChangeListener;
    
    public RedditVideoControls(final Context context) {
        e.f((Object)context, "context");
        this(context, null, 0, 6, null);
    }
    
    public RedditVideoControls(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        this(context, set, 0, 4, null);
    }
    
    public RedditVideoControls(final Context context, final AttributeSet set, final int n) {
        e.f((Object)context, "context");
        super(context, set, n);
    }
    
    public final j callToAction() {
        final a<j> onCallToAction = this.onCallToAction;
        j a;
        if (onCallToAction != null) {
            onCallToAction.invoke();
            a = j.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final j fullscreen() {
        final a<j> onFullscreen = this.onFullscreen;
        j a;
        if (onFullscreen != null) {
            onFullscreen.invoke();
            a = j.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public abstract Integer getCallToActionIcon();
    
    public abstract String getCallToActionLabel();
    
    public abstract long getDurationMs();
    
    public abstract boolean getHasAudio();
    
    public abstract Model getInitialViewModel();
    
    public abstract Margins getMargins();
    
    public abstract long getPositionMs();
    
    public final SeekBar$OnSeekBarChangeListener getSeekBarChangeListener() {
        return this.seekBarChangeListener;
    }
    
    public abstract Model getViewModel();
    
    public abstract boolean getVisible();
    
    public abstract boolean isFullscreen();
    
    public abstract boolean isMuted();
    
    public final j mute() {
        final a<j> onMute = this.onMute;
        j a;
        if (onMute != null) {
            onMute.invoke();
            a = j.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final j nonUserPause() {
        final a<j> onNonUserPause = this.onNonUserPause;
        j a;
        if (onNonUserPause != null) {
            onNonUserPause.invoke();
            a = j.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final j pause() {
        final a<j> onPause = this.onPause;
        j a;
        if (onPause != null) {
            onPause.invoke();
            a = j.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final j play() {
        final a<j> onPlay = this.onPlay;
        j a;
        if (onPlay != null) {
            onPlay.invoke();
            a = j.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final j replay() {
        final a<j> onReplay = this.onReplay;
        j a;
        if (onReplay != null) {
            onReplay.invoke();
            a = j.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public abstract void reset();
    
    public final j seek(final float n) {
        final l<? super Float, j> onSeek = this.onSeek;
        j a;
        if (onSeek != null) {
            onSeek.invoke(n);
            a = j.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public abstract void setCallToActionIcon(final Integer p0);
    
    public abstract void setCallToActionLabel(final String p0);
    
    public abstract void setDurationMs(final long p0);
    
    public abstract void setFullscreen(final boolean p0);
    
    public abstract void setHasAudio(final boolean p0);
    
    public abstract void setInitialViewModel(final Model p0);
    
    public abstract void setMargins(final Margins p0);
    
    public abstract void setMuted(final boolean p0);
    
    public final void setOnCallToAction$player_release(final a<j> onCallToAction) {
        this.onCallToAction = onCallToAction;
    }
    
    public final void setOnFullscreen$player_release(final a<j> onFullscreen) {
        this.onFullscreen = onFullscreen;
    }
    
    public final void setOnMute$player_release(final a<j> onMute) {
        this.onMute = onMute;
    }
    
    public final void setOnNonUserPause$player_release(final a<j> onNonUserPause) {
        this.onNonUserPause = onNonUserPause;
    }
    
    public final void setOnPause$player_release(final a<j> onPause) {
        this.onPause = onPause;
    }
    
    public final void setOnPlay$player_release(final a<j> onPlay) {
        this.onPlay = onPlay;
    }
    
    public final void setOnReplay$player_release(final a<j> onReplay) {
        this.onReplay = onReplay;
    }
    
    public final void setOnSeek$player_release(final l<? super Float, j> onSeek) {
        this.onSeek = onSeek;
    }
    
    public final void setOnVisibilityChanged$player_release(final l<? super Boolean, j> onVisibilityChanged) {
        this.onVisibilityChanged = onVisibilityChanged;
    }
    
    public abstract void setPositionMs(final long p0);
    
    public final void setSeekBarChangeListener(final SeekBar$OnSeekBarChangeListener seekBarChangeListener) {
        this.seekBarChangeListener = seekBarChangeListener;
    }
    
    public final void setSeekBarChangeListener$player_release(final SeekBar$OnSeekBarChangeListener seekBarChangeListener) {
        this.seekBarChangeListener = seekBarChangeListener;
    }
    
    public abstract void setViewModel(final Model p0);
    
    public abstract void setVisible(final boolean p0);
    
    public final j visibilityChanged(final boolean b) {
        final l<? super Boolean, j> onVisibilityChanged = this.onVisibilityChanged;
        j a;
        if (onVisibilityChanged != null) {
            onVisibilityChanged.invoke(b);
            a = j.a;
        }
        else {
            a = null;
        }
        return a;
    }
}
