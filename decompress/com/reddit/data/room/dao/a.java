// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.dao;

import java.util.Iterator;
import sg2.e;
import ig2.m;
import hg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.List;
import com.reddit.data.room.model.ItemType;
import lg2.c;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import b60.h;

public interface a extends a<h>
{
    Object D1(final h p0, final ContinuationImpl p1);
    
    Object J0(final String p0, final ArrayList p1, final c p2);
    
    Object M(final ItemType p0, final c<? super List<h>> p1);
    
    Object N0(final String p0, final c<? super List<h>> p1);
    
    Object O1(final ArrayList p0, final c p1);
    
    public static final class a
    {
        public static Object a(final b l$0, List l$2, final String s, final c c) {
            DiscoverFeedItemDao$clearAndInsertAll$2 discoverFeedItemDao$clearAndInsertAll$3 = null;
            Label_0053: {
                if (c instanceof DiscoverFeedItemDao$clearAndInsertAll$2) {
                    final DiscoverFeedItemDao$clearAndInsertAll$2 discoverFeedItemDao$clearAndInsertAll$2 = (DiscoverFeedItemDao$clearAndInsertAll$2)c;
                    final int label = discoverFeedItemDao$clearAndInsertAll$2.label;
                    if ((label & Integer.MIN_VALUE) != 0x0) {
                        discoverFeedItemDao$clearAndInsertAll$2.label = label + Integer.MIN_VALUE;
                        discoverFeedItemDao$clearAndInsertAll$3 = discoverFeedItemDao$clearAndInsertAll$2;
                        break Label_0053;
                    }
                }
                discoverFeedItemDao$clearAndInsertAll$3 = new DiscoverFeedItemDao$clearAndInsertAll$2(c);
            }
            final Object result = discoverFeedItemDao$clearAndInsertAll$3.result;
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            final int label2 = discoverFeedItemDao$clearAndInsertAll$3.label;
            Object o;
            if (label2 != 0) {
                if (label2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l$2 = (List)discoverFeedItemDao$clearAndInsertAll$3.L$1;
                o = discoverFeedItemDao$clearAndInsertAll$3.L$0;
                yd.b.k0(result);
            }
            else {
                yd.b.k0(result);
                discoverFeedItemDao$clearAndInsertAll$3.L$0 = l$0;
                discoverFeedItemDao$clearAndInsertAll$3.L$1 = l$2;
                discoverFeedItemDao$clearAndInsertAll$3.label = 1;
                o = l$0;
                if (l$0.h(s, (c)discoverFeedItemDao$clearAndInsertAll$3) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            ((k70.a)o).I1(l$2);
            return j.a;
        }
        
        public static Object b(b l$0, List l$2, final c c) {
            Object o = null;
            Label_0049: {
                if (c instanceof DiscoverFeedItemDao$insertWithOrdinalOffset$1) {
                    final DiscoverFeedItemDao$insertWithOrdinalOffset$1 discoverFeedItemDao$insertWithOrdinalOffset$1 = (DiscoverFeedItemDao$insertWithOrdinalOffset$1)c;
                    final int label = discoverFeedItemDao$insertWithOrdinalOffset$1.label;
                    if ((label & Integer.MIN_VALUE) != 0x0) {
                        discoverFeedItemDao$insertWithOrdinalOffset$1.label = label + Integer.MIN_VALUE;
                        o = discoverFeedItemDao$insertWithOrdinalOffset$1;
                        break Label_0049;
                    }
                }
                o = new DiscoverFeedItemDao$insertWithOrdinalOffset$1(c);
            }
            final Object result = ((DiscoverFeedItemDao$insertWithOrdinalOffset$1)o).result;
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            final int label2 = ((DiscoverFeedItemDao$insertWithOrdinalOffset$1)o).label;
            Object i;
            if (label2 != 0) {
                if (label2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l$2 = (List)((DiscoverFeedItemDao$insertWithOrdinalOffset$1)o).L$1;
                l$0 = (b)((DiscoverFeedItemDao$insertWithOrdinalOffset$1)o).L$0;
                yd.b.k0(result);
                i = result;
            }
            else {
                yd.b.k0(result);
                ((DiscoverFeedItemDao$insertWithOrdinalOffset$1)o).L$0 = l$0;
                ((DiscoverFeedItemDao$insertWithOrdinalOffset$1)o).L$1 = l$2;
                ((DiscoverFeedItemDao$insertWithOrdinalOffset$1)o).label = 1;
                if ((i = l$0.i((c)o)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final Integer n = (Integer)i;
            int intValue;
            if (n != null) {
                intValue = n;
            }
            else {
                intValue = 0;
            }
            final ArrayList list = new ArrayList<h>(m.c3((Iterable)l$2, 10));
            for (final h h : l$2) {
                final int c2 = h.c;
                final String a = h.a;
                final ItemType b = h.b;
                final String d = h.d;
                final String e = h.e;
                final String f = h.f;
                sg2.e.f((Object)a, "id");
                sg2.e.f((Object)b, "type");
                sg2.e.f((Object)d, "topicSlug");
                sg2.e.f((Object)f, "after");
                list.add(new h(a, b, c2 + intValue, d, e, f));
            }
            ((k70.a)l$0).I1((List)list);
            return j.a;
        }
    }
}
