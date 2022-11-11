// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.i8$c;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.i8$b;
import h7.n;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.reddit.mutations.i8;
import com.reddit.type.BlockState;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.queries.ab$d;
import com.reddit.queries.ab$a;
import com.reddit.queries.ab$e;
import com.reddit.queries.ab$c;
import com.reddit.queries.ab;
import com.reddit.queries.a0$i$a;
import com.reddit.queries.a0$i;
import com.reddit.queries.a0$f;
import com.reddit.queries.a0$a;
import com.reddit.queries.a0$h;
import java.util.Iterator;
import com.reddit.queries.a0$b;
import kl0.sh;
import com.reddit.queries.a0$g;
import java.util.List;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import kotlin.collections.EmptyList;
import com.reddit.queries.a0$e;
import java.util.ArrayList;
import com.reddit.queries.a0$d;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.a0;
import h7.h$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.BlockedAccount;
import com.reddit.domain.model.Page;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class RemoteGqlBlockedAccountDataSource
{
    public final g a;
    
    @Inject
    public RemoteGqlBlockedAccountDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(String s, final int n, final c<? super Page<BlockedAccount>> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlBlockedAccountDataSource$getBlockedUsers.RemoteGqlBlockedAccountDataSource$getBlockedUsers$1) {
                final RemoteGqlBlockedAccountDataSource$getBlockedUsers.RemoteGqlBlockedAccountDataSource$getBlockedUsers$1 remoteGqlBlockedAccountDataSource$getBlockedUsers$1 = (RemoteGqlBlockedAccountDataSource$getBlockedUsers.RemoteGqlBlockedAccountDataSource$getBlockedUsers$1)c;
                final int label = remoteGqlBlockedAccountDataSource$getBlockedUsers$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlBlockedAccountDataSource$getBlockedUsers$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlBlockedAccountDataSource$getBlockedUsers$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlBlockedAccountDataSource$getBlockedUsers.RemoteGqlBlockedAccountDataSource$getBlockedUsers$1(this, (c)c);
        }
        final Object result = ((RemoteGqlBlockedAccountDataSource$getBlockedUsers.RemoteGqlBlockedAccountDataSource$getBlockedUsers$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlBlockedAccountDataSource$getBlockedUsers.RemoteGqlBlockedAccountDataSource$getBlockedUsers$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final a0 a0 = new a0(h$a.b((Object)s), h$a.b((Object)new Integer(n)));
            final g a2 = this.a;
            ((RemoteGqlBlockedAccountDataSource$getBlockedUsers.RemoteGqlBlockedAccountDataSource$getBlockedUsers$1)o).label = 1;
            if ((b = e$a.b(14, (k)a0, (e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final a0$d a0$d = (a0$d)b;
        final a0$g a3 = a0$d.a;
        final sh sh = null;
        Object instance = null;
        Label_0356: {
            if (a3 != null) {
                final a0$b b2 = a3.b;
                if (b2 != null) {
                    final List c2 = b2.c;
                    if (c2 != null) {
                        final ArrayList<Object> list = new ArrayList<Object>();
                        final Iterator iterator = c2.iterator();
                        while (true) {
                            instance = list;
                            if (!iterator.hasNext()) {
                                break Label_0356;
                            }
                            final a0$e a0$e = (a0$e)iterator.next();
                            a0$a c3 = null;
                            Label_0269: {
                                if (a0$e != null) {
                                    final a0$h b3 = a0$e.b;
                                    if (b3 != null) {
                                        c3 = b3.c;
                                        break Label_0269;
                                    }
                                }
                                c3 = null;
                            }
                            Object o2;
                            if (c3 == null) {
                                o2 = null;
                            }
                            else {
                                final String b4 = c3.b;
                                final String c4 = c3.c;
                                final a0$f d = c3.d;
                                Object b5;
                                if (d != null) {
                                    b5 = d.b;
                                }
                                else {
                                    b5 = null;
                                }
                                if (b5 instanceof String) {
                                    s = (String)b5;
                                }
                                else {
                                    s = null;
                                }
                                o2 = new BlockedAccount(b4, c4, s);
                            }
                            if (o2 == null) {
                                continue;
                            }
                            list.add(o2);
                        }
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        final a0$g a4 = a0$d.a;
        sh a5 = sh;
        if (a4 != null) {
            final a0$b b6 = a4.b;
            a5 = sh;
            if (b6 != null) {
                final a0$i b7 = b6.b;
                a5 = sh;
                if (b7 != null) {
                    final a0$i$a b8 = b7.b;
                    a5 = sh;
                    if (b8 != null) {
                        a5 = b8.a;
                    }
                }
            }
        }
        return new Page((List<?>)instance, GqlDataToDomainModelMapperKt.getAfter(a5));
    }
    
    public final Object b(String l$0, final c<? super BlockedAccount> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlBlockedAccountDataSource$searchUserToBlock.RemoteGqlBlockedAccountDataSource$searchUserToBlock$1) {
                final RemoteGqlBlockedAccountDataSource$searchUserToBlock.RemoteGqlBlockedAccountDataSource$searchUserToBlock$1 remoteGqlBlockedAccountDataSource$searchUserToBlock$1 = (RemoteGqlBlockedAccountDataSource$searchUserToBlock.RemoteGqlBlockedAccountDataSource$searchUserToBlock$1)c;
                final int label = remoteGqlBlockedAccountDataSource$searchUserToBlock$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlBlockedAccountDataSource$searchUserToBlock$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlBlockedAccountDataSource$searchUserToBlock$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlBlockedAccountDataSource$searchUserToBlock.RemoteGqlBlockedAccountDataSource$searchUserToBlock$1(this, (c)c);
        }
        final Object result = ((RemoteGqlBlockedAccountDataSource$searchUserToBlock.RemoteGqlBlockedAccountDataSource$searchUserToBlock$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlBlockedAccountDataSource$searchUserToBlock.RemoteGqlBlockedAccountDataSource$searchUserToBlock$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (String)((RemoteGqlBlockedAccountDataSource$searchUserToBlock.RemoteGqlBlockedAccountDataSource$searchUserToBlock$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final ab ab = new ab(l$0);
            final g a = this.a;
            ((RemoteGqlBlockedAccountDataSource$searchUserToBlock.RemoteGqlBlockedAccountDataSource$searchUserToBlock$1)o).L$0 = l$0;
            ((RemoteGqlBlockedAccountDataSource$searchUserToBlock.RemoteGqlBlockedAccountDataSource$searchUserToBlock$1)o).label = 1;
            if ((b = e$a.b(14, (k)ab, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final ab$e a2 = ((ab$c)b).a;
        final Object o2 = null;
        final String s = null;
        Object o3 = o2;
        if (a2 != null) {
            final ab$a b2 = a2.b;
            o3 = o2;
            if (b2 != null) {
                final String b3 = b2.b;
                final ab$d c2 = b2.c;
                String string = s;
                if (c2 != null) {
                    final Object b4 = c2.b;
                    string = s;
                    if (b4 != null) {
                        string = b4.toString();
                    }
                }
                o3 = new BlockedAccount(b3, l$0, string);
            }
        }
        return o3;
    }
    
    public final Object c(String a, final boolean b, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlBlockedAccountDataSource$setUserBlockedState.RemoteGqlBlockedAccountDataSource$setUserBlockedState$1) {
                final RemoteGqlBlockedAccountDataSource$setUserBlockedState.RemoteGqlBlockedAccountDataSource$setUserBlockedState$1 remoteGqlBlockedAccountDataSource$setUserBlockedState$1 = (RemoteGqlBlockedAccountDataSource$setUserBlockedState.RemoteGqlBlockedAccountDataSource$setUserBlockedState$1)c;
                final int label = remoteGqlBlockedAccountDataSource$setUserBlockedState$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlBlockedAccountDataSource$setUserBlockedState$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlBlockedAccountDataSource$setUserBlockedState$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlBlockedAccountDataSource$setUserBlockedState.RemoteGqlBlockedAccountDataSource$setUserBlockedState$1(this, (c)c);
        }
        final Object result = ((RemoteGqlBlockedAccountDataSource$setUserBlockedState.RemoteGqlBlockedAccountDataSource$setUserBlockedState$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlBlockedAccountDataSource$setUserBlockedState.RemoteGqlBlockedAccountDataSource$setUserBlockedState$1)o).label;
        final String s = null;
        Object c2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            c2 = result;
        }
        else {
            aj2.c.Q0(result);
            BlockState blockState;
            if (b) {
                blockState = BlockState.BLOCKED;
            }
            else {
                blockState = BlockState.NONE;
            }
            final i8 i8 = new i8(a, blockState);
            final g a2 = this.a;
            ((RemoteGqlBlockedAccountDataSource$setUserBlockedState.RemoteGqlBlockedAccountDataSource$setUserBlockedState$1)o).label = 1;
            if ((c2 = e$a.c(14, (k)i8, (e)a2, (Map)null, (ContinuationImpl)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final n n = (n)c2;
        final i8$b i8$b = (i8$b)n.b;
        if (i8$b != null) {
            final i8$c a3 = i8$b.a;
            if (a3 != null) {
                return new UpdateResponse(a3.b, "");
            }
        }
        final List c3 = n.c;
        a = s;
        if (c3 != null) {
            final h7.f f = (h7.f)CollectionsKt___CollectionsKt.s1(c3);
            a = s;
            if (f != null) {
                a = f.a;
            }
        }
        return new UpdateResponse(false, a);
    }
}
