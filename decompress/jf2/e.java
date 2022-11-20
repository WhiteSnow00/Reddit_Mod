// 
// Decompiled by Procyon v0.6.0
// 

package jf2;

public final class e<T> extends c<T>
{
    public final void onError(final Throwable g) {
        super.f = null;
        super.g = g;
        this.countDown();
    }
    
    public final void onNext(final T f) {
        super.f = f;
    }
}
