// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import java.util.Iterator;
import pg2.j;
import java.util.ArrayList;
import qg2.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tg2.c;
import pj2.f;
import com.reddit.domain.model.SubredditListItem;
import java.util.List;
import pj2.e;

public final class RedditLocalSubredditDataSource$observeSubscribedSubredditListItems$$inlined$map$1 implements e<List<? extends SubredditListItem>>
{
    public final /* synthetic */ e f;
    
    public RedditLocalSubredditDataSource$observeSubscribedSubredditListItems$$inlined$map$1(final e f) {
        this.f = f;
    }
    
    public final Object a(final f f, final c c) {
        final Object a = this.f.a((f)new f() {
            public final Object emit(Object o, final c c) {
                ContinuationImpl continuationImpl2 = null;
                Label_0050: {
                    if (c instanceof RedditLocalSubredditDataSource$observeSubscribedSubredditListItems$$inlined$map$1$2$1) {
                        final ContinuationImpl continuationImpl = (RedditLocalSubredditDataSource$observeSubscribedSubredditListItems$$inlined$map$1$2$1)c;
                        final int label = continuationImpl.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            continuationImpl.label = label + Integer.MIN_VALUE;
                            continuationImpl2 = continuationImpl;
                            break Label_0050;
                        }
                    }
                    continuationImpl2 = new ContinuationImpl(c) {
                        public Object L$0;
                        public int label;
                        public /* synthetic */ Object result;
                        public final /* synthetic */ RedditLocalSubredditDataSource$observeSubscribedSubredditListItems$$inlined$map$1$2 this$0;
                        
                        public final Object invokeSuspend(final Object result) {
                            this.result = result;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.emit(null, (c)this);
                        }
                    };
                }
                final Object result = continuationImpl2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = continuationImpl2.label;
                if (label2 != 0) {
                    if (label2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aj2.c.Q0(result);
                }
                else {
                    aj2.c.Q0(result);
                    final f f = f;
                    final List list = (List)o;
                    o = new ArrayList(m.P0((Iterable)list, 10));
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        ((ArrayList<SubredditListItem>)o).add(RedditLocalSubredditDataSource.a.c((j60.e)iterator.next()));
                    }
                    continuationImpl2.label = 1;
                    if (f.emit(o, (c)continuationImpl2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                return j.a;
            }
        }, c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
