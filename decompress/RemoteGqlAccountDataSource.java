// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.y4$d;
import com.reddit.mutations.y4$c;
import com.reddit.mutations.y4$e;
import com.reddit.mutations.y4$b;
import com.reddit.mutations.y4;
import com.reddit.type.ReorderSocialLinksInput;
import com.reddit.domain.model.SocialLinkReOrderResponse;
import sf2.o;
import com.reddit.queries.l9;
import nf2.c0;
import com.reddit.domain.model.Account;
import java.util.Iterator;
import com.reddit.mutations.n2$c;
import com.reddit.mutations.n2$d;
import kotlin.collections.EmptyList;
import com.reddit.mutations.n2$e;
import java.util.ArrayList;
import qg2.m;
import com.reddit.mutations.n2$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.n2;
import com.reddit.type.DeleteSocialLinksInput;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.SocialLinkDeleteResponse;
import ge0.g0;
import tg2.c;
import java.util.List;
import com.reddit.data.model.GqlRedditorProfileToAccountDomainModelMapperKt;
import com.reddit.domain.model.sociallink.SocialLink;
import kl0.h00;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class RemoteGqlAccountDataSource
{
    public final g a;
    
    @Inject
    public RemoteGqlAccountDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public static SocialLink d(final h00 h00, final int n) {
        return new SocialLink(h00.b, h00.f.toString(), n + 1, h00.d, h00.e, GqlRedditorProfileToAccountDomainModelMapperKt.toSocialLinkType(h00.c));
    }
    
    public final Object a(final List<String> list, final c<? super g0<SocialLinkDeleteResponse>> c) {
        RemoteGqlAccountDataSource$deleteSocialLinksSuspend.RemoteGqlAccountDataSource$deleteSocialLinksSuspend$1 remoteGqlAccountDataSource$deleteSocialLinksSuspend$2 = null;
        Label_0050: {
            if (c instanceof RemoteGqlAccountDataSource$deleteSocialLinksSuspend.RemoteGqlAccountDataSource$deleteSocialLinksSuspend$1) {
                final RemoteGqlAccountDataSource$deleteSocialLinksSuspend.RemoteGqlAccountDataSource$deleteSocialLinksSuspend$1 remoteGqlAccountDataSource$deleteSocialLinksSuspend$1 = (RemoteGqlAccountDataSource$deleteSocialLinksSuspend.RemoteGqlAccountDataSource$deleteSocialLinksSuspend$1)c;
                final int label = remoteGqlAccountDataSource$deleteSocialLinksSuspend$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlAccountDataSource$deleteSocialLinksSuspend$1.label = label + Integer.MIN_VALUE;
                    remoteGqlAccountDataSource$deleteSocialLinksSuspend$2 = remoteGqlAccountDataSource$deleteSocialLinksSuspend$1;
                    break Label_0050;
                }
            }
            remoteGqlAccountDataSource$deleteSocialLinksSuspend$2 = new RemoteGqlAccountDataSource$deleteSocialLinksSuspend.RemoteGqlAccountDataSource$deleteSocialLinksSuspend$1(this, (c)c);
        }
        final Object result = remoteGqlAccountDataSource$deleteSocialLinksSuspend$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlAccountDataSource$deleteSocialLinksSuspend$2.label;
        RemoteGqlAccountDataSource remoteGqlAccountDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlAccountDataSource = (RemoteGqlAccountDataSource)remoteGqlAccountDataSource$deleteSocialLinksSuspend$2.L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final DeleteSocialLinksInput deleteSocialLinksInput = new DeleteSocialLinksInput((List)list);
            final g a = this.a;
            final n2 n2 = new n2(deleteSocialLinksInput);
            remoteGqlAccountDataSource$deleteSocialLinksSuspend$2.L$0 = this;
            remoteGqlAccountDataSource$deleteSocialLinksSuspend$2.label = 1;
            b = e$a.b(14, (k)n2, (e)a, (RetryAlgo)null, (Map)null, (c)remoteGqlAccountDataSource$deleteSocialLinksSuspend$2, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlAccountDataSource = this;
        }
        final n2$c a2 = ((n2$b)b).a;
        boolean b2 = false;
        final ArrayList list2 = null;
        Object instance = null;
        Label_0288: {
            if (a2 != null) {
                final List d = a2.d;
                if (d != null) {
                    final ArrayList list3 = new ArrayList<SocialLink>(m.P0((Iterable)d, 10));
                    final Iterator iterator = d.iterator();
                    int n3 = 0;
                    while (true) {
                        instance = list3;
                        if (!iterator.hasNext()) {
                            break Label_0288;
                        }
                        final Object next = iterator.next();
                        if (n3 < 0) {
                            ah2.c.x0();
                            throw null;
                        }
                        final h00 a3 = ((n2$e)next).b.a;
                        remoteGqlAccountDataSource.getClass();
                        list3.add((Object)d(a3, n3));
                        ++n3;
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        if (a2 != null) {
            b2 = a2.b;
        }
        final SocialLinkDeleteResponse socialLinkDeleteResponse = new SocialLinkDeleteResponse(b2, (List)instance);
        ArrayList list4 = list2;
        if (a2 != null) {
            final List c2 = a2.c;
            list4 = list2;
            if (c2 != null) {
                final ArrayList list5 = new ArrayList<String>(m.P0((Iterable)c2, 10));
                final Iterator iterator2 = c2.iterator();
                while (true) {
                    list4 = list5;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    list5.add((Object)((n2$d)iterator2.next()).b);
                }
            }
        }
        return new g0((Object)socialLinkDeleteResponse, list4);
    }
    
    public final c0<Account> b(final Account account, final boolean b) {
        f.f((Object)account, "account");
        final c0 w = e$a.a((e)this.a, (k)new l9(account.getUsername()), (OkHttpClient)null, (Map)null, 14).w((o)new com.reddit.data.chat.datasource.remote.f(account, b));
        f.e((Object)w, "graphQlClient.execute(op\u2026mmunityHubsEnabled)\n    }");
        return (c0<Account>)w;
    }
    
    public final Object c(final List<String> list, final c<? super g0<SocialLinkReOrderResponse>> c) {
        RemoteGqlAccountDataSource$reorderSocialLinksSuspend.RemoteGqlAccountDataSource$reorderSocialLinksSuspend$1 remoteGqlAccountDataSource$reorderSocialLinksSuspend$2 = null;
        Label_0050: {
            if (c instanceof RemoteGqlAccountDataSource$reorderSocialLinksSuspend.RemoteGqlAccountDataSource$reorderSocialLinksSuspend$1) {
                final RemoteGqlAccountDataSource$reorderSocialLinksSuspend.RemoteGqlAccountDataSource$reorderSocialLinksSuspend$1 remoteGqlAccountDataSource$reorderSocialLinksSuspend$1 = (RemoteGqlAccountDataSource$reorderSocialLinksSuspend.RemoteGqlAccountDataSource$reorderSocialLinksSuspend$1)c;
                final int label = remoteGqlAccountDataSource$reorderSocialLinksSuspend$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlAccountDataSource$reorderSocialLinksSuspend$1.label = label + Integer.MIN_VALUE;
                    remoteGqlAccountDataSource$reorderSocialLinksSuspend$2 = remoteGqlAccountDataSource$reorderSocialLinksSuspend$1;
                    break Label_0050;
                }
            }
            remoteGqlAccountDataSource$reorderSocialLinksSuspend$2 = new RemoteGqlAccountDataSource$reorderSocialLinksSuspend.RemoteGqlAccountDataSource$reorderSocialLinksSuspend$1(this, (c)c);
        }
        final Object result = remoteGqlAccountDataSource$reorderSocialLinksSuspend$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlAccountDataSource$reorderSocialLinksSuspend$2.label;
        RemoteGqlAccountDataSource remoteGqlAccountDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlAccountDataSource = (RemoteGqlAccountDataSource)remoteGqlAccountDataSource$reorderSocialLinksSuspend$2.L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final y4 y4 = new y4(new ReorderSocialLinksInput((List)list));
            final g a = this.a;
            remoteGqlAccountDataSource$reorderSocialLinksSuspend$2.L$0 = this;
            remoteGqlAccountDataSource$reorderSocialLinksSuspend$2.label = 1;
            b = e$a.b(14, (k)y4, (e)a, (RetryAlgo)null, (Map)null, (c)remoteGqlAccountDataSource$reorderSocialLinksSuspend$2, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlAccountDataSource = this;
        }
        final y4$d a2 = ((y4$b)b).a;
        boolean b2 = false;
        final ArrayList list2 = null;
        Object instance = null;
        Label_0286: {
            if (a2 != null) {
                final List d = a2.d;
                if (d != null) {
                    final ArrayList list3 = new ArrayList<SocialLink>(m.P0((Iterable)d, 10));
                    final Iterator iterator = d.iterator();
                    int n = 0;
                    while (true) {
                        instance = list3;
                        if (!iterator.hasNext()) {
                            break Label_0286;
                        }
                        final Object next = iterator.next();
                        if (n < 0) {
                            ah2.c.x0();
                            throw null;
                        }
                        final h00 a3 = ((y4$e)next).b.a;
                        remoteGqlAccountDataSource.getClass();
                        list3.add((Object)d(a3, n));
                        ++n;
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        if (a2 != null) {
            b2 = a2.b;
        }
        final SocialLinkReOrderResponse socialLinkReOrderResponse = new SocialLinkReOrderResponse(b2, (List)instance);
        ArrayList list4 = list2;
        if (a2 != null) {
            final List c2 = a2.c;
            list4 = list2;
            if (c2 != null) {
                final ArrayList list5 = new ArrayList<String>(m.P0((Iterable)c2, 10));
                final Iterator iterator2 = c2.iterator();
                while (true) {
                    list4 = list5;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    list5.add((Object)((y4$c)iterator2.next()).b);
                }
            }
        }
        return new g0((Object)socialLinkReOrderResponse, list4);
    }
}
