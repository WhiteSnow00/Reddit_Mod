// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import q90.e0;
import com.google.common.collect.ImmutableMap$b;
import ex0.b$a;
import com.reddit.marketplace.impl.screens.nft.detail.ctasection.CtaScreen;
import com.reddit.screen.snoovatar.builder.categories.storefront.gallery.modes.GalleryViewModeSelectionScreen;
import com.reddit.marketplace.impl.screens.nft.detail.dialog.PurchaseErrorSoldOutDialogScreen;
import com.reddit.marketplace.impl.screens.nft.detail.dialog.PurchaseDebugScreen;
import com.reddit.talk.feature.inroom.sheets.debug.metadatalog.MetadataLogBottomSheetScreen;
import com.reddit.rituals.impl.features.selection.screen.RitualSelectionScreen;
import com.reddit.screen.notification.ui.notifications.compose.NotificationsScreen;
import com.reddit.vault.feature.vault.transaction.detail.TransactionDetailScreen;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionScreen;
import com.reddit.vault.feature.vault.payment.loading.PaymentLoadingScreen;
import com.reddit.vault.feature.vault.payment.intro.PaymentIntroScreen;
import com.reddit.vault.feature.vault.payment.customtab.PaymentActivity;
import com.reddit.vault.feature.vault.membership.cancel.CancelMembershipScreen;
import com.reddit.marketplace.impl.screens.nft.completepurchase.CompletePurchaseScreen;
import com.reddit.marketplace.impl.screens.nft.detail.ProductDetailsScreen;
import com.reddit.marketplace.impl.screens.nft.importnft.ImportNftScreen;
import com.reddit.marketplace.impl.screens.nft.transfer.NftTransferScreen;
import com.reddit.marketplace.impl.screens.nft.claim.NftClaimScreen;
import com.reddit.frontpage.presentation.listing.subreddit.preview.PreviewSubredditListingScreen;
import com.reddit.frontpage.presentation.modtools.ban.add.AddBannedUserScreen;
import com.reddit.auth.impl.phoneauth.sms.check.CheckOtpScreen;
import com.reddit.auth.impl.phoneauth.sms.verify.VerifyWithOtpScreen;
import com.reddit.talk.feature.inroom.sheets.raisedhands.RaisedHandsBottomSheetScreen;
import com.reddit.talk.feature.inroom.sheets.welcome.WelcomeBottomSheetScreen;
import com.reddit.talk.feature.inroom.sheets.bannedusers.BannedUsersBottomSheetScreen;
import com.reddit.talk.feature.inroom.sheets.promotionoffer.PromotionOfferScreen;
import com.reddit.talk.feature.inroom.sheets.profile.ProfileBottomSheetScreen;
import com.reddit.talk.feature.inroom.sheets.overflow.OverflowBottomSheetScreen;
import com.reddit.talk.feature.inroom.sheets.error.ErrorBottomSheetScreen;
import com.reddit.talk.feature.inroom.sheets.overflowusers.OverflowUsersBottomSheetScreen;
import com.reddit.talk.feature.inroom.sheets.debug.DebugBottomSheetScreen;
import com.reddit.talk.feature.inroom.sheets.emojis.EmojisBottomSheetScreen;
import com.reddit.matrix.feature.sheets.useractions.UserActionsSheetScreen;
import com.reddit.modtools.welcomemessage.rules.screen.WelcomeMessageRulesScreen;
import com.reddit.modtools.welcomemessage.settings.screen.WelcomeMessageSettingsScreen;
import com.reddit.screen.snoovatar.dialog.pastoufit.PastOutfitUpsellScreen;
import com.reddit.screen.snoovatar.recommended.confirm.ConfirmRecommendedSnoovatarScreen;
import com.reddit.screen.snoovatar.recommended.selection.RecommendedSnoovatarsScreen;
import com.reddit.screen.onboarding.onboardingtopic.selecttopic.SelectTopicScreen;
import com.reddit.screen.notification.ui.pager.InboxTabPagerScreen;
import com.reddit.screen.notification.ui.messages.InboxMessagesScreen;
import com.reddit.screen.settings.notifications.v2.InboxNotificationSettingsScreen;
import com.reddit.screen.settings.notifications.mod.ModNotificationSettingsScreen;
import com.reddit.screen.settings.password.reset.ResetPasswordScreen;
import com.reddit.screen.settings.password.create.CreatePasswordSettingScreen;
import com.reddit.screen.settings.password.confirm.ConfirmPasswordScreen;
import com.reddit.screen.settings.contentlanguages.addlanguage.AddContentLanguagesScreen;
import com.reddit.vault.feature.settings.learnmore.LearnMoreScreen;
import com.reddit.vault.feature.recoveryphrase.check.RecoveryPhraseCheckScreen;
import com.reddit.vault.feature.recoveryphrase.display.RecoveryPhraseDisplayScreen;
import com.reddit.vault.feature.vault.transfer.TransferScreen;
import com.reddit.vault.feature.vault.coins.PurchaseCoinsScreen;
import com.reddit.vault.feature.vault.deactivatedvault.DeactivatedVaultAlertScreen;
import com.reddit.vault.feature.vault.notice.InfoNoticeScreen;
import com.reddit.vault.feature.vault.burn.BurnEducationScreen;
import com.reddit.vault.feature.vault.feed.VaultFeedScreen;
import com.reddit.vault.feature.vault.points.PointsInfoScreen;
import com.reddit.vault.feature.vault.collectibleavatars.LearnAboutCollectibleAvatarsScreen;
import com.reddit.vault.feature.vault.forcebackup.ForceBackupScreen;
import com.reddit.vault.feature.registration.createvault.CreateVaultScreen;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen;
import com.reddit.vault.feature.registration.protectvault.ProtectVaultScreen;
import com.reddit.vault.feature.registration.importvault.ImportVaultScreen;
import com.reddit.vault.feature.registration.securevault.SecureVaultScreen;
import com.reddit.vault.feature.registration.collectiblesecurevault.CollectibleSecureVaultScreen;
import com.reddit.vault.feature.registration.protectvaultflow.ProtectVaultFlowScreen;
import com.reddit.ads.impl.screens.hybridvideo.VideoAdScreen;
import com.reddit.home.impl.screens.pager.HomePagerScreen;
import com.reddit.home.impl.screens.loggedout.HomeLoggedOutScreen;
import com.reddit.screens.chat.inbox.livechat.LiveChatScreen;
import com.reddit.screens.chat.messaging.managelink.ManageInviteLinkScreen;
import com.reddit.frontpage.presentation.subreddit.pager.SubredditPagerScreen;
import com.reddit.frontpage.presentation.listing.multireddit.MultiredditListingScreen;
import com.reddit.frontpage.presentation.listing.discover.DiscoverLinkListingScreen;
import com.reddit.frontpage.presentation.listing.all.AllListingScreen;
import com.reddit.frontpage.presentation.modtools.modqueue.ModQueueListingScreen;
import com.reddit.frontpage.presentation.detail.video.VideoPlayerScreen;
import com.reddit.frontpage.widgets.modtools.modview.ModViewRight;
import com.reddit.frontpage.widgets.modtools.modview.ModViewLeft;
import com.reddit.safety.mutecommunity.screen.settings.MutedSubredditsScreen;
import com.reddit.safety.mutecommunity.screen.bottomsheet.MuteCommunityBottomSheetScreen;
import com.reddit.recap.impl.screen.share.RecapShareSheetScreen;
import com.reddit.auth.impl.phoneauth.phone.PhoneUsageDialogScreen;
import com.reddit.auth.impl.phoneauth.phone.EnterPhoneScreen;
import com.reddit.auth.impl.phoneauth.removephone.RemovePhoneNumberBottomSheetScreen;
import com.reddit.auth.impl.phoneauth.verifypassword.VerifyPasswordScreen;
import com.reddit.auth.impl.phoneauth.createpassword.CreatePasswordScreen;
import com.reddit.auth.impl.phoneauth.addemail.AddEmailScreen;
import com.reddit.auth.screen.login.restore.RecoverUsernameScreen;
import com.reddit.auth.screen.login.restore.ForgotPasswordScreen;
import com.reddit.mod.notes.screen.add.AddUserNoteScreen;
import com.reddit.mod.notes.screen.log.UserLogsScreen;
import com.reddit.mod.removalreasons.screen.detail.RemovalReasonsDetailScreen;
import com.reddit.mod.removalreasons.screen.list.RemovalReasonsScreen;
import com.reddit.talk.feature.create.topicpicker.TopicPickerBottomSheetScreen;
import com.reddit.notification.impl.reenablement.NotificationReEnablementBottomSheet;
import com.reddit.livepost.feature.commentactions.CommentActionsBottomSheetScreen;
import com.reddit.feature.fullbleedplayer.pager.PageableFullBleedScreen;
import com.reddit.matrix.feature.chats.ChatsScreen;
import com.reddit.matrix.feature.chat.ChatScreen;
import com.reddit.matrix.feature.newchat.NewChatScreen;
import com.reddit.matrix.feature.chatsettings.ChatSettingsScreen;
import com.reddit.matrix.feature.groupmembers.GroupMembersScreen;
import com.reddit.matrix.screen.matrix.MatrixScreen;
import com.reddit.modtools.posttypes.picker.PostTypePickerScreen;
import com.reddit.modtools.adjustcrowdcontrol.screen.AdjustCrowdControlScreen;
import com.reddit.modtools.welcomemessage.screen.WelcomeMessageScreen;
import com.reddit.modtools.modqueue.modcommunities.ModCommunitiesScreen;
import com.reddit.link.ui.viewholder.SpotlightVideoAdLinkViewHolder;
import com.reddit.link.ui.viewholder.PromotedUserPostAdLinkViewHolder;
import com.reddit.link.ui.view.PostFooterView;
import com.reddit.link.ui.view.LinkTitleView;
import com.reddit.link.ui.view.LinkSupplementaryTextView;
import com.reddit.link.ui.view.LinkMetadataView;
import com.reddit.link.ui.view.LinkFooterView;
import com.reddit.link.ui.view.HeaderMetadataView;
import com.reddit.screen.snoovatar.quickcreate.QuickCreateScreen;
import com.reddit.screen.snoovatar.customcolorpicker.CustomColorPickerScreen;
import com.reddit.screen.snoovatar.equipped.EquippedScreen;
import com.reddit.screen.snoovatar.share.ShareAndDownloadScreen;
import com.reddit.screen.snoovatar.artistpage.ArtistPageScreen;
import com.reddit.screen.snoovatar.confirmation.ConfirmSnoovatarScreen;
import com.reddit.screen.snoovatar.copy.CopySnoovatarScreen;
import com.reddit.screen.snoovatar.loading.BuilderLoadingScreen;
import com.reddit.screen.communities.modrecommendations.ModRecommendationsView;
import com.reddit.screen.onboarding.languageselection.LanguageSelectionScreen;
import com.reddit.screen.onboarding.lowsignal.OnboardingLowSignalBottomsheetScreen;
import com.reddit.screen.onboarding.host.OnboardingHostScreen;
import com.reddit.screen.onboarding.posting.PostingInOnboardingScreen;
import com.reddit.screen.notification.fcm.RedditMessagingService;
import com.reddit.screen.notification.controller.ExposeExperimentWorker;
import com.reddit.screen.notification.controller.DismissNotificationReceiver;
import com.reddit.screen.notification.controller.CancelNotificationReceiver;
import com.reddit.screen.notification.service.ReplyService;
import com.reddit.screen.notification.service.ComposeService;
import com.reddit.screen.notification.action.NotificationActivity;
import com.reddit.screen.settings.experiments.ExperimentsScreen;
import com.reddit.screen.settings.communitydiscovery.CommunityDiscoverySettingsScreen;
import com.reddit.screen.settings.emailsettings.EmailSettingsScreen;
import com.reddit.screen.settings.mockgeolocation.MockGeolocationScreen;
import com.reddit.screen.settings.mockfeedelement.MockFeedElementScreen;
import com.reddit.screen.settings.communityalerts.CommunityAlertSettingsScreen;
import com.reddit.screen.settings.blocked.BlockedAccountsScreen;
import com.reddit.screen.settings.updateemail.UpdateEmailScreen;
import com.reddit.screen.settings.adpersonalization.AdPersonalizationSettingsScreen;
import com.reddit.screen.settings.chatandmessaging.ChatAndMessagingPermissionsScreen;
import com.reddit.screen.settings.accountsettings.AccountSettingsScreen;
import com.reddit.screen.settings.flairsettings.FlairSettingsScreen;
import com.reddit.screen.settings.exposures.ExposuresScreen;
import com.reddit.screen.settings.personalization.PersonalizationSettingsScreen;
import com.reddit.screen.settings.contentlanguages.ContentLanguagesScreen;
import com.reddit.vault.feature.intro.IntroScreen;
import com.reddit.vault.feature.settings.SettingsScreen;
import com.reddit.vault.feature.errors.ErrorScreen;
import com.reddit.vault.feature.loading.LoadingScreen;
import com.reddit.vault.screens.home.VaultScreen;
import com.reddit.postsubmit.tags.extra.LiveChatConfirmScreen;
import com.reddit.postsubmit.tags.extra.ExtraTagsSelectorScreen;
import com.reddit.postsubmit.screens.linkcomposer.LinkComposerScreen;
import com.reddit.search.screens.communities.CommunitySearchResultsScreen;
import com.reddit.search.screens.people.PeopleSearchResultsScreen;
import com.reddit.search.screens.comments.CommentSearchResultsScreen;
import com.reddit.search.screens.bottomsheet.SearchFilterBottomSheet;
import com.reddit.search.screens.posts.PostsSearchResultsScreen;
import com.reddit.search.screens.ui.RedditSearchView;
import com.reddit.media.player.ui2.RedditVideoViewWrapper;
import com.reddit.video.player.controls.RedditVideoControlsView;
import com.reddit.video.player.view.RedditVideoView;
import com.reddit.screens.profile.details.ProfilePagerScreen;
import com.reddit.screens.communityhubs.create.CreateCommunityHubScreen;
import com.reddit.screens.communityhubs.details.CommunityHubDetailsScreen;
import com.reddit.frontpage.presentation.detail.LightboxScreen;
import com.reddit.frontpage.ui.modview.ModFlairView;
import com.reddit.frontpage.ui.flair.FlairView;
import com.reddit.news.ui.home.HomeFeedScreen;
import com.reddit.news.ui.popular.PopularFeedScreen;
import com.reddit.incognito.screens.welcome.WelcomeIncognitoModeScreen;
import com.reddit.announcement.ui.carousel.AnnouncementCarouselView;
import com.reddit.recap.impl.screen.RecapScreen;
import com.reddit.livediscovery.impl.feature.LiveDiscoveryScreen;
import com.reddit.auth.screen.pager.LoginSignUpPagerScreen;
import com.reddit.auth.screen.welcome.WelcomeDelayedAuthScreen;
import com.reddit.auth.screen.login.LoginScreen;
import com.reddit.typeahead.ui.viewholder.CommunitySearchResultItemViewHolder;
import com.reddit.talk.feature.create.CreateTopicPickerScreen;
import com.reddit.talk.feature.create.CreateRoomScreen;
import com.reddit.talk.feature.inroom.InRoomScreen;
import com.reddit.talk.feature.onboarding.HostOnboardingScreen;
import com.reddit.talk.feature.roomerror.RoomErrorBottomSheetScreen;
import com.reddit.talk.feature.roomlist.RoomListScreen;
import com.reddit.livepost.widgets.ExpandableChatCommentTextView;
import com.reddit.livepost.widgets.ChatInputLayout;
import com.reddit.livepost.widgets.ChatCommentBottomSheet;
import com.reddit.branch.screens.BranchEventListScreen;
import com.reddit.survey.debug.SurveyDebugDialog;
import com.reddit.survey.survey.SurveyScreen;
import com.reddit.communitywelcomescreen.ui.CommunityWelcomeScreen;
import com.reddit.modtools.ban.BannedUsersScreen;
import com.reddit.modtools.action.ModToolsActionsScreen;
import com.reddit.modtools.mediaincomments.MediaInCommentsScreen;
import com.reddit.modtools.moderatorslist.ModeratorsListScreen;
import com.reddit.webembed.webview.WebEmbedWebView;
import com.reddit.screen.onboarding.OnboardingQuestionContainerScreen;
import com.reddit.appshortcut.screens.AppShortcutNavigationActivity;
import com.reddit.postsubmit.tags.TagsSelectorScreen;
import com.reddit.postsubmit.tags.SchedulePostScreen;
import com.reddit.ads.brandlift.BrandLiftSurveyView;
import com.reddit.ads.alert.AdsAnalyticsDialog;
import com.reddit.ads.promoteduserpost.PromotedUserPostDataView;
import com.reddit.specialevents.list.CommunityNavigationScreen;
import com.reddit.specialevents.avatar.AvatarPickerRedirectScreen;
import com.reddit.specialevents.picker.CommunityPickerScreen;
import com.reddit.deeplink.ui.DeepLinkFallbackActivity;
import com.reddit.devplatform.screens.ContextActionUserInputBottomSheet;
import com.reddit.debug.config.AppConfigDebugScreen;
import com.reddit.debug.announcement.AnnouncementDebugDialog;
import com.reddit.debug.logging.DataLoggingActivity;
import com.reddit.screens.usermodal.UserModalScreen;
import com.reddit.screens.purchase.BuyCoinsScreen;
import com.reddit.screens.header.SubredditHeaderView;
import com.reddit.frontpage.ui.SaveMediaScreen;
import com.reddit.news.ui.NewsFeedScreen;
import com.reddit.sharing.custom.ShareBottomSheet;
import com.reddit.sharing.custom.ExternalShareResultReceiver;
import com.reddit.experiments.debug.ExperimentOverrideReceiver;
import com.reddit.comment.ui.CommentScreenAdView;
import com.reddit.wiki.wiki.WikiScreen;
import com.reddit.screen.ComposeBottomSheetScreen;
import com.reddit.richtext.RichTextView;
import com.reddit.debug.DebugActivity;
import com.reddit.sharing.ShareIntentReceiver;
import com.reddit.sharing.ShareActivity;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import ic0.d;
import com.reddit.screen.di.ScreenPresentationModule;
import android.content.Context;
import uw.f;
import cx0.g;
import cx0.j;
import k20.a;
import com.reddit.billing.RedditBillingManager;
import com.reddit.billing.RemotePurchaseDataSource;
import uv0.b;
import cz0.c;
import se2.e;
import javax.inject.Provider;
import com.reddit.vault.h;
import com.reddit.screen.BaseScreen;
import hw0.i;

public final class zo implements yt
{
    public final i a;
    public final BaseScreen b;
    public final h c;
    public final dl d;
    public final zo e;
    public Provider<ex0.i> f;
    public e g;
    public c h;
    public b i;
    public Provider<RemotePurchaseDataSource> j;
    public qz.i k;
    public Provider<RedditBillingManager> l;
    public Provider<a> m;
    
    public zo(final dl d, final BaseScreen b, final j j, final g g, final i a, final h c, final rg2.a a2) {
        this.e = this;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = (Provider<ex0.i>)se2.c.b((Provider)new b((Provider)se2.e.a((Object)a2), 3));
        final e a3 = se2.e.a((Object)b);
        this.g = a3;
        this.h = cz0.c.b((Provider)a3);
        this.i = uv0.b.e((Provider)this.g);
        final Provider a4 = se2.h.a((Provider)nx.c.a((Provider)d.Y0));
        this.j = (Provider<RemotePurchaseDataSource>)a4;
        this.k = qz.i.a(a4, (Provider)d.Z0);
        this.l = (Provider<RedditBillingManager>)se2.c.b((Provider)rx.c.b((Provider)this.h, (Provider)this.i, (Provider)this.k, (Provider)d.u0, (Provider)d.M, (Provider)d.a1, (Provider)d.b1, (Provider)d.H, (Provider)d.z, (Provider)uw.f.c((Provider)d.u0, (Provider)d.e), (Provider)d.c1, (Provider)d.x0));
        this.m = (Provider<a>)se2.c.b((Provider)vy.e.a((Provider)this.h, (Provider)d.N, (Provider)d.S));
    }
    
    public final rg2.a<? extends Context> a() {
        return cz0.c.c(this.b);
    }
    
    public final ww0.c b() {
        final rg2.a a = ScreenPresentationModule.a(this.b);
        final d i = ((e0)this.d.a).i();
        ui.b.n((Object)i);
        final hw0.b g2 = ((e0)this.d.a).G2();
        ui.b.n((Object)g2);
        return new ww0.c(a, i, g2, (gx1.c)this.d.R0.get());
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        final ImmutableMap$b builderWithExpectedSize = ImmutableMap.builderWithExpectedSize(232);
        builderWithExpectedSize.b((Object)ShareActivity.class, (Object)this.d.L3());
        builderWithExpectedSize.b((Object)ShareIntentReceiver.class, (Object)this.d.O3());
        builderWithExpectedSize.b((Object)DebugActivity.class, (Object)this.d.Y0());
        builderWithExpectedSize.b((Object)RichTextView.class, (Object)this.d.B3());
        builderWithExpectedSize.b((Object)ComposeBottomSheetScreen.class, (Object)this.d.H0());
        builderWithExpectedSize.b((Object)WikiScreen.class, (Object)this.d.q4());
        builderWithExpectedSize.b((Object)CommentScreenAdView.class, (Object)this.d.w0());
        builderWithExpectedSize.b((Object)ExperimentOverrideReceiver.class, (Object)this.d.k1());
        builderWithExpectedSize.b((Object)ExternalShareResultReceiver.class, (Object)this.d.o1());
        builderWithExpectedSize.b((Object)ShareBottomSheet.class, (Object)this.d.N3());
        builderWithExpectedSize.b((Object)NewsFeedScreen.class, (Object)this.d.u2());
        builderWithExpectedSize.b((Object)SaveMediaScreen.class, (Object)this.d.F3());
        builderWithExpectedSize.b((Object)SubredditHeaderView.class, (Object)this.d.R3());
        builderWithExpectedSize.b((Object)BuyCoinsScreen.class, (Object)this.d.k0());
        builderWithExpectedSize.b((Object)UserModalScreen.class, (Object)this.d.c4());
        builderWithExpectedSize.b((Object)DataLoggingActivity.class, (Object)this.d.W0());
        builderWithExpectedSize.b((Object)AnnouncementDebugDialog.class, (Object)this.d.X());
        builderWithExpectedSize.b((Object)AppConfigDebugScreen.class, (Object)this.d.Y());
        builderWithExpectedSize.b((Object)ContextActionUserInputBottomSheet.class, (Object)this.d.N0());
        builderWithExpectedSize.b((Object)DeepLinkFallbackActivity.class, (Object)this.d.a1());
        builderWithExpectedSize.b((Object)CommunityPickerScreen.class, (Object)this.d.C0());
        builderWithExpectedSize.b((Object)AvatarPickerRedirectScreen.class, (Object)this.d.c0());
        builderWithExpectedSize.b((Object)CommunityNavigationScreen.class, (Object)this.d.B0());
        builderWithExpectedSize.b((Object)PromotedUserPostDataView.class, (Object)this.d.Y2());
        builderWithExpectedSize.b((Object)AdsAnalyticsDialog.class, (Object)this.d.U());
        builderWithExpectedSize.b((Object)BrandLiftSurveyView.class, (Object)this.d.h0());
        builderWithExpectedSize.b((Object)SchedulePostScreen.class, (Object)this.d.G3());
        builderWithExpectedSize.b((Object)TagsSelectorScreen.class, (Object)this.d.V3());
        builderWithExpectedSize.b((Object)AppShortcutNavigationActivity.class, (Object)this.d.Z());
        builderWithExpectedSize.b((Object)OnboardingQuestionContainerScreen.class, (Object)this.d.C2());
        builderWithExpectedSize.b((Object)WebEmbedWebView.class, (Object)this.d.j4());
        builderWithExpectedSize.b((Object)ModeratorsListScreen.class, (Object)this.d.p2());
        builderWithExpectedSize.b((Object)MediaInCommentsScreen.class, (Object)this.d.c2());
        builderWithExpectedSize.b((Object)ModToolsActionsScreen.class, (Object)this.d.m2());
        builderWithExpectedSize.b((Object)BannedUsersScreen.class, (Object)this.d.e0());
        builderWithExpectedSize.b((Object)CommunityWelcomeScreen.class, (Object)this.d.F0());
        builderWithExpectedSize.b((Object)SurveyScreen.class, (Object)this.d.U3());
        builderWithExpectedSize.b((Object)SurveyDebugDialog.class, (Object)this.d.T3());
        builderWithExpectedSize.b((Object)BranchEventListScreen.class, (Object)this.d.g0());
        builderWithExpectedSize.b((Object)ChatCommentBottomSheet.class, (Object)this.d.o0());
        builderWithExpectedSize.b((Object)ChatInputLayout.class, (Object)this.d.p0());
        builderWithExpectedSize.b((Object)ExpandableChatCommentTextView.class, (Object)this.d.j1());
        builderWithExpectedSize.b((Object)RoomListScreen.class, (Object)this.d.E3());
        builderWithExpectedSize.b((Object)RoomErrorBottomSheetScreen.class, (Object)this.d.D3());
        builderWithExpectedSize.b((Object)HostOnboardingScreen.class, (Object)this.d.B1());
        builderWithExpectedSize.b((Object)InRoomScreen.class, (Object)this.d.E1());
        builderWithExpectedSize.b((Object)CreateRoomScreen.class, (Object)this.d.S0());
        builderWithExpectedSize.b((Object)CreateTopicPickerScreen.class, (Object)this.d.T0());
        builderWithExpectedSize.b((Object)CommunitySearchResultItemViewHolder.class, (Object)this.d.D0());
        builderWithExpectedSize.b((Object)LoginScreen.class, (Object)this.d.X1());
        builderWithExpectedSize.b((Object)WelcomeDelayedAuthScreen.class, (Object)this.d.l4());
        builderWithExpectedSize.b((Object)LoginSignUpPagerScreen.class, (Object)this.d.Y1());
        builderWithExpectedSize.b((Object)LiveDiscoveryScreen.class, (Object)this.d.V1());
        builderWithExpectedSize.b((Object)RecapScreen.class, (Object)this.d.h3());
        builderWithExpectedSize.b((Object)AnnouncementCarouselView.class, (Object)this.d.W());
        builderWithExpectedSize.b((Object)WelcomeIncognitoModeScreen.class, (Object)this.d.m4());
        builderWithExpectedSize.b((Object)PopularFeedScreen.class, (Object)this.d.O2());
        builderWithExpectedSize.b((Object)HomeFeedScreen.class, (Object)this.d.y1());
        builderWithExpectedSize.b((Object)FlairView.class, (Object)this.d.r1());
        builderWithExpectedSize.b((Object)ModFlairView.class, (Object)this.d.h2());
        builderWithExpectedSize.b((Object)LightboxScreen.class, (Object)this.d.N1());
        builderWithExpectedSize.b((Object)CommunityHubDetailsScreen.class, (Object)this.d.A0());
        builderWithExpectedSize.b((Object)CreateCommunityHubScreen.class, (Object)this.d.P0());
        builderWithExpectedSize.b((Object)ProfilePagerScreen.class, (Object)this.d.W2());
        builderWithExpectedSize.b((Object)RedditVideoView.class, (Object)this.d.s3());
        builderWithExpectedSize.b((Object)RedditVideoControlsView.class, (Object)this.d.r3());
        builderWithExpectedSize.b((Object)RedditVideoViewWrapper.class, (Object)this.d.t3());
        builderWithExpectedSize.b((Object)RedditSearchView.class, (Object)this.d.q3());
        builderWithExpectedSize.b((Object)PostsSearchResultsScreen.class, (Object)this.d.S2());
        builderWithExpectedSize.b((Object)SearchFilterBottomSheet.class, (Object)this.d.H3());
        builderWithExpectedSize.b((Object)CommentSearchResultsScreen.class, (Object)this.d.x0());
        builderWithExpectedSize.b((Object)PeopleSearchResultsScreen.class, (Object)this.d.K2());
        builderWithExpectedSize.b((Object)CommunitySearchResultsScreen.class, (Object)this.d.E0());
        builderWithExpectedSize.b((Object)LinkComposerScreen.class, (Object)this.d.O1());
        builderWithExpectedSize.b((Object)ExtraTagsSelectorScreen.class, (Object)this.d.p1());
        builderWithExpectedSize.b((Object)LiveChatConfirmScreen.class, (Object)this.d.T1());
        builderWithExpectedSize.b((Object)VaultScreen.class, (Object)this.d.e4());
        builderWithExpectedSize.b((Object)LoadingScreen.class, (Object)this.d.W1());
        builderWithExpectedSize.b((Object)ErrorScreen.class, (Object)this.d.i1());
        builderWithExpectedSize.b((Object)SettingsScreen.class, (Object)this.d.K3());
        builderWithExpectedSize.b((Object)IntroScreen.class, (Object)this.d.J1());
        builderWithExpectedSize.b((Object)ContentLanguagesScreen.class, (Object)this.d.M0());
        builderWithExpectedSize.b((Object)PersonalizationSettingsScreen.class, (Object)this.d.L2());
        builderWithExpectedSize.b((Object)ExposuresScreen.class, (Object)this.d.n1());
        builderWithExpectedSize.b((Object)FlairSettingsScreen.class, (Object)this.d.q1());
        builderWithExpectedSize.b((Object)AccountSettingsScreen.class, (Object)this.d.N());
        builderWithExpectedSize.b((Object)ChatAndMessagingPermissionsScreen.class, (Object)this.d.n0());
        builderWithExpectedSize.b((Object)AdPersonalizationSettingsScreen.class, (Object)this.d.O());
        builderWithExpectedSize.b((Object)UpdateEmailScreen.class, (Object)this.d.Z3());
        builderWithExpectedSize.b((Object)BlockedAccountsScreen.class, (Object)this.d.f0());
        builderWithExpectedSize.b((Object)CommunityAlertSettingsScreen.class, (Object)this.d.y0());
        builderWithExpectedSize.b((Object)MockFeedElementScreen.class, (Object)this.d.e2());
        builderWithExpectedSize.b((Object)MockGeolocationScreen.class, (Object)this.d.f2());
        builderWithExpectedSize.b((Object)EmailSettingsScreen.class, (Object)this.d.d1());
        builderWithExpectedSize.b((Object)CommunityDiscoverySettingsScreen.class, (Object)this.d.z0());
        builderWithExpectedSize.b((Object)ExperimentsScreen.class, (Object)this.d.l1());
        builderWithExpectedSize.b((Object)NotificationActivity.class, (Object)this.d.x2());
        builderWithExpectedSize.b((Object)ComposeService.class, (Object)this.d.I0());
        builderWithExpectedSize.b((Object)ReplyService.class, (Object)this.d.z3());
        builderWithExpectedSize.b((Object)CancelNotificationReceiver.class, (Object)this.d.m0());
        builderWithExpectedSize.b((Object)DismissNotificationReceiver.class, (Object)this.d.c1());
        builderWithExpectedSize.b((Object)ExposeExperimentWorker.class, (Object)this.d.m1());
        builderWithExpectedSize.b((Object)RedditMessagingService.class, (Object)this.d.o3());
        builderWithExpectedSize.b((Object)PostingInOnboardingScreen.class, (Object)this.d.R2());
        builderWithExpectedSize.b((Object)OnboardingHostScreen.class, (Object)this.d.A2());
        builderWithExpectedSize.b((Object)OnboardingLowSignalBottomsheetScreen.class, (Object)this.d.B2());
        builderWithExpectedSize.b((Object)LanguageSelectionScreen.class, (Object)this.d.K1());
        builderWithExpectedSize.b((Object)ModRecommendationsView.class, (Object)this.d.l2());
        builderWithExpectedSize.b((Object)BuilderLoadingScreen.class, (Object)this.d.i0());
        builderWithExpectedSize.b((Object)CopySnoovatarScreen.class, (Object)this.d.O0());
        builderWithExpectedSize.b((Object)ConfirmSnoovatarScreen.class, (Object)this.d.L0());
        builderWithExpectedSize.b((Object)ArtistPageScreen.class, (Object)this.d.b0());
        builderWithExpectedSize.b((Object)ShareAndDownloadScreen.class, (Object)this.d.M3());
        builderWithExpectedSize.b((Object)EquippedScreen.class, (Object)this.d.g1());
        builderWithExpectedSize.b((Object)CustomColorPickerScreen.class, (Object)this.d.V0());
        builderWithExpectedSize.b((Object)QuickCreateScreen.class, (Object)this.d.f3());
        builderWithExpectedSize.b((Object)HeaderMetadataView.class, (Object)this.d.x1());
        builderWithExpectedSize.b((Object)LinkFooterView.class, (Object)this.d.P1());
        builderWithExpectedSize.b((Object)LinkMetadataView.class, (Object)this.d.Q1());
        builderWithExpectedSize.b((Object)LinkSupplementaryTextView.class, (Object)this.d.R1());
        builderWithExpectedSize.b((Object)LinkTitleView.class, (Object)this.d.S1());
        builderWithExpectedSize.b((Object)PostFooterView.class, (Object)this.d.P2());
        builderWithExpectedSize.b((Object)PromotedUserPostAdLinkViewHolder.class, (Object)this.d.X2());
        builderWithExpectedSize.b((Object)SpotlightVideoAdLinkViewHolder.class, (Object)this.d.Q3());
        builderWithExpectedSize.b((Object)ModCommunitiesScreen.class, (Object)this.d.g2());
        builderWithExpectedSize.b((Object)WelcomeMessageScreen.class, (Object)this.d.o4());
        builderWithExpectedSize.b((Object)AdjustCrowdControlScreen.class, (Object)this.d.T());
        builderWithExpectedSize.b((Object)PostTypePickerScreen.class, (Object)this.d.Q2());
        builderWithExpectedSize.b((Object)MatrixScreen.class, (Object)this.d.b2());
        builderWithExpectedSize.b((Object)GroupMembersScreen.class, (Object)this.d.w1());
        builderWithExpectedSize.b((Object)ChatSettingsScreen.class, (Object)this.d.r0());
        builderWithExpectedSize.b((Object)NewChatScreen.class, (Object)this.d.t2());
        builderWithExpectedSize.b((Object)ChatScreen.class, (Object)this.d.q0());
        builderWithExpectedSize.b((Object)ChatsScreen.class, (Object)this.d.s0());
        builderWithExpectedSize.b((Object)PageableFullBleedScreen.class, (Object)this.d.F2());
        builderWithExpectedSize.b((Object)CommentActionsBottomSheetScreen.class, (Object)this.d.v0());
        builderWithExpectedSize.b((Object)NotificationReEnablementBottomSheet.class, (Object)this.d.y2());
        builderWithExpectedSize.b((Object)TopicPickerBottomSheetScreen.class, (Object)this.d.W3());
        builderWithExpectedSize.b((Object)RemovalReasonsScreen.class, (Object)this.d.x3());
        builderWithExpectedSize.b((Object)RemovalReasonsDetailScreen.class, (Object)this.d.w3());
        builderWithExpectedSize.b((Object)UserLogsScreen.class, (Object)this.d.b4());
        builderWithExpectedSize.b((Object)AddUserNoteScreen.class, (Object)this.d.S());
        builderWithExpectedSize.b((Object)ForgotPasswordScreen.class, (Object)this.d.t1());
        builderWithExpectedSize.b((Object)RecoverUsernameScreen.class, (Object)this.d.k3());
        builderWithExpectedSize.b((Object)AddEmailScreen.class, (Object)this.d.R());
        builderWithExpectedSize.b((Object)CreatePasswordScreen.class, (Object)this.d.Q0());
        builderWithExpectedSize.b((Object)VerifyPasswordScreen.class, (Object)this.d.f4());
        builderWithExpectedSize.b((Object)RemovePhoneNumberBottomSheetScreen.class, (Object)this.d.y3());
        builderWithExpectedSize.b((Object)EnterPhoneScreen.class, (Object)this.d.f1());
        builderWithExpectedSize.b((Object)PhoneUsageDialogScreen.class, (Object)this.d.M2());
        builderWithExpectedSize.b((Object)RecapShareSheetScreen.class, (Object)this.d.i3());
        builderWithExpectedSize.b((Object)MuteCommunityBottomSheetScreen.class, (Object)this.d.r2());
        builderWithExpectedSize.b((Object)MutedSubredditsScreen.class, (Object)this.d.s2());
        builderWithExpectedSize.b((Object)ModViewLeft.class, (Object)this.d.n2());
        builderWithExpectedSize.b((Object)ModViewRight.class, (Object)this.d.o2());
        builderWithExpectedSize.b((Object)VideoPlayerScreen.class, (Object)this.d.i4());
        builderWithExpectedSize.b((Object)ModQueueListingScreen.class, (Object)this.d.k2());
        builderWithExpectedSize.b((Object)AllListingScreen.class, (Object)this.d.V());
        builderWithExpectedSize.b((Object)DiscoverLinkListingScreen.class, (Object)this.d.b1());
        builderWithExpectedSize.b((Object)MultiredditListingScreen.class, (Object)this.d.q2());
        builderWithExpectedSize.b((Object)SubredditPagerScreen.class, (Object)this.d.S3());
        builderWithExpectedSize.b((Object)ManageInviteLinkScreen.class, (Object)this.d.Z1());
        builderWithExpectedSize.b((Object)LiveChatScreen.class, (Object)this.d.U1());
        builderWithExpectedSize.b((Object)HomeLoggedOutScreen.class, (Object)this.d.z1());
        builderWithExpectedSize.b((Object)HomePagerScreen.class, (Object)this.d.A1());
        builderWithExpectedSize.b((Object)VideoAdScreen.class, (Object)this.d.h4());
        builderWithExpectedSize.b((Object)ProtectVaultFlowScreen.class, (Object)this.d.a3());
        builderWithExpectedSize.b((Object)CollectibleSecureVaultScreen.class, (Object)this.d.u0());
        builderWithExpectedSize.b((Object)SecureVaultScreen.class, (Object)this.d.I3());
        builderWithExpectedSize.b((Object)ImportVaultScreen.class, (Object)this.d.D1());
        builderWithExpectedSize.b((Object)ProtectVaultScreen.class, (Object)this.d.b3());
        builderWithExpectedSize.b((Object)MasterKeyScreen.class, (Object)this.d.a2());
        builderWithExpectedSize.b((Object)CreateVaultScreen.class, (Object)this.d.U0());
        builderWithExpectedSize.b((Object)ForceBackupScreen.class, (Object)this.d.s1());
        builderWithExpectedSize.b((Object)LearnAboutCollectibleAvatarsScreen.class, (Object)this.d.L1());
        builderWithExpectedSize.b((Object)PointsInfoScreen.class, (Object)this.d.N2());
        builderWithExpectedSize.b((Object)VaultFeedScreen.class, (Object)this.d.d4());
        builderWithExpectedSize.b((Object)BurnEducationScreen.class, (Object)this.d.j0());
        builderWithExpectedSize.b((Object)InfoNoticeScreen.class, (Object)this.d.I1());
        builderWithExpectedSize.b((Object)DeactivatedVaultAlertScreen.class, (Object)this.d.X0());
        builderWithExpectedSize.b((Object)PurchaseCoinsScreen.class, (Object)this.d.c3());
        builderWithExpectedSize.b((Object)TransferScreen.class, (Object)this.d.Y3());
        builderWithExpectedSize.b((Object)RecoveryPhraseDisplayScreen.class, (Object)this.d.m3());
        builderWithExpectedSize.b((Object)RecoveryPhraseCheckScreen.class, (Object)this.d.l3());
        builderWithExpectedSize.b((Object)LearnMoreScreen.class, (Object)this.d.M1());
        builderWithExpectedSize.b((Object)AddContentLanguagesScreen.class, (Object)this.d.Q());
        builderWithExpectedSize.b((Object)ConfirmPasswordScreen.class, (Object)this.d.J0());
        builderWithExpectedSize.b((Object)CreatePasswordSettingScreen.class, (Object)this.d.R0());
        builderWithExpectedSize.b((Object)ResetPasswordScreen.class, (Object)this.d.A3());
        builderWithExpectedSize.b((Object)ModNotificationSettingsScreen.class, (Object)this.d.j2());
        builderWithExpectedSize.b((Object)InboxNotificationSettingsScreen.class, (Object)this.d.G1());
        builderWithExpectedSize.b((Object)InboxMessagesScreen.class, (Object)this.d.F1());
        builderWithExpectedSize.b((Object)InboxTabPagerScreen.class, (Object)this.d.H1());
        builderWithExpectedSize.b((Object)SelectTopicScreen.class, (Object)this.d.J3());
        builderWithExpectedSize.b((Object)RecommendedSnoovatarsScreen.class, (Object)this.d.j3());
        builderWithExpectedSize.b((Object)ConfirmRecommendedSnoovatarScreen.class, (Object)this.d.K0());
        builderWithExpectedSize.b((Object)PastOutfitUpsellScreen.class, (Object)this.d.G2());
        builderWithExpectedSize.b((Object)WelcomeMessageSettingsScreen.class, (Object)this.d.p4());
        builderWithExpectedSize.b((Object)WelcomeMessageRulesScreen.class, (Object)this.d.n4());
        builderWithExpectedSize.b((Object)UserActionsSheetScreen.class, (Object)this.d.a4());
        builderWithExpectedSize.b((Object)EmojisBottomSheetScreen.class, (Object)this.d.e1());
        builderWithExpectedSize.b((Object)DebugBottomSheetScreen.class, (Object)this.d.Z0());
        builderWithExpectedSize.b((Object)OverflowUsersBottomSheetScreen.class, (Object)this.d.E2());
        builderWithExpectedSize.b((Object)ErrorBottomSheetScreen.class, (Object)this.d.h1());
        builderWithExpectedSize.b((Object)OverflowBottomSheetScreen.class, (Object)this.d.D2());
        builderWithExpectedSize.b((Object)ProfileBottomSheetScreen.class, (Object)this.d.V2());
        builderWithExpectedSize.b((Object)PromotionOfferScreen.class, (Object)this.d.Z2());
        builderWithExpectedSize.b((Object)BannedUsersBottomSheetScreen.class, (Object)this.d.d0());
        builderWithExpectedSize.b((Object)WelcomeBottomSheetScreen.class, (Object)this.d.k4());
        builderWithExpectedSize.b((Object)RaisedHandsBottomSheetScreen.class, (Object)this.d.g3());
        builderWithExpectedSize.b((Object)VerifyWithOtpScreen.class, (Object)this.d.g4());
        builderWithExpectedSize.b((Object)CheckOtpScreen.class, (Object)this.d.t0());
        builderWithExpectedSize.b((Object)AddBannedUserScreen.class, (Object)this.d.P());
        builderWithExpectedSize.b((Object)PreviewSubredditListingScreen.class, (Object)this.d.T2());
        builderWithExpectedSize.b((Object)NftClaimScreen.class, (Object)this.d.v2());
        builderWithExpectedSize.b((Object)NftTransferScreen.class, (Object)this.d.w2());
        builderWithExpectedSize.b((Object)ImportNftScreen.class, (Object)this.d.C1());
        builderWithExpectedSize.b((Object)ProductDetailsScreen.class, (Object)this.d.U2());
        builderWithExpectedSize.b((Object)CompletePurchaseScreen.class, (Object)this.d.G0());
        builderWithExpectedSize.b((Object)CancelMembershipScreen.class, (Object)this.d.l0());
        builderWithExpectedSize.b((Object)PaymentActivity.class, (Object)this.d.H2());
        builderWithExpectedSize.b((Object)PaymentIntroScreen.class, (Object)this.d.I2());
        builderWithExpectedSize.b((Object)PaymentLoadingScreen.class, (Object)this.d.J2());
        builderWithExpectedSize.b((Object)ApproveTransactionScreen.class, (Object)this.d.a0());
        builderWithExpectedSize.b((Object)TransactionDetailScreen.class, (Object)this.d.X3());
        builderWithExpectedSize.b((Object)NotificationsScreen.class, (Object)this.d.z2());
        builderWithExpectedSize.b((Object)RitualSelectionScreen.class, (Object)this.d.C3());
        builderWithExpectedSize.b((Object)MetadataLogBottomSheetScreen.class, (Object)this.d.d2());
        builderWithExpectedSize.b((Object)PurchaseDebugScreen.class, (Object)this.d.d3());
        builderWithExpectedSize.b((Object)PurchaseErrorSoldOutDialogScreen.class, (Object)this.d.e3());
        builderWithExpectedSize.b((Object)GalleryViewModeSelectionScreen.class, (Object)this.d.u1());
        builderWithExpectedSize.b((Object)CtaScreen.class, (Object)new ex0.d((b$a)new qs(this.d, this.e)));
        return (Map<Class<?>, tt<?, ?>>)builderWithExpectedSize.a(true);
    }
}