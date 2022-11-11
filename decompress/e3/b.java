// 
// Decompiled by Procyon v0.6.0
// 

package e3;

import f3.g;
import java.util.ArrayList;
import f3.i;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public class b extends ConstraintWidget implements a
{
    public ConstraintWidget[] o0;
    public int p0;
    
    public b() {
        this.o0 = new ConstraintWidget[4];
        this.p0 = 0;
    }
    
    public final void H(final int n, final i i, final ArrayList list) {
        final int n2 = 0;
        int n3 = 0;
        int j;
        while (true) {
            j = n2;
            if (n3 >= this.p0) {
                break;
            }
            i.a(this.o0[n3]);
            ++n3;
        }
        while (j < this.p0) {
            g.a(this.o0[j], n, list, i);
            ++j;
        }
    }
}
