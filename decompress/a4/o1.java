// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.view.ViewGroup;
import tg2.a;
import android.view.View;
import java.util.Iterator;

public final class o1 implements Iterator<View>, a
{
    public int f;
    public final /* synthetic */ ViewGroup g;
    
    public o1(final ViewGroup g) {
        this.g = g;
    }
    
    @Override
    public final boolean hasNext() {
        return this.f < this.g.getChildCount();
    }
    
    @Override
    public final Object next() {
        final View child = this.g.getChildAt(this.f++);
        if (child != null) {
            return child;
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public final void remove() {
        this.g.removeViewAt(--this.f);
    }
}
