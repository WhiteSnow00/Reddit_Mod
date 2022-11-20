// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import cj2.e;
import mg2.p;
import mg2.l;

public final class FlowKt__DistinctKt
{
    public static final l<Object, Object> a;
    public static final p<Object, Object, Boolean> b;
    
    static {
        a = (l)FlowKt__DistinctKt$defaultKeySelector$1.INSTANCE;
        b = (p)FlowKt__DistinctKt$defaultAreEquivalent$1.INSTANCE;
    }
    
    public static final <T> e<T> a(e<? extends T> distinctFlowImpl, final l<? super T, ?> l, final p<Object, Object, Boolean> p3) {
        if (distinctFlowImpl instanceof DistinctFlowImpl) {
            final DistinctFlowImpl distinctFlowImpl2 = distinctFlowImpl;
            if (distinctFlowImpl2.g == l && distinctFlowImpl2.h == p3) {
                return (e<T>)distinctFlowImpl;
            }
        }
        distinctFlowImpl = new DistinctFlowImpl((e)distinctFlowImpl, (l)l, (p)p3);
        return (e<T>)distinctFlowImpl;
    }
}
