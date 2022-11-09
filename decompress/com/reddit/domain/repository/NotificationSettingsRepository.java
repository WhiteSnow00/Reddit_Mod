// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.repository;

import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;
import nf2.c0;

public interface NotificationSettingsRepository
{
    c0<Settings> a();
    
    @o(generateAdapter = true)
    @Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/repository/NotificationSettingsRepository$Settings;", "", "", "privateMessages", "postReplies", "commentReplies", "threadReplies", "topLevelComment", "usernameMentions", "chatMessages", "chatRequests", "trendingPosts", "newPostActivity", "cakeDay", "userNewFollower", "postFlairAdded", "userFlairAdded", "communityRecommendation", "postUpvote", "commentUpvote", "newPinnedPost", "announcements", "broadcastRecommendation", "broadcastFollower", "modContentFoundation", "modEngagement", "modMilestone", "postFollow", "commentFollow", "<init>", "(ZZZZZZZZZZZZZZZZZZZZZZZZZZ)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Settings
    {
        public final transient boolean A;
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final boolean o;
        public final boolean p;
        public final boolean q;
        public final boolean r;
        public final boolean s;
        public final boolean t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final boolean z;
        
        public Settings() {
            this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 67108863, null);
        }
        
        public Settings(@n(name = "private_message") final boolean a, @n(name = "post_reply") final boolean b, @n(name = "comment_reply") final boolean c, @n(name = "thread_replies") final boolean d, @n(name = "top_level_comment") final boolean e, @n(name = "username_mention") final boolean f, @n(name = "chat_message") final boolean g, @n(name = "chat_request") final boolean h, @n(name = "lifecycle_post_suggestions") final boolean i, @n(name = "new_post_activity") final boolean j, @n(name = "cake_day") final boolean k, @n(name = "user_new_follower") final boolean l, @n(name = "post_flair_added") final boolean m, @n(name = "user_flair_added") final boolean n, @n(name = "subreddit_recommendation") final boolean o, @n(name = "upvote_post") final boolean p26, @n(name = "upvote_comment") final boolean q, @n(name = "new_pinned_post") final boolean r, @n(name = "one_off") final boolean s, @n(name = "broadcast_recommendation") final boolean t, @n(name = "broadcast_follower") final boolean u, @n(name = "moderated_sr_content_foundation") final boolean v, @n(name = "moderated_sr_engagement") final boolean w, @n(name = "moderated_sr_milestone") final boolean x, @n(name = "post_follow") final boolean y, @n(name = "comment_follow") final boolean z) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p26;
            this.q = q;
            this.r = r;
            this.s = s;
            this.t = t;
            this.u = u;
            this.v = v;
            this.w = w;
            this.x = x;
            this.y = y;
            this.z = z;
            this.A = (v || w || x);
        }
    }
    
    @o(generateAdapter = true)
    @Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B¿\u0002\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/repository/NotificationSettingsRepository$SettingsPatch;", "", "", "privateMessages", "postReplies", "commentReplies", "threadReplies", "topLevelComment", "usernameMentions", "chatMessages", "chatRequests", "trendingPosts", "newPostActivity", "cakeDay", "userNewFollower", "postFlairAdded", "userFlairAdded", "communityRecommendation", "upvotePost", "upvoteComment", "newPinnedPost", "announcements", "broadcastRecommendation", "broadcastFollower", "modContentFoundation", "modEngagement", "modMilestone", "postFollow", "commentFollow", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class SettingsPatch
    {
        public final Boolean a;
        public final Boolean b;
        public final Boolean c;
        public final Boolean d;
        public final Boolean e;
        public final Boolean f;
        public final Boolean g;
        public final Boolean h;
        public final Boolean i;
        public final Boolean j;
        public final Boolean k;
        public final Boolean l;
        public final Boolean m;
        public final Boolean n;
        public final Boolean o;
        public final Boolean p;
        public final Boolean q;
        public final Boolean r;
        public final Boolean s;
        public final Boolean t;
        public final Boolean u;
        public final Boolean v;
        public final Boolean w;
        public final Boolean x;
        public final Boolean y;
        public final Boolean z;
        
        public SettingsPatch() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
        }
        
        public SettingsPatch(@n(name = "private_message") final Boolean a, @n(name = "post_reply") final Boolean b, @n(name = "comment_reply") final Boolean c, @n(name = "thread_replies") final Boolean d, @n(name = "top_level_comment") final Boolean e, @n(name = "username_mention") final Boolean f, @n(name = "chat_message") final Boolean g, @n(name = "chat_request") final Boolean h, @n(name = "lifecycle_post_suggestions") final Boolean i, @n(name = "new_post_activity") final Boolean j, @n(name = "cake_day") final Boolean k, @n(name = "user_new_follower") final Boolean l, @n(name = "post_flair_added") final Boolean m, @n(name = "user_flair_added") final Boolean n, @n(name = "subreddit_recommendation") final Boolean o, @n(name = "upvote_post") final Boolean p26, @n(name = "upvote_comment") final Boolean q, @n(name = "new_pinned_post") final Boolean r, @n(name = "one_off") final Boolean s, @n(name = "broadcast_recommendation") final Boolean t, @n(name = "broadcast_follower") final Boolean u, @n(name = "moderated_sr_content_foundation") final Boolean v, @n(name = "moderated_sr_engagement") final Boolean w, @n(name = "moderated_sr_milestone") final Boolean x, @n(name = "post_follow") final Boolean y, @n(name = "comment_follow") final Boolean z) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p26;
            this.q = q;
            this.r = r;
            this.s = s;
            this.t = t;
            this.u = u;
            this.v = v;
            this.w = w;
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
