// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import com.reddit.vault.model.MetaNomenclature;
import java.math.BigInteger;
import java.util.Collection;
import com.reddit.vault.model.SpecialMemberships;
import com.reddit.vault.model.VaultContract;
import com.reddit.vault.model.VaultContracts;
import com.reddit.vault.model.VaultProviderExtra;
import java.util.Iterator;
import java.util.Date;
import com.reddit.vault.model.ActiveSpecialMembership;
import com.reddit.vault.model.CommunityProductResponse;
import java.util.Map;
import com.reddit.vault.model.CommunityBillingInfoResponse;
import mj2.a;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import ej2.j0;
import com.reddit.vault.model.SubredditStructuredStyleResponse;
import nu2.w;
import cj2.j;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import javax.inject.Inject;
import com.reddit.vault.data.local.LocalCommunitiesDataSource$allCommunities$$inlined$map$1;
import sg2.e;
import x82.i;
import x82.k;
import com.reddit.vault.model.VaultInfoResponse;
import java.util.concurrent.ConcurrentHashMap;
import ej2.e0;
import com.reddit.vault.data.local.LocalCommunitiesDataSource$allCommunities$$inlined$map$2;
import com.reddit.vault.data.remote.RemoteRedditDataSource;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import com.reddit.vault.data.local.LocalCommunitiesDataSource;
import y82.c;

public final class CommunitiesRepositoryImpl implements c
{
    public final LocalCommunitiesDataSource a;
    public final RemoteVaultDataSource b;
    public final RemoteRedditDataSource c;
    public final LocalCommunitiesDataSource$allCommunities$$inlined$map$2 d;
    public final Object e;
    public e0<Boolean> f;
    public boolean g;
    public final ConcurrentHashMap<String, VaultInfoResponse> h;
    public ConcurrentHashMap<String, k> i;
    public final ConcurrentHashMap<String, i> j;
    
    @Inject
    public CommunitiesRepositoryImpl(final LocalCommunitiesDataSource a, final RemoteVaultDataSource b, final RemoteRedditDataSource c) {
        sg2.e.f((Object)a, "localCommunitiesDataSource");
        sg2.e.f((Object)b, "remoteVaultDataSource");
        sg2.e.f((Object)c, "remoteRedditDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new LocalCommunitiesDataSource$allCommunities$$inlined$map$2(new LocalCommunitiesDataSource$allCommunities$$inlined$map$1((hj2.e)a.a.t().d()));
        this.e = new Object();
        this.h = new ConcurrentHashMap<String, VaultInfoResponse>();
        this.i = new ConcurrentHashMap<String, k>();
        this.j = new ConcurrentHashMap<String, i>();
    }
    
    @Override
    public final Object a(String l$1, lg2.c<? super k> substring) {
        CommunitiesRepositoryImpl$getCommunityStructuredStyles$1 communitiesRepositoryImpl$getCommunityStructuredStyles$1 = null;
        Label_0048: {
            if (substring instanceof CommunitiesRepositoryImpl$getCommunityStructuredStyles$1) {
                communitiesRepositoryImpl$getCommunityStructuredStyles$1 = (CommunitiesRepositoryImpl$getCommunityStructuredStyles$1)substring;
                final int label = communitiesRepositoryImpl$getCommunityStructuredStyles$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    communitiesRepositoryImpl$getCommunityStructuredStyles$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            communitiesRepositoryImpl$getCommunityStructuredStyles$1 = new CommunitiesRepositoryImpl$getCommunityStructuredStyles$1(this, (lg2.c)substring);
        }
        Object o = communitiesRepositoryImpl$getCommunityStructuredStyles$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = communitiesRepositoryImpl$getCommunityStructuredStyles$1.label;
        final Object o2 = null;
        CommunitiesRepositoryImpl communitiesRepositoryImpl = null;
        Label_0431: {
            CommunitiesRepositoryImpl l$2 = null;
            Label_0388: {
                CommunitiesRepositoryImpl l$3 = null;
                Object o3 = null;
                Label_0313: {
                    Label_0278: {
                        if (label2 != 0) {
                            if (label2 != 1) {
                                if (label2 == 2) {
                                    l$1 = communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$1;
                                    l$2 = (CommunitiesRepositoryImpl)communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$0;
                                    yd.b.k0(o);
                                    break Label_0388;
                                }
                                if (label2 == 3) {
                                    l$1 = communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$1;
                                    communitiesRepositoryImpl = (CommunitiesRepositoryImpl)communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$0;
                                    yd.b.k0(o);
                                    break Label_0431;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                substring = communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$1;
                                final CommunitiesRepositoryImpl communitiesRepositoryImpl2 = l$3 = (CommunitiesRepositoryImpl)communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$0;
                                final lg2.c c = (lg2.c)substring;
                                try {
                                    yd.b.k0(o);
                                    break Label_0278;
                                }
                                catch (final Exception ex) {
                                    substring = c;
                                    break Label_0278;
                                }
                            }
                        }
                        yd.b.k0(o);
                        substring = l$1;
                        if (cj2.j.O0((String)l$1, "r/", false)) {
                            substring = ((String)l$1).substring(2);
                            sg2.e.e(substring, "this as java.lang.String).substring(startIndex)");
                        }
                        if (this.i.contains(substring)) {
                            return this.i.get(substring);
                        }
                        final RemoteRedditDataSource c2 = this.c;
                        try {
                            communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$0 = this;
                            communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$1 = substring;
                            communitiesRepositoryImpl$getCommunityStructuredStyles$1.label = 1;
                            o = c2.getSubredditStructuredStyles((String)substring, (lg2.c)communitiesRepositoryImpl$getCommunityStructuredStyles$1);
                            if (o == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            final CommunitiesRepositoryImpl communitiesRepositoryImpl2 = this;
                            final Object b = ((w)o).b;
                            l$3 = communitiesRepositoryImpl2;
                            o3 = b;
                            break Label_0313;
                        }
                        catch (final Exception ex) {
                            l$3 = this;
                        }
                    }
                    final Exception ex;
                    ex.printStackTrace();
                    o3 = null;
                }
                final SubredditStructuredStyleResponse subredditStructuredStyleResponse = (SubredditStructuredStyleResponse)o3;
                l$2 = l$3;
                l$1 = substring;
                if (subredditStructuredStyleResponse != null) {
                    final a c3 = j0.c;
                    final CommunitiesRepositoryImpl$getCommunityStructuredStyles.CommunitiesRepositoryImpl$getCommunityStructuredStyles$2 communitiesRepositoryImpl$getCommunityStructuredStyles$2 = new CommunitiesRepositoryImpl$getCommunityStructuredStyles.CommunitiesRepositoryImpl$getCommunityStructuredStyles$2(l$3, (String)substring, subredditStructuredStyleResponse, (lg2.c)null);
                    communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$0 = l$3;
                    communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$1 = substring;
                    communitiesRepositoryImpl$getCommunityStructuredStyles$1.label = 2;
                    l$2 = l$3;
                    l$1 = substring;
                    if (ej2.g.l((CoroutineContext)c3, (p)communitiesRepositoryImpl$getCommunityStructuredStyles$2, (lg2.c)communitiesRepositoryImpl$getCommunityStructuredStyles$1) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
            }
            final LocalCommunitiesDataSource a = l$2.a;
            communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$0 = l$2;
            communitiesRepositoryImpl$getCommunityStructuredStyles$1.L$1 = l$1;
            communitiesRepositoryImpl$getCommunityStructuredStyles$1.label = 3;
            o = a.a((String)l$1, (lg2.c)communitiesRepositoryImpl$getCommunityStructuredStyles$1);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            communitiesRepositoryImpl = l$2;
        }
        final k k = (k)o;
        Object o4 = o2;
        if (k != null) {
            communitiesRepositoryImpl.i.put((String)l$1, k);
            o4 = k;
        }
        return o4;
    }
    
    @Override
    public final Object b(String o, final lg2.c<? super i> c) {
        Object b = o;
        CommunitiesRepositoryImpl$getCommunityMembershipInfo$1 communitiesRepositoryImpl$getCommunityMembershipInfo$1 = null;
        Label_0054: {
            if (c instanceof CommunitiesRepositoryImpl$getCommunityMembershipInfo$1) {
                communitiesRepositoryImpl$getCommunityMembershipInfo$1 = (CommunitiesRepositoryImpl$getCommunityMembershipInfo$1)c;
                final int label = communitiesRepositoryImpl$getCommunityMembershipInfo$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    communitiesRepositoryImpl$getCommunityMembershipInfo$1.label = label + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            communitiesRepositoryImpl$getCommunityMembershipInfo$1 = new CommunitiesRepositoryImpl$getCommunityMembershipInfo$1(this, (lg2.c)c);
        }
        final Object result = communitiesRepositoryImpl$getCommunityMembershipInfo$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = communitiesRepositoryImpl$getCommunityMembershipInfo$1.label;
        final Date date = null;
        CommunityBillingInfoResponse l$2 = null;
        CommunitiesRepositoryImpl communitiesRepositoryImpl2 = null;
        Object communityVaultInfo = null;
        Label_0636: {
            Object o2 = null;
            Object o4 = null;
            Object b2 = null;
            Label_0574: {
                Object communityBillingInfo = null;
                Label_0538: {
                    Label_0349: {
                        Exception ex2 = null;
                        Label_0311: {
                            if (label2 != 0) {
                                Label_0191: {
                                    if (label2 != 1) {
                                        if (label2 == 2) {
                                            o2 = communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$1;
                                            final CommunitiesRepositoryImpl communitiesRepositoryImpl = (CommunitiesRepositoryImpl)communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$0;
                                            final Object o3 = o2;
                                            final Map map = (Map)communitiesRepositoryImpl;
                                            Label_0559: {
                                                try {
                                                    yd.b.k0(result);
                                                    communityBillingInfo = result;
                                                    o4 = communitiesRepositoryImpl;
                                                    break Label_0538;
                                                }
                                                catch (final Exception ex) {
                                                    break Label_0559;
                                                }
                                                break Label_0191;
                                            }
                                            final Exception ex;
                                            ex.printStackTrace();
                                            final CommunityBillingInfoResponse communityBillingInfoResponse = null;
                                            o4 = map;
                                            o2 = o3;
                                            b2 = communityBillingInfoResponse;
                                            break Label_0574;
                                        }
                                        if (label2 == 3) {
                                            l$2 = (CommunityBillingInfoResponse)communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$2;
                                            final String s = (String)communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$1;
                                            communitiesRepositoryImpl2 = (CommunitiesRepositoryImpl)communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$0;
                                            yd.b.k0(result);
                                            communityVaultInfo = result;
                                            o = s;
                                            break Label_0636;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                }
                                o2 = communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$1;
                                final CommunitiesRepositoryImpl communitiesRepositoryImpl3 = (CommunitiesRepositoryImpl)communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$0;
                                final Object o5 = o2;
                                b = communitiesRepositoryImpl3;
                                try {
                                    yd.b.k0(result);
                                    final Object communityProducts = result;
                                    o4 = communitiesRepositoryImpl3;
                                    break Label_0311;
                                }
                                catch (final Exception ex2) {
                                    o2 = o5;
                                    o4 = b;
                                    break Label_0311;
                                }
                            }
                            yd.b.k0(result);
                            if (this.j.contains(b)) {
                                return this.j.get(b);
                            }
                            final RemoteVaultDataSource b3 = this.b;
                            try {
                                communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$0 = this;
                                communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$1 = b;
                                communitiesRepositoryImpl$getCommunityMembershipInfo$1.label = 1;
                                final Object communityProducts = b3.getCommunityProducts((String)b, (lg2.c)communitiesRepositoryImpl$getCommunityMembershipInfo$1);
                                if (communityProducts == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                o4 = this;
                                o2 = b;
                                b = o4;
                                b = ((w)communityProducts).b;
                                break Label_0349;
                            }
                            catch (final Exception ex3) {
                                o4 = this;
                                o2 = b;
                                ex2 = ex3;
                            }
                        }
                        ex2.printStackTrace();
                        b = null;
                    }
                    final Map map2 = (Map)b;
                    if (map2 == null) {
                        return null;
                    }
                    while (true) {
                        for (final Object next : map2.values()) {
                            final CommunityProductResponse communityProductResponse = (CommunityProductResponse)next;
                            if (sg2.e.a((Object)communityProductResponse.b, (Object)"membership") && sg2.e.a((Object)communityProductResponse.c, (Object)"points")) {
                                final CommunityProductResponse communityProductResponse2 = (CommunityProductResponse)next;
                                if (communityProductResponse2 == null) {
                                    return null;
                                }
                                final String a = communityProductResponse2.a;
                                if (a == null) {
                                    return null;
                                }
                                final RemoteVaultDataSource b4 = ((CommunitiesRepositoryImpl)o4).b;
                                communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$0 = o4;
                                communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$1 = o2;
                                communitiesRepositoryImpl$getCommunityMembershipInfo$1.label = 2;
                                if ((communityBillingInfo = b4.getCommunityBillingInfo((String)o2, a, (lg2.c)communitiesRepositoryImpl$getCommunityMembershipInfo$1)) == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                break Label_0538;
                            }
                        }
                        Object next = null;
                        continue;
                    }
                }
                b2 = ((w)communityBillingInfo).b;
            }
            l$2 = (CommunityBillingInfoResponse)b2;
            if (l$2 == null) {
                return null;
            }
            communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$0 = o4;
            communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$1 = o2;
            communitiesRepositoryImpl$getCommunityMembershipInfo$1.L$2 = l$2;
            communitiesRepositoryImpl$getCommunityMembershipInfo$1.label = 3;
            communityVaultInfo = ((CommunitiesRepositoryImpl)o4).getCommunityVaultInfo((String)o2, (lg2.c<? super VaultInfoResponse>)communitiesRepositoryImpl$getCommunityMembershipInfo$1);
            if (communityVaultInfo == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            final CommunitiesRepositoryImpl communitiesRepositoryImpl4 = (CommunitiesRepositoryImpl)o4;
            o = o2;
            communitiesRepositoryImpl2 = communitiesRepositoryImpl4;
        }
        final VaultInfoResponse vaultInfoResponse = (VaultInfoResponse)communityVaultInfo;
        if (vaultInfoResponse == null) {
            return null;
        }
        final VaultProviderExtra b5 = vaultInfoResponse.a.a.b;
        if (b5 != null) {
            final VaultContracts a2 = b5.a;
            if (a2 != null) {
                final VaultContract b6 = a2.b;
                if (b6 != null) {
                    final x82.a a3 = b6.a;
                    if (a3 != null) {
                        final SpecialMemberships b7 = vaultInfoResponse.b;
                        Date date2 = date;
                        Label_0862: {
                            if (b7 != null) {
                                final Map a4 = b7.a;
                                date2 = date;
                                if (a4 != null) {
                                    final Collection values = a4.values();
                                    date2 = date;
                                    if (values != null) {
                                        while (true) {
                                            for (final Object next2 : values) {
                                                if (((ActiveSpecialMembership)next2).a != null) {
                                                    final ActiveSpecialMembership activeSpecialMembership = (ActiveSpecialMembership)next2;
                                                    date2 = date;
                                                    if (activeSpecialMembership == null) {
                                                        break Label_0862;
                                                    }
                                                    final Long a5 = activeSpecialMembership.a;
                                                    date2 = date;
                                                    if (a5 != null) {
                                                        date2 = new Date(a5.longValue());
                                                    }
                                                    break Label_0862;
                                                }
                                            }
                                            Object next2 = null;
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                        final BigInteger a6 = l$2.a;
                        final MetaNomenclature a7 = vaultInfoResponse.a.b.a;
                        final i i = new i(a6, a7.c, a7.a, a3, date2);
                        communitiesRepositoryImpl2.j.put((String)o, i);
                        return i;
                    }
                }
            }
        }
        return null;
    }
    
    @Override
    public final LocalCommunitiesDataSource$allCommunities$$inlined$map$2 c() {
        return this.d;
    }
    
    @Override
    public final Object d(final lg2.c<? super Boolean> c) {
        if (this.g) {
            return Boolean.TRUE;
        }
        return ej2.g.l((CoroutineContext)j0.c, (p)new CommunitiesRepositoryImpl$ensureCommunitiesDataLoaded.CommunitiesRepositoryImpl$ensureCommunitiesDataLoaded$2(this, (lg2.c)null), (lg2.c)c);
    }
    
    @Override
    public final boolean e() {
        return this.g;
    }
    
    @Override
    public final Object getCommunityVaultInfo(String l$1, final lg2.c<? super VaultInfoResponse> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof CommunitiesRepositoryImpl$getCommunityVaultInfo$1) {
                final CommunitiesRepositoryImpl$getCommunityVaultInfo$1 communitiesRepositoryImpl$getCommunityVaultInfo$1 = (CommunitiesRepositoryImpl$getCommunityVaultInfo$1)c;
                final int label = communitiesRepositoryImpl$getCommunityVaultInfo$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    communitiesRepositoryImpl$getCommunityVaultInfo$1.label = label + Integer.MIN_VALUE;
                    o = communitiesRepositoryImpl$getCommunityVaultInfo$1;
                    break Label_0050;
                }
            }
            o = new CommunitiesRepositoryImpl$getCommunityVaultInfo$1(this, (lg2.c)c);
        }
        Object o2 = ((CommunitiesRepositoryImpl$getCommunityVaultInfo$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((CommunitiesRepositoryImpl$getCommunityVaultInfo$1)o).label;
        final Object o3 = null;
        CommunitiesRepositoryImpl communitiesRepositoryImpl = null;
        Object b2 = null;
        Label_0226: {
            CommunitiesRepositoryImpl communitiesRepositoryImpl2 = null;
            Label_0192: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        l$1 = (String)((CommunitiesRepositoryImpl$getCommunityVaultInfo$1)o).L$1;
                        communitiesRepositoryImpl = (communitiesRepositoryImpl2 = (CommunitiesRepositoryImpl)((CommunitiesRepositoryImpl$getCommunityVaultInfo$1)o).L$0);
                        final String s = l$1;
                        try {
                            yd.b.k0(o2);
                            break Label_0192;
                        }
                        catch (final Exception ex) {
                            l$1 = s;
                            break Label_0192;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yd.b.k0(o2);
                if (this.h.contains(l$1)) {
                    return this.h.get(l$1);
                }
                final RemoteVaultDataSource b = this.b;
                try {
                    ((CommunitiesRepositoryImpl$getCommunityVaultInfo$1)o).L$0 = this;
                    ((CommunitiesRepositoryImpl$getCommunityVaultInfo$1)o).L$1 = l$1;
                    ((CommunitiesRepositoryImpl$getCommunityVaultInfo$1)o).label = 1;
                    o2 = b.getCommunityVaultInfo(l$1, (lg2.c)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    communitiesRepositoryImpl = this;
                    b2 = ((w)o2).b;
                    break Label_0226;
                }
                catch (final Exception ex) {
                    communitiesRepositoryImpl2 = this;
                }
            }
            final Exception ex;
            ex.printStackTrace();
            b2 = null;
            communitiesRepositoryImpl = communitiesRepositoryImpl2;
        }
        final VaultInfoResponse vaultInfoResponse = (VaultInfoResponse)b2;
        Object o4 = o3;
        if (vaultInfoResponse != null) {
            communitiesRepositoryImpl.h.put(l$1, vaultInfoResponse);
            o4 = vaultInfoResponse;
        }
        return o4;
    }
}
