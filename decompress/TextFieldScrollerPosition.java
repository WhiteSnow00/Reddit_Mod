// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import lg.e0;
import z0.a1;
import z0.h1;
import i2.o;
import androidx.compose.foundation.gestures.Orientation;
import rg2.p;
import rg2.l;
import androidx.compose.runtime.saveable.a;
import n1.d;
import z0.l0;
import h1.e;

public final class TextFieldScrollerPosition
{
    public static final e f;
    public final l0 a;
    public final l0 b;
    public d c;
    public long d;
    public final l0 e;
    
    static {
        f = a.a((l)TextFieldScrollerPosition$Companion$Saver$2.INSTANCE, (p)TextFieldScrollerPosition$Companion$Saver$1.INSTANCE);
    }
    
    public TextFieldScrollerPosition() {
        this(0.0f, Orientation.Vertical);
    }
    
    public TextFieldScrollerPosition(final float n, final Orientation orientation) {
        sg2.e.f((Object)orientation, "initialOrientation");
        this.a = bg.d.t0((Object)n);
        this.b = bg.d.t0((Object)0.0f);
        this.c = n1.d.e;
        this.d = o.b;
        this.e = bg.d.s0((Object)orientation, (a1)h1.a);
    }
    
    public final float a() {
        return ((Number)((SnapshotMutableStateImpl)this.a).getValue()).floatValue();
    }
    
    public final void b(final Orientation orientation, final d c, int n, int n2) {
        sg2.e.f((Object)orientation, "orientation");
        final float n3 = (float)(n2 - n);
        ((SnapshotMutableStateImpl)this.b).setValue((Object)n3);
        float n4 = c.a;
        final d c2 = this.c;
        final float a = c2.a;
        final int n5 = 1;
        if (n4 == a) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        Label_0257: {
            if (n2 != 0) {
                if (c.b == c2.b) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                if (n2 != 0) {
                    break Label_0257;
                }
            }
            if (orientation == Orientation.Vertical) {
                n2 = n5;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                n4 = c.b;
            }
            float n6;
            if (n2 != 0) {
                n6 = c.d;
            }
            else {
                n6 = c.c;
            }
            final float a2 = this.a();
            final float n7 = (float)n;
            final float n8 = a2 + n7;
            float n9 = 0.0f;
            Label_0231: {
                if (n6 <= n8) {
                    n = fcmpg(n4, a2);
                    if (n >= 0 || n6 - n4 <= n7) {
                        if (n < 0 && n6 - n4 <= n7) {
                            n9 = n4 - a2;
                            break Label_0231;
                        }
                        n9 = 0.0f;
                        break Label_0231;
                    }
                }
                n9 = n6 - n8;
            }
            ((SnapshotMutableStateImpl)this.a).setValue((Object)(this.a() + n9));
            this.c = c;
        }
        ((SnapshotMutableStateImpl)this.a).setValue((Object)e0.u(this.a(), 0.0f, n3));
    }
}
