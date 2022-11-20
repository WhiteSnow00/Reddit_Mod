// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines;

import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import kotlin.coroutines.EmptyCoroutineContext;
import gg2.c;
import mg2.a;

public final class e
{
    public static Object a(final a a, final c c) {
        return g.j((CoroutineContext)EmptyCoroutineContext.INSTANCE, (p)new InterruptibleKt$runInterruptible$2(a, (c)null), c);
    }
}
