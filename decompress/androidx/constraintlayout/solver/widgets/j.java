// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver.widgets;

import h3.d;
import java.util.ArrayList;

public final class j
{
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList<a> e;
    
    public j(final d d) {
        this.e = new ArrayList<a>();
        this.a = ((ConstraintWidget)d).I;
        this.b = ((ConstraintWidget)d).J;
        this.c = ((ConstraintWidget)d).k();
        this.d = ((ConstraintWidget)d).g();
        final ArrayList<ConstraintAnchor> b = ((ConstraintWidget)d).B;
        for (int i = 0; i < b.size(); ++i) {
            this.e.add(new a((ConstraintAnchor)b.get(i)));
        }
    }
    
    public static final class a
    {
        public ConstraintAnchor a;
        public ConstraintAnchor b;
        public int c;
        public ConstraintAnchor.Strength d;
        public int e;
        
        public a(final ConstraintAnchor a) {
            this.a = a;
            this.b = a.d;
            this.c = a.b();
            this.d = a.g;
            this.e = a.h;
        }
    }
}
