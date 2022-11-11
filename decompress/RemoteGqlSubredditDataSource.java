// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.u8$d;
import com.reddit.mutations.u8$c;
import com.reddit.mutations.u8$b;
import com.reddit.mutations.u8;
import o22.x4;
import com.reddit.type.FavoriteState;
import com.reddit.mutations.s8$e;
import com.reddit.mutations.s8$c;
import com.reddit.mutations.s8$b;
import com.reddit.mutations.s8;
import o22.w4;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.queries.ud$l$a;
import com.reddit.queries.ud$l;
import com.reddit.queries.ud$i;
import com.reddit.queries.ud$q;
import com.reddit.fragment.ProfileListItemFragment;
import com.reddit.queries.ud$p$a;
import com.reddit.queries.ud$p;
import com.reddit.queries.ud$a;
import com.reddit.queries.ud$k;
import com.reddit.queries.ud$g;
import kl0.sh;
import com.reddit.fragment.SubredditListItemFragment;
import com.reddit.queries.ud$j$a;
import com.reddit.queries.ud$j;
import com.reddit.queries.ud$r;
import com.reddit.queries.ud$h;
import com.reddit.queries.ud$e;
import com.reddit.queries.ud$d;
import com.reddit.domain.model.PaginatedListing;
import com.reddit.queries.ud$f;
import com.reddit.domain.model.SubredditListItem;
import com.reddit.queries.ud$c;
import com.reddit.queries.ud;
import com.reddit.domain.model.UserSubredditPaginatedListing;
import com.reddit.queries.tc$j;
import com.reddit.queries.tc$k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.reddit.queries.tc$l$a;
import com.reddit.queries.tc$l;
import com.reddit.queries.tc$a;
import com.reddit.queries.tc$i;
import com.reddit.queries.tc$f;
import com.reddit.queries.tc$h$a;
import com.reddit.queries.tc$h;
import com.reddit.queries.tc$m;
import com.reddit.queries.tc$g;
import java.util.Collection;
import com.reddit.queries.tc$d;
import com.reddit.queries.tc$e;
import com.reddit.queries.tc$c;
import com.reddit.queries.tc;
import com.reddit.queries.SubredditsInfoByNamesQuery$b$a;
import java.util.AbstractCollection;
import com.reddit.queries.SubredditsInfoByNamesQuery$b;
import com.reddit.queries.SubredditsInfoByNamesQuery$Data;
import com.reddit.queries.SubredditsInfoByNamesQuery;
import com.reddit.type.ImagePosition;
import com.reddit.type.CustomizationFlag;
import kl0.o50;
import com.reddit.queries.ic$d$a;
import com.reddit.queries.ic$d;
import com.reddit.queries.ic$a;
import com.reddit.queries.ic$e;
import com.reddit.structuredstyles.model.WidgetsLayout;
import com.reddit.structuredstyles.model.widgets.MenuWidget;
import com.reddit.structuredstyles.model.widgets.IdCardWidget;
import com.reddit.structuredstyles.model.Style;
import com.reddit.queries.ic$c;
import com.reddit.queries.ic;
import com.reddit.structuredstyles.model.StructuredStyle;
import com.reddit.queries.n5$a;
import com.reddit.queries.n5$h;
import com.reddit.data.model.graphql.GqlCreateUpdateSubredditMapper;
import com.reddit.queries.n5$f;
import com.reddit.queries.n5;
import com.reddit.domain.model.communitysettings.SubredditSettings;
import com.reddit.queries.pb$a;
import com.reddit.queries.pb$e;
import com.reddit.queries.pb;
import com.reddit.queries.pb$d;
import com.reddit.fragment.UnavailableSubredditFragment;
import com.reddit.queries.ob$c$a;
import com.reddit.queries.ob$c;
import com.reddit.queries.ob$b;
import com.reddit.queries.ob;
import com.reddit.queries.ProfileDetailsByNamesQuery$b;
import qg2.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.queries.ProfileDetailsByNamesQuery$Data;
import com.reddit.queries.ProfileDetailsByNamesQuery;
import com.reddit.fragment.ProfileDetailsFragment;
import com.reddit.queries.j9$c$a;
import com.reddit.queries.j9$c;
import com.reddit.queries.j9$b;
import com.reddit.queries.j9;
import com.reddit.queries.k9$c;
import com.reddit.domain.model.Result$Error;
import com.reddit.queries.k9;
import com.reddit.domain.model.Result$Success;
import com.reddit.queries.k9$b;
import com.reddit.domain.model.Result;
import com.reddit.queries.t7$g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.SubredditListingProgressIndicator;
import com.reddit.domain.model.CommunityDrawerListing;
import h7.h$a;
import com.reddit.domain.model.FlairRichTextItem;
import com.reddit.fragment.SubredditDetailsFragment;
import com.reddit.queries.t7$f$a;
import com.reddit.queries.t7$f;
import java.util.Iterator;
import java.util.List;
import com.reddit.queries.t7$e;
import com.reddit.queries.t7$a;
import com.reddit.queries.t7$h;
import kotlin.collections.EmptyList;
import com.squareup.moshi.JsonAdapter;
import com.reddit.data.model.graphql.GqlSubredditMapper;
import com.reddit.queries.t7$d;
import com.reddit.domain.model.Subreddit;
import java.util.ArrayList;
import com.reddit.queries.t7$c;
import okhttp3.OkHttpClient;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import ur0.e$a;
import com.reddit.queries.t7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import tg2.c;
import java.util.Map;
import javax.inject.Inject;
import pg2.f;
import db0.r;
import com.reddit.data.model.graphql.GqlFragmentsMapper;
import com.reddit.session.Session;
import db0.e;
import com.squareup.moshi.y;
import r20.a;
import d60.h;
import w40.b;
import ur0.g;

public final class RemoteGqlSubredditDataSource
{
    public final g a;
    public final b b;
    public final h c;
    public final a d;
    public final y e;
    public final ex1.a f;
    public final e g;
    public final Session h;
    public final GqlFragmentsMapper i;
    public final jw0.a j;
    public final r k;
    public final f l;
    
    @Inject
    public RemoteGqlSubredditDataSource(final g a, final b b, final h c, final a d, final y e, final ex1.a f, final e g, final Session h, final GqlFragmentsMapper i, final jw0.a j, final r k) {
        ah2.f.f((Object)a, "graphQlClient");
        ah2.f.f((Object)b, "subredditGqlClient");
        ah2.f.f((Object)c, "relatedSubredditsTransformer");
        ah2.f.f((Object)d, "backgroundThread");
        ah2.f.f((Object)e, "moshi");
        ah2.f.f((Object)f, "communitiesLoggedOutSettings");
        ah2.f.f((Object)g, "consumerSafetyFeatures");
        ah2.f.f((Object)h, "activeSession");
        ah2.f.f((Object)i, "gqlFragmentsMapper");
        ah2.f.f((Object)j, "logger");
        ah2.f.f((Object)k, "mainActivityFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = kotlin.a.b((zg2.a)new RemoteGqlSubredditDataSource$richTextAdapter.RemoteGqlSubredditDataSource$richTextAdapter$2(this));
    }
    
    public final Serializable a(final String s, final Map map, final c c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSubredditDataSource$getModeratedSubreddits$1) {
                final RemoteGqlSubredditDataSource$getModeratedSubreddits$1 remoteGqlSubredditDataSource$getModeratedSubreddits$1 = (RemoteGqlSubredditDataSource$getModeratedSubreddits$1)c;
                final int label = remoteGqlSubredditDataSource$getModeratedSubreddits$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getModeratedSubreddits$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getModeratedSubreddits$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSubredditDataSource$getModeratedSubreddits$1(this, (c<? super RemoteGqlSubredditDataSource$getModeratedSubreddits$1>)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getModeratedSubreddits$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getModeratedSubreddits$1)o).label;
        RemoteGqlSubredditDataSource remoteGqlSubredditDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlSubredditDataSource = (RemoteGqlSubredditDataSource)((RemoteGqlSubredditDataSource$getModeratedSubreddits$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final t7 t7 = new t7(22, (h7.h)null, a.f(5000), s);
            ((RemoteGqlSubredditDataSource$getModeratedSubreddits$1)o).L$0 = this;
            ((RemoteGqlSubredditDataSource$getModeratedSubreddits$1)o).label = 1;
            b = e$a.b(10, (k)t7, (ur0.e)a, (RetryAlgo)null, map, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            remoteGqlSubredditDataSource = this;
        }
        final t7$h a2 = ((t7$c)b).a;
        Object instance = null;
        Label_0332: {
            if (a2 != null) {
                final t7$a b2 = a2.b;
                if (b2 != null) {
                    final t7$e b3 = b2.b;
                    if (b3 != null) {
                        final List b4 = b3.b;
                        if (b4 != null) {
                            final ArrayList<Subreddit> list = new ArrayList<Subreddit>();
                            final Iterator iterator = b4.iterator();
                            while (true) {
                                instance = list;
                                if (!iterator.hasNext()) {
                                    break Label_0332;
                                }
                                final t7$d t7$d = (t7$d)iterator.next();
                                Subreddit map2 = null;
                                Label_0315: {
                                    if (t7$d != null) {
                                        final t7$f b5 = t7$d.b;
                                        if (b5 != null) {
                                            final t7$f$a b6 = b5.b;
                                            if (b6 != null) {
                                                final SubredditDetailsFragment a3 = b6.a;
                                                if (a3 != null) {
                                                    final GqlSubredditMapper instance2 = GqlSubredditMapper.INSTANCE;
                                                    final JsonAdapter<List<FlairRichTextItem>> f = remoteGqlSubredditDataSource.f();
                                                    ah2.f.e((Object)f, "richTextAdapter");
                                                    map2 = instance2.map(a3, (JsonAdapter)f);
                                                    break Label_0315;
                                                }
                                            }
                                        }
                                    }
                                    map2 = null;
                                }
                                if (map2 == null) {
                                    continue;
                                }
                                list.add(map2);
                            }
                        }
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        if (remoteGqlSubredditDataSource.k.k6()) {
            remoteGqlSubredditDataSource.j.c((Throwable)new RuntimeException(androidx.viewpager.widget.c.h("Communities list moderatedSubreddits: ", instance)));
        }
        return (Serializable)instance;
    }
    
    public final Object b(final int n, String e, final String s, final Map map, final c c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlSubredditDataSource$getModeratedSubredditsListing$1) {
                final RemoteGqlSubredditDataSource$getModeratedSubredditsListing$1 remoteGqlSubredditDataSource$getModeratedSubredditsListing$1 = (RemoteGqlSubredditDataSource$getModeratedSubredditsListing$1)c;
                final int label = remoteGqlSubredditDataSource$getModeratedSubredditsListing$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getModeratedSubredditsListing$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getModeratedSubredditsListing$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlSubredditDataSource$getModeratedSubredditsListing$1(this, (c<? super RemoteGqlSubredditDataSource$getModeratedSubredditsListing$1>)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getModeratedSubredditsListing$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getModeratedSubredditsListing$1)o).label;
        RemoteGqlSubredditDataSource remoteGqlSubredditDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlSubredditDataSource = (RemoteGqlSubredditDataSource)((RemoteGqlSubredditDataSource$getModeratedSubredditsListing$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final t7 t7 = new t7(18, h$a.c((Object)s), a.f(n), e);
            ((RemoteGqlSubredditDataSource$getModeratedSubredditsListing$1)o).L$0 = this;
            ((RemoteGqlSubredditDataSource$getModeratedSubredditsListing$1)o).label = 1;
            b = e$a.b(10, (k)t7, (ur0.e)a, (RetryAlgo)null, map, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlSubredditDataSource = this;
        }
        final t7$h a2 = ((t7$c)b).a;
        final String s2 = null;
        t7$e b3 = null;
        Label_0225: {
            if (a2 != null) {
                final t7$a b2 = a2.b;
                if (b2 != null) {
                    b3 = b2.b;
                    break Label_0225;
                }
            }
            b3 = null;
        }
        Object instance = null;
        Label_0381: {
            if (b3 != null) {
                final List b4 = b3.b;
                if (b4 != null) {
                    final ArrayList<Subreddit> list = new ArrayList<Subreddit>();
                    final Iterator iterator = b4.iterator();
                    while (true) {
                        instance = list;
                        if (!iterator.hasNext()) {
                            break Label_0381;
                        }
                        final t7$d t7$d = (t7$d)iterator.next();
                        Subreddit map2 = null;
                        Label_0360: {
                            if (t7$d != null) {
                                final t7$f b5 = t7$d.b;
                                if (b5 != null) {
                                    final t7$f$a b6 = b5.b;
                                    if (b6 != null) {
                                        final SubredditDetailsFragment a3 = b6.a;
                                        if (a3 != null) {
                                            final GqlSubredditMapper instance2 = GqlSubredditMapper.INSTANCE;
                                            final JsonAdapter<List<FlairRichTextItem>> f = remoteGqlSubredditDataSource.f();
                                            ah2.f.e((Object)f, "richTextAdapter");
                                            map2 = instance2.map(a3, (JsonAdapter)f);
                                            break Label_0360;
                                        }
                                    }
                                }
                            }
                            map2 = null;
                        }
                        if (map2 == null) {
                            continue;
                        }
                        list.add(map2);
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        e = s2;
        if (b3 != null) {
            final t7$g c2 = b3.c;
            e = s2;
            if (c2 != null) {
                e = c2.e;
            }
        }
        if (b3 != null) {
            final t7$g c3 = b3.c;
            if (c3 != null) {
                final boolean c4 = c3.c;
                return new CommunityDrawerListing((List)instance, e, (String)null, c4, (SubredditListingProgressIndicator)null, 20, (DefaultConstructorMarker)null);
            }
        }
        final boolean c4 = false;
        return new CommunityDrawerListing((List)instance, e, (String)null, c4, (SubredditListingProgressIndicator)null, 20, (DefaultConstructorMarker)null);
    }
    
    public final Object c(final String s, final c<? super Result<Boolean>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditDataSource$getProfileIsSubscribed.RemoteGqlSubredditDataSource$getProfileIsSubscribed$1) {
                final RemoteGqlSubredditDataSource$getProfileIsSubscribed.RemoteGqlSubredditDataSource$getProfileIsSubscribed$1 remoteGqlSubredditDataSource$getProfileIsSubscribed$1 = (RemoteGqlSubredditDataSource$getProfileIsSubscribed.RemoteGqlSubredditDataSource$getProfileIsSubscribed$1)c;
                final int label = remoteGqlSubredditDataSource$getProfileIsSubscribed$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getProfileIsSubscribed$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getProfileIsSubscribed$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditDataSource$getProfileIsSubscribed.RemoteGqlSubredditDataSource$getProfileIsSubscribed$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getProfileIsSubscribed.RemoteGqlSubredditDataSource$getProfileIsSubscribed$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getProfileIsSubscribed.RemoteGqlSubredditDataSource$getProfileIsSubscribed$1)o).label;
        boolean b = true;
        Object constructor-impl = null;
        Label_0099: {
            if (label2 == 0) {
                break Label_0099;
            }
            Label_0089: {
                if (label2 != 1) {
                    break Label_0089;
                }
                try {
                    aj2.c.Q0(result);
                    Object b2 = result;
                    final k9$c a;
                    Label_0148: {
                        a = ((k9$b)b2).a;
                    }
                    Object o2;
                    if (a != null) {
                        final boolean c2 = a.c;
                        o2 = new(com.reddit.domain.model.Result$Success.class)();
                        if (!c2) {
                            b = false;
                        }
                        new Result$Success((Object)b);
                    }
                    else {
                        o2 = null;
                    }
                    kotlin.Result.constructor-impl(o2);
                    break Label_0099;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    aj2.c.Q0(result);
                    final g a2 = this.a;
                    final k9 k9 = new k9(s);
                    ((RemoteGqlSubredditDataSource$getProfileIsSubscribed.RemoteGqlSubredditDataSource$getProfileIsSubscribed$1)o).label = 1;
                    iftrue(Label_0148:)((b2 = e$a.b(14, (k)k9, (ur0.e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                finally {
                    final Throwable t;
                    constructor-impl = kotlin.Result.constructor-impl((Object)aj2.c.G(t));
                }
            }
        }
        Object o3 = constructor-impl;
        if (kotlin.Result.isFailure-impl(constructor-impl)) {
            o3 = null;
        }
        Object o4 = o3;
        if (o4 == null) {
            o4 = new Result$Error("GraphQL error", false, 2, (DefaultConstructorMarker)null);
        }
        return o4;
    }
    
    public final Object d(final String s, final c<? super Subreddit> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditDataSource$getProfileSubreddit.RemoteGqlSubredditDataSource$getProfileSubreddit$1) {
                final RemoteGqlSubredditDataSource$getProfileSubreddit.RemoteGqlSubredditDataSource$getProfileSubreddit$1 remoteGqlSubredditDataSource$getProfileSubreddit$1 = (RemoteGqlSubredditDataSource$getProfileSubreddit.RemoteGqlSubredditDataSource$getProfileSubreddit$1)c;
                final int label = remoteGqlSubredditDataSource$getProfileSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getProfileSubreddit$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getProfileSubreddit$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditDataSource$getProfileSubreddit.RemoteGqlSubredditDataSource$getProfileSubreddit$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getProfileSubreddit.RemoteGqlSubredditDataSource$getProfileSubreddit$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getProfileSubreddit.RemoteGqlSubredditDataSource$getProfileSubreddit$1)o).label;
        RemoteGqlSubredditDataSource remoteGqlSubredditDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlSubredditDataSource = (RemoteGqlSubredditDataSource)((RemoteGqlSubredditDataSource$getProfileSubreddit.RemoteGqlSubredditDataSource$getProfileSubreddit$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final j9 j9 = new j9(s);
            ((RemoteGqlSubredditDataSource$getProfileSubreddit.RemoteGqlSubredditDataSource$getProfileSubreddit$1)o).L$0 = this;
            ((RemoteGqlSubredditDataSource$getProfileSubreddit.RemoteGqlSubredditDataSource$getProfileSubreddit$1)o).label = 1;
            b = e$a.b(14, (k)j9, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlSubredditDataSource = this;
        }
        final j9$c a2 = ((j9$b)b).a;
        if (a2 != null) {
            final j9$c$a b2 = a2.b;
            if (b2 != null) {
                final ProfileDetailsFragment a3 = b2.a;
                if (a3 != null) {
                    final GqlSubredditMapper instance = GqlSubredditMapper.INSTANCE;
                    final JsonAdapter<List<FlairRichTextItem>> f = remoteGqlSubredditDataSource.f();
                    ah2.f.e((Object)f, "richTextAdapter");
                    return instance.map(a3, (JsonAdapter)f);
                }
            }
        }
        return null;
    }
    
    public final Serializable e(ArrayList n1, final c c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditDataSource$getProfileSubreddits$1) {
                final RemoteGqlSubredditDataSource$getProfileSubreddits$1 remoteGqlSubredditDataSource$getProfileSubreddits$1 = (RemoteGqlSubredditDataSource$getProfileSubreddits$1)c;
                final int label = remoteGqlSubredditDataSource$getProfileSubreddits$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getProfileSubreddits$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getProfileSubreddits$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditDataSource$getProfileSubreddits$1(this, (c<? super RemoteGqlSubredditDataSource$getProfileSubreddits$1>)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getProfileSubreddits$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getProfileSubreddits$1)o).label;
        RemoteGqlSubredditDataSource remoteGqlSubredditDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlSubredditDataSource = (RemoteGqlSubredditDataSource)((RemoteGqlSubredditDataSource$getProfileSubreddits$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final b b2 = this.b;
            final ProfileDetailsByNamesQuery profileDetailsByNamesQuery = new ProfileDetailsByNamesQuery(n1);
            ((RemoteGqlSubredditDataSource$getProfileSubreddits$1)o).L$0 = this;
            ((RemoteGqlSubredditDataSource$getProfileSubreddits$1)o).label = 1;
            b = e$a.b(14, (k)profileDetailsByNamesQuery, (ur0.e)b2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            remoteGqlSubredditDataSource = this;
        }
        final List a = ((ProfileDetailsByNamesQuery$Data)b).a;
        Serializable s;
        if (a != null) {
            n1 = CollectionsKt___CollectionsKt.n1((Iterable)a);
            final ArrayList list = new ArrayList<Subreddit>(m.P0((Iterable)n1, 10));
            final Iterator iterator = n1.iterator();
            while (true) {
                s = list;
                if (!iterator.hasNext()) {
                    break;
                }
                final ProfileDetailsByNamesQuery$b profileDetailsByNamesQuery$b = (ProfileDetailsByNamesQuery$b)iterator.next();
                final GqlSubredditMapper instance = GqlSubredditMapper.INSTANCE;
                final ProfileDetailsFragment a2 = profileDetailsByNamesQuery$b.b.a;
                final JsonAdapter<List<FlairRichTextItem>> f = remoteGqlSubredditDataSource.f();
                ah2.f.e((Object)f, "richTextAdapter");
                list.add((Object)instance.map(a2, (JsonAdapter)f));
            }
        }
        else {
            s = null;
        }
        Object instance2;
        if ((instance2 = s) == null) {
            instance2 = EmptyList.INSTANCE;
        }
        return (Serializable)instance2;
    }
    
    public final JsonAdapter<List<FlairRichTextItem>> f() {
        return (JsonAdapter<List<FlairRichTextItem>>)this.l.getValue();
    }
    
    public final Object g(final String s, final c<? super Subreddit> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditDataSource$getSubreddit.RemoteGqlSubredditDataSource$getSubreddit$1) {
                final RemoteGqlSubredditDataSource$getSubreddit.RemoteGqlSubredditDataSource$getSubreddit$1 remoteGqlSubredditDataSource$getSubreddit$1 = (RemoteGqlSubredditDataSource$getSubreddit.RemoteGqlSubredditDataSource$getSubreddit$1)c;
                final int label = remoteGqlSubredditDataSource$getSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getSubreddit$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getSubreddit$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditDataSource$getSubreddit.RemoteGqlSubredditDataSource$getSubreddit$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getSubreddit.RemoteGqlSubredditDataSource$getSubreddit$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getSubreddit.RemoteGqlSubredditDataSource$getSubreddit$1)o).label;
        RemoteGqlSubredditDataSource remoteGqlSubredditDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlSubredditDataSource = (RemoteGqlSubredditDataSource)((RemoteGqlSubredditDataSource$getSubreddit.RemoteGqlSubredditDataSource$getSubreddit$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final boolean b2 = this.g.C4() && !this.h.isLoggedIn() && this.f.a(s);
            final g a = this.a;
            final ob ob = new ob(h$a.b((Object)b2), h$a.b((Object)Boolean.TRUE), s);
            ((RemoteGqlSubredditDataSource$getSubreddit.RemoteGqlSubredditDataSource$getSubreddit$1)o).L$0 = this;
            ((RemoteGqlSubredditDataSource$getSubreddit.RemoteGqlSubredditDataSource$getSubreddit$1)o).label = 1;
            b = e$a.b(14, (k)ob, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlSubredditDataSource = this;
        }
        final ob$c a2 = ((ob$b)b).a;
        Object o3;
        final Object o2 = o3 = null;
        if (a2 != null) {
            final ob$c$a b3 = a2.b;
            o3 = o2;
            if (b3 != null) {
                final UnavailableSubredditFragment b4 = b3.b;
                if (b4 != null) {
                    o3 = remoteGqlSubredditDataSource.i.mapUnavailableSubreddit(b4);
                    if (o3 != null) {
                        return o3;
                    }
                }
                final SubredditDetailsFragment a3 = b3.a;
                o3 = o2;
                if (a3 != null) {
                    final GqlSubredditMapper instance = GqlSubredditMapper.INSTANCE;
                    final JsonAdapter<List<FlairRichTextItem>> f = remoteGqlSubredditDataSource.f();
                    ah2.f.e((Object)f, "richTextAdapter");
                    o3 = instance.map(a3, (JsonAdapter)f);
                }
            }
        }
        return o3;
    }
    
    public final Object h(String s, final c<? super Result<Boolean>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditDataSource$getSubredditIsSubscribed.RemoteGqlSubredditDataSource$getSubredditIsSubscribed$1) {
                final RemoteGqlSubredditDataSource$getSubredditIsSubscribed.RemoteGqlSubredditDataSource$getSubredditIsSubscribed$1 remoteGqlSubredditDataSource$getSubredditIsSubscribed$1 = (RemoteGqlSubredditDataSource$getSubredditIsSubscribed.RemoteGqlSubredditDataSource$getSubredditIsSubscribed$1)c;
                final int label = remoteGqlSubredditDataSource$getSubredditIsSubscribed$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getSubredditIsSubscribed$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getSubredditIsSubscribed$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditDataSource$getSubredditIsSubscribed.RemoteGqlSubredditDataSource$getSubredditIsSubscribed$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getSubredditIsSubscribed.RemoteGqlSubredditDataSource$getSubredditIsSubscribed$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getSubredditIsSubscribed.RemoteGqlSubredditDataSource$getSubredditIsSubscribed$1)o).label;
        Object constructor-impl = null;
        Label_0096: {
            if (label2 == 0) {
                break Label_0096;
            }
            Label_0086: {
                if (label2 != 1) {
                    break Label_0086;
                }
                try {
                    aj2.c.Q0(result);
                    Object b = result;
                    final pb$e a;
                    Label_0145: {
                        a = ((pb$d)b).a;
                    }
                    Object o2 = null;
                    Label_0210: {
                        if (a != null) {
                            final pb$a b2 = a.b;
                            if (b2 != null) {
                                o2 = new Result$Success((Object)b2.b);
                                break Label_0210;
                            }
                            if (a.c != null) {
                                o2 = new Result$Error("Subreddit unavailable", false, 2, (DefaultConstructorMarker)null);
                                break Label_0210;
                            }
                        }
                        o2 = null;
                    }
                    kotlin.Result.constructor-impl(o2);
                    break Label_0096;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    aj2.c.Q0(result);
                    final g a2 = this.a;
                    final pb pb = new pb(s);
                    ((RemoteGqlSubredditDataSource$getSubredditIsSubscribed.RemoteGqlSubredditDataSource$getSubredditIsSubscribed$1)o).label = 1;
                    iftrue(Label_0145:)((b = e$a.b(14, (k)pb, (ur0.e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                finally {
                    final Throwable t;
                    constructor-impl = kotlin.Result.constructor-impl((Object)aj2.c.G(t));
                }
            }
        }
        Object o3;
        if (kotlin.Result.isFailure-impl(constructor-impl)) {
            o3 = null;
        }
        else {
            o3 = constructor-impl;
        }
        Object o4;
        if ((o4 = o3) == null) {
            final Throwable exceptionOrNull-impl = kotlin.Result.exceptionOrNull-impl(constructor-impl);
            if (exceptionOrNull-impl != null) {
                if ((s = exceptionOrNull-impl.getMessage()) == null) {
                    s = exceptionOrNull-impl.toString();
                }
                o4 = new Result$Error(s, false, 2, (DefaultConstructorMarker)null);
            }
            else {
                o4 = null;
            }
            if (o4 == null) {
                o4 = new Result$Error("Unknown gql error", false, 2, (DefaultConstructorMarker)null);
            }
        }
        return o4;
    }
    
    public final Object i(final String s, final c<? super SubredditSettings> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditDataSource$getSubredditSettings.RemoteGqlSubredditDataSource$getSubredditSettings$1) {
                final RemoteGqlSubredditDataSource$getSubredditSettings.RemoteGqlSubredditDataSource$getSubredditSettings$1 remoteGqlSubredditDataSource$getSubredditSettings$1 = (RemoteGqlSubredditDataSource$getSubredditSettings.RemoteGqlSubredditDataSource$getSubredditSettings$1)c;
                final int label = remoteGqlSubredditDataSource$getSubredditSettings$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getSubredditSettings$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getSubredditSettings$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditDataSource$getSubredditSettings.RemoteGqlSubredditDataSource$getSubredditSettings$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getSubredditSettings.RemoteGqlSubredditDataSource$getSubredditSettings$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getSubredditSettings.RemoteGqlSubredditDataSource$getSubredditSettings$1)o).label;
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
            final n5 n5 = new n5(s);
            ((RemoteGqlSubredditDataSource$getSubredditSettings.RemoteGqlSubredditDataSource$getSubredditSettings$1)o).label = 1;
            if ((b = e$a.b(14, (k)n5, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final n5$h a2 = ((n5$f)b).a;
        if (a2 != null) {
            final n5$a c2 = a2.c;
            if (c2 != null) {
                final SubredditSettings map = GqlCreateUpdateSubredditMapper.INSTANCE.map(c2);
                if (map != null) {
                    return map;
                }
            }
        }
        throw new Exception();
    }
    
    public final Object j(String s, final c<? super StructuredStyle> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditDataSource$getSubredditStructuredStyle.RemoteGqlSubredditDataSource$getSubredditStructuredStyle$1) {
                final RemoteGqlSubredditDataSource$getSubredditStructuredStyle.RemoteGqlSubredditDataSource$getSubredditStructuredStyle$1 remoteGqlSubredditDataSource$getSubredditStructuredStyle$1 = (RemoteGqlSubredditDataSource$getSubredditStructuredStyle.RemoteGqlSubredditDataSource$getSubredditStructuredStyle$1)c;
                final int label = remoteGqlSubredditDataSource$getSubredditStructuredStyle$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getSubredditStructuredStyle$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getSubredditStructuredStyle$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditDataSource$getSubredditStructuredStyle.RemoteGqlSubredditDataSource$getSubredditStructuredStyle$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getSubredditStructuredStyle.RemoteGqlSubredditDataSource$getSubredditStructuredStyle$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getSubredditStructuredStyle.RemoteGqlSubredditDataSource$getSubredditStructuredStyle$1)o).label;
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
            final ic ic = new ic(s);
            ((RemoteGqlSubredditDataSource$getSubredditStructuredStyle.RemoteGqlSubredditDataSource$getSubredditStructuredStyle$1)o).label = 1;
            if ((b = e$a.b(14, (k)ic, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final ic$e a2 = ((ic$c)b).a;
        if (a2 != null) {
            final ic$a b2 = a2.b;
            if (b2 != null) {
                final ic$d c2 = b2.c;
                if (c2 != null) {
                    final ic$d$a b3 = c2.b;
                    if (b3 != null) {
                        final o50 a3 = b3.a;
                        if (a3 != null) {
                            final Object c3 = a3.c;
                            String s2;
                            if (c3 instanceof String) {
                                s2 = (String)c3;
                            }
                            else {
                                s2 = null;
                            }
                            final Object q = a3.q;
                            String s3;
                            if (q instanceof String) {
                                s3 = (String)q;
                            }
                            else {
                                s3 = null;
                            }
                            final Object b4 = a3.b;
                            String s4;
                            if (b4 instanceof String) {
                                s4 = (String)b4;
                            }
                            else {
                                s4 = null;
                            }
                            final Object d = a3.d;
                            String s5;
                            if (d instanceof String) {
                                s5 = (String)d;
                            }
                            else {
                                s5 = null;
                            }
                            final Object e = a3.e;
                            String s6;
                            if (e instanceof String) {
                                s6 = (String)e;
                            }
                            else {
                                s6 = null;
                            }
                            final Object m = a3.m;
                            String s7;
                            if (m instanceof String) {
                                s7 = (String)m;
                            }
                            else {
                                s7 = null;
                            }
                            final Object j = a3.j;
                            String s8;
                            if (j instanceof String) {
                                s8 = (String)j;
                            }
                            else {
                                s8 = null;
                            }
                            final Object n = a3.n;
                            String s9;
                            if (n instanceof String) {
                                s9 = (String)n;
                            }
                            else {
                                s9 = null;
                            }
                            final Object i = a3.i;
                            String s10;
                            if (i instanceof String) {
                                s10 = (String)i;
                            }
                            else {
                                s10 = null;
                            }
                            final Object l = a3.l;
                            String s11;
                            if (l instanceof String) {
                                s11 = (String)l;
                            }
                            else {
                                s11 = null;
                            }
                            final Object h = a3.h;
                            String s12;
                            if (h instanceof String) {
                                s12 = (String)h;
                            }
                            else {
                                s12 = null;
                            }
                            final Object k = a3.k;
                            String s13;
                            if (k instanceof String) {
                                s13 = (String)k;
                            }
                            else {
                                s13 = null;
                            }
                            final CustomizationFlag p2 = a3.p;
                            String s14;
                            if (p2 != null) {
                                if (d60.b.b[((Enum)p2).ordinal()] == 1) {
                                    s = "custom";
                                }
                                else {
                                    s = "default";
                                }
                                s14 = s;
                            }
                            else {
                                s14 = null;
                            }
                            final ImagePosition f = a3.f;
                            final String s15 = "unknown";
                            String s16;
                            if (f != null) {
                                final int n2 = d60.b.a[((Enum)f).ordinal()];
                                if (n2 != 1) {
                                    if (n2 != 2) {
                                        s = "unknown";
                                    }
                                    else {
                                        s = "cover";
                                    }
                                }
                                else {
                                    s = "tiled";
                                }
                                s16 = s;
                            }
                            else {
                                s16 = null;
                            }
                            final ImagePosition o2 = a3.o;
                            if (o2 != null) {
                                final int n3 = d60.b.a[((Enum)o2).ordinal()];
                                if (n3 != 1) {
                                    if (n3 != 2) {
                                        s = s15;
                                    }
                                    else {
                                        s = "cover";
                                    }
                                }
                                else {
                                    s = "tiled";
                                }
                            }
                            else {
                                s = null;
                            }
                            final Object g = a3.g;
                            String s17;
                            if (g instanceof String) {
                                s17 = (String)g;
                            }
                            else {
                                s17 = null;
                            }
                            return new StructuredStyle(new Style(s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s16, s, s17), (IdCardWidget)null, (MenuWidget)null, (WidgetsLayout)null, (Map)null);
                        }
                    }
                }
            }
        }
        throw new Exception();
    }
    
    public final Object k(final List<String> list, final c<? super List<Subreddit>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditDataSource$getSubreddits.RemoteGqlSubredditDataSource$getSubreddits$1) {
                final RemoteGqlSubredditDataSource$getSubreddits.RemoteGqlSubredditDataSource$getSubreddits$1 remoteGqlSubredditDataSource$getSubreddits$1 = (RemoteGqlSubredditDataSource$getSubreddits.RemoteGqlSubredditDataSource$getSubreddits$1)c;
                final int label = remoteGqlSubredditDataSource$getSubreddits$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getSubreddits$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getSubreddits$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditDataSource$getSubreddits.RemoteGqlSubredditDataSource$getSubreddits$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getSubreddits.RemoteGqlSubredditDataSource$getSubreddits$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getSubreddits.RemoteGqlSubredditDataSource$getSubreddits$1)o).label;
        RemoteGqlSubredditDataSource remoteGqlSubredditDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlSubredditDataSource = (RemoteGqlSubredditDataSource)((RemoteGqlSubredditDataSource$getSubreddits.RemoteGqlSubredditDataSource$getSubreddits$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final SubredditsInfoByNamesQuery subredditsInfoByNamesQuery = new SubredditsInfoByNamesQuery((List)list);
            ((RemoteGqlSubredditDataSource$getSubreddits.RemoteGqlSubredditDataSource$getSubreddits$1)o).L$0 = this;
            ((RemoteGqlSubredditDataSource$getSubreddits.RemoteGqlSubredditDataSource$getSubreddits$1)o).label = 1;
            b = e$a.b(14, (k)subredditsInfoByNamesQuery, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlSubredditDataSource = this;
        }
        final List a2 = ((SubredditsInfoByNamesQuery$Data)b).a;
        Object instance2;
        if (a2 != null) {
            final ArrayList list2 = new ArrayList<Subreddit>(m.P0((Iterable)a2, 10));
            for (final SubredditsInfoByNamesQuery$b subredditsInfoByNamesQuery$b : a2) {
                Subreddit map;
                final Subreddit subreddit = map = null;
                if (subredditsInfoByNamesQuery$b != null) {
                    final SubredditsInfoByNamesQuery$b$a b2 = subredditsInfoByNamesQuery$b.b;
                    map = subreddit;
                    if (b2 != null) {
                        final SubredditDetailsFragment a3 = b2.a;
                        map = subreddit;
                        if (a3 != null) {
                            final GqlSubredditMapper instance = GqlSubredditMapper.INSTANCE;
                            final JsonAdapter<List<FlairRichTextItem>> f = remoteGqlSubredditDataSource.f();
                            ah2.f.e((Object)f, "richTextAdapter");
                            map = instance.map(a3, (JsonAdapter)f);
                        }
                    }
                }
                list2.add(map);
            }
            final ArrayList n1 = CollectionsKt___CollectionsKt.n1((Iterable)list2);
            instance2 = new ArrayList();
            CollectionsKt___CollectionsKt.d2((Iterable)n1, (AbstractCollection)instance2);
        }
        else {
            instance2 = EmptyList.INSTANCE;
        }
        return instance2;
    }
    
    public final Serializable l(final Map map, final c c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditDataSource$getSubscribedSubreddits$1) {
                final RemoteGqlSubredditDataSource$getSubscribedSubreddits$1 remoteGqlSubredditDataSource$getSubscribedSubreddits$1 = (RemoteGqlSubredditDataSource$getSubscribedSubreddits$1)c;
                final int label = remoteGqlSubredditDataSource$getSubscribedSubreddits$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getSubscribedSubreddits$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getSubscribedSubreddits$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditDataSource$getSubscribedSubreddits$1(this, (c<? super RemoteGqlSubredditDataSource$getSubscribedSubreddits$1>)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getSubscribedSubreddits$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getSubscribedSubreddits$1)o).label;
        RemoteGqlSubredditDataSource remoteGqlSubredditDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlSubredditDataSource = (RemoteGqlSubredditDataSource)((RemoteGqlSubredditDataSource$getSubscribedSubreddits$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final tc tc = new tc((h7.h)null, a.f(5000), (h7.h)null, 27);
            ((RemoteGqlSubredditDataSource$getSubscribedSubreddits$1)o).L$0 = this;
            ((RemoteGqlSubredditDataSource$getSubscribedSubreddits$1)o).label = 1;
            b = e$a.b(10, (k)tc, (ur0.e)a, (RetryAlgo)null, map, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            remoteGqlSubredditDataSource = this;
        }
        final tc$g a2 = ((tc$c)b).a;
        Object instance = null;
        Label_0318: {
            if (a2 != null) {
                final tc$m b2 = a2.b;
                if (b2 != null) {
                    final List b3 = b2.b;
                    if (b3 != null) {
                        final ArrayList<Subreddit> list = new ArrayList<Subreddit>();
                        final Iterator iterator = b3.iterator();
                        while (true) {
                            instance = list;
                            if (!iterator.hasNext()) {
                                break Label_0318;
                            }
                            final tc$e tc$e = (tc$e)iterator.next();
                            Subreddit map2 = null;
                            Label_0301: {
                                if (tc$e != null) {
                                    final tc$h b4 = tc$e.b;
                                    if (b4 != null) {
                                        final tc$h$a b5 = b4.b;
                                        if (b5 != null) {
                                            final SubredditDetailsFragment a3 = b5.a;
                                            if (a3 != null) {
                                                final GqlSubredditMapper instance2 = GqlSubredditMapper.INSTANCE;
                                                final JsonAdapter<List<FlairRichTextItem>> f = remoteGqlSubredditDataSource.f();
                                                ah2.f.e((Object)f, "richTextAdapter");
                                                map2 = instance2.map(a3, (JsonAdapter)f);
                                                break Label_0301;
                                            }
                                        }
                                    }
                                }
                                map2 = null;
                            }
                            if (map2 == null) {
                                continue;
                            }
                            list.add(map2);
                        }
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        Object instance3 = null;
        Label_0483: {
            if (a2 != null) {
                final tc$f c2 = a2.c;
                if (c2 != null) {
                    final List b6 = c2.b;
                    if (b6 != null) {
                        final ArrayList<Subreddit> list2 = new ArrayList<Subreddit>();
                        final Iterator iterator2 = b6.iterator();
                        while (true) {
                            instance3 = list2;
                            if (!iterator2.hasNext()) {
                                break Label_0483;
                            }
                            final tc$d tc$d = (tc$d)iterator2.next();
                            Subreddit map3 = null;
                            Label_0465: {
                                if (tc$d != null) {
                                    final tc$i b7 = tc$d.b;
                                    if (b7 != null) {
                                        final tc$a b8 = b7.b;
                                        if (b8 != null) {
                                            final tc$l b9 = b8.b;
                                            if (b9 != null) {
                                                final tc$l$a b10 = b9.b;
                                                if (b10 != null) {
                                                    final ProfileDetailsFragment a4 = b10.a;
                                                    if (a4 != null) {
                                                        final GqlSubredditMapper instance4 = GqlSubredditMapper.INSTANCE;
                                                        final JsonAdapter<List<FlairRichTextItem>> f2 = remoteGqlSubredditDataSource.f();
                                                        ah2.f.e((Object)f2, "richTextAdapter");
                                                        map3 = instance4.map(a4, (JsonAdapter)f2);
                                                        break Label_0465;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                map3 = null;
                            }
                            if (map3 == null) {
                                continue;
                            }
                            list2.add(map3);
                        }
                    }
                }
            }
            instance3 = EmptyList.INSTANCE;
        }
        if (remoteGqlSubredditDataSource.k.k6()) {
            final jw0.a j = remoteGqlSubredditDataSource.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("Communities list subscribed: ");
            sb.append(instance);
            sb.append(" followed: ");
            sb.append(instance3);
            j.c((Throwable)new RuntimeException(sb.toString()));
        }
        return CollectionsKt___CollectionsKt.N1((Iterable)instance3, (Collection)instance);
    }
    
    public final Object m(int n, String element, final String s, final Map map, final c c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1) {
                final RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1 remoteGqlSubredditDataSource$getSubscribedSubredditsListing$1 = (RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)c;
                final int label = remoteGqlSubredditDataSource$getSubscribedSubredditsListing$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getSubscribedSubredditsListing$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getSubscribedSubredditsListing$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1(this, (c<? super RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1>)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).label;
        final boolean b = true;
        Object o2;
        Object o3;
        Object b2;
        Ref$BooleanRef ref$BooleanRef2;
        RemoteGqlSubredditDataSource remoteGqlSubredditDataSource2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef)((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).L$3;
            o2 = ((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).L$2;
            o3 = ((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).L$1;
            final RemoteGqlSubredditDataSource remoteGqlSubredditDataSource = (RemoteGqlSubredditDataSource)((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).L$0;
            aj2.c.Q0(result);
            b2 = result;
            ref$BooleanRef2 = ref$BooleanRef;
            remoteGqlSubredditDataSource2 = remoteGqlSubredditDataSource;
        }
        else {
            aj2.c.Q0(result);
            final Ref$ObjectRef l$1 = new Ref$ObjectRef();
            final Ref$ObjectRef l$2 = new Ref$ObjectRef();
            final Ref$BooleanRef l$3 = new Ref$BooleanRef();
            final g a = this.a;
            final tc tc = new tc(h$a.c((Object)element), a.f(n), h$a.c((Object)s), 9);
            ((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).L$0 = this;
            ((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).L$1 = l$1;
            ((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).L$2 = l$2;
            ((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).L$3 = l$3;
            ((RemoteGqlSubredditDataSource$getSubscribedSubredditsListing$1)o).label = 1;
            b2 = e$a.b(10, (k)tc, (ur0.e)a, (RetryAlgo)null, map, (c)o, (OkHttpClient)null);
            if (b2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlSubredditDataSource2 = this;
            o3 = l$1;
            o2 = l$2;
            ref$BooleanRef2 = l$3;
        }
        final tc$g a2 = ((tc$c)b2).a;
        final Object o4 = null;
        Object instance = null;
        Label_0457: {
            if (a2 != null) {
                final tc$m b3 = a2.b;
                if (b3 != null) {
                    final List b4 = b3.b;
                    if (b4 != null) {
                        final ArrayList<Subreddit> list = new ArrayList<Subreddit>();
                        final Iterator iterator = b4.iterator();
                        while (true) {
                            instance = list;
                            if (!iterator.hasNext()) {
                                break Label_0457;
                            }
                            final tc$e tc$e = (tc$e)iterator.next();
                            Subreddit map2 = null;
                            Label_0438: {
                                if (tc$e != null) {
                                    final tc$h b5 = tc$e.b;
                                    if (b5 != null) {
                                        final tc$h$a b6 = b5.b;
                                        if (b6 != null) {
                                            final SubredditDetailsFragment a3 = b6.a;
                                            if (a3 != null) {
                                                final GqlSubredditMapper instance2 = GqlSubredditMapper.INSTANCE;
                                                final JsonAdapter<List<FlairRichTextItem>> f = remoteGqlSubredditDataSource2.f();
                                                ah2.f.e((Object)f, "richTextAdapter");
                                                map2 = instance2.map(a3, (JsonAdapter)f);
                                                break Label_0438;
                                            }
                                        }
                                    }
                                }
                                map2 = null;
                            }
                            if (map2 == null) {
                                continue;
                            }
                            list.add(map2);
                        }
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        Label_0491: {
            if (a2 != null) {
                final tc$m b7 = a2.b;
                if (b7 != null) {
                    final tc$k c2 = b7.c;
                    if (c2 != null) {
                        element = c2.e;
                        break Label_0491;
                    }
                }
            }
            element = null;
        }
        boolean b9 = false;
        Label_0533: {
            if (a2 != null) {
                final tc$m b8 = a2.b;
                if (b8 != null) {
                    final tc$k c3 = b8.c;
                    if (c3 != null) {
                        b9 = c3.b;
                        break Label_0533;
                    }
                }
            }
            b9 = false;
        }
        if (!(boolean)b9) {
            element = null;
        }
        ((Ref$ObjectRef)o3).element = element;
        Object instance3 = null;
        Label_0721: {
            if (a2 != null) {
                final tc$f c4 = a2.c;
                if (c4 != null) {
                    final List b10 = c4.b;
                    if (b10 != null) {
                        final ArrayList<Subreddit> list2 = new ArrayList<Subreddit>();
                        final Iterator iterator2 = b10.iterator();
                        while (true) {
                            instance3 = list2;
                            if (!iterator2.hasNext()) {
                                break Label_0721;
                            }
                            final tc$d tc$d = (tc$d)iterator2.next();
                            Subreddit map3 = null;
                            Label_0702: {
                                if (tc$d != null) {
                                    final tc$i b11 = tc$d.b;
                                    if (b11 != null) {
                                        final tc$a b12 = b11.b;
                                        if (b12 != null) {
                                            final tc$l b13 = b12.b;
                                            if (b13 != null) {
                                                final tc$l$a b14 = b13.b;
                                                if (b14 != null) {
                                                    final ProfileDetailsFragment a4 = b14.a;
                                                    if (a4 != null) {
                                                        final GqlSubredditMapper instance4 = GqlSubredditMapper.INSTANCE;
                                                        final JsonAdapter<List<FlairRichTextItem>> f2 = remoteGqlSubredditDataSource2.f();
                                                        ah2.f.e((Object)f2, "richTextAdapter");
                                                        map3 = instance4.map(a4, (JsonAdapter)f2);
                                                        break Label_0702;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                map3 = null;
                            }
                            if (map3 == null) {
                                continue;
                            }
                            list2.add(map3);
                        }
                    }
                }
            }
            instance3 = EmptyList.INSTANCE;
        }
        Label_0755: {
            if (a2 != null) {
                final tc$f c5 = a2.c;
                if (c5 != null) {
                    final tc$j c6 = c5.c;
                    if (c6 != null) {
                        element = c6.e;
                        break Label_0755;
                    }
                }
            }
            element = null;
        }
        boolean b15 = false;
        Label_0797: {
            if (a2 != null) {
                final tc$f c7 = a2.c;
                if (c7 != null) {
                    final tc$j c8 = c7.c;
                    if (c8 != null) {
                        b15 = c8.b;
                        break Label_0797;
                    }
                }
            }
            b15 = false;
        }
        Object element2 = o4;
        if ((boolean)b15) {
            element2 = element;
        }
        ((Ref$ObjectRef)o2).element = element2;
        Label_0861: {
            if (a2 != null) {
                final tc$m b16 = a2.b;
                if (b16 != null) {
                    final tc$k c9 = b16.c;
                    if (c9 != null && c9.c) {
                        n = 1;
                        break Label_0861;
                    }
                }
            }
            n = 0;
        }
        boolean element3 = b;
        if (n == 0) {
            Label_0908: {
                if (a2 != null) {
                    final tc$f c10 = a2.c;
                    if (c10 != null) {
                        final tc$j c11 = c10.c;
                        if (c11 != null && c11.c) {
                            n = 1;
                            break Label_0908;
                        }
                    }
                }
                n = 0;
            }
            element3 = (n != 0 && b);
        }
        ref$BooleanRef2.element = element3;
        return new CommunityDrawerListing((List)CollectionsKt___CollectionsKt.N1((Iterable)instance3, (Collection)instance), (String)((Ref$ObjectRef)o3).element, (String)((Ref$ObjectRef)o2).element, ref$BooleanRef2.element, (SubredditListingProgressIndicator)null, 16, (DefaultConstructorMarker)null);
    }
    
    public final Object n(final boolean b, final String s, final boolean b2, final String s2, final boolean b3, final String s3, final int n, final c<? super UserSubredditPaginatedListing> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing.RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1) {
                final RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing.RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1 remoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1 = (RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing.RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1)c;
                final int label = remoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing.RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing.RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing.RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1)o).label;
        Object b4;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b4 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final ud ud = new ud(b, h$a.c((Object)s), b2, h$a.c((Object)s2), b3, h$a.c((Object)s3), a.f(n));
            ((RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing.RemoteGqlSubredditDataSource$getUserSubredditsPaginatedListing$1)o).label = 1;
            if ((b4 = e$a.b(14, (k)ud, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final ud$h a2 = ((ud$c)b4).a;
        ah2.f.c((Object)a2);
        final ud$r b5 = a2.b;
        final PaginatedListing paginatedListing = null;
        PaginatedListing paginatedListing2;
        if (b5 != null) {
            final List b6 = b5.b;
            final ArrayList<SubredditListItem> list = new ArrayList<SubredditListItem>();
            for (final ud$f ud$f : b6) {
                SubredditListItem map = null;
                Label_0303: {
                    if (ud$f != null) {
                        final ud$j b7 = ud$f.b;
                        if (b7 != null) {
                            final ud$j$a b8 = b7.b;
                            if (b8 != null) {
                                final SubredditListItemFragment a3 = b8.a;
                                if (a3 != null) {
                                    map = GqlSubredditMapper.INSTANCE.map(a3);
                                    break Label_0303;
                                }
                            }
                        }
                    }
                    map = null;
                }
                if (map != null) {
                    list.add(map);
                }
            }
            final sh a4 = b5.c.b.a;
            paginatedListing2 = new PaginatedListing(list, a4.c, a4.b);
        }
        else {
            paginatedListing2 = null;
        }
        final ud$g c2 = a2.c;
        PaginatedListing paginatedListing3;
        if (c2 != null) {
            final List b9 = c2.b;
            final ArrayList<SubredditListItem> list2 = new ArrayList<SubredditListItem>();
            for (final ud$d ud$d : b9) {
                SubredditListItem map2 = null;
                Label_0492: {
                    if (ud$d != null) {
                        final ud$k b10 = ud$d.b;
                        if (b10 != null) {
                            final ud$a b11 = b10.b;
                            if (b11 != null) {
                                final ud$p b12 = b11.b;
                                if (b12 != null) {
                                    final ud$p$a b13 = b12.b;
                                    if (b13 != null) {
                                        final ProfileListItemFragment a5 = b13.a;
                                        if (a5 != null) {
                                            map2 = GqlSubredditMapper.INSTANCE.map(a5);
                                            break Label_0492;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    map2 = null;
                }
                if (map2 != null) {
                    list2.add(map2);
                }
            }
            final sh a6 = c2.c.b.a;
            paginatedListing3 = new PaginatedListing(list2, a6.c, a6.b);
        }
        else {
            paginatedListing3 = null;
        }
        final ud$q d = a2.d;
        PaginatedListing paginatedListing4 = paginatedListing;
        if (d != null) {
            final ud$i b14 = d.b;
            paginatedListing4 = paginatedListing;
            if (b14 != null) {
                final List b15 = b14.b;
                final ArrayList<SubredditListItem> list3 = new ArrayList<SubredditListItem>();
                for (final ud$e ud$e : b15) {
                    SubredditListItem map3 = null;
                    Label_0684: {
                        if (ud$e != null) {
                            final ud$l b16 = ud$e.b;
                            if (b16 != null) {
                                final ud$l$a b17 = b16.b;
                                if (b17 != null) {
                                    final SubredditListItemFragment a7 = b17.a;
                                    if (a7 != null) {
                                        map3 = GqlSubredditMapper.INSTANCE.map(a7);
                                        break Label_0684;
                                    }
                                }
                            }
                        }
                        map3 = null;
                    }
                    if (map3 != null) {
                        list3.add(map3);
                    }
                }
                final sh a8 = b14.c.b.a;
                paginatedListing4 = new PaginatedListing(list3, a8.c, a8.b);
            }
        }
        return new UserSubredditPaginatedListing(paginatedListing2, paginatedListing4, paginatedListing3);
    }
    
    public final Object o(String s, final String s2, final String s3, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage.RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1) {
                final RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage.RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1 remoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1 = (RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage.RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1)c;
                final int label = remoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage.RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage.RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage.RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1)o).label;
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
            final s8 s4 = new s8(new w4((Object)s3, s, s2));
            ((RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage.RemoteGqlSubredditDataSource$updateSubredditCountryAndLanguage$1)o).label = 1;
            if ((b = e$a.b(14, (k)s4, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final s8$b s8$b = (s8$b)b;
        final s8$e a2 = s8$b.a;
        Label_0256: {
            if (a2 != null) {
                final List c2 = a2.c;
                if (c2 != null) {
                    final ArrayList list = new ArrayList<String>(m.P0((Iterable)c2, 10));
                    final Iterator iterator = c2.iterator();
                    while (iterator.hasNext()) {
                        list.add(((s8$c)iterator.next()).b);
                    }
                    s = (String)CollectionsKt___CollectionsKt.s1((List)list);
                    break Label_0256;
                }
            }
            s = null;
        }
        final s8$e a3 = s8$b.a;
        final boolean b2 = a3 != null && a3.b;
        if (b2) {
            return new UpdateResponse(b2, s);
        }
        throw new IllegalStateException(new Exception(s).toString());
    }
    
    public final Object p(String b, final boolean b2, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSubredditDataSource$updateSubredditFavoriteState.RemoteGqlSubredditDataSource$updateSubredditFavoriteState$1) {
                final RemoteGqlSubredditDataSource$updateSubredditFavoriteState.RemoteGqlSubredditDataSource$updateSubredditFavoriteState$1 remoteGqlSubredditDataSource$updateSubredditFavoriteState$1 = (RemoteGqlSubredditDataSource$updateSubredditFavoriteState.RemoteGqlSubredditDataSource$updateSubredditFavoriteState$1)c;
                final int label = remoteGqlSubredditDataSource$updateSubredditFavoriteState$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditDataSource$updateSubredditFavoriteState$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditDataSource$updateSubredditFavoriteState$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSubredditDataSource$updateSubredditFavoriteState.RemoteGqlSubredditDataSource$updateSubredditFavoriteState$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditDataSource$updateSubredditFavoriteState.RemoteGqlSubredditDataSource$updateSubredditFavoriteState$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditDataSource$updateSubredditFavoriteState.RemoteGqlSubredditDataSource$updateSubredditFavoriteState$1)o).label;
        Object b3;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b3 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            FavoriteState favoriteState;
            if (b2) {
                favoriteState = FavoriteState.FAVORITED;
            }
            else {
                favoriteState = FavoriteState.NONE;
            }
            final u8 u8 = new u8(new x4(b, favoriteState));
            ((RemoteGqlSubredditDataSource$updateSubredditFavoriteState.RemoteGqlSubredditDataSource$updateSubredditFavoriteState$1)o).label = 1;
            if ((b3 = e$a.b(14, (k)u8, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final u8$d a2 = ((u8$b)b3).a;
        final boolean b4 = a2 != null && a2.b;
        if (a2 != null) {
            final List c2 = a2.c;
            if (c2 != null) {
                final u8$c u8$c = (u8$c)CollectionsKt___CollectionsKt.s1(c2);
                if (u8$c != null) {
                    b = u8$c.b;
                    return new UpdateResponse(b4, b);
                }
            }
        }
        b = null;
        return new UpdateResponse(b4, b);
    }
}
