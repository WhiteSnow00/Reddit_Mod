// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.dao;

import pg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tg2.c;
import java.util.ArrayList;
import java.util.List;
import pj2.s;
import s70.a;

public interface e extends s70.a<k60.a>
{
    s D1(final String p0);
    
    void E0(final List<k60.a> p0);
    
    Object G0(final String p0, final ArrayList p1, final c p2, final boolean p3);
    
    Object G1(final String p0, final ContinuationImpl p1);
    
    Object V(final String p0, final c<? super Long> p1);
    
    Object u1(final String p0, final int p1, final c<? super List<k60.a>> p2);
    
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
                subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2 = new SubredditLeaderboardDao$updateSubredditLeaderboardByCategory$1((c<? super SubredditLeaderboardDao$updateSubredditLeaderboardByCategory$1>)c);
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
                aj2.c.Q0(result);
            }
            else {
                aj2.c.Q0(result);
                o = l$0;
                list = l$2;
                if (b) {
                    subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2.L$0 = l$0;
                    subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2.L$1 = l$2;
                    subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2.label = 1;
                    o = l$0;
                    list = l$2;
                    if (l$0.S(s, (c)subredditLeaderboardDao$updateSubredditLeaderboardByCategory$2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
            }
            ((e)o).E0(list);
            return j.a;
        }
    }
}
