// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups;

import com.reddit.type.SubredditBenefit;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.powerups.RemoteGqlPowerupsDataSource", f = "RemoteGqlPowerupsDataSource.kt", l = { 172 }, m = "updateBenefitSetting")
final class RemoteGqlPowerupsDataSource$updateBenefitSetting$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RemoteGqlPowerupsDataSource this$0;
    
    public RemoteGqlPowerupsDataSource$updateBenefitSetting$1(final RemoteGqlPowerupsDataSource this$0, final tg2.c<? super RemoteGqlPowerupsDataSource$updateBenefitSetting$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, false, (tg2.c)this);
    }
}
