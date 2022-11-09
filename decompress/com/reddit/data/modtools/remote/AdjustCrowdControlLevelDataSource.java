// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools.remote;

import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import com.reddit.mutations.i7$d;
import com.reddit.mutations.i7$b;
import com.reddit.mutations.i7;
import o22.f4;
import com.reddit.type.CrowdControlLevel;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.domain.modtools.crowdcontrol.usecase.UpdateCrowdControlLevelUseCase;
import com.reddit.mutations.z6$d;
import com.reddit.mutations.z6$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.z6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class AdjustCrowdControlLevelDataSource
{
    public final g a;
    
    @Inject
    public AdjustCrowdControlLevelDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(final String s, final boolean b, final c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof AdjustCrowdControlLevelDataSource$updateCrowdControlFilter.AdjustCrowdControlLevelDataSource$updateCrowdControlFilter$1) {
                final AdjustCrowdControlLevelDataSource$updateCrowdControlFilter.AdjustCrowdControlLevelDataSource$updateCrowdControlFilter$1 adjustCrowdControlLevelDataSource$updateCrowdControlFilter$1 = (AdjustCrowdControlLevelDataSource$updateCrowdControlFilter.AdjustCrowdControlLevelDataSource$updateCrowdControlFilter$1)c;
                final int label = adjustCrowdControlLevelDataSource$updateCrowdControlFilter$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    adjustCrowdControlLevelDataSource$updateCrowdControlFilter$1.label = label + Integer.MIN_VALUE;
                    o = adjustCrowdControlLevelDataSource$updateCrowdControlFilter$1;
                    break Label_0054;
                }
            }
            o = new AdjustCrowdControlLevelDataSource$updateCrowdControlFilter.AdjustCrowdControlLevelDataSource$updateCrowdControlFilter$1(this, (c)c);
        }
        final Object result = ((AdjustCrowdControlLevelDataSource$updateCrowdControlFilter.AdjustCrowdControlLevelDataSource$updateCrowdControlFilter$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((AdjustCrowdControlLevelDataSource$updateCrowdControlFilter.AdjustCrowdControlLevelDataSource$updateCrowdControlFilter$1)o).label;
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
            final z6 z6 = new z6(s, b);
            ((AdjustCrowdControlLevelDataSource$updateCrowdControlFilter.AdjustCrowdControlLevelDataSource$updateCrowdControlFilter$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)z6, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final z6$d a2 = ((z6$b)b2).a;
        return a2 != null && a2.b;
    }
    
    public final Object b(final UpdateCrowdControlLevelUseCase.Params params, final c<? super Boolean> c) {
        AdjustCrowdControlLevelDataSource$updateCrowdControlLevel.AdjustCrowdControlLevelDataSource$updateCrowdControlLevel$1 adjustCrowdControlLevelDataSource$updateCrowdControlLevel$1 = null;
        Label_0048: {
            if (c instanceof AdjustCrowdControlLevelDataSource$updateCrowdControlLevel.AdjustCrowdControlLevelDataSource$updateCrowdControlLevel$1) {
                adjustCrowdControlLevelDataSource$updateCrowdControlLevel$1 = (AdjustCrowdControlLevelDataSource$updateCrowdControlLevel.AdjustCrowdControlLevelDataSource$updateCrowdControlLevel$1)c;
                final int label = adjustCrowdControlLevelDataSource$updateCrowdControlLevel$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    adjustCrowdControlLevelDataSource$updateCrowdControlLevel$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            adjustCrowdControlLevelDataSource$updateCrowdControlLevel$1 = new AdjustCrowdControlLevelDataSource$updateCrowdControlLevel.AdjustCrowdControlLevelDataSource$updateCrowdControlLevel$1(this, (c)c);
        }
        final Object result = adjustCrowdControlLevelDataSource$updateCrowdControlLevel$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = adjustCrowdControlLevelDataSource$updateCrowdControlLevel$1.label;
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
            final int n = AdjustCrowdControlLevelDataSource.a.a[((Enum)params.getCrowdControlLevel()).ordinal()];
            CrowdControlLevel crowdControlLevel;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        crowdControlLevel = CrowdControlLevel.STRICT;
                    }
                    else {
                        crowdControlLevel = CrowdControlLevel.MEDIUM;
                    }
                }
                else {
                    crowdControlLevel = CrowdControlLevel.LENIENT;
                }
            }
            else {
                crowdControlLevel = CrowdControlLevel.OFF;
            }
            final g a = this.a;
            final i7 i7 = new i7(new f4(params.getPostId(), crowdControlLevel));
            adjustCrowdControlLevelDataSource$updateCrowdControlLevel$1.label = 1;
            if ((b = e$a.b(14, (k)i7, (e)a, (RetryAlgo)null, (Map)null, (c)adjustCrowdControlLevelDataSource$updateCrowdControlLevel$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final i7$d a2 = ((i7$b)b).a;
        return a2 != null && a2.b;
    }
}
