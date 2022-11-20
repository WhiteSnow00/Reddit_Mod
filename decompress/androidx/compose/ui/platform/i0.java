// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import z0.g0;
import cg2.d;
import z0.q0;
import z0.f1;
import z0.h0;
import i1.m;
import android.util.SizeF;
import android.util.Size;
import android.os.Binder;
import android.util.SparseArray;
import android.os.Parcelable;
import java.io.Serializable;

public final class i0
{
    public static final Class<?>[] a;
    
    static {
        a = new Class[] { Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class };
    }
    
    public static final boolean a(Object value) {
        final boolean b = value instanceof m;
        boolean a = true;
        if (b) {
            final m m = (m)value;
            if (m.c() != h0.a && m.c() != f1.a && m.c() != q0.a) {
                return false;
            }
            value = ((g0)m).getValue();
            if (value != null) {
                a = a(value);
            }
            return a;
        }
        else {
            if (value instanceof d && value instanceof Serializable) {
                return false;
            }
            final Class<?>[] a2 = i0.a;
            for (int i = 0; i < 7; ++i) {
                if (a2[i].isInstance(value)) {
                    return true;
                }
            }
            return false;
        }
    }
}
