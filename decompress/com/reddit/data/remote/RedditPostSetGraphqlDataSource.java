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
import y12.q4;
import com.reddit.type.VoteState;
import ad0.k$b;
import kotlin.NoWhenBranchMatchedException;
import ad0.k$a;
import com.reddit.mutations.x7$b;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ad0.k;
import com.reddit.domain.postsets.model.PostSetPostVoteState;
import cg2.j;
import cj2.f;
import mg2.p;
import gg2.c;
import cj2.s;
import javax.inject.Inject;
import mr0.g;
import eb0.b;

public final class RedditPostSetGraphqlDataSource implements b
{
    public final g a;
    
    @Inject
    public RedditPostSetGraphqlDataSource(final g a) {
        this.a = a;
    }
    
    public final s a(final String s) {
        return new s((p<? super f<? super T>, ? super c<? super j>, ?>)new RedditPostSetGraphqlDataSource$postSet$1(s, this, (c)null));
    }
    
    public final s b(final String s) {
        return new s((p<? super f<? super T>, ? super c<? super j>, ?>)new RedditPostSetGraphqlDataSource$singlePostPostSet$1(this, s, (c)null));
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
        k$a k$a2 = null;
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
                    d.b4(o2);
                    while (true) {
                        int n3 = 0;
                    Block_10_Outer:
                        while (true) {
                            final x7$d a = ((x7$b)o2).a;
                            int n = 0;
                            if (a != null) {
                                n = n;
                                if (!a.b) {
                                    n = 1;
                                }
                            }
                            Object c2 = null;
                            if (n != 0) {
                                final k$a k$a = new k$a((Throwable)null);
                                return k$a2;
                            }
                            if (a != null) {
                                c2 = a.c;
                            }
                            redditPostSetGraphqlDataSource.getClass();
                            int n2;
                            if (c2 == null) {
                                n2 = -1;
                            }
                            else {
                                n2 = RedditPostSetGraphqlDataSource.RedditPostSetGraphqlDataSource$a.b[((Enum)c2).ordinal()];
                            }
                            PostSetPostVoteState postSetPostVoteState2;
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
                            final k$b k$b = new k$b(s, postSetPostVoteState2);
                            return k$a2;
                            d.b4(o2);
                            n3 = RedditPostSetGraphqlDataSource.RedditPostSetGraphqlDataSource$a.a[postSetPostVoteState.ordinal()];
                            iftrue(Label_0184:)(n3 == 1);
                            VoteState voteState = null;
                        Label_0188:
                            while (true) {
                                Block_7: {
                                    break Block_7;
                                    voteState = VoteState.UNKNOWN__;
                                    break Label_0188;
                                    Label_0177: {
                                        voteState = VoteState.DOWN;
                                    }
                                    break Label_0188;
                                }
                                iftrue(Label_0177:)(n3 == 2);
                                break Block_10_Outer;
                                Label_0162: {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                Label_0184:
                                voteState = VoteState.UP;
                                break Label_0188;
                                Label_0170:
                                voteState = VoteState.NONE;
                                break Label_0188;
                                iftrue(Label_0162:)(n3 != 4);
                                continue;
                            }
                            final g a2 = this.a;
                            final x7 x7 = new x7(new q4(l$1, voteState));
                            ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).L$0 = this;
                            ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).L$1 = l$1;
                            ((RedditPostSetGraphqlDataSource$updatePostSetPostVoteState$1)o).label = 1;
                            o2 = e$a.b(14, (h7.k)x7, (e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                            iftrue(Label_0258:)(o2 != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                            Label_0258: {
                                redditPostSetGraphqlDataSource = this;
                            }
                            s = l$1;
                            continue Block_10_Outer;
                        }
                        iftrue(Label_0170:)(n3 == 3);
                        continue;
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
