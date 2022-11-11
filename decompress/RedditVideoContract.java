// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.view;

import android.graphics.Bitmap;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.reddit.video.player.controls.Margins;
import com.reddit.video.player.player.ViewModelOverride;
import com.reddit.video.player.player.RedditPlayerResizeMode;
import com.reddit.video.player.player.RedditPlayerState;
import com.reddit.video.player.internal.player.PlayerEvent;
import com.reddit.video.player.util.EventDelegate;
import com.reddit.video.player.util.Event;
import android.util.Size;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/video/player/view/RedditVideoContract;", "", "View", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface RedditVideoContract
{
    @Metadata(bv = {}, d1 = { "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J;\u0010\u0010\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u000bH&J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0013H&J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H&J\b\u0010&\u001a\u00020\u0002H&J\b\u0010'\u001a\u00020\u0002H&J\b\u0010(\u001a\u00020\u0002H&J\b\u0010)\u001a\u00020\u0002H&J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\rH&J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H&J\u001b\u0010/\u001a\u00020\u00022\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b/\u00100J\u0012\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u000101H&J\u0012\u00106\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u000104H&R\u001c\u0010;\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010A\u001a\u0004\u0018\u00010<8&@&X¦\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010F\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010I\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\u001c\u0010L\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER\u001c\u0010O\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bM\u00108\"\u0004\bN\u0010:R\u001c\u0010T\u001a\u00020\u00138&@&X¦\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010U\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bU\u0010C\"\u0004\bV\u0010ER\u001e\u0010Y\u001a\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bW\u00108\"\u0004\bX\u0010:R\u001c\u0010\\\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bZ\u0010C\"\u0004\b[\u0010ER\u001c\u0010_\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b]\u0010C\"\u0004\b^\u0010ER\u0016\u0010b\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010dR\u0014\u0010h\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010CR\u0014\u0010\f\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010CR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u00108R\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010u\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010CR\u0016\u0010x\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010\u001a\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020\u000b0{8&X¦\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001d\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010{8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010}R\u001c\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020q0{8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010}R\u0017\u0010\u0089\u0001\u001a\u00020\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0081\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u0081\u0001R\u001c\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\r0{8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010}R\u001c\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\r0{8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010}R\u0017\u0010\u0091\u0001\u001a\u00020\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0081\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0081\u0001R\u001c\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0{8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010}R\u001c\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0{8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010}¨\u0006\u0098\u0001" }, d2 = { "Lcom/reddit/video/player/view/RedditVideoContract$View;", "", "Lhg2/j;", "onPause", "onResume", "retain", "destroy", "", "id", "setId", "url", "", "isLive", "", "initialPosition", "force", "setUrl", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Z)V", "label", "", "drawableResId", "setCallToAction", "setThumbnail", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/reddit/video/player/player/RedditPlayerResizeMode;", "resizeMode", "setResizeMode", "Lcom/reddit/video/player/controls/Margins;", "margins", "setControlsMargins", "fullscreen", "setIsFullscreen", "rawResId", "setViewModels", "", "ratio", "setVideoAspectRatio", "play", "pause", "nonUserPause", "stop", "positionMs", "seek", "", "percentage", "visible", "toggleControlsVisibility", "(Ljava/lang/Boolean;)V", "Lcom/google/android/exoplayer2/upstream/HttpDataSource$a;", "httpDataSourceFactory", "setHTTPDataSourceFactory", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "listener", "setSeekBarChangeListener", "getUiMode", "()Ljava/lang/String;", "setUiMode", "(Ljava/lang/String;)V", "uiMode", "Lcom/reddit/video/player/player/ViewModelOverride;", "getUiOverrides", "()Lcom/reddit/video/player/player/ViewModelOverride;", "setUiOverrides", "(Lcom/reddit/video/player/player/ViewModelOverride;)V", "uiOverrides", "getAutoplay", "()Z", "setAutoplay", "(Z)V", "autoplay", "getLoop", "setLoop", "loop", "getMute", "setMute", "mute", "getControlsClass", "setControlsClass", "controlsClass", "getVideoGravity", "()I", "setVideoGravity", "(I)V", "videoGravity", "isSingleton", "setSingleton", "getOwner", "setOwner", "owner", "getSaveLastFrame", "setSaveLastFrame", "saveLastFrame", "getDisableAudio", "setDisableAudio", "disableAudio", "getHasAudio", "()Ljava/lang/Boolean;", "hasAudio", "getDuration", "()J", "duration", "getPosition", "position", "isPlaying", "getUrl", "Landroid/util/Size;", "getDimensions", "()Landroid/util/Size;", "dimensions", "getAspectRatio", "()F", "aspectRatio", "Lcom/reddit/video/player/player/RedditPlayerState;", "getState", "()Lcom/reddit/video/player/player/RedditPlayerState;", "state", "isAttached", "getRawPlayer", "()Ljava/lang/Object;", "rawPlayer", "getResizeMode", "()Lcom/reddit/video/player/player/RedditPlayerResizeMode;", "Lcom/reddit/video/player/util/Event;", "getOnControlsVisibility", "()Lcom/reddit/video/player/util/Event;", "onControlsVisibility", "Lcom/reddit/video/player/util/EventDelegate;", "getOnFullscreen", "()Lcom/reddit/video/player/util/EventDelegate;", "onFullscreen", "Lcom/reddit/video/player/internal/player/PlayerEvent;", "getOnPlayerEvent", "onPlayerEvent", "getOnPlayerStateChanged", "onPlayerStateChanged", "getOnFirstFrame", "onFirstFrame", "getOnCallToAction", "onCallToAction", "getOnPositionChanged", "onPositionChanged", "getOnDurationChanged", "onDurationChanged", "getOnDoubleTap", "onDoubleTap", "getOnLongPress", "onLongPress", "getOnAttachedToWindow", "onAttachedToWindow", "getOnVideoFocused", "onVideoFocused", "player_release" }, k = 1, mv = { 1, 7, 1 })
    public interface View
    {
        void destroy();
        
        float getAspectRatio();
        
        boolean getAutoplay();
        
        String getControlsClass();
        
        Size getDimensions();
        
        boolean getDisableAudio();
        
        long getDuration();
        
        Boolean getHasAudio();
        
        boolean getLoop();
        
        boolean getMute();
        
        Event<Boolean> getOnAttachedToWindow();
        
        EventDelegate getOnCallToAction();
        
        Event<Boolean> getOnControlsVisibility();
        
        EventDelegate getOnDoubleTap();
        
        Event<Long> getOnDurationChanged();
        
        EventDelegate getOnFirstFrame();
        
        EventDelegate getOnFullscreen();
        
        EventDelegate getOnLongPress();
        
        Event<PlayerEvent> getOnPlayerEvent();
        
        Event<RedditPlayerState> getOnPlayerStateChanged();
        
        Event<Long> getOnPositionChanged();
        
        Event<Boolean> getOnVideoFocused();
        
        String getOwner();
        
        long getPosition();
        
        Object getRawPlayer();
        
        RedditPlayerResizeMode getResizeMode();
        
        boolean getSaveLastFrame();
        
        RedditPlayerState getState();
        
        String getUiMode();
        
        ViewModelOverride getUiOverrides();
        
        String getUrl();
        
        int getVideoGravity();
        
        boolean isAttached();
        
        boolean isLive();
        
        boolean isPlaying();
        
        boolean isSingleton();
        
        void nonUserPause();
        
        void onPause();
        
        void onResume();
        
        void pause();
        
        void play();
        
        void retain();
        
        void seek(final double p0);
        
        void seek(final long p0);
        
        void setAutoplay(final boolean p0);
        
        void setCallToAction(final String p0, final int p1);
        
        void setControlsClass(final String p0);
        
        void setControlsMargins(final Margins p0);
        
        void setDisableAudio(final boolean p0);
        
        void setHTTPDataSourceFactory(final HttpDataSource.a p0);
        
        void setId(final String p0);
        
        void setIsFullscreen(final boolean p0);
        
        void setLoop(final boolean p0);
        
        void setMute(final boolean p0);
        
        void setOwner(final String p0);
        
        void setResizeMode(final RedditPlayerResizeMode p0);
        
        void setSaveLastFrame(final boolean p0);
        
        void setSeekBarChangeListener(final SeekBar$OnSeekBarChangeListener p0);
        
        void setSingleton(final boolean p0);
        
        void setThumbnail(final Bitmap p0);
        
        void setThumbnail(final String p0);
        
        void setUiMode(final String p0);
        
        void setUiOverrides(final ViewModelOverride p0);
        
        void setUrl(final String p0, final Boolean p1, final Long p2, final boolean p3);
        
        void setVideoAspectRatio(final float p0);
        
        void setVideoGravity(final int p0);
        
        void setViewModels(final int p0);
        
        void stop();
        
        void toggleControlsVisibility(final Boolean p0);
        
        @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
        public static final class DefaultImpls
        {
        }
    }
}
