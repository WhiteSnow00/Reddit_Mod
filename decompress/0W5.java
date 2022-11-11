// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.bytedance.covode.number.Covode;

public interface 0W5
{
    default static {
        Covode.recordClassIndex(4996);
    }
    
    boolean childrenManagerForbidWalletFunctions();
    
    AnchorInfo getAnchorInfo();
    
    GPr getAnchorLevel();
    
    AuthenticationInfo getAuthenticationInfo();
    
    String getAutoGraph();
    
    ImageModel getAvatarLarge();
    
    ImageModel getAvatarMedium();
    
    ImageModel getAvatarThumb();
    
    String getBackgroundImgUrl();
    
    long getCreateTime();
    
    long getFanTicketCount();
    
    FollowInfo getFollowInfo();
    
    long getId();
    
    long getLiveRoomId();
    
    long getModifyTime();
    
    List<ImageModel> getNewUserBadges();
    
    User.OwnRoom getOwnRoom();
    
    String getSecUid();
    
    int getSecret();
    
    String getShareQrcodeUri();
    
    int getStatus();
    
    SubscribeInfo getSubscribeInfo();
    
    List<User> getTopFans();
    
    int getTopVipNo();
    
    UserAttr getUserAttr();
    
    List<ImageModel> getUserBadges();
    
    Gmd getUserHonor();
    
    String getVerifiedReason();
    
    boolean isEnableShowCommerceSale();
    
    boolean isVerified();
    
    void setFollowStatus(final int p0);
    
    void setUserAttr(final UserAttr p0);
    
    public enum a
    {
        Login, 
        Logout, 
        Update;
        
        static {
            Covode.recordClassIndex(4997);
        }
    }
}
