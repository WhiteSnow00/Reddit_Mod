// 
// Decompiled by Procyon v0.6.0
// 

package ze;

import android.util.AttributeSet;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

public class f<V extends View> extends c<V>
{
    public g a;
    public int b;
    
    public f() {
        this.b = 0;
    }
    
    public f(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
    }
    
    @Override
    public boolean h(final CoordinatorLayout coordinatorLayout, final V v, int b) {
        this.w(coordinatorLayout, v, b);
        if (this.a == null) {
            this.a = new g(v);
        }
        final g a = this.a;
        a.b = a.a.getTop();
        a.c = a.a.getLeft();
        this.a.a();
        b = this.b;
        if (b != 0) {
            this.a.b(b);
            this.b = 0;
        }
        return true;
    }
    
    public final int v() {
        final g a = this.a;
        int d;
        if (a != null) {
            d = a.d;
        }
        else {
            d = 0;
        }
        return d;
    }
    
    public void w(final CoordinatorLayout coordinatorLayout, final V v, final int n) {
        coordinatorLayout.r(n, (View)v);
    }
    
    public final boolean x(final int b) {
        final g a = this.a;
        if (a != null) {
            return a.b(b);
        }
        this.b = b;
        return false;
    }
}
