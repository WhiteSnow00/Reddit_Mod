// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.queries.pd$c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.queries.pd$b;
import com.reddit.queries.pd;
import com.reddit.domain.model.UserLocation;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import com.reddit.queries.GeoPlaceAutocompleteQuery$b;
import com.reddit.domain.model.GeoAutocompleteSuggestion;
import java.util.ArrayList;
import qg2.m;
import com.reddit.queries.GeoPlaceAutocompleteQuery$Data;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.GeoPlaceAutocompleteQuery;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class RemoteGqlGeoDataSource
{
    public final g a;
    
    @Inject
    public RemoteGqlGeoDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Serializable a(final String s, final String s2, final c c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlGeoDataSource$getAutocompleteSuggestions$1) {
                final RemoteGqlGeoDataSource$getAutocompleteSuggestions$1 remoteGqlGeoDataSource$getAutocompleteSuggestions$1 = (RemoteGqlGeoDataSource$getAutocompleteSuggestions$1)c;
                final int label = remoteGqlGeoDataSource$getAutocompleteSuggestions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlGeoDataSource$getAutocompleteSuggestions$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlGeoDataSource$getAutocompleteSuggestions$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlGeoDataSource$getAutocompleteSuggestions$1(this, (c<? super RemoteGqlGeoDataSource$getAutocompleteSuggestions$1>)c);
        }
        final Object result = ((RemoteGqlGeoDataSource$getAutocompleteSuggestions$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlGeoDataSource$getAutocompleteSuggestions$1)o).label;
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
            final GeoPlaceAutocompleteQuery geoPlaceAutocompleteQuery = new GeoPlaceAutocompleteQuery(s, s2);
            ((RemoteGqlGeoDataSource$getAutocompleteSuggestions$1)o).label = 1;
            if ((b = e$a.b(14, (k)geoPlaceAutocompleteQuery, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        final List a2 = ((GeoPlaceAutocompleteQuery$Data)b).a;
        Object instance;
        if (a2 != null) {
            final ArrayList list = new ArrayList<GeoAutocompleteSuggestion>(m.P0((Iterable)a2, 10));
            final Iterator iterator = a2.iterator();
            while (true) {
                instance = list;
                if (!iterator.hasNext()) {
                    break;
                }
                final GeoPlaceAutocompleteQuery$b geoPlaceAutocompleteQuery$b = (GeoPlaceAutocompleteQuery$b)iterator.next();
                list.add((Object)new GeoAutocompleteSuggestion(geoPlaceAutocompleteQuery$b.b, geoPlaceAutocompleteQuery$b.c, geoPlaceAutocompleteQuery$b.d.getRawValue()));
            }
        }
        else {
            instance = EmptyList.INSTANCE;
        }
        return (Serializable)instance;
    }
    
    public final Object b(final c<? super UserLocation> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlGeoDataSource$getUserLocation.RemoteGqlGeoDataSource$getUserLocation$1) {
                final RemoteGqlGeoDataSource$getUserLocation.RemoteGqlGeoDataSource$getUserLocation$1 remoteGqlGeoDataSource$getUserLocation$1 = (RemoteGqlGeoDataSource$getUserLocation.RemoteGqlGeoDataSource$getUserLocation$1)c;
                final int label = remoteGqlGeoDataSource$getUserLocation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlGeoDataSource$getUserLocation$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlGeoDataSource$getUserLocation$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlGeoDataSource$getUserLocation.RemoteGqlGeoDataSource$getUserLocation$1(this, (c)c);
        }
        final Object result = ((RemoteGqlGeoDataSource$getUserLocation.RemoteGqlGeoDataSource$getUserLocation$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlGeoDataSource$getUserLocation.RemoteGqlGeoDataSource$getUserLocation$1)o).label;
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
            final pd pd = new pd();
            ((RemoteGqlGeoDataSource$getUserLocation.RemoteGqlGeoDataSource$getUserLocation$1)o).label = 1;
            if ((b = e$a.b(14, (k)pd, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final pd$c a2 = ((pd$b)b).a;
        UserLocation userLocation;
        if (a2 != null) {
            userLocation = new UserLocation(a2.b, a2.c, a2.d, a2.e);
        }
        else {
            userLocation = new UserLocation(null, null, null, null, 15, null);
        }
        return userLocation;
    }
}
