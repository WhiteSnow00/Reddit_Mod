// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import java.util.ListIterator;
import java.util.Iterator;
import com.reddit.domain.model.SubredditLeaderboardModel;
import java.util.ArrayList;
import ig2.m;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import java.util.List;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import lg2.c;
import javax.inject.Inject;
import java.util.concurrent.TimeUnit;
import z40.a;
import com.reddit.data.room.dao.e;
import javax.inject.Provider;

public final class SubredditLeaderboardLocalDataSource
{
    public static final long c;
    public final Provider<e> a;
    public final a b;
    
    static {
        c = TimeUnit.HOURS.toMillis(12L);
    }
    
    @Inject
    public SubredditLeaderboardLocalDataSource(final Provider<e> a, final a b) {
        sg2.e.f((Object)a, "subredditLeaderboardDaoProvider");
        sg2.e.f((Object)b, "subredditLeaderboardDatabaseMapper");
        this.a = a;
        this.b = b;
    }
    
    public final Serializable a(final String s, final Integer n, final c c) {
        Object o = null;
        Label_0054: {
            if (c instanceof SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1) {
                final SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1 subredditLeaderboardLocalDataSource$getLeaderboardByCategory$1 = (SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1)c;
                final int label = subredditLeaderboardLocalDataSource$getLeaderboardByCategory$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    subredditLeaderboardLocalDataSource$getLeaderboardByCategory$1.label = label + Integer.MIN_VALUE;
                    o = subredditLeaderboardLocalDataSource$getLeaderboardByCategory$1;
                    break Label_0054;
                }
            }
            o = new SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1(this, c);
        }
        Object o2 = ((SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1)o).label;
        SubredditLeaderboardLocalDataSource subredditLeaderboardLocalDataSource = null;
        Label_0338: {
            SubredditLeaderboardLocalDataSource subredditLeaderboardLocalDataSource2;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        subredditLeaderboardLocalDataSource = (SubredditLeaderboardLocalDataSource)((SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1)o).L$0;
                        yd.b.k0(o2);
                        break Label_0338;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    subredditLeaderboardLocalDataSource2 = (SubredditLeaderboardLocalDataSource)((SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1)o).L$0;
                    yd.b.k0(o2);
                }
            }
            else {
                yd.b.k0(o2);
                if (n != null) {
                    final e e = (e)this.a.get();
                    String s2;
                    if ((s2 = s) == null) {
                        s2 = "category_id_all";
                    }
                    final int intValue = n;
                    ((SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1)o).L$0 = this;
                    ((SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1)o).label = 1;
                    o2 = e.Y(s2, intValue, (c<? super List<d60.a>>)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return (Serializable)coroutine_SUSPENDED;
                    }
                    subredditLeaderboardLocalDataSource2 = this;
                }
                else {
                    final e e2 = (e)this.a.get();
                    String s3;
                    if ((s3 = s) == null) {
                        s3 = "category_id_all";
                    }
                    ((SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1)o).L$0 = this;
                    ((SubredditLeaderboardLocalDataSource$getLeaderboardByCategory$1)o).label = 2;
                    o2 = e2.X1(s3, (ContinuationImpl)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return (Serializable)coroutine_SUSPENDED;
                    }
                    subredditLeaderboardLocalDataSource = this;
                    break Label_0338;
                }
            }
            final Iterable iterable = (Iterable)o2;
            final a b = subredditLeaderboardLocalDataSource2.b;
            final ArrayList list = new ArrayList<SubredditLeaderboardModel>(m.c3(iterable, 10));
            final Iterator iterator = iterable.iterator();
            while (true) {
                final ArrayList list2 = list;
                if (!iterator.hasNext()) {
                    return list2;
                }
                final d60.a a = (d60.a)iterator.next();
                b.getClass();
                list.add((Object)z40.a.a(a));
            }
        }
        final Iterable iterable2 = (Iterable)o2;
        final a b2 = subredditLeaderboardLocalDataSource.b;
        final ArrayList list3 = new ArrayList<SubredditLeaderboardModel>(m.c3(iterable2, 10));
        final Iterator iterator2 = iterable2.iterator();
        ArrayList list2;
        while (true) {
            list2 = list3;
            if (!iterator2.hasNext()) {
                break;
            }
            final d60.a a2 = (d60.a)iterator2.next();
            b2.getClass();
            list3.add((Object)z40.a.a(a2));
        }
        return list2;
    }
    
    public final Object b(String s, String l$0, final c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof SubredditLeaderboardLocalDataSource$isCacheStale$1) {
                final SubredditLeaderboardLocalDataSource$isCacheStale$1 subredditLeaderboardLocalDataSource$isCacheStale$1 = (SubredditLeaderboardLocalDataSource$isCacheStale$1)c;
                final int label = subredditLeaderboardLocalDataSource$isCacheStale$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    subredditLeaderboardLocalDataSource$isCacheStale$1.label = label + Integer.MIN_VALUE;
                    o = subredditLeaderboardLocalDataSource$isCacheStale$1;
                    break Label_0054;
                }
            }
            o = new SubredditLeaderboardLocalDataSource$isCacheStale$1(this, (c)c);
        }
        Object o2 = ((SubredditLeaderboardLocalDataSource$isCacheStale$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((SubredditLeaderboardLocalDataSource$isCacheStale$1)o).label;
        final boolean b = false;
        boolean b2 = false;
        long n = 0L;
        Label_0307: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        n = ((SubredditLeaderboardLocalDataSource$isCacheStale$1)o).J$0;
                        s = (String)((SubredditLeaderboardLocalDataSource$isCacheStale$1)o).L$0;
                        yd.b.k0(o2);
                        break Label_0307;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    n = ((SubredditLeaderboardLocalDataSource$isCacheStale$1)o).J$0;
                    yd.b.k0(o2);
                }
            }
            else {
                yd.b.k0(o2);
                n = System.currentTimeMillis();
                if (l$0 == null) {
                    final e e = (e)this.a.get();
                    if ((l$0 = s) == null) {
                        l$0 = "category_id_all";
                    }
                    ((SubredditLeaderboardLocalDataSource$isCacheStale$1)o).J$0 = n;
                    ((SubredditLeaderboardLocalDataSource$isCacheStale$1)o).label = 1;
                    o2 = e.Y1(l$0, (c<? super Long>)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                else {
                    final e e2 = (e)this.a.get();
                    String s2;
                    if ((s2 = s) == null) {
                        s2 = "category_id_all";
                    }
                    ((SubredditLeaderboardLocalDataSource$isCacheStale$1)o).L$0 = l$0;
                    ((SubredditLeaderboardLocalDataSource$isCacheStale$1)o).J$0 = n;
                    ((SubredditLeaderboardLocalDataSource$isCacheStale$1)o).label = 2;
                    o2 = e2.X1(s2, (ContinuationImpl)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    s = l$0;
                    break Label_0307;
                }
            }
            final Long n2 = (Long)o2;
            if (n2 == null || n - n2 > SubredditLeaderboardLocalDataSource.c) {
                b2 = true;
            }
            return b2;
        }
        final List list = (List)o2;
        final ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            while (listIterator.hasPrevious()) {
                if (sg2.e.a((Object)((d60.a)listIterator.previous()).o, (Object)s)) {
                    final int nextIndex = listIterator.nextIndex();
                    if (nextIndex != -1 && nextIndex != list.size() - 1) {
                        boolean b3 = b;
                        if (n - ((d60.a)list.get(nextIndex + 1)).p > SubredditLeaderboardLocalDataSource.c) {
                            b3 = true;
                        }
                        return b3;
                    }
                    return Boolean.TRUE;
                }
            }
            final int nextIndex = -1;
            continue;
        }
    }
}
