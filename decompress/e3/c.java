// 
// Decompiled by Procyon v0.6.0
// 

package e3;

import z2.a;
import java.util.ArrayList;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public class c extends ConstraintWidget
{
    public ArrayList<ConstraintWidget> o0;
    
    public c() {
        this.o0 = new ArrayList<ConstraintWidget>();
    }
    
    public c(final int n) {
        super(0, 0);
        this.o0 = new ArrayList<ConstraintWidget>();
    }
    
    public void H() {
        final ArrayList<ConstraintWidget> o0 = this.o0;
        if (o0 == null) {
            return;
        }
        for (int size = o0.size(), i = 0; i < size; ++i) {
            final ConstraintWidget constraintWidget = this.o0.get(i);
            if (constraintWidget instanceof c) {
                ((c)constraintWidget).H();
            }
        }
    }
    
    public void w() {
        this.o0.clear();
        super.w();
    }
    
    public final void y(final a a) {
        super.y(a);
        for (int size = this.o0.size(), i = 0; i < size; ++i) {
            this.o0.get(i).y(a);
        }
    }
}
