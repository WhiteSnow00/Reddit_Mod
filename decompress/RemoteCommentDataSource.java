// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.domain.model.UserComment;
import av2.a;
import com.reddit.domain.model.listing.ContentRemovalMessage;
import com.reddit.data.adapter.ListingEnveloped;
import com.reddit.domain.model.Comment;
import com.reddit.domain.model.listing.Listing;
import com.reddit.data.adapter.CommentsList;
import com.reddit.domain.model.IComment;
import java.util.List;
import com.reddit.domain.model.DefaultResponse;
import com.reddit.domain.model.ConverterRichTextResponse;
import av2.f;
import com.reddit.domain.model.CommentResponse;
import av2.s;
import av2.o;
import av2.e;
import com.reddit.domain.model.CreateEditCommentResponse;
import nf2.c0;
import av2.j;
import java.util.Map;
import av2.t;
import av2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u00cb\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0014\b\u0003\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013H'¢\u0006\u0004\b\u0017\u0010\u0018Jµ\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0003\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0081\u0001\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00152\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00132\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\u001f\u0010 J{\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00152\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0003\u0010#\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b'\u0010(J,\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00152\b\b\u0001\u0010)\u001a\u00020\u00022\b\b\u0001\u0010*\u001a\u00020\u00022\b\b\u0003\u0010#\u001a\u00020\u0002H'J\u0085\u0001\u0010-\u001a\b\u0012\u0004\u0012\u00020&0\u00152\b\b\u0001\u0010)\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0003\u0010#\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0014\b\u0003\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013H'¢\u0006\u0004\b-\u0010.JU\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010\u00152\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00132\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b3\u00104J=\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205010\u00152\b\b\u0001\u0010/\u001a\u00020\u00022\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b6\u00107J6\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00152\b\b\u0001\u00108\u001a\u00020\u00022\b\b\u0003\u00109\u001a\u00020\u00022\b\b\u0003\u0010:\u001a\u00020\u00072\b\b\u0003\u0010;\u001a\u00020\u000bH'J\u001d\u0010?\u001a\u00020>2\b\b\u0001\u0010)\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020>2\b\b\u0001\u0010)\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\bA\u0010@J\u0012\u0010E\u001a\u00020D2\b\b\u0001\u0010C\u001a\u00020BH'J6\u0010G\u001a\b\u0012\u0004\u0012\u00020+0\u00152\b\b\u0001\u0010)\u001a\u00020\u00022\b\b\u0001\u0010*\u001a\u00020\u00022\b\b\u0001\u0010F\u001a\u00020\u00022\b\b\u0003\u0010#\u001a\u00020\u0002H'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006H" }, d2 = { "Lcom/reddit/data/remote/RemoteCommentDataSource;", "", "", "linkId", "commentId", "subredditName", "sortType", "", "limit", "context", "rtjson", "", "threaded", "truncate", "emotesAsImages", "profileImage", "snoovatarImage", "currentUserAwardings", "rawMediaSyntax", "", "headers", "Lnf2/c0;", "Lcom/reddit/domain/model/CommentResponse;", "commentsWithSubreddit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/Map;)Lnf2/c0;", "comments", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)Lnf2/c0;", "linkKindWithId", "children", "", "Lcom/reddit/domain/model/IComment;", "moreComments", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lnf2/c0;", "commentKindWithId", "richText", "apiType", "returnRtjson", "rtj", "Lcom/reddit/domain/model/CreateEditCommentResponse;", "editRichText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lnf2/c0;", "kindWithId", "text", "Lcom/reddit/domain/model/DefaultResponse;", "messageReply", "commentRichText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/Map;)Lnf2/c0;", "username", "after", "Lcom/reddit/domain/model/listing/Listing;", "Lcom/reddit/domain/model/UserComment;", "userComments", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;)Lnf2/c0;", "Lcom/reddit/domain/model/Comment;", "savedComments", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lnf2/c0;", "markdownText", "outputMode", "rawJson", "allowNestedMedia", "Lcom/reddit/domain/model/ConverterRichTextResponse;", "convertCommentMarkdownToRichText", "Lpg2/j;", "modLock", "(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "modUnlock", "Lcom/reddit/domain/model/listing/ContentRemovalMessage;", "model", "Lnf2/a;", "sendRemovalMessage", "to", "messageCompose", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteCommentDataSource
{
    @e
    @o("api/comment")
    c0<CreateEditCommentResponse> commentRichText(@c("thing_id") final String p0, @c("richtext_json") final String p1, @c("api_type") final String p2, @t("emotes_as_images") final Boolean p3, @c("return_rtjson") final Boolean p4, @t("rtj") final String p5, @t("profile_img") final Boolean p6, @t("raw_media_syntax") final Integer p7, @j final Map<String, String> p8);
    
    @f("comments/{linkId}/{commentId}/")
    c0<CommentResponse> comments(@s("linkId") final String p0, @s("commentId") final String p1, @t("sort") final String p2, @t("limit") final Integer p3, @t("context") final Integer p4, @t("rtj") final String p5, @t("threaded") final boolean p6, @t("truncate") final Integer p7, @t("emotes_as_images") final Boolean p8, @t("profile_img") final Boolean p9, @t("snoovatar_img") final Boolean p10, @t("comment_awardings_by_current_user") final Boolean p11, @j final Map<String, String> p12);
    
    @f("r/{subredditName}/comments/{linkId}/{commentId}/")
    c0<CommentResponse> commentsWithSubreddit(@s("linkId") final String p0, @s("commentId") final String p1, @s("subredditName") final String p2, @t("sort") final String p3, @t("limit") final Integer p4, @t("context") final Integer p5, @t("rtj") final String p6, @t("threaded") final boolean p7, @t("truncate") final Integer p8, @t("emotes_as_images") final Boolean p9, @t("profile_img") final Boolean p10, @t("snoovatar_img") final Boolean p11, @t("comment_awardings_by_current_user") final Boolean p12, @t("raw_media_syntax") final Integer p13, @j final Map<String, String> p14);
    
    @e
    @o("api/convert_rte_body_format")
    c0<ConverterRichTextResponse> convertCommentMarkdownToRichText(@c("markdown_text") final String p0, @c("output_mode") final String p1, @t("raw_json") final int p2, @t("allow_nested_media") final boolean p3);
    
    @e
    @o("api/editusertext")
    c0<CreateEditCommentResponse> editRichText(@c("thing_id") final String p0, @c("richtext_json") final String p1, @c("api_type") final String p2, @t("emotes_as_images") final Boolean p3, @c("return_rtjson") final Boolean p4, @t("rtj") final String p5, @t("profile_img") final Boolean p6, @t("snoovatar_img") final Boolean p7, @t("raw_media_syntax") final Integer p8);
    
    @e
    @o("api/compose")
    c0<DefaultResponse> messageCompose(@c("subject") final String p0, @c("text") final String p1, @c("to") final String p2, @c("api_type") final String p3);
    
    @e
    @o("api/comment")
    c0<DefaultResponse> messageReply(@c("thing_id") final String p0, @c("text") final String p1, @c("api_type") final String p2);
    
    @o("/api/lock")
    Object modLock(@t("id") final String p0, final tg2.c<? super pg2.j> p1);
    
    @o("/api/unlock")
    Object modUnlock(@t("id") final String p0, final tg2.c<? super pg2.j> p1);
    
    @e
    @o("api/morechildren")
    @CommentsList
    c0<List<IComment>> moreComments(@c("link_id") final String p0, @c("children") final String p1, @t("sort") final String p2, @j final Map<String, String> p3, @t("rtj") final String p4, @t("emotes_as_images") final Boolean p5, @t("profile_img") final Boolean p6, @t("comment_awardings_by_current_user") final Boolean p7);
    
    @f("user/{username}/saved?type=comments")
    @ListingEnveloped
    c0<Listing<Comment>> savedComments(@s("username") final String p0, @t("after") final String p1, @t("emotes_as_images") final Boolean p2);
    
    @o("/api/v1/modactions/removal_comment_message")
    nf2.a sendRemovalMessage(@av2.a final ContentRemovalMessage p0);
    
    @f("user/{username}/comments/")
    @ListingEnveloped
    c0<Listing<UserComment>> userComments(@s("username") final String p0, @t("after") final String p1, @j final Map<String, String> p2, @t("emotes_as_images") final Boolean p3);
    
    public static final class a
    {
    }
}
