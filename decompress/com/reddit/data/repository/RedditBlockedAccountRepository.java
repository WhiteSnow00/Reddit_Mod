// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import g60.d1;
import sf2.g;
import sf2.o;
import a4.u1;
import java.util.concurrent.CancellationException;
import nf2.c0;
import kotlinx.coroutines.rx2.d;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.BlockedAccountSearchResult;
import zg2.p;
import wi.b;
import com.reddit.domain.model.BlockedAccount;
import com.reddit.domain.model.Page;
import javax.inject.Inject;
import ah2.f;
import io.reactivex.subjects.PublishSubject;
import com.reddit.session.q;
import r20.c;
import c50.q0;
import com.reddit.data.remote.RemoteGqlBlockedAccountDataSource;
import com.reddit.data.remote.RemoteAccountDataSource;
import r20.a;
import ge0.e;

public final class RedditBlockedAccountRepository implements e
{
    public final a a;
    public final RemoteAccountDataSource b;
    public final RemoteGqlBlockedAccountDataSource c;
    public final q0 d;
    public final c e;
    public final db0.e f;
    public final q g;
    public PublishSubject<String> h;
    public boolean i;
    
    @Inject
    public RedditBlockedAccountRepository(final a a, final RemoteAccountDataSource b, final RemoteGqlBlockedAccountDataSource c, final q0 d, final c e, final db0.e f, final q g) {
        ah2.f.f((Object)a, "backgroundThread");
        ah2.f.f((Object)b, "remote");
        ah2.f.f((Object)c, "remoteGql");
        ah2.f.f((Object)d, "localBlockedAccountDataSource");
        ah2.f.f((Object)e, "postExecutionThread");
        ah2.f.f((Object)f, "consumerSafetyFeatures");
        ah2.f.f((Object)g, "sessionManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final PublishSubject create = PublishSubject.create();
        ah2.f.e((Object)create, "create<KindWithId>()");
        this.h = (PublishSubject<String>)create;
    }
    
    public final PublishSubject a() {
        return this.h;
    }
    
    public final Object b(final String s, final tg2.c c) {
        return this.c.a(s, 50, (tg2.c<? super Page<BlockedAccount>>)c);
    }
    
    public final nf2.a blockUser(final String s) {
        ah2.f.f((Object)s, "userKindWithId");
        return wi.b.a0((p)new RedditBlockedAccountRepository$setUserBlockedState$1(this, s, true, (tg2.c)null));
    }
    
    public final nf2.a c(final String s) {
        ah2.f.f((Object)s, "userKindWithId");
        return wi.b.a0((p)new RedditBlockedAccountRepository$setUserBlockedState$1(this, s, false, (tg2.c)null));
    }
    
    public final Object d(final String s, final tg2.c<? super BlockedAccountSearchResult> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1) {
                final RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1 redditBlockedAccountRepository$searchUserToBlock$1 = (RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)c;
                final int label = redditBlockedAccountRepository$searchUserToBlock$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditBlockedAccountRepository$searchUserToBlock$1.label = label + Integer.MIN_VALUE;
                    o = redditBlockedAccountRepository$searchUserToBlock$1;
                    break Label_0050;
                }
            }
            o = new RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1(this, (tg2.c)c);
        }
        Object o2 = ((RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)o).label;
        final Object o3 = null;
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
                    final BlockedAccount blockedAccount = (BlockedAccount)((RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)o).L$1;
                    BlockedAccount blockedAccount2 = (BlockedAccount)((RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)o).L$0;
                    try {
                        aj2.c.Q0(o2);
                        BlockedAccount blockedAccount3 = blockedAccount;
                    Label_0178:
                        while (true) {
                            while (true) {
                                while (true) {
                                    final boolean contains = ((Set)o2).contains(blockedAccount2.getId());
                                    final Object o4 = new(com.reddit.domain.model.BlockedAccountSearchResult.class)();
                                    if (!contains) {
                                        b = false;
                                    }
                                    new BlockedAccountSearchResult(blockedAccount3, b);
                                    Label_0271: {
                                        return o4;
                                    }
                                    final RedditBlockedAccountRepository redditBlockedAccountRepository;
                                    final c0<Set<String>> e = redditBlockedAccountRepository.e();
                                    final BlockedAccount blockedAccount4;
                                    ((RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)o).L$0 = blockedAccount4;
                                    ((RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)o).L$1 = blockedAccount4;
                                    ((RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)o).label = 2;
                                    o2 = kotlinx.coroutines.rx2.d.b((c0)e, (tg2.c)o);
                                    iftrue(Label_0229:)(o2 != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    Label_0229:
                                    blockedAccount2 = (blockedAccount3 = blockedAccount4);
                                    continue;
                                }
                                Label_0176: {
                                    final RedditBlockedAccountRepository redditBlockedAccountRepository = this;
                                }
                                break Label_0178;
                                aj2.c.Q0(o2);
                                final RemoteGqlBlockedAccountDataSource c2 = this.c;
                                ((RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)o).L$0 = this;
                                ((RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)o).label = 1;
                                o2 = c2.b(s, (tg2.c<? super BlockedAccount>)o);
                                iftrue(Label_0176:)(o2 != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                final BlockedAccount blockedAccount4 = (BlockedAccount)o2;
                                final Object o4 = o3;
                                iftrue(Label_0271:)(blockedAccount4 == null);
                                continue;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            final RedditBlockedAccountRepository redditBlockedAccountRepository = (RedditBlockedAccountRepository)((RedditBlockedAccountRepository$searchUserToBlock.RedditBlockedAccountRepository$searchUserToBlock$1)o).L$0;
                            aj2.c.Q0(o2);
                            continue Label_0178;
                        }
                    }
                    catch (final CancellationException ex) {
                        return o3;
                    }
                }
            }
        }
    }
    
    public final c0<Set<String>> e() {
        final c0 v = c0.v((Object)this.i);
        ah2.f.e((Object)v, "just(blockedUsersFetched)");
        final c0 p = u1.j1(v, (r20.d)this.e).p((o)new g60.p(this, 1));
        ah2.f.e((Object)p, "just(blockedUsersFetched\u2026d to it.toSet() }\n      }");
        final c0 w = u1.H0(p, (r20.d)this.e).n((g)new l(this, 2)).w((o)new d1(2));
        ah2.f.e((Object)w, "just(blockedUsersFetched\u2026dUsers) -> blockedUsers }");
        return (c0<Set<String>>)w;
    }
    
    public final Object f(final String s, final tg2.c<? super Boolean> c) {
        RedditBlockedAccountRepository$coBlockUser.RedditBlockedAccountRepository$coBlockUser$1 redditBlockedAccountRepository$coBlockUser$2 = null;
        Label_0050: {
            if (c instanceof RedditBlockedAccountRepository$coBlockUser.RedditBlockedAccountRepository$coBlockUser$1) {
                final RedditBlockedAccountRepository$coBlockUser.RedditBlockedAccountRepository$coBlockUser$1 redditBlockedAccountRepository$coBlockUser$1 = (RedditBlockedAccountRepository$coBlockUser.RedditBlockedAccountRepository$coBlockUser$1)c;
                final int label = redditBlockedAccountRepository$coBlockUser$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditBlockedAccountRepository$coBlockUser$1.label = label + Integer.MIN_VALUE;
                    redditBlockedAccountRepository$coBlockUser$2 = redditBlockedAccountRepository$coBlockUser$1;
                    break Label_0050;
                }
            }
            redditBlockedAccountRepository$coBlockUser$2 = new RedditBlockedAccountRepository$coBlockUser.RedditBlockedAccountRepository$coBlockUser$1(this, (tg2.c)c);
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
                    aj2.c.Q0(result);
                    return b;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    aj2.c.Q0(result);
                    final nf2.a a0 = wi.b.a0((p)new RedditBlockedAccountRepository$setUserBlockedState$1(this, s, true, (tg2.c)null));
                    redditBlockedAccountRepository$coBlockUser$2.label = 1;
                    iftrue(Label_0145:)(kotlinx.coroutines.rx2.d.a(a0, (tg2.c)redditBlockedAccountRepository$coBlockUser$2) != coroutine_SUSPENDED);
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
}
