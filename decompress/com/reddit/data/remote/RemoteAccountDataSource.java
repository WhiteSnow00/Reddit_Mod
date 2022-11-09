// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.data.adapter.DataWithErrorsResponse;
import av2.n;
import pg2.j;
import com.reddit.domain.model.DefaultAvatar;
import okhttp3.ResponseBody;
import com.reddit.domain.model.OnlineUsersResponse;
import av2.c;
import com.reddit.data.model.AccountDataModel;
import av2.e;
import com.reddit.domain.model.FileUploadLease;
import av2.d;
import java.util.Map;
import com.reddit.data.adapter.Enveloped;
import av2.f;
import com.reddit.domain.model.Account;
import nf2.c0;
import av2.s;
import av2.o;
import nf2.a;
import av2.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H'J\u001e\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fH'J)\u0010\u0011\u001a\u00020\u00102\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fH作\u00f8\u0001\u0000兝u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fH'J(\u0010\u0015\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\u00022\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fH'J3\u0010\u0016\u001a\u00020\u00102\b\b\u0001\u0010\t\u001a\u00020\u00022\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fH作\u00f8\u0001\u0000兝u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H'J\u001d\u0010\u001a\u001a\u00020\u00182\b\b\u0001\u0010\t\u001a\u00020\u0002H作\u00f8\u0001\u0000兝u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\u0002H'J\u001d\u0010\u001d\u001a\u00020\u00102\b\b\u0001\u0010\t\u001a\u00020\u0002H作\u00f8\u0001\u0000兝u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001f\u001a\u00020\u000e2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H'J\u001c\u0010!\u001a\u00020\u000e2\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010 \u001a\u00020\u0002H'J\u001d\u0010$\u001a\u00020#2\b\b\u0001\u0010\"\u001a\u00020\u0002H作\u00f8\u0001\u0000兝u0006\u0004\b$\u0010\u001bJ)\u0010(\u001a\u00020'2\b\b\u0001\u0010%\u001a\u00020\u00022\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0002H作\u00f8\u0001\u0000兝u0006\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019沔u0006*" }, d2 = { "Lcom/reddit/data/remote/RemoteAccountDataSource;", "", "", "username", "Lnf2/c0;", "Lcom/reddit/domain/model/Account;", "getAccount", "Lcom/reddit/data/model/AccountDataModel;", "getMyAccount", "userSubredditDisplayName", "Lokhttp3/ResponseBody;", "getUserSubredditSettings", "", "params", "Lnf2/a;", "updateUserSubredditSettings", "Lpg2/j;", "updateUserSubredditSettingsSuspend", "(Ljava/util/Map;Ltg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/model/FileUploadLease;", "getFileUploadLease", "updateImage", "updateImageSuspend", "(Ljava/lang/String;Ljava/util/Map;Ltg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/model/DefaultAvatar;", "removeAvatar", "removeAvatarSuspend", "(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "removeBanner", "removeBannerSuspend", "userId", "blockUser", "selfUserId", "unblockUser", "newName", "Lcom/reddit/data/adapter/DataWithErrorsResponse;", "updateName", "userFullNames", "subredditKindWithId", "Lcom/reddit/domain/model/OnlineUsersResponse;", "getOnlineUsers", "(Ljava/lang/String;Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "data-remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteAccountDataSource
{
    @o("/api/block_user")
    a blockUser(@t("account_id") final String p0);
    
    @f("user/{username}/about.json")
    @Enveloped
    c0<Account> getAccount(@s("username") final String p0);
    
    @e
    @o("/api/v1/style_asset_upload_s3/{user_subreddit_display_name}")
    c0<FileUploadLease> getFileUploadLease(@s("user_subreddit_display_name") final String p0, @d final Map<String, String> p1);
    
    @f("api/v1/me")
    c0<AccountDataModel> getMyAccount();
    
    @e
    @o("/api/presence")
    Object getOnlineUsers(@c("user_fullnames") final String p0, @c("subreddit_fullname") final String p1, final tg2.c<? super OnlineUsersResponse> p2);
    
    @f("/r/{user_subreddit_display_name}/about/edit")
    c0<ResponseBody> getUserSubredditSettings(@s("user_subreddit_display_name") final String p0);
    
    @o("/r/{user_subreddit_display_name}/api/delete_sr_icon")
    c0<DefaultAvatar> removeAvatar(@s("user_subreddit_display_name") final String p0);
    
    @o("/r/{user_subreddit_display_name}/api/delete_sr_icon")
    Object removeAvatarSuspend(@s("user_subreddit_display_name") final String p0, final tg2.c<? super DefaultAvatar> p1);
    
    @o("/r/{user_subreddit_display_name}/api/delete_sr_banner")
    a removeBanner(@s("user_subreddit_display_name") final String p0);
    
    @o("/r/{user_subreddit_display_name}/api/delete_sr_banner")
    Object removeBannerSuspend(@s("user_subreddit_display_name") final String p0, final tg2.c<? super j> p1);
    
    @o("/api/unfriend?type=enemy")
    a unblockUser(@t("id") final String p0, @t("container") final String p1);
    
    @e
    @n("api/v1/structured_styles/{user_subreddit_display_name}")
    a updateImage(@s("user_subreddit_display_name") final String p0, @d(encoded = true) final Map<String, String> p1);
    
    @e
    @n("api/v1/structured_styles/{user_subreddit_display_name}")
    Object updateImageSuspend(@s("user_subreddit_display_name") final String p0, @d(encoded = true) final Map<String, String> p1, final tg2.c<? super j> p2);
    
    @o("/api/update_name")
    Object updateName(@t("new_name") final String p0, final tg2.c<? super DataWithErrorsResponse> p1);
    
    @e
    @o("/api/site_admin")
    a updateUserSubredditSettings(@d final Map<String, String> p0);
    
    @e
    @o("/api/site_admin")
    Object updateUserSubredditSettingsSuspend(@d final Map<String, String> p0, final tg2.c<? super j> p1);
}
