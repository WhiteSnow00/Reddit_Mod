// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;

final class RunnableDisposable extends ReferenceDisposable<Runnable>
{
    private static final long serialVersionUID = -8219729196779211169L;
    
    public RunnableDisposable(final Runnable runnable) {
        super((Object)runnable);
    }
    
    public /* bridge */ void onDisposed(final Object o) {
        this.onDisposed((Runnable)o);
    }
    
    public void onDisposed(final Runnable runnable) {
        runnable.run();
    }
    
    public String toString() {
        final StringBuilder t = a.t("RunnableDisposable(disposed=");
        t.append(this.isDisposed());
        t.append(", ");
        t.append(((AtomicReference<Object>)this).get());
        t.append(")");
        return t.toString();
    }
}
