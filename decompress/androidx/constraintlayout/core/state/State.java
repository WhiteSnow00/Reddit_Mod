// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.state;

import java.util.ArrayList;
import c3.b;
import c3.c;
import java.util.HashMap;

public class State
{
    public static final Integer e;
    public HashMap<Object, c> a;
    public HashMap<Object, b> b;
    public HashMap<String, ArrayList<String>> c;
    public final a d;
    
    static {
        e = 0;
    }
    
    public State() {
        this.a = new HashMap<Object, c>();
        this.b = new HashMap<Object, b>();
        this.c = new HashMap<String, ArrayList<String>>();
        final a d = new a(this);
        this.d = d;
        this.a.put(State.e, d);
    }
    
    public final a a(final Object a) {
        c c;
        if ((c = this.a.get(a)) == null) {
            c = new a(this);
            this.a.put(a, c);
            ((a)c).a = a;
        }
        if (c instanceof a) {
            return (a)c;
        }
        return null;
    }
    
    public enum Constraint
    {
        BASELINE_TO_BASELINE, 
        BOTTOM_TO_BOTTOM, 
        BOTTOM_TO_TOP, 
        CENTER_HORIZONTALLY, 
        CENTER_VERTICALLY, 
        CIRCULAR_CONSTRAINT, 
        END_TO_END, 
        END_TO_START, 
        LEFT_TO_LEFT, 
        LEFT_TO_RIGHT, 
        RIGHT_TO_LEFT, 
        RIGHT_TO_RIGHT, 
        START_TO_END, 
        START_TO_START, 
        TOP_TO_BOTTOM, 
        TOP_TO_TOP;
    }
}
