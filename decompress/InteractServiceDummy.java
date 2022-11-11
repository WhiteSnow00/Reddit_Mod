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
import X.6uH;
import java.util.List;
import X.0kb;
import com.bytedance.android.live.base.model.user.User;
import android.view.SurfaceView;
import X.0xa;
import java.util.LinkedHashSet;
import java.util.Set;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import X.CTM;
import android.graphics.Rect;
import X.8si;
import X.0rv;
import X.1ZH;
import X.0kc;
import X.0CH;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.ViewGroup;
import X.0kY;
import com.bytedance.covode.number.Covode;

public class InteractServiceDummy implements IInteractService
{
    static {
        Covode.recordClassIndex(7055);
    }
    
    @Override
    public long battleTaskRecommendGiftId() {
        return 0L;
    }
    
    @Override
    public boolean canLinkMic() {
        return false;
    }
    
    @Override
    public 0kY createCommonLinkMicFeedViewManager() {
        return null;
    }
    
    @Override
    public 0kc createMultiGuestV3PreAdjustPlayerManager(final ViewGroup viewGroup, final DataChannel dataChannel, final 0CH 0ch) {
        return null;
    }
    
    @Override
    public 1ZH createMultiLiveFeedView(final int n, final long n2, final long n3, final boolean b) {
        return null;
    }
    
    @Override
    public 0rv createPaddingMask(final ViewGroup viewGroup) {
        public final class 1NM implements 0rv
        {
            static {
                Covode.recordClassIndex(7056);
            }
            
            @Override
            public final void LIZ() {
            }
            
            @Override
            public final void LIZ(final 8si<Integer, Integer> 8si) {
            }
            
            @Override
            public final void LIZ(final Rect rect) {
                CTM.LIZ((Object)rect);
            }
            
            @Override
            public final int LIZIZ() {
                return 0;
            }
            
            @Override
            public final void LIZJ() {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   X/1NM.<init>:()V
        //     7: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void disconnectMultiGuestV3() {
    }
    
    @Override
    public long getBattleId() {
        return 0L;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getBottomLeftLinkHostWidget() {
        return null;
    }
    
    @Override
    public long getChannelId() {
        return 0L;
    }
    
    @Override
    public String getConnectionType() {
        return "normal";
    }
    
    @Override
    public String getCurrentInviteeList() {
        return "";
    }
    
    @Override
    public int getCurrentLinkMode() {
        return 0;
    }
    
    @Override
    public String getCurrentPkState() {
        return "";
    }
    
    @Override
    public String getDebugInfo() {
        return "";
    }
    
    @Override
    public String getGuestLinkPermission(final Room room, final boolean b) {
        CTM.LIZ((Object)room);
        return "";
    }
    
    @Override
    public Set<Long> getHasAppliedUidSetForMultiGuestAnchor() {
        return new LinkedHashSet<Long>();
    }
    
    @Override
    public Set<Long> getHasInvitedUidSetForMultiGuestAnchor() {
        return new LinkedHashSet<Long>();
    }
    
    @Override
    public String getInviteeList() {
        return "";
    }
    
    @Override
    public 0xa getLinkCrossRoomSeiData() {
        return null;
    }
    
    @Override
    public SurfaceView getLinkInAnchorSurface() {
        return null;
    }
    
    @Override
    public int getLinkState(final User user) {
        return 0;
    }
    
    @Override
    public String getLinkStatus4H5() {
        return "";
    }
    
    @Override
    public 0kb getLinkWidgetFactory() {
        return null;
    }
    
    @Override
    public int getLinkedGuestNum() {
        return 0;
    }
    
    @Override
    public int getMatchPreviewProgressStatus() {
        return -1;
    }
    
    @Override
    public int getMatchProgressStatus() {
        return -1;
    }
    
    @Override
    public int getMaxLinkNum() {
        return 0;
    }
    
    @Override
    public List<Long> getMultiCoHostLinkedUserList() {
        return (List<Long>)6uH.INSTANCE;
    }
    
    @Override
    public HMP getMultiGuestLeaf(final Context context, final int n, final FBF<User> fbf, final DataChannel dataChannel, final Runnable runnable) {
        CTM.LIZ((Object)context, (Object)fbf, (Object)dataChannel, (Object)runnable);
        return null;
    }
    
    @Override
    public int getMultiGuestOnlineGuestsViews() {
        return 0;
    }
    
    @Override
    public long getRivalAnchorUidWhenAnchorLinkMic() {
        return 0L;
    }
    
    @Override
    public String getRoomScene() {
        return "";
    }
    
    @Override
    public List<TeamUsersInfo> getTeamInfo() {
        return null;
    }
    
    @Override
    public Set<Long> getUninvitedUidSet() {
        return new LinkedHashSet<Long>();
    }
    
    @Override
    public 0kQ getUserRole(final long n) {
        return null;
    }
    
    @Override
    public void handleLiveRoomStopped() {
    }
    
    @Override
    public boolean hasMultiCoHostPermission() {
        return false;
    }
    
    @Override
    public boolean isAdjustParentForPreviewDialog() {
        return false;
    }
    
    @Override
    public boolean isAnchorVideoEnable() {
        return true;
    }
    
    @Override
    public boolean isAudienceApplied() {
        return false;
    }
    
    @Override
    public boolean isBattleStarter() {
        return false;
    }
    
    @Override
    public boolean isBattling() {
        return false;
    }
    
    @Override
    public boolean isInCoHost() {
        return false;
    }
    
    @Override
    public boolean isInMultiGuest() {
        return false;
    }
    
    @Override
    public boolean isInRandomLinkMic() {
        return false;
    }
    
    @Override
    public boolean isInteracting() {
        return false;
    }
    
    @Override
    public boolean isLinkingMic() {
        return false;
    }
    
    @Override
    public boolean isMultiGuestV3() {
        return false;
    }
    
    @Override
    public boolean isMultiLiveFixLayout() {
        return false;
    }
    
    @Override
    public boolean isMultiLiveFloatLayout() {
        return false;
    }
    
    @Override
    public boolean isMultiLiveGridLayout() {
        return false;
    }
    
    @Override
    public boolean isMultiLiveLayout() {
        return false;
    }
    
    @Override
    public boolean isNotInLinkMicProgress() {
        return true;
    }
    
    @Override
    public boolean isPreparingCoHost() {
        return false;
    }
    
    @Override
    public boolean isRoomInBattle() {
        return false;
    }
    
    @Override
    public boolean isTurnOffInvitation(final long n) {
        return false;
    }
    
    @Override
    public void leaveOnCopyrightViolation(final Room room) {
        CTM.LIZ((Object)room);
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void preloadAnchorViewHolder() {
    }
    
    @Override
    public void preloadWidgetView() {
    }
    
    @Override
    public void registerInteractStateChangeListener(final FyD fyD) {
    }
    
    @Override
    public void removeInteractStateChangeListener(final FyD fyD) {
    }
    
    @Override
    public void tryPreloadMatchAnchorResource(final Room room) {
    }
}
