// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import mg2.q;
import p2.b;
import gg2.c;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import mg2.p;
import xd.a;

public final class e
{
    public static final int a;
    
    static {
        a = (int)xd.a.r1("kotlinx.coroutines.flow.defaultConcurrency", (long)16, (long)1, (long)Integer.MAX_VALUE);
    }
    
    public static final ChannelFlowTransformLatest a(final p p2, final cj2.e e) {
        return b.S(e, (q)new FlowKt__MergeKt$mapLatest$1(p2, (c)null));
    }
}
