// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts;

import com.reddit.domain.model.Link;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.mod.SchedulePostModel;
import com.reddit.domain.model.SubmitParameters;
import com.reddit.domain.model.ConverterRichTextResponse;
import tg2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H共\u00f8\u0001\u0000兝u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H共\u00f8\u0001\u0000兝u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H共\u00f8\u0001\u0000兝u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u000f\u001a\u00020\u0002H共\u00f8\u0001\u0000兝u0006\u0004\b\u0013\u0010\u000eJ!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0015\u001a\u00020\u0014H共\u00f8\u0001\u0000兝u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H共\u00f8\u0001\u0000兝u0006\u0004\b\u0019\u0010\u000eJ\u001b\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H共\u00f8\u0001\u0000兝u0006\u0004\b\u001c\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019沔u0006\u001d" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "", "", "subredditId", "Lcom/reddit/domain/model/SubmitParameters;", "submitParameters", "Lcom/reddit/domain/model/mod/SchedulePostModel;", "scheduledPost", "Lcom/reddit/domain/model/Result;", "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost;", "submitScheduledPost", "(Ljava/lang/String;Lcom/reddit/domain/model/SubmitParameters;Lcom/reddit/domain/model/mod/SchedulePostModel;Ltg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostContent;", "getScheduledPosts", "(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "scheduledPostId", "Lcom/reddit/domain/modtools/scheduledposts/DeleteScheduledPostResult;", "deleteScheduledPost", "Lcom/reddit/domain/model/Link;", "submitScheduledPostNow", "Lcom/reddit/domain/modtools/scheduledposts/UpdateScheduledPostData;", "updateData", "updateScheduledPost", "(Lcom/reddit/domain/modtools/scheduledposts/UpdateScheduledPostData;Ltg2/c;)Ljava/lang/Object;", "rtJson", "convertRichTextToMarkdown", "markdown", "Lcom/reddit/domain/model/ConverterRichTextResponse;", "convertMarkdownToRichText", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface ScheduledPostRepository
{
    Object convertMarkdownToRichText(final String p0, final c<? super ConverterRichTextResponse> p1);
    
    Object convertRichTextToMarkdown(final String p0, final c<? super String> p1);
    
    Object deleteScheduledPost(final String p0, final c<? super DeleteScheduledPostResult> p1);
    
    Object getScheduledPosts(final String p0, final c<? super ScheduledPostContent> p1);
    
    Object submitScheduledPost(final String p0, final SubmitParameters p1, final SchedulePostModel p2, final c<? super Result<SubredditScheduledPost>> p3);
    
    Object submitScheduledPostNow(final String p0, final c<? super Result<Link>> p1);
    
    Object updateScheduledPost(final UpdateScheduledPostData p0, final c<? super Result<SubredditScheduledPost>> p1);
}
