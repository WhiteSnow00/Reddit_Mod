// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools.remote;

import com.reddit.mutations.k8$d;
import com.reddit.mutations.k8$e;
import com.reddit.mutations.k8$c;
import com.reddit.mutations.k8$b;
import com.reddit.mutations.k8;
import o22.u4;
import com.reddit.type.StickyPosition;
import com.reddit.domain.modtools.scheduledposts.UpdateScheduledPostData;
import com.reddit.mutations.d6$g$a;
import com.reddit.mutations.d6$g;
import com.reddit.mutations.d6$a;
import com.reddit.fragment.PostContentFragment;
import com.reddit.mutations.d6$e$a;
import com.reddit.mutations.d6$e;
import com.reddit.fragment.SubredditFragment;
import com.reddit.mutations.d6$f;
import com.reddit.mutations.d6$d;
import com.reddit.fragment.CrosspostContentFragment;
import com.reddit.fragment.FeedAnswerableQuestionsFragment;
import com.reddit.fragment.PostRecommendationFragment$u;
import com.squareup.moshi.JsonAdapter;
import com.reddit.mutations.d6$c;
import com.reddit.mutations.d6;
import androidx.appcompat.widget.s0;
import o22.o3;
import com.reddit.domain.model.Link;
import com.reddit.mutations.o1$e;
import com.reddit.mutations.o1$b;
import com.reddit.domain.model.mod.RepeatMode;
import j$.time.format.DateTimeFormatter;
import java.util.Date;
import com.reddit.domain.model.Result$Error;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.o1$d;
import com.reddit.domain.model.Result$Success;
import com.reddit.mutations.o1$c;
import com.reddit.mutations.o1;
import o22.d2;
import com.reddit.type.Frequency;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import com.reddit.type.DiscussionType;
import kotlin.NoWhenBranchMatchedException;
import o22.b1;
import h7.h;
import o22.o;
import h7.h$a;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.mod.SchedulePostModel;
import com.reddit.domain.model.SubmitParameters;
import com.reddit.fragment.StandaloneScheduledPostsFragment$b$a;
import com.reddit.fragment.StandaloneScheduledPostsFragment$b;
import com.reddit.fragment.StandaloneScheduledPostsFragment$c;
import com.reddit.fragment.StandaloneScheduledPostsFragment;
import com.reddit.fragment.ScheduledPostFragment;
import com.reddit.fragment.RecurringScheduledPostsFragment$b$a;
import com.reddit.fragment.RecurringScheduledPostsFragment$b;
import com.reddit.fragment.RecurringScheduledPostsFragment$c;
import com.reddit.fragment.RecurringScheduledPostsFragment;
import com.reddit.queries.ia$d$a;
import com.reddit.queries.ia$d;
import com.reddit.queries.ia$a;
import com.reddit.queries.ia$e;
import com.reddit.fragment.StandaloneScheduledPostsFragment$a;
import kotlin.collections.EmptyList;
import com.reddit.fragment.RecurringScheduledPostsFragment$a;
import com.reddit.domain.modtools.scheduledposts.SubredditScheduledPost;
import com.reddit.queries.ia$c;
import com.reddit.queries.ia;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostContent;
import java.util.Iterator;
import com.reddit.mutations.l2$c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import com.reddit.mutations.l2$d;
import java.util.ArrayList;
import qg2.m;
import com.reddit.mutations.l2$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.l2;
import o22.n0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.modtools.scheduledposts.DeleteScheduledPostResult;
import tg2.c;
import javax.inject.Inject;
import pg2.f;
import rr0.a;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import ur0.g;
import com.squareup.moshi.y;

public final class RemoteScheduledPostDataSource
{
    public final y a;
    public final g b;
    public final GqlPostToLinkDomainModelMapper c;
    public final a d;
    public final f e;
    
    @Inject
    public RemoteScheduledPostDataSource(final GqlPostToLinkDomainModelMapper c, final a d, final g b, final y a) {
        ah2.f.f((Object)a, "moshi");
        ah2.f.f((Object)b, "graphQlClient");
        ah2.f.f((Object)c, "gqlPostToLinkDomainModelMapper");
        ah2.f.f((Object)d, "goldFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = kotlin.a.b((zg2.a)new RemoteScheduledPostDataSource$richTextAdapter$2(this));
    }
    
    public final Object a(final String s, final c<? super DeleteScheduledPostResult> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteScheduledPostDataSource$deleteScheduledPost.RemoteScheduledPostDataSource$deleteScheduledPost$1) {
                final RemoteScheduledPostDataSource$deleteScheduledPost.RemoteScheduledPostDataSource$deleteScheduledPost$1 remoteScheduledPostDataSource$deleteScheduledPost$1 = (RemoteScheduledPostDataSource$deleteScheduledPost.RemoteScheduledPostDataSource$deleteScheduledPost$1)c;
                final int label = remoteScheduledPostDataSource$deleteScheduledPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteScheduledPostDataSource$deleteScheduledPost$1.label = label + Integer.MIN_VALUE;
                    o = remoteScheduledPostDataSource$deleteScheduledPost$1;
                    break Label_0050;
                }
            }
            o = new RemoteScheduledPostDataSource$deleteScheduledPost.RemoteScheduledPostDataSource$deleteScheduledPost$1(this, (c)c);
        }
        final Object result = ((RemoteScheduledPostDataSource$deleteScheduledPost.RemoteScheduledPostDataSource$deleteScheduledPost$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteScheduledPostDataSource$deleteScheduledPost.RemoteScheduledPostDataSource$deleteScheduledPost$1)o).label;
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
            final g b2 = this.b;
            final l2 l2 = new l2(new n0(s));
            ((RemoteScheduledPostDataSource$deleteScheduledPost.RemoteScheduledPostDataSource$deleteScheduledPost$1)o).label = 1;
            if ((b = e$a.b(14, (k)l2, (e)b2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final l2$c a = ((l2$b)b).a;
        if (a != null) {
            final List c2 = a.c;
            if (c2 != null) {
                final ArrayList list = new ArrayList<String>(m.P0((Iterable)c2, 10));
                final Iterator iterator = c2.iterator();
                while (iterator.hasNext()) {
                    list.add(((l2$d)iterator.next()).b);
                }
                return new DeleteScheduledPostResult((List<String>)list);
            }
        }
        return new DeleteScheduledPostResult(null, 1, null);
    }
    
    public final Object b(String l$0, final c<? super ScheduledPostContent> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteScheduledPostDataSource$getScheduledPost.RemoteScheduledPostDataSource$getScheduledPost$1) {
                final RemoteScheduledPostDataSource$getScheduledPost.RemoteScheduledPostDataSource$getScheduledPost$1 remoteScheduledPostDataSource$getScheduledPost$1 = (RemoteScheduledPostDataSource$getScheduledPost.RemoteScheduledPostDataSource$getScheduledPost$1)c;
                final int label = remoteScheduledPostDataSource$getScheduledPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteScheduledPostDataSource$getScheduledPost$1.label = label + Integer.MIN_VALUE;
                    o = remoteScheduledPostDataSource$getScheduledPost$1;
                    break Label_0050;
                }
            }
            o = new RemoteScheduledPostDataSource$getScheduledPost.RemoteScheduledPostDataSource$getScheduledPost$1(this, (c)c);
        }
        final Object result = ((RemoteScheduledPostDataSource$getScheduledPost.RemoteScheduledPostDataSource$getScheduledPost$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteScheduledPostDataSource$getScheduledPost.RemoteScheduledPostDataSource$getScheduledPost$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (String)((RemoteScheduledPostDataSource$getScheduledPost.RemoteScheduledPostDataSource$getScheduledPost$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g b2 = this.b;
            final ia ia = new ia(l$0);
            ((RemoteScheduledPostDataSource$getScheduledPost.RemoteScheduledPostDataSource$getScheduledPost$1)o).L$0 = l$0;
            ((RemoteScheduledPostDataSource$getScheduledPost.RemoteScheduledPostDataSource$getScheduledPost$1)o).label = 1;
            if ((b = e$a.b(14, (k)ia, (e)b2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final ia$e a = ((ia$c)b).a;
        String b3 = l$0;
        if (a != null) {
            b3 = a.b;
            if (b3 == null) {
                b3 = l$0;
            }
        }
        final List<SubredditScheduledPost> list = null;
        final ArrayList<SubredditScheduledPost> list2 = null;
        ia$a c2;
        if (a != null) {
            c2 = a.c;
        }
        else {
            c2 = null;
        }
        ia$d$a b4 = null;
        Label_0230: {
            if (c2 != null) {
                final ia$d c3 = c2.c;
                if (c3 != null) {
                    b4 = c3.b;
                    break Label_0230;
                }
            }
            b4 = null;
        }
        Object instance = null;
        Label_0376: {
            if (b4 != null) {
                final RecurringScheduledPostsFragment b5 = b4.b;
                if (b5 != null) {
                    final RecurringScheduledPostsFragment$c b6 = b5.b;
                    List<SubredditScheduledPost> list4 = null;
                    Label_0361: {
                        if (b6 != null) {
                            final List b7 = b6.b;
                            if (b7 != null) {
                                final ArrayList<SubredditScheduledPost> list3 = new ArrayList<SubredditScheduledPost>();
                                final Iterator iterator = b7.iterator();
                                while (true) {
                                    list4 = list3;
                                    if (!iterator.hasNext()) {
                                        break Label_0361;
                                    }
                                    final RecurringScheduledPostsFragment$a recurringScheduledPostsFragment$a = (RecurringScheduledPostsFragment$a)iterator.next();
                                    SubredditScheduledPost a3 = null;
                                    Label_0345: {
                                        if (recurringScheduledPostsFragment$a != null) {
                                            final RecurringScheduledPostsFragment$b b8 = recurringScheduledPostsFragment$a.b;
                                            if (b8 != null) {
                                                final RecurringScheduledPostsFragment$b$a b9 = b8.b;
                                                if (b9 != null) {
                                                    final ScheduledPostFragment a2 = b9.a;
                                                    if (a2 != null) {
                                                        a3 = q50.a.a(a2);
                                                        break Label_0345;
                                                    }
                                                }
                                            }
                                        }
                                        a3 = null;
                                    }
                                    if (a3 == null) {
                                        continue;
                                    }
                                    list3.add(a3);
                                }
                            }
                        }
                        list4 = null;
                    }
                    if ((instance = list4) == null) {
                        instance = EmptyList.INSTANCE;
                    }
                    break Label_0376;
                }
            }
            instance = null;
        }
        Object instance2;
        if ((instance2 = instance) == null) {
            instance2 = EmptyList.INSTANCE;
        }
        Object instance3 = list;
        if (b4 != null) {
            final StandaloneScheduledPostsFragment a4 = b4.a;
            instance3 = list;
            if (a4 != null) {
                final StandaloneScheduledPostsFragment$c b10 = a4.b;
                ArrayList<SubredditScheduledPost> list5 = list2;
                if (b10 != null) {
                    final List b11 = b10.b;
                    list5 = list2;
                    if (b11 != null) {
                        list5 = new ArrayList<SubredditScheduledPost>();
                        for (final StandaloneScheduledPostsFragment$a standaloneScheduledPostsFragment$a : b11) {
                            SubredditScheduledPost a6 = null;
                            Label_0511: {
                                if (standaloneScheduledPostsFragment$a != null) {
                                    final StandaloneScheduledPostsFragment$b b12 = standaloneScheduledPostsFragment$a.b;
                                    if (b12 != null) {
                                        final StandaloneScheduledPostsFragment$b$a b13 = b12.b;
                                        if (b13 != null) {
                                            final ScheduledPostFragment a5 = b13.a;
                                            if (a5 != null) {
                                                a6 = q50.a.a(a5);
                                                break Label_0511;
                                            }
                                        }
                                    }
                                }
                                a6 = null;
                            }
                            if (a6 != null) {
                                list5.add(a6);
                            }
                        }
                    }
                }
                if ((instance3 = list5) == null) {
                    instance3 = EmptyList.INSTANCE;
                }
            }
        }
        Object instance4;
        if ((instance4 = instance3) == null) {
            instance4 = EmptyList.INSTANCE;
        }
        return new ScheduledPostContent(b3, (List<SubredditScheduledPost>)instance2, (List<SubredditScheduledPost>)instance4);
    }
    
    public final Object c(String b, final SubmitParameters submitParameters, final SchedulePostModel schedulePostModel, final c<? super Result<SubredditScheduledPost>> c) {
        RemoteScheduledPostDataSource$submitScheduledPost.RemoteScheduledPostDataSource$submitScheduledPost$1 remoteScheduledPostDataSource$submitScheduledPost$1 = null;
        Label_0055: {
            if (c instanceof RemoteScheduledPostDataSource$submitScheduledPost.RemoteScheduledPostDataSource$submitScheduledPost$1) {
                remoteScheduledPostDataSource$submitScheduledPost$1 = (RemoteScheduledPostDataSource$submitScheduledPost.RemoteScheduledPostDataSource$submitScheduledPost$1)c;
                final int label = remoteScheduledPostDataSource$submitScheduledPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteScheduledPostDataSource$submitScheduledPost$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            remoteScheduledPostDataSource$submitScheduledPost$1 = new RemoteScheduledPostDataSource$submitScheduledPost.RemoteScheduledPostDataSource$submitScheduledPost$1(this, (c)c);
        }
        final Object result = remoteScheduledPostDataSource$submitScheduledPost$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteScheduledPostDataSource$submitScheduledPost$1.label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g b3 = this.b;
            final h c2 = h$a.c((Object)new o(h$a.c((Object)submitParameters.getContent()), (h)null, 2));
            final h c3 = h$a.c((Object)submitParameters.isSpoiler());
            final h c4 = h$a.c((Object)submitParameters.isNsfw());
            final h c5 = h$a.c((Object)new b1(h$a.c((Object)submitParameters.getFlairText()), h$a.c((Object)submitParameters.getFlairId()), 4));
            final com.reddit.domain.model.DiscussionType discussionType = submitParameters.getDiscussionType();
            DiscussionType discussionType2;
            if (discussionType != null) {
                final int n = q50.c.a[discussionType.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    discussionType2 = DiscussionType.COMMENT;
                }
                else {
                    discussionType2 = DiscussionType.CHAT;
                }
            }
            else {
                discussionType2 = null;
            }
            final h c6 = h$a.c((Object)discussionType2);
            final String title = submitParameters.getTitle();
            final String creationToken = schedulePostModel.getCreationToken();
            final Date startsDate = schedulePostModel.getStartsDate();
            final DateTimeFormatter a = ur0.c.a;
            ah2.f.f((Object)startsDate, "date");
            final String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS", Locale.getDefault()).format(startsDate);
            ah2.f.e((Object)format, "SimpleDateFormat(ISO_860\u2026etDefault()).format(date)");
            final String id = TimeZone.getDefault().getID();
            ah2.f.e((Object)id, "getDefault().id");
            final RepeatMode repeatMode = schedulePostModel.getRepeatMode();
            ah2.f.f((Object)repeatMode, "<this>");
            final int n2 = q50.c.b[((Enum)repeatMode).ordinal()];
            Frequency weekly;
            if (n2 != 1) {
                if (n2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                weekly = Frequency.WEEKLY;
            }
            else {
                weekly = null;
            }
            final o1 o1 = new o1(new o22.y(c2, c3, c4, c5, new d2(format, id, h$a.c((Object)weekly)), (String)b, title, c6, creationToken));
            remoteScheduledPostDataSource$submitScheduledPost$1.label = 1;
            if ((b2 = e$a.b(14, (k)o1, (e)b3, (RetryAlgo)null, (Map)null, (c)remoteScheduledPostDataSource$submitScheduledPost$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final o1$b a2 = ((o1$c)b2).a;
        Object o2;
        if (a2 != null) {
            if (a2.b) {
                final o1$e d = a2.d;
                ah2.f.c((Object)d);
                o2 = new Result$Success((Object)q50.a.a(d.b.a));
            }
            else {
                final List c7 = a2.c;
                Label_0545: {
                    if (c7 != null) {
                        final o1$d o1$d = (o1$d)CollectionsKt___CollectionsKt.s1(c7);
                        if (o1$d != null && (b = o1$d.b) != null) {
                            break Label_0545;
                        }
                    }
                    b = new String();
                }
                o2 = new Result$Error((String)b, false, 2, (DefaultConstructorMarker)null);
            }
        }
        else {
            o2 = new Result$Error(new String(), false, 2, (DefaultConstructorMarker)null);
        }
        return o2;
    }
    
    public final Object d(String b, final c<? super Result<Link>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteScheduledPostDataSource$submitScheduledPostNow.RemoteScheduledPostDataSource$submitScheduledPostNow$1) {
                final RemoteScheduledPostDataSource$submitScheduledPostNow.RemoteScheduledPostDataSource$submitScheduledPostNow$1 remoteScheduledPostDataSource$submitScheduledPostNow$1 = (RemoteScheduledPostDataSource$submitScheduledPostNow.RemoteScheduledPostDataSource$submitScheduledPostNow$1)c;
                final int label = remoteScheduledPostDataSource$submitScheduledPostNow$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteScheduledPostDataSource$submitScheduledPostNow$1.label = label + Integer.MIN_VALUE;
                    o = remoteScheduledPostDataSource$submitScheduledPostNow$1;
                    break Label_0050;
                }
            }
            o = new RemoteScheduledPostDataSource$submitScheduledPostNow.RemoteScheduledPostDataSource$submitScheduledPostNow$1(this, (c)c);
        }
        final Object result = ((RemoteScheduledPostDataSource$submitScheduledPostNow.RemoteScheduledPostDataSource$submitScheduledPostNow$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteScheduledPostDataSource$submitScheduledPostNow.RemoteScheduledPostDataSource$submitScheduledPostNow$1)o).label;
        RemoteScheduledPostDataSource remoteScheduledPostDataSource;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteScheduledPostDataSource = (RemoteScheduledPostDataSource)((RemoteScheduledPostDataSource$submitScheduledPostNow.RemoteScheduledPostDataSource$submitScheduledPostNow$1)o).L$0;
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g b3 = this.b;
            final d6 d6 = new d6(new o3((String)b), s0.h(this.d));
            ((RemoteScheduledPostDataSource$submitScheduledPostNow.RemoteScheduledPostDataSource$submitScheduledPostNow$1)o).L$0 = this;
            ((RemoteScheduledPostDataSource$submitScheduledPostNow.RemoteScheduledPostDataSource$submitScheduledPostNow$1)o).label = 1;
            b2 = e$a.b(14, (k)d6, (e)b3, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteScheduledPostDataSource = this;
        }
        final d6$f a = ((d6$c)b2).a;
        final SubredditFragment subredditFragment = null;
        Object o2;
        if (a != null) {
            final d6$e d7 = a.d;
            PostContentFragment a2 = null;
            Label_0215: {
                if (d7 != null) {
                    final d6$e$a b4 = d7.b;
                    if (b4 != null) {
                        a2 = b4.a;
                        break Label_0215;
                    }
                }
                a2 = null;
            }
            if (a.b && a2 != null) {
                final GqlPostToLinkDomainModelMapper c2 = remoteScheduledPostDataSource.c;
                SubredditFragment a3 = subredditFragment;
                if (d7 != null) {
                    final d6$a c3 = d7.c;
                    a3 = subredditFragment;
                    if (c3 != null) {
                        final d6$g b5 = c3.b;
                        a3 = subredditFragment;
                        if (b5 != null) {
                            final d6$g$a b6 = b5.b;
                            a3 = subredditFragment;
                            if (b6 != null) {
                                a3 = b6.a;
                            }
                        }
                    }
                }
                final JsonAdapter jsonAdapter = (JsonAdapter)remoteScheduledPostDataSource.e.getValue();
                ah2.f.e((Object)jsonAdapter, "richTextAdapter");
                o2 = new Result$Success((Object)GqlPostToLinkDomainModelMapper.map$default(c2, a3, a2, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, (CrosspostContentFragment)null, (String)null, (List)null, (Integer)null, jsonAdapter, 252, (Object)null));
            }
            else {
                final List c4 = a.c;
                Label_0380: {
                    if (c4 != null) {
                        final d6$d d6$d = (d6$d)CollectionsKt___CollectionsKt.s1(c4);
                        if (d6$d != null && (b = d6$d.b) != null) {
                            break Label_0380;
                        }
                    }
                    b = new String();
                }
                o2 = new Result$Error((String)b, false, 2, (DefaultConstructorMarker)null);
            }
        }
        else {
            o2 = new Result$Error(new String(), false, 2, (DefaultConstructorMarker)null);
        }
        return o2;
    }
    
    public final Object e(final UpdateScheduledPostData updateScheduledPostData, final c<? super Result<SubredditScheduledPost>> c) {
        RemoteScheduledPostDataSource$updateScheduledPost.RemoteScheduledPostDataSource$updateScheduledPost$1 remoteScheduledPostDataSource$updateScheduledPost$1 = null;
        Label_0048: {
            if (c instanceof RemoteScheduledPostDataSource$updateScheduledPost.RemoteScheduledPostDataSource$updateScheduledPost$1) {
                remoteScheduledPostDataSource$updateScheduledPost$1 = (RemoteScheduledPostDataSource$updateScheduledPost.RemoteScheduledPostDataSource$updateScheduledPost$1)c;
                final int label = remoteScheduledPostDataSource$updateScheduledPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteScheduledPostDataSource$updateScheduledPost$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            remoteScheduledPostDataSource$updateScheduledPost$1 = new RemoteScheduledPostDataSource$updateScheduledPost.RemoteScheduledPostDataSource$updateScheduledPost$1(this, (c)c);
        }
        final Object result = remoteScheduledPostDataSource$updateScheduledPost$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteScheduledPostDataSource$updateScheduledPost$1.label;
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
            final String body = updateScheduledPostData.getBody();
            Object o;
            if (body != null) {
                if (updateScheduledPostData.getBodyContentType() == SubredditScheduledPost.ContentType.RICH_TEXT) {
                    o = new o((h)null, h$a.c((Object)body), 1);
                }
                else {
                    o = new o(h$a.c((Object)body), (h)null, 2);
                }
            }
            else {
                o = null;
            }
            final g b2 = this.b;
            final String id = updateScheduledPostData.getId();
            final h c2 = h$a.c((Object)updateScheduledPostData.getTitle());
            final h c3 = h$a.c(o);
            final Boolean sticky = updateScheduledPostData.isSticky();
            StickyPosition stickyPosition;
            if (sticky != null) {
                if (sticky) {
                    stickyPosition = StickyPosition.SECOND;
                }
                else {
                    stickyPosition = StickyPosition.NONE;
                }
            }
            else {
                stickyPosition = null;
            }
            final k8 k8 = new k8(new u4(c3, h$a.c((Object)updateScheduledPostData.isSpoiler()), h$a.c((Object)updateScheduledPostData.isNSFW()), h$a.c((Object)updateScheduledPostData.isOriginalContent()), h$a.c((Object)updateScheduledPostData.isDistinguishedAsMod()), h$a.c((Object)stickyPosition), c2, id));
            remoteScheduledPostDataSource$updateScheduledPost$1.label = 1;
            if ((b = e$a.b(14, (k)k8, (e)b2, (RetryAlgo)null, (Map)null, (c)remoteScheduledPostDataSource$updateScheduledPost$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final k8$e a = ((k8$b)b).a;
        Result$Error result$Error;
        if (a != null) {
            if (a.b) {
                final k8$d d = a.d;
                if (d != null) {
                    return new Result$Success((Object)q50.a.a(d.b.a));
                }
            }
            final List c4 = a.c;
            String b3 = null;
            Label_0390: {
                if (c4 != null) {
                    final k8$c k8$c = (k8$c)CollectionsKt___CollectionsKt.s1(c4);
                    if (k8$c != null && (b3 = k8$c.b) != null) {
                        break Label_0390;
                    }
                }
                b3 = new String();
            }
            result$Error = new Result$Error(b3, false, 2, (DefaultConstructorMarker)null);
        }
        else {
            result$Error = new Result$Error(new String(), false, 2, (DefaultConstructorMarker)null);
        }
        return result$Error;
    }
}
