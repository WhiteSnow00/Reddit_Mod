// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.Iterator;
import bj2.g;
import d60.a;
import java.util.ArrayList;
import ig2.m;
import rg2.l;
import bj2.k;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.SubredditLeaderboardPageResult;
import com.reddit.domain.model.SubredditLeaderboardModel;
import java.util.List;
import xd0.f0$a;
import hg2.j;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.p;
import com.reddit.data.local.SubredditLeaderboardLocalDataSource$observeLeaderboardByCategory$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import javax.inject.Inject;
import sg2.e;
import com.reddit.data.local.SubredditLeaderboardLocalDataSource;
import com.reddit.data.remote.c;
import xd0.f0;

public final class RedditSubredditLeaderboardRepository implements f0
{
    public final c a;
    public final SubredditLeaderboardLocalDataSource b;
    
    @Inject
    public RedditSubredditLeaderboardRepository(final c a, final SubredditLeaderboardLocalDataSource b) {
        e.f((Object)a, "remoteGqlSubredditLeaderboardDataSource");
        e.f((Object)b, "subredditLeaderboardCacheDataSource");
        this.a = a;
        this.b = b;
    }
    
    public final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 a(final String s) {
        final SubredditLeaderboardLocalDataSource b = this.b;
        final com.reddit.data.room.dao.e e = (com.reddit.data.room.dao.e)b.a.get();
        String s2;
        if (s == null) {
            s2 = "category_id_all";
        }
        else {
            s2 = s;
        }
        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1((p)new RedditSubredditLeaderboardRepository$observeCurrentCache$1(this, s, (lg2.c)null), (hj2.e)new SubredditLeaderboardLocalDataSource$observeLeaderboardByCategory$$inlined$map$1((hj2.e)e.U1(s2), b));
    }
    
    public final Object b(final String l$1, String l$2, final lg2.c c) {
        RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1 redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2 = null;
        Label_0054: {
            if (c instanceof RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1) {
                final RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1 redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1 = (RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)c;
                final int label = redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1.label = label + Integer.MIN_VALUE;
                    redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2 = redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1;
                    break Label_0054;
                }
            }
            redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2 = new RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1(this, c);
        }
        Object o = redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.label;
        String s;
        RedditSubredditLeaderboardRepository redditSubredditLeaderboardRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    yd.b.k0(o);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                s = (String)redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.L$2;
                l$2 = (String)redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.L$1;
                redditSubredditLeaderboardRepository = (RedditSubredditLeaderboardRepository)redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.L$0;
                yd.b.k0(o);
            }
        }
        else {
            yd.b.k0(o);
            final SubredditLeaderboardLocalDataSource b = this.b;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.L$0 = this;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.L$1 = l$1;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.L$2 = l$2;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.label = 1;
            o = b.b(l$1, l$2, (lg2.c<? super Boolean>)redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            s = l$2;
            l$2 = l$1;
            redditSubredditLeaderboardRepository = this;
        }
        if (!(boolean)o) {
            return j.a;
        }
        final Integer n = new Integer(50);
        redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.L$0 = null;
        redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.L$1 = null;
        redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.L$2 = null;
        redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2.label = 2;
        if (f0$a.a(redditSubredditLeaderboardRepository, l$2, n, s, (lg2.c)redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$2, 24) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
    
    public final Object c(final String l$1, Integer n, final lg2.c<? super List<SubredditLeaderboardModel>> c) {
        RedditSubredditLeaderboardRepository$getSubredditLeaderboard$1 redditSubredditLeaderboardRepository$getSubredditLeaderboard$1 = null;
        Label_0055: {
            if (c instanceof RedditSubredditLeaderboardRepository$getSubredditLeaderboard$1) {
                redditSubredditLeaderboardRepository$getSubredditLeaderboard$1 = (RedditSubredditLeaderboardRepository$getSubredditLeaderboard$1)c;
                final int label = redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditSubredditLeaderboardRepository$getSubredditLeaderboard$1 = new RedditSubredditLeaderboardRepository$getSubredditLeaderboard$1(this, (lg2.c)c);
        }
        Object o = redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.label;
        int intValue = 50;
        String s2 = null;
        Integer n3 = null;
        RedditSubredditLeaderboardRepository redditSubredditLeaderboardRepository3 = null;
        Label_0353: {
            Integer n2 = null;
            String s = null;
            RedditSubredditLeaderboardRepository l$2 = null;
            Label_0344: {
                String l$3;
                Object b;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            n2 = (Integer)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$2;
                            s = (String)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$1;
                            final RedditSubredditLeaderboardRepository redditSubredditLeaderboardRepository = (RedditSubredditLeaderboardRepository)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$0;
                            yd.b.k0(o);
                            l$2 = redditSubredditLeaderboardRepository;
                            break Label_0344;
                        }
                        if (label2 == 3) {
                            yd.b.k0(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        n = (Integer)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$2;
                        l$3 = (String)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$1;
                        final RedditSubredditLeaderboardRepository redditSubredditLeaderboardRepository2 = (RedditSubredditLeaderboardRepository)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$0;
                        yd.b.k0(o);
                        b = o;
                        l$2 = redditSubredditLeaderboardRepository2;
                    }
                }
                else {
                    yd.b.k0(o);
                    final SubredditLeaderboardLocalDataSource b2 = this.b;
                    redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$0 = this;
                    redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$1 = l$1;
                    redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$2 = n;
                    redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.label = 1;
                    final int d = SubredditLeaderboardLocalDataSource.d;
                    b = b2.b(l$1, null, (lg2.c<? super Boolean>)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1);
                    if (b == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    l$2 = this;
                    l$3 = l$1;
                }
                s2 = l$3;
                n3 = n;
                redditSubredditLeaderboardRepository3 = l$2;
                if (!(boolean)b) {
                    break Label_0353;
                }
                final Integer n4 = new Integer(50);
                redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$0 = l$2;
                redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$1 = l$3;
                redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$2 = n;
                redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.label = 2;
                if (f0$a.a(l$2, l$3, n4, (String)null, (lg2.c)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1, 28) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                final String s3 = l$3;
                n2 = n;
                s = s3;
            }
            redditSubredditLeaderboardRepository3 = l$2;
            n3 = n2;
            s2 = s;
        }
        final SubredditLeaderboardLocalDataSource b3 = redditSubredditLeaderboardRepository3.b;
        if (n3 != null) {
            intValue = n3;
        }
        final Integer n5 = new Integer(intValue);
        redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$0 = null;
        redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$1 = null;
        redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$2 = null;
        redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.label = 3;
        if ((o = b3.a(s2, n5, (lg2.c)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1)) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return o;
    }
    
    public final Object d(String l$1, final Integer n, String l$2, boolean z$0, boolean z$2, final lg2.c<? super j> c) {
        Integer l$3 = n;
        RedditSubredditLeaderboardRepository$updateSubredditLeaderboard$1 redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1 = null;
        Label_0054: {
            if (c instanceof RedditSubredditLeaderboardRepository$updateSubredditLeaderboard$1) {
                redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1 = (RedditSubredditLeaderboardRepository$updateSubredditLeaderboard$1)c;
                final int label = redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.label = label + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1 = new RedditSubredditLeaderboardRepository$updateSubredditLeaderboard$1(this, (lg2.c)c);
        }
        Object o = redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.label;
        final boolean b = true;
        RedditSubredditLeaderboardRepository redditSubredditLeaderboardRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    yd.b.k0(o);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                z$2 = redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.Z$1;
                z$0 = redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.Z$0;
                l$2 = (String)redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$3;
                l$3 = (Integer)redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$2;
                l$1 = (String)redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$1;
                redditSubredditLeaderboardRepository = (RedditSubredditLeaderboardRepository)redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$0;
                yd.b.k0(o);
            }
        }
        else {
            yd.b.k0(o);
            final c a = this.a;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$0 = this;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$1 = l$1;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$2 = l$3;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$3 = l$2;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.Z$0 = z$0;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.Z$1 = z$2;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.label = 1;
            o = c.a(a, l$1, l$3, l$2, (lg2.c)redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditLeaderboardRepository = this;
        }
        final SubredditLeaderboardPageResult subredditLeaderboardPageResult = (SubredditLeaderboardPageResult)o;
        final g j1 = kotlin.sequences.b.j1((k)kotlin.sequences.b.j1((k)CollectionsKt___CollectionsKt.q3((Iterable)subredditLeaderboardPageResult.getSubreddits()), (l)new RedditSubredditLeaderboardRepository$updateSubredditLeaderboard$subreddits$1(z$0)), (l)new RedditSubredditLeaderboardRepository$updateSubredditLeaderboard$subreddits$2(z$2));
        int n2;
        if (l$3 != null) {
            n2 = l$3;
        }
        else {
            n2 = subredditLeaderboardPageResult.getSubreddits().size();
        }
        final List a2 = kotlin.sequences.b.A1(kotlin.sequences.b.x1((k)j1, n2));
        final SubredditLeaderboardLocalDataSource b2 = redditSubredditLeaderboardRepository.b;
        final boolean b3 = l$2 == null && b;
        redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$0 = null;
        redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$1 = null;
        redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$2 = null;
        redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$3 = null;
        redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.label = 2;
        b2.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final com.reddit.data.room.dao.e e = (com.reddit.data.room.dao.e)b2.a.get();
        final ArrayList list = new ArrayList<a>(m.c3((Iterable)a2, 10));
        for (final SubredditLeaderboardModel subredditLeaderboardModel : a2) {
            b2.b.getClass();
            sg2.e.f((Object)subredditLeaderboardModel, "subredditLeaderboardModel");
            final String id = subredditLeaderboardModel.getId();
            final String name = subredditLeaderboardModel.getName();
            final String prefixedName = subredditLeaderboardModel.getPrefixedName();
            final String avatarImageUrl = subredditLeaderboardModel.getAvatarImageUrl();
            final Integer rank = subredditLeaderboardModel.getRank();
            final Integer rankDelta = subredditLeaderboardModel.getRankDelta();
            final boolean subscribed = subredditLeaderboardModel.isSubscribed();
            final String backgroundColorKey = subredditLeaderboardModel.getBackgroundColorKey();
            final Integer backgroundColor = subredditLeaderboardModel.getBackgroundColor();
            final long subscribers = subredditLeaderboardModel.getSubscribers();
            final boolean nsfw = subredditLeaderboardModel.isNsfw();
            final boolean quarantined = subredditLeaderboardModel.isQuarantined();
            final String cursor = subredditLeaderboardModel.getCursor();
            if (l$1 == null) {
                l$2 = "category_id_all";
            }
            else {
                l$2 = l$1;
            }
            list.add(new a(id, name, prefixedName, avatarImageUrl, rank, rankDelta, subscribed, backgroundColorKey, backgroundColor, subscribers, nsfw, quarantined, l$2, subredditLeaderboardModel.getPublicDescription(), cursor, currentTimeMillis));
        }
        if ((l$2 = l$1) == null) {
            l$2 = "category_id_all";
        }
        Object o2 = e.q0(l$2, list, (lg2.c)redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1, b3);
        if (o2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            o2 = j.a;
        }
        if (o2 == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
}
