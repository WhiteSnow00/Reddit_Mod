// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import java.util.Iterator;
import android.os.Bundle;
import java.util.Map;
import com.google.android.gms.measurement.internal.zzah;
import java.util.EnumMap;

public final class g
{
    public static final g b;
    public final EnumMap a;
    
    static {
        b = new g(null, null);
    }
    
    public g(final Boolean b, final Boolean b2) {
        final EnumMap a = new EnumMap((Class<K>)zzah.class);
        (this.a = a).put((Enum)zzah.zza, b);
        a.put((Enum)zzah.zzb, b2);
    }
    
    public g(final EnumMap enumMap) {
        (this.a = new EnumMap((Class<K>)zzah.class)).putAll(enumMap);
    }
    
    public static g a(final Bundle bundle) {
        if (bundle == null) {
            return g.b;
        }
        final EnumMap enumMap = new EnumMap((Class<K>)zzah.class);
        for (final zzah zzah : zzah.values()) {
            final String string = ((BaseBundle)bundle).getString(zzah.zzd);
            Boolean b = null;
            if (string != null) {
                if (string.equals("granted")) {
                    b = Boolean.TRUE;
                }
                else if (string.equals("denied")) {
                    b = Boolean.FALSE;
                }
            }
            enumMap.put((Enum)zzah, b);
        }
        return new g(enumMap);
    }
    
    public static g b(final String s) {
        final EnumMap enumMap = new EnumMap((Class<K>)zzah.class);
        if (s != null) {
            int n = 0;
            while (true) {
                final zzah[] zzc = zzah.zzc;
                final int length = zzc.length;
                if (n >= 2) {
                    break;
                }
                final zzah zzah = zzc[n];
                final int n2 = n + 2;
                if (n2 < s.length()) {
                    final char char1 = s.charAt(n2);
                    Boolean b = null;
                    if (char1 != '-') {
                        if (char1 != '0') {
                            if (char1 != '1') {
                                b = b;
                            }
                            else {
                                b = Boolean.TRUE;
                            }
                        }
                        else {
                            b = Boolean.FALSE;
                        }
                    }
                    enumMap.put((Enum)zzah, b);
                }
                ++n;
            }
        }
        return new g(enumMap);
    }
    
    public final g c(final g g) {
        final EnumMap enumMap = new EnumMap((Class<K>)zzah.class);
        for (final zzah zzah : zzah.values()) {
            final Boolean b = this.a.get(zzah);
            final Boolean b2 = g.a.get(zzah);
            Boolean value;
            if (b == null) {
                value = b2;
            }
            else {
                value = b;
                if (b2 != null) {
                    value = (b && b2);
                }
            }
            enumMap.put((Enum)zzah, value);
        }
        return new g(enumMap);
    }
    
    public final g d(final g g) {
        final EnumMap enumMap = new EnumMap((Class<K>)zzah.class);
        for (final zzah zzah : zzah.values()) {
            Boolean b;
            if ((b = this.a.get(zzah)) == null) {
                b = g.a.get(zzah);
            }
            enumMap.put((Enum)zzah, b);
        }
        return new g(enumMap);
    }
    
    public final String e() {
        final StringBuilder sb = new StringBuilder("G1");
        final zzah[] zzc = zzah.zzc;
        final int length = zzc.length;
        for (int i = 0; i < 2; ++i) {
            final Boolean b = this.a.get(zzc[i]);
            char c;
            if (b == null) {
                c = '-';
            }
            else if (b) {
                c = '1';
            }
            else {
                c = '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        final zzah[] values = zzah.values();
        final int length = values.length;
        int n = 0;
        while (true) {
            int n2 = 1;
            if (n >= length) {
                return true;
            }
            final zzah zzah = values[n];
            final Boolean b = this.a.get(zzah);
            int n3;
            if (b == null) {
                n3 = 0;
            }
            else if (b) {
                n3 = 1;
            }
            else {
                n3 = 2;
            }
            final Boolean b2 = g.a.get(zzah);
            if (b2 == null) {
                n2 = 0;
            }
            else if (!b2) {
                n2 = 2;
            }
            if (n3 != n2) {
                return false;
            }
            ++n;
        }
    }
    
    public final boolean f(final zzah zzah) {
        final Boolean b = this.a.get(zzah);
        return b == null || b;
    }
    
    public final boolean g(final g g, final zzah... array) {
        for (final zzah zzah : array) {
            final Boolean b = this.a.get(zzah);
            final Boolean b2 = g.a.get(zzah);
            final Boolean false = Boolean.FALSE;
            if (b == false && b2 != false) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = this.a.values().iterator();
        int n = 17;
        while (iterator.hasNext()) {
            final Boolean b = (Boolean)iterator.next();
            int n2;
            if (b == null) {
                n2 = 0;
            }
            else if (b) {
                n2 = 1;
            }
            else {
                n2 = 2;
            }
            n = n * 31 + n2;
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("settings: ");
        final zzah[] values = zzah.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            final zzah zzah = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(((Enum)zzah).name());
            sb.append("=");
            final Boolean b = this.a.get(zzah);
            if (b == null) {
                sb.append("uninitialized");
            }
            else {
                String s;
                if (!b) {
                    s = "denied";
                }
                else {
                    s = "granted";
                }
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
