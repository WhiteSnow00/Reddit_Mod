// 
// Decompiled by Procyon v0.6.0
// 

package ze;

import java.util.WeakHashMap;
import z3.b;
import a4.l0$d;
import a4.l0;
import a4.r1;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import a4.b0;

public final class a implements b0
{
    public final AppBarLayout f;
    
    public a(final AppBarLayout f) {
        this.f = f;
    }
    
    public final r1 a(final View view, final r1 r1) {
        final AppBarLayout f = this.f;
        f.getClass();
        final WeakHashMap a = l0.a;
        r1 l;
        if (l0$d.b((View)f)) {
            l = r1;
        }
        else {
            l = null;
        }
        if (!b.a(f.l, l)) {
            f.l = l;
            int n;
            if (f.u != null && f.getTopInset() > 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            ((View)f).setWillNotDraw((boolean)((n ^ 0x1) != 0x0));
            ((View)f).requestLayout();
        }
        return r1;
    }
}
