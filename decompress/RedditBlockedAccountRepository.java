// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import z50.r;
import kf2.g;
import java.util.concurrent.CancellationException;
import ff2.c0;
import java.util.Set;
import yd.b;
import com.reddit.domain.model.BlockedAccount;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.BlockedAccountSearchResult;
import rg2.p;
import javax.inject.Inject;
import sg2.e;
import io.reactivex.subjects.PublishSubject;
import com.reddit.session.o;
import n20.c;
import v40.o0;
import com.reddit.data.remote.RemoteGqlBlockedAccountDataSource;
import com.reddit.data.remote.RemoteAccountDataSource;
import n20.a;
import xd0.d;

public final class RedditBlockedAccountRepository implements d
{
    public final a a;
    public final RemoteAccountDataSource b;
    public final RemoteGqlBlockedAccountDataSource c;
    public final o0 d;
    public final c e;
    public final va0.d f;
    public final o g;
    public PublishSubject<String> h;
    public boolean i;
    
    @Inject
    public RedditBlockedAccountRepository(final a a, final RemoteAccountDataSource b, final RemoteGqlBlockedAccountDataSource c, final o0 d, final c e, final va0.d f, final o g) {
        sg2.e.f((Object)a, "backgroundThread");
        sg2.e.f((Object)b, "remote");
        sg2.e.f((Object)c, "remoteGql");
        sg2.e.f((Object)d, "localBlockedAccountDataSource");
        sg2.e.f((Object)e, "postExecutionThread");
        sg2.e.f((Object)f, "consumerSafetyFeatures");
        sg2.e.f((Object)g, "sessionManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final PublishSubject<Object> create = (PublishSubject<Object>)PublishSubject.create();
        sg2.e.e((Object)create, "create<KindWithId>()");
        this.h = (PublishSubject<String>)create;
    }
    
    public final Object a(final String s, final lg2.c c) {
        return this.c.a(s, 50, c);
    }
    
    public final PublishSubject b() {
        return this.h;
    }
    
    public final ff2.a blockUser(final String s) {
        sg2.e.f((Object)s, "userKindWithId");
        return yg.a.z1((p)new RedditBlockedAccountRepository$setUserBlockedState$1(this, s, true, (lg2.c)null));
    }
    
    public final Object c(final String s, final lg2.c<? super BlockedAccountSearchResult> c) {
        RedditBlockedAccountRepository$searchUserToBlock$1 redditBlockedAccountRepository$searchUserToBlock$2 = null;
        Label_0050: {
            if (c instanceof RedditBlockedAccountRepository$searchUserToBlock$1) {
                final RedditBlockedAccountRepository$searchUserToBlock$1 redditBlockedAccountRepository$searchUserToBlock$1 = (RedditBlockedAccountRepository$searchUserToBlock$1)c;
                final int label = redditBlockedAccountRepository$searchUserToBlock$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditBlockedAccountRepository$searchUserToBlock$1.label = label + Integer.MIN_VALUE;
                    redditBlockedAccountRepository$searchUserToBlock$2 = redditBlockedAccountRepository$searchUserToBlock$1;
                    break Label_0050;
                }
            }
            redditBlockedAccountRepository$searchUserToBlock$2 = new RedditBlockedAccountRepository$searchUserToBlock$1(this, (lg2.c)c);
        }
        Object o = redditBlockedAccountRepository$searchUserToBlock$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditBlockedAccountRepository$searchUserToBlock$2.label;
        final Object o2 = null;
        boolean b = true;
        Label_0141: {
            if (label2 == 0) {
                break Label_0141;
            }
            Label_0126: {
                if (label2 == 1) {
                    break Label_0126;
                }
                Label_0116: {
                    if (label2 != 2) {
                        break Label_0116;
                    }
                    final BlockedAccount blockedAccount = (BlockedAccount)redditBlockedAccountRepository$searchUserToBlock$2.L$1;
                    BlockedAccount blockedAccount2 = (BlockedAccount)redditBlockedAccountRepository$searchUserToBlock$2.L$0;
                    try {
                        yd.b.k0(o);
                        BlockedAccount blockedAccount3 = blockedAccount;
                        while (true) {
                            final boolean contains = ((Set)o).contains(blockedAccount2.getId());
                            final Object o3 = new(com.reddit.domain.model.BlockedAccountSearchResult.class)();
                            if (!contains) {
                                b = false;
                            }
                            new BlockedAccountSearchResult(blockedAccount3, b);
                            Label_0271: {
                                return o3;
                            }
                            final BlockedAccount blockedAccount4;
                            Label_0229:
                            blockedAccount2 = (blockedAccount3 = blockedAccount4);
                            continue;
                        }
                        RedditBlockedAccountRepository redditBlockedAccountRepository = (RedditBlockedAccountRepository)redditBlockedAccountRepository$searchUserToBlock$2.L$0;
                        yd.b.k0(o);
                        while (true) {
                            Label_0178: {
                                break Label_0178;
                                final c0<Set<String>> f = redditBlockedAccountRepository.f();
                                final BlockedAccount blockedAccount4;
                                redditBlockedAccountRepository$searchUserToBlock$2.L$0 = blockedAccount4;
                                redditBlockedAccountRepository$searchUserToBlock$2.L$1 = blockedAccount4;
                                redditBlockedAccountRepository$searchUserToBlock$2.label = 2;
                                o = kotlinx.coroutines.rx2.d.b((c0)f, (lg2.c)redditBlockedAccountRepository$searchUserToBlock$2);
                                iftrue(Label_0229:)(o != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                yd.b.k0(o);
                                final RemoteGqlBlockedAccountDataSource c2 = this.c;
                                redditBlockedAccountRepository$searchUserToBlock$2.L$0 = this;
                                redditBlockedAccountRepository$searchUserToBlock$2.label = 1;
                                o = c2.b(s, (lg2.c)redditBlockedAccountRepository$searchUserToBlock$2);
                                iftrue(Label_0176:)(o != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                Label_0176: {
                                    redditBlockedAccountRepository = this;
                                }
                                break Label_0178;
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            final BlockedAccount blockedAccount4 = (BlockedAccount)o;
                            final Object o3 = o2;
                            iftrue(Label_0271:)(blockedAccount4 == null);
                            continue;
                        }
                    }
                    catch (final CancellationException ex) {
                        return o2;
                    }
                }
            }
        }
    }
    
    public final Object d(final String s, final lg2.c<? super Boolean> c) {
        RedditBlockedAccountRepository$coBlockUser$1 redditBlockedAccountRepository$coBlockUser$2 = null;
        Label_0050: {
            if (c instanceof RedditBlockedAccountRepository$coBlockUser$1) {
                final RedditBlockedAccountRepository$coBlockUser$1 redditBlockedAccountRepository$coBlockUser$1 = (RedditBlockedAccountRepository$coBlockUser$1)c;
                final int label = redditBlockedAccountRepository$coBlockUser$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditBlockedAccountRepository$coBlockUser$1.label = label + Integer.MIN_VALUE;
                    redditBlockedAccountRepository$coBlockUser$2 = redditBlockedAccountRepository$coBlockUser$1;
                    break Label_0050;
                }
            }
            redditBlockedAccountRepository$coBlockUser$2 = new RedditBlockedAccountRepository$coBlockUser$1(this, (lg2.c)c);
        }
        final Object result = redditBlockedAccountRepository$coBlockUser$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditBlockedAccountRepository$coBlockUser$2.label;
        boolean b = false;
        Label_0098: {
            if (label2 == 0) {
                break Label_0098;
            }
            Label_0088: {
                if (label2 != 1) {
                    break Label_0088;
                }
                try {
                    yd.b.k0(result);
                    return b;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    yd.b.k0(result);
                    final ff2.a z1 = yg.a.z1((p)new RedditBlockedAccountRepository$setUserBlockedState$1(this, s, true, (lg2.c)null));
                    redditBlockedAccountRepository$coBlockUser$2.label = 1;
                    iftrue(Label_0145:)(kotlinx.coroutines.rx2.d.a(z1, (lg2.c)redditBlockedAccountRepository$coBlockUser$2) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                finally {
                    b = false;
                }
            }
        }
        Label_0145: {
            return b;
        }
    }
    
    public final ff2.a e(final String s) {
        sg2.e.f((Object)s, "userKindWithId");
        return yg.a.z1((p)new RedditBlockedAccountRepository$setUserBlockedState$1(this, s, false, (lg2.c)null));
    }
    
    public final c0<Set<String>> f() {
        final c0<Boolean> v = c0.v(this.i);
        sg2.e.e((Object)v, "just(blockedUsersFetched)");
        final c0 p = nn0.a.V((c0)v, (n20.d)this.e).p((kf2.o)new z50.o((Object)this, 1));
        sg2.e.e((Object)p, "just(blockedUsersFetched\u2026d to it.toSet() }\n      }");
        final c0 w = nn0.a.I((c0)p, (n20.d)this.e).n((g)new s(this, 1)).w((kf2.o)new r(0));
        sg2.e.e((Object)w, "just(blockedUsersFetched\u2026dUsers) -> blockedUsers }");
        return w;
    }
}
