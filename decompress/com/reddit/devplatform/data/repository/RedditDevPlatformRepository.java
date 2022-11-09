// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.data.repository;

import com.reddit.devvit.plugin.redditapi.common.CommonMsg$SubredditObject;
import com.reddit.devvit.gql.SubredditMetadata$DevvitSubredditMetadata;
import java.util.concurrent.ConcurrentMap;
import ah2.f;
import zg2.p;
import j80.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$RedditObject;
import kotlin.Result;
import javax.inject.Inject;
import j80.b;
import j80.d;
import j80.e;
import j80.c;
import com.reddit.devplatform.data.source.remote.RemoteDevPlatformSource;

public final class RedditDevPlatformRepository
{
    public final RemoteDevPlatformSource a;
    public final c b;
    public final e c;
    public final d d;
    public final b e;
    
    @Inject
    public RedditDevPlatformRepository(final RemoteDevPlatformSource a, final c b, final e c, final d d, final b e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object a(final String s, final tg2.c<? super Result<CommonMsg$RedditObject>> c) {
        RedditDevPlatformRepository$getCommentById$1 redditDevPlatformRepository$getCommentById$2 = null;
        Label_0050: {
            if (c instanceof RedditDevPlatformRepository$getCommentById$1) {
                final RedditDevPlatformRepository$getCommentById$1 redditDevPlatformRepository$getCommentById$1 = (RedditDevPlatformRepository$getCommentById$1)c;
                final int label = redditDevPlatformRepository$getCommentById$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditDevPlatformRepository$getCommentById$1.label = label + Integer.MIN_VALUE;
                    redditDevPlatformRepository$getCommentById$2 = redditDevPlatformRepository$getCommentById$1;
                    break Label_0050;
                }
            }
            redditDevPlatformRepository$getCommentById$2 = new RedditDevPlatformRepository$getCommentById$1(this, (tg2.c)c);
        }
        final Object result = redditDevPlatformRepository$getCommentById$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditDevPlatformRepository$getCommentById$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            o = ((Result)result).unbox-impl();
        }
        else {
            aj2.c.Q0(result);
            final b e = this.e;
            final RedditDevPlatformRepository$getCommentById$2 redditDevPlatformRepository$getCommentById$3 = new RedditDevPlatformRepository$getCommentById$2((Object)this.a);
            redditDevPlatformRepository$getCommentById$2.label = 1;
            if ((o = this.b((j80.a<Object>)e, s, (zg2.p<? super String, ? super tg2.c<? super kotlin.Result<?>>, ?>)redditDevPlatformRepository$getCommentById$3, (tg2.c<? super kotlin.Result<?>>)redditDevPlatformRepository$getCommentById$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return o;
    }
    
    public final <T> Object b(a<T> l$0, String l$2, final p<? super String, ? super tg2.c<? super Result<? extends T>>, ?> p4, final tg2.c<? super Result<? extends T>> c) {
        RedditDevPlatformRepository$getDataFromCacheOrSource$1 redditDevPlatformRepository$getDataFromCacheOrSource$2 = null;
        Label_0059: {
            if (c instanceof RedditDevPlatformRepository$getDataFromCacheOrSource$1) {
                final RedditDevPlatformRepository$getDataFromCacheOrSource$1 redditDevPlatformRepository$getDataFromCacheOrSource$1 = (RedditDevPlatformRepository$getDataFromCacheOrSource$1)c;
                final int label = redditDevPlatformRepository$getDataFromCacheOrSource$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditDevPlatformRepository$getDataFromCacheOrSource$1.label = label + Integer.MIN_VALUE;
                    redditDevPlatformRepository$getDataFromCacheOrSource$2 = redditDevPlatformRepository$getDataFromCacheOrSource$1;
                    break Label_0059;
                }
            }
            redditDevPlatformRepository$getDataFromCacheOrSource$2 = new RedditDevPlatformRepository$getDataFromCacheOrSource$1(this, (tg2.c)c);
        }
        final Object result = redditDevPlatformRepository$getDataFromCacheOrSource$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditDevPlatformRepository$getDataFromCacheOrSource$2.label;
        Object invoke;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$2 = (String)redditDevPlatformRepository$getDataFromCacheOrSource$2.L$1;
            l$0 = (a)redditDevPlatformRepository$getDataFromCacheOrSource$2.L$0;
            aj2.c.Q0(result);
            invoke = result;
        }
        else {
            aj2.c.Q0(result);
            ((a<T>)l$0).getClass();
            f.f((Object)l$2, "key");
            final Object value = l$0.a.get(l$2);
            if (value != null) {
                return Result.constructor-impl(value);
            }
            redditDevPlatformRepository$getDataFromCacheOrSource$2.L$0 = l$0;
            redditDevPlatformRepository$getDataFromCacheOrSource$2.L$1 = l$2;
            redditDevPlatformRepository$getDataFromCacheOrSource$2.label = 1;
            if ((invoke = p4.invoke((Object)l$2, (Object)redditDevPlatformRepository$getDataFromCacheOrSource$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final Object unbox-impl = ((Result)invoke).unbox-impl();
        if (Result.isSuccess-impl(unbox-impl)) {
            ((a<T>)l$0).getClass();
            f.f((Object)l$2, "key");
            final ConcurrentMap a = l$0.a;
            f.e((Object)a, "cache");
            a.put(l$2, unbox-impl);
            return Result.constructor-impl(unbox-impl);
        }
        return Result.constructor-impl((Object)aj2.c.G(new Throwable("failed to fetch data from cache or remote")));
    }
    
    public final Object c(final String s, final tg2.c<? super Result<SubredditMetadata$DevvitSubredditMetadata>> c) {
        RedditDevPlatformRepository$getMetadata$1 redditDevPlatformRepository$getMetadata$2 = null;
        Label_0050: {
            if (c instanceof RedditDevPlatformRepository$getMetadata$1) {
                final RedditDevPlatformRepository$getMetadata$1 redditDevPlatformRepository$getMetadata$1 = (RedditDevPlatformRepository$getMetadata$1)c;
                final int label = redditDevPlatformRepository$getMetadata$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditDevPlatformRepository$getMetadata$1.label = label + Integer.MIN_VALUE;
                    redditDevPlatformRepository$getMetadata$2 = redditDevPlatformRepository$getMetadata$1;
                    break Label_0050;
                }
            }
            redditDevPlatformRepository$getMetadata$2 = new RedditDevPlatformRepository$getMetadata$1(this, (tg2.c)c);
        }
        final Object result = redditDevPlatformRepository$getMetadata$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditDevPlatformRepository$getMetadata$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            o = ((Result)result).unbox-impl();
        }
        else {
            aj2.c.Q0(result);
            final c b = this.b;
            final RedditDevPlatformRepository$getMetadata$2 redditDevPlatformRepository$getMetadata$3 = new RedditDevPlatformRepository$getMetadata$2((Object)this.a);
            redditDevPlatformRepository$getMetadata$2.label = 1;
            if ((o = this.b((j80.a<Object>)b, s, (zg2.p<? super String, ? super tg2.c<? super kotlin.Result<?>>, ?>)redditDevPlatformRepository$getMetadata$3, (tg2.c<? super kotlin.Result<?>>)redditDevPlatformRepository$getMetadata$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return o;
    }
    
    public final Object d(final String s, final tg2.c<? super Result<CommonMsg$RedditObject>> c) {
        RedditDevPlatformRepository$getPostById$1 redditDevPlatformRepository$getPostById$2 = null;
        Label_0050: {
            if (c instanceof RedditDevPlatformRepository$getPostById$1) {
                final RedditDevPlatformRepository$getPostById$1 redditDevPlatformRepository$getPostById$1 = (RedditDevPlatformRepository$getPostById$1)c;
                final int label = redditDevPlatformRepository$getPostById$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditDevPlatformRepository$getPostById$1.label = label + Integer.MIN_VALUE;
                    redditDevPlatformRepository$getPostById$2 = redditDevPlatformRepository$getPostById$1;
                    break Label_0050;
                }
            }
            redditDevPlatformRepository$getPostById$2 = new RedditDevPlatformRepository$getPostById$1(this, (tg2.c)c);
        }
        final Object result = redditDevPlatformRepository$getPostById$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditDevPlatformRepository$getPostById$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            o = ((Result)result).unbox-impl();
        }
        else {
            aj2.c.Q0(result);
            final d d = this.d;
            final RedditDevPlatformRepository$getPostById$2 redditDevPlatformRepository$getPostById$3 = new RedditDevPlatformRepository$getPostById$2((Object)this.a);
            redditDevPlatformRepository$getPostById$2.label = 1;
            if ((o = this.b((j80.a<Object>)d, s, (zg2.p<? super String, ? super tg2.c<? super kotlin.Result<?>>, ?>)redditDevPlatformRepository$getPostById$3, (tg2.c<? super kotlin.Result<?>>)redditDevPlatformRepository$getPostById$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return o;
    }
    
    public final Object e(final String s, final tg2.c<? super Result<CommonMsg$SubredditObject>> c) {
        RedditDevPlatformRepository$getSubredditById$1 redditDevPlatformRepository$getSubredditById$2 = null;
        Label_0050: {
            if (c instanceof RedditDevPlatformRepository$getSubredditById$1) {
                final RedditDevPlatformRepository$getSubredditById$1 redditDevPlatformRepository$getSubredditById$1 = (RedditDevPlatformRepository$getSubredditById$1)c;
                final int label = redditDevPlatformRepository$getSubredditById$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditDevPlatformRepository$getSubredditById$1.label = label + Integer.MIN_VALUE;
                    redditDevPlatformRepository$getSubredditById$2 = redditDevPlatformRepository$getSubredditById$1;
                    break Label_0050;
                }
            }
            redditDevPlatformRepository$getSubredditById$2 = new RedditDevPlatformRepository$getSubredditById$1(this, (tg2.c)c);
        }
        final Object result = redditDevPlatformRepository$getSubredditById$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditDevPlatformRepository$getSubredditById$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            o = ((Result)result).unbox-impl();
        }
        else {
            aj2.c.Q0(result);
            final e c2 = this.c;
            final RedditDevPlatformRepository$getSubredditById$2 redditDevPlatformRepository$getSubredditById$3 = new RedditDevPlatformRepository$getSubredditById$2((Object)this.a);
            redditDevPlatformRepository$getSubredditById$2.label = 1;
            if ((o = this.b((j80.a<Object>)c2, s, (zg2.p<? super String, ? super tg2.c<? super kotlin.Result<?>>, ?>)redditDevPlatformRepository$getSubredditById$3, (tg2.c<? super kotlin.Result<?>>)redditDevPlatformRepository$getSubredditById$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return o;
    }
}
