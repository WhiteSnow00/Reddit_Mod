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

public final class ObservableSampleTimed<T> extends a<T, T>
{
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    public final boolean j;
    
    public ObservableSampleTimed(final y<T> y, final long g, final TimeUnit h, final b0 i, final boolean j) {
        super((y)y);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final g g = new g((a0)a0);
        if (this.j) {
            super.f.subscribe((a0)new ObservableSampleTimed.ObservableSampleTimed$SampleTimedEmitLast((a0)g, this.g, this.h, this.i));
        }
        else {
            super.f.subscribe((a0)new ObservableSampleTimed.ObservableSampleTimed$SampleTimedNoLast((a0)g, this.g, this.h, this.i));
        }
    }
}
