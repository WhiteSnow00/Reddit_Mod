// 
// Decompiled by Procyon v0.6.0
// 

package g3;

import androidx.constraintlayout.solver.SolverVariable;

public final class b extends androidx.constraintlayout.solver.b
{
    public b(final a a) {
        super(a);
    }
    
    public final void e(final SolverVariable solverVariable) {
        final int c = solverVariable.c;
        float n = 0.0f;
        Label_0059: {
            if (c != 1) {
                if (c == 2) {
                    n = 1000.0f;
                    break Label_0059;
                }
                if (c == 3) {
                    n = 1000000.0f;
                    break Label_0059;
                }
                if (c == 4) {
                    n = 1.0E9f;
                    break Label_0059;
                }
                if (c == 5) {
                    n = 1.0E12f;
                    break Label_0059;
                }
            }
            n = 1.0f;
        }
        super.c.f(solverVariable, n);
        --solverVariable.i;
    }
}
