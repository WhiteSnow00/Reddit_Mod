// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.recording.presenter;

import com.reddit.video.creation.widgets.recording.view.FiltersView;
import com.reddit.video.creation.widgets.recording.view.AddSoundView;
import com.reddit.video.creation.widgets.recording.view.EnterAdjustClipsView;
import com.reddit.video.creation.widgets.recording.view.SnapCameraView;
import com.reddit.video.creation.widgets.recording.view.CameraApiView;
import android.os.BaseBundle;
import com.reddit.video.creation.widgets.recording.view.RecordedVideoPlayerView;
import com.reddit.video.creation.player.interfaces.MediaSeekApi;
import com.reddit.video.creation.widgets.base.BaseMVPView;
import com.reddit.video.creation.state.VideoScale;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$PermissionGranted;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$CameraSwitched;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$PermissionRationale;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$ViewCreated;
import com.reddit.video.creation.widgets.recording.view.state.RecordImageViewEvent$ImageViewCreated;
import com.reddit.video.creation.widgets.recording.view.state.RecordImageViewEvent$PermissionGranted;
import com.reddit.video.creation.widgets.recording.view.state.RecordImageViewEvent$CameraSwitched;
import com.reddit.video.creation.analytics.FlipCamera;
import com.reddit.video.creation.widgets.recording.view.state.RecordImageViewEvent$PermissionRationale;
import com.reddit.video.creation.widgets.base.AbstractPresenter;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$PlayerStopped;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.video.creation.analytics.ScreenVisible;
import g5.i;
import com.reddit.video.creation.widgets.recording.presenter.player.RecordedVideoPlayerPresenter;
import com.reddit.video.creation.widgets.recording.view.filters.SnapFiltersManager;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$FiltersHidden;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$RecordingStopped;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$CountdownTick;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$RecordingProgressUpdated;
import java.io.IOException;
import af2.n;
import io.reactivex.plugins.RxJavaPlugins;
import af2.g0;
import com.reddit.video.creation.widgets.utils.CameraPermissionKt;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$TimerShown;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$FiltersShown;
import com.reddit.video.creation.models.lens.LensFilterKt;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$RecordingFinished;
import android.content.Intent;
import android.content.SharedPreferences$Editor;
import com.reddit.video.creation.analytics.FlowType;
import com.reddit.video.creation.analytics.Tap;
import com.reddit.video.creation.analytics.TapTarget;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$RecordingStarted;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$CountdownStopped;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEventUtilsKt;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.video.creation.widgets.recording.view.state.RecordImageViewEventUtilsKt;
import com.reddit.video.creation.widgets.recording.view.state.RecordImageViewEvent;
import ff2.o;
import af2.t;
import com.reddit.video.creation.analytics.SegmentStarted;
import com.reddit.video.creation.analytics.segment.SegmentStartedData;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.SubscribersKt;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$TimerHidden;
import android.os.Bundle;
import pu2.a$b;
import android.content.Context;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$NewIntent;
import com.reddit.video.creation.eventbus.EventBus$NavigationEvent$OpenAdjustClipsFragment;
import com.reddit.video.creation.models.adjustclips.AdjustClipsLaunchData;
import com.reddit.video.creation.widgets.recording.view.IntentParams;
import com.reddit.video.creation.eventbus.EventBus$NavigationEvent;
import com.reddit.video.creation.eventbus.EventBus$NavigationEvent$OpenEditUgcFragment;
import com.reddit.video.creation.widgets.edit.EditUgcExtras;
import java.util.Collection;
import com.reddit.video.creation.api.configuration.WatermarkConfig;
import com.reddit.video.creation.api.configuration.Sound;
import com.reddit.video.creation.api.configuration.Theme;
import android.content.SharedPreferences;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$RecordingControlsUpdated;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$RecordingButtonsUpdated;
import com.reddit.video.creation.api.configuration.VideoCreationConfiguration;
import com.reddit.video.creation.models.adjustclips.InitialClipData$Companion;
import com.reddit.video.creation.models.adjustclips.InitialClipData;
import dg2.m;
import com.reddit.video.creation.widgets.utils.RecordVideoUtilKt;
import android.util.Size;
import android.util.Log;
import com.reddit.video.creation.widgets.utils.VideoUtils;
import android.net.Uri;
import java.util.Iterator;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewEvent$SegmentsUpdated;
import com.reddit.video.creation.analytics.Analytics;
import com.reddit.video.creation.analytics.SegmentStopped;
import cg2.j;
import mg2.l;
import com.reddit.video.creation.widgets.recording.view.RecordEventSender;
import com.reddit.video.creation.models.camera.CameraDirection;
import com.reddit.video.creation.models.adjustclips.AdjustedClip;
import com.reddit.video.creation.models.adjustclips.AdjustClipsFlowType;
import javax.inject.Inject;
import kotlin.collections.EmptyList;
import java.util.ArrayList;
import com.reddit.video.creation.widgets.recording.view.state.RecordVideoViewState;
import com.reddit.video.creation.widgets.recording.view.state.RecordImageViewState;
import com.reddit.video.creation.api.configuration.ImageCreationConfiguration;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.video.creation.widgets.recording.view.state.RecordViewState;
import com.reddit.video.creation.widgets.recording.view.state.RecordViewEvent;
import io.reactivex.subjects.PublishSubject;
import com.reddit.video.creation.api.output.RecordedSegment;
import com.reddit.video.creation.analytics.screen.ScreenId;
import com.reddit.video.creation.widgets.recording.view.IntentParams$RestoreRecordingParams;
import com.reddit.video.creation.widgets.recording.presenter.player.RecordedVideoPlayerPresenterDelegateFactory;
import com.reddit.video.creation.widgets.recording.view.RecordEventSenderFactory;
import com.reddit.video.creation.models.recording.RecordDubType;
import com.reddit.video.creation.player.interfaces.MediaPlayerApi$Event;
import com.reddit.video.creation.player.interfaces.MediaPlayerApi;
import java.util.List;
import com.reddit.video.creation.models.lens.LensFilter;
import com.reddit.video.creation.widgets.utils.RxObservableProperty;
import cg2.f;
import com.reddit.video.creation.api.configuration.FeatureConfig;
import com.reddit.video.creation.eventbus.EventBus;
import df2.a;
import com.reddit.video.creation.api.configuration.CreationConfiguration;
import com.reddit.video.creation.models.camera.CameraHardwareData;
import af2.c0;
import com.reddit.video.creation.state.CameraDirectionSetting;
import com.reddit.video.creation.models.camera.CameraApiData;
import java.io.Closeable;
import java.io.File;
import com.reddit.video.creation.state.AspectRatioConfig;
import ug2.k;
import kotlin.Metadata;
import com.reddit.video.creation.widgets.utils.di.scopes.FragmentScope;
import com.reddit.video.creation.widgets.recording.view.filters.OnFilterSelectedListener;
import com.reddit.video.creation.widgets.recording.view.RecordVideoView;
import com.reddit.video.creation.widgets.base.VideoPlayerAbstractPresenter;

@FragmentScope
@Metadata(bv = {}, d1 = { "\u0000¬\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00df\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u000e\u00df\u0002\u00e0\u0002\u00e1\u0002\u00e2\u0002\u00e3\u0002\u00e4\u0002\u00e5\u0002Be\b\u0007\u0012\b\u0010º\u0001\u001a\u00030¹\u0001\u0012\b\u0010½\u0001\u001a\u00030¼\u0001\u0012\b\u0010\u00c0\u0001\u001a\u00030¿\u0001\u0012\b\u0010\u00c3\u0001\u001a\u00030\u00c2\u0001\u0012\b\u0010\u00c6\u0001\u001a\u00030\u00c5\u0001\u0012\b\u0010\u00c9\u0001\u001a\u00030\u00c8\u0001\u0012\b\u0010\u00cc\u0001\u001a\u00030\u00cb\u0001\u0012\b\u0010\u00d1\u0001\u001a\u00030\u00d0\u0001\u0012\b\u0010\u00d6\u0001\u001a\u00030\u00d5\u0001¢\u0006\u0006\b\u00dd\u0002\u0010\u00de\u0002J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001J\t\u0010\f\u001a\u00020\nH\u0096\u0001J\t\u0010\r\u001a\u00020\nH\u0096\u0001J\t\u0010\u000e\u001a\u00020\nH\u0096\u0001J\t\u0010\u000f\u001a\u00020\nH\u0096\u0001J\t\u0010\u0010\u001a\u00020\nH\u0096\u0001J\t\u0010\u0011\u001a\u00020\nH\u0096\u0001J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0096\u0001J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0096\u0001J \u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001d\u001a\u00020\nH\u0016J\u0016\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ\b\u0010!\u001a\u00020\nH\u0016J\u000e\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\bJ\u0006\u0010$\u001a\u00020\nJ\u0006\u0010%\u001a\u00020\nJ\u0006\u0010&\u001a\u00020\nJ\u000f\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u0006\u0010*\u001a\u00020\nJ\u0010\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u001aH\u0016J\u0010\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-J\b\u00100\u001a\u00020\bH\u0016J\b\u00101\u001a\u00020\nH\u0016J\u0006\u00102\u001a\u00020\nJ\u0006\u00103\u001a\u00020\nJ\u0006\u00104\u001a\u00020\nJ\u0006\u00105\u001a\u00020\nJ\u0006\u00106\u001a\u00020\nJ\u0010\u00109\u001a\u00020\n2\u0006\u00108\u001a\u000207H\u0016J\u0006\u0010:\u001a\u00020\nJ\u0006\u0010;\u001a\u00020\nJ\b\u0010<\u001a\u00020\nH\u0016J\u001c\u0010?\u001a\u00020\n2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0=H\u0016J\u0006\u0010@\u001a\u00020\nJ\u0006\u0010A\u001a\u00020\nJ\u0006\u0010B\u001a\u00020\nJ\u0006\u0010C\u001a\u00020\nJ\u0006\u0010D\u001a\u00020\nJ\u000e\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020EJ\u000e\u0010I\u001a\u00020\n2\u0006\u0010H\u001a\u00020\bJ\u0006\u0010J\u001a\u00020\bJ\u0006\u0010K\u001a\u00020\nJ\u0010\u0010N\u001a\u00020\n2\b\u0010M\u001a\u0004\u0018\u00010LJ\u0006\u0010O\u001a\u00020\nJ\b\u0010P\u001a\u00020\nH\u0016J\u0012\u0010Q\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\b\u0010R\u001a\u00020\nH\u0016J\u0010\u0010S\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\b\u0010T\u001a\u00020\nH\u0016J\u0010\u0010U\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\bH\u0016J\b\u0010V\u001a\u00020\nH\u0016J\b\u0010W\u001a\u00020\nH\u0016J\u0010\u0010Y\u001a\u00020\n2\u0006\u0010X\u001a\u00020\bH\u0016J\u0012\u0010Z\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\b\u0010[\u001a\u00020\nH\u0016J\u0018\u0010\\\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010]\u001a\u00020\nH\u0016J\u0010\u0010^\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\bH\u0016J\b\u0010_\u001a\u00020\nH\u0016J\b\u0010`\u001a\u00020\nH\u0016J\b\u0010a\u001a\u00020\bH\u0002J\b\u0010c\u001a\u00020bH\u0002J\b\u0010d\u001a\u00020\bH\u0002J\b\u0010f\u001a\u00020eH\u0002J\u0012\u0010g\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010h\u001a\u00020\nH\u0002J\b\u0010i\u001a\u00020\nH\u0002J\b\u0010j\u001a\u00020\nH\u0002J\u0010\u0010k\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010l\u001a\u00020\nH\u0002J\u0010\u0010m\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010n\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010o\u001a\u00020\nH\u0002J\b\u0010p\u001a\u00020\nH\u0002J\b\u0010q\u001a\u00020\nH\u0002J\b\u0010r\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010s\u001a\u00020\nH\u0002J\u0018\u0010x\u001a\u00020\n2\u0006\u0010u\u001a\u00020t2\u0006\u0010w\u001a\u00020vH\u0002J\b\u0010y\u001a\u00020\nH\u0002J\b\u0010z\u001a\u00020\nH\u0002J\u0010\u0010|\u001a\u00020\n2\u0006\u0010{\u001a\u00020\bH\u0002J\b\u0010}\u001a\u00020\nH\u0002J\b\u0010~\u001a\u00020\nH\u0002J\b\u0010\u007f\u001a\u00020\nH\u0002J\t\u0010\u0080\u0001\u001a\u00020\bH\u0002J\u0013\u0010\u0083\u0001\u001a\u00020\n2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0002J\t\u0010\u0084\u0001\u001a\u00020\nH\u0002J\u0015\u0010\u0087\u0001\u001a\u00020\n2\n\b\u0002\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0003J\u0011\u0010\u0088\u0001\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0002J\u0012\u0010\u008a\u0001\u001a\u00020\n2\u0007\u0010.\u001a\u00030\u0089\u0001H\u0002J\t\u0010\u008b\u0001\u001a\u00020\nH\u0002J\u0014\u0010\u008f\u0001\u001a\u00030\u008e\u00012\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001H\u0002J\u0011\u0010\u0090\u0001\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0002J\u0011\u0010\u0091\u0001\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0002J\u0011\u0010\u0092\u0001\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0002J'\u0010\u0094\u0001\u001a\u00020\n2\b\u0010\u0093\u0001\u001a\u00030\u008e\u00012\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0002J\u0013\u0010\u0095\u0001\u001a\u00020\b2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0002J\u0013\u0010\u0096\u0001\u001a\u00020\n2\b\u0010\u0093\u0001\u001a\u00030\u008e\u0001H\u0002J\u0013\u0010\u0097\u0001\u001a\u00020\n2\b\u0010\u0093\u0001\u001a\u00030\u008e\u0001H\u0002J\t\u0010\u0098\u0001\u001a\u00020\nH\u0002J\u0012\u0010\u009a\u0001\u001a\u00020'2\u0007\u0010\u0099\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u009b\u0001\u001a\u00020\nH\u0002J\u0013\u0010\u009e\u0001\u001a\u00020\n2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0002J\t\u0010\u009f\u0001\u001a\u00020\bH\u0002J\u0011\u0010 \u0001\u001a\u00020\n2\u0006\u00108\u001a\u000207H\u0002J\u0012\u0010¢\u0001\u001a\u00020\n2\u0007\u0010¡\u0001\u001a\u00020\bH\u0002J\t\u0010£\u0001\u001a\u00020\nH\u0002J\u0011\u0010¦\u0001\u001a\n\u0012\u0005\u0012\u00030¥\u00010¤\u0001H\u0002J$\u0010©\u0001\u001a\u00020\n2\u000f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010¤\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0002J$\u0010ª\u0001\u001a\u00020\n2\u000f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010¤\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0002J\n\u0010¬\u0001\u001a\u00030«\u0001H\u0002J\t\u0010\u00ad\u0001\u001a\u00020\bH\u0002J\t\u0010®\u0001\u001a\u00020\nH\u0002J\u0013\u0010±\u0001\u001a\u00020\n2\b\u0010°\u0001\u001a\u00030¯\u0001H\u0002J\t\u0010²\u0001\u001a\u00020\nH\u0002J \u0010¶\u0001\u001a\u00030µ\u00012\u0014\u0010´\u0001\u001a\u000f\u0012\u0005\u0012\u00030³\u0001\u0012\u0004\u0012\u00020\n0=H\u0002J\u0012\u0010¸\u0001\u001a\u00020\n2\u0007\u0010·\u0001\u001a\u00020'H\u0002R\u0018\u0010º\u0001\u001a\u00030¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0018\u0010½\u0001\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010\u00c0\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00c0\u0001\u0010\u00c1\u0001R\u0018\u0010\u00c3\u0001\u001a\u00030\u00c2\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00c3\u0001\u0010\u00c4\u0001R\u0018\u0010\u00c6\u0001\u001a\u00030\u00c5\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00c6\u0001\u0010\u00c7\u0001R\u0018\u0010\u00c9\u0001\u001a\u00030\u00c8\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00c9\u0001\u0010\u00ca\u0001R\u001d\u0010\u00cc\u0001\u001a\u00030\u00cb\u00018\u0006¢\u0006\u0010\n\u0006\b\u00cc\u0001\u0010\u00cd\u0001\u001a\u0006\b\u00ce\u0001\u0010\u00cf\u0001R\u001d\u0010\u00d1\u0001\u001a\u00030\u00d0\u00018\u0006¢\u0006\u0010\n\u0006\b\u00d1\u0001\u0010\u00d2\u0001\u001a\u0006\b\u00d3\u0001\u0010\u00d4\u0001R\u0018\u0010\u00d6\u0001\u001a\u00030\u00d5\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00d6\u0001\u0010\u00d7\u0001R,\u0010\u00da\u0001\u001a\u00030\u00d8\u00012\b\u0010\u00d9\u0001\u001a\u00030\u00d8\u00018\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u00da\u0001\u0010\u00db\u0001\u001a\u0006\b\u00dc\u0001\u0010\u00dd\u0001R\u0019\u0010\u00de\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00de\u0001\u0010\u00df\u0001R\u0017\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bH\u0010\u00df\u0001R)\u0010\u00e3\u0001\u001a\u0014\u0012\u000f\u0012\r \u00e2\u0001*\u0005\u0018\u00010\u00e1\u00010\u00e1\u00010\u00e0\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00e3\u0001\u0010\u00e4\u0001R\u0019\u0010\u00e5\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00e5\u0001\u0010\u00df\u0001R\u0019\u0010\u00e6\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00e6\u0001\u0010\u00df\u0001R\u001b\u0010\u00e7\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00e7\u0001\u0010\u00e8\u0001R\u001b\u0010\u00e9\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00e9\u0001\u0010\u00e8\u0001R\u001b\u0010\u00ea\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ea\u0001\u0010\u00e8\u0001R\u001b\u0010\u00eb\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00eb\u0001\u0010\u00e8\u0001R\u001b\u0010\u00ec\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ec\u0001\u0010\u00e8\u0001R\u001b\u0010\u00ed\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ed\u0001\u0010\u00ee\u0001R\u001b\u0010\u00ef\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ef\u0001\u0010\u00e8\u0001R\u001b\u0010\u00f0\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00f0\u0001\u0010\u00e8\u0001R\u0019\u0010\u00f1\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00f1\u0001\u0010\u00df\u0001R\u001c\u0010\u00f2\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00f2\u0001\u0010\u00f3\u0001R\u0017\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010\u00df\u0001R\u0018\u0010\u00f5\u0001\u001a\u00030\u00f4\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00f5\u0001\u0010\u00f6\u0001R\u001c\u0010\u00f7\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00f7\u0001\u0010\u00f8\u0001R\u0019\u0010\u00f9\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00f9\u0001\u0010\u00df\u0001R\u001a\u0010\u00fa\u0001\u001a\u00030³\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00fa\u0001\u0010\u00f3\u0001R\u001a\u0010\u00fc\u0001\u001a\u00030\u00fb\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00fc\u0001\u0010\u00fd\u0001R$\u0010\u00ff\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u00fe\u00018\u0006¢\u0006\u0010\n\u0006\b\u00ff\u0001\u0010\u0080\u0002\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001b\u0010\u0083\u0002\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u00e8\u0001R\u0017\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u00df\u0001R\u0019\u0010\u0084\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u00df\u0001R\u0019\u0010\u0085\u0002\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R\u001b\u0010\u0087\u0002\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u00e8\u0001R\u001c\u0010\u0089\u0002\u001a\u0005\u0018\u00010\u0088\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u008a\u0002R\u001b\u0010\u008b\u0002\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R\u001b\u0010\u008d\u0002\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u00e8\u0001R\u001b\u0010\u008e\u0002\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u00e8\u0001R\u001a\u0010\u0090\u0002\u001a\u00030\u008f\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R,\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u0092\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010\u0094\u0002\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002\"\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0018\u0010\u009a\u0002\u001a\u00030\u0099\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0019\u0010\u009c\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u00df\u0001R\u0017\u0010\u009d\u0002\u001a\u00020L8\u0002X\u0082D¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u00e8\u0001R\u001e\u0010\u009f\u0002\u001a\t\u0012\u0004\u0012\u00020\b0\u009e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R3\u0010¢\u0002\u001a\u00020\b2\u0007\u0010\u00d9\u0001\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b¡\u0002\u0010 \u0002\u001a\u0006\b¢\u0002\u0010£\u0002\"\u0006\b¤\u0002\u0010¥\u0002R\u0019\u0010¦\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010\u00df\u0001R\u001b\u0010§\u0002\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002R\u0019\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b8\u0010¨\u0002R\u0019\u0010©\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0002\u0010\u00df\u0001R\u0019\u0010ª\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0002\u0010\u00df\u0001R\u0019\u0010«\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010\u00df\u0001R\u0019\u0010¬\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010\u00df\u0001R\u001a\u0010\u00ad\u0002\u001a\u00030µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R \u0010¯\u0002\u001a\t\u0012\u0004\u0012\u0002070¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010\u0080\u0002R\u001b\u0010°\u0002\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0002\u0010\u00e8\u0001R\u0014\u0010±\u0002\u001a\u00020\b8F¢\u0006\b\u001a\u0006\b±\u0002\u0010£\u0002R!\u0010·\u0002\u001a\u00030²\u00028FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0002\u0010´\u0002\u001a\u0006\bµ\u0002\u0010¶\u0002R\u0017\u0010¹\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¸\u0002\u0010£\u0002R\u0017\u0010»\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0002\u0010£\u0002R\u0018\u0010¿\u0002\u001a\u00030¼\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010¾\u0002R\u0017\u0010\u00c2\u0002\u001a\u00020v8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00c0\u0002\u0010\u00c1\u0002R\u0018\u0010\u00c5\u0002\u001a\u00030\u009c\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00c3\u0002\u0010\u00c4\u0002R\u0018\u0010.\u001a\u0004\u0018\u00010-8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00c6\u0002\u0010\u00c7\u0002R\u0017\u0010\u00c9\u0002\u001a\u00020\b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00c8\u0002\u0010£\u0002R\u0017\u0010\u00cb\u0002\u001a\u00020\b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ca\u0002\u0010£\u0002R\u0017\u0010\u00cc\u0002\u001a\u00020\b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00cc\u0002\u0010£\u0002R!\u0010\u00d1\u0002\u001a\u00030\u00cd\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ce\u0002\u0010´\u0002\u001a\u0006\b\u00cf\u0002\u0010\u00d0\u0002R\u0017\u0010\u00d4\u0002\u001a\u00020'8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00d2\u0002\u0010\u00d3\u0002R\u0017\u0010\u00d5\u0002\u001a\u00020\b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00d5\u0002\u0010£\u0002R \u0010\u00d7\u0002\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00d6\u0002\u0010´\u0002\u001a\u0006\b\u00d7\u0002\u0010£\u0002R+\u0010\u00dc\u0002\u001a\r \u00e2\u0001*\u0005\u0018\u00010\u00d8\u00020\u00d8\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00d9\u0002\u0010´\u0002\u001a\u0006\b\u00da\u0002\u0010\u00db\u0002¨\u0006\u00e6\u0002" }, d2 = { "Lcom/reddit/video/creation/widgets/recording/presenter/RecordVideoPresenter;", "Lcom/reddit/video/creation/widgets/base/VideoPlayerAbstractPresenter;", "Lcom/reddit/video/creation/widgets/recording/view/RecordVideoView;", "Lcom/reddit/video/creation/widgets/recording/view/filters/OnFilterSelectedListener;", "Lcom/reddit/video/creation/widgets/recording/presenter/OnRecordView;", "Lcom/reddit/video/creation/widgets/recording/presenter/UIInteractor;", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordVideoEventProvider;", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordImageEventProvider;", "", "isSoundFeatureEnabled", "Lcg2/j;", "displayUiBasedOnRecordingType", "goBackFromRationaleClicked", "onDeleteSegmentCancelled", "onDeleteSegmentClicked", "onFiltersClosed", "onLeaveTheScreenConfirmed", "onOpenFiltersClicked", "permissionAlreadyChecked", "Lkotlin/Function0;", "startPreview", "startPreviewWithImagePermissionsCheck", "startPreviewWithVideoPermissionsCheck", "view", "Lcom/reddit/video/creation/widgets/recording/view/IntentParams;", "intentParams", "Landroid/os/Bundle;", "savedState", "viewCreated", "onResume", "cameraGranted", "micGranted", "onCameraPermissionResult", "onPause", "checked", "onFlashToggleClicked", "setZoomUsed", "onTimerClicked", "switchCameras", "", "getLastDeletableSegmentIndex", "()Ljava/lang/Integer;", "onFinishRecordingClicked", "outState", "saveState", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordingStartType;", "recordingStartType", "setRecording", "onBackPressed", "onDestroy", "onCameraRationaleGoToSettingsClick", "onLeaveTheScreenRequested", "onDeleteSegmentConfirmed", "onCloseTimerClicked", "onCancelCountdownClicked", "Lcom/reddit/video/creation/models/lens/LensFilter;", "selectedLens", "onFilterSelected", "onApplyFilterClicked", "onCloseFilterButtonClicked", "onVideoContainerClicked", "Lkotlin/Function1;", "functionToRun", "runIfAvailable", "onPlayClicked", "onUploadUserVideosClicked", "onAdjustClipsClicked", "onAddSoundClicked", "onTitleClicked", "Lcom/reddit/video/creation/widgets/recording/view/filters/SnapFiltersManager;", "snapFiltersManager", "fetchSnapChatLenses", "hasHardwareFlash", "onCreate", "tryFinishRecording", "handleFinish", "", "uri", "updateOrientation", "onStopClicked", "sendOnCreatedImageEvent", "sendRecordingStartImageEvent", "sendImageCameraSwitchedEvent", "sendImageCameraPermissionResultEvent", "onImageLeaveTheScreenRequested", "onImageFlashToggleClicked", "onImageResume", "sendImagePermissionsGrantedEvent", "hasStitchToDownload", "sendOnCreatedVideoEvent", "sendRecordingStartVideoEvent", "sendVideoCameraSwitchedEvent", "sendVideoCameraPermissionResultEvent", "onVideoLeaveTheScreenRequested", "onVideoFlashToggleClicked", "onVideoResume", "sendVideoPermissionsGrantedEvent", "tryCreateRenderedDubFile", "Lcom/reddit/video/creation/widgets/recording/view/state/RecordVideoViewEvent$RecordingButtonsUpdated;", "getRecordingButtonsUpdate", "isFlashLightAccessible", "Lcom/reddit/video/creation/widgets/recording/view/state/RecordVideoViewEvent$RecordingControlsUpdated;", "getRecordingControlsUpdate", "handleSavedState", "observeEditUGC", "observeViewEvents", "observeAdjustClips", "handleNewIntent", "restoreRecordingParams", "readValuesFromIntent", "initCameraApi", "initCamera", "handleRawRecordingResume", "onRawMediaReady", "loadMedia", "switchCameraIfFrontCamNotAvailable", "", "waveform", "", "durationMs", "onMediaReady", "createTimerPresenter", "turnOffFlash", "isEnabled", "setFlashEnabled", "showTimer", "deleteLastSegment", "setAddSoundButtonVisibility", "shouldShowFinishRecordingButton", "Lcom/reddit/video/creation/models/adjustclips/AdjustClipsFlowType;", "flowType", "onRecordingFinished", "goToEditScreen", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordVideoPresenter$StopRecordingType;", "stopRecordingType", "stopRecording", "startRecordingOrSetTimer", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordingStartType$Timer;", "startCountDown", "updateViewOnRecordingStopped", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordVideoPresenter$RecordingEndData;", "recordingEndData", "Lcom/reddit/video/creation/api/output/RecordedSegment;", "createRecordedSegment", "onDelayStarted", "startRecording", "logStartSegmentAnalytics", "recordedSegment", "handleRecordedSegment", "shouldFinalizeVideo", "checkIfIsFromMediaPlayerComplete", "addSegment", "updateRecordingProgress", "recordDubView", "updateProgressForRegularRecording", "pausePlayer", "Lcom/reddit/video/creation/models/camera/CameraDirection;", "requestedCameraDirection", "setCameraDirection", "shouldTitleBeShown", "showFilters", "updateRecordingButtons", "hideTimer", "onRecordStart", "", "Lcom/reddit/video/creation/models/adjustclips/InitialClipData;", "getInitialClipDatas", "Lcom/reddit/video/creation/models/adjustclips/AdjustedClip;", "adjustedClips", "addTrimmedClips", "onAdjustedClipsUpdated", "Lcom/reddit/video/creation/widgets/recording/view/IntentParams$RestoreRecordingParams;", "getRestoreRecordingParams", "shouldAddSoundButtonBeVisible", "playMediaOnRecordingStart", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordVideoPresenter$RecordingSession;", "recordingSession", "updateMediaPlayerProgress", "onCountdownStopped", "Ljava/io/File;", "callback", "Ljava/io/Closeable;", "startSnapCameraRecord", "countdown", "updateViewOnCountdownTick", "Lcom/reddit/video/creation/player/interfaces/MediaPlayerApi;", "mediaPlayerApi", "Lcom/reddit/video/creation/player/interfaces/MediaPlayerApi;", "Lcom/reddit/video/creation/widgets/recording/presenter/UIInteractionDelegate;", "uiInteractionDelegate", "Lcom/reddit/video/creation/widgets/recording/presenter/UIInteractionDelegate;", "Lcom/reddit/video/creation/widgets/recording/presenter/player/RecordedVideoPlayerPresenterDelegateFactory;", "recordedVideoPlayerPresenterDelegateFactory", "Lcom/reddit/video/creation/widgets/recording/presenter/player/RecordedVideoPlayerPresenterDelegateFactory;", "Lcom/reddit/video/creation/eventbus/EventBus;", "eventBus", "Lcom/reddit/video/creation/eventbus/EventBus;", "Lcom/reddit/video/creation/api/configuration/CreationConfiguration;", "creationConfiguration", "Lcom/reddit/video/creation/api/configuration/CreationConfiguration;", "Lcom/reddit/video/creation/api/configuration/FeatureConfig;", "featureConfig", "Lcom/reddit/video/creation/api/configuration/FeatureConfig;", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "aspectRatioConfig", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "getAspectRatioConfig", "()Lcom/reddit/video/creation/state/AspectRatioConfig;", "Lcom/reddit/video/creation/widgets/recording/view/RecordEventSenderFactory;", "recordEventSenderFactory", "Lcom/reddit/video/creation/widgets/recording/view/RecordEventSenderFactory;", "getRecordEventSenderFactory", "()Lcom/reddit/video/creation/widgets/recording/view/RecordEventSenderFactory;", "Lcom/reddit/video/creation/state/CameraDirectionSetting;", "cameraDirectionSetting", "Lcom/reddit/video/creation/state/CameraDirectionSetting;", "Lcom/reddit/video/creation/widgets/recording/view/state/RecordViewState;", "<set-?>", "viewState", "Lcom/reddit/video/creation/widgets/recording/view/state/RecordViewState;", "getViewState$creation_release", "()Lcom/reddit/video/creation/widgets/recording/view/state/RecordViewState;", "wereFiltersShown", "Z", "Lio/reactivex/subjects/PublishSubject;", "Lcom/reddit/video/creation/widgets/recording/view/state/RecordViewEvent;", "kotlin.jvm.PlatformType", "viewEventProcessor", "Lio/reactivex/subjects/PublishSubject;", "isRecordingFinished", "isResumed", "audioUri", "Ljava/lang/String;", "waveformUri", "sourceUuid", "sourceTitle", "sourceSearchTerm", "sourceListPosition", "Ljava/lang/Integer;", "creatorUsername", "creatorUserUuid", "isFlashEnabled", "audioFile", "Ljava/io/File;", "Lcom/reddit/video/creation/analytics/screen/ScreenId;", "screenId", "Lcom/reddit/video/creation/analytics/screen/ScreenId;", "recordingParamsToRestore", "Lcom/reddit/video/creation/widgets/recording/view/IntentParams$RestoreRecordingParams;", "shouldMergeFiles", "renderedDubFile", "Lcom/reddit/video/creation/models/camera/CameraApiData;", "cameraApiData", "Lcom/reddit/video/creation/models/camera/CameraApiData;", "", "segmentList", "Ljava/util/List;", "getSegmentList", "()Ljava/util/List;", "videoTitle", "isFromMediaPlayerComplete", "currentMediaDurationMs", "J", "recommendationIdentifier", "", "recommendationScore", "Ljava/lang/Float;", "recommendationUpdatedAt", "Ljava/lang/Long;", "exploreGroupUuid", "exploreGroupTitle", "Lcom/reddit/video/creation/models/recording/RecordDubType;", "recordDubType", "Lcom/reddit/video/creation/models/recording/RecordDubType;", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordTimerPresenter;", "recordTimerPresenter", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordTimerPresenter;", "getRecordTimerPresenter$creation_release", "()Lcom/reddit/video/creation/widgets/recording/presenter/RecordTimerPresenter;", "setRecordTimerPresenter$creation_release", "(Lcom/reddit/video/creation/widgets/recording/presenter/RecordTimerPresenter;)V", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordVideoPresenter$RecordingStateReducer;", "recordingStateReducer", "Lcom/reddit/video/creation/widgets/recording/presenter/RecordVideoPresenter$RecordingStateReducer;", "hasCompletedRawRecording", "contentType", "Lcom/reddit/video/creation/widgets/utils/RxObservableProperty;", "isTimerWindowOpenProperty", "Lcom/reddit/video/creation/widgets/utils/RxObservableProperty;", "isTimerWindowOpen$delegate", "isTimerWindowOpen", "()Z", "setTimerWindowOpen", "(Z)V", "isRendering", "lastLensApplied", "Lcom/reddit/video/creation/models/lens/LensFilter;", "isFinishingRecording", "zoomUsed", "showSoundTitle", "isStitchAvailable", "availableLensesQuery", "Ljava/io/Closeable;", "lenses", "stitchUri", "isTimerEnabled", "Lcom/reddit/video/creation/widgets/recording/presenter/player/RecordedVideoPlayerPresenter;", "recordingPlayerPresenter$delegate", "Lcg2/f;", "getRecordingPlayerPresenter", "()Lcom/reddit/video/creation/widgets/recording/presenter/player/RecordedVideoPlayerPresenter;", "recordingPlayerPresenter", "getAreImagePermissionsGranted", "areImagePermissionsGranted", "getAreVideoPermissionsGranted", "areVideoPermissionsGranted", "Lcom/reddit/video/creation/api/configuration/VideoCreationConfiguration;", "getVideoCreationConfiguration", "()Lcom/reddit/video/creation/api/configuration/VideoCreationConfiguration;", "videoCreationConfiguration", "getMaxAllowedDurationMillis", "()J", "maxAllowedDurationMillis", "getCurrentDirection", "()Lcom/reddit/video/creation/models/camera/CameraDirection;", "currentDirection", "getRecordingStartType", "()Lcom/reddit/video/creation/widgets/recording/presenter/RecordingStartType;", "getShowCheckMarkDuringRecording", "showCheckMarkDuringRecording", "getArePermissionsGranted", "arePermissionsGranted", "isRecording", "Lcom/reddit/video/creation/widgets/recording/view/RecordEventSender;", "recordEventSender$delegate", "getRecordEventSender", "()Lcom/reddit/video/creation/widgets/recording/view/RecordEventSender;", "recordEventSender", "getTotalActualRecordedLength", "()I", "totalActualRecordedLength", "isSegmentForRecordingAvailable", "isRaw$delegate", "isRaw", "Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs", "<init>", "(Lcom/reddit/video/creation/player/interfaces/MediaPlayerApi;Lcom/reddit/video/creation/widgets/recording/presenter/UIInteractionDelegate;Lcom/reddit/video/creation/widgets/recording/presenter/player/RecordedVideoPlayerPresenterDelegateFactory;Lcom/reddit/video/creation/eventbus/EventBus;Lcom/reddit/video/creation/api/configuration/CreationConfiguration;Lcom/reddit/video/creation/api/configuration/FeatureConfig;Lcom/reddit/video/creation/state/AspectRatioConfig;Lcom/reddit/video/creation/widgets/recording/view/RecordEventSenderFactory;Lcom/reddit/video/creation/state/CameraDirectionSetting;)V", "Companion", "RecordingEndData", "RecordingSession", "RecordingStartData", "RecordingState", "RecordingStateReducer", "StopRecordingType", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class RecordVideoPresenter extends VideoPlayerAbstractPresenter<RecordVideoView> implements OnFilterSelectedListener, OnRecordView, UIInteractor, RecordVideoEventProvider, RecordImageEventProvider
{
    public static final k<Object>[] $$delegatedProperties;
    public static final int ARTIFICIAL_HUMAN_DELAY_MS = 133;
    public static final String BUNDLE_KEY_FLASH_ON = "FLASH_ON";
    private static final String BUNDLE_KEY_SEGMENTS_LIST = "bundle_key_segments_list";
    public static final RecordVideoPresenter.RecordVideoPresenter$Companion Companion;
    private static final int MIN_ACCEPTED_CAMERA_DURATION = 101;
    private static final long MIN_DUB_LENGTH_MS = 100L;
    private static final long MIN_TIMER_SEGMENT_LENGTH_MS = 300L;
    private static final String MP4_FILE_PREFIX = "rendered-dub-";
    private static final String MP4_FILE_SUFFIX = ".mp4";
    public static final int REQ_CODE_POST_DUB = 8197;
    private static final int REQ_CODE_SETTINGS = 7;
    private static final long SEEKBAR_STEP_MS = 10L;
    private static final String SHARED_PREFS_NAME = "PREFERENCES_FOR_SNAP_CAMERA_KIT";
    private static final String SNAP_CAMERA_KIT_LEARN_MORE_URL = "https://reddithelp.com/hc/en-us/articles/4424720425876";
    private static final String SNAP_CAMERA_KIT_TERMS_FLAG = "SNAP_CAMERA_KIT_TERMS_FLAG_VALUE";
    private static final String TAG = "RecordDubMVP";
    private static final long UPDATE_PERIOD_MS = 33L;
    private final AspectRatioConfig aspectRatioConfig;
    private File audioFile;
    private String audioUri;
    private Closeable availableLensesQuery;
    private CameraApiData cameraApiData;
    private final CameraDirectionSetting cameraDirectionSetting;
    private c0<CameraHardwareData> cameraHardwareDataSingle;
    private final String contentType;
    private final CreationConfiguration creationConfiguration;
    private String creatorUserUuid;
    private String creatorUsername;
    private long currentMediaDurationMs;
    private a editUGCResultsSubscription;
    private final EventBus eventBus;
    private String exploreGroupTitle;
    private String exploreGroupUuid;
    private final FeatureConfig featureConfig;
    private boolean hasCompletedRawRecording;
    private boolean hasHardwareFlash;
    private boolean isFinishingRecording;
    private boolean isFlashEnabled;
    private boolean isFromMediaPlayerComplete;
    private final f isRaw$delegate;
    private boolean isRecordingFinished;
    private boolean isRendering;
    private boolean isResumed;
    private boolean isSoundFeatureEnabled;
    private boolean isStitchAvailable;
    private final RxObservableProperty isTimerWindowOpen$delegate;
    private final RxObservableProperty<Boolean> isTimerWindowOpenProperty;
    private LensFilter lastLensApplied;
    private List<? extends LensFilter> lenses;
    private final MediaPlayerApi mediaPlayerApi;
    private uf2.a<MediaPlayerApi$Event> mediaPlayerObservable;
    private boolean permissionAlreadyChecked;
    private String recommendationIdentifier;
    private Float recommendationScore;
    private Long recommendationUpdatedAt;
    private RecordDubType recordDubType;
    private final f recordEventSender$delegate;
    private final RecordEventSenderFactory recordEventSenderFactory;
    private RecordTimerPresenter recordTimerPresenter;
    private final RecordedVideoPlayerPresenterDelegateFactory recordedVideoPlayerPresenterDelegateFactory;
    private IntentParams$RestoreRecordingParams recordingParamsToRestore;
    private final f recordingPlayerPresenter$delegate;
    private final RecordVideoPresenter.RecordVideoPresenter$RecordingStateReducer recordingStateReducer;
    private File renderedDubFile;
    private final ScreenId screenId;
    private final List<RecordedSegment> segmentList;
    private LensFilter selectedLens;
    private final f sharedPrefs$delegate;
    private boolean shouldMergeFiles;
    private boolean showSoundTitle;
    private Integer sourceListPosition;
    private String sourceSearchTerm;
    private String sourceTitle;
    private String sourceUuid;
    private String stitchUri;
    private final UIInteractionDelegate uiInteractionDelegate;
    private String videoTitle;
    private final PublishSubject<RecordViewEvent> viewEventProcessor;
    private RecordViewState viewState;
    private String waveformUri;
    private boolean wereFiltersShown;
    private boolean zoomUsed;
    
    static {
        $$delegatedProperties = new k[] { (k)d.w((Class)RecordVideoPresenter.class, "isTimerWindowOpen", "isTimerWindowOpen()Z", 0) };
        Companion = new RecordVideoPresenter.RecordVideoPresenter$Companion((DefaultConstructorMarker)null);
    }
    
    @Inject
    public RecordVideoPresenter(final MediaPlayerApi mediaPlayerApi, final UIInteractionDelegate uiInteractionDelegate, final RecordedVideoPlayerPresenterDelegateFactory recordedVideoPlayerPresenterDelegateFactory, final EventBus eventBus, final CreationConfiguration creationConfiguration, final FeatureConfig featureConfig, final AspectRatioConfig aspectRatioConfig, final RecordEventSenderFactory recordEventSenderFactory, final CameraDirectionSetting cameraDirectionSetting) {
        e.f((Object)mediaPlayerApi, "mediaPlayerApi");
        e.f((Object)uiInteractionDelegate, "uiInteractionDelegate");
        e.f((Object)recordedVideoPlayerPresenterDelegateFactory, "recordedVideoPlayerPresenterDelegateFactory");
        e.f((Object)eventBus, "eventBus");
        e.f((Object)creationConfiguration, "creationConfiguration");
        e.f((Object)featureConfig, "featureConfig");
        e.f((Object)aspectRatioConfig, "aspectRatioConfig");
        e.f((Object)recordEventSenderFactory, "recordEventSenderFactory");
        e.f((Object)cameraDirectionSetting, "cameraDirectionSetting");
        super(aspectRatioConfig);
        this.mediaPlayerApi = mediaPlayerApi;
        this.uiInteractionDelegate = uiInteractionDelegate;
        this.recordedVideoPlayerPresenterDelegateFactory = recordedVideoPlayerPresenterDelegateFactory;
        this.eventBus = eventBus;
        this.creationConfiguration = creationConfiguration;
        this.featureConfig = featureConfig;
        this.aspectRatioConfig = aspectRatioConfig;
        this.recordEventSenderFactory = recordEventSenderFactory;
        this.cameraDirectionSetting = cameraDirectionSetting;
        Object viewState;
        if (creationConfiguration instanceof ImageCreationConfiguration) {
            viewState = new RecordImageViewState(false, false, false, false, false, false, false, false, false, false, (String)null, 2047, (DefaultConstructorMarker)null);
        }
        else {
            viewState = new RecordVideoViewState(false, false, false, false, false, false, false, false, (String)null, false, false, false, false, false, false, (String)null, 0, false, false, false, false, 0, false, false, false, false, false, false, false, false, (String)null, Integer.MAX_VALUE, (DefaultConstructorMarker)null);
        }
        this.viewState = (RecordViewState)viewState;
        final PublishSubject create = PublishSubject.create();
        e.e((Object)create, "create<RecordViewEvent>()");
        this.viewEventProcessor = (PublishSubject<RecordViewEvent>)create;
        this.screenId = ScreenId.CAMERA_RECORDING;
        this.shouldMergeFiles = true;
        this.segmentList = new ArrayList<RecordedSegment>();
        this.recordingStateReducer = new RecordVideoPresenter.RecordVideoPresenter$RecordingStateReducer(((AbstractPresenter)this).getCompositeDisposable(), this);
        this.contentType = "lip_sync";
        final RxObservableProperty rxObservableProperty = new RxObservableProperty((Object)Boolean.FALSE);
        this.isTimerWindowOpenProperty = (RxObservableProperty<Boolean>)rxObservableProperty;
        this.isTimerWindowOpen$delegate = rxObservableProperty;
        this.recordEventSender$delegate = kotlin.a.b((mg2.a)new RecordVideoPresenter$recordEventSender.RecordVideoPresenter$recordEventSender$2(this));
        this.recordingPlayerPresenter$delegate = kotlin.a.b((mg2.a)new RecordVideoPresenter$recordingPlayerPresenter.RecordVideoPresenter$recordingPlayerPresenter$2(this));
        this.isRaw$delegate = kotlin.a.b((mg2.a)new RecordVideoPresenter$isRaw.RecordVideoPresenter$isRaw$2(this));
        this.availableLensesQuery = (Closeable)new g();
        this.lenses = (List<? extends LensFilter>)EmptyList.INSTANCE;
        this.sharedPrefs$delegate = kotlin.a.b((mg2.a)new RecordVideoPresenter$sharedPrefs.RecordVideoPresenter$sharedPrefs$2(this));
    }
    
    public static final void access$addTrimmedClips(final RecordVideoPresenter recordVideoPresenter, final List list, final AdjustClipsFlowType adjustClipsFlowType) {
        recordVideoPresenter.addTrimmedClips(list, adjustClipsFlowType);
    }
    
    public static final RecordedSegment access$createRecordedSegment(final RecordVideoPresenter recordVideoPresenter, final RecordVideoPresenter.RecordVideoPresenter$RecordingEndData recordVideoPresenter$RecordingEndData) {
        return recordVideoPresenter.createRecordedSegment(recordVideoPresenter$RecordingEndData);
    }
    
    public static final void access$deleteLastSegment(final RecordVideoPresenter recordVideoPresenter) {
        recordVideoPresenter.deleteLastSegment();
    }
    
    public static final File access$getAudioFile$p(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.audioFile;
    }
    
    public static final CameraDirectionSetting access$getCameraDirectionSetting$p(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.cameraDirectionSetting;
    }
    
    public static final CameraDirection access$getCurrentDirection(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.getCurrentDirection();
    }
    
    public static final long access$getCurrentMediaDurationMs$p(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.currentMediaDurationMs;
    }
    
    public static final EventBus access$getEventBus$p(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.eventBus;
    }
    
    public static final List access$getInitialClipDatas(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.getInitialClipDatas();
    }
    
    public static final zi2.c0 access$getIoScope(final RecordVideoPresenter recordVideoPresenter) {
        return ((AbstractPresenter)recordVideoPresenter).getIoScope();
    }
    
    public static final zi2.c0 access$getMainScope(final RecordVideoPresenter recordVideoPresenter) {
        return ((AbstractPresenter)recordVideoPresenter).getMainScope();
    }
    
    public static final uf2.a access$getMediaPlayerObservable$p(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.mediaPlayerObservable;
    }
    
    public static final RecordEventSender access$getRecordEventSender(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.getRecordEventSender();
    }
    
    public static final RecordedVideoPlayerPresenterDelegateFactory access$getRecordedVideoPlayerPresenterDelegateFactory$p(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.recordedVideoPlayerPresenterDelegateFactory;
    }
    
    public static final IntentParams$RestoreRecordingParams access$getRecordingParamsToRestore$p(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.recordingParamsToRestore;
    }
    
    public static final IntentParams$RestoreRecordingParams access$getRestoreRecordingParams(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.getRestoreRecordingParams();
    }
    
    public static final int access$getTotalActualRecordedLength(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.getTotalActualRecordedLength();
    }
    
    public static final PublishSubject access$getViewEventProcessor$p(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.viewEventProcessor;
    }
    
    public static final void access$handleRecordedSegment(final RecordVideoPresenter recordVideoPresenter, final RecordedSegment recordedSegment, final RecordVideoPresenter.RecordVideoPresenter$StopRecordingType recordVideoPresenter$StopRecordingType, final AdjustClipsFlowType adjustClipsFlowType) {
        recordVideoPresenter.handleRecordedSegment(recordedSegment, recordVideoPresenter$StopRecordingType, adjustClipsFlowType);
    }
    
    public static final void access$hideTimer(final RecordVideoPresenter recordVideoPresenter, final boolean b) {
        recordVideoPresenter.hideTimer(b);
    }
    
    public static final boolean access$isFlashEnabled$p(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.isFlashEnabled;
    }
    
    public static final boolean access$isFlashLightAccessible(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.isFlashLightAccessible();
    }
    
    public static final boolean access$isSoundFeatureEnabled$p(final RecordVideoPresenter recordVideoPresenter) {
        return recordVideoPresenter.isSoundFeatureEnabled;
    }
    
    public static final void access$loadMedia(final RecordVideoPresenter recordVideoPresenter) {
        recordVideoPresenter.loadMedia();
    }
    
    public static final void access$onAdjustedClipsUpdated(final RecordVideoPresenter recordVideoPresenter, final List list, final AdjustClipsFlowType adjustClipsFlowType) {
        recordVideoPresenter.onAdjustedClipsUpdated(list, adjustClipsFlowType);
    }
    
    public static final void access$onCountdownStopped(final RecordVideoPresenter recordVideoPresenter) {
        recordVideoPresenter.onCountdownStopped();
    }
    
    public static final void access$onDelayStarted(final RecordVideoPresenter recordVideoPresenter, final RecordingStartType recordingStartType) {
        recordVideoPresenter.onDelayStarted(recordingStartType);
    }
    
    public static final void access$onRecordStart(final RecordVideoPresenter recordVideoPresenter) {
        recordVideoPresenter.onRecordStart();
    }
    
    public static final void access$onRecordingFinished(final RecordVideoPresenter recordVideoPresenter, final AdjustClipsFlowType adjustClipsFlowType) {
        recordVideoPresenter.onRecordingFinished(adjustClipsFlowType);
    }
    
    public static final void access$setCameraDirection(final RecordVideoPresenter recordVideoPresenter, final CameraDirection cameraDirection) {
        recordVideoPresenter.setCameraDirection(cameraDirection);
    }
    
    public static final void access$setFromMediaPlayerComplete$p(final RecordVideoPresenter recordVideoPresenter, final boolean isFromMediaPlayerComplete) {
        recordVideoPresenter.isFromMediaPlayerComplete = isFromMediaPlayerComplete;
    }
    
    public static final void access$setHasCompletedRawRecording$p(final RecordVideoPresenter recordVideoPresenter, final boolean hasCompletedRawRecording) {
        recordVideoPresenter.hasCompletedRawRecording = hasCompletedRawRecording;
    }
    
    public static final void access$setLastLensApplied$p(final RecordVideoPresenter recordVideoPresenter, final LensFilter lastLensApplied) {
        recordVideoPresenter.lastLensApplied = lastLensApplied;
    }
    
    public static final void access$setLenses$p(final RecordVideoPresenter recordVideoPresenter, final List lenses) {
        recordVideoPresenter.lenses = lenses;
    }
    
    public static final void access$setShouldMergeFiles$p(final RecordVideoPresenter recordVideoPresenter, final boolean shouldMergeFiles) {
        recordVideoPresenter.shouldMergeFiles = shouldMergeFiles;
    }
    
    public static final void access$startPreview(final RecordVideoPresenter recordVideoPresenter) {
        recordVideoPresenter.startPreview();
    }
    
    public static final void access$startRecordingOrSetTimer(final RecordVideoPresenter recordVideoPresenter, final RecordingStartType recordingStartType) {
        recordVideoPresenter.startRecordingOrSetTimer(recordingStartType);
    }
    
    public static final Closeable access$startSnapCameraRecord(final RecordVideoPresenter recordVideoPresenter, final l l) {
        return recordVideoPresenter.startSnapCameraRecord((l<? super File, j>)l);
    }
    
    public static final void access$updateMediaPlayerProgress(final RecordVideoPresenter recordVideoPresenter, final RecordVideoPresenter.RecordVideoPresenter$RecordingSession recordVideoPresenter$RecordingSession) {
        recordVideoPresenter.updateMediaPlayerProgress(recordVideoPresenter$RecordingSession);
    }
    
    public static final void access$updateRecordingProgress(final RecordVideoPresenter recordVideoPresenter) {
        recordVideoPresenter.updateRecordingProgress();
    }
    
    public static final void access$updateViewOnCountdownTick(final RecordVideoPresenter recordVideoPresenter, final int n) {
        recordVideoPresenter.updateViewOnCountdownTick(n);
    }
    
    public static final void access$updateViewOnRecordingStopped(final RecordVideoPresenter recordVideoPresenter) {
        recordVideoPresenter.updateViewOnRecordingStopped();
    }
    
    private final void addSegment(final RecordedSegment recordedSegment) {
        this.eventBus.reportAnalytics((Analytics)new SegmentStopped(this.segmentList.size(), recordedSegment.getRecordedMs()));
        this.segmentList.add(recordedSegment);
        if (!this.isFinishingRecording) {
            this.getRecordingPlayerPresenter().onRecordedSegmentsChanged((List)this.segmentList, ((Enum)this.getCurrentDirection()).ordinal());
        }
        this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$SegmentsUpdated(this.getRecordingButtonsUpdate()));
    }
    
    private final void addTrimmedClips(final List<AdjustedClip> list, final AdjustClipsFlowType adjustClipsFlowType) {
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final AdjustedClip adjustedClip = iterator.next();
            final int n2 = n + (int)adjustedClip.getAdjustableClip().getDurationAfterTrimming();
            RecordedSegment recordedSegment = adjustedClip.toRecordedSegment(((AbstractPresenter)this).getContext(), n2);
            if (recordedSegment != null) {
                recordedSegment.setUploadedSegment(adjustedClip.isUploaded());
            }
            else {
                recordedSegment = null;
            }
            n = n2;
            if (recordedSegment != null) {
                list2.add(recordedSegment);
                n = n2;
            }
        }
        for (final RecordedSegment recordedSegment2 : list2) {
            ((MediaSeekApi)this.mediaPlayerApi).seekTo((long)recordedSegment2.getPlayerEndTime());
            this.handleRecordedSegment(recordedSegment2, RecordVideoPresenter.RecordVideoPresenter$StopRecordingType.OTHER, adjustClipsFlowType);
        }
    }
    
    private static final void availableLensesQuery$lambda-1() {
    }
    
    private final void checkIfIsFromMediaPlayerComplete(final RecordedSegment recordedSegment) {
        try {
            if (this.isFromMediaPlayerComplete) {
                recordedSegment.setPlayerEndTime((int)this.currentMediaDurationMs);
            }
            else {
                recordedSegment.setPlayerEndTime(((MediaSeekApi)this.mediaPlayerApi).getMediaCurrentPosition());
            }
        }
        catch (final IllegalStateException ex) {
            pu2.a.a.p((Throwable)ex);
        }
    }
    
    private final RecordedSegment createRecordedSegment(final RecordVideoPresenter.RecordVideoPresenter$RecordingEndData recordVideoPresenter$RecordingEndData) {
        final RecordVideoPresenter.RecordVideoPresenter$RecordingSession component1 = recordVideoPresenter$RecordingEndData.component1();
        final File component2 = recordVideoPresenter$RecordingEndData.component2();
        long longValue = System.currentTimeMillis() - component1.getStartTimeMs();
        final String path = component2.getPath();
        e.e((Object)path, "videoFile.path");
        final Uri parse = Uri.parse(path);
        e.e((Object)parse, "parse(this)");
        final Integer bitRate = VideoUtils.getBitRate(parse, ((AbstractPresenter)this).getContext());
        final Integer videoFrameRate = VideoUtils.INSTANCE.getVideoFrameRate(((AbstractPresenter)this).getContext(), parse);
        final Size videoDimensions = VideoUtils.getVideoDimensions(component2);
        Long value = VideoUtils.realFileDuration(component2, ((AbstractPresenter)this).getContext());
        if (value.longValue() <= 0L) {
            value = null;
        }
        if (value != null) {
            longValue = value;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Recording took ");
        sb.append(longValue);
        sb.append("ms");
        Log.d("RecordDubMVP", sb.toString());
        final String absolutePath = component2.getAbsolutePath();
        final int n = (int)longValue;
        final int n2 = (int)component1.getStartTimeMs();
        final boolean zoomUsed = this.zoomUsed;
        final LensFilter lastLensApplied = this.lastLensApplied;
        String name;
        if (lastLensApplied == null || (name = lastLensApplied.getName()) == null) {
            name = "Normal";
        }
        return new RecordedSegment(absolutePath, n, 0, 0, n2, videoFrameRate, bitRate, videoDimensions, zoomUsed, name, false, (AdjustedClip)null, 0, component1.getRecordingStartData().getRecordingStartType().isTimerEnabled(), component1.getRecordingStartData().getRecordingSegmentExtras().getFlashUsed(), 7168, (DefaultConstructorMarker)null);
    }
    
    private final void createTimerPresenter() {
        this.recordTimerPresenter = new RecordTimerPresenter((mg2.a)new RecordVideoPresenter$createTimerPresenter.RecordVideoPresenter$createTimerPresenter$1(this), (l)new RecordVideoPresenter$createTimerPresenter.RecordVideoPresenter$createTimerPresenter$2(this), (int)this.currentMediaDurationMs, 300, this.isRaw() ^ true, this.mediaPlayerApi);
    }
    
    public static void d() {
        availableLensesQuery$lambda-1();
    }
    
    private final void deleteLastSegment() {
        final File renderedDubFile = this.renderedDubFile;
        if (renderedDubFile == null) {
            e.n("renderedDubFile");
            throw null;
        }
        renderedDubFile.delete();
        if (!this.tryCreateRenderedDubFile()) {
            return;
        }
        if (this.segmentList.isEmpty() ^ true) {
            int intValue = this.segmentList.size() - 1;
            final Integer lastDeletableSegmentIndex = this.getLastDeletableSegmentIndex();
            if (lastDeletableSegmentIndex != null) {
                intValue = lastDeletableSegmentIndex;
            }
            this.segmentList.remove(intValue);
            this.getRecordingPlayerPresenter().onRecordedSegmentsChanged((List)this.segmentList, ((Enum)this.getCurrentDirection()).ordinal());
            final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView != null) {
                recordVideoView.removePartAt(intValue);
            }
            int n;
            if (this.segmentList.isEmpty()) {
                n = 0;
            }
            else {
                final List<RecordedSegment> segmentList = this.segmentList;
                n = ((RecordedSegment)segmentList.get(segmentList.size() - 1)).getPlayerEndTime();
            }
            final RecordDubType recordDubType = this.recordDubType;
            if (recordDubType == null) {
                e.n("recordDubType");
                throw null;
            }
            if (recordDubType != RecordDubType.DUB) {
                n = RecordVideoUtilKt.totalRecordedLength((List)this.segmentList);
            }
            ((MediaSeekApi)this.mediaPlayerApi).seekTo((long)n);
            this.isFromMediaPlayerComplete = false;
            this.hasCompletedRawRecording = false;
            this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$SegmentsUpdated(this.getRecordingButtonsUpdate()));
            final List<RecordedSegment> segmentList2 = this.segmentList;
            final ArrayList list = new ArrayList();
            for (final RecordedSegment next : segmentList2) {
                if (next.getAdjustedClip() != null) {
                    list.add(next);
                }
            }
            final ArrayList list2 = new ArrayList<AdjustedClip>(m.u4((Iterable)list, 10));
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                final AdjustedClip adjustedClip = ((RecordedSegment)iterator2.next()).getAdjustedClip();
                e.c((Object)adjustedClip);
                list2.add(adjustedClip);
            }
            this.onAdjustedClipsUpdated((List<AdjustedClip>)list2, AdjustClipsFlowType.EDIT);
        }
    }
    
    public static RecordViewState e(final RecordVideoPresenter recordVideoPresenter, final RecordViewEvent recordViewEvent) {
        return observeViewEvents$lambda-7(recordVideoPresenter, recordViewEvent);
    }
    
    public static void f(final RecordVideoPresenter recordVideoPresenter, final RecordViewState recordViewState) {
        observeViewEvents$lambda-9(recordVideoPresenter, recordViewState);
    }
    
    public static void g(final RecordVideoPresenter recordVideoPresenter) {
        onFilterSelected$lambda-29(recordVideoPresenter);
    }
    
    private final boolean getArePermissionsGranted() {
        return this.getRecordEventSender().getArePermissionsGranted();
    }
    
    private final CameraDirection getCurrentDirection() {
        return this.cameraDirectionSetting.loadCameraDirection();
    }
    
    private final List<InitialClipData> getInitialClipDatas() {
        final List<RecordedSegment> segmentList = this.segmentList;
        final InitialClipData$Companion companion = InitialClipData.Companion;
        final ArrayList list = new ArrayList(m.u4((Iterable)segmentList, 10));
        final Iterator<Object> iterator = segmentList.iterator();
        while (iterator.hasNext()) {
            list.add((Object)companion.fromRecordedSegment((RecordedSegment)iterator.next()));
        }
        return (List<InitialClipData>)list;
    }
    
    private final long getMaxAllowedDurationMillis() {
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
            maxVideoDurationMillis = 0L;
        }
        return maxVideoDurationMillis;
    }
    
    private final RecordEventSender getRecordEventSender() {
        return (RecordEventSender)this.recordEventSender$delegate.getValue();
    }
    
    private final RecordVideoViewEvent$RecordingButtonsUpdated getRecordingButtonsUpdate() {
        return new RecordVideoViewEvent$RecordingButtonsUpdated(!this.isTimerWindowOpen() && this.isSegmentForRecordingAvailable() && this.getArePermissionsGranted(), this.shouldShowFinishRecordingButton() && !this.isTimerWindowOpen(), !this.isTimerWindowOpen() && this.getArePermissionsGranted() && this.featureConfig.getUploadUserVideosEnabled(), !this.isTimerWindowOpen() && (this.segmentList.isEmpty() ^ true) && ((this.segmentList.size() > 1 && this.isStitchAvailable) || (!this.isStitchAvailable && (this.segmentList.isEmpty() ^ true))), true, !this.isTimerWindowOpen() && this.getArePermissionsGranted(), !this.isTimerWindowOpen() && (this.segmentList.isEmpty() ^ true) && this.featureConfig.getAdjustClipsEnabled() && !this.uiInteractionDelegate.isFiltersWindowOpen$creation_release(), (this.segmentList.isEmpty() ^ true) && !this.isTimerWindowOpen() && !this.uiInteractionDelegate.isFiltersWindowOpen$creation_release(), this.featureConfig.getLensesEnabled());
    }
    
    private final RecordVideoViewEvent$RecordingControlsUpdated getRecordingControlsUpdate() {
        final boolean flashLightAccessible = this.isFlashLightAccessible();
        final boolean shouldTitleBeShown = this.shouldTitleBeShown();
        final boolean empty = this.segmentList.isEmpty();
        final boolean b = false;
        final boolean b2 = (empty ^ true) && this.featureConfig.getAdjustClipsEnabled() && !this.uiInteractionDelegate.isFiltersWindowOpen$creation_release();
        boolean b3 = b;
        if (this.segmentList.isEmpty() ^ true) {
            b3 = b;
            if (!this.isTimerWindowOpen()) {
                b3 = b;
                if (!this.uiInteractionDelegate.isFiltersWindowOpen$creation_release()) {
                    b3 = true;
                }
            }
        }
        return new RecordVideoViewEvent$RecordingControlsUpdated(flashLightAccessible, shouldTitleBeShown, b2, b3, this.featureConfig.getLensesEnabled());
    }
    
    private final RecordingStartType getRecordingStartType() {
        return this.recordingStateReducer.getRecordingState().getRecordingStartType();
    }
    
    private final IntentParams$RestoreRecordingParams getRestoreRecordingParams() {
        final LensFilter lastLensApplied = this.lastLensApplied;
        String name;
        if (lastLensApplied != null) {
            name = lastLensApplied.getName();
        }
        else {
            name = null;
        }
        return new IntentParams$RestoreRecordingParams(name, this.isFlashEnabled);
    }
    
    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences)this.sharedPrefs$delegate.getValue();
    }
    
    private final boolean getShowCheckMarkDuringRecording() {
        final RecordingStartType recordingStartType = this.getRecordingStartType();
        boolean b = false;
        if (recordingStartType != null) {
            b = b;
            if (!recordingStartType.getHold()) {
                b = true;
            }
        }
        return b;
    }
    
    private final int getTotalActualRecordedLength() {
        if (this.segmentList.isEmpty()) {
            return 0;
        }
        final List<RecordedSegment> segmentList = this.segmentList;
        int playerEndTime = segmentList.get(segmentList.size() - 1).getPlayerEndTime();
        int n;
        if ((n = playerEndTime) == 0) {
            final Iterator<Object> iterator = this.segmentList.iterator();
            while (true) {
                n = playerEndTime;
                if (!iterator.hasNext()) {
                    break;
                }
                playerEndTime += iterator.next().getRecordedMs();
            }
        }
        return n;
    }
    
    private final VideoCreationConfiguration getVideoCreationConfiguration() {
        final CreationConfiguration creationConfiguration = this.creationConfiguration;
        VideoCreationConfiguration videoCreationConfiguration;
        if (creationConfiguration instanceof VideoCreationConfiguration) {
            videoCreationConfiguration = (VideoCreationConfiguration)creationConfiguration;
        }
        else {
            videoCreationConfiguration = null;
        }
        VideoCreationConfiguration videoCreationConfiguration2 = videoCreationConfiguration;
        if (videoCreationConfiguration == null) {
            videoCreationConfiguration2 = new VideoCreationConfiguration((CameraDirection)null, 0L, (Theme)null, (Sound)null, false, (WatermarkConfig)null, (String)null, (List)null, (String)null, (String)null, (String)null, false, false, 8191, (DefaultConstructorMarker)null);
        }
        return videoCreationConfiguration2;
    }
    
    private final void goToEditScreen() {
        if (this.segmentList.isEmpty() ^ true) {
            final List<InitialClipData> initialClipDatas = this.getInitialClipDatas();
            final List<RecordedSegment> segmentList = this.segmentList;
            final boolean showSoundTitle = this.showSoundTitle;
            final RecordDubType recordDubType = this.recordDubType;
            if (recordDubType == null) {
                e.n("recordDubType");
                throw null;
            }
            boolean b = false;
            Label_0102: {
                if (!(segmentList instanceof Collection) || !segmentList.isEmpty()) {
                    final Iterator iterator = segmentList.iterator();
                    while (iterator.hasNext()) {
                        if (((RecordedSegment)iterator.next()).getTimerUsed()) {
                            b = true;
                            break Label_0102;
                        }
                    }
                }
                b = false;
            }
            final List<RecordedSegment> segmentList2 = this.segmentList;
            boolean b2 = false;
            Label_0168: {
                if (!(segmentList2 instanceof Collection) || !segmentList2.isEmpty()) {
                    final Iterator iterator2 = segmentList2.iterator();
                    while (iterator2.hasNext()) {
                        if (((RecordedSegment)iterator2.next()).getFlashUsed()) {
                            b2 = true;
                            break Label_0168;
                        }
                    }
                }
                b2 = false;
            }
            final LensFilter lastLensApplied = this.lastLensApplied;
            String name;
            if (lastLensApplied == null || (name = lastLensApplied.getName()) == null) {
                name = "Normal";
            }
            final EditUgcExtras editUgcExtras = new EditUgcExtras((List)initialClipDatas, (List)segmentList, showSoundTitle, recordDubType, b, b2, name, this.getCurrentDirection(), this.stitchUri, false, 512, (DefaultConstructorMarker)null);
            final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView != null) {
                ((RecordedVideoPlayerView)recordVideoView).stopPlayer();
            }
            this.eventBus.goToDestination((EventBus$NavigationEvent)new EventBus$NavigationEvent$OpenEditUgcFragment(editUgcExtras));
        }
    }
    
    public static void h() {
        startSnapCameraRecord$lambda-39$lambda-38();
    }
    
    private final void handleNewIntent(final IntentParams intentParams) {
        this.audioFile = null;
        this.readValuesFromIntent(intentParams);
        this.restoreRecordingParams();
        final RecordDubType recordDubType = this.recordDubType;
        if (recordDubType == null) {
            e.n("recordDubType");
            throw null;
        }
        final boolean b = recordDubType == RecordDubType.DUB;
        final AdjustClipsLaunchData adjustClipsLaunchData = intentParams.getAdjustClipsLaunchData();
        if (adjustClipsLaunchData != null) {
            final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView != null) {
                recordVideoView.updateIntentParams(IntentParams.copy$default(intentParams, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (Integer)null, (String)null, (String)null, (String)null, (Float)null, (Long)null, (RecordDubType)null, false, false, (IntentParams$RestoreRecordingParams)null, (String)null, (String)null, (AdjustClipsLaunchData)null, false, false, 2621439, (Object)null));
            }
            this.eventBus.goToDestination((EventBus$NavigationEvent)new EventBus$NavigationEvent$OpenAdjustClipsFragment(adjustClipsLaunchData));
            return;
        }
        final RecordVideoView recordVideoView2 = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView2 != null) {
            if (b) {
                NullPointerException ex;
                if (this.waveformUri == null) {
                    ex = new NullPointerException(ph0.a.f(a.t("Waveform for quote "), this.sourceUuid, " was null"));
                }
                else {
                    ex = new NullPointerException("Source uuid for recordDubType");
                }
                pu2.a.a.p((Throwable)ex);
                ((BaseMVPView)recordVideoView2).finish();
            }
            this.displayUiBasedOnRecordingType(this.isSoundFeatureEnabled);
            final String videoTitle = this.videoTitle;
            final String s = "";
            String titleText;
            if ((titleText = videoTitle) == null) {
                titleText = "";
            }
            recordVideoView2.setTitleText(titleText);
            this.setAddSoundButtonVisibility();
            final PublishSubject<RecordViewEvent> viewEventProcessor = this.viewEventProcessor;
            final boolean shouldShowFinishRecordingButton = this.shouldShowFinishRecordingButton();
            final boolean shouldTitleBeShown = this.shouldTitleBeShown();
            final boolean flashLightAccessible = this.isFlashLightAccessible();
            final boolean isStitchAvailable = this.isStitchAvailable;
            final Context context = ((AbstractPresenter)this).getContext();
            String stitchUsername = intentParams.getStitchUsername();
            if (stitchUsername == null) {
                stitchUsername = s;
            }
            final String string = context.getString(2131958116, new Object[] { stitchUsername });
            e.e((Object)string, "context.getString(\n     \u2026me.orEmpty(),\n          )");
            viewEventProcessor.onNext((Object)new RecordVideoViewEvent$NewIntent(shouldShowFinishRecordingButton, shouldTitleBeShown, flashLightAccessible, isStitchAvailable, string, this.featureConfig.getLensesEnabled()));
        }
    }
    
    private final void handleRawRecordingResume() {
        this.onRawMediaReady();
    }
    
    private final void handleRecordedSegment(final RecordedSegment recordedSegment, final RecordVideoPresenter.RecordVideoPresenter$StopRecordingType recordVideoPresenter$StopRecordingType, final AdjustClipsFlowType adjustClipsFlowType) {
        final a$b a = pu2.a.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("handleRecordedSegment() called with: recordedSegment = [");
        sb.append(recordedSegment);
        sb.append(']');
        final String string = sb.toString();
        boolean b = false;
        a.a(string, new Object[0]);
        if (recordedSegment.getRecordedMs() <= 0) {
            a.a("Cannot add empty segments.", new Object[0]);
            return;
        }
        this.checkIfIsFromMediaPlayerComplete(recordedSegment);
        if (recordedSegment.getRecordedMs() > 100L || recordedSegment.getRecordedMs() >= this.currentMediaDurationMs - RecordVideoUtilKt.totalRecordedLength((List)this.segmentList)) {
            b = true;
        }
        if (b) {
            this.addSegment(recordedSegment);
        }
        this.updateRecordingProgress();
        if (this.shouldFinalizeVideo(recordVideoPresenter$StopRecordingType)) {
            this.onRecordingFinished(adjustClipsFlowType);
        }
        else if (recordVideoPresenter$StopRecordingType == RecordVideoPresenter.RecordVideoPresenter$StopRecordingType.TIMER) {
            this.showTimer();
        }
    }
    
    private final void handleSavedState(final Bundle bundle) {
        if (bundle != null) {
            this.isFlashEnabled = ((BaseBundle)bundle).getBoolean("FLASH_ON");
            this.segmentList.clear();
            final List<RecordedSegment> segmentList = this.segmentList;
            Object o;
            if ((o = bundle.getParcelableArrayList("bundle_key_segments_list")) == null) {
                o = EmptyList.INSTANCE;
            }
            segmentList.addAll((Collection<? extends RecordedSegment>)o);
        }
    }
    
    private final void hideTimer(final boolean b) {
        this.setTimerWindowOpen(false);
        final RecordTimerPresenter recordTimerPresenter = this.recordTimerPresenter;
        if (recordTimerPresenter != null && recordTimerPresenter != null) {
            recordTimerPresenter.onCloseTimerClicked();
        }
        if (b) {
            this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$TimerHidden(this.getRecordingControlsUpdate(), this.getRecordingButtonsUpdate()));
        }
    }
    
    public static void i(final RecordVideoPresenter recordVideoPresenter) {
        onFilterSelected$lambda-30(recordVideoPresenter);
    }
    
    private final void initCamera() {
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            final c0 f = ((CameraApiView)recordVideoView).getCameraHardwareDataSingle().f();
            e.e((Object)f, "view.cameraHardwareDataSingle.cache()");
            this.cameraHardwareDataSingle = f;
            this.initCameraApi(recordVideoView);
        }
        this.setCameraDirection(this.getCurrentDirection());
        final CompositeDisposable compositeDisposable = ((AbstractPresenter)this).getCompositeDisposable();
        final c0<CameraHardwareData> cameraHardwareDataSingle = this.cameraHardwareDataSingle;
        if (cameraHardwareDataSingle != null) {
            final RecordVideoPresenter$initCamera.RecordVideoPresenter$initCamera$2 recordVideoPresenter$initCamera$2 = new RecordVideoPresenter$initCamera.RecordVideoPresenter$initCamera$2(this);
            boolean b = true;
            p7.a.J(compositeDisposable, (a)SubscribersKt.g((c0)cameraHardwareDataSingle, SubscribersKt.b, (l)recordVideoPresenter$initCamera$2));
            this.getRecordEventSender().startPreviewWithPermissionsCheck(this.permissionAlreadyChecked, (mg2.a)new RecordVideoPresenter$initCamera.RecordVideoPresenter$initCamera$3(this));
            this.startPreview();
            final RecordVideoView recordVideoView2 = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView2 != null) {
                if (this.getCurrentDirection() != CameraDirection.FRONT) {
                    b = false;
                }
                ((SnapCameraView)recordVideoView2).startSnapCameraPreview(b);
            }
            return;
        }
        e.n("cameraHardwareDataSingle");
        throw null;
    }
    
    private final void initCameraApi(final RecordVideoView recordVideoView) {
        this.cameraApiData = ((CameraApiView)recordVideoView).getCameraApiData();
    }
    
    private final boolean isFlashLightAccessible() {
        return (this.getCurrentDirection() == CameraDirection.FRONT || this.hasHardwareFlash) && !this.isTimerWindowOpen() && !this.uiInteractionDelegate.isFiltersWindowOpen$creation_release();
    }
    
    private final boolean isRaw() {
        return (boolean)this.isRaw$delegate.getValue();
    }
    
    private final boolean isRecording() {
        return this.recordingStateReducer.getRecordingState().isRecording();
    }
    
    private final boolean isSegmentForRecordingAvailable() {
        final boolean empty = this.segmentList.isEmpty();
        boolean b = true;
        if (!empty) {
            final List<RecordedSegment> segmentList = this.segmentList;
            b = (((RecordedSegment)segmentList.get(segmentList.size() - 1)).getPlayerEndTime() < this.currentMediaDurationMs && b);
        }
        return b;
    }
    
    private final boolean isTimerWindowOpen() {
        return (boolean)this.isTimerWindowOpen$delegate.getValue((Object)this, (k)RecordVideoPresenter.$$delegatedProperties[0]);
    }
    
    public static void j(final RecordVideoPresenter recordVideoPresenter, final LensFilter lensFilter) {
        onFilterSelected$lambda-28(recordVideoPresenter, lensFilter);
    }
    
    public static void k(final RecordVideoView recordVideoView, final RecordVideoPresenter recordVideoPresenter, final Boolean b) {
        viewCreated$lambda-4(recordVideoView, recordVideoPresenter, b);
    }
    
    public static void l(final RecordVideoPresenter recordVideoPresenter, final RecordViewState recordViewState) {
        observeViewEvents$lambda-8(recordVideoPresenter, recordViewState);
    }
    
    private final void loadMedia() {
        if (this.audioUri == null) {
            pu2.a.a.e((Throwable)new IllegalArgumentException("audioUri cannot be null"));
        }
    }
    
    private final void logStartSegmentAnalytics(final RecordingStartType recordingStartType) {
        RecordingStartType$Timer recordingStartType$Timer;
        if (recordingStartType instanceof RecordingStartType$Timer) {
            recordingStartType$Timer = (RecordingStartType$Timer)recordingStartType;
        }
        else {
            recordingStartType$Timer = null;
        }
        Boolean value;
        if (recordingStartType$Timer != null) {
            value = (recordingStartType$Timer.getScheduledDuration() + RecordVideoUtilKt.totalRecordedLength((List)this.segmentList) != this.currentMediaDurationMs);
        }
        else {
            value = null;
        }
        final String contentType = this.contentType;
        final String sourceUuid = this.sourceUuid;
        final String sourceTitle = this.sourceTitle;
        final RecordDubType recordDubType = this.recordDubType;
        if (recordDubType != null) {
            final CameraDirection currentDirection = this.getCurrentDirection();
            final boolean isFlashEnabled = this.isFlashEnabled;
            final LensFilter lastLensApplied = this.lastLensApplied;
            String name;
            if (lastLensApplied == null || (name = lastLensApplied.getName()) == null) {
                name = "Normal";
            }
            this.eventBus.reportAnalytics((Analytics)new SegmentStarted(new SegmentStartedData(contentType, sourceUuid, sourceTitle, recordDubType, currentDirection, isFlashEnabled, name, value, recordingStartType.getStartAction())));
            return;
        }
        e.n("recordDubType");
        throw null;
    }
    
    public static boolean m(final CameraHardwareData cameraHardwareData) {
        return switchCameraIfFrontCamNotAvailable$lambda-15(cameraHardwareData);
    }
    
    private final void observeAdjustClips() {
        final t observeOn = this.eventBus.getAdjustClipsResults().observeOn(cf2.a.a());
        e.e((Object)observeOn, "eventBus.adjustClipsResu\u2026dSchedulers.mainThread())");
        p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), SubscribersKt.f((t)observeOn, (l)RecordVideoPresenter$observeAdjustClips.RecordVideoPresenter$observeAdjustClips$1.INSTANCE, SubscribersKt.c, (l)new RecordVideoPresenter$observeAdjustClips.RecordVideoPresenter$observeAdjustClips$2(this)));
    }
    
    private final void observeEditUGC() {
        final a editUGCResultsSubscription = this.editUGCResultsSubscription;
        if (editUGCResultsSubscription != null && !editUGCResultsSubscription.isDisposed()) {
            final a editUGCResultsSubscription2 = this.editUGCResultsSubscription;
            if (editUGCResultsSubscription2 != null) {
                editUGCResultsSubscription2.dispose();
            }
        }
        final t observeOn = this.eventBus.getEditUGCResults().observeOn(cf2.a.a());
        e.e((Object)observeOn, "eventBus.editUGCResults\n\u2026dSchedulers.mainThread())");
        this.editUGCResultsSubscription = SubscribersKt.f((t)observeOn, (l)RecordVideoPresenter$observeEditUGC.RecordVideoPresenter$observeEditUGC$1.INSTANCE, SubscribersKt.c, (l)new RecordVideoPresenter$observeEditUGC.RecordVideoPresenter$observeEditUGC$2(this));
    }
    
    private final void observeViewEvents() {
        ((t<RecordViewEvent>)this.viewEventProcessor).observeOn(cf2.a.a()).map((ff2.o<? super RecordViewEvent, ?>)new p((Object)this, 1)).doOnNext((ff2.g<? super Object>)new q((Object)this, 1)).doOnNext((ff2.g<? super Object>)new com.reddit.video.creation.widgets.recording.presenter.d((Object)this, 0)).subscribe();
    }
    
    private static final RecordViewState observeViewEvents$lambda-7(final RecordVideoPresenter recordVideoPresenter, final RecordViewEvent recordViewEvent) {
        e.f((Object)recordVideoPresenter, "this$0");
        e.f((Object)recordViewEvent, "viewEvent");
        final RecordViewState viewState = recordVideoPresenter.viewState;
        final boolean b = viewState instanceof RecordImageViewState;
        RecordVideoViewEvent recordVideoViewEvent = null;
        final RecordImageViewEvent recordImageViewEvent = null;
        Object o;
        if (b) {
            RecordImageViewEvent recordImageViewEvent2 = recordImageViewEvent;
            if (recordViewEvent instanceof RecordImageViewEvent) {
                recordImageViewEvent2 = (RecordImageViewEvent)recordViewEvent;
            }
            if (recordImageViewEvent2 == null || (o = RecordImageViewEventUtilsKt.createNewState((RecordImageViewState)viewState, recordImageViewEvent2)) == null) {
                o = viewState;
            }
        }
        else {
            if (!(viewState instanceof RecordVideoViewState)) {
                throw new NoWhenBranchMatchedException();
            }
            if (recordViewEvent instanceof RecordVideoViewEvent) {
                recordVideoViewEvent = (RecordVideoViewEvent)recordViewEvent;
            }
            if (recordVideoViewEvent == null || (o = RecordVideoViewEventUtilsKt.createNewState((RecordVideoViewState)viewState, recordVideoViewEvent)) == null) {
                o = viewState;
            }
        }
        return (RecordViewState)o;
    }
    
    private static final void observeViewEvents$lambda-8(final RecordVideoPresenter recordVideoPresenter, final RecordViewState recordViewState) {
        e.f((Object)recordVideoPresenter, "this$0");
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)recordVideoPresenter).getView();
        if (recordVideoView != null) {
            recordVideoView.updateViewState(recordViewState);
        }
    }
    
    private static final void observeViewEvents$lambda-9(final RecordVideoPresenter recordVideoPresenter, final RecordViewState viewState) {
        e.f((Object)recordVideoPresenter, "this$0");
        e.e((Object)viewState, "viewState");
        recordVideoPresenter.viewState = viewState;
    }
    
    private final void onAdjustedClipsUpdated(final List<AdjustedClip> list, final AdjustClipsFlowType adjustClipsFlowType) {
        while (this.segmentList.isEmpty() ^ true) {
            this.deleteLastSegment();
        }
        this.addTrimmedClips(list, adjustClipsFlowType);
    }
    
    private final void onCountdownStopped() {
        this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$CountdownStopped(this.getRecordingControlsUpdate(), this.getRecordingButtonsUpdate()));
        final CompositeDisposable compositeDisposable = ((AbstractPresenter)this).getCompositeDisposable();
        final c0<CameraHardwareData> cameraHardwareDataSingle = this.cameraHardwareDataSingle;
        if (cameraHardwareDataSingle != null) {
            p7.a.J(compositeDisposable, (a)SubscribersKt.g((c0)cameraHardwareDataSingle, SubscribersKt.b, (l)new RecordVideoPresenter$onCountdownStopped.RecordVideoPresenter$onCountdownStopped$1(this)));
            return;
        }
        e.n("cameraHardwareDataSingle");
        throw null;
    }
    
    private final void onDelayStarted(final RecordingStartType recordingStartType) {
        this.logStartSegmentAnalytics(recordingStartType);
        this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$RecordingStarted(recordingStartType.getHold(), this.isFlashEnabled && this.getCurrentDirection() == CameraDirection.FRONT, this.shouldShowFinishRecordingButton()));
        this.getRecordingPlayerPresenter().onRecordingStarted();
    }
    
    private static final void onFilterSelected$lambda-28(final RecordVideoPresenter recordVideoPresenter, final LensFilter lensFilter) {
        e.f((Object)recordVideoPresenter, "this$0");
        e.f((Object)lensFilter, "$selectedLens");
        recordVideoPresenter.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.LENS_TOS_OK, (FlowType)null, 2, (DefaultConstructorMarker)null));
        final SharedPreferences$Editor edit = recordVideoPresenter.getSharedPrefs().edit();
        if (edit != null) {
            edit.putBoolean("SNAP_CAMERA_KIT_TERMS_FLAG_VALUE", true);
            edit.apply();
        }
        recordVideoPresenter.showFilters(lensFilter);
    }
    
    private static final void onFilterSelected$lambda-29(final RecordVideoPresenter recordVideoPresenter) {
        e.f((Object)recordVideoPresenter, "this$0");
        recordVideoPresenter.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.LENS_TOS_CANCEL, (FlowType)null, 2, (DefaultConstructorMarker)null));
    }
    
    private static final void onFilterSelected$lambda-30(final RecordVideoPresenter recordVideoPresenter) {
        e.f((Object)recordVideoPresenter, "this$0");
        recordVideoPresenter.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.LENS_TOS_LEARN_MORE, (FlowType)null, 2, (DefaultConstructorMarker)null));
        final Intent setData = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://reddithelp.com/hc/en-us/articles/4424720425876"));
        e.e((Object)setData, "Intent(Intent.ACTION_VIEW).setData(uri)");
        n3.a.startActivity(((AbstractPresenter)recordVideoPresenter).getContext(), setData, null);
    }
    
    private final void onMediaReady(final float[] array, final long currentMediaDurationMs) {
        this.currentMediaDurationMs = currentMediaDurationMs;
        this.createTimerPresenter();
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            recordVideoView.setAudioInfo((int)currentMediaDurationMs, array);
        }
        this.startPreview();
    }
    
    private final void onRawMediaReady() {
        this.onMediaReady(new float[0], this.getMaxAllowedDurationMillis());
        if (this.segmentList.isEmpty() ^ true) {
            this.updateRecordingProgress();
        }
    }
    
    private final void onRecordStart() {
        pu2.a.a.a("onRecordStart() called", new Object[0]);
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            ((EnterAdjustClipsView)recordVideoView).disableAdjustClips();
        }
        final RecordDubType recordDubType = this.recordDubType;
        if (recordDubType != null) {
            if (recordDubType == RecordDubType.DUB) {
                this.playMediaOnRecordingStart();
            }
            return;
        }
        e.n("recordDubType");
        throw null;
    }
    
    private final void onRecordingFinished(final AdjustClipsFlowType adjustClipsFlowType) {
        pu2.a.a.a("onRecordingFinished() called", new Object[0]);
        if (this.isRecordingFinished) {
            return;
        }
        this.isRecordingFinished = true;
        this.isRendering = true;
        this.viewEventProcessor.onNext((Object)RecordVideoViewEvent$RecordingFinished.INSTANCE);
        if (adjustClipsFlowType == AdjustClipsFlowType.ADD_NEW || adjustClipsFlowType == AdjustClipsFlowType.RECORDING) {
            this.goToEditScreen();
        }
    }
    
    private final void pausePlayer() {
        try {
            if (this.mediaPlayerApi.isPlaying()) {
                this.mediaPlayerApi.pause();
            }
        }
        catch (final IllegalStateException ex) {
            pu2.a.a.p((Throwable)ex);
        }
    }
    
    private final void playMediaOnRecordingStart() {
        final MediaPlayerApi mediaPlayerApi = this.mediaPlayerApi;
        ((MediaSeekApi)mediaPlayerApi).seekTo((long)RecordVideoUtilKt.totalRecordedLength((List)this.segmentList));
        mediaPlayerApi.play(false);
    }
    
    private final void readValuesFromIntent(final IntentParams intentParams) {
        this.recordDubType = intentParams.getRecordDubType();
        this.sourceUuid = intentParams.getSourceUuid();
        this.waveformUri = intentParams.getWaveformFileUrl();
        this.audioUri = intentParams.getSoundFileUrl();
        this.sourceTitle = intentParams.getSourceTitle();
        this.creatorUsername = intentParams.getSourceCreatorUsername();
        this.creatorUserUuid = intentParams.getSourceCreatorUuid();
        this.sourceSearchTerm = intentParams.getSourceSearchTerm();
        this.recordingParamsToRestore = intentParams.getRestoreRecordingParams();
        this.recommendationIdentifier = intentParams.getRecommendationIdentifier();
        this.recommendationScore = intentParams.getRecommendationScore();
        this.recommendationUpdatedAt = intentParams.getRecommendationUpdatedAt();
        this.exploreGroupUuid = intentParams.getExploreGroupUuid();
        this.exploreGroupTitle = intentParams.getExploreGroupTitle();
        this.sourceListPosition = intentParams.getSourceSearchListPosition();
        String sourceTitle = this.sourceTitle;
        boolean isStitchAvailable = true;
        if (sourceTitle == null || sourceTitle.length() <= 0) {
            sourceTitle = null;
        }
        this.videoTitle = sourceTitle;
        this.showSoundTitle = intentParams.getShowSoundTitle();
        final String stitchUrl = intentParams.getStitchUrl();
        Label_0249: {
            if (stitchUrl != null && stitchUrl.length() != 0) {
                final String stitchUsername = intentParams.getStitchUsername();
                if (stitchUsername != null && stitchUsername.length() != 0) {
                    break Label_0249;
                }
            }
            isStitchAvailable = false;
        }
        this.isStitchAvailable = isStitchAvailable;
        this.stitchUri = intentParams.getStitchUrl();
    }
    
    private final void restoreRecordingParams() {
        final IntentParams$RestoreRecordingParams recordingParamsToRestore = this.recordingParamsToRestore;
        boolean isFlashEnabled;
        if (recordingParamsToRestore != null) {
            isFlashEnabled = recordingParamsToRestore.isFlashEnabled();
        }
        else {
            isFlashEnabled = this.isFlashEnabled;
        }
        this.isFlashEnabled = isFlashEnabled;
        if (isFlashEnabled) {
            final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView != null) {
                recordVideoView.setFlashOnOff(true);
            }
        }
    }
    
    private final void setAddSoundButtonVisibility() {
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            if (this.shouldAddSoundButtonBeVisible()) {
                ((AddSoundView)recordVideoView).showAddSoundButton();
            }
            else {
                ((AddSoundView)recordVideoView).hideAddSoundButton();
                ((AddSoundView)recordVideoView).hideAddSoundButtonShowCase();
            }
        }
    }
    
    private final void setCameraDirection(final CameraDirection cameraDirection) {
        final CompositeDisposable compositeDisposable = ((AbstractPresenter)this).getCompositeDisposable();
        final c0<CameraHardwareData> cameraHardwareDataSingle = this.cameraHardwareDataSingle;
        if (cameraHardwareDataSingle != null) {
            p7.a.J(compositeDisposable, (a)SubscribersKt.g((c0)cameraHardwareDataSingle, SubscribersKt.b, (l)new RecordVideoPresenter$setCameraDirection.RecordVideoPresenter$setCameraDirection$1(cameraDirection, this)));
            return;
        }
        e.n("cameraHardwareDataSingle");
        throw null;
    }
    
    private final void setFlashEnabled(final boolean b) {
        this.isFlashEnabled = b;
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            ((SnapCameraView)recordVideoView).setFlashEnabled(b);
        }
    }
    
    private final void setTimerWindowOpen(final boolean b) {
        this.isTimerWindowOpen$delegate.setValue((Object)this, (k)RecordVideoPresenter.$$delegatedProperties[0], (Object)b);
    }
    
    private final boolean shouldAddSoundButtonBeVisible() {
        final RecordDubType recordDubType = this.recordDubType;
        if (recordDubType != null) {
            return recordDubType == RecordDubType.RAW && this.segmentList.isEmpty() && !this.isRecording() && this.getArePermissionsGranted();
        }
        e.n("recordDubType");
        throw null;
    }
    
    private final boolean shouldFinalizeVideo(final RecordVideoPresenter.RecordVideoPresenter$StopRecordingType recordVideoPresenter$StopRecordingType) {
        return this.isFromMediaPlayerComplete || RecordVideoUtilKt.totalRecordedLength((List)this.segmentList) >= this.currentMediaDurationMs - 100L || recordVideoPresenter$StopRecordingType == RecordVideoPresenter.RecordVideoPresenter$StopRecordingType.FINISH;
    }
    
    private final boolean shouldShowFinishRecordingButton() {
        final long n = this.getTotalActualRecordedLength();
        boolean b2;
        final boolean b = b2 = false;
        if (n > 2000L) {
            b2 = b;
            if (!this.isTimerWindowOpen()) {
                if (this.segmentList.size() <= 1) {
                    final String stitchUri = this.stitchUri;
                    final boolean b3 = stitchUri == null || stitchUri.length() == 0;
                    b2 = b;
                    if (!b3) {
                        return b2;
                    }
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    private final boolean shouldTitleBeShown() {
        final RecordDubType recordDubType = this.recordDubType;
        if (recordDubType != null) {
            return recordDubType == RecordDubType.DUB;
        }
        e.n("recordDubType");
        throw null;
    }
    
    private final void showFilters(final LensFilter selectedLens) {
        this.selectedLens = selectedLens;
        if (LensFilterKt.isNormalDefault(selectedLens)) {
            final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView != null) {
                ((FiltersView)recordVideoView).clearFilters();
            }
        }
        else {
            final RecordVideoView recordVideoView2 = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView2 != null) {
                ((FiltersView)recordVideoView2).applyFilter(selectedLens);
            }
            this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$FiltersShown(true, this.getArePermissionsGranted()));
        }
    }
    
    private final void showTimer() {
        this.setTimerWindowOpen(true);
        final int totalRecordedLength = RecordVideoUtilKt.totalRecordedLength((List)this.segmentList);
        long n;
        if (totalRecordedLength % 300 == 0) {
            n = totalRecordedLength;
        }
        else {
            n = p7.a.W(totalRecordedLength / (float)300L) * 300L;
        }
        final long n2 = n + 300L;
        final RecordTimerPresenter recordTimerPresenter = this.recordTimerPresenter;
        if (recordTimerPresenter != null) {
            if (recordTimerPresenter != null) {
                final long currentMediaDurationMs = this.currentMediaDurationMs;
                long n3 = n2;
                if (n2 > currentMediaDurationMs) {
                    n3 = currentMediaDurationMs;
                }
                recordTimerPresenter.showTimer(n3);
            }
            final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView != null) {
                ((AddSoundView)recordVideoView).hideAddSoundButton();
            }
            this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$TimerShown(true, this.getArePermissionsGranted()));
        }
    }
    
    private final void startCountDown(final RecordingStartType$Timer recordingStartType$Timer) {
        final RecordVideoPresenter.RecordVideoPresenter$RecordingState recordingState = this.recordingStateReducer.getRecordingState();
        final RecordedSegmentExtras recordedSegmentExtras = new RecordedSegmentExtras(this.isFlashEnabled);
        final RecordDubType recordDubType = this.recordDubType;
        if (recordDubType != null) {
            recordingState.startCountdown(recordingStartType$Timer, recordedSegmentExtras, recordDubType);
            return;
        }
        e.n("recordDubType");
        throw null;
    }
    
    private final void startPreview() {
        if (this.currentMediaDurationMs > 0L) {
            if (CameraPermissionKt.isCameraPermissionGranted(((AbstractPresenter)this).getContext())) {
                this.switchCameraIfFrontCamNotAvailable();
                if (this.segmentList.isEmpty()) {
                    ((MediaSeekApi)this.mediaPlayerApi).seekTo(0L);
                }
                this.setFlashEnabled(this.isFlashEnabled);
            }
        }
    }
    
    private final void startRecording(final RecordingStartType recordingStartType) {
        final a$b a = pu2.a.a;
        final StringBuilder t = a.t("State: ");
        t.append(this.recordingStateReducer.getRecordingState().getClass().getSimpleName());
        a.a(t.toString(), new Object[0]);
        final RecordVideoPresenter.RecordVideoPresenter$RecordingState recordingState = this.recordingStateReducer.getRecordingState();
        final RecordedSegmentExtras recordedSegmentExtras = new RecordedSegmentExtras(this.isFlashEnabled);
        final RecordDubType recordDubType = this.recordDubType;
        if (recordDubType != null) {
            recordingState.startRecording(new RecordVideoPresenter.RecordVideoPresenter$RecordingStartData(recordedSegmentExtras, recordDubType, recordingStartType));
            return;
        }
        e.n("recordDubType");
        throw null;
    }
    
    private final void startRecordingOrSetTimer(final RecordingStartType recordingStartType) {
        if (recordingStartType instanceof RecordingStartType$Timer) {
            this.startCountDown((RecordingStartType$Timer)recordingStartType);
        }
        else {
            this.startRecording(recordingStartType);
        }
    }
    
    private final Closeable startSnapCameraRecord(final l<? super File, j> l) {
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        Object startSnapCameraRecord;
        if (recordVideoView == null || (startSnapCameraRecord = ((SnapCameraView)recordVideoView).startSnapCameraRecord((l)l)) == null) {
            pu2.a.a.p((Throwable)new IllegalStateException("Can't start recording without a view"));
            startSnapCameraRecord = new com.reddit.video.creation.widgets.recording.presenter.e();
        }
        return (Closeable)startSnapCameraRecord;
    }
    
    private static final void startSnapCameraRecord$lambda-39$lambda-38() {
    }
    
    private final void stopRecording(final RecordVideoPresenter.RecordVideoPresenter$StopRecordingType recordVideoPresenter$StopRecordingType) {
        this.recordingStateReducer.getRecordingState().stopRecording(recordVideoPresenter$StopRecordingType);
    }
    
    public static void stopRecording$default(final RecordVideoPresenter recordVideoPresenter, RecordVideoPresenter.RecordVideoPresenter$StopRecordingType other, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            other = RecordVideoPresenter.RecordVideoPresenter$StopRecordingType.OTHER;
        }
        recordVideoPresenter.stopRecording(other);
    }
    
    private final void switchCameraIfFrontCamNotAvailable() {
        final c0<CameraHardwareData> cameraHardwareDataSingle = this.cameraHardwareDataSingle;
        if (cameraHardwareDataSingle != null) {
            final n onAssembly = RxJavaPlugins.onAssembly((n)new mf2.f((g0)cameraHardwareDataSingle, (ff2.q)new sa.t(23)));
            e.e((Object)onAssembly, "cameraHardwareDataSingle\u2026er { !it.hasFrontCamera }");
            p7.a.e(((AbstractPresenter)this).getCompositeDisposable(), (a)SubscribersKt.k(onAssembly, (l)null, (l)new RecordVideoPresenter$switchCameraIfFrontCamNotAvailable.RecordVideoPresenter$switchCameraIfFrontCamNotAvailable$2(this), 3));
            return;
        }
        e.n("cameraHardwareDataSingle");
        throw null;
    }
    
    private static final boolean switchCameraIfFrontCamNotAvailable$lambda-15(final CameraHardwareData cameraHardwareData) {
        e.f((Object)cameraHardwareData, "it");
        return cameraHardwareData.getHasFrontCamera() ^ true;
    }
    
    private final boolean tryCreateRenderedDubFile() {
        boolean b;
        try {
            final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
            File videoCacheDirectory;
            if (recordVideoView != null) {
                videoCacheDirectory = recordVideoView.getVideoCacheDirectory();
            }
            else {
                videoCacheDirectory = null;
            }
            final File tempFile = File.createTempFile("rendered-dub-", ".mp4", videoCacheDirectory);
            e.e((Object)tempFile, "createTempFile(\n        \u2026eoCacheDirectory,\n      )");
            this.renderedDubFile = tempFile;
            b = true;
        }
        catch (final IOException ex) {
            pu2.a.a.e((Throwable)ex);
            final RecordVideoView recordVideoView2 = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView2 != null) {
                ((BaseMVPView)recordVideoView2).finish();
            }
            b = false;
        }
        return b;
    }
    
    private final void turnOffFlash() {
        if (this.isFlashEnabled) {
            final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView != null) {
                ((SnapCameraView)recordVideoView).setFlashEnabled(false);
            }
        }
    }
    
    private final void updateMediaPlayerProgress(final RecordVideoPresenter.RecordVideoPresenter$RecordingSession recordVideoPresenter$RecordingSession) {
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            final int n = RecordVideoUtilKt.totalRecordedLength((List)this.segmentList) + (int)(System.currentTimeMillis() - recordVideoPresenter$RecordingSession.getStartTimeMs());
            recordVideoView.updatePartitionedProgress(n);
            this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$RecordingProgressUpdated(recordVideoPresenter$RecordingSession.getRecordingStartData().getRecordingStartType().getHold(), n > 2000L && this.getShowCheckMarkDuringRecording()));
        }
    }
    
    private final int updateProgressForRegularRecording(final RecordVideoView recordVideoView) {
        final int totalRecordedLength = RecordVideoUtilKt.totalRecordedLength((List)this.segmentList);
        final int partsCount = recordVideoView.getPartsCount();
        final int size = this.segmentList.size();
        boolean b = true;
        final int n = 0;
        if (partsCount >= size - 1) {
            b = false;
        }
        if (b) {
            final Iterator<Object> iterator = this.segmentList.iterator();
            int n2 = n;
            while (iterator.hasNext()) {
                final int n3 = n2 + iterator.next().getRecordedMs();
                final RecordVideoView recordVideoView2 = (RecordVideoView)((AbstractPresenter)this).getView();
                n2 = n3;
                if (recordVideoView2 != null) {
                    recordVideoView2.addPart(n3);
                    n2 = n3;
                }
            }
        }
        else {
            recordVideoView.addPart(totalRecordedLength);
        }
        recordVideoView.updatePartitionedProgress(totalRecordedLength);
        return totalRecordedLength;
    }
    
    private final void updateRecordingProgress() {
        if (this.isTimerWindowOpen()) {
            return;
        }
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            this.pausePlayer();
            this.updateProgressForRegularRecording(recordVideoView);
        }
    }
    
    private final void updateViewOnCountdownTick(final int n) {
        this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$CountdownTick(n));
    }
    
    private final void updateViewOnRecordingStopped() {
        this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$RecordingStopped(this.getRecordingControlsUpdate(), this.getRecordingButtonsUpdate()));
        try {
            if (this.mediaPlayerApi.isPlaying()) {
                this.mediaPlayerApi.pause();
            }
        }
        catch (final IllegalStateException ex) {
            pu2.a.a.e((Throwable)ex);
        }
    }
    
    private static final void viewCreated$lambda-4(final RecordVideoView recordVideoView, final RecordVideoPresenter recordVideoPresenter, final Boolean b) {
        e.f((Object)recordVideoView, "$view");
        e.f((Object)recordVideoPresenter, "this$0");
        e.e((Object)b, "areFiltersVisible");
        if (b) {
            recordVideoPresenter.wereFiltersShown = true;
            recordVideoPresenter.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$FiltersShown(true, recordVideoPresenter.getArePermissionsGranted()));
            ((FiltersView)recordVideoView).showFilters();
            ((SnapCameraView)recordVideoView).showSnapChatGhost();
        }
        else if (recordVideoPresenter.wereFiltersShown) {
            recordVideoPresenter.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$FiltersHidden(recordVideoPresenter.getRecordingControlsUpdate(), recordVideoPresenter.getRecordingButtonsUpdate()));
            ((FiltersView)recordVideoView).hideFilters();
        }
    }
    
    public void displayUiBasedOnRecordingType(final boolean b) {
        this.uiInteractionDelegate.displayUiBasedOnRecordingType(b);
    }
    
    public final void fetchSnapChatLenses(final SnapFiltersManager snapFiltersManager) {
        e.f((Object)snapFiltersManager, "snapFiltersManager");
        this.availableLensesQuery = snapFiltersManager.fetchSnapChatLenses(this.getVideoCreationConfiguration(), (l)new RecordVideoPresenter$fetchSnapChatLenses.RecordVideoPresenter$fetchSnapChatLenses$1(this));
    }
    
    public boolean getAreImagePermissionsGranted() {
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        return recordVideoView != null && ((BaseMVPView)recordVideoView).checkPermission("android.permission.CAMERA");
    }
    
    public boolean getAreVideoPermissionsGranted() {
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        boolean b2;
        final boolean b = b2 = false;
        if (recordVideoView != null) {
            b2 = b;
            if (((BaseMVPView)recordVideoView).checkPermission("android.permission.CAMERA")) {
                b2 = b;
                if (((BaseMVPView)recordVideoView).checkPermission("android.permission.RECORD_AUDIO")) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public final AspectRatioConfig getAspectRatioConfig() {
        return this.aspectRatioConfig;
    }
    
    public final Integer getLastDeletableSegmentIndex() {
        final boolean empty = this.segmentList.isEmpty();
        Integer value = null;
        final Object o = null;
        if (empty ^ true) {
            final int n = this.segmentList.size() - 1;
            final AdjustedClip adjustedClip = this.segmentList.get(n).getAdjustedClip();
            Object uri = o;
            if (adjustedClip != null) {
                uri = adjustedClip.getUri();
            }
            int n2 = n;
            if (e.a(uri, (Object)this.stitchUri)) {
                n2 = n;
                if (this.segmentList.size() > 1) {
                    n2 = n - 1;
                }
            }
            value = n2;
        }
        return value;
    }
    
    public final RecordEventSenderFactory getRecordEventSenderFactory() {
        return this.recordEventSenderFactory;
    }
    
    public final RecordTimerPresenter getRecordTimerPresenter$creation_release() {
        return this.recordTimerPresenter;
    }
    
    public final RecordedVideoPlayerPresenter getRecordingPlayerPresenter() {
        final Object value = this.recordingPlayerPresenter$delegate.getValue();
        e.e(value, "<get-recordingPlayerPresenter>(...)");
        return (RecordedVideoPlayerPresenter)value;
    }
    
    public final List<RecordedSegment> getSegmentList() {
        return this.segmentList;
    }
    
    public final RecordViewState getViewState$creation_release() {
        return this.viewState;
    }
    
    public void goBackFromRationaleClicked() {
        this.uiInteractionDelegate.goBackFromRationaleClicked();
    }
    
    public final void handleFinish() {
        this.eventBus.setDiscardVideoOutputResult();
    }
    
    public final boolean isTimerEnabled() {
        final RecordingStartType recordingStartType = this.getRecordingStartType();
        boolean b = true;
        if (recordingStartType == null || !recordingStartType.isTimerEnabled()) {
            b = false;
        }
        return b;
    }
    
    public final void onAddSoundClicked() {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.ADD_SOUNDS, (FlowType)null, 2, (DefaultConstructorMarker)null));
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            ((AddSoundView)recordVideoView).goToAddSound(this.getRestoreRecordingParams());
        }
    }
    
    public final void onAdjustClipsClicked() {
        final List<InitialClipData> initialClipDatas = this.getInitialClipDatas();
        final long maxAllowedDurationMillis = this.getMaxAllowedDurationMillis();
        final File audioFile = this.audioFile;
        String path;
        if (audioFile != null) {
            path = audioFile.getPath();
        }
        else {
            path = null;
        }
        final AdjustClipsLaunchData adjustClipsLaunchData = new AdjustClipsLaunchData((List)initialClipDatas, maxAllowedDurationMillis, false, path, false, false, false, AdjustClipsFlowType.RECORDING, 0, this.stitchUri, false, 1396, (DefaultConstructorMarker)null);
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_ADJUST_CLIPS, (FlowType)null, 2, (DefaultConstructorMarker)null));
        this.eventBus.goToDestination((EventBus$NavigationEvent)new EventBus$NavigationEvent$OpenAdjustClipsFragment(adjustClipsLaunchData));
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            ((RecordedVideoPlayerView)recordVideoView).stopPlayer();
        }
    }
    
    public final void onApplyFilterClicked() {
        final LensFilter selectedLens = this.selectedLens;
        this.lastLensApplied = selectedLens;
        Label_0155: {
            if (LensFilterKt.isNormalDefault(selectedLens)) {
                final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
                if (recordVideoView != null) {
                    ((FiltersView)recordVideoView).clearFilters();
                }
                final RecordVideoView recordVideoView2 = (RecordVideoView)((AbstractPresenter)this).getView();
                if (recordVideoView2 != null) {
                    ((FiltersView)recordVideoView2).hideFilters();
                }
                final RecordVideoView recordVideoView3 = (RecordVideoView)((AbstractPresenter)this).getView();
                if (recordVideoView3 != null) {
                    ((SnapCameraView)recordVideoView3).hideSnapChatGhost();
                }
            }
            else {
                final LensFilter lastLensApplied = this.lastLensApplied;
                if (lastLensApplied != null) {
                    final RecordVideoView recordVideoView4 = (RecordVideoView)((AbstractPresenter)this).getView();
                    if (recordVideoView4 != null) {
                        ((FiltersView)recordVideoView4).applyFilter(lastLensApplied);
                    }
                    final RecordVideoView recordVideoView5 = (RecordVideoView)((AbstractPresenter)this).getView();
                    j a;
                    if (recordVideoView5 != null) {
                        ((SnapCameraView)recordVideoView5).showSnapChatGhost();
                        a = j.a;
                    }
                    else {
                        a = null;
                    }
                    if (a != null) {
                        break Label_0155;
                    }
                }
                final RecordVideoView recordVideoView6 = (RecordVideoView)((AbstractPresenter)this).getView();
                if (recordVideoView6 != null) {
                    ((SnapCameraView)recordVideoView6).hideSnapChatGhost();
                    final j a2 = j.a;
                }
            }
        }
        this.onFiltersClosed();
    }
    
    public boolean onBackPressed() {
        if (this.recordingStateReducer.getRecordingState().isRecording()) {
            this.recordingStateReducer.getRecordingState().stopRecording(RecordVideoPresenter.RecordVideoPresenter$StopRecordingType.OTHER);
        }
        else {
            this.onLeaveTheScreenRequested();
        }
        return true;
    }
    
    public final void onCameraPermissionResult(final boolean b, final boolean b2) {
        this.getRecordEventSender().sendCameraPermissionResultEvent(b, b2);
    }
    
    public final void onCameraRationaleGoToSettingsClick() {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.CAMERA_PERMISSION_OPEN_SETTINGS, (FlowType)null, 2, (DefaultConstructorMarker)null));
        this.permissionAlreadyChecked = false;
        final Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", ((AbstractPresenter)this).getContext().getPackageName(), (String)null));
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            ((BaseMVPView)recordVideoView).startActivityForResult(intent, 7);
        }
    }
    
    public final void onCancelCountdownClicked() {
        stopRecording$default(this, null, 1, null);
    }
    
    public final void onCloseFilterButtonClicked() {
        this.selectedLens = null;
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            ((SnapCameraView)recordVideoView).hideSnapChatGhost();
        }
        final RecordVideoView recordVideoView2 = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView2 != null) {
            ((FiltersView)recordVideoView2).clearFilters();
        }
        this.onFiltersClosed();
    }
    
    public final void onCloseTimerClicked() {
        if (this.isTimerWindowOpen()) {
            this.hideTimer(true);
        }
    }
    
    public final void onCreate(final boolean hasHardwareFlash) {
        this.hasHardwareFlash = hasHardwareFlash;
        this.observeViewEvents();
        this.observeAdjustClips();
    }
    
    public void onDeleteSegmentCancelled() {
        this.uiInteractionDelegate.onDeleteSegmentCancelled();
    }
    
    public void onDeleteSegmentClicked() {
        this.uiInteractionDelegate.onDeleteSegmentClicked();
    }
    
    public final void onDeleteSegmentConfirmed() {
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            recordVideoView.setLastSegmentHighlighted(false);
        }
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_DELETE_SEGMENT, (FlowType)null, 2, (DefaultConstructorMarker)null));
        this.deleteLastSegment();
    }
    
    public void onDestroy() {
        final a editUGCResultsSubscription = this.editUGCResultsSubscription;
        int n = 0;
        if (editUGCResultsSubscription != null) {
            n = n;
            if (!editUGCResultsSubscription.isDisposed()) {
                n = 1;
            }
        }
        if (n != 0) {
            final a editUGCResultsSubscription2 = this.editUGCResultsSubscription;
            if (editUGCResultsSubscription2 != null) {
                editUGCResultsSubscription2.dispose();
            }
        }
        super.onDestroy();
    }
    
    public void onFilterSelected(final LensFilter lensFilter) {
        e.f((Object)lensFilter, "selectedLens");
        if (!this.getSharedPrefs().getBoolean("SNAP_CAMERA_KIT_TERMS_FLAG_VALUE", false) && ((AbstractPresenter)this).getView() != null) {
            final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView != null) {
                ((BaseMVPView)recordVideoView).showAlertDialog(Integer.valueOf(2131955376), Integer.valueOf(2131955372), 2131955375, 2131955373, (Runnable)new i(18, (Object)this, (Object)lensFilter), (Runnable)new com.reddit.video.creation.widgets.recording.presenter.f(this), Integer.valueOf(2131955374), (Runnable)new cs1.d((Object)this, 6));
            }
        }
        else {
            this.showFilters(lensFilter);
        }
    }
    
    public void onFiltersClosed() {
        this.uiInteractionDelegate.onFiltersClosed();
    }
    
    public final void onFinishRecordingClicked() {
        this.isFinishingRecording = true;
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_COMPLETE, (FlowType)null, 2, (DefaultConstructorMarker)null));
        pu2.a.a.a("Finish recording clicked", new Object[0]);
        this.recordingStateReducer.getRecordingState().finishRecording(AdjustClipsFlowType.RECORDING);
    }
    
    public final void onFlashToggleClicked(final boolean flashEnabled) {
        this.getRecordEventSender().onFlashToggleClicked(flashEnabled);
        this.setFlashEnabled(flashEnabled);
    }
    
    public void onImageFlashToggleClicked(final boolean b) {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_FLASH, FlowType.IMAGE));
    }
    
    public void onImageLeaveTheScreenRequested() {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_CLOSE_CAMERA, FlowType.IMAGE));
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            ((BaseMVPView)recordVideoView).finish();
        }
    }
    
    public void onImageResume() {
        this.eventBus.reportAnalytics((Analytics)new ScreenVisible(ScreenId.CAMERA_RECORDING, (String)null, FlowType.IMAGE, 2, (DefaultConstructorMarker)null));
    }
    
    public void onLeaveTheScreenConfirmed() {
        this.uiInteractionDelegate.onLeaveTheScreenConfirmed();
    }
    
    public final void onLeaveTheScreenRequested() {
        this.getRecordEventSender().onLeaveTheScreenRequested();
    }
    
    public void onOpenFiltersClicked() {
        this.uiInteractionDelegate.onOpenFiltersClicked();
    }
    
    public void onPause() {
        super.onPause();
        stopRecording$default(this, null, 1, null);
        this.isResumed = false;
        this.turnOffFlash();
        this.mediaPlayerApi.unbindMedia();
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            ((RecordedVideoPlayerView)recordVideoView).stopPlayer();
        }
        if (this.isTimerWindowOpen()) {
            this.hideTimer(true);
        }
    }
    
    public final void onPlayClicked() {
        final RecordedSegment recordedSegment = (RecordedSegment)CollectionsKt___CollectionsKt.U4((List)this.segmentList);
        String uri = null;
        Label_0043: {
            if (recordedSegment != null) {
                final AdjustedClip adjustedClip = recordedSegment.getAdjustedClip();
                if (adjustedClip != null) {
                    final AdjustableClip adjustableClip = adjustedClip.getAdjustableClip();
                    if (adjustableClip != null) {
                        uri = adjustableClip.getUri();
                        break Label_0043;
                    }
                }
            }
            uri = null;
        }
        this.updateOrientation(uri);
        this.shouldMergeFiles = false;
        this.getRecordingPlayerPresenter().onPlayClicked(((Enum)this.getCurrentDirection()).ordinal());
    }
    
    public void onResume() {
        super.onResume();
        this.initCamera();
        this.getRecordingPlayerPresenter().onRecordedSegmentsChanged((List)this.segmentList, ((Enum)this.getCurrentDirection()).ordinal());
        this.isFinishingRecording = false;
        final RecordDubType recordDubType = this.recordDubType;
        if (recordDubType == null) {
            e.n("recordDubType");
            throw null;
        }
        if (recordDubType == RecordDubType.RAW) {
            this.handleRawRecordingResume();
        }
        else {
            this.loadMedia();
        }
        if (this.isResumed) {
            return;
        }
        this.getRecordEventSender().onResume();
        this.isResumed = true;
        this.isRecordingFinished = false;
        this.setFlashEnabled(this.isFlashEnabled);
        final LensFilter selectedLens = this.selectedLens;
        if (selectedLens != null) {
            if (LensFilterKt.isNormalDefault(selectedLens)) {
                final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
                if (recordVideoView != null) {
                    ((FiltersView)recordVideoView).clearFilters();
                }
                final RecordVideoView recordVideoView2 = (RecordVideoView)((AbstractPresenter)this).getView();
                if (recordVideoView2 != null) {
                    ((FiltersView)recordVideoView2).hideFilters();
                }
                final RecordVideoView recordVideoView3 = (RecordVideoView)((AbstractPresenter)this).getView();
                if (recordVideoView3 != null) {
                    ((SnapCameraView)recordVideoView3).hideSnapChatGhost();
                }
            }
            else {
                final RecordVideoView recordVideoView4 = (RecordVideoView)((AbstractPresenter)this).getView();
                if (recordVideoView4 != null) {
                    ((FiltersView)recordVideoView4).applyFilter(selectedLens);
                }
                final RecordVideoView recordVideoView5 = (RecordVideoView)((AbstractPresenter)this).getView();
                if (recordVideoView5 != null) {
                    ((SnapCameraView)recordVideoView5).showSnapChatGhost();
                }
            }
        }
    }
    
    public final void onStopClicked() {
        this.getRecordingPlayerPresenter().onStopClicked();
        this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$PlayerStopped(this.getRecordingControlsUpdate(), this.getRecordingButtonsUpdate()));
    }
    
    public final void onTimerClicked() {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_TIMER, (FlowType)null, 2, (DefaultConstructorMarker)null));
        this.showTimer();
    }
    
    public final void onTitleClicked() {
        final RecordDubType recordDubType = this.recordDubType;
        if (recordDubType != null) {
            if (recordDubType == RecordDubType.DUB && this.segmentList.isEmpty()) {
                final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
                if (recordVideoView != null) {
                    ((AddSoundView)recordVideoView).showEditSoundDialog((mg2.a)new RecordVideoPresenter$onTitleClicked.RecordVideoPresenter$onTitleClicked$1(this), (mg2.a)new RecordVideoPresenter$onTitleClicked.RecordVideoPresenter$onTitleClicked$2(this));
                }
            }
            return;
        }
        e.n("recordDubType");
        throw null;
    }
    
    public final void onUploadUserVideosClicked() {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.CREATE_UPLOAD, (FlowType)null, 2, (DefaultConstructorMarker)null));
        AbstractPresenter.requestStoragePermission$creation_release$default((AbstractPresenter)this, 0, (mg2.a)new RecordVideoPresenter$onUploadUserVideosClicked.RecordVideoPresenter$onUploadUserVideosClicked$1(this), 1, (Object)null);
    }
    
    public void onVideoContainerClicked() {
        final LensFilter selectedLens = this.selectedLens;
        boolean b = true;
        if (selectedLens == null || !LensFilterKt.isColorPicker(selectedLens)) {
            b = false;
        }
        if (!b) {
            this.onApplyFilterClicked();
        }
    }
    
    public void onVideoFlashToggleClicked(final boolean b) {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_FLASH, (FlowType)null, 2, (DefaultConstructorMarker)null));
    }
    
    public void onVideoLeaveTheScreenRequested() {
        if (this.segmentList.isEmpty()) {
            this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_CLOSE_CAMERA, (FlowType)null, 2, (DefaultConstructorMarker)null));
            final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView != null) {
                ((BaseMVPView)recordVideoView).finish();
            }
        }
        else {
            this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_CLOSE_CAMERA_WITH_CONFIRM, (FlowType)null, 2, (DefaultConstructorMarker)null));
            final RecordVideoView recordVideoView2 = (RecordVideoView)((AbstractPresenter)this).getView();
            if (recordVideoView2 != null) {
                recordVideoView2.showLeaveConfirmationDialog();
            }
        }
    }
    
    public void onVideoResume() {
        this.eventBus.reportAnalytics((Analytics)new ScreenVisible(this.screenId, this.sourceUuid, (FlowType)null, 4, (DefaultConstructorMarker)null));
    }
    
    public void runIfAvailable(final l<? super RecordVideoView, j> l) {
        e.f((Object)l, "functionToRun");
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            l.invoke((Object)recordVideoView);
        }
    }
    
    public void saveState(final Bundle bundle) {
        e.f((Object)bundle, "outState");
        ((BaseBundle)bundle).putBoolean("FLASH_ON", this.isFlashEnabled);
        bundle.putParcelableArrayList("bundle_key_segments_list", new ArrayList((Collection<? extends E>)this.segmentList));
    }
    
    public void sendImageCameraPermissionResultEvent(final boolean b) {
        TapTarget tapTarget;
        if (b) {
            tapTarget = TapTarget.CAMERA_PERMISSION_ACCEPT;
        }
        else {
            tapTarget = TapTarget.CAMERA_PERMISSION_DENY;
        }
        this.eventBus.reportAnalytics((Analytics)new Tap(tapTarget, FlowType.IMAGE));
        this.permissionAlreadyChecked = true;
        if (((AbstractPresenter)this).getView() != null) {
            if (b) {
                this.sendImagePermissionsGrantedEvent();
            }
            else {
                final PublishSubject<RecordViewEvent> viewEventProcessor = this.viewEventProcessor;
                final String string = ((AbstractPresenter)this).getContext().getString(2131952331);
                e.e((Object)string, "context.getString(R.stri\u2026era_permission_rationale)");
                viewEventProcessor.onNext((Object)new RecordImageViewEvent$PermissionRationale(string));
            }
        }
    }
    
    public void sendImageCameraSwitchedEvent() {
        this.eventBus.reportAnalytics((Analytics)new FlipCamera(this.getCurrentDirection(), FlowType.IMAGE));
        this.viewEventProcessor.onNext((Object)new RecordImageViewEvent$CameraSwitched(this.isFlashLightAccessible() && this.getCurrentDirection() != CameraDirection.FRONT));
    }
    
    public void sendImagePermissionsGrantedEvent() {
        this.viewEventProcessor.onNext((Object)new RecordImageViewEvent$PermissionGranted(this.getArePermissionsGranted(), this.getArePermissionsGranted(), true, this.getArePermissionsGranted()));
    }
    
    public void sendOnCreatedImageEvent() {
        this.viewEventProcessor.onNext((Object)new RecordImageViewEvent$ImageViewCreated(this.isFlashLightAccessible() && this.getCurrentDirection() != CameraDirection.FRONT));
    }
    
    public void sendOnCreatedVideoEvent(final boolean b) {
        this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$ViewCreated(this.creationConfiguration.getTheme().getButtonsThemeConfig().getRegular().getBackgroundColor(), this.creationConfiguration.getTheme().getButtonsThemeConfig().getRegular().getBackgroundColor(), this.getRecordingButtonsUpdate(), b));
    }
    
    public void sendRecordingStartImageEvent(final RecordingStartType recordingStartType) {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_START_SEGMENT, FlowType.IMAGE));
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            ((SnapCameraView)recordVideoView).startSnapCameraImage((l)new RecordVideoPresenter$sendRecordingStartImageEvent.RecordVideoPresenter$sendRecordingStartImageEvent$1(this));
        }
    }
    
    public void sendRecordingStartVideoEvent(final RecordingStartType recordingStartType) {
        if (recordingStartType != null) {
            this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_START_SEGMENT, (FlowType)null, 2, (DefaultConstructorMarker)null));
            this.startRecordingOrSetTimer(recordingStartType);
        }
        else {
            this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_STOP_SEGMENT, (FlowType)null, 2, (DefaultConstructorMarker)null));
            stopRecording$default(this, null, 1, null);
        }
    }
    
    public void sendVideoCameraPermissionResultEvent(final boolean b, final boolean b2) {
        final boolean b3 = b && b2;
        TapTarget tapTarget;
        if (b) {
            tapTarget = TapTarget.CAMERA_PERMISSION_ACCEPT;
        }
        else {
            tapTarget = TapTarget.CAMERA_PERMISSION_DENY;
        }
        final EventBus eventBus = this.eventBus;
        final FlowType video = FlowType.VIDEO;
        eventBus.reportAnalytics((Analytics)new Tap(tapTarget, video));
        TapTarget tapTarget2;
        if (b2) {
            tapTarget2 = TapTarget.MIC_PERMISSION_ACCEPT;
        }
        else {
            tapTarget2 = TapTarget.MIC_PERMISSION_DENY;
        }
        this.eventBus.reportAnalytics((Analytics)new Tap(tapTarget2, video));
        this.permissionAlreadyChecked = true;
        if (((AbstractPresenter)this).getView() != null) {
            if (b3) {
                this.sendVideoPermissionsGrantedEvent();
            }
            else {
                final PublishSubject<RecordViewEvent> viewEventProcessor = this.viewEventProcessor;
                final String string = ((AbstractPresenter)this).getContext().getString(2131952322);
                e.e((Object)string, "context.getString(R.stri\u2026mic_permission_rationale)");
                viewEventProcessor.onNext((Object)new RecordVideoViewEvent$PermissionRationale(string));
            }
        }
    }
    
    public void sendVideoCameraSwitchedEvent() {
        this.eventBus.reportAnalytics((Analytics)new Tap(TapTarget.RECORDING_FLIP_CAMERA, FlowType.VIDEO));
        this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$CameraSwitched(this.isFlashLightAccessible()));
    }
    
    public void sendVideoPermissionsGrantedEvent() {
        this.viewEventProcessor.onNext((Object)new RecordVideoViewEvent$PermissionGranted(this.getRecordingButtonsUpdate()));
    }
    
    public final void setRecordTimerPresenter$creation_release(final RecordTimerPresenter recordTimerPresenter) {
        this.recordTimerPresenter = recordTimerPresenter;
    }
    
    public final void setRecording(final RecordingStartType recordingStartType) {
        this.getRecordEventSender().sendRecordingStartEvent(recordingStartType);
    }
    
    public final void setZoomUsed() {
        this.zoomUsed = true;
    }
    
    public void startPreviewWithImagePermissionsCheck(final boolean b, final mg2.a<j> a) {
        e.f((Object)a, "startPreview");
        this.uiInteractionDelegate.startPreviewWithImagePermissionsCheck(b, (mg2.a)a);
    }
    
    public void startPreviewWithVideoPermissionsCheck(final boolean b, final mg2.a<j> a) {
        e.f((Object)a, "startPreview");
        this.uiInteractionDelegate.startPreviewWithVideoPermissionsCheck(b, (mg2.a)a);
    }
    
    public final void switchCameras() {
        final CameraDirection currentDirection = this.getCurrentDirection();
        final CameraDirection front = CameraDirection.FRONT;
        CameraDirection back;
        if (currentDirection == front) {
            back = CameraDirection.BACK;
        }
        else {
            back = front;
        }
        this.setCameraDirection(back);
        this.getRecordEventSender().sendCameraSwitchedEvent();
        final RecordVideoView recordVideoView = (RecordVideoView)((AbstractPresenter)this).getView();
        if (recordVideoView != null) {
            ((SnapCameraView)recordVideoView).startSnapCameraPreview(this.getCurrentDirection() == front);
        }
    }
    
    public final boolean tryFinishRecording() {
        if (this.isStitchAvailable && this.segmentList.size() <= 1) {
            this.onBackPressed();
            return true;
        }
        return false;
    }
    
    public final void updateOrientation(final String s) {
        VideoScale fill;
        if ((fill = this.aspectRatioConfig.getVideoScales().get(s)) == null) {
            fill = VideoScale.FILL;
        }
        this.updateSelectedOrientation(fill);
    }
    
    public final void viewCreated(final RecordVideoView recordVideoView, final IntentParams intentParams, final Bundle bundle) {
        e.f((Object)recordVideoView, "view");
        e.f((Object)intentParams, "intentParams");
        this.getRecordEventSender().sendViewCreatedEvent(false);
        ((AbstractPresenter)this).viewCreated((BaseMVPView)recordVideoView);
        this.uiInteractionDelegate.init((OnRecordView)this);
        this.currentMediaDurationMs = this.getMaxAllowedDurationMillis();
        this.wereFiltersShown = false;
        final CompositeDisposable compositeDisposable = ((AbstractPresenter)this).getCompositeDisposable();
        final a subscribe = this.uiInteractionDelegate.getFiltersVisibleObservable().subscribe((ff2.g)new f40.q(16, (Object)recordVideoView, (Object)this));
        e.e((Object)subscribe, "uiInteractionDelegate.fi\u2026}\n        }\n      }\n    }");
        p7.a.J(compositeDisposable, subscribe);
        if (!this.tryCreateRenderedDubFile()) {
            return;
        }
        this.handleNewIntent(intentParams);
        this.handleSavedState(bundle);
        this.observeEditUGC();
    }
}
