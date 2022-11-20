// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal.player;

import com.google.android.exoplayer2.upstream.cache.Cache;
import kotlinx.coroutines.JobSupport;
import com.google.android.exoplayer2.w;
import wa.y;
import android.util.Size;
import kotlinx.coroutines.CoroutineStart;
import com.reddit.video.player.player.analytics.VideoErrorReport;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.upstream.cache.a$b;
import com.google.android.exoplayer2.upstream.c$a;
import java.util.Map;
import com.google.android.exoplayer2.upstream.e$a;
import java.util.concurrent.CancellationException;
import mg.d0;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import com.google.android.exoplayer2.PlaybackException;
import com.reddit.video.player.player.analytics.FileDownloadPayload;
import bc.h;
import com.google.android.exoplayer2.upstream.a$a;
import javax.inject.Inject;
import android.os.Looper;
import xa.b;
import com.google.android.exoplayer2.w$c;
import ng2.e;
import javax.inject.Named;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wa0.e0;
import android.view.TextureView;
import zi2.c0;
import com.reddit.video.player.player.RedditPlayerState;
import mg2.l;
import com.reddit.network.info.NetworkTypeProvider;
import java.util.Set;
import com.google.android.exoplayer2.source.i;
import android.net.Uri;
import j0.g;
import com.reddit.video.player.MediaHeaders;
import android.graphics.Bitmap;
import com.reddit.video.player.internal.player.loadcontrol.LoadControlProxy;
import com.google.android.exoplayer2.upstream.HttpDataSource$a;
import com.google.android.exoplayer2.upstream.f;
import android.os.Handler;
import com.google.android.exoplayer2.j;
import d20.a;
import wa.c;
import javax.inject.Provider;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ³\u00012\u00020\u0001:\u0006³\u0001´\u0001µ\u0001B£\u0001\b\u0007\u0012\b\b\u0001\u0010B\u001a\u00020A\u0012\u0006\u0010E\u001a\u00020D\u0012\b\u0010ª\u0001\u001a\u00030©\u0001\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010Q\u001a\u00020P\u0012\b\u0010¬\u0001\u001a\u00030«\u0001\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010Y\u001a\u00020X\u0012\b\u0010®\u0001\u001a\u00030\u00ad\u0001\u0012\u0016\b\u0001\u0010°\u0001\u001a\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020/0¯\u0001\u0012\u000e\b\u0001\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[\u0012\u000e\b\u0001\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0[¢\u0006\u0006\b±\u0001\u0010²\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013J\"\u0010\u001a\u001a\u00020\b2\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016j\u0004\u0018\u0001`\u0018J\"\u0010\u001d\u001a\u00020\b2\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016j\u0004\u0018\u0001`\u001cJ\"\u0010\u001f\u001a\u00020\b2\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016j\u0004\u0018\u0001`\u001eJ\"\u0010 \u001a\u00020\b2\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016j\u0004\u0018\u0001`\u001eJ\"\u0010\"\u001a\u00020\b2\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016j\u0004\u0018\u0001`!J\"\u0010%\u001a\u00020\b2\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016j\u0004\u0018\u0001`$J\u001c\u0010(\u001a\u00020\b2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010&j\u0004\u0018\u0001`'J+\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u00020)2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u00108\u001a\u0002072\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0002J\u0012\u0010:\u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\u0004H\u0002J\u0010\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u0002H\u0002J\u0010\u0010=\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u0002H\u0002J\f\u0010@\u001a\u00020?*\u00020>H\u0002R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010Q\u001a\u00020P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR(\u0010e\u001a\u0004\u0018\u00010\u00042\b\u0010d\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR$\u0010i\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bi\u0010c\u001a\u0004\bi\u0010jR*\u0010l\u001a\u00020\u001b2\u0006\u0010k\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010a\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010w\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010c\u001a\u0004\bx\u0010j\"\u0004\by\u0010zR\u0016\u0010{\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010cR\u0016\u0010|\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010cR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020-0}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010cR\u0019\u0010\u0085\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010aR\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0007\u0010\u008c\u0001R(\u0010\u0090\u0001\u001a\u00020\u00042\u0007\u0010\u008d\u0001\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010j\"\u0005\b\u008f\u0001\u0010zR(\u0010\u0094\u0001\u001a\u00020\u00042\u0007\u0010\u0091\u0001\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0092\u0001\u0010j\"\u0005\b\u0093\u0001\u0010zR\u0014\u0010\u0097\u0001\u001a\u00020\u00138F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0014\u0010\u0099\u0001\u001a\u00020\u00138F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0096\u0001R\u0015\u0010\u009d\u0001\u001a\u00030\u009a\u00018F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010jR\u0013\u0010\u009f\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010jR\u0015\u0010¡\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0007\u001a\u0005\b \u0001\u0010tR\u0017\u0010¤\u0001\u001a\u0005\u0018\u00010\u0089\u00018F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u001f\u0010¨\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0005\b§\u0001\u0010j\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¶\u0001" }, d2 = { "Lcom/reddit/video/player/internal/player/RedditVideoPlayer;", "", "", "url", "", "isLive", "Lcom/google/android/exoplayer2/upstream/HttpDataSource$a;", "httpDataSourceFactory", "Lcg2/j;", "prepare", "Landroid/view/TextureView;", "view", "attach", "detach", "retain", "destroy", "play", "pause", "stop", "", "timeMs", "seek", "Lkotlin/Function1;", "", "Lcom/reddit/video/player/internal/FloatDelegate;", "callback", "setOnAspectRatioChanged", "Lcom/reddit/video/player/player/RedditPlayerState;", "Lcom/reddit/video/player/internal/StateDelegate;", "setOnStateChanged", "Lcom/reddit/video/player/internal/LongDelegate;", "setOnPositionChanged", "setOnDurationChanged", "Lcom/reddit/video/player/internal/BooleanDelegate;", "setOnHasAudioChanged", "Lcom/reddit/video/player/internal/player/PlayerEvent;", "Lcom/reddit/video/player/internal/PlayerEventDelegate;", "setOnEvent", "Lkotlin/Function0;", "Lcom/reddit/video/player/internal/Delegate;", "setOnFirstFrame", "Lcom/google/android/exoplayer2/upstream/a$a;", "dataSourceFactory", "Landroid/net/Uri;", "uri", "", "contentType", "Lcom/google/android/exoplayer2/source/i;", "createMediaSource", "(Lcom/google/android/exoplayer2/upstream/a$a;Landroid/net/Uri;ILgg2/c;)Ljava/lang/Object;", "getDataSource", "Lbc/h;", "loadEventInfo", "Lbc/i;", "mediaLoadData", "Lcom/reddit/video/player/player/analytics/FileDownloadPayload;", "getFileDownloadPayloadFromCallback", "cancelIfExists", "createScope", "mimeType", "reportMimeError", "reportMimeErrorIfNeeded", "Lcom/google/android/exoplayer2/PlaybackException;", "", "toThrowable", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/reddit/video/player/internal/player/loadcontrol/LoadControlProxy;", "loadControlProxy", "Lcom/reddit/video/player/internal/player/loadcontrol/LoadControlProxy;", "Lcom/reddit/video/player/internal/player/VideoCache;", "videoCache", "Lcom/reddit/video/player/internal/player/VideoCache;", "Lcom/reddit/video/player/internal/player/MimeReader;", "mimeReader", "Lcom/reddit/video/player/internal/player/MimeReader;", "Lcom/google/android/exoplayer2/upstream/f;", "hlsErrorHandlingPolicy", "Lcom/google/android/exoplayer2/upstream/f;", "Lcom/google/android/exoplayer2/j;", "exoPlayer", "Lcom/google/android/exoplayer2/j;", "getExoPlayer$player_release", "()Lcom/google/android/exoplayer2/j;", "Lcom/reddit/network/info/NetworkTypeProvider;", "networkTypeProvider", "Lcom/reddit/network/info/NetworkTypeProvider;", "Lcom/reddit/video/player/MediaHeaders;", "mediaHeaders", "Lcom/reddit/video/player/MediaHeaders;", "Ljavax/inject/Provider;", "Lwa/c;", "defaultLoadControlProvider", "Ljavax/inject/Provider;", "liveLoadControlProvider", "dashReportedMimeType", "Ljava/lang/String;", "didReportMimeError", "Z", "<set-?>", "hasAudio", "Ljava/lang/Boolean;", "getHasAudio", "()Ljava/lang/Boolean;", "isPlaying", "()Z", "value", "state", "Lcom/reddit/video/player/player/RedditPlayerState;", "getState", "()Lcom/reddit/video/player/player/RedditPlayerState;", "setState", "(Lcom/reddit/video/player/player/RedditPlayerState;)V", "owner", "getOwner", "()Ljava/lang/String;", "setOwner", "(Ljava/lang/String;)V", "saveLastFrame", "getSaveLastFrame", "setSaveLastFrame", "(Z)V", "isPrepareCallRequired", "wasFirstFrameRendered", "", "networkErrorCodes", "Ljava/util/Set;", "textureView", "Landroid/view/TextureView;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "width", "I", "height", "mCurrentUrl", "Landroid/graphics/Bitmap;", "mLastFrame", "Landroid/graphics/Bitmap;", "Lcom/google/android/exoplayer2/upstream/HttpDataSource$a;", "mute", "getMuted", "setMuted", "muted", "enabled", "getLoop", "setLoop", "loop", "getDuration", "()J", "duration", "getPosition", "position", "Landroid/util/Size;", "getDimensions", "()Landroid/util/Size;", "dimensions", "getShouldRetain", "shouldRetain", "getCurrentUrl", "currentUrl", "getLastFrame", "()Landroid/graphics/Bitmap;", "lastFrame", "reportInvalidMimeType$delegate", "Lcg2/f;", "getReportInvalidMimeType", "reportInvalidMimeType", "Ld20/a;", "dispatcherProvider", "Lwa0/e0;", "videoFeatures", "Ldw0/a;", "redditLogger", "Lj0/g;", "mediaSourceCache", "<init>", "(Landroid/content/Context;Lcom/reddit/video/player/internal/player/loadcontrol/LoadControlProxy;Ld20/a;Lcom/reddit/video/player/internal/player/VideoCache;Lcom/reddit/video/player/internal/player/MimeReader;Lcom/google/android/exoplayer2/upstream/f;Lcom/google/android/exoplayer2/j;Lwa0/e0;Lcom/reddit/network/info/NetworkTypeProvider;Lcom/reddit/video/player/MediaHeaders;Ldw0/a;Lj0/g;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "Companion", "ExoAnalyticsListener", "PlayerListener", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideoPlayer
{
    public static final Companion Companion;
    public static final int ERROR_INVALID_MIME_TYPE_CODE = -43;
    private static final long POSITION_DELAY_MS = 100L;
    private final Context context;
    private String dashReportedMimeType;
    private final Provider<c> defaultLoadControlProvider;
    private boolean didReportMimeError;
    private final a dispatcherProvider;
    private final j exoPlayer;
    private final Handler handler;
    private Boolean hasAudio;
    private int height;
    private final f hlsErrorHandlingPolicy;
    private HttpDataSource$a httpDataSourceFactory;
    private boolean isPlaying;
    private boolean isPrepareCallRequired;
    private final Provider<c> liveLoadControlProvider;
    private final LoadControlProxy loadControlProxy;
    private String mCurrentUrl;
    private Bitmap mLastFrame;
    private final MediaHeaders mediaHeaders;
    private final g<Uri, i> mediaSourceCache;
    private final MimeReader mimeReader;
    private final Set<Integer> networkErrorCodes;
    private final NetworkTypeProvider networkTypeProvider;
    private l<? super Float, cg2.j> onAspectRatioDelegate;
    private l<? super Long, cg2.j> onDurationDelegate;
    private l<? super PlayerEvent, cg2.j> onEventCallback;
    private mg2.a<cg2.j> onFirstFrameDelegate;
    private l<? super Boolean, cg2.j> onHasAudioDelegate;
    private l<? super Long, cg2.j> onPositionDelegate;
    private l<? super RedditPlayerState, cg2.j> onStateDelegate;
    private String owner;
    private c0 playbackScope;
    private final dw0.a redditLogger;
    private final cg2.f reportInvalidMimeType$delegate;
    private boolean retain;
    private boolean saveLastFrame;
    private RedditPlayerState state;
    private TextureView textureView;
    private final VideoCache videoCache;
    private final e0 videoFeatures;
    private boolean wasFirstFrameRendered;
    private int width;
    
    static {
        Companion = new Companion(null);
    }
    
    @Inject
    public RedditVideoPlayer(final Context context, final LoadControlProxy loadControlProxy, final a dispatcherProvider, final VideoCache videoCache, final MimeReader mimeReader, final f hlsErrorHandlingPolicy, final j exoPlayer, final e0 videoFeatures, final NetworkTypeProvider networkTypeProvider, final MediaHeaders mediaHeaders, final dw0.a redditLogger, @Named("MEDIA_SOURCE_CACHE") final g<Uri, i> mediaSourceCache, @Named("DEFAULT_LOAD_CONTROL") final Provider<c> defaultLoadControlProvider, @Named("LIVE_LOAD_CONTROL") final Provider<c> liveLoadControlProvider) {
        e.f((Object)context, "context");
        e.f((Object)loadControlProxy, "loadControlProxy");
        e.f((Object)dispatcherProvider, "dispatcherProvider");
        e.f((Object)videoCache, "videoCache");
        e.f((Object)mimeReader, "mimeReader");
        e.f((Object)hlsErrorHandlingPolicy, "hlsErrorHandlingPolicy");
        e.f((Object)exoPlayer, "exoPlayer");
        e.f((Object)videoFeatures, "videoFeatures");
        e.f((Object)networkTypeProvider, "networkTypeProvider");
        e.f((Object)mediaHeaders, "mediaHeaders");
        e.f((Object)redditLogger, "redditLogger");
        e.f((Object)mediaSourceCache, "mediaSourceCache");
        e.f((Object)defaultLoadControlProvider, "defaultLoadControlProvider");
        e.f((Object)liveLoadControlProvider, "liveLoadControlProvider");
        this.context = context;
        this.loadControlProxy = loadControlProxy;
        this.dispatcherProvider = dispatcherProvider;
        this.videoCache = videoCache;
        this.mimeReader = mimeReader;
        this.hlsErrorHandlingPolicy = hlsErrorHandlingPolicy;
        this.exoPlayer = exoPlayer;
        this.videoFeatures = videoFeatures;
        this.networkTypeProvider = networkTypeProvider;
        this.mediaHeaders = mediaHeaders;
        this.redditLogger = redditLogger;
        this.mediaSourceCache = mediaSourceCache;
        this.defaultLoadControlProvider = defaultLoadControlProvider;
        this.liveLoadControlProvider = liveLoadControlProvider;
        ((w)exoPlayer).R((w$c)new RedditVideoPlayer.RedditVideoPlayer$PlayerListener(this));
        exoPlayer.E((b)new RedditVideoPlayer.RedditVideoPlayer$ExoAnalyticsListener(this));
        if (videoFeatures.I6()) {
            exoPlayer.E((b)new bd.i());
        }
        mimeReader.setOnSelectingVideoMediaCodec((l<? super String, cg2.j>)new RedditVideoPlayer$2((Object)this));
        this.reportInvalidMimeType$delegate = kotlin.a.b((mg2.a)new RedditVideoPlayer$reportInvalidMimeType$2(this));
        this.state = RedditPlayerState.IDLE;
        this.networkErrorCodes = zd.b.b1(2001, 2002, 1003, 2000);
        this.handler = new Handler(Looper.getMainLooper());
    }
    
    public static final Object access$createMediaSource(final RedditVideoPlayer redditVideoPlayer, final a$a a$a, final Uri uri, final int n, final gg2.c c) {
        return redditVideoPlayer.createMediaSource(a$a, uri, n, c);
    }
    
    public static final String access$getDashReportedMimeType$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.dashReportedMimeType;
    }
    
    public static final a$a access$getDataSource(final RedditVideoPlayer redditVideoPlayer, final HttpDataSource$a httpDataSource$a, final boolean b) {
        return redditVideoPlayer.getDataSource(httpDataSource$a, b);
    }
    
    public static final boolean access$getDidReportMimeError$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.didReportMimeError;
    }
    
    public static final a access$getDispatcherProvider$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.dispatcherProvider;
    }
    
    public static final FileDownloadPayload access$getFileDownloadPayloadFromCallback(final RedditVideoPlayer redditVideoPlayer, final h h, final bc.i i) {
        return redditVideoPlayer.getFileDownloadPayloadFromCallback(h, i);
    }
    
    public static final Handler access$getHandler$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.handler;
    }
    
    public static final int access$getHeight$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.height;
    }
    
    public static final f access$getHlsErrorHandlingPolicy$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.hlsErrorHandlingPolicy;
    }
    
    public static final g access$getMediaSourceCache$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.mediaSourceCache;
    }
    
    public static final MimeReader access$getMimeReader$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.mimeReader;
    }
    
    public static final Set access$getNetworkErrorCodes$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.networkErrorCodes;
    }
    
    public static final NetworkTypeProvider access$getNetworkTypeProvider$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.networkTypeProvider;
    }
    
    public static final l access$getOnAspectRatioDelegate$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.onAspectRatioDelegate;
    }
    
    public static final l access$getOnDurationDelegate$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.onDurationDelegate;
    }
    
    public static final l access$getOnEventCallback$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.onEventCallback;
    }
    
    public static final mg2.a access$getOnFirstFrameDelegate$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.onFirstFrameDelegate;
    }
    
    public static final l access$getOnHasAudioDelegate$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.onHasAudioDelegate;
    }
    
    public static final l access$getOnPositionDelegate$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.onPositionDelegate;
    }
    
    public static final boolean access$getReportInvalidMimeType(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.getReportInvalidMimeType();
    }
    
    public static final e0 access$getVideoFeatures$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.videoFeatures;
    }
    
    public static final int access$getWidth$p(final RedditVideoPlayer redditVideoPlayer) {
        return redditVideoPlayer.width;
    }
    
    public static final void access$reportMimeError(final RedditVideoPlayer redditVideoPlayer, final String s) {
        redditVideoPlayer.reportMimeError(s);
    }
    
    public static final void access$reportMimeErrorIfNeeded(final RedditVideoPlayer redditVideoPlayer, final String s) {
        redditVideoPlayer.reportMimeErrorIfNeeded(s);
    }
    
    public static final void access$setDashReportedMimeType$p(final RedditVideoPlayer redditVideoPlayer, final String dashReportedMimeType) {
        redditVideoPlayer.dashReportedMimeType = dashReportedMimeType;
    }
    
    public static final void access$setDidReportMimeError$p(final RedditVideoPlayer redditVideoPlayer, final boolean didReportMimeError) {
        redditVideoPlayer.didReportMimeError = didReportMimeError;
    }
    
    public static final void access$setHasAudio$p(final RedditVideoPlayer redditVideoPlayer, final Boolean hasAudio) {
        redditVideoPlayer.hasAudio = hasAudio;
    }
    
    public static final void access$setHeight$p(final RedditVideoPlayer redditVideoPlayer, final int height) {
        redditVideoPlayer.height = height;
    }
    
    public static final void access$setMCurrentUrl$p(final RedditVideoPlayer redditVideoPlayer, final String mCurrentUrl) {
        redditVideoPlayer.mCurrentUrl = mCurrentUrl;
    }
    
    public static final void access$setPlaying$p(final RedditVideoPlayer redditVideoPlayer, final boolean isPlaying) {
        redditVideoPlayer.isPlaying = isPlaying;
    }
    
    public static final void access$setPrepareCallRequired$p(final RedditVideoPlayer redditVideoPlayer, final boolean isPrepareCallRequired) {
        redditVideoPlayer.isPrepareCallRequired = isPrepareCallRequired;
    }
    
    public static final void access$setWasFirstFrameRendered$p(final RedditVideoPlayer redditVideoPlayer, final boolean wasFirstFrameRendered) {
        redditVideoPlayer.wasFirstFrameRendered = wasFirstFrameRendered;
    }
    
    public static final void access$setWidth$p(final RedditVideoPlayer redditVideoPlayer, final int width) {
        redditVideoPlayer.width = width;
    }
    
    public static final Throwable access$toThrowable(final RedditVideoPlayer redditVideoPlayer, final PlaybackException ex) {
        return redditVideoPlayer.toThrowable(ex);
    }
    
    private final Object createMediaSource(final a$a a$a, final Uri uri, final int n, final gg2.c<? super i> c) {
        return zi2.g.j((CoroutineContext)this.dispatcherProvider.c(), (p)new RedditVideoPlayer$createMediaSource$2(n, a$a, this, uri, (gg2.c)null), c);
    }
    
    private final void createScope(final boolean b) {
        if (b) {
            final c0 playbackScope = this.playbackScope;
            if (playbackScope != null) {
                d0.o(playbackScope, (CancellationException)null);
            }
        }
        else if (this.playbackScope != null) {
            return;
        }
        this.playbackScope = (c0)d0.c(((JobSupport)zi2.h.b()).plus((CoroutineContext)this.dispatcherProvider.d()).plus((CoroutineContext)h30.a.a));
    }
    
    public static void createScope$default(final RedditVideoPlayer redditVideoPlayer, boolean b, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        redditVideoPlayer.createScope(b);
    }
    
    private final a$a getDataSource(HttpDataSource$a b, final boolean b2) {
        Object o = b;
        if (b == null) {
            o = new e$a();
        }
        b = ((HttpDataSource$a)o).b((Map)this.mediaHeaders.headerMap());
        e.e((Object)b, "httpDataSourceFactory ?:\u2026mediaHeaders.headerMap())");
        final c$a d = new c$a(this.context, b);
        final com.google.android.exoplayer2.upstream.cache.c cache = this.videoCache.getCache(this.context, this.redditLogger);
        Object o2 = d;
        if (cache != null) {
            if (b2) {
                o2 = d;
            }
            else {
                o2 = new a$b();
                ((a$b)o2).a = (Cache)cache;
                ((a$b)o2).d = (a$a)d;
                ((a$b)o2).e = 2;
            }
        }
        return (a$a)o2;
    }
    
    private final FileDownloadPayload getFileDownloadPayloadFromCallback(final h h, final bc.i i) {
        final n c = i.c;
        final String s = null;
        Integer value;
        if (c != null) {
            value = c.m;
        }
        else {
            value = null;
        }
        final String authority = h.a.getAuthority();
        final long c2 = h.c;
        final n c3 = i.c;
        String p2 = s;
        if (c3 != null) {
            p2 = c3.p;
        }
        return new FileDownloadPayload(value, authority, c2, p2);
    }
    
    private final boolean getReportInvalidMimeType() {
        return (boolean)this.reportInvalidMimeType$delegate.getValue();
    }
    
    private final void reportMimeError(final String s) {
        final PlayerEvent$Error playerEvent$Error = new PlayerEvent$Error(Integer.valueOf(0), (Throwable)null, new VideoErrorReport(-43, a.r(a.t("Mime type from dash manifest:"), this.dashReportedMimeType, " is different than the one used to select the codec:", s), null, null, 12, null), 2, (DefaultConstructorMarker)null);
        final l<? super PlayerEvent, cg2.j> onEventCallback = this.onEventCallback;
        if (onEventCallback != null) {
            onEventCallback.invoke((Object)playerEvent$Error);
        }
    }
    
    private final void reportMimeErrorIfNeeded(final String s) {
        final c0 playbackScope = this.playbackScope;
        if (playbackScope != null) {
            zi2.g.g(playbackScope, null, null, (p)new RedditVideoPlayer$reportMimeErrorIfNeeded$1(this, s, (gg2.c)null), 3);
        }
    }
    
    private final Throwable toThrowable(final PlaybackException ex) {
        return new Throwable(ex.getErrorCodeName());
    }
    
    public final void attach(final TextureView textureView) {
        e.f((Object)textureView, "view");
        this.textureView = textureView;
        this.createScope(false);
        ((w)this.exoPlayer).L(textureView);
        this.retain = false;
    }
    
    public final void destroy() {
        this.retain = false;
    }
    
    public final void detach() {
        final c0 playbackScope = this.playbackScope;
        if (playbackScope != null) {
            d0.o(playbackScope, (CancellationException)null);
        }
        ((w)this.exoPlayer).s(this.textureView);
        this.handler.removeCallbacksAndMessages((Object)null);
        this.textureView = null;
        if (this.videoFeatures.L()) {
            this.mCurrentUrl = null;
        }
    }
    
    public final String getCurrentUrl() {
        return this.mCurrentUrl;
    }
    
    public final Size getDimensions() {
        return new Size(this.width, this.height);
    }
    
    public final long getDuration() {
        return Math.max(0L, ((w)this.exoPlayer).getDuration());
    }
    
    public final j getExoPlayer$player_release() {
        return this.exoPlayer;
    }
    
    public final Boolean getHasAudio() {
        return this.hasAudio;
    }
    
    public final Bitmap getLastFrame() {
        return this.mLastFrame;
    }
    
    public final boolean getLoop() {
        return ((w)this.exoPlayer).l() != 0;
    }
    
    public final boolean getMuted() {
        return ((w)this.exoPlayer).getVolume() == 0.0f;
    }
    
    public final String getOwner() {
        return this.owner;
    }
    
    public final long getPosition() {
        return Math.max(0L, ((w)this.exoPlayer).getCurrentPosition());
    }
    
    public final boolean getSaveLastFrame() {
        return this.saveLastFrame;
    }
    
    public final boolean getShouldRetain() {
        return this.retain;
    }
    
    public final RedditPlayerState getState() {
        return this.state;
    }
    
    public final boolean isLive() {
        return ((w)this.exoPlayer).z() && ((w)this.exoPlayer).U();
    }
    
    public final boolean isPlaying() {
        return this.isPlaying;
    }
    
    public final void pause() {
        ((w)this.exoPlayer).C(false);
    }
    
    public final void play() {
        if (this.isPrepareCallRequired) {
            ((w)this.exoPlayer).prepare();
            this.isPrepareCallRequired = false;
        }
        ((w)this.exoPlayer).C(true);
    }
    
    public final void prepare(final String mCurrentUrl, final boolean b, final HttpDataSource$a httpDataSourceFactory) {
        e.f((Object)mCurrentUrl, "url");
        this.httpDataSourceFactory = httpDataSourceFactory;
        if (e.a((Object)this.mCurrentUrl, (Object)mCurrentUrl)) {
            return;
        }
        if (this.getReportInvalidMimeType()) {
            this.mCurrentUrl = mCurrentUrl;
        }
        this.didReportMimeError = false;
        createScope$default(this, this.wasFirstFrameRendered = false, 1, null);
        final Uri parse = Uri.parse(mCurrentUrl);
        final l<? super PlayerEvent, cg2.j> onEventCallback = this.onEventCallback;
        if (onEventCallback != null) {
            onEventCallback.invoke((Object)new PlayerEvent$SourceChanged(parse.toString()));
        }
        final LoadControlProxy loadControlProxy = this.loadControlProxy;
        Object o;
        String s;
        if (b) {
            o = this.liveLoadControlProvider.get();
            s = "liveLoadControlProvider.get()";
        }
        else {
            o = this.defaultLoadControlProvider.get();
            s = "defaultLoadControlProvider.get()";
        }
        e.e(o, s);
        loadControlProxy.setLoadControl((y)o);
        final c0 playbackScope = this.playbackScope;
        if (playbackScope != null) {
            zi2.g.g(playbackScope, null, null, (p)new RedditVideoPlayer$prepare$1(parse, this, httpDataSourceFactory, b, mCurrentUrl, (gg2.c)null), 3);
        }
    }
    
    public final void retain() {
        this.retain = true;
        if (this.saveLastFrame) {
            final TextureView textureView = this.textureView;
            Bitmap bitmap;
            if (textureView != null) {
                bitmap = textureView.getBitmap();
            }
            else {
                bitmap = null;
            }
            this.mLastFrame = bitmap;
        }
    }
    
    public final void seek(final long n) {
        ((w)this.exoPlayer).seekTo(n);
        if (!this.isPlaying) {
            final l<? super Long, cg2.j> onPositionDelegate = this.onPositionDelegate;
            if (onPositionDelegate != null) {
                onPositionDelegate.invoke((Object)n);
            }
        }
    }
    
    public final void setLoop(final boolean b) {
        final j exoPlayer = this.exoPlayer;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        ((w)exoPlayer).o(n);
    }
    
    public final void setMuted(final boolean b) {
        final j exoPlayer = this.exoPlayer;
        float volume;
        if (b) {
            volume = 0.0f;
        }
        else {
            volume = 1.0f;
        }
        ((w)exoPlayer).setVolume(volume);
    }
    
    public final void setOnAspectRatioChanged(final l<? super Float, cg2.j> onAspectRatioDelegate) {
        this.onAspectRatioDelegate = onAspectRatioDelegate;
    }
    
    public final void setOnDurationChanged(final l<? super Long, cg2.j> onDurationDelegate) {
        this.onDurationDelegate = onDurationDelegate;
    }
    
    public final void setOnEvent(final l<? super PlayerEvent, cg2.j> onEventCallback) {
        this.onEventCallback = onEventCallback;
    }
    
    public final void setOnFirstFrame(final mg2.a<cg2.j> onFirstFrameDelegate) {
        this.onFirstFrameDelegate = onFirstFrameDelegate;
    }
    
    public final void setOnHasAudioChanged(final l<? super Boolean, cg2.j> onHasAudioDelegate) {
        this.onHasAudioDelegate = onHasAudioDelegate;
    }
    
    public final void setOnPositionChanged(final l<? super Long, cg2.j> onPositionDelegate) {
        this.onPositionDelegate = onPositionDelegate;
    }
    
    public final void setOnStateChanged(final l<? super RedditPlayerState, cg2.j> onStateDelegate) {
        this.onStateDelegate = onStateDelegate;
    }
    
    public final void setOwner(final String owner) {
        this.owner = owner;
    }
    
    public final void setSaveLastFrame(final boolean saveLastFrame) {
        this.saveLastFrame = saveLastFrame;
    }
    
    public final void setState(final RedditPlayerState state) {
        e.f((Object)state, "value");
        this.state = state;
        final l<? super RedditPlayerState, cg2.j> onStateDelegate = this.onStateDelegate;
        if (onStateDelegate != null) {
            onStateDelegate.invoke((Object)state);
        }
    }
    
    public final void stop() {
        ((w)this.exoPlayer).stop();
        this.mCurrentUrl = null;
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lcom/reddit/video/player/internal/player/RedditVideoPlayer$Companion;", "", "()V", "ERROR_INVALID_MIME_TYPE_CODE", "", "POSITION_DELAY_MS", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
