// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import z0.c1;
import z0.g0;
import lk.f;
import android.content.SharedPreferences;
import mk.b;
import jl.c;
import uk.a;

public final class s implements a
{
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    
    public s() {
        final b h = ok.a.h();
        this.b = h;
        final SharedPreferences a = h.a;
        float float1 = 16700.0f;
        if (a != null) {
            float1 = a.getFloat("UI_TRACE_SMALL_DROP_THRESHOLD", 16700.0f);
        }
        this.c = new c((a)this, float1);
        this.a = false;
    }
    
    public s(final int n, final int n2) {
        this.b = ah0.b.Z0((Object)new d(n));
        this.c = ah0.b.Z0((Object)n2);
    }
    
    public final void a(final long n) {
        final f f = (f)this.d;
        if (f != null) {
            f.b += n;
            final mk.a a = (mk.a)this.b;
            if (a != null) {
                final float n2 = (float)n;
                final SharedPreferences a2 = ((b)a).a;
                float float1 = 250000.0f;
                if (a2 != null) {
                    float1 = a2.getFloat("UI_TRACE_LARGE_DROP_THRESHOLD", 250000.0f);
                }
                if (n2 > float1) {
                    final f f2 = (f)this.d;
                    f2.a += n;
                }
            }
        }
    }
    
    public final void b(final int n, final int n2) {
        final float n3 = (float)n;
        final int n4 = 1;
        if (n3 >= 0.0f) {
            int n5;
            if (n == ((d)((c1)this.b).getValue()).a) {
                n5 = n4;
            }
            else {
                n5 = 0;
            }
            if (n5 == 0) {
                ((g0)this.b).setValue((Object)new d(n));
            }
            if (n2 != ((Number)((c1)this.c).getValue()).intValue()) {
                ((g0)this.c).setValue((Object)n2);
            }
            return;
        }
        throw new IllegalArgumentException(m5.a.d("Index should be non-negative (", n, ')').toString());
    }
}
