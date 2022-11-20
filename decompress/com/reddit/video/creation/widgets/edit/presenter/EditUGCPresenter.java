// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.edit.presenter;

import com.reddit.video.creation.widgets.edit.view.PollView;
import com.reddit.video.creation.usecases.base.SingleUseCase;
import com.reddit.video.creation.usecases.base.ObservableUseCase;
import com.reddit.video.creation.widgets.edit.view.SaveVideoView;
import com.reddit.video.creation.widgets.base.interfaces.LoadingView;
import com.reddit.video.creation.widgets.edit.view.GoBackView;
import com.reddit.video.creation.widgets.edit.view.OverlayView;
import com.reddit.video.creation.widgets.base.AbstractPresenter;
import com.reddit.video.creation.widgets.edit.view.EditView;
import android.os.Bundle;
import com.reddit.video.creation.models.poll.PollInfo;
import com.reddit.video.creation.analytics.UnMute;
import com.reddit.video.creation.analytics.Mute;
import com.reddit.video.creation.analytics.ScreenVisible;
import com.reddit.video.creation.analytics.screen.ScreenId;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import com.reddit.video.creation.models.adjustclips.InitialClipData$Adjusted;
import java.util.Collection;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import com.reddit.video.creation.models.adjustclips.AdjustedClip;
import android.net.Uri;
import c6.k;
import java.io.IOException;
import com.reddit.video.creation.api.output.RecordedSegmentKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.os.Build$VERSION;
import f40.z;
import ia.c;
import com.reddit.video.creation.usecases.render.RenderAudioResult;
import af2.y;
import com.reddit.video.creation.usecases.render.RenderAudioResult$Success;
import com.reddit.video.creation.usecases.render.RenderingConfig;
import mg2.l;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Arrays;
import com.reddit.video.creation.usecases.render.RenderVideoResult$Success;
import com.reddit.video.creation.usecases.render.RenderVideoResult$InProgress;
import com.reddit.video.creation.usecases.render.RenderVideoResult;
import com.reddit.video.creation.analytics.Analytics;
import com.reddit.video.creation.analytics.FlowType;
import com.reddit.video.creation.analytics.Tap;
import com.reddit.video.creation.analytics.TapTarget;
import com.reddit.video.creation.widgets.base.BaseMVPView;
import com.reddit.video.creation.widgets.base.BaseMVPView$DefaultImpls;
import cg2.j;
import com.reddit.video.creation.eventbus.EventBus$NavigationEvent;
import com.reddit.video.creation.eventbus.EventBus$NavigationEvent$OpenAdjustClipsFragment;
import com.reddit.video.creation.models.adjustclips.AdjustClipsLaunchData;
import com.reddit.video.creation.models.adjustclips.AdjustClipsFlowType;
import com.reddit.video.creation.models.voiceover.VoiceoverItem;
import com.reddit.video.creation.api.configuration.VideoCreationConfiguration;
import af2.c0;
import io.reactivex.internal.functions.Functions;
import af2.n;
import io.reactivex.plugins.RxJavaPlugins;
import mf2.f;
import af2.g0;
import kotlin.Pair;
import com.google.android.exoplayer2.w$c;
import ff2.g;
import com.reddit.video.creation.widgets.utils.player.SimplePlayerExtensionsKt;
import com.google.android.exoplayer2.a0$a;
import com.reddit.video.creation.models.camera.CameraDirection;
import com.reddit.video.creation.models.recording.RecordDubType;
import java.util.Date;
import java.util.Iterator;
import android.graphics.Bitmap;
import com.reddit.video.creation.models.sticker.TextOverlayInfo;
import dg2.m;
import com.reddit.video.creation.video.render.models.TextStickerFilePathData;
import android.graphics.Bitmap$CompressFormat;
import com.reddit.video.creation.widgets.utils.DateExtensionsKt;
import java.util.Calendar;
import com.reddit.video.creation.video.render.models.TextStickerData;
import cg.d;
import com.reddit.video.creation.widgets.utils.image.BitmapUtils;
import com.reddit.video.creation.usecases.render.PostVideoConfig;
import javax.inject.Inject;
import ff2.o;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import ng2.e;
import javax.inject.Named;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.video.creation.api.configuration.WorkManagerConfig;
import com.reddit.video.creation.models.voiceover.VoiceoverData;
import com.google.android.exoplayer2.a0;
import com.reddit.video.creation.video.render.VideoConfigMaker;
import com.reddit.video.creation.api.output.MergedVideo;
import com.reddit.video.creation.api.output.RecordedSegment;
import android.media.MediaPlayer;
import com.reddit.video.creation.usecases.render.RenderVideoUseCaseFactory;
import java.io.File;
import com.reddit.video.creation.usecases.render.RenderAudioUseCaseFactory;
import af2.t;
import df2.a;
import com.reddit.video.creation.player.interfaces.MediaPlayerApi;
import com.google.android.exoplayer2.q;
import com.reddit.video.creation.models.adjustclips.InitialClipData;
import java.util.List;
import com.reddit.video.creation.api.configuration.FeatureConfig;
import com.reddit.video.creation.eventbus.EventBus;
import com.reddit.video.creation.widgets.edit.EditUgcExtras;
import com.reddit.video.creation.api.configuration.CreationConfiguration;
import com.reddit.video.creation.state.AspectRatioConfig;
import android.content.Context;
import kotlin.Metadata;
import com.reddit.video.creation.widgets.utils.di.scopes.FragmentScope;
import com.reddit.video.creation.widgets.edit.view.EditUGCView;
import com.reddit.video.creation.widgets.base.VideoPlayerAbstractPresenter;

@FragmentScope
@Metadata(bv = {}, d1 = { "\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00cd\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u00cd\u0001B\u008d\u0001\b\u0007\u0012\b\b\u0001\u0010l\u001a\u00020k\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010t\u001a\u00020s\u0012\u0006\u0010y\u001a\u00020x\u0012\u0006\u0010|\u001a\u00020{\u0012\u0006\u0010\u007f\u001a\u00020~\u0012\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001\u0012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001\u0012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001\u0012\n\b\u0001\u0010\u008b\u0001\u001a\u00030\u008a\u0001\u0012\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001\u0012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u0012\u000e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0093\u0001¢\u0006\u0006\b\u00cb\u0001\u0010\u00cc\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0006\u0010\f\u001a\u00020\nJ\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001c\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\nJ\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\nJ\u0014\u0010#\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 J\b\u0010$\u001a\u00020\nH\u0016J\u0006\u0010%\u001a\u00020\nJ\u0006\u0010&\u001a\u00020\nJ\u0006\u0010'\u001a\u00020\nJ\u0010\u0010)\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\u0003J\u0006\u0010*\u001a\u00020\nJ\u0006\u0010+\u001a\u00020\nJ\u0014\u0010.\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0 J\u0010\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\bH\u0016J\u0006\u00101\u001a\u00020\nJ!\u00106\u001a\u0002042\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u0006\u00108\u001a\u00020\nJ\u0010\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0003H\u0016J\b\u0010;\u001a\u00020\nH\u0002J\u0016\u0010=\u001a\u00020\n2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002040 H\u0002J\u0018\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u0002042\u0006\u00105\u001a\u000204H\u0002J\u0010\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u001aH\u0002J\b\u0010B\u001a\u00020\nH\u0002J\b\u0010C\u001a\u00020\nH\u0002J\b\u0010D\u001a\u00020\nH\u0002J\u0012\u0010F\u001a\u0004\u0018\u00010E2\u0006\u00105\u001a\u000204H\u0002J\u0010\u0010I\u001a\u00020\n2\u0006\u0010H\u001a\u00020GH\u0002J\b\u0010J\u001a\u00020\nH\u0002J\b\u0010K\u001a\u00020\nH\u0002J\b\u0010L\u001a\u00020\nH\u0002J\u0010\u0010N\u001a\u00020M2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010O\u001a\u00020\u0003H\u0002J\u0011\u0010P\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bP\u0010QJ\b\u0010R\u001a\u00020\nH\u0002J+\u0010U\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0S\"\u00020\u001aH\u0002¢\u0006\u0004\bU\u0010VJ\b\u0010W\u001a\u00020\nH\u0002J\u0010\u0010Z\u001a\u00020\n2\u0006\u0010Y\u001a\u00020XH\u0002J\u0016\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00030]2\u0006\u0010\\\u001a\u00020[H\u0002J\u0012\u0010`\u001a\u00020[2\b\b\u0002\u0010_\u001a\u00020\u0003H\u0002J\b\u0010a\u001a\u00020\nH\u0002J\u0016\u0010e\u001a\u00020\n2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0bH\u0002J\u0010\u0010g\u001a\u00020\n2\u0006\u0010f\u001a\u00020cH\u0002J\u0016\u0010i\u001a\u00020\n2\f\u0010h\u001a\b\u0012\u0004\u0012\u0002020 H\u0002J\b\u0010j\u001a\u00020\nH\u0002R\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0017\u0010o\u001a\u00020n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010t\u001a\u00020s8\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001d\u0010h\u001a\b\u0012\u0004\u0012\u0002020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bh\u0010\u0096\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0007\u0010\u0099\u0001R)\u0010\u009a\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u0098\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R)\u0010\u009e\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0098\u0001\u001a\u0006\b\u009e\u0001\u0010\u009b\u0001\"\u0006\b\u009f\u0001\u0010\u009d\u0001R\u0019\u0010 \u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0098\u0001R\u0019\u0010¡\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010£\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0098\u0001R \u0010¥\u0001\u001a\t\u0012\u0005\u0012\u00030¤\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010\u0096\u0001R1\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010¦\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010\u0096\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R*\u0010®\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R\u0019\u0010´\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010\u0098\u0001R\u001b\u0010µ\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R+\u0010·\u0001\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u001c\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001c\u0010\u00c1\u0001\u001a\u0005\u0018\u00010\u00c0\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00c1\u0001\u0010\u00c2\u0001R\u001b\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010 8F¢\u0006\b\u001a\u0006\b\u00c3\u0001\u0010ª\u0001R\u0017\u0010\u00c5\u0001\u001a\u00020\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00c4\u0001\u0010\u009b\u0001R\u0017\u0010\u00c7\u0001\u001a\u00020\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00c6\u0001\u0010\u009b\u0001R\u0017\u0010\u00ca\u0001\u001a\u0002048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00c8\u0001\u0010\u00c9\u0001¨\u0006\u00ce\u0001" }, d2 = { "Lcom/reddit/video/creation/widgets/edit/presenter/EditUGCPresenter;", "Lcom/reddit/video/creation/widgets/base/VideoPlayerAbstractPresenter;", "Lcom/reddit/video/creation/widgets/edit/view/EditUGCView;", "", "onBackPressed", "view", "Lcom/reddit/video/creation/widgets/edit/EditUgcExtras;", "editUgcExtras", "Landroid/os/Bundle;", "savedState", "Lcg2/j;", "viewCreated", "onCreate", "onPause", "onResume", "onUserPressedBack", "onPostClicked", "onDrawingAdded", "onOverlayTextAdded", "onPollDeleted", "Lcom/reddit/video/creation/models/poll/PollInfo;", "info", "pollInputDone", "", "videoWidth", "onSaveClicked", "", "saveDrawingBitmap", "resetSaveState", "onOverlayChanged", "onPollMoved", "onAdjustClipsClicked", "", "Lcom/reddit/video/creation/models/adjustclips/AdjustedClip;", "adjustedClips", "onAdjustedClipsUpdated", "onDestroyView", "resumePlayback", "restartPlayback", "pausePlayback", "forcePaused", "stopPlayback", "onVideoTap", "onAddOverlayClicked", "Lcom/reddit/video/creation/models/sticker/TextOverlayInfo;", "overlayInfos", "onTextOverlaysUpdated", "outState", "saveState", "onAddDrawingClicked", "Lcom/google/android/exoplayer2/q;", "currentMediaItem", "", "currentPosition", "getAdjustedCurrentPosition", "(Lcom/google/android/exoplayer2/q;Ljava/lang/Long;)J", "onDrawingRemoved", "hidden", "onHiddenChanged", "createVideoPlayer", "progress", "onVideoPlayerProgressUpdated", "previousPosition", "playVoiceoverSampleIfRequired", "filePath", "playSampleSound", "stopSampleSound", "muteSampleSound", "unmuteSampleSound", "Lcom/reddit/video/creation/models/voiceover/VoiceoverItem;", "getNextPlayableVoiceoverItem", "Lcom/reddit/video/creation/models/voiceover/VoiceoverData;", "voiceover", "saveVoiceover", "observeAdjustClips", "playCurrentSegments", "initializeGoBackFlow", "Ldf2/a;", "displayDialogWhenVideoHasEffects", "shouldRemoveLastSegment", "handleGoingBackForVideosRecordedCompletely", "()Lcg2/j;", "goBackAndDeleteLastSegment", "", "requiredPermissions", "handleSaveVideo", "(I[Ljava/lang/String;)V", "onSaveVideoSuccess", "", "throwable", "onSaveVideoFail", "Lcom/reddit/video/creation/usecases/render/PostVideoConfig;", "postVideoConfig", "Laf2/c0;", "saveVideo", "addWatermark", "createPostVideoConfig", "goToAdjustClipsScreen", "Laf2/t;", "Lcom/reddit/video/creation/usecases/render/RenderVideoResult;", "renderObservable", "renderAndWaitForResult", "result", "handleRenderingResult", "mediaItems", "preparePlaylist", "updateOriginalAudioState", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Lcom/reddit/video/creation/player/interfaces/MediaPlayerApi;", "mediaPlayer", "Lcom/reddit/video/creation/player/interfaces/MediaPlayerApi;", "getMediaPlayer", "()Lcom/reddit/video/creation/player/interfaces/MediaPlayerApi;", "Lcom/reddit/video/creation/eventbus/EventBus;", "eventBus", "Lcom/reddit/video/creation/eventbus/EventBus;", "getEventBus", "()Lcom/reddit/video/creation/eventbus/EventBus;", "Lcom/reddit/video/creation/api/configuration/CreationConfiguration;", "creationConfiguration", "Lcom/reddit/video/creation/api/configuration/CreationConfiguration;", "Lcom/reddit/video/creation/api/configuration/FeatureConfig;", "featureConfig", "Lcom/reddit/video/creation/api/configuration/FeatureConfig;", "Lcom/reddit/video/creation/widgets/edit/presenter/SaveLocalVideoUseCaseFactory;", "saveLocalVideoUseCaseFactory", "Lcom/reddit/video/creation/widgets/edit/presenter/SaveLocalVideoUseCaseFactory;", "Lcom/reddit/video/creation/api/configuration/WorkManagerConfig;", "workManagerConfig", "Lcom/reddit/video/creation/api/configuration/WorkManagerConfig;", "Lcom/reddit/video/creation/usecases/render/RenderVideoUseCaseFactory;", "renderVideoUseCaseFactory", "Lcom/reddit/video/creation/usecases/render/RenderVideoUseCaseFactory;", "Lcom/reddit/video/creation/usecases/render/RenderAudioUseCaseFactory;", "renderAudioUseCaseFactory", "Lcom/reddit/video/creation/usecases/render/RenderAudioUseCaseFactory;", "Ljava/io/File;", "renderVideoDir", "Ljava/io/File;", "Lcom/reddit/video/creation/video/render/VideoConfigMaker;", "videoConfigMaker", "Lcom/reddit/video/creation/video/render/VideoConfigMaker;", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "aspectRatioConfig", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "Lcom/reddit/video/creation/widgets/edit/presenter/EditContentPresenter;", "editContentPresenter", "Lcom/reddit/video/creation/widgets/edit/presenter/EditContentPresenter;", "Ljava/util/List;", "lockVideoSave", "Z", "Lcom/reddit/video/creation/widgets/edit/EditUgcExtras;", "isCurrentlyMuted", "()Z", "setCurrentlyMuted", "(Z)V", "isOriginalSoundMuted", "setOriginalSoundMuted", "playbackPaused", "renderingStartTimeMillis", "J", "showSoundTitle", "Lcom/reddit/video/creation/models/adjustclips/InitialClipData;", "initialClipDatas", "", "Lcom/reddit/video/creation/api/output/RecordedSegment;", "segments", "getSegments", "()Ljava/util/List;", "setSegments", "(Ljava/util/List;)V", "Lcom/reddit/video/creation/api/output/MergedVideo;", "video", "Lcom/reddit/video/creation/api/output/MergedVideo;", "getVideo", "()Lcom/reddit/video/creation/api/output/MergedVideo;", "setVideo", "(Lcom/reddit/video/creation/api/output/MergedVideo;)V", "skipResumePlayback", "lastStartedVoiceoverMediaItem", "Ljava/lang/String;", "voiceoverData", "Lcom/reddit/video/creation/models/voiceover/VoiceoverData;", "getVoiceoverData", "()Lcom/reddit/video/creation/models/voiceover/VoiceoverData;", "setVoiceoverData", "(Lcom/reddit/video/creation/models/voiceover/VoiceoverData;)V", "Landroid/media/MediaPlayer;", "sampleMediaPlayer", "Landroid/media/MediaPlayer;", "Lcom/google/android/exoplayer2/a0;", "videoPlayer", "Lcom/google/android/exoplayer2/a0;", "getOverlayInfos", "getVideoWasEdited", "videoWasEdited", "getWasOverlayDrawUsed", "wasOverlayDrawUsed", "getMaxVideoDurationMillis", "()J", "maxVideoDurationMillis", "<init>", "(Landroid/content/Context;Lcom/reddit/video/creation/player/interfaces/MediaPlayerApi;Lcom/reddit/video/creation/eventbus/EventBus;Lcom/reddit/video/creation/api/configuration/CreationConfiguration;Lcom/reddit/video/creation/api/configuration/FeatureConfig;Lcom/reddit/video/creation/widgets/edit/presenter/SaveLocalVideoUseCaseFactory;Lcom/reddit/video/creation/api/configuration/WorkManagerConfig;Lcom/reddit/video/creation/usecases/render/RenderVideoUseCaseFactory;Lcom/reddit/video/creation/usecases/render/RenderAudioUseCaseFactory;Ljava/io/File;Lcom/reddit/video/creation/video/render/VideoConfigMaker;Lcom/reddit/video/creation/state/AspectRatioConfig;Lcom/reddit/video/creation/widgets/edit/presenter/EditContentPresenter;)V", "Companion", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditUGCPresenter extends VideoPlayerAbstractPresenter<EditUGCView>
{
    public static final EditUGCPresenter.EditUGCPresenter$Companion Companion;
    private static final long RENDERING_START_DELAY = 250L;
    private static final long VIDEO_LENGTH_LIMIT_DELTA_MS = 1000L;
    private static final int VIDEO_PROGRESS_BUFFER_COUNT = 2;
    private static final int VIDEO_PROGRESS_SKIP_COUNT = 1;
    private static final long VIDEO_PROGRESS_UPDATE_DELTA = 500L;
    private final Context appContext;
    private final AspectRatioConfig aspectRatioConfig;
    private final CreationConfiguration creationConfiguration;
    private final EditContentPresenter<EditUGCView> editContentPresenter;
    private EditUgcExtras editUgcExtras;
    private final EventBus eventBus;
    private final FeatureConfig featureConfig;
    private List<? extends InitialClipData> initialClipDatas;
    private boolean isCurrentlyMuted;
    private boolean isOriginalSoundMuted;
    private String lastStartedVoiceoverMediaItem;
    private boolean lockVideoSave;
    private List<q> mediaItems;
    private final MediaPlayerApi mediaPlayer;
    private a playbackDisposable;
    private boolean playbackPaused;
    private final t<List<Long>> playbackProgressObservable;
    private final RenderAudioUseCaseFactory renderAudioUseCaseFactory;
    private final File renderVideoDir;
    private final RenderVideoUseCaseFactory renderVideoUseCaseFactory;
    private long renderingStartTimeMillis;
    private MediaPlayer sampleMediaPlayer;
    private final SaveLocalVideoUseCaseFactory saveLocalVideoUseCaseFactory;
    private a saveLocallySubscription;
    private List<RecordedSegment> segments;
    private boolean showSoundTitle;
    private boolean skipResumePlayback;
    public MergedVideo video;
    private final VideoConfigMaker videoConfigMaker;
    private a0 videoPlayer;
    private VoiceoverData voiceoverData;
    private final WorkManagerConfig workManagerConfig;
    
    static {
        Companion = new EditUGCPresenter.EditUGCPresenter$Companion((DefaultConstructorMarker)null);
    }
    
    @Inject
    public EditUGCPresenter(@Named("APP_CONTEXT") final Context appContext, final MediaPlayerApi mediaPlayer, final EventBus eventBus, final CreationConfiguration creationConfiguration, final FeatureConfig featureConfig, final SaveLocalVideoUseCaseFactory saveLocalVideoUseCaseFactory, final WorkManagerConfig workManagerConfig, final RenderVideoUseCaseFactory renderVideoUseCaseFactory, final RenderAudioUseCaseFactory renderAudioUseCaseFactory, @Named("RENDER_VIDEO_DIR") final File renderVideoDir, final VideoConfigMaker videoConfigMaker, final AspectRatioConfig aspectRatioConfig, final EditContentPresenter<EditUGCView> editContentPresenter) {
        e.f((Object)appContext, "appContext");
        e.f((Object)mediaPlayer, "mediaPlayer");
        e.f((Object)eventBus, "eventBus");
        e.f((Object)creationConfiguration, "creationConfiguration");
        e.f((Object)featureConfig, "featureConfig");
        e.f((Object)saveLocalVideoUseCaseFactory, "saveLocalVideoUseCaseFactory");
        e.f((Object)renderVideoUseCaseFactory, "renderVideoUseCaseFactory");
        e.f((Object)renderAudioUseCaseFactory, "renderAudioUseCaseFactory");
        e.f((Object)renderVideoDir, "renderVideoDir");
        e.f((Object)videoConfigMaker, "videoConfigMaker");
        e.f((Object)aspectRatioConfig, "aspectRatioConfig");
        e.f((Object)editContentPresenter, "editContentPresenter");
        super(aspectRatioConfig);
        this.appContext = appContext;
        this.mediaPlayer = mediaPlayer;
        this.eventBus = eventBus;
        this.creationConfiguration = creationConfiguration;
        this.featureConfig = featureConfig;
        this.saveLocalVideoUseCaseFactory = saveLocalVideoUseCaseFactory;
        this.workManagerConfig = workManagerConfig;
        this.renderVideoUseCaseFactory = renderVideoUseCaseFactory;
        this.renderAudioUseCaseFactory = renderAudioUseCaseFactory;
        this.renderVideoDir = renderVideoDir;
        this.videoConfigMaker = videoConfigMaker;
        this.aspectRatioConfig = aspectRatioConfig;
        this.editContentPresenter = editContentPresenter;
        final EmptyList instance = EmptyList.INSTANCE;
        this.mediaItems = (List<q>)instance;
        this.initialClipDatas = (List<? extends InitialClipData>)instance;
        this.segments = new ArrayList<RecordedSegment>();
        this.playbackProgressObservable = t.interval(500L, TimeUnit.MILLISECONDS).observeOn(cf2.a.a()).map((ff2.o<? super Long, ? extends Long>)new b(this)).buffer(2, 1);
    }
    
    public static final AspectRatioConfig access$getAspectRatioConfig$p(final EditUGCPresenter editUGCPresenter) {
        return editUGCPresenter.aspectRatioConfig;
    }
    
    public static final CreationConfiguration access$getCreationConfiguration$p(final EditUGCPresenter editUGCPresenter) {
        return editUGCPresenter.creationConfiguration;
    }
    
    public static final List access$getInitialClipDatas$p(final EditUGCPresenter editUGCPresenter) {
        return editUGCPresenter.initialClipDatas;
    }
    
    public static final boolean access$getVideoWasEdited(final EditUGCPresenter editUGCPresenter) {
        return editUGCPresenter.getVideoWasEdited();
    }
    
    public static final WorkManagerConfig access$getWorkManagerConfig$p(final EditUGCPresenter editUGCPresenter) {
        return editUGCPresenter.workManagerConfig;
    }
    
    public static final void access$goToAdjustClipsScreen(final EditUGCPresenter editUGCPresenter) {
        editUGCPresenter.goToAdjustClipsScreen();
    }
    
    public static final void access$onSaveVideoFail(final EditUGCPresenter editUGCPresenter, final Throwable t) {
        editUGCPresenter.onSaveVideoFail(t);
    }
    
    public static final void access$onSaveVideoSuccess(final EditUGCPresenter editUGCPresenter) {
        editUGCPresenter.onSaveVideoSuccess();
    }
    
    public static final void access$saveVoiceover(final EditUGCPresenter editUGCPresenter, final VoiceoverData voiceoverData) {
        editUGCPresenter.saveVoiceover(voiceoverData);
    }
    
    private final PostVideoConfig createPostVideoConfig(final boolean b) {
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        final List list = null;
        String saveAsThumbnail = null;
        Label_0048: {
            if (editUGCView != null) {
                final Bitmap previewThumbnail = editUGCView.getPreviewThumbnail();
                if (previewThumbnail != null) {
                    saveAsThumbnail = BitmapUtils.saveAsThumbnail(previewThumbnail, this.renderVideoDir);
                    break Label_0048;
                }
            }
            saveAsThumbnail = null;
        }
        final ArrayList list2 = new ArrayList();
        final EditUGCView editUGCView2 = (EditUGCView)((AbstractPresenter)this).getView();
        List textStickerData;
        if (editUGCView2 != null) {
            textStickerData = ((OverlayView)editUGCView2).getTextStickerData();
        }
        else {
            textStickerData = null;
        }
        if (textStickerData != null) {
            int n = 0;
            for (final Object next : textStickerData) {
                if (n < 0) {
                    d.a4();
                    throw null;
                }
                final TextStickerData textStickerData2 = (TextStickerData)next;
                final File renderVideoDir = this.renderVideoDir;
                final StringBuilder sb = new StringBuilder();
                final Date time = Calendar.getInstance().getTime();
                e.e((Object)time, "getInstance().time");
                sb.append(DateExtensionsKt.print(time));
                sb.append('-');
                sb.append(n);
                sb.append("-overlay.bpm");
                final File file = new File(renderVideoDir, sb.toString());
                file.deleteOnExit();
                BitmapUtils.saveBitmapToFile$default(file, textStickerData2.getBitmap(), (Bitmap$CompressFormat)null, 0, 6, (Object)null);
                final String absolutePath = file.getAbsolutePath();
                e.e((Object)absolutePath, "file.absolutePath");
                list2.add(new TextStickerFilePathData(absolutePath, textStickerData2.getStartTime(), textStickerData2.getEndTime()));
                ++n;
            }
        }
        final String saveDrawingBitmap = this.saveDrawingBitmap();
        final List<RecordedSegment> segments = this.segments;
        final EditUgcExtras editUgcExtras = this.editUgcExtras;
        if (editUgcExtras == null) {
            e.n("editUgcExtras");
            throw null;
        }
        final RecordDubType recordType = editUgcExtras.getRecordType();
        final EditUgcExtras editUgcExtras2 = this.editUgcExtras;
        if (editUgcExtras2 == null) {
            e.n("editUgcExtras");
            throw null;
        }
        final CameraDirection cameraDirection = editUgcExtras2.getCameraDirection();
        final EditUgcExtras editUgcExtras3 = this.editUgcExtras;
        if (editUgcExtras3 == null) {
            e.n("editUgcExtras");
            throw null;
        }
        final boolean wasTimerUsed = editUgcExtras3.getWasTimerUsed();
        final EditUgcExtras editUgcExtras4 = this.editUgcExtras;
        if (editUgcExtras4 == null) {
            e.n("editUgcExtras");
            throw null;
        }
        final boolean wasFlashUsed = editUgcExtras4.getWasFlashUsed();
        final EditUgcExtras editUgcExtras5 = this.editUgcExtras;
        if (editUgcExtras5 != null) {
            final List l3 = d.l3((Object)editUgcExtras5.getLastFilterName());
            final List<TextOverlayInfo> overlayInfos = this.getOverlayInfos();
            List list3 = list;
            if (overlayInfos != null) {
                final ArrayList list4 = new ArrayList(m.u4((Iterable)overlayInfos, 10));
                final Iterator<Object> iterator2 = overlayInfos.iterator();
                while (true) {
                    list3 = list4;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    list4.add((Object)iterator2.next().getSpec().getText());
                }
            }
            return new PostVideoConfig((List)segments, recordType, b, (List)list2, saveDrawingBitmap, cameraDirection, wasTimerUsed, wasFlashUsed, saveAsThumbnail, l3, list3, this.getWasOverlayDrawUsed(), this.voiceoverData);
        }
        e.n("editUgcExtras");
        throw null;
    }
    
    public static PostVideoConfig createPostVideoConfig$default(final EditUGCPresenter editUGCPresenter, boolean b, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        return editUGCPresenter.createPostVideoConfig(b);
    }
    
    private final void createVideoPlayer() {
        final a0 videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.release();
        }
        final a0 a = new a0$a(this.appContext).a();
        a.o(2);
        if (this.isCurrentlyMuted || this.isOriginalSoundMuted) {
            SimplePlayerExtensionsKt.mute(a);
            this.muteSampleSound();
        }
        this.videoPlayer = a;
        this.playbackPaused = false;
        this.playbackDisposable = this.playbackProgressObservable.observeOn(cf2.a.a()).subscribe((ff2.g<? super List<Long>>)new com.reddit.video.creation.widgets.edit.presenter.d(this, 2));
        final a0 videoPlayer2 = this.videoPlayer;
        if (videoPlayer2 != null) {
            videoPlayer2.R((w$c)new EditUGCPresenter$createVideoPlayer$3(this));
        }
    }
    
    public static g0 d(final EditUGCPresenter editUGCPresenter, final int n, final boolean b, final Pair pair) {
        return handleSaveVideo$lambda-20(editUGCPresenter, n, b, pair);
    }
    
    private final a displayDialogWhenVideoHasEffects(final EditUGCView editUGCView) {
        int n;
        if (this.shouldRemoveLastSegment()) {
            n = 2131953163;
        }
        else {
            n = 2131952048;
        }
        final c0 showDiscardChangesDialog = ((EditView)editUGCView).showDiscardChangesDialog(n);
        final sa.t t = new sa.t(22);
        showDiscardChangesDialog.getClass();
        final a s = RxJavaPlugins.onAssembly((n)new f((g0)showDiscardChangesDialog, (ff2.q)t)).s((g)new f40.q(15, (Object)this, (Object)editUGCView), (g)Functions.e, (ff2.a)Functions.c);
        p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), s);
        return s;
    }
    
    private static final void displayDialogWhenVideoHasEffects$lambda-10(final EditUGCPresenter editUGCPresenter, final EditUGCView editUGCView, final Boolean b) {
        e.f((Object)editUGCPresenter, "this$0");
        e.f((Object)editUGCView, "$view");
        if (editUGCPresenter.shouldRemoveLastSegment()) {
            editUGCPresenter.goBackAndDeleteLastSegment();
        }
        else {
            ((BaseMVPView)editUGCView).finish();
        }
    }
    
    private static final boolean displayDialogWhenVideoHasEffects$lambda-9(final Boolean b) {
        e.f((Object)b, "it");
        return b;
    }
    
    public static void e(final EditUGCPresenter editUGCPresenter, final a a) {
        renderAndWaitForResult$lambda-32(editUGCPresenter, a);
    }
    
    public static g0 f(final EditUGCPresenter editUGCPresenter, final Integer n) {
        return handleSaveVideo$lambda-21(editUGCPresenter, n);
    }
    
    public static g0 g(final EditUGCPresenter editUGCPresenter, final PostVideoConfig postVideoConfig) {
        return handleSaveVideo$lambda-22(editUGCPresenter, postVideoConfig);
    }
    
    private final long getMaxVideoDurationMillis() {
        final CreationConfiguration creationConfiguration = this.creationConfiguration;
        VideoCreationConfiguration videoCreationConfiguration;
        if (creationConfiguration instanceof VideoCreationConfiguration) {
            videoCreationConfiguration = (VideoCreationConfiguration)creationConfiguration;
        }
        else {
            videoCreationConfiguration = null;
        }
        long maxVideoDurationMillis;
        if (videoCreationConfiguration != null) {
            maxVideoDurationMillis = videoCreationConfiguration.getMaxVideoDurationMillis();
        }
        else {
            maxVideoDurationMillis = 1000L;
        }
        return maxVideoDurationMillis;
    }
    
    private final VoiceoverItem getNextPlayableVoiceoverItem(final long n) {
        final VoiceoverData voiceoverData = this.voiceoverData;
        final VoiceoverItem voiceoverItem = null;
        VoiceoverItem voiceoverItem2 = null;
        VoiceoverItem voiceoverItem3 = voiceoverItem;
        if (voiceoverData != null) {
            final List items = voiceoverData.getItems();
            voiceoverItem3 = voiceoverItem;
            if (items != null) {
                final ArrayList list = new ArrayList();
                for (final Object next : items) {
                    if (n >= ((VoiceoverItem)next).getParentPositionOffset()) {
                        list.add(next);
                    }
                }
                final Iterator iterator2 = list.iterator();
                Long value = null;
                while (true) {
                    voiceoverItem3 = voiceoverItem2;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final VoiceoverItem voiceoverItem4 = (VoiceoverItem)iterator2.next();
                    final long n2 = n - voiceoverItem4.getParentPositionOffset();
                    long longValue;
                    if (value != null) {
                        longValue = value;
                    }
                    else {
                        longValue = Long.MAX_VALUE;
                    }
                    if (n2 > longValue) {
                        continue;
                    }
                    value = n2;
                    voiceoverItem2 = voiceoverItem4;
                }
            }
        }
        return voiceoverItem3;
    }
    
    private final boolean getVideoWasEdited() {
        return this.editContentPresenter.getContentWasEdited();
    }
    
    private final boolean getWasOverlayDrawUsed() {
        return this.editContentPresenter.getWasOverlayDrawUsed();
    }
    
    private final void goBackAndDeleteLastSegment() {
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            ((GoBackView)editUGCView).goBackAndDeleteLastSegment();
        }
    }
    
    private final void goToAdjustClipsScreen() {
        final EventBus eventBus = this.eventBus;
        final List<? extends InitialClipData> initialClipDatas = this.initialClipDatas;
        final long maxVideoDurationMillis = this.getMaxVideoDurationMillis();
        final File audioFile = this.getVideo().getAudioFile();
        String path;
        if (audioFile != null) {
            path = audioFile.getPath();
        }
        else {
            path = null;
        }
        if (!(this.getVideo().isSoundCreatedFromMergedSegments() ^ true)) {
            path = null;
        }
        final AdjustClipsFlowType edit = AdjustClipsFlowType.EDIT;
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        int requiredVideoWidth;
        if (editUGCView != null) {
            requiredVideoWidth = editUGCView.getRequiredVideoWidth();
        }
        else {
            requiredVideoWidth = 0;
        }
        final EditUgcExtras editUgcExtras = this.editUgcExtras;
        if (editUgcExtras != null) {
            eventBus.goToDestination((EventBus$NavigationEvent)new EventBus$NavigationEvent$OpenAdjustClipsFragment(new AdjustClipsLaunchData((List)initialClipDatas, maxVideoDurationMillis, true, path, false, false, false, edit, requiredVideoWidth, editUgcExtras.getStitchUri(), false, 1136, (DefaultConstructorMarker)null)));
            return;
        }
        e.n("editUgcExtras");
        throw null;
    }
    
    public static void h(final EditUGCPresenter editUGCPresenter) {
        handleGoingBackForVideosRecordedCompletely$lambda-13(editUGCPresenter);
    }
    
    private final j handleGoingBackForVideosRecordedCompletely() {
        final boolean videoWasEdited = this.getVideoWasEdited();
        final Integer value = 2131953813;
        j j = null;
        if (videoWasEdited) {
            final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
            if (editUGCView != null) {
                BaseMVPView$DefaultImpls.showAlertDialog$default((BaseMVPView)editUGCView, value, Integer.valueOf(2131953163), 2131953812, 0, (Runnable)new qn1.d((Object)this, 5), (Runnable)null, (Integer)null, (Runnable)null, 200, (Object)null);
                j = cg2.j.a;
            }
        }
        else {
            final EditUGCView editUGCView2 = (EditUGCView)((AbstractPresenter)this).getView();
            if (editUGCView2 != null) {
                BaseMVPView$DefaultImpls.showAlertDialog$default((BaseMVPView)editUGCView2, value, Integer.valueOf(2131958254), 2131953067, 0, (Runnable)new cs1.d((Object)this, 5), (Runnable)null, (Integer)null, (Runnable)null, 200, (Object)null);
                j = cg2.j.a;
            }
        }
        return j;
    }
    
    private static final void handleGoingBackForVideosRecordedCompletely$lambda-12(final EditUGCPresenter editUGCPresenter) {
        e.f((Object)editUGCPresenter, "this$0");
        editUGCPresenter.goBackAndDeleteLastSegment();
    }
    
    private static final void handleGoingBackForVideosRecordedCompletely$lambda-13(final EditUGCPresenter editUGCPresenter) {
        e.f((Object)editUGCPresenter, "this$0");
        editUGCPresenter.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.EDITING_DISCARD_VIDEO, (FlowType)null, 2, (DefaultConstructorMarker)null));
        editUGCPresenter.goBackAndDeleteLastSegment();
    }
    
    private final void handleRenderingResult(final RenderVideoResult renderVideoResult) {
        if (renderVideoResult instanceof RenderVideoResult$InProgress) {
            final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
            if (editUGCView != null) {
                ((LoadingView)editUGCView).showLoading();
            }
        }
        else if (renderVideoResult instanceof RenderVideoResult$Success) {
            final EditUGCView editUGCView2 = (EditUGCView)((AbstractPresenter)this).getView();
            if (editUGCView2 != null) {
                ((LoadingView)editUGCView2).hideLoading();
            }
            final long currentTimeMillis = System.currentTimeMillis();
            final long renderingStartTimeMillis = this.renderingStartTimeMillis;
            final EventBus eventBus = this.eventBus;
            final RenderVideoResult$Success renderVideoResult$Success = (RenderVideoResult$Success)renderVideoResult;
            eventBus.setVideoOutput(renderVideoResult$Success.getCompressedVideoFile(), renderVideoResult$Success.getThumbnailFile(), 0, currentTimeMillis - renderingStartTimeMillis);
        }
    }
    
    private final void handleSaveVideo(final int n, final String... array) {
        if (this.lockVideoSave) {
            return;
        }
        final boolean b = true;
        this.lockVideoSave = true;
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView == null) {
            return;
        }
        ((SaveVideoView)editUGCView).showSaveLoader();
        final int length = array.length;
        int n2 = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n2 >= length) {
                break;
            }
            if (!((BaseMVPView)editUGCView).checkPermission(array[n2])) {
                b2 = false;
                break;
            }
            ++n2;
        }
        final c0 y = ((BaseMVPView)editUGCView).requestPermission((String[])Arrays.copyOf(array, array.length)).observeOn(cf2.a.a()).flatMapSingle((o)new com.reddit.video.creation.widgets.edit.presenter.a(this, n, b2)).observeOn(cf2.a.a()).flatMapSingle((o)new dk1.g0((Object)this, 14)).flatMapSingle((o)new ik1.d((Object)this, 11)).take(1L).singleOrError().y(cf2.a.a());
        e.e((Object)y, "view.requestPermission(*\u2026dSchedulers.mainThread())");
        p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), (a)SubscribersKt.g((c0)y, (l)new EditUGCPresenter$handleSaveVideo.EditUGCPresenter$handleSaveVideo$4(this), (l)new EditUGCPresenter$handleSaveVideo.EditUGCPresenter$handleSaveVideo$5(this)));
    }
    
    private static final g0 handleSaveVideo$lambda-20(final EditUGCPresenter editUGCPresenter, final int n, final boolean b, final Pair pair) {
        e.f((Object)editUGCPresenter, "this$0");
        e.f((Object)pair, "<name for destructuring parameter 0>");
        return (g0)editUGCPresenter.editContentPresenter.handlePermissionsGiven(n, b, (boolean)pair.component1(), (boolean)pair.component2(), FlowType.VIDEO);
    }
    
    private static final g0 handleSaveVideo$lambda-21(final EditUGCPresenter editUGCPresenter, final Integer n) {
        e.f((Object)editUGCPresenter, "this$0");
        e.f((Object)n, "it");
        return (g0)c0.v(editUGCPresenter.createPostVideoConfig(true));
    }
    
    private static final g0 handleSaveVideo$lambda-22(final EditUGCPresenter editUGCPresenter, final PostVideoConfig postVideoConfig) {
        e.f((Object)editUGCPresenter, "this$0");
        e.f((Object)postVideoConfig, "postVideoConfig");
        return (g0)editUGCPresenter.saveVideo(postVideoConfig);
    }
    
    public static y i(final EditUGCPresenter editUGCPresenter, final RenderingConfig renderingConfig, final RenderAudioResult$Success renderAudioResult$Success) {
        return onPostClicked$lambda-17$lambda-16(editUGCPresenter, renderingConfig, renderAudioResult$Success);
    }
    
    private final void initializeGoBackFlow() {
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            if (this.shouldRemoveLastSegment() && !this.getVideoWasEdited()) {
                this.handleGoingBackForVideosRecordedCompletely();
            }
            else if (this.getVideoWasEdited()) {
                this.displayDialogWhenVideoHasEffects(editUGCView);
            }
            else {
                ((GoBackView)editUGCView).goBack();
            }
        }
    }
    
    public static boolean j(final RenderAudioResult renderAudioResult) {
        return onPostClicked$lambda-17$lambda-14(renderAudioResult);
    }
    
    public static void k(final EditUGCPresenter editUGCPresenter, final EditUGCView editUGCView, final Boolean b) {
        displayDialogWhenVideoHasEffects$lambda-10(editUGCPresenter, editUGCView, b);
    }
    
    public static RenderAudioResult$Success l(final RenderAudioResult renderAudioResult) {
        return onPostClicked$lambda-17$lambda-15(renderAudioResult);
    }
    
    public static void m(final EditUGCPresenter editUGCPresenter, final Throwable t) {
        onPostClicked$lambda-18(editUGCPresenter, t);
    }
    
    private final void muteSampleSound() {
        final MediaPlayer sampleMediaPlayer = this.sampleMediaPlayer;
        if (sampleMediaPlayer != null) {
            sampleMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }
    
    public static void n(final EditUGCPresenter editUGCPresenter, final Throwable t) {
        renderAndWaitForResult$lambda-34(editUGCPresenter, t);
    }
    
    public static void o(final EditUGCPresenter editUGCPresenter, final RenderVideoResult renderVideoResult) {
        renderAndWaitForResult$lambda-33(editUGCPresenter, renderVideoResult);
    }
    
    private final void observeAdjustClips() {
        final t observeOn = this.eventBus.getAdjustClipsResults().throttleFirst(1L, TimeUnit.SECONDS).observeOn(cf2.a.a());
        e.e((Object)observeOn, "eventBus.adjustClipsResu\u2026dSchedulers.mainThread())");
        p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), SubscribersKt.f((t)observeOn, (l)EditUGCPresenter$observeAdjustClips.EditUGCPresenter$observeAdjustClips$1.INSTANCE, SubscribersKt.c, (l)new EditUGCPresenter$observeAdjustClips.EditUGCPresenter$observeAdjustClips$2(this)));
    }
    
    private static final void onPostClicked$lambda-17(final EditUGCPresenter editUGCPresenter, final RenderingConfig renderingConfig) {
        e.f((Object)editUGCPresenter, "this$0");
        final a subscribe = ((ObservableUseCase)editUGCPresenter.renderAudioUseCaseFactory.create(renderingConfig)).execute().filter((ff2.q)new c(20)).map((o)new bb2.f(3)).take(1L).observeOn(cf2.a.a()).subscribeOn(cf2.a.a()).flatMap((o)new z(16, (Object)editUGCPresenter, (Object)renderingConfig)).subscribe();
        e.e((Object)subscribe, "renderAudioUseCaseFactor\u2026\n            .subscribe()");
        p7.a.e(((AbstractPresenter)editUGCPresenter).getCompositeDisposable(), subscribe);
    }
    
    private static final boolean onPostClicked$lambda-17$lambda-14(final RenderAudioResult renderAudioResult) {
        e.f((Object)renderAudioResult, "it");
        return renderAudioResult instanceof RenderAudioResult$Success;
    }
    
    private static final RenderAudioResult$Success onPostClicked$lambda-17$lambda-15(final RenderAudioResult renderAudioResult) {
        e.f((Object)renderAudioResult, "it");
        return (RenderAudioResult$Success)renderAudioResult;
    }
    
    private static final y onPostClicked$lambda-17$lambda-16(final EditUGCPresenter editUGCPresenter, final RenderingConfig renderingConfig, final RenderAudioResult$Success renderAudioResult$Success) {
        e.f((Object)editUGCPresenter, "this$0");
        e.f((Object)renderAudioResult$Success, "videoFileResult");
        final t execute = ((ObservableUseCase)editUGCPresenter.renderVideoUseCaseFactory.create(renderingConfig, renderAudioResult$Success.getVideoFile().getAbsolutePath())).execute();
        editUGCPresenter.renderAndWaitForResult(execute);
        editUGCPresenter.editContentPresenter.setLoadingState(false);
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)editUGCPresenter).getView();
        if (editUGCView != null) {
            ((LoadingView)editUGCView).hideLoading();
        }
        return (y)execute;
    }
    
    private static final void onPostClicked$lambda-18(final EditUGCPresenter editUGCPresenter, final Throwable t) {
        e.f((Object)editUGCPresenter, "this$0");
        editUGCPresenter.editContentPresenter.setLoadingState(false);
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)editUGCPresenter).getView();
        if (editUGCView != null) {
            ((LoadingView)editUGCView).hideLoading();
        }
        pu2.a.a.p(t);
    }
    
    private final void onSaveVideoFail(final Throwable t) {
        pu2.a.a.p(t);
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            ((SaveVideoView)editUGCView).showSaveFailedIcon();
        }
        final EditUGCView editUGCView2 = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView2 != null) {
            ((LoadingView)editUGCView2).hideLoading();
        }
    }
    
    private final void onSaveVideoSuccess() {
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            if (Build$VERSION.SDK_INT < 29 && !((BaseMVPView)editUGCView).checkPermission("android.permission.WRITE_EXTERNAL_STORAGE")) {
                this.lockVideoSave = false;
                ((SaveVideoView)editUGCView).showSaveIcon();
            }
            else {
                ((SaveVideoView)editUGCView).showSaveFinishedIcon();
            }
            ((LoadingView)editUGCView).hideLoading();
        }
    }
    
    private final void onVideoPlayerProgressUpdated(final List<Long> list) {
        final long longValue = ((Number)CollectionsKt___CollectionsKt.S4((List)list)).longValue();
        final long longValue2 = ((Number)CollectionsKt___CollectionsKt.c5((List)list)).longValue();
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            ((EditView)editUGCView).updateTextStickersVisibility(longValue2);
        }
        final a0 videoPlayer = this.videoPlayer;
        boolean b = true;
        if (videoPlayer == null || !((com.google.android.exoplayer2.d)videoPlayer).isPlaying()) {
            b = false;
        }
        if (b) {
            this.playVoiceoverSampleIfRequired(longValue, longValue2);
        }
    }
    
    public static void p(final EditUGCPresenter editUGCPresenter) {
        handleGoingBackForVideosRecordedCompletely$lambda-12(editUGCPresenter);
    }
    
    private final void playCurrentSegments() {
        this.createVideoPlayer();
        final a0 videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
            if (editUGCView != null) {
                editUGCView.setPlayerOnView(videoPlayer);
            }
        }
        final List<RecordedSegment> segments = this.segments;
        final ArrayList list = new ArrayList(m.u4((Iterable)segments, 10));
        final Iterator<Object> iterator = segments.iterator();
        while (iterator.hasNext()) {
            list.add((Object)RecordedSegmentKt.mapToMediaItem((RecordedSegment)iterator.next()));
        }
        this.preparePlaylist((List<q>)list);
    }
    
    private final void playSampleSound(final String dataSource) {
        final MediaPlayer sampleMediaPlayer = new MediaPlayer();
        try {
            sampleMediaPlayer.setDataSource(dataSource);
            sampleMediaPlayer.prepare();
            sampleMediaPlayer.start();
            if (this.isCurrentlyMuted) {
                sampleMediaPlayer.setVolume(0.0f, 0.0f);
            }
        }
        catch (final IOException ex) {
            pu2.a.a.e((Throwable)ex);
        }
        this.sampleMediaPlayer = sampleMediaPlayer;
    }
    
    private final void playVoiceoverSampleIfRequired(final long n, final long n2) {
        if (n2 <= n) {
            this.lastStartedVoiceoverMediaItem = null;
            this.stopSampleSound();
        }
        final VoiceoverItem nextPlayableVoiceoverItem = this.getNextPlayableVoiceoverItem(n2);
        if (nextPlayableVoiceoverItem != null) {
            final String filePath = nextPlayableVoiceoverItem.getFilePath();
            if (!e.a((Object)filePath, (Object)this.lastStartedVoiceoverMediaItem)) {
                this.playSampleSound(this.lastStartedVoiceoverMediaItem = filePath);
            }
        }
    }
    
    private static final Long playbackProgressObservable$lambda-0(final EditUGCPresenter editUGCPresenter, final Long n) {
        e.f((Object)editUGCPresenter, "this$0");
        e.f((Object)n, "it");
        final a0 videoPlayer = editUGCPresenter.videoPlayer;
        Long value = null;
        q z;
        if (videoPlayer != null) {
            z = ((com.google.android.exoplayer2.d)videoPlayer).Z();
        }
        else {
            z = null;
        }
        final a0 videoPlayer2 = editUGCPresenter.videoPlayer;
        if (videoPlayer2 != null) {
            value = videoPlayer2.getCurrentPosition();
        }
        return editUGCPresenter.getAdjustedCurrentPosition(z, value);
    }
    
    private final void preparePlaylist(final List<q> mediaItems) {
        this.mediaItems = mediaItems;
        final a0 videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.f0((List)mediaItems);
        }
        final a0 videoPlayer2 = this.videoPlayer;
        if (videoPlayer2 != null) {
            SimplePlayerExtensionsKt.seekToBeginning(videoPlayer2);
        }
        final a0 videoPlayer3 = this.videoPlayer;
        if (videoPlayer3 != null) {
            videoPlayer3.prepare();
        }
        final a0 videoPlayer4 = this.videoPlayer;
        if (videoPlayer4 != null) {
            videoPlayer4.C(true);
        }
    }
    
    public static void q(final EditUGCPresenter editUGCPresenter, final RenderingConfig renderingConfig) {
        onPostClicked$lambda-17(editUGCPresenter, renderingConfig);
    }
    
    public static Long r(final EditUGCPresenter editUGCPresenter, final Long n) {
        return playbackProgressObservable$lambda-0(editUGCPresenter, n);
    }
    
    private final void renderAndWaitForResult(final t<RenderVideoResult> t) {
        final a subscribe = t.doOnSubscribe((g<? super a>)new p21.c((Object)this, 29)).observeOn(cf2.a.a()).subscribe((ff2.g<? super RenderVideoResult>)new y11.e((Object)this, 28), (g<? super Throwable>)new com.reddit.video.creation.widgets.adjustclips.trim.b((Object)this, 3));
        e.e((Object)subscribe, "renderObservable\n      .\u2026.e(it)\n        },\n      )");
        p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), subscribe);
    }
    
    private static final void renderAndWaitForResult$lambda-32(final EditUGCPresenter editUGCPresenter, final a a) {
        e.f((Object)editUGCPresenter, "this$0");
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)editUGCPresenter).getView();
        if (editUGCView != null) {
            ((LoadingView)editUGCView).showLoading();
        }
    }
    
    private static final void renderAndWaitForResult$lambda-33(final EditUGCPresenter editUGCPresenter, final RenderVideoResult renderVideoResult) {
        e.f((Object)editUGCPresenter, "this$0");
        e.e((Object)renderVideoResult, "result");
        editUGCPresenter.handleRenderingResult(renderVideoResult);
    }
    
    private static final void renderAndWaitForResult$lambda-34(final EditUGCPresenter editUGCPresenter, final Throwable t) {
        e.f((Object)editUGCPresenter, "this$0");
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)editUGCPresenter).getView();
        if (editUGCView != null) {
            ((LoadingView)editUGCView).hideLoading();
        }
        pu2.a.a.e(t);
    }
    
    public static void s(final EditUGCPresenter editUGCPresenter, final List list) {
        editUGCPresenter.onVideoPlayerProgressUpdated(list);
    }
    
    private final c0<Boolean> saveVideo(final PostVideoConfig postVideoConfig) {
        final SaveLocalVideoUseCaseFactory saveLocalVideoUseCaseFactory = this.saveLocalVideoUseCaseFactory;
        final WorkManagerConfig workManagerConfig = this.workManagerConfig;
        Object o;
        if (workManagerConfig == null || (o = workManagerConfig.getWorkManager$creation_release()) == null) {
            o = k.k(((AbstractPresenter)this).getContext());
            e.e(o, "getInstance(context)");
        }
        return ((SingleUseCase)saveLocalVideoUseCaseFactory.create((b6.n)o, postVideoConfig)).execute();
    }
    
    private final void saveVoiceover(final VoiceoverData voiceoverData) {
        this.voiceoverData = voiceoverData;
        final boolean b = voiceoverData.getItems().isEmpty() ^ true;
        this.isOriginalSoundMuted = (voiceoverData.getKeepSourceAudio() ^ true);
        if (b) {
            this.isCurrentlyMuted = false;
        }
        this.updateOriginalAudioState();
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            editUGCView.updateVoiceoverIndicatorVisibility(b);
        }
    }
    
    private final boolean shouldRemoveLastSegment() {
        final Iterator<Object> iterator = this.segments.iterator();
        boolean b = false;
        int n = 0;
        while (iterator.hasNext()) {
            n += iterator.next().getRecordedMs();
        }
        if (n >= this.getMaxVideoDurationMillis() - 1000L) {
            b = true;
        }
        return b;
    }
    
    public static void stopPlayback$default(final EditUGCPresenter editUGCPresenter, boolean b, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        editUGCPresenter.stopPlayback(b);
    }
    
    private final void stopSampleSound() {
        final MediaPlayer sampleMediaPlayer = this.sampleMediaPlayer;
        if (sampleMediaPlayer != null) {
            sampleMediaPlayer.release();
        }
        this.sampleMediaPlayer = null;
        this.lastStartedVoiceoverMediaItem = null;
    }
    
    public static boolean t(final Boolean b) {
        return displayDialogWhenVideoHasEffects$lambda-9(b);
    }
    
    private final void unmuteSampleSound() {
        final MediaPlayer sampleMediaPlayer = this.sampleMediaPlayer;
        if (sampleMediaPlayer != null) {
            sampleMediaPlayer.setVolume(1.0f, 1.0f);
        }
    }
    
    private final void updateOriginalAudioState() {
        if (this.isOriginalSoundMuted) {
            final a0 videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                SimplePlayerExtensionsKt.mute(videoPlayer);
            }
            this.muteSampleSound();
        }
        else if (!this.isCurrentlyMuted) {
            final a0 videoPlayer2 = this.videoPlayer;
            if (videoPlayer2 != null) {
                SimplePlayerExtensionsKt.unMute$default(videoPlayer2, 0.0f, 1, (Object)null);
            }
            this.unmuteSampleSound();
        }
    }
    
    public final long getAdjustedCurrentPosition(final q q, Long value) {
        final Iterator<Object> iterator = this.segments.iterator();
        while (true) {
            String s = null;
            Object f;
            RecordedSegment next;
            do {
                final boolean hasNext = iterator.hasNext();
                final RecordedSegment recordedSegment = null;
                f = null;
                if (!hasNext) {
                    final RecordedSegment recordedSegment2 = recordedSegment;
                    int i = 0;
                    int index;
                    if (recordedSegment2 != null) {
                        index = this.segments.indexOf(recordedSegment2);
                    }
                    else {
                        index = 0;
                    }
                    final long n = 0L;
                    if (index != 0) {
                        int n2 = 0;
                        while (i < index) {
                            n2 += this.segments.get(i).getRecordedMs();
                            ++i;
                        }
                        final long n3 = n2;
                        long longValue;
                        if (value != null) {
                            longValue = value;
                        }
                        else {
                            longValue = 0L;
                        }
                        value = n3 + longValue;
                    }
                    long longValue2 = n;
                    if (value != null) {
                        longValue2 = value;
                    }
                    return longValue2;
                }
                next = iterator.next();
                final RecordedSegment recordedSegment3 = next;
                final AdjustedClip adjustedClip = recordedSegment3.getAdjustedClip();
                Label_0108: {
                    if (adjustedClip != null) {
                        final AdjustableClip adjustableClip = adjustedClip.getAdjustableClip();
                        if (adjustableClip != null && (s = adjustableClip.getUri()) != null) {
                            break Label_0108;
                        }
                    }
                    s = Uri.fromFile(recordedSegment3.getTempVideoFile()).toString();
                    e.e((Object)s, "fromFile(\n        record\u2026oFile,\n      ).toString()");
                }
                if (q == null) {
                    continue;
                }
                f = q.f;
            } while (!e.a((Object)s, f));
            final RecordedSegment recordedSegment = next;
            continue;
        }
    }
    
    public final EventBus getEventBus() {
        return this.eventBus;
    }
    
    public final MediaPlayerApi getMediaPlayer() {
        return this.mediaPlayer;
    }
    
    public final List<TextOverlayInfo> getOverlayInfos() {
        return this.editContentPresenter.getOverlayInfos();
    }
    
    public final List<RecordedSegment> getSegments() {
        return this.segments;
    }
    
    public final MergedVideo getVideo() {
        final MergedVideo video = this.video;
        if (video != null) {
            return video;
        }
        e.n("video");
        throw null;
    }
    
    public final VoiceoverData getVoiceoverData() {
        return this.voiceoverData;
    }
    
    public final boolean isCurrentlyMuted() {
        return this.isCurrentlyMuted;
    }
    
    public final boolean isOriginalSoundMuted() {
        return this.isOriginalSoundMuted;
    }
    
    public final void onAddDrawingClicked() {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.EDITING_OVERLAY_DRAW, (FlowType)null, 2, (DefaultConstructorMarker)null));
    }
    
    public final void onAddOverlayClicked() {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.EDITING_OVERLAY_TEXT, (FlowType)null, 2, (DefaultConstructorMarker)null));
    }
    
    public final void onAdjustClipsClicked() {
        ((mg2.a)new EditUGCPresenter$onAdjustClipsClicked$proceedWithAdjusting.EditUGCPresenter$onAdjustClipsClicked$proceedWithAdjusting$1(this)).invoke();
    }
    
    public final void onAdjustedClipsUpdated(final List<AdjustedClip> list) {
        e.f((Object)list, "adjustedClips");
        this.skipResumePlayback = true;
        if (list.isEmpty()) {
            final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
            if (editUGCView != null) {
                ((GoBackView)editUGCView).goBack();
            }
            return;
        }
        final EditUGCView editUGCView2 = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView2 != null) {
            ((OverlayView)editUGCView2).removeAllOverlays();
            ((PollView)editUGCView2).cancelPoll();
        }
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            final RecordedSegment recordedSegment$default = AdjustedClip.toRecordedSegment$default((AdjustedClip)iterator.next(), ((AbstractPresenter)this).getContext(), 0, 2, (Object)null);
            if (recordedSegment$default != null) {
                list2.add(recordedSegment$default);
            }
        }
        this.segments = CollectionsKt___CollectionsKt.J5((Collection)list2);
        final ArrayList initialClipDatas = new ArrayList<Object>(m.u4((Iterable)list, 10));
        for (final AdjustedClip adjustedClip : list) {
            initialClipDatas.add(new InitialClipData$Adjusted(adjustedClip.getAdjustableClip(), adjustedClip.isUploaded()));
        }
        this.initialClipDatas = (List<? extends InitialClipData>)initialClipDatas;
        this.playCurrentSegments();
    }
    
    public boolean onBackPressed() {
        this.onUserPressedBack();
        return true;
    }
    
    public final void onCreate() {
        this.observeAdjustClips();
        final t observeOn = this.eventBus.getStickerTimerResults().observeOn(cf2.a.a());
        e.e((Object)observeOn, "eventBus.stickerTimerRes\u2026dSchedulers.mainThread())");
        final EditUGCPresenter$onCreate.EditUGCPresenter$onCreate$1 instance = EditUGCPresenter$onCreate.EditUGCPresenter$onCreate$1.INSTANCE;
        final EditUGCPresenter$onCreate.EditUGCPresenter$onCreate$2 editUGCPresenter$onCreate$2 = new EditUGCPresenter$onCreate.EditUGCPresenter$onCreate$2(this);
        final mg2.a c = SubscribersKt.c;
        p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), SubscribersKt.f((t)observeOn, (l)instance, c, (l)editUGCPresenter$onCreate$2));
        final t observeOn2 = this.eventBus.getVoiceoverResults().observeOn(cf2.a.a());
        e.e((Object)observeOn2, "eventBus.voiceoverResult\u2026dSchedulers.mainThread())");
        p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), SubscribersKt.f((t)observeOn2, (l)EditUGCPresenter$onCreate.EditUGCPresenter$onCreate$3.INSTANCE, c, (l)new EditUGCPresenter$onCreate.EditUGCPresenter$onCreate$4(this)));
    }
    
    public void onDestroyView() {
        this.resetSaveState();
        super.onDestroyView();
        final a0 videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.release();
        }
    }
    
    public final void onDrawingAdded() {
        this.editContentPresenter.onDrawingAdded();
    }
    
    public final void onDrawingRemoved() {
        this.editContentPresenter.onDrawingRemoved();
    }
    
    public void onHiddenChanged(final boolean b) {
        if (!b) {
            this.restartPlayback();
        }
    }
    
    public final void onOverlayChanged() {
        this.editContentPresenter.onOverlayChanged();
        this.resetSaveState();
    }
    
    public final void onOverlayTextAdded() {
        this.editContentPresenter.onOverlayTextAdded();
        this.resetSaveState();
    }
    
    public void onPause() {
        final a playbackDisposable = this.playbackDisposable;
        if (playbackDisposable != null) {
            playbackDisposable.dispose();
        }
        stopPlayback$default(this, false, 1, null);
        this.skipResumePlayback = false;
    }
    
    public final void onPollDeleted() {
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            ((PollView)editUGCView).cancelPoll();
        }
    }
    
    public final void onPollMoved() {
        this.resetSaveState();
    }
    
    public final void onPostClicked() {
        this.stopPlayback(true);
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            ((LoadingView)editUGCView).showLoading();
        }
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.EDITING_POST, (FlowType)null, 2, (DefaultConstructorMarker)null));
        this.mediaPlayer.pause();
        this.renderingStartTimeMillis = System.currentTimeMillis();
        if (this.workManagerConfig != null) {
            zi2.g.g(((AbstractPresenter)this).getMainScope(), null, null, (p)new EditUGCPresenter$onPostClicked$1(this, (gg2.c)null), 3);
            return;
        }
        p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), this.videoConfigMaker.makeRenderingConfig(createPostVideoConfig$default(this, false, 1, null)).y(cf2.a.a()).F((g)new k21.b((Object)this, 29), (g)new com.reddit.video.creation.widgets.edit.presenter.d(this, 1)));
    }
    
    public void onResume() {
        this.eventBus.reportAnalytics((Analytics)new ScreenVisible(ScreenId.CAMERA_EDIT, (String)null, (FlowType)null, 6, (DefaultConstructorMarker)null));
        if (!this.skipResumePlayback && !this.playbackPaused) {
            this.playCurrentSegments();
        }
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            final VoiceoverData voiceoverData = this.voiceoverData;
            int size = 0;
            Label_0088: {
                if (voiceoverData != null) {
                    final List items = voiceoverData.getItems();
                    if (items != null) {
                        size = items.size();
                        break Label_0088;
                    }
                }
                size = 0;
            }
            editUGCView.updateVoiceoverIndicatorVisibility(size > 0);
        }
        this.skipResumePlayback = false;
    }
    
    public final void onSaveClicked(final int n) {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.EDITING_SAVE, (FlowType)null, 2, (DefaultConstructorMarker)null));
        final int sdk_INT = Build$VERSION.SDK_INT;
        String[] array;
        if (sdk_INT >= 33) {
            array = new String[] { "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO" };
        }
        else if (sdk_INT >= 29) {
            array = new String[] { "android.permission.READ_EXTERNAL_STORAGE" };
        }
        else {
            array = new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" };
        }
        this.handleSaveVideo(n, (String[])Arrays.copyOf(array, array.length));
    }
    
    public final void onTextOverlaysUpdated(final List<TextOverlayInfo> list) {
        e.f((Object)list, "overlayInfos");
        this.editContentPresenter.onTextOverlaysUpdated((List)list);
    }
    
    public final void onUserPressedBack() {
        this.editContentPresenter.onUserPressedBack();
        this.initializeGoBackFlow();
    }
    
    public final void onVideoTap() {
        this.isCurrentlyMuted ^= true;
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            editUGCView.updateMuteBtnDrawable(this.isCurrentlyMuted);
        }
        if (this.isCurrentlyMuted) {
            final a0 videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                SimplePlayerExtensionsKt.mute(videoPlayer);
            }
            this.muteSampleSound();
            this.eventBus.reportAnalytics((Analytics)Mute.INSTANCE);
        }
        else {
            if (!this.isOriginalSoundMuted) {
                final a0 videoPlayer2 = this.videoPlayer;
                if (videoPlayer2 != null) {
                    SimplePlayerExtensionsKt.unMute$default(videoPlayer2, 0.0f, 1, (Object)null);
                }
                this.unmuteSampleSound();
            }
            this.eventBus.reportAnalytics((Analytics)UnMute.INSTANCE);
        }
    }
    
    public final void pausePlayback() {
        this.playbackPaused = true;
        final a0 videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.C(false);
        }
        this.stopSampleSound();
    }
    
    public final void pollInputDone(final PollInfo pollInfo) {
        e.f((Object)pollInfo, "info");
        if (xi2.j.B0((CharSequence)pollInfo.getTitle())) {
            final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
            if (editUGCView != null) {
                ((PollView)editUGCView).cancelPoll();
            }
        }
        else {
            final EditUGCView editUGCView2 = (EditUGCView)((AbstractPresenter)this).getView();
            if (editUGCView2 != null) {
                ((PollView)editUGCView2).hidePollEditUi();
            }
        }
        this.resetSaveState();
    }
    
    public final void resetSaveState() {
        this.editContentPresenter.resetSaveState();
        this.lockVideoSave = false;
        final a saveLocallySubscription = this.saveLocallySubscription;
        if (saveLocallySubscription != null) {
            saveLocallySubscription.dispose();
        }
    }
    
    public final void restartPlayback() {
        this.preparePlaylist(this.mediaItems);
        final a0 videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            SimplePlayerExtensionsKt.seekToBeginning(videoPlayer);
        }
        this.playbackPaused = false;
        final a0 videoPlayer2 = this.videoPlayer;
        if (videoPlayer2 != null) {
            videoPlayer2.C(true);
        }
    }
    
    public final void resumePlayback() {
        this.playbackPaused = false;
        final a0 videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.C(true);
        }
    }
    
    public final String saveDrawingBitmap() {
        final EditUGCView editUGCView = (EditUGCView)((AbstractPresenter)this).getView();
        if (editUGCView != null) {
            final Bitmap drawingBitmap = ((OverlayView)editUGCView).getDrawingBitmap();
            if (drawingBitmap != null) {
                final File renderVideoDir = this.renderVideoDir;
                final StringBuilder sb = new StringBuilder();
                final Date time = Calendar.getInstance().getTime();
                e.e((Object)time, "getInstance().time");
                sb.append(DateExtensionsKt.print(time));
                sb.append("-overlay.bpm");
                final File file = new File(renderVideoDir, sb.toString());
                file.deleteOnExit();
                final File saveBitmapToFile$default = BitmapUtils.saveBitmapToFile$default(file, drawingBitmap, (Bitmap$CompressFormat)null, 0, 6, (Object)null);
                if (saveBitmapToFile$default != null) {
                    return saveBitmapToFile$default.getAbsolutePath();
                }
            }
        }
        return null;
    }
    
    public void saveState(final Bundle bundle) {
        e.f((Object)bundle, "outState");
        super.saveState(bundle);
        this.editContentPresenter.saveState(bundle);
    }
    
    public final void setCurrentlyMuted(final boolean isCurrentlyMuted) {
        this.isCurrentlyMuted = isCurrentlyMuted;
    }
    
    public final void setOriginalSoundMuted(final boolean isOriginalSoundMuted) {
        this.isOriginalSoundMuted = isOriginalSoundMuted;
    }
    
    public final void setSegments(final List<RecordedSegment> segments) {
        e.f((Object)segments, "<set-?>");
        this.segments = segments;
    }
    
    public final void setVideo(final MergedVideo video) {
        e.f((Object)video, "<set-?>");
        this.video = video;
    }
    
    public final void setVoiceoverData(final VoiceoverData voiceoverData) {
        this.voiceoverData = voiceoverData;
    }
    
    public final void stopPlayback(final boolean b) {
        if (b) {
            this.playbackPaused = true;
        }
        final a0 videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.stop();
        }
        this.stopSampleSound();
    }
    
    public final void viewCreated(final EditUGCView editUGCView, final EditUgcExtras editUgcExtras, final Bundle bundle) {
        e.f((Object)editUGCView, "view");
        e.f((Object)editUgcExtras, "editUgcExtras");
        super.viewCreated((BaseMVPView)editUGCView);
        this.editContentPresenter.viewCreated((EditView)editUGCView, bundle);
        this.editUgcExtras = editUgcExtras;
        this.setVideo(new MergedVideo(new File(""), new File(""), (File)null));
        this.showSoundTitle = editUgcExtras.getShowSoundTitle();
        if (this.initialClipDatas.isEmpty()) {
            this.initialClipDatas = editUgcExtras.getInitialClipsData();
        }
        if (this.segments.isEmpty()) {
            this.segments = CollectionsKt___CollectionsKt.J5((Collection)editUgcExtras.getSegments());
        }
        final List<? extends InitialClipData> initialClipDatas = this.initialClipDatas;
        if (initialClipDatas == null || initialClipDatas.isEmpty()) {
            editUGCView.hideAdjustClipsButton();
        }
        if (!this.featureConfig.getPollsEnabled()) {
            ((PollView)editUGCView).hidePollButton();
        }
        ((BaseMVPView)editUGCView).setUITheme(this.creationConfiguration.getTheme());
    }
}
