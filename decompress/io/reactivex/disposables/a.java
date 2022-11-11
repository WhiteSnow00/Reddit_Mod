// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.disposables;

import io.reactivex.internal.functions.Functions;

public final class a
{
    public static if2.a a() {
        return (if2.a)new RunnableDisposable((Runnable)Functions.b);
    }
    
    public static if2.a b(final kf2.a a) {
        return (if2.a)new ActionDisposable(a);
    }
    
    public static if2.a c(final Runnable runnable) {
        return (if2.a)new RunnableDisposable(runnable);
    }
}
