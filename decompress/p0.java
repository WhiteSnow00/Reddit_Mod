// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.transition.Transition;
import android.graphics.Rect;
import android.transition.Transition$EpicenterCallback;

public final class p0 extends Transition$EpicenterCallback
{
    public final /* synthetic */ Rect a;
    
    public p0(final Rect a) {
        this.a = a;
    }
    
    public final Rect onGetEpicenter(final Transition transition) {
        return this.a;
    }
}
