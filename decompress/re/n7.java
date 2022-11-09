// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import od.g;
import od.f;
import kz0.k;
import android.os.BaseBundle;
import android.content.pm.Signature;
import android.content.pm.PackageInfo;
import java.security.cert.CertificateException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import java.util.Arrays;
import os.h;
import android.os.RemoteException;
import ke.u0;
import java.util.Collections;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Collection;
import java.util.TreeSet;
import p2.e;
import android.net.Uri;
import java.util.Random;
import android.os.Parcel;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Iterator;
import ng.f0;
import yd.a;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicLong;
import java.security.SecureRandom;

public final class n7 extends t4
{
    public static final String[] l;
    public static final String[] m;
    public SecureRandom h;
    public final AtomicLong i;
    public int j;
    public Integer k;
    
    static {
        l = new String[] { "firebase_", "google_", "ga_" };
        m = new String[] { "_err" };
    }
    
    public n7(final h4 h4) {
        super(h4);
        this.k = null;
        this.i = new AtomicLong(0L);
    }
    
    public static String F(final int n, final String s, final boolean b) {
        if (s == null) {
            return null;
        }
        if (s.codePointCount(0, s.length()) <= n) {
            return s;
        }
        if (b) {
            return String.valueOf(s.substring(0, s.offsetByCodePoints(0, n))).concat("...");
        }
        return null;
    }
    
    public static MessageDigest G() {
        int n = 0;
    Label_0022_Outer:
        while (true) {
            Label_0028: {
                if (n >= 2) {
                    break Label_0028;
                }
                while (true) {
                    try {
                        final MessageDigest instance = MessageDigest.getInstance("MD5");
                        if (instance == null) {
                            ++n;
                            continue Label_0022_Outer;
                        }
                        return instance;
                        return null;
                    }
                    catch (final NoSuchAlgorithmException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static ArrayList I(final List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        final ArrayList list2 = new ArrayList(list.size());
        for (final c c : list) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("app_id", c.f);
            ((BaseBundle)bundle).putString("origin", c.g);
            ((BaseBundle)bundle).putLong("creation_timestamp", c.i);
            ((BaseBundle)bundle).putString("name", c.h.g);
            final Object f = c.h.f();
            a.S0(f);
            f0.C2(f, bundle);
            ((BaseBundle)bundle).putBoolean("active", c.j);
            final String k = c.k;
            if (k != null) {
                ((BaseBundle)bundle).putString("trigger_event_name", k);
            }
            final t l = c.l;
            if (l != null) {
                ((BaseBundle)bundle).putString("timed_out_event_name", l.f);
                final r g = l.g;
                if (g != null) {
                    bundle.putBundle("timed_out_event_params", g.f());
                }
            }
            ((BaseBundle)bundle).putLong("trigger_timeout", c.m);
            final t n = c.n;
            if (n != null) {
                ((BaseBundle)bundle).putString("triggered_event_name", n.f);
                final r g2 = n.g;
                if (g2 != null) {
                    bundle.putBundle("triggered_event_params", g2.f());
                }
            }
            ((BaseBundle)bundle).putLong("triggered_timestamp", c.h.h);
            ((BaseBundle)bundle).putLong("time_to_live", c.o);
            final t p = c.p;
            if (p != null) {
                ((BaseBundle)bundle).putString("expired_event_name", p.f);
                final r g3 = p.g;
                if (g3 != null) {
                    bundle.putBundle("expired_event_params", g3.f());
                }
            }
            list2.add(bundle);
        }
        return list2;
    }
    
    public static void L(final t5 t5, final Bundle bundle, final boolean b) {
        boolean b2 = b;
        if (bundle != null) {
            b2 = b;
            if (t5 != null) {
                if (!((BaseBundle)bundle).containsKey("_sc") || b) {
                    final String a = t5.a;
                    if (a != null) {
                        ((BaseBundle)bundle).putString("_sn", a);
                    }
                    else {
                        bundle.remove("_sn");
                    }
                    final String b3 = t5.b;
                    if (b3 != null) {
                        ((BaseBundle)bundle).putString("_sc", b3);
                    }
                    else {
                        bundle.remove("_sc");
                    }
                    ((BaseBundle)bundle).putLong("_si", t5.c);
                    return;
                }
                b2 = false;
            }
        }
        if (bundle != null && t5 == null && b2) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }
    
    public static void O(final m7 m7, final String s, final int n, final String s2, final String s3, final int n2) {
        final Bundle bundle = new Bundle();
        p0(n, bundle);
        if (!TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)s3)) {
            ((BaseBundle)bundle).putString(s2, s3);
        }
        if (n == 6 || n == 7 || n == 2) {
            ((BaseBundle)bundle).putLong("_el", (long)n2);
        }
        m7.b(bundle, s);
    }
    
    public static boolean i0(final Object o) {
        return o instanceof Parcelable[] || o instanceof ArrayList || o instanceof Bundle;
    }
    
    public static boolean k0(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && s.startsWith("_");
    }
    
    public static boolean l0(final String s) {
        a.P0(s);
        return s.charAt(0) != '_' || s.equals("_ep");
    }
    
    public static boolean m0(final Context context) {
        a.S0((Object)context);
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            final ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public static boolean n0(final String s, final String s2, final String s3, final String s4) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final boolean empty2 = TextUtils.isEmpty((CharSequence)s2);
        if (!empty && !empty2) {
            a.S0((Object)s);
            return !s.equals(s2);
        }
        if (empty && empty2) {
            if (!TextUtils.isEmpty((CharSequence)s3) && !TextUtils.isEmpty((CharSequence)s4)) {
                return !s3.equals(s4);
            }
            return !TextUtils.isEmpty((CharSequence)s4);
        }
        else {
            if (!empty) {
                return !TextUtils.isEmpty((CharSequence)s4) && (TextUtils.isEmpty((CharSequence)s3) || !s3.equals(s4));
            }
            return TextUtils.isEmpty((CharSequence)s3) || !s3.equals(s4);
        }
    }
    
    public static byte[] o0(final Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        final Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        }
        finally {
            obtain.recycle();
        }
    }
    
    public static final boolean p0(final int n, final Bundle bundle) {
        if (((BaseBundle)bundle).getLong("_err") == 0L) {
            ((BaseBundle)bundle).putLong("_err", (long)n);
            return true;
        }
        return false;
    }
    
    public static boolean s0(final String s, final String[] array) {
        a.S0((Object)array);
        for (final String s2 : array) {
            if (s == s2 || (s != null && s.equals(s2))) {
                return true;
            }
        }
        return false;
    }
    
    public static long z0(final byte[] array) {
        a.S0((Object)array);
        int length = array.length;
        int n = 0;
        a.V0(length > 0);
        --length;
        long n2 = 0L;
        while (length >= 0 && length >= array.length - 8) {
            n2 += ((long)array[length] & 0xFFL) << n;
            n += 8;
            --length;
        }
        return n2;
    }
    
    public final long A0() {
        if (this.i.get() == 0L) {
            synchronized (this.i) {
                final long nanoTime = System.nanoTime();
                ((h4)((w)this).f).s.getClass();
                final long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                final int j = this.j + 1;
                this.j = j;
                final long n = j;
                monitorexit(this.i);
                return nextLong + n;
            }
        }
        synchronized (this.i) {
            this.i.compareAndSet(-1L, 1L);
            return this.i.getAndIncrement();
        }
    }
    
    public final Bundle B0(final Uri uri, final boolean b, final boolean b2) {
        if (uri != null) {
            try {
                String queryParameter;
                String queryParameter2;
                String queryParameter3;
                String queryParameter4;
                String s;
                String s2;
                String s3;
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    String queryParameter5;
                    String queryParameter6;
                    if (b) {
                        queryParameter5 = uri.getQueryParameter("utm_id");
                        queryParameter6 = uri.getQueryParameter("dclid");
                    }
                    else {
                        queryParameter5 = (queryParameter6 = null);
                    }
                    if (b2) {
                        final String queryParameter7 = uri.getQueryParameter("srsltid");
                        s = queryParameter5;
                        s2 = queryParameter6;
                        s3 = queryParameter7;
                    }
                    else {
                        final String s4 = null;
                        s = queryParameter5;
                        s2 = queryParameter6;
                        s3 = s4;
                    }
                }
                else {
                    final String s5 = null;
                    final String s7;
                    final String s6 = s7 = s5;
                    final String s8 = s = s7;
                    s2 = (s3 = s);
                    queryParameter4 = s8;
                    queryParameter3 = s7;
                    queryParameter2 = s6;
                    queryParameter = s5;
                }
                if (TextUtils.isEmpty((CharSequence)queryParameter) && TextUtils.isEmpty((CharSequence)queryParameter2) && TextUtils.isEmpty((CharSequence)queryParameter3) && TextUtils.isEmpty((CharSequence)queryParameter4) && (!b || (TextUtils.isEmpty((CharSequence)s) && TextUtils.isEmpty((CharSequence)s2))) && (!b2 || TextUtils.isEmpty((CharSequence)s3))) {
                    return null;
                }
                final Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty((CharSequence)queryParameter)) {
                    ((BaseBundle)bundle).putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty((CharSequence)queryParameter2)) {
                    ((BaseBundle)bundle).putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty((CharSequence)queryParameter3)) {
                    ((BaseBundle)bundle).putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty((CharSequence)queryParameter4)) {
                    ((BaseBundle)bundle).putString("gclid", queryParameter4);
                }
                final String queryParameter8 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty((CharSequence)queryParameter8)) {
                    ((BaseBundle)bundle).putString("term", queryParameter8);
                }
                final String queryParameter9 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty((CharSequence)queryParameter9)) {
                    ((BaseBundle)bundle).putString("content", queryParameter9);
                }
                final String queryParameter10 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty((CharSequence)queryParameter10)) {
                    ((BaseBundle)bundle).putString("aclid", queryParameter10);
                }
                final String queryParameter11 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty((CharSequence)queryParameter11)) {
                    ((BaseBundle)bundle).putString("cp1", queryParameter11);
                }
                final String queryParameter12 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty((CharSequence)queryParameter12)) {
                    ((BaseBundle)bundle).putString("anid", queryParameter12);
                }
                if (b) {
                    if (!TextUtils.isEmpty((CharSequence)s)) {
                        ((BaseBundle)bundle).putString("campaign_id", s);
                    }
                    if (!TextUtils.isEmpty((CharSequence)s2)) {
                        ((BaseBundle)bundle).putString("dclid", s2);
                    }
                    final String queryParameter13 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty((CharSequence)queryParameter13)) {
                        ((BaseBundle)bundle).putString("source_platform", queryParameter13);
                    }
                    final String queryParameter14 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty((CharSequence)queryParameter14)) {
                        ((BaseBundle)bundle).putString("creative_format", queryParameter14);
                    }
                    final String queryParameter15 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty((CharSequence)queryParameter15)) {
                        ((BaseBundle)bundle).putString("marketing_tactic", queryParameter15);
                    }
                }
                if (b2 && !TextUtils.isEmpty((CharSequence)s3)) {
                    ((BaseBundle)bundle).putString("srsltid", s3);
                }
                return bundle;
            }
            catch (final UnsupportedOperationException ex) {
                ((h4)((w)this).f).f().n.b(ex, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }
    
    public final Object C(final Object o, final String s) {
        final boolean equals = "_ev".equals(s);
        int n = 256;
        if (equals) {
            ((w)this).f.getClass();
            return this.r0(256, o, true, true);
        }
        if (k0(s)) {
            ((w)this).f.getClass();
        }
        else {
            ((w)this).f.getClass();
            n = 100;
        }
        return this.r0(n, o, false, true);
    }
    
    public final Bundle C0(final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (final String s : ((BaseBundle)bundle).keySet()) {
                final Object c = this.C(((BaseBundle)bundle).get(s), s);
                if (c == null) {
                    ((h4)((w)this).f).f().p.b(((h4)((w)this).f).r.e(s), "Param value can't be null");
                }
                else {
                    this.P(bundle2, s, c);
                }
            }
        }
        return bundle2;
    }
    
    public final Object D(final Object o, final String s) {
        if ("_ldl".equals(s)) {
            return this.r0(this.q0(s), o, true, false);
        }
        return this.r0(this.q0(s), o, false, false);
    }
    
    public final Bundle D0(final String s, final Bundle bundle, final List list, final boolean b) {
        final boolean s2 = s0(s, e.p);
        Bundle bundle3;
        if (bundle != null) {
            final Bundle bundle2 = new Bundle(bundle);
            final int b2 = ((h4)((w)this).f).l.B();
            final Iterator iterator = new TreeSet(((BaseBundle)bundle).keySet()).iterator();
            int n = 0;
            while (true) {
                bundle3 = bundle2;
                if (!iterator.hasNext()) {
                    break;
                }
                final String s3 = (String)iterator.next();
                int v0;
                if (list != null && list.contains(s3)) {
                    v0 = 0;
                }
                else {
                    int w0;
                    if (!b) {
                        w0 = this.w0(s3);
                    }
                    else {
                        w0 = 0;
                    }
                    v0 = w0;
                    if (w0 == 0) {
                        v0 = this.v0(s3);
                    }
                }
                if (v0 != 0) {
                    String s4;
                    if (v0 == 3) {
                        s4 = s3;
                    }
                    else {
                        s4 = null;
                    }
                    this.K(bundle2, v0, s3, s4);
                    bundle2.remove(s3);
                }
                else {
                    final int b3 = this.b0(s, s3, ((BaseBundle)bundle).get(s3), bundle2, list, b, s2);
                    if (b3 == 17) {
                        this.K(bundle2, 17, s3, Boolean.FALSE);
                    }
                    else if (b3 != 0 && !"_ev".equals(s3)) {
                        String s5;
                        if (b3 == 21) {
                            s5 = s;
                        }
                        else {
                            s5 = s3;
                        }
                        this.K(bundle2, b3, s5, ((BaseBundle)bundle).get(s3));
                        bundle2.remove(s3);
                        continue;
                    }
                    if (!l0(s3)) {
                        continue;
                    }
                    if (++n <= b2) {
                        continue;
                    }
                    ((h4)((w)this).f).f().m.c(((h4)((w)this).f).r.d(s), d.p("Event can't contain more than ", b2, " params").toString(), ((h4)((w)this).f).r.b(bundle));
                    p0(5, bundle2);
                    bundle2.remove(s3);
                }
            }
        }
        else {
            bundle3 = null;
        }
        return bundle3;
    }
    
    public final String E() {
        final byte[] array = new byte[16];
        this.H().nextBytes(array);
        return String.format(Locale.US, "%032x", new BigInteger(1, array));
    }
    
    public final t E0(final String s, Bundle bundle, final String s2, final long n, final boolean b) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        if (this.u0(s) == 0) {
            if (bundle != null) {
                bundle = new Bundle(bundle);
            }
            else {
                bundle = new Bundle();
            }
            ((BaseBundle)bundle).putString("_o", s2);
            final Bundle bundle2 = bundle = this.D0(s, bundle, Collections.singletonList("_o"), (boolean)(1 != 0));
            if (b) {
                bundle = this.C0(bundle2);
            }
            a.S0((Object)bundle);
            return new t(s, new r(bundle), s2, n);
        }
        ((h4)((w)this).f).f().k.b(((h4)((w)this).f).r.f(s), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }
    
    public final SecureRandom H() {
        ((w)this).y();
        if (this.h == null) {
            this.h = new SecureRandom();
        }
        return this.h;
    }
    
    public final void J(final Bundle bundle, final long n) {
        long long1 = ((BaseBundle)bundle).getLong("_et");
        if (long1 != 0L) {
            ((h4)((w)this).f).f().n.b(long1, "Params already contained engagement");
        }
        else {
            long1 = 0L;
        }
        ((BaseBundle)bundle).putLong("_et", n + long1);
    }
    
    public final void K(final Bundle bundle, final int n, final String s, final Object o) {
        if (p0(n, bundle)) {
            ((w)this).f.getClass();
            ((BaseBundle)bundle).putString("_ev", F(40, s, true));
            if (o != null && (o instanceof String || o instanceof CharSequence)) {
                ((BaseBundle)bundle).putLong("_el", (long)o.toString().length());
            }
        }
    }
    
    public final void M(final Bundle bundle, final Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (final String s : ((BaseBundle)bundle2).keySet()) {
            if (!((BaseBundle)bundle).containsKey(s)) {
                ((h4)((w)this).f).y().P(bundle, s, ((BaseBundle)bundle2).get(s));
            }
        }
    }
    
    public final void N(final d3 d3, final int n) {
        final Iterator iterator = new TreeSet(((BaseBundle)d3.d).keySet()).iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            if (l0(s)) {
                final int n3 = n2 + 1;
                if ((n2 = n3) <= n) {
                    continue;
                }
                ((h4)((w)this).f).f().m.c(((h4)((w)this).f).r.d(d3.a), d.p("Event can't contain more than ", n, " params").toString(), ((h4)((w)this).f).r.b(d3.d));
                p0(5, d3.d);
                d3.d.remove(s);
                n2 = n3;
            }
        }
    }
    
    public final void P(final Bundle bundle, final String s, final Object o) {
        if (bundle == null) {
            return;
        }
        if (o instanceof Long) {
            ((BaseBundle)bundle).putLong(s, (long)o);
            return;
        }
        if (o instanceof String) {
            ((BaseBundle)bundle).putString(s, String.valueOf(o));
            return;
        }
        if (o instanceof Double) {
            ((BaseBundle)bundle).putDouble(s, (double)o);
            return;
        }
        if (o instanceof Bundle[]) {
            bundle.putParcelableArray(s, (Parcelable[])o);
            return;
        }
        if (s != null) {
            String simpleName;
            if (o != null) {
                simpleName = o.getClass().getSimpleName();
            }
            else {
                simpleName = null;
            }
            ((h4)((w)this).f).f().p.c(((h4)((w)this).f).r.e(s), "Not putting event parameter. Invalid value type. name, type", simpleName);
        }
    }
    
    public final void Q(final u0 u0, final boolean b) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putBoolean("r", b);
        try {
            u0.b(bundle);
        }
        catch (final RemoteException ex) {
            ((h4)((w)this).f).f().n.b(ex, "Error returning boolean value to wrapper");
        }
    }
    
    public final void R(final u0 u0, final ArrayList list) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", list);
        try {
            u0.b(bundle);
        }
        catch (final RemoteException ex) {
            ((h4)((w)this).f).f().n.b(ex, "Error returning bundle list to wrapper");
        }
    }
    
    public final void S(final u0 u0, final Bundle bundle) {
        try {
            u0.b(bundle);
        }
        catch (final RemoteException ex) {
            ((h4)((w)this).f).f().n.b(ex, "Error returning bundle value to wrapper");
        }
    }
    
    public final void T(final u0 u0, final byte[] array) {
        final Bundle bundle = new Bundle();
        bundle.putByteArray("r", array);
        try {
            u0.b(bundle);
        }
        catch (final RemoteException ex) {
            ((h4)((w)this).f).f().n.b(ex, "Error returning byte array to wrapper");
        }
    }
    
    public final void U(final u0 u0, final int n) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("r", n);
        try {
            u0.b(bundle);
        }
        catch (final RemoteException ex) {
            ((h4)((w)this).f).f().n.b(ex, "Error returning int value to wrapper");
        }
    }
    
    public final void V(final u0 u0, final long n) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("r", n);
        try {
            u0.b(bundle);
        }
        catch (final RemoteException ex) {
            ((h4)((w)this).f).f().n.b(ex, "Error returning long value to wrapper");
        }
    }
    
    public final void W(final String s, final u0 u0) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("r", s);
        try {
            u0.b(bundle);
        }
        catch (final RemoteException ex) {
            ((h4)((w)this).f).f().n.b(ex, "Error returning string value to wrapper");
        }
    }
    
    public final void X(final String s, final String s2, final Bundle bundle, final List list, final boolean b) {
        if (bundle == null) {
            return;
        }
        ((w)this).f.getClass();
        final Iterator iterator = new TreeSet(((BaseBundle)bundle).keySet()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final String s3 = (String)iterator.next();
            int v0;
            if (list != null && list.contains(s3)) {
                v0 = 0;
            }
            else {
                int w0;
                if (!b) {
                    w0 = this.w0(s3);
                }
                else {
                    w0 = 0;
                }
                v0 = w0;
                if (w0 == 0) {
                    v0 = this.v0(s3);
                }
            }
            if (v0 != 0) {
                String s4;
                if (v0 == 3) {
                    s4 = s3;
                }
                else {
                    s4 = null;
                }
                this.K(bundle, v0, s3, s4);
                bundle.remove(s3);
            }
            else {
                int b2;
                if (i0(((BaseBundle)bundle).get(s3))) {
                    ((h4)((w)this).f).f().p.d(s, "Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", s2, s3);
                    b2 = 22;
                }
                else {
                    b2 = this.b0(s, s3, ((BaseBundle)bundle).get(s3), bundle, list, b, false);
                }
                if (b2 != 0 && !"_ev".equals(s3)) {
                    this.K(bundle, b2, s3, ((BaseBundle)bundle).get(s3));
                    bundle.remove(s3);
                }
                else {
                    if (!l0(s3) || s0(s3, os.h.r)) {
                        continue;
                    }
                    final int n2 = n + 1;
                    if ((n = n2) <= 0) {
                        continue;
                    }
                    ((h4)((w)this).f).f().m.c(((h4)((w)this).f).r.d(s), "Item cannot contain custom parameters", ((h4)((w)this).f).r.b(bundle));
                    p0(23, bundle);
                    bundle.remove(s3);
                    n = n2;
                }
            }
        }
    }
    
    public final boolean Y(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            a.S0((Object)s);
            if (!s.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                if (TextUtils.isEmpty((CharSequence)((h4)((w)this).f).g)) {
                    ((h4)((w)this).f).f().m.b(c3.H(s), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                }
                return false;
            }
        }
        else {
            if (TextUtils.isEmpty((CharSequence)s2)) {
                if (TextUtils.isEmpty((CharSequence)((h4)((w)this).f).g)) {
                    ((h4)((w)this).f).f().m.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            }
            a.S0((Object)s2);
            if (!s2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                ((h4)((w)this).f).f().m.b(c3.H(s2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
        }
        return true;
    }
    
    public final boolean Z(final int n, final String s, final String s2) {
        if (s2 == null) {
            ((h4)((w)this).f).f().m.b(s, "Name is required and can't be null. Type");
            return false;
        }
        if (s2.codePointCount(0, s2.length()) > n) {
            ((h4)((w)this).f).f().m.d(s, "Name is too long. Type, maximum supported length, name", n, s2);
            return false;
        }
        return true;
    }
    
    public final boolean a0(final String s, final String[] array, final String[] array2, final String s2) {
        if (s2 == null) {
            ((h4)((w)this).f).f().m.b(s, "Name is required and can't be null. Type");
            return false;
        }
        final String[] l = n7.l;
        for (int i = 0; i < 3; ++i) {
            if (s2.startsWith(l[i])) {
                ((h4)((w)this).f).f().m.c(s, "Name starts with reserved prefix. Type, name", s2);
                return false;
            }
        }
        if (array != null && s0(s2, array) && (array2 == null || !s0(s2, array2))) {
            ((h4)((w)this).f).f().m.c(s, "Name is reserved. Type, name", s2);
            return false;
        }
        return true;
    }
    
    public final int b0(String class1, final String s, Object value, final Bundle bundle, final List list, final boolean b, final boolean b2) {
        ((w)this).y();
        int n2 = 0;
        Label_0279: {
            Label_0276: {
                if (i0(value)) {
                    if (!b2) {
                        return 21;
                    }
                    if (!s0(s, os.h.q)) {
                        return 20;
                    }
                    final l6 w = ((h4)((w)this).f).w();
                    ((k2)w).y();
                    ((h3)w).z();
                    if (w.G()) {
                        if (((h4)((w)w).f).y().y0() < 200900) {
                            return 25;
                        }
                    }
                    ((w)this).f.getClass();
                    final boolean b3 = value instanceof Parcelable[];
                    int n;
                    if (b3) {
                        n = ((Parcelable[])value).length;
                    }
                    else {
                        if (!(value instanceof ArrayList)) {
                            break Label_0276;
                        }
                        n = ((ArrayList)value).size();
                    }
                    if (n > 200) {
                        ((h4)((w)this).f).f().p.d("param", "Parameter array is too long; discarded. Value kind, name, array length", s, n);
                        ((w)this).f.getClass();
                        if (b3) {
                            final Parcelable[] array = (Parcelable[])value;
                            if (array.length > 200) {
                                bundle.putParcelableArray(s, (Parcelable[])Arrays.copyOf(array, 200));
                            }
                        }
                        else if (value instanceof ArrayList) {
                            final ArrayList list2 = (ArrayList)value;
                            if (list2.size() > 200) {
                                bundle.putParcelableArrayList(s, new ArrayList(list2.subList(0, 200)));
                            }
                        }
                        n2 = 17;
                        break Label_0279;
                    }
                }
            }
            n2 = 0;
        }
        int n3;
        if (!k0(class1) && !k0(s)) {
            ((w)this).f.getClass();
            n3 = 100;
        }
        else {
            ((w)this).f.getClass();
            n3 = 256;
        }
        if (this.d0("param", s, n3, value)) {
            return n2;
        }
        if (b2) {
            if (value instanceof Bundle) {
                this.X(class1, s, (Bundle)value, list, b);
            }
            else if (value instanceof Parcelable[]) {
                for (final Parcelable parcelable : (Parcelable[])value) {
                    if (!(parcelable instanceof Bundle)) {
                        ((h4)((w)this).f).f().p.c(parcelable.getClass(), "All Parcelable[] elements must be of type Bundle. Value type, name", s);
                        return 4;
                    }
                    this.X(class1, s, (Bundle)parcelable, list, b);
                }
            }
            else {
                if (!(value instanceof ArrayList)) {
                    return 4;
                }
                final ArrayList list3 = (ArrayList)value;
                for (int size = list3.size(), j = 0; j < size; ++j) {
                    value = list3.get(j);
                    if (!(value instanceof Bundle)) {
                        final a3 p7 = ((h4)((w)this).f).f().p;
                        if (value != null) {
                            class1 = (String)value.getClass();
                        }
                        else {
                            class1 = "null";
                        }
                        p7.c(class1, "All ArrayList elements must be of type Bundle. Value type, name", s);
                        return 4;
                    }
                    this.X(class1, s, (Bundle)value, list, b);
                }
            }
            return n2;
        }
        return 4;
    }
    
    public final void c0() {
        ((w)this).y();
        final SecureRandom secureRandom = new SecureRandom();
        long n;
        if ((n = secureRandom.nextLong()) == 0L) {
            final long n2 = n = secureRandom.nextLong();
            if (n2 == 0L) {
                ((h4)((w)this).f).f().n.a("Utils falling back to Random for random id");
                n = n2;
            }
        }
        this.i.set(n);
    }
    
    public final boolean d0(final String s, final String s2, final int n, final Object o) {
        if (o == null) {
            return true;
        }
        if (!(o instanceof Long) && !(o instanceof Float) && !(o instanceof Integer) && !(o instanceof Byte) && !(o instanceof Short) && !(o instanceof Boolean)) {
            if (!(o instanceof Double)) {
                if (!(o instanceof String) && !(o instanceof Character) && !(o instanceof CharSequence)) {
                    return false;
                }
                final String string = o.toString();
                if (string.codePointCount(0, string.length()) > n) {
                    ((h4)((w)this).f).f().p.d(s, "Value is too long; discarded. Value kind, name, value length", s2, string.length());
                    return false;
                }
            }
        }
        return true;
    }
    
    public final boolean e0(final String s, final String s2) {
        if (s2 == null) {
            ((h4)((w)this).f).f().m.b(s, "Name is required and can't be null. Type");
            return false;
        }
        if (s2.length() == 0) {
            ((h4)((w)this).f).f().m.b(s, "Name is required and can't be empty. Type");
            return false;
        }
        int codePoint;
        final int n = codePoint = s2.codePointAt(0);
        if (!Character.isLetter(n)) {
            if (n != 95) {
                ((h4)((w)this).f).f().m.c(s, "Name must start with a letter or _ (underscore). Type, name", s2);
                return false;
            }
            codePoint = 95;
        }
        int codePoint2;
        for (int length = s2.length(), i = Character.charCount(codePoint); i < length; i += Character.charCount(codePoint2)) {
            codePoint2 = s2.codePointAt(i);
            if (codePoint2 != 95 && !Character.isLetterOrDigit(codePoint2)) {
                ((h4)((w)this).f).f().m.c(s, "Name must consist of letters, digits or _ (underscores). Type, name", s2);
                return false;
            }
        }
        return true;
    }
    
    public final boolean f0(final String s, final String s2) {
        if (s2 == null) {
            ((h4)((w)this).f).f().m.b(s, "Name is required and can't be null. Type");
            return false;
        }
        if (s2.length() == 0) {
            ((h4)((w)this).f).f().m.b(s, "Name is required and can't be empty. Type");
            return false;
        }
        final int codePoint = s2.codePointAt(0);
        if (!Character.isLetter(codePoint)) {
            ((h4)((w)this).f).f().m.c(s, "Name must start with a letter. Type, name", s2);
            return false;
        }
        int codePoint2;
        for (int length = s2.length(), i = Character.charCount(codePoint); i < length; i += Character.charCount(codePoint2)) {
            codePoint2 = s2.codePointAt(i);
            if (codePoint2 != 95 && !Character.isLetterOrDigit(codePoint2)) {
                ((h4)((w)this).f).f().m.c(s, "Name must consist of letters, digits or _ (underscores). Type, name", s2);
                return false;
            }
        }
        return true;
    }
    
    public final boolean g0(final String s) {
        ((w)this).y();
        if (yd.c.a(((h4)((w)this).f).f).a.checkCallingOrSelfPermission(s) == 0) {
            return true;
        }
        ((h4)((w)this).f).f().r.b(s, "Permission not granted");
        return false;
    }
    
    public final boolean h0(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final String z = ((h4)((w)this).f).l.z("debug.firebase.analytics.app");
        ((w)this).f.getClass();
        return z.equals(s);
    }
    
    public final boolean j0(final Context context, final String s) {
        final X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            final PackageInfo b = yd.c.a(context).b(64, s);
            if (b != null) {
                final Signature[] signatures = b.signatures;
                if (signatures != null && signatures.length > 0) {
                    return ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
                }
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {
            ((h4)((w)this).f).f().k.b(ex, "Package name not found");
        }
        catch (final CertificateException ex2) {
            ((h4)((w)this).f).f().k.b(ex2, "Error obtaining certificate");
        }
        return true;
    }
    
    public final int q0(final String s) {
        if ("_ldl".equals(s)) {
            ((w)this).f.getClass();
            return 2048;
        }
        if ("_id".equals(s)) {
            ((w)this).f.getClass();
            return 256;
        }
        if ("_lgclid".equals(s)) {
            ((w)this).f.getClass();
            return 100;
        }
        ((w)this).f.getClass();
        return 36;
    }
    
    public final Object r0(int i, final Object o, final boolean b, final boolean b2) {
        if (o == null) {
            return null;
        }
        if (o instanceof Long || o instanceof Double) {
            return o;
        }
        if (o instanceof Integer) {
            return o;
        }
        if (o instanceof Byte) {
            return o;
        }
        if (o instanceof Short) {
            return o;
        }
        if (o instanceof Boolean) {
            long n;
            if (!(boolean)o) {
                n = 0L;
            }
            else {
                n = 1L;
            }
            return n;
        }
        if (o instanceof Float) {
            return o;
        }
        if (o instanceof String || o instanceof Character || o instanceof CharSequence) {
            return F(i, o.toString(), b);
        }
        if (b2 && (o instanceof Bundle[] || o instanceof Parcelable[])) {
            final ArrayList list = new ArrayList();
            final Parcelable[] array = (Parcelable[])o;
            int length;
            Parcelable parcelable;
            Bundle c0;
            for (length = array.length, i = 0; i < length; ++i) {
                parcelable = array[i];
                if (parcelable instanceof Bundle) {
                    c0 = this.C0((Bundle)parcelable);
                    if (!((BaseBundle)c0).isEmpty()) {
                        list.add(c0);
                    }
                }
            }
            return list.toArray(new Bundle[list.size()]);
        }
        return null;
    }
    
    public final int t0(final Object o, final String s) {
        boolean b;
        if ("_ldl".equals(s)) {
            b = this.d0("user property referrer", s, this.q0(s), o);
        }
        else {
            b = this.d0("user property", s, this.q0(s), o);
        }
        if (b) {
            return 0;
        }
        return 7;
    }
    
    public final int u0(final String s) {
        if (!this.e0("event", s)) {
            return 2;
        }
        if (!this.a0("event", e.m, e.n, s)) {
            return 13;
        }
        ((w)this).f.getClass();
        if (!this.Z(40, "event", s)) {
            return 2;
        }
        return 0;
    }
    
    public final int v0(final String s) {
        if (!this.e0("event param", s)) {
            return 3;
        }
        if (!this.a0("event param", null, null, s)) {
            return 14;
        }
        ((w)this).f.getClass();
        if (!this.Z(40, "event param", s)) {
            return 3;
        }
        return 0;
    }
    
    public final int w0(final String s) {
        if (!this.f0("event param", s)) {
            return 3;
        }
        if (!this.a0("event param", null, null, s)) {
            return 14;
        }
        ((w)this).f.getClass();
        if (!this.Z(40, "event param", s)) {
            return 3;
        }
        return 0;
    }
    
    public final int x0(final String s) {
        if (!this.e0("user property", s)) {
            return 6;
        }
        if (!this.a0("user property", kz0.k.l, null, s)) {
            return 15;
        }
        ((w)this).f.getClass();
        if (!this.Z(24, "user property", s)) {
            return 6;
        }
        return 0;
    }
    
    public final int y0() {
        if (this.k == null) {
            final f b = f.b;
            final Context f = ((h4)((w)this).f).f;
            b.getClass();
            this.k = g.getApkVersion(f) / 1000;
        }
        return this.k;
    }
    
    public final boolean z() {
        return true;
    }
}
