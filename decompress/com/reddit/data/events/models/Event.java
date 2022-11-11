// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models;

import java.io.IOException;
import ft.e;
import com.reddit.data.events.models.components.Zipkin;
import com.reddit.data.events.models.components.ZendeskTicket;
import com.reddit.data.events.models.components.Widget;
import com.reddit.data.events.models.components.Webhook;
import com.reddit.data.events.models.components.Vote;
import com.reddit.data.events.models.components.Visibility;
import com.reddit.data.events.models.components.ViewStats;
import com.reddit.data.events.models.components.VideoErrorReport;
import com.reddit.data.events.models.components.UserSubreddit;
import com.reddit.data.events.models.components.UserPreferences;
import com.reddit.data.events.models.components.UserFlair;
import com.reddit.data.events.models.components.UserDeactivationInfo;
import com.reddit.data.events.models.components.UrlParsed;
import com.reddit.data.events.models.components.Upload;
import com.reddit.data.events.models.components.Trophy;
import com.reddit.data.events.models.components.Transfer;
import com.reddit.data.events.models.components.Transaction;
import com.reddit.data.events.models.components.TopicTag;
import com.reddit.data.events.models.components.TopicMetadata;
import com.reddit.data.events.models.components.Tooltip;
import com.reddit.data.events.models.components.Token;
import com.reddit.data.events.models.components.Timer;
import com.reddit.data.events.models.components.Ticket;
import com.reddit.data.events.models.components.ThirdPartyBadge;
import com.reddit.data.events.models.components.TheaterMode;
import com.reddit.data.events.models.components.TwoFactorAuth;
import com.reddit.data.events.models.components.Taxonomy;
import com.reddit.data.events.models.components.User;
import com.reddit.data.events.models.components.TargetIP;
import com.reddit.data.events.models.components.SurveyResponse;
import com.reddit.data.events.models.components.Survey;
import com.reddit.data.events.models.components.Subreddit;
import com.reddit.data.events.models.components.SpamuraiAction;
import com.reddit.data.events.models.components.SocialLink;
import com.reddit.data.events.models.components.Snoovatar;
import com.reddit.data.events.models.components.Share;
import com.reddit.data.events.models.components.Setting;
import com.reddit.data.events.models.components.Session;
import com.reddit.data.events.models.components.SEO;
import com.reddit.data.events.models.components.Search;
import com.reddit.data.events.models.components.ScreenTrace;
import com.reddit.data.events.models.components.Screen;
import com.reddit.data.events.models.components.ScheduledPost;
import com.reddit.data.events.models.components.RewardInfo;
import com.reddit.data.events.models.components.Restrict;
import com.reddit.data.events.models.components.Response;
import com.reddit.data.events.models.components.RES;
import com.reddit.data.events.models.components.RerouteRule;
import com.reddit.data.events.models.components.Request;
import com.reddit.data.events.models.components.Report;
import com.reddit.data.events.models.components.RelevanceModel;
import com.reddit.data.events.models.components.RegistrationForm;
import com.reddit.data.events.models.components.Referrer;
import com.reddit.data.events.models.components.ReddarTicketContent;
import com.reddit.data.events.models.components.ReddarTicket;
import com.reddit.data.events.models.components.ReddarSettings;
import com.reddit.data.events.models.components.ReddarQueue;
import com.reddit.data.events.models.components.ReddarAuditTicket;
import com.reddit.data.events.models.components.ReddarAudit;
import com.reddit.data.events.models.components.RecapCard;
import com.reddit.data.events.models.components.ReactSource;
import com.reddit.data.events.models.components.RBLSurvey;
import com.reddit.data.events.models.components.RaterTag;
import com.reddit.data.events.models.components.PWA;
import com.reddit.data.events.models.components.Purchase;
import com.reddit.data.events.models.components.ProgressModule;
import com.reddit.data.events.models.components.Programmatic;
import com.reddit.data.events.models.components.Profile;
import com.reddit.data.events.models.components.Predictions;
import com.reddit.data.events.models.components.Powerups;
import com.reddit.data.events.models.components.PostRequirement;
import com.reddit.data.events.models.components.PostFlair;
import com.reddit.data.events.models.components.PostEvent;
import com.reddit.data.events.models.components.PostDraft;
import com.reddit.data.events.models.components.PostComposer;
import com.reddit.data.events.models.components.PostCollection;
import com.reddit.data.events.models.components.Post;
import com.reddit.data.events.models.components.Popup;
import com.reddit.data.events.models.components.Poll;
import com.reddit.data.events.models.components.Playback;
import com.reddit.data.events.models.components.Platform;
import com.reddit.data.events.models.components.Perspective;
import com.reddit.data.events.models.components.Payment;
import com.reddit.data.events.models.components.Outbound;
import com.reddit.data.events.models.components.Onboarding;
import com.reddit.data.events.models.components.Oauth;
import com.reddit.data.events.models.components.NotificationRequest;
import com.reddit.data.events.models.components.Notification;
import com.reddit.data.events.models.components.News;
import com.reddit.data.events.models.components.NCMECReport;
import com.reddit.data.events.models.components.NavigationSession;
import com.reddit.data.events.models.components.Mute;
import com.reddit.data.events.models.components.ModqueueTrigger;
import com.reddit.data.events.models.components.ModqueueItem;
import com.reddit.data.events.models.components.Modqueue;
import com.reddit.data.events.models.components.ModNote;
import com.reddit.data.events.models.components.ModmailMessage;
import com.reddit.data.events.models.components.ModmailConversation;
import com.reddit.data.events.models.components.ModAction;
import com.reddit.data.events.models.components.MLModel;
import com.reddit.data.events.models.components.MetaFlair;
import com.reddit.data.events.models.components.MetaSearch;
import com.reddit.data.events.models.components.MessengerRequest;
import com.reddit.data.events.models.components.Message;
import com.reddit.data.events.models.components.Media;
import com.reddit.data.events.models.components.Marketplace;
import com.reddit.data.events.models.components.MailroomRequest;
import com.reddit.data.events.models.components.LiveThread;
import com.reddit.data.events.models.components.LiveAudioRoomUser;
import com.reddit.data.events.models.components.LiveAudioRoom;
import com.reddit.data.events.models.components.Listing;
import com.reddit.data.events.models.components.LinkSharing;
import com.reddit.data.events.models.components.LegalExportRequest;
import com.reddit.data.events.models.components.IPSplitting;
import com.reddit.data.events.models.components.Inferred;
import com.reddit.data.events.models.components.Indexing;
import com.reddit.data.events.models.components.Inbox;
import com.reddit.data.events.models.components.Imposter;
import com.reddit.data.events.models.components.GrapeshotClassification;
import com.reddit.data.events.models.components.GoldPurchase;
import com.reddit.data.events.models.components.GeoBlock;
import com.reddit.data.events.models.components.Geo;
import com.reddit.data.events.models.components.Gallery;
import com.reddit.data.events.models.components.FundingInstrument;
import com.reddit.data.events.models.components.Feed;
import com.reddit.data.events.models.components.Feature;
import com.reddit.data.events.models.components.ExperimentsPlatform;
import com.reddit.data.events.models.components.Experiment;
import com.reddit.data.events.models.components.Expand;
import com.reddit.data.events.models.components.Email;
import com.reddit.data.events.models.components.Edit;
import com.reddit.data.events.models.components.DomainBan;
import com.reddit.data.events.models.components.DOMTimers;
import com.reddit.data.events.models.components.DiscoveryUnit;
import com.reddit.data.events.models.components.CustomFeed;
import com.reddit.data.events.models.components.CSAIMedia;
import com.reddit.data.events.models.components.CSAIContentReport;
import com.reddit.data.events.models.components.CrowdSource;
import com.reddit.data.events.models.components.CrowdControl;
import com.reddit.data.events.models.components.CreditCardForm;
import com.reddit.data.events.models.components.Crawler;
import com.reddit.data.events.models.components.ConversionsOnboarding;
import com.reddit.data.events.models.components.Contract;
import com.reddit.data.events.models.components.ContentTag;
import com.reddit.data.events.models.components.ContentMetadata;
import com.reddit.data.events.models.components.CommentsLoad;
import com.reddit.data.events.models.components.CommentDraft;
import com.reddit.data.events.models.components.CommentComposer;
import com.reddit.data.events.models.components.Comment;
import com.reddit.data.events.models.components.ClickTest;
import com.reddit.data.events.models.components.ChatHomeFeedBoosting;
import com.reddit.data.events.models.components.Chat;
import com.reddit.data.events.models.components.Chain;
import com.reddit.data.events.models.components.CategoryHeader;
import com.reddit.data.events.models.components.Carousel;
import com.reddit.data.events.models.components.CameraFeature;
import com.reddit.data.events.models.components.BusinessInfo;
import com.reddit.data.events.models.components.BulkMessenger;
import com.reddit.data.events.models.components.BulkActionJob;
import com.reddit.data.events.models.components.Broadcast;
import com.reddit.data.events.models.components.Brand;
import com.reddit.data.events.models.components.BotDetection;
import com.reddit.data.events.models.components.Block;
import com.reddit.data.events.models.components.BillingInfo;
import com.reddit.data.events.models.components.Banner;
import com.reddit.data.events.models.components.Automoderator;
import com.reddit.data.events.models.components.ATC;
import com.reddit.data.events.models.components.AppIcon;
import com.reddit.data.events.models.components.App;
import com.reddit.data.events.models.components.ApiResponse;
import com.reddit.data.events.models.components.Api;
import com.reddit.data.events.models.components.Announcement;
import com.reddit.data.events.models.components.AFDSecond;
import com.reddit.data.events.models.components.AdminTeam;
import com.reddit.data.events.models.components.AdminAction;
import com.reddit.data.events.models.components.Admin;
import com.reddit.data.events.models.components.Adblock;
import com.reddit.data.events.models.components.AdTargeting;
import com.reddit.data.events.models.components.AdRequest;
import com.reddit.data.events.models.components.AdPush;
import com.reddit.data.events.models.components.AdPreview;
import com.reddit.data.events.models.components.AdPixel;
import com.reddit.data.events.models.components.AdMetadata;
import com.reddit.data.events.models.components.AdGroup;
import com.reddit.data.events.models.components.AdEntity;
import com.reddit.data.events.models.components.AdDecision;
import com.reddit.data.events.models.components.AdClick;
import com.reddit.data.events.models.components.AdCampaign;
import com.reddit.data.events.models.components.AdBrandSafety;
import com.reddit.data.events.models.components.Ad;
import com.reddit.data.events.models.components.ActionInfo;
import com.reddit.data.events.models.components.AclCheck;
import com.reddit.data.events.models.components.AccountLabel;
import com.reddit.data.events.models.components.AccessAudit;
import et.a;

public final class Event
{
    public static final a<Event, Event.Event$Builder> ADAPTER;
    public final AccessAudit access_audit;
    public final AccountLabel account_label;
    public final AclCheck acl_check;
    public final String action;
    public final ActionInfo action_info;
    public final Ad ad;
    public final AdBrandSafety ad_brand_safety;
    public final AdCampaign ad_campaign;
    public final AdClick ad_click;
    public final AdDecision ad_decision;
    public final AdEntity ad_entity;
    public final AdGroup ad_group;
    public final AdMetadata ad_metadata;
    public final AdPixel ad_pixel;
    public final AdPreview ad_preview;
    public final AdPush ad_push;
    public final AdRequest ad_request;
    public final AdTargeting ad_targeting;
    public final Adblock adblock;
    public final Admin admin;
    public final AdminAction admin_action;
    public final AdminTeam admin_team;
    public final AFDSecond afd_second;
    public final Announcement announcement;
    public final Api api;
    public final ApiResponse api_response;
    public final App app;
    public final AppIcon app_icon;
    public final ATC atc;
    public final Automoderator automoderator;
    public final Banner banner;
    public final String batch_load_id;
    public final BillingInfo billing_info;
    public final Block block;
    public final BotDetection bot_detection;
    public final Brand brand;
    public final Broadcast broadcast;
    public final BulkActionJob bulk_action_job;
    public final BulkMessenger bulk_messenger;
    public final BusinessInfo business_info;
    public final CameraFeature camera_feature;
    public final Carousel carousel;
    public final CategoryHeader category_header;
    public final Chain chain;
    public final Chat chat;
    public final ChatHomeFeedBoosting chat_home_feed_boosting;
    public final ClickTest click_test;
    public final Long client_timestamp;
    public final String collector;
    public final String collector_consistency_checksum;
    public final Comment comment;
    public final CommentComposer comment_composer;
    public final CommentDraft comment_draft;
    public final CommentsLoad comments_load;
    public final ContentMetadata content_metadata;
    public final ContentTag content_tag;
    public final Contract contract;
    public final ConversionsOnboarding conversions_onboarding;
    public final m40.a cookie_monitor;
    public final String correlation_id;
    public final Crawler crawler;
    public final Long create_request_timestamp;
    public final CreditCardForm credit_card_form;
    public final CrowdControl crowd_control;
    public final CrowdSource crowd_source;
    public final CSAIContentReport csai_content_report;
    public final CSAIMedia csai_media;
    public final CustomFeed custom_feed;
    public final DiscoveryUnit discovery_unit;
    public final DOMTimers dom_timer;
    public final DomainBan domain_ban;
    public final Edit edit;
    public final Email email;
    public final Long endpoint_timestamp;
    public final String event_hmac_key;
    public final Expand expand;
    public final Experiment experiment;
    public final ExperimentsPlatform experiments_platform;
    public final Feature feature;
    public final Feed feed;
    public final FundingInstrument funding_instrument;
    public final Gallery gallery;
    public final Geo geo;
    public final GeoBlock geo_block;
    public final GoldPurchase gold_purchase;
    public final GrapeshotClassification grapeshot_classification;
    public final Imposter imposter;
    public final Inbox inbox;
    public final Indexing indexing;
    public final Inferred inferred;
    public final IPSplitting ip_splitting;
    public final LegalExportRequest legal_export_request;
    public final LinkSharing link_sharing;
    public final Listing listing;
    public final LiveAudioRoom live_audio_room;
    public final LiveAudioRoomUser live_audio_user;
    public final LiveThread live_thread;
    public final MailroomRequest mailroom_request;
    public final Marketplace marketplace;
    public final Media media;
    public final Message message;
    public final MessengerRequest messenger_request;
    public final MetaSearch meta_search;
    public final MetaFlair metaflair;
    public final MLModel ml_model;
    public final ModAction mod_action;
    public final ModmailConversation modmail_conversation;
    public final ModmailMessage modmail_message;
    public final ModNote modnote;
    public final Modqueue modqueue;
    public final ModqueueItem modqueue_item;
    public final ModqueueTrigger modqueue_trigger;
    public final Mute mute;
    public final NavigationSession navigation_session;
    public final NCMECReport ncmec_report;
    public final News news;
    public final Notification notification;
    public final NotificationRequest notification_request;
    public final String noun;
    public final Oauth oauth;
    public final Onboarding onboarding;
    public final Outbound outbound;
    public final Payment payment;
    public final Perspective perspective;
    public final Platform platform;
    public final Playback playback;
    public final Poll poll;
    public final Popup popup;
    public final Post post;
    public final PostCollection post_collection;
    public final PostComposer post_composer;
    public final PostDraft post_draft;
    public final PostEvent post_event;
    public final PostFlair post_flair;
    public final PostRequirement post_requirement;
    public final Powerups powerups;
    public final Predictions predictions;
    public final Profile profile;
    public final Programmatic programmatic;
    public final ProgressModule progress_module;
    public final Purchase purchase;
    public final PWA pwa;
    public final RaterTag rater_tag;
    public final RBLSurvey rbl_survey;
    public final ReactSource react_source;
    public final RecapCard recap_card;
    public final ReddarAudit reddar_audit;
    public final ReddarAuditTicket reddar_audit_ticket;
    public final ReddarQueue reddar_queue;
    public final ReddarSettings reddar_settings;
    public final ReddarTicket reddar_ticket;
    public final ReddarTicketContent reddar_ticket_content;
    public final Referrer referrer;
    public final RegistrationForm registration_form;
    public final RelevanceModel relevance_model;
    public final Report report;
    public final Request request;
    public final RerouteRule reroute_rule;
    public final RES res;
    public final Response response;
    public final Restrict restrict;
    public final RewardInfo reward_info;
    public final ScheduledPost scheduled_post;
    public final Screen screen;
    public final ScreenTrace screen_trace;
    public final String screenview_id;
    public final Search search;
    public final SEO seo;
    public final Session session;
    public final Setting setting;
    public final Share share;
    public final Snoovatar snoovatar;
    public final SocialLink social_link;
    public final String source;
    public final SpamuraiAction spamurai_action;
    public final Subreddit subreddit;
    public final Survey survey;
    public final SurveyResponse survey_response;
    public final Comment target_comment;
    public final TargetIP target_ip;
    public final Message target_message;
    public final Post target_post;
    public final Subreddit target_subreddit;
    public final User target_user;
    public final Taxonomy taxonomy;
    public final TwoFactorAuth tfa;
    public final TheaterMode theater_mode;
    public final ThirdPartyBadge third_party_badge;
    public final Ticket ticket;
    public final Timer timer;
    public final Token token;
    public final Tooltip tooltip;
    public final TopicMetadata topic_metadata;
    public final TopicTag topic_tag;
    public final Transaction transaction;
    public final Transfer transfer;
    public final Trophy trophy;
    public final Upload upload;
    public final UrlParsed url_parsed;
    public final User user;
    public final UserDeactivationInfo user_deactivation_info;
    public final UserFlair user_flair;
    public final String user_legacy_id;
    public final UserPreferences user_preferences;
    public final UserSubreddit user_subreddit;
    public final Double utc_offset;
    public final String uuid;
    public final VideoErrorReport video_error_report;
    public final ViewStats view_stats;
    public final Visibility visibility;
    public final Vote vote;
    public final Webhook webhook;
    public final Widget widget;
    public final ZendeskTicket zendesk_ticket;
    public final Zipkin zipkin;
    
    static {
        ADAPTER = (a)new Event.Event$EventAdapter((Event$1)null);
    }
    
    private Event(final Event.Event$Builder event$Builder) {
        this.source = Event.Event$Builder.access$100(event$Builder);
        this.action = Event.Event$Builder.access$200(event$Builder);
        this.noun = Event.Event$Builder.access$300(event$Builder);
        this.endpoint_timestamp = Event.Event$Builder.access$400(event$Builder);
        this.client_timestamp = Event.Event$Builder.access$500(event$Builder);
        this.uuid = Event.Event$Builder.access$600(event$Builder);
        this.utc_offset = Event.Event$Builder.access$700(event$Builder);
        this.correlation_id = Event.Event$Builder.access$800(event$Builder);
        this.screenview_id = Event.Event$Builder.access$900(event$Builder);
        this.post = Event.Event$Builder.access$1000(event$Builder);
        this.listing = Event.Event$Builder.access$1100(event$Builder);
        this.comment = Event.Event$Builder.access$1200(event$Builder);
        this.notification = Event.Event$Builder.access$1300(event$Builder);
        this.oauth = Event.Event$Builder.access$1400(event$Builder);
        this.screen = Event.Event$Builder.access$1500(event$Builder);
        this.app = Event.Event$Builder.access$1600(event$Builder);
        this.platform = Event.Event$Builder.access$1700(event$Builder);
        this.request = Event.Event$Builder.access$1800(event$Builder);
        this.referrer = Event.Event$Builder.access$1900(event$Builder);
        this.dom_timer = Event.Event$Builder.access$2000(event$Builder);
        this.user = Event.Event$Builder.access$2100(event$Builder);
        this.user_preferences = Event.Event$Builder.access$2200(event$Builder);
        this.subreddit = Event.Event$Builder.access$2300(event$Builder);
        this.session = Event.Event$Builder.access$2400(event$Builder);
        this.action_info = Event.Event$Builder.access$2500(event$Builder);
        this.expand = Event.Event$Builder.access$2600(event$Builder);
        this.media = Event.Event$Builder.access$2700(event$Builder);
        this.chat = Event.Event$Builder.access$2800(event$Builder);
        this.post_composer = Event.Event$Builder.access$2900(event$Builder);
        this.widget = Event.Event$Builder.access$3000(event$Builder);
        this.profile = Event.Event$Builder.access$3100(event$Builder);
        this.onboarding = Event.Event$Builder.access$3200(event$Builder);
        this.timer = Event.Event$Builder.access$3300(event$Builder);
        this.tfa = Event.Event$Builder.access$3400(event$Builder);
        this.api_response = Event.Event$Builder.access$3500(event$Builder);
        this.api = Event.Event$Builder.access$3600(event$Builder);
        this.discovery_unit = Event.Event$Builder.access$3700(event$Builder);
        this.experiment = Event.Event$Builder.access$3800(event$Builder);
        this.share = Event.Event$Builder.access$3900(event$Builder);
        this.user_subreddit = Event.Event$Builder.access$4000(event$Builder);
        this.notification_request = Event.Event$Builder.access$4100(event$Builder);
        this.search = Event.Event$Builder.access$4200(event$Builder);
        this.message = Event.Event$Builder.access$4300(event$Builder);
        this.admin = Event.Event$Builder.access$4400(event$Builder);
        this.ticket = Event.Event$Builder.access$4500(event$Builder);
        this.mailroom_request = Event.Event$Builder.access$4600(event$Builder);
        this.comment_composer = Event.Event$Builder.access$4700(event$Builder);
        this.gold_purchase = Event.Event$Builder.access$4800(event$Builder);
        this.payment = Event.Event$Builder.access$4900(event$Builder);
        this.news = Event.Event$Builder.access$5000(event$Builder);
        this.outbound = Event.Event$Builder.access$5100(event$Builder);
        this.click_test = Event.Event$Builder.access$5200(event$Builder);
        this.carousel = Event.Event$Builder.access$5300(event$Builder);
        this.adblock = Event.Event$Builder.access$5400(event$Builder);
        this.email = Event.Event$Builder.access$5500(event$Builder);
        this.metaflair = Event.Event$Builder.access$5600(event$Builder);
        this.post_draft = Event.Event$Builder.access$5700(event$Builder);
        this.setting = Event.Event$Builder.access$5800(event$Builder);
        this.visibility = Event.Event$Builder.access$5900(event$Builder);
        this.webhook = Event.Event$Builder.access$6000(event$Builder);
        this.relevance_model = Event.Event$Builder.access$6100(event$Builder);
        this.meta_search = Event.Event$Builder.access$6200(event$Builder);
        this.post_flair = Event.Event$Builder.access$6300(event$Builder);
        this.admin_action = Event.Event$Builder.access$6400(event$Builder);
        this.zipkin = Event.Event$Builder.access$6500(event$Builder);
        this.edit = Event.Event$Builder.access$6600(event$Builder);
        this.post_event = Event.Event$Builder.access$6700(event$Builder);
        this.post_collection = Event.Event$Builder.access$6800(event$Builder);
        this.third_party_badge = Event.Event$Builder.access$6900(event$Builder);
        this.brand = Event.Event$Builder.access$7000(event$Builder);
        this.messenger_request = Event.Event$Builder.access$7100(event$Builder);
        this.banner = Event.Event$Builder.access$7200(event$Builder);
        this.tooltip = Event.Event$Builder.access$7300(event$Builder);
        this.upload = Event.Event$Builder.access$7400(event$Builder);
        this.csai_media = Event.Event$Builder.access$7500(event$Builder);
        this.category_header = Event.Event$Builder.access$7600(event$Builder);
        this.report = Event.Event$Builder.access$7700(event$Builder);
        this.live_thread = Event.Event$Builder.access$7800(event$Builder);
        this.ad_request = Event.Event$Builder.access$7900(event$Builder);
        this.ad_decision = Event.Event$Builder.access$8000(event$Builder);
        this.ad_push = Event.Event$Builder.access$8100(event$Builder);
        this.vote = Event.Event$Builder.access$8200(event$Builder);
        this.popup = Event.Event$Builder.access$8300(event$Builder);
        this.mod_action = Event.Event$Builder.access$8400(event$Builder);
        this.user_flair = Event.Event$Builder.access$8500(event$Builder);
        this.topic_tag = Event.Event$Builder.access$8600(event$Builder);
        this.res = Event.Event$Builder.access$8700(event$Builder);
        this.ad = Event.Event$Builder.access$8800(event$Builder);
        this.ad_campaign = Event.Event$Builder.access$8900(event$Builder);
        this.ad_group = Event.Event$Builder.access$9000(event$Builder);
        this.ad_targeting = Event.Event$Builder.access$9100(event$Builder);
        this.business_info = Event.Event$Builder.access$9200(event$Builder);
        this.billing_info = Event.Event$Builder.access$9300(event$Builder);
        this.reddar_ticket = Event.Event$Builder.access$9400(event$Builder);
        this.zendesk_ticket = Event.Event$Builder.access$9500(event$Builder);
        this.target_user = Event.Event$Builder.access$9600(event$Builder);
        this.crawler = Event.Event$Builder.access$9700(event$Builder);
        this.response = Event.Event$Builder.access$9800(event$Builder);
        this.custom_feed = Event.Event$Builder.access$9900(event$Builder);
        this.pwa = Event.Event$Builder.access$10000(event$Builder);
        this.seo = Event.Event$Builder.access$10100(event$Builder);
        this.ncmec_report = Event.Event$Builder.access$10200(event$Builder);
        this.funding_instrument = Event.Event$Builder.access$10300(event$Builder);
        this.grapeshot_classification = Event.Event$Builder.access$10400(event$Builder);
        this.perspective = Event.Event$Builder.access$10500(event$Builder);
        this.comment_draft = Event.Event$Builder.access$10600(event$Builder);
        this.target_post = Event.Event$Builder.access$10700(event$Builder);
        this.ml_model = Event.Event$Builder.access$10800(event$Builder);
        this.topic_metadata = Event.Event$Builder.access$10900(event$Builder);
        this.chat_home_feed_boosting = Event.Event$Builder.access$11000(event$Builder);
        this.domain_ban = Event.Event$Builder.access$11100(event$Builder);
        this.legal_export_request = Event.Event$Builder.access$11200(event$Builder);
        this.post_requirement = Event.Event$Builder.access$11300(event$Builder);
        this.target_ip = Event.Event$Builder.access$11400(event$Builder);
        this.crowd_control = Event.Event$Builder.access$11500(event$Builder);
        this.reddar_ticket_content = Event.Event$Builder.access$11600(event$Builder);
        this.scheduled_post = Event.Event$Builder.access$11700(event$Builder);
        this.poll = Event.Event$Builder.access$11800(event$Builder);
        this.reddar_audit = Event.Event$Builder.access$11900(event$Builder);
        this.reddar_audit_ticket = Event.Event$Builder.access$12000(event$Builder);
        this.target_subreddit = Event.Event$Builder.access$12100(event$Builder);
        this.spamurai_action = Event.Event$Builder.access$12200(event$Builder);
        this.ad_brand_safety = Event.Event$Builder.access$12300(event$Builder);
        this.bulk_action_job = Event.Event$Builder.access$12400(event$Builder);
        this.target_comment = Event.Event$Builder.access$12500(event$Builder);
        this.target_message = Event.Event$Builder.access$12600(event$Builder);
        this.reroute_rule = Event.Event$Builder.access$12700(event$Builder);
        this.reddar_queue = Event.Event$Builder.access$12800(event$Builder);
        this.geo_block = Event.Event$Builder.access$12900(event$Builder);
        this.programmatic = Event.Event$Builder.access$13000(event$Builder);
        this.csai_content_report = Event.Event$Builder.access$13100(event$Builder);
        this.imposter = Event.Event$Builder.access$13200(event$Builder);
        this.broadcast = Event.Event$Builder.access$13300(event$Builder);
        this.survey = Event.Event$Builder.access$13400(event$Builder);
        this.playback = Event.Event$Builder.access$13500(event$Builder);
        this.bot_detection = Event.Event$Builder.access$13600(event$Builder);
        this.crowd_source = Event.Event$Builder.access$13700(event$Builder);
        this.announcement = Event.Event$Builder.access$13800(event$Builder);
        this.purchase = Event.Event$Builder.access$13900(event$Builder);
        this.powerups = Event.Event$Builder.access$14000(event$Builder);
        this.account_label = Event.Event$Builder.access$14100(event$Builder);
        this.inbox = Event.Event$Builder.access$14200(event$Builder);
        this.gallery = Event.Event$Builder.access$14300(event$Builder);
        this.trophy = Event.Event$Builder.access$14400(event$Builder);
        this.feature = Event.Event$Builder.access$14500(event$Builder);
        this.admin_team = Event.Event$Builder.access$14600(event$Builder);
        this.mute = Event.Event$Builder.access$14700(event$Builder);
        this.content_tag = Event.Event$Builder.access$14800(event$Builder);
        this.rater_tag = Event.Event$Builder.access$14900(event$Builder);
        this.credit_card_form = Event.Event$Builder.access$15000(event$Builder);
        this.ad_click = Event.Event$Builder.access$15100(event$Builder);
        this.snoovatar = Event.Event$Builder.access$15200(event$Builder);
        this.feed = Event.Event$Builder.access$15300(event$Builder);
        this.progress_module = Event.Event$Builder.access$15400(event$Builder);
        this.app_icon = Event.Event$Builder.access$15500(event$Builder);
        this.ad_metadata = Event.Event$Builder.access$15600(event$Builder);
        this.predictions = Event.Event$Builder.access$15700(event$Builder);
        this.navigation_session = Event.Event$Builder.access$15800(event$Builder);
        this.afd_second = Event.Event$Builder.access$15900(event$Builder);
        this.atc = Event.Event$Builder.access$16000(event$Builder);
        this.view_stats = Event.Event$Builder.access$16100(event$Builder);
        this.reward_info = Event.Event$Builder.access$16200(event$Builder);
        this.live_audio_room = Event.Event$Builder.access$16300(event$Builder);
        this.live_audio_user = Event.Event$Builder.access$16400(event$Builder);
        this.modmail_conversation = Event.Event$Builder.access$16500(event$Builder);
        this.modmail_message = Event.Event$Builder.access$16600(event$Builder);
        this.bulk_messenger = Event.Event$Builder.access$16700(event$Builder);
        this.restrict = Event.Event$Builder.access$16800(event$Builder);
        this.ad_pixel = Event.Event$Builder.access$16900(event$Builder);
        this.video_error_report = Event.Event$Builder.access$17000(event$Builder);
        this.taxonomy = Event.Event$Builder.access$17100(event$Builder);
        this.social_link = Event.Event$Builder.access$17200(event$Builder);
        this.acl_check = Event.Event$Builder.access$17300(event$Builder);
        this.cookie_monitor = Event.Event$Builder.access$17400(event$Builder);
        this.camera_feature = Event.Event$Builder.access$17500(event$Builder);
        this.registration_form = Event.Event$Builder.access$17600(event$Builder);
        this.modqueue = Event.Event$Builder.access$17700(event$Builder);
        this.modqueue_item = Event.Event$Builder.access$17800(event$Builder);
        this.recap_card = Event.Event$Builder.access$17900(event$Builder);
        this.modqueue_trigger = Event.Event$Builder.access$18000(event$Builder);
        this.modnote = Event.Event$Builder.access$18100(event$Builder);
        this.screen_trace = Event.Event$Builder.access$18200(event$Builder);
        this.rbl_survey = Event.Event$Builder.access$18300(event$Builder);
        this.survey_response = Event.Event$Builder.access$18400(event$Builder);
        this.reddar_settings = Event.Event$Builder.access$18500(event$Builder);
        this.ad_entity = Event.Event$Builder.access$18600(event$Builder);
        this.react_source = Event.Event$Builder.access$18700(event$Builder);
        this.conversions_onboarding = Event.Event$Builder.access$18800(event$Builder);
        this.theater_mode = Event.Event$Builder.access$18900(event$Builder);
        this.chain = Event.Event$Builder.access$19000(event$Builder);
        this.contract = Event.Event$Builder.access$19100(event$Builder);
        this.token = Event.Event$Builder.access$19200(event$Builder);
        this.block = Event.Event$Builder.access$19300(event$Builder);
        this.transaction = Event.Event$Builder.access$19400(event$Builder);
        this.transfer = Event.Event$Builder.access$19500(event$Builder);
        this.marketplace = Event.Event$Builder.access$19600(event$Builder);
        this.automoderator = Event.Event$Builder.access$19700(event$Builder);
        this.access_audit = Event.Event$Builder.access$19800(event$Builder);
        this.indexing = Event.Event$Builder.access$19900(event$Builder);
        this.ad_preview = Event.Event$Builder.access$20000(event$Builder);
        this.user_deactivation_info = Event.Event$Builder.access$20100(event$Builder);
        this.experiments_platform = Event.Event$Builder.access$20200(event$Builder);
        this.comments_load = Event.Event$Builder.access$20300(event$Builder);
        this.geo = Event.Event$Builder.access$20400(event$Builder);
        this.user_legacy_id = Event.Event$Builder.access$20500(event$Builder);
        this.content_metadata = Event.Event$Builder.access$20600(event$Builder);
        this.url_parsed = Event.Event$Builder.access$20700(event$Builder);
        this.link_sharing = Event.Event$Builder.access$20800(event$Builder);
        this.create_request_timestamp = Event.Event$Builder.access$20900(event$Builder);
        this.inferred = Event.Event$Builder.access$21000(event$Builder);
        this.event_hmac_key = Event.Event$Builder.access$21100(event$Builder);
        this.batch_load_id = Event.Event$Builder.access$21200(event$Builder);
        this.ip_splitting = Event.Event$Builder.access$21300(event$Builder);
        this.collector = Event.Event$Builder.access$21400(event$Builder);
        this.collector_consistency_checksum = Event.Event$Builder.access$21500(event$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Event)) {
            return false;
        }
        final Event event = (Event)o;
        final String source = this.source;
        final String source2 = event.source;
        if (source == source2 || source.equals(source2)) {
            final String action = this.action;
            final String action2 = event.action;
            if (action == action2 || action.equals(action2)) {
                final String noun = this.noun;
                final String noun2 = event.noun;
                if (noun == noun2 || noun.equals(noun2)) {
                    final Long endpoint_timestamp = this.endpoint_timestamp;
                    final Long endpoint_timestamp2 = event.endpoint_timestamp;
                    if (endpoint_timestamp == endpoint_timestamp2 || (endpoint_timestamp != null && endpoint_timestamp.equals(endpoint_timestamp2))) {
                        final Long client_timestamp = this.client_timestamp;
                        final Long client_timestamp2 = event.client_timestamp;
                        if (client_timestamp == client_timestamp2 || client_timestamp.equals(client_timestamp2)) {
                            final String uuid = this.uuid;
                            final String uuid2 = event.uuid;
                            if (uuid == uuid2 || uuid.equals(uuid2)) {
                                final Double utc_offset = this.utc_offset;
                                final Double utc_offset2 = event.utc_offset;
                                if (utc_offset == utc_offset2 || (utc_offset != null && utc_offset.equals(utc_offset2))) {
                                    final String correlation_id = this.correlation_id;
                                    final String correlation_id2 = event.correlation_id;
                                    if (correlation_id == correlation_id2 || (correlation_id != null && correlation_id.equals(correlation_id2))) {
                                        final String screenview_id = this.screenview_id;
                                        final String screenview_id2 = event.screenview_id;
                                        if (screenview_id == screenview_id2 || (screenview_id != null && screenview_id.equals(screenview_id2))) {
                                            final Post post = this.post;
                                            final Post post2 = event.post;
                                            if (post == post2 || (post != null && post.equals((Object)post2))) {
                                                final Listing listing = this.listing;
                                                final Listing listing2 = event.listing;
                                                if (listing == listing2 || (listing != null && listing.equals((Object)listing2))) {
                                                    final Comment comment = this.comment;
                                                    final Comment comment2 = event.comment;
                                                    if (comment == comment2 || (comment != null && comment.equals((Object)comment2))) {
                                                        final Notification notification = this.notification;
                                                        final Notification notification2 = event.notification;
                                                        if (notification == notification2 || (notification != null && notification.equals((Object)notification2))) {
                                                            final Oauth oauth = this.oauth;
                                                            final Oauth oauth2 = event.oauth;
                                                            if (oauth == oauth2 || (oauth != null && oauth.equals((Object)oauth2))) {
                                                                final Screen screen = this.screen;
                                                                final Screen screen2 = event.screen;
                                                                if (screen == screen2 || (screen != null && screen.equals((Object)screen2))) {
                                                                    final App app = this.app;
                                                                    final App app2 = event.app;
                                                                    if (app == app2 || (app != null && app.equals((Object)app2))) {
                                                                        final Platform platform = this.platform;
                                                                        final Platform platform2 = event.platform;
                                                                        if (platform == platform2 || (platform != null && platform.equals((Object)platform2))) {
                                                                            final Request request = this.request;
                                                                            final Request request2 = event.request;
                                                                            if (request == request2 || (request != null && request.equals((Object)request2))) {
                                                                                final Referrer referrer = this.referrer;
                                                                                final Referrer referrer2 = event.referrer;
                                                                                if (referrer == referrer2 || (referrer != null && referrer.equals((Object)referrer2))) {
                                                                                    final DOMTimers dom_timer = this.dom_timer;
                                                                                    final DOMTimers dom_timer2 = event.dom_timer;
                                                                                    if (dom_timer == dom_timer2 || (dom_timer != null && dom_timer.equals((Object)dom_timer2))) {
                                                                                        final User user = this.user;
                                                                                        final User user2 = event.user;
                                                                                        if (user == user2 || (user != null && user.equals(user2))) {
                                                                                            final UserPreferences user_preferences = this.user_preferences;
                                                                                            final UserPreferences user_preferences2 = event.user_preferences;
                                                                                            if (user_preferences == user_preferences2 || (user_preferences != null && user_preferences.equals(user_preferences2))) {
                                                                                                final Subreddit subreddit = this.subreddit;
                                                                                                final Subreddit subreddit2 = event.subreddit;
                                                                                                if (subreddit == subreddit2 || (subreddit != null && subreddit.equals(subreddit2))) {
                                                                                                    final Session session = this.session;
                                                                                                    final Session session2 = event.session;
                                                                                                    if (session == session2 || (session != null && session.equals(session2))) {
                                                                                                        final ActionInfo action_info = this.action_info;
                                                                                                        final ActionInfo action_info2 = event.action_info;
                                                                                                        if (action_info == action_info2 || (action_info != null && action_info.equals(action_info2))) {
                                                                                                            final Expand expand = this.expand;
                                                                                                            final Expand expand2 = event.expand;
                                                                                                            if (expand == expand2 || (expand != null && expand.equals((Object)expand2))) {
                                                                                                                final Media media = this.media;
                                                                                                                final Media media2 = event.media;
                                                                                                                if (media == media2 || (media != null && media.equals((Object)media2))) {
                                                                                                                    final Chat chat = this.chat;
                                                                                                                    final Chat chat2 = event.chat;
                                                                                                                    if (chat == chat2 || (chat != null && chat.equals((Object)chat2))) {
                                                                                                                        final PostComposer post_composer = this.post_composer;
                                                                                                                        final PostComposer post_composer2 = event.post_composer;
                                                                                                                        if (post_composer == post_composer2 || (post_composer != null && post_composer.equals((Object)post_composer2))) {
                                                                                                                            final Widget widget = this.widget;
                                                                                                                            final Widget widget2 = event.widget;
                                                                                                                            if (widget == widget2 || (widget != null && widget.equals(widget2))) {
                                                                                                                                final Profile profile = this.profile;
                                                                                                                                final Profile profile2 = event.profile;
                                                                                                                                if (profile == profile2 || (profile != null && profile.equals((Object)profile2))) {
                                                                                                                                    final Onboarding onboarding = this.onboarding;
                                                                                                                                    final Onboarding onboarding2 = event.onboarding;
                                                                                                                                    if (onboarding == onboarding2 || (onboarding != null && onboarding.equals((Object)onboarding2))) {
                                                                                                                                        final Timer timer = this.timer;
                                                                                                                                        final Timer timer2 = event.timer;
                                                                                                                                        if (timer == timer2 || (timer != null && timer.equals(timer2))) {
                                                                                                                                            final TwoFactorAuth tfa = this.tfa;
                                                                                                                                            final TwoFactorAuth tfa2 = event.tfa;
                                                                                                                                            if (tfa == tfa2 || (tfa != null && tfa.equals(tfa2))) {
                                                                                                                                                final ApiResponse api_response = this.api_response;
                                                                                                                                                final ApiResponse api_response2 = event.api_response;
                                                                                                                                                if (api_response == api_response2 || (api_response != null && api_response.equals((Object)api_response2))) {
                                                                                                                                                    final Api api = this.api;
                                                                                                                                                    final Api api2 = event.api;
                                                                                                                                                    if (api == api2 || (api != null && api.equals((Object)api2))) {
                                                                                                                                                        final DiscoveryUnit discovery_unit = this.discovery_unit;
                                                                                                                                                        final DiscoveryUnit discovery_unit2 = event.discovery_unit;
                                                                                                                                                        if (discovery_unit == discovery_unit2 || (discovery_unit != null && discovery_unit.equals((Object)discovery_unit2))) {
                                                                                                                                                            final Experiment experiment = this.experiment;
                                                                                                                                                            final Experiment experiment2 = event.experiment;
                                                                                                                                                            if (experiment == experiment2 || (experiment != null && experiment.equals((Object)experiment2))) {
                                                                                                                                                                final Share share = this.share;
                                                                                                                                                                final Share share2 = event.share;
                                                                                                                                                                if (share == share2 || (share != null && share.equals(share2))) {
                                                                                                                                                                    final UserSubreddit user_subreddit = this.user_subreddit;
                                                                                                                                                                    final UserSubreddit user_subreddit2 = event.user_subreddit;
                                                                                                                                                                    if (user_subreddit == user_subreddit2 || (user_subreddit != null && user_subreddit.equals(user_subreddit2))) {
                                                                                                                                                                        final NotificationRequest notification_request = this.notification_request;
                                                                                                                                                                        final NotificationRequest notification_request2 = event.notification_request;
                                                                                                                                                                        if (notification_request == notification_request2 || (notification_request != null && notification_request.equals((Object)notification_request2))) {
                                                                                                                                                                            final Search search = this.search;
                                                                                                                                                                            final Search search2 = event.search;
                                                                                                                                                                            if (search == search2 || (search != null && search.equals(search2))) {
                                                                                                                                                                                final Message message = this.message;
                                                                                                                                                                                final Message message2 = event.message;
                                                                                                                                                                                if (message == message2 || (message != null && message.equals((Object)message2))) {
                                                                                                                                                                                    final Admin admin = this.admin;
                                                                                                                                                                                    final Admin admin2 = event.admin;
                                                                                                                                                                                    if (admin == admin2 || (admin != null && admin.equals((Object)admin2))) {
                                                                                                                                                                                        final Ticket ticket = this.ticket;
                                                                                                                                                                                        final Ticket ticket2 = event.ticket;
                                                                                                                                                                                        if (ticket == ticket2 || (ticket != null && ticket.equals(ticket2))) {
                                                                                                                                                                                            final MailroomRequest mailroom_request = this.mailroom_request;
                                                                                                                                                                                            final MailroomRequest mailroom_request2 = event.mailroom_request;
                                                                                                                                                                                            if (mailroom_request == mailroom_request2 || (mailroom_request != null && mailroom_request.equals((Object)mailroom_request2))) {
                                                                                                                                                                                                final CommentComposer comment_composer = this.comment_composer;
                                                                                                                                                                                                final CommentComposer comment_composer2 = event.comment_composer;
                                                                                                                                                                                                if (comment_composer == comment_composer2 || (comment_composer != null && comment_composer.equals((Object)comment_composer2))) {
                                                                                                                                                                                                    final GoldPurchase gold_purchase = this.gold_purchase;
                                                                                                                                                                                                    final GoldPurchase gold_purchase2 = event.gold_purchase;
                                                                                                                                                                                                    if (gold_purchase == gold_purchase2 || (gold_purchase != null && gold_purchase.equals((Object)gold_purchase2))) {
                                                                                                                                                                                                        final Payment payment = this.payment;
                                                                                                                                                                                                        final Payment payment2 = event.payment;
                                                                                                                                                                                                        if (payment == payment2 || (payment != null && payment.equals((Object)payment2))) {
                                                                                                                                                                                                            final News news = this.news;
                                                                                                                                                                                                            final News news2 = event.news;
                                                                                                                                                                                                            if (news == news2 || (news != null && news.equals((Object)news2))) {
                                                                                                                                                                                                                final Outbound outbound = this.outbound;
                                                                                                                                                                                                                final Outbound outbound2 = event.outbound;
                                                                                                                                                                                                                if (outbound == outbound2 || (outbound != null && outbound.equals((Object)outbound2))) {
                                                                                                                                                                                                                    final ClickTest click_test = this.click_test;
                                                                                                                                                                                                                    final ClickTest click_test2 = event.click_test;
                                                                                                                                                                                                                    if (click_test == click_test2 || (click_test != null && click_test.equals((Object)click_test2))) {
                                                                                                                                                                                                                        final Carousel carousel = this.carousel;
                                                                                                                                                                                                                        final Carousel carousel2 = event.carousel;
                                                                                                                                                                                                                        if (carousel == carousel2 || (carousel != null && carousel.equals((Object)carousel2))) {
                                                                                                                                                                                                                            final Adblock adblock = this.adblock;
                                                                                                                                                                                                                            final Adblock adblock2 = event.adblock;
                                                                                                                                                                                                                            if (adblock == adblock2 || (adblock != null && adblock.equals((Object)adblock2))) {
                                                                                                                                                                                                                                final Email email = this.email;
                                                                                                                                                                                                                                final Email email2 = event.email;
                                                                                                                                                                                                                                if (email == email2 || (email != null && email.equals((Object)email2))) {
                                                                                                                                                                                                                                    final MetaFlair metaflair = this.metaflair;
                                                                                                                                                                                                                                    final MetaFlair metaflair2 = event.metaflair;
                                                                                                                                                                                                                                    if (metaflair == metaflair2 || (metaflair != null && metaflair.equals((Object)metaflair2))) {
                                                                                                                                                                                                                                        final PostDraft post_draft = this.post_draft;
                                                                                                                                                                                                                                        final PostDraft post_draft2 = event.post_draft;
                                                                                                                                                                                                                                        if (post_draft == post_draft2 || (post_draft != null && post_draft.equals((Object)post_draft2))) {
                                                                                                                                                                                                                                            final Setting setting = this.setting;
                                                                                                                                                                                                                                            final Setting setting2 = event.setting;
                                                                                                                                                                                                                                            if (setting == setting2 || (setting != null && setting.equals(setting2))) {
                                                                                                                                                                                                                                                final Visibility visibility = this.visibility;
                                                                                                                                                                                                                                                final Visibility visibility2 = event.visibility;
                                                                                                                                                                                                                                                if (visibility == visibility2 || (visibility != null && visibility.equals(visibility2))) {
                                                                                                                                                                                                                                                    final Webhook webhook = this.webhook;
                                                                                                                                                                                                                                                    final Webhook webhook2 = event.webhook;
                                                                                                                                                                                                                                                    if (webhook == webhook2 || (webhook != null && webhook.equals(webhook2))) {
                                                                                                                                                                                                                                                        final RelevanceModel relevance_model = this.relevance_model;
                                                                                                                                                                                                                                                        final RelevanceModel relevance_model2 = event.relevance_model;
                                                                                                                                                                                                                                                        if (relevance_model == relevance_model2 || (relevance_model != null && relevance_model.equals((Object)relevance_model2))) {
                                                                                                                                                                                                                                                            final MetaSearch meta_search = this.meta_search;
                                                                                                                                                                                                                                                            final MetaSearch meta_search2 = event.meta_search;
                                                                                                                                                                                                                                                            if (meta_search == meta_search2 || (meta_search != null && meta_search.equals((Object)meta_search2))) {
                                                                                                                                                                                                                                                                final PostFlair post_flair = this.post_flair;
                                                                                                                                                                                                                                                                final PostFlair post_flair2 = event.post_flair;
                                                                                                                                                                                                                                                                if (post_flair == post_flair2 || (post_flair != null && post_flair.equals((Object)post_flair2))) {
                                                                                                                                                                                                                                                                    final AdminAction admin_action = this.admin_action;
                                                                                                                                                                                                                                                                    final AdminAction admin_action2 = event.admin_action;
                                                                                                                                                                                                                                                                    if (admin_action == admin_action2 || (admin_action != null && admin_action.equals((Object)admin_action2))) {
                                                                                                                                                                                                                                                                        final Zipkin zipkin = this.zipkin;
                                                                                                                                                                                                                                                                        final Zipkin zipkin2 = event.zipkin;
                                                                                                                                                                                                                                                                        if (zipkin == zipkin2 || (zipkin != null && zipkin.equals(zipkin2))) {
                                                                                                                                                                                                                                                                            final Edit edit = this.edit;
                                                                                                                                                                                                                                                                            final Edit edit2 = event.edit;
                                                                                                                                                                                                                                                                            if (edit == edit2 || (edit != null && edit.equals((Object)edit2))) {
                                                                                                                                                                                                                                                                                final PostEvent post_event = this.post_event;
                                                                                                                                                                                                                                                                                final PostEvent post_event2 = event.post_event;
                                                                                                                                                                                                                                                                                if (post_event == post_event2 || (post_event != null && post_event.equals((Object)post_event2))) {
                                                                                                                                                                                                                                                                                    final PostCollection post_collection = this.post_collection;
                                                                                                                                                                                                                                                                                    final PostCollection post_collection2 = event.post_collection;
                                                                                                                                                                                                                                                                                    if (post_collection == post_collection2 || (post_collection != null && post_collection.equals((Object)post_collection2))) {
                                                                                                                                                                                                                                                                                        final ThirdPartyBadge third_party_badge = this.third_party_badge;
                                                                                                                                                                                                                                                                                        final ThirdPartyBadge third_party_badge2 = event.third_party_badge;
                                                                                                                                                                                                                                                                                        if (third_party_badge == third_party_badge2 || (third_party_badge != null && third_party_badge.equals(third_party_badge2))) {
                                                                                                                                                                                                                                                                                            final Brand brand = this.brand;
                                                                                                                                                                                                                                                                                            final Brand brand2 = event.brand;
                                                                                                                                                                                                                                                                                            if (brand == brand2 || (brand != null && brand.equals((Object)brand2))) {
                                                                                                                                                                                                                                                                                                final MessengerRequest messenger_request = this.messenger_request;
                                                                                                                                                                                                                                                                                                final MessengerRequest messenger_request2 = event.messenger_request;
                                                                                                                                                                                                                                                                                                if (messenger_request == messenger_request2 || (messenger_request != null && messenger_request.equals((Object)messenger_request2))) {
                                                                                                                                                                                                                                                                                                    final Banner banner = this.banner;
                                                                                                                                                                                                                                                                                                    final Banner banner2 = event.banner;
                                                                                                                                                                                                                                                                                                    if (banner == banner2 || (banner != null && banner.equals((Object)banner2))) {
                                                                                                                                                                                                                                                                                                        final Tooltip tooltip = this.tooltip;
                                                                                                                                                                                                                                                                                                        final Tooltip tooltip2 = event.tooltip;
                                                                                                                                                                                                                                                                                                        if (tooltip == tooltip2 || (tooltip != null && tooltip.equals(tooltip2))) {
                                                                                                                                                                                                                                                                                                            final Upload upload = this.upload;
                                                                                                                                                                                                                                                                                                            final Upload upload2 = event.upload;
                                                                                                                                                                                                                                                                                                            if (upload == upload2 || (upload != null && upload.equals(upload2))) {
                                                                                                                                                                                                                                                                                                                final CSAIMedia csai_media = this.csai_media;
                                                                                                                                                                                                                                                                                                                final CSAIMedia csai_media2 = event.csai_media;
                                                                                                                                                                                                                                                                                                                if (csai_media == csai_media2 || (csai_media != null && csai_media.equals((Object)csai_media2))) {
                                                                                                                                                                                                                                                                                                                    final CategoryHeader category_header = this.category_header;
                                                                                                                                                                                                                                                                                                                    final CategoryHeader category_header2 = event.category_header;
                                                                                                                                                                                                                                                                                                                    if (category_header == category_header2 || (category_header != null && category_header.equals((Object)category_header2))) {
                                                                                                                                                                                                                                                                                                                        final Report report = this.report;
                                                                                                                                                                                                                                                                                                                        final Report report2 = event.report;
                                                                                                                                                                                                                                                                                                                        if (report == report2 || (report != null && report.equals((Object)report2))) {
                                                                                                                                                                                                                                                                                                                            final LiveThread live_thread = this.live_thread;
                                                                                                                                                                                                                                                                                                                            final LiveThread live_thread2 = event.live_thread;
                                                                                                                                                                                                                                                                                                                            if (live_thread == live_thread2 || (live_thread != null && live_thread.equals((Object)live_thread2))) {
                                                                                                                                                                                                                                                                                                                                final AdRequest ad_request = this.ad_request;
                                                                                                                                                                                                                                                                                                                                final AdRequest ad_request2 = event.ad_request;
                                                                                                                                                                                                                                                                                                                                if (ad_request == ad_request2 || (ad_request != null && ad_request.equals((Object)ad_request2))) {
                                                                                                                                                                                                                                                                                                                                    final AdDecision ad_decision = this.ad_decision;
                                                                                                                                                                                                                                                                                                                                    final AdDecision ad_decision2 = event.ad_decision;
                                                                                                                                                                                                                                                                                                                                    if (ad_decision == ad_decision2 || (ad_decision != null && ad_decision.equals((Object)ad_decision2))) {
                                                                                                                                                                                                                                                                                                                                        final AdPush ad_push = this.ad_push;
                                                                                                                                                                                                                                                                                                                                        final AdPush ad_push2 = event.ad_push;
                                                                                                                                                                                                                                                                                                                                        if (ad_push == ad_push2 || (ad_push != null && ad_push.equals((Object)ad_push2))) {
                                                                                                                                                                                                                                                                                                                                            final Vote vote = this.vote;
                                                                                                                                                                                                                                                                                                                                            final Vote vote2 = event.vote;
                                                                                                                                                                                                                                                                                                                                            if (vote == vote2 || (vote != null && vote.equals(vote2))) {
                                                                                                                                                                                                                                                                                                                                                final Popup popup = this.popup;
                                                                                                                                                                                                                                                                                                                                                final Popup popup2 = event.popup;
                                                                                                                                                                                                                                                                                                                                                if (popup == popup2 || (popup != null && popup.equals((Object)popup2))) {
                                                                                                                                                                                                                                                                                                                                                    final ModAction mod_action = this.mod_action;
                                                                                                                                                                                                                                                                                                                                                    final ModAction mod_action2 = event.mod_action;
                                                                                                                                                                                                                                                                                                                                                    if (mod_action == mod_action2 || (mod_action != null && mod_action.equals((Object)mod_action2))) {
                                                                                                                                                                                                                                                                                                                                                        final UserFlair user_flair = this.user_flair;
                                                                                                                                                                                                                                                                                                                                                        final UserFlair user_flair2 = event.user_flair;
                                                                                                                                                                                                                                                                                                                                                        if (user_flair == user_flair2 || (user_flair != null && user_flair.equals(user_flair2))) {
                                                                                                                                                                                                                                                                                                                                                            final TopicTag topic_tag = this.topic_tag;
                                                                                                                                                                                                                                                                                                                                                            final TopicTag topic_tag2 = event.topic_tag;
                                                                                                                                                                                                                                                                                                                                                            if (topic_tag == topic_tag2 || (topic_tag != null && topic_tag.equals(topic_tag2))) {
                                                                                                                                                                                                                                                                                                                                                                final RES res = this.res;
                                                                                                                                                                                                                                                                                                                                                                final RES res2 = event.res;
                                                                                                                                                                                                                                                                                                                                                                if (res == res2 || (res != null && res.equals((Object)res2))) {
                                                                                                                                                                                                                                                                                                                                                                    final Ad ad = this.ad;
                                                                                                                                                                                                                                                                                                                                                                    final Ad ad2 = event.ad;
                                                                                                                                                                                                                                                                                                                                                                    if (ad == ad2 || (ad != null && ad.equals((Object)ad2))) {
                                                                                                                                                                                                                                                                                                                                                                        final AdCampaign ad_campaign = this.ad_campaign;
                                                                                                                                                                                                                                                                                                                                                                        final AdCampaign ad_campaign2 = event.ad_campaign;
                                                                                                                                                                                                                                                                                                                                                                        if (ad_campaign == ad_campaign2 || (ad_campaign != null && ad_campaign.equals((Object)ad_campaign2))) {
                                                                                                                                                                                                                                                                                                                                                                            final AdGroup ad_group = this.ad_group;
                                                                                                                                                                                                                                                                                                                                                                            final AdGroup ad_group2 = event.ad_group;
                                                                                                                                                                                                                                                                                                                                                                            if (ad_group == ad_group2 || (ad_group != null && ad_group.equals((Object)ad_group2))) {
                                                                                                                                                                                                                                                                                                                                                                                final AdTargeting ad_targeting = this.ad_targeting;
                                                                                                                                                                                                                                                                                                                                                                                final AdTargeting ad_targeting2 = event.ad_targeting;
                                                                                                                                                                                                                                                                                                                                                                                if (ad_targeting == ad_targeting2 || (ad_targeting != null && ad_targeting.equals((Object)ad_targeting2))) {
                                                                                                                                                                                                                                                                                                                                                                                    final BusinessInfo business_info = this.business_info;
                                                                                                                                                                                                                                                                                                                                                                                    final BusinessInfo business_info2 = event.business_info;
                                                                                                                                                                                                                                                                                                                                                                                    if (business_info == business_info2 || (business_info != null && business_info.equals((Object)business_info2))) {
                                                                                                                                                                                                                                                                                                                                                                                        final BillingInfo billing_info = this.billing_info;
                                                                                                                                                                                                                                                                                                                                                                                        final BillingInfo billing_info2 = event.billing_info;
                                                                                                                                                                                                                                                                                                                                                                                        if (billing_info == billing_info2 || (billing_info != null && billing_info.equals((Object)billing_info2))) {
                                                                                                                                                                                                                                                                                                                                                                                            final ReddarTicket reddar_ticket = this.reddar_ticket;
                                                                                                                                                                                                                                                                                                                                                                                            final ReddarTicket reddar_ticket2 = event.reddar_ticket;
                                                                                                                                                                                                                                                                                                                                                                                            if (reddar_ticket == reddar_ticket2 || (reddar_ticket != null && reddar_ticket.equals((Object)reddar_ticket2))) {
                                                                                                                                                                                                                                                                                                                                                                                                final ZendeskTicket zendesk_ticket = this.zendesk_ticket;
                                                                                                                                                                                                                                                                                                                                                                                                final ZendeskTicket zendesk_ticket2 = event.zendesk_ticket;
                                                                                                                                                                                                                                                                                                                                                                                                if (zendesk_ticket == zendesk_ticket2 || (zendesk_ticket != null && zendesk_ticket.equals(zendesk_ticket2))) {
                                                                                                                                                                                                                                                                                                                                                                                                    final User target_user = this.target_user;
                                                                                                                                                                                                                                                                                                                                                                                                    final User target_user2 = event.target_user;
                                                                                                                                                                                                                                                                                                                                                                                                    if (target_user == target_user2 || (target_user != null && target_user.equals(target_user2))) {
                                                                                                                                                                                                                                                                                                                                                                                                        final Crawler crawler = this.crawler;
                                                                                                                                                                                                                                                                                                                                                                                                        final Crawler crawler2 = event.crawler;
                                                                                                                                                                                                                                                                                                                                                                                                        if (crawler == crawler2 || (crawler != null && crawler.equals((Object)crawler2))) {
                                                                                                                                                                                                                                                                                                                                                                                                            final Response response = this.response;
                                                                                                                                                                                                                                                                                                                                                                                                            final Response response2 = event.response;
                                                                                                                                                                                                                                                                                                                                                                                                            if (response == response2 || (response != null && response.equals((Object)response2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                final CustomFeed custom_feed = this.custom_feed;
                                                                                                                                                                                                                                                                                                                                                                                                                final CustomFeed custom_feed2 = event.custom_feed;
                                                                                                                                                                                                                                                                                                                                                                                                                if (custom_feed == custom_feed2 || (custom_feed != null && custom_feed.equals((Object)custom_feed2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                    final PWA pwa = this.pwa;
                                                                                                                                                                                                                                                                                                                                                                                                                    final PWA pwa2 = event.pwa;
                                                                                                                                                                                                                                                                                                                                                                                                                    if (pwa == pwa2 || (pwa != null && pwa.equals((Object)pwa2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                        final SEO seo = this.seo;
                                                                                                                                                                                                                                                                                                                                                                                                                        final SEO seo2 = event.seo;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (seo == seo2 || (seo != null && seo.equals((Object)seo2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                            final NCMECReport ncmec_report = this.ncmec_report;
                                                                                                                                                                                                                                                                                                                                                                                                                            final NCMECReport ncmec_report2 = event.ncmec_report;
                                                                                                                                                                                                                                                                                                                                                                                                                            if (ncmec_report == ncmec_report2 || (ncmec_report != null && ncmec_report.equals((Object)ncmec_report2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                final FundingInstrument funding_instrument = this.funding_instrument;
                                                                                                                                                                                                                                                                                                                                                                                                                                final FundingInstrument funding_instrument2 = event.funding_instrument;
                                                                                                                                                                                                                                                                                                                                                                                                                                if (funding_instrument == funding_instrument2 || (funding_instrument != null && funding_instrument.equals((Object)funding_instrument2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    final GrapeshotClassification grapeshot_classification = this.grapeshot_classification;
                                                                                                                                                                                                                                                                                                                                                                                                                                    final GrapeshotClassification grapeshot_classification2 = event.grapeshot_classification;
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (grapeshot_classification == grapeshot_classification2 || (grapeshot_classification != null && grapeshot_classification.equals((Object)grapeshot_classification2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        final Perspective perspective = this.perspective;
                                                                                                                                                                                                                                                                                                                                                                                                                                        final Perspective perspective2 = event.perspective;
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (perspective == perspective2 || (perspective != null && perspective.equals((Object)perspective2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            final CommentDraft comment_draft = this.comment_draft;
                                                                                                                                                                                                                                                                                                                                                                                                                                            final CommentDraft comment_draft2 = event.comment_draft;
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (comment_draft == comment_draft2 || (comment_draft != null && comment_draft.equals((Object)comment_draft2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                final Post target_post = this.target_post;
                                                                                                                                                                                                                                                                                                                                                                                                                                                final Post target_post2 = event.target_post;
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (target_post == target_post2 || (target_post != null && target_post.equals((Object)target_post2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    final MLModel ml_model = this.ml_model;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    final MLModel ml_model2 = event.ml_model;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (ml_model == ml_model2 || (ml_model != null && ml_model.equals((Object)ml_model2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        final TopicMetadata topic_metadata = this.topic_metadata;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        final TopicMetadata topic_metadata2 = event.topic_metadata;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (topic_metadata == topic_metadata2 || (topic_metadata != null && topic_metadata.equals(topic_metadata2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ChatHomeFeedBoosting chat_home_feed_boosting = this.chat_home_feed_boosting;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ChatHomeFeedBoosting chat_home_feed_boosting2 = event.chat_home_feed_boosting;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (chat_home_feed_boosting == chat_home_feed_boosting2 || (chat_home_feed_boosting != null && chat_home_feed_boosting.equals((Object)chat_home_feed_boosting2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                final DomainBan domain_ban = this.domain_ban;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                final DomainBan domain_ban2 = event.domain_ban;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (domain_ban == domain_ban2 || (domain_ban != null && domain_ban.equals((Object)domain_ban2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final LegalExportRequest legal_export_request = this.legal_export_request;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final LegalExportRequest legal_export_request2 = event.legal_export_request;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (legal_export_request == legal_export_request2 || (legal_export_request != null && legal_export_request.equals((Object)legal_export_request2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final PostRequirement post_requirement = this.post_requirement;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final PostRequirement post_requirement2 = event.post_requirement;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (post_requirement == post_requirement2 || (post_requirement != null && post_requirement.equals((Object)post_requirement2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final TargetIP target_ip = this.target_ip;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final TargetIP target_ip2 = event.target_ip;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (target_ip == target_ip2 || (target_ip != null && target_ip.equals(target_ip2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final CrowdControl crowd_control = this.crowd_control;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final CrowdControl crowd_control2 = event.crowd_control;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (crowd_control == crowd_control2 || (crowd_control != null && crowd_control.equals((Object)crowd_control2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ReddarTicketContent reddar_ticket_content = this.reddar_ticket_content;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ReddarTicketContent reddar_ticket_content2 = event.reddar_ticket_content;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (reddar_ticket_content == reddar_ticket_content2 || (reddar_ticket_content != null && reddar_ticket_content.equals((Object)reddar_ticket_content2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final ScheduledPost scheduled_post = this.scheduled_post;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final ScheduledPost scheduled_post2 = event.scheduled_post;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (scheduled_post == scheduled_post2 || (scheduled_post != null && scheduled_post.equals((Object)scheduled_post2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Poll poll = this.poll;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Poll poll2 = event.poll;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (poll == poll2 || (poll != null && poll.equals((Object)poll2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final ReddarAudit reddar_audit = this.reddar_audit;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final ReddarAudit reddar_audit2 = event.reddar_audit;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (reddar_audit == reddar_audit2 || (reddar_audit != null && reddar_audit.equals((Object)reddar_audit2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ReddarAuditTicket reddar_audit_ticket = this.reddar_audit_ticket;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ReddarAuditTicket reddar_audit_ticket2 = event.reddar_audit_ticket;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (reddar_audit_ticket == reddar_audit_ticket2 || (reddar_audit_ticket != null && reddar_audit_ticket.equals((Object)reddar_audit_ticket2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Subreddit target_subreddit = this.target_subreddit;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Subreddit target_subreddit2 = event.target_subreddit;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (target_subreddit == target_subreddit2 || (target_subreddit != null && target_subreddit.equals(target_subreddit2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final SpamuraiAction spamurai_action = this.spamurai_action;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final SpamuraiAction spamurai_action2 = event.spamurai_action;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (spamurai_action == spamurai_action2 || (spamurai_action != null && spamurai_action.equals(spamurai_action2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final AdBrandSafety ad_brand_safety = this.ad_brand_safety;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final AdBrandSafety ad_brand_safety2 = event.ad_brand_safety;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (ad_brand_safety == ad_brand_safety2 || (ad_brand_safety != null && ad_brand_safety.equals((Object)ad_brand_safety2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final BulkActionJob bulk_action_job = this.bulk_action_job;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final BulkActionJob bulk_action_job2 = event.bulk_action_job;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (bulk_action_job == bulk_action_job2 || (bulk_action_job != null && bulk_action_job.equals((Object)bulk_action_job2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Comment target_comment = this.target_comment;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Comment target_comment2 = event.target_comment;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (target_comment == target_comment2 || (target_comment != null && target_comment.equals((Object)target_comment2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Message target_message = this.target_message;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Message target_message2 = event.target_message;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (target_message == target_message2 || (target_message != null && target_message.equals((Object)target_message2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final RerouteRule reroute_rule = this.reroute_rule;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final RerouteRule reroute_rule2 = event.reroute_rule;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (reroute_rule == reroute_rule2 || (reroute_rule != null && reroute_rule.equals((Object)reroute_rule2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ReddarQueue reddar_queue = this.reddar_queue;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ReddarQueue reddar_queue2 = event.reddar_queue;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (reddar_queue == reddar_queue2 || (reddar_queue != null && reddar_queue.equals((Object)reddar_queue2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final GeoBlock geo_block = this.geo_block;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final GeoBlock geo_block2 = event.geo_block;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (geo_block == geo_block2 || (geo_block != null && geo_block.equals((Object)geo_block2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Programmatic programmatic = this.programmatic;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Programmatic programmatic2 = event.programmatic;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (programmatic == programmatic2 || (programmatic != null && programmatic.equals((Object)programmatic2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final CSAIContentReport csai_content_report = this.csai_content_report;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final CSAIContentReport csai_content_report2 = event.csai_content_report;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (csai_content_report == csai_content_report2 || (csai_content_report != null && csai_content_report.equals((Object)csai_content_report2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Imposter imposter = this.imposter;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Imposter imposter2 = event.imposter;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (imposter == imposter2 || (imposter != null && imposter.equals((Object)imposter2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Broadcast broadcast = this.broadcast;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Broadcast broadcast2 = event.broadcast;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (broadcast == broadcast2 || (broadcast != null && broadcast.equals((Object)broadcast2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Survey survey = this.survey;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Survey survey2 = event.survey;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (survey == survey2 || (survey != null && survey.equals(survey2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Playback playback = this.playback;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Playback playback2 = event.playback;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (playback == playback2 || (playback != null && playback.equals((Object)playback2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final BotDetection bot_detection = this.bot_detection;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final BotDetection bot_detection2 = event.bot_detection;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (bot_detection == bot_detection2 || (bot_detection != null && bot_detection.equals((Object)bot_detection2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final CrowdSource crowd_source = this.crowd_source;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final CrowdSource crowd_source2 = event.crowd_source;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (crowd_source == crowd_source2 || (crowd_source != null && crowd_source.equals((Object)crowd_source2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Announcement announcement = this.announcement;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Announcement announcement2 = event.announcement;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (announcement == announcement2 || (announcement != null && announcement.equals((Object)announcement2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Purchase purchase = this.purchase;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Purchase purchase2 = event.purchase;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (purchase == purchase2 || (purchase != null && purchase.equals((Object)purchase2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Powerups powerups = this.powerups;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Powerups powerups2 = event.powerups;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (powerups == powerups2 || (powerups != null && powerups.equals((Object)powerups2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final AccountLabel account_label = this.account_label;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final AccountLabel account_label2 = event.account_label;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (account_label == account_label2 || (account_label != null && account_label.equals(account_label2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Inbox inbox = this.inbox;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Inbox inbox2 = event.inbox;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (inbox == inbox2 || (inbox != null && inbox.equals((Object)inbox2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Gallery gallery = this.gallery;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Gallery gallery2 = event.gallery;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (gallery == gallery2 || (gallery != null && gallery.equals((Object)gallery2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Trophy trophy = this.trophy;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Trophy trophy2 = event.trophy;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (trophy == trophy2 || (trophy != null && trophy.equals(trophy2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Feature feature = this.feature;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Feature feature2 = event.feature;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (feature == feature2 || (feature != null && feature.equals((Object)feature2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final AdminTeam admin_team = this.admin_team;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final AdminTeam admin_team2 = event.admin_team;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (admin_team == admin_team2 || (admin_team != null && admin_team.equals((Object)admin_team2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Mute mute = this.mute;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Mute mute2 = event.mute;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (mute == mute2 || (mute != null && mute.equals((Object)mute2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ContentTag content_tag = this.content_tag;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ContentTag content_tag2 = event.content_tag;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (content_tag == content_tag2 || (content_tag != null && content_tag.equals((Object)content_tag2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final RaterTag rater_tag = this.rater_tag;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final RaterTag rater_tag2 = event.rater_tag;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (rater_tag == rater_tag2 || (rater_tag != null && rater_tag.equals((Object)rater_tag2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final CreditCardForm credit_card_form = this.credit_card_form;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final CreditCardForm credit_card_form2 = event.credit_card_form;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (credit_card_form == credit_card_form2 || (credit_card_form != null && credit_card_form.equals((Object)credit_card_form2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final AdClick ad_click = this.ad_click;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final AdClick ad_click2 = event.ad_click;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (ad_click == ad_click2 || (ad_click != null && ad_click.equals((Object)ad_click2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Snoovatar snoovatar = this.snoovatar;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Snoovatar snoovatar2 = event.snoovatar;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (snoovatar == snoovatar2 || (snoovatar != null && snoovatar.equals(snoovatar2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Feed feed = this.feed;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Feed feed2 = event.feed;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (feed == feed2 || (feed != null && feed.equals((Object)feed2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ProgressModule progress_module = this.progress_module;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ProgressModule progress_module2 = event.progress_module;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (progress_module == progress_module2 || (progress_module != null && progress_module.equals((Object)progress_module2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final AppIcon app_icon = this.app_icon;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final AppIcon app_icon2 = event.app_icon;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (app_icon == app_icon2 || (app_icon != null && app_icon.equals((Object)app_icon2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final AdMetadata ad_metadata = this.ad_metadata;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final AdMetadata ad_metadata2 = event.ad_metadata;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (ad_metadata == ad_metadata2 || (ad_metadata != null && ad_metadata.equals((Object)ad_metadata2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Predictions predictions = this.predictions;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Predictions predictions2 = event.predictions;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (predictions == predictions2 || (predictions != null && predictions.equals((Object)predictions2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final NavigationSession navigation_session = this.navigation_session;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final NavigationSession navigation_session2 = event.navigation_session;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (navigation_session == navigation_session2 || (navigation_session != null && navigation_session.equals((Object)navigation_session2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final AFDSecond afd_second = this.afd_second;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final AFDSecond afd_second2 = event.afd_second;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (afd_second == afd_second2 || (afd_second != null && afd_second.equals(afd_second2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ATC atc = this.atc;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ATC atc2 = event.atc;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (atc == atc2 || (atc != null && atc.equals(atc2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final ViewStats view_stats = this.view_stats;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final ViewStats view_stats2 = event.view_stats;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (view_stats == view_stats2 || (view_stats != null && view_stats.equals(view_stats2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final RewardInfo reward_info = this.reward_info;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final RewardInfo reward_info2 = event.reward_info;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (reward_info == reward_info2 || (reward_info != null && reward_info.equals((Object)reward_info2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final LiveAudioRoom live_audio_room = this.live_audio_room;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final LiveAudioRoom live_audio_room2 = event.live_audio_room;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (live_audio_room == live_audio_room2 || (live_audio_room != null && live_audio_room.equals((Object)live_audio_room2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final LiveAudioRoomUser live_audio_user = this.live_audio_user;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final LiveAudioRoomUser live_audio_user2 = event.live_audio_user;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (live_audio_user == live_audio_user2 || (live_audio_user != null && live_audio_user.equals((Object)live_audio_user2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final ModmailConversation modmail_conversation = this.modmail_conversation;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final ModmailConversation modmail_conversation2 = event.modmail_conversation;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (modmail_conversation == modmail_conversation2 || (modmail_conversation != null && modmail_conversation.equals((Object)modmail_conversation2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ModmailMessage modmail_message = this.modmail_message;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ModmailMessage modmail_message2 = event.modmail_message;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (modmail_message == modmail_message2 || (modmail_message != null && modmail_message.equals((Object)modmail_message2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final BulkMessenger bulk_messenger = this.bulk_messenger;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final BulkMessenger bulk_messenger2 = event.bulk_messenger;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (bulk_messenger == bulk_messenger2 || (bulk_messenger != null && bulk_messenger.equals((Object)bulk_messenger2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Restrict restrict = this.restrict;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Restrict restrict2 = event.restrict;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (restrict == restrict2 || (restrict != null && restrict.equals((Object)restrict2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final AdPixel ad_pixel = this.ad_pixel;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final AdPixel ad_pixel2 = event.ad_pixel;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (ad_pixel == ad_pixel2 || (ad_pixel != null && ad_pixel.equals((Object)ad_pixel2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final VideoErrorReport video_error_report = this.video_error_report;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final VideoErrorReport video_error_report2 = event.video_error_report;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (video_error_report == video_error_report2 || (video_error_report != null && video_error_report.equals(video_error_report2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Taxonomy taxonomy = this.taxonomy;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Taxonomy taxonomy2 = event.taxonomy;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (taxonomy == taxonomy2 || (taxonomy != null && taxonomy.equals(taxonomy2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final SocialLink social_link = this.social_link;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final SocialLink social_link2 = event.social_link;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (social_link == social_link2 || (social_link != null && social_link.equals(social_link2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final AclCheck acl_check = this.acl_check;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final AclCheck acl_check2 = event.acl_check;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (acl_check == acl_check2 || (acl_check != null && acl_check.equals(acl_check2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final m40.a cookie_monitor = this.cookie_monitor;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final m40.a cookie_monitor2 = event.cookie_monitor;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (cookie_monitor == cookie_monitor2 || (cookie_monitor != null && cookie_monitor.equals((Object)cookie_monitor2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final CameraFeature camera_feature = this.camera_feature;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final CameraFeature camera_feature2 = event.camera_feature;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (camera_feature == camera_feature2 || (camera_feature != null && camera_feature.equals((Object)camera_feature2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final RegistrationForm registration_form = this.registration_form;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final RegistrationForm registration_form2 = event.registration_form;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (registration_form == registration_form2 || (registration_form != null && registration_form.equals((Object)registration_form2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Modqueue modqueue = this.modqueue;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Modqueue modqueue2 = event.modqueue;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (modqueue == modqueue2 || (modqueue != null && modqueue.equals((Object)modqueue2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ModqueueItem modqueue_item = this.modqueue_item;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ModqueueItem modqueue_item2 = event.modqueue_item;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (modqueue_item == modqueue_item2 || (modqueue_item != null && modqueue_item.equals((Object)modqueue_item2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final RecapCard recap_card = this.recap_card;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final RecapCard recap_card2 = event.recap_card;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (recap_card == recap_card2 || (recap_card != null && recap_card.equals((Object)recap_card2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ModqueueTrigger modqueue_trigger = this.modqueue_trigger;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ModqueueTrigger modqueue_trigger2 = event.modqueue_trigger;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (modqueue_trigger == modqueue_trigger2 || (modqueue_trigger != null && modqueue_trigger.equals((Object)modqueue_trigger2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final ModNote modnote = this.modnote;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final ModNote modnote2 = event.modnote;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (modnote == modnote2 || (modnote != null && modnote.equals((Object)modnote2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ScreenTrace screen_trace = this.screen_trace;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ScreenTrace screen_trace2 = event.screen_trace;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (screen_trace == screen_trace2 || (screen_trace != null && screen_trace.equals(screen_trace2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final RBLSurvey rbl_survey = this.rbl_survey;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final RBLSurvey rbl_survey2 = event.rbl_survey;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (rbl_survey == rbl_survey2 || (rbl_survey != null && rbl_survey.equals((Object)rbl_survey2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final SurveyResponse survey_response = this.survey_response;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final SurveyResponse survey_response2 = event.survey_response;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (survey_response == survey_response2 || (survey_response != null && survey_response.equals(survey_response2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final ReddarSettings reddar_settings = this.reddar_settings;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final ReddarSettings reddar_settings2 = event.reddar_settings;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (reddar_settings == reddar_settings2 || (reddar_settings != null && reddar_settings.equals((Object)reddar_settings2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final AdEntity ad_entity = this.ad_entity;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final AdEntity ad_entity2 = event.ad_entity;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (ad_entity == ad_entity2 || (ad_entity != null && ad_entity.equals((Object)ad_entity2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final ReactSource react_source = this.react_source;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final ReactSource react_source2 = event.react_source;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (react_source == react_source2 || (react_source != null && react_source.equals((Object)react_source2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ConversionsOnboarding conversions_onboarding = this.conversions_onboarding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final ConversionsOnboarding conversions_onboarding2 = event.conversions_onboarding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (conversions_onboarding == conversions_onboarding2 || (conversions_onboarding != null && conversions_onboarding.equals((Object)conversions_onboarding2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final TheaterMode theater_mode = this.theater_mode;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final TheaterMode theater_mode2 = event.theater_mode;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (theater_mode == theater_mode2 || (theater_mode != null && theater_mode.equals(theater_mode2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Chain chain = this.chain;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Chain chain2 = event.chain;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (chain == chain2 || (chain != null && chain.equals((Object)chain2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Contract contract = this.contract;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Contract contract2 = event.contract;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (contract == contract2 || (contract != null && contract.equals((Object)contract2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Token token = this.token;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Token token2 = event.token;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (token == token2 || (token != null && token.equals(token2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Block block = this.block;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Block block2 = event.block;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (block == block2 || (block != null && block.equals((Object)block2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Transaction transaction = this.transaction;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Transaction transaction2 = event.transaction;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (transaction == transaction2 || (transaction != null && transaction.equals(transaction2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Transfer transfer = this.transfer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Transfer transfer2 = event.transfer;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (transfer == transfer2 || (transfer != null && transfer.equals(transfer2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Marketplace marketplace = this.marketplace;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Marketplace marketplace2 = event.marketplace;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (marketplace == marketplace2 || (marketplace != null && marketplace.equals((Object)marketplace2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Automoderator automoderator = this.automoderator;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Automoderator automoderator2 = event.automoderator;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (automoderator == automoderator2 || (automoderator != null && automoderator.equals((Object)automoderator2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final AccessAudit access_audit = this.access_audit;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final AccessAudit access_audit2 = event.access_audit;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (access_audit == access_audit2 || (access_audit != null && access_audit.equals(access_audit2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Indexing indexing = this.indexing;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final Indexing indexing2 = event.indexing;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (indexing == indexing2 || (indexing != null && indexing.equals((Object)indexing2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final AdPreview ad_preview = this.ad_preview;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final AdPreview ad_preview2 = event.ad_preview;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (ad_preview == ad_preview2 || (ad_preview != null && ad_preview.equals((Object)ad_preview2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final UserDeactivationInfo user_deactivation_info = this.user_deactivation_info;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final UserDeactivationInfo user_deactivation_info2 = event.user_deactivation_info;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (user_deactivation_info == user_deactivation_info2 || (user_deactivation_info != null && user_deactivation_info.equals(user_deactivation_info2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ExperimentsPlatform experiments_platform = this.experiments_platform;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ExperimentsPlatform experiments_platform2 = event.experiments_platform;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (experiments_platform == experiments_platform2 || (experiments_platform != null && experiments_platform.equals((Object)experiments_platform2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final CommentsLoad comments_load = this.comments_load;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final CommentsLoad comments_load2 = event.comments_load;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (comments_load == comments_load2 || (comments_load != null && comments_load.equals((Object)comments_load2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Geo geo = this.geo;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final Geo geo2 = event.geo;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (geo == geo2 || (geo != null && geo.equals((Object)geo2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final String user_legacy_id = this.user_legacy_id;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final String user_legacy_id2 = event.user_legacy_id;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (user_legacy_id == user_legacy_id2 || (user_legacy_id != null && user_legacy_id.equals(user_legacy_id2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ContentMetadata content_metadata = this.content_metadata;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final ContentMetadata content_metadata2 = event.content_metadata;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (content_metadata == content_metadata2 || (content_metadata != null && content_metadata.equals((Object)content_metadata2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final UrlParsed url_parsed = this.url_parsed;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final UrlParsed url_parsed2 = event.url_parsed;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (url_parsed == url_parsed2 || (url_parsed != null && url_parsed.equals(url_parsed2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final LinkSharing link_sharing = this.link_sharing;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final LinkSharing link_sharing2 = event.link_sharing;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (link_sharing == link_sharing2 || (link_sharing != null && link_sharing.equals((Object)link_sharing2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Long create_request_timestamp = this.create_request_timestamp;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final Long create_request_timestamp2 = event.create_request_timestamp;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (create_request_timestamp == create_request_timestamp2 || (create_request_timestamp != null && create_request_timestamp.equals(create_request_timestamp2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Inferred inferred = this.inferred;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final Inferred inferred2 = event.inferred;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (inferred == inferred2 || (inferred != null && inferred.equals((Object)inferred2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final String event_hmac_key = this.event_hmac_key;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final String event_hmac_key2 = event.event_hmac_key;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (event_hmac_key == event_hmac_key2 || (event_hmac_key != null && event_hmac_key.equals(event_hmac_key2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final String batch_load_id = this.batch_load_id;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    final String batch_load_id2 = event.batch_load_id;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (batch_load_id == batch_load_id2 || (batch_load_id != null && batch_load_id.equals(batch_load_id2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final IPSplitting ip_splitting = this.ip_splitting;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        final IPSplitting ip_splitting2 = event.ip_splitting;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (ip_splitting == ip_splitting2 || (ip_splitting != null && ip_splitting.equals((Object)ip_splitting2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final String collector = this.collector;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            final String collector2 = event.collector;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (collector == collector2 || (collector != null && collector.equals(collector2))) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final String collector_consistency_checksum = this.collector_consistency_checksum;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                final String collector_consistency_checksum2 = event.collector_consistency_checksum;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                boolean b2 = b;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (collector_consistency_checksum == collector_consistency_checksum2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return b2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (collector_consistency_checksum != null && collector_consistency_checksum.equals(collector_consistency_checksum2)) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    b2 = b;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return b2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/reddit/data/events/models/Event.source:Ljava/lang/String;
        //     4: invokevirtual   java/lang/String.hashCode:()I
        //     7: istore_1       
        //     8: aload_0        
        //     9: getfield        com/reddit/data/events/models/Event.action:Ljava/lang/String;
        //    12: invokevirtual   java/lang/String.hashCode:()I
        //    15: istore_2       
        //    16: aload_0        
        //    17: getfield        com/reddit/data/events/models/Event.noun:Ljava/lang/String;
        //    20: invokevirtual   java/lang/String.hashCode:()I
        //    23: istore_3       
        //    24: aload_0        
        //    25: getfield        com/reddit/data/events/models/Event.endpoint_timestamp:Ljava/lang/Long;
        //    28: astore          4
        //    30: iconst_0       
        //    31: istore          5
        //    33: aload           4
        //    35: ifnonnull       44
        //    38: iconst_0       
        //    39: istore          6
        //    41: goto            51
        //    44: aload           4
        //    46: invokevirtual   java/lang/Long.hashCode:()I
        //    49: istore          6
        //    51: aload_0        
        //    52: getfield        com/reddit/data/events/models/Event.client_timestamp:Ljava/lang/Long;
        //    55: invokevirtual   java/lang/Long.hashCode:()I
        //    58: istore          7
        //    60: aload_0        
        //    61: getfield        com/reddit/data/events/models/Event.uuid:Ljava/lang/String;
        //    64: invokevirtual   java/lang/String.hashCode:()I
        //    67: istore          8
        //    69: aload_0        
        //    70: getfield        com/reddit/data/events/models/Event.utc_offset:Ljava/lang/Double;
        //    73: astore          4
        //    75: aload           4
        //    77: ifnonnull       86
        //    80: iconst_0       
        //    81: istore          9
        //    83: goto            93
        //    86: aload           4
        //    88: invokevirtual   java/lang/Double.hashCode:()I
        //    91: istore          9
        //    93: aload_0        
        //    94: getfield        com/reddit/data/events/models/Event.correlation_id:Ljava/lang/String;
        //    97: astore          4
        //    99: aload           4
        //   101: ifnonnull       110
        //   104: iconst_0       
        //   105: istore          10
        //   107: goto            117
        //   110: aload           4
        //   112: invokevirtual   java/lang/String.hashCode:()I
        //   115: istore          10
        //   117: aload_0        
        //   118: getfield        com/reddit/data/events/models/Event.screenview_id:Ljava/lang/String;
        //   121: astore          4
        //   123: aload           4
        //   125: ifnonnull       134
        //   128: iconst_0       
        //   129: istore          11
        //   131: goto            141
        //   134: aload           4
        //   136: invokevirtual   java/lang/String.hashCode:()I
        //   139: istore          11
        //   141: aload_0        
        //   142: getfield        com/reddit/data/events/models/Event.post:Lcom/reddit/data/events/models/components/Post;
        //   145: astore          4
        //   147: aload           4
        //   149: ifnonnull       158
        //   152: iconst_0       
        //   153: istore          12
        //   155: goto            165
        //   158: aload           4
        //   160: invokevirtual   com/reddit/data/events/models/components/Post.hashCode:()I
        //   163: istore          12
        //   165: aload_0        
        //   166: getfield        com/reddit/data/events/models/Event.listing:Lcom/reddit/data/events/models/components/Listing;
        //   169: astore          4
        //   171: aload           4
        //   173: ifnonnull       182
        //   176: iconst_0       
        //   177: istore          13
        //   179: goto            189
        //   182: aload           4
        //   184: invokevirtual   com/reddit/data/events/models/components/Listing.hashCode:()I
        //   187: istore          13
        //   189: aload_0        
        //   190: getfield        com/reddit/data/events/models/Event.comment:Lcom/reddit/data/events/models/components/Comment;
        //   193: astore          4
        //   195: aload           4
        //   197: ifnonnull       206
        //   200: iconst_0       
        //   201: istore          14
        //   203: goto            213
        //   206: aload           4
        //   208: invokevirtual   com/reddit/data/events/models/components/Comment.hashCode:()I
        //   211: istore          14
        //   213: aload_0        
        //   214: getfield        com/reddit/data/events/models/Event.notification:Lcom/reddit/data/events/models/components/Notification;
        //   217: astore          4
        //   219: aload           4
        //   221: ifnonnull       230
        //   224: iconst_0       
        //   225: istore          15
        //   227: goto            237
        //   230: aload           4
        //   232: invokevirtual   com/reddit/data/events/models/components/Notification.hashCode:()I
        //   235: istore          15
        //   237: aload_0        
        //   238: getfield        com/reddit/data/events/models/Event.oauth:Lcom/reddit/data/events/models/components/Oauth;
        //   241: astore          4
        //   243: aload           4
        //   245: ifnonnull       254
        //   248: iconst_0       
        //   249: istore          16
        //   251: goto            261
        //   254: aload           4
        //   256: invokevirtual   com/reddit/data/events/models/components/Oauth.hashCode:()I
        //   259: istore          16
        //   261: aload_0        
        //   262: getfield        com/reddit/data/events/models/Event.screen:Lcom/reddit/data/events/models/components/Screen;
        //   265: astore          4
        //   267: aload           4
        //   269: ifnonnull       278
        //   272: iconst_0       
        //   273: istore          17
        //   275: goto            285
        //   278: aload           4
        //   280: invokevirtual   com/reddit/data/events/models/components/Screen.hashCode:()I
        //   283: istore          17
        //   285: aload_0        
        //   286: getfield        com/reddit/data/events/models/Event.app:Lcom/reddit/data/events/models/components/App;
        //   289: astore          4
        //   291: aload           4
        //   293: ifnonnull       302
        //   296: iconst_0       
        //   297: istore          18
        //   299: goto            309
        //   302: aload           4
        //   304: invokevirtual   com/reddit/data/events/models/components/App.hashCode:()I
        //   307: istore          18
        //   309: aload_0        
        //   310: getfield        com/reddit/data/events/models/Event.platform:Lcom/reddit/data/events/models/components/Platform;
        //   313: astore          4
        //   315: aload           4
        //   317: ifnonnull       326
        //   320: iconst_0       
        //   321: istore          19
        //   323: goto            333
        //   326: aload           4
        //   328: invokevirtual   com/reddit/data/events/models/components/Platform.hashCode:()I
        //   331: istore          19
        //   333: aload_0        
        //   334: getfield        com/reddit/data/events/models/Event.request:Lcom/reddit/data/events/models/components/Request;
        //   337: astore          4
        //   339: aload           4
        //   341: ifnonnull       350
        //   344: iconst_0       
        //   345: istore          20
        //   347: goto            357
        //   350: aload           4
        //   352: invokevirtual   com/reddit/data/events/models/components/Request.hashCode:()I
        //   355: istore          20
        //   357: aload_0        
        //   358: getfield        com/reddit/data/events/models/Event.referrer:Lcom/reddit/data/events/models/components/Referrer;
        //   361: astore          4
        //   363: aload           4
        //   365: ifnonnull       374
        //   368: iconst_0       
        //   369: istore          21
        //   371: goto            381
        //   374: aload           4
        //   376: invokevirtual   com/reddit/data/events/models/components/Referrer.hashCode:()I
        //   379: istore          21
        //   381: aload_0        
        //   382: getfield        com/reddit/data/events/models/Event.dom_timer:Lcom/reddit/data/events/models/components/DOMTimers;
        //   385: astore          4
        //   387: aload           4
        //   389: ifnonnull       398
        //   392: iconst_0       
        //   393: istore          22
        //   395: goto            405
        //   398: aload           4
        //   400: invokevirtual   com/reddit/data/events/models/components/DOMTimers.hashCode:()I
        //   403: istore          22
        //   405: aload_0        
        //   406: getfield        com/reddit/data/events/models/Event.user:Lcom/reddit/data/events/models/components/User;
        //   409: astore          4
        //   411: aload           4
        //   413: ifnonnull       422
        //   416: iconst_0       
        //   417: istore          23
        //   419: goto            429
        //   422: aload           4
        //   424: invokevirtual   com/reddit/data/events/models/components/User.hashCode:()I
        //   427: istore          23
        //   429: aload_0        
        //   430: getfield        com/reddit/data/events/models/Event.user_preferences:Lcom/reddit/data/events/models/components/UserPreferences;
        //   433: astore          4
        //   435: aload           4
        //   437: ifnonnull       446
        //   440: iconst_0       
        //   441: istore          24
        //   443: goto            453
        //   446: aload           4
        //   448: invokevirtual   com/reddit/data/events/models/components/UserPreferences.hashCode:()I
        //   451: istore          24
        //   453: aload_0        
        //   454: getfield        com/reddit/data/events/models/Event.subreddit:Lcom/reddit/data/events/models/components/Subreddit;
        //   457: astore          4
        //   459: aload           4
        //   461: ifnonnull       470
        //   464: iconst_0       
        //   465: istore          25
        //   467: goto            477
        //   470: aload           4
        //   472: invokevirtual   com/reddit/data/events/models/components/Subreddit.hashCode:()I
        //   475: istore          25
        //   477: aload_0        
        //   478: getfield        com/reddit/data/events/models/Event.session:Lcom/reddit/data/events/models/components/Session;
        //   481: astore          4
        //   483: aload           4
        //   485: ifnonnull       494
        //   488: iconst_0       
        //   489: istore          26
        //   491: goto            501
        //   494: aload           4
        //   496: invokevirtual   com/reddit/data/events/models/components/Session.hashCode:()I
        //   499: istore          26
        //   501: aload_0        
        //   502: getfield        com/reddit/data/events/models/Event.action_info:Lcom/reddit/data/events/models/components/ActionInfo;
        //   505: astore          4
        //   507: aload           4
        //   509: ifnonnull       518
        //   512: iconst_0       
        //   513: istore          27
        //   515: goto            525
        //   518: aload           4
        //   520: invokevirtual   com/reddit/data/events/models/components/ActionInfo.hashCode:()I
        //   523: istore          27
        //   525: aload_0        
        //   526: getfield        com/reddit/data/events/models/Event.expand:Lcom/reddit/data/events/models/components/Expand;
        //   529: astore          4
        //   531: aload           4
        //   533: ifnonnull       542
        //   536: iconst_0       
        //   537: istore          28
        //   539: goto            549
        //   542: aload           4
        //   544: invokevirtual   com/reddit/data/events/models/components/Expand.hashCode:()I
        //   547: istore          28
        //   549: aload_0        
        //   550: getfield        com/reddit/data/events/models/Event.media:Lcom/reddit/data/events/models/components/Media;
        //   553: astore          4
        //   555: aload           4
        //   557: ifnonnull       566
        //   560: iconst_0       
        //   561: istore          29
        //   563: goto            573
        //   566: aload           4
        //   568: invokevirtual   com/reddit/data/events/models/components/Media.hashCode:()I
        //   571: istore          29
        //   573: aload_0        
        //   574: getfield        com/reddit/data/events/models/Event.chat:Lcom/reddit/data/events/models/components/Chat;
        //   577: astore          4
        //   579: aload           4
        //   581: ifnonnull       590
        //   584: iconst_0       
        //   585: istore          30
        //   587: goto            597
        //   590: aload           4
        //   592: invokevirtual   com/reddit/data/events/models/components/Chat.hashCode:()I
        //   595: istore          30
        //   597: aload_0        
        //   598: getfield        com/reddit/data/events/models/Event.post_composer:Lcom/reddit/data/events/models/components/PostComposer;
        //   601: astore          4
        //   603: aload           4
        //   605: ifnonnull       614
        //   608: iconst_0       
        //   609: istore          31
        //   611: goto            621
        //   614: aload           4
        //   616: invokevirtual   com/reddit/data/events/models/components/PostComposer.hashCode:()I
        //   619: istore          31
        //   621: aload_0        
        //   622: getfield        com/reddit/data/events/models/Event.widget:Lcom/reddit/data/events/models/components/Widget;
        //   625: astore          4
        //   627: aload           4
        //   629: ifnonnull       638
        //   632: iconst_0       
        //   633: istore          32
        //   635: goto            645
        //   638: aload           4
        //   640: invokevirtual   com/reddit/data/events/models/components/Widget.hashCode:()I
        //   643: istore          32
        //   645: aload_0        
        //   646: getfield        com/reddit/data/events/models/Event.profile:Lcom/reddit/data/events/models/components/Profile;
        //   649: astore          4
        //   651: aload           4
        //   653: ifnonnull       662
        //   656: iconst_0       
        //   657: istore          33
        //   659: goto            669
        //   662: aload           4
        //   664: invokevirtual   com/reddit/data/events/models/components/Profile.hashCode:()I
        //   667: istore          33
        //   669: aload_0        
        //   670: getfield        com/reddit/data/events/models/Event.onboarding:Lcom/reddit/data/events/models/components/Onboarding;
        //   673: astore          4
        //   675: aload           4
        //   677: ifnonnull       686
        //   680: iconst_0       
        //   681: istore          34
        //   683: goto            693
        //   686: aload           4
        //   688: invokevirtual   com/reddit/data/events/models/components/Onboarding.hashCode:()I
        //   691: istore          34
        //   693: aload_0        
        //   694: getfield        com/reddit/data/events/models/Event.timer:Lcom/reddit/data/events/models/components/Timer;
        //   697: astore          4
        //   699: aload           4
        //   701: ifnonnull       710
        //   704: iconst_0       
        //   705: istore          35
        //   707: goto            717
        //   710: aload           4
        //   712: invokevirtual   com/reddit/data/events/models/components/Timer.hashCode:()I
        //   715: istore          35
        //   717: aload_0        
        //   718: getfield        com/reddit/data/events/models/Event.tfa:Lcom/reddit/data/events/models/components/TwoFactorAuth;
        //   721: astore          4
        //   723: aload           4
        //   725: ifnonnull       734
        //   728: iconst_0       
        //   729: istore          36
        //   731: goto            741
        //   734: aload           4
        //   736: invokevirtual   com/reddit/data/events/models/components/TwoFactorAuth.hashCode:()I
        //   739: istore          36
        //   741: aload_0        
        //   742: getfield        com/reddit/data/events/models/Event.api_response:Lcom/reddit/data/events/models/components/ApiResponse;
        //   745: astore          4
        //   747: aload           4
        //   749: ifnonnull       758
        //   752: iconst_0       
        //   753: istore          37
        //   755: goto            765
        //   758: aload           4
        //   760: invokevirtual   com/reddit/data/events/models/components/ApiResponse.hashCode:()I
        //   763: istore          37
        //   765: aload_0        
        //   766: getfield        com/reddit/data/events/models/Event.api:Lcom/reddit/data/events/models/components/Api;
        //   769: astore          4
        //   771: aload           4
        //   773: ifnonnull       782
        //   776: iconst_0       
        //   777: istore          38
        //   779: goto            789
        //   782: aload           4
        //   784: invokevirtual   com/reddit/data/events/models/components/Api.hashCode:()I
        //   787: istore          38
        //   789: aload_0        
        //   790: getfield        com/reddit/data/events/models/Event.discovery_unit:Lcom/reddit/data/events/models/components/DiscoveryUnit;
        //   793: astore          4
        //   795: aload           4
        //   797: ifnonnull       806
        //   800: iconst_0       
        //   801: istore          39
        //   803: goto            813
        //   806: aload           4
        //   808: invokevirtual   com/reddit/data/events/models/components/DiscoveryUnit.hashCode:()I
        //   811: istore          39
        //   813: aload_0        
        //   814: getfield        com/reddit/data/events/models/Event.experiment:Lcom/reddit/data/events/models/components/Experiment;
        //   817: astore          4
        //   819: aload           4
        //   821: ifnonnull       830
        //   824: iconst_0       
        //   825: istore          40
        //   827: goto            837
        //   830: aload           4
        //   832: invokevirtual   com/reddit/data/events/models/components/Experiment.hashCode:()I
        //   835: istore          40
        //   837: aload_0        
        //   838: getfield        com/reddit/data/events/models/Event.share:Lcom/reddit/data/events/models/components/Share;
        //   841: astore          4
        //   843: aload           4
        //   845: ifnonnull       854
        //   848: iconst_0       
        //   849: istore          41
        //   851: goto            861
        //   854: aload           4
        //   856: invokevirtual   com/reddit/data/events/models/components/Share.hashCode:()I
        //   859: istore          41
        //   861: aload_0        
        //   862: getfield        com/reddit/data/events/models/Event.user_subreddit:Lcom/reddit/data/events/models/components/UserSubreddit;
        //   865: astore          4
        //   867: aload           4
        //   869: ifnonnull       878
        //   872: iconst_0       
        //   873: istore          42
        //   875: goto            885
        //   878: aload           4
        //   880: invokevirtual   com/reddit/data/events/models/components/UserSubreddit.hashCode:()I
        //   883: istore          42
        //   885: aload_0        
        //   886: getfield        com/reddit/data/events/models/Event.notification_request:Lcom/reddit/data/events/models/components/NotificationRequest;
        //   889: astore          4
        //   891: aload           4
        //   893: ifnonnull       902
        //   896: iconst_0       
        //   897: istore          43
        //   899: goto            909
        //   902: aload           4
        //   904: invokevirtual   com/reddit/data/events/models/components/NotificationRequest.hashCode:()I
        //   907: istore          43
        //   909: aload_0        
        //   910: getfield        com/reddit/data/events/models/Event.search:Lcom/reddit/data/events/models/components/Search;
        //   913: astore          4
        //   915: aload           4
        //   917: ifnonnull       926
        //   920: iconst_0       
        //   921: istore          44
        //   923: goto            933
        //   926: aload           4
        //   928: invokevirtual   com/reddit/data/events/models/components/Search.hashCode:()I
        //   931: istore          44
        //   933: aload_0        
        //   934: getfield        com/reddit/data/events/models/Event.message:Lcom/reddit/data/events/models/components/Message;
        //   937: astore          4
        //   939: aload           4
        //   941: ifnonnull       950
        //   944: iconst_0       
        //   945: istore          45
        //   947: goto            957
        //   950: aload           4
        //   952: invokevirtual   com/reddit/data/events/models/components/Message.hashCode:()I
        //   955: istore          45
        //   957: aload_0        
        //   958: getfield        com/reddit/data/events/models/Event.admin:Lcom/reddit/data/events/models/components/Admin;
        //   961: astore          4
        //   963: aload           4
        //   965: ifnonnull       974
        //   968: iconst_0       
        //   969: istore          46
        //   971: goto            981
        //   974: aload           4
        //   976: invokevirtual   com/reddit/data/events/models/components/Admin.hashCode:()I
        //   979: istore          46
        //   981: aload_0        
        //   982: getfield        com/reddit/data/events/models/Event.ticket:Lcom/reddit/data/events/models/components/Ticket;
        //   985: astore          4
        //   987: aload           4
        //   989: ifnonnull       998
        //   992: iconst_0       
        //   993: istore          47
        //   995: goto            1005
        //   998: aload           4
        //  1000: invokevirtual   com/reddit/data/events/models/components/Ticket.hashCode:()I
        //  1003: istore          47
        //  1005: aload_0        
        //  1006: getfield        com/reddit/data/events/models/Event.mailroom_request:Lcom/reddit/data/events/models/components/MailroomRequest;
        //  1009: astore          4
        //  1011: aload           4
        //  1013: ifnonnull       1022
        //  1016: iconst_0       
        //  1017: istore          48
        //  1019: goto            1029
        //  1022: aload           4
        //  1024: invokevirtual   com/reddit/data/events/models/components/MailroomRequest.hashCode:()I
        //  1027: istore          48
        //  1029: aload_0        
        //  1030: getfield        com/reddit/data/events/models/Event.comment_composer:Lcom/reddit/data/events/models/components/CommentComposer;
        //  1033: astore          4
        //  1035: aload           4
        //  1037: ifnonnull       1046
        //  1040: iconst_0       
        //  1041: istore          49
        //  1043: goto            1053
        //  1046: aload           4
        //  1048: invokevirtual   com/reddit/data/events/models/components/CommentComposer.hashCode:()I
        //  1051: istore          49
        //  1053: aload_0        
        //  1054: getfield        com/reddit/data/events/models/Event.gold_purchase:Lcom/reddit/data/events/models/components/GoldPurchase;
        //  1057: astore          4
        //  1059: aload           4
        //  1061: ifnonnull       1070
        //  1064: iconst_0       
        //  1065: istore          50
        //  1067: goto            1077
        //  1070: aload           4
        //  1072: invokevirtual   com/reddit/data/events/models/components/GoldPurchase.hashCode:()I
        //  1075: istore          50
        //  1077: aload_0        
        //  1078: getfield        com/reddit/data/events/models/Event.payment:Lcom/reddit/data/events/models/components/Payment;
        //  1081: astore          4
        //  1083: aload           4
        //  1085: ifnonnull       1094
        //  1088: iconst_0       
        //  1089: istore          51
        //  1091: goto            1101
        //  1094: aload           4
        //  1096: invokevirtual   com/reddit/data/events/models/components/Payment.hashCode:()I
        //  1099: istore          51
        //  1101: aload_0        
        //  1102: getfield        com/reddit/data/events/models/Event.news:Lcom/reddit/data/events/models/components/News;
        //  1105: astore          4
        //  1107: aload           4
        //  1109: ifnonnull       1118
        //  1112: iconst_0       
        //  1113: istore          52
        //  1115: goto            1125
        //  1118: aload           4
        //  1120: invokevirtual   com/reddit/data/events/models/components/News.hashCode:()I
        //  1123: istore          52
        //  1125: aload_0        
        //  1126: getfield        com/reddit/data/events/models/Event.outbound:Lcom/reddit/data/events/models/components/Outbound;
        //  1129: astore          4
        //  1131: aload           4
        //  1133: ifnonnull       1142
        //  1136: iconst_0       
        //  1137: istore          53
        //  1139: goto            1149
        //  1142: aload           4
        //  1144: invokevirtual   com/reddit/data/events/models/components/Outbound.hashCode:()I
        //  1147: istore          53
        //  1149: aload_0        
        //  1150: getfield        com/reddit/data/events/models/Event.click_test:Lcom/reddit/data/events/models/components/ClickTest;
        //  1153: astore          4
        //  1155: aload           4
        //  1157: ifnonnull       1166
        //  1160: iconst_0       
        //  1161: istore          54
        //  1163: goto            1173
        //  1166: aload           4
        //  1168: invokevirtual   com/reddit/data/events/models/components/ClickTest.hashCode:()I
        //  1171: istore          54
        //  1173: aload_0        
        //  1174: getfield        com/reddit/data/events/models/Event.carousel:Lcom/reddit/data/events/models/components/Carousel;
        //  1177: astore          4
        //  1179: aload           4
        //  1181: ifnonnull       1190
        //  1184: iconst_0       
        //  1185: istore          55
        //  1187: goto            1197
        //  1190: aload           4
        //  1192: invokevirtual   com/reddit/data/events/models/components/Carousel.hashCode:()I
        //  1195: istore          55
        //  1197: aload_0        
        //  1198: getfield        com/reddit/data/events/models/Event.adblock:Lcom/reddit/data/events/models/components/Adblock;
        //  1201: astore          4
        //  1203: aload           4
        //  1205: ifnonnull       1214
        //  1208: iconst_0       
        //  1209: istore          56
        //  1211: goto            1221
        //  1214: aload           4
        //  1216: invokevirtual   com/reddit/data/events/models/components/Adblock.hashCode:()I
        //  1219: istore          56
        //  1221: aload_0        
        //  1222: getfield        com/reddit/data/events/models/Event.email:Lcom/reddit/data/events/models/components/Email;
        //  1225: astore          4
        //  1227: aload           4
        //  1229: ifnonnull       1238
        //  1232: iconst_0       
        //  1233: istore          57
        //  1235: goto            1245
        //  1238: aload           4
        //  1240: invokevirtual   com/reddit/data/events/models/components/Email.hashCode:()I
        //  1243: istore          57
        //  1245: aload_0        
        //  1246: getfield        com/reddit/data/events/models/Event.metaflair:Lcom/reddit/data/events/models/components/MetaFlair;
        //  1249: astore          4
        //  1251: aload           4
        //  1253: ifnonnull       1262
        //  1256: iconst_0       
        //  1257: istore          58
        //  1259: goto            1269
        //  1262: aload           4
        //  1264: invokevirtual   com/reddit/data/events/models/components/MetaFlair.hashCode:()I
        //  1267: istore          58
        //  1269: aload_0        
        //  1270: getfield        com/reddit/data/events/models/Event.post_draft:Lcom/reddit/data/events/models/components/PostDraft;
        //  1273: astore          4
        //  1275: aload           4
        //  1277: ifnonnull       1286
        //  1280: iconst_0       
        //  1281: istore          59
        //  1283: goto            1293
        //  1286: aload           4
        //  1288: invokevirtual   com/reddit/data/events/models/components/PostDraft.hashCode:()I
        //  1291: istore          59
        //  1293: aload_0        
        //  1294: getfield        com/reddit/data/events/models/Event.setting:Lcom/reddit/data/events/models/components/Setting;
        //  1297: astore          4
        //  1299: aload           4
        //  1301: ifnonnull       1310
        //  1304: iconst_0       
        //  1305: istore          60
        //  1307: goto            1317
        //  1310: aload           4
        //  1312: invokevirtual   com/reddit/data/events/models/components/Setting.hashCode:()I
        //  1315: istore          60
        //  1317: aload_0        
        //  1318: getfield        com/reddit/data/events/models/Event.visibility:Lcom/reddit/data/events/models/components/Visibility;
        //  1321: astore          4
        //  1323: aload           4
        //  1325: ifnonnull       1334
        //  1328: iconst_0       
        //  1329: istore          61
        //  1331: goto            1341
        //  1334: aload           4
        //  1336: invokevirtual   com/reddit/data/events/models/components/Visibility.hashCode:()I
        //  1339: istore          61
        //  1341: aload_0        
        //  1342: getfield        com/reddit/data/events/models/Event.webhook:Lcom/reddit/data/events/models/components/Webhook;
        //  1345: astore          4
        //  1347: aload           4
        //  1349: ifnonnull       1358
        //  1352: iconst_0       
        //  1353: istore          62
        //  1355: goto            1365
        //  1358: aload           4
        //  1360: invokevirtual   com/reddit/data/events/models/components/Webhook.hashCode:()I
        //  1363: istore          62
        //  1365: aload_0        
        //  1366: getfield        com/reddit/data/events/models/Event.relevance_model:Lcom/reddit/data/events/models/components/RelevanceModel;
        //  1369: astore          4
        //  1371: aload           4
        //  1373: ifnonnull       1382
        //  1376: iconst_0       
        //  1377: istore          63
        //  1379: goto            1389
        //  1382: aload           4
        //  1384: invokevirtual   com/reddit/data/events/models/components/RelevanceModel.hashCode:()I
        //  1387: istore          63
        //  1389: aload_0        
        //  1390: getfield        com/reddit/data/events/models/Event.meta_search:Lcom/reddit/data/events/models/components/MetaSearch;
        //  1393: astore          4
        //  1395: aload           4
        //  1397: ifnonnull       1406
        //  1400: iconst_0       
        //  1401: istore          64
        //  1403: goto            1413
        //  1406: aload           4
        //  1408: invokevirtual   com/reddit/data/events/models/components/MetaSearch.hashCode:()I
        //  1411: istore          64
        //  1413: aload_0        
        //  1414: getfield        com/reddit/data/events/models/Event.post_flair:Lcom/reddit/data/events/models/components/PostFlair;
        //  1417: astore          4
        //  1419: aload           4
        //  1421: ifnonnull       1430
        //  1424: iconst_0       
        //  1425: istore          65
        //  1427: goto            1437
        //  1430: aload           4
        //  1432: invokevirtual   com/reddit/data/events/models/components/PostFlair.hashCode:()I
        //  1435: istore          65
        //  1437: aload_0        
        //  1438: getfield        com/reddit/data/events/models/Event.admin_action:Lcom/reddit/data/events/models/components/AdminAction;
        //  1441: astore          4
        //  1443: aload           4
        //  1445: ifnonnull       1454
        //  1448: iconst_0       
        //  1449: istore          66
        //  1451: goto            1461
        //  1454: aload           4
        //  1456: invokevirtual   com/reddit/data/events/models/components/AdminAction.hashCode:()I
        //  1459: istore          66
        //  1461: aload_0        
        //  1462: getfield        com/reddit/data/events/models/Event.zipkin:Lcom/reddit/data/events/models/components/Zipkin;
        //  1465: astore          4
        //  1467: aload           4
        //  1469: ifnonnull       1478
        //  1472: iconst_0       
        //  1473: istore          67
        //  1475: goto            1485
        //  1478: aload           4
        //  1480: invokevirtual   com/reddit/data/events/models/components/Zipkin.hashCode:()I
        //  1483: istore          67
        //  1485: aload_0        
        //  1486: getfield        com/reddit/data/events/models/Event.edit:Lcom/reddit/data/events/models/components/Edit;
        //  1489: astore          4
        //  1491: aload           4
        //  1493: ifnonnull       1502
        //  1496: iconst_0       
        //  1497: istore          68
        //  1499: goto            1509
        //  1502: aload           4
        //  1504: invokevirtual   com/reddit/data/events/models/components/Edit.hashCode:()I
        //  1507: istore          68
        //  1509: aload_0        
        //  1510: getfield        com/reddit/data/events/models/Event.post_event:Lcom/reddit/data/events/models/components/PostEvent;
        //  1513: astore          4
        //  1515: aload           4
        //  1517: ifnonnull       1526
        //  1520: iconst_0       
        //  1521: istore          69
        //  1523: goto            1533
        //  1526: aload           4
        //  1528: invokevirtual   com/reddit/data/events/models/components/PostEvent.hashCode:()I
        //  1531: istore          69
        //  1533: aload_0        
        //  1534: getfield        com/reddit/data/events/models/Event.post_collection:Lcom/reddit/data/events/models/components/PostCollection;
        //  1537: astore          4
        //  1539: aload           4
        //  1541: ifnonnull       1550
        //  1544: iconst_0       
        //  1545: istore          70
        //  1547: goto            1557
        //  1550: aload           4
        //  1552: invokevirtual   com/reddit/data/events/models/components/PostCollection.hashCode:()I
        //  1555: istore          70
        //  1557: aload_0        
        //  1558: getfield        com/reddit/data/events/models/Event.third_party_badge:Lcom/reddit/data/events/models/components/ThirdPartyBadge;
        //  1561: astore          4
        //  1563: aload           4
        //  1565: ifnonnull       1574
        //  1568: iconst_0       
        //  1569: istore          71
        //  1571: goto            1581
        //  1574: aload           4
        //  1576: invokevirtual   com/reddit/data/events/models/components/ThirdPartyBadge.hashCode:()I
        //  1579: istore          71
        //  1581: aload_0        
        //  1582: getfield        com/reddit/data/events/models/Event.brand:Lcom/reddit/data/events/models/components/Brand;
        //  1585: astore          4
        //  1587: aload           4
        //  1589: ifnonnull       1598
        //  1592: iconst_0       
        //  1593: istore          72
        //  1595: goto            1605
        //  1598: aload           4
        //  1600: invokevirtual   com/reddit/data/events/models/components/Brand.hashCode:()I
        //  1603: istore          72
        //  1605: aload_0        
        //  1606: getfield        com/reddit/data/events/models/Event.messenger_request:Lcom/reddit/data/events/models/components/MessengerRequest;
        //  1609: astore          4
        //  1611: aload           4
        //  1613: ifnonnull       1622
        //  1616: iconst_0       
        //  1617: istore          73
        //  1619: goto            1629
        //  1622: aload           4
        //  1624: invokevirtual   com/reddit/data/events/models/components/MessengerRequest.hashCode:()I
        //  1627: istore          73
        //  1629: aload_0        
        //  1630: getfield        com/reddit/data/events/models/Event.banner:Lcom/reddit/data/events/models/components/Banner;
        //  1633: astore          4
        //  1635: aload           4
        //  1637: ifnonnull       1646
        //  1640: iconst_0       
        //  1641: istore          74
        //  1643: goto            1653
        //  1646: aload           4
        //  1648: invokevirtual   com/reddit/data/events/models/components/Banner.hashCode:()I
        //  1651: istore          74
        //  1653: aload_0        
        //  1654: getfield        com/reddit/data/events/models/Event.tooltip:Lcom/reddit/data/events/models/components/Tooltip;
        //  1657: astore          4
        //  1659: aload           4
        //  1661: ifnonnull       1670
        //  1664: iconst_0       
        //  1665: istore          75
        //  1667: goto            1677
        //  1670: aload           4
        //  1672: invokevirtual   com/reddit/data/events/models/components/Tooltip.hashCode:()I
        //  1675: istore          75
        //  1677: aload_0        
        //  1678: getfield        com/reddit/data/events/models/Event.upload:Lcom/reddit/data/events/models/components/Upload;
        //  1681: astore          4
        //  1683: aload           4
        //  1685: ifnonnull       1694
        //  1688: iconst_0       
        //  1689: istore          76
        //  1691: goto            1701
        //  1694: aload           4
        //  1696: invokevirtual   com/reddit/data/events/models/components/Upload.hashCode:()I
        //  1699: istore          76
        //  1701: aload_0        
        //  1702: getfield        com/reddit/data/events/models/Event.csai_media:Lcom/reddit/data/events/models/components/CSAIMedia;
        //  1705: astore          4
        //  1707: aload           4
        //  1709: ifnonnull       1718
        //  1712: iconst_0       
        //  1713: istore          77
        //  1715: goto            1725
        //  1718: aload           4
        //  1720: invokevirtual   com/reddit/data/events/models/components/CSAIMedia.hashCode:()I
        //  1723: istore          77
        //  1725: aload_0        
        //  1726: getfield        com/reddit/data/events/models/Event.category_header:Lcom/reddit/data/events/models/components/CategoryHeader;
        //  1729: astore          4
        //  1731: aload           4
        //  1733: ifnonnull       1742
        //  1736: iconst_0       
        //  1737: istore          78
        //  1739: goto            1749
        //  1742: aload           4
        //  1744: invokevirtual   com/reddit/data/events/models/components/CategoryHeader.hashCode:()I
        //  1747: istore          78
        //  1749: aload_0        
        //  1750: getfield        com/reddit/data/events/models/Event.report:Lcom/reddit/data/events/models/components/Report;
        //  1753: astore          4
        //  1755: aload           4
        //  1757: ifnonnull       1766
        //  1760: iconst_0       
        //  1761: istore          79
        //  1763: goto            1773
        //  1766: aload           4
        //  1768: invokevirtual   com/reddit/data/events/models/components/Report.hashCode:()I
        //  1771: istore          79
        //  1773: aload_0        
        //  1774: getfield        com/reddit/data/events/models/Event.live_thread:Lcom/reddit/data/events/models/components/LiveThread;
        //  1777: astore          4
        //  1779: aload           4
        //  1781: ifnonnull       1790
        //  1784: iconst_0       
        //  1785: istore          80
        //  1787: goto            1797
        //  1790: aload           4
        //  1792: invokevirtual   com/reddit/data/events/models/components/LiveThread.hashCode:()I
        //  1795: istore          80
        //  1797: aload_0        
        //  1798: getfield        com/reddit/data/events/models/Event.ad_request:Lcom/reddit/data/events/models/components/AdRequest;
        //  1801: astore          4
        //  1803: aload           4
        //  1805: ifnonnull       1814
        //  1808: iconst_0       
        //  1809: istore          81
        //  1811: goto            1821
        //  1814: aload           4
        //  1816: invokevirtual   com/reddit/data/events/models/components/AdRequest.hashCode:()I
        //  1819: istore          81
        //  1821: aload_0        
        //  1822: getfield        com/reddit/data/events/models/Event.ad_decision:Lcom/reddit/data/events/models/components/AdDecision;
        //  1825: astore          4
        //  1827: aload           4
        //  1829: ifnonnull       1838
        //  1832: iconst_0       
        //  1833: istore          82
        //  1835: goto            1845
        //  1838: aload           4
        //  1840: invokevirtual   com/reddit/data/events/models/components/AdDecision.hashCode:()I
        //  1843: istore          82
        //  1845: aload_0        
        //  1846: getfield        com/reddit/data/events/models/Event.ad_push:Lcom/reddit/data/events/models/components/AdPush;
        //  1849: astore          4
        //  1851: aload           4
        //  1853: ifnonnull       1862
        //  1856: iconst_0       
        //  1857: istore          83
        //  1859: goto            1869
        //  1862: aload           4
        //  1864: invokevirtual   com/reddit/data/events/models/components/AdPush.hashCode:()I
        //  1867: istore          83
        //  1869: aload_0        
        //  1870: getfield        com/reddit/data/events/models/Event.vote:Lcom/reddit/data/events/models/components/Vote;
        //  1873: astore          4
        //  1875: aload           4
        //  1877: ifnonnull       1886
        //  1880: iconst_0       
        //  1881: istore          84
        //  1883: goto            1893
        //  1886: aload           4
        //  1888: invokevirtual   com/reddit/data/events/models/components/Vote.hashCode:()I
        //  1891: istore          84
        //  1893: aload_0        
        //  1894: getfield        com/reddit/data/events/models/Event.popup:Lcom/reddit/data/events/models/components/Popup;
        //  1897: astore          4
        //  1899: aload           4
        //  1901: ifnonnull       1910
        //  1904: iconst_0       
        //  1905: istore          85
        //  1907: goto            1917
        //  1910: aload           4
        //  1912: invokevirtual   com/reddit/data/events/models/components/Popup.hashCode:()I
        //  1915: istore          85
        //  1917: aload_0        
        //  1918: getfield        com/reddit/data/events/models/Event.mod_action:Lcom/reddit/data/events/models/components/ModAction;
        //  1921: astore          4
        //  1923: aload           4
        //  1925: ifnonnull       1934
        //  1928: iconst_0       
        //  1929: istore          86
        //  1931: goto            1941
        //  1934: aload           4
        //  1936: invokevirtual   com/reddit/data/events/models/components/ModAction.hashCode:()I
        //  1939: istore          86
        //  1941: aload_0        
        //  1942: getfield        com/reddit/data/events/models/Event.user_flair:Lcom/reddit/data/events/models/components/UserFlair;
        //  1945: astore          4
        //  1947: aload           4
        //  1949: ifnonnull       1958
        //  1952: iconst_0       
        //  1953: istore          87
        //  1955: goto            1965
        //  1958: aload           4
        //  1960: invokevirtual   com/reddit/data/events/models/components/UserFlair.hashCode:()I
        //  1963: istore          87
        //  1965: aload_0        
        //  1966: getfield        com/reddit/data/events/models/Event.topic_tag:Lcom/reddit/data/events/models/components/TopicTag;
        //  1969: astore          4
        //  1971: aload           4
        //  1973: ifnonnull       1982
        //  1976: iconst_0       
        //  1977: istore          88
        //  1979: goto            1989
        //  1982: aload           4
        //  1984: invokevirtual   com/reddit/data/events/models/components/TopicTag.hashCode:()I
        //  1987: istore          88
        //  1989: aload_0        
        //  1990: getfield        com/reddit/data/events/models/Event.res:Lcom/reddit/data/events/models/components/RES;
        //  1993: astore          4
        //  1995: aload           4
        //  1997: ifnonnull       2006
        //  2000: iconst_0       
        //  2001: istore          89
        //  2003: goto            2013
        //  2006: aload           4
        //  2008: invokevirtual   com/reddit/data/events/models/components/RES.hashCode:()I
        //  2011: istore          89
        //  2013: aload_0        
        //  2014: getfield        com/reddit/data/events/models/Event.ad:Lcom/reddit/data/events/models/components/Ad;
        //  2017: astore          4
        //  2019: aload           4
        //  2021: ifnonnull       2030
        //  2024: iconst_0       
        //  2025: istore          90
        //  2027: goto            2037
        //  2030: aload           4
        //  2032: invokevirtual   com/reddit/data/events/models/components/Ad.hashCode:()I
        //  2035: istore          90
        //  2037: aload_0        
        //  2038: getfield        com/reddit/data/events/models/Event.ad_campaign:Lcom/reddit/data/events/models/components/AdCampaign;
        //  2041: astore          4
        //  2043: aload           4
        //  2045: ifnonnull       2054
        //  2048: iconst_0       
        //  2049: istore          91
        //  2051: goto            2061
        //  2054: aload           4
        //  2056: invokevirtual   com/reddit/data/events/models/components/AdCampaign.hashCode:()I
        //  2059: istore          91
        //  2061: aload_0        
        //  2062: getfield        com/reddit/data/events/models/Event.ad_group:Lcom/reddit/data/events/models/components/AdGroup;
        //  2065: astore          4
        //  2067: aload           4
        //  2069: ifnonnull       2078
        //  2072: iconst_0       
        //  2073: istore          92
        //  2075: goto            2085
        //  2078: aload           4
        //  2080: invokevirtual   com/reddit/data/events/models/components/AdGroup.hashCode:()I
        //  2083: istore          92
        //  2085: aload_0        
        //  2086: getfield        com/reddit/data/events/models/Event.ad_targeting:Lcom/reddit/data/events/models/components/AdTargeting;
        //  2089: astore          4
        //  2091: aload           4
        //  2093: ifnonnull       2102
        //  2096: iconst_0       
        //  2097: istore          93
        //  2099: goto            2109
        //  2102: aload           4
        //  2104: invokevirtual   com/reddit/data/events/models/components/AdTargeting.hashCode:()I
        //  2107: istore          93
        //  2109: aload_0        
        //  2110: getfield        com/reddit/data/events/models/Event.business_info:Lcom/reddit/data/events/models/components/BusinessInfo;
        //  2113: astore          4
        //  2115: aload           4
        //  2117: ifnonnull       2126
        //  2120: iconst_0       
        //  2121: istore          94
        //  2123: goto            2133
        //  2126: aload           4
        //  2128: invokevirtual   com/reddit/data/events/models/components/BusinessInfo.hashCode:()I
        //  2131: istore          94
        //  2133: aload_0        
        //  2134: getfield        com/reddit/data/events/models/Event.billing_info:Lcom/reddit/data/events/models/components/BillingInfo;
        //  2137: astore          4
        //  2139: aload           4
        //  2141: ifnonnull       2150
        //  2144: iconst_0       
        //  2145: istore          95
        //  2147: goto            2157
        //  2150: aload           4
        //  2152: invokevirtual   com/reddit/data/events/models/components/BillingInfo.hashCode:()I
        //  2155: istore          95
        //  2157: aload_0        
        //  2158: getfield        com/reddit/data/events/models/Event.reddar_ticket:Lcom/reddit/data/events/models/components/ReddarTicket;
        //  2161: astore          4
        //  2163: aload           4
        //  2165: ifnonnull       2174
        //  2168: iconst_0       
        //  2169: istore          96
        //  2171: goto            2181
        //  2174: aload           4
        //  2176: invokevirtual   com/reddit/data/events/models/components/ReddarTicket.hashCode:()I
        //  2179: istore          96
        //  2181: aload_0        
        //  2182: getfield        com/reddit/data/events/models/Event.zendesk_ticket:Lcom/reddit/data/events/models/components/ZendeskTicket;
        //  2185: astore          4
        //  2187: aload           4
        //  2189: ifnonnull       2198
        //  2192: iconst_0       
        //  2193: istore          97
        //  2195: goto            2205
        //  2198: aload           4
        //  2200: invokevirtual   com/reddit/data/events/models/components/ZendeskTicket.hashCode:()I
        //  2203: istore          97
        //  2205: aload_0        
        //  2206: getfield        com/reddit/data/events/models/Event.target_user:Lcom/reddit/data/events/models/components/User;
        //  2209: astore          4
        //  2211: aload           4
        //  2213: ifnonnull       2222
        //  2216: iconst_0       
        //  2217: istore          98
        //  2219: goto            2229
        //  2222: aload           4
        //  2224: invokevirtual   com/reddit/data/events/models/components/User.hashCode:()I
        //  2227: istore          98
        //  2229: aload_0        
        //  2230: getfield        com/reddit/data/events/models/Event.crawler:Lcom/reddit/data/events/models/components/Crawler;
        //  2233: astore          4
        //  2235: aload           4
        //  2237: ifnonnull       2246
        //  2240: iconst_0       
        //  2241: istore          99
        //  2243: goto            2253
        //  2246: aload           4
        //  2248: invokevirtual   com/reddit/data/events/models/components/Crawler.hashCode:()I
        //  2251: istore          99
        //  2253: aload_0        
        //  2254: getfield        com/reddit/data/events/models/Event.response:Lcom/reddit/data/events/models/components/Response;
        //  2257: astore          4
        //  2259: aload           4
        //  2261: ifnonnull       2270
        //  2264: iconst_0       
        //  2265: istore          100
        //  2267: goto            2277
        //  2270: aload           4
        //  2272: invokevirtual   com/reddit/data/events/models/components/Response.hashCode:()I
        //  2275: istore          100
        //  2277: aload_0        
        //  2278: getfield        com/reddit/data/events/models/Event.custom_feed:Lcom/reddit/data/events/models/components/CustomFeed;
        //  2281: astore          4
        //  2283: aload           4
        //  2285: ifnonnull       2294
        //  2288: iconst_0       
        //  2289: istore          101
        //  2291: goto            2301
        //  2294: aload           4
        //  2296: invokevirtual   com/reddit/data/events/models/components/CustomFeed.hashCode:()I
        //  2299: istore          101
        //  2301: aload_0        
        //  2302: getfield        com/reddit/data/events/models/Event.pwa:Lcom/reddit/data/events/models/components/PWA;
        //  2305: astore          4
        //  2307: aload           4
        //  2309: ifnonnull       2318
        //  2312: iconst_0       
        //  2313: istore          102
        //  2315: goto            2325
        //  2318: aload           4
        //  2320: invokevirtual   com/reddit/data/events/models/components/PWA.hashCode:()I
        //  2323: istore          102
        //  2325: aload_0        
        //  2326: getfield        com/reddit/data/events/models/Event.seo:Lcom/reddit/data/events/models/components/SEO;
        //  2329: astore          4
        //  2331: aload           4
        //  2333: ifnonnull       2342
        //  2336: iconst_0       
        //  2337: istore          103
        //  2339: goto            2349
        //  2342: aload           4
        //  2344: invokevirtual   com/reddit/data/events/models/components/SEO.hashCode:()I
        //  2347: istore          103
        //  2349: aload_0        
        //  2350: getfield        com/reddit/data/events/models/Event.ncmec_report:Lcom/reddit/data/events/models/components/NCMECReport;
        //  2353: astore          4
        //  2355: aload           4
        //  2357: ifnonnull       2366
        //  2360: iconst_0       
        //  2361: istore          104
        //  2363: goto            2373
        //  2366: aload           4
        //  2368: invokevirtual   com/reddit/data/events/models/components/NCMECReport.hashCode:()I
        //  2371: istore          104
        //  2373: aload_0        
        //  2374: getfield        com/reddit/data/events/models/Event.funding_instrument:Lcom/reddit/data/events/models/components/FundingInstrument;
        //  2377: astore          4
        //  2379: aload           4
        //  2381: ifnonnull       2390
        //  2384: iconst_0       
        //  2385: istore          105
        //  2387: goto            2397
        //  2390: aload           4
        //  2392: invokevirtual   com/reddit/data/events/models/components/FundingInstrument.hashCode:()I
        //  2395: istore          105
        //  2397: aload_0        
        //  2398: getfield        com/reddit/data/events/models/Event.grapeshot_classification:Lcom/reddit/data/events/models/components/GrapeshotClassification;
        //  2401: astore          4
        //  2403: aload           4
        //  2405: ifnonnull       2414
        //  2408: iconst_0       
        //  2409: istore          106
        //  2411: goto            2421
        //  2414: aload           4
        //  2416: invokevirtual   com/reddit/data/events/models/components/GrapeshotClassification.hashCode:()I
        //  2419: istore          106
        //  2421: aload_0        
        //  2422: getfield        com/reddit/data/events/models/Event.perspective:Lcom/reddit/data/events/models/components/Perspective;
        //  2425: astore          4
        //  2427: aload           4
        //  2429: ifnonnull       2438
        //  2432: iconst_0       
        //  2433: istore          107
        //  2435: goto            2445
        //  2438: aload           4
        //  2440: invokevirtual   com/reddit/data/events/models/components/Perspective.hashCode:()I
        //  2443: istore          107
        //  2445: aload_0        
        //  2446: getfield        com/reddit/data/events/models/Event.comment_draft:Lcom/reddit/data/events/models/components/CommentDraft;
        //  2449: astore          4
        //  2451: aload           4
        //  2453: ifnonnull       2462
        //  2456: iconst_0       
        //  2457: istore          108
        //  2459: goto            2469
        //  2462: aload           4
        //  2464: invokevirtual   com/reddit/data/events/models/components/CommentDraft.hashCode:()I
        //  2467: istore          108
        //  2469: aload_0        
        //  2470: getfield        com/reddit/data/events/models/Event.target_post:Lcom/reddit/data/events/models/components/Post;
        //  2473: astore          4
        //  2475: aload           4
        //  2477: ifnonnull       2486
        //  2480: iconst_0       
        //  2481: istore          109
        //  2483: goto            2493
        //  2486: aload           4
        //  2488: invokevirtual   com/reddit/data/events/models/components/Post.hashCode:()I
        //  2491: istore          109
        //  2493: aload_0        
        //  2494: getfield        com/reddit/data/events/models/Event.ml_model:Lcom/reddit/data/events/models/components/MLModel;
        //  2497: astore          4
        //  2499: aload           4
        //  2501: ifnonnull       2510
        //  2504: iconst_0       
        //  2505: istore          110
        //  2507: goto            2517
        //  2510: aload           4
        //  2512: invokevirtual   com/reddit/data/events/models/components/MLModel.hashCode:()I
        //  2515: istore          110
        //  2517: aload_0        
        //  2518: getfield        com/reddit/data/events/models/Event.topic_metadata:Lcom/reddit/data/events/models/components/TopicMetadata;
        //  2521: astore          4
        //  2523: aload           4
        //  2525: ifnonnull       2534
        //  2528: iconst_0       
        //  2529: istore          111
        //  2531: goto            2541
        //  2534: aload           4
        //  2536: invokevirtual   com/reddit/data/events/models/components/TopicMetadata.hashCode:()I
        //  2539: istore          111
        //  2541: aload_0        
        //  2542: getfield        com/reddit/data/events/models/Event.chat_home_feed_boosting:Lcom/reddit/data/events/models/components/ChatHomeFeedBoosting;
        //  2545: astore          4
        //  2547: aload           4
        //  2549: ifnonnull       2558
        //  2552: iconst_0       
        //  2553: istore          112
        //  2555: goto            2565
        //  2558: aload           4
        //  2560: invokevirtual   com/reddit/data/events/models/components/ChatHomeFeedBoosting.hashCode:()I
        //  2563: istore          112
        //  2565: aload_0        
        //  2566: getfield        com/reddit/data/events/models/Event.domain_ban:Lcom/reddit/data/events/models/components/DomainBan;
        //  2569: astore          4
        //  2571: aload           4
        //  2573: ifnonnull       2582
        //  2576: iconst_0       
        //  2577: istore          113
        //  2579: goto            2589
        //  2582: aload           4
        //  2584: invokevirtual   com/reddit/data/events/models/components/DomainBan.hashCode:()I
        //  2587: istore          113
        //  2589: aload_0        
        //  2590: getfield        com/reddit/data/events/models/Event.legal_export_request:Lcom/reddit/data/events/models/components/LegalExportRequest;
        //  2593: astore          4
        //  2595: aload           4
        //  2597: ifnonnull       2606
        //  2600: iconst_0       
        //  2601: istore          114
        //  2603: goto            2613
        //  2606: aload           4
        //  2608: invokevirtual   com/reddit/data/events/models/components/LegalExportRequest.hashCode:()I
        //  2611: istore          114
        //  2613: aload_0        
        //  2614: getfield        com/reddit/data/events/models/Event.post_requirement:Lcom/reddit/data/events/models/components/PostRequirement;
        //  2617: astore          4
        //  2619: aload           4
        //  2621: ifnonnull       2630
        //  2624: iconst_0       
        //  2625: istore          115
        //  2627: goto            2637
        //  2630: aload           4
        //  2632: invokevirtual   com/reddit/data/events/models/components/PostRequirement.hashCode:()I
        //  2635: istore          115
        //  2637: aload_0        
        //  2638: getfield        com/reddit/data/events/models/Event.target_ip:Lcom/reddit/data/events/models/components/TargetIP;
        //  2641: astore          4
        //  2643: aload           4
        //  2645: ifnonnull       2654
        //  2648: iconst_0       
        //  2649: istore          116
        //  2651: goto            2661
        //  2654: aload           4
        //  2656: invokevirtual   com/reddit/data/events/models/components/TargetIP.hashCode:()I
        //  2659: istore          116
        //  2661: aload_0        
        //  2662: getfield        com/reddit/data/events/models/Event.crowd_control:Lcom/reddit/data/events/models/components/CrowdControl;
        //  2665: astore          4
        //  2667: aload           4
        //  2669: ifnonnull       2678
        //  2672: iconst_0       
        //  2673: istore          117
        //  2675: goto            2685
        //  2678: aload           4
        //  2680: invokevirtual   com/reddit/data/events/models/components/CrowdControl.hashCode:()I
        //  2683: istore          117
        //  2685: aload_0        
        //  2686: getfield        com/reddit/data/events/models/Event.reddar_ticket_content:Lcom/reddit/data/events/models/components/ReddarTicketContent;
        //  2689: astore          4
        //  2691: aload           4
        //  2693: ifnonnull       2702
        //  2696: iconst_0       
        //  2697: istore          118
        //  2699: goto            2709
        //  2702: aload           4
        //  2704: invokevirtual   com/reddit/data/events/models/components/ReddarTicketContent.hashCode:()I
        //  2707: istore          118
        //  2709: aload_0        
        //  2710: getfield        com/reddit/data/events/models/Event.scheduled_post:Lcom/reddit/data/events/models/components/ScheduledPost;
        //  2713: astore          4
        //  2715: aload           4
        //  2717: ifnonnull       2726
        //  2720: iconst_0       
        //  2721: istore          119
        //  2723: goto            2733
        //  2726: aload           4
        //  2728: invokevirtual   com/reddit/data/events/models/components/ScheduledPost.hashCode:()I
        //  2731: istore          119
        //  2733: aload_0        
        //  2734: getfield        com/reddit/data/events/models/Event.poll:Lcom/reddit/data/events/models/components/Poll;
        //  2737: astore          4
        //  2739: aload           4
        //  2741: ifnonnull       2750
        //  2744: iconst_0       
        //  2745: istore          120
        //  2747: goto            2757
        //  2750: aload           4
        //  2752: invokevirtual   com/reddit/data/events/models/components/Poll.hashCode:()I
        //  2755: istore          120
        //  2757: aload_0        
        //  2758: getfield        com/reddit/data/events/models/Event.reddar_audit:Lcom/reddit/data/events/models/components/ReddarAudit;
        //  2761: astore          4
        //  2763: aload           4
        //  2765: ifnonnull       2774
        //  2768: iconst_0       
        //  2769: istore          121
        //  2771: goto            2781
        //  2774: aload           4
        //  2776: invokevirtual   com/reddit/data/events/models/components/ReddarAudit.hashCode:()I
        //  2779: istore          121
        //  2781: aload_0        
        //  2782: getfield        com/reddit/data/events/models/Event.reddar_audit_ticket:Lcom/reddit/data/events/models/components/ReddarAuditTicket;
        //  2785: astore          4
        //  2787: aload           4
        //  2789: ifnonnull       2798
        //  2792: iconst_0       
        //  2793: istore          122
        //  2795: goto            2805
        //  2798: aload           4
        //  2800: invokevirtual   com/reddit/data/events/models/components/ReddarAuditTicket.hashCode:()I
        //  2803: istore          122
        //  2805: aload_0        
        //  2806: getfield        com/reddit/data/events/models/Event.target_subreddit:Lcom/reddit/data/events/models/components/Subreddit;
        //  2809: astore          4
        //  2811: aload           4
        //  2813: ifnonnull       2822
        //  2816: iconst_0       
        //  2817: istore          123
        //  2819: goto            2829
        //  2822: aload           4
        //  2824: invokevirtual   com/reddit/data/events/models/components/Subreddit.hashCode:()I
        //  2827: istore          123
        //  2829: aload_0        
        //  2830: getfield        com/reddit/data/events/models/Event.spamurai_action:Lcom/reddit/data/events/models/components/SpamuraiAction;
        //  2833: astore          4
        //  2835: aload           4
        //  2837: ifnonnull       2846
        //  2840: iconst_0       
        //  2841: istore          124
        //  2843: goto            2853
        //  2846: aload           4
        //  2848: invokevirtual   com/reddit/data/events/models/components/SpamuraiAction.hashCode:()I
        //  2851: istore          124
        //  2853: aload_0        
        //  2854: getfield        com/reddit/data/events/models/Event.ad_brand_safety:Lcom/reddit/data/events/models/components/AdBrandSafety;
        //  2857: astore          4
        //  2859: aload           4
        //  2861: ifnonnull       2870
        //  2864: iconst_0       
        //  2865: istore          125
        //  2867: goto            2877
        //  2870: aload           4
        //  2872: invokevirtual   com/reddit/data/events/models/components/AdBrandSafety.hashCode:()I
        //  2875: istore          125
        //  2877: aload_0        
        //  2878: getfield        com/reddit/data/events/models/Event.bulk_action_job:Lcom/reddit/data/events/models/components/BulkActionJob;
        //  2881: astore          4
        //  2883: aload           4
        //  2885: ifnonnull       2894
        //  2888: iconst_0       
        //  2889: istore          126
        //  2891: goto            2901
        //  2894: aload           4
        //  2896: invokevirtual   com/reddit/data/events/models/components/BulkActionJob.hashCode:()I
        //  2899: istore          126
        //  2901: aload_0        
        //  2902: getfield        com/reddit/data/events/models/Event.target_comment:Lcom/reddit/data/events/models/components/Comment;
        //  2905: astore          4
        //  2907: aload           4
        //  2909: ifnonnull       2918
        //  2912: iconst_0       
        //  2913: istore          127
        //  2915: goto            2925
        //  2918: aload           4
        //  2920: invokevirtual   com/reddit/data/events/models/components/Comment.hashCode:()I
        //  2923: istore          127
        //  2925: aload_0        
        //  2926: getfield        com/reddit/data/events/models/Event.target_message:Lcom/reddit/data/events/models/components/Message;
        //  2929: astore          4
        //  2931: aload           4
        //  2933: ifnonnull       2942
        //  2936: iconst_0       
        //  2937: istore          128
        //  2939: goto            2949
        //  2942: aload           4
        //  2944: invokevirtual   com/reddit/data/events/models/components/Message.hashCode:()I
        //  2947: istore          128
        //  2949: aload_0        
        //  2950: getfield        com/reddit/data/events/models/Event.reroute_rule:Lcom/reddit/data/events/models/components/RerouteRule;
        //  2953: astore          4
        //  2955: aload           4
        //  2957: ifnonnull       2966
        //  2960: iconst_0       
        //  2961: istore          129
        //  2963: goto            2973
        //  2966: aload           4
        //  2968: invokevirtual   com/reddit/data/events/models/components/RerouteRule.hashCode:()I
        //  2971: istore          129
        //  2973: aload_0        
        //  2974: getfield        com/reddit/data/events/models/Event.reddar_queue:Lcom/reddit/data/events/models/components/ReddarQueue;
        //  2977: astore          4
        //  2979: aload           4
        //  2981: ifnonnull       2990
        //  2984: iconst_0       
        //  2985: istore          130
        //  2987: goto            2997
        //  2990: aload           4
        //  2992: invokevirtual   com/reddit/data/events/models/components/ReddarQueue.hashCode:()I
        //  2995: istore          130
        //  2997: aload_0        
        //  2998: getfield        com/reddit/data/events/models/Event.geo_block:Lcom/reddit/data/events/models/components/GeoBlock;
        //  3001: astore          4
        //  3003: aload           4
        //  3005: ifnonnull       3014
        //  3008: iconst_0       
        //  3009: istore          131
        //  3011: goto            3021
        //  3014: aload           4
        //  3016: invokevirtual   com/reddit/data/events/models/components/GeoBlock.hashCode:()I
        //  3019: istore          131
        //  3021: aload_0        
        //  3022: getfield        com/reddit/data/events/models/Event.programmatic:Lcom/reddit/data/events/models/components/Programmatic;
        //  3025: astore          4
        //  3027: aload           4
        //  3029: ifnonnull       3038
        //  3032: iconst_0       
        //  3033: istore          132
        //  3035: goto            3045
        //  3038: aload           4
        //  3040: invokevirtual   com/reddit/data/events/models/components/Programmatic.hashCode:()I
        //  3043: istore          132
        //  3045: aload_0        
        //  3046: getfield        com/reddit/data/events/models/Event.csai_content_report:Lcom/reddit/data/events/models/components/CSAIContentReport;
        //  3049: astore          4
        //  3051: aload           4
        //  3053: ifnonnull       3062
        //  3056: iconst_0       
        //  3057: istore          133
        //  3059: goto            3069
        //  3062: aload           4
        //  3064: invokevirtual   com/reddit/data/events/models/components/CSAIContentReport.hashCode:()I
        //  3067: istore          133
        //  3069: aload_0        
        //  3070: getfield        com/reddit/data/events/models/Event.imposter:Lcom/reddit/data/events/models/components/Imposter;
        //  3073: astore          4
        //  3075: aload           4
        //  3077: ifnonnull       3086
        //  3080: iconst_0       
        //  3081: istore          134
        //  3083: goto            3093
        //  3086: aload           4
        //  3088: invokevirtual   com/reddit/data/events/models/components/Imposter.hashCode:()I
        //  3091: istore          134
        //  3093: aload_0        
        //  3094: getfield        com/reddit/data/events/models/Event.broadcast:Lcom/reddit/data/events/models/components/Broadcast;
        //  3097: astore          4
        //  3099: aload           4
        //  3101: ifnonnull       3110
        //  3104: iconst_0       
        //  3105: istore          135
        //  3107: goto            3117
        //  3110: aload           4
        //  3112: invokevirtual   com/reddit/data/events/models/components/Broadcast.hashCode:()I
        //  3115: istore          135
        //  3117: aload_0        
        //  3118: getfield        com/reddit/data/events/models/Event.survey:Lcom/reddit/data/events/models/components/Survey;
        //  3121: astore          4
        //  3123: aload           4
        //  3125: ifnonnull       3134
        //  3128: iconst_0       
        //  3129: istore          136
        //  3131: goto            3141
        //  3134: aload           4
        //  3136: invokevirtual   com/reddit/data/events/models/components/Survey.hashCode:()I
        //  3139: istore          136
        //  3141: aload_0        
        //  3142: getfield        com/reddit/data/events/models/Event.playback:Lcom/reddit/data/events/models/components/Playback;
        //  3145: astore          4
        //  3147: aload           4
        //  3149: ifnonnull       3158
        //  3152: iconst_0       
        //  3153: istore          137
        //  3155: goto            3165
        //  3158: aload           4
        //  3160: invokevirtual   com/reddit/data/events/models/components/Playback.hashCode:()I
        //  3163: istore          137
        //  3165: aload_0        
        //  3166: getfield        com/reddit/data/events/models/Event.bot_detection:Lcom/reddit/data/events/models/components/BotDetection;
        //  3169: astore          4
        //  3171: aload           4
        //  3173: ifnonnull       3182
        //  3176: iconst_0       
        //  3177: istore          138
        //  3179: goto            3189
        //  3182: aload           4
        //  3184: invokevirtual   com/reddit/data/events/models/components/BotDetection.hashCode:()I
        //  3187: istore          138
        //  3189: aload_0        
        //  3190: getfield        com/reddit/data/events/models/Event.crowd_source:Lcom/reddit/data/events/models/components/CrowdSource;
        //  3193: astore          4
        //  3195: aload           4
        //  3197: ifnonnull       3206
        //  3200: iconst_0       
        //  3201: istore          139
        //  3203: goto            3213
        //  3206: aload           4
        //  3208: invokevirtual   com/reddit/data/events/models/components/CrowdSource.hashCode:()I
        //  3211: istore          139
        //  3213: aload_0        
        //  3214: getfield        com/reddit/data/events/models/Event.announcement:Lcom/reddit/data/events/models/components/Announcement;
        //  3217: astore          4
        //  3219: aload           4
        //  3221: ifnonnull       3230
        //  3224: iconst_0       
        //  3225: istore          140
        //  3227: goto            3237
        //  3230: aload           4
        //  3232: invokevirtual   com/reddit/data/events/models/components/Announcement.hashCode:()I
        //  3235: istore          140
        //  3237: aload_0        
        //  3238: getfield        com/reddit/data/events/models/Event.purchase:Lcom/reddit/data/events/models/components/Purchase;
        //  3241: astore          4
        //  3243: aload           4
        //  3245: ifnonnull       3254
        //  3248: iconst_0       
        //  3249: istore          141
        //  3251: goto            3261
        //  3254: aload           4
        //  3256: invokevirtual   com/reddit/data/events/models/components/Purchase.hashCode:()I
        //  3259: istore          141
        //  3261: aload_0        
        //  3262: getfield        com/reddit/data/events/models/Event.powerups:Lcom/reddit/data/events/models/components/Powerups;
        //  3265: astore          4
        //  3267: aload           4
        //  3269: ifnonnull       3278
        //  3272: iconst_0       
        //  3273: istore          142
        //  3275: goto            3285
        //  3278: aload           4
        //  3280: invokevirtual   com/reddit/data/events/models/components/Powerups.hashCode:()I
        //  3283: istore          142
        //  3285: aload_0        
        //  3286: getfield        com/reddit/data/events/models/Event.account_label:Lcom/reddit/data/events/models/components/AccountLabel;
        //  3289: astore          4
        //  3291: aload           4
        //  3293: ifnonnull       3302
        //  3296: iconst_0       
        //  3297: istore          143
        //  3299: goto            3309
        //  3302: aload           4
        //  3304: invokevirtual   com/reddit/data/events/models/components/AccountLabel.hashCode:()I
        //  3307: istore          143
        //  3309: aload_0        
        //  3310: getfield        com/reddit/data/events/models/Event.inbox:Lcom/reddit/data/events/models/components/Inbox;
        //  3313: astore          4
        //  3315: aload           4
        //  3317: ifnonnull       3326
        //  3320: iconst_0       
        //  3321: istore          144
        //  3323: goto            3333
        //  3326: aload           4
        //  3328: invokevirtual   com/reddit/data/events/models/components/Inbox.hashCode:()I
        //  3331: istore          144
        //  3333: aload_0        
        //  3334: getfield        com/reddit/data/events/models/Event.gallery:Lcom/reddit/data/events/models/components/Gallery;
        //  3337: astore          4
        //  3339: aload           4
        //  3341: ifnonnull       3350
        //  3344: iconst_0       
        //  3345: istore          145
        //  3347: goto            3357
        //  3350: aload           4
        //  3352: invokevirtual   com/reddit/data/events/models/components/Gallery.hashCode:()I
        //  3355: istore          145
        //  3357: aload_0        
        //  3358: getfield        com/reddit/data/events/models/Event.trophy:Lcom/reddit/data/events/models/components/Trophy;
        //  3361: astore          4
        //  3363: aload           4
        //  3365: ifnonnull       3374
        //  3368: iconst_0       
        //  3369: istore          146
        //  3371: goto            3381
        //  3374: aload           4
        //  3376: invokevirtual   com/reddit/data/events/models/components/Trophy.hashCode:()I
        //  3379: istore          146
        //  3381: aload_0        
        //  3382: getfield        com/reddit/data/events/models/Event.feature:Lcom/reddit/data/events/models/components/Feature;
        //  3385: astore          4
        //  3387: aload           4
        //  3389: ifnonnull       3398
        //  3392: iconst_0       
        //  3393: istore          147
        //  3395: goto            3405
        //  3398: aload           4
        //  3400: invokevirtual   com/reddit/data/events/models/components/Feature.hashCode:()I
        //  3403: istore          147
        //  3405: aload_0        
        //  3406: getfield        com/reddit/data/events/models/Event.admin_team:Lcom/reddit/data/events/models/components/AdminTeam;
        //  3409: astore          4
        //  3411: aload           4
        //  3413: ifnonnull       3422
        //  3416: iconst_0       
        //  3417: istore          148
        //  3419: goto            3429
        //  3422: aload           4
        //  3424: invokevirtual   com/reddit/data/events/models/components/AdminTeam.hashCode:()I
        //  3427: istore          148
        //  3429: aload_0        
        //  3430: getfield        com/reddit/data/events/models/Event.mute:Lcom/reddit/data/events/models/components/Mute;
        //  3433: astore          4
        //  3435: aload           4
        //  3437: ifnonnull       3446
        //  3440: iconst_0       
        //  3441: istore          149
        //  3443: goto            3453
        //  3446: aload           4
        //  3448: invokevirtual   com/reddit/data/events/models/components/Mute.hashCode:()I
        //  3451: istore          149
        //  3453: aload_0        
        //  3454: getfield        com/reddit/data/events/models/Event.content_tag:Lcom/reddit/data/events/models/components/ContentTag;
        //  3457: astore          4
        //  3459: aload           4
        //  3461: ifnonnull       3470
        //  3464: iconst_0       
        //  3465: istore          150
        //  3467: goto            3477
        //  3470: aload           4
        //  3472: invokevirtual   com/reddit/data/events/models/components/ContentTag.hashCode:()I
        //  3475: istore          150
        //  3477: aload_0        
        //  3478: getfield        com/reddit/data/events/models/Event.rater_tag:Lcom/reddit/data/events/models/components/RaterTag;
        //  3481: astore          4
        //  3483: aload           4
        //  3485: ifnonnull       3494
        //  3488: iconst_0       
        //  3489: istore          151
        //  3491: goto            3501
        //  3494: aload           4
        //  3496: invokevirtual   com/reddit/data/events/models/components/RaterTag.hashCode:()I
        //  3499: istore          151
        //  3501: aload_0        
        //  3502: getfield        com/reddit/data/events/models/Event.credit_card_form:Lcom/reddit/data/events/models/components/CreditCardForm;
        //  3505: astore          4
        //  3507: aload           4
        //  3509: ifnonnull       3518
        //  3512: iconst_0       
        //  3513: istore          152
        //  3515: goto            3525
        //  3518: aload           4
        //  3520: invokevirtual   com/reddit/data/events/models/components/CreditCardForm.hashCode:()I
        //  3523: istore          152
        //  3525: aload_0        
        //  3526: getfield        com/reddit/data/events/models/Event.ad_click:Lcom/reddit/data/events/models/components/AdClick;
        //  3529: astore          4
        //  3531: aload           4
        //  3533: ifnonnull       3542
        //  3536: iconst_0       
        //  3537: istore          153
        //  3539: goto            3549
        //  3542: aload           4
        //  3544: invokevirtual   com/reddit/data/events/models/components/AdClick.hashCode:()I
        //  3547: istore          153
        //  3549: aload_0        
        //  3550: getfield        com/reddit/data/events/models/Event.snoovatar:Lcom/reddit/data/events/models/components/Snoovatar;
        //  3553: astore          4
        //  3555: aload           4
        //  3557: ifnonnull       3566
        //  3560: iconst_0       
        //  3561: istore          154
        //  3563: goto            3573
        //  3566: aload           4
        //  3568: invokevirtual   com/reddit/data/events/models/components/Snoovatar.hashCode:()I
        //  3571: istore          154
        //  3573: aload_0        
        //  3574: getfield        com/reddit/data/events/models/Event.feed:Lcom/reddit/data/events/models/components/Feed;
        //  3577: astore          4
        //  3579: aload           4
        //  3581: ifnonnull       3590
        //  3584: iconst_0       
        //  3585: istore          155
        //  3587: goto            3597
        //  3590: aload           4
        //  3592: invokevirtual   com/reddit/data/events/models/components/Feed.hashCode:()I
        //  3595: istore          155
        //  3597: aload_0        
        //  3598: getfield        com/reddit/data/events/models/Event.progress_module:Lcom/reddit/data/events/models/components/ProgressModule;
        //  3601: astore          4
        //  3603: aload           4
        //  3605: ifnonnull       3614
        //  3608: iconst_0       
        //  3609: istore          156
        //  3611: goto            3621
        //  3614: aload           4
        //  3616: invokevirtual   com/reddit/data/events/models/components/ProgressModule.hashCode:()I
        //  3619: istore          156
        //  3621: aload_0        
        //  3622: getfield        com/reddit/data/events/models/Event.app_icon:Lcom/reddit/data/events/models/components/AppIcon;
        //  3625: astore          4
        //  3627: aload           4
        //  3629: ifnonnull       3638
        //  3632: iconst_0       
        //  3633: istore          157
        //  3635: goto            3645
        //  3638: aload           4
        //  3640: invokevirtual   com/reddit/data/events/models/components/AppIcon.hashCode:()I
        //  3643: istore          157
        //  3645: aload_0        
        //  3646: getfield        com/reddit/data/events/models/Event.ad_metadata:Lcom/reddit/data/events/models/components/AdMetadata;
        //  3649: astore          4
        //  3651: aload           4
        //  3653: ifnonnull       3662
        //  3656: iconst_0       
        //  3657: istore          158
        //  3659: goto            3669
        //  3662: aload           4
        //  3664: invokevirtual   com/reddit/data/events/models/components/AdMetadata.hashCode:()I
        //  3667: istore          158
        //  3669: aload_0        
        //  3670: getfield        com/reddit/data/events/models/Event.predictions:Lcom/reddit/data/events/models/components/Predictions;
        //  3673: astore          4
        //  3675: aload           4
        //  3677: ifnonnull       3686
        //  3680: iconst_0       
        //  3681: istore          159
        //  3683: goto            3693
        //  3686: aload           4
        //  3688: invokevirtual   com/reddit/data/events/models/components/Predictions.hashCode:()I
        //  3691: istore          159
        //  3693: aload_0        
        //  3694: getfield        com/reddit/data/events/models/Event.navigation_session:Lcom/reddit/data/events/models/components/NavigationSession;
        //  3697: astore          4
        //  3699: aload           4
        //  3701: ifnonnull       3710
        //  3704: iconst_0       
        //  3705: istore          160
        //  3707: goto            3717
        //  3710: aload           4
        //  3712: invokevirtual   com/reddit/data/events/models/components/NavigationSession.hashCode:()I
        //  3715: istore          160
        //  3717: aload_0        
        //  3718: getfield        com/reddit/data/events/models/Event.afd_second:Lcom/reddit/data/events/models/components/AFDSecond;
        //  3721: astore          4
        //  3723: aload           4
        //  3725: ifnonnull       3734
        //  3728: iconst_0       
        //  3729: istore          161
        //  3731: goto            3741
        //  3734: aload           4
        //  3736: invokevirtual   com/reddit/data/events/models/components/AFDSecond.hashCode:()I
        //  3739: istore          161
        //  3741: aload_0        
        //  3742: getfield        com/reddit/data/events/models/Event.atc:Lcom/reddit/data/events/models/components/ATC;
        //  3745: astore          4
        //  3747: aload           4
        //  3749: ifnonnull       3758
        //  3752: iconst_0       
        //  3753: istore          162
        //  3755: goto            3765
        //  3758: aload           4
        //  3760: invokevirtual   com/reddit/data/events/models/components/ATC.hashCode:()I
        //  3763: istore          162
        //  3765: aload_0        
        //  3766: getfield        com/reddit/data/events/models/Event.view_stats:Lcom/reddit/data/events/models/components/ViewStats;
        //  3769: astore          4
        //  3771: aload           4
        //  3773: ifnonnull       3782
        //  3776: iconst_0       
        //  3777: istore          163
        //  3779: goto            3789
        //  3782: aload           4
        //  3784: invokevirtual   com/reddit/data/events/models/components/ViewStats.hashCode:()I
        //  3787: istore          163
        //  3789: aload_0        
        //  3790: getfield        com/reddit/data/events/models/Event.reward_info:Lcom/reddit/data/events/models/components/RewardInfo;
        //  3793: astore          4
        //  3795: aload           4
        //  3797: ifnonnull       3806
        //  3800: iconst_0       
        //  3801: istore          164
        //  3803: goto            3813
        //  3806: aload           4
        //  3808: invokevirtual   com/reddit/data/events/models/components/RewardInfo.hashCode:()I
        //  3811: istore          164
        //  3813: aload_0        
        //  3814: getfield        com/reddit/data/events/models/Event.live_audio_room:Lcom/reddit/data/events/models/components/LiveAudioRoom;
        //  3817: astore          4
        //  3819: aload           4
        //  3821: ifnonnull       3830
        //  3824: iconst_0       
        //  3825: istore          165
        //  3827: goto            3837
        //  3830: aload           4
        //  3832: invokevirtual   com/reddit/data/events/models/components/LiveAudioRoom.hashCode:()I
        //  3835: istore          165
        //  3837: aload_0        
        //  3838: getfield        com/reddit/data/events/models/Event.live_audio_user:Lcom/reddit/data/events/models/components/LiveAudioRoomUser;
        //  3841: astore          4
        //  3843: aload           4
        //  3845: ifnonnull       3854
        //  3848: iconst_0       
        //  3849: istore          166
        //  3851: goto            3861
        //  3854: aload           4
        //  3856: invokevirtual   com/reddit/data/events/models/components/LiveAudioRoomUser.hashCode:()I
        //  3859: istore          166
        //  3861: aload_0        
        //  3862: getfield        com/reddit/data/events/models/Event.modmail_conversation:Lcom/reddit/data/events/models/components/ModmailConversation;
        //  3865: astore          4
        //  3867: aload           4
        //  3869: ifnonnull       3878
        //  3872: iconst_0       
        //  3873: istore          167
        //  3875: goto            3885
        //  3878: aload           4
        //  3880: invokevirtual   com/reddit/data/events/models/components/ModmailConversation.hashCode:()I
        //  3883: istore          167
        //  3885: aload_0        
        //  3886: getfield        com/reddit/data/events/models/Event.modmail_message:Lcom/reddit/data/events/models/components/ModmailMessage;
        //  3889: astore          4
        //  3891: aload           4
        //  3893: ifnonnull       3902
        //  3896: iconst_0       
        //  3897: istore          168
        //  3899: goto            3909
        //  3902: aload           4
        //  3904: invokevirtual   com/reddit/data/events/models/components/ModmailMessage.hashCode:()I
        //  3907: istore          168
        //  3909: aload_0        
        //  3910: getfield        com/reddit/data/events/models/Event.bulk_messenger:Lcom/reddit/data/events/models/components/BulkMessenger;
        //  3913: astore          4
        //  3915: aload           4
        //  3917: ifnonnull       3926
        //  3920: iconst_0       
        //  3921: istore          169
        //  3923: goto            3933
        //  3926: aload           4
        //  3928: invokevirtual   com/reddit/data/events/models/components/BulkMessenger.hashCode:()I
        //  3931: istore          169
        //  3933: aload_0        
        //  3934: getfield        com/reddit/data/events/models/Event.restrict:Lcom/reddit/data/events/models/components/Restrict;
        //  3937: astore          4
        //  3939: aload           4
        //  3941: ifnonnull       3950
        //  3944: iconst_0       
        //  3945: istore          170
        //  3947: goto            3957
        //  3950: aload           4
        //  3952: invokevirtual   com/reddit/data/events/models/components/Restrict.hashCode:()I
        //  3955: istore          170
        //  3957: aload_0        
        //  3958: getfield        com/reddit/data/events/models/Event.ad_pixel:Lcom/reddit/data/events/models/components/AdPixel;
        //  3961: astore          4
        //  3963: aload           4
        //  3965: ifnonnull       3974
        //  3968: iconst_0       
        //  3969: istore          171
        //  3971: goto            3981
        //  3974: aload           4
        //  3976: invokevirtual   com/reddit/data/events/models/components/AdPixel.hashCode:()I
        //  3979: istore          171
        //  3981: aload_0        
        //  3982: getfield        com/reddit/data/events/models/Event.video_error_report:Lcom/reddit/data/events/models/components/VideoErrorReport;
        //  3985: astore          4
        //  3987: aload           4
        //  3989: ifnonnull       3998
        //  3992: iconst_0       
        //  3993: istore          172
        //  3995: goto            4005
        //  3998: aload           4
        //  4000: invokevirtual   com/reddit/data/events/models/components/VideoErrorReport.hashCode:()I
        //  4003: istore          172
        //  4005: aload_0        
        //  4006: getfield        com/reddit/data/events/models/Event.taxonomy:Lcom/reddit/data/events/models/components/Taxonomy;
        //  4009: astore          4
        //  4011: aload           4
        //  4013: ifnonnull       4022
        //  4016: iconst_0       
        //  4017: istore          173
        //  4019: goto            4029
        //  4022: aload           4
        //  4024: invokevirtual   com/reddit/data/events/models/components/Taxonomy.hashCode:()I
        //  4027: istore          173
        //  4029: aload_0        
        //  4030: getfield        com/reddit/data/events/models/Event.social_link:Lcom/reddit/data/events/models/components/SocialLink;
        //  4033: astore          4
        //  4035: aload           4
        //  4037: ifnonnull       4046
        //  4040: iconst_0       
        //  4041: istore          174
        //  4043: goto            4053
        //  4046: aload           4
        //  4048: invokevirtual   com/reddit/data/events/models/components/SocialLink.hashCode:()I
        //  4051: istore          174
        //  4053: aload_0        
        //  4054: getfield        com/reddit/data/events/models/Event.acl_check:Lcom/reddit/data/events/models/components/AclCheck;
        //  4057: astore          4
        //  4059: aload           4
        //  4061: ifnonnull       4070
        //  4064: iconst_0       
        //  4065: istore          175
        //  4067: goto            4077
        //  4070: aload           4
        //  4072: invokevirtual   com/reddit/data/events/models/components/AclCheck.hashCode:()I
        //  4075: istore          175
        //  4077: aload_0        
        //  4078: getfield        com/reddit/data/events/models/Event.cookie_monitor:Lm40/a;
        //  4081: astore          4
        //  4083: aload           4
        //  4085: ifnonnull       4094
        //  4088: iconst_0       
        //  4089: istore          176
        //  4091: goto            4101
        //  4094: aload           4
        //  4096: invokevirtual   m40/a.hashCode:()I
        //  4099: istore          176
        //  4101: aload_0        
        //  4102: getfield        com/reddit/data/events/models/Event.camera_feature:Lcom/reddit/data/events/models/components/CameraFeature;
        //  4105: astore          4
        //  4107: aload           4
        //  4109: ifnonnull       4118
        //  4112: iconst_0       
        //  4113: istore          177
        //  4115: goto            4125
        //  4118: aload           4
        //  4120: invokevirtual   com/reddit/data/events/models/components/CameraFeature.hashCode:()I
        //  4123: istore          177
        //  4125: aload_0        
        //  4126: getfield        com/reddit/data/events/models/Event.registration_form:Lcom/reddit/data/events/models/components/RegistrationForm;
        //  4129: astore          4
        //  4131: aload           4
        //  4133: ifnonnull       4142
        //  4136: iconst_0       
        //  4137: istore          178
        //  4139: goto            4149
        //  4142: aload           4
        //  4144: invokevirtual   com/reddit/data/events/models/components/RegistrationForm.hashCode:()I
        //  4147: istore          178
        //  4149: aload_0        
        //  4150: getfield        com/reddit/data/events/models/Event.modqueue:Lcom/reddit/data/events/models/components/Modqueue;
        //  4153: astore          4
        //  4155: aload           4
        //  4157: ifnonnull       4166
        //  4160: iconst_0       
        //  4161: istore          179
        //  4163: goto            4173
        //  4166: aload           4
        //  4168: invokevirtual   com/reddit/data/events/models/components/Modqueue.hashCode:()I
        //  4171: istore          179
        //  4173: aload_0        
        //  4174: getfield        com/reddit/data/events/models/Event.modqueue_item:Lcom/reddit/data/events/models/components/ModqueueItem;
        //  4177: astore          4
        //  4179: aload           4
        //  4181: ifnonnull       4190
        //  4184: iconst_0       
        //  4185: istore          180
        //  4187: goto            4197
        //  4190: aload           4
        //  4192: invokevirtual   com/reddit/data/events/models/components/ModqueueItem.hashCode:()I
        //  4195: istore          180
        //  4197: aload_0        
        //  4198: getfield        com/reddit/data/events/models/Event.recap_card:Lcom/reddit/data/events/models/components/RecapCard;
        //  4201: astore          4
        //  4203: aload           4
        //  4205: ifnonnull       4214
        //  4208: iconst_0       
        //  4209: istore          181
        //  4211: goto            4221
        //  4214: aload           4
        //  4216: invokevirtual   com/reddit/data/events/models/components/RecapCard.hashCode:()I
        //  4219: istore          181
        //  4221: aload_0        
        //  4222: getfield        com/reddit/data/events/models/Event.modqueue_trigger:Lcom/reddit/data/events/models/components/ModqueueTrigger;
        //  4225: astore          4
        //  4227: aload           4
        //  4229: ifnonnull       4238
        //  4232: iconst_0       
        //  4233: istore          182
        //  4235: goto            4245
        //  4238: aload           4
        //  4240: invokevirtual   com/reddit/data/events/models/components/ModqueueTrigger.hashCode:()I
        //  4243: istore          182
        //  4245: aload_0        
        //  4246: getfield        com/reddit/data/events/models/Event.modnote:Lcom/reddit/data/events/models/components/ModNote;
        //  4249: astore          4
        //  4251: aload           4
        //  4253: ifnonnull       4262
        //  4256: iconst_0       
        //  4257: istore          183
        //  4259: goto            4269
        //  4262: aload           4
        //  4264: invokevirtual   com/reddit/data/events/models/components/ModNote.hashCode:()I
        //  4267: istore          183
        //  4269: aload_0        
        //  4270: getfield        com/reddit/data/events/models/Event.screen_trace:Lcom/reddit/data/events/models/components/ScreenTrace;
        //  4273: astore          4
        //  4275: aload           4
        //  4277: ifnonnull       4286
        //  4280: iconst_0       
        //  4281: istore          184
        //  4283: goto            4293
        //  4286: aload           4
        //  4288: invokevirtual   com/reddit/data/events/models/components/ScreenTrace.hashCode:()I
        //  4291: istore          184
        //  4293: aload_0        
        //  4294: getfield        com/reddit/data/events/models/Event.rbl_survey:Lcom/reddit/data/events/models/components/RBLSurvey;
        //  4297: astore          4
        //  4299: aload           4
        //  4301: ifnonnull       4310
        //  4304: iconst_0       
        //  4305: istore          185
        //  4307: goto            4317
        //  4310: aload           4
        //  4312: invokevirtual   com/reddit/data/events/models/components/RBLSurvey.hashCode:()I
        //  4315: istore          185
        //  4317: aload_0        
        //  4318: getfield        com/reddit/data/events/models/Event.survey_response:Lcom/reddit/data/events/models/components/SurveyResponse;
        //  4321: astore          4
        //  4323: aload           4
        //  4325: ifnonnull       4334
        //  4328: iconst_0       
        //  4329: istore          186
        //  4331: goto            4341
        //  4334: aload           4
        //  4336: invokevirtual   com/reddit/data/events/models/components/SurveyResponse.hashCode:()I
        //  4339: istore          186
        //  4341: aload_0        
        //  4342: getfield        com/reddit/data/events/models/Event.reddar_settings:Lcom/reddit/data/events/models/components/ReddarSettings;
        //  4345: astore          4
        //  4347: aload           4
        //  4349: ifnonnull       4358
        //  4352: iconst_0       
        //  4353: istore          187
        //  4355: goto            4365
        //  4358: aload           4
        //  4360: invokevirtual   com/reddit/data/events/models/components/ReddarSettings.hashCode:()I
        //  4363: istore          187
        //  4365: aload_0        
        //  4366: getfield        com/reddit/data/events/models/Event.ad_entity:Lcom/reddit/data/events/models/components/AdEntity;
        //  4369: astore          4
        //  4371: aload           4
        //  4373: ifnonnull       4382
        //  4376: iconst_0       
        //  4377: istore          188
        //  4379: goto            4389
        //  4382: aload           4
        //  4384: invokevirtual   com/reddit/data/events/models/components/AdEntity.hashCode:()I
        //  4387: istore          188
        //  4389: aload_0        
        //  4390: getfield        com/reddit/data/events/models/Event.react_source:Lcom/reddit/data/events/models/components/ReactSource;
        //  4393: astore          4
        //  4395: aload           4
        //  4397: ifnonnull       4406
        //  4400: iconst_0       
        //  4401: istore          189
        //  4403: goto            4413
        //  4406: aload           4
        //  4408: invokevirtual   com/reddit/data/events/models/components/ReactSource.hashCode:()I
        //  4411: istore          189
        //  4413: aload_0        
        //  4414: getfield        com/reddit/data/events/models/Event.conversions_onboarding:Lcom/reddit/data/events/models/components/ConversionsOnboarding;
        //  4417: astore          4
        //  4419: aload           4
        //  4421: ifnonnull       4430
        //  4424: iconst_0       
        //  4425: istore          190
        //  4427: goto            4437
        //  4430: aload           4
        //  4432: invokevirtual   com/reddit/data/events/models/components/ConversionsOnboarding.hashCode:()I
        //  4435: istore          190
        //  4437: aload_0        
        //  4438: getfield        com/reddit/data/events/models/Event.theater_mode:Lcom/reddit/data/events/models/components/TheaterMode;
        //  4441: astore          4
        //  4443: aload           4
        //  4445: ifnonnull       4454
        //  4448: iconst_0       
        //  4449: istore          191
        //  4451: goto            4461
        //  4454: aload           4
        //  4456: invokevirtual   com/reddit/data/events/models/components/TheaterMode.hashCode:()I
        //  4459: istore          191
        //  4461: aload_0        
        //  4462: getfield        com/reddit/data/events/models/Event.chain:Lcom/reddit/data/events/models/components/Chain;
        //  4465: astore          4
        //  4467: aload           4
        //  4469: ifnonnull       4478
        //  4472: iconst_0       
        //  4473: istore          192
        //  4475: goto            4485
        //  4478: aload           4
        //  4480: invokevirtual   com/reddit/data/events/models/components/Chain.hashCode:()I
        //  4483: istore          192
        //  4485: aload_0        
        //  4486: getfield        com/reddit/data/events/models/Event.contract:Lcom/reddit/data/events/models/components/Contract;
        //  4489: astore          4
        //  4491: aload           4
        //  4493: ifnonnull       4502
        //  4496: iconst_0       
        //  4497: istore          193
        //  4499: goto            4509
        //  4502: aload           4
        //  4504: invokevirtual   com/reddit/data/events/models/components/Contract.hashCode:()I
        //  4507: istore          193
        //  4509: aload_0        
        //  4510: getfield        com/reddit/data/events/models/Event.token:Lcom/reddit/data/events/models/components/Token;
        //  4513: astore          4
        //  4515: aload           4
        //  4517: ifnonnull       4526
        //  4520: iconst_0       
        //  4521: istore          194
        //  4523: goto            4533
        //  4526: aload           4
        //  4528: invokevirtual   com/reddit/data/events/models/components/Token.hashCode:()I
        //  4531: istore          194
        //  4533: aload_0        
        //  4534: getfield        com/reddit/data/events/models/Event.block:Lcom/reddit/data/events/models/components/Block;
        //  4537: astore          4
        //  4539: aload           4
        //  4541: ifnonnull       4550
        //  4544: iconst_0       
        //  4545: istore          195
        //  4547: goto            4557
        //  4550: aload           4
        //  4552: invokevirtual   com/reddit/data/events/models/components/Block.hashCode:()I
        //  4555: istore          195
        //  4557: aload_0        
        //  4558: getfield        com/reddit/data/events/models/Event.transaction:Lcom/reddit/data/events/models/components/Transaction;
        //  4561: astore          4
        //  4563: aload           4
        //  4565: ifnonnull       4574
        //  4568: iconst_0       
        //  4569: istore          196
        //  4571: goto            4581
        //  4574: aload           4
        //  4576: invokevirtual   com/reddit/data/events/models/components/Transaction.hashCode:()I
        //  4579: istore          196
        //  4581: aload_0        
        //  4582: getfield        com/reddit/data/events/models/Event.transfer:Lcom/reddit/data/events/models/components/Transfer;
        //  4585: astore          4
        //  4587: aload           4
        //  4589: ifnonnull       4598
        //  4592: iconst_0       
        //  4593: istore          197
        //  4595: goto            4605
        //  4598: aload           4
        //  4600: invokevirtual   com/reddit/data/events/models/components/Transfer.hashCode:()I
        //  4603: istore          197
        //  4605: aload_0        
        //  4606: getfield        com/reddit/data/events/models/Event.marketplace:Lcom/reddit/data/events/models/components/Marketplace;
        //  4609: astore          4
        //  4611: aload           4
        //  4613: ifnonnull       4622
        //  4616: iconst_0       
        //  4617: istore          198
        //  4619: goto            4629
        //  4622: aload           4
        //  4624: invokevirtual   com/reddit/data/events/models/components/Marketplace.hashCode:()I
        //  4627: istore          198
        //  4629: aload_0        
        //  4630: getfield        com/reddit/data/events/models/Event.automoderator:Lcom/reddit/data/events/models/components/Automoderator;
        //  4633: astore          4
        //  4635: aload           4
        //  4637: ifnonnull       4646
        //  4640: iconst_0       
        //  4641: istore          199
        //  4643: goto            4653
        //  4646: aload           4
        //  4648: invokevirtual   com/reddit/data/events/models/components/Automoderator.hashCode:()I
        //  4651: istore          199
        //  4653: aload_0        
        //  4654: getfield        com/reddit/data/events/models/Event.access_audit:Lcom/reddit/data/events/models/components/AccessAudit;
        //  4657: astore          4
        //  4659: aload           4
        //  4661: ifnonnull       4670
        //  4664: iconst_0       
        //  4665: istore          200
        //  4667: goto            4677
        //  4670: aload           4
        //  4672: invokevirtual   com/reddit/data/events/models/components/AccessAudit.hashCode:()I
        //  4675: istore          200
        //  4677: aload_0        
        //  4678: getfield        com/reddit/data/events/models/Event.indexing:Lcom/reddit/data/events/models/components/Indexing;
        //  4681: astore          4
        //  4683: aload           4
        //  4685: ifnonnull       4694
        //  4688: iconst_0       
        //  4689: istore          201
        //  4691: goto            4701
        //  4694: aload           4
        //  4696: invokevirtual   com/reddit/data/events/models/components/Indexing.hashCode:()I
        //  4699: istore          201
        //  4701: aload_0        
        //  4702: getfield        com/reddit/data/events/models/Event.ad_preview:Lcom/reddit/data/events/models/components/AdPreview;
        //  4705: astore          4
        //  4707: aload           4
        //  4709: ifnonnull       4718
        //  4712: iconst_0       
        //  4713: istore          202
        //  4715: goto            4725
        //  4718: aload           4
        //  4720: invokevirtual   com/reddit/data/events/models/components/AdPreview.hashCode:()I
        //  4723: istore          202
        //  4725: aload_0        
        //  4726: getfield        com/reddit/data/events/models/Event.user_deactivation_info:Lcom/reddit/data/events/models/components/UserDeactivationInfo;
        //  4729: astore          4
        //  4731: aload           4
        //  4733: ifnonnull       4742
        //  4736: iconst_0       
        //  4737: istore          203
        //  4739: goto            4749
        //  4742: aload           4
        //  4744: invokevirtual   com/reddit/data/events/models/components/UserDeactivationInfo.hashCode:()I
        //  4747: istore          203
        //  4749: aload_0        
        //  4750: getfield        com/reddit/data/events/models/Event.experiments_platform:Lcom/reddit/data/events/models/components/ExperimentsPlatform;
        //  4753: astore          4
        //  4755: aload           4
        //  4757: ifnonnull       4766
        //  4760: iconst_0       
        //  4761: istore          204
        //  4763: goto            4773
        //  4766: aload           4
        //  4768: invokevirtual   com/reddit/data/events/models/components/ExperimentsPlatform.hashCode:()I
        //  4771: istore          204
        //  4773: aload_0        
        //  4774: getfield        com/reddit/data/events/models/Event.comments_load:Lcom/reddit/data/events/models/components/CommentsLoad;
        //  4777: astore          4
        //  4779: aload           4
        //  4781: ifnonnull       4790
        //  4784: iconst_0       
        //  4785: istore          205
        //  4787: goto            4797
        //  4790: aload           4
        //  4792: invokevirtual   com/reddit/data/events/models/components/CommentsLoad.hashCode:()I
        //  4795: istore          205
        //  4797: aload_0        
        //  4798: getfield        com/reddit/data/events/models/Event.geo:Lcom/reddit/data/events/models/components/Geo;
        //  4801: astore          4
        //  4803: aload           4
        //  4805: ifnonnull       4814
        //  4808: iconst_0       
        //  4809: istore          206
        //  4811: goto            4821
        //  4814: aload           4
        //  4816: invokevirtual   com/reddit/data/events/models/components/Geo.hashCode:()I
        //  4819: istore          206
        //  4821: aload_0        
        //  4822: getfield        com/reddit/data/events/models/Event.user_legacy_id:Ljava/lang/String;
        //  4825: astore          4
        //  4827: aload           4
        //  4829: ifnonnull       4838
        //  4832: iconst_0       
        //  4833: istore          207
        //  4835: goto            4845
        //  4838: aload           4
        //  4840: invokevirtual   java/lang/String.hashCode:()I
        //  4843: istore          207
        //  4845: aload_0        
        //  4846: getfield        com/reddit/data/events/models/Event.content_metadata:Lcom/reddit/data/events/models/components/ContentMetadata;
        //  4849: astore          4
        //  4851: aload           4
        //  4853: ifnonnull       4862
        //  4856: iconst_0       
        //  4857: istore          208
        //  4859: goto            4869
        //  4862: aload           4
        //  4864: invokevirtual   com/reddit/data/events/models/components/ContentMetadata.hashCode:()I
        //  4867: istore          208
        //  4869: aload_0        
        //  4870: getfield        com/reddit/data/events/models/Event.url_parsed:Lcom/reddit/data/events/models/components/UrlParsed;
        //  4873: astore          4
        //  4875: aload           4
        //  4877: ifnonnull       4886
        //  4880: iconst_0       
        //  4881: istore          209
        //  4883: goto            4893
        //  4886: aload           4
        //  4888: invokevirtual   com/reddit/data/events/models/components/UrlParsed.hashCode:()I
        //  4891: istore          209
        //  4893: aload_0        
        //  4894: getfield        com/reddit/data/events/models/Event.link_sharing:Lcom/reddit/data/events/models/components/LinkSharing;
        //  4897: astore          4
        //  4899: aload           4
        //  4901: ifnonnull       4910
        //  4904: iconst_0       
        //  4905: istore          210
        //  4907: goto            4917
        //  4910: aload           4
        //  4912: invokevirtual   com/reddit/data/events/models/components/LinkSharing.hashCode:()I
        //  4915: istore          210
        //  4917: aload_0        
        //  4918: getfield        com/reddit/data/events/models/Event.create_request_timestamp:Ljava/lang/Long;
        //  4921: astore          4
        //  4923: aload           4
        //  4925: ifnonnull       4934
        //  4928: iconst_0       
        //  4929: istore          211
        //  4931: goto            4941
        //  4934: aload           4
        //  4936: invokevirtual   java/lang/Long.hashCode:()I
        //  4939: istore          211
        //  4941: aload_0        
        //  4942: getfield        com/reddit/data/events/models/Event.inferred:Lcom/reddit/data/events/models/components/Inferred;
        //  4945: astore          4
        //  4947: aload           4
        //  4949: ifnonnull       4958
        //  4952: iconst_0       
        //  4953: istore          212
        //  4955: goto            4965
        //  4958: aload           4
        //  4960: invokevirtual   com/reddit/data/events/models/components/Inferred.hashCode:()I
        //  4963: istore          212
        //  4965: aload_0        
        //  4966: getfield        com/reddit/data/events/models/Event.event_hmac_key:Ljava/lang/String;
        //  4969: astore          4
        //  4971: aload           4
        //  4973: ifnonnull       4982
        //  4976: iconst_0       
        //  4977: istore          213
        //  4979: goto            4989
        //  4982: aload           4
        //  4984: invokevirtual   java/lang/String.hashCode:()I
        //  4987: istore          213
        //  4989: aload_0        
        //  4990: getfield        com/reddit/data/events/models/Event.batch_load_id:Ljava/lang/String;
        //  4993: astore          4
        //  4995: aload           4
        //  4997: ifnonnull       5006
        //  5000: iconst_0       
        //  5001: istore          214
        //  5003: goto            5013
        //  5006: aload           4
        //  5008: invokevirtual   java/lang/String.hashCode:()I
        //  5011: istore          214
        //  5013: aload_0        
        //  5014: getfield        com/reddit/data/events/models/Event.ip_splitting:Lcom/reddit/data/events/models/components/IPSplitting;
        //  5017: astore          4
        //  5019: aload           4
        //  5021: ifnonnull       5030
        //  5024: iconst_0       
        //  5025: istore          215
        //  5027: goto            5037
        //  5030: aload           4
        //  5032: invokevirtual   com/reddit/data/events/models/components/IPSplitting.hashCode:()I
        //  5035: istore          215
        //  5037: aload_0        
        //  5038: getfield        com/reddit/data/events/models/Event.collector:Ljava/lang/String;
        //  5041: astore          4
        //  5043: aload           4
        //  5045: ifnonnull       5054
        //  5048: iconst_0       
        //  5049: istore          216
        //  5051: goto            5061
        //  5054: aload           4
        //  5056: invokevirtual   java/lang/String.hashCode:()I
        //  5059: istore          216
        //  5061: aload_0        
        //  5062: getfield        com/reddit/data/events/models/Event.collector_consistency_checksum:Ljava/lang/String;
        //  5065: astore          4
        //  5067: aload           4
        //  5069: ifnonnull       5075
        //  5072: goto            5082
        //  5075: aload           4
        //  5077: invokevirtual   java/lang/String.hashCode:()I
        //  5080: istore          5
        //  5082: iload_1        
        //  5083: ldc_w           16777619
        //  5086: ixor           
        //  5087: ldc_w           -2128831035
        //  5090: imul           
        //  5091: iload_2        
        //  5092: ixor           
        //  5093: ldc_w           -2128831035
        //  5096: imul           
        //  5097: iload_3        
        //  5098: ixor           
        //  5099: ldc_w           -2128831035
        //  5102: imul           
        //  5103: iload           6
        //  5105: ixor           
        //  5106: ldc_w           -2128831035
        //  5109: imul           
        //  5110: iload           7
        //  5112: ixor           
        //  5113: ldc_w           -2128831035
        //  5116: imul           
        //  5117: iload           8
        //  5119: ixor           
        //  5120: ldc_w           -2128831035
        //  5123: imul           
        //  5124: iload           9
        //  5126: ixor           
        //  5127: ldc_w           -2128831035
        //  5130: imul           
        //  5131: iload           10
        //  5133: ixor           
        //  5134: ldc_w           -2128831035
        //  5137: imul           
        //  5138: iload           11
        //  5140: ixor           
        //  5141: ldc_w           -2128831035
        //  5144: imul           
        //  5145: iload           12
        //  5147: ixor           
        //  5148: ldc_w           -2128831035
        //  5151: imul           
        //  5152: iload           13
        //  5154: ixor           
        //  5155: ldc_w           -2128831035
        //  5158: imul           
        //  5159: iload           14
        //  5161: ixor           
        //  5162: ldc_w           -2128831035
        //  5165: imul           
        //  5166: iload           15
        //  5168: ixor           
        //  5169: ldc_w           -2128831035
        //  5172: imul           
        //  5173: iload           16
        //  5175: ixor           
        //  5176: ldc_w           -2128831035
        //  5179: imul           
        //  5180: iload           17
        //  5182: ixor           
        //  5183: ldc_w           -2128831035
        //  5186: imul           
        //  5187: iload           18
        //  5189: ixor           
        //  5190: ldc_w           -2128831035
        //  5193: imul           
        //  5194: iload           19
        //  5196: ixor           
        //  5197: ldc_w           -2128831035
        //  5200: imul           
        //  5201: iload           20
        //  5203: ixor           
        //  5204: ldc_w           -2128831035
        //  5207: imul           
        //  5208: iload           21
        //  5210: ixor           
        //  5211: ldc_w           -2128831035
        //  5214: imul           
        //  5215: iload           22
        //  5217: ixor           
        //  5218: ldc_w           -2128831035
        //  5221: imul           
        //  5222: iload           23
        //  5224: ixor           
        //  5225: ldc_w           -2128831035
        //  5228: imul           
        //  5229: iload           24
        //  5231: ixor           
        //  5232: ldc_w           -2128831035
        //  5235: imul           
        //  5236: iload           25
        //  5238: ixor           
        //  5239: ldc_w           -2128831035
        //  5242: imul           
        //  5243: iload           26
        //  5245: ixor           
        //  5246: ldc_w           -2128831035
        //  5249: imul           
        //  5250: iload           27
        //  5252: ixor           
        //  5253: ldc_w           -2128831035
        //  5256: imul           
        //  5257: iload           28
        //  5259: ixor           
        //  5260: ldc_w           -2128831035
        //  5263: imul           
        //  5264: iload           29
        //  5266: ixor           
        //  5267: ldc_w           -2128831035
        //  5270: imul           
        //  5271: iload           30
        //  5273: ixor           
        //  5274: ldc_w           -2128831035
        //  5277: imul           
        //  5278: iload           31
        //  5280: ixor           
        //  5281: ldc_w           -2128831035
        //  5284: imul           
        //  5285: iload           32
        //  5287: ixor           
        //  5288: ldc_w           -2128831035
        //  5291: imul           
        //  5292: iload           33
        //  5294: ixor           
        //  5295: ldc_w           -2128831035
        //  5298: imul           
        //  5299: iload           34
        //  5301: ixor           
        //  5302: ldc_w           -2128831035
        //  5305: imul           
        //  5306: iload           35
        //  5308: ixor           
        //  5309: ldc_w           -2128831035
        //  5312: imul           
        //  5313: iload           36
        //  5315: ixor           
        //  5316: ldc_w           -2128831035
        //  5319: imul           
        //  5320: iload           37
        //  5322: ixor           
        //  5323: ldc_w           -2128831035
        //  5326: imul           
        //  5327: iload           38
        //  5329: ixor           
        //  5330: ldc_w           -2128831035
        //  5333: imul           
        //  5334: iload           39
        //  5336: ixor           
        //  5337: ldc_w           -2128831035
        //  5340: imul           
        //  5341: iload           40
        //  5343: ixor           
        //  5344: ldc_w           -2128831035
        //  5347: imul           
        //  5348: iload           41
        //  5350: ixor           
        //  5351: ldc_w           -2128831035
        //  5354: imul           
        //  5355: iload           42
        //  5357: ixor           
        //  5358: ldc_w           -2128831035
        //  5361: imul           
        //  5362: iload           43
        //  5364: ixor           
        //  5365: ldc_w           -2128831035
        //  5368: imul           
        //  5369: iload           44
        //  5371: ixor           
        //  5372: ldc_w           -2128831035
        //  5375: imul           
        //  5376: iload           45
        //  5378: ixor           
        //  5379: ldc_w           -2128831035
        //  5382: imul           
        //  5383: iload           46
        //  5385: ixor           
        //  5386: ldc_w           -2128831035
        //  5389: imul           
        //  5390: iload           47
        //  5392: ixor           
        //  5393: ldc_w           -2128831035
        //  5396: imul           
        //  5397: iload           48
        //  5399: ixor           
        //  5400: ldc_w           -2128831035
        //  5403: imul           
        //  5404: iload           49
        //  5406: ixor           
        //  5407: ldc_w           -2128831035
        //  5410: imul           
        //  5411: iload           50
        //  5413: ixor           
        //  5414: ldc_w           -2128831035
        //  5417: imul           
        //  5418: iload           51
        //  5420: ixor           
        //  5421: ldc_w           -2128831035
        //  5424: imul           
        //  5425: iload           52
        //  5427: ixor           
        //  5428: ldc_w           -2128831035
        //  5431: imul           
        //  5432: iload           53
        //  5434: ixor           
        //  5435: ldc_w           -2128831035
        //  5438: imul           
        //  5439: iload           54
        //  5441: ixor           
        //  5442: ldc_w           -2128831035
        //  5445: imul           
        //  5446: iload           55
        //  5448: ixor           
        //  5449: ldc_w           -2128831035
        //  5452: imul           
        //  5453: iload           56
        //  5455: ixor           
        //  5456: ldc_w           -2128831035
        //  5459: imul           
        //  5460: iload           57
        //  5462: ixor           
        //  5463: ldc_w           -2128831035
        //  5466: imul           
        //  5467: iload           58
        //  5469: ixor           
        //  5470: ldc_w           -2128831035
        //  5473: imul           
        //  5474: iload           59
        //  5476: ixor           
        //  5477: ldc_w           -2128831035
        //  5480: imul           
        //  5481: iload           60
        //  5483: ixor           
        //  5484: ldc_w           -2128831035
        //  5487: imul           
        //  5488: iload           61
        //  5490: ixor           
        //  5491: ldc_w           -2128831035
        //  5494: imul           
        //  5495: iload           62
        //  5497: ixor           
        //  5498: ldc_w           -2128831035
        //  5501: imul           
        //  5502: iload           63
        //  5504: ixor           
        //  5505: ldc_w           -2128831035
        //  5508: imul           
        //  5509: iload           64
        //  5511: ixor           
        //  5512: ldc_w           -2128831035
        //  5515: imul           
        //  5516: iload           65
        //  5518: ixor           
        //  5519: ldc_w           -2128831035
        //  5522: imul           
        //  5523: iload           66
        //  5525: ixor           
        //  5526: ldc_w           -2128831035
        //  5529: imul           
        //  5530: iload           67
        //  5532: ixor           
        //  5533: ldc_w           -2128831035
        //  5536: imul           
        //  5537: iload           68
        //  5539: ixor           
        //  5540: ldc_w           -2128831035
        //  5543: imul           
        //  5544: iload           69
        //  5546: ixor           
        //  5547: ldc_w           -2128831035
        //  5550: imul           
        //  5551: iload           70
        //  5553: ixor           
        //  5554: ldc_w           -2128831035
        //  5557: imul           
        //  5558: iload           71
        //  5560: ixor           
        //  5561: ldc_w           -2128831035
        //  5564: imul           
        //  5565: iload           72
        //  5567: ixor           
        //  5568: ldc_w           -2128831035
        //  5571: imul           
        //  5572: iload           73
        //  5574: ixor           
        //  5575: ldc_w           -2128831035
        //  5578: imul           
        //  5579: iload           74
        //  5581: ixor           
        //  5582: ldc_w           -2128831035
        //  5585: imul           
        //  5586: iload           75
        //  5588: ixor           
        //  5589: ldc_w           -2128831035
        //  5592: imul           
        //  5593: iload           76
        //  5595: ixor           
        //  5596: ldc_w           -2128831035
        //  5599: imul           
        //  5600: iload           77
        //  5602: ixor           
        //  5603: ldc_w           -2128831035
        //  5606: imul           
        //  5607: iload           78
        //  5609: ixor           
        //  5610: ldc_w           -2128831035
        //  5613: imul           
        //  5614: iload           79
        //  5616: ixor           
        //  5617: ldc_w           -2128831035
        //  5620: imul           
        //  5621: iload           80
        //  5623: ixor           
        //  5624: ldc_w           -2128831035
        //  5627: imul           
        //  5628: iload           81
        //  5630: ixor           
        //  5631: ldc_w           -2128831035
        //  5634: imul           
        //  5635: iload           82
        //  5637: ixor           
        //  5638: ldc_w           -2128831035
        //  5641: imul           
        //  5642: iload           83
        //  5644: ixor           
        //  5645: ldc_w           -2128831035
        //  5648: imul           
        //  5649: iload           84
        //  5651: ixor           
        //  5652: ldc_w           -2128831035
        //  5655: imul           
        //  5656: iload           85
        //  5658: ixor           
        //  5659: ldc_w           -2128831035
        //  5662: imul           
        //  5663: iload           86
        //  5665: ixor           
        //  5666: ldc_w           -2128831035
        //  5669: imul           
        //  5670: iload           87
        //  5672: ixor           
        //  5673: ldc_w           -2128831035
        //  5676: imul           
        //  5677: iload           88
        //  5679: ixor           
        //  5680: ldc_w           -2128831035
        //  5683: imul           
        //  5684: iload           89
        //  5686: ixor           
        //  5687: ldc_w           -2128831035
        //  5690: imul           
        //  5691: iload           90
        //  5693: ixor           
        //  5694: ldc_w           -2128831035
        //  5697: imul           
        //  5698: iload           91
        //  5700: ixor           
        //  5701: ldc_w           -2128831035
        //  5704: imul           
        //  5705: iload           92
        //  5707: ixor           
        //  5708: ldc_w           -2128831035
        //  5711: imul           
        //  5712: iload           93
        //  5714: ixor           
        //  5715: ldc_w           -2128831035
        //  5718: imul           
        //  5719: iload           94
        //  5721: ixor           
        //  5722: ldc_w           -2128831035
        //  5725: imul           
        //  5726: iload           95
        //  5728: ixor           
        //  5729: ldc_w           -2128831035
        //  5732: imul           
        //  5733: iload           96
        //  5735: ixor           
        //  5736: ldc_w           -2128831035
        //  5739: imul           
        //  5740: iload           97
        //  5742: ixor           
        //  5743: ldc_w           -2128831035
        //  5746: imul           
        //  5747: iload           98
        //  5749: ixor           
        //  5750: ldc_w           -2128831035
        //  5753: imul           
        //  5754: iload           99
        //  5756: ixor           
        //  5757: ldc_w           -2128831035
        //  5760: imul           
        //  5761: iload           100
        //  5763: ixor           
        //  5764: ldc_w           -2128831035
        //  5767: imul           
        //  5768: iload           101
        //  5770: ixor           
        //  5771: ldc_w           -2128831035
        //  5774: imul           
        //  5775: iload           102
        //  5777: ixor           
        //  5778: ldc_w           -2128831035
        //  5781: imul           
        //  5782: iload           103
        //  5784: ixor           
        //  5785: ldc_w           -2128831035
        //  5788: imul           
        //  5789: iload           104
        //  5791: ixor           
        //  5792: ldc_w           -2128831035
        //  5795: imul           
        //  5796: iload           105
        //  5798: ixor           
        //  5799: ldc_w           -2128831035
        //  5802: imul           
        //  5803: iload           106
        //  5805: ixor           
        //  5806: ldc_w           -2128831035
        //  5809: imul           
        //  5810: iload           107
        //  5812: ixor           
        //  5813: ldc_w           -2128831035
        //  5816: imul           
        //  5817: iload           108
        //  5819: ixor           
        //  5820: ldc_w           -2128831035
        //  5823: imul           
        //  5824: iload           109
        //  5826: ixor           
        //  5827: ldc_w           -2128831035
        //  5830: imul           
        //  5831: iload           110
        //  5833: ixor           
        //  5834: ldc_w           -2128831035
        //  5837: imul           
        //  5838: iload           111
        //  5840: ixor           
        //  5841: ldc_w           -2128831035
        //  5844: imul           
        //  5845: iload           112
        //  5847: ixor           
        //  5848: ldc_w           -2128831035
        //  5851: imul           
        //  5852: iload           113
        //  5854: ixor           
        //  5855: ldc_w           -2128831035
        //  5858: imul           
        //  5859: iload           114
        //  5861: ixor           
        //  5862: ldc_w           -2128831035
        //  5865: imul           
        //  5866: iload           115
        //  5868: ixor           
        //  5869: ldc_w           -2128831035
        //  5872: imul           
        //  5873: iload           116
        //  5875: ixor           
        //  5876: ldc_w           -2128831035
        //  5879: imul           
        //  5880: iload           117
        //  5882: ixor           
        //  5883: ldc_w           -2128831035
        //  5886: imul           
        //  5887: iload           118
        //  5889: ixor           
        //  5890: ldc_w           -2128831035
        //  5893: imul           
        //  5894: iload           119
        //  5896: ixor           
        //  5897: ldc_w           -2128831035
        //  5900: imul           
        //  5901: iload           120
        //  5903: ixor           
        //  5904: ldc_w           -2128831035
        //  5907: imul           
        //  5908: iload           121
        //  5910: ixor           
        //  5911: ldc_w           -2128831035
        //  5914: imul           
        //  5915: iload           122
        //  5917: ixor           
        //  5918: ldc_w           -2128831035
        //  5921: imul           
        //  5922: iload           123
        //  5924: ixor           
        //  5925: ldc_w           -2128831035
        //  5928: imul           
        //  5929: iload           124
        //  5931: ixor           
        //  5932: ldc_w           -2128831035
        //  5935: imul           
        //  5936: iload           125
        //  5938: ixor           
        //  5939: ldc_w           -2128831035
        //  5942: imul           
        //  5943: iload           126
        //  5945: ixor           
        //  5946: ldc_w           -2128831035
        //  5949: imul           
        //  5950: iload           127
        //  5952: ixor           
        //  5953: ldc_w           -2128831035
        //  5956: imul           
        //  5957: iload           128
        //  5959: ixor           
        //  5960: ldc_w           -2128831035
        //  5963: imul           
        //  5964: iload           129
        //  5966: ixor           
        //  5967: ldc_w           -2128831035
        //  5970: imul           
        //  5971: iload           130
        //  5973: ixor           
        //  5974: ldc_w           -2128831035
        //  5977: imul           
        //  5978: iload           131
        //  5980: ixor           
        //  5981: ldc_w           -2128831035
        //  5984: imul           
        //  5985: iload           132
        //  5987: ixor           
        //  5988: ldc_w           -2128831035
        //  5991: imul           
        //  5992: iload           133
        //  5994: ixor           
        //  5995: ldc_w           -2128831035
        //  5998: imul           
        //  5999: iload           134
        //  6001: ixor           
        //  6002: ldc_w           -2128831035
        //  6005: imul           
        //  6006: iload           135
        //  6008: ixor           
        //  6009: ldc_w           -2128831035
        //  6012: imul           
        //  6013: iload           136
        //  6015: ixor           
        //  6016: ldc_w           -2128831035
        //  6019: imul           
        //  6020: iload           137
        //  6022: ixor           
        //  6023: ldc_w           -2128831035
        //  6026: imul           
        //  6027: iload           138
        //  6029: ixor           
        //  6030: ldc_w           -2128831035
        //  6033: imul           
        //  6034: iload           139
        //  6036: ixor           
        //  6037: ldc_w           -2128831035
        //  6040: imul           
        //  6041: iload           140
        //  6043: ixor           
        //  6044: ldc_w           -2128831035
        //  6047: imul           
        //  6048: iload           141
        //  6050: ixor           
        //  6051: ldc_w           -2128831035
        //  6054: imul           
        //  6055: iload           142
        //  6057: ixor           
        //  6058: ldc_w           -2128831035
        //  6061: imul           
        //  6062: iload           143
        //  6064: ixor           
        //  6065: ldc_w           -2128831035
        //  6068: imul           
        //  6069: iload           144
        //  6071: ixor           
        //  6072: ldc_w           -2128831035
        //  6075: imul           
        //  6076: iload           145
        //  6078: ixor           
        //  6079: ldc_w           -2128831035
        //  6082: imul           
        //  6083: iload           146
        //  6085: ixor           
        //  6086: ldc_w           -2128831035
        //  6089: imul           
        //  6090: iload           147
        //  6092: ixor           
        //  6093: ldc_w           -2128831035
        //  6096: imul           
        //  6097: iload           148
        //  6099: ixor           
        //  6100: ldc_w           -2128831035
        //  6103: imul           
        //  6104: iload           149
        //  6106: ixor           
        //  6107: ldc_w           -2128831035
        //  6110: imul           
        //  6111: iload           150
        //  6113: ixor           
        //  6114: ldc_w           -2128831035
        //  6117: imul           
        //  6118: iload           151
        //  6120: ixor           
        //  6121: ldc_w           -2128831035
        //  6124: imul           
        //  6125: iload           152
        //  6127: ixor           
        //  6128: ldc_w           -2128831035
        //  6131: imul           
        //  6132: iload           153
        //  6134: ixor           
        //  6135: ldc_w           -2128831035
        //  6138: imul           
        //  6139: iload           154
        //  6141: ixor           
        //  6142: ldc_w           -2128831035
        //  6145: imul           
        //  6146: iload           155
        //  6148: ixor           
        //  6149: ldc_w           -2128831035
        //  6152: imul           
        //  6153: iload           156
        //  6155: ixor           
        //  6156: ldc_w           -2128831035
        //  6159: imul           
        //  6160: iload           157
        //  6162: ixor           
        //  6163: ldc_w           -2128831035
        //  6166: imul           
        //  6167: iload           158
        //  6169: ixor           
        //  6170: ldc_w           -2128831035
        //  6173: imul           
        //  6174: iload           159
        //  6176: ixor           
        //  6177: ldc_w           -2128831035
        //  6180: imul           
        //  6181: iload           160
        //  6183: ixor           
        //  6184: ldc_w           -2128831035
        //  6187: imul           
        //  6188: iload           161
        //  6190: ixor           
        //  6191: ldc_w           -2128831035
        //  6194: imul           
        //  6195: iload           162
        //  6197: ixor           
        //  6198: ldc_w           -2128831035
        //  6201: imul           
        //  6202: iload           163
        //  6204: ixor           
        //  6205: ldc_w           -2128831035
        //  6208: imul           
        //  6209: iload           164
        //  6211: ixor           
        //  6212: ldc_w           -2128831035
        //  6215: imul           
        //  6216: iload           165
        //  6218: ixor           
        //  6219: ldc_w           -2128831035
        //  6222: imul           
        //  6223: iload           166
        //  6225: ixor           
        //  6226: ldc_w           -2128831035
        //  6229: imul           
        //  6230: iload           167
        //  6232: ixor           
        //  6233: ldc_w           -2128831035
        //  6236: imul           
        //  6237: iload           168
        //  6239: ixor           
        //  6240: ldc_w           -2128831035
        //  6243: imul           
        //  6244: iload           169
        //  6246: ixor           
        //  6247: ldc_w           -2128831035
        //  6250: imul           
        //  6251: iload           170
        //  6253: ixor           
        //  6254: ldc_w           -2128831035
        //  6257: imul           
        //  6258: iload           171
        //  6260: ixor           
        //  6261: ldc_w           -2128831035
        //  6264: imul           
        //  6265: iload           172
        //  6267: ixor           
        //  6268: ldc_w           -2128831035
        //  6271: imul           
        //  6272: iload           173
        //  6274: ixor           
        //  6275: ldc_w           -2128831035
        //  6278: imul           
        //  6279: iload           174
        //  6281: ixor           
        //  6282: ldc_w           -2128831035
        //  6285: imul           
        //  6286: iload           175
        //  6288: ixor           
        //  6289: ldc_w           -2128831035
        //  6292: imul           
        //  6293: iload           176
        //  6295: ixor           
        //  6296: ldc_w           -2128831035
        //  6299: imul           
        //  6300: iload           177
        //  6302: ixor           
        //  6303: ldc_w           -2128831035
        //  6306: imul           
        //  6307: iload           178
        //  6309: ixor           
        //  6310: ldc_w           -2128831035
        //  6313: imul           
        //  6314: iload           179
        //  6316: ixor           
        //  6317: ldc_w           -2128831035
        //  6320: imul           
        //  6321: iload           180
        //  6323: ixor           
        //  6324: ldc_w           -2128831035
        //  6327: imul           
        //  6328: iload           181
        //  6330: ixor           
        //  6331: ldc_w           -2128831035
        //  6334: imul           
        //  6335: iload           182
        //  6337: ixor           
        //  6338: ldc_w           -2128831035
        //  6341: imul           
        //  6342: iload           183
        //  6344: ixor           
        //  6345: ldc_w           -2128831035
        //  6348: imul           
        //  6349: iload           184
        //  6351: ixor           
        //  6352: ldc_w           -2128831035
        //  6355: imul           
        //  6356: iload           185
        //  6358: ixor           
        //  6359: ldc_w           -2128831035
        //  6362: imul           
        //  6363: iload           186
        //  6365: ixor           
        //  6366: ldc_w           -2128831035
        //  6369: imul           
        //  6370: iload           187
        //  6372: ixor           
        //  6373: ldc_w           -2128831035
        //  6376: imul           
        //  6377: iload           188
        //  6379: ixor           
        //  6380: ldc_w           -2128831035
        //  6383: imul           
        //  6384: iload           189
        //  6386: ixor           
        //  6387: ldc_w           -2128831035
        //  6390: imul           
        //  6391: iload           190
        //  6393: ixor           
        //  6394: ldc_w           -2128831035
        //  6397: imul           
        //  6398: iload           191
        //  6400: ixor           
        //  6401: ldc_w           -2128831035
        //  6404: imul           
        //  6405: iload           192
        //  6407: ixor           
        //  6408: ldc_w           -2128831035
        //  6411: imul           
        //  6412: iload           193
        //  6414: ixor           
        //  6415: ldc_w           -2128831035
        //  6418: imul           
        //  6419: iload           194
        //  6421: ixor           
        //  6422: ldc_w           -2128831035
        //  6425: imul           
        //  6426: iload           195
        //  6428: ixor           
        //  6429: ldc_w           -2128831035
        //  6432: imul           
        //  6433: iload           196
        //  6435: ixor           
        //  6436: ldc_w           -2128831035
        //  6439: imul           
        //  6440: iload           197
        //  6442: ixor           
        //  6443: ldc_w           -2128831035
        //  6446: imul           
        //  6447: iload           198
        //  6449: ixor           
        //  6450: ldc_w           -2128831035
        //  6453: imul           
        //  6454: iload           199
        //  6456: ixor           
        //  6457: ldc_w           -2128831035
        //  6460: imul           
        //  6461: iload           200
        //  6463: ixor           
        //  6464: ldc_w           -2128831035
        //  6467: imul           
        //  6468: iload           201
        //  6470: ixor           
        //  6471: ldc_w           -2128831035
        //  6474: imul           
        //  6475: iload           202
        //  6477: ixor           
        //  6478: ldc_w           -2128831035
        //  6481: imul           
        //  6482: iload           203
        //  6484: ixor           
        //  6485: ldc_w           -2128831035
        //  6488: imul           
        //  6489: iload           204
        //  6491: ixor           
        //  6492: ldc_w           -2128831035
        //  6495: imul           
        //  6496: iload           205
        //  6498: ixor           
        //  6499: ldc_w           -2128831035
        //  6502: imul           
        //  6503: iload           206
        //  6505: ixor           
        //  6506: ldc_w           -2128831035
        //  6509: imul           
        //  6510: iload           207
        //  6512: ixor           
        //  6513: ldc_w           -2128831035
        //  6516: imul           
        //  6517: iload           208
        //  6519: ixor           
        //  6520: ldc_w           -2128831035
        //  6523: imul           
        //  6524: iload           209
        //  6526: ixor           
        //  6527: ldc_w           -2128831035
        //  6530: imul           
        //  6531: iload           210
        //  6533: ixor           
        //  6534: ldc_w           -2128831035
        //  6537: imul           
        //  6538: iload           211
        //  6540: ixor           
        //  6541: ldc_w           -2128831035
        //  6544: imul           
        //  6545: iload           212
        //  6547: ixor           
        //  6548: ldc_w           -2128831035
        //  6551: imul           
        //  6552: iload           213
        //  6554: ixor           
        //  6555: ldc_w           -2128831035
        //  6558: imul           
        //  6559: iload           214
        //  6561: ixor           
        //  6562: ldc_w           -2128831035
        //  6565: imul           
        //  6566: iload           215
        //  6568: ixor           
        //  6569: ldc_w           -2128831035
        //  6572: imul           
        //  6573: iload           216
        //  6575: ixor           
        //  6576: ldc_w           -2128831035
        //  6579: imul           
        //  6580: iload           5
        //  6582: ixor           
        //  6583: ldc_w           -2128831035
        //  6586: imul           
        //  6587: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.StackOverflowError
        //     at java.util.Vector.contains(Unknown Source)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:828)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1130)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1670)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:373)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    public String toString() {
        final StringBuilder r = a.r("Event{source=");
        r.append(this.source);
        r.append(", action=");
        r.append(this.action);
        r.append(", noun=");
        r.append(this.noun);
        r.append(", endpoint_timestamp=");
        r.append(this.endpoint_timestamp);
        r.append(", client_timestamp=");
        r.append(this.client_timestamp);
        r.append(", uuid=");
        r.append(this.uuid);
        r.append(", utc_offset=");
        r.append(this.utc_offset);
        r.append(", correlation_id=");
        r.append(this.correlation_id);
        r.append(", screenview_id=");
        r.append(this.screenview_id);
        r.append(", post=");
        r.append(this.post);
        r.append(", listing=");
        r.append(this.listing);
        r.append(", comment=");
        r.append(this.comment);
        r.append(", notification=");
        r.append(this.notification);
        r.append(", oauth=");
        r.append(this.oauth);
        r.append(", screen=");
        r.append(this.screen);
        r.append(", app=");
        r.append(this.app);
        r.append(", platform=");
        r.append(this.platform);
        r.append(", request=");
        r.append(this.request);
        r.append(", referrer=");
        r.append(this.referrer);
        r.append(", dom_timer=");
        r.append(this.dom_timer);
        r.append(", user=");
        r.append(this.user);
        r.append(", user_preferences=");
        r.append(this.user_preferences);
        r.append(", subreddit=");
        r.append(this.subreddit);
        r.append(", session=");
        r.append(this.session);
        r.append(", action_info=");
        r.append(this.action_info);
        r.append(", expand=");
        r.append(this.expand);
        r.append(", media=");
        r.append(this.media);
        r.append(", chat=");
        r.append(this.chat);
        r.append(", post_composer=");
        r.append(this.post_composer);
        r.append(", widget=");
        r.append(this.widget);
        r.append(", profile=");
        r.append(this.profile);
        r.append(", onboarding=");
        r.append(this.onboarding);
        r.append(", timer=");
        r.append(this.timer);
        r.append(", tfa=");
        r.append(this.tfa);
        r.append(", api_response=");
        r.append(this.api_response);
        r.append(", api=");
        r.append(this.api);
        r.append(", discovery_unit=");
        r.append(this.discovery_unit);
        r.append(", experiment=");
        r.append(this.experiment);
        r.append(", share=");
        r.append(this.share);
        r.append(", user_subreddit=");
        r.append(this.user_subreddit);
        r.append(", notification_request=");
        r.append(this.notification_request);
        r.append(", search=");
        r.append(this.search);
        r.append(", message=");
        r.append(this.message);
        r.append(", admin=");
        r.append(this.admin);
        r.append(", ticket=");
        r.append(this.ticket);
        r.append(", mailroom_request=");
        r.append(this.mailroom_request);
        r.append(", comment_composer=");
        r.append(this.comment_composer);
        r.append(", gold_purchase=");
        r.append(this.gold_purchase);
        r.append(", payment=");
        r.append(this.payment);
        r.append(", news=");
        r.append(this.news);
        r.append(", outbound=");
        r.append(this.outbound);
        r.append(", click_test=");
        r.append(this.click_test);
        r.append(", carousel=");
        r.append(this.carousel);
        r.append(", adblock=");
        r.append(this.adblock);
        r.append(", email=");
        r.append(this.email);
        r.append(", metaflair=");
        r.append(this.metaflair);
        r.append(", post_draft=");
        r.append(this.post_draft);
        r.append(", setting=");
        r.append(this.setting);
        r.append(", visibility=");
        r.append(this.visibility);
        r.append(", webhook=");
        r.append(this.webhook);
        r.append(", relevance_model=");
        r.append(this.relevance_model);
        r.append(", meta_search=");
        r.append(this.meta_search);
        r.append(", post_flair=");
        r.append(this.post_flair);
        r.append(", admin_action=");
        r.append(this.admin_action);
        r.append(", zipkin=");
        r.append(this.zipkin);
        r.append(", edit=");
        r.append(this.edit);
        r.append(", post_event=");
        r.append(this.post_event);
        r.append(", post_collection=");
        r.append(this.post_collection);
        r.append(", third_party_badge=");
        r.append(this.third_party_badge);
        r.append(", brand=");
        r.append(this.brand);
        r.append(", messenger_request=");
        r.append(this.messenger_request);
        r.append(", banner=");
        r.append(this.banner);
        r.append(", tooltip=");
        r.append(this.tooltip);
        r.append(", upload=");
        r.append(this.upload);
        r.append(", csai_media=");
        r.append(this.csai_media);
        r.append(", category_header=");
        r.append(this.category_header);
        r.append(", report=");
        r.append(this.report);
        r.append(", live_thread=");
        r.append(this.live_thread);
        r.append(", ad_request=");
        r.append(this.ad_request);
        r.append(", ad_decision=");
        r.append(this.ad_decision);
        r.append(", ad_push=");
        r.append(this.ad_push);
        r.append(", vote=");
        r.append(this.vote);
        r.append(", popup=");
        r.append(this.popup);
        r.append(", mod_action=");
        r.append(this.mod_action);
        r.append(", user_flair=");
        r.append(this.user_flair);
        r.append(", topic_tag=");
        r.append(this.topic_tag);
        r.append(", res=");
        r.append(this.res);
        r.append(", ad=");
        r.append(this.ad);
        r.append(", ad_campaign=");
        r.append(this.ad_campaign);
        r.append(", ad_group=");
        r.append(this.ad_group);
        r.append(", ad_targeting=");
        r.append(this.ad_targeting);
        r.append(", business_info=");
        r.append(this.business_info);
        r.append(", billing_info=");
        r.append(this.billing_info);
        r.append(", reddar_ticket=");
        r.append(this.reddar_ticket);
        r.append(", zendesk_ticket=");
        r.append(this.zendesk_ticket);
        r.append(", target_user=");
        r.append(this.target_user);
        r.append(", crawler=");
        r.append(this.crawler);
        r.append(", response=");
        r.append(this.response);
        r.append(", custom_feed=");
        r.append(this.custom_feed);
        r.append(", pwa=");
        r.append(this.pwa);
        r.append(", seo=");
        r.append(this.seo);
        r.append(", ncmec_report=");
        r.append(this.ncmec_report);
        r.append(", funding_instrument=");
        r.append(this.funding_instrument);
        r.append(", grapeshot_classification=");
        r.append(this.grapeshot_classification);
        r.append(", perspective=");
        r.append(this.perspective);
        r.append(", comment_draft=");
        r.append(this.comment_draft);
        r.append(", target_post=");
        r.append(this.target_post);
        r.append(", ml_model=");
        r.append(this.ml_model);
        r.append(", topic_metadata=");
        r.append(this.topic_metadata);
        r.append(", chat_home_feed_boosting=");
        r.append(this.chat_home_feed_boosting);
        r.append(", domain_ban=");
        r.append(this.domain_ban);
        r.append(", legal_export_request=");
        r.append(this.legal_export_request);
        r.append(", post_requirement=");
        r.append(this.post_requirement);
        r.append(", target_ip=");
        r.append(this.target_ip);
        r.append(", crowd_control=");
        r.append(this.crowd_control);
        r.append(", reddar_ticket_content=");
        r.append(this.reddar_ticket_content);
        r.append(", scheduled_post=");
        r.append(this.scheduled_post);
        r.append(", poll=");
        r.append(this.poll);
        r.append(", reddar_audit=");
        r.append(this.reddar_audit);
        r.append(", reddar_audit_ticket=");
        r.append(this.reddar_audit_ticket);
        r.append(", target_subreddit=");
        r.append(this.target_subreddit);
        r.append(", spamurai_action=");
        r.append(this.spamurai_action);
        r.append(", ad_brand_safety=");
        r.append(this.ad_brand_safety);
        r.append(", bulk_action_job=");
        r.append(this.bulk_action_job);
        r.append(", target_comment=");
        r.append(this.target_comment);
        r.append(", target_message=");
        r.append(this.target_message);
        r.append(", reroute_rule=");
        r.append(this.reroute_rule);
        r.append(", reddar_queue=");
        r.append(this.reddar_queue);
        r.append(", geo_block=");
        r.append(this.geo_block);
        r.append(", programmatic=");
        r.append(this.programmatic);
        r.append(", csai_content_report=");
        r.append(this.csai_content_report);
        r.append(", imposter=");
        r.append(this.imposter);
        r.append(", broadcast=");
        r.append(this.broadcast);
        r.append(", survey=");
        r.append(this.survey);
        r.append(", playback=");
        r.append(this.playback);
        r.append(", bot_detection=");
        r.append(this.bot_detection);
        r.append(", crowd_source=");
        r.append(this.crowd_source);
        r.append(", announcement=");
        r.append(this.announcement);
        r.append(", purchase=");
        r.append(this.purchase);
        r.append(", powerups=");
        r.append(this.powerups);
        r.append(", account_label=");
        r.append(this.account_label);
        r.append(", inbox=");
        r.append(this.inbox);
        r.append(", gallery=");
        r.append(this.gallery);
        r.append(", trophy=");
        r.append(this.trophy);
        r.append(", feature=");
        r.append(this.feature);
        r.append(", admin_team=");
        r.append(this.admin_team);
        r.append(", mute=");
        r.append(this.mute);
        r.append(", content_tag=");
        r.append(this.content_tag);
        r.append(", rater_tag=");
        r.append(this.rater_tag);
        r.append(", credit_card_form=");
        r.append(this.credit_card_form);
        r.append(", ad_click=");
        r.append(this.ad_click);
        r.append(", snoovatar=");
        r.append(this.snoovatar);
        r.append(", feed=");
        r.append(this.feed);
        r.append(", progress_module=");
        r.append(this.progress_module);
        r.append(", app_icon=");
        r.append(this.app_icon);
        r.append(", ad_metadata=");
        r.append(this.ad_metadata);
        r.append(", predictions=");
        r.append(this.predictions);
        r.append(", navigation_session=");
        r.append(this.navigation_session);
        r.append(", afd_second=");
        r.append(this.afd_second);
        r.append(", atc=");
        r.append(this.atc);
        r.append(", view_stats=");
        r.append(this.view_stats);
        r.append(", reward_info=");
        r.append(this.reward_info);
        r.append(", live_audio_room=");
        r.append(this.live_audio_room);
        r.append(", live_audio_user=");
        r.append(this.live_audio_user);
        r.append(", modmail_conversation=");
        r.append(this.modmail_conversation);
        r.append(", modmail_message=");
        r.append(this.modmail_message);
        r.append(", bulk_messenger=");
        r.append(this.bulk_messenger);
        r.append(", restrict=");
        r.append(this.restrict);
        r.append(", ad_pixel=");
        r.append(this.ad_pixel);
        r.append(", video_error_report=");
        r.append(this.video_error_report);
        r.append(", taxonomy=");
        r.append(this.taxonomy);
        r.append(", social_link=");
        r.append(this.social_link);
        r.append(", acl_check=");
        r.append(this.acl_check);
        r.append(", cookie_monitor=");
        r.append(this.cookie_monitor);
        r.append(", camera_feature=");
        r.append(this.camera_feature);
        r.append(", registration_form=");
        r.append(this.registration_form);
        r.append(", modqueue=");
        r.append(this.modqueue);
        r.append(", modqueue_item=");
        r.append(this.modqueue_item);
        r.append(", recap_card=");
        r.append(this.recap_card);
        r.append(", modqueue_trigger=");
        r.append(this.modqueue_trigger);
        r.append(", modnote=");
        r.append(this.modnote);
        r.append(", screen_trace=");
        r.append(this.screen_trace);
        r.append(", rbl_survey=");
        r.append(this.rbl_survey);
        r.append(", survey_response=");
        r.append(this.survey_response);
        r.append(", reddar_settings=");
        r.append(this.reddar_settings);
        r.append(", ad_entity=");
        r.append(this.ad_entity);
        r.append(", react_source=");
        r.append(this.react_source);
        r.append(", conversions_onboarding=");
        r.append(this.conversions_onboarding);
        r.append(", theater_mode=");
        r.append(this.theater_mode);
        r.append(", chain=");
        r.append(this.chain);
        r.append(", contract=");
        r.append(this.contract);
        r.append(", token=");
        r.append(this.token);
        r.append(", block=");
        r.append(this.block);
        r.append(", transaction=");
        r.append(this.transaction);
        r.append(", transfer=");
        r.append(this.transfer);
        r.append(", marketplace=");
        r.append(this.marketplace);
        r.append(", automoderator=");
        r.append(this.automoderator);
        r.append(", access_audit=");
        r.append(this.access_audit);
        r.append(", indexing=");
        r.append(this.indexing);
        r.append(", ad_preview=");
        r.append(this.ad_preview);
        r.append(", user_deactivation_info=");
        r.append(this.user_deactivation_info);
        r.append(", experiments_platform=");
        r.append(this.experiments_platform);
        r.append(", comments_load=");
        r.append(this.comments_load);
        r.append(", geo=");
        r.append(this.geo);
        r.append(", user_legacy_id=");
        r.append(this.user_legacy_id);
        r.append(", content_metadata=");
        r.append(this.content_metadata);
        r.append(", url_parsed=");
        r.append(this.url_parsed);
        r.append(", link_sharing=");
        r.append(this.link_sharing);
        r.append(", create_request_timestamp=");
        r.append(this.create_request_timestamp);
        r.append(", inferred=");
        r.append(this.inferred);
        r.append(", event_hmac_key=");
        r.append(this.event_hmac_key);
        r.append(", batch_load_id=");
        r.append(this.batch_load_id);
        r.append(", ip_splitting=");
        r.append(this.ip_splitting);
        r.append(", collector=");
        r.append(this.collector);
        r.append(", collector_consistency_checksum=");
        return a.o(r, this.collector_consistency_checksum, "}");
    }
    
    public void write(final e e) throws IOException {
        Event.ADAPTER.write(e, (Object)this);
    }
}
