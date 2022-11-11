// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.survey.datasource;

import java.util.ArrayList;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.survey.datasource.DatabaseSurveyDataSource", f = "DatabaseSurveyDataSource.kt", l = { 31 }, m = "getSurveyTriggerCounts")
final class DatabaseSurveyDataSource$getSurveyTriggerCounts$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DatabaseSurveyDataSource this$0;
    
    public DatabaseSurveyDataSource$getSurveyTriggerCounts$1(final DatabaseSurveyDataSource this$0, final tg2.c<? super DatabaseSurveyDataSource$getSurveyTriggerCounts$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, (tg2.c)this);
    }
}
