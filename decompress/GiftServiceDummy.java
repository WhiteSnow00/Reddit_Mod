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
import java.util.ArrayList;
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
import X.CTM;
import X.HH3;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class GiftServiceDummy implements IGiftService
{
    static {
        Covode.recordClassIndex(6884);
    }
    
    @Override
    public void clearAssets(final String s) {
    }
    
    @Override
    public void clearFastGift(final long n) {
    }
    
    @Override
    public HH3 createGiftDebugService(final Context context, final DataChannel dataChannel) {
        CTM.LIZ((Object)context, (Object)dataChannel);
        return null;
    }
    
    @Override
    public void downloadAssets(final long n, final HXo hXo, final int n2) {
    }
    
    @Override
    public boolean enablePortal() {
        return true;
    }
    
    @Override
    public boolean enableRedEnvelope() {
        return true;
    }
    
    @Override
    public void exitRoom(final Boolean b, final Room room) {
    }
    
    @Override
    public Gift findGiftById(final long n) {
        return null;
    }
    
    @Override
    public View generateCPCTopView(final Context context, final QgG<2P9> qgG) {
        CTM.LIZ((Object)qgG);
        return null;
    }
    
    @Override
    public String getAmountString(final long n) {
        return String.valueOf(n);
    }
    
    @Override
    public AssetsModel getAssets(final String s, final long n) {
        return null;
    }
    
    @Override
    public String getAssetsPath(final String s, final long n) {
        return "";
    }
    
    @Override
    public Gii getBoostChartInfo() {
        return null;
    }
    
    @Override
    public long getEffectIdWithGiftId(final Gift gift, final long n) {
        return 0L;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getExtendScreenGiftTrayWidget() {
        return null;
    }
    
    @Override
    public FiG getFirstRechargeManager() {
        return null;
    }
    
    @Override
    public long getFirstSubscribeGiftId() {
        return 0L;
    }
    
    @Override
    public HH2 getGiftInterceptor(final long n, final boolean b) {
        return null;
    }
    
    @Override
    public GiftMessage getGiftMessage(final long n, final SendGiftResult sendGiftResult, final User user) {
        return null;
    }
    
    @Override
    public List<GiftPage> getGiftPages() {
        return null;
    }
    
    @Override
    public LiveWidget getGiftWidget(final EnterRoomConfig enterRoomConfig) {
        return null;
    }
    
    @Override
    public String getLowAgeReportUrl() {
        return "";
    }
    
    @Override
    public Ghs getPollGifts() {
        return null;
    }
    
    @Override
    public Widget getRedEnvelopeWidget() {
        return null;
    }
    
    @Override
    public String getRoomStatus() {
        return "";
    }
    
    @Override
    public HKG getSendGiftResultLog(final SendGiftResult sendGiftResult) {
        return null;
    }
    
    @Override
    public Pair<Integer, Integer> getShowedAndUnShowedGuestGiftCount() {
        final Integer value = 0;
        return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value);
    }
    
    @Override
    public List<Gift> getStickerGifts() {
        return new ArrayList<Gift>();
    }
    
    @Override
    public int getTargetGiftDiamondCount(final long n) {
        return 0;
    }
    
    @Override
    public LiveWidget getWishListWidget() {
        return null;
    }
    
    @Override
    public long giftVideoResourcesClear(final boolean b) {
        return 0L;
    }
    
    @Override
    public boolean hasFirstRechargeGift() {
        return false;
    }
    
    @Override
    public void initGiftResource() {
    }
    
    @Override
    public void initGiftResourceManager(final Context context) {
    }
    
    @Override
    public boolean isAssetsDownloaded(final String s, final long n) {
        return false;
    }
    
    @Override
    public boolean isFirstRecharge() {
        return false;
    }
    
    @Override
    public boolean isFirstRechargeGift(final long n) {
        return false;
    }
    
    @Override
    public boolean isGuestMatchAnchorGiftTrayEnable() {
        return false;
    }
    
    @Override
    public boolean isSubscriptionGift(final long n) {
        return false;
    }
    
    @Override
    public void loadBehavior(final Context context, final DataChannel dataChannel, final int n) {
    }
    
    @Override
    public void logBoostCardLiveEndClick(final int n, final Fra fra) {
        CTM.LIZ((Object)fra);
    }
    
    @Override
    public void logBoostCardLiveEndShow(final Fra fra) {
        CTM.LIZ((Object)fra);
    }
    
    @Override
    public void monitorBroadcastClicked(final long n) {
    }
    
    @Override
    public void monitorBroadcastMonitor(final long n, final boolean b) {
    }
    
    @Override
    public void monitorGiftIconShow(final boolean b, final GPH gph, final String s, final String s2) {
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void onLiveActivityDestroyed() {
    }
    
    @Override
    public void onPlayFragmentCreate() {
    }
    
    @Override
    public void openGiftDialog(final String s) {
    }
    
    @Override
    public void openGiftDialogFromJSB(final Fop fop) {
    }
    
    @Override
    public void openRechargeFAQPage(final Context context) {
        CTM.LIZ((Object)context);
    }
    
    @Override
    public void playGiftVideo(final long n, final H46 h46) {
    }
    
    @Override
    public void preloadBroadcastApi() {
    }
    
    @Override
    public void preloadLayout() {
    }
    
    @Override
    public void removeAnimationEngine(final HIO hio) {
    }
    
    @Override
    public void resetRoomStatus() {
    }
    
    @Override
    public FBF<1dl<SendGiftResult>> sendGift(final long n, final long n2, final long n3, final int n4, final HashMap<String, String> hashMap) {
        return null;
    }
    
    @Override
    public void sendGiftInternal(final Context context, final 0jQ 0jQ) {
        CTM.LIZ((Object)0jQ);
    }
    
    @Override
    public void sendGiftPoll(final long n, final long n2, final Room room, final DataChannel dataChannel, final HHu hHu) {
    }
    
    @Override
    public void setGiftAnimationEngine(final HIO hio, final HEk hEk) {
    }
    
    @Override
    public void showBroadCaseEndPage(final boolean b) {
    }
    
    @Override
    public void syncGiftList(final int n) {
    }
    
    @Override
    public void syncGiftList(final HIU hiu, final long n, final int n2, final boolean b) {
    }
}
