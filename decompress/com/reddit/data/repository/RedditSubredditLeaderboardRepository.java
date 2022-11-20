// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.Iterator;
import wi2.g;
import f60.a;
import java.util.ArrayList;
import dg2.m;
import mg2.l;
import wi2.k;
import kotlin.sequences.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.SubredditLeaderboardPageResult;
import com.reddit.domain.model.SubredditLeaderboardModel;
import java.util.List;
import cg2.j;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mg2.p;
import com.reddit.data.local.SubredditLeaderboardLocalDataSource$observeLeaderboardByCategory$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import javax.inject.Inject;
import ng2.e;
import com.reddit.data.local.SubredditLeaderboardLocalDataSource;
import com.reddit.data.remote.c;
import xd0.g0;

public final class RedditSubredditLeaderboardRepository implements g0
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
    
    @Override
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
        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1((p)new RedditSubredditLeaderboardRepository$observeCurrentCache$1(this, s, (gg2.c)null), (cj2.e)new SubredditLeaderboardLocalDataSource$observeLeaderboardByCategory$$inlined$map$1((cj2.e)e.B1(s2), b));
    }
    
    @Override
    public final Object b(final String l$1, String l$2, final gg2.c c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1) {
                final RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1 redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1 = (RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)c;
                final int label = redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1.label = label + Integer.MIN_VALUE;
                    o = redditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1;
                    break Label_0054;
                }
            }
            o = new RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1(this, c);
        }
        Object o2 = ((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).label;
        String s;
        RedditSubredditLeaderboardRepository redditSubredditLeaderboardRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    d.b4(o2);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$2 = (String)((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).L$2;
                s = (String)((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).L$1;
                redditSubredditLeaderboardRepository = (RedditSubredditLeaderboardRepository)((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).L$0;
                d.b4(o2);
            }
        }
        else {
            d.b4(o2);
            final SubredditLeaderboardLocalDataSource b = this.b;
            ((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).L$0 = this;
            ((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).L$1 = l$1;
            ((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).L$2 = l$2;
            ((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).label = 1;
            o2 = b.b(l$1, l$2, (gg2.c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            s = l$1;
            redditSubredditLeaderboardRepository = this;
        }
        if (!(boolean)o2) {
            return j.a;
        }
        final Integer n = new Integer(50);
        ((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).L$0 = null;
        ((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).L$1 = null;
        ((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).L$2 = null;
        ((RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1)o).label = 2;
        if (g0.a.a(redditSubredditLeaderboardRepository, s, n, l$2, (gg2.c)o, 24) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
    
    @Override
    public final Object c(final String l$1, Integer n, final gg2.c<? super List<SubredditLeaderboardModel>> c) {
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
            redditSubredditLeaderboardRepository$getSubredditLeaderboard$1 = new RedditSubredditLeaderboardRepository$getSubredditLeaderboard$1(this, (gg2.c)c);
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
                            d.b4(o);
                            l$2 = redditSubredditLeaderboardRepository;
                            break Label_0344;
                        }
                        if (label2 == 3) {
                            d.b4(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        n = (Integer)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$2;
                        l$3 = (String)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$1;
                        final RedditSubredditLeaderboardRepository redditSubredditLeaderboardRepository2 = (RedditSubredditLeaderboardRepository)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$0;
                        d.b4(o);
                        b = o;
                        l$2 = redditSubredditLeaderboardRepository2;
                    }
                }
                else {
                    d.b4(o);
                    final SubredditLeaderboardLocalDataSource b2 = this.b;
                    redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$0 = this;
                    redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$1 = l$1;
                    redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.L$2 = n;
                    redditSubredditLeaderboardRepository$getSubredditLeaderboard$1.label = 1;
                    final int d = SubredditLeaderboardLocalDataSource.d;
                    b = b2.b(l$1, (String)null, (gg2.c)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1);
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
                if (g0.a.a(l$2, l$3, n4, null, (gg2.c)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1, 28) == coroutine_SUSPENDED) {
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
        if ((o = b3.a(s2, n5, (gg2.c)redditSubredditLeaderboardRepository$getSubredditLeaderboard$1)) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return o;
    }
    
    public final Object d(String l$1, final Integer n, String l$2, boolean z$0, boolean z$2, final gg2.c<? super j> c) {
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
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1 = new RedditSubredditLeaderboardRepository$updateSubredditLeaderboard$1(this, (gg2.c)c);
        }
        Object o = redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.label;
        final boolean b = true;
        RedditSubredditLeaderboardRepository redditSubredditLeaderboardRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    d.b4(o);
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
                d.b4(o);
            }
        }
        else {
            d.b4(o);
            final c a = this.a;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$0 = this;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$1 = l$1;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$2 = l$3;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.L$3 = l$2;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.Z$0 = z$0;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.Z$1 = z$2;
            redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1.label = 1;
            o = c.a(a, l$1, l$3, l$2, (gg2.c)redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditLeaderboardRepository = this;
        }
        final SubredditLeaderboardPageResult subredditLeaderboardPageResult = (SubredditLeaderboardPageResult)o;
        final g k1 = kotlin.sequences.b.K1((k)kotlin.sequences.b.K1((k)CollectionsKt___CollectionsKt.I4((Iterable)subredditLeaderboardPageResult.getSubreddits()), (l)new RedditSubredditLeaderboardRepository$updateSubredditLeaderboard$subreddits$1(z$0)), (l)new RedditSubredditLeaderboardRepository$updateSubredditLeaderboard$subreddits$2(z$2));
        int n2;
        if (l$3 != null) {
            n2 = l$3;
        }
        else {
            n2 = subredditLeaderboardPageResult.getSubreddits().size();
        }
        final List a2 = kotlin.sequences.b.a2(kotlin.sequences.b.Y1((k)k1, n2));
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
        final ArrayList list = new ArrayList<f60.a>(m.u4((Iterable)a2, 10));
        for (final SubredditLeaderboardModel subredditLeaderboardModel : a2) {
            b2.b.getClass();
            ng2.e.f((Object)subredditLeaderboardModel, "subredditLeaderboardModel");
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
            list.add(new f60.a(id, name, prefixedName, avatarImageUrl, rank, rankDelta, subscribed, backgroundColorKey, backgroundColor, subscribers, nsfw, quarantined, l$2, subredditLeaderboardModel.getPublicDescription(), cursor, currentTimeMillis));
        }
        if ((l$2 = l$1) == null) {
            l$2 = "category_id_all";
        }
        Object o2 = e.j1(l$2, list, (gg2.c)redditSubredditLeaderboardRepository$updateSubredditLeaderboard$1, b3);
        if (o2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            o2 = j.a;
        }
        if (o2 == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
}
