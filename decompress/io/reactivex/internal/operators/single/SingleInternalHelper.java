// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import qt2.b;
import ff2.g0;
import kf2.o;

public final class SingleInternalHelper
{
    public static <T> o<g0<? extends T>, b<? extends T>> a() {
        return (o<g0<? extends T>, b<? extends T>>)ToFlowable.INSTANCE;
    }
    
    public enum ToFlowable implements o<g0, b>
    {
        INSTANCE;
        
        public b apply(final g0 g0) {
            return (b)new SingleToFlowable(g0);
        }
    }
}
