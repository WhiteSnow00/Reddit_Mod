// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.x7$d;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import ur0.e$a;
import com.reddit.mutations.x7;
import o22.q4;
import com.reddit.type.VoteState;
import jd0.k$b;
import kotlin.NoWhenBranchMatchedException;
import jd0.k$a;
import com.reddit.mutations.x7$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import jd0.k;
import com.reddit.domain.postsets.model.PostSetPostVoteState;
import zg2.p;
import tg2.c;
import pj2.s;
import javax.inject.Inject;
import ur0.g;
import lb0.b;

public final class RedditPostSetGraphqlDataSource implements b
{
    public final g a;
    
    @Inject
    public RedditPostSetGraphqlDataSource(final g a) {
        this.a = a;
    }
    
    public final s a(final String s) {
        return new s((p)new RedditPostSetGraphqlDataSource$postSet$1(s, this, (c)null));
    }
    
    public final s b(final String s) {
        return new s((p)new RedditPostSetGraphqlDataSource$singlePostPostSet$1(this, s, (c)null));
    }
    
    public final Object c(final String l$1, final PostSetPostVoteState postSetPostVoteState, final c<? super k> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1) {
                final RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1 redditPostSetGraphqlDataSource$updatePostSetPostVoteState$1 = (RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)c;
                final int label = redditPostSetGraphqlDataSource$updatePostSetPostVoteState$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPostSetGraphqlDataSource$updatePostSetPostVoteState$1.label = label + Integer.MIN_VALUE;
                    o = redditPostSetGraphqlDataSource$updatePostSetPostVoteState$1;
                    break Label_0054;
                }
            }
            o = new RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1(this, (c)c);
        }
        Object o2 = ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).label;
        k$a k$a2 = null;
        Label_0116: {
            if (label2 == 0) {
                break Label_0116;
            }
            Label_0106: {
                if (label2 != 1) {
                    break Label_0106;
                }
                String s = (String)((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).L$1;
                RedditPostSetGraphqlDataSource redditPostSetGraphqlDataSource = (RedditPostSetGraphqlDataSource)((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).L$0;
                try {
                    aj2.c.Q0(o2);
                    x7$d a;
                    int n;
                    Object c2;
                    k$a k$a;
                    int n2;
                    PostSetPostVoteState postSetPostVoteState2;
                    k$b k$b;
                    VoteState voteState;
                    int n3 = 0;
                    g a2;
                    x7 x7;
                    Label_0188:Block_7_Outer:
                    while (true) {
                    Block_9_Outer:
                        while (true) {
                            while (true) {
                                Block_8: {
                                    while (true) {
                                        while (true) {
                                            a = ((x7$b)o2).a;
                                            n = 0;
                                            if (a != null) {
                                                n = n;
                                                if (!a.b) {
                                                    n = 1;
                                                }
                                            }
                                            c2 = null;
                                            if (n != 0) {
                                                k$a = new k$a((Throwable)null);
                                                return k$a2;
                                            }
                                            if (a != null) {
                                                c2 = a.c;
                                            }
                                            redditPostSetGraphqlDataSource.getClass();
                                            if (c2 == null) {
                                                n2 = -1;
                                            }
                                            else {
                                                n2 = RedditPostSetGraphqlDataSource.a.b[((Enum)c2).ordinal()];
                                            }
                                            if (n2 != -1) {
                                                if (n2 != 1) {
                                                    if (n2 != 2) {
                                                        if (n2 != 3) {
                                                            if (n2 != 4) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            postSetPostVoteState2 = PostSetPostVoteState.UNKNOWN;
                                                        }
                                                        else {
                                                            postSetPostVoteState2 = PostSetPostVoteState.NONE;
                                                        }
                                                    }
                                                    else {
                                                        postSetPostVoteState2 = PostSetPostVoteState.DOWN;
                                                    }
                                                }
                                                else {
                                                    postSetPostVoteState2 = PostSetPostVoteState.UP;
                                                }
                                            }
                                            else {
                                                postSetPostVoteState2 = PostSetPostVoteState.UNKNOWN;
                                            }
                                            k$b = new k$b(s, postSetPostVoteState2);
                                            return k$a2;
                                            voteState = VoteState.UNKNOWN__;
                                            break Label_0188;
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            iftrue(Label_0177:)(n3 == 2);
                                            break Block_8;
                                            Label_0258: {
                                                redditPostSetGraphqlDataSource = this;
                                            }
                                            s = l$1;
                                            continue Block_7_Outer;
                                        }
                                        a2 = this.a;
                                        x7 = new x7(new q4(l$1, voteState));
                                        ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).L$0 = this;
                                        ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).L$1 = l$1;
                                        ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState.RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).label = 1;
                                        o2 = e$a.b(14, (h7.k)x7, (e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                                        iftrue(Label_0258:)(o2 != coroutine_SUSPENDED);
                                        return coroutine_SUSPENDED;
                                        iftrue(Label_0162:)(n3 != 4);
                                        continue Block_7_Outer;
                                    }
                                    Label_0184: {
                                        voteState = VoteState.UP;
                                    }
                                    continue Label_0188;
                                }
                                iftrue(Label_0170:)(n3 == 3);
                                continue;
                            }
                            Label_0162: {
                                throw new NoWhenBranchMatchedException();
                            }
                            Label_0170:
                            voteState = VoteState.NONE;
                            continue Label_0188;
                            aj2.c.Q0(o2);
                            n3 = RedditPostSetGraphqlDataSource.a.a[postSetPostVoteState.ordinal()];
                            iftrue(Label_0184:)(n3 == 1);
                            continue Block_9_Outer;
                        }
                        Label_0177: {
                            voteState = VoteState.DOWN;
                        }
                        continue Label_0188;
                    }
                }
                finally {
                    final Throwable t;
                    k$a2 = new k$a(t);
                }
            }
        }
        return k$a2;
    }
}
