// 
// Decompiled by Procyon v0.6.0
// 

package beancopy;

import com.ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList;
import X.VhE;
import X.Vol;
import X.VuU;
import X.VlK;
import X.VuQ;
import X.VUk;
import X.Vg5;
import X.Vdy;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import X.Vsn;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import X.Vu9;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import X.Vfq;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import X.Ve7;
import com.ss.android.ugc.aweme.profile.model.UnReadVideoInfo;
import X.VTv;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import X.Vl2;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus$VideoMuteInfo;
import X.VUE;
import com.tiktok.plugin.client.ClientSettings$Rewind;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import X.Voe;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import X.Vlb;
import com.ss.android.ugc.aweme.feed.model.UserProfileInitInfo;
import X.VTm;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.PlayAddress;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import X.Vf1;
import com.ss.android.ugc.aweme.feed.model.UpvotePreloadStruct;
import X.JHL;
import X.Vl8;
import com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import X.Vl5;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import X.Vbe;
import X.9M9;
import X.Veu;
import com.ss.android.ugc.aweme.feed.model.AwemeActivityContent;
import X.VbP;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import X.VcV;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import X.VgN;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import X.VhM;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import X.VgK;
import X.2dm;
import X.Vsr;
import com.ss.android.ugc.aweme.feed.model.ShareToStoryStruct;
import X.JHI;
import com.ss.android.ugc.aweme.feed.model.live.ShareStruct;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import X.VuL;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import X.VcS;
import com.ss.android.ugc.aweme.feed.model.RelationLabelNew;
import X.VgV;
import com.ss.android.ugc.aweme.feed.model.RecReasons;
import X.VUM;
import com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import X.VbM;
import com.ss.android.ugc.aweme.profile.model.QuickShopInfo;
import X.VbJ;
import com.ss.android.ugc.aweme.profile.model.QuickShopSecondFloorInfo;
import X.VbG;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import X.Vlm;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import X.VeA;
import com.ss.android.ugc.aweme.feed.model.Preload;
import X.Vly;
import com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct;
import X.VTs;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import X.VlH;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import X.VaC;
import com.ss.android.ugc.aweme.poi.PoiAddressInfo;
import X.VlE;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import X.VeS;
import com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import X.Vg2;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import X.VeY;
import X.C8l;
import X.Vel;
import X.ODk;
import X.Vex;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import X.VaU;
import X.AiW;
import X.Voc;
import X.AgP;
import X.Vaq;
import X.Ai4;
import X.VVG;
import X.Ai7;
import X.VVD;
import X.Byv;
import X.VuG;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import X.VTp;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import X.VdS;
import com.ss.android.ugc.aweme.music.model.Dsp;
import X.VfJ;
import com.ss.android.ugc.aweme.music.model.MusicChorusInfo;
import X.VUh;
import com.ss.android.ugc.aweme.music.model.MusicAvatar;
import X.VfG;
import com.ss.android.ugc.aweme.feed.model.MixStruct;
import X.VlX;
import com.ss.android.ugc.aweme.feed.model.MixStatusStruct;
import X.VUe;
import com.ss.android.ugc.aweme.feed.model.MixStatisStruct;
import X.VhJ;
import X.P6n;
import X.Vlp;
import X.2WQ;
import X.VZx;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import X.Veo;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import X.VfA;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import X.VgE;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import X.VdV;
import com.ss.android.ugc.aweme.feed.model.MaskPopWindow;
import X.Vbk;
import com.ss.android.ugc.aweme.feed.model.MaskExtraModule;
import X.Vbn;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import X.VUP;
import com.ss.android.ugc.aweme.profile.model.HonorStruct;
import X.Vcn;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import X.Ver;
import com.ss.android.ugc.aweme.profile.model.LinkUserInfoStruct;
import X.VUY;
import X.3kx;
import X.VdG;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import X.VUV;
import com.ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import X.VV4;
import com.ss.android.ugc.aweme.feed.model.GroupIdListStruct;
import X.VU5;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import X.Vfk;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import X.Vle;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import X.Vcw;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import X.VdM;
import com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;
import X.VeD;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import X.Vls;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import X.VZu;
import com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord;
import X.VeM;
import com.ss.android.ugc.aweme.feed.model.GameInfo;
import X.VUS;
import com.ss.android.ugc.aweme.feed.model.live.FansStruct;
import X.VaR;
import com.ss.android.ugc.aweme.feed.model.Extra;
import X.VUn;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import X.VbD;
import com.ss.android.ugc.aweme.profile.model.EffectArtistDetail;
import X.JHF;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import X.VeV;
import com.ss.android.ugc.aweme.feed.model.DuetInfo;
import X.VUB;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import X.VV1;
import com.ss.android.ugc.aweme.feed.model.DescendantsModel;
import X.VU2;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import X.VUb;
import X.BzS;
import X.VbA;
import X.BzL;
import X.VuJ;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceRerankInfo;
import X.VU8;
import X.Nps;
import X.Va0;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import X.Van;
import X.BxG;
import X.Vdu;
import X.P9T;
import X.VdA;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import X.VaX;
import X.3ky;
import X.VUv;
import X.3kr;
import X.VdD;
import com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import X.Vat;
import com.ss.android.ugc.aweme.feed.model.BottomBarModel;
import X.Vcz;
import com.ss.android.ugc.aweme.feed.model.Boost;
import X.VcP;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import X.Vsu;
import com.ss.android.ugc.aweme.feed.model.BannerTip;
import X.VgB;
import com.tiktok.plugin.client.ClientSettings$Stitch;
import com.tiktok.plugin.client.ClientSettings$Duet;
import X.2ob;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import X.Vnm;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import X.VoX;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import X.Vm4;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import X.VlB;
import com.ss.android.ugc.aweme.feed.model.FloatingCardInfo;
import X.ViU;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import X.Veb;
import X.WUD;
import X.Vlv;
import X.3LU;
import X.VgQ;
import com.ss.android.ugc.aweme.feed.model.AnchorInfo;
import X.Vm1;
import com.ss.android.ugc.aweme.feed.model.AwemeActivity;
import X.VbS;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import X.VmJ;
import com.ss.android.ugc.aweme.profile.model.AvatarDecoration;
import X.Vd2;
import X.8su;
import X.Vdb;
import com.ss.android.ugc.aweme.feed.model.Audio;
import X.Vce;
import com.ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import X.VVM;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import X.VbV;
import com.ss.android.ugc.aweme.feed.model.Anchor;
import X.VbY;
import com.ss.android.ugc.aweme.feed.model.AnchorShopLinkStruct;
import X.VVJ;
import com.ss.android.ugc.aweme.feed.model.StoryVideo;
import X.Vgh;
import com.ss.android.ugc.aweme.profile.model.AdCoverTitle;
import X.VVA;
import com.ss.android.ugc.aweme.feed.model.AwemeActivityButton;
import X.VUy;
import X.VoR;
import X.VoJ;
import X.VoO;
import X.VoU;
import X.Von;
import X.VoM;
import X.0H1;
import com.ss.android.ugc.aweme.sticker.data.PollStruct$OptionsBean;
import X.Ve4;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import X.Ve1;
import com.ss.android.ugc.aweme.feed.model.Video;
import X.VuB;
import X.8CD;
import X.Vde;
import X.A2p;
import X.WXu;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import X.ViR;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import X.Vch;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import X.Vlj;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import X.Vbq;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import X.VcY;
import com.ss.android.ugc.aweme.profile.model.User;
import X.VeG;
import com.ss.android.ugc.aweme.profile.model.RelativeUserInfo;
import com.ss.android.ugc.aweme.feed.model.RelationLabelUser;
import X.VgY;
import com.ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import X.Vdh;
import com.ss.android.ugc.aweme.feed.model.RecReasonStruct;
import X.VUJ;
import com.ss.android.ugc.aweme.question.QuestionInfo;
import X.Vge;
import com.ss.android.ugc.aweme.discover.model.Position;
import X.VUs;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import X.Va9;
import com.ss.android.ugc.aweme.profile.model.PlatformInfo;
import X.Va6;
import com.ss.android.ugc.aweme.feed.model.OriginalSound;
import X.Vcb;
import X.O7p;
import X.Va3;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import X.VdP;
import com.ss.android.ugc.aweme.music.model.Music;
import X.VuS;
import com.ss.android.ugc.aweme.music.model.MusicPerformer;
import X.VfD;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import X.VuN;
import X.Plu;
import X.VdJ;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import X.VeP;
import com.ss.android.ugc.aweme.feed.model.MaskPopText;
import X.Vbh;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import X.Vgl;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import X.Vfn;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import X.Vei;
import com.ss.android.ugc.aweme.feed.model.InlineLink;
import X.Vbb;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import X.Vct;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import X.Vdm;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import X.VgH;
import com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial;
import X.Vgb;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import X.VtP;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import X.Vg8;
import com.ss.android.ugc.aweme.feed.model.CommerceConfigData;
import X.VV7;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import X.Vlh;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import X.Vaa;
import com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo;
import X.Vcq;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import X.Vdr;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import X.VuD;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import X.VlU;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import X.Vck;
import X.C0P;
import X.VdY;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import X.Vd5;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import X.VhB;
import X.2NG;
import X.Vaw;
import java.util.Iterator;
import java.util.ArrayList;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import X.VmM;
import java.util.List;
import com.bytedance.covode.number.Covode;

public class ConvertHelp
{
    static {
        Covode.recordClassIndex(1804);
    }
    
    public static List<ACLCommonShare> List$com$ss$ugc$aweme$proto$ACLCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(final List<VmM> list, final List<ACLCommonShare> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<ACLCommonShare>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare((VmM)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<2NG> List$com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$List$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange(final List<Vaw> list, final List<2NG> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<2NG>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange((Vaw)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<AnchorCommonStruct> List$com$ss$ugc$aweme$proto$AnchorCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct(final List<VhB> list, final List<AnchorCommonStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<AnchorCommonStruct>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$AnchorCommonStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct((VhB)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<AnchorPanelAction> List$com$ss$ugc$aweme$proto$AnchorPanelActionStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorPanelAction(final List<Vd5> list, final List<AnchorPanelAction> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<AnchorPanelAction>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$AnchorPanelActionStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorPanelAction((Vd5)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<C0P> List$com$ss$ugc$aweme$proto$AutoCaptionTypeV2$$List$com$ss$android$ugc$aweme$sticker$data$AutocaptionType(final List<VdY> list, final List<C0P> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<C0P>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$AutoCaptionTypeV2$$com$ss$android$ugc$aweme$sticker$data$AutocaptionType((VdY)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<AwemeLabelModel> List$com$ss$ugc$aweme$proto$AwemeLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(final List<Vck> list, final List<AwemeLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<AwemeLabelModel>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel((Vck)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<Aweme> List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(final List<VlU> list, final List<Aweme> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<Aweme>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme((VlU)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<BigThumb> List$com$ss$ugc$aweme$proto$BigThumbV2$$List$com$ss$android$ugc$aweme$feed$model$BigThumb(final List<VuD> list, final List<BigThumb> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<BigThumb>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$BigThumbV2$$com$ss$android$ugc$aweme$feed$model$BigThumb((VuD)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<BitRate> List$com$ss$ugc$aweme$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate(final List<Vdr> list, final List<BitRate> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<BitRate>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate((Vdr)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<MultiImageUrlInfo> List$com$ss$ugc$aweme$proto$BitrateImagePostInfoV2$$List$com$ss$android$ugc$aweme$feed$model$MultiImageUrlInfo(final List<Vcq> list, final List<MultiImageUrlInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<MultiImageUrlInfo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$BitrateImagePostInfoV2$$com$ss$android$ugc$aweme$feed$model$MultiImageUrlInfo((Vcq)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<CaptionItemModel> List$com$ss$ugc$aweme$proto$CaptionStructV2$$List$com$ss$android$ugc$aweme$feed$model$CaptionItemModel(final List<Vaa> list, final List<CaptionItemModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<CaptionItemModel>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$CaptionStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionItemModel((Vaa)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<Challenge> List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge(final List<Vlh> list, final List<Challenge> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<Challenge>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge((Vlh)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<CommerceConfigData> List$com$ss$ugc$aweme$proto$CommerceConfigDataV2$$List$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(final List<VV7> list, final List<CommerceConfigData> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<CommerceConfigData>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData((VV7)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<ExternalMusicInfo> List$com$ss$ugc$aweme$proto$ExternalSongStructV2$$List$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(final List<Vg8> list, final List<ExternalMusicInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<ExternalMusicInfo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo((Vg8)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<FollowerDetail> List$com$ss$ugc$aweme$proto$FollowersDetailV2$$List$com$ss$android$ugc$aweme$profile$model$FollowerDetail(final List<VtP> list, final List<FollowerDetail> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<FollowerDetail>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail((VtP)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<GreenScreenMaterial> List$com$ss$ugc$aweme$proto$GreenScreenMaterialV2$$List$com$ss$android$ugc$aweme$feed$model$GreenScreenMaterial(final List<Vgb> list, final List<GreenScreenMaterial> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<GreenScreenMaterial>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$GreenScreenMaterialV2$$com$ss$android$ugc$aweme$feed$model$GreenScreenMaterial((Vgb)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<AwemeHybridLabelModel> List$com$ss$ugc$aweme$proto$HybridLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel(final List<VgH> list, final List<AwemeHybridLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<AwemeHybridLabelModel>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$HybridLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel((VgH)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<ImageInfo> List$com$ss$ugc$aweme$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo(final List<Vdm> list, final List<ImageInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<ImageInfo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo((Vdm)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<PhotoModeImageUrlModel> List$com$ss$ugc$aweme$proto$ImagePostInfoV2$$List$com$ss$android$ugc$aweme$feed$model$PhotoModeImageUrlModel(final List<Vct> list, final List<PhotoModeImageUrlModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<PhotoModeImageUrlModel>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$ImagePostInfoV2$$com$ss$android$ugc$aweme$feed$model$PhotoModeImageUrlModel((Vct)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<InlineLink> List$com$ss$ugc$aweme$proto$InlineLinkV2$$List$com$ss$android$ugc$aweme$feed$model$InlineLink(final List<Vbb> list, final List<InlineLink> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<InlineLink>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$InlineLinkV2$$com$ss$android$ugc$aweme$feed$model$InlineLink((Vbb)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<InteractStickerStruct> List$com$ss$ugc$aweme$proto$InteractionStickerStructV2$$List$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(final List<Vei> list, final List<InteractStickerStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<InteractStickerStruct>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct((Vei)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<InteractionTagUserInfo> List$com$ss$ugc$aweme$proto$InteractionTagUserInfoV2$$List$com$ss$android$ugc$aweme$feed$model$InteractionTagUserInfo(final List<Vfn> list, final List<InteractionTagUserInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<InteractionTagUserInfo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$InteractionTagUserInfoV2$$com$ss$android$ugc$aweme$feed$model$InteractionTagUserInfo((Vfn)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<LongVideo> List$com$ss$ugc$aweme$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo(final List<Vgl> list, final List<LongVideo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<LongVideo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo((Vgl)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<MaskPopText> List$com$ss$ugc$aweme$proto$MaskPopTextV2$$List$com$ss$android$ugc$aweme$feed$model$MaskPopText(final List<Vbh> list, final List<MaskPopText> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<MaskPopText>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$MaskPopTextV2$$com$ss$android$ugc$aweme$feed$model$MaskPopText((Vbh)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<VideoMaskInfo> List$com$ss$ugc$aweme$proto$MaskStructV2$$List$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo(final List<VeP> list, final List<VideoMaskInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<VideoMaskInfo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$MaskStructV2$$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo((VeP)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<Plu> List$com$ss$ugc$aweme$proto$MatchInfoStructV2$$List$com$ss$android$ugc$aweme$search$caption$MatchInfo(final List<VdJ> list, final List<Plu> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<Plu>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$MatchInfoStructV2$$com$ss$android$ugc$aweme$search$caption$MatchInfo((VdJ)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<MusicOwnerInfo> List$com$ss$ugc$aweme$proto$MusicArtistStructV2$$List$com$ss$android$ugc$aweme$music$model$MusicOwnerInfo(final List<VuN> list, final List<MusicOwnerInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<MusicOwnerInfo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$MusicArtistStructV2$$com$ss$android$ugc$aweme$music$model$MusicOwnerInfo((VuN)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<MusicPerformer> List$com$ss$ugc$aweme$proto$MusicPerformerStructV2$$List$com$ss$android$ugc$aweme$music$model$MusicPerformer(final List<VfD> list, final List<MusicPerformer> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<MusicPerformer>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$MusicPerformerStructV2$$com$ss$android$ugc$aweme$music$model$MusicPerformer((VfD)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<Music> List$com$ss$ugc$aweme$proto$MusicStructV2$$List$com$ss$android$ugc$aweme$music$model$Music(final List<VuS> list, final List<Music> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<Music>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music((VuS)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<MutualUser> List$com$ss$ugc$aweme$proto$MutualUserStructV2$$List$com$ss$android$ugc$aweme$friends$model$MutualUser(final List<VdP> list, final List<MutualUser> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<MutualUser>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$MutualUserStructV2$$com$ss$android$ugc$aweme$friends$model$MutualUser((VdP)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<O7p> List$com$ss$ugc$aweme$proto$OfflineInfoStructV2$$List$com$ss$android$ugc$aweme$commerce$OfflineInfo(final List<Va3> list, final List<O7p> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<O7p>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo((Va3)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<OriginalSound> List$com$ss$ugc$aweme$proto$OriginalSoundStructV2$$List$com$ss$android$ugc$aweme$feed$model$OriginalSound(final List<Vcb> list, final List<OriginalSound> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<OriginalSound>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$OriginalSoundStructV2$$com$ss$android$ugc$aweme$feed$model$OriginalSound((Vcb)iterator.next(), null));
        }
        return list3;
    }
    
    public static PlatformInfo[] List$com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$Arraycom$ss$android$ugc$aweme$profile$model$PlatformInfo(final List<Va6> list, PlatformInfo[] array) {
        if (list == null) {
            return array;
        }
        final boolean empty = list.isEmpty();
        int i = 0;
        if (empty) {
            return new PlatformInfo[0];
        }
        array = new PlatformInfo[list.size()];
        while (i < list.size()) {
            array[i] = com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$com$ss$android$ugc$aweme$profile$model$PlatformInfo((Va6)list.get(i), null);
            ++i;
        }
        return array;
    }
    
    public static List<PoiSubTag> List$com$ss$ugc$aweme$proto$PoiSubTagV2$$List$com$ss$android$ugc$aweme$poi$PoiSubTag(final List<Va9> list, final List<PoiSubTag> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<PoiSubTag>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$PoiSubTagV2$$com$ss$android$ugc$aweme$poi$PoiSubTag((Va9)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<Position> List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(final List<VUs> list, final List<Position> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<Position>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position((VUs)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<QuestionInfo> List$com$ss$ugc$aweme$proto$QuestionInfoV2$$List$com$ss$android$ugc$aweme$question$QuestionInfo(final List<Vge> list, final List<QuestionInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<QuestionInfo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$QuestionInfoV2$$com$ss$android$ugc$aweme$question$QuestionInfo((Vge)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<RecReasonStruct> List$com$ss$ugc$aweme$proto$RecReasonEntry$$List$com$ss$android$ugc$aweme$feed$model$RecReasonStruct(final List<VUJ> list, final List<RecReasonStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<RecReasonStruct>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$RecReasonEntry$$com$ss$android$ugc$aweme$feed$model$RecReasonStruct((VUJ)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<RecommendAwemeItem> List$com$ss$ugc$aweme$proto$RecommendItemStructV2$$List$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(final List<Vdh> list, final List<RecommendAwemeItem> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<RecommendAwemeItem>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem((Vdh)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<RelationLabelUser> List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$feed$model$RelationLabelUser(final List<VgY> list, final List<RelationLabelUser> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<RelationLabelUser>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelUser((VgY)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<RelativeUserInfo> List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(final List<VgY> list, final List<RelativeUserInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<RelativeUserInfo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo((VgY)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<User> List$com$ss$ugc$aweme$proto$SimpleUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$User(final List<VeG> list, final List<User> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<User>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User((VeG)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<SuggestWordStruct> List$com$ss$ugc$aweme$proto$SuggestWordListStructV2$$List$com$ss$android$ugc$aweme$feed$model$search$SuggestWordStruct(final List<VcY> list, final List<SuggestWordStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<SuggestWordStruct>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$SuggestWordListStructV2$$com$ss$android$ugc$aweme$feed$model$search$SuggestWordStruct((VcY)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<WordStruct> List$com$ss$ugc$aweme$proto$SuggestWordStructV2$$List$com$ss$android$ugc$aweme$feed$model$search$WordStruct(final List<Vbq> list, final List<WordStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<WordStruct>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$SuggestWordStructV2$$com$ss$android$ugc$aweme$feed$model$search$WordStruct((Vbq)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<TextExtraStruct> List$com$ss$ugc$aweme$proto$TextExtraStructV2$$List$com$ss$android$ugc$aweme$model$TextExtraStruct(final List<Vlj> list, final List<TextExtraStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<TextExtraStruct>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct((Vlj)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<TtsInfos> List$com$ss$ugc$aweme$proto$TtsAudioStructV2$$List$com$ss$android$ugc$aweme$feed$model$TtsInfos(final List<Vch> list, final List<TtsInfos> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<TtsInfos>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$TtsAudioStructV2$$com$ss$android$ugc$aweme$feed$model$TtsInfos((Vch)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<UrlModel> List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(final List<ViR> list, final List<UrlModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<UrlModel>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel((ViR)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<A2p> List$com$ss$ugc$aweme$proto$UserStructV2$$List$com$ss$android$ugc$aweme$commercialize$model$BrandedContentAccount(final List<WXu> list, final List<A2p> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<A2p>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$commercialize$model$BrandedContentAccount((WXu)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<8CD> List$com$ss$ugc$aweme$proto$UtteranceV2$$List$com$ss$android$ugc$aweme$sticker$data$Utterance(final List<Vde> list, final List<8CD> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<8CD>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$UtteranceV2$$com$ss$android$ugc$aweme$sticker$data$Utterance((Vde)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<Video> List$com$ss$ugc$aweme$proto$VideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$Video(final List<VuB> list, final List<Video> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<Video>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video((VuB)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<AwemeTextLabelModel> List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(final List<Ve1> list, final List<AwemeTextLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<AwemeTextLabelModel>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel((Ve1)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<PollStruct$OptionsBean> List$com$ss$ugc$aweme$proto$VoteOptionStructV2$$List$com$ss$android$ugc$aweme$sticker$data$PollStruct$OptionsBean(final List<Ve4> list, final List<PollStruct$OptionsBean> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<PollStruct$OptionsBean>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$PollStruct$OptionsBean((Ve4)iterator.next(), null));
        }
        return list3;
    }
    
    public static long[] List$java$lang$Long$$ArrayJ(final List<Long> list, long[] array) {
        if (list == null) {
            return array;
        }
        final boolean empty = list.isEmpty();
        int i = 0;
        if (empty) {
            return new long[0];
        }
        array = new long[list.size()];
        while (i < list.size()) {
            array[i] = 0H1.LIZ((Long)list.get(i));
            ++i;
        }
        return array;
    }
    
    public static List<Aweme> List$tiktok$kids$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(final List<VoM> list, final List<Aweme> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<Aweme>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(tiktok$kids$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme((VoM)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<BigThumb> List$tiktok$kids$proto$BigThumbV2$$List$com$ss$android$ugc$aweme$feed$model$BigThumb(final List<Von> list, final List<BigThumb> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<BigThumb>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(tiktok$kids$proto$BigThumbV2$$com$ss$android$ugc$aweme$feed$model$BigThumb((Von)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<BitRate> List$tiktok$kids$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate(final List<VoU> list, final List<BitRate> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<BitRate>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(tiktok$kids$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate((VoU)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<ImageInfo> List$tiktok$kids$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo(final List<VoO> list, final List<ImageInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<ImageInfo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(tiktok$kids$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo((VoO)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<LongVideo> List$tiktok$kids$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo(final List<VoJ> list, final List<LongVideo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<LongVideo>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(tiktok$kids$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo((VoJ)iterator.next(), null));
        }
        return list3;
    }
    
    public static List<UrlModel> List$tiktok$kids$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(final List<VoR> list, final List<UrlModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList<UrlModel>();
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel((VoR)iterator.next(), null));
        }
        return list3;
    }
    
    public static ACLCommonShare com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(final VmM vmM, final ACLCommonShare aclCommonShare) {
        if (vmM == null) {
            return aclCommonShare;
        }
        final ACLCommonShare aclCommonShare2 = new ACLCommonShare();
        aclCommonShare2.code = 0H1.LIZ(vmM.code, aclCommonShare2.code);
        aclCommonShare2.showType = 0H1.LIZ(vmM.show_type, aclCommonShare2.showType);
        String toastMsg;
        if (vmM.toast_msg == null) {
            toastMsg = aclCommonShare2.toastMsg;
        }
        else {
            toastMsg = vmM.toast_msg;
        }
        aclCommonShare2.toastMsg = toastMsg;
        String extra;
        if (vmM.extra == null) {
            extra = aclCommonShare2.extra;
        }
        else {
            extra = vmM.extra;
        }
        aclCommonShare2.extra = extra;
        aclCommonShare2.transcode = 0H1.LIZ(vmM.transcode, aclCommonShare2.transcode);
        aclCommonShare2.mute = 0H1.LIZ(vmM.mute, aclCommonShare2.mute);
        String popupMsg;
        if (vmM.popup_msg == null) {
            popupMsg = aclCommonShare2.popupMsg;
        }
        else {
            popupMsg = vmM.popup_msg;
        }
        aclCommonShare2.popupMsg = popupMsg;
        String platformId;
        if (vmM.platform_id == null) {
            platformId = aclCommonShare2.platformId;
        }
        else {
            platformId = vmM.platform_id;
        }
        aclCommonShare2.platformId = platformId;
        return aclCommonShare2;
    }
    
    public static AwemeActivityButton com$ss$ugc$aweme$proto$ActivityButtonStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivityButton(final VUy vUy, final AwemeActivityButton awemeActivityButton) {
        if (vUy == null) {
            return awemeActivityButton;
        }
        final AwemeActivityButton awemeActivityButton2 = new AwemeActivityButton();
        String label;
        if (vUy.label == null) {
            label = awemeActivityButton2.label;
        }
        else {
            label = vUy.label;
        }
        awemeActivityButton2.label = label;
        String color;
        if (vUy.color == null) {
            color = awemeActivityButton2.color;
        }
        else {
            color = vUy.color;
        }
        awemeActivityButton2.color = color;
        return awemeActivityButton2;
    }
    
    public static 2NG com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange(final Vaw vaw, 2NG 2ng) {
        if (vaw == null) {
            return 2ng;
        }
        2ng = new 2NG();
        2ng.start = 0H1.LIZ(vaw.start, 2ng.start);
        2ng.end = 0H1.LIZ(vaw.end, 2ng.end);
        return 2ng;
    }
    
    public static AdCoverTitle com$ss$ugc$aweme$proto$AdCoverTitleV2$$com$ss$android$ugc$aweme$profile$model$AdCoverTitle(final VVA vva, final AdCoverTitle adCoverTitle) {
        if (vva == null) {
            return adCoverTitle;
        }
        final AdCoverTitle adCoverTitle2 = new AdCoverTitle();
        String title;
        if (vva.title == null) {
            title = adCoverTitle2.title;
        }
        else {
            title = vva.title;
        }
        adCoverTitle2.title = title;
        String webUrl;
        if (vva.web_url == null) {
            webUrl = adCoverTitle2.webUrl;
        }
        else {
            webUrl = vva.web_url;
        }
        adCoverTitle2.webUrl = webUrl;
        return adCoverTitle2;
    }
    
    public static StoryVideo com$ss$ugc$aweme$proto$AdStoryVideoStruct$$com$ss$android$ugc$aweme$feed$model$StoryVideo(final Vgh vgh, StoryVideo storyVideo) {
        if (vgh == null) {
            return storyVideo;
        }
        storyVideo = new StoryVideo();
        storyVideo.awemeType = 0H1.LIZ(vgh.aweme_type, storyVideo.awemeType);
        storyVideo.subVideoList = List$com$ss$ugc$aweme$proto$VideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$Video(vgh.story_videos, storyVideo.subVideoList);
        return storyVideo;
    }
    
    public static AnchorCommonStruct com$ss$ugc$aweme$proto$AnchorCommonStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct(final VhB vhB, final AnchorCommonStruct anchorCommonStruct) {
        if (vhB == null) {
            return anchorCommonStruct;
        }
        final AnchorCommonStruct anchorCommonStruct2 = new AnchorCommonStruct();
        String keyword;
        if (vhB.keyword == null) {
            keyword = anchorCommonStruct2.keyword;
        }
        else {
            keyword = vhB.keyword;
        }
        anchorCommonStruct2.keyword = keyword;
        String url;
        if (vhB.url == null) {
            url = anchorCommonStruct2.url;
        }
        else {
            url = vhB.url;
        }
        anchorCommonStruct2.url = url;
        String language;
        if (vhB.language == null) {
            language = anchorCommonStruct2.language;
        }
        else {
            language = vhB.language;
        }
        anchorCommonStruct2.language = language;
        String schema;
        if (vhB.schema == null) {
            schema = anchorCommonStruct2.schema;
        }
        else {
            schema = vhB.schema;
        }
        anchorCommonStruct2.schema = schema;
        String id;
        if (vhB.id == null) {
            id = anchorCommonStruct2.id;
        }
        else {
            id = vhB.id;
        }
        anchorCommonStruct2.id = id;
        anchorCommonStruct2.type = 0H1.LIZ(vhB.type, anchorCommonStruct2.type);
        anchorCommonStruct2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vhB.icon, anchorCommonStruct2.icon);
        String extra;
        if (vhB.extra == null) {
            extra = anchorCommonStruct2.extra;
        }
        else {
            extra = vhB.extra;
        }
        anchorCommonStruct2.extra = extra;
        String deepLink;
        if (vhB.deep_link == null) {
            deepLink = anchorCommonStruct2.deepLink;
        }
        else {
            deepLink = vhB.deep_link;
        }
        anchorCommonStruct2.deepLink = deepLink;
        String universalLink;
        if (vhB.universal_link == null) {
            universalLink = anchorCommonStruct2.universalLink;
        }
        else {
            universalLink = vhB.universal_link;
        }
        anchorCommonStruct2.universalLink = universalLink;
        anchorCommonStruct2.generalType = 0H1.LIZ(vhB.general_type, anchorCommonStruct2.generalType);
        String logExtra;
        if (vhB.log_extra == null) {
            logExtra = anchorCommonStruct2.logExtra;
        }
        else {
            logExtra = vhB.log_extra;
        }
        anchorCommonStruct2.logExtra = logExtra;
        String description;
        if (vhB.description == null) {
            description = anchorCommonStruct2.description;
        }
        else {
            description = vhB.description;
        }
        anchorCommonStruct2.description = description;
        anchorCommonStruct2.thumbnail = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vhB.thumbnail, anchorCommonStruct2.thumbnail);
        anchorCommonStruct2.actions = List$com$ss$ugc$aweme$proto$AnchorPanelActionStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorPanelAction(vhB.actions, anchorCommonStruct2.actions);
        return anchorCommonStruct2;
    }
    
    public static AnchorPanelAction com$ss$ugc$aweme$proto$AnchorPanelActionStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorPanelAction(final Vd5 vd5, final AnchorPanelAction anchorPanelAction) {
        if (vd5 == null) {
            return anchorPanelAction;
        }
        final AnchorPanelAction anchorPanelAction2 = new AnchorPanelAction();
        anchorPanelAction2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vd5.icon, anchorPanelAction2.icon);
        String schema;
        if (vd5.schema == null) {
            schema = anchorPanelAction2.schema;
        }
        else {
            schema = vd5.schema;
        }
        anchorPanelAction2.schema = schema;
        anchorPanelAction2.actionType = 0H1.LIZ(vd5.action_type, anchorPanelAction2.actionType);
        return anchorPanelAction2;
    }
    
    public static AnchorShopLinkStruct com$ss$ugc$aweme$proto$AnchorShopLinkStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorShopLinkStruct(final VVJ vvj, final AnchorShopLinkStruct anchorShopLinkStruct) {
        if (vvj == null) {
            return anchorShopLinkStruct;
        }
        final AnchorShopLinkStruct anchorShopLinkStruct2 = new AnchorShopLinkStruct();
        String keyword;
        if (vvj.keyword == null) {
            keyword = anchorShopLinkStruct2.keyword;
        }
        else {
            keyword = vvj.keyword;
        }
        anchorShopLinkStruct2.keyword = keyword;
        String url;
        if (vvj.url == null) {
            url = anchorShopLinkStruct2.url;
        }
        else {
            url = vvj.url;
        }
        anchorShopLinkStruct2.url = url;
        return anchorShopLinkStruct2;
    }
    
    public static Anchor com$ss$ugc$aweme$proto$AnchorStructV2$$com$ss$android$ugc$aweme$feed$model$Anchor(final VbY vbY, final Anchor anchor) {
        if (vbY == null) {
            return anchor;
        }
        final Anchor anchor2 = new Anchor();
        Integer showType;
        if (vbY.show_type == null) {
            showType = anchor2.showType;
        }
        else {
            showType = vbY.show_type;
        }
        anchor2.showType = showType;
        Integer businessType;
        if (vbY.business_type == null) {
            businessType = anchor2.businessType;
        }
        else {
            businessType = vbY.business_type;
        }
        anchor2.businessType = businessType;
        anchor2.wikipediaInfo = com$ss$ugc$aweme$proto$AnchorWikipediaStructV2$$com$ss$android$ugc$aweme$feed$model$WikipediaInfo(vbY.wikipedia_info, anchor2.wikipediaInfo);
        anchor2.shopLinkStruct = com$ss$ugc$aweme$proto$AnchorShopLinkStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorShopLinkStruct(vbY.shop_link, anchor2.shopLinkStruct);
        anchor2.anchorInfo = com$ss$ugc$aweme$proto$AnchorCommonStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct(vbY.anchor_info, anchor2.anchorInfo);
        String anchorId;
        if (vbY.anchor_id == null) {
            anchorId = anchor2.anchorId;
        }
        else {
            anchorId = vbY.anchor_id;
        }
        anchor2.anchorId = anchorId;
        return anchor2;
    }
    
    public static WikipediaInfo com$ss$ugc$aweme$proto$AnchorWikipediaStructV2$$com$ss$android$ugc$aweme$feed$model$WikipediaInfo(final VbV vbV, final WikipediaInfo wikipediaInfo) {
        if (vbV == null) {
            return wikipediaInfo;
        }
        final WikipediaInfo wikipediaInfo2 = new WikipediaInfo();
        String keyword;
        if (vbV.keyword == null) {
            keyword = wikipediaInfo2.keyword;
        }
        else {
            keyword = vbV.keyword;
        }
        wikipediaInfo2.keyword = keyword;
        String lang;
        if (vbV.lang == null) {
            lang = wikipediaInfo2.lang;
        }
        else {
            lang = vbV.lang;
        }
        wikipediaInfo2.lang = lang;
        return wikipediaInfo2;
    }
    
    public static ChallengeAnnouncement com$ss$ugc$aweme$proto$AnnouncementStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeAnnouncement(final VVM vvm, final ChallengeAnnouncement challengeAnnouncement) {
        if (vvm == null) {
            return challengeAnnouncement;
        }
        final ChallengeAnnouncement challengeAnnouncement2 = new ChallengeAnnouncement();
        String title;
        if (vvm.title == null) {
            title = challengeAnnouncement2.title;
        }
        else {
            title = vvm.title;
        }
        challengeAnnouncement2.title = title;
        String content;
        if (vvm.body == null) {
            content = challengeAnnouncement2.content;
        }
        else {
            content = vvm.body;
        }
        challengeAnnouncement2.content = content;
        return challengeAnnouncement2;
    }
    
    public static Audio com$ss$ugc$aweme$proto$AudioStructV2$$com$ss$android$ugc$aweme$feed$model$Audio(final Vce vce, Audio audio) {
        if (vce == null) {
            return audio;
        }
        audio = new Audio();
        audio.CdnUrlExpired = 0H1.LIZ(vce.CdnUrlExpired, audio.CdnUrlExpired);
        audio.TtsInfos = List$com$ss$ugc$aweme$proto$TtsAudioStructV2$$List$com$ss$android$ugc$aweme$feed$model$TtsInfos(vce.TtsInfos, audio.TtsInfos);
        audio.originalSoundInfos = List$com$ss$ugc$aweme$proto$OriginalSoundStructV2$$List$com$ss$android$ugc$aweme$feed$model$OriginalSound(vce.original_sound_infos, audio.originalSoundInfos);
        return audio;
    }
    
    public static C0P com$ss$ugc$aweme$proto$AutoCaptionTypeV2$$com$ss$android$ugc$aweme$sticker$data$AutocaptionType(final VdY vdY, final C0P c0P) {
        if (vdY == null) {
            return c0P;
        }
        final C0P c0P2 = new C0P();
        String language;
        if (vdY.language == null) {
            language = c0P2.language;
        }
        else {
            language = vdY.language;
        }
        c0P2.language = language;
        c0P2.url = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdY.url, c0P2.url);
        return c0P2;
    }
    
    public static 8su com$ss$ugc$aweme$proto$AutoVideoCaptionStructV2$$com$ss$android$ugc$aweme$sticker$data$CaptionStruct(final Vdb vdb, final 8su 8su) {
        if (vdb == null) {
            return 8su;
        }
        final 8su 8su2 = new 8su();
        8su2.location = 0H1.LIZ(vdb.location, 8su2.location);
        String audioUri;
        if (vdb.audio_uri == null) {
            audioUri = 8su2.audioUri;
        }
        else {
            audioUri = vdb.audio_uri;
        }
        8su2.audioUri = audioUri;
        8su2.utterances = List$com$ss$ugc$aweme$proto$UtteranceV2$$List$com$ss$android$ugc$aweme$sticker$data$Utterance(vdb.utterances, 8su2.utterances);
        8su2.autoCaptions = List$com$ss$ugc$aweme$proto$AutoCaptionTypeV2$$List$com$ss$android$ugc$aweme$sticker$data$AutocaptionType(vdb.auto_captions, 8su2.autoCaptions);
        8su2.disable = 0H1.LIZ(vdb.disable, 8su2.disable);
        String srcLanguage;
        if (vdb.src_lang == null) {
            srcLanguage = 8su2.srcLanguage;
        }
        else {
            srcLanguage = vdb.src_lang;
        }
        8su2.srcLanguage = srcLanguage;
        return 8su2;
    }
    
    public static AvatarDecoration com$ss$ugc$aweme$proto$AvatarDecorationStructV2$$com$ss$android$ugc$aweme$profile$model$AvatarDecoration(final Vd2 vd2, final AvatarDecoration avatarDecoration) {
        if (vd2 == null) {
            return avatarDecoration;
        }
        final AvatarDecoration avatarDecoration2 = new AvatarDecoration();
        avatarDecoration2.id = 0H1.LIZ(vd2.id, avatarDecoration2.id);
        String name;
        if (vd2.name == null) {
            name = avatarDecoration2.name;
        }
        else {
            name = vd2.name;
        }
        avatarDecoration2.name = name;
        avatarDecoration2.sourceUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vd2.source_url, avatarDecoration2.sourceUrl);
        return avatarDecoration2;
    }
    
    public static AwemeACLShare com$ss$ugc$aweme$proto$AwemeACLStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeACLShare(final VmJ vmJ, AwemeACLShare awemeACLShare) {
        if (vmJ == null) {
            return awemeACLShare;
        }
        awemeACLShare = new AwemeACLShare();
        awemeACLShare.downloadGeneral = com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(vmJ.download_general, awemeACLShare.downloadGeneral);
        awemeACLShare.downloadMaskPanel = com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(vmJ.download_mask_panel, awemeACLShare.downloadMaskPanel);
        awemeACLShare.downloadSharePanel = com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(vmJ.download_share_panel, awemeACLShare.downloadSharePanel);
        awemeACLShare.shareListStatus = 0H1.LIZ(vmJ.share_list_status, awemeACLShare.shareListStatus);
        awemeACLShare.shareGeneral = com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(vmJ.share_general, awemeACLShare.shareGeneral);
        awemeACLShare.platformList = List$com$ss$ugc$aweme$proto$ACLCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(vmJ.platform_list, awemeACLShare.platformList);
        awemeACLShare.shareThirdPlatform = com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(vmJ.share_third_platform, awemeACLShare.shareThirdPlatform);
        return awemeACLShare;
    }
    
    public static AwemeActivity com$ss$ugc$aweme$proto$AwemeActivityStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivity(final VbS vbS, final AwemeActivity awemeActivity) {
        if (vbS == null) {
            return awemeActivity;
        }
        final AwemeActivity awemeActivity2 = new AwemeActivity();
        String activityId;
        if (vbS.activity_id == null) {
            activityId = awemeActivity2.activityId;
        }
        else {
            activityId = vbS.activity_id;
        }
        awemeActivity2.activityId = activityId;
        Long showDelayTime;
        if (vbS.show_delay_time == null) {
            showDelayTime = awemeActivity2.showDelayTime;
        }
        else {
            showDelayTime = vbS.show_delay_time;
        }
        awemeActivity2.showDelayTime = showDelayTime;
        String schemaUrl;
        if (vbS.schema_url == null) {
            schemaUrl = awemeActivity2.schemaUrl;
        }
        else {
            schemaUrl = vbS.schema_url;
        }
        awemeActivity2.schemaUrl = schemaUrl;
        awemeActivity2.content = com$ss$ugc$aweme$proto$TextContentStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivityContent(vbS.content, awemeActivity2.content);
        awemeActivity2.primaryBtn = com$ss$ugc$aweme$proto$ActivityButtonStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivityButton(vbS.primary_btn, awemeActivity2.primaryBtn);
        return awemeActivity2;
    }
    
    public static AnchorInfo com$ss$ugc$aweme$proto$AwemeAnchorStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorInfo(final Vm1 vm1, final AnchorInfo anchorInfo) {
        if (vm1 == null) {
            return anchorInfo;
        }
        final AnchorInfo anchorInfo2 = new AnchorInfo();
        Integer type;
        if (vm1.type == null) {
            type = anchorInfo2.type;
        }
        else {
            type = vm1.type;
        }
        anchorInfo2.type = type;
        String id;
        if (vm1.id == null) {
            id = anchorInfo2.id;
        }
        else {
            id = vm1.id;
        }
        anchorInfo2.id = id;
        anchorInfo2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vm1.icon, anchorInfo2.icon);
        String title;
        if (vm1.title == null) {
            title = anchorInfo2.title;
        }
        else {
            title = vm1.title;
        }
        anchorInfo2.title = title;
        String openUrl;
        if (vm1.open_url == null) {
            openUrl = anchorInfo2.openUrl;
        }
        else {
            openUrl = vm1.open_url;
        }
        anchorInfo2.openUrl = openUrl;
        String webUrl;
        if (vm1.web_url == null) {
            webUrl = anchorInfo2.webUrl;
        }
        else {
            webUrl = vm1.web_url;
        }
        anchorInfo2.webUrl = webUrl;
        String mpUrl;
        if (vm1.mp_url == null) {
            mpUrl = anchorInfo2.mpUrl;
        }
        else {
            mpUrl = vm1.mp_url;
        }
        anchorInfo2.mpUrl = mpUrl;
        String extra;
        if (vm1.extra == null) {
            extra = anchorInfo2.extra;
        }
        else {
            extra = vm1.extra;
        }
        anchorInfo2.extra = extra;
        String logExtra;
        if (vm1.log_extra == null) {
            logExtra = anchorInfo2.logExtra;
        }
        else {
            logExtra = vm1.log_extra;
        }
        anchorInfo2.logExtra = logExtra;
        return anchorInfo2;
    }
    
    public static 3LU com$ss$ugc$aweme$proto$AwemeCommerceStickerStructV2$$com$ss$android$ugc$aweme$commercialize$model$CommerceStickerInfo(final VgQ vgQ, final 3LU 3lu) {
        if (vgQ == null) {
            return 3lu;
        }
        final 3LU 3lu2 = new 3LU();
        3lu2.commerceStickerId = 0H1.LIZ(vgQ.commerce_sticker_id, 3lu2.commerceStickerId);
        3lu2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vgQ.icon_url, 3lu2.iconUrl);
        String letters;
        if (vgQ.letters == null) {
            letters = 3lu2.letters;
        }
        else {
            letters = vgQ.letters;
        }
        3lu2.letters = letters;
        String openUrl;
        if (vgQ.open_url == null) {
            openUrl = 3lu2.openUrl;
        }
        else {
            openUrl = vgQ.open_url;
        }
        3lu2.openUrl = openUrl;
        String webUrl;
        if (vgQ.web_url == null) {
            webUrl = 3lu2.webUrl;
        }
        else {
            webUrl = vgQ.web_url;
        }
        3lu2.webUrl = webUrl;
        String webUrlTitle;
        if (vgQ.web_url_title == null) {
            webUrlTitle = 3lu2.webUrlTitle;
        }
        else {
            webUrlTitle = vgQ.web_url_title;
        }
        3lu2.webUrlTitle = webUrlTitle;
        return 3lu2;
    }
    
    public static WUD com$ss$ugc$aweme$proto$AwemeCommerceStructV2$$com$ss$android$ugc$aweme$commerce$AwemeCommerceStruct(final Vlv vlv, final WUD wud) {
        if (vlv == null) {
            return wud;
        }
        final WUD wud2 = new WUD();
        wud2.ad_auth_status = 0H1.LIZ(vlv.ad_auth_status, wud2.ad_auth_status);
        wud2.ad_source = 0H1.LIZ(vlv.ad_source, wud2.ad_source);
        wud2.avoid_global_pendant = 0H1.LIZ(vlv.avoid_global_pendant, wud2.avoid_global_pendant);
        wud2.withCommentFilterWords = 0H1.LIZ(vlv.with_comment_filter_words, wud2.withCommentFilterWords);
        wud2.preventShare = 0H1.LIZ(vlv.prevent_share, wud2.preventShare);
        String studyId;
        if (vlv.study_id == null) {
            studyId = wud2.studyId;
        }
        else {
            studyId = vlv.study_id;
        }
        wud2.studyId = studyId;
        String bcHashtagText;
        if (vlv.bc_label_test_text == null) {
            bcHashtagText = wud2.bcHashtagText;
        }
        else {
            bcHashtagText = vlv.bc_label_test_text;
        }
        wud2.bcHashtagText = bcHashtagText;
        return wud2;
    }
    
    public static AwemeControl com$ss$ugc$aweme$proto$AwemeControlStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeControl(final Veb veb, AwemeControl awemeControl) {
        if (veb == null) {
            return awemeControl;
        }
        awemeControl = new AwemeControl();
        awemeControl.canForward = 0H1.LIZ(veb.can_forward, awemeControl.canForward);
        awemeControl.canShare = 0H1.LIZ(veb.can_share, awemeControl.canShare);
        awemeControl.canComment = 0H1.LIZ(veb.can_comment, awemeControl.canComment);
        awemeControl.canShowComment = 0H1.LIZ(veb.can_show_comment, awemeControl.canShowComment);
        return awemeControl;
    }
    
    public static FloatingCardInfo com$ss$ugc$aweme$proto$AwemeFloatingCardStructV2$$com$ss$android$ugc$aweme$feed$model$FloatingCardInfo(final ViU viU, final FloatingCardInfo floatingCardInfo) {
        if (viU == null) {
            return floatingCardInfo;
        }
        final FloatingCardInfo floatingCardInfo2 = new FloatingCardInfo();
        String schema;
        if (viU.schema == null) {
            schema = floatingCardInfo2.schema;
        }
        else {
            schema = viU.schema;
        }
        floatingCardInfo2.schema = schema;
        String schemaDesc;
        if (viU.schema_desc == null) {
            schemaDesc = floatingCardInfo2.schemaDesc;
        }
        else {
            schemaDesc = viU.schema_desc;
        }
        floatingCardInfo2.schemaDesc = schemaDesc;
        floatingCardInfo2.icons = List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(viU.icons, floatingCardInfo2.icons);
        String title;
        if (viU.title == null) {
            title = floatingCardInfo2.title;
        }
        else {
            title = viU.title;
        }
        floatingCardInfo2.title = title;
        String description;
        if (viU.description == null) {
            description = floatingCardInfo2.description;
        }
        else {
            description = viU.description;
        }
        floatingCardInfo2.description = description;
        String buttonDesc;
        if (viU.button_desc == null) {
            buttonDesc = floatingCardInfo2.buttonDesc;
        }
        else {
            buttonDesc = viU.button_desc;
        }
        floatingCardInfo2.buttonDesc = buttonDesc;
        floatingCardInfo2.buttonBackground = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(viU.button_bg, floatingCardInfo2.buttonBackground);
        return floatingCardInfo2;
    }
    
    public static AwemeLabelModel com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(final Vck vck, AwemeLabelModel awemeLabelModel) {
        if (vck == null) {
            return awemeLabelModel;
        }
        awemeLabelModel = new AwemeLabelModel();
        awemeLabelModel.urlModels = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vck.label_url, awemeLabelModel.urlModels);
        awemeLabelModel.labelType = 0H1.LIZ(vck.label_type, awemeLabelModel.labelType);
        return awemeLabelModel;
    }
    
    public static AwemeRiskModel com$ss$ugc$aweme$proto$AwemeRiskStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRiskModel(final VlB vlB, final AwemeRiskModel awemeRiskModel) {
        if (vlB == null) {
            return awemeRiskModel;
        }
        final AwemeRiskModel awemeRiskModel2 = new AwemeRiskModel();
        awemeRiskModel2.warn = 0H1.LIZ(vlB.warn, awemeRiskModel2.warn);
        awemeRiskModel2.riskSink = 0H1.LIZ(vlB.risk_sink, awemeRiskModel2.riskSink);
        awemeRiskModel2.type = 0H1.LIZ(vlB.type, awemeRiskModel2.type);
        String content;
        if (vlB.content == null) {
            content = awemeRiskModel2.content;
        }
        else {
            content = vlB.content;
        }
        awemeRiskModel2.content = content;
        awemeRiskModel2.notice = 0H1.LIZ(vlB.notice, awemeRiskModel2.notice);
        String url;
        if (vlB.url == null) {
            url = awemeRiskModel2.url;
        }
        else {
            url = vlB.url;
        }
        awemeRiskModel2.url = url;
        return awemeRiskModel2;
    }
    
    public static HotSearchInfo com$ss$ugc$aweme$proto$AwemeSearchStructV2$$com$ss$android$ugc$aweme$feed$model$HotSearchInfo(final Vm4 vm4, final HotSearchInfo hotSearchInfo) {
        if (vm4 == null) {
            return hotSearchInfo;
        }
        final HotSearchInfo hotSearchInfo2 = new HotSearchInfo();
        String sentence;
        if (vm4.sentence == null) {
            sentence = hotSearchInfo2.sentence;
        }
        else {
            sentence = vm4.sentence;
        }
        hotSearchInfo2.sentence = sentence;
        String challengeId;
        if (vm4.challenge_id == null) {
            challengeId = hotSearchInfo2.challengeId;
        }
        else {
            challengeId = vm4.challenge_id;
        }
        hotSearchInfo2.challengeId = challengeId;
        String searchWord;
        if (vm4.search_word == null) {
            searchWord = hotSearchInfo2.searchWord;
        }
        else {
            searchWord = vm4.search_word;
        }
        hotSearchInfo2.searchWord = searchWord;
        hotSearchInfo2.value = 0H1.LIZ(vm4.value, hotSearchInfo2.value);
        hotSearchInfo2.videoRank = 0H1.LIZ(vm4.vb_rank, hotSearchInfo2.videoRank);
        hotSearchInfo2.videoRankVV = 0H1.LIZ(vm4.vb_rank_value, hotSearchInfo2.videoRankVV);
        hotSearchInfo2.rank = 0H1.LIZ(vm4.rank, hotSearchInfo2.rank);
        String id;
        if (vm4.group_id == null) {
            id = hotSearchInfo2.id;
        }
        else {
            id = vm4.group_id;
        }
        hotSearchInfo2.id = id;
        hotSearchInfo2.label = 0H1.LIZ(vm4.label, hotSearchInfo2.label);
        return hotSearchInfo2;
    }
    
    public static AwemeStatistics com$ss$ugc$aweme$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics(final VoX voX, AwemeStatistics awemeStatistics) {
        if (voX == null) {
            return awemeStatistics;
        }
        awemeStatistics = new AwemeStatistics();
        awemeStatistics.commentCount = 0H1.LIZ(voX.comment_count, awemeStatistics.commentCount);
        awemeStatistics.diggCount = 0H1.LIZ(voX.digg_count, awemeStatistics.diggCount);
        awemeStatistics.downloadCount = 0H1.LIZ(voX.download_count, awemeStatistics.downloadCount);
        awemeStatistics.playCount = 0H1.LIZ(voX.play_count, awemeStatistics.playCount);
        awemeStatistics.shareCount = 0H1.LIZ(voX.share_count, awemeStatistics.shareCount);
        awemeStatistics.forwardCount = 0H1.LIZ(voX.forward_count, awemeStatistics.forwardCount);
        awemeStatistics.loseCount = 0H1.LIZ(voX.lose_count, awemeStatistics.loseCount);
        awemeStatistics.loseCommentCount = 0H1.LIZ(voX.lose_comment_count, awemeStatistics.loseCommentCount);
        awemeStatistics.collectCount = 0H1.LIZ(voX.collect_count, awemeStatistics.collectCount);
        return awemeStatistics;
    }
    
    public static AwemeStatus com$ss$ugc$aweme$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus(final Vnm vnm, AwemeStatus awemeStatus) {
        if (vnm == null) {
            return awemeStatus;
        }
        awemeStatus = new AwemeStatus();
        awemeStatus.isDelete = 0H1.LIZ(vnm.is_delete, awemeStatus.isDelete);
        awemeStatus.allowShare = 0H1.LIZ(vnm.allow_share, awemeStatus.allowShare);
        awemeStatus.allowComment = 0H1.LIZ(vnm.allow_comment, awemeStatus.allowComment);
        awemeStatus.privateStatus = 0H1.LIZ(vnm.private_status, awemeStatus.privateStatus);
        awemeStatus.inReviewing = 0H1.LIZ(vnm.in_reviewing, awemeStatus.inReviewing);
        awemeStatus.reviewed = 0H1.LIZ(vnm.reviewed, awemeStatus.reviewed);
        awemeStatus.selfSee = 0H1.LIZ(vnm.self_see, awemeStatus.selfSee);
        awemeStatus.isProhibited = 0H1.LIZ(vnm.is_prohibited, awemeStatus.isProhibited);
        awemeStatus.downloadStatus = 0H1.LIZ(vnm.download_status, awemeStatus.downloadStatus);
        awemeStatus.excludeStatus = 0H1.LIZ(vnm.dont_share_status, awemeStatus.excludeStatus);
        awemeStatus.allowRecommend = 0H1.LIZ(vnm.video_hide_search, awemeStatus.allowRecommend);
        awemeStatus.videoMuteInfo = com$ss$ugc$aweme$proto$VideoMuteStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus$VideoMuteInfo(vnm.video_mute, awemeStatus.videoMuteInfo);
        return awemeStatus;
    }
    
    public static Aweme com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(final VlU vlU, final Aweme aweme) {
        if (vlU == null) {
            return aweme;
        }
        final Aweme aweme2 = new Aweme();
        String aid;
        if (vlU.aweme_id == null) {
            aid = aweme2.aid;
        }
        else {
            aid = vlU.aweme_id;
        }
        aweme2.aid = aid;
        String desc;
        if (vlU.desc == null) {
            desc = aweme2.desc;
        }
        else {
            desc = vlU.desc;
        }
        aweme2.desc = desc;
        aweme2.createTime = 0H1.LIZ(vlU.create_time, aweme2.createTime);
        aweme2.author = com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(vlU.author, aweme2.author);
        aweme2.music = com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(vlU.music, aweme2.music);
        aweme2.challengeList = List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge(vlU.cha_list, aweme2.challengeList);
        aweme2.video = com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(vlU.video, aweme2.video);
        String shareUrl;
        if (vlU.share_url == null) {
            shareUrl = aweme2.shareUrl;
        }
        else {
            shareUrl = vlU.share_url;
        }
        aweme2.shareUrl = shareUrl;
        aweme2.userDigg = 0H1.LIZ(vlU.user_digged, aweme2.userDigg);
        aweme2.statistics = com$ss$ugc$aweme$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics(vlU.statistics, aweme2.statistics);
        aweme2.status = com$ss$ugc$aweme$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus(vlU.status, aweme2.status);
        String extra;
        if (vlU.extra == null) {
            extra = aweme2.extra;
        }
        else {
            extra = vlU.extra;
        }
        aweme2.extra = extra;
        aweme2.rate = 0H1.LIZ(vlU.rate, aweme2.rate);
        aweme2.textExtra = List$com$ss$ugc$aweme$proto$TextExtraStructV2$$List$com$ss$android$ugc$aweme$model$TextExtraStruct(vlU.text_extra, aweme2.textExtra);
        aweme2.labelLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlU.label_large, aweme2.labelLarge);
        aweme2.labelThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlU.label_thumb, aweme2.labelThumb);
        aweme2.isTop = 0H1.LIZ(vlU.is_top, aweme2.isTop);
        aweme2.labelTop = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlU.label_top, aweme2.labelTop);
        aweme2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(vlU.share_info, aweme2.shareInfo);
        aweme2.originAuthor = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlU.label_origin_author, aweme2.originAuthor);
        String distance;
        if (vlU.distance == null) {
            distance = aweme2.distance;
        }
        else {
            distance = vlU.distance;
        }
        aweme2.distance = distance;
        aweme2.musicStarter = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlU.label_music_starter, aweme2.musicStarter);
        aweme2.labelPrivate = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlU.label_private, aweme2.labelPrivate);
        aweme2.videoLabels = List$com$ss$ugc$aweme$proto$AwemeLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(vlU.video_labels, aweme2.videoLabels);
        aweme2.isVr = 0H1.LIZ(vlU.is_vr, aweme2.isVr);
        String landingPage;
        if (vlU.landing_page == null) {
            landingPage = aweme2.landingPage;
        }
        else {
            landingPage = vlU.landing_page;
        }
        aweme2.landingPage = landingPage;
        aweme2.isAd = 0H1.LIZ(vlU.is_ads, aweme2.isAd);
        aweme2.awemeType = 0H1.LIZ(vlU.aweme_type, aweme2.awemeType);
        aweme2.cmtSwt = 0H1.LIZ(vlU.cmt_swt, aweme2.cmtSwt);
        aweme2.imageInfos = List$com$ss$ugc$aweme$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo(vlU.image_infos, aweme2.imageInfos);
        aweme2.awemeRiskModel = com$ss$ugc$aweme$proto$AwemeRiskStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRiskModel(vlU.risk_infos, aweme2.awemeRiskModel);
        aweme2.isRelieve = 0H1.LIZ(vlU.is_relieve, aweme2.isRelieve);
        aweme2.position = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(vlU.position, aweme2.position);
        aweme2.uniqidPosition = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(vlU.uniqid_position, aweme2.uniqidPosition);
        aweme2.isHashTag = 0H1.LIZ(vlU.is_hash_tag, aweme2.isHashTag);
        aweme2.isPgcShow = 0H1.LIZ(vlU.is_pgcshow, aweme2.isPgcShow);
        String region;
        if (vlU.region == null) {
            region = aweme2.region;
        }
        else {
            region = vlU.region;
        }
        aweme2.region = region;
        aweme2.textVideoLabels = List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(vlU.video_text, aweme2.textVideoLabels);
        aweme2.specialSticker = com$ss$ugc$aweme$proto$SpecialStickerStructV2$$com$ss$android$ugc$aweme$feed$model$SpecialSticker(vlU.sp_sticker, aweme2.specialSticker);
        String adSchedule;
        if (vlU.ad_schedule == null) {
            adSchedule = aweme2.adSchedule;
        }
        else {
            adSchedule = vlU.ad_schedule;
        }
        aweme2.adSchedule = adSchedule;
        aweme2.collectStatus = 0H1.LIZ(vlU.collect_stat, aweme2.collectStatus);
        aweme2.textTopLabels = List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(vlU.label_top_text, aweme2.textTopLabels);
        String stickerIDs;
        if (vlU.stickers == null) {
            stickerIDs = aweme2.stickerIDs;
        }
        else {
            stickerIDs = vlU.stickers;
        }
        aweme2.stickerIDs = stickerIDs;
        aweme2.forwardItem = com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(vlU.forward_item, aweme2.forwardItem);
        String forwardCommentId;
        if (vlU.forward_comment_id == null) {
            forwardCommentId = aweme2.forwardCommentId;
        }
        else {
            forwardCommentId = vlU.forward_comment_id;
        }
        aweme2.forwardCommentId = forwardCommentId;
        String forwardItemId;
        if (vlU.forward_item_id == null) {
            forwardItemId = aweme2.forwardItemId;
        }
        else {
            forwardItemId = vlU.forward_item_id;
        }
        aweme2.forwardItemId = forwardItemId;
        String groupId;
        if (vlU.group_id == null) {
            groupId = aweme2.groupId;
        }
        else {
            groupId = vlU.group_id;
        }
        aweme2.groupId = groupId;
        String preForwardId;
        if (vlU.pre_forward_id == null) {
            preForwardId = aweme2.preForwardId;
        }
        else {
            preForwardId = vlU.pre_forward_id;
        }
        aweme2.preForwardId = preForwardId;
        aweme2.preventDownload = 0H1.LIZ(vlU.prevent_download, aweme2.preventDownload);
        aweme2.nicknamePosition = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(vlU.nickname_position, aweme2.nicknamePosition);
        aweme2.commentSetting = 0H1.LIZ(vlU.item_comment_settings, aweme2.commentSetting);
        aweme2.descendantsModel = com$ss$ugc$aweme$proto$DescendantStructV2$$com$ss$android$ugc$aweme$feed$model$DescendantsModel(vlU.descendants, aweme2.descendantsModel);
        aweme2.awemeRawAd = 2ob.LIZ(vlU.raw_ad_data, aweme2.awemeRawAd);
        aweme2.gameInfo = com$ss$ugc$aweme$proto$GameStructV2$$com$ss$android$ugc$aweme$feed$model$GameInfo(vlU.game_info, aweme2.gameInfo);
        aweme2.microAppInfo = com$ss$ugc$aweme$proto$MicroAppStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MicroAppInfo(vlU.micro_app_info, aweme2.microAppInfo);
        aweme2.withPromotionalMusic = 0H1.LIZ(vlU.with_promotional_music, aweme2.withPromotionalMusic);
        aweme2.linkAdData = 2ob.LIZ(vlU.link_ad_data, aweme2.linkAdData);
        aweme2.activityPendant = com$ss$ugc$aweme$proto$CommerceActivityStructV2$$com$ss$android$ugc$aweme$commerce$model$CommerceActivityStruct(vlU.activity_pendant, aweme2.activityPendant);
        aweme2.stickerEntranceInfo = com$ss$ugc$aweme$proto$NewFaceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$NewFaceStickerBean(vlU.sticker_detail, aweme2.stickerEntranceInfo);
        aweme2.longVideos = List$com$ss$ugc$aweme$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo(vlU.long_video, aweme2.longVideos);
        aweme2.duetSetting = ClientSettings$Duet.get(0H1.LIZ(vlU.item_duet, ClientSettings$Duet.get(aweme2.duetSetting)));
        aweme2.reactSetting = 0H1.LIZ(vlU.item_react, aweme2.reactSetting);
        aweme2.hotSearchInfo = com$ss$ugc$aweme$proto$AwemeSearchStructV2$$com$ss$android$ugc$aweme$feed$model$HotSearchInfo(vlU.hot_info, aweme2.hotSearchInfo);
        aweme2.starAtlasOrderId = 0H1.LIZ(vlU.star_atlas_order_id, aweme2.starAtlasOrderId);
        String mLabelMusicStarterText;
        if (vlU.label_music_starter_text == null) {
            mLabelMusicStarterText = aweme2.mLabelMusicStarterText;
        }
        else {
            mLabelMusicStarterText = vlU.label_music_starter_text;
        }
        aweme2.mLabelMusicStarterText = mLabelMusicStarterText;
        aweme2.downloadWithoutWatermark = 0H1.LIZ(vlU.without_watermark, aweme2.downloadWithoutWatermark);
        aweme2.preload = com$ss$ugc$aweme$proto$PreloadStructV2$$com$ss$android$ugc$aweme$feed$model$Preload(vlU.preload, aweme2.preload);
        String descLanguage;
        if (vlU.desc_language == null) {
            descLanguage = aweme2.descLanguage;
        }
        else {
            descLanguage = vlU.desc_language;
        }
        aweme2.descLanguage = descLanguage;
        aweme2.floatingCardInfo = com$ss$ugc$aweme$proto$AwemeFloatingCardStructV2$$com$ss$android$ugc$aweme$feed$model$FloatingCardInfo(vlU.floating_card_content, aweme2.floatingCardInfo);
        aweme2.interactStickerStructs = List$com$ss$ugc$aweme$proto$InteractionStickerStructV2$$List$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(vlU.interaction_stickers, aweme2.interactStickerStructs);
        aweme2.adLinkType = 0H1.LIZ(vlU.ad_link_type, aweme2.adLinkType);
        aweme2.takeDownReason = 0H1.LIZ(vlU.take_down_reason, aweme2.takeDownReason);
        String takeDownDesc;
        if (vlU.take_down_desc == null) {
            takeDownDesc = aweme2.takeDownDesc;
        }
        else {
            takeDownDesc = vlU.take_down_desc;
        }
        aweme2.takeDownDesc = takeDownDesc;
        String uploadMiscInfoStructStr;
        if (vlU.misc_info == null) {
            uploadMiscInfoStructStr = aweme2.uploadMiscInfoStructStr;
        }
        else {
            uploadMiscInfoStructStr = vlU.misc_info;
        }
        aweme2.uploadMiscInfoStructStr = uploadMiscInfoStructStr;
        List originCommentIds;
        if (vlU.origin_comment_ids == null) {
            originCommentIds = aweme2.originCommentIds;
        }
        else {
            originCommentIds = vlU.origin_comment_ids;
        }
        aweme2.originCommentIds = originCommentIds;
        aweme2.commerceConfigDataList = List$com$ss$ugc$aweme$proto$CommerceConfigDataV2$$List$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(vlU.commerce_config_data, aweme2.commerceConfigDataList);
        aweme2.commerceStickerInfo = com$ss$ugc$aweme$proto$AwemeCommerceStickerStructV2$$com$ss$android$ugc$aweme$commercialize$model$CommerceStickerInfo(vlU.commerce_sticker_info, aweme2.commerceStickerInfo);
        aweme2.distributeType = 0H1.LIZ(vlU.distribute_type, aweme2.distributeType);
        aweme2.videoControl = com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl(vlU.video_control, aweme2.videoControl);
        aweme2.isEffectDesigner = 0H1.LIZ(vlU.is_effect_designer, aweme2.isEffectDesigner);
        aweme2.adAwemeSource = 0H1.LIZ(vlU.ad_aweme_source, aweme2.adAwemeSource);
        aweme2.awemeControl = com$ss$ugc$aweme$proto$AwemeControlStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeControl(vlU.aweme_control, aweme2.awemeControl);
        aweme2.hasVisionSearchEntry = 0H1.LIZ(vlU.has_vs_entry, aweme2.hasVisionSearchEntry);
        aweme2.anchor = com$ss$ugc$aweme$proto$AnchorStructV2$$com$ss$android$ugc$aweme$feed$model$Anchor(vlU.anchor, aweme2.anchor);
        aweme2.feedRelationLabel = com$ss$ugc$aweme$proto$RelationLabelStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelNew(vlU.feed_relation_label, aweme2.feedRelationLabel);
        aweme2.mixInfo = com$ss$ugc$aweme$proto$MixStructV2$$com$ss$android$ugc$aweme$feed$model$MixStruct(vlU.mix_info, aweme2.mixInfo);
        aweme2.hotListStruct = com$ss$ugc$aweme$proto$HotListStructV2$$com$ss$android$ugc$aweme$profile$model$HotListStruct(vlU.hot_list, aweme2.hotListStruct);
        aweme2.mCommerceVideoAuthInfo = com$ss$ugc$aweme$proto$AwemeCommerceStructV2$$com$ss$android$ugc$aweme$commerce$AwemeCommerceStruct(vlU.commerce_info, aweme2.mCommerceVideoAuthInfo);
        aweme2.bannerTip = com$ss$ugc$aweme$proto$BannerTipV2$$com$ss$android$ugc$aweme$feed$model$BannerTip(vlU.banner_tip, aweme2.bannerTip);
        aweme2.anchorInfo = com$ss$ugc$aweme$proto$AwemeAnchorStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorInfo(vlU.anchor_info, aweme2.anchorInfo);
        aweme2.mLiveAwesomeSplashInfo = com$ss$ugc$aweme$proto$CNYStructV2$$com$ss$android$ugc$aweme$feed$model$livesplash$LiveAwesomeSplashInfo(vlU.cny_info, aweme2.mLiveAwesomeSplashInfo);
        aweme2.isFamiliar = 0H1.LIZ(vlU.is_familiar, aweme2.isFamiliar);
        aweme2.needVisionSearchEntry = 0H1.LIZ(vlU.need_vs_entry, aweme2.needVisionSearchEntry);
        aweme2.mRoomFeedCellStruct = com$ss$ugc$aweme$proto$WebcastRoomFeedCellStructV2$$com$ss$android$ugc$aweme$feed$model$live$RoomFeedCellStruct(vlU.cell_room, aweme2.mRoomFeedCellStruct);
        String liveReaSon;
        if (vlU.live_reason == null) {
            liveReaSon = aweme2.liveReaSon;
        }
        else {
            liveReaSon = vlU.live_reason;
        }
        aweme2.liveReaSon = liveReaSon;
        String videoFeedTag;
        if (vlU.video_feed_tag == null) {
            videoFeedTag = aweme2.videoFeedTag;
        }
        else {
            videoFeedTag = vlU.video_feed_tag;
        }
        aweme2.videoFeedTag = videoFeedTag;
        aweme2.videoMaskInfo = com$ss$ugc$aweme$proto$MaskStructV2$$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo(vlU.mask_info, aweme2.videoMaskInfo);
        aweme2.linkMatch = com$ss$ugc$aweme$proto$LinkMatchStructV2$$com$ss$android$ugc$aweme$search$caption$LinkMatch(vlU.link_match, aweme2.linkMatch);
        aweme2.videoReplyStruct = com$ss$ugc$aweme$proto$VideoReplyStructV2$$com$ss$android$ugc$aweme$feed$model$VideoReplyStruct(vlU.video_reply_info, aweme2.videoReplyStruct);
        aweme2.anchors = List$com$ss$ugc$aweme$proto$AnchorCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct(vlU.anchors, aweme2.anchors);
        aweme2.hybridLabels = List$com$ss$ugc$aweme$proto$HybridLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel(vlU.hybrid_label, aweme2.hybridLabels);
        aweme2.relationRecommendInfo = com$ss$ugc$aweme$proto$RelationRecommendStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRelationRecommendModel(vlU.relation_recommend_info, aweme2.relationRecommendInfo);
        aweme2.userProfileInitInfo = com$ss$ugc$aweme$proto$UserProfileStructV2$$com$ss$android$ugc$aweme$feed$model$UserProfileInitInfo(vlU.user_profile_init_info, aweme2.userProfileInitInfo);
        aweme2.withSurvey = 0H1.LIZ(vlU.with_survey, aweme2.withSurvey);
        aweme2.douDiscountMixInfo = com$ss$ugc$aweme$proto$AwemeSearchStructV2$$com$ss$android$ugc$aweme$feed$model$HotSearchInfo(vlU.dou_discount_mix_info, aweme2.douDiscountMixInfo);
        aweme2.awemeACLShareInfo = com$ss$ugc$aweme$proto$AwemeACLStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeACLShare(vlU.aweme_acl, aweme2.awemeACLShareInfo);
        aweme2.activity = com$ss$ugc$aweme$proto$AwemeActivityStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivity(vlU.activity, aweme2.activity);
        aweme2.stitchSetting = ClientSettings$Stitch.get(0H1.LIZ(vlU.item_stitch, ClientSettings$Stitch.get(aweme2.stitchSetting)));
        List geofencingRegions;
        if (vlU.geofencing_regions == null) {
            geofencingRegions = aweme2.geofencingRegions;
        }
        else {
            geofencingRegions = vlU.geofencing_regions;
        }
        aweme2.geofencingRegions = geofencingRegions;
        String anchorsExtras;
        if (vlU.anchors_extras == null) {
            anchorsExtras = aweme2.anchorsExtras;
        }
        else {
            anchorsExtras = vlU.anchors_extras;
        }
        aweme2.anchorsExtras = anchorsExtras;
        aweme2.allowGift = 0H1.LIZ(vlU.allow_gift, aweme2.allowGift);
        aweme2.mutualRelation = com$ss$ugc$aweme$proto$MutualStructV2$$com$ss$android$ugc$aweme$friends$model$MutualStruct(vlU.mutual_relation, aweme2.mutualRelation);
        aweme2.videoMaskInfos = List$com$ss$ugc$aweme$proto$MaskStructV2$$List$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo(vlU.mask_infos, aweme2.videoMaskInfos);
        aweme2.boost = com$ss$ugc$aweme$proto$BoostStructV2$$com$ss$android$ugc$aweme$feed$model$Boost(vlU.boost_tag_info, aweme2.boost);
        aweme2.bottomBarModel = com$ss$ugc$aweme$proto$BottomBarStructV2$$com$ss$android$ugc$aweme$feed$model$BottomBarModel(vlU.bottom_bar, aweme2.bottomBarModel);
        aweme2.playlist_info = com$ss$ugc$aweme$proto$PlaylistInfoV2$$com$ss$android$ugc$aweme$feed$model$PlayListInfo(vlU.playlist_info, aweme2.playlist_info);
        aweme2.soundExemption = 0H1.LIZ(vlU.sound_exemption, aweme2.soundExemption);
        aweme2.playlistBlocked = 0H1.LIZ(vlU.playlist_blocked, aweme2.playlistBlocked);
        String partN;
        if (vlU.part_n == null) {
            partN = aweme2.partN;
        }
        else {
            partN = vlU.part_n;
        }
        aweme2.partN = partN;
        aweme2.greenScreenMaterialList = List$com$ss$ugc$aweme$proto$GreenScreenMaterialV2$$List$com$ss$android$ugc$aweme$feed$model$GreenScreenMaterial(vlU.green_screen_materials, aweme2.greenScreenMaterialList);
        aweme2.trendingBar = com$ss$ugc$aweme$proto$TrendingBarStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTrendingBar(vlU.trending_bar, aweme2.trendingBar);
        aweme2.userStory = com$ss$ugc$aweme$proto$UserStoryV2$$com$ss$android$ugc$aweme$feed$model$story$UserStory(vlU.user_story, aweme2.userStory);
        aweme2.story = com$ss$ugc$aweme$proto$StoryMetadataV2$$com$ss$android$ugc$aweme$feed$model$story$Story(vlU.story_metadata, aweme2.story);
        aweme2.interactPermission = com$ss$ugc$aweme$proto$InteractPermissionV2$$com$ss$android$ugc$aweme$feed$model$InteractPermission(vlU.interact_permission, aweme2.interactPermission);
        String mItemDistributeSource;
        if (vlU.item_distribute_source == null) {
            mItemDistributeSource = aweme2.mItemDistributeSource;
        }
        else {
            mItemDistributeSource = vlU.item_distribute_source;
        }
        aweme2.mItemDistributeSource = mItemDistributeSource;
        aweme2.questionInfo = List$com$ss$ugc$aweme$proto$QuestionInfoV2$$List$com$ss$android$ugc$aweme$question$QuestionInfo(vlU.question_list, aweme2.questionInfo);
        aweme2.audio = com$ss$ugc$aweme$proto$AudioStructV2$$com$ss$android$ugc$aweme$feed$model$Audio(vlU.audio, aweme2.audio);
        aweme2.upvoteReason = com$ss$ugc$aweme$proto$UpvoteReasonV2$$com$ss$android$ugc$aweme$feed$model$upvote$UpvoteReason(vlU.upvote_reason, aweme2.upvoteReason);
        aweme2.deduplicationType = 0H1.LIZ(vlU.deduplication_type, aweme2.deduplicationType);
        aweme2.interactionTagInfo = com$ss$ugc$aweme$proto$InteractionTagInfoV2$$com$ss$android$ugc$aweme$feed$model$InteractionTagInfo(vlU.interaction_tag_info, aweme2.interactionTagInfo);
        String contentDesc;
        if (vlU.content_desc == null) {
            contentDesc = aweme2.contentDesc;
        }
        else {
            contentDesc = vlU.content_desc;
        }
        aweme2.contentDesc = contentDesc;
        aweme2.contentDescExtra = List$com$ss$ugc$aweme$proto$TextExtraStructV2$$List$com$ss$android$ugc$aweme$model$TextExtraStruct(vlU.content_desc_extra, aweme2.contentDescExtra);
        aweme2.duettedInfo = com$ss$ugc$aweme$proto$DuetInfoV2$$com$ss$android$ugc$aweme$feed$model$DuetInfo(vlU.duet_info, aweme2.duettedInfo);
        aweme2.mItemSourceCategory = 0H1.LIZ(vlU.item_source_category, aweme2.mItemSourceCategory);
        aweme2.enablePosAdjust = 0H1.LIZ(vlU.enable_pos_adjust, aweme2.enablePosAdjust);
        aweme2.enableAdDrop = 0H1.LIZ(vlU.enable_ad_drop, aweme2.enableAdDrop);
        aweme2.predPlaytime = 0H1.LIZ(vlU.pred_playtime, aweme2.predPlaytime);
        List gapList;
        if (vlU.gap_list == null) {
            gapList = aweme2.gapList;
        }
        else {
            gapList = vlU.gap_list;
        }
        aweme2.gapList = gapList;
        aweme2.isClientCache = 0H1.LIZ(vlU.is_client_cache, aweme2.isClientCache);
        aweme2.followUpPublishFromId = 0H1.LIZ(vlU.follow_up_publish_from_id, aweme2.followUpPublishFromId);
        aweme2.trendingBarFYP = com$ss$ugc$aweme$proto$TrendingBarForYouPageStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTrendingBar(vlU.trending_bar_fyp, aweme2.trendingBarFYP);
        aweme2.dsp = com$ss$ugc$aweme$proto$MusicDspStructV2$$com$ss$android$ugc$aweme$music$model$Dsp(vlU.music_dsp_info, aweme2.dsp);
        aweme2.disableSearchTrendingBar = 0H1.LIZ(vlU.disable_search_trending_bar, aweme2.disableSearchTrendingBar);
        aweme2.photoModeImageInfo = com$ss$ugc$aweme$proto$ImageConsumptionInfoV2$$com$ss$android$ugc$aweme$feed$model$PhotoModeImageInfo(vlU.image_post_info, aweme2.photoModeImageInfo);
        aweme2.commentSuggestWordList = com$ss$ugc$aweme$proto$SuggestWordListV2$$com$ss$android$ugc$aweme$feed$model$search$CommentSuggestWordList(vlU.suggest_words, aweme2.commentSuggestWordList);
        aweme2.groupIdList = com$ss$ugc$aweme$proto$ItemGroupIdListV2$$com$ss$android$ugc$aweme$feed$model$GroupIdListStruct(vlU.GroupIdList, aweme2.groupIdList);
        String commercialVideoInfo;
        if (vlU.commercial_video_info == null) {
            commercialVideoInfo = aweme2.commercialVideoInfo;
        }
        else {
            commercialVideoInfo = vlU.commercial_video_info;
        }
        aweme2.commercialVideoInfo = commercialVideoInfo;
        Boolean allowReuseOriginalSound;
        if (vlU.allow_reuse_original_sound == null) {
            allowReuseOriginalSound = aweme2.allowReuseOriginalSound;
        }
        else {
            allowReuseOriginalSound = vlU.allow_reuse_original_sound;
        }
        aweme2.allowReuseOriginalSound = allowReuseOriginalSound;
        aweme2.musicBeginTime = 0H1.LIZ(vlU.music_begin_time_in_ms, aweme2.musicBeginTime);
        aweme2.musicEndTime = 0H1.LIZ(vlU.music_end_time_in_ms, aweme2.musicEndTime);
        aweme2.retryType = 0H1.LIZ(vlU.retry_type, aweme2.retryType);
        aweme2.upvotePreload = com$ss$ugc$aweme$proto$UpvotePreloadStructV2$$com$ss$android$ugc$aweme$feed$model$UpvotePreloadStruct(vlU.upvote_preload, aweme2.upvotePreload);
        aweme2.commerceRerankInfo = com$ss$ugc$aweme$proto$CommerceRerankInfo$$com$ss$android$ugc$aweme$feed$model$commercialize$CommerceRerankInfo(vlU.commerce_rerank_info, aweme2.commerceRerankInfo);
        aweme2.share2StoryStruct = com$ss$ugc$aweme$proto$ShareToStoryStructV2$$com$ss$android$ugc$aweme$feed$model$ShareToStoryStruct(vlU.share_to_story_info, aweme2.share2StoryStruct);
        aweme2.storyModel = com$ss$ugc$aweme$proto$AdStoryVideoStruct$$com$ss$android$ugc$aweme$feed$model$StoryVideo(vlU.ad_story_video, aweme2.storyModel);
        aweme2.nearbyInfo = com$ss$ugc$aweme$proto$NearbyInfoStructV2$$com$ss$android$ugc$aweme$feed$model$NearbyInfo(vlU.nearby_info, aweme2.nearbyInfo);
        aweme2.brandContentAccounts = List$com$ss$ugc$aweme$proto$UserStructV2$$List$com$ss$android$ugc$aweme$commercialize$model$BrandedContentAccount(vlU.branded_content_accounts, aweme2.brandContentAccounts);
        aweme2.recReasons = com$ss$ugc$aweme$proto$RecReasonStruct$$com$ss$android$ugc$aweme$feed$model$RecReasons(vlU.rec_reason, aweme2.recReasons);
        aweme2.needTTSWatermarkWhenDownload = 0H1.LIZ(vlU.should_add_creator_tts_watermark_when_downloading, aweme2.needTTSWatermarkWhenDownload);
        aweme2.poiDataStruct = com$ss$ugc$aweme$proto$PoiDataStructV2$$com$ss$android$ugc$aweme$poi$PoiDataStruct(vlU.poi_data, aweme2.poiDataStruct);
        aweme2.nowPostInfo = com$ss$ugc$aweme$proto$NowPostInfoV2$$com$ss$android$ugc$aweme$now$NowPostInfo(vlU.now_posts, aweme2.nowPostInfo);
        return aweme2;
    }
    
    public static BannerTip com$ss$ugc$aweme$proto$BannerTipV2$$com$ss$android$ugc$aweme$feed$model$BannerTip(final VgB vgB, final BannerTip bannerTip) {
        if (vgB == null) {
            return bannerTip;
        }
        final BannerTip bannerTip2 = new BannerTip();
        bannerTip2.bannerType = 0H1.LIZ(vgB.banner_type, bannerTip2.bannerType);
        String bannerTxt;
        if (vgB.banner_txt == null) {
            bannerTxt = bannerTip2.bannerTxt;
        }
        else {
            bannerTxt = vgB.banner_txt;
        }
        bannerTip2.bannerTxt = bannerTxt;
        bannerTip2.linkType = 0H1.LIZ(vgB.link_type, bannerTip2.linkType);
        String linkUrl;
        if (vgB.link_url == null) {
            linkUrl = bannerTip2.linkUrl;
        }
        else {
            linkUrl = vgB.link_url;
        }
        bannerTip2.linkUrl = linkUrl;
        String linkTxt;
        if (vgB.link_txt == null) {
            linkTxt = bannerTip2.linkTxt;
        }
        else {
            linkTxt = vgB.link_txt;
        }
        bannerTip2.linkTxt = linkTxt;
        return bannerTip2;
    }
    
    public static BigThumb com$ss$ugc$aweme$proto$BigThumbV2$$com$ss$android$ugc$aweme$feed$model$BigThumb(final VuD vuD, final BigThumb bigThumb) {
        if (vuD == null) {
            return bigThumb;
        }
        final BigThumb bigThumb2 = new BigThumb();
        bigThumb2.imgNum = 0H1.LIZ(vuD.img_num, bigThumb2.imgNum);
        String uri;
        if (vuD.uri == null) {
            uri = bigThumb2.uri;
        }
        else {
            uri = vuD.uri;
        }
        bigThumb2.uri = uri;
        String imgUrl;
        if (vuD.img_url == null) {
            imgUrl = bigThumb2.imgUrl;
        }
        else {
            imgUrl = vuD.img_url;
        }
        bigThumb2.imgUrl = imgUrl;
        bigThumb2.imgXSize = 0H1.LIZ(vuD.img_x_size, bigThumb2.imgXSize);
        bigThumb2.imgYSize = 0H1.LIZ(vuD.img_y_size, bigThumb2.imgYSize);
        bigThumb2.imgXLen = 0H1.LIZ(vuD.img_x_len, bigThumb2.imgXLen);
        bigThumb2.imgYLen = 0H1.LIZ(vuD.img_y_len, bigThumb2.imgYLen);
        bigThumb2.duration = 0H1.LIZ(vuD.duration, bigThumb2.duration);
        bigThumb2.interval = 0H1.LIZ(vuD.interval, bigThumb2.interval);
        String fext;
        if (vuD.fext == null) {
            fext = bigThumb2.fext;
        }
        else {
            fext = vuD.fext;
        }
        bigThumb2.fext = fext;
        List imgUris;
        if (vuD.img_uris == null) {
            imgUris = bigThumb2.imgUris;
        }
        else {
            imgUris = vuD.img_uris;
        }
        bigThumb2.imgUris = imgUris;
        List imgUrls;
        if (vuD.img_urls == null) {
            imgUrls = bigThumb2.imgUrls;
        }
        else {
            imgUrls = vuD.img_urls;
        }
        bigThumb2.imgUrls = imgUrls;
        return bigThumb2;
    }
    
    public static BitRate com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate(final Vdr vdr, final BitRate bitRate) {
        if (vdr == null) {
            return bitRate;
        }
        final BitRate bitRate2 = new BitRate();
        String gearName;
        if (vdr.gear_name == null) {
            gearName = bitRate2.gearName;
        }
        else {
            gearName = vdr.gear_name;
        }
        bitRate2.gearName = gearName;
        bitRate2.qualityType = 0H1.LIZ(vdr.quality_type, bitRate2.qualityType);
        bitRate2.bitRate = 0H1.LIZ(vdr.bit_rate, bitRate2.bitRate);
        bitRate2.playAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdr.play_addr, bitRate2.playAddr);
        bitRate2.isBytevc1 = 0H1.LIZ(vdr.is_bytevc1, bitRate2.isBytevc1);
        return bitRate2;
    }
    
    public static MultiImageUrlInfo com$ss$ugc$aweme$proto$BitrateImagePostInfoV2$$com$ss$android$ugc$aweme$feed$model$MultiImageUrlInfo(final Vcq vcq, final MultiImageUrlInfo multiImageUrlInfo) {
        if (vcq == null) {
            return multiImageUrlInfo;
        }
        final MultiImageUrlInfo multiImageUrlInfo2 = new MultiImageUrlInfo();
        String name;
        if (vcq.name == null) {
            name = multiImageUrlInfo2.name;
        }
        else {
            name = vcq.name;
        }
        multiImageUrlInfo2.name = name;
        multiImageUrlInfo2.image = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vcq.bitrate_image, multiImageUrlInfo2.image);
        return multiImageUrlInfo2;
    }
    
    public static BlueVBrandInfo com$ss$ugc$aweme$proto$BlueVBrandInfoStructV2$$com$ss$android$ugc$aweme$profile$model$BlueVBrandInfo(final Vsu vsu, final BlueVBrandInfo blueVBrandInfo) {
        if (vsu == null) {
            return blueVBrandInfo;
        }
        final BlueVBrandInfo blueVBrandInfo2 = new BlueVBrandInfo();
        blueVBrandInfo2.categoryId = 0H1.LIZ(vsu.category_id, blueVBrandInfo2.categoryId);
        String categoryName;
        if (vsu.category_name == null) {
            categoryName = blueVBrandInfo2.categoryName;
        }
        else {
            categoryName = vsu.category_name;
        }
        blueVBrandInfo2.categoryName = categoryName;
        blueVBrandInfo2.brandId = 0H1.LIZ(vsu.brand_id, blueVBrandInfo2.brandId);
        String brandName;
        if (vsu.brand_name == null) {
            brandName = blueVBrandInfo2.brandName;
        }
        else {
            brandName = vsu.brand_name;
        }
        blueVBrandInfo2.brandName = brandName;
        blueVBrandInfo2.logoUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vsu.logo_url, blueVBrandInfo2.logoUrl);
        blueVBrandInfo2.heat = 0H1.LIZ(vsu.heat, blueVBrandInfo2.heat);
        blueVBrandInfo2.rank = 0H1.LIZ(vsu.rank, blueVBrandInfo2.rank);
        blueVBrandInfo2.rankDiff = 0H1.LIZ(vsu.rank_diff, blueVBrandInfo2.rankDiff);
        String tagName;
        if (vsu.tag_name == null) {
            tagName = blueVBrandInfo2.tagName;
        }
        else {
            tagName = vsu.tag_name;
        }
        blueVBrandInfo2.tagName = tagName;
        return blueVBrandInfo2;
    }
    
    public static Boost com$ss$ugc$aweme$proto$BoostStructV2$$com$ss$android$ugc$aweme$feed$model$Boost(final VcP vcP, final Boost boost) {
        if (vcP == null) {
            return boost;
        }
        final Boost boost2 = new Boost();
        String text;
        if (vcP.label == null) {
            text = boost2.text;
        }
        else {
            text = vcP.label;
        }
        boost2.text = text;
        String bgColor;
        if (vcP.color == null) {
            bgColor = boost2.bgColor;
        }
        else {
            bgColor = vcP.color;
        }
        boost2.bgColor = bgColor;
        String textColor;
        if (vcP.color_text == null) {
            textColor = boost2.textColor;
        }
        else {
            textColor = vcP.color_text;
        }
        boost2.textColor = textColor;
        return boost2;
    }
    
    public static BottomBarModel com$ss$ugc$aweme$proto$BottomBarStructV2$$com$ss$android$ugc$aweme$feed$model$BottomBarModel(final Vcz vcz, final BottomBarModel bottomBarModel) {
        if (vcz == null) {
            return bottomBarModel;
        }
        final BottomBarModel bottomBarModel2 = new BottomBarModel();
        String content;
        if (vcz.content == null) {
            content = bottomBarModel2.content;
        }
        else {
            content = vcz.content;
        }
        bottomBarModel2.content = content;
        bottomBarModel2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vcz.icon, bottomBarModel2.icon);
        bottomBarModel2.type = 0H1.LIZ(vcz.type, bottomBarModel2.type);
        return bottomBarModel2;
    }
    
    public static LiveAwesomeSplashInfo com$ss$ugc$aweme$proto$CNYStructV2$$com$ss$android$ugc$aweme$feed$model$livesplash$LiveAwesomeSplashInfo(final Vat vat, LiveAwesomeSplashInfo liveAwesomeSplashInfo) {
        if (vat == null) {
            return liveAwesomeSplashInfo;
        }
        liveAwesomeSplashInfo = new LiveAwesomeSplashInfo();
        liveAwesomeSplashInfo.startTime = 0H1.LIZ(vat.start_time, liveAwesomeSplashInfo.startTime);
        liveAwesomeSplashInfo.endTime = 0H1.LIZ(vat.end_time, liveAwesomeSplashInfo.endTime);
        liveAwesomeSplashInfo.topviewValid = 0H1.LIZ(vat.topview_valid, liveAwesomeSplashInfo.topviewValid);
        liveAwesomeSplashInfo.feedShowTime = 0H1.LIZ(vat.feed_show_time, liveAwesomeSplashInfo.feedShowTime);
        String liveData;
        if (vat.live_info == null) {
            liveData = liveAwesomeSplashInfo.liveData;
        }
        else {
            liveData = vat.live_info;
        }
        liveAwesomeSplashInfo.liveData = liveData;
        return liveAwesomeSplashInfo;
    }
    
    public static 3kr com$ss$ugc$aweme$proto$CaptionAnchorStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionAnchor(final VdD vdD, final 3kr 3kr) {
        if (vdD == null) {
            return 3kr;
        }
        final 3kr 3kr2 = new 3kr();
        String keyword;
        if (vdD.keyword == null) {
            keyword = 3kr2.keyword;
        }
        else {
            keyword = vdD.keyword;
        }
        3kr2.keyword = keyword;
        String link;
        if (vdD.link == null) {
            link = 3kr2.link;
        }
        else {
            link = vdD.link;
        }
        3kr2.link = link;
        3kr2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdD.icon, 3kr2.icon);
        return 3kr2;
    }
    
    public static 3ky com$ss$ugc$aweme$proto$CaptionInfoStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionInfo(final VUv vUv, final 3ky 3ky) {
        if (vUv == null) {
            return 3ky;
        }
        final 3ky 3ky2 = new 3ky();
        String keyword;
        if (vUv.keyword == null) {
            keyword = 3ky2.keyword;
        }
        else {
            keyword = vUv.keyword;
        }
        3ky2.keyword = keyword;
        String link;
        if (vUv.link == null) {
            link = 3ky2.link;
        }
        else {
            link = vUv.link;
        }
        3ky2.link = link;
        return 3ky2;
    }
    
    public static CaptionItemModel com$ss$ugc$aweme$proto$CaptionStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionItemModel(final Vaa vaa, final CaptionItemModel captionItemModel) {
        if (vaa == null) {
            return captionItemModel;
        }
        final CaptionItemModel captionItemModel2 = new CaptionItemModel();
        String languageName;
        if (vaa.lang == null) {
            languageName = captionItemModel2.languageName;
        }
        else {
            languageName = vaa.lang;
        }
        captionItemModel2.languageName = languageName;
        captionItemModel2.languageId = 0H1.LIZ(vaa.language_id, captionItemModel2.languageId);
        String url;
        if (vaa.url == null) {
            url = captionItemModel2.url;
        }
        else {
            url = vaa.url;
        }
        captionItemModel2.url = url;
        captionItemModel2.expire = 0H1.LIZ(vaa.expire, captionItemModel2.expire);
        String format;
        if (vaa.caption_format == null) {
            format = captionItemModel2.format;
        }
        else {
            format = vaa.caption_format;
        }
        captionItemModel2.format = format;
        captionItemModel2.complaintId = 0H1.LIZ(vaa.complaint_id, captionItemModel2.complaintId);
        captionItemModel2.isAutoGenerated = 0H1.LIZ(vaa.is_auto_generated, captionItemModel2.isAutoGenerated);
        captionItemModel2.subId = 0H1.LIZ(vaa.sub_id, captionItemModel2.subId);
        String versionType;
        if (vaa.sub_version == null) {
            versionType = captionItemModel2.versionType;
        }
        else {
            versionType = vaa.sub_version;
        }
        captionItemModel2.versionType = versionType;
        captionItemModel2.claSubtitleId = 0H1.LIZ(vaa.cla_subtitle_id, captionItemModel2.claSubtitleId);
        captionItemModel2.translatorId = 0H1.LIZ(vaa.translator_id, captionItemModel2.translatorId);
        String languageCode;
        if (vaa.language_code == null) {
            languageCode = captionItemModel2.languageCode;
        }
        else {
            languageCode = vaa.language_code;
        }
        captionItemModel2.languageCode = languageCode;
        return captionItemModel2;
    }
    
    public static Challenge com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge(final Vlh vlh, final Challenge challenge) {
        if (vlh == null) {
            return challenge;
        }
        final Challenge challenge2 = new Challenge();
        String cid;
        if (vlh.cid == null) {
            cid = challenge2.cid;
        }
        else {
            cid = vlh.cid;
        }
        challenge2.cid = cid;
        String challengeName;
        if (vlh.cha_name == null) {
            challengeName = challenge2.challengeName;
        }
        else {
            challengeName = vlh.cha_name;
        }
        challenge2.challengeName = challengeName;
        String desc;
        if (vlh.desc == null) {
            desc = challenge2.desc;
        }
        else {
            desc = vlh.desc;
        }
        challenge2.desc = desc;
        String schema;
        if (vlh.schema == null) {
            schema = challenge2.schema;
        }
        else {
            schema = vlh.schema;
        }
        challenge2.schema = schema;
        challenge2.author = com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(vlh.author, challenge2.author);
        challenge2.userCount = 0H1.LIZ(vlh.user_count, challenge2.userCount);
        challenge2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(vlh.share_info, challenge2.shareInfo);
        challenge2.connectMusics = List$com$ss$ugc$aweme$proto$MusicStructV2$$List$com$ss$android$ugc$aweme$music$model$Music(vlh.connect_music, challenge2.connectMusics);
        challenge2.type = 0H1.LIZ(vlh.type, challenge2.type);
        challenge2.subType = 0H1.LIZ(vlh.sub_type, challenge2.subType);
        challenge2.backgroundImageUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlh.background_image_url, challenge2.backgroundImageUrl);
        String stickerId;
        if (vlh.sticker_id == null) {
            stickerId = challenge2.stickerId;
        }
        else {
            stickerId = vlh.sticker_id;
        }
        challenge2.stickerId = stickerId;
        String linkText;
        if (vlh.link_text == null) {
            linkText = challenge2.linkText;
        }
        else {
            linkText = vlh.link_text;
        }
        challenge2.linkText = linkText;
        String linkAction;
        if (vlh.link_action == null) {
            linkAction = challenge2.linkAction;
        }
        else {
            linkAction = vlh.link_action;
        }
        challenge2.linkAction = linkAction;
        challenge2.pgcshow = 0H1.LIZ(vlh.is_pgcshow, challenge2.pgcshow);
        challenge2.collectStatus = 0H1.LIZ(vlh.collect_stat, challenge2.collectStatus);
        challenge2.coverItem = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlh.cover_item, challenge2.coverItem);
        challenge2.isChallenge = 0H1.LIZ(vlh.is_challenge, challenge2.isChallenge);
        challenge2.viewCount = 0H1.LIZ(vlh.view_count, challenge2.viewCount);
        challenge2.challengeDisclaimer = com$ss$ugc$aweme$proto$DisclaimerStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeDisclaimer(vlh.disclaimer, challenge2.challengeDisclaimer);
        challenge2.allowUploadCover = 0H1.LIZ(vlh.allow_upload_cover, challenge2.allowUploadCover);
        challenge2.isCommerceAndValid = 0H1.LIZ(vlh.is_commerce, challenge2.isCommerceAndValid);
        String challengeProfileUrl;
        if (vlh.hashtag_profile == null) {
            challengeProfileUrl = challenge2.challengeProfileUrl;
        }
        else {
            challengeProfileUrl = vlh.hashtag_profile;
        }
        challenge2.challengeProfileUrl = challengeProfileUrl;
        String challengeBgUrl;
        if (vlh.cover_photo == null) {
            challengeBgUrl = challenge2.challengeBgUrl;
        }
        else {
            challengeBgUrl = vlh.cover_photo;
        }
        challenge2.challengeBgUrl = challengeBgUrl;
        challenge2.isHotSearch = 0H1.LIZ(vlh.is_hot_search, challenge2.isHotSearch);
        challenge2.linkType = 0H1.LIZ(vlh.link_type, challenge2.linkType);
        challenge2.challengeAnnouncement = com$ss$ugc$aweme$proto$AnnouncementStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeAnnouncement(vlh.announcement_info, challenge2.challengeAnnouncement);
        challenge2.moduleType = 0H1.LIZ(vlh.module_type, challenge2.moduleType);
        String profileTagUrl;
        if (vlh.profile_tag == null) {
            profileTagUrl = challenge2.profileTagUrl;
        }
        else {
            profileTagUrl = vlh.profile_tag;
        }
        challenge2.profileTagUrl = profileTagUrl;
        List attrs;
        if (vlh.cha_attrs == null) {
            attrs = challenge2.attrs;
        }
        else {
            attrs = vlh.cha_attrs;
        }
        challenge2.attrs = attrs;
        challenge2.transfrom = com$ss$ugc$aweme$proto$IconButtonStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeTransform(vlh.button, challenge2.transfrom);
        return challenge2;
    }
    
    public static CaptionModel com$ss$ugc$aweme$proto$ClaStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionModel(final VaX vaX, CaptionModel captionModel) {
        if (vaX == null) {
            return captionModel;
        }
        captionModel = new CaptionModel();
        captionModel.hasOriginalAudio = 0H1.LIZ(vaX.has_original_audio, captionModel.hasOriginalAudio);
        captionModel.enableAutoCaption = 0H1.LIZ(vaX.enable_auto_caption, captionModel.enableAutoCaption);
        captionModel.originalCaptionLanguage = com$ss$ugc$aweme$proto$OriginalLanguageStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionLanguage(vaX.original_language_info, captionModel.originalCaptionLanguage);
        captionModel.captionList = List$com$ss$ugc$aweme$proto$CaptionStructV2$$List$com$ss$android$ugc$aweme$feed$model$CaptionItemModel(vaX.caption_infos, captionModel.captionList);
        Long creatorEditedCaptionId;
        if (vaX.creator_edited_caption_id == null) {
            creatorEditedCaptionId = captionModel.creatorEditedCaptionId;
        }
        else {
            creatorEditedCaptionId = vaX.creator_edited_caption_id;
        }
        captionModel.creatorEditedCaptionId = creatorEditedCaptionId;
        return captionModel;
    }
    
    public static P9T com$ss$ugc$aweme$proto$CommerceActivityStructV2$$com$ss$android$ugc$aweme$commerce$model$CommerceActivityStruct(final VdA vdA, final P9T p9T) {
        if (vdA == null) {
            return p9T;
        }
        final P9T p9T2 = new P9T();
        p9T2.actType = 0H1.LIZ(vdA.act_type, p9T2.actType);
        p9T2.image = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdA.image, p9T2.image);
        String jumpWebUrl;
        if (vdA.jump_web_url == null) {
            jumpWebUrl = p9T2.jumpWebUrl;
        }
        else {
            jumpWebUrl = vdA.jump_web_url;
        }
        p9T2.jumpWebUrl = jumpWebUrl;
        String jumpOpenUrl;
        if (vdA.jump_open_url == null) {
            jumpOpenUrl = p9T2.jumpOpenUrl;
        }
        else {
            jumpOpenUrl = vdA.jump_open_url;
        }
        p9T2.jumpOpenUrl = jumpOpenUrl;
        String title;
        if (vdA.title == null) {
            title = p9T2.title;
        }
        else {
            title = vdA.title;
        }
        p9T2.title = title;
        p9T2.startTime = 0H1.LIZ(vdA.start_time, p9T2.startTime);
        p9T2.endTime = 0H1.LIZ(vdA.end_time, p9T2.endTime);
        p9T2.timeRange = List$com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$List$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange(vdA.time_range, p9T2.timeRange);
        p9T2.trackUrlList = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdA.track_url_list, p9T2.trackUrlList);
        p9T2.clickTrackUrlList = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdA.click_track_url_list, p9T2.clickTrackUrlList);
        return p9T2;
    }
    
    public static CommerceConfigData com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(final VV7 vv7, CommerceConfigData commerceConfigData) {
        if (vv7 == null) {
            return commerceConfigData;
        }
        commerceConfigData = new CommerceConfigData();
        commerceConfigData.type = 0H1.LIZ(vv7.type, commerceConfigData.type);
        commerceConfigData.itemLikeEggData = com$ss$ugc$aweme$proto$ItemLikeEggDataV2$$com$ss$android$ugc$aweme$feed$model$ItemLikeEggData(vv7.item_like_egg, commerceConfigData.itemLikeEggData);
        commerceConfigData.itemCommentEggGroup = 2ob.LIZ(vv7.data, commerceConfigData.itemCommentEggGroup);
        return commerceConfigData;
    }
    
    public static BxG com$ss$ugc$aweme$proto$CommerceInfoStructV2$$com$ss$android$ugc$aweme$commerce$CommerceInfo(final Vdu vdu, final BxG bxG) {
        if (vdu == null) {
            return bxG;
        }
        final BxG bxG2 = new BxG();
        bxG2.headImageUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdu.head_image_url, bxG2.headImageUrl);
        bxG2.offlineInfoList = List$com$ss$ugc$aweme$proto$OfflineInfoStructV2$$List$com$ss$android$ugc$aweme$commerce$OfflineInfo(vdu.offline_info_list, bxG2.offlineInfoList);
        bxG2.challengeList = List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge(vdu.challenge_list, bxG2.challengeList);
        String quickShopUrl;
        if (vdu.quick_shop_url == null) {
            quickShopUrl = bxG2.quickShopUrl;
        }
        else {
            quickShopUrl = vdu.quick_shop_url;
        }
        bxG2.quickShopUrl = quickShopUrl;
        String quickShopName;
        if (vdu.quick_shop_name == null) {
            quickShopName = bxG2.quickShopName;
        }
        else {
            quickShopName = vdu.quick_shop_name;
        }
        bxG2.quickShopName = quickShopName;
        String siteId;
        if (vdu.site_id == null) {
            siteId = bxG2.siteId;
        }
        else {
            siteId = vdu.site_id;
        }
        bxG2.siteId = siteId;
        return bxG2;
    }
    
    public static CommercePermissionStruct com$ss$ugc$aweme$proto$CommercePermissionStructV2$$com$ss$android$ugc$aweme$profile$model$CommercePermissionStruct(final Van van, CommercePermissionStruct commercePermissionStruct) {
        if (van == null) {
            return commercePermissionStruct;
        }
        commercePermissionStruct = new CommercePermissionStruct();
        commercePermissionStruct.topItem = 0H1.LIZ(van.top_item, commercePermissionStruct.topItem);
        commercePermissionStruct.starAtlasOrder = 0H1.LIZ(van.star_atlas_order, commercePermissionStruct.starAtlasOrder);
        return commercePermissionStruct;
    }
    
    public static Nps com$ss$ugc$aweme$proto$CommercePitayaInfo$$com$ss$android$ugc$aweme$commercialize$model$CommercePitayaInfo(final Va0 va0, final Nps nps) {
        if (va0 == null) {
            return nps;
        }
        final Nps nps2 = new Nps();
        String pitayaUpload;
        if (va0.client_ai_upload_json_str == null) {
            pitayaUpload = nps2.pitayaUpload;
        }
        else {
            pitayaUpload = va0.client_ai_upload_json_str;
        }
        nps2.pitayaUpload = pitayaUpload;
        String satiParamForPitaya;
        if (va0.sati_param_for_pitaya == null) {
            satiParamForPitaya = nps2.satiParamForPitaya;
        }
        else {
            satiParamForPitaya = va0.sati_param_for_pitaya;
        }
        nps2.satiParamForPitaya = satiParamForPitaya;
        return nps2;
    }
    
    public static CommerceRerankInfo com$ss$ugc$aweme$proto$CommerceRerankInfo$$com$ss$android$ugc$aweme$feed$model$commercialize$CommerceRerankInfo(final VU8 vu8, final CommerceRerankInfo commerceRerankInfo) {
        if (vu8 == null) {
            return commerceRerankInfo;
        }
        final CommerceRerankInfo commerceRerankInfo2 = new CommerceRerankInfo();
        String itemParamForPitaya;
        if (vu8.item_param_for_pitaya == null) {
            itemParamForPitaya = commerceRerankInfo2.itemParamForPitaya;
        }
        else {
            itemParamForPitaya = vu8.item_param_for_pitaya;
        }
        commerceRerankInfo2.itemParamForPitaya = itemParamForPitaya;
        Long originalItemGap;
        if (vu8.original_item_gap == null) {
            originalItemGap = commerceRerankInfo2.originalItemGap;
        }
        else {
            originalItemGap = vu8.original_item_gap;
        }
        commerceRerankInfo2.originalItemGap = originalItemGap;
        return commerceRerankInfo2;
    }
    
    public static BzL com$ss$ugc$aweme$proto$CommerceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceSticker(final VuJ vuJ, final BzL bzL) {
        if (vuJ == null) {
            return bzL;
        }
        final BzL bzL2 = new BzL();
        String id;
        if (vuJ.id == null) {
            id = bzL2.id;
        }
        else {
            id = vuJ.id;
        }
        bzL2.id = id;
        String adOwnerId;
        if (vuJ.ad_owner_id == null) {
            adOwnerId = bzL2.adOwnerId;
        }
        else {
            adOwnerId = vuJ.ad_owner_id;
        }
        bzL2.adOwnerId = adOwnerId;
        String adOwnerName;
        if (vuJ.ad_owner_name == null) {
            adOwnerName = bzL2.adOwnerName;
        }
        else {
            adOwnerName = vuJ.ad_owner_name;
        }
        bzL2.adOwnerName = adOwnerName;
        String detailDesc;
        if (vuJ.detail_desc == null) {
            detailDesc = bzL2.detailDesc;
        }
        else {
            detailDesc = vuJ.detail_desc;
        }
        bzL2.detailDesc = detailDesc;
        String detailLetters;
        if (vuJ.detail_letters == null) {
            detailLetters = bzL2.detailLetters;
        }
        else {
            detailLetters = vuJ.detail_letters;
        }
        bzL2.detailLetters = detailLetters;
        String detailOpenUrl;
        if (vuJ.detail_open_url == null) {
            detailOpenUrl = bzL2.detailOpenUrl;
        }
        else {
            detailOpenUrl = vuJ.detail_open_url;
        }
        bzL2.detailOpenUrl = detailOpenUrl;
        String detailWebUrl;
        if (vuJ.detail_web_url == null) {
            detailWebUrl = bzL2.detailWebUrl;
        }
        else {
            detailWebUrl = vuJ.detail_web_url;
        }
        bzL2.detailWebUrl = detailWebUrl;
        String detailWebUrlTitle;
        if (vuJ.detail_web_url_title == null) {
            detailWebUrlTitle = bzL2.detailWebUrlTitle;
        }
        else {
            detailWebUrlTitle = vuJ.detail_web_url_title;
        }
        bzL2.detailWebUrlTitle = detailWebUrlTitle;
        String screenDesc;
        if (vuJ.screen_desc == null) {
            screenDesc = bzL2.screenDesc;
        }
        else {
            screenDesc = vuJ.screen_desc;
        }
        bzL2.screenDesc = screenDesc;
        String musicId;
        if (vuJ.music_id == null) {
            musicId = bzL2.musicId;
        }
        else {
            musicId = vuJ.music_id;
        }
        bzL2.musicId = musicId;
        String challengeId;
        if (vuJ.challenge_id == null) {
            challengeId = bzL2.challengeId;
        }
        else {
            challengeId = vuJ.challenge_id;
        }
        bzL2.challengeId = challengeId;
        bzL2.screenIcon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuJ.screen_icon, bzL2.screenIcon);
        bzL2.expireTime = 0H1.LIZ(vuJ.expire_time, bzL2.expireTime);
        bzL2.commerceStickerUnlockInfo = com$ss$ugc$aweme$proto$CommerceStickerUnlockStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceStickerUnlockInfo(vuJ.unlock_info, bzL2.commerceStickerUnlockInfo);
        return bzL2;
    }
    
    public static BzS com$ss$ugc$aweme$proto$CommerceStickerUnlockStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceStickerUnlockInfo(final VbA vbA, final BzS bzS) {
        if (vbA == null) {
            return bzS;
        }
        final BzS bzS2 = new BzS();
        String desc;
        if (vbA.desc == null) {
            desc = bzS2.desc;
        }
        else {
            desc = vbA.desc;
        }
        bzS2.desc = desc;
        String webUrl;
        if (vbA.web_url == null) {
            webUrl = bzS2.webUrl;
        }
        else {
            webUrl = vbA.web_url;
        }
        bzS2.webUrl = webUrl;
        String openUrl;
        if (vbA.open_url == null) {
            openUrl = bzS2.openUrl;
        }
        else {
            openUrl = vbA.open_url;
        }
        bzS2.openUrl = openUrl;
        return bzS2;
    }
    
    public static CommerceUserInfo com$ss$ugc$aweme$proto$CommerceUserStructV2$$com$ss$android$ugc$aweme$profile$model$CommerceUserInfo(final VUb vUb, CommerceUserInfo commerceUserInfo) {
        if (vUb == null) {
            return commerceUserInfo;
        }
        commerceUserInfo = new CommerceUserInfo();
        commerceUserInfo.starAtlas = 0H1.LIZ(vUb.star_atlas, commerceUserInfo.starAtlas);
        commerceUserInfo.showStarAtlasCooperation = 0H1.LIZ(vUb.show_star_atlas_cooperation, commerceUserInfo.showStarAtlasCooperation);
        commerceUserInfo.hasAdEntry = 0H1.LIZ(vUb.has_ads_entry, commerceUserInfo.hasAdEntry);
        commerceUserInfo.linkUserInfo = com$ss$ugc$aweme$proto$LinkUserInfoStructV2$$com$ss$android$ugc$aweme$profile$model$LinkUserInfoStruct(vUb.link_user_info, commerceUserInfo.linkUserInfo);
        commerceUserInfo.adInfluencerType = 0H1.LIZ(vUb.ad_influencer_type, commerceUserInfo.adInfluencerType);
        return commerceUserInfo;
    }
    
    public static DescendantsModel com$ss$ugc$aweme$proto$DescendantStructV2$$com$ss$android$ugc$aweme$feed$model$DescendantsModel(final VU2 vu2, final DescendantsModel descendantsModel) {
        if (vu2 == null) {
            return descendantsModel;
        }
        final DescendantsModel descendantsModel2 = new DescendantsModel();
        List platforms;
        if (vu2.platforms == null) {
            platforms = descendantsModel2.platforms;
        }
        else {
            platforms = vu2.platforms;
        }
        descendantsModel2.platforms = platforms;
        String notifyMsg;
        if (vu2.notify_msg == null) {
            notifyMsg = descendantsModel2.notifyMsg;
        }
        else {
            notifyMsg = vu2.notify_msg;
        }
        descendantsModel2.notifyMsg = notifyMsg;
        return descendantsModel2;
    }
    
    public static ChallengeDisclaimer com$ss$ugc$aweme$proto$DisclaimerStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeDisclaimer(final VV1 vv1, final ChallengeDisclaimer challengeDisclaimer) {
        if (vv1 == null) {
            return challengeDisclaimer;
        }
        final ChallengeDisclaimer challengeDisclaimer2 = new ChallengeDisclaimer();
        String title;
        if (vv1.title == null) {
            title = challengeDisclaimer2.title;
        }
        else {
            title = vv1.title;
        }
        challengeDisclaimer2.title = title;
        String content;
        if (vv1.content == null) {
            content = challengeDisclaimer2.content;
        }
        else {
            content = vv1.content;
        }
        challengeDisclaimer2.content = content;
        return challengeDisclaimer2;
    }
    
    public static DuetInfo com$ss$ugc$aweme$proto$DuetInfoV2$$com$ss$android$ugc$aweme$feed$model$DuetInfo(final VUB vub, DuetInfo duetInfo) {
        if (vub == null) {
            return duetInfo;
        }
        duetInfo = new DuetInfo();
        duetInfo.originalItemDuetCount = 0H1.LIZ(vub.original_item_duetted_count, duetInfo.originalItemDuetCount);
        String originalItemId;
        if (vub.original_item_id == null) {
            originalItemId = duetInfo.originalItemId;
        }
        else {
            originalItemId = vub.original_item_id;
        }
        duetInfo.originalItemId = originalItemId;
        return duetInfo;
    }
    
    public static MusicHighPrecisionDuration com$ss$ugc$aweme$proto$DurationHighPrecisionStructV2$$com$ss$android$ugc$aweme$music$model$MusicHighPrecisionDuration(final VeV veV, MusicHighPrecisionDuration musicHighPrecisionDuration) {
        if (veV == null) {
            return musicHighPrecisionDuration;
        }
        musicHighPrecisionDuration = new MusicHighPrecisionDuration();
        musicHighPrecisionDuration.durationPrecision = 0H1.LIZ(veV.duration_precision, musicHighPrecisionDuration.durationPrecision);
        musicHighPrecisionDuration.shootDurationPrecision = 0H1.LIZ(veV.shoot_duration_precision, musicHighPrecisionDuration.shootDurationPrecision);
        musicHighPrecisionDuration.auditionDurationPrecision = 0H1.LIZ(veV.audition_duration_precision, musicHighPrecisionDuration.auditionDurationPrecision);
        musicHighPrecisionDuration.videoDurationPrecision = 0H1.LIZ(veV.video_duration_precision, musicHighPrecisionDuration.videoDurationPrecision);
        return musicHighPrecisionDuration;
    }
    
    public static EffectArtistDetail com$ss$ugc$aweme$proto$EffectArtistStructV2$$com$ss$android$ugc$aweme$profile$model$EffectArtistDetail(final JHF jhf, EffectArtistDetail effectArtistDetail) {
        if (jhf == null) {
            return effectArtistDetail;
        }
        effectArtistDetail = new EffectArtistDetail();
        effectArtistDetail.total = 0H1.LIZ(jhf.total, effectArtistDetail.total);
        return effectArtistDetail;
    }
    
    public static ExternalRecommendReasonStruct com$ss$ugc$aweme$proto$ExternalRecommendReasonStructV2$$com$ss$android$ugc$aweme$profile$model$ExternalRecommendReasonStruct(final VbD vbD, final ExternalRecommendReasonStruct externalRecommendReasonStruct) {
        if (vbD == null) {
            return externalRecommendReasonStruct;
        }
        final ExternalRecommendReasonStruct externalRecommendReasonStruct2 = new ExternalRecommendReasonStruct();
        String reason;
        if (vbD.reason == null) {
            reason = externalRecommendReasonStruct2.reason;
        }
        else {
            reason = vbD.reason;
        }
        externalRecommendReasonStruct2.reason = reason;
        String hashedPhoneNumber;
        if (vbD.hashed_phone_number == null) {
            hashedPhoneNumber = externalRecommendReasonStruct2.hashedPhoneNumber;
        }
        else {
            hashedPhoneNumber = vbD.hashed_phone_number;
        }
        externalRecommendReasonStruct2.hashedPhoneNumber = hashedPhoneNumber;
        String externalUsername;
        if (vbD.external_username == null) {
            externalUsername = externalRecommendReasonStruct2.externalUsername;
        }
        else {
            externalUsername = vbD.external_username;
        }
        externalRecommendReasonStruct2.externalUsername = externalUsername;
        return externalRecommendReasonStruct2;
    }
    
    public static ExternalMusicInfo com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(final Vg8 vg8, final ExternalMusicInfo externalMusicInfo) {
        if (vg8 == null) {
            return externalMusicInfo;
        }
        final ExternalMusicInfo externalMusicInfo2 = new ExternalMusicInfo();
        String jumpUrl;
        if (vg8.h5_url == null) {
            jumpUrl = externalMusicInfo2.jumpUrl;
        }
        else {
            jumpUrl = vg8.h5_url;
        }
        externalMusicInfo2.jumpUrl = jumpUrl;
        String partnerName;
        if (vg8.partner_name == null) {
            partnerName = externalMusicInfo2.partnerName;
        }
        else {
            partnerName = vg8.partner_name;
        }
        externalMusicInfo2.partnerName = partnerName;
        String partnerSongId;
        if (vg8.partner_song_id == null) {
            partnerSongId = externalMusicInfo2.partnerSongId;
        }
        else {
            partnerSongId = vg8.partner_song_id;
        }
        externalMusicInfo2.partnerSongId = partnerSongId;
        String externalSongKey;
        if (vg8.external_song_key == null) {
            externalSongKey = externalMusicInfo2.externalSongKey;
        }
        else {
            externalSongKey = vg8.external_song_key;
        }
        externalMusicInfo2.externalSongKey = externalSongKey;
        return externalMusicInfo2;
    }
    
    public static Extra com$ss$ugc$aweme$proto$ExtraStructV2$$com$ss$android$ugc$aweme$feed$model$Extra(final VUn vUn, Extra extra) {
        if (vUn == null) {
            return extra;
        }
        extra = new Extra();
        extra.now = 0H1.LIZ(vUn.now, extra.now);
        List fatalItemIds;
        if (vUn.fatal_item_ids == null) {
            fatalItemIds = extra.fatalItemIds;
        }
        else {
            fatalItemIds = vUn.fatal_item_ids;
        }
        extra.fatalItemIds = fatalItemIds;
        return extra;
    }
    
    public static FansStruct com$ss$ugc$aweme$proto$FansStructV2$$com$ss$android$ugc$aweme$feed$model$live$FansStruct(final VaR vaR, final FansStruct fansStruct) {
        if (vaR == null) {
            return fansStruct;
        }
        final FansStruct fansStruct2 = new FansStruct();
        String fansName;
        if (vaR.fans_name == null) {
            fansName = fansStruct2.fansName;
        }
        else {
            fansName = vaR.fans_name;
        }
        fansStruct2.fansName = fansName;
        fansStruct2.fansLevel = 0H1.LIZ(vaR.fans_level, fansStruct2.fansLevel);
        fansStruct2.isFan = 0H1.LIZ(vaR.is_fan, fansStruct2.isFan);
        fansStruct2.lightUp = 0H1.LIZ(vaR.light_up, fansStruct2.lightUp);
        return fansStruct2;
    }
    
    public static FollowerDetail com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail(final VtP vtP, final FollowerDetail followerDetail) {
        if (vtP == null) {
            return followerDetail;
        }
        final FollowerDetail followerDetail2 = new FollowerDetail();
        String name;
        if (vtP.name == null) {
            name = followerDetail2.name;
        }
        else {
            name = vtP.name;
        }
        followerDetail2.name = name;
        String icon;
        if (vtP.icon == null) {
            icon = followerDetail2.icon;
        }
        else {
            icon = vtP.icon;
        }
        followerDetail2.icon = icon;
        followerDetail2.fansCount = 0H1.LIZ(vtP.fans_count, followerDetail2.fansCount);
        String openUrl;
        if (vtP.open_url == null) {
            openUrl = followerDetail2.openUrl;
        }
        else {
            openUrl = vtP.open_url;
        }
        followerDetail2.openUrl = openUrl;
        String appleId;
        if (vtP.apple_id == null) {
            appleId = followerDetail2.appleId;
        }
        else {
            appleId = vtP.apple_id;
        }
        followerDetail2.appleId = appleId;
        String downloadUrl;
        if (vtP.download_url == null) {
            downloadUrl = followerDetail2.downloadUrl;
        }
        else {
            downloadUrl = vtP.download_url;
        }
        followerDetail2.downloadUrl = downloadUrl;
        String packageName;
        if (vtP.package_name == null) {
            packageName = followerDetail2.packageName;
        }
        else {
            packageName = vtP.package_name;
        }
        followerDetail2.packageName = packageName;
        String appName;
        if (vtP.app_name == null) {
            appName = followerDetail2.appName;
        }
        else {
            appName = vtP.app_name;
        }
        followerDetail2.appName = appName;
        return followerDetail2;
    }
    
    public static GameInfo com$ss$ugc$aweme$proto$GameStructV2$$com$ss$android$ugc$aweme$feed$model$GameInfo(final VUS vus, GameInfo gameInfo) {
        if (vus == null) {
            return gameInfo;
        }
        gameInfo = new GameInfo();
        gameInfo.gameType = 0H1.LIZ(vus.game_type, gameInfo.gameType);
        gameInfo.gameScore = 0H1.LIZ(vus.game_score, gameInfo.gameScore);
        return gameInfo;
    }
    
    public static GreenScreenMaterial com$ss$ugc$aweme$proto$GreenScreenMaterialV2$$com$ss$android$ugc$aweme$feed$model$GreenScreenMaterial(final Vgb vgb, final GreenScreenMaterial greenScreenMaterial) {
        if (vgb == null) {
            return greenScreenMaterial;
        }
        final GreenScreenMaterial greenScreenMaterial2 = new GreenScreenMaterial();
        greenScreenMaterial2.type = 0H1.LIZ(vgb.type, greenScreenMaterial2.type);
        greenScreenMaterial2.startTime = 0H1.LIZ(vgb.start_time, greenScreenMaterial2.startTime);
        greenScreenMaterial2.endTime = 0H1.LIZ(vgb.end_time, greenScreenMaterial2.endTime);
        String resId;
        if (vgb.resource_id == null) {
            resId = greenScreenMaterial2.resId;
        }
        else {
            resId = vgb.resource_id;
        }
        greenScreenMaterial2.resId = resId;
        String authorName;
        if (vgb.author_name == null) {
            authorName = greenScreenMaterial2.authorName;
        }
        else {
            authorName = vgb.author_name;
        }
        greenScreenMaterial2.authorName = authorName;
        String stickerId;
        if (vgb.effect_id == null) {
            stickerId = greenScreenMaterial2.stickerId;
        }
        else {
            stickerId = vgb.effect_id;
        }
        greenScreenMaterial2.stickerId = stickerId;
        return greenScreenMaterial2;
    }
    
    public static HotSearchGuideWord com$ss$ugc$aweme$proto$GuideWordV2$$com$ss$android$ugc$aweme$feed$model$HotSearchGuideWord(final VeM veM, final HotSearchGuideWord hotSearchGuideWord) {
        if (veM == null) {
            return hotSearchGuideWord;
        }
        final HotSearchGuideWord hotSearchGuideWord2 = new HotSearchGuideWord();
        String displayWord;
        if (veM.word == null) {
            displayWord = hotSearchGuideWord2.displayWord;
        }
        else {
            displayWord = veM.word;
        }
        hotSearchGuideWord2.displayWord = displayWord;
        String searchWord;
        if (veM.search_word == null) {
            searchWord = hotSearchGuideWord2.searchWord;
        }
        else {
            searchWord = veM.search_word;
        }
        hotSearchGuideWord2.searchWord = searchWord;
        hotSearchGuideWord2.type = 0H1.LIZ(veM.type, hotSearchGuideWord2.type);
        hotSearchGuideWord2.breatheTimes = 0H1.LIZ(veM.breathe_times, hotSearchGuideWord2.breatheTimes);
        return hotSearchGuideWord2;
    }
    
    public static HashtagStruct com$ss$ugc$aweme$proto$HashTagStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$HashtagStruct(final VZu vZu, final HashtagStruct hashtagStruct) {
        if (vZu == null) {
            return hashtagStruct;
        }
        final HashtagStruct hashtagStruct2 = new HashtagStruct();
        String hashtagName;
        if (vZu.hashtag_name == null) {
            hashtagName = hashtagStruct2.hashtagName;
        }
        else {
            hashtagName = vZu.hashtag_name;
        }
        hashtagStruct2.hashtagName = hashtagName;
        String hashtagId;
        if (vZu.hashtag_id == null) {
            hashtagId = hashtagStruct2.hashtagId;
        }
        else {
            hashtagId = vZu.hashtag_id;
        }
        hashtagStruct2.hashtagId = hashtagId;
        hashtagStruct2.status = 0H1.LIZ(vZu.status, hashtagStruct2.status);
        return hashtagStruct2;
    }
    
    public static HotListStruct com$ss$ugc$aweme$proto$HotListStructV2$$com$ss$android$ugc$aweme$profile$model$HotListStruct(final Vls vls, final HotListStruct hotListStruct) {
        if (vls == null) {
            return hotListStruct;
        }
        final HotListStruct hotListStruct2 = new HotListStruct();
        String titile;
        if (vls.title == null) {
            titile = hotListStruct2.titile;
        }
        else {
            titile = vls.title;
        }
        hotListStruct2.titile = titile;
        String imageUrl;
        if (vls.image_url == null) {
            imageUrl = hotListStruct2.imageUrl;
        }
        else {
            imageUrl = vls.image_url;
        }
        hotListStruct2.imageUrl = imageUrl;
        String schema;
        if (vls.schema == null) {
            schema = hotListStruct2.schema;
        }
        else {
            schema = vls.schema;
        }
        hotListStruct2.schema = schema;
        hotListStruct2.type = 0H1.LIZ(vls.type, hotListStruct2.type);
        String header;
        if (vls.header == null) {
            header = hotListStruct2.header;
        }
        else {
            header = vls.header;
        }
        hotListStruct2.header = header;
        String footer;
        if (vls.footer == null) {
            footer = hotListStruct2.footer;
        }
        else {
            footer = vls.footer;
        }
        hotListStruct2.footer = footer;
        return hotListStruct2;
    }
    
    public static HotSearchSprintStruct com$ss$ugc$aweme$proto$HotsearchSprintStructV2$$com$ss$android$ugc$aweme$profile$model$HotSearchSprintStruct(final VeD veD, HotSearchSprintStruct hotSearchSprintStruct) {
        if (veD == null) {
            return hotSearchSprintStruct;
        }
        hotSearchSprintStruct = new HotSearchSprintStruct();
        hotSearchSprintStruct.sprint = 0H1.LIZ(veD.sprint, hotSearchSprintStruct.sprint);
        hotSearchSprintStruct.hitRankPeoples = List$com$ss$ugc$aweme$proto$SimpleUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$User(veD.followers, hotSearchSprintStruct.hitRankPeoples);
        return hotSearchSprintStruct;
    }
    
    public static AwemeHybridLabelModel com$ss$ugc$aweme$proto$HybridLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel(final VgH vgH, final AwemeHybridLabelModel awemeHybridLabelModel) {
        if (vgH == null) {
            return awemeHybridLabelModel;
        }
        final AwemeHybridLabelModel awemeHybridLabelModel2 = new AwemeHybridLabelModel();
        String backgroundColor;
        if (vgH.background_color == null) {
            backgroundColor = awemeHybridLabelModel2.backgroundColor;
        }
        else {
            backgroundColor = vgH.background_color;
        }
        awemeHybridLabelModel2.backgroundColor = backgroundColor;
        String text;
        if (vgH.text == null) {
            text = awemeHybridLabelModel2.text;
        }
        else {
            text = vgH.text;
        }
        awemeHybridLabelModel2.text = text;
        String textColor;
        if (vgH.text_color == null) {
            textColor = awemeHybridLabelModel2.textColor;
        }
        else {
            textColor = vgH.text_color;
        }
        awemeHybridLabelModel2.textColor = textColor;
        awemeHybridLabelModel2.imageUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vgH.image, awemeHybridLabelModel2.imageUrl);
        String refUrl;
        if (vgH.ref_url == null) {
            refUrl = awemeHybridLabelModel2.refUrl;
        }
        else {
            refUrl = vgH.ref_url;
        }
        awemeHybridLabelModel2.refUrl = refUrl;
        return awemeHybridLabelModel2;
    }
    
    public static ChallengeTransform com$ss$ugc$aweme$proto$IconButtonStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeTransform(final VdM vdM, final ChallengeTransform challengeTransform) {
        if (vdM == null) {
            return challengeTransform;
        }
        final ChallengeTransform challengeTransform2 = new ChallengeTransform();
        String text;
        if (vdM.text == null) {
            text = challengeTransform2.text;
        }
        else {
            text = vdM.text;
        }
        challengeTransform2.text = text;
        challengeTransform2.iconUrlModel = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdM.icon, challengeTransform2.iconUrlModel);
        String action;
        if (vdM.action == null) {
            action = challengeTransform2.action;
        }
        else {
            action = vdM.action;
        }
        challengeTransform2.action = action;
        return challengeTransform2;
    }
    
    public static PhotoModeImageInfo com$ss$ugc$aweme$proto$ImageConsumptionInfoV2$$com$ss$android$ugc$aweme$feed$model$PhotoModeImageInfo(final Vcw vcw, final PhotoModeImageInfo photoModeImageInfo) {
        if (vcw == null) {
            return photoModeImageInfo;
        }
        final PhotoModeImageInfo photoModeImageInfo2 = new PhotoModeImageInfo();
        photoModeImageInfo2.imageList = List$com$ss$ugc$aweme$proto$ImagePostInfoV2$$List$com$ss$android$ugc$aweme$feed$model$PhotoModeImageUrlModel(vcw.images, photoModeImageInfo2.imageList);
        photoModeImageInfo2.imagePostCover = com$ss$ugc$aweme$proto$ImagePostInfoV2$$com$ss$android$ugc$aweme$feed$model$PhotoModeImageUrlModel(vcw.image_post_cover, photoModeImageInfo2.imagePostCover);
        Float musicVolume;
        if (vcw.music_volume == null) {
            musicVolume = photoModeImageInfo2.musicVolume;
        }
        else {
            musicVolume = vcw.music_volume;
        }
        photoModeImageInfo2.musicVolume = musicVolume;
        String title;
        if (vcw.title == null) {
            title = photoModeImageInfo2.title;
        }
        else {
            title = vcw.title;
        }
        photoModeImageInfo2.title = title;
        return photoModeImageInfo2;
    }
    
    public static ImageInfo com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo(final Vdm vdm, ImageInfo imageInfo) {
        if (vdm == null) {
            return imageInfo;
        }
        imageInfo = new ImageInfo();
        imageInfo.height = 0H1.LIZ(vdm.height, imageInfo.height);
        imageInfo.width = 0H1.LIZ(vdm.width, imageInfo.width);
        imageInfo.labelLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdm.label_large, imageInfo.labelLarge);
        imageInfo.labelThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdm.label_thumb, imageInfo.labelThumb);
        return imageInfo;
    }
    
    public static PhotoModeImageUrlModel com$ss$ugc$aweme$proto$ImagePostInfoV2$$com$ss$android$ugc$aweme$feed$model$PhotoModeImageUrlModel(final Vct vct, PhotoModeImageUrlModel photoModeImageUrlModel) {
        if (vct == null) {
            return photoModeImageUrlModel;
        }
        photoModeImageUrlModel = new PhotoModeImageUrlModel();
        photoModeImageUrlModel.displayImageNoWatermark = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vct.display_image, photoModeImageUrlModel.displayImageNoWatermark);
        photoModeImageUrlModel.ownerWatermarkImage = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vct.owner_watermark_image, photoModeImageUrlModel.ownerWatermarkImage);
        photoModeImageUrlModel.userWatermarkImage = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vct.user_watermark_image, photoModeImageUrlModel.userWatermarkImage);
        photoModeImageUrlModel.thumbnail = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vct.thumbnail, photoModeImageUrlModel.thumbnail);
        photoModeImageUrlModel.bitrateImages = List$com$ss$ugc$aweme$proto$BitrateImagePostInfoV2$$List$com$ss$android$ugc$aweme$feed$model$MultiImageUrlInfo(vct.bitrate_images, photoModeImageUrlModel.bitrateImages);
        return photoModeImageUrlModel;
    }
    
    public static InlineLink com$ss$ugc$aweme$proto$InlineLinkV2$$com$ss$android$ugc$aweme$feed$model$InlineLink(final Vbb vbb, final InlineLink inlineLink) {
        if (vbb == null) {
            return inlineLink;
        }
        final InlineLink inlineLink2 = new InlineLink();
        String text;
        if (vbb.text == null) {
            text = inlineLink2.text;
        }
        else {
            text = vbb.text;
        }
        inlineLink2.text = text;
        String url;
        if (vbb.url == null) {
            url = inlineLink2.url;
        }
        else {
            url = vbb.url;
        }
        inlineLink2.url = url;
        return inlineLink2;
    }
    
    public static InteractPermission com$ss$ugc$aweme$proto$InteractPermissionV2$$com$ss$android$ugc$aweme$feed$model$InteractPermission(final Vle vle, InteractPermission interactPermission) {
        if (vle == null) {
            return interactPermission;
        }
        interactPermission = new InteractPermission();
        interactPermission.duet = 0H1.LIZ(vle.duet, interactPermission.duet);
        interactPermission.stitch = 0H1.LIZ(vle.stitch, interactPermission.stitch);
        interactPermission.duetPrivacySettingControl = 0H1.LIZ(vle.duet_privacy_setting, interactPermission.duetPrivacySettingControl);
        interactPermission.stitchPrivacySettingControl = 0H1.LIZ(vle.stitch_privacy_setting, interactPermission.stitchPrivacySettingControl);
        interactPermission.upvote = 0H1.LIZ(vle.upvote, interactPermission.upvote);
        interactPermission.allowAddingToStory = 0H1.LIZ(vle.allow_adding_to_story, interactPermission.allowAddingToStory);
        return interactPermission;
    }
    
    public static InteractStickerStruct com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(final Vei vei, final InteractStickerStruct interactStickerStruct) {
        if (vei == null) {
            return interactStickerStruct;
        }
        final InteractStickerStruct interactStickerStruct2 = new InteractStickerStruct();
        interactStickerStruct2.type = 0H1.LIZ(vei.type, interactStickerStruct2.type);
        interactStickerStruct2.index = 0H1.LIZ(vei.index, interactStickerStruct2.index);
        String trackList;
        if (vei.track_info == null) {
            trackList = interactStickerStruct2.trackList;
        }
        else {
            trackList = vei.track_info;
        }
        interactStickerStruct2.trackList = trackList;
        String attr;
        if (vei.attr == null) {
            attr = interactStickerStruct2.attr;
        }
        else {
            attr = vei.attr;
        }
        interactStickerStruct2.attr = attr;
        interactStickerStruct2.pollStruct = com$ss$ugc$aweme$proto$VoteStructV2$$com$ss$android$ugc$aweme$sticker$data$PollStruct(vei.vote_info, interactStickerStruct2.pollStruct);
        String mTextStruct;
        if (vei.text_info == null) {
            mTextStruct = interactStickerStruct2.mTextStruct;
        }
        else {
            mTextStruct = vei.text_info;
        }
        interactStickerStruct2.mTextStruct = mTextStruct;
        interactStickerStruct2.mentionInfo = com$ss$ugc$aweme$proto$MentionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$MentionStruct(vei.mention_info, interactStickerStruct2.mentionInfo);
        interactStickerStruct2.hashtagInfo = com$ss$ugc$aweme$proto$HashTagStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$HashtagStruct(vei.hashtag_info, interactStickerStruct2.hashtagInfo);
        interactStickerStruct2.mCountDownStickerStruct = com$ss$ugc$aweme$proto$LiveCountdownStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$CountDownStickerStruct(vei.countdown_info, interactStickerStruct2.mCountDownStickerStruct);
        interactStickerStruct2.mCaptionStruct = com$ss$ugc$aweme$proto$AutoVideoCaptionStructV2$$com$ss$android$ugc$aweme$sticker$data$CaptionStruct(vei.auto_video_caption_info, interactStickerStruct2.mCaptionStruct);
        interactStickerStruct2.mQaStruct = com$ss$ugc$aweme$proto$QuestionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$QaStruct(vei.question_info, interactStickerStruct2.mQaStruct);
        interactStickerStruct2.textStickerInfo = com$ss$ugc$aweme$proto$TextStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$TextStickerInfo(vei.text_sticker_info, interactStickerStruct2.textStickerInfo);
        interactStickerStruct2.videoShareInfoStruct = com$ss$ugc$aweme$proto$OriginalSharedVideoInfoStructV2$$com$ss$android$ugc$aweme$sticker$data$VideoShareInfoStruct(vei.video_share_info, interactStickerStruct2.videoShareInfoStruct);
        interactStickerStruct2.poiStickerStruct = com$ss$ugc$aweme$proto$PoiStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$PoiStickerStruct(vei.poi_info, interactStickerStruct2.poiStickerStruct);
        return interactStickerStruct2;
    }
    
    public static InteractionTagInfo com$ss$ugc$aweme$proto$InteractionTagInfoV2$$com$ss$android$ugc$aweme$feed$model$InteractionTagInfo(final Vfk vfk, final InteractionTagInfo interactionTagInfo) {
        if (vfk == null) {
            return interactionTagInfo;
        }
        final InteractionTagInfo interactionTagInfo2 = new InteractionTagInfo();
        interactionTagInfo2.interestLevel = 0H1.LIZ(vfk.interest_level, interactionTagInfo2.interestLevel);
        String videoLabelText;
        if (vfk.video_label_text == null) {
            videoLabelText = interactionTagInfo2.videoLabelText;
        }
        else {
            videoLabelText = vfk.video_label_text;
        }
        interactionTagInfo2.videoLabelText = videoLabelText;
        interactionTagInfo2.taggedUsers = List$com$ss$ugc$aweme$proto$InteractionTagUserInfoV2$$List$com$ss$android$ugc$aweme$feed$model$InteractionTagUserInfo(vfk.tagged_users, interactionTagInfo2.taggedUsers);
        return interactionTagInfo2;
    }
    
    public static InteractionTagUserInfo com$ss$ugc$aweme$proto$InteractionTagUserInfoV2$$com$ss$android$ugc$aweme$feed$model$InteractionTagUserInfo(final Vfn vfn, final InteractionTagUserInfo interactionTagUserInfo) {
        if (vfn == null) {
            return interactionTagUserInfo;
        }
        final InteractionTagUserInfo interactionTagUserInfo2 = new InteractionTagUserInfo();
        String uid;
        if (vfn.uid == null) {
            uid = interactionTagUserInfo2.uid;
        }
        else {
            uid = vfn.uid;
        }
        interactionTagUserInfo2.uid = uid;
        String uniqueId;
        if (vfn.unique_id == null) {
            uniqueId = interactionTagUserInfo2.uniqueId;
        }
        else {
            uniqueId = vfn.unique_id;
        }
        interactionTagUserInfo2.uniqueId = uniqueId;
        String nickname;
        if (vfn.nickname == null) {
            nickname = interactionTagUserInfo2.nickname;
        }
        else {
            nickname = vfn.nickname;
        }
        interactionTagUserInfo2.nickname = nickname;
        interactionTagUserInfo2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vfn.avatar_thumb, interactionTagUserInfo2.avatarThumb);
        interactionTagUserInfo2.followStatus = 0H1.LIZ(vfn.follow_status, interactionTagUserInfo2.followStatus);
        interactionTagUserInfo2.followerStatus = 0H1.LIZ(vfn.follower_status, interactionTagUserInfo2.followerStatus);
        interactionTagUserInfo2.isPrivateAccount = 0H1.LIZ(vfn.is_private_account, interactionTagUserInfo2.isPrivateAccount);
        String customVerify;
        if (vfn.custom_verify == null) {
            customVerify = interactionTagUserInfo2.customVerify;
        }
        else {
            customVerify = vfn.custom_verify;
        }
        interactionTagUserInfo2.customVerify = customVerify;
        String enterpriseVerifyReason;
        if (vfn.enterprise_verify_reason == null) {
            enterpriseVerifyReason = interactionTagUserInfo2.enterpriseVerifyReason;
        }
        else {
            enterpriseVerifyReason = vfn.enterprise_verify_reason;
        }
        interactionTagUserInfo2.enterpriseVerifyReason = enterpriseVerifyReason;
        interactionTagUserInfo2.interestLevel = 0H1.LIZ(vfn.interest_level, interactionTagUserInfo2.interestLevel);
        return interactionTagUserInfo2;
    }
    
    public static GroupIdListStruct com$ss$ugc$aweme$proto$ItemGroupIdListV2$$com$ss$android$ugc$aweme$feed$model$GroupIdListStruct(final VU5 vu5, final GroupIdListStruct groupIdListStruct) {
        if (vu5 == null) {
            return groupIdListStruct;
        }
        final GroupIdListStruct groupIdListStruct2 = new GroupIdListStruct();
        List groupIdList0;
        if (vu5.GroupdIdList0 == null) {
            groupIdList0 = groupIdListStruct2.groupIdList0;
        }
        else {
            groupIdList0 = vu5.GroupdIdList0;
        }
        groupIdListStruct2.groupIdList0 = groupIdList0;
        List groupIdList2;
        if (vu5.GroupdIdList1 == null) {
            groupIdList2 = groupIdListStruct2.groupIdList1;
        }
        else {
            groupIdList2 = vu5.GroupdIdList1;
        }
        groupIdListStruct2.groupIdList1 = groupIdList2;
        return groupIdListStruct2;
    }
    
    public static ItemLikeEggData com$ss$ugc$aweme$proto$ItemLikeEggDataV2$$com$ss$android$ugc$aweme$feed$model$ItemLikeEggData(final VV4 vv4, final ItemLikeEggData itemLikeEggData) {
        if (vv4 == null) {
            return itemLikeEggData;
        }
        final ItemLikeEggData itemLikeEggData2 = new ItemLikeEggData();
        String materialUrl;
        if (vv4.material_url == null) {
            materialUrl = itemLikeEggData2.materialUrl;
        }
        else {
            materialUrl = vv4.material_url;
        }
        itemLikeEggData2.materialUrl = materialUrl;
        String fileType;
        if (vv4.file_type == null) {
            fileType = itemLikeEggData2.fileType;
        }
        else {
            fileType = vv4.file_type;
        }
        itemLikeEggData2.fileType = fileType;
        return itemLikeEggData2;
    }
    
    public static StoryBlockInfo com$ss$ugc$aweme$proto$LifeStoryBlockStructV2$$com$ss$android$ugc$aweme$profile$model$StoryBlockInfo(final VUV vuv, StoryBlockInfo storyBlockInfo) {
        if (vuv == null) {
            return storyBlockInfo;
        }
        storyBlockInfo = new StoryBlockInfo();
        storyBlockInfo.isBlock = 0H1.LIZ(vuv.life_story_block, storyBlockInfo.isBlock);
        storyBlockInfo.isBlocked = 0H1.LIZ(vuv.life_story_blocked, storyBlockInfo.isBlocked);
        return storyBlockInfo;
    }
    
    public static 3kx com$ss$ugc$aweme$proto$LinkMatchStructV2$$com$ss$android$ugc$aweme$search$caption$LinkMatch(final VdG vdG, 3kx 3kx) {
        if (vdG == null) {
            return 3kx;
        }
        3kx = new 3kx();
        3kx.totalLimit = 0H1.LIZ(vdG.total_limit, 3kx.totalLimit);
        3kx.queryLimit = 0H1.LIZ(vdG.query_limit, 3kx.queryLimit);
        3kx.matchInfoList = List$com$ss$ugc$aweme$proto$MatchInfoStructV2$$List$com$ss$android$ugc$aweme$search$caption$MatchInfo(vdG.match_info, 3kx.matchInfoList);
        3kx.captionInfo = com$ss$ugc$aweme$proto$CaptionInfoStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionInfo(vdG.caption_info, 3kx.captionInfo);
        3kx.captionAnchor = com$ss$ugc$aweme$proto$CaptionAnchorStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionAnchor(vdG.caption_anchor, 3kx.captionAnchor);
        return 3kx;
    }
    
    public static LinkUserInfoStruct com$ss$ugc$aweme$proto$LinkUserInfoStructV2$$com$ss$android$ugc$aweme$profile$model$LinkUserInfoStruct(final VUY vuy, LinkUserInfoStruct linkUserInfoStruct) {
        if (vuy == null) {
            return linkUserInfoStruct;
        }
        linkUserInfoStruct = new LinkUserInfoStruct();
        linkUserInfoStruct.authStatus = 0H1.LIZ(vuy.auth_status, linkUserInfoStruct.authStatus);
        linkUserInfoStruct.authType = 0H1.LIZ(vuy.auth_type, linkUserInfoStruct.authType);
        return linkUserInfoStruct;
    }
    
    public static CountDownStickerStruct com$ss$ugc$aweme$proto$LiveCountdownStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$CountDownStickerStruct(final Ver ver, final CountDownStickerStruct countDownStickerStruct) {
        if (ver == null) {
            return countDownStickerStruct;
        }
        final CountDownStickerStruct countDownStickerStruct2 = new CountDownStickerStruct();
        String title;
        if (ver.title == null) {
            title = countDownStickerStruct2.title;
        }
        else {
            title = ver.title;
        }
        countDownStickerStruct2.title = title;
        Long expiredTime;
        if (ver.end_time == null) {
            expiredTime = countDownStickerStruct2.expiredTime;
        }
        else {
            expiredTime = ver.end_time;
        }
        countDownStickerStruct2.expiredTime = expiredTime;
        countDownStickerStruct2.subscribeNum = 0H1.LIZ(ver.subscribe_count, countDownStickerStruct2.subscribeNum);
        Boolean subscribe;
        if (ver.is_subscribed == null) {
            subscribe = countDownStickerStruct2.subscribe;
        }
        else {
            subscribe = ver.is_subscribed;
        }
        countDownStickerStruct2.subscribe = subscribe;
        String textTobeSubscribed;
        if (ver.text_to_be_subscribed == null) {
            textTobeSubscribed = countDownStickerStruct2.textTobeSubscribed;
        }
        else {
            textTobeSubscribed = ver.text_to_be_subscribed;
        }
        countDownStickerStruct2.textTobeSubscribed = textTobeSubscribed;
        String textAlreadySubscribed;
        if (ver.text_already_subscribed == null) {
            textAlreadySubscribed = countDownStickerStruct2.textAlreadySubscribed;
        }
        else {
            textAlreadySubscribed = ver.text_already_subscribed;
        }
        countDownStickerStruct2.textAlreadySubscribed = textAlreadySubscribed;
        String textAlreadyExpired;
        if (ver.text_already_ended == null) {
            textAlreadyExpired = countDownStickerStruct2.textAlreadyExpired;
        }
        else {
            textAlreadyExpired = ver.text_already_ended;
        }
        countDownStickerStruct2.textAlreadyExpired = textAlreadyExpired;
        return countDownStickerStruct2;
    }
    
    public static HonorStruct com$ss$ugc$aweme$proto$LiveHonorStructV2$$com$ss$android$ugc$aweme$profile$model$HonorStruct(final Vcn vcn, HonorStruct honorStruct) {
        if (vcn == null) {
            return honorStruct;
        }
        honorStruct = new HonorStruct();
        honorStruct.level = 0H1.LIZ(vcn.honor_level, honorStruct.level);
        honorStruct.score = 0H1.LIZ(vcn.honor_score, honorStruct.score);
        return honorStruct;
    }
    
    public static LogPbBean com$ss$ugc$aweme$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean(final VUP vup, LogPbBean logPbBean) {
        if (vup == null) {
            return logPbBean;
        }
        logPbBean = new LogPbBean();
        String imprId;
        if (vup.impr_id == null) {
            imprId = logPbBean.imprId;
        }
        else {
            imprId = vup.impr_id;
        }
        logPbBean.imprId = imprId;
        return logPbBean;
    }
    
    public static LongVideo com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo(final Vgl vgl, LongVideo longVideo) {
        if (vgl == null) {
            return longVideo;
        }
        longVideo = new LongVideo();
        longVideo.video = com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(vgl.video, longVideo.video);
        longVideo.longVideoType = 0H1.LIZ(vgl.long_video_type, longVideo.longVideoType);
        longVideo.trailerStartTime = 0H1.LIZ(vgl.trailer_start_time, longVideo.trailerStartTime);
        longVideo.videoControl = com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl(vgl.video_control, longVideo.videoControl);
        return longVideo;
    }
    
    public static MaskExtraModule com$ss$ugc$aweme$proto$MaskExtraModuleV2$$com$ss$android$ugc$aweme$feed$model$MaskExtraModule(final Vbn vbn, final MaskExtraModule maskExtraModule) {
        if (vbn == null) {
            return maskExtraModule;
        }
        final MaskExtraModule maskExtraModule2 = new MaskExtraModule();
        maskExtraModule2.type = 0H1.LIZ(vbn.module_type, maskExtraModule2.type);
        String btnText;
        if (vbn.btn_text == null) {
            btnText = maskExtraModule2.btnText;
        }
        else {
            btnText = vbn.btn_text;
        }
        maskExtraModule2.btnText = btnText;
        String url;
        if (vbn.url == null) {
            url = maskExtraModule2.url;
        }
        else {
            url = vbn.url;
        }
        maskExtraModule2.url = url;
        maskExtraModule2.popWindow = com$ss$ugc$aweme$proto$MaskPopWindowV2$$com$ss$android$ugc$aweme$feed$model$MaskPopWindow(vbn.pop_window, maskExtraModule2.popWindow);
        return maskExtraModule2;
    }
    
    public static MaskPopText com$ss$ugc$aweme$proto$MaskPopTextV2$$com$ss$android$ugc$aweme$feed$model$MaskPopText(final Vbh vbh, MaskPopText maskPopText) {
        if (vbh == null) {
            return maskPopText;
        }
        maskPopText = new MaskPopText();
        maskPopText.linkText = com$ss$ugc$aweme$proto$TextWithInlineLinkV2$$com$ss$android$ugc$aweme$feed$model$TextWithInlineLink(vbh.text, maskPopText.linkText);
        maskPopText.isListItem = 0H1.LIZ(vbh.is_list_item, maskPopText.isListItem);
        return maskPopText;
    }
    
    public static MaskPopWindow com$ss$ugc$aweme$proto$MaskPopWindowV2$$com$ss$android$ugc$aweme$feed$model$MaskPopWindow(final Vbk vbk, final MaskPopWindow maskPopWindow) {
        if (vbk == null) {
            return maskPopWindow;
        }
        final MaskPopWindow maskPopWindow2 = new MaskPopWindow();
        String title;
        if (vbk.pop_title == null) {
            title = maskPopWindow2.title;
        }
        else {
            title = vbk.pop_title;
        }
        maskPopWindow2.title = title;
        maskPopWindow2.content = List$com$ss$ugc$aweme$proto$MaskPopTextV2$$List$com$ss$android$ugc$aweme$feed$model$MaskPopText(vbk.pop_content, maskPopWindow2.content);
        return maskPopWindow2;
    }
    
    public static VideoMaskInfo com$ss$ugc$aweme$proto$MaskStructV2$$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo(final VeP veP, final VideoMaskInfo videoMaskInfo) {
        if (veP == null) {
            return videoMaskInfo;
        }
        final VideoMaskInfo videoMaskInfo2 = new VideoMaskInfo();
        Boolean showMask;
        if (veP.show_mask == null) {
            showMask = videoMaskInfo2.showMask;
        }
        else {
            showMask = veP.show_mask;
        }
        videoMaskInfo2.showMask = showMask;
        Integer maskType;
        if (veP.mask_type == null) {
            maskType = videoMaskInfo2.maskType;
        }
        else {
            maskType = veP.mask_type;
        }
        videoMaskInfo2.maskType = maskType;
        Integer status;
        if (veP.status == null) {
            status = videoMaskInfo2.status;
        }
        else {
            status = veP.status;
        }
        videoMaskInfo2.status = status;
        String title;
        if (veP.title == null) {
            title = videoMaskInfo2.title;
        }
        else {
            title = veP.title;
        }
        videoMaskInfo2.title = title;
        String content;
        if (veP.content == null) {
            content = videoMaskInfo2.content;
        }
        else {
            content = veP.content;
        }
        videoMaskInfo2.content = content;
        String cancelMaskLabel;
        if (veP.cancel_mask_label == null) {
            cancelMaskLabel = videoMaskInfo2.cancelMaskLabel;
        }
        else {
            cancelMaskLabel = veP.cancel_mask_label;
        }
        videoMaskInfo2.cancelMaskLabel = cancelMaskLabel;
        videoMaskInfo2.popWindow = com$ss$ugc$aweme$proto$MaskExtraModuleV2$$com$ss$android$ugc$aweme$feed$model$MaskExtraModule(veP.pop_window, videoMaskInfo2.popWindow);
        videoMaskInfo2.birthdayEditModule = com$ss$ugc$aweme$proto$MaskExtraModuleV2$$com$ss$android$ugc$aweme$feed$model$MaskExtraModule(veP.birthday_edit_module, videoMaskInfo2.birthdayEditModule);
        videoMaskInfo2.policyModule = com$ss$ugc$aweme$proto$MaskExtraModuleV2$$com$ss$android$ugc$aweme$feed$model$MaskExtraModule(veP.policy_module, videoMaskInfo2.policyModule);
        return videoMaskInfo2;
    }
    
    public static Plu com$ss$ugc$aweme$proto$MatchInfoStructV2$$com$ss$android$ugc$aweme$search$caption$MatchInfo(final VdJ vdJ, final Plu plu) {
        if (vdJ == null) {
            return plu;
        }
        final Plu plu2 = new Plu();
        String query;
        if (vdJ.query == null) {
            query = plu2.query;
        }
        else {
            query = vdJ.query;
        }
        plu2.query = query;
        String link;
        if (vdJ.link == null) {
            link = plu2.link;
        }
        else {
            link = vdJ.link;
        }
        plu2.link = link;
        plu2.begin = 0H1.LIZ(vdJ.begin, plu2.begin);
        plu2.end = 0H1.LIZ(vdJ.end, plu2.end);
        return plu2;
    }
    
    public static MatchedFriendStruct com$ss$ugc$aweme$proto$MatchedFriendStructV2$$com$ss$android$ugc$aweme$profile$model$MatchedFriendStruct(final VdV vdV, final MatchedFriendStruct matchedFriendStruct) {
        if (vdV == null) {
            return matchedFriendStruct;
        }
        final MatchedFriendStruct matchedFriendStruct2 = new MatchedFriendStruct();
        String recType;
        if (vdV.rec_type == null) {
            recType = matchedFriendStruct2.recType;
        }
        else {
            recType = vdV.rec_type;
        }
        matchedFriendStruct2.recType = recType;
        String recommendReason;
        if (vdV.recommend_reason == null) {
            recommendReason = matchedFriendStruct2.recommendReason;
        }
        else {
            recommendReason = vdV.recommend_reason;
        }
        matchedFriendStruct2.recommendReason = recommendReason;
        matchedFriendStruct2.mMutualStruct = com$ss$ugc$aweme$proto$MutualStructV2$$com$ss$android$ugc$aweme$friends$model$MutualStruct(vdV.mutual_struct, matchedFriendStruct2.mMutualStruct);
        String relationType;
        if (vdV.relation_type == null) {
            relationType = matchedFriendStruct2.relationType;
        }
        else {
            relationType = vdV.relation_type;
        }
        matchedFriendStruct2.relationType = relationType;
        matchedFriendStruct2.externalRecommendReasonStruct = com$ss$ugc$aweme$proto$ExternalRecommendReasonStructV2$$com$ss$android$ugc$aweme$profile$model$ExternalRecommendReasonStruct(vdV.external_recommend_reason, matchedFriendStruct2.externalRecommendReasonStruct);
        return matchedFriendStruct2;
    }
    
    public static MatchedPGCSoundInfo com$ss$ugc$aweme$proto$MatchedPGCSoundStructV2$$com$ss$android$ugc$aweme$music$model$MatchedPGCSoundInfo(final VgE vgE, final MatchedPGCSoundInfo matchedPGCSoundInfo) {
        if (vgE == null) {
            return matchedPGCSoundInfo;
        }
        final MatchedPGCSoundInfo matchedPGCSoundInfo2 = new MatchedPGCSoundInfo();
        matchedPGCSoundInfo2.id = 0H1.LIZ(vgE.id, matchedPGCSoundInfo2.id);
        String author;
        if (vgE.author == null) {
            author = matchedPGCSoundInfo2.author;
        }
        else {
            author = vgE.author;
        }
        matchedPGCSoundInfo2.author = author;
        String title;
        if (vgE.title == null) {
            title = matchedPGCSoundInfo2.title;
        }
        else {
            title = vgE.title;
        }
        matchedPGCSoundInfo2.title = title;
        String mixedTitle;
        if (vgE.mixed_title == null) {
            mixedTitle = matchedPGCSoundInfo2.mixedTitle;
        }
        else {
            mixedTitle = vgE.mixed_title;
        }
        matchedPGCSoundInfo2.mixedTitle = mixedTitle;
        String mixedAuthor;
        if (vgE.mixed_author == null) {
            mixedAuthor = matchedPGCSoundInfo2.mixedAuthor;
        }
        else {
            mixedAuthor = vgE.mixed_author;
        }
        matchedPGCSoundInfo2.mixedAuthor = mixedAuthor;
        return matchedPGCSoundInfo2;
    }
    
    public static MatchedSoundInfo com$ss$ugc$aweme$proto$MatchedSongStructV2$$com$ss$android$ugc$aweme$music$model$MatchedSoundInfo(final VfA vfA, final MatchedSoundInfo matchedSoundInfo) {
        if (vfA == null) {
            return matchedSoundInfo;
        }
        final MatchedSoundInfo matchedSoundInfo2 = new MatchedSoundInfo();
        String id;
        if (vfA.id == null) {
            id = matchedSoundInfo2.id;
        }
        else {
            id = vfA.id;
        }
        matchedSoundInfo2.id = id;
        String author;
        if (vfA.author == null) {
            author = matchedSoundInfo2.author;
        }
        else {
            author = vfA.author;
        }
        matchedSoundInfo2.author = author;
        String title;
        if (vfA.title == null) {
            title = matchedSoundInfo2.title;
        }
        else {
            title = vfA.title;
        }
        matchedSoundInfo2.title = title;
        String h5Url;
        if (vfA.h5_url == null) {
            h5Url = matchedSoundInfo2.h5Url;
        }
        else {
            h5Url = vfA.h5_url;
        }
        matchedSoundInfo2.h5Url = h5Url;
        matchedSoundInfo2.coverMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vfA.cover_medium, matchedSoundInfo2.coverMedium);
        matchedSoundInfo2.performers = List$com$ss$ugc$aweme$proto$MusicPerformerStructV2$$List$com$ss$android$ugc$aweme$music$model$MusicPerformer(vfA.performers, matchedSoundInfo2.performers);
        matchedSoundInfo2.chorusInfo = com$ss$ugc$aweme$proto$MusicChorusInfoStructV2$$com$ss$android$ugc$aweme$music$model$MusicChorusInfo(vfA.chorus_info, matchedSoundInfo2.chorusInfo);
        return matchedSoundInfo2;
    }
    
    public static MentionStruct com$ss$ugc$aweme$proto$MentionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$MentionStruct(final Veo veo, final MentionStruct mentionStruct) {
        if (veo == null) {
            return mentionStruct;
        }
        final MentionStruct mentionStruct2 = new MentionStruct();
        String secUid;
        if (veo.sec_uid == null) {
            secUid = mentionStruct2.secUid;
        }
        else {
            secUid = veo.sec_uid;
        }
        mentionStruct2.secUid = secUid;
        String username;
        if (veo.user_name == null) {
            username = mentionStruct2.username;
        }
        else {
            username = veo.user_name;
        }
        mentionStruct2.username = username;
        String userId;
        if (veo.user_id == null) {
            userId = mentionStruct2.userId;
        }
        else {
            userId = veo.user_id;
        }
        mentionStruct2.userId = userId;
        String nickname;
        if (veo.nickname == null) {
            nickname = mentionStruct2.nickname;
        }
        else {
            nickname = veo.nickname;
        }
        mentionStruct2.nickname = nickname;
        mentionStruct2.avatarUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(veo.user_avatar_url, mentionStruct2.avatarUrl);
        return mentionStruct2;
    }
    
    public static 2WQ com$ss$ugc$aweme$proto$MicroAppCardStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MiniAppCard(final VZx vZx, final 2WQ 2wq) {
        if (vZx == null) {
            return 2wq;
        }
        final 2WQ 2wq2 = new 2WQ();
        String imageUrl;
        if (vZx.image_url == null) {
            imageUrl = 2wq2.imageUrl;
        }
        else {
            imageUrl = vZx.image_url;
        }
        2wq2.imageUrl = imageUrl;
        String text;
        if (vZx.text == null) {
            text = 2wq2.text;
        }
        else {
            text = vZx.text;
        }
        2wq2.text = text;
        2wq2.waitTime = 0H1.LIZ(vZx.wait_time, 2wq2.waitTime);
        return 2wq2;
    }
    
    public static P6n com$ss$ugc$aweme$proto$MicroAppStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MicroAppInfo(final Vlp vlp, final P6n p6n) {
        if (vlp == null) {
            return p6n;
        }
        final P6n p6n2 = new P6n();
        String appId;
        if (vlp.app_id == null) {
            appId = p6n2.appId;
        }
        else {
            appId = vlp.app_id;
        }
        p6n2.appId = appId;
        String name;
        if (vlp.app_name == null) {
            name = p6n2.name;
        }
        else {
            name = vlp.app_name;
        }
        p6n2.name = name;
        String icon;
        if (vlp.icon == null) {
            icon = p6n2.icon;
        }
        else {
            icon = vlp.icon;
        }
        p6n2.icon = icon;
        p6n2.orientation = 0H1.LIZ(vlp.orientation, p6n2.orientation);
        String schema;
        if (vlp.schema == null) {
            schema = p6n2.schema;
        }
        else {
            schema = vlp.schema;
        }
        p6n2.schema = schema;
        p6n2.state = 0H1.LIZ(vlp.state, p6n2.state);
        String summary;
        if (vlp.summary == null) {
            summary = p6n2.summary;
        }
        else {
            summary = vlp.summary;
        }
        p6n2.summary = summary;
        p6n2.type = 0H1.LIZ(vlp.type, p6n2.type);
        String desc;
        if (vlp.description == null) {
            desc = p6n2.desc;
        }
        else {
            desc = vlp.description;
        }
        p6n2.desc = desc;
        String title;
        if (vlp.title == null) {
            title = p6n2.title;
        }
        else {
            title = vlp.title;
        }
        p6n2.title = title;
        p6n2.miniAppCard = com$ss$ugc$aweme$proto$MicroAppCardStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MiniAppCard(vlp.card, p6n2.miniAppCard);
        String webUrl;
        if (vlp.web_url == null) {
            webUrl = p6n2.webUrl;
        }
        else {
            webUrl = vlp.web_url;
        }
        p6n2.webUrl = webUrl;
        return p6n2;
    }
    
    public static MixStatisStruct com$ss$ugc$aweme$proto$MixStatisStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatisStruct(final VhJ vhJ, MixStatisStruct mixStatisStruct) {
        if (vhJ == null) {
            return mixStatisStruct;
        }
        mixStatisStruct = new MixStatisStruct();
        mixStatisStruct.playVV = 0H1.LIZ(vhJ.play_vv, mixStatisStruct.playVV);
        mixStatisStruct.collectVV = 0H1.LIZ(vhJ.collect_vv, mixStatisStruct.collectVV);
        mixStatisStruct.currentEpisode = 0H1.LIZ(vhJ.current_episode, mixStatisStruct.currentEpisode);
        mixStatisStruct.updatedToEpisode = 0H1.LIZ(vhJ.updated_to_episode, mixStatisStruct.updatedToEpisode);
        mixStatisStruct.hasUpdatedEpisode = 0H1.LIZ(vhJ.has_updated_episode, mixStatisStruct.hasUpdatedEpisode);
        return mixStatisStruct;
    }
    
    public static MixStatusStruct com$ss$ugc$aweme$proto$MixStatusStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatusStruct(final VUe vUe, MixStatusStruct mixStatusStruct) {
        if (vUe == null) {
            return mixStatusStruct;
        }
        mixStatusStruct = new MixStatusStruct();
        mixStatusStruct.status = 0H1.LIZ(vUe.status, mixStatusStruct.status);
        mixStatusStruct.isCollected = 0H1.LIZ(vUe.is_collected, mixStatusStruct.isCollected);
        return mixStatusStruct;
    }
    
    public static MixStruct com$ss$ugc$aweme$proto$MixStructV2$$com$ss$android$ugc$aweme$feed$model$MixStruct(final VlX vlX, final MixStruct mixStruct) {
        if (vlX == null) {
            return mixStruct;
        }
        final MixStruct mixStruct2 = new MixStruct();
        String mixId;
        if (vlX.mix_id == null) {
            mixId = mixStruct2.mixId;
        }
        else {
            mixId = vlX.mix_id;
        }
        mixStruct2.mixId = mixId;
        String mixName;
        if (vlX.mix_name == null) {
            mixName = mixStruct2.mixName;
        }
        else {
            mixName = vlX.mix_name;
        }
        mixStruct2.mixName = mixName;
        mixStruct2.cover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlX.cover_url, mixStruct2.cover);
        mixStruct2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlX.icon_url, mixStruct2.icon);
        mixStruct2.status = com$ss$ugc$aweme$proto$MixStatusStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatusStruct(vlX.status, mixStruct2.status);
        mixStruct2.statis = com$ss$ugc$aweme$proto$MixStatisStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatisStruct(vlX.statis, mixStruct2.statis);
        String desc;
        if (vlX.desc == null) {
            desc = mixStruct2.desc;
        }
        else {
            desc = vlX.desc;
        }
        mixStruct2.desc = desc;
        mixStruct2.author = com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(vlX.author, mixStruct2.author);
        String extra;
        if (vlX.extra == null) {
            extra = mixStruct2.extra;
        }
        else {
            extra = vlX.extra;
        }
        mixStruct2.extra = extra;
        mixStruct2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(vlX.share_info, mixStruct2.shareInfo);
        return mixStruct2;
    }
    
    public static MusicOwnerInfo com$ss$ugc$aweme$proto$MusicArtistStructV2$$com$ss$android$ugc$aweme$music$model$MusicOwnerInfo(final VuN vuN, final MusicOwnerInfo musicOwnerInfo) {
        if (vuN == null) {
            return musicOwnerInfo;
        }
        final MusicOwnerInfo musicOwnerInfo2 = new MusicOwnerInfo();
        String uid;
        if (vuN.uid == null) {
            uid = musicOwnerInfo2.uid;
        }
        else {
            uid = vuN.uid;
        }
        musicOwnerInfo2.uid = uid;
        String secUid;
        if (vuN.sec_uid == null) {
            secUid = musicOwnerInfo2.secUid;
        }
        else {
            secUid = vuN.sec_uid;
        }
        musicOwnerInfo2.secUid = secUid;
        String nickName;
        if (vuN.nick_name == null) {
            nickName = musicOwnerInfo2.nickName;
        }
        else {
            nickName = vuN.nick_name;
        }
        musicOwnerInfo2.nickName = nickName;
        String handle;
        if (vuN.handle == null) {
            handle = musicOwnerInfo2.handle;
        }
        else {
            handle = vuN.handle;
        }
        musicOwnerInfo2.handle = handle;
        musicOwnerInfo2.avatar = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuN.avatar, musicOwnerInfo2.avatar);
        musicOwnerInfo2.verified = 0H1.LIZ(vuN.is_verified, musicOwnerInfo2.verified);
        musicOwnerInfo2.enterType = 0H1.LIZ(vuN.enter_type, musicOwnerInfo2.enterType);
        Integer followStatus;
        if (vuN.follow_status == null) {
            followStatus = musicOwnerInfo2.followStatus;
        }
        else {
            followStatus = vuN.follow_status;
        }
        musicOwnerInfo2.followStatus = followStatus;
        musicOwnerInfo2.showArtistProfileBtn = 0H1.LIZ(vuN.is_visible, musicOwnerInfo2.showArtistProfileBtn);
        Integer followerStatus;
        if (vuN.follower_status == null) {
            followerStatus = musicOwnerInfo2.followerStatus;
        }
        else {
            followerStatus = vuN.follower_status;
        }
        musicOwnerInfo2.followerStatus = followerStatus;
        musicOwnerInfo2.isPrivateAccount = 0H1.LIZ(vuN.is_private_account, musicOwnerInfo2.isPrivateAccount);
        musicOwnerInfo2.isBlock = 0H1.LIZ(vuN.is_block, musicOwnerInfo2.isBlock);
        musicOwnerInfo2.isBlocked = 0H1.LIZ(vuN.is_blocked, musicOwnerInfo2.isBlocked);
        Integer status;
        if (vuN.status == null) {
            status = musicOwnerInfo2.status;
        }
        else {
            status = vuN.status;
        }
        musicOwnerInfo2.status = status;
        return musicOwnerInfo2;
    }
    
    public static MusicAvatar com$ss$ugc$aweme$proto$MusicAvatarStructV2$$com$ss$android$ugc$aweme$music$model$MusicAvatar(final VfG vfG, MusicAvatar musicAvatar) {
        if (vfG == null) {
            return musicAvatar;
        }
        musicAvatar = new MusicAvatar();
        musicAvatar.thumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vfG.thumb, musicAvatar.thumb);
        musicAvatar.thumbnail = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vfG.thumbnail, musicAvatar.thumbnail);
        musicAvatar.medium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vfG.medium, musicAvatar.medium);
        musicAvatar.large = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vfG.large, musicAvatar.large);
        musicAvatar.hd = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vfG.hd, musicAvatar.hd);
        return musicAvatar;
    }
    
    public static MusicChorusInfo com$ss$ugc$aweme$proto$MusicChorusInfoStructV2$$com$ss$android$ugc$aweme$music$model$MusicChorusInfo(final VUh vUh, MusicChorusInfo musicChorusInfo) {
        if (vUh == null) {
            return musicChorusInfo;
        }
        musicChorusInfo = new MusicChorusInfo();
        musicChorusInfo.startTime = 0H1.LIZ(vUh.start_ms, musicChorusInfo.startTime);
        musicChorusInfo.duration = 0H1.LIZ(vUh.duration_ms, musicChorusInfo.duration);
        return musicChorusInfo;
    }
    
    public static Dsp com$ss$ugc$aweme$proto$MusicDspStructV2$$com$ss$android$ugc$aweme$music$model$Dsp(final VfJ vfJ, final Dsp dsp) {
        if (vfJ == null) {
            return dsp;
        }
        final Dsp dsp2 = new Dsp();
        String fullClipId;
        if (vfJ.full_clip_id == null) {
            fullClipId = dsp2.fullClipId;
        }
        else {
            fullClipId = vfJ.full_clip_id;
        }
        dsp2.fullClipId = fullClipId;
        String fullClipAuthor;
        if (vfJ.full_clip_author == null) {
            fullClipAuthor = dsp2.fullClipAuthor;
        }
        else {
            fullClipAuthor = vfJ.full_clip_author;
        }
        dsp2.fullClipAuthor = fullClipAuthor;
        String fullClipTitle;
        if (vfJ.full_clip_title == null) {
            fullClipTitle = dsp2.fullClipTitle;
        }
        else {
            fullClipTitle = vfJ.full_clip_title;
        }
        dsp2.fullClipTitle = fullClipTitle;
        dsp2.collectStatus = 0H1.LIZ(vfJ.collect_status, dsp2.collectStatus);
        dsp2.defaultPerformerAvatar = com$ss$ugc$aweme$proto$MusicAvatarStructV2$$com$ss$android$ugc$aweme$music$model$MusicAvatar(vfJ.default_performer_avatar, dsp2.defaultPerformerAvatar);
        dsp2.mvId = 0H1.LIZ(vfJ.mv_id, dsp2.mvId);
        dsp2.isShowEntrance = 0H1.LIZ(vfJ.is_show_entrance, dsp2.isShowEntrance);
        return dsp2;
    }
    
    public static MusicPerformer com$ss$ugc$aweme$proto$MusicPerformerStructV2$$com$ss$android$ugc$aweme$music$model$MusicPerformer(final VfD vfD, final MusicPerformer musicPerformer) {
        if (vfD == null) {
            return musicPerformer;
        }
        final MusicPerformer musicPerformer2 = new MusicPerformer();
        String id;
        if (vfD.id == null) {
            id = musicPerformer2.id;
        }
        else {
            id = vfD.id;
        }
        musicPerformer2.id = id;
        String name;
        if (vfD.name == null) {
            name = musicPerformer2.name;
        }
        else {
            name = vfD.name;
        }
        musicPerformer2.name = name;
        musicPerformer2.avatar = com$ss$ugc$aweme$proto$MusicAvatarStructV2$$com$ss$android$ugc$aweme$music$model$MusicAvatar(vfD.avatar, musicPerformer2.avatar);
        return musicPerformer2;
    }
    
    public static Music com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(final VuS vuS, final Music music) {
        if (vuS == null) {
            return music;
        }
        final Music music2 = new Music();
        music2.id = 0H1.LIZ(vuS.id, music2.id);
        String idStr;
        if (vuS.id_str == null) {
            idStr = music2.idStr;
        }
        else {
            idStr = vuS.id_str;
        }
        music2.idStr = idStr;
        String musicName;
        if (vuS.title == null) {
            musicName = music2.musicName;
        }
        else {
            musicName = vuS.title;
        }
        music2.musicName = musicName;
        String authorName;
        if (vuS.author == null) {
            authorName = music2.authorName;
        }
        else {
            authorName = vuS.author;
        }
        music2.authorName = authorName;
        String album;
        if (vuS.album == null) {
            album = music2.album;
        }
        else {
            album = vuS.album;
        }
        music2.album = album;
        music2.coverLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuS.cover_large, music2.coverLarge);
        music2.coverMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuS.cover_medium, music2.coverMedium);
        music2.coverThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuS.cover_thumb, music2.coverThumb);
        music2.playUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuS.play_url, music2.playUrl);
        music2.duration = 0H1.LIZ(vuS.duration, music2.duration);
        String extra;
        if (vuS.extra == null) {
            extra = music2.extra;
        }
        else {
            extra = vuS.extra;
        }
        music2.extra = extra;
        music2.userCount = 0H1.LIZ(vuS.user_count, music2.userCount);
        music2.positions = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(vuS.position, music2.positions);
        music2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(vuS.share_info, music2.shareInfo);
        music2.collectStatus = 0H1.LIZ(vuS.collect_stat, music2.collectStatus);
        music2.musicStatus = 0H1.LIZ(vuS.status, music2.musicStatus);
        String offlineDesc;
        if (vuS.offline_desc == null) {
            offlineDesc = music2.offlineDesc;
        }
        else {
            offlineDesc = vuS.offline_desc;
        }
        music2.offlineDesc = offlineDesc;
        music2.effectsData = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuS.effects_data, music2.effectsData);
        String ownerId;
        if (vuS.owner_id == null) {
            ownerId = music2.ownerId;
        }
        else {
            ownerId = vuS.owner_id;
        }
        music2.ownerId = ownerId;
        String ownerNickName;
        if (vuS.owner_nickname == null) {
            ownerNickName = music2.ownerNickName;
        }
        else {
            ownerNickName = vuS.owner_nickname;
        }
        music2.ownerNickName = ownerNickName;
        music2.isOriginMusic = 0H1.LIZ(vuS.is_original, music2.isOriginMusic);
        music2.challenge = com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge(vuS.challenge, music2.challenge);
        music2.billboardRank = 0H1.LIZ(vuS.billboard_rank, music2.billboardRank);
        Long bindChallengeId;
        if (vuS.binded_challenge_id == null) {
            bindChallengeId = music2.bindChallengeId;
        }
        else {
            bindChallengeId = vuS.binded_challenge_id;
        }
        music2.bindChallengeId = bindChallengeId;
        music2.isAuthorDeleted = 0H1.LIZ(vuS.author_deleted, music2.isAuthorDeleted);
        String ownerHandle;
        if (vuS.owner_handle == null) {
            ownerHandle = music2.ownerHandle;
        }
        else {
            ownerHandle = vuS.owner_handle;
        }
        music2.ownerHandle = ownerHandle;
        music2.preventDownload = 0H1.LIZ(vuS.prevent_download, music2.preventDownload);
        music2.strongBeatUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuS.strong_beat_url, music2.strongBeatUrl);
        music2.mExternalMusicInfos = List$com$ss$ugc$aweme$proto$ExternalSongStructV2$$List$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(vuS.external_song_info, music2.mExternalMusicInfos);
        String secUid;
        if (vuS.sec_uid == null) {
            secUid = music2.secUid;
        }
        else {
            secUid = vuS.sec_uid;
        }
        music2.secUid = secUid;
        music2.lrcType = 0H1.LIZ(vuS.lyric_type, music2.lrcType);
        String lrcUrl;
        if (vuS.lyric_url == null) {
            lrcUrl = music2.lrcUrl;
        }
        else {
            lrcUrl = vuS.lyric_url;
        }
        music2.lrcUrl = lrcUrl;
        music2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuS.avatar_thumb, music2.avatarThumb);
        music2.previewStartTime = 0H1.LIZ(vuS.preview_start_time, music2.previewStartTime);
        music2.previewEndTime = 0H1.LIZ(vuS.preview_end_time, music2.previewEndTime);
        music2.muteShare = 0H1.LIZ(vuS.mute_share, music2.muteShare);
        music2.isArtistMusic = 0H1.LIZ(vuS.is_author_artist, music2.isArtistMusic);
        music2.isPgc = 0H1.LIZ(vuS.is_pgc, music2.isPgc);
        music2.matchedPGCSoundInfo = com$ss$ugc$aweme$proto$MatchedPGCSoundStructV2$$com$ss$android$ugc$aweme$music$model$MatchedPGCSoundInfo(vuS.matched_pgc_sound, music2.matchedPGCSoundInfo);
        music2.mMatchedSongInfo = com$ss$ugc$aweme$proto$MatchedSongStructV2$$com$ss$android$ugc$aweme$music$model$MatchedSoundInfo(vuS.matched_song, music2.mMatchedSongInfo);
        music2.isCommercialMusic = 0H1.LIZ(vuS.is_commerce_music, music2.isCommercialMusic);
        music2.mMusicOwnerInfos = List$com$ss$ugc$aweme$proto$MusicArtistStructV2$$List$com$ss$android$ugc$aweme$music$model$MusicOwnerInfo(vuS.artists, music2.mMusicOwnerInfos);
        music2.durationHighPrecision = com$ss$ugc$aweme$proto$DurationHighPrecisionStructV2$$com$ss$android$ugc$aweme$music$model$MusicHighPrecisionDuration(vuS.duration_high_precision, music2.durationHighPrecision);
        Boolean isShootingAllowed;
        if (vuS.is_shooting_allow == null) {
            isShootingAllowed = music2.isShootingAllowed;
        }
        else {
            isShootingAllowed = vuS.is_shooting_allow;
        }
        music2.isShootingAllowed = isShootingAllowed;
        return music2;
    }
    
    public static MutualStruct com$ss$ugc$aweme$proto$MutualStructV2$$com$ss$android$ugc$aweme$friends$model$MutualStruct(final VdS vdS, MutualStruct mutualStruct) {
        if (vdS == null) {
            return mutualStruct;
        }
        mutualStruct = new MutualStruct();
        mutualStruct.mutualType = 0H1.LIZ(vdS.mutual_type, mutualStruct.mutualType);
        mutualStruct.userList = List$com$ss$ugc$aweme$proto$MutualUserStructV2$$List$com$ss$android$ugc$aweme$friends$model$MutualUser(vdS.user_list, mutualStruct.userList);
        mutualStruct.total = 0H1.LIZ(vdS.total, mutualStruct.total);
        return mutualStruct;
    }
    
    public static MutualUser com$ss$ugc$aweme$proto$MutualUserStructV2$$com$ss$android$ugc$aweme$friends$model$MutualUser(final VdP vdP, final MutualUser mutualUser) {
        if (vdP == null) {
            return mutualUser;
        }
        final MutualUser mutualUser2 = new MutualUser();
        String secUid;
        if (vdP.sec_uid == null) {
            secUid = mutualUser2.secUid;
        }
        else {
            secUid = vdP.sec_uid;
        }
        mutualUser2.secUid = secUid;
        String nickname;
        if (vdP.nickname == null) {
            nickname = mutualUser2.nickname;
        }
        else {
            nickname = vdP.nickname;
        }
        mutualUser2.nickname = nickname;
        mutualUser2.avatarMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdP.avatar_medium, mutualUser2.avatarMedium);
        return mutualUser2;
    }
    
    public static NearbyInfo com$ss$ugc$aweme$proto$NearbyInfoStructV2$$com$ss$android$ugc$aweme$feed$model$NearbyInfo(final VTp vTp, NearbyInfo nearbyInfo) {
        if (vTp == null) {
            return nearbyInfo;
        }
        nearbyInfo = new NearbyInfo();
        String eventTrack;
        if (vTp.event_track == null) {
            eventTrack = nearbyInfo.eventTrack;
        }
        else {
            eventTrack = vTp.event_track;
        }
        nearbyInfo.eventTrack = eventTrack;
        return nearbyInfo;
    }
    
    public static Byv com$ss$ugc$aweme$proto$NewFaceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$NewFaceStickerBean(final VuG vuG, final Byv byv) {
        if (vuG == null) {
            return byv;
        }
        final Byv byv2 = new Byv();
        String id;
        if (vuG.id == null) {
            id = byv2.id;
        }
        else {
            id = vuG.id;
        }
        byv2.id = id;
        String name;
        if (vuG.name == null) {
            name = byv2.name;
        }
        else {
            name = vuG.name;
        }
        byv2.name = name;
        List children;
        if (vuG.children == null) {
            children = byv2.children;
        }
        else {
            children = vuG.children;
        }
        byv2.children = children;
        byv2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuG.icon_url, byv2.iconUrl);
        String ownerId;
        if (vuG.owner_id == null) {
            ownerId = byv2.ownerId;
        }
        else {
            ownerId = vuG.owner_id;
        }
        byv2.ownerId = ownerId;
        String ownerName;
        if (vuG.owner_nickname == null) {
            ownerName = byv2.ownerName;
        }
        else {
            ownerName = vuG.owner_nickname;
        }
        byv2.ownerName = ownerName;
        byv2.userCount = 0H1.LIZ(vuG.user_count, byv2.userCount);
        String desc;
        if (vuG.desc == null) {
            desc = byv2.desc;
        }
        else {
            desc = vuG.desc;
        }
        byv2.desc = desc;
        String effectId;
        if (vuG.effect_id == null) {
            effectId = byv2.effectId;
        }
        else {
            effectId = vuG.effect_id;
        }
        byv2.effectId = effectId;
        byv2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(vuG.share_info, byv2.shareInfo);
        byv2.isFavorite = 0H1.LIZ(vuG.is_favorite, byv2.isFavorite);
        byv2.commerceSticker = com$ss$ugc$aweme$proto$CommerceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceSticker(vuG.commerce_sticker, byv2.commerceSticker);
        List mTags;
        if (vuG.tags == null) {
            mTags = byv2.mTags;
        }
        else {
            mTags = vuG.tags;
        }
        byv2.mTags = mTags;
        byv2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuG.avatar_thumb, byv2.avatarThumb);
        byv2.viewCount = 0H1.LIZ(vuG.vv_count, byv2.viewCount);
        String extra;
        if (vuG.extra == null) {
            extra = byv2.extra;
        }
        else {
            extra = vuG.extra;
        }
        byv2.extra = extra;
        String mSecUid;
        if (vuG.sec_uid == null) {
            mSecUid = byv2.mSecUid;
        }
        else {
            mSecUid = vuG.sec_uid;
        }
        byv2.mSecUid = mSecUid;
        return byv2;
    }
    
    public static Ai7 com$ss$ugc$aweme$proto$NowButtonInfoV2$$com$ss$android$ugc$aweme$now$NowButtonInfo(final VVD vvd, final Ai7 ai7) {
        if (vvd == null) {
            return ai7;
        }
        final Ai7 ai8 = new Ai7();
        String buttonLabel;
        if (vvd.button_label == null) {
            buttonLabel = ai8.buttonLabel;
        }
        else {
            buttonLabel = vvd.button_label;
        }
        ai8.buttonLabel = buttonLabel;
        String redirectUri;
        if (vvd.redirect_uri == null) {
            redirectUri = ai8.redirectUri;
        }
        else {
            redirectUri = vvd.redirect_uri;
        }
        ai8.redirectUri = redirectUri;
        return ai8;
    }
    
    public static Ai4 com$ss$ugc$aweme$proto$NowIncompatibilityInfoV2$$com$ss$android$ugc$aweme$now$NowIncompatibilityInfo(final VVG vvg, final Ai4 ai4) {
        if (vvg == null) {
            return ai4;
        }
        final Ai4 ai5 = new Ai4();
        ai5.reason = 0H1.LIZ(vvg.reason, ai5.reason);
        String explain;
        if (vvg.explain == null) {
            explain = ai5.explain;
        }
        else {
            explain = vvg.explain;
        }
        ai5.explain = explain;
        ai5.resolutionButtonInfo = com$ss$ugc$aweme$proto$NowButtonInfoV2$$com$ss$android$ugc$aweme$now$NowButtonInfo(vvg.resolution_button, ai5.resolutionButtonInfo);
        return ai5;
    }
    
    public static AgP com$ss$ugc$aweme$proto$NowInteractionControlV2$$com$ss$android$ugc$aweme$now$NowInteractionControl(final Vaq vaq, AgP agP) {
        if (vaq == null) {
            return agP;
        }
        agP = new AgP();
        agP.disableLike = 0H1.LIZ(vaq.disable_like, agP.disableLike);
        agP.disableComment = 0H1.LIZ(vaq.disable_comment, agP.disableComment);
        agP.disableReaction = 0H1.LIZ(vaq.disable_reaction, agP.disableReaction);
        return agP;
    }
    
    public static AiW com$ss$ugc$aweme$proto$NowPostInfoV2$$com$ss$android$ugc$aweme$now$NowPostInfo(final Voc voc, final AiW aiW) {
        if (voc == null) {
            return aiW;
        }
        final AiW aiW2 = new AiW();
        aiW2.backImage = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.back_image, aiW2.backImage);
        aiW2.backImageThumbnail = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.back_image_thumbnail, aiW2.backImageThumbnail);
        aiW2.frontImage = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.front_image, aiW2.frontImage);
        aiW2.frontImageThumbnail = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.front_image_thumbnail, aiW2.frontImageThumbnail);
        aiW2.fuzzyImage = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.fuzzy_image, aiW2.fuzzyImage);
        aiW2.compositeImageLTR = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.composite_image_ltr, aiW2.compositeImageLTR);
        aiW2.compositeImageRTL = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.composite_image_rtl, aiW2.compositeImageRTL);
        Long lastPushedAtSec;
        if (voc.last_pushed_at_sec == null) {
            lastPushedAtSec = aiW2.lastPushedAtSec;
        }
        else {
            lastPushedAtSec = voc.last_pushed_at_sec;
        }
        aiW2.lastPushedAtSec = lastPushedAtSec;
        aiW2.fuzzyFrontImageThumbnail = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.fuzzy_front_image_thumbnail, aiW2.fuzzyFrontImageThumbnail);
        aiW2.fuzzyFrontImageThumbnailWithLogo = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.fuzzy_front_image_thumbnail_with_logo, aiW2.fuzzyFrontImageThumbnailWithLogo);
        Integer nowStatus;
        if (voc.now_status == null) {
            nowStatus = aiW2.nowStatus;
        }
        else {
            nowStatus = voc.now_status;
        }
        aiW2.nowStatus = nowStatus;
        aiW2.incompatibilityInfo = com$ss$ugc$aweme$proto$NowIncompatibilityInfoV2$$com$ss$android$ugc$aweme$now$NowIncompatibilityInfo(voc.incompatibility_info, aiW2.incompatibilityInfo);
        String nowMediaType;
        if (voc.now_media_type == null) {
            nowMediaType = aiW2.nowMediaType;
        }
        else {
            nowMediaType = voc.now_media_type;
        }
        aiW2.nowMediaType = nowMediaType;
        aiW2.compositeImageLtrWithoutWatermark = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.composite_image_ltr_without_watermark, aiW2.compositeImageLtrWithoutWatermark);
        aiW2.compositeImageRtlWithoutWatermark = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.composite_image_rtl_without_watermark, aiW2.compositeImageRtlWithoutWatermark);
        aiW2.watermarkImageLTR = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.watermark_image_ltr, aiW2.watermarkImageLTR);
        aiW2.watermarkImageRTL = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.watermark_image_rtl, aiW2.watermarkImageRTL);
        aiW2.fuzzyImageWithWatermark = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.fuzzy_image_with_watermark, aiW2.fuzzyImageWithWatermark);
        aiW2.fuzzyImageRtlWithWatermark = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voc.fuzzy_image_rtl_with_watermark, aiW2.fuzzyImageRtlWithWatermark);
        String createTimeInAuthorTimeZone;
        if (voc.create_time_in_author_timezone == null) {
            createTimeInAuthorTimeZone = aiW2.createTimeInAuthorTimeZone;
        }
        else {
            createTimeInAuthorTimeZone = voc.create_time_in_author_timezone;
        }
        aiW2.createTimeInAuthorTimeZone = createTimeInAuthorTimeZone;
        aiW2.nowPostSource = 0H1.LIZ(voc.now_post_source, aiW2.nowPostSource);
        aiW2.nowInteractionControl = com$ss$ugc$aweme$proto$NowInteractionControlV2$$com$ss$android$ugc$aweme$now$NowInteractionControl(voc.now_interaction_control, aiW2.nowInteractionControl);
        return aiW2;
    }
    
    public static O7p com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo(final Va3 va3, final O7p o7p) {
        if (va3 == null) {
            return o7p;
        }
        final O7p o7p2 = new O7p();
        o7p2.offlineInfoType = 0H1.LIZ(va3.offline_info_type, o7p2.offlineInfoType);
        String text;
        if (va3.text == null) {
            text = o7p2.text;
        }
        else {
            text = va3.text;
        }
        o7p2.text = text;
        String action;
        if (va3.action == null) {
            action = o7p2.action;
        }
        else {
            action = va3.action;
        }
        o7p2.action = action;
        return o7p2;
    }
    
    public static CaptionLanguage com$ss$ugc$aweme$proto$OriginalLanguageStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionLanguage(final VaU vaU, final CaptionLanguage captionLanguage) {
        if (vaU == null) {
            return captionLanguage;
        }
        final CaptionLanguage captionLanguage2 = new CaptionLanguage();
        String languageName;
        if (vaU.lang == null) {
            languageName = captionLanguage2.languageName;
        }
        else {
            languageName = vaU.lang;
        }
        captionLanguage2.languageName = languageName;
        captionLanguage2.languageId = 0H1.LIZ(vaU.language_id, captionLanguage2.languageId);
        String languageCode;
        if (vaU.language_code == null) {
            languageCode = captionLanguage2.languageCode;
        }
        else {
            languageCode = vaU.language_code;
        }
        captionLanguage2.languageCode = languageCode;
        captionLanguage2.canTranslateRealtime = 0H1.LIZ(vaU.can_translate_realtime, captionLanguage2.canTranslateRealtime);
        return captionLanguage2;
    }
    
    public static ODk com$ss$ugc$aweme$proto$OriginalMusicianStructV2$$com$ss$android$ugc$aweme$music$OriginalMusician(final Vex vex, ODk oDk) {
        if (vex == null) {
            return oDk;
        }
        oDk = new ODk();
        oDk.musicCount = 0H1.LIZ(vex.music_count, oDk.musicCount);
        oDk.musicUseCount = 0H1.LIZ(vex.music_used_count, oDk.musicUseCount);
        oDk.musicQrcodeUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vex.music_qrcode_url, oDk.musicQrcodeUrl);
        oDk.musicCoverUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vex.music_cover_url, oDk.musicCoverUrl);
        oDk.diggCount = 0H1.LIZ(vex.digg_count, oDk.diggCount);
        return oDk;
    }
    
    public static C8l com$ss$ugc$aweme$proto$OriginalSharedVideoInfoStructV2$$com$ss$android$ugc$aweme$sticker$data$VideoShareInfoStruct(final Vel vel, final C8l c8l) {
        if (vel == null) {
            return c8l;
        }
        final C8l c8l2 = new C8l();
        String authorId;
        if (vel.original_author_id == null) {
            authorId = c8l2.authorId;
        }
        else {
            authorId = vel.original_author_id;
        }
        c8l2.authorId = authorId;
        String authorName;
        if (vel.original_author_name == null) {
            authorName = c8l2.authorName;
        }
        else {
            authorName = vel.original_author_name;
        }
        c8l2.authorName = authorName;
        String awemeId;
        if (vel.original_item_id == null) {
            awemeId = c8l2.awemeId;
        }
        else {
            awemeId = vel.original_item_id;
        }
        c8l2.awemeId = awemeId;
        String secAuthorId;
        if (vel.original_sec_author_id == null) {
            secAuthorId = c8l2.secAuthorId;
        }
        else {
            secAuthorId = vel.original_sec_author_id;
        }
        c8l2.secAuthorId = secAuthorId;
        return c8l2;
    }
    
    public static OriginalSound com$ss$ugc$aweme$proto$OriginalSoundStructV2$$com$ss$android$ugc$aweme$feed$model$OriginalSound(final Vcb vcb, OriginalSound originalSound) {
        if (vcb == null) {
            return originalSound;
        }
        originalSound = new OriginalSound();
        originalSound.playAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vcb.play_addr, originalSound.playAddr);
        return originalSound;
    }
    
    public static GeneralPermission com$ss$ugc$aweme$proto$PermissionStructV2$$com$ss$android$ugc$aweme$profile$model$GeneralPermission(final VeY veY, GeneralPermission generalPermission) {
        if (veY == null) {
            return generalPermission;
        }
        generalPermission = new GeneralPermission();
        generalPermission.mFollowToast = 0H1.LIZ(veY.follow_toast, generalPermission.mFollowToast);
        generalPermission.mOriginalList = 0H1.LIZ(veY.original_list, generalPermission.mOriginalList);
        generalPermission.mShopToast = 0H1.LIZ(veY.shop_toast, generalPermission.mShopToast);
        generalPermission.mShareToast = 0H1.LIZ(veY.share_toast, generalPermission.mShareToast);
        return generalPermission;
    }
    
    public static PlatformInfo com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$com$ss$android$ugc$aweme$profile$model$PlatformInfo(final Va6 va6, final PlatformInfo platformInfo) {
        if (va6 == null) {
            return platformInfo;
        }
        final PlatformInfo platformInfo2 = new PlatformInfo();
        String patformName;
        if (va6.platform_name == null) {
            patformName = platformInfo2.patformName;
        }
        else {
            patformName = va6.platform_name;
        }
        platformInfo2.patformName = patformName;
        String nickName;
        if (va6.nickname == null) {
            nickName = platformInfo2.nickName;
        }
        else {
            nickName = va6.nickname;
        }
        platformInfo2.nickName = nickName;
        platformInfo2.fullSynced = 0H1.LIZ(va6.full_synced, platformInfo2.fullSynced);
        return platformInfo2;
    }
    
    public static PlayTokenAuth com$ss$ugc$aweme$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth(final Vg2 vg2, final PlayTokenAuth playTokenAuth) {
        if (vg2 == null) {
            return playTokenAuth;
        }
        final PlayTokenAuth playTokenAuth2 = new PlayTokenAuth();
        String vid;
        if (vg2.vid == null) {
            vid = playTokenAuth2.vid;
        }
        else {
            vid = vg2.vid;
        }
        playTokenAuth2.vid = vid;
        String token;
        if (vg2.token == null) {
            token = playTokenAuth2.token;
        }
        else {
            token = vg2.token;
        }
        playTokenAuth2.token = token;
        String auth;
        if (vg2.auth == null) {
            auth = playTokenAuth2.auth;
        }
        else {
            auth = vg2.auth;
        }
        playTokenAuth2.auth = auth;
        List hosts;
        if (vg2.hosts == null) {
            hosts = playTokenAuth2.hosts;
        }
        else {
            hosts = vg2.hosts;
        }
        playTokenAuth2.hosts = hosts;
        return playTokenAuth2;
    }
    
    public static PlayListInfo com$ss$ugc$aweme$proto$PlaylistInfoV2$$com$ss$android$ugc$aweme$feed$model$PlayListInfo(final VeS veS, final PlayListInfo playListInfo) {
        if (veS == null) {
            return playListInfo;
        }
        final PlayListInfo playListInfo2 = new PlayListInfo();
        String mixId;
        if (veS.mix_id == null) {
            mixId = playListInfo2.mixId;
        }
        else {
            mixId = veS.mix_id;
        }
        playListInfo2.mixId = mixId;
        String mixName;
        if (veS.name == null) {
            mixName = playListInfo2.mixName;
        }
        else {
            mixName = veS.name;
        }
        playListInfo2.mixName = mixName;
        Integer index;
        if (veS.index == null) {
            index = playListInfo2.index;
        }
        else {
            index = veS.index;
        }
        playListInfo2.index = index;
        playListInfo2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(veS.icon, playListInfo2.icon);
        Long itemTotal;
        if (veS.item_total == null) {
            itemTotal = playListInfo2.itemTotal;
        }
        else {
            itemTotal = veS.item_total;
        }
        playListInfo2.itemTotal = itemTotal;
        return playListInfo2;
    }
    
    public static PoiAddressInfo com$ss$ugc$aweme$proto$PoiAddressInfoV2$$com$ss$android$ugc$aweme$poi$PoiAddressInfo(final VlE vlE, final PoiAddressInfo poiAddressInfo) {
        if (vlE == null) {
            return poiAddressInfo;
        }
        final PoiAddressInfo poiAddressInfo2 = new PoiAddressInfo();
        String cityName;
        if (vlE.city_name == null) {
            cityName = poiAddressInfo2.cityName;
        }
        else {
            cityName = vlE.city_name;
        }
        poiAddressInfo2.cityName = cityName;
        String cityCode;
        if (vlE.city_code == null) {
            cityCode = poiAddressInfo2.cityCode;
        }
        else {
            cityCode = vlE.city_code;
        }
        poiAddressInfo2.cityCode = cityCode;
        String regionCode;
        if (vlE.region_code == null) {
            regionCode = poiAddressInfo2.regionCode;
        }
        else {
            regionCode = vlE.region_code;
        }
        poiAddressInfo2.regionCode = regionCode;
        String lng;
        if (vlE.lng == null) {
            lng = poiAddressInfo2.lng;
        }
        else {
            lng = vlE.lng;
        }
        poiAddressInfo2.lng = lng;
        String lat;
        if (vlE.lat == null) {
            lat = poiAddressInfo2.lat;
        }
        else {
            lat = vlE.lat;
        }
        poiAddressInfo2.lat = lat;
        return poiAddressInfo2;
    }
    
    public static PoiAnchorInfo com$ss$ugc$aweme$proto$PoiAnchorInfoV2$$com$ss$android$ugc$aweme$poi$PoiAnchorInfo(final VaC vaC, final PoiAnchorInfo poiAnchorInfo) {
        if (vaC == null) {
            return poiAnchorInfo;
        }
        final PoiAnchorInfo poiAnchorInfo2 = new PoiAnchorInfo();
        String suffix;
        if (vaC.suffix == null) {
            suffix = poiAnchorInfo2.suffix;
        }
        else {
            suffix = vaC.suffix;
        }
        poiAnchorInfo2.suffix = suffix;
        poiAnchorInfo2.subTags = List$com$ss$ugc$aweme$proto$PoiSubTagV2$$List$com$ss$android$ugc$aweme$poi$PoiSubTag(vaC.sub_tags, poiAnchorInfo2.subTags);
        Integer subTagExpType;
        if (vaC.sub_tag_exp_type == null) {
            subTagExpType = poiAnchorInfo2.subTagExpType;
        }
        else {
            subTagExpType = vaC.sub_tag_exp_type;
        }
        poiAnchorInfo2.subTagExpType = subTagExpType;
        Integer subTagExpTime;
        if (vaC.sub_tag_exp_time == null) {
            subTagExpTime = poiAnchorInfo2.subTagExpTime;
        }
        else {
            subTagExpTime = vaC.sub_tag_exp_time;
        }
        poiAnchorInfo2.subTagExpTime = subTagExpTime;
        poiAnchorInfo2.hasSubArrow = 0H1.LIZ(vaC.has_sub_arrow, poiAnchorInfo2.hasSubArrow);
        String trackInfo;
        if (vaC.track_info == null) {
            trackInfo = poiAnchorInfo2.trackInfo;
        }
        else {
            trackInfo = vaC.track_info;
        }
        poiAnchorInfo2.trackInfo = trackInfo;
        return poiAnchorInfo2;
    }
    
    public static PoiDataStruct com$ss$ugc$aweme$proto$PoiDataStructV2$$com$ss$android$ugc$aweme$poi$PoiDataStruct(final VlH vlH, final PoiDataStruct poiDataStruct) {
        if (vlH == null) {
            return poiDataStruct;
        }
        final PoiDataStruct poiDataStruct2 = new PoiDataStruct();
        String poiName;
        if (vlH.poi_name == null) {
            poiName = poiDataStruct2.poiName;
        }
        else {
            poiName = vlH.poi_name;
        }
        poiDataStruct2.poiName = poiName;
        String poiId;
        if (vlH.poi_id == null) {
            poiId = poiDataStruct2.poiId;
        }
        else {
            poiId = vlH.poi_id;
        }
        poiDataStruct2.poiId = poiId;
        String poiType;
        if (vlH.poi_type == null) {
            poiType = poiDataStruct2.poiType;
        }
        else {
            poiType = vlH.poi_type;
        }
        poiDataStruct2.poiType = poiType;
        String infoSource;
        if (vlH.info_source == null) {
            infoSource = poiDataStruct2.infoSource;
        }
        else {
            infoSource = vlH.info_source;
        }
        poiDataStruct2.infoSource = infoSource;
        String collectInfo;
        if (vlH.collect_info == null) {
            collectInfo = poiDataStruct2.collectInfo;
        }
        else {
            collectInfo = vlH.collect_info;
        }
        poiDataStruct2.collectInfo = collectInfo;
        poiDataStruct2.poiMapkitCollect = 0H1.LIZ(vlH.poi_mapkit_collect, poiDataStruct2.poiMapkitCollect);
        poiDataStruct2.videoCount = 0H1.LIZ(vlH.video_count, poiDataStruct2.videoCount);
        poiDataStruct2.addressInfo = com$ss$ugc$aweme$proto$PoiAddressInfoV2$$com$ss$android$ugc$aweme$poi$PoiAddressInfo(vlH.address_info, poiDataStruct2.addressInfo);
        poiDataStruct2.videoAnchor = com$ss$ugc$aweme$proto$PoiAnchorInfoV2$$com$ss$android$ugc$aweme$poi$PoiAnchorInfo(vlH.video_anchor, poiDataStruct2.videoAnchor);
        poiDataStruct2.commentAnchor = com$ss$ugc$aweme$proto$PoiAnchorInfoV2$$com$ss$android$ugc$aweme$poi$PoiAnchorInfo(vlH.comment_anchor, poiDataStruct2.commentAnchor);
        return poiDataStruct2;
    }
    
    public static PoiStickerStruct com$ss$ugc$aweme$proto$PoiStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$PoiStickerStruct(final VTs vTs, PoiStickerStruct poiStickerStruct) {
        if (vTs == null) {
            return poiStickerStruct;
        }
        poiStickerStruct = new PoiStickerStruct();
        String poiId;
        if (vTs.poi_id == null) {
            poiId = poiStickerStruct.poiId;
        }
        else {
            poiId = vTs.poi_id;
        }
        poiStickerStruct.poiId = poiId;
        return poiStickerStruct;
    }
    
    public static PoiSubTag com$ss$ugc$aweme$proto$PoiSubTagV2$$com$ss$android$ugc$aweme$poi$PoiSubTag(final Va9 va9, final PoiSubTag poiSubTag) {
        if (va9 == null) {
            return poiSubTag;
        }
        final PoiSubTag poiSubTag2 = new PoiSubTag();
        String name;
        if (va9.name == null) {
            name = poiSubTag2.name;
        }
        else {
            name = va9.name;
        }
        poiSubTag2.name = name;
        Integer type;
        if (va9.type == null) {
            type = poiSubTag2.type;
        }
        else {
            type = va9.type;
        }
        poiSubTag2.type = type;
        poiSubTag2.priority = 0H1.LIZ(va9.priority, poiSubTag2.priority);
        return poiSubTag2;
    }
    
    public static Position com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position(final VUs vUs, Position position) {
        if (vUs == null) {
            return position;
        }
        position = new Position();
        position.begin = 0H1.LIZ(vUs.begin, position.begin);
        position.end = 0H1.LIZ(vUs.end, position.end);
        return position;
    }
    
    public static Preload com$ss$ugc$aweme$proto$PreloadStructV2$$com$ss$android$ugc$aweme$feed$model$Preload(final Vly vly, Preload preload) {
        if (vly == null) {
            return preload;
        }
        preload = new Preload();
        preload.commentPreload = 0H1.LIZ(vly.comment, preload.commentPreload);
        preload.profilePreload = 0H1.LIZ(vly.profile, preload.profilePreload);
        preload.commentPro = 0H1.LIZ(vly.comment_pro, preload.commentPro);
        preload.profilePro = 0H1.LIZ(vly.profile_pro, preload.profilePro);
        preload.commentThres = 0H1.LIZ(vly.comment_thres, preload.commentThres);
        preload.profileThres = 0H1.LIZ(vly.profile_thres, preload.profileThres);
        preload.commentMedianTime = 0H1.LIZ(vly.comment_median_time, preload.commentMedianTime);
        preload.profileMedianTime = 0H1.LIZ(vly.profile_median_time, preload.profileMedianTime);
        preload.modelV2 = 0H1.LIZ(vly.model_v2, preload.modelV2);
        String predictConfig;
        if (vly.predict_config == null) {
            predictConfig = preload.predictConfig;
        }
        else {
            predictConfig = vly.predict_config;
        }
        preload.predictConfig = predictConfig;
        return preload;
    }
    
    public static ProfileBadgeStruct com$ss$ugc$aweme$proto$ProfileBadgeStructV2$$com$ss$android$ugc$aweme$profile$model$ProfileBadgeStruct(final VeA veA, final ProfileBadgeStruct profileBadgeStruct) {
        if (veA == null) {
            return profileBadgeStruct;
        }
        final ProfileBadgeStruct profileBadgeStruct2 = new ProfileBadgeStruct();
        profileBadgeStruct2.id = 0H1.LIZ(veA.id, profileBadgeStruct2.id);
        String name;
        if (veA.name == null) {
            name = profileBadgeStruct2.name;
        }
        else {
            name = veA.name;
        }
        profileBadgeStruct2.name = name;
        String description;
        if (veA.description == null) {
            description = profileBadgeStruct2.description;
        }
        else {
            description = veA.description;
        }
        profileBadgeStruct2.description = description;
        String url;
        if (veA.url == null) {
            url = profileBadgeStruct2.url;
        }
        else {
            url = veA.url;
        }
        profileBadgeStruct2.url = url;
        profileBadgeStruct2.shouldShow = 0H1.LIZ(veA.should_show, profileBadgeStruct2.shouldShow);
        return profileBadgeStruct2;
    }
    
    public static QuestionInfo com$ss$ugc$aweme$proto$QuestionInfoV2$$com$ss$android$ugc$aweme$question$QuestionInfo(final Vge vge, final QuestionInfo questionInfo) {
        if (vge == null) {
            return questionInfo;
        }
        final QuestionInfo questionInfo2 = new QuestionInfo();
        Long liz;
        if (vge.id == null) {
            liz = questionInfo2.LIZ;
        }
        else {
            liz = vge.id;
        }
        questionInfo2.LIZ = liz;
        Long liziz;
        if (vge.item_id == null) {
            liziz = questionInfo2.LIZIZ;
        }
        else {
            liziz = vge.item_id;
        }
        questionInfo2.LIZIZ = liziz;
        Long lizj;
        if (vge.user_id == null) {
            lizj = questionInfo2.LIZJ;
        }
        else {
            lizj = vge.user_id;
        }
        questionInfo2.LIZJ = lizj;
        String lizlll;
        if (vge.username == null) {
            lizlll = questionInfo2.LIZLLL;
        }
        else {
            lizlll = vge.username;
        }
        questionInfo2.LIZLLL = lizlll;
        String lj;
        if (vge.content == null) {
            lj = questionInfo2.LJ;
        }
        else {
            lj = vge.content;
        }
        questionInfo2.LJ = lj;
        questionInfo2.LJFF = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vge.user_avatar, questionInfo2.LJFF);
        return questionInfo2;
    }
    
    public static QaStruct com$ss$ugc$aweme$proto$QuestionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$QaStruct(final Vlm vlm, final QaStruct qaStruct) {
        if (vlm == null) {
            return qaStruct;
        }
        final QaStruct qaStruct2 = new QaStruct();
        qaStruct2.questionId = 0H1.LIZ(vlm.question_id, qaStruct2.questionId);
        qaStruct2.userId = 0H1.LIZ(vlm.user_id, qaStruct2.userId);
        qaStruct2.itemId = 0H1.LIZ(vlm.item_id, qaStruct2.itemId);
        String questionContent;
        if (vlm.content == null) {
            questionContent = qaStruct2.questionContent;
        }
        else {
            questionContent = vlm.content;
        }
        qaStruct2.questionContent = questionContent;
        String userName;
        if (vlm.username == null) {
            userName = qaStruct2.userName;
        }
        else {
            userName = vlm.username;
        }
        qaStruct2.userName = userName;
        qaStruct2.avatarUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vlm.user_avatar, qaStruct2.avatarUrl);
        String secId;
        if (vlm.sec_uid == null) {
            secId = qaStruct2.secId;
        }
        else {
            secId = vlm.sec_uid;
        }
        qaStruct2.secId = secId;
        qaStruct2.inviteShareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(vlm.invite_share_info, qaStruct2.inviteShareInfo);
        String extra;
        if (vlm.extra == null) {
            extra = qaStruct2.extra;
        }
        else {
            extra = vlm.extra;
        }
        qaStruct2.extra = extra;
        String category_meta;
        if (vlm.category_meta == null) {
            category_meta = qaStruct2.category_meta;
        }
        else {
            category_meta = vlm.category_meta;
        }
        qaStruct2.category_meta = category_meta;
        return qaStruct2;
    }
    
    public static QuickShopSecondFloorInfo com$ss$ugc$aweme$proto$QuickShopSecondFloorV2$$com$ss$android$ugc$aweme$profile$model$QuickShopSecondFloorInfo(final VbG vbG, final QuickShopSecondFloorInfo quickShopSecondFloorInfo) {
        if (vbG == null) {
            return quickShopSecondFloorInfo;
        }
        final QuickShopSecondFloorInfo quickShopSecondFloorInfo2 = new QuickShopSecondFloorInfo();
        String processText;
        if (vbG.process_text == null) {
            processText = quickShopSecondFloorInfo2.processText;
        }
        else {
            processText = vbG.process_text;
        }
        quickShopSecondFloorInfo2.processText = processText;
        String enterText;
        if (vbG.enter_text == null) {
            enterText = quickShopSecondFloorInfo2.enterText;
        }
        else {
            enterText = vbG.enter_text;
        }
        quickShopSecondFloorInfo2.enterText = enterText;
        String transBgText;
        if (vbG.trans_bg_text == null) {
            transBgText = quickShopSecondFloorInfo2.transBgText;
        }
        else {
            transBgText = vbG.trans_bg_text;
        }
        quickShopSecondFloorInfo2.transBgText = transBgText;
        return quickShopSecondFloorInfo2;
    }
    
    public static QuickShopInfo com$ss$ugc$aweme$proto$QuickShopStructV2$$com$ss$android$ugc$aweme$profile$model$QuickShopInfo(final VbJ vbJ, final QuickShopInfo quickShopInfo) {
        if (vbJ == null) {
            return quickShopInfo;
        }
        final QuickShopInfo quickShopInfo2 = new QuickShopInfo();
        String quickShopUrl;
        if (vbJ.quick_shop_url == null) {
            quickShopUrl = quickShopInfo2.quickShopUrl;
        }
        else {
            quickShopUrl = vbJ.quick_shop_url;
        }
        quickShopInfo2.quickShopUrl = quickShopUrl;
        String quickShopName;
        if (vbJ.quick_shop_name == null) {
            quickShopName = quickShopInfo2.quickShopName;
        }
        else {
            quickShopName = vbJ.quick_shop_name;
        }
        quickShopInfo2.quickShopName = quickShopName;
        quickShopInfo2.withTextEntry = 0H1.LIZ(vbJ.with_text_entry, quickShopInfo2.withTextEntry);
        quickShopInfo2.secondFloorInfo = com$ss$ugc$aweme$proto$QuickShopSecondFloorV2$$com$ss$android$ugc$aweme$profile$model$QuickShopSecondFloorInfo(vbJ.second_floor_info, quickShopInfo2.secondFloorInfo);
        return quickShopInfo2;
    }
    
    public static RocketFansGroupInfo com$ss$ugc$aweme$proto$RFansGroupInfoV2$$com$ss$android$ugc$aweme$base$share$RocketFansGroupInfo(final VbM vbM, final RocketFansGroupInfo rocketFansGroupInfo) {
        if (vbM == null) {
            return rocketFansGroupInfo;
        }
        final RocketFansGroupInfo rocketFansGroupInfo2 = new RocketFansGroupInfo();
        String schema;
        if (vbM.schema == null) {
            schema = rocketFansGroupInfo2.schema;
        }
        else {
            schema = vbM.schema;
        }
        rocketFansGroupInfo2.schema = schema;
        String token;
        if (vbM.token == null) {
            token = rocketFansGroupInfo2.token;
        }
        else {
            token = vbM.token;
        }
        rocketFansGroupInfo2.token = token;
        String downloadUrl;
        if (vbM.download_url == null) {
            downloadUrl = rocketFansGroupInfo2.downloadUrl;
        }
        else {
            downloadUrl = vbM.download_url;
        }
        rocketFansGroupInfo2.downloadUrl = downloadUrl;
        return rocketFansGroupInfo2;
    }
    
    public static RecReasonStruct com$ss$ugc$aweme$proto$RecReasonEntry$$com$ss$android$ugc$aweme$feed$model$RecReasonStruct(final VUJ vuj, RecReasonStruct recReasonStruct) {
        if (vuj == null) {
            return recReasonStruct;
        }
        recReasonStruct = new RecReasonStruct();
        recReasonStruct.type = 0H1.LIZ(vuj.rec_type, recReasonStruct.type);
        String desc;
        if (vuj.desc == null) {
            desc = recReasonStruct.desc;
        }
        else {
            desc = vuj.desc;
        }
        recReasonStruct.desc = desc;
        return recReasonStruct;
    }
    
    public static RecReasons com$ss$ugc$aweme$proto$RecReasonStruct$$com$ss$android$ugc$aweme$feed$model$RecReasons(final VUM vum, RecReasons recReasons) {
        if (vum == null) {
            return recReasons;
        }
        recReasons = new RecReasons();
        recReasons.value = List$com$ss$ugc$aweme$proto$RecReasonEntry$$List$com$ss$android$ugc$aweme$feed$model$RecReasonStruct(vum.rec_reasons, recReasons.value);
        return recReasons;
    }
    
    public static RecommendAwemeItem com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(final Vdh vdh, final RecommendAwemeItem recommendAwemeItem) {
        if (vdh == null) {
            return recommendAwemeItem;
        }
        final RecommendAwemeItem recommendAwemeItem2 = new RecommendAwemeItem();
        String aid;
        if (vdh.aweme_id == null) {
            aid = recommendAwemeItem2.aid;
        }
        else {
            aid = vdh.aweme_id;
        }
        recommendAwemeItem2.aid = aid;
        recommendAwemeItem2.cover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdh.cover, recommendAwemeItem2.cover);
        recommendAwemeItem2.dynamicCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vdh.dynamic_cover, recommendAwemeItem2.dynamicCover);
        recommendAwemeItem2.mediaType = 0H1.LIZ(vdh.media_type, recommendAwemeItem2.mediaType);
        return recommendAwemeItem2;
    }
    
    public static RelationLabelNew com$ss$ugc$aweme$proto$RelationLabelStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelNew(final VgV vgV, final RelationLabelNew relationLabelNew) {
        if (vgV == null) {
            return relationLabelNew;
        }
        final RelationLabelNew relationLabelNew2 = new RelationLabelNew();
        relationLabelNew2.userList = List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$feed$model$RelationLabelUser(vgV.user_list, relationLabelNew2.userList);
        Integer type;
        if (vgV.type == null) {
            type = relationLabelNew2.type;
        }
        else {
            type = vgV.type;
        }
        relationLabelNew2.type = type;
        relationLabelNew2.extra = 2ob.LIZ(vgV.extra, relationLabelNew2.extra);
        return relationLabelNew2;
    }
    
    public static AwemeRelationRecommendModel com$ss$ugc$aweme$proto$RelationRecommendStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRelationRecommendModel(final VcS vcS, final AwemeRelationRecommendModel awemeRelationRecommendModel) {
        if (vcS == null) {
            return awemeRelationRecommendModel;
        }
        final AwemeRelationRecommendModel awemeRelationRecommendModel2 = new AwemeRelationRecommendModel();
        awemeRelationRecommendModel2.recommendType = 0H1.LIZ(vcS.recommend_type, awemeRelationRecommendModel2.recommendType);
        String relationTextKey;
        if (vcS.relation_text_key == null) {
            relationTextKey = awemeRelationRecommendModel2.relationTextKey;
        }
        else {
            relationTextKey = vcS.relation_text_key;
        }
        awemeRelationRecommendModel2.relationTextKey = relationTextKey;
        String recType;
        if (vcS.rec_type == null) {
            recType = awemeRelationRecommendModel2.recType;
        }
        else {
            recType = vcS.rec_type;
        }
        awemeRelationRecommendModel2.recType = recType;
        String friendTypeStr;
        if (vcS.friend_type_str == null) {
            friendTypeStr = awemeRelationRecommendModel2.friendTypeStr;
        }
        else {
            friendTypeStr = vcS.friend_type_str;
        }
        awemeRelationRecommendModel2.friendTypeStr = friendTypeStr;
        return awemeRelationRecommendModel2;
    }
    
    public static RelationLabelUser com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelUser(final VgY vgY, final RelationLabelUser relationLabelUser) {
        if (vgY == null) {
            return relationLabelUser;
        }
        final RelationLabelUser relationLabelUser2 = new RelationLabelUser();
        relationLabelUser2.uid = 0H1.LIZ(vgY.uid, relationLabelUser2.uid);
        relationLabelUser2.avatarLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vgY.avatar, relationLabelUser2.avatarLarger);
        String nickName;
        if (vgY.nickname == null) {
            nickName = relationLabelUser2.nickName;
        }
        else {
            nickName = vgY.nickname;
        }
        relationLabelUser2.nickName = nickName;
        String remarkName;
        if (vgY.remark_name == null) {
            remarkName = relationLabelUser2.remarkName;
        }
        else {
            remarkName = vgY.remark_name;
        }
        relationLabelUser2.remarkName = remarkName;
        relationLabelUser2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vgY.avatar_thumb, relationLabelUser2.avatarThumb);
        relationLabelUser2.followStatus = 0H1.LIZ(vgY.follow_status, relationLabelUser2.followStatus);
        String secUid;
        if (vgY.sec_uid == null) {
            secUid = relationLabelUser2.secUid;
        }
        else {
            secUid = vgY.sec_uid;
        }
        relationLabelUser2.secUid = secUid;
        return relationLabelUser2;
    }
    
    public static RelativeUserInfo com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(final VgY vgY, RelativeUserInfo relativeUserInfo) {
        if (vgY == null) {
            return relativeUserInfo;
        }
        relativeUserInfo = new RelativeUserInfo();
        relativeUserInfo.uid = 0H1.LIZ(vgY.uid, relativeUserInfo.uid);
        relativeUserInfo.avatar = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vgY.avatar, relativeUserInfo.avatar);
        return relativeUserInfo;
    }
    
    public static ShareInfo com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(final VuL vuL, final ShareInfo shareInfo) {
        if (vuL == null) {
            return shareInfo;
        }
        final ShareInfo shareInfo2 = new ShareInfo();
        String shareUrl;
        if (vuL.share_url == null) {
            shareUrl = shareInfo2.shareUrl;
        }
        else {
            shareUrl = vuL.share_url;
        }
        shareInfo2.shareUrl = shareUrl;
        String shareDesc;
        if (vuL.share_desc == null) {
            shareDesc = shareInfo2.shareDesc;
        }
        else {
            shareDesc = vuL.share_desc;
        }
        shareInfo2.shareDesc = shareDesc;
        String shareTitle;
        if (vuL.share_title == null) {
            shareTitle = shareInfo2.shareTitle;
        }
        else {
            shareTitle = vuL.share_title;
        }
        shareInfo2.shareTitle = shareTitle;
        shareInfo2.qrCodeUrls = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuL.share_qrcode_url, shareInfo2.qrCodeUrls);
        String goodsManagerUrl;
        if (vuL.manage_goods_url == null) {
            goodsManagerUrl = shareInfo2.goodsManagerUrl;
        }
        else {
            goodsManagerUrl = vuL.manage_goods_url;
        }
        shareInfo2.goodsManagerUrl = goodsManagerUrl;
        shareInfo2.imageUrls = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuL.share_image_url, shareInfo2.imageUrls);
        shareInfo2.boolPersist = 0H1.LIZ(vuL.bool_persist, shareInfo2.boolPersist);
        String goodsRecUrl;
        if (vuL.goods_rec_url == null) {
            goodsRecUrl = shareInfo2.goodsRecUrl;
        }
        else {
            goodsRecUrl = vuL.goods_rec_url;
        }
        shareInfo2.goodsRecUrl = goodsRecUrl;
        String shareTitleMyself;
        if (vuL.share_title_myself == null) {
            shareTitleMyself = shareInfo2.shareTitleMyself;
        }
        else {
            shareTitleMyself = vuL.share_title_myself;
        }
        shareInfo2.shareTitleMyself = shareTitleMyself;
        String shareTitleOther;
        if (vuL.share_title_other == null) {
            shareTitleOther = shareInfo2.shareTitleOther;
        }
        else {
            shareTitleOther = vuL.share_title_other;
        }
        shareInfo2.shareTitleOther = shareTitleOther;
        String shareLinkDesc;
        if (vuL.share_link_desc == null) {
            shareLinkDesc = shareInfo2.shareLinkDesc;
        }
        else {
            shareLinkDesc = vuL.share_link_desc;
        }
        shareInfo2.shareLinkDesc = shareLinkDesc;
        String shareSignatureUrl;
        if (vuL.share_signature_url == null) {
            shareSignatureUrl = shareInfo2.shareSignatureUrl;
        }
        else {
            shareSignatureUrl = vuL.share_signature_url;
        }
        shareInfo2.shareSignatureUrl = shareSignatureUrl;
        String shareSignatureDesc;
        if (vuL.share_signature_desc == null) {
            shareSignatureDesc = shareInfo2.shareSignatureDesc;
        }
        else {
            shareSignatureDesc = vuL.share_signature_desc;
        }
        shareInfo2.shareSignatureDesc = shareSignatureDesc;
        String shareQuote;
        if (vuL.share_quote == null) {
            shareQuote = shareInfo2.shareQuote;
        }
        else {
            shareQuote = vuL.share_quote;
        }
        shareInfo2.shareQuote = shareQuote;
        String whatsappShareDesc;
        if (vuL.whatsapp_desc == null) {
            whatsappShareDesc = shareInfo2.whatsappShareDesc;
        }
        else {
            whatsappShareDesc = vuL.whatsapp_desc;
        }
        shareInfo2.whatsappShareDesc = whatsappShareDesc;
        String shareDescInfo;
        if (vuL.share_desc_info == null) {
            shareDescInfo = shareInfo2.shareDescInfo;
        }
        else {
            shareDescInfo = vuL.share_desc_info;
        }
        shareInfo2.shareDescInfo = shareDescInfo;
        return shareInfo2;
    }
    
    public static ShareStruct com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$feed$model$live$ShareStruct(final VuL vuL, final ShareStruct shareStruct) {
        if (vuL == null) {
            return shareStruct;
        }
        final ShareStruct shareStruct2 = new ShareStruct();
        String shareUrl;
        if (vuL.share_url == null) {
            shareUrl = shareStruct2.shareUrl;
        }
        else {
            shareUrl = vuL.share_url;
        }
        shareStruct2.shareUrl = shareUrl;
        String shareWeiboDesc;
        if (vuL.share_weibo_desc == null) {
            shareWeiboDesc = shareStruct2.shareWeiboDesc;
        }
        else {
            shareWeiboDesc = vuL.share_weibo_desc;
        }
        shareStruct2.shareWeiboDesc = shareWeiboDesc;
        String shareDesc;
        if (vuL.share_desc == null) {
            shareDesc = shareStruct2.shareDesc;
        }
        else {
            shareDesc = vuL.share_desc;
        }
        shareStruct2.shareDesc = shareDesc;
        String shareTitle;
        if (vuL.share_title == null) {
            shareTitle = shareStruct2.shareTitle;
        }
        else {
            shareTitle = vuL.share_title;
        }
        shareStruct2.shareTitle = shareTitle;
        shareStruct2.shareQrcodeUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuL.share_qrcode_url, shareStruct2.shareQrcodeUrl);
        shareStruct2.boolPersist = 0H1.LIZ(vuL.bool_persist, shareStruct2.boolPersist);
        String shareLinkDesc;
        if (vuL.share_link_desc == null) {
            shareLinkDesc = shareStruct2.shareLinkDesc;
        }
        else {
            shareLinkDesc = vuL.share_link_desc;
        }
        shareStruct2.shareLinkDesc = shareLinkDesc;
        return shareStruct2;
    }
    
    public static ShareToStoryStruct com$ss$ugc$aweme$proto$ShareToStoryStructV2$$com$ss$android$ugc$aweme$feed$model$ShareToStoryStruct(final JHI jhi, ShareToStoryStruct shareToStoryStruct) {
        if (jhi == null) {
            return shareToStoryStruct;
        }
        shareToStoryStruct = new ShareToStoryStruct();
        shareToStoryStruct.isVisible = 0H1.LIZ(jhi.is_visible, shareToStoryStruct.isVisible);
        return shareToStoryStruct;
    }
    
    public static 2dm com$ss$ugc$aweme$proto$ShowTimeGapRspInfo$$com$ss$android$ugc$aweme$commercialize$feed$timegap$AdShowTimeGapResponse(final Vsr vsr, final 2dm 2dm) {
        if (vsr == null) {
            return 2dm;
        }
        final 2dm 2dm2 = new 2dm();
        2dm2.isEnableGapAdjust = 0H1.LIZ(vsr.enable_client_adgap_adjust, 2dm2.isEnableGapAdjust);
        2dm2.isEnableFastBrowseAdjust = 0H1.LIZ(vsr.enable_fast_browse, 2dm2.isEnableFastBrowseAdjust);
        2dm2.isEnableShowTimeGap = 0H1.LIZ(vsr.enable_showtime_gap, 2dm2.isEnableShowTimeGap);
        2dm2.downstreamRange = 0H1.LIZ(vsr.downstream_range_end, 2dm2.downstreamRange);
        String deltaGapTimeMap;
        if (vsr.adgap_delta_by_time == null) {
            deltaGapTimeMap = 2dm2.deltaGapTimeMap;
        }
        else {
            deltaGapTimeMap = vsr.adgap_delta_by_time;
        }
        2dm2.deltaGapTimeMap = deltaGapTimeMap;
        2dm2.isUserFastBrowseModel = 0H1.LIZ(vsr.use_fast_browse_model, 2dm2.isUserFastBrowseModel);
        2dm2.viewVidNumForFastBrowse = 0H1.LIZ(vsr.viewed_vid_num, 2dm2.viewVidNumForFastBrowse);
        2dm2.singleVidViewTime = 0H1.LIZ(vsr.single_vid_view_time, 2dm2.singleVidViewTime);
        2dm2.fastBrowseTimeThreshold = 0H1.LIZ(vsr.fast_browse_time_threshold, 2dm2.fastBrowseTimeThreshold);
        2dm2.minGap = 0H1.LIZ(vsr.min_gap, 2dm2.minGap);
        return 2dm2;
    }
    
    public static User com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User(final VeG veG, final User user) {
        if (veG == null) {
            return user;
        }
        final User user2 = new User();
        String uid;
        if (veG.uid == null) {
            uid = user2.uid;
        }
        else {
            uid = veG.uid;
        }
        user2.uid = uid;
        String nickname;
        if (veG.nickname == null) {
            nickname = user2.nickname;
        }
        else {
            nickname = veG.nickname;
        }
        user2.nickname = nickname;
        String signature;
        if (veG.signature == null) {
            signature = user2.signature;
        }
        else {
            signature = veG.signature;
        }
        user2.signature = signature;
        user2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(veG.avatar_thumb, user2.avatarThumb);
        user2.followStatus = 0H1.LIZ(veG.follow_status, user2.followStatus);
        user2.userRate = 0H1.LIZ(veG.user_rate, user2.userRate);
        user2.avatarLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(veG.avatar_larger, user2.avatarLarger);
        String uniqueId;
        if (veG.unique_id == null) {
            uniqueId = user2.uniqueId;
        }
        else {
            uniqueId = veG.unique_id;
        }
        user2.uniqueId = uniqueId;
        String secUid;
        if (veG.sec_uid == null) {
            secUid = user2.secUid;
        }
        else {
            secUid = veG.sec_uid;
        }
        user2.secUid = secUid;
        return user2;
    }
    
    public static SpecialSticker com$ss$ugc$aweme$proto$SpecialStickerStructV2$$com$ss$android$ugc$aweme$feed$model$SpecialSticker(final VgK vgK, final SpecialSticker specialSticker) {
        if (vgK == null) {
            return specialSticker;
        }
        final SpecialSticker specialSticker2 = new SpecialSticker();
        specialSticker2.stickerType = 0H1.LIZ(vgK.sticker_type, specialSticker2.stickerType);
        String linkUrl;
        if (vgK.link == null) {
            linkUrl = specialSticker2.linkUrl;
        }
        else {
            linkUrl = vgK.link;
        }
        specialSticker2.linkUrl = linkUrl;
        String title;
        if (vgK.title == null) {
            title = specialSticker2.title;
        }
        else {
            title = vgK.title;
        }
        specialSticker2.title = title;
        String stickerId;
        if (vgK.sticker_id == null) {
            stickerId = specialSticker2.stickerId;
        }
        else {
            stickerId = vgK.sticker_id;
        }
        specialSticker2.stickerId = stickerId;
        specialSticker2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vgK.icon_url, specialSticker2.iconUrl);
        String openUrl;
        if (vgK.open_url == null) {
            openUrl = specialSticker2.openUrl;
        }
        else {
            openUrl = vgK.open_url;
        }
        specialSticker2.openUrl = openUrl;
        return specialSticker2;
    }
    
    public static Story com$ss$ugc$aweme$proto$StoryMetadataV2$$com$ss$android$ugc$aweme$feed$model$story$Story(final VhM vhM, Story story) {
        if (vhM == null) {
            return story;
        }
        story = new Story();
        story.expiredAt = 0H1.LIZ(vhM.expired_at, story.expiredAt);
        story.viewed = 0H1.LIZ(vhM.viewed, story.viewed);
        story.totalComments = 0H1.LIZ(vhM.total_comments, story.totalComments);
        story.isOfficial = 0H1.LIZ(vhM.is_official, story.isOfficial);
        story.viewerCount = 0H1.LIZ(vhM.viewer_count, story.viewerCount);
        story.chatDisable = 0H1.LIZ(vhM.chat_disabled, story.chatDisable);
        return story;
    }
    
    public static StreamUrlStruct com$ss$ugc$aweme$proto$StreamUrlStructV2$$com$ss$android$ugc$aweme$feed$model$live$StreamUrlStruct(final VgN vgN, final StreamUrlStruct streamUrlStruct) {
        if (vgN == null) {
            return streamUrlStruct;
        }
        final StreamUrlStruct streamUrlStruct2 = new StreamUrlStruct();
        streamUrlStruct2.sid = 0H1.LIZ(vgN.sid, streamUrlStruct2.sid);
        String rtmp_pull_url;
        if (vgN.rtmp_pull_url == null) {
            rtmp_pull_url = streamUrlStruct2.rtmp_pull_url;
        }
        else {
            rtmp_pull_url = vgN.rtmp_pull_url;
        }
        streamUrlStruct2.rtmp_pull_url = rtmp_pull_url;
        String rtmp_push_url;
        if (vgN.rtmp_push_url == null) {
            rtmp_push_url = streamUrlStruct2.rtmp_push_url;
        }
        else {
            rtmp_push_url = vgN.rtmp_push_url;
        }
        streamUrlStruct2.rtmp_push_url = rtmp_push_url;
        streamUrlStruct2.provider = 0H1.LIZ(vgN.provider, streamUrlStruct2.provider);
        return streamUrlStruct2;
    }
    
    public static SuggestWordStruct com$ss$ugc$aweme$proto$SuggestWordListStructV2$$com$ss$android$ugc$aweme$feed$model$search$SuggestWordStruct(final VcY vcY, final SuggestWordStruct suggestWordStruct) {
        if (vcY == null) {
            return suggestWordStruct;
        }
        final SuggestWordStruct suggestWordStruct2 = new SuggestWordStruct();
        suggestWordStruct2.words = List$com$ss$ugc$aweme$proto$SuggestWordStructV2$$List$com$ss$android$ugc$aweme$feed$model$search$WordStruct(vcY.words, suggestWordStruct2.words);
        suggestWordStruct2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vcY.icon_url, suggestWordStruct2.iconUrl);
        String scene;
        if (vcY.scene == null) {
            scene = suggestWordStruct2.scene;
        }
        else {
            scene = vcY.scene;
        }
        suggestWordStruct2.scene = scene;
        String hintText;
        if (vcY.hint_text == null) {
            hintText = suggestWordStruct2.hintText;
        }
        else {
            hintText = vcY.hint_text;
        }
        suggestWordStruct2.hintText = hintText;
        String extraInfo;
        if (vcY.extra_info == null) {
            extraInfo = suggestWordStruct2.extraInfo;
        }
        else {
            extraInfo = vcY.extra_info;
        }
        suggestWordStruct2.extraInfo = extraInfo;
        String qrecVirtualEnable;
        if (vcY.qrec_virtual_enable == null) {
            qrecVirtualEnable = suggestWordStruct2.qrecVirtualEnable;
        }
        else {
            qrecVirtualEnable = vcY.qrec_virtual_enable;
        }
        suggestWordStruct2.qrecVirtualEnable = qrecVirtualEnable;
        return suggestWordStruct2;
    }
    
    public static CommentSuggestWordList com$ss$ugc$aweme$proto$SuggestWordListV2$$com$ss$android$ugc$aweme$feed$model$search$CommentSuggestWordList(final VcV vcV, CommentSuggestWordList list) {
        if (vcV == null) {
            return list;
        }
        list = new CommentSuggestWordList();
        list.suggestWords = List$com$ss$ugc$aweme$proto$SuggestWordListStructV2$$List$com$ss$android$ugc$aweme$feed$model$search$SuggestWordStruct(vcV.suggest_words, list.suggestWords);
        return list;
    }
    
    public static WordStruct com$ss$ugc$aweme$proto$SuggestWordStructV2$$com$ss$android$ugc$aweme$feed$model$search$WordStruct(final Vbq vbq, final WordStruct wordStruct) {
        if (vbq == null) {
            return wordStruct;
        }
        final WordStruct wordStruct2 = new WordStruct();
        String word;
        if (vbq.word == null) {
            word = wordStruct2.word;
        }
        else {
            word = vbq.word;
        }
        wordStruct2.word = word;
        String wordId;
        if (vbq.word_id == null) {
            wordId = wordStruct2.wordId;
        }
        else {
            wordId = vbq.word_id;
        }
        wordStruct2.wordId = wordId;
        String info;
        if (vbq.info == null) {
            info = wordStruct2.info;
        }
        else {
            info = vbq.info;
        }
        wordStruct2.info = info;
        return wordStruct2;
    }
    
    public static AwemeActivityContent com$ss$ugc$aweme$proto$TextContentStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivityContent(final VbP vbP, final AwemeActivityContent awemeActivityContent) {
        if (vbP == null) {
            return awemeActivityContent;
        }
        final AwemeActivityContent awemeActivityContent2 = new AwemeActivityContent();
        String text;
        if (vbP.text == null) {
            text = awemeActivityContent2.text;
        }
        else {
            text = vbP.text;
        }
        awemeActivityContent2.text = text;
        String color;
        if (vbP.color == null) {
            color = awemeActivityContent2.color;
        }
        else {
            color = vbP.color;
        }
        awemeActivityContent2.color = color;
        String size;
        if (vbP.size == null) {
            size = awemeActivityContent2.size;
        }
        else {
            size = vbP.size;
        }
        awemeActivityContent2.size = size;
        return awemeActivityContent2;
    }
    
    public static TextExtraStruct com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct(final Vlj vlj, final TextExtraStruct textExtraStruct) {
        if (vlj == null) {
            return textExtraStruct;
        }
        final TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.start = 0H1.LIZ(vlj.start, textExtraStruct2.start);
        textExtraStruct2.end = 0H1.LIZ(vlj.end, textExtraStruct2.end);
        String userId;
        if (vlj.user_id == null) {
            userId = textExtraStruct2.userId;
        }
        else {
            userId = vlj.user_id;
        }
        textExtraStruct2.userId = userId;
        textExtraStruct2.type = 0H1.LIZ(vlj.type, textExtraStruct2.type);
        String hashTagName;
        if (vlj.hashtag_name == null) {
            hashTagName = textExtraStruct2.hashTagName;
        }
        else {
            hashTagName = vlj.hashtag_name;
        }
        textExtraStruct2.hashTagName = hashTagName;
        String cid;
        if (vlj.hashtag_id == null) {
            cid = textExtraStruct2.cid;
        }
        else {
            cid = vlj.hashtag_id;
        }
        textExtraStruct2.cid = cid;
        textExtraStruct2.isCommerce = 0H1.LIZ(vlj.is_commerce, textExtraStruct2.isCommerce);
        String mSecUid;
        if (vlj.sec_uid == null) {
            mSecUid = textExtraStruct2.mSecUid;
        }
        else {
            mSecUid = vlj.sec_uid;
        }
        textExtraStruct2.mSecUid = mSecUid;
        String awemeId;
        if (vlj.aweme_id == null) {
            awemeId = textExtraStruct2.awemeId;
        }
        else {
            awemeId = vlj.aweme_id;
        }
        textExtraStruct2.awemeId = awemeId;
        textExtraStruct2.subType = 0H1.LIZ(vlj.sub_type, textExtraStruct2.subType);
        textExtraStruct2.lineIndex = 0H1.LIZ(vlj.line_idx, textExtraStruct2.lineIndex);
        return textExtraStruct2;
    }
    
    public static 9M9 com$ss$ugc$aweme$proto$TextStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$TextStickerInfo(final Veu veu, final 9M9 9m9) {
        if (veu == null) {
            return 9m9;
        }
        final 9M9 9m10 = new 9M9();
        9m10.textSize = 0H1.LIZ(veu.text_size, 9m10.textSize);
        String textColor;
        if (veu.text_color == null) {
            textColor = 9m10.textColor;
        }
        else {
            textColor = veu.text_color;
        }
        9m10.textColor = textColor;
        String bgColor;
        if (veu.bg_color == null) {
            bgColor = 9m10.bgColor;
        }
        else {
            bgColor = veu.bg_color;
        }
        9m10.bgColor = bgColor;
        String srcLanguage;
        if (veu.text_language == null) {
            srcLanguage = 9m10.srcLanguage;
        }
        else {
            srcLanguage = veu.text_language;
        }
        9m10.srcLanguage = srcLanguage;
        9m10.alignment = 0H1.LIZ(veu.alignment, 9m10.alignment);
        9m10.srcWidth = 0H1.LIZ(veu.source_width, 9m10.srcWidth);
        9m10.srcHeight = 0H1.LIZ(veu.source_height, 9m10.srcHeight);
        return 9m10;
    }
    
    public static TextWithInlineLink com$ss$ugc$aweme$proto$TextWithInlineLinkV2$$com$ss$android$ugc$aweme$feed$model$TextWithInlineLink(final Vbe vbe, final TextWithInlineLink textWithInlineLink) {
        if (vbe == null) {
            return textWithInlineLink;
        }
        final TextWithInlineLink textWithInlineLink2 = new TextWithInlineLink();
        String text;
        if (vbe.text == null) {
            text = textWithInlineLink2.text;
        }
        else {
            text = vbe.text;
        }
        textWithInlineLink2.text = text;
        textWithInlineLink2.links = List$com$ss$ugc$aweme$proto$InlineLinkV2$$List$com$ss$android$ugc$aweme$feed$model$InlineLink(vbe.links, textWithInlineLink2.links);
        return textWithInlineLink2;
    }
    
    public static AwemeTrendingBar com$ss$ugc$aweme$proto$TrendingBarForYouPageStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTrendingBar(final Vl5 vl5, final AwemeTrendingBar awemeTrendingBar) {
        if (vl5 == null) {
            return awemeTrendingBar;
        }
        final AwemeTrendingBar awemeTrendingBar2 = new AwemeTrendingBar();
        awemeTrendingBar2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vl5.icon_url, awemeTrendingBar2.iconUrl);
        String display;
        if (vl5.display == null) {
            display = awemeTrendingBar2.display;
        }
        else {
            display = vl5.display;
        }
        awemeTrendingBar2.display = display;
        String schema;
        if (vl5.schema == null) {
            schema = awemeTrendingBar2.schema;
        }
        else {
            schema = vl5.schema;
        }
        awemeTrendingBar2.schema = schema;
        awemeTrendingBar2.eventKeywordId = 0H1.LIZ(vl5.event_keyword_id, awemeTrendingBar2.eventKeywordId);
        String eventKeyword;
        if (vl5.event_keyword == null) {
            eventKeyword = awemeTrendingBar2.eventKeyword;
        }
        else {
            eventKeyword = vl5.event_keyword;
        }
        awemeTrendingBar2.eventKeyword = eventKeyword;
        String eventTrackingParam;
        if (vl5.event_tracking_param == null) {
            eventTrackingParam = awemeTrendingBar2.eventTrackingParam;
        }
        else {
            eventTrackingParam = vl5.event_tracking_param;
        }
        awemeTrendingBar2.eventTrackingParam = eventTrackingParam;
        return awemeTrendingBar2;
    }
    
    public static AwemeTrendingBar com$ss$ugc$aweme$proto$TrendingBarStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTrendingBar(final Vl8 vl8, final AwemeTrendingBar awemeTrendingBar) {
        if (vl8 == null) {
            return awemeTrendingBar;
        }
        final AwemeTrendingBar awemeTrendingBar2 = new AwemeTrendingBar();
        awemeTrendingBar2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vl8.icon_url, awemeTrendingBar2.iconUrl);
        String display;
        if (vl8.display == null) {
            display = awemeTrendingBar2.display;
        }
        else {
            display = vl8.display;
        }
        awemeTrendingBar2.display = display;
        String schema;
        if (vl8.schema == null) {
            schema = awemeTrendingBar2.schema;
        }
        else {
            schema = vl8.schema;
        }
        awemeTrendingBar2.schema = schema;
        awemeTrendingBar2.eventKeywordId = 0H1.LIZ(vl8.event_keyword_id, awemeTrendingBar2.eventKeywordId);
        String eventKeyword;
        if (vl8.event_keyword == null) {
            eventKeyword = awemeTrendingBar2.eventKeyword;
        }
        else {
            eventKeyword = vl8.event_keyword;
        }
        awemeTrendingBar2.eventKeyword = eventKeyword;
        String eventTrackingParam;
        if (vl8.event_tracking_param == null) {
            eventTrackingParam = awemeTrendingBar2.eventTrackingParam;
        }
        else {
            eventTrackingParam = vl8.event_tracking_param;
        }
        awemeTrendingBar2.eventTrackingParam = eventTrackingParam;
        return awemeTrendingBar2;
    }
    
    public static TtsInfos com$ss$ugc$aweme$proto$TtsAudioStructV2$$com$ss$android$ugc$aweme$feed$model$TtsInfos(final Vch vch, final TtsInfos ttsInfos) {
        if (vch == null) {
            return ttsInfos;
        }
        final TtsInfos ttsInfos2 = new TtsInfos();
        String lang;
        if (vch.lang == null) {
            lang = ttsInfos2.lang;
        }
        else {
            lang = vch.lang;
        }
        ttsInfos2.lang = lang;
        Long languageId;
        if (vch.language_id == null) {
            languageId = ttsInfos2.languageId;
        }
        else {
            languageId = vch.language_id;
        }
        ttsInfos2.languageId = languageId;
        String voiceType;
        if (vch.voice_type == null) {
            voiceType = ttsInfos2.voiceType;
        }
        else {
            voiceType = vch.voice_type;
        }
        ttsInfos2.voiceType = voiceType;
        ttsInfos2.playAddress = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$PlayAddress(vch.play_addr, ttsInfos2.playAddress);
        String volumeInfo;
        if (vch.volume_info == null) {
            volumeInfo = ttsInfos2.volumeInfo;
        }
        else {
            volumeInfo = vch.volume_info;
        }
        ttsInfos2.volumeInfo = volumeInfo;
        return ttsInfos2;
    }
    
    public static UpvotePreloadStruct com$ss$ugc$aweme$proto$UpvotePreloadStructV2$$com$ss$android$ugc$aweme$feed$model$UpvotePreloadStruct(final JHL jhl, UpvotePreloadStruct upvotePreloadStruct) {
        if (jhl == null) {
            return upvotePreloadStruct;
        }
        upvotePreloadStruct = new UpvotePreloadStruct();
        upvotePreloadStruct.needPullUpvoteInfo = 0H1.LIZ(jhl.need_pull_upvote_info, upvotePreloadStruct.needPullUpvoteInfo);
        return upvotePreloadStruct;
    }
    
    public static UpvoteReason com$ss$ugc$aweme$proto$UpvoteReasonV2$$com$ss$android$ugc$aweme$feed$model$upvote$UpvoteReason(final Vf1 vf1, final UpvoteReason upvoteReason) {
        if (vf1 == null) {
            return upvoteReason;
        }
        final UpvoteReason upvoteReason2 = new UpvoteReason();
        Integer reasonType;
        if (vf1.reason_type == null) {
            reasonType = upvoteReason2.reasonType;
        }
        else {
            reasonType = vf1.reason_type;
        }
        upvoteReason2.reasonType = reasonType;
        Integer subType;
        if (vf1.sub_type == null) {
            subType = upvoteReason2.subType;
        }
        else {
            subType = vf1.sub_type;
        }
        upvoteReason2.subType = subType;
        upvoteReason2.middleInfo = List$java$lang$Long$$ArrayJ(vf1.middle_info, upvoteReason2.middleInfo);
        Integer middleCount;
        if (vf1.middle_count == null) {
            middleCount = upvoteReason2.middleCount;
        }
        else {
            middleCount = vf1.middle_count;
        }
        upvoteReason2.middleCount = middleCount;
        upvoteReason2.userId = 0H1.LIZ(vf1.user_id, upvoteReason2.userId);
        upvoteReason2.itemId = 0H1.LIZ(vf1.item_id, upvoteReason2.itemId);
        return upvoteReason2;
    }
    
    public static UrlModel com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(final ViR viR, final UrlModel urlModel) {
        if (viR == null) {
            return urlModel;
        }
        final UrlModel urlModel2 = new UrlModel();
        String uri;
        if (viR.uri == null) {
            uri = urlModel2.uri;
        }
        else {
            uri = viR.uri;
        }
        urlModel2.uri = uri;
        List urlList;
        if (viR.url_list == null) {
            urlList = urlModel2.urlList;
        }
        else {
            urlList = viR.url_list;
        }
        urlModel2.urlList = urlList;
        urlModel2.width = 0H1.LIZ(viR.width, urlModel2.width);
        urlModel2.height = 0H1.LIZ(viR.height, urlModel2.height);
        String urlKey;
        if (viR.url_key == null) {
            urlKey = urlModel2.urlKey;
        }
        else {
            urlKey = viR.url_key;
        }
        urlModel2.urlKey = urlKey;
        urlModel2.size = 0H1.LIZ(viR.data_size, urlModel2.size);
        String fileHash;
        if (viR.file_hash == null) {
            fileHash = urlModel2.fileHash;
        }
        else {
            fileHash = viR.file_hash;
        }
        urlModel2.fileHash = fileHash;
        String ak;
        if (viR.player_access_key == null) {
            ak = urlModel2.aK;
        }
        else {
            ak = viR.player_access_key;
        }
        urlModel2.aK = ak;
        return urlModel2;
    }
    
    public static PlayAddress com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$PlayAddress(final ViR viR, final PlayAddress playAddress) {
        if (viR == null) {
            return playAddress;
        }
        final PlayAddress playAddress2 = new PlayAddress();
        String uri;
        if (viR.uri == null) {
            uri = playAddress2.uri;
        }
        else {
            uri = viR.uri;
        }
        playAddress2.uri = uri;
        List urlList;
        if (viR.url_list == null) {
            urlList = playAddress2.urlList;
        }
        else {
            urlList = viR.url_list;
        }
        playAddress2.urlList = urlList;
        Integer width;
        if (viR.width == null) {
            width = playAddress2.width;
        }
        else {
            width = viR.width;
        }
        playAddress2.width = width;
        Integer height;
        if (viR.height == null) {
            height = playAddress2.height;
        }
        else {
            height = viR.height;
        }
        playAddress2.height = height;
        String urlKey;
        if (viR.url_key == null) {
            urlKey = playAddress2.urlKey;
        }
        else {
            urlKey = viR.url_key;
        }
        playAddress2.urlKey = urlKey;
        Long dataSize;
        if (viR.data_size == null) {
            dataSize = playAddress2.dataSize;
        }
        else {
            dataSize = viR.data_size;
        }
        playAddress2.dataSize = dataSize;
        String fileHash;
        if (viR.file_hash == null) {
            fileHash = playAddress2.fileHash;
        }
        else {
            fileHash = viR.file_hash;
        }
        playAddress2.fileHash = fileHash;
        String fileCS;
        if (viR.file_cs == null) {
            fileCS = playAddress2.fileCS;
        }
        else {
            fileCS = viR.file_cs;
        }
        playAddress2.fileCS = fileCS;
        String playerAccessKey;
        if (viR.player_access_key == null) {
            playerAccessKey = playAddress2.playerAccessKey;
        }
        else {
            playerAccessKey = viR.player_access_key;
        }
        playAddress2.playerAccessKey = playerAccessKey;
        return playAddress2;
    }
    
    public static VideoUrlModel com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(final ViR viR, final VideoUrlModel videoUrlModel) {
        if (viR == null) {
            return videoUrlModel;
        }
        final VideoUrlModel videoUrlModel2 = new VideoUrlModel();
        String uri;
        if (viR.uri == null) {
            uri = ((UrlModel)videoUrlModel2).uri;
        }
        else {
            uri = viR.uri;
        }
        ((UrlModel)videoUrlModel2).uri = uri;
        List urlList;
        if (viR.url_list == null) {
            urlList = ((UrlModel)videoUrlModel2).urlList;
        }
        else {
            urlList = viR.url_list;
        }
        ((UrlModel)videoUrlModel2).urlList = urlList;
        ((UrlModel)videoUrlModel2).width = 0H1.LIZ(viR.width, ((UrlModel)videoUrlModel2).width);
        ((UrlModel)videoUrlModel2).height = 0H1.LIZ(viR.height, ((UrlModel)videoUrlModel2).height);
        String urlKey;
        if (viR.url_key == null) {
            urlKey = ((UrlModel)videoUrlModel2).urlKey;
        }
        else {
            urlKey = viR.url_key;
        }
        ((UrlModel)videoUrlModel2).urlKey = urlKey;
        ((UrlModel)videoUrlModel2).size = 0H1.LIZ(viR.data_size, ((UrlModel)videoUrlModel2).size);
        String fileHash;
        if (viR.file_hash == null) {
            fileHash = ((UrlModel)videoUrlModel2).fileHash;
        }
        else {
            fileHash = viR.file_hash;
        }
        ((UrlModel)videoUrlModel2).fileHash = fileHash;
        String fileCheckSum;
        if (viR.file_cs == null) {
            fileCheckSum = videoUrlModel2.fileCheckSum;
        }
        else {
            fileCheckSum = viR.file_cs;
        }
        videoUrlModel2.fileCheckSum = fileCheckSum;
        String ak;
        if (viR.player_access_key == null) {
            ak = ((UrlModel)videoUrlModel2).aK;
        }
        else {
            ak = viR.player_access_key;
        }
        ((UrlModel)videoUrlModel2).aK = ak;
        return videoUrlModel2;
    }
    
    public static UserProfileInitInfo com$ss$ugc$aweme$proto$UserProfileStructV2$$com$ss$android$ugc$aweme$feed$model$UserProfileInitInfo(final VTm vTm, UserProfileInitInfo userProfileInitInfo) {
        if (vTm == null) {
            return userProfileInitInfo;
        }
        userProfileInitInfo = new UserProfileInitInfo();
        userProfileInitInfo.headModelScore = 0H1.LIZ(vTm.head_model_score, userProfileInitInfo.headModelScore);
        return userProfileInitInfo;
    }
    
    public static UserStory com$ss$ugc$aweme$proto$UserStoryV2$$com$ss$android$ugc$aweme$feed$model$story$UserStory(final Vlb vlb, UserStory userStory) {
        if (vlb == null) {
            return userStory;
        }
        userStory = new UserStory();
        userStory.stories = List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(vlb.stories, userStory.stories);
        userStory.totalCount = 0H1.LIZ(vlb.total_count, userStory.totalCount);
        userStory.currentPosition = 0H1.LIZ(vlb.current_position, userStory.currentPosition);
        userStory.allViewed = 0H1.LIZ(vlb.all_viewed, userStory.allViewed);
        userStory.minCursor = 0H1.LIZ(vlb.min_cursor, userStory.minCursor);
        userStory.maxCursor = 0H1.LIZ(vlb.max_cursor, userStory.maxCursor);
        userStory.hasMoreAfter = 0H1.LIZ(vlb.has_more_after, userStory.hasMoreAfter);
        userStory.hasMoreBefore = 0H1.LIZ(vlb.has_more_before, userStory.hasMoreBefore);
        userStory.lastStoryCreatedAt = 0H1.LIZ(vlb.last_story_created_at, userStory.lastStoryCreatedAt);
        userStory.isPostStyle = 0H1.LIZ(vlb.is_post_style, userStory.isPostStyle);
        return userStory;
    }
    
    public static A2p com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$commercialize$model$BrandedContentAccount(final WXu wXu, final A2p a2p) {
        if (wXu == null) {
            return a2p;
        }
        final A2p a2p2 = new A2p('\0');
        String liz;
        if (wXu.uid == null) {
            liz = a2p2.LIZ;
        }
        else {
            liz = wXu.uid;
        }
        a2p2.LIZ = liz;
        String liziz;
        if (wXu.nickname == null) {
            liziz = a2p2.LIZIZ;
        }
        else {
            liziz = wXu.nickname;
        }
        a2p2.LIZIZ = liziz;
        return a2p2;
    }
    
    public static User com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(final WXu wXu, final User user) {
        if (wXu == null) {
            return user;
        }
        final User user2 = new User();
        String uid;
        if (wXu.uid == null) {
            uid = user2.uid;
        }
        else {
            uid = wXu.uid;
        }
        user2.uid = uid;
        String shortId;
        if (wXu.short_id == null) {
            shortId = user2.shortId;
        }
        else {
            shortId = wXu.short_id;
        }
        user2.shortId = shortId;
        String nickname;
        if (wXu.nickname == null) {
            nickname = user2.nickname;
        }
        else {
            nickname = wXu.nickname;
        }
        user2.nickname = nickname;
        String signature;
        if (wXu.signature == null) {
            signature = user2.signature;
        }
        else {
            signature = wXu.signature;
        }
        user2.signature = signature;
        user2.avatarLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(wXu.avatar_larger, user2.avatarLarger);
        user2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(wXu.avatar_thumb, user2.avatarThumb);
        user2.avatarMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(wXu.avatar_medium, user2.avatarMedium);
        String birthday;
        if (wXu.birthday == null) {
            birthday = user2.birthday;
        }
        else {
            birthday = wXu.birthday;
        }
        user2.birthday = birthday;
        user2.followStatus = 0H1.LIZ(wXu.follow_status, user2.followStatus);
        user2.awemeCount = 0H1.LIZ(wXu.aweme_count, user2.awemeCount);
        user2.followingCount = 0H1.LIZ(wXu.following_count, user2.followingCount);
        user2.followerCount = 0H1.LIZ(wXu.follower_count, user2.followerCount);
        user2.favoritingCount = 0H1.LIZ(wXu.favoriting_count, user2.favoritingCount);
        user2.totalFavorited = 0H1.LIZ(wXu.total_favorited, user2.totalFavorited);
        user2.isBlock = 0H1.LIZ(wXu.is_block, user2.isBlock);
        user2.hideSearch = 0H1.LIZ(wXu.hide_search, user2.hideSearch);
        String customVerify;
        if (wXu.custom_verify == null) {
            customVerify = user2.customVerify;
        }
        else {
            customVerify = wXu.custom_verify;
        }
        user2.customVerify = customVerify;
        String uniqueId;
        if (wXu.unique_id == null) {
            uniqueId = user2.uniqueId;
        }
        else {
            uniqueId = wXu.unique_id;
        }
        user2.uniqueId = uniqueId;
        String bindPhone;
        if (wXu.bind_phone == null) {
            bindPhone = user2.bindPhone;
        }
        else {
            bindPhone = wXu.bind_phone;
        }
        user2.bindPhone = bindPhone;
        user2.needRecommend = 0H1.LIZ(wXu.need_recommend, user2.needRecommend);
        String recommendReason;
        if (wXu.recommend_reason == null) {
            recommendReason = user2.recommendReason;
        }
        else {
            recommendReason = wXu.recommend_reason;
        }
        user2.recommendReason = recommendReason;
        user2.hasFacebookToken = 0H1.LIZ(wXu.has_facebook_token, user2.hasFacebookToken);
        user2.hasTwitterToken = 0H1.LIZ(wXu.has_twitter_token, user2.hasTwitterToken);
        user2.fbExpireTime = 0H1.LIZ(wXu.fb_expire_time, user2.fbExpireTime);
        user2.twExpireTime = 0H1.LIZ(wXu.tw_expire_time, user2.twExpireTime);
        user2.hasYoutubeToken = 0H1.LIZ(wXu.has_youtube_token, user2.hasYoutubeToken);
        user2.youtubeExpireTime = 0H1.LIZ(wXu.youtube_expire_time, user2.youtubeExpireTime);
        user2.roomId = 0H1.LIZ(wXu.room_id, user2.roomId);
        user2.authorityStatus = 0H1.LIZ(wXu.authority_status, user2.authorityStatus);
        String verifyInfo;
        if (wXu.verify_info == null) {
            verifyInfo = user2.verifyInfo;
        }
        else {
            verifyInfo = wXu.verify_info;
        }
        user2.verifyInfo = verifyInfo;
        user2.shieldFollowNotice = 0H1.LIZ(wXu.shield_follow_notice, user2.shieldFollowNotice);
        user2.shieldDiggNotice = 0H1.LIZ(wXu.shield_digg_notice, user2.shieldDiggNotice);
        user2.shieldCommentNotice = 0H1.LIZ(wXu.shield_comment_notice, user2.shieldCommentNotice);
        user2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(wXu.share_info, user2.shareInfo);
        user2.withCommerceEntry = 0H1.LIZ(wXu.with_commerce_entry, user2.withCommerceEntry);
        user2.verificationType = 0H1.LIZ(wXu.verification_type, user2.verificationType);
        user2.originalMusician = com$ss$ugc$aweme$proto$OriginalMusicianStructV2$$com$ss$android$ugc$aweme$music$OriginalMusician(wXu.original_musician, user2.originalMusician);
        String enterpriseVerifyReason;
        if (wXu.enterprise_verify_reason == null) {
            enterpriseVerifyReason = user2.enterpriseVerifyReason;
        }
        else {
            enterpriseVerifyReason = wXu.enterprise_verify_reason;
        }
        user2.enterpriseVerifyReason = enterpriseVerifyReason;
        user2.isAdFake = 0H1.LIZ(wXu.is_ad_fake, user2.isAdFake);
        user2.fansCount = 0H1.LIZ(wXu.mplatform_followers_count, user2.fansCount);
        user2.followerDetailList = List$com$ss$ugc$aweme$proto$FollowersDetailV2$$List$com$ss$android$ugc$aweme$profile$model$FollowerDetail(wXu.followers_detail, user2.followerDetailList);
        String region;
        if (wXu.region == null) {
            region = user2.region;
        }
        else {
            region = wXu.region;
        }
        user2.region = region;
        String accountRegion;
        if (wXu.account_region == null) {
            accountRegion = user2.accountRegion;
        }
        else {
            accountRegion = wXu.account_region;
        }
        user2.accountRegion = accountRegion;
        user2.commerceUserLevel = 0H1.LIZ(wXu.commerce_user_level, user2.commerceUserLevel);
        user2.commerceInfo = com$ss$ugc$aweme$proto$CommerceInfoStructV2$$com$ss$android$ugc$aweme$commerce$CommerceInfo(wXu.commerce_info, user2.commerceInfo);
        user2.liveAgreement = 0H1.LIZ(wXu.live_agreement, user2.liveAgreement);
        user2.platformInfos = List$com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$Arraycom$ss$android$ugc$aweme$profile$model$PlatformInfo(wXu.platform_sync_info, user2.platformInfos);
        user2.withShopEntry = 0H1.LIZ(wXu.with_shop_entry, user2.withShopEntry);
        user2.isDisciplineMember = 0H1.LIZ(wXu.is_discipline_member, user2.isDisciplineMember);
        user2.secret = 0H1.LIZ(wXu.secret, user2.secret);
        user2.hasOrders = 0H1.LIZ(wXu.has_orders, user2.hasOrders);
        user2.preventDownload = 0H1.LIZ(wXu.prevent_download, user2.preventDownload);
        user2.showImageBubble = 0H1.LIZ(wXu.show_image_bubble, user2.showImageBubble);
        user2.unique_id_modify_time = 0H1.LIZ(wXu.unique_id_modify_time, user2.unique_id_modify_time);
        user2.avatarVideoUri = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(wXu.video_icon, user2.avatarVideoUri);
        String insId;
        if (wXu.ins_id == null) {
            insId = user2.insId;
        }
        else {
            insId = wXu.ins_id;
        }
        user2.insId = insId;
        String youtubeChannelId;
        if (wXu.youtube_channel_id == null) {
            youtubeChannelId = user2.youtubeChannelId;
        }
        else {
            youtubeChannelId = wXu.youtube_channel_id;
        }
        user2.youtubeChannelId = youtubeChannelId;
        String youtubeChannelTitle;
        if (wXu.youtube_channel_title == null) {
            youtubeChannelTitle = user2.youtubeChannelTitle;
        }
        else {
            youtubeChannelTitle = wXu.youtube_channel_title;
        }
        user2.youtubeChannelTitle = youtubeChannelTitle;
        user2.isPhoneBinded = 0H1.LIZ(wXu.is_phone_binded, user2.isPhoneBinded);
        user2.loginPlatform = 0H1.LIZ(wXu.login_platform, user2.loginPlatform);
        user2.acceptPrivatePolicy = 0H1.LIZ(wXu.accept_private_policy, user2.acceptPrivatePolicy);
        String twitterId;
        if (wXu.twitter_id == null) {
            twitterId = user2.twitterId;
        }
        else {
            twitterId = wXu.twitter_id;
        }
        user2.twitterId = twitterId;
        String twitterName;
        if (wXu.twitter_name == null) {
            twitterName = user2.twitterName;
        }
        else {
            twitterName = wXu.twitter_name;
        }
        user2.twitterName = twitterName;
        user2.userCancelled = 0H1.LIZ(wXu.user_canceled, user2.userCancelled);
        user2.hasEmail = 0H1.LIZ(wXu.has_email, user2.hasEmail);
        user2.registerTime = 0H1.LIZ(wXu.register_time, user2.registerTime);
        Long createTime;
        if (wXu.create_time == null) {
            createTime = user2.createTime;
        }
        else {
            createTime = wXu.create_time;
        }
        user2.createTime = createTime;
        user2.followerStatus = 0H1.LIZ(wXu.follower_status, user2.followerStatus);
        user2.commentSetting = 0H1.LIZ(wXu.comment_setting, user2.commentSetting);
        user2.duetSetting = ClientSettings$Duet.get(0H1.LIZ(wXu.duet_setting, ClientSettings$Duet.get(user2.duetSetting)));
        user2.userRate = 0H1.LIZ(wXu.user_rate, user2.userRate);
        user2.withNewGoods = 0H1.LIZ(wXu.with_new_goods, user2.withNewGoods);
        user2.roomCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(wXu.room_cover, user2.roomCover);
        user2.downloadSetting = 0H1.LIZ(wXu.download_setting, user2.downloadSetting);
        user2.liveCommerce = 0H1.LIZ(wXu.live_commerce, user2.liveCommerce);
        String country;
        if (wXu.country == null) {
            country = user2.country;
        }
        else {
            country = wXu.country;
        }
        user2.country = country;
        String province;
        if (wXu.province == null) {
            province = user2.province;
        }
        else {
            province = wXu.province;
        }
        user2.province = province;
        String cityName;
        if (wXu.city == null) {
            cityName = user2.cityName;
        }
        else {
            cityName = wXu.city;
        }
        user2.cityName = cityName;
        user2.coverUrls = List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(wXu.cover_url, user2.coverUrls);
        String recommendReasonRelation;
        if (wXu.recommend_reason_relation == null) {
            recommendReasonRelation = user2.recommendReasonRelation;
        }
        else {
            recommendReasonRelation = wXu.recommend_reason_relation;
        }
        user2.recommendReasonRelation = recommendReasonRelation;
        String isoCountryCode;
        if (wXu.iso_country_code == null) {
            isoCountryCode = user2.isoCountryCode;
        }
        else {
            isoCountryCode = wXu.iso_country_code;
        }
        user2.isoCountryCode = isoCountryCode;
        String district;
        if (wXu.district == null) {
            district = user2.district;
        }
        else {
            district = wXu.district;
        }
        user2.district = district;
        String language;
        if (wXu.language == null) {
            language = user2.language;
        }
        else {
            language = wXu.language;
        }
        user2.language = language;
        String roomTypeTag;
        if (wXu.room_type_tag == null) {
            roomTypeTag = user2.roomTypeTag;
        }
        else {
            roomTypeTag = wXu.room_type_tag;
        }
        user2.roomTypeTag = roomTypeTag;
        user2.isCreater = 0H1.LIZ(wXu.has_insights, user2.isCreater);
        String remarkName;
        if (wXu.remark_name == null) {
            remarkName = user2.remarkName;
        }
        else {
            remarkName = wXu.remark_name;
        }
        user2.remarkName = remarkName;
        user2.tabType = 0H1.LIZ(wXu.profile_tab_type, user2.tabType);
        user2.avatarDecoration = com$ss$ugc$aweme$proto$AvatarDecorationStructV2$$com$ss$android$ugc$aweme$profile$model$AvatarDecoration(wXu.avatar_decoration, user2.avatarDecoration);
        user2.watchStatus = 0H1.LIZ(wXu.watch_status, user2.watchStatus);
        user2.withCommerceNewbieTask = 0H1.LIZ(wXu.with_commerce_newbie_task, user2.withCommerceNewbieTask);
        user2.withItemCommerceEntry = 0H1.LIZ(wXu.with_item_commerce_entry, user2.withItemCommerceEntry);
        user2.starBillboardRank = 0H1.LIZ(wXu.star_billboard_rank, user2.starBillboardRank);
        user2.education = 0H1.LIZ(wXu.education, user2.education);
        user2.canModifySchoolInfo = 0H1.LIZ(wXu.can_modify_school_info, user2.canModifySchoolInfo);
        user2.schoolInfoShowRange = 0H1.LIZ(wXu.school_visible, user2.schoolInfoShowRange);
        user2.avatarPendantLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(wXu.avatar_pendant_larger, user2.avatarPendantLarger);
        user2.avatarPendantThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(wXu.avatar_pendant_thumb, user2.avatarPendantThumb);
        user2.avatarPendantMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(wXu.avatar_pendant_medium, user2.avatarPendantMedium);
        user2.recommendAwemeItems = List$com$ss$ugc$aweme$proto$RecommendItemStructV2$$List$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(wXu.item_list, user2.recommendAwemeItems);
        user2.userMode = 0H1.LIZ(wXu.user_mode, user2.userMode);
        user2.userPeriod = 0H1.LIZ(wXu.user_period, user2.userPeriod);
        user2.isEffectArtist = 0H1.LIZ(wXu.is_effect_artist, user2.isEffectArtist);
        user2.effectArtistDetail = com$ss$ugc$aweme$proto$EffectArtistStructV2$$com$ss$android$ugc$aweme$profile$model$EffectArtistDetail(wXu.effect_detail, user2.effectArtistDetail);
        user2.commercePermission = com$ss$ugc$aweme$proto$CommercePermissionStructV2$$com$ss$android$ugc$aweme$profile$model$CommercePermissionStruct(wXu.commerce_permissions, user2.commercePermission);
        user2.storyBlockInfo = com$ss$ugc$aweme$proto$LifeStoryBlockStructV2$$com$ss$android$ugc$aweme$profile$model$StoryBlockInfo(wXu.life_story_block, user2.storyBlockInfo);
        user2.hideFollowingFollowerList = 0H1.LIZ(wXu.hide_following_follower_list, user2.hideFollowingFollowerList);
        user2.isStar = 0H1.LIZ(wXu.is_star, user2.isStar);
        user2.typeLabels = List$java$lang$Long$$ArrayJ(wXu.type_label, user2.typeLabels);
        user2.adCoverUrl = List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(wXu.ad_cover_url, user2.adCoverUrl);
        user2.adCoverTitle = com$ss$ugc$aweme$proto$AdCoverTitleV2$$com$ss$android$ugc$aweme$profile$model$AdCoverTitle(wXu.ad_cover_title, user2.adCoverTitle);
        String adOrderId;
        if (wXu.ad_order_id == null) {
            adOrderId = user2.adOrderId;
        }
        else {
            adOrderId = wXu.ad_order_id;
        }
        user2.adOrderId = adOrderId;
        user2.rFansGroupInfo = com$ss$ugc$aweme$proto$RFansGroupInfoV2$$com$ss$android$ugc$aweme$base$share$RocketFansGroupInfo(wXu.r_fans_group_info, user2.rFansGroupInfo);
        user2.withCommerceEnterpriseTabEntry = 0H1.LIZ(wXu.with_commerce_enterprise_tab_entry, user2.withCommerceEnterpriseTabEntry);
        user2.honorStruct = com$ss$ugc$aweme$proto$LiveHonorStructV2$$com$ss$android$ugc$aweme$profile$model$HonorStruct(wXu.honor_info, user2.honorStruct);
        user2.commentFilterStatus = 0H1.LIZ(wXu.comment_filter_status, user2.commentFilterStatus);
        user2.notifyPrivateAccount = 0H1.LIZ(wXu.notify_private_account, user2.notifyPrivateAccount);
        user2.isBlocked = 0H1.LIZ(wXu.is_blocked, user2.isBlocked);
        user2.forcePrivateAccount = 0H1.LIZ(wXu.force_private_account, user2.forcePrivateAccount);
        user2.withStarAtlasEntry = 0H1.LIZ(wXu.with_star_atlas_entry, user2.withStarAtlasEntry);
        user2.sprintSupportUserInfo = com$ss$ugc$aweme$proto$HotsearchSprintStructV2$$com$ss$android$ugc$aweme$profile$model$HotSearchSprintStruct(wXu.sprint_support_user_info, user2.sprintSupportUserInfo);
        String signatureLanguage;
        if (wXu.signature_language == null) {
            signatureLanguage = user2.signatureLanguage;
        }
        else {
            signatureLanguage = wXu.signature_language;
        }
        user2.signatureLanguage = signatureLanguage;
        user2.brandInfo = com$ss$ugc$aweme$proto$BlueVBrandInfoStructV2$$com$ss$android$ugc$aweme$profile$model$BlueVBrandInfo(wXu.brand_info, user2.brandInfo);
        user2.displayWvalantineActivityEntry = 0H1.LIZ(wXu.display_wvalantine_activity_entry, user2.displayWvalantineActivityEntry);
        String shopMicroApp;
        if (wXu.shop_micro_app == null) {
            shopMicroApp = user2.shopMicroApp;
        }
        else {
            shopMicroApp = wXu.shop_micro_app;
        }
        user2.shopMicroApp = shopMicroApp;
        user2.commerceUserInfo = com$ss$ugc$aweme$proto$CommerceUserStructV2$$com$ss$android$ugc$aweme$profile$model$CommerceUserInfo(wXu.commerce_user_info, user2.commerceUserInfo);
        user2.relativeUserInfos = List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(wXu.relative_users, user2.relativeUserInfos);
        user2.quickShopInfo = com$ss$ugc$aweme$proto$QuickShopStructV2$$com$ss$android$ugc$aweme$profile$model$QuickShopInfo(wXu.quick_shop_info, user2.quickShopInfo);
        user2.challengeList = List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge(wXu.cha_list, user2.challengeList);
        String secUid;
        if (wXu.sec_uid == null) {
            secUid = user2.secUid;
        }
        else {
            secUid = wXu.sec_uid;
        }
        user2.secUid = secUid;
        user2.recommendScore = 0H1.LIZ(wXu.recommend_score, user2.recommendScore);
        user2.mGeneralPermission = com$ss$ugc$aweme$proto$PermissionStructV2$$com$ss$android$ugc$aweme$profile$model$GeneralPermission(wXu.general_permission, user2.mGeneralPermission);
        String bioUrl;
        if (wXu.bio_url == null) {
            bioUrl = user2.bioUrl;
        }
        else {
            bioUrl = wXu.bio_url;
        }
        user2.bioUrl = bioUrl;
        String bioEmail;
        if (wXu.bio_email == null) {
            bioEmail = user2.bioEmail;
        }
        else {
            bioEmail = wXu.bio_email;
        }
        user2.bioEmail = bioEmail;
        Long latestOrderTime;
        if (wXu.latest_order_time == null) {
            latestOrderTime = user2.latestOrderTime;
        }
        else {
            latestOrderTime = wXu.latest_order_time;
        }
        user2.latestOrderTime = latestOrderTime;
        user2.isProAccount = 0H1.LIZ(wXu.is_pro_account, user2.isProAccount);
        String email;
        if (wXu.email == null) {
            email = user2.email;
        }
        else {
            email = wXu.email;
        }
        user2.email = email;
        user2.isEmailVerified = 0H1.LIZ(wXu.is_email_verified, user2.isEmailVerified);
        String bioSecureUrl;
        if (wXu.bio_secure_url == null) {
            bioSecureUrl = user2.bioSecureUrl;
        }
        else {
            bioSecureUrl = wXu.bio_secure_url;
        }
        user2.bioSecureUrl = bioSecureUrl;
        user2.collectCount = 0H1.LIZ(wXu.collect_count, user2.collectCount);
        user2.nicknameUpdateReminder = 0H1.LIZ(wXu.nickname_update_reminder, user2.nicknameUpdateReminder);
        user2.avatarUpdateReminder = 0H1.LIZ(wXu.avatar_update_reminder, user2.avatarUpdateReminder);
        user2.isActivityUser = 0H1.LIZ(wXu.is_activity_user, user2.isActivityUser);
        String roomData;
        if (wXu.room_data == null) {
            roomData = user2.roomData;
        }
        else {
            roomData = wXu.room_data;
        }
        user2.roomData = roomData;
        user2.unReadVideoInfo = com$ss$ugc$aweme$proto$VideoUnreadStructV2$$com$ss$android$ugc$aweme$profile$model$UnReadVideoInfo(wXu.video_unread_info, user2.unReadVideoInfo);
        user2.stitchSetting = ClientSettings$Stitch.get(0H1.LIZ(wXu.stitch_setting, ClientSettings$Stitch.get(user2.stitchSetting)));
        user2.qnaStatus = 0H1.LIZ(wXu.qa_status, user2.qnaStatus);
        user2.mProfileBadgeStruct = com$ss$ugc$aweme$proto$ProfileBadgeStructV2$$com$ss$android$ugc$aweme$profile$model$ProfileBadgeStruct(wXu.badge_info, user2.mProfileBadgeStruct);
        String socialInfo;
        if (wXu.social_info == null) {
            socialInfo = user2.socialInfo;
        }
        else {
            socialInfo = wXu.social_info;
        }
        user2.socialInfo = socialInfo;
        user2.storyStatus = 0H1.LIZ(wXu.story_status, user2.storyStatus);
        user2.matchedFriendStruct = com$ss$ugc$aweme$proto$MatchedFriendStructV2$$com$ss$android$ugc$aweme$profile$model$MatchedFriendStruct(wXu.matched_friend, user2.matchedFriendStruct);
        user2.friendsStatus = 0H1.LIZ(wXu.friends_status, user2.friendsStatus);
        return user2;
    }
    
    public static 8CD com$ss$ugc$aweme$proto$UtteranceV2$$com$ss$android$ugc$aweme$sticker$data$Utterance(final Vde vde, final 8CD 8cd) {
        if (vde == null) {
            return 8cd;
        }
        final 8CD 8cd2 = new 8CD();
        String text;
        if (vde.text == null) {
            text = 8cd2.text;
        }
        else {
            text = vde.text;
        }
        8cd2.text = text;
        8cd2.startTime = 0H1.LIZ(vde.start_time, 8cd2.startTime);
        8cd2.endTime = 0H1.LIZ(vde.end_time, 8cd2.endTime);
        8cd2.textSize = 0H1.LIZ(vde.text_size, 8cd2.textSize);
        String textColor;
        if (vde.text_color == null) {
            textColor = 8cd2.textColor;
        }
        else {
            textColor = vde.text_color;
        }
        8cd2.textColor = textColor;
        String bgColor;
        if (vde.bg_color == null) {
            bgColor = 8cd2.bgColor;
        }
        else {
            bgColor = vde.bg_color;
        }
        8cd2.bgColor = bgColor;
        8cd2.alignment = 0H1.LIZ(vde.alignment, 8cd2.alignment);
        8cd2.srcWidth = 0H1.LIZ(vde.source_width, 8cd2.srcWidth);
        8cd2.srcHeight = 0H1.LIZ(vde.source_height, 8cd2.srcHeight);
        return 8cd2;
    }
    
    public static VideoControl com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl(final Voe voe, final VideoControl videoControl) {
        if (voe == null) {
            return videoControl;
        }
        final VideoControl videoControl2 = new VideoControl();
        Boolean allowDownload;
        if (voe.allow_download == null) {
            allowDownload = videoControl2.allowDownload;
        }
        else {
            allowDownload = voe.allow_download;
        }
        videoControl2.allowDownload = allowDownload;
        videoControl2.shareType = 0H1.LIZ(voe.share_type, videoControl2.shareType);
        final Integer show_progress_bar = voe.show_progress_bar;
        final int showProgressBar = videoControl2.showProgressBar;
        0H1.LIZ(show_progress_bar, ClientSettings$Rewind.get());
        videoControl2.showProgressBar = ClientSettings$Rewind.get();
        final Integer draft_progress_bar = voe.draft_progress_bar;
        final int draftProgressBar = videoControl2.draftProgressBar;
        0H1.LIZ(draft_progress_bar, ClientSettings$Rewind.get());
        videoControl2.draftProgressBar = ClientSettings$Rewind.get();
        videoControl2.isAllowDuet = 0H1.LIZ(voe.allow_duet, videoControl2.isAllowDuet);
        videoControl2.isAllowReact = 0H1.LIZ(voe.allow_react, videoControl2.isAllowReact);
        videoControl2.preventDownloadType = 0H1.LIZ(voe.prevent_download_type, videoControl2.preventDownloadType);
        videoControl2.isAllowDynamicWallpaper = 0H1.LIZ(voe.allow_dynamic_wallpaper, videoControl2.isAllowDynamicWallpaper);
        videoControl2.timerStatus = 0H1.LIZ(voe.timer_status, videoControl2.timerStatus);
        videoControl2.isAllowMusic = 0H1.LIZ(voe.allow_music, videoControl2.isAllowMusic);
        return videoControl2;
    }
    
    public static AwemeStatus$VideoMuteInfo com$ss$ugc$aweme$proto$VideoMuteStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus$VideoMuteInfo(final VUE vue, AwemeStatus$VideoMuteInfo awemeStatus$VideoMuteInfo) {
        if (vue == null) {
            return awemeStatus$VideoMuteInfo;
        }
        awemeStatus$VideoMuteInfo = new AwemeStatus$VideoMuteInfo();
        awemeStatus$VideoMuteInfo.isMute = 0H1.LIZ(vue.is_mute, awemeStatus$VideoMuteInfo.isMute);
        String muteDesc;
        if (vue.mute_desc == null) {
            muteDesc = awemeStatus$VideoMuteInfo.muteDesc;
        }
        else {
            muteDesc = vue.mute_desc;
        }
        awemeStatus$VideoMuteInfo.muteDesc = muteDesc;
        return awemeStatus$VideoMuteInfo;
    }
    
    public static VideoReplyStruct com$ss$ugc$aweme$proto$VideoReplyStructV2$$com$ss$android$ugc$aweme$feed$model$VideoReplyStruct(final Vl2 vl2, final VideoReplyStruct videoReplyStruct) {
        if (vl2 == null) {
            return videoReplyStruct;
        }
        final VideoReplyStruct videoReplyStruct2 = new VideoReplyStruct();
        videoReplyStruct2.awemeId = 0H1.LIZ(vl2.aweme_id, videoReplyStruct2.awemeId);
        videoReplyStruct2.commentId = 0H1.LIZ(vl2.comment_id, videoReplyStruct2.commentId);
        videoReplyStruct2.aliasCommentId = 0H1.LIZ(vl2.alias_comment_id, videoReplyStruct2.aliasCommentId);
        String userName;
        if (vl2.user_name == null) {
            userName = videoReplyStruct2.userName;
        }
        else {
            userName = vl2.user_name;
        }
        videoReplyStruct2.userName = userName;
        String commentMsg;
        if (vl2.comment_msg == null) {
            commentMsg = videoReplyStruct2.commentMsg;
        }
        else {
            commentMsg = vl2.comment_msg;
        }
        videoReplyStruct2.commentMsg = commentMsg;
        videoReplyStruct2.commentUserId = 0H1.LIZ(vl2.comment_user_id, videoReplyStruct2.commentUserId);
        videoReplyStruct2.userAvatar = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vl2.user_avatar, videoReplyStruct2.userAvatar);
        Integer collectStat;
        if (vl2.collect_stat == null) {
            collectStat = videoReplyStruct2.collectStat;
        }
        else {
            collectStat = vl2.collect_stat;
        }
        videoReplyStruct2.collectStat = collectStat;
        return videoReplyStruct2;
    }
    
    public static Video com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(final VuB vuB, final Video video) {
        if (vuB == null) {
            return video;
        }
        final Video video2 = new Video();
        video2.playAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(vuB.play_addr, video2.playAddr);
        video2.cover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuB.cover, video2.cover);
        video2.height = 0H1.LIZ(vuB.height, video2.height);
        video2.width = 0H1.LIZ(vuB.width, video2.width);
        video2.dynamicCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuB.dynamic_cover, video2.dynamicCover);
        video2.originCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuB.origin_cover, video2.originCover);
        String ratio;
        if (vuB.ratio == null) {
            ratio = video2.ratio;
        }
        else {
            ratio = vuB.ratio;
        }
        video2.ratio = ratio;
        video2.downloadAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuB.download_addr, video2.downloadAddr);
        video2.bitRate = List$com$ss$ugc$aweme$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate(vuB.bit_rate, video2.bitRate);
        video2.newDownloadAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuB.new_download_addr, video2.newDownloadAddr);
        video2.videoLength = 0H1.LIZ(vuB.duration, video2.videoLength);
        video2.h264PlayAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(vuB.play_addr_h264, video2.h264PlayAddr);
        video2.uiAlikeAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuB.ui_alike_download_addr, video2.uiAlikeAddr);
        video2.captionDownloadAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuB.caption_download_addr, video2.captionDownloadAddr);
        video2.cdnUrlExpired = 0H1.LIZ(vuB.cdn_url_expired, video2.cdnUrlExpired);
        video2.isLongVideo = 0H1.LIZ(vuB.is_long_video, video2.isLongVideo);
        String dVideoModel;
        if (vuB.video_model == null) {
            dVideoModel = video2.dVideoModel;
        }
        else {
            dVideoModel = vuB.video_model;
        }
        video2.dVideoModel = dVideoModel;
        video2.needSetCookie = 0H1.LIZ(vuB.need_set_token, video2.needSetCookie);
        String miscDownloadAddrs;
        if (vuB.misc_download_addrs == null) {
            miscDownloadAddrs = video2.miscDownloadAddrs;
        }
        else {
            miscDownloadAddrs = vuB.misc_download_addrs;
        }
        video2.miscDownloadAddrs = miscDownloadAddrs;
        video2.drmTokenAuth = com$ss$ugc$aweme$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth(vuB.token_auth, video2.drmTokenAuth);
        video2.playAddrBytevc1 = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(vuB.play_addr_bytevc1, video2.playAddrBytevc1);
        video2.bigThumbs = List$com$ss$ugc$aweme$proto$BigThumbV2$$List$com$ss$android$ugc$aweme$feed$model$BigThumb(vuB.big_thumbs, video2.bigThumbs);
        String meta;
        if (vuB.meta == null) {
            meta = video2.meta;
        }
        else {
            meta = vuB.meta;
        }
        video2.meta = meta;
        video2.captionModel = com$ss$ugc$aweme$proto$ClaStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionModel(vuB.cla_info, video2.captionModel);
        return video2;
    }
    
    public static AwemeTextLabelModel com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(final Ve1 ve1, final AwemeTextLabelModel awemeTextLabelModel) {
        if (ve1 == null) {
            return awemeTextLabelModel;
        }
        final AwemeTextLabelModel awemeTextLabelModel2 = new AwemeTextLabelModel();
        String labelName;
        if (ve1.text == null) {
            labelName = awemeTextLabelModel2.labelName;
        }
        else {
            labelName = ve1.text;
        }
        awemeTextLabelModel2.labelName = labelName;
        String bgColor;
        if (ve1.color == null) {
            bgColor = awemeTextLabelModel2.bgColor;
        }
        else {
            bgColor = ve1.color;
        }
        awemeTextLabelModel2.bgColor = bgColor;
        String textColor;
        if (ve1.color_text == null) {
            textColor = awemeTextLabelModel2.textColor;
        }
        else {
            textColor = ve1.color_text;
        }
        awemeTextLabelModel2.textColor = textColor;
        awemeTextLabelModel2.labelType = 0H1.LIZ(ve1.type, awemeTextLabelModel2.labelType);
        return awemeTextLabelModel2;
    }
    
    public static UnReadVideoInfo com$ss$ugc$aweme$proto$VideoUnreadStructV2$$com$ss$android$ugc$aweme$profile$model$UnReadVideoInfo(final VTv vTv, UnReadVideoInfo unReadVideoInfo) {
        if (vTv == null) {
            return unReadVideoInfo;
        }
        unReadVideoInfo = new UnReadVideoInfo();
        unReadVideoInfo.unReadCount = 0H1.LIZ(vTv.unread_count, unReadVideoInfo.unReadCount);
        unReadVideoInfo.latestUnreadVideoCreatedTime = 0H1.LIZ(vTv.latest_unread_video_created_time, unReadVideoInfo.latestUnreadVideoCreatedTime);
        return unReadVideoInfo;
    }
    
    public static PollStruct$OptionsBean com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$PollStruct$OptionsBean(final Ve4 ve4, final PollStruct$OptionsBean pollStruct$OptionsBean) {
        if (ve4 == null) {
            return pollStruct$OptionsBean;
        }
        final PollStruct$OptionsBean pollStruct$OptionsBean2 = new PollStruct$OptionsBean();
        String optionText;
        if (ve4.option_text == null) {
            optionText = pollStruct$OptionsBean2.optionText;
        }
        else {
            optionText = ve4.option_text;
        }
        pollStruct$OptionsBean2.optionText = optionText;
        pollStruct$OptionsBean2.optionId = 0H1.LIZ(ve4.option_id, pollStruct$OptionsBean2.optionId);
        pollStruct$OptionsBean2.pollCount = 0H1.LIZ(ve4.vote_count, pollStruct$OptionsBean2.pollCount);
        String postOption;
        if (ve4.option == null) {
            postOption = pollStruct$OptionsBean2.postOption;
        }
        else {
            postOption = ve4.option;
        }
        pollStruct$OptionsBean2.postOption = postOption;
        return pollStruct$OptionsBean2;
    }
    
    public static PollStruct com$ss$ugc$aweme$proto$VoteStructV2$$com$ss$android$ugc$aweme$sticker$data$PollStruct(final Ve7 ve7, final PollStruct pollStruct) {
        if (ve7 == null) {
            return pollStruct;
        }
        final PollStruct pollStruct2 = new PollStruct();
        pollStruct2.pollId = 0H1.LIZ(ve7.vote_id, pollStruct2.pollId);
        pollStruct2.refId = 0H1.LIZ(ve7.ref_id, pollStruct2.refId);
        pollStruct2.refType = 0H1.LIZ(ve7.ref_type, pollStruct2.refType);
        String question;
        if (ve7.question == null) {
            question = pollStruct2.question;
        }
        else {
            question = ve7.question;
        }
        pollStruct2.question = question;
        pollStruct2.options = List$com$ss$ugc$aweme$proto$VoteOptionStructV2$$List$com$ss$android$ugc$aweme$sticker$data$PollStruct$OptionsBean(ve7.options, pollStruct2.options);
        pollStruct2.selectOptionId = 0H1.LIZ(ve7.select_option_id, pollStruct2.selectOptionId);
        return pollStruct2;
    }
    
    public static RoomFeedCellStruct com$ss$ugc$aweme$proto$WebcastRoomFeedCellStructV2$$com$ss$android$ugc$aweme$feed$model$live$RoomFeedCellStruct(final Vfq vfq, final RoomFeedCellStruct roomFeedCellStruct) {
        if (vfq == null) {
            return roomFeedCellStruct;
        }
        final RoomFeedCellStruct roomFeedCellStruct2 = new RoomFeedCellStruct();
        roomFeedCellStruct2.room = com$ss$ugc$aweme$proto$WebcastRoomStructV2$$com$ss$android$ugc$aweme$feed$model$live$LiveRoomStruct(vfq.room, roomFeedCellStruct2.room);
        roomFeedCellStruct2.type = 0H1.LIZ(vfq.type, roomFeedCellStruct2.type);
        roomFeedCellStruct2.mFansStruct = com$ss$ugc$aweme$proto$FansStructV2$$com$ss$android$ugc$aweme$feed$model$live$FansStruct(vfq.fans_struct, roomFeedCellStruct2.mFansStruct);
        String tag;
        if (vfq.tag == null) {
            tag = roomFeedCellStruct2.tag;
        }
        else {
            tag = vfq.tag;
        }
        roomFeedCellStruct2.tag = tag;
        roomFeedCellStruct2.tagId = 0H1.LIZ(vfq.tag_id, roomFeedCellStruct2.tagId);
        roomFeedCellStruct2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vfq.icon, roomFeedCellStruct2.icon);
        String distance;
        if (vfq.distance == null) {
            distance = roomFeedCellStruct2.distance;
        }
        else {
            distance = vfq.distance;
        }
        roomFeedCellStruct2.distance = distance;
        roomFeedCellStruct2.newLiveRoomData = 2ob.LIZ(vfq.rawdata, roomFeedCellStruct2.newLiveRoomData);
        return roomFeedCellStruct2;
    }
    
    public static LiveRoomStruct com$ss$ugc$aweme$proto$WebcastRoomStructV2$$com$ss$android$ugc$aweme$feed$model$live$LiveRoomStruct(final Vu9 vu9, final LiveRoomStruct liveRoomStruct) {
        if (vu9 == null) {
            return liveRoomStruct;
        }
        final LiveRoomStruct liveRoomStruct2 = new LiveRoomStruct();
        liveRoomStruct2.id = 0H1.LIZ(vu9.room_id, liveRoomStruct2.id);
        liveRoomStruct2.status = 0H1.LIZ(vu9.status, liveRoomStruct2.status);
        liveRoomStruct2.owner = com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(vu9.owner, liveRoomStruct2.owner);
        String title;
        if (vu9.title == null) {
            title = liveRoomStruct2.title;
        }
        else {
            title = vu9.title;
        }
        liveRoomStruct2.title = title;
        liveRoomStruct2.user_count = 0H1.LIZ(vu9.user_count, liveRoomStruct2.user_count);
        liveRoomStruct2.create_time = 0H1.LIZ(vu9.create_time, liveRoomStruct2.create_time);
        liveRoomStruct2.finish_time = 0H1.LIZ(vu9.finish_time, liveRoomStruct2.finish_time);
        liveRoomStruct2.stream_id = 0H1.LIZ(vu9.stream_id, liveRoomStruct2.stream_id);
        liveRoomStruct2.stream_url = com$ss$ugc$aweme$proto$StreamUrlStructV2$$com$ss$android$ugc$aweme$feed$model$live$StreamUrlStruct(vu9.stream_url, liveRoomStruct2.stream_url);
        liveRoomStruct2.share_info = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$feed$model$live$ShareStruct(vu9.share_info, liveRoomStruct2.share_info);
        liveRoomStruct2.digg_count = 0H1.LIZ(vu9.digg_count, liveRoomStruct2.digg_count);
        liveRoomStruct2.total_user_count = 0H1.LIZ(vu9.total_user_count, liveRoomStruct2.total_user_count);
        liveRoomStruct2.inSandbox = 0H1.LIZ(vu9.in_sandbox, liveRoomStruct2.inSandbox);
        liveRoomStruct2.roomCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vu9.room_cover, liveRoomStruct2.roomCover);
        String roomTypeTag;
        if (vu9.room_type_tag == null) {
            roomTypeTag = liveRoomStruct2.roomTypeTag;
        }
        else {
            roomTypeTag = vu9.room_type_tag;
        }
        liveRoomStruct2.roomTypeTag = roomTypeTag;
        liveRoomStruct2.additional_stream_url = com$ss$ugc$aweme$proto$StreamUrlStructV2$$com$ss$android$ugc$aweme$feed$model$live$StreamUrlStruct(vu9.additional_stream_url, liveRoomStruct2.additional_stream_url);
        liveRoomStruct2.liveTypeAudio = 0H1.LIZ(vu9.live_type_audio, liveRoomStruct2.liveTypeAudio);
        liveRoomStruct2.isThirdParty = 0H1.LIZ(vu9.live_type_third_party, liveRoomStruct2.isThirdParty);
        liveRoomStruct2.isScreenshot = 0H1.LIZ(vu9.live_type_screenshot, liveRoomStruct2.isScreenshot);
        liveRoomStruct2.isOfficialType = 0H1.LIZ(vu9.live_type_official, liveRoomStruct2.isOfficialType);
        liveRoomStruct2.withLinkmic = 0H1.LIZ(vu9.with_linkmic, liveRoomStruct2.withLinkmic);
        return liveRoomStruct2;
    }
    
    public static FeedItemList com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(final Vsn vsn, final FeedItemList list) {
        if (vsn == null) {
            return list;
        }
        final FeedItemList list2 = new FeedItemList();
        list2.status_code = 0H1.LIZ(vsn.status_code, list2.status_code);
        list2.minCursor = 0H1.LIZ(vsn.min_cursor, list2.minCursor);
        list2.maxCursor = 0H1.LIZ(vsn.max_cursor, list2.maxCursor);
        list2.hasMore = 0H1.LIZ(vsn.has_more, list2.hasMore);
        list2.items = List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(vsn.aweme_list, list2.items);
        String requestId;
        if (vsn.rid == null) {
            requestId = list2.requestId;
        }
        else {
            requestId = vsn.rid;
        }
        list2.requestId = requestId;
        list2.refreshClear = 0H1.LIZ(vsn.refresh_clear, list2.refreshClear);
        list2.extra = com$ss$ugc$aweme$proto$ExtraStructV2$$com$ss$android$ugc$aweme$feed$model$Extra(vsn.extra, list2.extra);
        list2.logPb = com$ss$ugc$aweme$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean(vsn.log_pb, list2.logPb);
        list2.hotSearchGuideWord = com$ss$ugc$aweme$proto$GuideWordV2$$com$ss$android$ugc$aweme$feed$model$HotSearchGuideWord(vsn.guide_word, list2.hotSearchGuideWord);
        final List preload_ads = vsn.preload_ads;
        list2.preloadAds = List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(null, list2.preloadAds);
        String status_msg;
        if (vsn.status_msg == null) {
            status_msg = list2.status_msg;
        }
        else {
            status_msg = vsn.status_msg;
        }
        list2.status_msg = status_msg;
        list2.blockCode = 0H1.LIZ(vsn.block_code, list2.blockCode);
        list2.enableReRank = 0H1.LIZ(vsn.enable_re_rank, list2.enableReRank);
        list2.disableAdjustForCache = 0H1.LIZ(vsn.disable_adjust_for_cache, list2.disableAdjustForCache);
        list2.showTimeGapResponse = com$ss$ugc$aweme$proto$ShowTimeGapRspInfo$$com$ss$android$ugc$aweme$commercialize$feed$timegap$AdShowTimeGapResponse(vsn.showtime_gap_rsp_info, list2.showTimeGapResponse);
        list2.hasAd = 0H1.LIZ(vsn.has_ad, list2.hasAd);
        list2.commercePitayaInfo = com$ss$ugc$aweme$proto$CommercePitayaInfo$$com$ss$android$ugc$aweme$commercialize$model$CommercePitayaInfo(vsn.commerce_pitaya_info, list2.commercePitayaInfo);
        String topViewOverDeliveryResult;
        if (vsn.topview_over_delivery_result == null) {
            topViewOverDeliveryResult = list2.topViewOverDeliveryResult;
        }
        else {
            topViewOverDeliveryResult = vsn.topview_over_delivery_result;
        }
        list2.topViewOverDeliveryResult = topViewOverDeliveryResult;
        return list2;
    }
    
    public static AwemeStatistics tiktok$kids$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics(final Vdy vdy, AwemeStatistics awemeStatistics) {
        if (vdy == null) {
            return awemeStatistics;
        }
        awemeStatistics = new AwemeStatistics();
        awemeStatistics.diggCount = 0H1.LIZ(vdy.digg_count, awemeStatistics.diggCount);
        awemeStatistics.playCount = 0H1.LIZ(vdy.play_count, awemeStatistics.playCount);
        awemeStatistics.loseCount = 0H1.LIZ(vdy.lose_count, awemeStatistics.loseCount);
        return awemeStatistics;
    }
    
    public static AwemeStatus tiktok$kids$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus(final Vg5 vg5, AwemeStatus awemeStatus) {
        if (vg5 == null) {
            return awemeStatus;
        }
        awemeStatus = new AwemeStatus();
        awemeStatus.isDelete = 0H1.LIZ(vg5.is_delete, awemeStatus.isDelete);
        awemeStatus.isProhibited = 0H1.LIZ(vg5.is_prohibited, awemeStatus.isProhibited);
        return awemeStatus;
    }
    
    public static Aweme tiktok$kids$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(final VoM voM, final Aweme aweme) {
        if (voM == null) {
            return aweme;
        }
        final Aweme aweme2 = new Aweme();
        String aid;
        if (voM.aweme_id == null) {
            aid = aweme2.aid;
        }
        else {
            aid = voM.aweme_id;
        }
        aweme2.aid = aid;
        aweme2.createTime = 0H1.LIZ(voM.create_time, aweme2.createTime);
        aweme2.author = tiktok$kids$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(voM.author, aweme2.author);
        aweme2.music = tiktok$kids$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(voM.music, aweme2.music);
        aweme2.video = tiktok$kids$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(voM.video, aweme2.video);
        aweme2.userDigg = 0H1.LIZ(voM.user_digged, aweme2.userDigg);
        aweme2.statistics = tiktok$kids$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics(voM.statistics, aweme2.statistics);
        aweme2.status = tiktok$kids$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus(voM.status, aweme2.status);
        String extra;
        if (voM.extra == null) {
            extra = aweme2.extra;
        }
        else {
            extra = voM.extra;
        }
        aweme2.extra = extra;
        aweme2.isVr = 0H1.LIZ(voM.is_vr, aweme2.isVr);
        aweme2.awemeType = 0H1.LIZ(voM.aweme_type, aweme2.awemeType);
        aweme2.imageInfos = List$tiktok$kids$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo(voM.image_infos, aweme2.imageInfos);
        String groupId;
        if (voM.group_id == null) {
            groupId = aweme2.groupId;
        }
        else {
            groupId = voM.group_id;
        }
        aweme2.groupId = groupId;
        aweme2.longVideos = List$tiktok$kids$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo(voM.long_video, aweme2.longVideos);
        String descLanguage;
        if (voM.desc_language == null) {
            descLanguage = aweme2.descLanguage;
        }
        else {
            descLanguage = voM.desc_language;
        }
        aweme2.descLanguage = descLanguage;
        aweme2.takeDownReason = 0H1.LIZ(voM.take_down_reason, aweme2.takeDownReason);
        String takeDownDesc;
        if (voM.take_down_desc == null) {
            takeDownDesc = aweme2.takeDownDesc;
        }
        else {
            takeDownDesc = voM.take_down_desc;
        }
        aweme2.takeDownDesc = takeDownDesc;
        aweme2.distributeType = 0H1.LIZ(voM.distribute_type, aweme2.distributeType);
        return aweme2;
    }
    
    public static BigThumb tiktok$kids$proto$BigThumbV2$$com$ss$android$ugc$aweme$feed$model$BigThumb(final Von von, final BigThumb bigThumb) {
        if (von == null) {
            return bigThumb;
        }
        final BigThumb bigThumb2 = new BigThumb();
        bigThumb2.imgNum = 0H1.LIZ(von.img_num, bigThumb2.imgNum);
        String uri;
        if (von.uri == null) {
            uri = bigThumb2.uri;
        }
        else {
            uri = von.uri;
        }
        bigThumb2.uri = uri;
        String imgUrl;
        if (von.img_url == null) {
            imgUrl = bigThumb2.imgUrl;
        }
        else {
            imgUrl = von.img_url;
        }
        bigThumb2.imgUrl = imgUrl;
        bigThumb2.imgXSize = 0H1.LIZ(von.img_x_size, bigThumb2.imgXSize);
        bigThumb2.imgYSize = 0H1.LIZ(von.img_y_size, bigThumb2.imgYSize);
        bigThumb2.imgXLen = 0H1.LIZ(von.img_x_len, bigThumb2.imgXLen);
        bigThumb2.imgYLen = 0H1.LIZ(von.img_y_len, bigThumb2.imgYLen);
        bigThumb2.duration = 0H1.LIZ(von.duration, bigThumb2.duration);
        bigThumb2.interval = 0H1.LIZ(von.interval, bigThumb2.interval);
        String fext;
        if (von.fext == null) {
            fext = bigThumb2.fext;
        }
        else {
            fext = von.fext;
        }
        bigThumb2.fext = fext;
        return bigThumb2;
    }
    
    public static BitRate tiktok$kids$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate(final VoU voU, final BitRate bitRate) {
        if (voU == null) {
            return bitRate;
        }
        final BitRate bitRate2 = new BitRate();
        String gearName;
        if (voU.gear_name == null) {
            gearName = bitRate2.gearName;
        }
        else {
            gearName = voU.gear_name;
        }
        bitRate2.gearName = gearName;
        bitRate2.qualityType = 0H1.LIZ(voU.quality_type, bitRate2.qualityType);
        bitRate2.bitRate = 0H1.LIZ(voU.bit_rate, bitRate2.bitRate);
        bitRate2.playAddr = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voU.play_addr, bitRate2.playAddr);
        return bitRate2;
    }
    
    public static ImageInfo tiktok$kids$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo(final VoO voO, ImageInfo imageInfo) {
        if (voO == null) {
            return imageInfo;
        }
        imageInfo = new ImageInfo();
        imageInfo.height = 0H1.LIZ(voO.height, imageInfo.height);
        imageInfo.width = 0H1.LIZ(voO.width, imageInfo.width);
        imageInfo.labelLarge = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voO.label_large, imageInfo.labelLarge);
        imageInfo.labelThumb = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(voO.label_thumb, imageInfo.labelThumb);
        return imageInfo;
    }
    
    public static LogPbBean tiktok$kids$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean(final VUk vUk, LogPbBean logPbBean) {
        if (vUk == null) {
            return logPbBean;
        }
        logPbBean = new LogPbBean();
        String imprId;
        if (vUk.impr_id == null) {
            imprId = logPbBean.imprId;
        }
        else {
            imprId = vUk.impr_id;
        }
        logPbBean.imprId = imprId;
        return logPbBean;
    }
    
    public static LongVideo tiktok$kids$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo(final VoJ voJ, LongVideo longVideo) {
        if (voJ == null) {
            return longVideo;
        }
        longVideo = new LongVideo();
        longVideo.video = tiktok$kids$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(voJ.video, longVideo.video);
        longVideo.longVideoType = 0H1.LIZ(voJ.long_video_type, longVideo.longVideoType);
        longVideo.trailerStartTime = 0H1.LIZ(voJ.trailer_start_time, longVideo.trailerStartTime);
        return longVideo;
    }
    
    public static Music tiktok$kids$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(final VuQ vuQ, final Music music) {
        if (vuQ == null) {
            return music;
        }
        final Music music2 = new Music();
        music2.id = 0H1.LIZ(vuQ.id, music2.id);
        String idStr;
        if (vuQ.id_str == null) {
            idStr = music2.idStr;
        }
        else {
            idStr = vuQ.id_str;
        }
        music2.idStr = idStr;
        String musicName;
        if (vuQ.title == null) {
            musicName = music2.musicName;
        }
        else {
            musicName = vuQ.title;
        }
        music2.musicName = musicName;
        String authorName;
        if (vuQ.author == null) {
            authorName = music2.authorName;
        }
        else {
            authorName = vuQ.author;
        }
        music2.authorName = authorName;
        String album;
        if (vuQ.album == null) {
            album = music2.album;
        }
        else {
            album = vuQ.album;
        }
        music2.album = album;
        music2.strongBeatUrl = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuQ.strong_beat_url, music2.strongBeatUrl);
        music2.isArtistMusic = 0H1.LIZ(vuQ.is_author_artist, music2.isArtistMusic);
        music2.coverThumb = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuQ.cover_thumb, music2.coverThumb);
        music2.playUrl = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuQ.play_url, music2.playUrl);
        music2.duration = 0H1.LIZ(vuQ.duration, music2.duration);
        String ownerHandle;
        if (vuQ.owner_handle == null) {
            ownerHandle = music2.ownerHandle;
        }
        else {
            ownerHandle = vuQ.owner_handle;
        }
        music2.ownerHandle = ownerHandle;
        music2.musicStatus = 0H1.LIZ(vuQ.status, music2.musicStatus);
        String offlineDesc;
        if (vuQ.offline_desc == null) {
            offlineDesc = music2.offlineDesc;
        }
        else {
            offlineDesc = vuQ.offline_desc;
        }
        music2.offlineDesc = offlineDesc;
        String ownerId;
        if (vuQ.owner_id == null) {
            ownerId = music2.ownerId;
        }
        else {
            ownerId = vuQ.owner_id;
        }
        music2.ownerId = ownerId;
        String ownerNickName;
        if (vuQ.owner_nickname == null) {
            ownerNickName = music2.ownerNickName;
        }
        else {
            ownerNickName = vuQ.owner_nickname;
        }
        music2.ownerNickName = ownerNickName;
        music2.isOriginMusic = 0H1.LIZ(vuQ.is_original, music2.isOriginMusic);
        music2.isAuthorDeleted = 0H1.LIZ(vuQ.author_deleted, music2.isAuthorDeleted);
        return music2;
    }
    
    public static PlayTokenAuth tiktok$kids$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth(final VlK vlK, final PlayTokenAuth playTokenAuth) {
        if (vlK == null) {
            return playTokenAuth;
        }
        final PlayTokenAuth playTokenAuth2 = new PlayTokenAuth();
        String vid;
        if (vlK.vid == null) {
            vid = playTokenAuth2.vid;
        }
        else {
            vid = vlK.vid;
        }
        playTokenAuth2.vid = vid;
        String token;
        if (vlK.token == null) {
            token = playTokenAuth2.token;
        }
        else {
            token = vlK.token;
        }
        playTokenAuth2.token = token;
        String auth;
        if (vlK.auth == null) {
            auth = playTokenAuth2.auth;
        }
        else {
            auth = vlK.auth;
        }
        playTokenAuth2.auth = auth;
        List hosts;
        if (vlK.hosts == null) {
            hosts = playTokenAuth2.hosts;
        }
        else {
            hosts = vlK.hosts;
        }
        playTokenAuth2.hosts = hosts;
        return playTokenAuth2;
    }
    
    public static UrlModel tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(final VoR voR, final UrlModel urlModel) {
        if (voR == null) {
            return urlModel;
        }
        final UrlModel urlModel2 = new UrlModel();
        String uri;
        if (voR.uri == null) {
            uri = urlModel2.uri;
        }
        else {
            uri = voR.uri;
        }
        urlModel2.uri = uri;
        List urlList;
        if (voR.url_list == null) {
            urlList = urlModel2.urlList;
        }
        else {
            urlList = voR.url_list;
        }
        urlModel2.urlList = urlList;
        urlModel2.width = 0H1.LIZ(voR.width, urlModel2.width);
        urlModel2.height = 0H1.LIZ(voR.height, urlModel2.height);
        String urlKey;
        if (voR.url_key == null) {
            urlKey = urlModel2.urlKey;
        }
        else {
            urlKey = voR.url_key;
        }
        urlModel2.urlKey = urlKey;
        urlModel2.size = 0H1.LIZ(voR.data_size, urlModel2.size);
        String fileHash;
        if (voR.file_hash == null) {
            fileHash = urlModel2.fileHash;
        }
        else {
            fileHash = voR.file_hash;
        }
        urlModel2.fileHash = fileHash;
        String ak;
        if (voR.player_access_key == null) {
            ak = urlModel2.aK;
        }
        else {
            ak = voR.player_access_key;
        }
        urlModel2.aK = ak;
        return urlModel2;
    }
    
    public static VideoUrlModel tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(final VoR voR, final VideoUrlModel videoUrlModel) {
        if (voR == null) {
            return videoUrlModel;
        }
        final VideoUrlModel videoUrlModel2 = new VideoUrlModel();
        String uri;
        if (voR.uri == null) {
            uri = ((UrlModel)videoUrlModel2).uri;
        }
        else {
            uri = voR.uri;
        }
        ((UrlModel)videoUrlModel2).uri = uri;
        List urlList;
        if (voR.url_list == null) {
            urlList = ((UrlModel)videoUrlModel2).urlList;
        }
        else {
            urlList = voR.url_list;
        }
        ((UrlModel)videoUrlModel2).urlList = urlList;
        ((UrlModel)videoUrlModel2).width = 0H1.LIZ(voR.width, ((UrlModel)videoUrlModel2).width);
        ((UrlModel)videoUrlModel2).height = 0H1.LIZ(voR.height, ((UrlModel)videoUrlModel2).height);
        String urlKey;
        if (voR.url_key == null) {
            urlKey = ((UrlModel)videoUrlModel2).urlKey;
        }
        else {
            urlKey = voR.url_key;
        }
        ((UrlModel)videoUrlModel2).urlKey = urlKey;
        ((UrlModel)videoUrlModel2).size = 0H1.LIZ(voR.data_size, ((UrlModel)videoUrlModel2).size);
        String fileHash;
        if (voR.file_hash == null) {
            fileHash = ((UrlModel)videoUrlModel2).fileHash;
        }
        else {
            fileHash = voR.file_hash;
        }
        ((UrlModel)videoUrlModel2).fileHash = fileHash;
        String fileCheckSum;
        if (voR.file_cs == null) {
            fileCheckSum = videoUrlModel2.fileCheckSum;
        }
        else {
            fileCheckSum = voR.file_cs;
        }
        videoUrlModel2.fileCheckSum = fileCheckSum;
        String ak;
        if (voR.player_access_key == null) {
            ak = ((UrlModel)videoUrlModel2).aK;
        }
        else {
            ak = voR.player_access_key;
        }
        ((UrlModel)videoUrlModel2).aK = ak;
        return videoUrlModel2;
    }
    
    public static User tiktok$kids$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(final VuU vuU, final User user) {
        if (vuU == null) {
            return user;
        }
        final User user2 = new User();
        String uid;
        if (vuU.uid == null) {
            uid = user2.uid;
        }
        else {
            uid = vuU.uid;
        }
        user2.uid = uid;
        String shortId;
        if (vuU.short_id == null) {
            shortId = user2.shortId;
        }
        else {
            shortId = vuU.short_id;
        }
        user2.shortId = shortId;
        String nickname;
        if (vuU.nickname == null) {
            nickname = user2.nickname;
        }
        else {
            nickname = vuU.nickname;
        }
        user2.nickname = nickname;
        user2.avatarLarger = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuU.avatar_larger, user2.avatarLarger);
        user2.avatarThumb = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuU.avatar_thumb, user2.avatarThumb);
        user2.avatarMedium = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vuU.avatar_medium, user2.avatarMedium);
        String customVerify;
        if (vuU.custom_verify == null) {
            customVerify = user2.customVerify;
        }
        else {
            customVerify = vuU.custom_verify;
        }
        user2.customVerify = customVerify;
        String uniqueId;
        if (vuU.unique_id == null) {
            uniqueId = user2.uniqueId;
        }
        else {
            uniqueId = vuU.unique_id;
        }
        user2.uniqueId = uniqueId;
        String secUid;
        if (vuU.sec_uid == null) {
            secUid = user2.secUid;
        }
        else {
            secUid = vuU.sec_uid;
        }
        user2.secUid = secUid;
        String region;
        if (vuU.region == null) {
            region = user2.region;
        }
        else {
            region = vuU.region;
        }
        user2.region = region;
        String accountRegion;
        if (vuU.account_region == null) {
            accountRegion = user2.accountRegion;
        }
        else {
            accountRegion = vuU.account_region;
        }
        user2.accountRegion = accountRegion;
        user2.secret = 0H1.LIZ(vuU.secret, user2.secret);
        user2.typeLabels = List$java$lang$Long$$ArrayJ(vuU.type_label, user2.typeLabels);
        user2.unique_id_modify_time = 0H1.LIZ(vuU.unique_id_modify_time, user2.unique_id_modify_time);
        user2.userCancelled = 0H1.LIZ(vuU.user_canceled, user2.userCancelled);
        user2.registerTime = 0H1.LIZ(vuU.register_time, user2.registerTime);
        Long createTime;
        if (vuU.create_time == null) {
            createTime = user2.createTime;
        }
        else {
            createTime = vuU.create_time;
        }
        user2.createTime = createTime;
        String country;
        if (vuU.country == null) {
            country = user2.country;
        }
        else {
            country = vuU.country;
        }
        user2.country = country;
        user2.coverUrls = List$tiktok$kids$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(vuU.cover_url, user2.coverUrls);
        String isoCountryCode;
        if (vuU.iso_country_code == null) {
            isoCountryCode = user2.isoCountryCode;
        }
        else {
            isoCountryCode = vuU.iso_country_code;
        }
        user2.isoCountryCode = isoCountryCode;
        String language;
        if (vuU.language == null) {
            language = user2.language;
        }
        else {
            language = vuU.language;
        }
        user2.language = language;
        String remarkName;
        if (vuU.remark_name == null) {
            remarkName = user2.remarkName;
        }
        else {
            remarkName = vuU.remark_name;
        }
        user2.remarkName = remarkName;
        user2.userMode = 0H1.LIZ(vuU.user_mode, user2.userMode);
        user2.userPeriod = 0H1.LIZ(vuU.user_period, user2.userPeriod);
        user2.isStar = 0H1.LIZ(vuU.is_star, user2.isStar);
        return user2;
    }
    
    public static Video tiktok$kids$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(final Vol vol, final Video video) {
        if (vol == null) {
            return video;
        }
        final Video video2 = new Video();
        video2.playAddr = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(vol.play_addr, video2.playAddr);
        video2.cover = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vol.cover, video2.cover);
        video2.height = 0H1.LIZ(vol.height, video2.height);
        video2.width = 0H1.LIZ(vol.width, video2.width);
        video2.dynamicCover = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vol.dynamic_cover, video2.dynamicCover);
        video2.originCover = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(vol.origin_cover, video2.originCover);
        String ratio;
        if (vol.ratio == null) {
            ratio = video2.ratio;
        }
        else {
            ratio = vol.ratio;
        }
        video2.ratio = ratio;
        video2.bitRate = List$tiktok$kids$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate(vol.bit_rate, video2.bitRate);
        video2.videoLength = 0H1.LIZ(vol.duration, video2.videoLength);
        video2.h264PlayAddr = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(vol.play_addr_h264, video2.h264PlayAddr);
        video2.cdnUrlExpired = 0H1.LIZ(vol.cdn_url_expired, video2.cdnUrlExpired);
        video2.isLongVideo = 0H1.LIZ(vol.is_long_video, video2.isLongVideo);
        String dVideoModel;
        if (vol.video_model == null) {
            dVideoModel = video2.dVideoModel;
        }
        else {
            dVideoModel = vol.video_model;
        }
        video2.dVideoModel = dVideoModel;
        video2.needSetCookie = 0H1.LIZ(vol.need_set_token, video2.needSetCookie);
        video2.drmTokenAuth = tiktok$kids$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth(vol.token_auth, video2.drmTokenAuth);
        video2.playAddrBytevc1 = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(vol.play_addr_bytevc1, video2.playAddrBytevc1);
        video2.bigThumbs = List$tiktok$kids$proto$BigThumbV2$$List$com$ss$android$ugc$aweme$feed$model$BigThumb(vol.big_thumbs, video2.bigThumbs);
        return video2;
    }
    
    public static KFeedItemList tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList(final VhE vhE, final KFeedItemList list) {
        if (vhE == null) {
            return list;
        }
        final KFeedItemList list2 = new KFeedItemList();
        list2.statusCode = 0H1.LIZ(vhE.status_code, list2.statusCode);
        list2.minCursor = 0H1.LIZ(vhE.min_cursor, list2.minCursor);
        list2.maxCursor = 0H1.LIZ(vhE.max_cursor, list2.maxCursor);
        list2.hasMore = 0H1.LIZ(vhE.has_more, list2.hasMore);
        list2.items = List$tiktok$kids$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(vhE.aweme_list, list2.items);
        String requestId;
        if (vhE.rid == null) {
            requestId = list2.requestId;
        }
        else {
            requestId = vhE.rid;
        }
        list2.requestId = requestId;
        list2.refreshClear = 0H1.LIZ(vhE.refresh_clear, list2.refreshClear);
        list2.logPb = tiktok$kids$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean(vhE.log_pb, list2.logPb);
        list2.blockCode = 0H1.LIZ(vhE.block_code, list2.blockCode);
        String statusMsg;
        if (vhE.status_msg == null) {
            statusMsg = list2.statusMsg;
        }
        else {
            statusMsg = vhE.status_msg;
        }
        list2.statusMsg = statusMsg;
        return list2;
    }
}
