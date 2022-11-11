// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.karma_statistics.local;

import s70.a;
import i60.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import tg2.c;
import javax.inject.Inject;
import h60.v;
import y40.b;

public final class LocalStatisticsDataSource implements b
{
    public final v a;
    
    @Inject
    public LocalStatisticsDataSource(final v a) {
        this.a = a;
    }
    
    public final Object a(final long n, final c<? super Long> c) {
        return this.a.a0(n, (c)c);
    }
    
    public final Object b(final long n, final c<? super j> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1) {
                final LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1 localStatisticsDataSource$compactDatabase$1 = (LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1)c;
                final int label = localStatisticsDataSource$compactDatabase$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    localStatisticsDataSource$compactDatabase$1.label = label + Integer.MIN_VALUE;
                    o = localStatisticsDataSource$compactDatabase$1;
                    break Label_0054;
                }
            }
            o = new LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1(this, (c)c);
        }
        final Object result = ((LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1)o).label;
        LocalStatisticsDataSource localStatisticsDataSource;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    aj2.c.Q0(result);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                localStatisticsDataSource = (LocalStatisticsDataSource)((LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1)o).L$0;
                aj2.c.Q0(result);
            }
        }
        else {
            aj2.c.Q0(result);
            final v a = this.a;
            ((LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1)o).L$0 = this;
            ((LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1)o).label = 1;
            if (a.m1(n, (c)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            localStatisticsDataSource = this;
        }
        final v a2 = localStatisticsDataSource.a;
        ((LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1)o).L$0 = null;
        ((LocalStatisticsDataSource$compactDatabase.LocalStatisticsDataSource$compactDatabase$1)o).label = 2;
        if (a2.r((c)o) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
    
    public final j c(final y40.c c) {
        ((a)this.a).N((Object[])new i[] { new i(c.a, c.b) });
        return j.a;
    }
}
