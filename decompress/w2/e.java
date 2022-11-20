// 
// Decompiled by Procyon v0.6.0
// 

package w2;

import androidx.compose.ui.window.SecureFlagPolicy;

public final class e
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final SecureFlagPolicy d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    
    public e() {
        this(false, true, true, SecureFlagPolicy.Inherit, true, true, false);
    }
    
    public e(boolean b, boolean b2, boolean b3, final int n) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        final boolean b4 = (n & 0x2) != 0x0;
        if ((n & 0x4) != 0x0) {
            b2 = true;
        }
        SecureFlagPolicy inherit;
        if ((n & 0x8) != 0x0) {
            inherit = SecureFlagPolicy.Inherit;
        }
        else {
            inherit = null;
        }
        if ((n & 0x10) != 0x0) {
            b3 = true;
        }
        final boolean b5 = (n & 0x20) != 0x0;
        ng2.e.f((Object)inherit, "securePolicy");
        this(b, b4, b2, inherit, b3, b5, false);
    }
    
    public e(final boolean a, final boolean b, final boolean c, final SecureFlagPolicy d, final boolean e, final boolean f, final boolean g) {
        ng2.e.f((Object)d, "securePolicy");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final boolean a = this.a;
        final e e = (e)o;
        return a == e.a && this.b == e.b && this.c == e.c && this.d == e.d && this.e == e.e && this.f == e.f && this.g == e.g;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.g) + (Boolean.hashCode(this.f) + (Boolean.hashCode(this.e) + (this.d.hashCode() + (Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) + Boolean.hashCode(this.b) * 31) * 31) * 31) * 31) * 31) * 31) * 31;
    }
}
