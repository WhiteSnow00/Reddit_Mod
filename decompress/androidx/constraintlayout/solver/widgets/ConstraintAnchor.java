// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;

public final class ConstraintAnchor
{
    public i a;
    public final ConstraintWidget b;
    public final Type c;
    public ConstraintAnchor d;
    public int e;
    public int f;
    public Strength g;
    public int h;
    public SolverVariable i;
    
    public ConstraintAnchor(final ConstraintWidget b, final Type c) {
        this.a = new i(this);
        this.e = 0;
        this.f = -1;
        this.g = Strength.NONE;
        final ConnectionType relaxed = ConnectionType.RELAXED;
        this.h = 0;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final ConstraintAnchor d, final int e, final int f, final Strength g, final int h, final boolean b) {
        if (d == null) {
            this.d = null;
            this.e = 0;
            this.f = -1;
            this.g = Strength.NONE;
            this.h = 2;
            return true;
        }
        if (!b) {
            final Type c = d.c;
            final Type c2 = this.c;
            boolean b3 = false;
            Label_0340: {
                Label_0337: {
                    if (c == c2) {
                        if (c2 == Type.BASELINE) {
                            if (d.b.Q <= 0) {
                                break Label_0337;
                            }
                            if (this.b.Q <= 0) {
                                break Label_0337;
                            }
                        }
                    }
                    else {
                        switch (ConstraintAnchor$a.a[c2.ordinal()]) {
                            default: {
                                throw new AssertionError((Object)this.c.name());
                            }
                            case 4:
                            case 5: {
                                final boolean b2 = b3 = (c == Type.TOP || c == Type.BOTTOM);
                                if (!(d.b instanceof g)) {
                                    break Label_0340;
                                }
                                if (b2) {
                                    break;
                                }
                                if (c == Type.CENTER_Y) {
                                    break;
                                }
                                break Label_0337;
                            }
                            case 2:
                            case 3: {
                                final boolean b4 = b3 = (c == Type.LEFT || c == Type.RIGHT);
                                if (!(d.b instanceof g)) {
                                    break Label_0340;
                                }
                                if (b4) {
                                    break;
                                }
                                if (c == Type.CENTER_X) {
                                    break;
                                }
                                break Label_0337;
                            }
                            case 1: {
                                if (c != Type.BASELINE && c != Type.CENTER_X && c != Type.CENTER_Y) {
                                    break;
                                }
                                break Label_0337;
                            }
                            case 6:
                            case 7:
                            case 8:
                            case 9: {
                                break Label_0337;
                            }
                        }
                    }
                    b3 = true;
                    break Label_0340;
                }
                b3 = false;
            }
            if (!b3) {
                return false;
            }
        }
        this.d = d;
        if (e > 0) {
            this.e = e;
        }
        else {
            this.e = 0;
        }
        this.f = f;
        this.g = g;
        this.h = h;
        return true;
    }
    
    public final int b() {
        if (this.b.Y == 8) {
            return 0;
        }
        final int f = this.f;
        if (f > -1) {
            final ConstraintAnchor d = this.d;
            if (d != null && d.b.Y == 8) {
                return f;
            }
        }
        return this.e;
    }
    
    public final boolean c() {
        return this.d != null;
    }
    
    public final void d() {
        this.d = null;
        this.e = 0;
        this.f = -1;
        this.g = Strength.STRONG;
        this.h = 0;
        final ConnectionType relaxed = ConnectionType.RELAXED;
        this.a.j();
    }
    
    public final void e() {
        final SolverVariable i = this.i;
        if (i == null) {
            this.i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        }
        else {
            i.c();
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b.Z);
        sb.append(":");
        sb.append(this.c.toString());
        return sb.toString();
    }
    
    public enum ConnectionType
    {
        RELAXED, 
        STRICT;
    }
    
    public enum Strength
    {
        NONE, 
        STRONG, 
        WEAK;
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
