// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.s8$e;
import com.reddit.mutations.s8$c;
import com.reddit.mutations.s8$b;
import com.reddit.mutations.s8;
import o22.w4;
import com.reddit.mutations.f6$d;
import com.reddit.mutations.f6$c;
import com.reddit.mutations.f6$b;
import com.reddit.mutations.f6;
import o22.q3;
import o22.f1;
import com.reddit.type.GeoPlaceSource$a;
import com.reddit.type.GeoPlaceSource;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.queries.l5$d;
import com.reddit.queries.l5$a;
import com.reddit.queries.l5$e;
import com.reddit.queries.l5$c;
import com.reddit.queries.l5;
import kl0.sh;
import com.reddit.queries.w1$h$a;
import com.reddit.queries.w1$h;
import com.reddit.queries.w1$e;
import com.reddit.fragment.MediaSourceFragment;
import com.reddit.fragment.SubredditFragment$a$a;
import com.reddit.fragment.SubredditFragment$a;
import com.reddit.queries.w1$f;
import com.reddit.fragment.SubredditFragment$d;
import com.reddit.fragment.SubredditFragment;
import java.util.Iterator;
import com.reddit.queries.w1$d;
import com.reddit.domain.model.listing.Listing;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.GeoAutocompleteSuggestion;
import com.reddit.domain.model.mod.ModPermissions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.SubredditCountrySiteSettings;
import java.util.List;
import com.reddit.notification.common.NotificationLevel;
import com.reddit.domain.model.Subreddit;
import java.util.Locale;
import z10.w;
import com.reddit.domain.model.GeoTaggingCommunity;
import qg2.m;
import com.reddit.queries.w1$c;
import com.reddit.queries.w1$g;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.queries.w1$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.w1;
import h7.h$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class CrowdsourceTaggingDataSource
{
    public final g a;
    
    @Inject
    public CrowdsourceTaggingDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(final String s, final int n, final c c) {
        CrowdsourceTaggingDataSource$getGeoTaggingCommunities$1 crowdsourceTaggingDataSource$getGeoTaggingCommunities$2 = null;
        Label_0054: {
            if (c instanceof CrowdsourceTaggingDataSource$getGeoTaggingCommunities$1) {
                final CrowdsourceTaggingDataSource$getGeoTaggingCommunities$1 crowdsourceTaggingDataSource$getGeoTaggingCommunities$1 = (CrowdsourceTaggingDataSource$getGeoTaggingCommunities$1)c;
                final int label = crowdsourceTaggingDataSource$getGeoTaggingCommunities$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    crowdsourceTaggingDataSource$getGeoTaggingCommunities$1.label = label + Integer.MIN_VALUE;
                    crowdsourceTaggingDataSource$getGeoTaggingCommunities$2 = crowdsourceTaggingDataSource$getGeoTaggingCommunities$1;
                    break Label_0054;
                }
            }
            crowdsourceTaggingDataSource$getGeoTaggingCommunities$2 = new CrowdsourceTaggingDataSource$getGeoTaggingCommunities$1(this, (c<? super CrowdsourceTaggingDataSource$getGeoTaggingCommunities$1>)c);
        }
        final Object result = crowdsourceTaggingDataSource$getGeoTaggingCommunities$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = crowdsourceTaggingDataSource$getGeoTaggingCommunities$2.label;
        CrowdsourceTaggingDataSource crowdsourceTaggingDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            crowdsourceTaggingDataSource = (CrowdsourceTaggingDataSource)crowdsourceTaggingDataSource$getGeoTaggingCommunities$2.L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final w1 w1 = new w1(h$a.c((Object)s), a.f(n));
            crowdsourceTaggingDataSource$getGeoTaggingCommunities$2.L$0 = this;
            crowdsourceTaggingDataSource$getGeoTaggingCommunities$2.label = 1;
            b = e$a.b(14, (k)w1, (e)a, (RetryAlgo)null, (Map)null, (c)crowdsourceTaggingDataSource$getGeoTaggingCommunities$2, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            crowdsourceTaggingDataSource = this;
        }
        final w1$d a2 = ((w1$b)b).a;
        ArrayList<GeoTaggingCommunity> list2 = null;
        w1$d w1$d = null;
        Label_1105: {
            if (a2 != null) {
                final List c2 = a2.c;
                if (c2 != null) {
                    final ArrayList n2 = CollectionsKt___CollectionsKt.n1((Iterable)c2);
                    final ArrayList<w1$g> list = new ArrayList<w1$g>();
                    final Iterator iterator = n2.iterator();
                    while (iterator.hasNext()) {
                        final w1$g b2 = ((w1$c)iterator.next()).b;
                        if (b2 != null) {
                            list.add(b2);
                        }
                    }
                    list2 = new ArrayList<GeoTaggingCommunity>(m.P0((Iterable)list, 10));
                    final Iterator<w1$g> iterator2 = list.iterator();
                    final CrowdsourceTaggingDataSource crowdsourceTaggingDataSource2 = crowdsourceTaggingDataSource;
                    w1$d = a2;
                    while (iterator2.hasNext()) {
                        final w1$g w1$g = iterator2.next();
                        crowdsourceTaggingDataSource2.getClass();
                        final SubredditFragment a3 = w1$g.e.a;
                        final String g = w.g(a3.b);
                        final String b3 = a3.b;
                        final SubredditFragment$d n3 = a3.n;
                        String s2 = null;
                        Label_0418: {
                            if (n3 != null) {
                                final Object d = n3.d;
                                if (d != null && (s2 = d.toString()) != null) {
                                    break Label_0418;
                                }
                            }
                            final SubredditFragment$d n4 = a3.n;
                            if (n4 != null) {
                                final Object g2 = n4.g;
                                if (g2 != null) {
                                    s2 = g2.toString();
                                    break Label_0418;
                                }
                            }
                            s2 = null;
                        }
                        final boolean i = a3.i;
                        final w1$f d2 = w1$g.d;
                        Boolean value;
                        if (d2 != null) {
                            value = d2.c;
                        }
                        else {
                            value = null;
                        }
                        final String c3 = a3.c;
                        final String d3 = a3.d;
                        final SubredditFragment$d n5 = a3.n;
                        String string = null;
                        Label_0504: {
                            if (n5 != null) {
                                final Object e = n5.e;
                                if (e != null) {
                                    string = e.toString();
                                    break Label_0504;
                                }
                            }
                            string = null;
                        }
                        final SubredditFragment$d n6 = a3.n;
                        String s3 = null;
                        Label_0617: {
                            if (n6 != null) {
                                final Object b4 = n6.b;
                                if (b4 != null && (s3 = b4.toString()) != null) {
                                    break Label_0617;
                                }
                            }
                            final SubredditFragment$d n7 = a3.n;
                            if (n7 != null) {
                                final SubredditFragment$a c4 = n7.c;
                                if (c4 != null) {
                                    final SubredditFragment$a$a b5 = c4.b;
                                    if (b5 != null) {
                                        final MediaSourceFragment a4 = b5.a;
                                        if (a4 != null) {
                                            final Object b6 = a4.b;
                                            if (b6 != null) {
                                                s3 = b6.toString();
                                                break Label_0617;
                                            }
                                        }
                                    }
                                }
                            }
                            s3 = null;
                        }
                        final long n8 = (long)a3.h;
                        final String rawValue = a3.g.getRawValue();
                        final Locale us = Locale.US;
                        final String o = d.o(us, "US", rawValue, us, "this as java.lang.String).toLowerCase(locale)");
                        final SubredditFragment$d n9 = a3.n;
                        String s4 = null;
                        Label_0768: {
                            if (n9 != null) {
                                final Object b7 = n9.b;
                                if (b7 != null && (s4 = b7.toString()) != null) {
                                    break Label_0768;
                                }
                            }
                            final SubredditFragment$d n10 = a3.n;
                            if (n10 != null) {
                                final SubredditFragment$a c5 = n10.c;
                                if (c5 != null) {
                                    final SubredditFragment$a$a b8 = c5.b;
                                    if (b8 != null) {
                                        final MediaSourceFragment a5 = b8.a;
                                        if (a5 != null) {
                                            final Object b9 = a5.b;
                                            if (b9 != null) {
                                                s4 = b9.toString();
                                                break Label_0768;
                                            }
                                        }
                                    }
                                }
                            }
                            s4 = null;
                        }
                        final boolean e2 = a3.e;
                        final String f = a3.f;
                        final boolean j = a3.j;
                        final boolean l = a3.l;
                        final String m = a3.m;
                        String b10;
                        if ((b10 = w1$g.b) == null) {
                            b10 = "";
                        }
                        final Subreddit subreddit = new Subreddit(g, b3, c3, d3, s4, s2, (String)null, f, (String)null, (String)null, b10, Long.valueOf(n8), (Long)null, 0L, o, m, Boolean.valueOf(i), (Boolean)null, (String)null, (Boolean)null, (Boolean)null, Boolean.valueOf(e2), (String)null, (String)null, (String)null, (String)null, false, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, value, Boolean.valueOf(j), Boolean.valueOf(l), (NotificationLevel)null, (String)null, s3, string, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (String)null, (List)null, (Boolean)null, (Boolean)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (List)null, (String)null, (String)null, (SubredditCountrySiteSettings)null, (Boolean)null, (List)null, (Boolean)null, false, -2215104, -6593, 15, (DefaultConstructorMarker)null);
                        final w1$f d4 = w1$g.d;
                        ModPermissions modPermissions;
                        if (d4 != null) {
                            modPermissions = new ModPermissions(d4.c, d4.d, d4.e, d4.f, d4.g, d4.h, d4.i, d4.j, d4.b);
                        }
                        else {
                            modPermissions = null;
                        }
                        final w1$e c6 = w1$g.c;
                        GeoAutocompleteSuggestion geoAutocompleteSuggestion;
                        if (c6 != null) {
                            geoAutocompleteSuggestion = new GeoAutocompleteSuggestion(c6.b, c6.c, c6.d.getRawValue());
                        }
                        else {
                            geoAutocompleteSuggestion = null;
                        }
                        list2.add(new GeoTaggingCommunity(subreddit, modPermissions, geoAutocompleteSuggestion));
                    }
                    break Label_1105;
                }
            }
            w1$d = a2;
            list2 = null;
        }
        sh a6 = null;
        Label_1137: {
            if (w1$d != null) {
                final w1$h b11 = w1$d.b;
                if (b11 != null) {
                    final w1$h$a b12 = b11.b;
                    if (b12 != null) {
                        a6 = b12.a;
                        break Label_1137;
                    }
                }
            }
            a6 = null;
        }
        String s5 = null;
        Label_1167: {
            if (a6 != null) {
                final String c7 = a6.c;
                if (c7 != null && a6.b) {
                    s5 = c7;
                    break Label_1167;
                }
            }
            s5 = null;
        }
        Object instance = list2;
        if (list2 == null) {
            instance = EmptyList.INSTANCE;
        }
        return new Listing((List)instance, s5, null, null, null, false, null, 124, null);
    }
    
    public final Object b(final String s, final c<? super GeoAutocompleteSuggestion> c) {
        CrowdsourceTaggingDataSource$getSubredditGeoTag.CrowdsourceTaggingDataSource$getSubredditGeoTag$1 crowdsourceTaggingDataSource$getSubredditGeoTag$2 = null;
        Label_0050: {
            if (c instanceof CrowdsourceTaggingDataSource$getSubredditGeoTag.CrowdsourceTaggingDataSource$getSubredditGeoTag$1) {
                final CrowdsourceTaggingDataSource$getSubredditGeoTag.CrowdsourceTaggingDataSource$getSubredditGeoTag$1 crowdsourceTaggingDataSource$getSubredditGeoTag$1 = (CrowdsourceTaggingDataSource$getSubredditGeoTag.CrowdsourceTaggingDataSource$getSubredditGeoTag$1)c;
                final int label = crowdsourceTaggingDataSource$getSubredditGeoTag$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    crowdsourceTaggingDataSource$getSubredditGeoTag$1.label = label + Integer.MIN_VALUE;
                    crowdsourceTaggingDataSource$getSubredditGeoTag$2 = crowdsourceTaggingDataSource$getSubredditGeoTag$1;
                    break Label_0050;
                }
            }
            crowdsourceTaggingDataSource$getSubredditGeoTag$2 = new CrowdsourceTaggingDataSource$getSubredditGeoTag.CrowdsourceTaggingDataSource$getSubredditGeoTag$1(this, (c)c);
        }
        final Object result = crowdsourceTaggingDataSource$getSubredditGeoTag$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = crowdsourceTaggingDataSource$getSubredditGeoTag$2.label;
        CrowdsourceTaggingDataSource crowdsourceTaggingDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            crowdsourceTaggingDataSource = (CrowdsourceTaggingDataSource)crowdsourceTaggingDataSource$getSubredditGeoTag$2.L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final l5 l5 = new l5(s);
            crowdsourceTaggingDataSource$getSubredditGeoTag$2.L$0 = this;
            crowdsourceTaggingDataSource$getSubredditGeoTag$2.label = 1;
            b = e$a.b(14, (k)l5, (e)a, (RetryAlgo)null, (Map)null, (c)crowdsourceTaggingDataSource$getSubredditGeoTag$2, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            crowdsourceTaggingDataSource = this;
        }
        final l5$e a2 = ((l5$c)b).a;
        if (a2 != null) {
            final l5$a b2 = a2.b;
            if (b2 != null) {
                final l5$d b3 = b2.b;
                if (b3 != null) {
                    crowdsourceTaggingDataSource.getClass();
                    return new GeoAutocompleteSuggestion(b3.b, b3.c, b3.d.getRawValue());
                }
            }
        }
        return null;
    }
    
    public final Object c(String b, final String s, final GeoAutocompleteSuggestion geoAutocompleteSuggestion, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof CrowdsourceTaggingDataSource$suggestSubredditGeoTag.CrowdsourceTaggingDataSource$suggestSubredditGeoTag$1) {
                final CrowdsourceTaggingDataSource$suggestSubredditGeoTag.CrowdsourceTaggingDataSource$suggestSubredditGeoTag$1 crowdsourceTaggingDataSource$suggestSubredditGeoTag$1 = (CrowdsourceTaggingDataSource$suggestSubredditGeoTag.CrowdsourceTaggingDataSource$suggestSubredditGeoTag$1)c;
                final int label = crowdsourceTaggingDataSource$suggestSubredditGeoTag$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    crowdsourceTaggingDataSource$suggestSubredditGeoTag$1.label = label + Integer.MIN_VALUE;
                    o = crowdsourceTaggingDataSource$suggestSubredditGeoTag$1;
                    break Label_0059;
                }
            }
            o = new CrowdsourceTaggingDataSource$suggestSubredditGeoTag.CrowdsourceTaggingDataSource$suggestSubredditGeoTag$1(this, (c)c);
        }
        final Object result = ((CrowdsourceTaggingDataSource$suggestSubredditGeoTag.CrowdsourceTaggingDataSource$suggestSubredditGeoTag$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((CrowdsourceTaggingDataSource$suggestSubredditGeoTag.CrowdsourceTaggingDataSource$suggestSubredditGeoTag$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final String placeId = geoAutocompleteSuggestion.getPlaceId();
            final GeoPlaceSource$a companion = GeoPlaceSource.Companion;
            final String source = geoAutocompleteSuggestion.getSource();
            companion.getClass();
            final f6 f6 = new f6(new q3(b, new f1(placeId, s, GeoPlaceSource$a.a(source))));
            ((CrowdsourceTaggingDataSource$suggestSubredditGeoTag.CrowdsourceTaggingDataSource$suggestSubredditGeoTag$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)f6, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final f6$d a2 = ((f6$b)b2).a;
        final boolean b3 = a2 != null && a2.b;
        if (a2 != null) {
            final List c2 = a2.c;
            if (c2 != null) {
                final f6$c f6$c = (f6$c)CollectionsKt___CollectionsKt.s1(c2);
                if (f6$c != null) {
                    b = f6$c.b;
                    return new UpdateResponse(b3, b);
                }
            }
        }
        b = null;
        return new UpdateResponse(b3, b);
    }
    
    public final Object d(String s, final String s2, final String s3, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof CrowdsourceTaggingDataSource$updateSubredditCountrySite.CrowdsourceTaggingDataSource$updateSubredditCountrySite$1) {
                final CrowdsourceTaggingDataSource$updateSubredditCountrySite.CrowdsourceTaggingDataSource$updateSubredditCountrySite$1 crowdsourceTaggingDataSource$updateSubredditCountrySite$1 = (CrowdsourceTaggingDataSource$updateSubredditCountrySite.CrowdsourceTaggingDataSource$updateSubredditCountrySite$1)c;
                final int label = crowdsourceTaggingDataSource$updateSubredditCountrySite$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    crowdsourceTaggingDataSource$updateSubredditCountrySite$1.label = label + Integer.MIN_VALUE;
                    o = crowdsourceTaggingDataSource$updateSubredditCountrySite$1;
                    break Label_0059;
                }
            }
            o = new CrowdsourceTaggingDataSource$updateSubredditCountrySite.CrowdsourceTaggingDataSource$updateSubredditCountrySite$1(this, (c)c);
        }
        final Object result = ((CrowdsourceTaggingDataSource$updateSubredditCountrySite.CrowdsourceTaggingDataSource$updateSubredditCountrySite$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((CrowdsourceTaggingDataSource$updateSubredditCountrySite.CrowdsourceTaggingDataSource$updateSubredditCountrySite$1)o).label;
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
            ((CrowdsourceTaggingDataSource$updateSubredditCountrySite.CrowdsourceTaggingDataSource$updateSubredditCountrySite$1)o).label = 1;
            if ((b = e$a.b(14, (k)s4, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
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
        return new UpdateResponse(a3 != null && a3.b, s);
    }
}
