// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.a1;
import z0.h1;
import i2.o;
import ah2.f;
import androidx.compose.foundation.gestures.Orientation;
import zg2.p;
import zg2.l;
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
        f = a.a((l)TextFieldScrollerPosition$Companion$Saver.TextFieldScrollerPosition$Companion$Saver$2.INSTANCE, (p)TextFieldScrollerPosition$Companion$Saver.TextFieldScrollerPosition$Companion$Saver$1.INSTANCE);
    }
    
    public TextFieldScrollerPosition() {
        this(0.0f, Orientation.Vertical);
    }
    
    public TextFieldScrollerPosition(final float n, final Orientation orientation) {
        ah2.f.f((Object)orientation, "initialOrientation");
        this.a = a80.a.n0(n);
        this.b = a80.a.n0(0.0f);
        this.c = n1.d.e;
        this.d = o.b;
        this.e = a80.a.m0(orientation, (a1)h1.a);
    }
    
    public final float a() {
        return ((SnapshotMutableStateImpl<Number>)this.a).getValue().floatValue();
    }
    
    public final void b(final Orientation orientation, final d c, int n, int n2) {
        ah2.f.f((Object)orientation, "orientation");
        final float n3 = (float)(n2 - n);
        ((SnapshotMutableStateImpl<Float>)this.b).setValue(Float.valueOf(n3));
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
            ((SnapshotMutableStateImpl<Float>)this.a).setValue(Float.valueOf(this.a() + n9));
            this.c = c;
        }
        ((SnapshotMutableStateImpl<Float>)this.a).setValue(Float.valueOf(yl.a.J(this.a(), 0.0f, n3)));
    }
}
