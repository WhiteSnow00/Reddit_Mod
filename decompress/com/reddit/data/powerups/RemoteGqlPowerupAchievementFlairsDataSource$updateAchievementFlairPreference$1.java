// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups;

import java.util.List;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.powerups.RemoteGqlPowerupAchievementFlairsDataSource", f = "RemoteGqlPowerupAchievementFlairsDataSource.kt", l = { 74 }, m = "updateAchievementFlairPreference")
final class RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ b this$0;
    
    public RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1(final b this$0, final tg2.c<? super RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, (tg2.c)this, false);
    }
}
