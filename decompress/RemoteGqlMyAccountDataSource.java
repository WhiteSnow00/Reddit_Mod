// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.i6$d;
import com.reddit.mutations.i6$b;
import com.reddit.mutations.i6;
import o22.u3;
import com.reddit.data.model.AccountGenderCategoryMapper;
import com.reddit.domain.model.GenderOption;
import com.reddit.queries.b3$c;
import com.reddit.queries.b3$d;
import com.reddit.data.model.GqlGenderDomainMapper;
import com.reddit.queries.b3$b;
import com.reddit.queries.b3;
import com.reddit.domain.model.Gender;
import com.reddit.queries.s1$i;
import com.reddit.queries.s1$g;
import com.reddit.fragment.RedditorFragment$c;
import com.reddit.fragment.RedditorFragment$b;
import com.reddit.queries.s1$a;
import com.reddit.fragment.RedditorFragment;
import java.util.Iterator;
import com.reddit.queries.s1$e;
import com.reddit.queries.s1$f;
import com.reddit.domain.model.FollowersPage;
import kotlin.collections.EmptyList;
import com.reddit.domain.image.model.ImageResolution;
import java.util.List;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import com.reddit.domain.model.FollowerModel;
import com.reddit.queries.s1$d;
import com.reddit.queries.s1$h;
import java.util.ArrayList;
import com.reddit.queries.s1$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.s1;
import h7.h$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import f60.a;
import ur0.g;

public final class RemoteGqlMyAccountDataSource
{
    public final g a;
    public final a b;
    
    @Inject
    public RemoteGqlMyAccountDataSource(final g a, final a b) {
        f.f((Object)a, "graphQlClient");
        f.f((Object)b, "followedByRedditorsMapper");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(String string, String b, final int n, final c c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlMyAccountDataSource$getFollowedByRedditors$1) {
                final RemoteGqlMyAccountDataSource$getFollowedByRedditors$1 remoteGqlMyAccountDataSource$getFollowedByRedditors$1 = (RemoteGqlMyAccountDataSource$getFollowedByRedditors$1)c;
                final int label = remoteGqlMyAccountDataSource$getFollowedByRedditors$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlMyAccountDataSource$getFollowedByRedditors$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlMyAccountDataSource$getFollowedByRedditors$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlMyAccountDataSource$getFollowedByRedditors$1(this, (c<? super RemoteGqlMyAccountDataSource$getFollowedByRedditors$1>)c);
        }
        final Object result = ((RemoteGqlMyAccountDataSource$getFollowedByRedditors$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlMyAccountDataSource$getFollowedByRedditors$1)o).label;
        RemoteGqlMyAccountDataSource remoteGqlMyAccountDataSource;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlMyAccountDataSource = (RemoteGqlMyAccountDataSource)((RemoteGqlMyAccountDataSource$getFollowedByRedditors$1)o).L$0;
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final s1 s1 = new s1(a.f(n), h$a.c((Object)string), h$a.c((Object)b));
            ((RemoteGqlMyAccountDataSource$getFollowedByRedditors$1)o).L$0 = this;
            ((RemoteGqlMyAccountDataSource$getFollowedByRedditors$1)o).label = 1;
            b2 = e$a.b(14, (k)s1, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlMyAccountDataSource = this;
        }
        final s1$c s1$c = (s1$c)b2;
        remoteGqlMyAccountDataSource.b.getClass();
        f.f((Object)s1$c, "data");
        final s1$f a2 = s1$c.a;
        final String s2 = null;
        List<FollowerModel> list3 = null;
        Label_0524: {
            if (a2 != null) {
                final s1$e b3 = a2.b;
                if (b3 != null) {
                    final List b4 = b3.b;
                    if (b4 != null) {
                        final ArrayList<s1$h> list = new ArrayList<s1$h>();
                        for (final s1$d s1$d : b4) {
                            s1$h b5;
                            if (s1$d != null) {
                                b5 = s1$d.b;
                            }
                            else {
                                b5 = null;
                            }
                            if (b5 != null) {
                                list.add(b5);
                            }
                        }
                        final ArrayList<FollowerModel> list2 = new ArrayList<FollowerModel>();
                        final Iterator<s1$h> iterator2 = list.iterator();
                        while (true) {
                            list3 = list2;
                            if (!iterator2.hasNext()) {
                                break Label_0524;
                            }
                            final s1$h s1$h = iterator2.next();
                            final RedditorFragment a3 = s1$h.b.a;
                            FollowerModel followerModel = null;
                            Label_0508: {
                                if (a3 != null) {
                                    final s1$a c2 = s1$h.c;
                                    if (c2 != null) {
                                        final RedditorFragment$b e = a3.e;
                                        if (e != null) {
                                            final String b6 = a3.b;
                                            final String c3 = a3.c;
                                            final String b7 = c2.b;
                                            final List domainModel = GqlDataToDomainModelMapperKt.toDomainModel(a3.f.a);
                                            final RedditorFragment$c d = a3.d;
                                            Label_0444: {
                                                if (d != null) {
                                                    final Object b8 = d.b;
                                                    if (b8 != null) {
                                                        string = b8.toString();
                                                        break Label_0444;
                                                    }
                                                }
                                                string = null;
                                            }
                                            final boolean b9 = e.b;
                                            final boolean c4 = c2.c;
                                            final s1$g d2 = c2.d;
                                            Integer value;
                                            if (d2 != null) {
                                                value = (int)d2.b;
                                            }
                                            else {
                                                value = null;
                                            }
                                            followerModel = new FollowerModel(b6, c3, b7, domainModel, string, b9, c4, value, c2.e);
                                            break Label_0508;
                                        }
                                    }
                                }
                                followerModel = null;
                            }
                            if (followerModel == null) {
                                continue;
                            }
                            list2.add(followerModel);
                        }
                    }
                }
            }
            list3 = null;
        }
        final s1$f a4 = s1$c.a;
        b = s2;
        if (a4 != null) {
            final s1$e b10 = a4.b;
            b = s2;
            if (b10 != null) {
                final s1$i c5 = b10.c;
                b = s2;
                if (c5 != null) {
                    b = c5.b;
                }
            }
        }
        Object instance;
        if ((instance = list3) == null) {
            instance = EmptyList.INSTANCE;
        }
        return new FollowersPage((List<FollowerModel>)instance, b);
    }
    
    public final Object b(final c<? super Gender> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlMyAccountDataSource$getGender.RemoteGqlMyAccountDataSource$getGender$1) {
                final RemoteGqlMyAccountDataSource$getGender.RemoteGqlMyAccountDataSource$getGender$1 remoteGqlMyAccountDataSource$getGender$1 = (RemoteGqlMyAccountDataSource$getGender.RemoteGqlMyAccountDataSource$getGender$1)c;
                final int label = remoteGqlMyAccountDataSource$getGender$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlMyAccountDataSource$getGender$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlMyAccountDataSource$getGender$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlMyAccountDataSource$getGender.RemoteGqlMyAccountDataSource$getGender$1(this, (c)c);
        }
        final Object result = ((RemoteGqlMyAccountDataSource$getGender.RemoteGqlMyAccountDataSource$getGender$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlMyAccountDataSource$getGender.RemoteGqlMyAccountDataSource$getGender$1)o).label;
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
            final g a = this.a;
            final b3 b2 = new b3();
            ((RemoteGqlMyAccountDataSource$getGender.RemoteGqlMyAccountDataSource$getGender$1)o).label = 1;
            if ((b = e$a.b(14, (k)b2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final b3$d a2 = ((b3$b)b).a;
        if (a2 != null) {
            final b3$c b3 = a2.b;
            if (b3 != null) {
                return GqlGenderDomainMapper.INSTANCE.toGenderDomainModel(b3);
            }
        }
        return null;
    }
    
    public final Object c(final GenderOption genderOption, final String s, final c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlMyAccountDataSource$updateGender.RemoteGqlMyAccountDataSource$updateGender$1) {
                final RemoteGqlMyAccountDataSource$updateGender.RemoteGqlMyAccountDataSource$updateGender$1 remoteGqlMyAccountDataSource$updateGender$1 = (RemoteGqlMyAccountDataSource$updateGender.RemoteGqlMyAccountDataSource$updateGender$1)c;
                final int label = remoteGqlMyAccountDataSource$updateGender$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlMyAccountDataSource$updateGender$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlMyAccountDataSource$updateGender$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlMyAccountDataSource$updateGender.RemoteGqlMyAccountDataSource$updateGender$1(this, (c)c);
        }
        final Object result = ((RemoteGqlMyAccountDataSource$updateGender.RemoteGqlMyAccountDataSource$updateGender$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlMyAccountDataSource$updateGender.RemoteGqlMyAccountDataSource$updateGender$1)o).label;
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
            final g a = this.a;
            final i6 i6 = new i6(new u3(h$a.c((Object)AccountGenderCategoryMapper.INSTANCE.map(genderOption)), h$a.c((Object)s)));
            ((RemoteGqlMyAccountDataSource$updateGender.RemoteGqlMyAccountDataSource$updateGender$1)o).label = 1;
            if ((b = e$a.b(14, (k)i6, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final i6$d a2 = ((i6$b)b).a;
        return a2 != null && a2.b;
    }
}
