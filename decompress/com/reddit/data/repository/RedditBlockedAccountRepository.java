// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.concurrent.CancellationException;
import com.reddit.domain.model.BlockedAccount;
import com.reddit.domain.model.BlockedAccountSearchResult;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import b60.n0;
import ff2.g;
import b60.s;
import ff2.o;
import java.util.Set;
import af2.c0;
import mg2.p;
import javax.inject.Inject;
import ng2.e;
import io.reactivex.subjects.PublishSubject;
import com.reddit.session.n;
import q20.c;
import x40.m0;
import com.reddit.data.remote.RemoteGqlBlockedAccountDataSource;
import com.reddit.data.remote.RemoteAccountDataSource;
import q20.a;
import xd0.d;

public final class RedditBlockedAccountRepository implements d
{
    public final a a;
    public final RemoteAccountDataSource b;
    public final RemoteGqlBlockedAccountDataSource c;
    public final m0 d;
    public final c e;
    public final wa0.d f;
    public final n g;
    public PublishSubject<String> h;
    public boolean i;
    
    @Inject
    public RedditBlockedAccountRepository(final a a, final RemoteAccountDataSource b, final RemoteGqlBlockedAccountDataSource c, final m0 d, final c e, final wa0.d f, final n g) {
        ng2.e.f((Object)a, "backgroundThread");
        ng2.e.f((Object)b, "remote");
        ng2.e.f((Object)c, "remoteGql");
        ng2.e.f((Object)d, "localBlockedAccountDataSource");
        ng2.e.f((Object)e, "postExecutionThread");
        ng2.e.f((Object)f, "consumerSafetyFeatures");
        ng2.e.f((Object)g, "sessionManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final PublishSubject create = PublishSubject.create();
        ng2.e.e((Object)create, "create<KindWithId>()");
        this.h = (PublishSubject<String>)create;
    }
    
    @Override
    public final PublishSubject a() {
        return this.h;
    }
    
    @Override
    public final Object b(final String s, final gg2.c c) {
        return this.c.a(s, 50, c);
    }
    
    @Override
    public final af2.a blockUser(final String s) {
        ng2.e.f((Object)s, "userKindWithId");
        return xd.a.k1((p)new RedditBlockedAccountRepository$setUserBlockedState$1(this, s, true, (gg2.c)null));
    }
    
    @Override
    public final af2.a c(final String s) {
        ng2.e.f((Object)s, "userKindWithId");
        return xd.a.k1((p)new RedditBlockedAccountRepository$setUserBlockedState$1(this, s, false, (gg2.c)null));
    }
    
    @Override
    public final c0<Set<String>> d() {
        final c0<Boolean> v = c0.v(this.i);
        ng2.e.e((Object)v, "just(blockedUsersFetched)");
        final c0 p = px1.a.K0((c0)v, (q20.d)this.e).p((o)new com.reddit.data.repository.a(this, 0));
        ng2.e.e((Object)p, "just(blockedUsersFetched\u2026d to it.toSet() }\n      }");
        final c0 w = px1.a.o0((c0)p, (q20.d)this.e).n((g)new s((Object)this, 0)).w((o)new n0(2));
        ng2.e.e((Object)w, "just(blockedUsersFetched\u2026dUsers) -> blockedUsers }");
        return w;
    }
    
    @Override
    public final Object e(final String s, final gg2.c<? super Boolean> c) {
        RedditBlockedAccountRepository$coBlockUser$1 redditBlockedAccountRepository$coBlockUser$2 = null;
        Label_0051: {
            if (c instanceof RedditBlockedAccountRepository$coBlockUser$1) {
                final RedditBlockedAccountRepository$coBlockUser$1 redditBlockedAccountRepository$coBlockUser$1 = (RedditBlockedAccountRepository$coBlockUser$1)c;
                final int label = redditBlockedAccountRepository$coBlockUser$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditBlockedAccountRepository$coBlockUser$1.label = label + Integer.MIN_VALUE;
                    redditBlockedAccountRepository$coBlockUser$2 = redditBlockedAccountRepository$coBlockUser$1;
                    break Label_0051;
                }
            }
            redditBlockedAccountRepository$coBlockUser$2 = new RedditBlockedAccountRepository$coBlockUser$1(this, (gg2.c)c);
        }
        final Object result = redditBlockedAccountRepository$coBlockUser$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditBlockedAccountRepository$coBlockUser$2.label;
        boolean b = false;
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
                    return b;
                    cg.d.b4(result);
                    final af2.a k1 = xd.a.k1((p)new RedditBlockedAccountRepository$setUserBlockedState$1(this, s, true, (gg2.c)null));
                    redditBlockedAccountRepository$coBlockUser$2.label = 1;
                    iftrue(Label_0146:)(kotlinx.coroutines.rx2.d.a(k1, (gg2.c)redditBlockedAccountRepository$coBlockUser$2) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finally {
                    b = false;
                }
            }
        }
        Label_0146: {
            return b;
        }
    }
    
    @Override
    public final Object f(final String s, final gg2.c<? super BlockedAccountSearchResult> c) {
        RedditBlockedAccountRepository$searchUserToBlock$1 redditBlockedAccountRepository$searchUserToBlock$2 = null;
        Label_0051: {
            if (c instanceof RedditBlockedAccountRepository$searchUserToBlock$1) {
                final RedditBlockedAccountRepository$searchUserToBlock$1 redditBlockedAccountRepository$searchUserToBlock$1 = (RedditBlockedAccountRepository$searchUserToBlock$1)c;
                final int label = redditBlockedAccountRepository$searchUserToBlock$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditBlockedAccountRepository$searchUserToBlock$1.label = label + Integer.MIN_VALUE;
                    redditBlockedAccountRepository$searchUserToBlock$2 = redditBlockedAccountRepository$searchUserToBlock$1;
                    break Label_0051;
                }
            }
            redditBlockedAccountRepository$searchUserToBlock$2 = new RedditBlockedAccountRepository$searchUserToBlock$1(this, (gg2.c)c);
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
            Label_0125: {
                if (label2 == 1) {
                    break Label_0125;
                }
                Label_0115: {
                    if (label2 != 2) {
                        break Label_0115;
                    }
                    final BlockedAccount blockedAccount = (BlockedAccount)redditBlockedAccountRepository$searchUserToBlock$2.L$1;
                    BlockedAccount blockedAccount2 = (BlockedAccount)redditBlockedAccountRepository$searchUserToBlock$2.L$0;
                    try {
                        cg.d.b4(o);
                        BlockedAccount blockedAccount3 = blockedAccount;
                        BlockedAccount blockedAccount4 = null;
                        while (true) {
                            final boolean contains = ((Set)o).contains(blockedAccount2.getId());
                            final Object o3 = new(com.reddit.domain.model.BlockedAccountSearchResult.class)();
                            if (!contains) {
                                b = false;
                            }
                            new BlockedAccountSearchResult(blockedAccount3, b);
                            Label_0283: {
                                return o3;
                            }
                            Label_0238:
                            blockedAccount2 = (blockedAccount3 = blockedAccount4);
                            continue;
                        }
                        while (true) {
                            while (true) {
                                final RedditBlockedAccountRepository redditBlockedAccountRepository;
                                final c0<Set<String>> d = redditBlockedAccountRepository.d();
                                redditBlockedAccountRepository$searchUserToBlock$2.L$0 = blockedAccount4;
                                redditBlockedAccountRepository$searchUserToBlock$2.L$1 = blockedAccount4;
                                redditBlockedAccountRepository$searchUserToBlock$2.label = 2;
                                o = kotlinx.coroutines.rx2.d.b(d, (gg2.c)redditBlockedAccountRepository$searchUserToBlock$2);
                                iftrue(Label_0238:)(o != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                cg.d.b4(o);
                                final RemoteGqlBlockedAccountDataSource c2 = this.c;
                                redditBlockedAccountRepository$searchUserToBlock$2.L$0 = this;
                                redditBlockedAccountRepository$searchUserToBlock$2.label = 1;
                                o = c2.b(s, (gg2.c)redditBlockedAccountRepository$searchUserToBlock$2);
                                iftrue(Label_0181:)(o != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                blockedAccount4 = (BlockedAccount)o;
                                final Object o3 = o2;
                                iftrue(Label_0283:)(blockedAccount4 == null);
                                continue;
                            }
                            RedditBlockedAccountRepository redditBlockedAccountRepository = (RedditBlockedAccountRepository)redditBlockedAccountRepository$searchUserToBlock$2.L$0;
                            cg.d.b4(o);
                            continue;
                            Label_0181: {
                                redditBlockedAccountRepository = this;
                            }
                            continue;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catch (final CancellationException ex) {
                        return o2;
                    }
                }
            }
        }
    }
}
