// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._ActivityRewardInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Author_ProtoDecoder;
import com.bytedance.android.livesdk.model._AnchorLevel_ProtoDecoder;
import com.bytedance.android.livesdk.model._AnchorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserAttr_ProtoDecoder;
import com.bytedance.android.livesdk.model._FansClubMember_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserHonor_ProtoDecoder;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoDecoder;
import X.0Tb;
import com.bytedance.android.livesdk.model._AuthenticationInfo_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _User_ProtoDecoder implements 0TU<User>
{
    static {
        Covode.recordClassIndex(4991);
    }
    
    public static User LIZ(final 0Ta 0Ta) {
        final User user = new User();
        user.topFans = new ArrayList<User>();
        user.userBadges = new ArrayList<ImageModel>();
        user.commerceWebcastConfigIds = new ArrayList<Long>();
        user.borders = new ArrayList<BorderInfo>();
        user.badgeList = new ArrayList<BadgeStruct>();
        user.mediaBadgeImageList = new ArrayList<ImageModel>();
        user.newUserBadges = new ArrayList<ImageModel>();
        user.upcomingEventList = new ArrayList<LiveEventInfo>();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 3) {
                    if (liziz != 5) {
                        if (liziz == 52) {
                            user.personalCard = _ImageModel_ProtoDecoder.LIZ(0Ta);
                            continue;
                        }
                        if (liziz == 53) {
                            user.authenticationInfo = _AuthenticationInfo_ProtoDecoder.LIZ(0Ta);
                            continue;
                        }
                        if (liziz == 1012) {
                            user.avatarJpg = _ImageModel_ProtoDecoder.LIZ(0Ta);
                            continue;
                        }
                        if (liziz == 1013) {
                            user.backgroundImgUrl = 0Ta.LIZLLL();
                            continue;
                        }
                        if (liziz == 1023) {
                            user.foldStrangerChat = 0Tb.LIZ(0Ta);
                            continue;
                        }
                        if (liziz == 1024) {
                            user.followStatus = 0Tb.LIZIZ(0Ta);
                            continue;
                        }
                        switch (liziz) {
                            default: {
                                switch (liziz) {
                                    default: {
                                        switch (liziz) {
                                            default: {
                                                switch (liziz) {
                                                    default: {
                                                        switch (liziz) {
                                                            default: {
                                                                switch (liziz) {
                                                                    default: {
                                                                        switch (liziz) {
                                                                            default: {
                                                                                0Tb.LIZJ(0Ta);
                                                                                continue;
                                                                            }
                                                                            case 1027: {
                                                                                user.ichatRestrictType = 0Ta.LJ();
                                                                                continue;
                                                                            }
                                                                            case 1028: {
                                                                                user.idStr = 0Ta.LIZLLL();
                                                                                continue;
                                                                            }
                                                                            case 1029: {
                                                                                user.isFollower = 0Tb.LIZ(0Ta);
                                                                                continue;
                                                                            }
                                                                            case 1030: {
                                                                                user.isFollowing = 0Tb.LIZ(0Ta);
                                                                                continue;
                                                                            }
                                                                            case 1031: {
                                                                                user.needProfileGuide = 0Tb.LIZ(0Ta);
                                                                                continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 1016: {
                                                                        user.blockStatus = 0Ta.LJ();
                                                                        continue;
                                                                    }
                                                                    case 1017: {
                                                                        user.commentRestrict = 0Ta.LJ();
                                                                        continue;
                                                                    }
                                                                    case 1018: {
                                                                        user.constellation = 0Ta.LIZLLL();
                                                                        continue;
                                                                    }
                                                                    case 1019: {
                                                                        user.disableIchat = 0Ta.LJ();
                                                                        continue;
                                                                    }
                                                                    case 1020: {
                                                                        user.enableIchatImg = 0Tb.LIZIZ(0Ta);
                                                                        continue;
                                                                    }
                                                                    case 1021: {
                                                                        user.exp = 0Ta.LJ();
                                                                        continue;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 1002: {
                                                                user.allowFindByContacts = 0Tb.LIZ(0Ta);
                                                                continue;
                                                            }
                                                            case 1003: {
                                                                user.allowOthersDownloadVideo = 0Tb.LIZ(0Ta);
                                                                continue;
                                                            }
                                                            case 1004: {
                                                                user.allowOthersDownloadWhenSharingVideo = 0Tb.LIZ(0Ta);
                                                                continue;
                                                            }
                                                            case 1005: {
                                                                user.allowShareShowProfile = 0Tb.LIZ(0Ta);
                                                                continue;
                                                            }
                                                            case 1006: {
                                                                user.allowShowInGossip = 0Tb.LIZ(0Ta);
                                                                continue;
                                                            }
                                                            case 1007: {
                                                                user.allowShowMyAction = 0Tb.LIZ(0Ta);
                                                                continue;
                                                            }
                                                            case 1008: {
                                                                user.allowStrangeComment = 0Tb.LIZ(0Ta);
                                                                continue;
                                                            }
                                                            case 1009: {
                                                                user.allowUnfollowerComment = 0Tb.LIZ(0Ta);
                                                                continue;
                                                            }
                                                            case 1010: {
                                                                user.allowUseLinkmic = 0Tb.LIZ(0Ta);
                                                                continue;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 60: {
                                                        user.commerceWebcastConfigIds.add(0Tb.LIZIZ(0Ta));
                                                        continue;
                                                    }
                                                    case 61: {
                                                        user.borders.add(_BorderInfo_ProtoDecoder.LIZ(0Ta));
                                                        continue;
                                                    }
                                                    case 62: {
                                                        user.comboBadgeInfo = _User_ComboBadgeInfo_ProtoDecoder.LIZ(0Ta);
                                                        continue;
                                                    }
                                                    case 63: {
                                                        user.subscribeInfo = _SubscribeInfo_ProtoDecoder.LIZ(0Ta);
                                                        continue;
                                                    }
                                                    case 64: {
                                                        user.badgeList.add(_BadgeStruct_ProtoDecoder.LIZ(0Ta));
                                                        continue;
                                                    }
                                                }
                                                break;
                                            }
                                            case 15: {
                                                user.status = 0Ta.LJ();
                                                continue;
                                            }
                                            case 16: {
                                                user.createTime = 0Tb.LIZIZ(0Ta);
                                                continue;
                                            }
                                            case 17: {
                                                user.modifyTime = 0Tb.LIZIZ(0Ta);
                                                continue;
                                            }
                                            case 18: {
                                                user.secret = 0Ta.LJ();
                                                continue;
                                            }
                                            case 19: {
                                                user.shareQrcodeUri = 0Ta.LIZLLL();
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                    case 9: {
                                        user.avatarThumb = _ImageModel_ProtoDecoder.LIZ(0Ta);
                                        continue;
                                    }
                                    case 10: {
                                        user.avatarMedium = _ImageModel_ProtoDecoder.LIZ(0Ta);
                                        continue;
                                    }
                                    case 11: {
                                        user.avatarLarge = _ImageModel_ProtoDecoder.LIZ(0Ta);
                                        continue;
                                    }
                                    case 12: {
                                        user.isVerified = 0Tb.LIZ(0Ta);
                                        continue;
                                    }
                                }
                                break;
                            }
                            case 22: {
                                user.followInfo = _FollowInfo_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 23: {
                                user.userHonor = _UserHonor_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 24: {
                                user.fansClub = _FansClubMember_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 25: {
                                user.border = _BorderInfo_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 26: {
                                user.specialId = 0Ta.LIZLLL();
                                continue;
                            }
                            case 27: {
                                user.avatarBorder = _ImageModel_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 28: {
                                user.medal = _ImageModel_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 29: {
                                user.userBadges.add(_ImageModel_ProtoDecoder.LIZ(0Ta));
                                continue;
                            }
                            case 30: {
                                user.newUserBadges.add(_ImageModel_ProtoDecoder.LIZ(0Ta));
                                continue;
                            }
                            case 31: {
                                user.topVipNo = (int)0Tb.LIZIZ(0Ta);
                                continue;
                            }
                            case 32: {
                                user.userAttr = _UserAttr_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 33: {
                                user.ownRoom = _User_OwnRoom_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 34: {
                                user.payScore = 0Tb.LIZIZ(0Ta);
                                continue;
                            }
                            case 35: {
                                user.fanTicketCount = 0Tb.LIZIZ(0Ta);
                                continue;
                            }
                            case 36: {
                                user.anchorInfo = _AnchorInfo_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 37: {
                                user.linkMicStats = 0Ta.LJ();
                                continue;
                            }
                            case 38: {
                                user.username = 0Ta.LIZLLL();
                                continue;
                            }
                            case 39: {
                                user.enableShowCommerceSale = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 40: {
                                user.withFusionShopEntry = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 41: {
                                user.payScores = 0Tb.LIZIZ(0Ta);
                                continue;
                            }
                            case 42: {
                                user.anchorLevel = _AnchorLevel_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 43: {
                                user.verifiedContent = 0Ta.LIZLLL();
                                continue;
                            }
                            case 44: {
                                user.authorInfo = _Author_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 45: {
                                user.topFans.add(LIZ(0Ta));
                                continue;
                            }
                            case 46: {
                                user.secUid = 0Ta.LIZLLL();
                                continue;
                            }
                            case 47: {
                                user.userRole = 0Ta.LJ();
                                continue;
                            }
                            case 49: {
                                user.rewardInfo = _ActivityRewardInfo_ProtoDecoder.LIZ(0Ta);
                                continue;
                            }
                            case 57: {
                                user.mediaBadgeImageList.add(_ImageModel_ProtoDecoder.LIZ(0Ta));
                                continue;
                            }
                            case 1033: {
                                user.pushCommentStatus = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 1034: {
                                user.pushDigg = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 1035: {
                                user.pushFollow = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 1036: {
                                user.pushFriendAction = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 1037: {
                                user.pushIchat = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 1038: {
                                user.pushStatus = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 1039: {
                                user.pushVideoPost = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 1040: {
                                user.pushVideoRecommend = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 1043: {
                                user.verifiedReason = 0Ta.LIZLLL();
                                continue;
                            }
                            case 1044: {
                                user.enableCarManagementPermission = 0Tb.LIZ(0Ta);
                                continue;
                            }
                            case 1045: {
                                user.upcomingEventList.add(_LiveEventInfo_ProtoDecoder.LIZ(0Ta));
                                continue;
                            }
                            case 1046: {
                                user.scmLabel = 0Ta.LIZLLL();
                                continue;
                            }
                            case 5: {
                                break;
                            }
                        }
                    }
                    user.signature = 0Ta.LIZLLL();
                }
                else {
                    user.nickName = 0Ta.LIZLLL();
                }
            }
            else {
                user.id = 0Tb.LIZIZ(0Ta);
            }
        }
        0Ta.LIZ(liz);
        return user;
    }
}
