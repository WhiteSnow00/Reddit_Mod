// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.survey.repository;

import mg2.p;
import kotlin.coroutines.CoroutineContext;
import javax.inject.Inject;
import ng2.e;
import android.content.Context;
import ws0.a;
import z60.c;
import mr0.g;

public final class RemoteGqlSurveyDataSource
{
    public final g a;
    public final c b;
    public final a c;
    public final d20.a d;
    
    @Inject
    public RemoteGqlSurveyDataSource(final Context context, final g a, final c b, final a c, final d20.a d) {
        e.f((Object)context, "context");
        e.f((Object)a, "graphQlClient");
        e.f((Object)b, "surveyPrefs");
        e.f((Object)c, "appSettings");
        e.f((Object)d, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(final gg2.c<? super xe0.a> c) {
        return zi2.g.j((CoroutineContext)this.d.c(), (p)new RemoteGqlSurveyDataSource$loadSurvey$2(this, (gg2.c)null), c);
    }
}
