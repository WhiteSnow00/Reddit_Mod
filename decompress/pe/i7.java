// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Collection;
import ie.k2;
import ie.c3;
import ie.z3;
import com.google.android.gms.internal.measurement.y;
import ie.o3;
import ie.e6;
import lq0.k;
import pd.r;
import ie.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.u;
import ie.l9;
import java.util.Map;
import java.security.MessageDigest;
import ie.n2;
import ie.f2;
import ie.j3;
import java.util.List;
import ie.f3;
import ie.s6;
import ie.i6;
import java.util.BitSet;
import com.google.android.gms.internal.measurement.zzko;
import ie.y5;
import ie.r5;
import ie.b6;
import ie.q3;
import ie.p3;
import ie.i2;
import ie.x3;
import ie.e3;
import ie.v3;
import ie.j6;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Iterator;
import ie.k3;
import ie.g3;

public final class i7 extends b7
{
    public i7(final g7 g7) {
        super(g7);
    }
    
    public static final k3 Q(final g3 g3, final String s) {
        for (final k3 k3 : g3.z()) {
            if (k3.x().equals(s)) {
                return k3;
            }
        }
        return null;
    }
    
    public static final Serializable R(final g3 g3, final String s) {
        final k3 q = Q(g3, s);
        if (q != null) {
            if (q.O()) {
                return q.y();
            }
            if (q.M()) {
                return q.u();
            }
            if (q.K()) {
                return q.r();
            }
            if (q.t() > 0) {
                final j6 z = q.z();
                final ArrayList list = new ArrayList();
                for (final k3 k3 : z) {
                    if (k3 != null) {
                        final Bundle bundle = new Bundle();
                        for (final k3 k4 : k3.z()) {
                            if (k4.O()) {
                                ((BaseBundle)bundle).putString(k4.x(), k4.y());
                            }
                            else if (k4.M()) {
                                ((BaseBundle)bundle).putLong(k4.x(), k4.u());
                            }
                            else {
                                if (!k4.K()) {
                                    continue;
                                }
                                ((BaseBundle)bundle).putDouble(k4.x(), k4.r());
                            }
                        }
                        if (((BaseBundle)bundle).isEmpty()) {
                            continue;
                        }
                        list.add(bundle);
                    }
                }
                return list.toArray(new Bundle[list.size()]);
            }
        }
        return null;
    }
    
    public static final void U(final int n, final StringBuilder sb) {
        for (int i = 0; i < n; ++i) {
            sb.append("  ");
        }
    }
    
    public static final String V(final boolean b, final boolean b2, final boolean b3) {
        final StringBuilder sb = new StringBuilder();
        if (b) {
            sb.append("Dynamic ");
        }
        if (b2) {
            sb.append("Sequence ");
        }
        if (b3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }
    
    public static final void W(final StringBuilder sb, final String s, final v3 v3) {
        if (v3 == null) {
            return;
        }
        U(3, sb);
        sb.append(s);
        sb.append(" {\n");
        if (v3.s() != 0) {
            U(4, sb);
            sb.append("results: ");
            final Iterator iterator = v3.B().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final Long n2 = (Long)iterator.next();
                if (n != 0) {
                    sb.append(", ");
                }
                sb.append(n2);
                ++n;
            }
            sb.append('\n');
        }
        if (v3.u() != 0) {
            U(4, sb);
            sb.append("status: ");
            final Iterator iterator2 = v3.D().iterator();
            int n3 = 0;
            while (iterator2.hasNext()) {
                final Long n4 = (Long)iterator2.next();
                if (n3 != 0) {
                    sb.append(", ");
                }
                sb.append(n4);
                ++n3;
            }
            sb.append('\n');
        }
        if (v3.r() != 0) {
            U(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            final Iterator<Object> iterator3 = ((List<Object>)v3.A()).iterator();
            int n5 = 0;
            while (iterator3.hasNext()) {
                final e3 e3 = iterator3.next();
                if (n5 != 0) {
                    sb.append(", ");
                }
                Integer value;
                if (e3.y()) {
                    value = e3.r();
                }
                else {
                    value = null;
                }
                sb.append(value);
                sb.append(":");
                Long value2;
                if (e3.x()) {
                    value2 = e3.s();
                }
                else {
                    value2 = null;
                }
                sb.append(value2);
                ++n5;
            }
            sb.append("}\n");
        }
        if (v3.t() != 0) {
            U(4, sb);
            sb.append("sequence_filter_timestamps: {");
            final Iterator<Object> iterator4 = ((List<Object>)v3.C()).iterator();
            int n6 = 0;
            while (iterator4.hasNext()) {
                final x3 x3 = iterator4.next();
                if (n6 != 0) {
                    sb.append(", ");
                }
                Integer value3;
                if (x3.z()) {
                    value3 = x3.s();
                }
                else {
                    value3 = null;
                }
                sb.append(value3);
                sb.append(": [");
                final Iterator iterator5 = x3.w().iterator();
                int n7 = 0;
                while (iterator5.hasNext()) {
                    final long longValue = (long)iterator5.next();
                    if (n7 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    ++n7;
                }
                sb.append("]");
                ++n6;
            }
            sb.append("}\n");
        }
        U(3, sb);
        sb.append("}\n");
    }
    
    public static final void X(final StringBuilder sb, final int n, final String s, final Object o) {
        if (o == null) {
            return;
        }
        U(n + 1, sb);
        sb.append(s);
        sb.append(": ");
        sb.append(o);
        sb.append('\n');
    }
    
    public static final void Y(final StringBuilder sb, final int n, String s, final i2 i2) {
        if (i2 == null) {
            return;
        }
        U(n, sb);
        sb.append(s);
        sb.append(" {\n");
        if (i2.x()) {
            final int c = i2.C();
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            s = "BETWEEN";
                        }
                        else {
                            s = "EQUAL";
                        }
                    }
                    else {
                        s = "GREATER_THAN";
                    }
                }
                else {
                    s = "LESS_THAN";
                }
            }
            else {
                s = "UNKNOWN_COMPARISON_TYPE";
            }
            X(sb, n, "comparison_type", s);
        }
        if (i2.z()) {
            X(sb, n, "match_as_float", i2.w());
        }
        if (i2.y()) {
            X(sb, n, "comparison_value", i2.t());
        }
        if (i2.B()) {
            X(sb, n, "min_comparison_value", i2.v());
        }
        if (i2.A()) {
            X(sb, n, "max_comparison_value", i2.u());
        }
        U(n, sb);
        sb.append("}\n");
    }
    
    public static int Z(final p3 p2, final String s) {
        for (int i = 0; i < ((q3)p2.g).o1(); ++i) {
            if (s.equals(((q3)p2.g).C1(i).w())) {
                return i;
            }
        }
        return -1;
    }
    
    public static b6 f0(final b6 b6, final byte[] array) throws zzko {
        r5 r5 = ie.r5.c;
        Label_0042: {
            if (r5 != null) {
                break Label_0042;
            }
            synchronized (r5.class) {
                r5 = ie.r5.c;
                if (r5 != null) {
                    monitorexit(r5.class);
                }
                else {
                    r5 = (ie.r5.c = y5.b());
                    monitorexit(r5.class);
                }
                if (r5 != null) {
                    b6.getClass();
                    b6.i(array, array.length, r5);
                    return b6;
                }
                b6.getClass();
                b6.i(array, array.length, ie.r5.a());
                return b6;
            }
        }
    }
    
    public static ArrayList j0(final BitSet set) {
        final int n = (set.length() + 63) / 64;
        final ArrayList list = new ArrayList<Long>(n);
        for (int i = 0; i < n; ++i) {
            long n2 = 0L;
            long n4;
            for (int j = 0; j < 64; ++j, n2 = n4) {
                final int n3 = i * 64 + j;
                if (n3 >= set.length()) {
                    break;
                }
                n4 = n2;
                if (set.get(n3)) {
                    n4 = (n2 | 1L << j);
                }
            }
            list.add(n2);
        }
        return list;
    }
    
    public static boolean l0(final int n, final i6 i6) {
        return n < ((s6)i6).h * 64 && (1L << n % 64 & (long)((s6)i6).get(n / 64)) != 0x0L;
    }
    
    public static boolean n0(final String s) {
        return s != null && s.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && s.length() <= 310;
    }
    
    public static final void p0(final f3 f3, final String s, final Long n) {
        final List u = f3.u();
        int i = 0;
        while (true) {
            while (i < u.size()) {
                if (s.equals(((k3)u.get(i)).x())) {
                    final j3 v = k3.v();
                    v.n(s);
                    if (n instanceof Long) {
                        v.m(n);
                    }
                    if (i >= 0) {
                        if (f3.h) {
                            f3.l();
                            f3.h = false;
                        }
                        g3.A((g3)f3.g, i, (k3)v.j());
                        return;
                    }
                    f3.o(v);
                    return;
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    @Override
    public final boolean P() {
        return false;
    }
    
    public final void S(final StringBuilder sb, int n, final j6 j6) {
        if (j6 == null) {
            return;
        }
        ++n;
        for (final k3 k3 : j6) {
            if (k3 != null) {
                U(n, sb);
                sb.append("param {\n");
                final boolean n2 = k3.N();
                final Object o = null;
                String e;
                if (n2) {
                    e = ((h4)super.f).r.e(k3.x());
                }
                else {
                    e = null;
                }
                X(sb, n, "name", e);
                String y;
                if (k3.O()) {
                    y = k3.y();
                }
                else {
                    y = null;
                }
                X(sb, n, "string_value", y);
                Long value;
                if (k3.M()) {
                    value = k3.u();
                }
                else {
                    value = null;
                }
                X(sb, n, "int_value", value);
                Object value2 = o;
                if (k3.K()) {
                    value2 = k3.r();
                }
                X(sb, n, "double_value", value2);
                if (k3.t() > 0) {
                    this.S(sb, n, k3.z());
                }
                U(n, sb);
                sb.append("}\n");
            }
        }
    }
    
    public final void T(final StringBuilder sb, final int n, final f2 f2) {
        if (f2 == null) {
            return;
        }
        U(n, sb);
        sb.append("filter {\n");
        if (f2.y()) {
            X(sb, n, "complement", f2.x());
        }
        if (f2.A()) {
            X(sb, n, "param_name", ((h4)super.f).r.e(f2.v()));
        }
        if (f2.B()) {
            final int n2 = n + 1;
            final n2 u = f2.u();
            if (u != null) {
                U(n2, sb);
                sb.append("string_filter {\n");
                if (u.z()) {
                    String s = null;
                    switch (u.A()) {
                        default: {
                            s = "IN_LIST";
                            break;
                        }
                        case 6: {
                            s = "EXACT";
                            break;
                        }
                        case 5: {
                            s = "PARTIAL";
                            break;
                        }
                        case 4: {
                            s = "ENDS_WITH";
                            break;
                        }
                        case 3: {
                            s = "BEGINS_WITH";
                            break;
                        }
                        case 2: {
                            s = "REGEXP";
                            break;
                        }
                        case 1: {
                            s = "UNKNOWN_MATCH_TYPE";
                            break;
                        }
                    }
                    X(sb, n2, "match_type", s);
                }
                if (u.y()) {
                    X(sb, n2, "expression", u.u());
                }
                if (u.x()) {
                    X(sb, n2, "case_sensitive", u.w());
                }
                if (u.r() > 0) {
                    U(n2 + 1, sb);
                    sb.append("expression_list {\n");
                    for (final String s2 : u.v()) {
                        U(n2 + 2, sb);
                        sb.append(s2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                U(n2, sb);
                sb.append("}\n");
            }
        }
        if (f2.z()) {
            Y(sb, n + 1, "number_filter", f2.t());
        }
        U(n, sb);
        sb.append("}\n");
    }
    
    public final long a0(final byte[] array) {
        ((h4)super.f).y().M();
        final MessageDigest u = n7.U();
        if (u == null) {
            ((h4)super.f).h().k.a("Failed to get MD5");
            return 0L;
        }
        return n7.N0(u.digest(array));
    }
    
    public final Bundle b0(final boolean b, final Map map) {
        final Bundle bundle = new Bundle();
        for (final String s : map.keySet()) {
            final Object value = map.get(s);
            if (value == null) {
                ((BaseBundle)bundle).putString(s, (String)null);
            }
            else if (value instanceof Long) {
                ((BaseBundle)bundle).putLong(s, (long)value);
            }
            else if (value instanceof Double) {
                ((BaseBundle)bundle).putDouble(s, (double)value);
            }
            else if (value instanceof ArrayList) {
                if (!b) {
                    continue;
                }
                ((l9)u.g.f.zza()).zza();
                if (((h4)super.f).l.V(null, r2.f0)) {
                    final ArrayList list = (ArrayList)value;
                    final ArrayList list2 = new ArrayList();
                    for (int size = list.size(), i = 0; i < size; ++i) {
                        list2.add(this.b0(false, (Map)list.get(i)));
                    }
                    bundle.putParcelableArray(s, (Parcelable[])list2.toArray(new Parcelable[0]));
                }
                else {
                    final ArrayList list3 = (ArrayList)value;
                    final ArrayList list4 = new ArrayList();
                    for (int size2 = list3.size(), j = 0; j < size2; ++j) {
                        list4.add(this.b0(false, (Map)list3.get(j)));
                    }
                    bundle.putParcelableArrayList(s, list4);
                }
            }
            else {
                ((BaseBundle)bundle).putString(s, value.toString());
            }
        }
        return bundle;
    }
    
    public final Parcelable c0(final byte[] array, final Parcelable$Creator parcelable$Creator) {
        if (array == null) {
            return null;
        }
        final Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(array, 0, array.length);
                obtain.setDataPosition(0);
                final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(obtain);
                obtain.recycle();
                return parcelable;
            }
            finally {}
        }
        catch (final SafeParcelReader$ParseException ex) {
            ((h4)super.f).h().k.a("Failed to load parcelable from buffer");
            obtain.recycle();
            return null;
        }
        obtain.recycle();
    }
    
    public final t d0(final b b) {
        final Bundle b2 = this.b0(true, b.c);
        String string = null;
        Label_0044: {
            if (((BaseBundle)b2).containsKey("_o")) {
                final Object value = ((BaseBundle)b2).get("_o");
                if (value != null) {
                    string = value.toString();
                    break Label_0044;
                }
            }
            string = "app";
        }
        String s;
        if ((s = k.Z0(b.a, r.g, r.i)) == null) {
            s = b.a;
        }
        return new t(s, new pe.r(b2), string, b.b);
    }
    
    public final g3 e0(final o o) {
        final f3 v = g3.v();
        final long e = o.e;
        if (v.h) {
            v.l();
            v.h = false;
        }
        g3.H(e, (g3)v.g);
        final q q = new q(o.f);
        while (q.hasNext()) {
            final String s = q.f.next();
            final j3 v2 = k3.v();
            v2.n(s);
            final Object value = ((BaseBundle)o.f.f).get(s);
            lw0.b.R(value);
            if (v2.h) {
                v2.l();
                v2.h = false;
            }
            k3.C((k3)v2.g);
            if (v2.h) {
                v2.l();
                v2.h = false;
            }
            k3.E((k3)v2.g);
            if (v2.h) {
                v2.l();
                v2.h = false;
            }
            k3.G((k3)v2.g);
            if (v2.h) {
                v2.l();
                v2.h = false;
            }
            k3.J((k3)v2.g);
            if (value instanceof String) {
                v2.o((String)value);
            }
            else if (value instanceof Long) {
                v2.m((long)value);
            }
            else if (value instanceof Double) {
                final double doubleValue = (double)value;
                if (v2.h) {
                    v2.l();
                    v2.h = false;
                }
                k3.F((k3)v2.g, doubleValue);
            }
            else if (value instanceof Bundle[]) {
                final Bundle[] array = (Bundle[])value;
                final ArrayList<e6> list = new ArrayList<e6>();
                for (final Bundle bundle : array) {
                    if (bundle != null) {
                        final j3 v3 = k3.v();
                        for (final String s2 : ((BaseBundle)bundle).keySet()) {
                            final j3 v4 = k3.v();
                            v4.n(s2);
                            final Object value2 = ((BaseBundle)bundle).get(s2);
                            if (value2 instanceof Long) {
                                v4.m((long)value2);
                            }
                            else if (value2 instanceof String) {
                                v4.o((String)value2);
                            }
                            else {
                                if (!(value2 instanceof Double)) {
                                    continue;
                                }
                                final double doubleValue2 = (double)value2;
                                if (v4.h) {
                                    v4.l();
                                    v4.h = false;
                                }
                                k3.F((k3)v4.g, doubleValue2);
                            }
                            if (v3.h) {
                                v3.l();
                                v3.h = false;
                            }
                            k3.H((k3)v3.g, (k3)v4.j());
                        }
                        if (((k3)v3.g).t() > 0) {
                            list.add(v3.j());
                        }
                    }
                }
                if (v2.h) {
                    v2.l();
                    v2.h = false;
                }
                k3.I((k3)v2.g, list);
            }
            else {
                ((h4)super.f).h().k.b(value, "Ignoring invalid (type) event param value");
            }
            v.o(v2);
        }
        return (g3)v.j();
    }
    
    public final String g0(final o3 o3) {
        final StringBuilder r = a.r("\nbatch {\n");
        for (final q3 q3 : o3.u()) {
            if (q3 != null) {
                U(1, r);
                r.append("bundle {\n");
                if (q3.c1()) {
                    X(r, 1, "protocol_version", q3.l1());
                }
                y.a();
                if (((h4)super.f).l.V(null, r2.t0) && q3.f1()) {
                    X(r, 1, "session_stitching_token", q3.B());
                }
                X(r, 1, "platform", q3.z());
                if (q3.Y0()) {
                    X(r, 1, "gmp_version", q3.t1());
                }
                if (q3.j1()) {
                    X(r, 1, "uploading_gmp_version", q3.y1());
                }
                if (q3.W0()) {
                    X(r, 1, "dynamite_version", q3.r1());
                }
                if (q3.T0()) {
                    X(r, 1, "config_version", q3.p1());
                }
                X(r, 1, "gmp_app_id", q3.w());
                X(r, 1, "admob_app_id", q3.D1());
                X(r, 1, "app_id", q3.E1());
                X(r, 1, "app_version", q3.r());
                if (q3.p0()) {
                    X(r, 1, "app_version_major", q3.Q());
                }
                X(r, 1, "firebase_instance_id", q3.v());
                if (q3.V0()) {
                    X(r, 1, "dev_cert_hash", q3.q1());
                }
                X(r, 1, "app_store", q3.G1());
                if (q3.i1()) {
                    X(r, 1, "upload_timestamp_millis", q3.x1());
                }
                if (q3.g1()) {
                    X(r, 1, "start_timestamp_millis", q3.w1());
                }
                if (q3.X0()) {
                    X(r, 1, "end_timestamp_millis", q3.s1());
                }
                if (q3.b1()) {
                    X(r, 1, "previous_bundle_start_timestamp_millis", q3.v1());
                }
                if (q3.a1()) {
                    X(r, 1, "previous_bundle_end_timestamp_millis", q3.u1());
                }
                X(r, 1, "app_instance_id", q3.F1());
                X(r, 1, "resettable_device_id", q3.A());
                X(r, 1, "ds_id", q3.u());
                if (q3.Z0()) {
                    X(r, 1, "limited_ad_tracking", q3.n0());
                }
                X(r, 1, "os_version", q3.y());
                X(r, 1, "device_model", q3.t());
                X(r, 1, "user_default_language", q3.C());
                if (q3.h1()) {
                    X(r, 1, "time_zone_offset_minutes", q3.n1());
                }
                if (q3.q0()) {
                    X(r, 1, "bundle_sequential_index", q3.Q0());
                }
                if (q3.e1()) {
                    X(r, 1, "service_upload", q3.o0());
                }
                X(r, 1, "health_monitor", q3.x());
                if (q3.d1()) {
                    X(r, 1, "retry_counter", q3.m1());
                }
                if (q3.U0()) {
                    X(r, 1, "consent_signals", q3.s());
                }
                final j6 f = q3.F();
                if (f != null) {
                    for (final z3 z3 : f) {
                        if (z3 != null) {
                            U(2, r);
                            r.append("user_property {\n");
                            Long value;
                            if (z3.I()) {
                                value = z3.t();
                            }
                            else {
                                value = null;
                            }
                            X(r, 2, "set_timestamp_millis", value);
                            X(r, 2, "name", ((h4)super.f).r.f(z3.w()));
                            X(r, 2, "string_value", z3.x());
                            Long value2;
                            if (z3.H()) {
                                value2 = z3.s();
                            }
                            else {
                                value2 = null;
                            }
                            X(r, 2, "int_value", value2);
                            Double value3;
                            if (z3.G()) {
                                value3 = z3.r();
                            }
                            else {
                                value3 = null;
                            }
                            X(r, 2, "double_value", value3);
                            U(2, r);
                            r.append("}\n");
                        }
                    }
                }
                final j6 d = q3.D();
                if (d != null) {
                    for (final c3 c3 : d) {
                        if (c3 != null) {
                            U(2, r);
                            r.append("audience_membership {\n");
                            if (c3.B()) {
                                X(r, 2, "audience_id", c3.r());
                            }
                            if (c3.C()) {
                                X(r, 2, "new_audience", c3.A());
                            }
                            W(r, "current_data", c3.u());
                            if (c3.D()) {
                                W(r, "previous_data", c3.v());
                            }
                            U(2, r);
                            r.append("}\n");
                        }
                    }
                }
                final j6 e = q3.E();
                if (e != null) {
                    for (final g3 g3 : e) {
                        if (g3 != null) {
                            U(2, r);
                            r.append("event {\n");
                            X(r, 2, "name", ((h4)super.f).r.d(g3.y()));
                            if (g3.K()) {
                                X(r, 2, "timestamp_millis", g3.u());
                            }
                            if (g3.J()) {
                                X(r, 2, "previous_timestamp_millis", g3.t());
                            }
                            if (g3.I()) {
                                X(r, 2, "count", g3.r());
                            }
                            if (g3.s() != 0) {
                                this.S(r, 2, g3.z());
                            }
                            U(2, r);
                            r.append("}\n");
                        }
                    }
                }
                U(1, r);
                r.append("}\n");
            }
        }
        r.append("}\n");
        return r.toString();
    }
    
    public final String h0(final k2 k2) {
        final StringBuilder r = a.r("\nproperty_filter {\n");
        if (k2.A()) {
            X(r, 0, "filter_id", k2.r());
        }
        X(r, 0, "property_name", ((h4)super.f).r.f(k2.v()));
        final String v = V(k2.x(), k2.y(), k2.z());
        if (!v.isEmpty()) {
            X(r, 0, "filter_type", v);
        }
        this.T(r, 1, k2.s());
        r.append("}\n");
        return r.toString();
    }
    
    public final List i0(final i6 i6, final List list) {
        final ArrayList list2 = new ArrayList((Collection<? extends E>)i6);
        for (final Integer n : list) {
            if (n < 0) {
                ((h4)super.f).h().n.b((Object)n, "Ignoring negative bit index to be cleared");
            }
            else {
                final int n2 = n / 64;
                if (n2 >= list2.size()) {
                    ((h4)super.f).h().n.c((Object)n, "Ignoring bit index greater than bitSet size", (Object)list2.size());
                }
                else {
                    list2.set(n2, (long)list2.get(n2) & ~(1L << n % 64));
                }
            }
        }
        int size = list2.size();
        int n4;
        for (int n3 = list2.size() - 1; n3 >= 0 && (long)list2.get(n3) == 0L; n3 = n4) {
            n4 = n3 - 1;
            size = n3;
        }
        return list2.subList(0, size);
    }
    
    public final HashMap k0(final Bundle bundle, final boolean b) {
        final HashMap hashMap = new HashMap();
        for (final String s : ((BaseBundle)bundle).keySet()) {
            final Object value = ((BaseBundle)bundle).get(s);
            ((l9)u.g.f.zza()).zza();
            Label_0159: {
                if (((h4)super.f).l.V(null, r2.f0)) {
                    if (value instanceof Parcelable[] || value instanceof ArrayList) {
                        break Label_0159;
                    }
                    if (value instanceof Bundle) {
                        break Label_0159;
                    }
                }
                else {
                    if (value instanceof Bundle[] || value instanceof ArrayList) {
                        break Label_0159;
                    }
                    if (value instanceof Bundle) {
                        break Label_0159;
                    }
                }
                if (value != null) {
                    hashMap.put(s, value);
                    continue;
                }
                continue;
            }
            if (b) {
                final ArrayList<HashMap> list = new ArrayList<HashMap>();
                if (value instanceof Parcelable[]) {
                    for (final Parcelable parcelable : (Parcelable[])value) {
                        if (parcelable instanceof Bundle) {
                            list.add(this.k0((Bundle)parcelable, false));
                        }
                    }
                }
                else if (value instanceof ArrayList) {
                    final ArrayList list2 = (ArrayList)value;
                    for (int size = list2.size(), j = 0; j < size; ++j) {
                        final Object value2 = list2.get(j);
                        if (value2 instanceof Bundle) {
                            list.add(this.k0((Bundle)value2, false));
                        }
                    }
                }
                else if (value instanceof Bundle) {
                    list.add(this.k0((Bundle)value, false));
                }
                hashMap.put(s, list);
            }
        }
        return hashMap;
    }
    
    public final boolean m0(final long n, final long n2) {
        if (n != 0L && n2 > 0L) {
            ((h4)super.f).s.getClass();
            if (Math.abs(System.currentTimeMillis() - n) <= n2) {
                return false;
            }
        }
        return true;
    }
    
    public final byte[] o0(byte[] byteArray) throws IOException {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gzipOutputStream.write(byteArray);
            gzipOutputStream.close();
            byteArrayOutputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
            return byteArray;
        }
        catch (final IOException ex) {
            ((h4)super.f).h().k.b((Object)ex, "Failed to gzip content");
            throw ex;
        }
    }
}
