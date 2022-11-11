// 
// Decompiled by Procyon v0.6.0
// 

package yh2;

import kotlin.reflect.jvm.internal.impl.types.Variance;

public final class s
{
    public static final s k;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final s f;
    public final boolean g;
    public final s h;
    public final s i;
    public final boolean j;
    
    static {
        k = new s(false, false, false, false, false, new s(false, false, false, false, false, null, false, null, null, false, 1023), false, null, null, false, 988);
    }
    
    public s(boolean a, boolean b, boolean c, boolean d, boolean e, s f, boolean g, s h, s i, boolean j, final int n) {
        if ((n & 0x1) != 0x0) {
            a = true;
        }
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        if ((n & 0x4) != 0x0) {
            c = false;
        }
        if ((n & 0x8) != 0x0) {
            d = false;
        }
        if ((n & 0x10) != 0x0) {
            e = false;
        }
        if ((n & 0x20) != 0x0) {
            f = null;
        }
        if ((n & 0x40) != 0x0) {
            g = true;
        }
        if ((n & 0x80) != 0x0) {
            h = f;
        }
        if ((n & 0x100) != 0x0) {
            i = f;
        }
        if ((n & 0x200) != 0x0) {
            j = false;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
}
