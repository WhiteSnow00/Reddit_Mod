// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.gift;

import X.HIU;
import X.HEk;
import X.HHu;
import X.0jQ;
import X.1dl;
import X.FBF;
import java.util.HashMap;
import X.HIO;
import X.H46;
import X.Fop;
import X.GPH;
import X.Fra;
import android.util.Pair;
import X.HKG;
import com.bytedance.android.widget.Widget;
import X.Ghs;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.List;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import X.HH2;
import X.FiG;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import X.Gii;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import android.view.View;
import X.2P9;
import X.QgG;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.HXo;
import X.HH3;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IGiftService extends 0Vq
{
    default static {
        Covode.recordClassIndex(6886);
    }
    
    void clearAssets(final String p0);
    
    void clearFastGift(final long p0);
    
    HH3 createGiftDebugService(final Context p0, final DataChannel p1);
    
    void downloadAssets(final long p0, final HXo p1, final int p2);
    
    boolean enablePortal();
    
    boolean enableRedEnvelope();
    
    void exitRoom(final Boolean p0, final Room p1);
    
    Gift findGiftById(final long p0);
    
    View generateCPCTopView(final Context p0, final QgG<2P9> p1);
    
    String getAmountString(final long p0);
    
    AssetsModel getAssets(final String p0, final long p1);
    
    String getAssetsPath(final String p0, final long p1);
    
    Gii getBoostChartInfo();
    
    long getEffectIdWithGiftId(final Gift p0, final long p1);
    
    Class<? extends LiveRecyclableWidget> getExtendScreenGiftTrayWidget();
    
    FiG getFirstRechargeManager();
    
    long getFirstSubscribeGiftId();
    
    HH2 getGiftInterceptor(final long p0, final boolean p1);
    
    GiftMessage getGiftMessage(final long p0, final SendGiftResult p1, final User p2);
    
    List<GiftPage> getGiftPages();
    
    LiveWidget getGiftWidget(final EnterRoomConfig p0);
    
    String getLowAgeReportUrl();
    
    Ghs getPollGifts();
    
    Widget getRedEnvelopeWidget();
    
    String getRoomStatus();
    
    HKG getSendGiftResultLog(final SendGiftResult p0);
    
    Pair<Integer, Integer> getShowedAndUnShowedGuestGiftCount();
    
    List<Gift> getStickerGifts();
    
    int getTargetGiftDiamondCount(final long p0);
    
    LiveWidget getWishListWidget();
    
    long giftVideoResourcesClear(final boolean p0);
    
    boolean hasFirstRechargeGift();
    
    void initGiftResource();
    
    void initGiftResourceManager(final Context p0);
    
    boolean isAssetsDownloaded(final String p0, final long p1);
    
    boolean isFirstRecharge();
    
    boolean isFirstRechargeGift(final long p0);
    
    boolean isGuestMatchAnchorGiftTrayEnable();
    
    boolean isSubscriptionGift(final long p0);
    
    void loadBehavior(final Context p0, final DataChannel p1, final int p2);
    
    void logBoostCardLiveEndClick(final int p0, final Fra p1);
    
    void logBoostCardLiveEndShow(final Fra p0);
    
    void monitorBroadcastClicked(final long p0);
    
    void monitorBroadcastMonitor(final long p0, final boolean p1);
    
    void monitorGiftIconShow(final boolean p0, final GPH p1, final String p2, final String p3);
    
    void onLiveActivityDestroyed();
    
    void onPlayFragmentCreate();
    
    void openGiftDialog(final String p0);
    
    void openGiftDialogFromJSB(final Fop p0);
    
    void openRechargeFAQPage(final Context p0);
    
    void playGiftVideo(final long p0, final H46 p1);
    
    void preloadBroadcastApi();
    
    void preloadLayout();
    
    void removeAnimationEngine(final HIO p0);
    
    void resetRoomStatus();
    
    FBF<1dl<SendGiftResult>> sendGift(final long p0, final long p1, final long p2, final int p3, final HashMap<String, String> p4);
    
    void sendGiftInternal(final Context p0, final 0jQ p1);
    
    void sendGiftPoll(final long p0, final long p1, final Room p2, final DataChannel p3, final HHu p4);
    
    void setGiftAnimationEngine(final HIO p0, final HEk p1);
    
    void showBroadCaseEndPage(final boolean p0);
    
    void syncGiftList(final int p0);
    
    void syncGiftList(final HIU p0, final long p1, final int p2, final boolean p3);
}
