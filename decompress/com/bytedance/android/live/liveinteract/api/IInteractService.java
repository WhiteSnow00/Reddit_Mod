// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.api;

import X.FyD;
import X.0kQ;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import X.HMP;
import X.FBF;
import android.content.Context;
import java.util.List;
import X.0kb;
import com.bytedance.android.live.base.model.user.User;
import android.view.SurfaceView;
import X.0xa;
import java.util.Set;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import X.0rv;
import X.1ZH;
import X.0kc;
import X.0CH;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.ViewGroup;
import X.0kY;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IInteractService extends 0Vq
{
    default static {
        Covode.recordClassIndex(7054);
    }
    
    long battleTaskRecommendGiftId();
    
    boolean canLinkMic();
    
    0kY createCommonLinkMicFeedViewManager();
    
    0kc createMultiGuestV3PreAdjustPlayerManager(final ViewGroup p0, final DataChannel p1, final 0CH p2);
    
    1ZH createMultiLiveFeedView(final int p0, final long p1, final long p2, final boolean p3);
    
    0rv createPaddingMask(final ViewGroup p0);
    
    void disconnectMultiGuestV3();
    
    long getBattleId();
    
    Class<? extends LiveRecyclableWidget> getBottomLeftLinkHostWidget();
    
    long getChannelId();
    
    String getConnectionType();
    
    String getCurrentInviteeList();
    
    int getCurrentLinkMode();
    
    String getCurrentPkState();
    
    String getDebugInfo();
    
    String getGuestLinkPermission(final Room p0, final boolean p1);
    
    Set<Long> getHasAppliedUidSetForMultiGuestAnchor();
    
    Set<Long> getHasInvitedUidSetForMultiGuestAnchor();
    
    String getInviteeList();
    
    0xa getLinkCrossRoomSeiData();
    
    SurfaceView getLinkInAnchorSurface();
    
    int getLinkState(final User p0);
    
    String getLinkStatus4H5();
    
    0kb getLinkWidgetFactory();
    
    int getLinkedGuestNum();
    
    int getMatchPreviewProgressStatus();
    
    int getMatchProgressStatus();
    
    int getMaxLinkNum();
    
    List<Long> getMultiCoHostLinkedUserList();
    
    HMP getMultiGuestLeaf(final Context p0, final int p1, final FBF<User> p2, final DataChannel p3, final Runnable p4);
    
    int getMultiGuestOnlineGuestsViews();
    
    long getRivalAnchorUidWhenAnchorLinkMic();
    
    String getRoomScene();
    
    List<TeamUsersInfo> getTeamInfo();
    
    Set<Long> getUninvitedUidSet();
    
    0kQ getUserRole(final long p0);
    
    void handleLiveRoomStopped();
    
    boolean hasMultiCoHostPermission();
    
    boolean isAdjustParentForPreviewDialog();
    
    boolean isAnchorVideoEnable();
    
    boolean isAudienceApplied();
    
    boolean isBattleStarter();
    
    boolean isBattling();
    
    boolean isInCoHost();
    
    boolean isInMultiGuest();
    
    boolean isInRandomLinkMic();
    
    boolean isInteracting();
    
    boolean isLinkingMic();
    
    boolean isMultiGuestV3();
    
    boolean isMultiLiveFixLayout();
    
    boolean isMultiLiveFloatLayout();
    
    boolean isMultiLiveGridLayout();
    
    boolean isMultiLiveLayout();
    
    boolean isNotInLinkMicProgress();
    
    boolean isPreparingCoHost();
    
    boolean isRoomInBattle();
    
    boolean isTurnOffInvitation(final long p0);
    
    void leaveOnCopyrightViolation(final Room p0);
    
    void preloadAnchorViewHolder();
    
    void preloadWidgetView();
    
    void registerInteractStateChangeListener(final FyD p0);
    
    void removeInteractStateChangeListener(final FyD p0);
    
    void tryPreloadMatchAnchorResource(final Room p0);
}
