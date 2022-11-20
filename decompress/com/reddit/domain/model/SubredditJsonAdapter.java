// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import cg2.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import dd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.structuredstyles.model.StructuredStyle;
import com.reddit.notification.common.NotificationLevel;
import com.reddit.domain.model.media.MediaInCommentType;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0011R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-" }, d2 = { "Lcom/reddit/domain/model/SubredditJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/Subreddit;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableLongAdapter", "longAdapter", "", "nullableBooleanAdapter", "booleanAdapter", "Lcom/reddit/notification/common/NotificationLevel;", "nullableNotificationLevelAdapter", "", "Lcom/reddit/domain/model/FlairRichTextItem;", "nullableListOfFlairRichTextItemAdapter", "Lcom/reddit/domain/model/Rule;", "listOfRuleAdapter", "Lcom/reddit/domain/model/SubredditCountrySiteSettings;", "nullableSubredditCountrySiteSettingsAdapter", "Lcom/reddit/domain/model/media/MediaInCommentType;", "nullableListOfMediaInCommentTypeAdapter", "Lcom/reddit/structuredstyles/model/StructuredStyle;", "nullableStructuredStyleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditJsonAdapter extends JsonAdapter<Subreddit>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Subreddit> constructorRef;
    private final JsonAdapter<List<Rule>> listOfRuleAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<FlairRichTextItem>> nullableListOfFlairRichTextItemAdapter;
    private final JsonAdapter<List<MediaInCommentType>> nullableListOfMediaInCommentTypeAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<NotificationLevel> nullableNotificationLevelAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<StructuredStyle> nullableStructuredStyleAdapter;
    private final JsonAdapter<SubredditCountrySiteSettings> nullableSubredditCountrySiteSettingsAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public SubredditJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "name", "display_name", "display_name_prefixed", "icon_img", "key_color", "banner_img", "title", "description", "public_description", "subscribers", "accounts_active", "created_utc", "subreddit_type", "url", "over18", "wiki_enabled", "whitelist_status", "is_enrolled_in_new_modmail", "restrict_posting", "quarantine", "quarantine_message", "interstitial_warning_message_html", "hasBeenVisited", "submission_type", "allow_images", "allow_videos", "allow_videogifs", "allow_chat_post_creation", "is_chat_post_feature_enabled", "spoilers_enabled", "allow_polls", "allow_predictions", "user_is_banned", "user_is_contributor", "user_is_moderator", "user_is_subscriber", "user_has_favorited", "notification_level", "primary_color", "community_icon", "banner_background_image", "mobile_banner_image", "user_flair_enabled_in_sr", "can_assign_user_flair", "user_sr_flair_enabled", "user_flair_template_id", "user_flair_background_color", "user_flair_text_color", "user_flair_text", "user_flair_richtext", "link_flair_enabled", "can_assign_link_flair", "content_category", "prediction_leaderboard_entry_type", "allow_predictions_tournament", "is_user_banned", "rules", "country_site_country", "country_site_language", "subreddit_country_site_settings", "should_show_media_in_comments_setting", "allowed_media_in_comments", "isTitleSafe", "isMyReddit", "isMuted", "structuredStyle" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "iconImg");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "subscribers");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdUtc");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "over18");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "hasBeenVisited");
        this.nullableNotificationLevelAdapter = (JsonAdapter<NotificationLevel>)y.c((Type)NotificationLevel.class, (Set)instance, "notificationLevel");
        this.nullableListOfFlairRichTextItemAdapter = (JsonAdapter<List<FlairRichTextItem>>)y.c((Type)a0.d((Class)List.class, new Type[] { FlairRichTextItem.class }), (Set)instance, "user_flair_richtext");
        this.listOfRuleAdapter = (JsonAdapter<List<Rule>>)y.c((Type)a0.d((Class)List.class, new Type[] { Rule.class }), (Set)instance, "rules");
        this.nullableSubredditCountrySiteSettingsAdapter = (JsonAdapter<SubredditCountrySiteSettings>)y.c((Type)SubredditCountrySiteSettings.class, (Set)instance, "subredditCountrySiteSettings");
        this.nullableListOfMediaInCommentTypeAdapter = (JsonAdapter<List<MediaInCommentType>>)y.c((Type)a0.d((Class)List.class, new Type[] { MediaInCommentType.class }), (Set)instance, "allowedMediaInComments");
        this.nullableStructuredStyleAdapter = (JsonAdapter<StructuredStyle>)y.c((Type)StructuredStyle.class, (Set)instance, "structuredStyle");
    }
    
    public Subreddit fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        Long value = 0L;
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        final Boolean b = false;
        int n = -1;
        int n3;
        int n2 = n3 = -1;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        final String s = null;
        Object o7 = null;
        Object o8 = null;
        Object o9 = null;
        Object o10 = null;
        Object o11 = null;
        Object o12 = null;
        Object o13 = null;
        Object o14 = null;
        Object o15 = null;
        Object o16 = null;
        Object o17 = null;
        Object o18 = null;
        Object o19 = null;
        Object o20 = null;
        Object o21 = null;
        Object o22 = null;
        Object o23 = null;
        Object o24 = null;
        Object o25 = null;
        Object o26 = null;
        Object o27 = null;
        Object o28 = null;
        Object o29 = null;
        Object o30 = null;
        Object o31 = null;
        Object o32 = null;
        Object o33 = null;
        Object o34 = null;
        Object o35 = null;
        Object o36 = null;
        Object o37 = null;
        Object o38 = null;
        Object o39 = null;
        Object o40 = null;
        Object o41 = null;
        Object o42 = null;
        Object o43 = null;
        Object o44 = null;
        Object o45 = null;
        Object o46 = null;
        Object o47 = null;
        Object o48 = null;
        Object o49 = null;
        Object o50 = null;
        Object o51 = null;
        Object o52 = null;
        Object o53 = null;
        Object o54 = null;
        Object o55 = null;
        Object o56 = null;
        Object o57 = null;
        Object o58 = null;
        Object o59 = null;
        Object o60 = null;
        Object o61 = null;
        boolean b2 = false;
        StructuredStyle structuredStyle = null;
        Boolean b3 = b;
        Boolean b4 = b;
        Object o62 = s;
        while (jsonReader.hasNext()) {
            int n4 = 0;
            Label_2244: {
                int n6 = 0;
                Label_1626: {
                    int n5 = 0;
                    switch (jsonReader.E(this.options)) {
                        default: {
                            n4 = n2;
                            break Label_2244;
                        }
                        case 66: {
                            structuredStyle = (StructuredStyle)this.nullableStructuredStyleAdapter.fromJson(jsonReader);
                            b2 = true;
                            continue;
                        }
                        case 65: {
                            b4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b4 != null) {
                                n3 &= 0xFFFFFFEF;
                                n4 = n2;
                                break Label_2244;
                            }
                            throw a.n("isMuted", "isMuted", jsonReader);
                        }
                        case 64: {
                            b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b3 != null) {
                                n3 &= 0xFFFFFFF7;
                                n4 = n2;
                                break Label_2244;
                            }
                            throw a.n("isMyReddit", "isMyReddit", jsonReader);
                        }
                        case 63: {
                            o61 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n3 &= 0xFFFFFFFB;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 62: {
                            o60 = this.nullableListOfMediaInCommentTypeAdapter.fromJson(jsonReader);
                            n3 &= 0xFFFFFFFD;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 61: {
                            o59 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n3 &= 0xFFFFFFFE;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 60: {
                            o58 = this.nullableSubredditCountrySiteSettingsAdapter.fromJson(jsonReader);
                            n5 = Integer.MAX_VALUE;
                            break;
                        }
                        case 59: {
                            o57 = this.nullableStringAdapter.fromJson(jsonReader);
                            n5 = -1073741825;
                            break;
                        }
                        case 58: {
                            o56 = this.nullableStringAdapter.fromJson(jsonReader);
                            n5 = -536870913;
                            break;
                        }
                        case 57: {
                            o6 = this.listOfRuleAdapter.fromJson(jsonReader);
                            if (o6 != null) {
                                n5 = -268435457;
                                break;
                            }
                            throw a.n("rules", "rules", jsonReader);
                        }
                        case 56: {
                            o55 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n5 = -134217729;
                            break;
                        }
                        case 55: {
                            o54 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n5 = -67108865;
                            break;
                        }
                        case 54: {
                            o53 = this.nullableStringAdapter.fromJson(jsonReader);
                            n5 = -33554433;
                            break;
                        }
                        case 53: {
                            o52 = this.nullableStringAdapter.fromJson(jsonReader);
                            n5 = -16777217;
                            break;
                        }
                        case 52: {
                            o51 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n5 = -8388609;
                            break;
                        }
                        case 51: {
                            o50 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n5 = -4194305;
                            break;
                        }
                        case 50: {
                            o49 = this.nullableListOfFlairRichTextItemAdapter.fromJson(jsonReader);
                            n5 = -2097153;
                            break;
                        }
                        case 49: {
                            o48 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFEFFFFF);
                            break Label_2244;
                        }
                        case 48: {
                            o47 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFF7FFFF);
                            break Label_2244;
                        }
                        case 47: {
                            o46 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFBFFFF);
                            break Label_2244;
                        }
                        case 46: {
                            o45 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFDFFFF);
                            break Label_2244;
                        }
                        case 45: {
                            o44 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFEFFFF);
                            break Label_2244;
                        }
                        case 44: {
                            o43 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n5 = -32769;
                            break;
                        }
                        case 43: {
                            o42 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFBFFF);
                            break Label_2244;
                        }
                        case 42: {
                            o41 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFDFFF);
                            break Label_2244;
                        }
                        case 41: {
                            o40 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFEFFF);
                            break Label_2244;
                        }
                        case 40: {
                            o39 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFF7FF);
                            break Label_2244;
                        }
                        case 39: {
                            o38 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFBFF);
                            break Label_2244;
                        }
                        case 38: {
                            o37 = this.nullableNotificationLevelAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFDFF);
                            break Label_2244;
                        }
                        case 37: {
                            o36 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFEFF);
                            break Label_2244;
                        }
                        case 36: {
                            o35 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFF7F);
                            break Label_2244;
                        }
                        case 35: {
                            o34 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFFBF);
                            break Label_2244;
                        }
                        case 34: {
                            o33 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFFDF);
                            break Label_2244;
                        }
                        case 33: {
                            o32 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFFEF);
                            break Label_2244;
                        }
                        case 32: {
                            o31 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFFF7);
                            break Label_2244;
                        }
                        case 31: {
                            o30 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFFFB);
                            break Label_2244;
                        }
                        case 30: {
                            o29 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFFFD);
                            break Label_2244;
                        }
                        case 29: {
                            o28 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n2 & 0xFFFFFFFE);
                            break Label_2244;
                        }
                        case 28: {
                            o27 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n6 = Integer.MAX_VALUE;
                            break Label_1626;
                        }
                        case 27: {
                            o26 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n6 = -1073741825;
                            break Label_1626;
                        }
                        case 26: {
                            o25 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n6 = -536870913;
                            break Label_1626;
                        }
                        case 25: {
                            o24 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n6 = -268435457;
                            break Label_1626;
                        }
                        case 24: {
                            o23 = this.nullableStringAdapter.fromJson(jsonReader);
                            n6 = -134217729;
                            break Label_1626;
                        }
                        case 23: {
                            false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (false != null) {
                                n6 = -67108865;
                                break Label_1626;
                            }
                            throw a.n("hasBeenVisited", "hasBeenVisited", jsonReader);
                        }
                        case 22: {
                            o22 = this.nullableStringAdapter.fromJson(jsonReader);
                            n6 = -16777217;
                            break Label_1626;
                        }
                        case 21: {
                            o21 = this.nullableStringAdapter.fromJson(jsonReader);
                            n6 = -4194305;
                            break Label_1626;
                        }
                        case 20: {
                            o20 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n6 = -2097153;
                            break Label_1626;
                        }
                        case 19: {
                            o19 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n &= 0xFFEFFFFF;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 18: {
                            o18 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n &= 0xFFF7FFFF;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 17: {
                            o17 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFBFFFF;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 16: {
                            o16 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n &= 0xFFFDFFFF;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 15: {
                            o15 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n &= 0xFFFEFFFF;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 14: {
                            o2 = this.stringAdapter.fromJson(jsonReader);
                            if (o2 != null) {
                                n6 = -32769;
                                break Label_1626;
                            }
                            throw a.n("url", "url", jsonReader);
                        }
                        case 13: {
                            o = this.stringAdapter.fromJson(jsonReader);
                            if (o != null) {
                                n &= 0xFFFFBFFF;
                                n4 = n2;
                                break Label_2244;
                            }
                            throw a.n("subredditType", "subreddit_type", jsonReader);
                        }
                        case 12: {
                            value = (Long)this.longAdapter.fromJson(jsonReader);
                            if (value != null) {
                                n &= 0xFFFFDFFF;
                                n4 = n2;
                                break Label_2244;
                            }
                            throw a.n("createdUtc", "created_utc", jsonReader);
                        }
                        case 11: {
                            o14 = this.nullableLongAdapter.fromJson(jsonReader);
                            n &= 0xFFFFEFFF;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 10: {
                            o13 = this.nullableLongAdapter.fromJson(jsonReader);
                            n &= 0xFFFFF7FF;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 9: {
                            o4 = this.stringAdapter.fromJson(jsonReader);
                            if (o4 != null) {
                                n &= 0xFFFFFBFF;
                                n4 = n2;
                                break Label_2244;
                            }
                            throw a.n("publicDescription", "public_description", jsonReader);
                        }
                        case 8: {
                            o12 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFEFF;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 7: {
                            o11 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFF7F;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 6: {
                            o10 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFBF;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 5: {
                            o9 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFDF;
                            n4 = n2;
                            break Label_2244;
                        }
                        case 4: {
                            o8 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = n2;
                            break Label_2244;
                        }
                        case 3: {
                            o3 = this.stringAdapter.fromJson(jsonReader);
                            if (o3 != null) {
                                n &= 0xFFFFFFF7;
                                n4 = n2;
                                break Label_2244;
                            }
                            throw a.n("displayNamePrefixed", "display_name_prefixed", jsonReader);
                        }
                        case 2: {
                            o5 = this.stringAdapter.fromJson(jsonReader);
                            if (o5 != null) {
                                n &= 0xFFFFFFFB;
                                n4 = n2;
                                break Label_2244;
                            }
                            throw a.n("displayName", "display_name", jsonReader);
                        }
                        case 1: {
                            o62 = this.stringAdapter.fromJson(jsonReader);
                            if (o62 != null) {
                                n &= 0xFFFFFFFD;
                                continue;
                            }
                            throw a.n("kindWithId", "name", jsonReader);
                        }
                        case 0: {
                            o7 = this.stringAdapter.fromJson(jsonReader);
                            if (o7 != null) {
                                n &= 0xFFFFFFFE;
                                n4 = n2;
                                break Label_2244;
                            }
                            throw a.n("id", "id", jsonReader);
                        }
                        case -1: {
                            jsonReader.H();
                            jsonReader.G1();
                            n4 = n2;
                            break Label_2244;
                        }
                    }
                    n4 = (n2 & n5);
                    break Label_2244;
                }
                n &= n6;
                n4 = n2;
            }
            n2 = n4;
        }
        jsonReader.r();
        Subreddit subreddit;
        if (n == 41943568 && n2 == 0 && n3 == -32) {
            e.d(o7, "null cannot be cast to non-null type kotlin.String");
            e.d(o62, "null cannot be cast to non-null type kotlin.String");
            e.d(o5, "null cannot be cast to non-null type kotlin.String");
            e.d(o3, "null cannot be cast to non-null type kotlin.String");
            e.d(o4, "null cannot be cast to non-null type kotlin.String");
            final long longValue = value;
            e.d(o, "null cannot be cast to non-null type kotlin.String");
            e.d(o2, "null cannot be cast to non-null type kotlin.String");
            final boolean booleanValue = false;
            e.d(o6, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.Rule>");
            subreddit = new Subreddit((String)o7, (String)o62, (String)o5, (String)o3, (String)o8, (String)o9, (String)o10, (String)o11, (String)o12, null, (String)o4, (Long)o13, (Long)o14, longValue, (String)o, (String)o2, (Boolean)o15, (Boolean)o16, (String)o17, (Boolean)o18, (Boolean)o19, (Boolean)o20, (String)o21, null, (String)o22, null, booleanValue, (String)o23, (Boolean)o24, (Boolean)o25, (Boolean)o26, (Boolean)o27, (Boolean)o28, (Boolean)o29, (Boolean)o30, (Boolean)o31, (Boolean)o32, (Boolean)o33, (Boolean)o34, (Boolean)o35, (Boolean)o36, (NotificationLevel)o37, (String)o38, (String)o39, (String)o40, (String)o41, (Boolean)o42, (Boolean)o43, (Boolean)o44, (String)o45, (String)o46, (String)o47, (String)o48, (List)o49, (Boolean)o50, (Boolean)o51, (String)o52, (String)o53, (Boolean)o54, (Boolean)o55, (List)o6, (String)o56, (String)o57, (SubredditCountrySiteSettings)o58, (Boolean)o59, (List)o60, (Boolean)o61, b3, b4, 41943552, 0, 0, null);
        }
        else {
            Constructor<Subreddit> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                final Class<Long> type = Long.TYPE;
                final Class<Boolean> type2 = Boolean.TYPE;
                final Class<Integer> type3 = Integer.TYPE;
                constructorRef = Subreddit.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Long.class, Long.class, type, String.class, String.class, Boolean.class, Boolean.class, String.class, Boolean.class, Boolean.class, Boolean.class, String.class, String.class, String.class, String.class, type2, String.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, NotificationLevel.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.class, Boolean.class, String.class, String.class, String.class, String.class, List.class, Boolean.class, Boolean.class, String.class, String.class, Boolean.class, Boolean.class, List.class, String.class, String.class, SubredditCountrySiteSettings.class, Boolean.class, List.class, Boolean.class, type2, type2, type3, type3, type3, a.c);
                this.constructorRef = constructorRef;
                final j a = j.a;
                e.e((Object)constructorRef, "Subreddit::class.java.ge\u2026his.constructorRef = it }");
            }
            final Subreddit instance = constructorRef.newInstance(o7, o62, o5, o3, o8, o9, o10, o11, o12, null, o4, o13, o14, value, o, o2, o15, o16, o17, o18, o19, o20, o21, null, o22, null, false, o23, o24, o25, o26, o27, o28, o29, o30, o31, o32, o33, o34, o35, o36, o37, o38, o39, o40, o41, o42, o43, o44, o45, o46, o47, o48, o49, o50, o51, o52, o53, o54, o55, o6, o56, o57, o58, o59, o60, o61, b3, b4, n, n2, n3, null);
            e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            subreddit = instance;
        }
        if (b2) {
            subreddit.setStructuredStyle(structuredStyle);
        }
        return subreddit;
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final Subreddit subreddit) {
        e.f((Object)x, "writer");
        if (subreddit != null) {
            x.h();
            x.v("id");
            this.stringAdapter.toJson(x, (Object)subreddit.getId());
            x.v("name");
            this.stringAdapter.toJson(x, (Object)subreddit.getKindWithId());
            x.v("display_name");
            this.stringAdapter.toJson(x, (Object)subreddit.getDisplayName());
            x.v("display_name_prefixed");
            this.stringAdapter.toJson(x, (Object)subreddit.getDisplayNamePrefixed());
            x.v("icon_img");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getIconImg());
            x.v("key_color");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getKeyColor());
            x.v("banner_img");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getBannerImg());
            x.v("title");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getTitle());
            x.v("description");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getDescription());
            x.v("public_description");
            this.stringAdapter.toJson(x, (Object)subreddit.getPublicDescription());
            x.v("subscribers");
            this.nullableLongAdapter.toJson(x, (Object)subreddit.getSubscribers());
            x.v("accounts_active");
            this.nullableLongAdapter.toJson(x, (Object)subreddit.getAccountsActive());
            x.v("created_utc");
            this.longAdapter.toJson(x, (Object)subreddit.getCreatedUtc());
            x.v("subreddit_type");
            this.stringAdapter.toJson(x, (Object)subreddit.getSubredditType());
            x.v("url");
            this.stringAdapter.toJson(x, (Object)subreddit.getUrl());
            x.v("over18");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getOver18());
            x.v("wiki_enabled");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getWikiEnabled());
            x.v("whitelist_status");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getWhitelistStatus());
            x.v("is_enrolled_in_new_modmail");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getNewModMailEnabled());
            x.v("restrict_posting");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getRestrictPosting());
            x.v("quarantine");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getQuarantined());
            x.v("quarantine_message");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getQuarantineMessage());
            x.v("interstitial_warning_message_html");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getInterstitialWarningMessage());
            x.v("hasBeenVisited");
            this.booleanAdapter.toJson(x, (Object)subreddit.getHasBeenVisited());
            x.v("submission_type");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getSubmitType());
            x.v("allow_images");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getAllowImages());
            x.v("allow_videos");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getAllowVideos());
            x.v("allow_videogifs");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getAllowGifs());
            x.v("allow_chat_post_creation");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getAllowChatPostCreation());
            x.v("is_chat_post_feature_enabled");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.isChatPostFeatureEnabled());
            x.v("spoilers_enabled");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getSpoilersEnabled());
            x.v("allow_polls");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getAllowPolls());
            x.v("allow_predictions");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getAllowPredictions());
            x.v("user_is_banned");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getUserIsBanned());
            x.v("user_is_contributor");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getUserIsContributor());
            x.v("user_is_moderator");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getUserIsModerator());
            x.v("user_is_subscriber");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getUserIsSubscriber());
            x.v("user_has_favorited");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getUserHasFavorited());
            x.v("notification_level");
            this.nullableNotificationLevelAdapter.toJson(x, (Object)subreddit.getNotificationLevel());
            x.v("primary_color");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getPrimaryColorKey());
            x.v("community_icon");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getCommunityIconUrl());
            x.v("banner_background_image");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getBannerBackgroundImageUrl());
            x.v("mobile_banner_image");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getMobileBannerImageUrl());
            x.v("user_flair_enabled_in_sr");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getUserFlairEnabled());
            x.v("can_assign_user_flair");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getCanAssignUserFlair());
            x.v("user_sr_flair_enabled");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getUserSubredditFlairEnabled());
            x.v("user_flair_template_id");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getUserFlairTemplateId());
            x.v("user_flair_background_color");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getUserFlairBackgroundColor());
            x.v("user_flair_text_color");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getUserFlairTextColor());
            x.v("user_flair_text");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getUserFlairText());
            x.v("user_flair_richtext");
            this.nullableListOfFlairRichTextItemAdapter.toJson(x, (Object)subreddit.getUser_flair_richtext());
            x.v("link_flair_enabled");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getPostFlairEnabled());
            x.v("can_assign_link_flair");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getCanAssignLinkFlair());
            x.v("content_category");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getContentCategory());
            x.v("prediction_leaderboard_entry_type");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getPredictionLeaderboardEntryType());
            x.v("allow_predictions_tournament");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getAllowPredictionsTournament());
            x.v("is_user_banned");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.isUserBanned());
            x.v("rules");
            this.listOfRuleAdapter.toJson(x, (Object)subreddit.getRules());
            x.v("country_site_country");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getCountrySiteCountry());
            x.v("country_site_language");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getCountrySiteLanguage());
            x.v("subreddit_country_site_settings");
            this.nullableSubredditCountrySiteSettingsAdapter.toJson(x, (Object)subreddit.getSubredditCountrySiteSettings());
            x.v("should_show_media_in_comments_setting");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.getShouldShowMediaInCommentsSetting());
            x.v("allowed_media_in_comments");
            this.nullableListOfMediaInCommentTypeAdapter.toJson(x, (Object)subreddit.getAllowedMediaInComments());
            x.v("isTitleSafe");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.isTitleSafe());
            x.v("isMyReddit");
            this.booleanAdapter.toJson(x, (Object)subreddit.isMyReddit());
            x.v("isMuted");
            this.booleanAdapter.toJson(x, (Object)subreddit.isMuted());
            x.v("structuredStyle");
            this.nullableStructuredStyleAdapter.toJson(x, (Object)subreddit.getStructuredStyle());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (Subreddit)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Subreddit)";
    }
}
