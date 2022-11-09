// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.api;

import X.GZl;
import X.GbG;
import X.GYl;
import X.GZS;
import com.bytedance.common.utility.collection.WeakHandler;
import android.net.Uri;
import X.FBF;
import java.util.Map;
import X.1FG;
import X.0Wj;
import X.0WE;
import X.Fra;
import X.1FF;
import X.0Wi;
import X.0We;
import android.app.Activity;
import X.0Wz;
import X.0Yn;
import X.0Yo;
import X.0Ys;
import X.I7o;
import X.GCx;
import com.bytedance.android.widget.Widget;
import X.0Z9;
import X.Gqe;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import X.0Yq;
import X.0Wk;
import X.0Wa;
import X.0Yp;
import X.0Wx;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.GQO;
import X.GVf;
import X.0j9;
import android.os.Bundle;
import X.0WH;
import X.GbZ;
import X.0Wg;
import X.0j4;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import android.view.View;
import X.0j8;
import com.bytedance.android.livesdk.ui.BaseFragment;
import X.0Wy;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.Gbb;
import X.0Wm;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IBroadcastService extends 0Vq
{
    default static {
        Covode.recordClassIndex(5011);
    }
    
    void addBroadcastLifecycle(final 0Wm p0);
    
    Gbb createBgBroadcastBinder();
    
    void createCloseRoomHelper(final Room p0, final Context p1, final DataChannel p2, final Fragment p3, final 0Wy p4);
    
    0j4 createCommonInteractionFunctionHelper(final Context p0, final BaseFragment p1, final 0j8 p2, final View p3, final RecyclableWidgetManager p4);
    
    GbZ createLinkMicPreviewView(final Context p0, final 0Wg.a p1, final DataChannel p2, final Object p3);
    
    GbZ createLinkMicPreviewViewV2(final Context p0, final 0Wg.a p1, final DataChannel p2, final Object p3);
    
    GbZ createLinkVideoView(final Context p0, final 0Wg.a p1, final 0WH p2, final DataChannel p3);
    
    0j9 createLiveBroadcastEndFragment(final Bundle p0);
    
    GQO createLiveBroadcastFragment(final GVf p0, final Bundle p1);
    
    LiveWidget createLiveCenterEntranceWidget();
    
    0Wx createLiveIllegalHelper(final Room p0, final Context p1, final DataChannel p2, final 0Wy p3);
    
    0Wa createLiveStream(final 0Yp p0);
    
    0Wk createLongPressHelper(final Room p0, final Fragment p1, final View p2, final Context p3, final DataChannel p4);
    
    0Yq createMonitorReport();
    
    LiveRecyclableWidget createNetSpeedMonitorWidget(final boolean p0);
    
    Gqe createObsBroadcastFragment(final GVf p0, final Bundle p1);
    
    void createPauseLiveHelper(final DataChannel p0, final 0Wa p1, final 0Z9 p2);
    
    Widget createPauseLiveWidget(final View p0);
    
    I7o createStartLiveFragment(final GCx p0);
    
    0Ys createStatusReporter(final Room p0);
    
    0Yo createStreamLogger();
    
    0Yn createStreamUploader();
    
    0Wz createSyncGiftHelper(final Room p0);
    
    GbZ createVirtualVideoView(final Context p0, final 0Wg.a p1, final String p2, final String p3);
    
    Activity getBroadcastActivity();
    
    0We getBroadcastPreviewService();
    
    String getBroadcastScene();
    
    0Wi getEchoHelper();
    
    1FF getInsertStickerManager();
    
    Fra getLastBroadcastLiveMode(final Context p0);
    
    0WE getLiveCameraResManager();
    
    String getLiveComposerFilePath();
    
    String getLiveCoreVersion();
    
    0Wj getLiveStreamSoundPlayer();
    
    String getModelFilePath();
    
    1FG getMultiGuestV3OriginFrameReviewManager(final long p0);
    
    Object getResourceFinder(final Context p0);
    
    Map<String, String> getRoomInfo();
    
    String getRtcDeviceID();
    
    String getRtcVersion();
    
    void init();
    
    void initLiveBroadcastContext();
    
    boolean isCommerce(final DataChannel p0);
    
    void loadPauseLiveButton(final DataChannel p0);
    
    FBF<Integer> loadShortVideoRes();
    
    void logLiveOver(final Room p0, final DataChannel p1);
    
    void onLiveTabShow(final Context p0);
    
    boolean oneTapGoLive(final Context p0, final Uri p1);
    
    void preloadLiveStream(final Context p0, final boolean p1);
    
    void releaseLiveStream();
    
    void removeBroadcastLifecycle(final 0Wm p0);
    
    void reportBroadcastCreated();
    
    void reportBroadcastEnd();
    
    void reportCameraFirstShow();
    
    void reportEnterBroadcast();
    
    void reportStartPushStream(final WeakHandler p0);
    
    void reportStreamEnd(final int p0, final long p1, final long p2, final boolean p3, final int p4);
    
    void reportStreamEndForApi(final int p0, final long p1, final long p2, final boolean p3, final int p4);
    
    void reportStreamEndForLiveCore(final int p0, final int p1, final String p2, final long p3, final long p4, final boolean p5, final int p6);
    
    void requestCreateInfoFromTools(final GZS p0);
    
    void setApplyLivePermission(final GYl p0);
    
    void setBroadcastActivity(final Activity p0);
    
    void setDetailLivePermission(final GbG p0);
    
    void setResumeLiveParams(final int p0);
    
    void showEndPageForPaidEvent();
    
    void showGuideBirthdayEditDialog(final Activity p0, final String p1, final String p2, final IBroadcastService.a p3);
    
    GZl startLiveManager();
}
