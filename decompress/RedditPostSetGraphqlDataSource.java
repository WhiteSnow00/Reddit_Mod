// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.x7$d;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import mr0.e;
import mr0.e$a;
import com.reddit.mutations.x7;
import g22.q4;
import com.reddit.type.VoteState;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.mutations.x7$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ad0.k;
import com.reddit.domain.postsets.model.PostSetPostVoteState;
import rg2.p;
import lg2.c;
import hj2.v;
import javax.inject.Inject;
import mr0.g;
import db0.b;

public final class RedditPostSetGraphqlDataSource implements b
{
    public final g a;
    
    @Inject
    public RedditPostSetGraphqlDataSource(final g a) {
        this.a = a;
    }
    
    public final v a(final String s) {
        return new v((p)new RedditPostSetGraphqlDataSource$postSet$1(s, this, (c)null));
    }
    
    public final v b(final String s) {
        return new v((p)new RedditPostSetGraphqlDataSource$singlePostPostSet$1(this, s, (c)null));
    }
    
    public final Object c(final String l$1, final PostSetPostVoteState postSetPostVoteState, final c<? super k> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1) {
                final RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1 redditPostSetGraphqlDataSource$updatePostSetPostVoteState$1 = (RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)c;
                final int label = redditPostSetGraphqlDataSource$updatePostSetPostVoteState$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPostSetGraphqlDataSource$updatePostSetPostVoteState$1.label = label + Integer.MIN_VALUE;
                    o = redditPostSetGraphqlDataSource$updatePostSetPostVoteState$1;
                    break Label_0054;
                }
            }
            o = new RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1(this, (c)c);
        }
        Object o2 = ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).label;
        k.a a3 = null;
        Label_0116: {
            if (label2 == 0) {
                break Label_0116;
            }
            Label_0106: {
                if (label2 != 1) {
                    break Label_0106;
                }
                String s = (String)((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).L$1;
                RedditPostSetGraphqlDataSource redditPostSetGraphqlDataSource = (RedditPostSetGraphqlDataSource)((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).L$0;
                try {
                    yd.b.k0(o2);
                    x7$d a;
                    int n;
                    Object c2;
                    k.a a2;
                    int n2;
                    PostSetPostVoteState postSetPostVoteState2;
                    k.b b;
                    int n3;
                    VoteState voteState;
                    g a4;
                    x7 x7;
                    Label_0188:Block_7_Outer:
                    while (true) {
                        Block_10: {
                            while (true) {
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
                                            a2 = new k.a(null);
                                            return a3;
                                        }
                                        if (a != null) {
                                            c2 = a.c;
                                        }
                                        redditPostSetGraphqlDataSource.getClass();
                                        if (c2 == null) {
                                            n2 = -1;
                                        }
                                        else {
                                            n2 = RedditPostSetGraphqlDataSource.RedditPostSetGraphqlDataSource$a.b[((Enum)c2).ordinal()];
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
                                        b = new k.b(s, postSetPostVoteState2);
                                        return a3;
                                        iftrue(Label_0162:)(n3 != 4);
                                        break Block_10;
                                        Label_0170: {
                                            voteState = VoteState.NONE;
                                        }
                                        break Label_0188;
                                        Label_0184:
                                        voteState = VoteState.UP;
                                        break Label_0188;
                                        Label_0258:
                                        redditPostSetGraphqlDataSource = this;
                                        s = l$1;
                                        continue Block_7_Outer;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    Label_0177: {
                                        voteState = VoteState.DOWN;
                                    }
                                    a4 = this.a;
                                    x7 = new x7(new q4(l$1, voteState));
                                    ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).L$0 = this;
                                    ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).L$1 = l$1;
                                    ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).label = 1;
                                    o2 = e$a.b(14, (h7.k)x7, (e)a4, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                                    iftrue(Label_0258:)(o2 != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    iftrue(Label_0177:)(n3 == 2);
                                    iftrue(Label_0170:)(n3 == 3);
                                    continue Block_7_Outer;
                                }
                                yd.b.k0(o2);
                                n3 = RedditPostSetGraphqlDataSource.RedditPostSetGraphqlDataSource$a.a[((Enum)postSetPostVoteState).ordinal()];
                                iftrue(Label_0184:)(n3 == 1);
                                continue;
                            }
                        }
                        voteState = VoteState.UNKNOWN__;
                        continue Label_0188;
                    }
                    Label_0162: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                finally {
                    final Throwable t;
                    a3 = new k.a(t);
                }
            }
        }
        return a3;
    }
}
