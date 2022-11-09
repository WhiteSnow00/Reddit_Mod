// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import java.util.Collection;
import java.util.ArrayList;
import X.Gmd;
import android.text.TextUtils;
import X.GPr;
import com.google.gson.Gson;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.UserHonor;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.ActivityRewardInfo;
import com.bytedance.android.livesdk.model.NobleLevelInfo;
import com.bytedance.android.livesdk.model.FraternityInfo;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.BorderInfo;
import java.util.List;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Author;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.AnchorLevel;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.google.gson.a.c;
import X.0W5;

public class User implements 0W5
{
    public static boolean sSubPermission;
    @c(LIZ = "allow_find_by_contacts")
    public Boolean allowFindByContacts;
    @c(LIZ = "allow_others_download_video")
    public Boolean allowOthersDownloadVideo;
    @c(LIZ = "allow_others_download_when_sharing_video")
    public Boolean allowOthersDownloadWhenSharingVideo;
    @c(LIZ = "allow_share_show_profile")
    public Boolean allowShareShowProfile;
    @c(LIZ = "allow_show_in_gossip")
    public Boolean allowShowInGossip;
    @c(LIZ = "allow_show_my_action")
    public Boolean allowShowMyAction;
    @c(LIZ = "allow_strange_comment")
    public Boolean allowStrangeComment;
    @c(LIZ = "allow_unfollower_comment")
    public Boolean allowUnfollowerComment;
    @c(LIZ = "allow_use_linkmic")
    public Boolean allowUseLinkmic;
    @c(LIZ = "anchor_info")
    public AnchorInfo anchorInfo;
    @c(LIZ = "webcast_anchor_level")
    public AnchorLevel anchorLevel;
    @c(LIZ = "authentication_info")
    public AuthenticationInfo authenticationInfo;
    @c(LIZ = "author_stats")
    public Author authorInfo;
    @c(LIZ = "avatar_border")
    public ImageModel avatarBorder;
    @c(LIZ = "avatar_jpg")
    public ImageModel avatarJpg;
    @c(LIZ = "avatar_large")
    public ImageModel avatarLarge;
    @c(LIZ = "avatar_medium")
    public ImageModel avatarMedium;
    @c(LIZ = "avatar_thumb")
    public ImageModel avatarThumb;
    @c(LIZ = "bg_img_url")
    public String backgroundImgUrl;
    @c(LIZ = "badge_list")
    public List<BadgeStruct> badgeList;
    @c(LIZ = "block_status")
    public Integer blockStatus;
    @c(LIZ = "border")
    public BorderInfo border;
    @c(LIZ = "border_list")
    public List<BorderInfo> borders;
    @c(LIZ = "combo_badge_info")
    public ComboBadgeInfo comboBadgeInfo;
    @c(LIZ = "comment_restrict")
    public Integer commentRestrict;
    @c(LIZ = "commerce_webcast_config_ids")
    public List<Long> commerceWebcastConfigIds;
    @c(LIZ = "constellation")
    public String constellation;
    @c(LIZ = "create_time")
    public long createTime;
    @c(LIZ = "disable_ichat")
    public Integer disableIchat;
    @c(LIZ = "with_car_management_permission")
    public boolean enableCarManagementPermission;
    @c(LIZ = "enable_ichat_img")
    public Long enableIchatImg;
    @c(LIZ = "with_commerce_permission")
    public boolean enableShowCommerceSale;
    @c(LIZ = "exp")
    public Integer exp;
    @c(LIZ = "ticket_count")
    public long fanTicketCount;
    @c(LIZ = "fans_club")
    public FansClubMember fansClub;
    @c(LIZ = "fold_stranger_chat")
    public Boolean foldStrangerChat;
    @c(LIZ = "follow_info")
    public FollowInfo followInfo;
    @c(LIZ = "follow_status")
    public Long followStatus;
    public FraternityInfo fraternityInfo;
    @c(LIZ = "ichat_restrict_type")
    public Integer ichatRestrictType;
    @c(LIZ = "id")
    public long id;
    @c(LIZ = "id_str")
    public String idStr;
    @c(LIZ = "is_follower")
    public Boolean isFollower;
    @c(LIZ = "is_following")
    public Boolean isFollowing;
    @c(LIZ = "verified")
    public boolean isVerified;
    @c(LIZ = "link_mic_stats")
    public int linkMicStats;
    public String logPb;
    public String mAvatarLargeStr;
    public String mAvatarMediumStr;
    public String mAvatarThumbStr;
    @c(LIZ = "medal")
    public ImageModel medal;
    @c(LIZ = "media_badge_image_list")
    public List<ImageModel> mediaBadgeImageList;
    @c(LIZ = "modify_time")
    public long modifyTime;
    @c(LIZ = "need_profile_guide")
    public Boolean needProfileGuide;
    @c(LIZ = "new_real_time_icons")
    public List<ImageModel> newUserBadges;
    @c(LIZ = "nickname")
    public String nickName;
    public NobleLevelInfo nobleLevelInfo;
    @c(LIZ = "own_room")
    public OwnRoom ownRoom;
    @c(LIZ = "pay_score")
    public Long payScore;
    @c(LIZ = "deprecated21")
    public long payScores;
    @c(LIZ = "personal_card")
    public ImageModel personalCard;
    @c(LIZ = "push_comment_status")
    public Boolean pushCommentStatus;
    @c(LIZ = "push_digg")
    public Boolean pushDigg;
    @c(LIZ = "push_follow")
    public Boolean pushFollow;
    @c(LIZ = "push_friend_action")
    public Boolean pushFriendAction;
    @c(LIZ = "push_ichat")
    public Boolean pushIchat;
    @c(LIZ = "push_status")
    public Boolean pushStatus;
    @c(LIZ = "push_video_post")
    public Boolean pushVideoPost;
    @c(LIZ = "push_video_recommend")
    public Boolean pushVideoRecommend;
    public String requestId;
    @c(LIZ = "activity_reward")
    public ActivityRewardInfo rewardInfo;
    @c(LIZ = "scm_label")
    public String scmLabel;
    @c(LIZ = "sec_uid")
    public String secUid;
    @c(LIZ = "secret")
    public int secret;
    @c(LIZ = "share_qrcode_uri")
    public String shareQrcodeUri;
    @c(LIZ = "bio_description")
    public String signature;
    @c(LIZ = "special_id")
    public String specialId;
    @c(LIZ = "status")
    public int status;
    @c(LIZ = "subscribe_info")
    public SubscribeInfo subscribeInfo;
    @c(LIZ = "top_fans")
    public List<User> topFans;
    @c(LIZ = "top_vip_no")
    public int topVipNo;
    @c(LIZ = "upcoming_event_list")
    public List<LiveEventInfo> upcomingEventList;
    @c(LIZ = "user_attr")
    public UserAttr userAttr;
    @c(LIZ = "real_time_icons")
    public List<ImageModel> userBadges;
    @c(LIZ = "pay_grade")
    public UserHonor userHonor;
    @c(LIZ = "user_role")
    public int userRole;
    @c(LIZ = "display_id")
    public String username;
    @c(LIZ = "verified_content")
    public String verifiedContent;
    @c(LIZ = "verified_reason")
    public String verifiedReason;
    @c(LIZ = "with_fusion_shop_entry")
    public Boolean withFusionShopEntry;
    
    static {
        Covode.recordClassIndex(4975);
    }
    
    public User() {
        this.payScores = -1L;
    }
    
    public static User from(final 0W5 0w5) {
        if (0w5 == null) {
            return null;
        }
        if (0w5 instanceof User) {
            final Gson gson = new Gson();
            return (User)gson.LIZ(gson.LIZIZ((Object)0w5), (Class)User.class);
        }
        final User user = new User();
        user.initWith(0w5);
        return user;
    }
    
    public boolean childrenManagerForbidCreateLiveRoom() {
        return false;
    }
    
    @Override
    public boolean childrenManagerForbidWalletFunctions() {
        return false;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final User user = (User)o;
            if (this.id != user.id) {
                return false;
            }
            if (this.createTime != user.createTime) {
                return false;
            }
            if (this.fanTicketCount != user.fanTicketCount) {
                return false;
            }
            if (this.isVerified != user.isVerified) {
                return false;
            }
            if (this.topVipNo != user.topVipNo) {
                return false;
            }
            if (this.getLiveRoomId() != user.getLiveRoomId()) {
                return false;
            }
            if (this.enableShowCommerceSale != user.enableShowCommerceSale) {
                return false;
            }
            final String nickName = this.nickName;
            Label_0156: {
                if (nickName != null) {
                    if (nickName.equals(user.nickName)) {
                        break Label_0156;
                    }
                }
                else if (user.nickName == null) {
                    break Label_0156;
                }
                return false;
            }
            final String signature = this.signature;
            Label_0188: {
                if (signature != null) {
                    if (signature.equals(user.signature)) {
                        break Label_0188;
                    }
                }
                else if (user.signature == null) {
                    break Label_0188;
                }
                return false;
            }
            final ImageModel avatarThumb = this.avatarThumb;
            Label_0220: {
                if (avatarThumb != null) {
                    if (avatarThumb.equals(user.avatarThumb)) {
                        break Label_0220;
                    }
                }
                else if (user.avatarThumb == null) {
                    break Label_0220;
                }
                return false;
            }
            final ImageModel avatarMedium = this.avatarMedium;
            Label_0252: {
                if (avatarMedium != null) {
                    if (avatarMedium.equals(user.avatarMedium)) {
                        break Label_0252;
                    }
                }
                else if (user.avatarMedium == null) {
                    break Label_0252;
                }
                return false;
            }
            final ImageModel avatarLarge = this.avatarLarge;
            Label_0284: {
                if (avatarLarge != null) {
                    if (avatarLarge.equals(user.avatarLarge)) {
                        break Label_0284;
                    }
                }
                else if (user.avatarLarge == null) {
                    break Label_0284;
                }
                return false;
            }
            final List<User> topFans = this.topFans;
            Label_0318: {
                if (topFans != null) {
                    if (topFans.equals(user.topFans)) {
                        break Label_0318;
                    }
                }
                else if (user.topFans == null) {
                    break Label_0318;
                }
                return false;
            }
            final String idStr = this.idStr;
            Label_0350: {
                if (idStr != null) {
                    if (idStr.equals(user.idStr)) {
                        break Label_0350;
                    }
                }
                else if (user.idStr == null) {
                    break Label_0350;
                }
                return false;
            }
            final String verifiedReason = this.verifiedReason;
            Label_0382: {
                if (verifiedReason != null) {
                    if (verifiedReason.equals(user.verifiedReason)) {
                        break Label_0382;
                    }
                }
                else if (user.verifiedReason == null) {
                    break Label_0382;
                }
                return false;
            }
            final UserHonor userHonor = this.userHonor;
            Label_0414: {
                if (userHonor != null) {
                    if (userHonor.equals((Object)user.userHonor)) {
                        break Label_0414;
                    }
                }
                else if (user.userHonor == null) {
                    break Label_0414;
                }
                return false;
            }
            final AnchorLevel anchorLevel = this.anchorLevel;
            Label_0446: {
                if (anchorLevel != null) {
                    if (anchorLevel.equals((Object)user.anchorLevel)) {
                        break Label_0446;
                    }
                }
                else if (user.anchorLevel == null) {
                    break Label_0446;
                }
                return false;
            }
            final List<ImageModel> userBadges = this.userBadges;
            Label_0480: {
                if (userBadges != null) {
                    if (userBadges.equals(user.userBadges)) {
                        break Label_0480;
                    }
                }
                else if (user.userBadges == null) {
                    break Label_0480;
                }
                return false;
            }
            final List<ImageModel> newUserBadges = this.newUserBadges;
            Label_0514: {
                if (newUserBadges != null) {
                    if (newUserBadges.equals(user.newUserBadges)) {
                        break Label_0514;
                    }
                }
                else if (user.newUserBadges == null) {
                    break Label_0514;
                }
                return false;
            }
            final String mAvatarThumbStr = this.mAvatarThumbStr;
            Label_0546: {
                if (mAvatarThumbStr != null) {
                    if (mAvatarThumbStr.equals(user.mAvatarThumbStr)) {
                        break Label_0546;
                    }
                }
                else if (user.mAvatarThumbStr == null) {
                    break Label_0546;
                }
                return false;
            }
            final String mAvatarMediumStr = this.mAvatarMediumStr;
            Label_0578: {
                if (mAvatarMediumStr != null) {
                    if (mAvatarMediumStr.equals(user.mAvatarMediumStr)) {
                        break Label_0578;
                    }
                }
                else if (user.mAvatarMediumStr == null) {
                    break Label_0578;
                }
                return false;
            }
            final String mAvatarLargeStr = this.mAvatarLargeStr;
            Label_0610: {
                if (mAvatarLargeStr != null) {
                    if (mAvatarLargeStr.equals(user.mAvatarLargeStr)) {
                        break Label_0610;
                    }
                }
                else if (user.mAvatarLargeStr == null) {
                    break Label_0610;
                }
                return false;
            }
            final String backgroundImgUrl = this.backgroundImgUrl;
            Label_0642: {
                if (backgroundImgUrl != null) {
                    if (backgroundImgUrl.equals(user.backgroundImgUrl)) {
                        break Label_0642;
                    }
                }
                else if (user.backgroundImgUrl == null) {
                    break Label_0642;
                }
                return false;
            }
            if (this.status != user.status) {
                return false;
            }
            if (this.modifyTime != user.modifyTime) {
                return false;
            }
            if (this.secret != user.secret) {
                return false;
            }
            final String shareQrcodeUri = this.shareQrcodeUri;
            Label_0714: {
                if (shareQrcodeUri != null) {
                    if (shareQrcodeUri.equals(user.shareQrcodeUri)) {
                        break Label_0714;
                    }
                }
                else if (user.shareQrcodeUri == null) {
                    break Label_0714;
                }
                return false;
            }
            final FollowInfo followInfo = this.followInfo;
            Label_0746: {
                if (followInfo != null) {
                    if (followInfo.equals(user.followInfo)) {
                        break Label_0746;
                    }
                }
                else if (user.followInfo == null) {
                    break Label_0746;
                }
                return false;
            }
            final UserAttr userAttr = this.userAttr;
            Label_0778: {
                if (userAttr != null) {
                    if (userAttr.equals((Object)user.userAttr)) {
                        break Label_0778;
                    }
                }
                else if (user.userAttr == null) {
                    break Label_0778;
                }
                return false;
            }
            final AuthenticationInfo authenticationInfo = this.authenticationInfo;
            Label_0810: {
                if (authenticationInfo != null) {
                    if (authenticationInfo.equals((Object)user.authenticationInfo)) {
                        break Label_0810;
                    }
                }
                else if (user.authenticationInfo == null) {
                    break Label_0810;
                }
                return false;
            }
            final AnchorInfo anchorInfo = this.anchorInfo;
            final AnchorInfo anchorInfo2 = user.anchorInfo;
            if (anchorInfo != null) {
                return anchorInfo.equals((Object)anchorInfo2);
            }
            if (anchorInfo2 == null) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public AnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }
    
    public AnchorLevel getAnchorLevel() {
        return this.anchorLevel;
    }
    
    @Override
    public AuthenticationInfo getAuthenticationInfo() {
        return this.authenticationInfo;
    }
    
    public Author getAuthorInfo() {
        return this.authorInfo;
    }
    
    @Override
    public String getAutoGraph() {
        return this.signature;
    }
    
    public ImageModel getAvatarBorder() {
        return this.avatarBorder;
    }
    
    @Override
    public ImageModel getAvatarLarge() {
        try {
            if (this.avatarLarge == null && !TextUtils.isEmpty((CharSequence)this.mAvatarLargeStr)) {
                this.avatarLarge = (ImageModel)new Gson().LIZ(this.mAvatarLargeStr, (Class)ImageModel.class);
            }
            return this.avatarLarge;
        }
        catch (final Exception ex) {
            return this.avatarLarge;
        }
    }
    
    @Override
    public ImageModel getAvatarMedium() {
        try {
            if (this.avatarMedium == null && !TextUtils.isEmpty((CharSequence)this.mAvatarMediumStr)) {
                this.avatarMedium = (ImageModel)new Gson().LIZ(this.mAvatarMediumStr, (Class)ImageModel.class);
            }
            return this.avatarMedium;
        }
        catch (final Exception ex) {
            return this.avatarMedium;
        }
    }
    
    @Override
    public ImageModel getAvatarThumb() {
        try {
            if (this.avatarThumb == null && !TextUtils.isEmpty((CharSequence)this.mAvatarThumbStr)) {
                this.avatarThumb = (ImageModel)new Gson().LIZ(this.mAvatarThumbStr, (Class)ImageModel.class);
            }
            return this.avatarThumb;
        }
        catch (final Exception ex) {
            return this.avatarThumb;
        }
    }
    
    @Override
    public String getBackgroundImgUrl() {
        return this.backgroundImgUrl;
    }
    
    public List<BadgeStruct> getBadgeList() {
        return this.badgeList;
    }
    
    public BorderInfo getBorder() {
        return this.border;
    }
    
    public List<BorderInfo> getBorders() {
        return this.borders;
    }
    
    public ComboBadgeInfo getComboBadgeInfo() {
        return this.comboBadgeInfo;
    }
    
    @Override
    public long getCreateTime() {
        return this.createTime;
    }
    
    public String getDisplayId() {
        return this.username;
    }
    
    @Override
    public long getFanTicketCount() {
        return this.fanTicketCount;
    }
    
    public FansClubMember getFansClub() {
        return this.fansClub;
    }
    
    @Override
    public FollowInfo getFollowInfo() {
        return this.followInfo;
    }
    
    public FraternityInfo getFraternityInfo() {
        return this.fraternityInfo;
    }
    
    @Override
    public long getId() {
        return this.id;
    }
    
    public String getIdStr() {
        if (TextUtils.isEmpty((CharSequence)this.idStr)) {
            return String.valueOf(this.id);
        }
        return this.idStr;
    }
    
    public int getLinkMicStats() {
        return this.linkMicStats;
    }
    
    @Override
    public long getLiveRoomId() {
        final OwnRoom ownRoom = this.ownRoom;
        if (ownRoom == null) {
            return 0L;
        }
        if (ownRoom.LIZ == null || ownRoom.LIZ.size() == 0) {
            return 0L;
        }
        return ownRoom.LIZ.get(0);
    }
    
    public String getLogPb() {
        return this.logPb;
    }
    
    public ImageModel getMedal() {
        return this.medal;
    }
    
    @Override
    public long getModifyTime() {
        return this.modifyTime;
    }
    
    @Override
    public List<ImageModel> getNewUserBadges() {
        final List<ImageModel> newUserBadges = this.newUserBadges;
        if (newUserBadges != null && !newUserBadges.isEmpty()) {
            return this.newUserBadges;
        }
        return this.userBadges;
    }
    
    public String getNickName() {
        return this.nickName;
    }
    
    public NobleLevelInfo getNobleLevelInfo() {
        return this.nobleLevelInfo;
    }
    
    @Override
    public OwnRoom getOwnRoom() {
        return this.ownRoom;
    }
    
    public long getPayScores() {
        return this.payScores;
    }
    
    public ImageModel getPersonalCard() {
        return this.personalCard;
    }
    
    public String getRequestId() {
        return this.requestId;
    }
    
    public ActivityRewardInfo getRewardInfo() {
        return this.rewardInfo;
    }
    
    public String getScmLabel() {
        return this.scmLabel;
    }
    
    @Override
    public String getSecUid() {
        return this.secUid;
    }
    
    @Override
    public int getSecret() {
        return this.secret;
    }
    
    @Override
    public String getShareQrcodeUri() {
        return this.shareQrcodeUri;
    }
    
    public String getSpecialId() {
        return this.specialId;
    }
    
    @Override
    public int getStatus() {
        return this.status;
    }
    
    @Override
    public SubscribeInfo getSubscribeInfo() {
        return this.subscribeInfo;
    }
    
    @Override
    public List<User> getTopFans() {
        return this.topFans;
    }
    
    @Override
    public int getTopVipNo() {
        return this.topVipNo;
    }
    
    @Override
    public UserAttr getUserAttr() {
        return this.userAttr;
    }
    
    @Override
    public List<ImageModel> getUserBadges() {
        return this.userBadges;
    }
    
    public UserHonor getUserHonor() {
        return this.userHonor;
    }
    
    public int getUserRole() {
        return this.userRole;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getVerifiedContent() {
        return this.verifiedContent;
    }
    
    @Override
    public String getVerifiedReason() {
        return this.verifiedReason;
    }
    
    @Override
    public int hashCode() {
        final String nickName = this.nickName;
        int hashCode = 0;
        int hashCode2;
        if (nickName != null) {
            hashCode2 = nickName.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String signature = this.signature;
        int hashCode3;
        if (signature != null) {
            hashCode3 = signature.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final long id = this.id;
        final int n = (int)(id ^ id >>> 32);
        final long createTime = this.createTime;
        final int n2 = (int)(createTime ^ createTime >>> 32);
        final ImageModel avatarThumb = this.avatarThumb;
        int hashCode4;
        if (avatarThumb != null) {
            hashCode4 = avatarThumb.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final ImageModel avatarMedium = this.avatarMedium;
        int hashCode5;
        if (avatarMedium != null) {
            hashCode5 = avatarMedium.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final ImageModel avatarLarge = this.avatarLarge;
        int hashCode6;
        if (avatarLarge != null) {
            hashCode6 = avatarLarge.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final List<User> topFans = this.topFans;
        int hashCode7;
        if (topFans != null) {
            hashCode7 = topFans.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final String idStr = this.idStr;
        int hashCode8;
        if (idStr != null) {
            hashCode8 = idStr.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final long fanTicketCount = this.fanTicketCount;
        final int n3 = (int)(fanTicketCount ^ fanTicketCount >>> 32);
        final int isVerified = this.isVerified ? 1 : 0;
        final String verifiedReason = this.verifiedReason;
        int hashCode9;
        if (verifiedReason != null) {
            hashCode9 = verifiedReason.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final int topVipNo = this.topVipNo;
        final UserHonor userHonor = this.userHonor;
        int hashCode10;
        if (userHonor != null) {
            hashCode10 = userHonor.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final AnchorLevel anchorLevel = this.anchorLevel;
        int hashCode11;
        if (anchorLevel != null) {
            hashCode11 = anchorLevel.hashCode();
        }
        else {
            hashCode11 = 0;
        }
        final List<ImageModel> userBadges = this.userBadges;
        int hashCode12;
        if (userBadges != null) {
            hashCode12 = userBadges.hashCode();
        }
        else {
            hashCode12 = 0;
        }
        final List<ImageModel> newUserBadges = this.newUserBadges;
        int hashCode13;
        if (newUserBadges != null) {
            hashCode13 = newUserBadges.hashCode();
        }
        else {
            hashCode13 = 0;
        }
        final String mAvatarThumbStr = this.mAvatarThumbStr;
        int hashCode14;
        if (mAvatarThumbStr != null) {
            hashCode14 = mAvatarThumbStr.hashCode();
        }
        else {
            hashCode14 = 0;
        }
        final String mAvatarMediumStr = this.mAvatarMediumStr;
        int hashCode15;
        if (mAvatarMediumStr != null) {
            hashCode15 = mAvatarMediumStr.hashCode();
        }
        else {
            hashCode15 = 0;
        }
        final String mAvatarLargeStr = this.mAvatarLargeStr;
        int hashCode16;
        if (mAvatarLargeStr != null) {
            hashCode16 = mAvatarLargeStr.hashCode();
        }
        else {
            hashCode16 = 0;
        }
        final int enableShowCommerceSale = this.enableShowCommerceSale ? 1 : 0;
        final String backgroundImgUrl = this.backgroundImgUrl;
        int hashCode17;
        if (backgroundImgUrl != null) {
            hashCode17 = backgroundImgUrl.hashCode();
        }
        else {
            hashCode17 = 0;
        }
        final int status = this.status;
        final long modifyTime = this.modifyTime;
        final int n4 = (int)(modifyTime ^ modifyTime >>> 32);
        final int secret = this.secret;
        final String shareQrcodeUri = this.shareQrcodeUri;
        int hashCode18;
        if (shareQrcodeUri != null) {
            hashCode18 = shareQrcodeUri.hashCode();
        }
        else {
            hashCode18 = 0;
        }
        final FollowInfo followInfo = this.followInfo;
        int hashCode19;
        if (followInfo != null) {
            hashCode19 = followInfo.hashCode();
        }
        else {
            hashCode19 = 0;
        }
        final UserAttr userAttr = this.userAttr;
        int hashCode20;
        if (userAttr != null) {
            hashCode20 = userAttr.hashCode();
        }
        else {
            hashCode20 = 0;
        }
        final AnchorInfo anchorInfo = this.anchorInfo;
        if (anchorInfo != null) {
            hashCode = anchorInfo.hashCode();
        }
        return (((((((((((((((((((((((((((hashCode2 * 31 + hashCode3) * 31 + n) * 31 + n2) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + n3) * 31 + isVerified) * 31 + hashCode9) * 31 + topVipNo) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + enableShowCommerceSale) * 31 + hashCode17) * 31 + status) * 31 + n4) * 31 + secret) * 31 + hashCode18) * 31 + hashCode19) * 31 + hashCode20) * 31 + hashCode;
    }
    
    public void initWith(final 0W5 0w5) {
        this.enableShowCommerceSale = 0w5.isEnableShowCommerceSale();
        this.fanTicketCount = 0w5.getFanTicketCount();
        this.avatarThumb = 0w5.getAvatarThumb();
        this.avatarMedium = 0w5.getAvatarMedium();
        this.avatarLarge = 0w5.getAvatarLarge();
        if (0w5 instanceof User) {
            this.nickName = ((User)0w5).nickName;
        }
        this.signature = 0w5.getAutoGraph();
        this.id = 0w5.getId();
        final List<User> topFans = 0w5.getTopFans();
        final List<ImageModel> list = null;
        ArrayList topFans2;
        if (topFans != null) {
            topFans2 = new ArrayList((Collection<? extends E>)0w5.getTopFans());
        }
        else {
            topFans2 = null;
        }
        this.topFans = topFans2;
        this.isVerified = 0w5.isVerified();
        this.verifiedReason = 0w5.getVerifiedReason();
        this.topVipNo = 0w5.getTopVipNo();
        final Gmd userHonor = 0w5.getUserHonor();
        UserHonor userHonor2;
        if (userHonor == null) {
            userHonor2 = null;
        }
        else if (userHonor instanceof UserHonor) {
            final Gson gson = new Gson();
            userHonor2 = (UserHonor)gson.LIZ(gson.LIZIZ((Object)userHonor), (Class)UserHonor.class);
        }
        else {
            final UserHonor userHonor3 = new UserHonor();
            userHonor3.LIZ = userHonor.LIZ();
            userHonor3.LIZIZ = userHonor.LIZIZ();
            userHonor3.LIZJ = userHonor.LIZJ();
            userHonor3.LIZLLL = userHonor.LIZLLL();
            userHonor3.LJ = userHonor.LJ();
            userHonor3.LJFF = userHonor.LJFF();
            userHonor3.LJI = userHonor.LJI();
            userHonor3.LJII = userHonor.LJIIIZ();
            userHonor3.LJIIIIZZ = userHonor.LJIIJ();
            userHonor3.LJIIIZ = userHonor.LJIILJJIL();
            userHonor3.LJIIL = userHonor.LJIIJJI();
            userHonor3.LJIIJ = userHonor.LJIIL();
            userHonor3.LJIIJJI = userHonor.LJIILIIL();
            List ljiiliil;
            if (userHonor.LJIILL() != null) {
                ljiiliil = new ArrayList(userHonor.LJIILL());
            }
            else {
                ljiiliil = null;
            }
            userHonor3.LJIILIIL = ljiiliil;
            userHonor3.LJIILJJIL = userHonor.LJIILLIIL();
            userHonor3.LJIILL = userHonor.LJII();
            userHonor3.LJIILLIIL = userHonor.LJIIIIZZ();
            userHonor3.LJIIZILJ = userHonor.LJIIZILJ();
            userHonor3.LJIJ = userHonor.LJIJ();
            userHonor2 = userHonor3;
        }
        this.userHonor = userHonor2;
        final GPr anchorLevel = 0w5.getAnchorLevel();
        AnchorLevel anchorLevel2;
        if (anchorLevel == null) {
            anchorLevel2 = null;
        }
        else if (anchorLevel instanceof AnchorLevel) {
            anchorLevel2 = (AnchorLevel)anchorLevel;
        }
        else {
            anchorLevel2 = new AnchorLevel();
            anchorLevel2.LIZ = anchorLevel.LIZ();
            anchorLevel2.LIZIZ = anchorLevel.LIZIZ();
            anchorLevel2.LIZJ = anchorLevel.LIZJ();
            anchorLevel2.LIZLLL = anchorLevel.LIZLLL();
            anchorLevel2.LJ = anchorLevel.LJ();
            anchorLevel2.LJFF = anchorLevel.LJFF();
            anchorLevel2.LJI = anchorLevel.LJI();
            anchorLevel2.LJII = anchorLevel.LJII();
            anchorLevel2.LJIIIIZZ = anchorLevel.LJIIIIZZ();
            anchorLevel2.LJIIIZ = anchorLevel.LJIIIZ();
            anchorLevel2.LJIIJ = anchorLevel.LJIIJ();
            anchorLevel2.LJIIJJI = anchorLevel.LJIIJJI();
            anchorLevel2.LJIIL = anchorLevel.LJIIL();
        }
        this.anchorLevel = anchorLevel2;
        this.createTime = 0w5.getCreateTime();
        this.ownRoom = 0w5.getOwnRoom();
        List<ImageModel> userBadges;
        if (0w5.getUserBadges() != null) {
            userBadges = new ArrayList<ImageModel>(0w5.getUserBadges());
        }
        else {
            userBadges = null;
        }
        this.userBadges = userBadges;
        List<ImageModel> newUserBadges = list;
        if (0w5.getNewUserBadges() != null) {
            newUserBadges = new ArrayList<ImageModel>(0w5.getNewUserBadges());
        }
        this.newUserBadges = newUserBadges;
        this.backgroundImgUrl = 0w5.getBackgroundImgUrl();
        this.status = 0w5.getStatus();
        this.modifyTime = 0w5.getModifyTime();
        this.secret = 0w5.getSecret();
        this.shareQrcodeUri = 0w5.getShareQrcodeUri();
        this.followInfo = 0w5.getFollowInfo();
        this.userAttr = 0w5.getUserAttr();
        this.anchorInfo = 0w5.getAnchorInfo();
        this.authenticationInfo = 0w5.getAuthenticationInfo();
    }
    
    public boolean isAnchorHasSubQualification() {
        final SubscribeInfo subscribeInfo = this.subscribeInfo;
        return subscribeInfo != null && subscribeInfo.isAnchorQualified();
    }
    
    public boolean isEnableCarManagement() {
        return this.enableCarManagementPermission;
    }
    
    @Override
    public boolean isEnableShowCommerceSale() {
        return this.enableShowCommerceSale;
    }
    
    public boolean isFollowing() {
        final FollowInfo followInfo = this.followInfo;
        return followInfo != null && (followInfo.getFollowStatus() == 2L || this.followInfo.getFollowStatus() == 1L);
    }
    
    public boolean isSubscribed() {
        final SubscribeInfo subscribeInfo = this.subscribeInfo;
        return subscribeInfo != null && subscribeInfo.isAnchorQualified() && this.subscribeInfo.isSubscribed();
    }
    
    @Override
    public boolean isVerified() {
        return this.isVerified;
    }
    
    public boolean isWithCommercePermission() {
        return this.isEnableShowCommerceSale();
    }
    
    public void setAVatarMediumStr(final String mAvatarMediumStr) {
        this.mAvatarMediumStr = mAvatarMediumStr;
    }
    
    public void setAnchorInfo(final AnchorInfo anchorInfo) {
        this.anchorInfo = anchorInfo;
    }
    
    public void setAnchorLevel(final AnchorLevel anchorLevel) {
        this.anchorLevel = anchorLevel;
    }
    
    public void setAuthenticationInfo(final AuthenticationInfo authenticationInfo) {
        this.authenticationInfo = authenticationInfo;
    }
    
    public void setAuthorInfo(final Author authorInfo) {
        this.authorInfo = authorInfo;
    }
    
    public void setAvatarBorder(final ImageModel avatarBorder) {
        this.avatarBorder = avatarBorder;
    }
    
    public void setAvatarLarge(final ImageModel avatarLarge) {
        this.avatarLarge = avatarLarge;
    }
    
    public void setAvatarLargeStr(final String mAvatarLargeStr) {
        this.mAvatarLargeStr = mAvatarLargeStr;
    }
    
    public void setAvatarMedium(final ImageModel avatarMedium) {
        this.avatarMedium = avatarMedium;
    }
    
    public void setAvatarThumb(final ImageModel avatarThumb) {
        this.avatarThumb = avatarThumb;
    }
    
    public void setAvatarThumbStr(final String mAvatarThumbStr) {
        this.mAvatarThumbStr = mAvatarThumbStr;
    }
    
    public void setBackgroundImgUrl(final String backgroundImgUrl) {
        this.backgroundImgUrl = backgroundImgUrl;
    }
    
    public void setBadgeList(final List<BadgeStruct> badgeList) {
        this.badgeList = badgeList;
    }
    
    public void setBorder(final BorderInfo border) {
        this.border = border;
    }
    
    public void setCreateTime(final long createTime) {
        this.createTime = createTime;
    }
    
    public void setDisplayId(final String username) {
        this.username = username;
    }
    
    public void setEnableShowCommerceSale(final boolean enableShowCommerceSale) {
        this.enableShowCommerceSale = enableShowCommerceSale;
    }
    
    public void setFanTicketCount(final long fanTicketCount) {
        this.fanTicketCount = fanTicketCount;
    }
    
    public void setFansClub(final FansClubMember fansClub) {
        this.fansClub = fansClub;
    }
    
    public void setFollowInfo(final FollowInfo followInfo) {
        this.followInfo = followInfo;
    }
    
    @Override
    public void setFollowStatus(final int n) {
        final FollowInfo followInfo = this.followInfo;
        if (followInfo != null) {
            followInfo.setFollowStatus(n);
        }
    }
    
    public void setFraternityInfo(final FraternityInfo fraternityInfo) {
        this.fraternityInfo = fraternityInfo;
    }
    
    public void setId(final long id) {
        this.id = id;
    }
    
    public void setIdStr(final String idStr) {
        this.idStr = idStr;
    }
    
    public void setLogPb(final String logPb) {
        this.logPb = logPb;
    }
    
    public void setMedal(final ImageModel medal) {
        this.medal = medal;
    }
    
    public void setModifyTime(final long modifyTime) {
        this.modifyTime = modifyTime;
    }
    
    public void setNewUserBadges(final List<ImageModel> newUserBadges) {
        this.newUserBadges = newUserBadges;
    }
    
    public void setNickName(final String nickName) {
        this.nickName = nickName;
    }
    
    public void setNobleLevelInfo(final NobleLevelInfo nobleLevelInfo) {
        this.nobleLevelInfo = nobleLevelInfo;
    }
    
    public void setPayScores(final long payScores) {
        this.payScores = payScores;
    }
    
    public void setPersonalCard(final ImageModel personalCard) {
        this.personalCard = personalCard;
    }
    
    public void setRequestId(final String requestId) {
        this.requestId = requestId;
    }
    
    public void setScmLabel(final String scmLabel) {
        this.scmLabel = scmLabel;
    }
    
    public void setSecUid(final String secUid) {
        this.secUid = secUid;
    }
    
    public void setSecret(final int secret) {
        this.secret = secret;
    }
    
    public void setShareQrcodeUri(final String shareQrcodeUri) {
        this.shareQrcodeUri = shareQrcodeUri;
    }
    
    public void setSignature(final String signature) {
        this.signature = signature;
    }
    
    public void setSpecialId(final String specialId) {
        this.specialId = specialId;
    }
    
    public void setStatus(final int status) {
        this.status = status;
    }
    
    public void setSubscribeInfo(final SubscribeInfo subscribeInfo) {
        this.subscribeInfo = subscribeInfo;
    }
    
    public void setSubscribeStatus(final boolean subscribed) {
        final SubscribeInfo subscribeInfo = this.subscribeInfo;
        if (subscribeInfo != null) {
            subscribeInfo.setSubscribed(subscribed);
        }
    }
    
    public void setTopFans(final List<User> topFans) {
        this.topFans = topFans;
    }
    
    public void setTopVipNo(final int topVipNo) {
        this.topVipNo = topVipNo;
    }
    
    @Override
    public void setUserAttr(final UserAttr userAttr) {
        this.userAttr = userAttr;
    }
    
    public void setUserBadges(final List<ImageModel> userBadges) {
        this.userBadges = userBadges;
    }
    
    public void setUserHonor(final UserHonor userHonor) {
        this.userHonor = userHonor;
    }
    
    public void setUserRole(final int userRole) {
        this.userRole = userRole;
    }
    
    public void setVerified(final boolean isVerified) {
        this.isVerified = isVerified;
    }
    
    public void setVerifiedContent(final String verifiedContent) {
        this.verifiedContent = verifiedContent;
    }
    
    public void setVerifiedReason(final String verifiedReason) {
        this.verifiedReason = verifiedReason;
    }
    
    public void setWithCommercePermission(final boolean enableShowCommerceSale) {
        this.setEnableShowCommerceSale(enableShowCommerceSale);
    }
    
    public static class ComboBadgeInfo
    {
        @c(LIZ = "icon")
        public ImageModel LIZ;
        @c(LIZ = "combo_count")
        public long LIZIZ;
        
        static {
            Covode.recordClassIndex(4976);
        }
    }
    
    public static class OwnRoom
    {
        @c(LIZ = "room_ids")
        public List<Long> LIZ;
        
        static {
            Covode.recordClassIndex(4977);
        }
    }
}
