// 
// Decompiled by Procyon v0.6.0
// 

package u1;

import ah2.f;
import android.view.View;

public final class b implements a
{
    public final View a;
    
    public b(final View a) {
        f.f((Object)a, "view");
        this.a = a;
    }
    
    @Override
    public final void a(int n) {
        final int n2 = 1;
        if (n == 0) {
            this.a.performHapticFeedback(0);
        }
        else {
            if (n == 9) {
                n = n2;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                this.a.performHapticFeedback(9);
            }
        }
    }
}
