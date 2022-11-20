// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import xd.a;
import kotlin.coroutines.CoroutineContext$b;
import gg2.c;
import mg2.l;

public final class InfiniteAnimationPolicyKt
{
    public static final <R> Object a(final l<? super Long, ? extends R> l, final c<? super R> c) {
        final m0 m0 = (m0)c.getContext().get((CoroutineContext$b)androidx.compose.ui.platform.m0.a.f);
        if (m0 == null) {
            return a.I1((l)l, (c)c);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2((l)l, (c)null);
        return m0.B();
    }
}
