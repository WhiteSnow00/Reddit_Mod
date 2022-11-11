// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets;

import java.util.Iterator;
import f3.g;
import java.util.ArrayList;
import f3.j;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashSet;

public final class ConstraintAnchor
{
    public HashSet<ConstraintAnchor> a;
    public int b;
    public boolean c;
    public final ConstraintWidget d;
    public final Type e;
    public ConstraintAnchor f;
    public int g;
    public int h;
    public SolverVariable i;
    
    public ConstraintAnchor(final ConstraintWidget d, final Type e) {
        this.a = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final ConstraintAnchor f, final int g, final boolean b) {
        if (f == null) {
            this.g();
            return;
        }
        if (!b) {
            final Type e = f.e;
            final Type e2 = this.e;
            final boolean b2 = true;
            int n = 0;
            Label_0339: {
                Label_0336: {
                    if (e != e2) {
                        switch (ConstraintAnchor$a.a[e2.ordinal()]) {
                            default: {
                                throw new AssertionError((Object)this.e.name());
                            }
                            case 6: {
                                if (e == Type.LEFT) {
                                    break Label_0336;
                                }
                                n = (b2 ? 1 : 0);
                                if (e == Type.RIGHT) {
                                    break Label_0336;
                                }
                                break;
                            }
                            case 4:
                            case 5: {
                                int n2;
                                if (e != Type.TOP && e != Type.BOTTOM) {
                                    n2 = 0;
                                }
                                else {
                                    n2 = 1;
                                }
                                n = n2;
                                if (!(f.d instanceof e)) {
                                    break;
                                }
                                n = (b2 ? 1 : 0);
                                if (n2 != 0) {
                                    break;
                                }
                                if (e == Type.CENTER_Y) {
                                    n = (b2 ? 1 : 0);
                                    break;
                                }
                                break Label_0336;
                            }
                            case 2:
                            case 3: {
                                int n3;
                                if (e != Type.LEFT && e != Type.RIGHT) {
                                    n3 = 0;
                                }
                                else {
                                    n3 = 1;
                                }
                                n = n3;
                                if (!(f.d instanceof e)) {
                                    break;
                                }
                                n = (b2 ? 1 : 0);
                                if (n3 != 0) {
                                    break;
                                }
                                if (e == Type.CENTER_X) {
                                    n = (b2 ? 1 : 0);
                                    break;
                                }
                                break Label_0336;
                            }
                            case 1: {
                                if (e != Type.BASELINE && e != Type.CENTER_X && e != Type.CENTER_Y) {
                                    n = (b2 ? 1 : 0);
                                    break;
                                }
                                break Label_0336;
                            }
                            case 7:
                            case 8:
                            case 9: {
                                break Label_0336;
                            }
                        }
                        break Label_0339;
                    }
                    n = (b2 ? 1 : 0);
                    if (e2 != Type.BASELINE) {
                        break Label_0339;
                    }
                    if (f.d.F) {
                        n = (b2 ? 1 : 0);
                        if (this.d.F) {
                            break Label_0339;
                        }
                    }
                }
                n = 0;
            }
            if (n == 0) {
                return;
            }
        }
        this.f = f;
        if (f.a == null) {
            f.a = new HashSet<ConstraintAnchor>();
        }
        final HashSet<ConstraintAnchor> a = this.f.a;
        if (a != null) {
            a.add(this);
        }
        this.g = g;
        this.h = 0;
    }
    
    public final void b(final int n, final j j, final ArrayList list) {
        final HashSet<ConstraintAnchor> a = this.a;
        if (a != null) {
            final Iterator<ConstraintAnchor> iterator = a.iterator();
            while (iterator.hasNext()) {
                f3.g.a(iterator.next().d, n, list, j);
            }
        }
    }
    
    public final int c() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }
    
    public final int d() {
        if (this.d.f0 == 8) {
            return 0;
        }
        final int h = this.h;
        if (h != Integer.MIN_VALUE) {
            final ConstraintAnchor f = this.f;
            if (f != null && f.d.f0 == 8) {
                return h;
            }
        }
        return this.g;
    }
    
    public final boolean e() {
        final HashSet<ConstraintAnchor> a = this.a;
        if (a == null) {
            return false;
        }
        for (final ConstraintAnchor constraintAnchor : a) {
            constraintAnchor.getClass();
            ConstraintAnchor constraintAnchor2 = null;
            switch (ConstraintAnchor$a.a[constraintAnchor.e.ordinal()]) {
                default: {
                    throw new AssertionError((Object)constraintAnchor.e.name());
                }
                case 5: {
                    constraintAnchor2 = constraintAnchor.d.H;
                    break;
                }
                case 4: {
                    constraintAnchor2 = constraintAnchor.d.J;
                    break;
                }
                case 3: {
                    constraintAnchor2 = constraintAnchor.d.G;
                    break;
                }
                case 2: {
                    constraintAnchor2 = constraintAnchor.d.I;
                    break;
                }
                case 1:
                case 6:
                case 7:
                case 8:
                case 9: {
                    constraintAnchor2 = null;
                    break;
                }
            }
            if (constraintAnchor2.f()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean f() {
        return this.f != null;
    }
    
    public final void g() {
        final ConstraintAnchor f = this.f;
        if (f != null) {
            final HashSet<ConstraintAnchor> a = f.a;
            if (a != null) {
                a.remove(this);
                if (this.f.a.size() == 0) {
                    this.f.a = null;
                }
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }
    
    public final void h() {
        final SolverVariable i = this.i;
        if (i == null) {
            this.i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        }
        else {
            i.c();
        }
    }
    
    public final void i(final int b) {
        this.b = b;
        this.c = true;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.d.g0);
        sb.append(":");
        sb.append(this.e.toString());
        return sb.toString();
    }
    
    public enum Type
    {
        BASELINE, 
        BOTTOM, 
        CENTER, 
        CENTER_X, 
        CENTER_Y, 
        LEFT, 
        NONE, 
        RIGHT, 
        TOP;
    }
}
