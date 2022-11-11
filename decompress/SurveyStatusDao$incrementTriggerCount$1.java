// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.dao;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.room.dao.SurveyStatusDao$DefaultImpls", f = "SurveyStatusDao.kt", l = { 20, 29 }, m = "incrementTriggerCount")
final class SurveyStatusDao$incrementTriggerCount$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    
    public SurveyStatusDao$incrementTriggerCount$1(final tg2.c<? super SurveyStatusDao$incrementTriggerCount$1> c) {
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return g.a.a(null, null, (tg2.c)this);
    }
}
