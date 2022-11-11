// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.survey.repository;

import zg2.p;
import kotlin.coroutines.CoroutineContext;
import javax.inject.Inject;
import ah2.f;
import android.content.Context;
import bt0.a;
import f70.c;
import ur0.g;

public final class RemoteGqlSurveyDataSource
{
    public final g a;
    public final c b;
    public final a c;
    public final e20.a d;
    
    @Inject
    public RemoteGqlSurveyDataSource(final Context context, final g a, final c b, final a c, final e20.a d) {
        f.f((Object)context, "context");
        f.f((Object)a, "graphQlClient");
        f.f((Object)b, "surveyPrefs");
        f.f((Object)c, "appSettings");
        f.f((Object)d, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(final tg2.c<? super gf0.a> c) {
        return mj2.g.l((CoroutineContext)this.d.c(), (p)new RemoteGqlSurveyDataSource$loadSurvey$2(this, (tg2.c)null), (tg2.c)c);
    }
}
