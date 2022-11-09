// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;

public final class 1fo implements Iterator<View>, 5kW
{
    public final /* synthetic */ ViewGroup LIZ;
    public int LIZIZ;
    
    static {
        Covode.recordClassIndex(876);
    }
    
    public 1fo(final ViewGroup liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final boolean hasNext() {
        return this.LIZIZ < this.LIZ.getChildCount();
    }
    
    @Override
    public final void remove() {
        this.LIZ.removeViewAt(--this.LIZIZ);
    }
}
