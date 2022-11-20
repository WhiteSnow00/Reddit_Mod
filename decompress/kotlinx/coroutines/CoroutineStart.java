// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines;

import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zg.a;
import cg2.j;
import cg.d;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ng2.k;
import kotlinx.coroutines.internal.ThreadContextKt;
import ng2.e;
import kotlin.NoWhenBranchMatchedException;
import gg2.c;
import mg2.l;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJY\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f2\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a" }, d2 = { "Lkotlinx/coroutines/CoroutineStart;", "", "T", "Lkotlin/Function1;", "Lgg2/c;", "", "block", "completion", "Lcg2/j;", "invoke", "(Lmg2/l;Lgg2/c;)V", "R", "Lkotlin/Function2;", "receiver", "(Lmg2/p;Ljava/lang/Object;Lgg2/c;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 6, 0 })
public enum CoroutineStart
{
    private static final CoroutineStart[] $VALUES;
    
    ATOMIC, 
    DEFAULT, 
    LAZY, 
    UNDISPATCHED;
    
    private static final CoroutineStart[] $values() {
        return new CoroutineStart[] { CoroutineStart.DEFAULT, CoroutineStart.LAZY, CoroutineStart.ATOMIC, CoroutineStart.UNDISPATCHED };
    }
    
    static {
        $VALUES = $values();
    }
    
    public static void isLazy$annotations() {
    }
    
    public final <T> void invoke(final l<? super c<? super T>, ?> l, final c<? super T> c) {
        final int n = a.a[this.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                else {
                    e.f((Object)c, "completion");
                    try {
                        final CoroutineContext context = c.getContext();
                        final Object c2 = ThreadContextKt.c(context, null);
                        try {
                            k.e(1, (Object)l);
                            final Object invoke = l.invoke((Object)c);
                            ThreadContextKt.a(context, c2);
                            if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                c.resumeWith(Result.constructor-impl(invoke));
                            }
                            return;
                        }
                        finally {
                            ThreadContextKt.a(context, c2);
                        }
                    }
                    finally {
                        final Throwable t;
                        c.resumeWith(Result.constructor-impl((Object)d.B1(t)));
                        return;
                    }
                }
            }
            e.f((Object)l, "<this>");
            e.f((Object)c, "completion");
            d.e3(d.z1((l)l, (c)c)).resumeWith(Result.constructor-impl((Object)j.a));
            return;
        }
        try {
            zg.a.h0(d.e3(d.z1((l)l, (c)c)), Result.constructor-impl((Object)j.a), (l)null);
        }
        finally {
            final Throwable t2;
            c.resumeWith(Result.constructor-impl((Object)d.B1(t2)));
        }
    }
    
    public final <R, T> void invoke(final p<? super R, ? super c<? super T>, ?> p3, final R r, final c<? super T> c) {
        final int n = a.a[this.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                else {
                    e.f((Object)c, "completion");
                    try {
                        final CoroutineContext context = c.getContext();
                        final Object c2 = ThreadContextKt.c(context, null);
                        try {
                            k.e(2, (Object)p3);
                            final Object invoke = p3.invoke((Object)r, (Object)c);
                            ThreadContextKt.a(context, c2);
                            if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                c.resumeWith(Result.constructor-impl(invoke));
                            }
                            return;
                        }
                        finally {
                            ThreadContextKt.a(context, c2);
                        }
                    }
                    finally {
                        final Throwable t;
                        c.resumeWith(Result.constructor-impl((Object)d.B1(t)));
                        return;
                    }
                }
            }
            e.f((Object)p3, "<this>");
            e.f((Object)c, "completion");
            d.e3(d.A1((p)p3, (Object)r, (c)c)).resumeWith(Result.constructor-impl((Object)j.a));
            return;
        }
        try {
            zg.a.h0(d.e3(d.A1((p)p3, (Object)r, (c)c)), Result.constructor-impl((Object)j.a), (l)null);
        }
        finally {
            final Throwable t2;
            c.resumeWith(Result.constructor-impl((Object)d.B1(t2)));
        }
    }
    
    public final boolean isLazy() {
        return this == CoroutineStart.LAZY;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[CoroutineStart.values().length];
            a2[CoroutineStart.DEFAULT.ordinal()] = 1;
            a2[CoroutineStart.ATOMIC.ordinal()] = 2;
            a2[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            a2[CoroutineStart.LAZY.ordinal()] = 4;
            a = a2;
        }
    }
}
