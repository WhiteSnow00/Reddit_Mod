// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import kotlin.collections.EmptyList;
import kotlin.Result;
import cg2.j;
import java.util.Iterator;
import java.util.Map;
import dg2.m;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ng2.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import java.util.Set;
import javax.inject.Inject;
import xd0.d;
import com.reddit.matrix.data.datasource.remote.a;
import fy0.c;

public final class RedditUserRepositoryImpl implements c
{
    public final a a;
    public final xx0.a b;
    public final d c;
    
    @Inject
    public RedditUserRepositoryImpl(final a a, final xx0.a b, final d c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Serializable a(final Set set, gg2.c b) {
        RedditUserRepositoryImpl$getUsers$1 redditUserRepositoryImpl$getUsers$1 = null;
        Label_0049: {
            if (b instanceof RedditUserRepositoryImpl$getUsers$1) {
                redditUserRepositoryImpl$getUsers$1 = (RedditUserRepositoryImpl$getUsers$1)b;
                final int label = redditUserRepositoryImpl$getUsers$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditUserRepositoryImpl$getUsers$1.label = label + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            redditUserRepositoryImpl$getUsers$1 = new RedditUserRepositoryImpl$getUsers$1(this, (gg2.c)b);
        }
        Object o = redditUserRepositoryImpl$getUsers$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditUserRepositoryImpl$getUsers$1.label;
        Label_0282: {
            if (label2 != 0) {
                if (label2 == 1) {
                    final Object o2 = redditUserRepositoryImpl$getUsers$1.L$1;
                    final RedditUserRepositoryImpl redditUserRepositoryImpl = (RedditUserRepositoryImpl)redditUserRepositoryImpl$getUsers$1.L$0;
                    cg.d.b4(o);
                    break Label_0282;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(o);
            o = this.b;
            synchronized (o) {
                e.f((Object)set, "userIds");
                b = new LinkedHashMap<String, ey0.c>();
                final ArrayList<String> list = new ArrayList<String>();
                for (final String s : set) {
                    final ey0.c c = ((xx0.a)o).a.get(s);
                    if (c != null) {
                        ((Map<String, ey0.c>)b).put(s, c);
                    }
                    else {
                        list.add(s);
                    }
                }
                monitorexit(o);
                if (list.isEmpty() ^ true) {
                    redditUserRepositoryImpl$getUsers$1.L$0 = this;
                    redditUserRepositoryImpl$getUsers$1.L$1 = b;
                    redditUserRepositoryImpl$getUsers$1.label = 1;
                    o = this.d(list, (gg2.c<? super List<ey0.c>>)redditUserRepositoryImpl$getUsers$1);
                    if (o == coroutine_SUSPENDED) {
                        return (Serializable)coroutine_SUSPENDED;
                    }
                    final Object o2 = b;
                    final RedditUserRepositoryImpl redditUserRepositoryImpl = this;
                    o = o;
                    int p;
                    if ((p = cg.d.p3(m.u4((Iterable)o, 10))) < 16) {
                        p = 16;
                    }
                    final LinkedHashMap linkedHashMap = new LinkedHashMap(p);
                    final Iterator iterator2 = ((Iterable)o).iterator();
                    while (iterator2.hasNext()) {
                        o = iterator2.next();
                        linkedHashMap.put((Object)((ey0.c)o).g, o);
                    }
                    b = redditUserRepositoryImpl.b;
                    synchronized (b) {
                        ((xx0.a)b).a.putAll(linkedHashMap);
                        monitorexit(b);
                        b = o2;
                        final Map u4;
                        return kotlin.collections.c.A4((Map)b, u4);
                    }
                }
                final Map u4 = kotlin.collections.c.u4();
                return kotlin.collections.c.A4((Map)b, u4);
            }
        }
    }
    
    public final Object b(ey0.c l$1, final gg2.c<? super j> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RedditUserRepositoryImpl$unblockUser$1) {
                final RedditUserRepositoryImpl$unblockUser$1 redditUserRepositoryImpl$unblockUser$1 = (RedditUserRepositoryImpl$unblockUser$1)c;
                final int label = redditUserRepositoryImpl$unblockUser$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditUserRepositoryImpl$unblockUser$1.label = label + Integer.MIN_VALUE;
                    o = redditUserRepositoryImpl$unblockUser$1;
                    break Label_0051;
                }
            }
            o = new RedditUserRepositoryImpl$unblockUser$1(this, (gg2.c)c);
        }
        final Object result = ((RedditUserRepositoryImpl$unblockUser$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditUserRepositoryImpl$unblockUser$1)o).label;
        RedditUserRepositoryImpl redditUserRepositoryImpl = null;
        Object constructor-impl = null;
        Label_0211: {
            Label_0176: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        l$1 = (ey0.c)((RedditUserRepositoryImpl$unblockUser$1)o).L$1;
                        redditUserRepositoryImpl = (RedditUserRepositoryImpl)((RedditUserRepositoryImpl$unblockUser$1)o).L$0;
                        final ey0.c c2 = l$1;
                        try {
                            cg.d.b4(result);
                            break Label_0176;
                        }
                        finally {
                            l$1 = c2;
                            break Label_0176;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cg.d.b4(result);
                try {
                    final af2.a c3 = this.c.c(l$1.f);
                    ((RedditUserRepositoryImpl$unblockUser$1)o).L$0 = this;
                    ((RedditUserRepositoryImpl$unblockUser$1)o).L$1 = l$1;
                    ((RedditUserRepositoryImpl$unblockUser$1)o).label = 1;
                    if (kotlinx.coroutines.rx2.d.a(c3, (gg2.c)o) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    constructor-impl = this;
                    Result.constructor-impl((Object)j.a);
                    break Label_0211;
                }
                finally {
                    redditUserRepositoryImpl = this;
                }
            }
            constructor-impl = Result.constructor-impl((Object)cg.d.B1((Throwable)constructor-impl));
        }
        if (Result.isSuccess-impl(constructor-impl)) {
            final j j = (j)constructor-impl;
            redditUserRepositoryImpl.b.a(l$1.g, false);
        }
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(constructor-impl);
        if (exceptionOrNull-impl == null) {
            return j.a;
        }
        throw exceptionOrNull-impl;
    }
    
    public final Object c(ey0.c l$1, final gg2.c<? super j> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RedditUserRepositoryImpl$blockUser$1) {
                final RedditUserRepositoryImpl$blockUser$1 redditUserRepositoryImpl$blockUser$1 = (RedditUserRepositoryImpl$blockUser$1)c;
                final int label = redditUserRepositoryImpl$blockUser$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditUserRepositoryImpl$blockUser$1.label = label + Integer.MIN_VALUE;
                    o = redditUserRepositoryImpl$blockUser$1;
                    break Label_0051;
                }
            }
            o = new RedditUserRepositoryImpl$blockUser$1(this, (gg2.c)c);
        }
        final Object result = ((RedditUserRepositoryImpl$blockUser$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditUserRepositoryImpl$blockUser$1)o).label;
        RedditUserRepositoryImpl redditUserRepositoryImpl = null;
        Object constructor-impl = null;
        Label_0211: {
            Label_0176: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        l$1 = (ey0.c)((RedditUserRepositoryImpl$blockUser$1)o).L$1;
                        redditUserRepositoryImpl = (RedditUserRepositoryImpl)((RedditUserRepositoryImpl$blockUser$1)o).L$0;
                        final ey0.c c2 = l$1;
                        try {
                            cg.d.b4(result);
                            break Label_0176;
                        }
                        finally {
                            l$1 = c2;
                            break Label_0176;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cg.d.b4(result);
                try {
                    final af2.a blockUser = this.c.blockUser(l$1.f);
                    ((RedditUserRepositoryImpl$blockUser$1)o).L$0 = this;
                    ((RedditUserRepositoryImpl$blockUser$1)o).L$1 = l$1;
                    ((RedditUserRepositoryImpl$blockUser$1)o).label = 1;
                    if (kotlinx.coroutines.rx2.d.a(blockUser, (gg2.c)o) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    constructor-impl = this;
                    Result.constructor-impl((Object)j.a);
                    break Label_0211;
                }
                finally {
                    redditUserRepositoryImpl = this;
                }
            }
            constructor-impl = Result.constructor-impl((Object)cg.d.B1((Throwable)constructor-impl));
        }
        if (Result.isSuccess-impl(constructor-impl)) {
            final j j = (j)constructor-impl;
            redditUserRepositoryImpl.b.a(l$1.g, true);
        }
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(constructor-impl);
        if (exceptionOrNull-impl == null) {
            return j.a;
        }
        throw exceptionOrNull-impl;
    }
    
    public final Object d(final List<String> list, final gg2.c<? super List<ey0.c>> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RedditUserRepositoryImpl$fetchUsers$1) {
                final RedditUserRepositoryImpl$fetchUsers$1 redditUserRepositoryImpl$fetchUsers$1 = (RedditUserRepositoryImpl$fetchUsers$1)c;
                final int label = redditUserRepositoryImpl$fetchUsers$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditUserRepositoryImpl$fetchUsers$1.label = label + Integer.MIN_VALUE;
                    o = redditUserRepositoryImpl$fetchUsers$1;
                    break Label_0051;
                }
            }
            o = new RedditUserRepositoryImpl$fetchUsers$1(this, (gg2.c)c);
        }
        final Object result = ((RedditUserRepositoryImpl$fetchUsers$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditUserRepositoryImpl$fetchUsers$1)o).label;
        Object instance = null;
        Label_0097: {
            if (label2 == 0) {
                break Label_0097;
            }
            Label_0087: {
                if (label2 != 1) {
                    break Label_0087;
                }
                try {
                    cg.d.b4(result);
                    Object a = result;
                    Label_0265: {
                        instance = a;
                    }
                    return instance;
                    ArrayList list3 = null;
                Label_0193:
                    while (true) {
                        ArrayList<String> list2 = null;
                        String next = null;
                        final Iterator<String> iterator;
                        Iterator<Object> iterator2;
                        String s;
                        a a2;
                        Label_0119:Block_6_Outer:
                        while (true) {
                            while (true) {
                            Block_8:
                                while (true) {
                                    list2.add(next);
                                    break Label_0119;
                                    iftrue(Label_0224:)(!iterator.hasNext());
                                    break Block_8;
                                    next = iterator2.next();
                                    s = next;
                                    e.f((Object)s, "matrixId");
                                    iftrue(Label_0119:)(!xi2.j.I0(s, "@t2_", false));
                                    continue Block_6_Outer;
                                }
                                list3.add(hg1.a.r((String)iterator.next()));
                                continue Label_0193;
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                iftrue(Label_0171:)(!iterator2.hasNext());
                                continue;
                            }
                            Label_0235:
                            a2 = this.a;
                            ((RedditUserRepositoryImpl$fetchUsers$1)o).label = 1;
                            iftrue(Label_0265:)((a = a2.a(list3, (gg2.c)o)) != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                            cg.d.b4(result);
                            list2 = new ArrayList<String>();
                            iterator2 = list.iterator();
                            continue Label_0119;
                        }
                        Label_0171:
                        list3 = new ArrayList<String>(m.u4((Iterable)list2, 10));
                        iterator = list2.iterator();
                        continue Label_0193;
                    }
                    Label_0224:
                    iftrue(Label_0235:)(!list3.isEmpty());
                    return EmptyList.INSTANCE;
                }
                catch (final Exception ex) {
                    pu2.a.a.f((Throwable)ex, "Couldn't load info about users.", new Object[0]);
                    instance = EmptyList.INSTANCE;
                }
            }
        }
        return instance;
    }
}
