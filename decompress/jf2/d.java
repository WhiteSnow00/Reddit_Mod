// 
// Decompiled by Procyon v0.6.0
// 

package jf2;

public final class d<T> extends c<T>
{
    public final void onError(final Throwable g) {
        if (super.f == null) {
            super.g = g;
        }
        this.countDown();
    }
    
    public final void onNext(final T f) {
        if (super.f == null) {
            super.f = f;
            super.h.dispose();
            this.countDown();
        }
    }
}
