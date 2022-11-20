// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.remote;

import com.reddit.queries.r6$d;
import com.reddit.queries.r6$c;
import com.reddit.queries.r6$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import mr0.e$a;
import com.reddit.queries.r6;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import javax.inject.Inject;
import ay0.a;
import mr0.e;
import ay0.b;

public final class MatrixGqlDataSourceImpl implements b
{
    public final e a;
    
    @Inject
    public MatrixGqlDataSourceImpl(final a a) {
        this.a = (e)a;
    }
    
    public final Object a(final c<? super Integer> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof MatrixGqlDataSourceImpl$getUnreadMessageCount$1) {
                final MatrixGqlDataSourceImpl$getUnreadMessageCount$1 matrixGqlDataSourceImpl$getUnreadMessageCount$1 = (MatrixGqlDataSourceImpl$getUnreadMessageCount$1)c;
                final int label = matrixGqlDataSourceImpl$getUnreadMessageCount$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    matrixGqlDataSourceImpl$getUnreadMessageCount$1.label = label + Integer.MIN_VALUE;
                    o = matrixGqlDataSourceImpl$getUnreadMessageCount$1;
                    break Label_0047;
                }
            }
            o = new MatrixGqlDataSourceImpl$getUnreadMessageCount$1(this, (c)c);
        }
        final Object result = ((MatrixGqlDataSourceImpl$getUnreadMessageCount$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((MatrixGqlDataSourceImpl$getUnreadMessageCount$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            b = result;
        }
        else {
            d.b4(result);
            final e a = this.a;
            final r6 r6 = new r6();
            ((MatrixGqlDataSourceImpl$getUnreadMessageCount$1)o).label = 1;
            if ((b = e$a.b(14, (k)r6, a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final r6$c a2 = ((r6$b)b).a;
        if (a2 != null) {
            final r6$d b2 = a2.b;
            if (b2 != null) {
                final Integer b3 = b2.b;
                if (b3 != null) {
                    final int intValue = b3;
                    return new Integer(intValue);
                }
            }
        }
        final int intValue = 0;
        return new Integer(intValue);
    }
}
