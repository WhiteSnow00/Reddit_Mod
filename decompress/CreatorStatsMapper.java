// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import com.reddit.fragment.PostStatsFragment$d$a;
import com.reddit.fragment.PostStatsFragment$d;
import kl0.w5;
import com.reddit.fragment.PostStatsFragment$i;
import com.reddit.fragment.PostStatsFragment$g;
import com.reddit.fragment.PostStatsFragment$f;
import com.reddit.fragment.PostStatsFragment$h;
import com.reddit.queries.w0$k$a;
import com.reddit.fragment.PostStatsFragment;
import com.reddit.queries.w0$l$a;
import com.reddit.queries.w0$l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ib0.g;
import kotlin.collections.EmptyList;
import com.reddit.fragment.PostStatsFragment$e;
import ib0.a;
import ib0.f;
import ib0.b;
import com.reddit.queries.w0$d;
import com.reddit.fragment.PostInfoFragment$i;
import com.reddit.fragment.PostInfoFragment$g;
import ib0.h$b;
import ib0.h$a;
import com.reddit.fragment.PostInfoFragment$l;
import com.reddit.fragment.PostInfoFragment$j;
import com.reddit.fragment.PostInfoFragment$c;
import com.reddit.fragment.PostInfoFragment$k;
import com.reddit.fragment.PostInfoFragment$b;
import com.reddit.fragment.PostInfoFragment$d;
import com.reddit.fragment.PostInfoFragment$a;
import ib0.d;
import ib0.c;
import kl0.t5;
import com.reddit.queries.w0$g$a;
import com.reddit.queries.w0$g;
import com.reddit.queries.w0$j;
import com.reddit.queries.w0$b;
import com.reddit.fragment.PostInfoFragment;
import com.reddit.queries.w0$h$a;
import com.reddit.queries.w0$h;
import java.util.Iterator;
import com.reddit.queries.w0$i;
import com.reddit.queries.w0$a;
import com.reddit.queries.w0$f;
import com.reddit.queries.w0$e;
import java.util.ArrayList;
import qg2.m;
import ib0.h;
import java.util.List;
import com.reddit.queries.w0$k;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0005H\u0002J\u0016\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t*\u00020\bH\u0002J\u000e\u0010\f\u001a\u0004\u0018\u00010\n*\u00020\u0005H\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¨\u0006\u0013" }, d2 = { "Lcom/reddit/data/model/CreatorStatsMapper;", "", "Lkl0/t5;", "Lib0/c;", "toCreatorStatsAvailability", "Lcom/reddit/fragment/PostInfoFragment;", "Lib0/d;", "toCreatorStatsPost", "Lcom/reddit/queries/w0$k;", "", "Lib0/h;", "mapOtherDiscussions", "toCrossPostInfoList", "Lcom/reddit/queries/w0$d;", "data", "Lib0/b;", "mapToCreatorStats", "<init>", "()V", "data-remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class CreatorStatsMapper
{
    public static final CreatorStatsMapper INSTANCE;
    
    static {
        INSTANCE = new CreatorStatsMapper();
    }
    
    private CreatorStatsMapper() {
    }
    
    private final List<h> mapOtherDiscussions(final w0$k w0$k) {
        final w0$a d = w0$k.d;
        final List<h> list = null;
        List<h> list2;
        if (d != null) {
            list2 = list;
            if (d != null) {
                final w0$i b = d.b;
                list2 = list;
                if (b != null) {
                    final List b2 = b.b;
                    list2 = list;
                    if (b2 != null) {
                        final ArrayList list3 = new ArrayList<h>(m.P0((Iterable)b2, 10));
                        final Iterator iterator = b2.iterator();
                        while (true) {
                            list2 = (List<h>)list3;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final w0$e w0$e = (w0$e)iterator.next();
                            h crossPostInfoList = null;
                            Label_0125: {
                                if (w0$e != null) {
                                    final w0$h b3 = w0$e.b;
                                    if (b3 != null) {
                                        final w0$h$a b4 = b3.b;
                                        if (b4 != null) {
                                            final PostInfoFragment a = b4.a;
                                            if (a != null) {
                                                crossPostInfoList = CreatorStatsMapper.INSTANCE.toCrossPostInfoList(a);
                                                break Label_0125;
                                            }
                                        }
                                    }
                                }
                                crossPostInfoList = null;
                            }
                            list3.add((Object)crossPostInfoList);
                        }
                    }
                }
            }
        }
        else {
            final w0$b c = w0$k.c;
            list2 = list;
            if (c != null) {
                list2 = list;
                if (c != null) {
                    final w0$j b5 = c.b;
                    list2 = list;
                    if (b5 != null) {
                        final List b6 = b5.b;
                        list2 = list;
                        if (b6 != null) {
                            final ArrayList list4 = new ArrayList<h>(m.P0((Iterable)b6, 10));
                            final Iterator iterator2 = b6.iterator();
                            while (true) {
                                list2 = (List<h>)list4;
                                if (!iterator2.hasNext()) {
                                    break;
                                }
                                final w0$f w0$f = (w0$f)iterator2.next();
                                h crossPostInfoList2 = null;
                                Label_0264: {
                                    if (w0$f != null) {
                                        final w0$g b7 = w0$f.b;
                                        if (b7 != null) {
                                            final w0$g$a b8 = b7.b;
                                            if (b8 != null) {
                                                final PostInfoFragment a2 = b8.a;
                                                if (a2 != null) {
                                                    crossPostInfoList2 = CreatorStatsMapper.INSTANCE.toCrossPostInfoList(a2);
                                                    break Label_0264;
                                                }
                                            }
                                        }
                                    }
                                    crossPostInfoList2 = null;
                                }
                                list4.add((Object)crossPostInfoList2);
                            }
                        }
                    }
                }
            }
        }
        return list2;
    }
    
    private final c toCreatorStatsAvailability(final t5 t5) {
        return new c(t5.c, String.valueOf(t5.b));
    }
    
    private final d toCreatorStatsPost(final PostInfoFragment postInfoFragment) {
        final PostInfoFragment$a h = postInfoFragment.h;
        final Object o = null;
        final d d = null;
        Object b = null;
        d d2;
        if (h != null) {
            d2 = d;
            if (h != null) {
                final PostInfoFragment$d i = h.i;
                if (i != null) {
                    final PostInfoFragment$b b2 = i.b;
                    if (b2 != null) {
                        final String b3 = h.b;
                        String c = h.c;
                        if (c == null) {
                            c = "";
                        }
                        final String b4 = b2.b;
                        final String c2 = b2.c;
                        final PostInfoFragment$k h2 = h.h;
                        if (h2 != null) {
                            b = h2.b;
                        }
                        d2 = new d(b3, c, String.valueOf(b), b4, c2);
                        return d2;
                    }
                }
                throw new IllegalStateException("Post author should not be null");
            }
        }
        else {
            final PostInfoFragment$c g = postInfoFragment.g;
            d2 = d;
            if (g != null) {
                d2 = d;
                if (g != null) {
                    final PostInfoFragment$j j = g.i;
                    final String b5 = g.b;
                    String c3 = g.c;
                    if (c3 == null) {
                        c3 = "";
                    }
                    final String b6 = j.b;
                    final String c4 = j.c;
                    final PostInfoFragment$l h3 = g.h;
                    Object b7 = o;
                    if (h3 != null) {
                        b7 = h3.b;
                    }
                    d2 = new d(b5, c3, String.valueOf(b7), b6, c4);
                }
            }
        }
        return d2;
    }
    
    private final h toCrossPostInfoList(final PostInfoFragment postInfoFragment) {
        final PostInfoFragment$a h = postInfoFragment.h;
        final String s = "";
        final String s2 = null;
        final h h2 = null;
        final String s3 = null;
        Object o;
        if (h != null) {
            PostInfoFragment$b b = null;
            Label_0046: {
                if (h != null) {
                    final PostInfoFragment$d i = h.i;
                    if (i != null) {
                        b = i.b;
                        break Label_0046;
                    }
                }
                b = null;
            }
            final h h3 = h2;
            if (b == null) {
                return h3;
            }
            final String b2 = b.b;
            final String c = b.c;
            final PostInfoFragment$g d = b.d;
            String string = s3;
            if (d != null) {
                final Object b3 = d.b;
                string = s3;
                if (b3 != null) {
                    string = b3.toString();
                }
            }
            final PostInfoFragment$a h4 = postInfoFragment.h;
            String e = s;
            if (h4 != null) {
                e = h4.e;
                if (e == null) {
                    e = s;
                }
            }
            o = new h$a(b2, c, string, e);
        }
        else {
            final PostInfoFragment$c g = postInfoFragment.g;
            h h3 = h2;
            if (g == null) {
                return h3;
            }
            PostInfoFragment$j j;
            if (g != null) {
                j = g.i;
            }
            else {
                j = null;
            }
            h3 = h2;
            if (j == null) {
                return h3;
            }
            final String b4 = j.b;
            final String c2 = j.c;
            final PostInfoFragment$i d2 = j.d;
            String string2 = s2;
            if (d2 != null) {
                final Object b5 = d2.b;
                string2 = s2;
                if (b5 != null) {
                    string2 = b5.toString();
                }
            }
            final PostInfoFragment$c g2 = postInfoFragment.g;
            String e2 = s;
            if (g2 != null) {
                e2 = g2.e;
                if (e2 == null) {
                    e2 = s;
                }
            }
            o = new h$b(b4, c2, string2, e2);
        }
        return (h)o;
    }
    
    public final b mapToCreatorStats(final w0$d w0$d) {
        b b = null;
        final c c = null;
        PostStatsFragment a2 = null;
        Label_0044: {
            if (w0$d != null) {
                final w0$l a = w0$d.a;
                if (a != null) {
                    final w0$l$a b2 = a.b;
                    if (b2 != null) {
                        a2 = b2.a;
                        break Label_0044;
                    }
                }
            }
            a2 = null;
        }
        PostInfoFragment a3 = null;
        Label_0084: {
            if (w0$d != null) {
                final w0$k b3 = w0$d.b;
                if (b3 != null) {
                    final w0$k$a b4 = b3.b;
                    if (b4 != null) {
                        a3 = b4.a;
                        break Label_0084;
                    }
                }
            }
            a3 = null;
        }
        if (a2 != null) {
            d creatorStatsPost;
            if (a3 != null) {
                creatorStatsPost = CreatorStatsMapper.INSTANCE.toCreatorStatsPost(a3);
            }
            else {
                creatorStatsPost = null;
            }
            final PostStatsFragment$h e = a2.e;
            f f;
            if (e != null) {
                final Integer b5 = e.b;
                int intValue;
                if (b5 != null) {
                    intValue = b5;
                }
                else {
                    intValue = 0;
                }
                f = new f(intValue, CreatorStatsMapper.INSTANCE.toCreatorStatsAvailability(e.c.b.a));
            }
            else {
                f = null;
            }
            final PostStatsFragment$f c2 = a2.c;
            f f2;
            if (c2 != null) {
                final Integer b6 = c2.b;
                int intValue2;
                if (b6 != null) {
                    intValue2 = b6;
                }
                else {
                    intValue2 = 0;
                }
                f2 = new f(intValue2, CreatorStatsMapper.INSTANCE.toCreatorStatsAvailability(c2.c.b.a));
            }
            else {
                f2 = null;
            }
            final PostStatsFragment$g d = a2.d;
            f f3;
            if (d != null) {
                final Integer b7 = d.b;
                int intValue3;
                if (b7 != null) {
                    intValue3 = b7;
                }
                else {
                    intValue3 = 0;
                }
                f3 = new f(intValue3, CreatorStatsMapper.INSTANCE.toCreatorStatsAvailability(d.c.b.a));
            }
            else {
                f3 = null;
            }
            final PostStatsFragment$i f4 = a2.f;
            Object instance = null;
            Label_0455: {
                if (f4 != null) {
                    final List c3 = f4.c;
                    if (c3 != null) {
                        final ArrayList list = new ArrayList<a>(m.P0((Iterable)c3, 10));
                        final Iterator iterator = c3.iterator();
                        while (true) {
                            instance = list;
                            if (!iterator.hasNext()) {
                                break Label_0455;
                            }
                            final w5 a4 = ((PostStatsFragment$e)iterator.next()).b.a;
                            final Integer c4 = a4.c;
                            int intValue4;
                            if (c4 != null) {
                                intValue4 = c4;
                            }
                            else {
                                intValue4 = 0;
                            }
                            list.add((Object)new a(intValue4, String.valueOf(a4.b)));
                        }
                    }
                }
                instance = EmptyList.INSTANCE;
            }
            final PostStatsFragment$i f5 = a2.f;
            c creatorStatsAvailability = c;
            if (f5 != null) {
                final PostStatsFragment$d b8 = f5.b;
                creatorStatsAvailability = c;
                if (b8 != null) {
                    final PostStatsFragment$d$a b9 = b8.b;
                    creatorStatsAvailability = c;
                    if (b9 != null) {
                        final t5 a5 = b9.a;
                        creatorStatsAvailability = c;
                        if (a5 != null) {
                            creatorStatsAvailability = CreatorStatsMapper.INSTANCE.toCreatorStatsAvailability(a5);
                        }
                    }
                }
            }
            final g g = new g(creatorStatsAvailability, (List)instance);
            final w0$k b10 = w0$d.b;
            Object o = null;
            Label_0571: {
                if (b10 != null) {
                    final List<h> mapOtherDiscussions = CreatorStatsMapper.INSTANCE.mapOtherDiscussions(b10);
                    if (mapOtherDiscussions != null) {
                        o = CollectionsKt___CollectionsKt.n1((Iterable)mapOtherDiscussions);
                        break Label_0571;
                    }
                }
                o = EmptyList.INSTANCE;
            }
            b = new b(a2.b, g, creatorStatsPost, f, (List)o, f2, f3);
        }
        return b;
    }
}
