// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.data.source.remote;

import com.google.protobuf.GeneratedMessageLite$b;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$SubredditObject$a;
import java.util.List;
import com.reddit.domain.model.Subreddit;
import af2.n;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$SubredditObject;
import com.reddit.domain.model.Link;
import af2.c0;
import y10.w;
import com.reddit.queries.u2$a;
import com.reddit.queries.u2$d;
import java.io.IOException;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import mr0.e$a;
import com.reddit.queries.u2;
import android.util.Base64;
import com.reddit.queries.u2$c;
import com.reddit.devvit.gql.SubredditMetadata$DevvitSubredditMetadata;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import com.google.protobuf.BoolValue;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$RedditObject$b;
import mg.d0;
import com.reddit.domain.model.Comment;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$RedditObject;
import kotlin.Result;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import xd0.j;
import xd0.h0;
import d80.a;

public final class RemoteDevPlatformSource
{
    public final a a;
    public final RemoteSubredditInfoSource b;
    public final h0 c;
    public final j d;
    public final s10.a e;
    
    @Inject
    public RemoteDevPlatformSource(final a a, final RemoteSubredditInfoSourceImpl b, final h0 c, final j d, final s10.a e) {
        ng2.e.f((Object)c, "subredditRepository");
        ng2.e.f((Object)d, "linkRepository");
        ng2.e.f((Object)e, "commentRepository");
        this.a = a;
        this.b = (RemoteSubredditInfoSource)b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object a(final String s, final c<? super Result<CommonMsg$RedditObject>> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RemoteDevPlatformSource$getDevPlatformCommentData$1) {
                final RemoteDevPlatformSource$getDevPlatformCommentData$1 remoteDevPlatformSource$getDevPlatformCommentData$1 = (RemoteDevPlatformSource$getDevPlatformCommentData$1)c;
                final int label = remoteDevPlatformSource$getDevPlatformCommentData$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteDevPlatformSource$getDevPlatformCommentData$1.label = label + Integer.MIN_VALUE;
                    o = remoteDevPlatformSource$getDevPlatformCommentData$1;
                    break Label_0051;
                }
            }
            o = new RemoteDevPlatformSource$getDevPlatformCommentData$1(this, (c)c);
        }
        final Object result = ((RemoteDevPlatformSource$getDevPlatformCommentData$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteDevPlatformSource$getDevPlatformCommentData$1)o).label;
        Object h;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            h = result;
        }
        else {
            cg.d.b4(result);
            final s10.a e = this.e;
            ((RemoteDevPlatformSource$getDevPlatformCommentData$1)o).label = 1;
            if ((h = e.H(s, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final com.reddit.domain.model.Result result2 = (com.reddit.domain.model.Result)h;
        Object o2;
        if (result2.isSuccess() && result2.getResult() != null) {
            final Object result3 = result2.getResult();
            ng2.e.c(result3);
            final Comment comment = (Comment)result3;
            final CommonMsg$RedditObject$b builder = CommonMsg$RedditObject.newBuilder();
            ng2.e.e((Object)builder, "newBuilder()");
            final Boolean approved = comment.getApproved();
            if (approved != null) {
                final BoolValue h2 = d0.h1((boolean)approved);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$7200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h2);
            }
            final String approvedBy = comment.getApprovedBy();
            if (approvedBy != null) {
                final StringValue j1 = d0.j1(approvedBy);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$7800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j1);
            }
            final BoolValue h3 = d0.h1(comment.getArchived());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$8100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h3);
            final StringValue j2 = d0.j1(comment.getAuthor());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$8700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j2);
            final String authorFlairBackgroundColor = comment.getAuthorFlairBackgroundColor();
            if (authorFlairBackgroundColor != null) {
                final StringValue j3 = d0.j1(authorFlairBackgroundColor);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$9000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j3);
            }
            final String authorFlairTemplateId = comment.getAuthorFlairTemplateId();
            if (authorFlairTemplateId != null) {
                final StringValue j4 = d0.j1(authorFlairTemplateId);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$10200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j4);
            }
            final String authorFlairText = comment.getAuthorFlairText();
            if (authorFlairText != null) {
                final StringValue j5 = d0.j1(authorFlairText);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$10500((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j5);
            }
            final String authorFlairTextColor = comment.getAuthorFlairTextColor();
            if (authorFlairTextColor != null) {
                final StringValue j6 = d0.j1(authorFlairTextColor);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$10800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j6);
            }
            final StringValue j7 = d0.j1(comment.getBody());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$13800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j7);
            final StringValue j8 = d0.j1(comment.getBodyHtml());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$14100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j8);
            final BoolValue h4 = d0.h1(comment.getCollapsed());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$15000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h4);
            final Boolean collapsedBecauseOfCrowdControl = comment.isCollapsedBecauseOfCrowdControl();
            if (collapsedBecauseOfCrowdControl != null) {
                final BoolValue h5 = d0.h1((boolean)collapsedBecauseOfCrowdControl);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$15300((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h5);
            }
            final String collapsedReasonCode = comment.getCollapsedReasonCode();
            if (collapsedReasonCode != null) {
                final StringValue j9 = d0.j1(collapsedReasonCode);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$15900((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j9);
            }
            final String commentType = comment.getCommentType();
            if (commentType != null) {
                final StringValue j10 = d0.j1(commentType);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$16200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j10);
            }
            final Int64Value i1 = d0.i1(comment.getCreatedUtc());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$17100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, i1);
            final String distinguished = comment.getDistinguished();
            if (distinguished != null) {
                final StringValue j11 = d0.j1(distinguished);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$17400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j11);
            }
            final StringValue j12 = d0.j1(comment.getId());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$18900((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j12);
            final StringValue j13 = d0.j1(comment.getLinkId());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$20100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j13);
            final BoolValue h6 = d0.h1(comment.getLocked());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$20400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h6);
            final StringValue j14 = d0.j1(comment.getKindWithId());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$22200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j14);
            final Integer numReports = comment.getNumReports();
            if (numReports != null) {
                final Int64Value i2 = d0.i1((long)numReports.intValue());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$22800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, i2);
            }
            final StringValue j15 = d0.j1(comment.getParentKindWithId());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$23100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j15);
            final Boolean removed = comment.getRemoved();
            if (removed != null) {
                final BoolValue h7 = d0.h1((boolean)removed);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$24000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h7);
            }
            final BoolValue h8 = d0.h1(comment.getSaved());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$25200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h8);
            final Int64Value i3 = d0.i1((long)comment.getScore());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$25500((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, i3);
            final BoolValue h9 = d0.h1(comment.getScoreHidden());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$25800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h9);
            final Boolean spam = comment.getSpam();
            if (spam != null) {
                final BoolValue h10 = d0.h1((boolean)spam);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$26400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h10);
            }
            final BoolValue h11 = d0.h1(comment.getStickied());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$26700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h11);
            final StringValue j16 = d0.j1(comment.getSubreddit());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$27000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j16);
            final StringValue j17 = d0.j1(comment.getSubredditId());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$27300((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j17);
            final StringValue j18 = d0.j1(comment.getSubredditNamePrefixed());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$27600((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j18);
            final String unrepliableReason = comment.getUnrepliableReason();
            if (unrepliableReason != null) {
                final StringValue j19 = d0.j1(unrepliableReason);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$29400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j19);
            }
            final Int64Value i4 = d0.i1((long)comment.getDepth());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$30600((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, i4);
            final String linkTitle = comment.getLinkTitle();
            if (linkTitle != null) {
                final StringValue j20 = d0.j1(linkTitle);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$30900((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j20);
            }
            final String linkUrl = comment.getLinkUrl();
            if (linkUrl != null) {
                final StringValue j21 = d0.j1(linkUrl);
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$RedditObject.access$32700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j21);
            }
            o2 = Result.constructor-impl((Object)((GeneratedMessageLite$b)builder).b());
        }
        else {
            final StringBuilder t = a.t("couldn't fetch comment: ");
            t.append(result2.getError());
            o2 = Result.constructor-impl((Object)cg.d.B1(new Throwable(t.toString())));
        }
        return o2;
    }
    
    public final Object b(final String s, final c<? super Result<SubredditMetadata$DevvitSubredditMetadata>> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RemoteDevPlatformSource$getDevPlatformMetadata$1) {
                final RemoteDevPlatformSource$getDevPlatformMetadata$1 remoteDevPlatformSource$getDevPlatformMetadata$1 = (RemoteDevPlatformSource$getDevPlatformMetadata$1)c;
                final int label = remoteDevPlatformSource$getDevPlatformMetadata$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteDevPlatformSource$getDevPlatformMetadata$1.label = label + Integer.MIN_VALUE;
                    o = remoteDevPlatformSource$getDevPlatformMetadata$1;
                    break Label_0051;
                }
            }
            o = new RemoteDevPlatformSource$getDevPlatformMetadata$1(this, (c)c);
        }
        final Object result = ((RemoteDevPlatformSource$getDevPlatformMetadata$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteDevPlatformSource$getDevPlatformMetadata$1)o).label;
        Label_0105: {
            if (label2 == 0) {
                break Label_0105;
            }
            Label_0095: {
                if (label2 != 1) {
                    break Label_0095;
                }
                RemoteDevPlatformSource remoteDevPlatformSource = (RemoteDevPlatformSource)((RemoteDevPlatformSource$getDevPlatformMetadata$1)o).L$0;
                try {
                    cg.d.b4(result);
                    Object b = result;
                    while (true) {
                        final u2$d a = ((u2$c)b).a;
                        String b3 = null;
                        Label_0195: {
                            if (a != null) {
                                final u2$a b2 = a.b;
                                if (b2 != null) {
                                    b3 = b2.b;
                                    break Label_0195;
                                }
                            }
                            b3 = null;
                        }
                        Object o2;
                        if (b3 != null) {
                            remoteDevPlatformSource.getClass();
                            final SubredditMetadata$DevvitSubredditMetadata from = SubredditMetadata$DevvitSubredditMetadata.parseFrom(Base64.decode(b3, 0));
                            ng2.e.e((Object)from, "parseFrom(data)");
                            o2 = Result.constructor-impl((Object)from);
                        }
                        else {
                            o2 = Result.constructor-impl((Object)cg.d.B1(new Throwable("Metadata missing")));
                        }
                        return o2;
                        cg.d.b4(result);
                        final a a2 = this.a;
                        final u2 u2 = new u2(s);
                        ((RemoteDevPlatformSource$getDevPlatformMetadata$1)o).L$0 = this;
                        ((RemoteDevPlatformSource$getDevPlatformMetadata$1)o).label = 1;
                        b = e$a.b(14, (k)u2, (mr0.e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                        iftrue(Label_0160:)(b != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        Label_0160: {
                            remoteDevPlatformSource = this;
                        }
                        continue;
                    }
                }
                catch (final IOException ex) {
                    return Result.constructor-impl((Object)cg.d.B1(new Throwable("GraphQL error", ex)));
                }
            }
        }
    }
    
    public final Object c(final String s, final c<? super Result<CommonMsg$RedditObject>> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RemoteDevPlatformSource$getDevPlatformPostData$1) {
                final RemoteDevPlatformSource$getDevPlatformPostData$1 remoteDevPlatformSource$getDevPlatformPostData$1 = (RemoteDevPlatformSource$getDevPlatformPostData$1)c;
                final int label = remoteDevPlatformSource$getDevPlatformPostData$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteDevPlatformSource$getDevPlatformPostData$1.label = label + Integer.MIN_VALUE;
                    o = remoteDevPlatformSource$getDevPlatformPostData$1;
                    break Label_0051;
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
            cg.d.b4(result);
            b = result;
        }
        else {
            cg.d.b4(result);
            final c0<Link> a = this.d.a(w.g(s));
            ((RemoteDevPlatformSource$getDevPlatformPostData$1)o).label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(a, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(b, "linkRepository.getLinkBy\u2026.stripPrefix(id)).await()");
        final Link link = (Link)b;
        final CommonMsg$RedditObject$b builder = CommonMsg$RedditObject.newBuilder();
        ng2.e.e((Object)builder, "newBuilder()");
        final BoolValue h1 = d0.h1(link.getApproved());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$7200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h1);
        final String approvedBy = link.getApprovedBy();
        if (approvedBy != null) {
            final StringValue j1 = d0.j1(approvedBy);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$7800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j1);
        }
        final BoolValue h2 = d0.h1(link.getArchived());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$8100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h2);
        final StringValue j2 = d0.j1(link.getAuthor());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$8700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j2);
        final String authorFlairBackgroundColor = link.getAuthorFlairBackgroundColor();
        if (authorFlairBackgroundColor != null) {
            final StringValue j3 = d0.j1(authorFlairBackgroundColor);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$9000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j3);
        }
        final String authorFlairTemplateId = link.getAuthorFlairTemplateId();
        if (authorFlairTemplateId != null) {
            final StringValue j4 = d0.j1(authorFlairTemplateId);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$10200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j4);
        }
        final String authorFlairText = link.getAuthorFlairText();
        if (authorFlairText != null) {
            final StringValue j5 = d0.j1(authorFlairText);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$10500((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j5);
        }
        final String authorFlairTextColor = link.getAuthorFlairTextColor();
        if (authorFlairTextColor != null) {
            final StringValue j6 = d0.j1(authorFlairTextColor);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$10800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j6);
        }
        final Boolean authorIsBlocked = link.getAuthorIsBlocked();
        if (authorIsBlocked != null) {
            final BoolValue h3 = d0.h1((boolean)authorIsBlocked);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$11700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h3);
        }
        final String body = link.getBody();
        if (body != null) {
            final StringValue j7 = d0.j1(body);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$13800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j7);
        }
        final BoolValue h4 = d0.h1(link.getCanGild());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$14400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h4);
        final BoolValue h5 = d0.h1(link.getCanMod());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$14700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h5);
        final Int64Value i1 = d0.i1(link.getCreatedUtc());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$17100((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, i1);
        final String distinguished = link.getDistinguished();
        if (distinguished != null) {
            final StringValue j8 = d0.j1(distinguished);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$17400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j8);
        }
        final Int64Value i2 = d0.i1((long)link.getDownvoteCount());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$17700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, i2);
        final StringValue j9 = d0.j1(link.getId());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$18900((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j9);
        final BoolValue h6 = d0.h1(link.getIgnoreReports());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$19200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h6);
        final BoolValue h7 = d0.h1(link.getLocked());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$20400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h7);
        final StringValue j10 = d0.j1(link.getKindWithId());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$22200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j10);
        final Integer numReports = link.getNumReports();
        if (numReports != null) {
            final Int64Value i3 = d0.i1((long)numReports.intValue());
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$22800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, i3);
        }
        final StringValue j11 = d0.j1(link.getPermalink());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$23400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j11);
        final BoolValue h8 = d0.h1(link.getRemoved());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$24000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h8);
        final BoolValue h9 = d0.h1(link.getSaved());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$25200((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h9);
        final Int64Value i4 = d0.i1((long)link.getScore());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$25500((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, i4);
        final BoolValue h10 = d0.h1(link.getSpam());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$26400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h10);
        final BoolValue h11 = d0.h1(link.getStickied());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$26700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h11);
        final StringValue j12 = d0.j1(link.getSubreddit());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$27000((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j12);
        final StringValue j13 = d0.j1(link.getSubredditId());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$27300((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j13);
        final StringValue j14 = d0.j1(link.getSubredditNamePrefixed());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$27600((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j14);
        final String unrepliableReason = link.getUnrepliableReason();
        if (unrepliableReason != null) {
            final StringValue j15 = d0.j1(unrepliableReason);
            ((GeneratedMessageLite$b)builder).e();
            CommonMsg$RedditObject.access$29400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, j15);
        }
        final Int64Value i5 = d0.i1((long)link.getUpvoteCount());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$29700((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, i5);
        final Int64Value i6 = d0.i1(link.getNumComments());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$31500((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, i6);
        final BoolValue h12 = d0.h1(link.getOver18());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$31800((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h12);
        final BoolValue h13 = d0.h1(link.getQuarantine());
        ((GeneratedMessageLite$b)builder).e();
        CommonMsg$RedditObject.access$32400((CommonMsg$RedditObject)((GeneratedMessageLite$b)builder).g, h13);
        return Result.constructor-impl((Object)((GeneratedMessageLite$b)builder).b());
    }
    
    public final Object d(final String s, final c<? super Result<CommonMsg$SubredditObject>> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RemoteDevPlatformSource$getDevPlatformSubredditData$1) {
                final RemoteDevPlatformSource$getDevPlatformSubredditData$1 remoteDevPlatformSource$getDevPlatformSubredditData$1 = (RemoteDevPlatformSource$getDevPlatformSubredditData$1)c;
                final int label = remoteDevPlatformSource$getDevPlatformSubredditData$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteDevPlatformSource$getDevPlatformSubredditData$1.label = label + Integer.MIN_VALUE;
                    o = remoteDevPlatformSource$getDevPlatformSubredditData$1;
                    break Label_0051;
                }
            }
            o = new RemoteDevPlatformSource$getDevPlatformSubredditData$1(this, (c)c);
        }
        Object o2 = ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).label;
        final Object o3 = null;
        Object o5 = null;
        Label_1087: {
            Label_0310: {
                RemoteDevPlatformSource remoteDevPlatformSource;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            cg.d.b4(o2);
                            break Label_0310;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        remoteDevPlatformSource = (RemoteDevPlatformSource)((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).L$0;
                        cg.d.b4(o2);
                    }
                }
                else {
                    cg.d.b4(o2);
                    final RemoteSubredditInfoSource b = this.b;
                    ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).L$0 = this;
                    ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).label = 1;
                    o2 = b.getSubredditInfo(s, 1, (c<? super ku2.w<SubredditInfoResponse>>)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    remoteDevPlatformSource = this;
                }
                final ku2.w w = (ku2.w)o2;
                if (!w.c()) {
                    return Result.constructor-impl((Object)cg.d.B1(new Throwable("couldn't resolve subreddit name")));
                }
                final SubredditInfoResponse subredditInfoResponse = (SubredditInfoResponse)w.b;
                String a4 = null;
                Label_0260: {
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
                                        break Label_0260;
                                    }
                                }
                            }
                        }
                    }
                    a4 = null;
                }
                o5 = o3;
                if (a4 == null) {
                    break Label_1087;
                }
                final n<Subreddit> e = remoteDevPlatformSource.c.E(a4, false);
                ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).L$0 = null;
                ((RemoteDevPlatformSource$getDevPlatformSubredditData$1)o).label = 2;
                if ((o2 = kotlinx.coroutines.rx2.d.g(e, (c)o)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final Subreddit subreddit = (Subreddit)o2;
            o5 = o3;
            if (subreddit != null) {
                final CommonMsg$SubredditObject$a builder = CommonMsg$SubredditObject.newBuilder();
                ng2.e.e((Object)builder, "newBuilder()");
                final Boolean userIsContributor = subreddit.getUserIsContributor();
                if (userIsContributor != null) {
                    final BoolValue h1 = d0.h1((boolean)userIsContributor);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$37200((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, h1);
                }
                final String bannerImg = subreddit.getBannerImg();
                if (bannerImg != null) {
                    final StringValue j1 = d0.j1(bannerImg);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$37500((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j1);
                }
                final Boolean restrictPosting = subreddit.getRestrictPosting();
                if (restrictPosting != null) {
                    final BoolValue h2 = d0.h1((boolean)restrictPosting);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$37800((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, h2);
                }
                final Boolean userIsBanned = subreddit.getUserIsBanned();
                if (userIsBanned != null) {
                    final BoolValue h3 = d0.h1((boolean)userIsBanned);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$38100((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, h3);
                }
                final String communityIconUrl = subreddit.getCommunityIconUrl();
                if (communityIconUrl != null) {
                    final StringValue j2 = d0.j1(communityIconUrl);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$38700((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j2);
                }
                final StringValue j3 = d0.j1(subreddit.getDisplayName());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$39900((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j3);
                final String title = subreddit.getTitle();
                if (title != null) {
                    final StringValue j4 = d0.j1(title);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$40500((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j4);
                }
                final Boolean over18 = subreddit.getOver18();
                if (over18 != null) {
                    final BoolValue h4 = d0.h1((boolean)over18);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$41700((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, h4);
                }
                final String primaryColorKey = subreddit.getPrimaryColorKey();
                if (primaryColorKey != null) {
                    final StringValue j5 = d0.j1(primaryColorKey);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$42600((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j5);
                }
                final String iconImg = subreddit.getIconImg();
                if (iconImg != null) {
                    final StringValue j6 = d0.j1(iconImg);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$42900((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j6);
                }
                final String description = subreddit.getDescription();
                if (description != null) {
                    final StringValue j7 = d0.j1(description);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$43200((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j7);
                }
                final Long subscribers = subreddit.getSubscribers();
                if (subscribers != null) {
                    final Int64Value i1 = d0.i1(subscribers.longValue());
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$44400((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, i1);
                }
                final StringValue j8 = d0.j1(subreddit.getDisplayNamePrefixed());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$45600((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j8);
                final String keyColor = subreddit.getKeyColor();
                if (keyColor != null) {
                    final StringValue j9 = d0.j1(keyColor);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$45900((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j9);
                }
                final StringValue j10 = d0.j1(subreddit.getKindWithId());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$46200((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j10);
                final StringValue j11 = d0.j1(subreddit.getUrl());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$46800((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j11);
                final Boolean quarantined = subreddit.getQuarantined();
                if (quarantined != null) {
                    final BoolValue h5 = d0.h1((boolean)quarantined);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$47100((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, h5);
                }
                final Boolean userIsModerator = subreddit.getUserIsModerator();
                if (userIsModerator != null) {
                    final BoolValue h6 = d0.h1((boolean)userIsModerator);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$48000((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, h6);
                }
                final StringValue j12 = d0.j1(subreddit.getPublicDescription());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$48600((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j12);
                final Boolean postFlairEnabled = subreddit.getPostFlairEnabled();
                if (postFlairEnabled != null) {
                    final BoolValue h7 = d0.h1((boolean)postFlairEnabled);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$48900((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, h7);
                }
                final StringValue j13 = d0.j1(subreddit.getSubredditType());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$49500((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j13);
                final Boolean userIsSubscriber = subreddit.getUserIsSubscriber();
                if (userIsSubscriber != null) {
                    final BoolValue h8 = d0.h1((boolean)userIsSubscriber);
                    ((GeneratedMessageLite$b)builder).e();
                    CommonMsg$SubredditObject.access$49800((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, h8);
                }
                final StringValue j14 = d0.j1(subreddit.getId());
                ((GeneratedMessageLite$b)builder).e();
                CommonMsg$SubredditObject.access$50400((CommonMsg$SubredditObject)((GeneratedMessageLite$b)builder).g, j14);
                o5 = ((GeneratedMessageLite$b)builder).b();
            }
        }
        Object o4;
        if (o5 != null) {
            o4 = Result.constructor-impl(o5);
        }
        else {
            o4 = Result.constructor-impl((Object)cg.d.B1(new Throwable("couldn't fetch subreddit data")));
        }
        return o4;
    }
}
