// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.dao;

import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import b60.w;
import k70.a;

public interface c extends k70.a<w>
{
    Object A(final String p0, final boolean p1, final lg2.c<? super j> p2);
    
    Object A0(final String p0, final boolean p1, final lg2.c<? super j> p2);
    
    Object l2(final String p0, final boolean p1, final lg2.c<? super j> p2);
    
    Object s(final w p0, final lg2.c<? super j> p1);
    
    Object v(final String p0, final lg2.c<? super w> p1);
    
    public static final class a
    {
        public static Object a(d l$0, w l$2, final lg2.c c) {
            Object o = null;
            Label_0049: {
                if (c instanceof SubredditForkingDao$push$1) {
                    final SubredditForkingDao$push$1 subredditForkingDao$push$1 = (SubredditForkingDao$push$1)c;
                    final int label = subredditForkingDao$push$1.label;
                    if ((label & Integer.MIN_VALUE) != 0x0) {
                        subredditForkingDao$push$1.label = label + Integer.MIN_VALUE;
                        o = subredditForkingDao$push$1;
                        break Label_0049;
                    }
                }
                o = new SubredditForkingDao$push$1(c);
            }
            final Object result = ((SubredditForkingDao$push$1)o).result;
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            final int label2 = ((SubredditForkingDao$push$1)o).label;
            Object a;
            if (label2 != 0) {
                if (label2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l$2 = (w)((SubredditForkingDao$push$1)o).L$1;
                l$0 = (d)((SubredditForkingDao$push$1)o).L$0;
                b.k0(result);
                a = result;
            }
            else {
                b.k0(result);
                ((SubredditForkingDao$push$1)o).L$0 = l$0;
                ((SubredditForkingDao$push$1)o).L$1 = l$2;
                ((SubredditForkingDao$push$1)o).label = 1;
                if ((a = l$0.a((lg2.c)o)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final List list = (List)a;
            if (list.size() >= 100) {
                ((k70.a)l$0).delete(CollectionsKt___CollectionsKt.K3(list));
            }
            ((k70.a)l$0).T((Object[])new w[] { l$2 });
            return j.a;
        }
    }
}
