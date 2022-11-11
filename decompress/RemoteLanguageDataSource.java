// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools.remote;

import java.util.Iterator;
import com.reddit.domain.model.Result$Success;
import com.reddit.queries.ActiveLanguagesQuery$a;
import java.util.ArrayList;
import qg2.m;
import com.reddit.queries.ActiveLanguagesQuery$Data;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.ActiveLanguagesQuery;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.modtools.language.Language;
import java.util.List;
import com.reddit.domain.model.Result;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class RemoteLanguageDataSource
{
    public final g a;
    
    @Inject
    public RemoteLanguageDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(final c<? super Result<? extends List<Language>>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteLanguageDataSource$getActiveLanguages.RemoteLanguageDataSource$getActiveLanguages$1) {
                final RemoteLanguageDataSource$getActiveLanguages.RemoteLanguageDataSource$getActiveLanguages$1 remoteLanguageDataSource$getActiveLanguages$1 = (RemoteLanguageDataSource$getActiveLanguages.RemoteLanguageDataSource$getActiveLanguages$1)c;
                final int label = remoteLanguageDataSource$getActiveLanguages$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteLanguageDataSource$getActiveLanguages$1.label = label + Integer.MIN_VALUE;
                    o = remoteLanguageDataSource$getActiveLanguages$1;
                    break Label_0047;
                }
            }
            o = new RemoteLanguageDataSource$getActiveLanguages.RemoteLanguageDataSource$getActiveLanguages$1(this, (c)c);
        }
        final Object result = ((RemoteLanguageDataSource$getActiveLanguages.RemoteLanguageDataSource$getActiveLanguages$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteLanguageDataSource$getActiveLanguages.RemoteLanguageDataSource$getActiveLanguages$1)o).label;
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
            final ActiveLanguagesQuery activeLanguagesQuery = new ActiveLanguagesQuery();
            ((RemoteLanguageDataSource$getActiveLanguages.RemoteLanguageDataSource$getActiveLanguages$1)o).label = 1;
            if ((b = e$a.b(14, (k)activeLanguagesQuery, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final List a2 = ((ActiveLanguagesQuery$Data)b).a;
        final ArrayList list = new ArrayList<Language>(m.P0((Iterable)a2, 10));
        for (final ActiveLanguagesQuery$a activeLanguagesQuery$a : a2) {
            list.add(new Language(activeLanguagesQuery$a.c.toString(), activeLanguagesQuery$a.b));
        }
        return new Result$Success((Object)list);
    }
}
