// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.t;
import av2.f;
import com.reddit.domain.model.Flair;
import java.util.List;
import com.reddit.domain.model.mod.PostResponseWithErrors;
import av2.o;
import av2.e;
import com.reddit.domain.model.FlairPostResponse;
import nf2.c0;
import av2.s;
import av2.c;
import av2.d;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'J8\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H'JL\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0014\b\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u0002H'J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H'¨\u0006\u001d" }, d2 = { "Lcom/reddit/data/remote/RemoteFlairDataSource;", "", "", "subredditName", "Lnf2/c0;", "", "Lcom/reddit/domain/model/Flair;", "getSearchableFlair", "subreddit", "fetchLinkFlairs", "fetchUserFlairs", "", "enabled", "Lcom/reddit/domain/model/mod/PostResponseWithErrors;", "setUserFlairEnabled", "flairTemplateId", "flairText", "kindWithId", "updatePostFlair", "updateUserFlair", "", "stringParams", "", "maxEmojis", "modOnly", "textEditable", "Lcom/reddit/domain/model/FlairPostResponse;", "createOrUpdateFlairTemplate", "deleteFlairTemplate", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteFlairDataSource
{
    @e
    @o("r/{subreddit}/api/flairtemplate_v2")
    c0<FlairPostResponse> createOrUpdateFlairTemplate(@d final Map<String, String> p0, @c("max_emojis") final int p1, @c("mod_only") final boolean p2, @c("text_editable") final boolean p3, @s("subreddit") final String p4);
    
    @e
    @o("r/{subreddit}/api/deleteflairtemplate")
    c0<PostResponseWithErrors> deleteFlairTemplate(@c("flair_template_id") final String p0, @s("subreddit") final String p1);
    
    @f("r/{subreddit}/api/link_flair_v2")
    c0<List<Flair>> fetchLinkFlairs(@s("subreddit") final String p0);
    
    @f("r/{subreddit}/api/user_flair_v2")
    c0<List<Flair>> fetchUserFlairs(@s("subreddit") final String p0);
    
    @f("api/top_flair_in_subreddit.json")
    c0<List<Flair>> getSearchableFlair(@t("subreddit") final String p0);
    
    @e
    @o("r/{subreddit}/api/setflairenabled")
    c0<PostResponseWithErrors> setUserFlairEnabled(@s("subreddit") final String p0, @c("flair_enabled") final boolean p1);
    
    @e
    @o("api/selectflair")
    c0<PostResponseWithErrors> updatePostFlair(@c("flair_template_id") final String p0, @c("text") final String p1, @c("link") final String p2);
    
    @e
    @o("r/{subreddit}/api/selectflair")
    c0<PostResponseWithErrors> updateUserFlair(@c("flair_template_id") final String p0, @c("text") final String p1, @c("name") final String p2, @s("subreddit") final String p3);
}
