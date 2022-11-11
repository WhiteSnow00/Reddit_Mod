// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ag2.g;
import ff2.a0;
import ff2.y;
import ff2.b0;
import java.util.concurrent.TimeUnit;
import sf2.a;

public final class ObservableDebounceTimed<T> extends a<T, T>
{
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    
    public ObservableDebounceTimed(final long g, final TimeUnit h, final y y, final b0 i) {
        super(y);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        super.f.subscribe((a0)new ObservableDebounceTimed.ObservableDebounceTimed$a(new g((a0)a0), this.g, this.h, this.i.a()));
    }
}
