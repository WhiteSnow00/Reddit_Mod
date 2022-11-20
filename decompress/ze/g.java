// 
// Decompiled by Procyon v0.6.0
// 

package ze;

import java.util.WeakHashMap;
import a4.l0;
import android.view.View;

public final class g
{
    public final View a;
    public int b;
    public int c;
    public int d;
    
    public g(final View a) {
        this.a = a;
    }
    
    public final void a() {
        final View a = this.a;
        final int d = this.d;
        final int top = a.getTop();
        final int b = this.b;
        final WeakHashMap a2 = l0.a;
        a.offsetTopAndBottom(d - (top - b));
        final View a3 = this.a;
        a3.offsetLeftAndRight(0 - (a3.getLeft() - this.c));
    }
    
    public final boolean b(final int d) {
        if (this.d != d) {
            this.d = d;
            this.a();
            return true;
        }
        return false;
    }
}
