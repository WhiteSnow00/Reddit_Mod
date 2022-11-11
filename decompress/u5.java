// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Iterator;
import a80.a;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.nio.charset.Charset;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznd;

public final class u5
{
    public final l7 a;
    public boolean b;
    
    static {
        new u5(0);
    }
    
    public u5() {
        this.a = new l7(16);
    }
    
    public u5(final int n) {
        final l7 a = new l7(0);
        this.a = a;
        if (!this.b) {
            a.a();
            this.b = true;
        }
        if (!this.b) {
            a.a();
            this.b = true;
        }
    }
    
    public static final void b(final t5 t5, final Object o) {
        final zznd r = t5.r();
        final Charset a = i6.a;
        o.getClass();
        final zznd zza = zznd.zza;
        final zzne zza2 = zzne.zza;
        boolean b = false;
        switch (((Enum)r.zza()).ordinal()) {
            default: {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t5.zza(), t5.r().zza(), o.getClass().getName()));
            }
            case 8: {
                if (o instanceof z6) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t5.zza(), t5.r().zza(), o.getClass().getName()));
            }
            case 7: {
                if (o instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t5.zza(), t5.r().zza(), o.getClass().getName()));
            }
            case 6: {
                if (o instanceof zzjd) {
                    return;
                }
                if (o instanceof byte[]) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t5.zza(), t5.r().zza(), o.getClass().getName()));
            }
            case 5: {
                b = (o instanceof String);
                break;
            }
            case 4: {
                b = (o instanceof Boolean);
                break;
            }
            case 3: {
                b = (o instanceof Double);
                break;
            }
            case 2: {
                b = (o instanceof Float);
                break;
            }
            case 1: {
                b = (o instanceof Long);
                break;
            }
            case 0: {
                b = (o instanceof Integer);
                break;
            }
        }
        if (!b) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", t5.zza(), t5.r().zza(), o.getClass().getName()));
        }
    }
    
    public final void a(final t5 t5, Object o) {
        if (t5.s()) {
            if (!(o instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            final ArrayList list = new ArrayList();
            list.addAll((Collection)o);
            for (int size = list.size(), i = 0; i < size; ++i) {
                b(t5, list.get(i));
            }
            o = list;
        }
        else {
            b(t5, o);
        }
        ((s7)this.a).b(t5, o);
    }
    
    public final Object clone() throws CloneNotSupportedException {
        final u5 u5 = new u5();
        for (int i = 0; i < ((s7)this.a).g.size(); ++i) {
            final Map.Entry<t5, V> entry = ((s7)this.a).g.get(i);
            u5.a(entry.getKey(), entry.getValue());
        }
        final l7 a = this.a;
        Object o;
        if (((s7)a).h.isEmpty()) {
            o = a80.a.n;
        }
        else {
            o = ((s7)a).h.entrySet();
        }
        for (final Map.Entry<t5, V> entry2 : o) {
            u5.a(entry2.getKey(), entry2.getValue());
        }
        return u5;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof u5 && ((s7)this.a).equals(((u5)o).a));
    }
    
    @Override
    public final int hashCode() {
        return ((s7)this.a).hashCode();
    }
}
