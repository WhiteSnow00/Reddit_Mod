// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools;

import com.reddit.domain.modtools.scheduledposts.UpdateScheduledPostData;
import r20.d;
import com.reddit.domain.model.Result$Success;
import com.reddit.domain.model.Link;
import com.reddit.domain.modtools.scheduledposts.SubredditScheduledPost;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.mod.SchedulePostModel;
import com.reddit.domain.model.SubmitParameters;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostContent;
import com.reddit.domain.modtools.scheduledposts.DeleteScheduledPostResult;
import com.reddit.data.modtools.remote.model.MarkdownConvertedResponse;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.ConverterRichTextResponse;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import r20.a;
import com.reddit.data.modtools.remote.RemoteMarkdownConverterDataSource;
import c50.i0;
import com.reddit.data.modtools.remote.RemoteScheduledPostDataSource;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;

public final class RedditScheduledPostRepository implements ScheduledPostRepository
{
    public final RemoteScheduledPostDataSource a;
    public final i0 b;
    public final RemoteMarkdownConverterDataSource c;
    public final a d;
    
    @Inject
    public RedditScheduledPostRepository(final RemoteScheduledPostDataSource a, final i0 b, final RemoteMarkdownConverterDataSource c, final a d) {
        f.f((Object)a, "dataSource");
        f.f((Object)b, "localLinkDataSource");
        f.f((Object)c, "markdownConverterDataSource");
        f.f((Object)d, "backgroundThread");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final Object convertMarkdownToRichText(final String s, final c<? super ConverterRichTextResponse> c) {
        return this.c.convertMarkdownToRichText(s, "rtjson", 1, true, c);
    }
    
    @Override
    public final Object convertRichTextToMarkdown(final String s, final c<? super String> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditScheduledPostRepository$convertRichTextToMarkdown.RedditScheduledPostRepository$convertRichTextToMarkdown$1) {
                final RedditScheduledPostRepository$convertRichTextToMarkdown.RedditScheduledPostRepository$convertRichTextToMarkdown$1 redditScheduledPostRepository$convertRichTextToMarkdown$1 = (RedditScheduledPostRepository$convertRichTextToMarkdown.RedditScheduledPostRepository$convertRichTextToMarkdown$1)c;
                final int label = redditScheduledPostRepository$convertRichTextToMarkdown$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditScheduledPostRepository$convertRichTextToMarkdown$1.label = label + Integer.MIN_VALUE;
                    o = redditScheduledPostRepository$convertRichTextToMarkdown$1;
                    break Label_0050;
                }
            }
            o = new RedditScheduledPostRepository$convertRichTextToMarkdown.RedditScheduledPostRepository$convertRichTextToMarkdown$1(this, (c)c);
        }
        final Object result = ((RedditScheduledPostRepository$convertRichTextToMarkdown.RedditScheduledPostRepository$convertRichTextToMarkdown$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditScheduledPostRepository$convertRichTextToMarkdown.RedditScheduledPostRepository$convertRichTextToMarkdown$1)o).label;
        Object convertRichTextToMarkdown;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            convertRichTextToMarkdown = result;
        }
        else {
            aj2.c.Q0(result);
            final RemoteMarkdownConverterDataSource c2 = this.c;
            ((RedditScheduledPostRepository$convertRichTextToMarkdown.RedditScheduledPostRepository$convertRichTextToMarkdown$1)o).label = 1;
            if ((convertRichTextToMarkdown = c2.convertRichTextToMarkdown(s, "markdown", 1, true, (c<? super MarkdownConvertedResponse>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((MarkdownConvertedResponse)convertRichTextToMarkdown).a;
    }
    
    @Override
    public final Object deleteScheduledPost(final String s, final c<? super DeleteScheduledPostResult> c) {
        return this.a.a(s, c);
    }
    
    @Override
    public final Object getScheduledPosts(final String s, final c<? super ScheduledPostContent> c) {
        return this.a.b(s, c);
    }
    
    @Override
    public final Object submitScheduledPost(final String s, final SubmitParameters submitParameters, final SchedulePostModel schedulePostModel, final c<? super Result<SubredditScheduledPost>> c) {
        return this.a.c(s, submitParameters, schedulePostModel, c);
    }
    
    @Override
    public final Object submitScheduledPostNow(final String s, final c<? super Result<Link>> c) {
        RedditScheduledPostRepository$submitScheduledPostNow.RedditScheduledPostRepository$submitScheduledPostNow$1 redditScheduledPostRepository$submitScheduledPostNow$2 = null;
        Label_0050: {
            if (c instanceof RedditScheduledPostRepository$submitScheduledPostNow.RedditScheduledPostRepository$submitScheduledPostNow$1) {
                final RedditScheduledPostRepository$submitScheduledPostNow.RedditScheduledPostRepository$submitScheduledPostNow$1 redditScheduledPostRepository$submitScheduledPostNow$1 = (RedditScheduledPostRepository$submitScheduledPostNow.RedditScheduledPostRepository$submitScheduledPostNow$1)c;
                final int label = redditScheduledPostRepository$submitScheduledPostNow$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditScheduledPostRepository$submitScheduledPostNow$1.label = label + Integer.MIN_VALUE;
                    redditScheduledPostRepository$submitScheduledPostNow$2 = redditScheduledPostRepository$submitScheduledPostNow$1;
                    break Label_0050;
                }
            }
            redditScheduledPostRepository$submitScheduledPostNow$2 = new RedditScheduledPostRepository$submitScheduledPostNow.RedditScheduledPostRepository$submitScheduledPostNow$1(this, (c)c);
        }
        Object o = redditScheduledPostRepository$submitScheduledPostNow$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditScheduledPostRepository$submitScheduledPostNow$2.label;
        RedditScheduledPostRepository redditScheduledPostRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final Object o2 = redditScheduledPostRepository$submitScheduledPostNow$2.L$0;
                    aj2.c.Q0(o);
                    return o2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                redditScheduledPostRepository = (RedditScheduledPostRepository)redditScheduledPostRepository$submitScheduledPostNow$2.L$0;
                aj2.c.Q0(o);
            }
        }
        else {
            aj2.c.Q0(o);
            final RemoteScheduledPostDataSource a = this.a;
            redditScheduledPostRepository$submitScheduledPostNow$2.L$0 = this;
            redditScheduledPostRepository$submitScheduledPostNow$2.label = 1;
            o = a.d(s, (c<? super Result<Link>>)redditScheduledPostRepository$submitScheduledPostNow$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditScheduledPostRepository = this;
        }
        Object o3;
        final Result l$0 = (Result)(o3 = o);
        if (!(l$0 instanceof Result$Success)) {
            return o3;
        }
        final nf2.a t = o72.f.t(redditScheduledPostRepository.b.H((Link)((Result$Success)l$0).getResult()), (d)redditScheduledPostRepository.d);
        redditScheduledPostRepository$submitScheduledPostNow$2.L$0 = l$0;
        redditScheduledPostRepository$submitScheduledPostNow$2.label = 2;
        if (kotlinx.coroutines.rx2.d.a(t, (c)redditScheduledPostRepository$submitScheduledPostNow$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final Object o2 = l$0;
        o3 = o2;
        return o3;
    }
    
    @Override
    public final Object updateScheduledPost(final UpdateScheduledPostData updateScheduledPostData, final c<? super Result<SubredditScheduledPost>> c) {
        return this.a.e(updateScheduledPostData, c);
    }
}
