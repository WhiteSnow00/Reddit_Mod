// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.dao;

import hg2.j;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.ArrayList;
import lg2.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import hj2.v;
import java.util.List;
import k70.a;

public interface e extends k70.a<d60.a>
{
    void S0(final List<d60.a> p0);
    
    v U1(final String p0);
    
    Object X1(final String p0, final ContinuationImpl p1);
    
    Object Y(final String p0, final int p1, final c<? super List<d60.a>> p2);
    
    Object Y1(final String p0, final c<? super Long> p1);
    
    Object q0(final String p0, final ArrayList p1, final c p2, final boolean p3);
    
    public static final class a
    {
        public static Object a(final f l$0, final List l$2, final String s, final boolean b, final c c) {
            SubredditLeaderboardDao$updateSubredditLeaderboardByCategory$1 subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2 = null;
            Label_0058: {
                if (c instanceof SubredditLeaderboardDao$updateSubredditLeaderboardByCategory$1) {
                    final SubredditLeaderboardDao$updateSubredditLeaderboardByCategory$1 subredditLeaderboardDao$updateSubredditLeaderboardByCategory$1 = (SubredditLeaderboardDao$updateSubredditLeaderboardByCategory$1)c;
                    final int label = subredditLeaderboardDao$updateSubredditLeaderboardByCategory$1.label;
                    if ((label & Integer.MIN_VALUE) != 0x0) {
                        subredditLeaderboardDao$updateSubredditLeaderboardByCategory$1.label = label + Integer.MIN_VALUE;
                        subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2 = subredditLeaderboardDao$updateSubredditLeaderboardByCategory$1;
                        break Label_0058;
                    }
                }
                subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2 = new SubredditLeaderboardDao$updateSubredditLeaderboardByCategory$1(c);
            }
            final Object result = subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2.result;
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            final int label2 = subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2.label;
            List list;
            Object o;
            if (label2 != 0) {
                if (label2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List)subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2.L$1;
                o = subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2.L$0;
                b.k0(result);
            }
            else {
                b.k0(result);
                o = l$0;
                list = l$2;
                if (b) {
                    subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2.L$0 = l$0;
                    subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2.L$1 = l$2;
                    subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2.label = 1;
                    o = l$0;
                    list = l$2;
                    if (l$0.h(s, (c)subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
            }
            ((e)o).S0(list);
            return j.a;
        }
    }
}
