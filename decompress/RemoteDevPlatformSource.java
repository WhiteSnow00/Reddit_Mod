// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.data.source.remote;

import com.google.protobuf.GeneratedMessageLite$b;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$SubredditObject$a;
import nf2.n;
import java.util.List;
import com.reddit.domain.model.Subreddit;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$SubredditObject;
import nf2.c0;
import com.reddit.domain.model.Link;
import kotlinx.coroutines.rx2.d;
import z10.w;
import com.reddit.queries.u2$a;
import com.reddit.queries.u2$d;
import java.io.IOException;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.u2;
import android.util.Base64;
import com.reddit.queries.u2$c;
import com.reddit.devvit.gql.SubredditMetadata$DevvitSubredditMetadata;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import com.google.protobuf.BoolValue;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$RedditObject$b;
import com.reddit.domain.model.Comment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$RedditObject;
import kotlin.Result;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ge0.r;
import ge0.o0;
import l80.a;

public final class RemoteDevPlatformSource
{
    public final a a;
    public final RemoteSubredditInfoSource b;
    public final o0 c;
    public final r d;
    public final t10.a e;
    
    @Inject
    public RemoteDevPlatformSource(final a a, final RemoteSubredditInfoSourceImpl b, final o0 c, final r d, final t10.a e) {
        f.f((Object)c, "subredditRepository");
        f.f((Object)d, "linkRepository");
        f.f((Object)e, "commentRepository");
        this.a = a;
        this.b = (RemoteSubredditInfoSource)b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object a(final String s, final c<? super Result<CommonMsg$RedditObject>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteDevPlatformSource$getDevPlatformCommentData$1) {
                final RemoteDevPlatformSource$getDevPlatformCommentData$1 remoteDevPlatformSource$getDevPlatformCommentData$1 = (RemoteDevPlatformSource$getDevPlatformCommentData$1)c;
                final int label = remoteDevPlatformSource$getDevPlatformCommentData$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteDevPlatformSource$getDevPlatformCommentData$1.label = label + Integer.MIN_VALUE;
                    o = remoteDevPlatformSource$getDevPlatformCommentData$1;
                    break Label_0050;
                }
            }
            o = new RemoteDevPlatformSource$getDevPlatformCommentData$1(this, (c)c);
        }
        final Object result = ((RemoteDevPlatformSource$getDevPlatformCommentData$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteDevPlatformSource$getDevPlatformCommentData$1)o).label;
        Object f;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            f = result;
        }
        else {
            aj2.c.Q0(result);
            final t10.a e = this.e;
            ((RemoteDevPlatformSource$getDevPlatformCommentData$1)o).label = 1;
            if ((f = e.F(s, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final com.reddit.domain.model.Result result2 = (com.reddit.domain.model.Result)f;
        Object o23;
        if (result2.isSuccess() && result2.getResult() != null) {
            final Object result3 = result2.getResult();
            ah2.f.c(result3);
            final Comment comment = (Comment)result3;
            final CommonMsg$RedditObject$b builder = CommonMsg$RedditObject.newBuilder();
            ah2.f.e((Object)builder, "newBuilder()");
            final Boolean approved = comment.getApproved();
            if (approved != null) {
                final BoolValue m0 = n02.r.m0((boolean)approved);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$7200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m0);
            }
            final String approvedBy = comment.getApprovedBy();
            if (approvedBy != null) {
                final StringValue o2 = n02.r.o0(approvedBy);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$7800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o2);
            }
            final BoolValue m2 = n02.r.m0(comment.getArchived());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$8100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m2);
            final StringValue o3 = n02.r.o0(comment.getAuthor());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$8700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o3);
            final String authorFlairBackgroundColor = comment.getAuthorFlairBackgroundColor();
            if (authorFlairBackgroundColor != null) {
                final StringValue o4 = n02.r.o0(authorFlairBackgroundColor);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$9000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o4);
            }
            final String authorFlairTemplateId = comment.getAuthorFlairTemplateId();
            if (authorFlairTemplateId != null) {
                final StringValue o5 = n02.r.o0(authorFlairTemplateId);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$10200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o5);
            }
            final String authorFlairText = comment.getAuthorFlairText();
            if (authorFlairText != null) {
                final StringValue o6 = n02.r.o0(authorFlairText);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$10500((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o6);
            }
            final String authorFlairTextColor = comment.getAuthorFlairTextColor();
            if (authorFlairTextColor != null) {
                final StringValue o7 = n02.r.o0(authorFlairTextColor);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$10800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o7);
            }
            final StringValue o8 = n02.r.o0(comment.getBody());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$13800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o8);
            final StringValue o9 = n02.r.o0(comment.getBodyHtml());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$14100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o9);
            final BoolValue m3 = n02.r.m0(comment.getCollapsed());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$15000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m3);
            final Boolean collapsedBecauseOfCrowdControl = comment.isCollapsedBecauseOfCrowdControl();
            if (collapsedBecauseOfCrowdControl != null) {
                final BoolValue m4 = n02.r.m0((boolean)collapsedBecauseOfCrowdControl);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$15300((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m4);
            }
            final String collapsedReasonCode = comment.getCollapsedReasonCode();
            if (collapsedReasonCode != null) {
                final StringValue o10 = n02.r.o0(collapsedReasonCode);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$15900((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o10);
            }
            final String commentType = comment.getCommentType();
            if (commentType != null) {
                final StringValue o11 = n02.r.o0(commentType);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$16200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o11);
            }
            final Int64Value n0 = n02.r.n0(comment.getCreatedUtc());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$17100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, n0);
            final String distinguished = comment.getDistinguished();
            if (distinguished != null) {
                final StringValue o12 = n02.r.o0(distinguished);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$17400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o12);
            }
            final StringValue o13 = n02.r.o0(comment.getId());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$18900((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o13);
            final StringValue o14 = n02.r.o0(comment.getLinkId());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$20100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o14);
            final BoolValue m5 = n02.r.m0(comment.getLocked());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$20400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m5);
            final StringValue o15 = n02.r.o0(comment.getKindWithId());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$22200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o15);
            final Integer numReports = comment.getNumReports();
            if (numReports != null) {
                final Int64Value n2 = n02.r.n0((long)numReports.intValue());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$22800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, n2);
            }
            final StringValue o16 = n02.r.o0(comment.getParentKindWithId());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$23100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o16);
            final Boolean removed = comment.getRemoved();
            if (removed != null) {
                final BoolValue m6 = n02.r.m0((boolean)removed);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$24000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m6);
            }
            final BoolValue m7 = n02.r.m0(comment.getSaved());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$25200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m7);
            final Int64Value n3 = n02.r.n0((long)comment.getScore());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$25500((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, n3);
            final BoolValue m8 = n02.r.m0(comment.getScoreHidden());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$25800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m8);
            final Boolean spam = comment.getSpam();
            if (spam != null) {
                final BoolValue m9 = n02.r.m0((boolean)spam);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$26400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m9);
            }
            final BoolValue m10 = n02.r.m0(comment.getStickied());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$26700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m10);
            final StringValue o17 = n02.r.o0(comment.getSubreddit());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$27000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o17);
            final StringValue o18 = n02.r.o0(comment.getSubredditId());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$27300((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o18);
            final StringValue o19 = n02.r.o0(comment.getSubredditNamePrefixed());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$27600((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o19);
            final String unrepliableReason = comment.getUnrepliableReason();
            if (unrepliableReason != null) {
                final StringValue o20 = n02.r.o0(unrepliableReason);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$29400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o20);
            }
            final Int64Value n4 = n02.r.n0((long)comment.getDepth());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$30600((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, n4);
            final String linkTitle = comment.getLinkTitle();
            if (linkTitle != null) {
                final StringValue o21 = n02.r.o0(linkTitle);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$30900((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o21);
            }
            final String linkUrl = comment.getLinkUrl();
            if (linkUrl != null) {
                final StringValue o22 = n02.r.o0(linkUrl);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$32700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o22);
            }
            o23 = Result.constructor-impl((Object)((GeneratedMessageLite$b)builder).c());
        }
        else {
            final StringBuilder k = a.k("couldn't fetch comment: ");
            k.append(result2.getError());
            o23 = Result.constructor-impl((Object)aj2.c.G(new Throwable(k.toString())));
        }
        return o23;
    }
    
    public final Object b(final String s, final c<? super Result<SubredditMetadata$DevvitSubredditMetadata>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteDevPlatformSource$getDevPlatformMetadata$1) {
                final RemoteDevPlatformSource$getDevPlatformMetadata$1 remoteDevPlatformSource$getDevPlatformMetadata$1 = (RemoteDevPlatformSource$getDevPlatformMetadata$1)c;
                final int label = remoteDevPlatformSource$getDevPlatformMetadata$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteDevPlatformSource$getDevPlatformMetadata$1.label = label + Integer.MIN_VALUE;
                    o = remoteDevPlatformSource$getDevPlatformMetadata$1;
                    break Label_0050;
                }
            }
            o = new RemoteDevPlatformSource$getDevPlatformMetadata$1(this, (c)c);
        }
        final Object result = ((RemoteDevPlatformSource$getDevPlatformMetadata$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteDevPlatformSource$getDevPlatformMetadata$1)o).label;
        Label_0104: {
            if (label2 == 0) {
                break Label_0104;
            }
            Label_0094: {
                if (label2 != 1) {
                    break Label_0094;
                }
                RemoteDevPlatformSource remoteDevPlatformSource = (RemoteDevPlatformSource)((RemoteDevPlatformSource$getDevPlatformMetadata$1)o).L$0;
                try {
                    aj2.c.Q0(result);
                    Object b = result;
                    while (true) {
                        final u2$d a = ((u2$c)b).a;
                        String b3 = null;
                        Label_0190: {
                            if (a != null) {
                                final u2$a b2 = a.b;
                                if (b2 != null) {
                                    b3 = b2.b;
                                    break Label_0190;
                                }
                            }
                            b3 = null;
                        }
                        Object o2;
                        if (b3 != null) {
                            remoteDevPlatformSource.getClass();
                            final SubredditMetadata$DevvitSubredditMetadata from = SubredditMetadata$DevvitSubredditMetadata.parseFrom(Base64.decode(b3, 0));
                            f.e((Object)from, "parseFrom(data)");
                            o2 = Result.constructor-impl((Object)from);
                        }
                        else {
                            o2 = Result.constructor-impl((Object)aj2.c.G(new Throwable("Metadata missing")));
                        }
                        return o2;
                        Label_0155: {
                            remoteDevPlatformSource = this;
                        }
                        continue;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    aj2.c.Q0(result);
                    final a a2 = this.a;
                    final u2 u2 = new u2(s);
                    ((RemoteDevPlatformSource$getDevPlatformMetadata$1)o).L$0 = this;
                    ((RemoteDevPlatformSource$getDevPlatformMetadata$1)o).label = 1;
                    b = e$a.b(14, (k)u2, (e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                    iftrue(Label_0155:)(b != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final IOException ex) {
                    return Result.constructor-impl((Object)aj2.c.G(new Throwable("GraphQL error", ex)));
                }
            }
        }
    }
    
    public final Object c(final String s, final c<? super Result<CommonMsg$RedditObject>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteDevPlatformSource$getDevPlatformPostData$1) {
                final RemoteDevPlatformSource$getDevPlatformPostData$1 remoteDevPlatformSource$getDevPlatformPostData$1 = (RemoteDevPlatformSource$getDevPlatformPostData$1)c;
                final int label = remoteDevPlatformSource$getDevPlatformPostData$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteDevPlatformSource$getDevPlatformPostData$1.label = label + Integer.MIN_VALUE;
                    o = remoteDevPlatformSource$getDevPlatformPostData$1;
                    break Label_0050;
                }
            }
            o = new RemoteDevPlatformSource$getDevPlatformPostData$1(this, (c)c);
        }
        final Object result = ((RemoteDevPlatformSource$getDevPlatformPostData$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteDevPlatformSource$getDevPlatformPostData$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final c0 a = this.d.a(w.g(s));
            ((RemoteDevPlatformSource$getDevPlatformPostData$1)o).label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(a, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        f.e(b, "linkRepository.getLinkBy\u2026.stripPrefix(id)).await()");
        final Link link = (Link)b;
        final CommonMsg$RedditObject$b builder = CommonMsg$RedditObject.newBuilder();
        f.e((Object)builder, "newBuilder()");
        final BoolValue m0 = n02.r.m0(link.getApproved());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$7200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m0);
        final String approvedBy = link.getApprovedBy();
        if (approvedBy != null) {
            final StringValue o2 = n02.r.o0(approvedBy);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$7800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o2);
        }
        final BoolValue m2 = n02.r.m0(link.getArchived());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$8100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m2);
        final StringValue o3 = n02.r.o0(link.getAuthor());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$8700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o3);
        final String authorFlairBackgroundColor = link.getAuthorFlairBackgroundColor();
        if (authorFlairBackgroundColor != null) {
            final StringValue o4 = n02.r.o0(authorFlairBackgroundColor);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$9000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o4);
        }
        final String authorFlairTemplateId = link.getAuthorFlairTemplateId();
        if (authorFlairTemplateId != null) {
            final StringValue o5 = n02.r.o0(authorFlairTemplateId);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$10200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o5);
        }
        final String authorFlairText = link.getAuthorFlairText();
        if (authorFlairText != null) {
            final StringValue o6 = n02.r.o0(authorFlairText);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$10500((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o6);
        }
        final String authorFlairTextColor = link.getAuthorFlairTextColor();
        if (authorFlairTextColor != null) {
            final StringValue o7 = n02.r.o0(authorFlairTextColor);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$10800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o7);
        }
        final Boolean authorIsBlocked = link.getAuthorIsBlocked();
        if (authorIsBlocked != null) {
            final BoolValue m3 = n02.r.m0((boolean)authorIsBlocked);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$11700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m3);
        }
        final String body = link.getBody();
        if (body != null) {
            final StringValue o8 = n02.r.o0(body);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$13800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o8);
        }
        final BoolValue m4 = n02.r.m0(link.getCanGild());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$14400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m4);
        final BoolValue m5 = n02.r.m0(link.getCanMod());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$14700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m5);
        final Int64Value n0 = n02.r.n0(link.getCreatedUtc());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$17100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, n0);
        final String distinguished = link.getDistinguished();
        if (distinguished != null) {
            final StringValue o9 = n02.r.o0(distinguished);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$17400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o9);
        }
        final Int64Value n2 = n02.r.n0((long)link.getDownvoteCount());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$17700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, n2);
        final StringValue o10 = n02.r.o0(link.getId());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$18900((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o10);
        final BoolValue m6 = n02.r.m0(link.getIgnoreReports());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$19200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m6);
        final BoolValue m7 = n02.r.m0(link.getLocked());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$20400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m7);
        final StringValue o11 = n02.r.o0(link.getKindWithId());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$22200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o11);
        final Integer numReports = link.getNumReports();
        if (numReports != null) {
            final Int64Value n3 = n02.r.n0((long)numReports.intValue());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$22800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, n3);
        }
        final StringValue o12 = n02.r.o0(link.getPermalink());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$23400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o12);
        final BoolValue m8 = n02.r.m0(link.getRemoved());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$24000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m8);
        final BoolValue m9 = n02.r.m0(link.getSaved());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$25200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m9);
        final Int64Value n4 = n02.r.n0((long)link.getScore());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$25500((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, n4);
        final BoolValue m10 = n02.r.m0(link.getSpam());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$26400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m10);
        final BoolValue m11 = n02.r.m0(link.getStickied());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$26700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m11);
        final StringValue o13 = n02.r.o0(link.getSubreddit());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$27000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o13);
        final StringValue o14 = n02.r.o0(link.getSubredditId());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$27300((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o14);
        final StringValue o15 = n02.r.o0(link.getSubredditNamePrefixed());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$27600((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o15);
        final String unrepliableReason = link.getUnrepliableReason();
        if (unrepliableReason != null) {
            final StringValue o16 = n02.r.o0(unrepliableReason);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$29400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, o16);
        }
        final Int64Value n5 = n02.r.n0((long)link.getUpvoteCount());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$29700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, n5);
        final Int64Value n6 = n02.r.n0(link.getNumComments());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$31500((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, n6);
        final BoolValue m12 = n02.r.m0(link.getOver18());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$31800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m12);
        final BoolValue m13 = n02.r.m0(link.getQuarantine());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$32400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, m13);
        return Result.constructor-impl((Object)((GeneratedMessageLite$b)builder).c());
    }
    
    public final Object d(final String s, final c<? super Result<CommonMsg$SubredditObject>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteDevPlatformSource$getDevPlatformSubredditData$1) {
                final RemoteDevPlatformSource$getDevPlatformSubredditData$1 remoteDevPlatformSource$getDevPlatformSubredditData$1 = (RemoteDevPlatformSource$getDevPlatformSubredditData$1)c;
                final int label = remoteDevPlatformSource$getDevPlatformSubredditData$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteDevPlatformSource$getDevPlatformSubredditData$1.label = label + Integer.MIN_VALUE;
                    o = remoteDevPlatformSource$getDevPlatformSubredditData$1;
                    break Label_0050;
                }
            }
            o = new RemoteDevPlatformSource$getDevPlatformSubredditData$1(this, (c)c);
        }
        Object o2 = ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).label;
        final Object o3 = null;
        Object o5 = null;
        Label_0966: {
            Label_0284: {
                RemoteDevPlatformSource remoteDevPlatformSource;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            aj2.c.Q0(o2);
                            break Label_0284;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        remoteDevPlatformSource = (RemoteDevPlatformSource)((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).L$0;
                        aj2.c.Q0(o2);
                    }
                }
                else {
                    aj2.c.Q0(o2);
                    final RemoteSubredditInfoSource b = this.b;
                    ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).L$0 = this;
                    ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).label = 1;
                    o2 = b.getSubredditInfo(s, 1, (c<? super wu2.w<SubredditInfoResponse>>)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    remoteDevPlatformSource = this;
                }
                final wu2.w w = (wu2.w)o2;
                if (!w.c()) {
                    return Result.constructor-impl((Object)aj2.c.G(new Throwable("couldn't resolve subreddit name")));
                }
                final SubredditInfoResponse subredditInfoResponse = (SubredditInfoResponse)w.b;
                String a4 = null;
                Label_0236: {
                    if (subredditInfoResponse != null) {
                        final SubredditInfoData a = subredditInfoResponse.a;
                        if (a != null) {
                            final List<SubredditInfoChild> a2 = a.a;
                            if (a2 != null) {
                                final SubredditInfoChild subredditInfoChild = a2.get(0);
                                if (subredditInfoChild != null) {
                                    final SubredditInfoChildData a3 = subredditInfoChild.a;
                                    if (a3 != null) {
                                        a4 = a3.a;
                                        break Label_0236;
                                    }
                                }
                            }
                        }
                    }
                    a4 = null;
                }
                o5 = o3;
                if (a4 == null) {
                    break Label_0966;
                }
                final n k = remoteDevPlatformSource.c.K(a4, false);
                ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).L$0 = null;
                ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).label = 2;
                if ((o2 = kotlinx.coroutines.rx2.d.g(k, (c)o)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final Subreddit subreddit = (Subreddit)o2;
            o5 = o3;
            if (subreddit != null) {
                final CommonMsg$SubredditObject$a builder = CommonMsg$SubredditObject.newBuilder();
                f.e((Object)builder, "newBuilder()");
                final Boolean userIsContributor = subreddit.getUserIsContributor();
                if (userIsContributor != null) {
                    final BoolValue m0 = n02.r.m0((boolean)userIsContributor);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$37200((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, m0);
                }
                final String bannerImg = subreddit.getBannerImg();
                if (bannerImg != null) {
                    final StringValue o6 = n02.r.o0(bannerImg);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$37500((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o6);
                }
                final Boolean restrictPosting = subreddit.getRestrictPosting();
                if (restrictPosting != null) {
                    final BoolValue m2 = n02.r.m0((boolean)restrictPosting);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$37800((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, m2);
                }
                final Boolean userIsBanned = subreddit.getUserIsBanned();
                if (userIsBanned != null) {
                    final BoolValue m3 = n02.r.m0((boolean)userIsBanned);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$38100((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, m3);
                }
                final String communityIconUrl = subreddit.getCommunityIconUrl();
                if (communityIconUrl != null) {
                    final StringValue o7 = n02.r.o0(communityIconUrl);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$38700((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o7);
                }
                final StringValue o8 = n02.r.o0(subreddit.getDisplayName());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$39900((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o8);
                final String title = subreddit.getTitle();
                if (title != null) {
                    final StringValue o9 = n02.r.o0(title);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$40500((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o9);
                }
                final Boolean over18 = subreddit.getOver18();
                if (over18 != null) {
                    final BoolValue m4 = n02.r.m0((boolean)over18);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$41700((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, m4);
                }
                final String primaryColorKey = subreddit.getPrimaryColorKey();
                if (primaryColorKey != null) {
                    final StringValue o10 = n02.r.o0(primaryColorKey);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$42600((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o10);
                }
                final String iconImg = subreddit.getIconImg();
                if (iconImg != null) {
                    final StringValue o11 = n02.r.o0(iconImg);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$42900((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o11);
                }
                final String description = subreddit.getDescription();
                if (description != null) {
                    final StringValue o12 = n02.r.o0(description);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$43200((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o12);
                }
                final Long subscribers = subreddit.getSubscribers();
                if (subscribers != null) {
                    final Int64Value n0 = n02.r.n0(subscribers.longValue());
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$44400((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, n0);
                }
                final StringValue o13 = n02.r.o0(subreddit.getDisplayNamePrefixed());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$45600((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o13);
                final String keyColor = subreddit.getKeyColor();
                if (keyColor != null) {
                    final StringValue o14 = n02.r.o0(keyColor);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$45900((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o14);
                }
                final StringValue o15 = n02.r.o0(subreddit.getKindWithId());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$46200((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o15);
                final StringValue o16 = n02.r.o0(subreddit.getUrl());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$46800((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o16);
                final Boolean quarantined = subreddit.getQuarantined();
                if (quarantined != null) {
                    final BoolValue m5 = n02.r.m0((boolean)quarantined);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$47100((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, m5);
                }
                final Boolean userIsModerator = subreddit.getUserIsModerator();
                if (userIsModerator != null) {
                    final BoolValue m6 = n02.r.m0((boolean)userIsModerator);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$48000((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, m6);
                }
                final StringValue o17 = n02.r.o0(subreddit.getPublicDescription());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$48600((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o17);
                final Boolean postFlairEnabled = subreddit.getPostFlairEnabled();
                if (postFlairEnabled != null) {
                    final BoolValue m7 = n02.r.m0((boolean)postFlairEnabled);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$48900((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, m7);
                }
                final StringValue o18 = n02.r.o0(subreddit.getSubredditType());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$49500((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o18);
                final Boolean userIsSubscriber = subreddit.getUserIsSubscriber();
                if (userIsSubscriber != null) {
                    final BoolValue m8 = n02.r.m0((boolean)userIsSubscriber);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$49800((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, m8);
                }
                final StringValue o19 = n02.r.o0(subreddit.getId());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$50400((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, o19);
                o5 = ((GeneratedMessageLite$b)builder).c();
            }
        }
        Object o4;
        if (o5 != null) {
            o4 = Result.constructor-impl(o5);
        }
        else {
            o4 = Result.constructor-impl((Object)aj2.c.G(new Throwable("couldn't fetch subreddit data")));
        }
        return o4;
    }
}
