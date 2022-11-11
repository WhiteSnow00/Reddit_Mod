// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.api.dummy;

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
import com.bytedance.android.live.broadcast.api.IBroadcastService;

public class BroadcastServiceDummy implements IBroadcastService
{
    static {
        Covode.recordClassIndex(5062);
    }
    
    @Override
    public void addBroadcastLifecycle(final 0Wm 0Wm) {
    }
    
    @Override
    public Gbb createBgBroadcastBinder() {
        return null;
    }
    
    @Override
    public void createCloseRoomHelper(final Room room, final Context context, final DataChannel dataChannel, final Fragment fragment, final 0Wy 0Wy) {
    }
    
    @Override
    public 0j4 createCommonInteractionFunctionHelper(final Context context, final BaseFragment baseFragment, final 0j8 0j8, final View view, final RecyclableWidgetManager recyclableWidgetManager) {
        return null;
    }
    
    @Override
    public GbZ createLinkMicPreviewView(final Context context, final 0Wg.a a, final DataChannel dataChannel, final Object o) {
        return null;
    }
    
    @Override
    public GbZ createLinkMicPreviewViewV2(final Context context, final 0Wg.a a, final DataChannel dataChannel, final Object o) {
        return null;
    }
    
    @Override
    public GbZ createLinkVideoView(final Context context, final 0Wg.a a, final 0WH 0wh, final DataChannel dataChannel) {
        return null;
    }
    
    @Override
    public 0j9 createLiveBroadcastEndFragment(final Bundle bundle) {
        return null;
    }
    
    @Override
    public GQO createLiveBroadcastFragment(final GVf gVf, final Bundle bundle) {
        return null;
    }
    
    @Override
    public LiveWidget createLiveCenterEntranceWidget() {
        return null;
    }
    
    @Override
    public 0Wx createLiveIllegalHelper(final Room room, final Context context, final DataChannel dataChannel, final 0Wy 0Wy) {
        return null;
    }
    
    @Override
    public 0Wa createLiveStream(final 0Yp 0Yp) {
        return null;
    }
    
    @Override
    public 0Wk createLongPressHelper(final Room room, final Fragment fragment, final View view, final Context context, final DataChannel dataChannel) {
        return null;
    }
    
    @Override
    public 0Yq createMonitorReport() {
        return null;
    }
    
    @Override
    public LiveRecyclableWidget createNetSpeedMonitorWidget(final boolean b) {
        return null;
    }
    
    @Override
    public Gqe createObsBroadcastFragment(final GVf gVf, final Bundle bundle) {
        return null;
    }
    
    @Override
    public void createPauseLiveHelper(final DataChannel dataChannel, final 0Wa 0Wa, final 0Z9 0z9) {
    }
    
    @Override
    public Widget createPauseLiveWidget(final View view) {
        return null;
    }
    
    @Override
    public I7o createStartLiveFragment(final GCx gCx) {
        return null;
    }
    
    @Override
    public 0Ys createStatusReporter(final Room room) {
        return null;
    }
    
    @Override
    public 0Yo createStreamLogger() {
        return null;
    }
    
    @Override
    public 0Yn createStreamUploader() {
        return null;
    }
    
    @Override
    public 0Wz createSyncGiftHelper(final Room room) {
        return null;
    }
    
    @Override
    public GbZ createVirtualVideoView(final Context context, final 0Wg.a a, final String s, final String s2) {
        return null;
    }
    
    @Override
    public Activity getBroadcastActivity() {
        return null;
    }
    
    @Override
    public 0We getBroadcastPreviewService() {
        return null;
    }
    
    @Override
    public String getBroadcastScene() {
        return null;
    }
    
    @Override
    public 0Wi getEchoHelper() {
        return null;
    }
    
    @Override
    public 1FF getInsertStickerManager() {
        return null;
    }
    
    @Override
    public Fra getLastBroadcastLiveMode(final Context context) {
        return null;
    }
    
    @Override
    public 0WE getLiveCameraResManager() {
        return null;
    }
    
    @Override
    public String getLiveComposerFilePath() {
        return null;
    }
    
    @Override
    public String getLiveCoreVersion() {
        return "";
    }
    
    @Override
    public 0Wj getLiveStreamSoundPlayer() {
        return null;
    }
    
    @Override
    public String getModelFilePath() {
        return null;
    }
    
    @Override
    public 1FG getMultiGuestV3OriginFrameReviewManager(final long n) {
        return null;
    }
    
    @Override
    public Object getResourceFinder(final Context context) {
        return null;
    }
    
    @Override
    public Map<String, String> getRoomInfo() {
        return null;
    }
    
    @Override
    public String getRtcDeviceID() {
        return "";
    }
    
    @Override
    public String getRtcVersion() {
        return "";
    }
    
    @Override
    public void init() {
    }
    
    @Override
    public void initLiveBroadcastContext() {
    }
    
    @Override
    public boolean isCommerce(final DataChannel dataChannel) {
        return false;
    }
    
    @Override
    public void loadPauseLiveButton(final DataChannel dataChannel) {
    }
    
    @Override
    public FBF<Integer> loadShortVideoRes() {
        return null;
    }
    
    @Override
    public void logLiveOver(final Room room, final DataChannel dataChannel) {
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void onLiveTabShow(final Context context) {
    }
    
    @Override
    public boolean oneTapGoLive(final Context context, final Uri uri) {
        return false;
    }
    
    @Override
    public void preloadLiveStream(final Context context, final boolean b) {
    }
    
    @Override
    public void releaseLiveStream() {
    }
    
    @Override
    public void removeBroadcastLifecycle(final 0Wm 0Wm) {
    }
    
    @Override
    public void reportBroadcastCreated() {
    }
    
    @Override
    public void reportBroadcastEnd() {
    }
    
    @Override
    public void reportCameraFirstShow() {
    }
    
    @Override
    public void reportEnterBroadcast() {
    }
    
    @Override
    public void reportStartPushStream(final WeakHandler weakHandler) {
    }
    
    @Override
    public void reportStreamEnd(final int n, final long n2, final long n3, final boolean b, final int n4) {
    }
    
    @Override
    public void reportStreamEndForApi(final int n, final long n2, final long n3, final boolean b, final int n4) {
    }
    
    @Override
    public void reportStreamEndForLiveCore(final int n, final int n2, final String s, final long n3, final long n4, final boolean b, final int n5) {
    }
    
    @Override
    public void requestCreateInfoFromTools(final GZS gzs) {
    }
    
    @Override
    public void setApplyLivePermission(final GYl gYl) {
    }
    
    @Override
    public void setBroadcastActivity(final Activity activity) {
    }
    
    @Override
    public void setDetailLivePermission(final GbG gbG) {
    }
    
    @Override
    public void setResumeLiveParams(final int n) {
    }
    
    @Override
    public void showEndPageForPaidEvent() {
    }
    
    public void showGuideBirthdayEditDialog(final Activity activity, final String s, final String s2, final a a) {
    }
    
    @Override
    public GZl startLiveManager() {
        return null;
    }
}
