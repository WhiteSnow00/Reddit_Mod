// 
// Decompiled by Procyon v0.6.0
// 

package h3;

import g3.a;
import java.util.ArrayList;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public class e extends ConstraintWidget
{
    public ArrayList<ConstraintWidget> i0;
    
    public e() {
        this.i0 = new ArrayList<ConstraintWidget>();
    }
    
    public void o() {
        this.i0.clear();
        super.o();
    }
    
    public final void q(final a a) {
        super.q(a);
        for (int size = this.i0.size(), i = 0; i < size; ++i) {
            this.i0.get(i).q(a);
        }
    }
    
    public final void u(int i, int size) {
        super.O = i;
        super.P = size;
        for (size = this.i0.size(), i = 0; i < size; ++i) {
            this.i0.get(i).u(super.I + super.O, super.J + super.P);
        }
    }
    
    public final void x() {
        super.x();
        final ArrayList<ConstraintWidget> i0 = this.i0;
        if (i0 == null) {
            return;
        }
        for (int size = i0.size(), j = 0; j < size; ++j) {
            final ConstraintWidget constraintWidget = this.i0.get(j);
            constraintWidget.u(super.M + super.O, super.N + super.P);
            if (!(constraintWidget instanceof androidx.constraintlayout.solver.widgets.e)) {
                constraintWidget.x();
            }
        }
    }
    
    public void z() {
        this.x();
        final ArrayList<ConstraintWidget> i0 = this.i0;
        if (i0 == null) {
            return;
        }
        for (int size = i0.size(), j = 0; j < size; ++j) {
            final ConstraintWidget constraintWidget = this.i0.get(j);
            if (constraintWidget instanceof e) {
                ((e)constraintWidget).z();
            }
        }
    }
}
