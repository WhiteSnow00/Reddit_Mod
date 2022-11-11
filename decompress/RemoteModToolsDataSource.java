// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.domain.model.FileUploadLease;
import com.reddit.domain.modtools.ModToolsCommunityInviteType;
import com.reddit.domain.model.mod.SubredditRulesResponse;
import com.reddit.domain.model.mod.MutedUsersResponse;
import com.reddit.domain.model.mod.BannedUsersResponse;
import com.reddit.domain.model.mod.ApprovedSubmittersResponse;
import av2.f;
import com.reddit.domain.model.mod.ModeratorsResponse;
import av2.t;
import pg2.j;
import av2.k;
import av2.a;
import okhttp3.RequestBody;
import av2.n;
import okhttp3.ResponseBody;
import wu2.w;
import com.reddit.domain.modtools.ModToolsActionType;
import av2.c;
import av2.o;
import av2.e;
import com.reddit.domain.model.mod.PostResponseWithErrors;
import nf2.c0;
import av2.d;
import java.util.Map;
import av2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'J>\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'JA\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'J2\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'J8\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002H'J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'J<\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'JD\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002H'J\"\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J$\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'J$\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'J\"\u0010*\u001a\b\u0012\u0004\u0012\u00020&0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'J4\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fH'J.\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fH'J.\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fH'J\"\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010.\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020/H'Jo\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b8\u00109J.\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fH'J4\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fH'J6\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010<\u001a\u00020\u00022\b\b\u0001\u0010=\u001a\u00020\u00022\b\b\u0003\u0010>\u001a\u00020\u0002H'J(\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020\u0002H'JE\u0010G\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010D\u001a\u00020C2\b\b\u0001\u0010E\u001a\u00020\u00022\b\b\u0001\u0010F\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\bG\u0010HJ=\u0010J\u001a\u00020I2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010D\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fH§@\u00f8\u0001\u0000¢\u0006\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006L" }, d2 = { "Lcom/reddit/data/remote/RemoteModToolsDataSource;", "", "", "subreddit", "after", "Lnf2/c0;", "Lcom/reddit/domain/model/mod/BannedUsersResponse;", "getBannedUsers", "id", "name", "Lcom/reddit/domain/modtools/ModToolsActionType;", "type", "Lwu2/w;", "Lokhttp3/ResponseBody;", "unbanUser", "", "params", "", "duration", "Lcom/reddit/domain/model/mod/PostResponseWithErrors;", "banUser", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)Lnf2/c0;", "username", "searchBannedUser", "Lcom/reddit/domain/model/mod/ApprovedSubmittersResponse;", "getApprovedSubmitters", "removeApprovedSubmitter", "apiType", "addApprovedSubmitter", "searchApprovedSubmitters", "Lcom/reddit/domain/model/mod/MutedUsersResponse;", "getMutedUsers", "unmuteUser", "modNote", "muteUser", "searchMutedUser", "Lcom/reddit/domain/model/mod/SubredditRulesResponse;", "getSubredditRules", "Lcom/reddit/domain/model/mod/ModeratorsResponse;", "getAllModerators", "getEditableModerators", "searchAllModerators", "searchEditableModerators", "removeModerator", "inviteModerator", "editModerator", "action", "Lokhttp3/RequestBody;", "ids", "bulkModActions", "thingId", "reason", "siteReason", "ruleReason", "otherReason", "streamReportTime", "report", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lnf2/c0;", "acceptModInvite", "declineModInvite", "fileName", "fileMimeType", "imageType", "Lcom/reddit/domain/model/FileUploadLease;", "leaseCommunityIconUpload", "iconUrl", "attachCommunityIcon", "Lcom/reddit/domain/modtools/ModToolsCommunityInviteType;", "inviteType", "permissions", "inviteMessage", "inviteToCommunity", "(Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/modtools/ModToolsCommunityInviteType;Ljava/lang/String;Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "Lpg2/j;", "declineCommunityInvite", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ltg2/c;)Ljava/lang/Object;", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteModToolsDataSource
{
    @e
    @o("/r/{subreddit}/api/accept_moderator_invite")
    c0<PostResponseWithErrors> acceptModInvite(@s("subreddit") final String p0, @d final Map<String, String> p1);
    
    @e
    @o("/r/{subreddit}/api/friend")
    c0<PostResponseWithErrors> addApprovedSubmitter(@s("subreddit") final String p0, @c("name") final String p1, @c("type") final ModToolsActionType p2, @c("api_type") final String p3);
    
    @e
    @n("/api/v1/structured_styles/{subreddit}")
    c0<w<ResponseBody>> attachCommunityIcon(@s("subreddit") final String p0, @c("communityIcon") final String p1);
    
    @e
    @o("/r/{subreddit}/api/friend")
    c0<PostResponseWithErrors> banUser(@s("subreddit") final String p0, @d final Map<String, String> p1, @c("duration") final Long p2);
    
    @k({ "Content-Type: application/json" })
    @o("/api/v1/modactions/{action}")
    c0<PostResponseWithErrors> bulkModActions(@s("action") final String p0, @av2.a final RequestBody p1);
    
    @e
    @o("/r/{subreddit}/api/decline_community_invite")
    Object declineCommunityInvite(@s("subreddit") final String p0, @c("invite_type") final String p1, @d final Map<String, String> p2, final tg2.c<? super j> p3);
    
    @e
    @o("/api/v1/{subreddit}/decline_mod_invite")
    c0<w<ResponseBody>> declineModInvite(@s("subreddit") final String p0, @d final Map<String, String> p1);
    
    @e
    @o("/r/{subreddit}/api/setpermissions.json")
    c0<PostResponseWithErrors> editModerator(@s("subreddit") final String p0, @d final Map<String, String> p1);
    
    @f("/api/v1/{subreddit}/moderators.json")
    c0<ModeratorsResponse> getAllModerators(@s("subreddit") final String p0, @t("after") final String p1);
    
    @f("/api/v1/{subreddit}/contributors.json")
    c0<ApprovedSubmittersResponse> getApprovedSubmitters(@s("subreddit") final String p0, @t("after") final String p1);
    
    @f("/api/v1/{subreddit}/banned.json")
    c0<BannedUsersResponse> getBannedUsers(@s("subreddit") final String p0, @t("after") final String p1);
    
    @f("/api/v1/{subreddit}/moderators_editable.json")
    c0<ModeratorsResponse> getEditableModerators(@s("subreddit") final String p0, @t("after") final String p1);
    
    @f("/api/v1/{subreddit}/muted.json")
    c0<MutedUsersResponse> getMutedUsers(@s("subreddit") final String p0, @t("after") final String p1);
    
    @f("/r/{subreddit}/about/rules")
    c0<SubredditRulesResponse> getSubredditRules(@s("subreddit") final String p0);
    
    @e
    @o("/r/{subreddit}/api/friend.json")
    c0<PostResponseWithErrors> inviteModerator(@s("subreddit") final String p0, @d final Map<String, String> p1);
    
    @e
    @o("/r/{subreddit}/api/community_invite")
    Object inviteToCommunity(@s("subreddit") final String p0, @c("name") final String p1, @c("invite_type") final ModToolsCommunityInviteType p2, @c("permissions") final String p3, @c("message") final String p4, final tg2.c<? super PostResponseWithErrors> p5);
    
    @e
    @o("api/v1/style_asset_upload_s3/{subreddit}")
    c0<FileUploadLease> leaseCommunityIconUpload(@s("subreddit") final String p0, @c("filepath") final String p1, @c("mimetype") final String p2, @c("imagetype") final String p3);
    
    @e
    @o("/r/{subreddit}/api/friend")
    c0<PostResponseWithErrors> muteUser(@s("subreddit") final String p0, @c("name") final String p1, @c("note") final String p2, @c("type") final ModToolsActionType p3, @c("api_type") final String p4);
    
    @e
    @o("/r/{subreddit}/api/unfriend")
    c0<w<ResponseBody>> removeApprovedSubmitter(@s("subreddit") final String p0, @c("id") final String p1, @c("type") final ModToolsActionType p2);
    
    @e
    @o("/r/{subreddit}/api/unfriend.json")
    c0<w<ResponseBody>> removeModerator(@s("subreddit") final String p0, @d final Map<String, String> p1);
    
    @e
    @o("api/report")
    c0<w<ResponseBody>> report(@c("thing_id") final String p0, @c("reason") final String p1, @c("usernames") final String p2, @c("site_reason") final String p3, @c("rule_reason") final String p4, @c("other_reason") final String p5, @c("live_stream_relative_report_time_sec") final Long p6);
    
    @f("/api/v1/{subreddit}/moderators.json")
    c0<ModeratorsResponse> searchAllModerators(@s("subreddit") final String p0, @t("username") final String p1);
    
    @f("/api/v1/{subreddit}/contributors.json")
    c0<ApprovedSubmittersResponse> searchApprovedSubmitters(@s("subreddit") final String p0, @t("username") final String p1);
    
    @f("/api/v1/{subreddit}/banned.json")
    c0<BannedUsersResponse> searchBannedUser(@s("subreddit") final String p0, @t("username") final String p1);
    
    @f("/api/v1/{subreddit}/moderators.json")
    c0<ModeratorsResponse> searchEditableModerators(@s("subreddit") final String p0, @t("username") final String p1);
    
    @f("/api/v1/{subreddit}/muted.json")
    c0<MutedUsersResponse> searchMutedUser(@s("subreddit") final String p0, @t("username") final String p1);
    
    @e
    @o("/r/{subreddit}/api/unfriend")
    c0<w<ResponseBody>> unbanUser(@s("subreddit") final String p0, @c("id") final String p1, @c("name") final String p2, @c("type") final ModToolsActionType p3);
    
    @e
    @o("/r/{subreddit}/api/unfriend")
    c0<w<ResponseBody>> unmuteUser(@s("subreddit") final String p0, @c("id") final String p1, @c("name") final String p2, @c("type") final ModToolsActionType p3);
    
    public static final class a
    {
    }
}
