// 
// Decompiled by Procyon v0.6.0
// 

package gj2;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlin.coroutines.EmptyCoroutineContext;
import af2.g;
import java.util.Iterator;
import kotlin.sequences.SequencesKt__SequencesKt;
import java.util.ServiceLoader;

public final class b
{
    public static final a[] a;
    
    static {
        final Object[] array = kotlin.sequences.b.a2(SequencesKt__SequencesKt.w1((Iterator)ServiceLoader.load(a.class, a.class.getClassLoader()).iterator())).toArray(new a[0]);
        if (array != null) {
            a = (a[])array;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
    
    public static final kotlinx.coroutines.reactive.b a(final g g) {
        return new kotlinx.coroutines.reactive.b((nt2.b)g, (CoroutineContext)EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }
}
