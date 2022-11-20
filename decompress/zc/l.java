// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.util.List;
import java.lang.ref.Reference;
import java.util.Locale;
import android.text.TextUtils;
import android.telephony.TelephonyManager;
import bd.c0;
import java.util.HashMap;
import com.google.android.exoplayer2.upstream.b;
import android.os.Handler;
import java.util.Iterator;
import x3.a;
import java.lang.ref.WeakReference;
import bd.r;
import bd.x;
import java.util.Map;
import android.content.Context;
import bd.c;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public final class l implements d, t
{
    public static final ImmutableList<Long> n;
    public static final ImmutableList<Long> o;
    public static final ImmutableList<Long> p;
    public static final ImmutableList<Long> q;
    public static final ImmutableList<Long> r;
    public static final ImmutableList<Long> s;
    public static l t;
    public final ImmutableMap<Integer, Long> a;
    public final d.a.a b;
    public final q c;
    public final c d;
    public final boolean e;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long m;
    
    static {
        final Long value = 3300000L;
        final Long value2 = 2000000L;
        final Long value3 = 1300000L;
        n = ImmutableList.of((Object)5400000L, (Object)value, (Object)value2, (Object)value3, (Object)760000L);
        final Long value4 = 1700000L;
        final Long value5 = 820000L;
        o = ImmutableList.of((Object)value4, (Object)value5, (Object)450000L, (Object)180000L, (Object)130000L);
        final Long value6 = 1000000L;
        p = ImmutableList.of((Object)2300000L, (Object)value3, (Object)value6, (Object)value5, (Object)570000L);
        q = ImmutableList.of((Object)3400000L, (Object)value2, (Object)1400000L, (Object)value6, (Object)620000L);
        r = ImmutableList.of((Object)7500000L, (Object)5200000L, (Object)3700000L, (Object)1800000L, (Object)1100000L);
        s = ImmutableList.of((Object)value, (Object)1900000L, (Object)value4, (Object)1500000L, (Object)1200000L);
    }
    
    public l(final Context context, Map c, int d, final x d2, final boolean e) {
        this.a = (ImmutableMap<Integer, Long>)ImmutableMap.copyOf((Map)c);
        this.b = new d.a.a();
        this.c = new q(d);
        this.d = (c)d2;
        this.e = e;
        if (context != null) {
            synchronized (r.class) {
                if (bd.r.e == null) {
                    bd.r.e = new r(context);
                }
                final r e2 = bd.r.e;
                monitorexit(r.class);
                c = e2.c;
                synchronized (c) {
                    d = e2.d;
                    monitorexit(c);
                    this.i = d;
                    this.l = this.i(d);
                    final k k = new k(this);
                    final Iterator<WeakReference<r.a>> iterator = e2.b.iterator();
                    while (iterator.hasNext()) {
                        c = iterator.next();
                        if (((Reference)c).get() == null) {
                            e2.b.remove(c);
                        }
                    }
                    e2.b.add(new WeakReference<r.a>((r.a)k));
                    e2.a.post((Runnable)new x3.a(7, (Object)e2, (Object)k));
                }
            }
        }
        this.i = 0;
        this.l = this.i(0);
    }
    
    public static l j(final Context context) {
        synchronized (l.class) {
            if (l.t == null) {
                final a a = new a(context);
                l.t = new l(a.a, a.b, a.c, a.d, a.e);
            }
            return l.t;
        }
    }
    
    @Override
    public final void a(final Handler handler, final d.a a) {
        handler.getClass();
        a.getClass();
        final d.a.a b = this.b;
        b.getClass();
        b.a(a);
        b.a.add(new d.a.a.a(handler, a));
    }
    
    @Override
    public final void b(final b b, final boolean b2) {
        monitorenter(this);
        int n = 0;
        Label_0045: {
            if (!b2) {
                break Label_0045;
            }
            try {
                final boolean b3 = (b.i & 0x8) == 0x8;
                n = n;
                if (!b3) {
                    n = 1;
                }
                if (n == 0) {
                    return;
                }
                if (this.f == 0) {
                    this.g = this.d.d();
                }
                ++this.f;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    @Override
    public final long c() {
        synchronized (this) {
            return this.l;
        }
    }
    
    @Override
    public final void d(final b b, final boolean b2, final int n) {
        monitorenter(this);
        final int n2 = 1;
        Label_0046: {
            if (!b2) {
                break Label_0046;
            }
            try {
                int n3;
                if ((b.i & 0x8) != 0x8) {
                    n3 = n2;
                }
                else {
                    n3 = 0;
                }
                if (n3 == 0) {
                    return;
                }
                this.h += n;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    @Override
    public final void e(final b b, final boolean b2) {
        monitorenter(this);
        final boolean b3 = false;
        Label_0045: {
            if (!b2) {
                break Label_0045;
            }
            try {
                boolean b4;
                if ((b.i & 0x8) != 0x8) {
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                if (!b4) {
                    return;
                }
                boolean b5 = b3;
                if (this.f > 0) {
                    b5 = true;
                }
                ah0.b.H(b5);
                final long d = this.d.d();
                final int n = (int)(d - this.g);
                this.j += n;
                final long k = this.k;
                final long h = this.h;
                this.k = k + h;
                if (n > 0) {
                    this.c.a(h * 8000.0f / n, (int)Math.sqrt((double)h));
                    if (this.j >= 2000L || this.k >= 524288L) {
                        this.l = (long)this.c.b();
                    }
                    this.k(n, this.h, this.l);
                    this.g = d;
                    this.h = 0L;
                }
                --this.f;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    @Override
    public final void f(final xa.a a) {
        this.b.a((d.a)a);
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final l h() {
        return this;
    }
    
    public final long i(final int n) {
        Long n2;
        if ((n2 = (Long)this.a.get((Object)n)) == null) {
            n2 = (Long)this.a.get((Object)0);
        }
        Long value;
        if ((value = n2) == null) {
            value = 1000000L;
        }
        return value;
    }
    
    public final void k(final int n, final long n2, final long m) {
        if (n == 0 && n2 == 0L && m == this.m) {
            return;
        }
        this.m = m;
        for (final d.a.a.a a : this.b.a) {
            if (!a.c) {
                a.a.post((Runnable)new zc.c(a, n, n2, m));
            }
        }
    }
    
    public static final class a
    {
        public final Context a;
        public HashMap b;
        public int c;
        public x d;
        public boolean e;
        
        public a(final Context context) {
            Context applicationContext;
            if (context == null) {
                applicationContext = null;
            }
            else {
                applicationContext = context.getApplicationContext();
            }
            this.a = applicationContext;
            final int a = c0.a;
            String s = null;
            Label_0075: {
                if (context != null) {
                    final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
                    if (telephonyManager != null) {
                        final String networkCountryIso = telephonyManager.getNetworkCountryIso();
                        if (!TextUtils.isEmpty((CharSequence)networkCountryIso)) {
                            s = zd.b.s1(networkCountryIso);
                            break Label_0075;
                        }
                    }
                }
                s = zd.b.s1(Locale.getDefault().getCountry());
            }
            final ImmutableList<Long> n = l.n;
            s.getClass();
            int n2 = -1;
            switch (s) {
                case "ZW": {
                    n2 = 237;
                    break;
                }
                case "ZM": {
                    n2 = 236;
                    break;
                }
                case "ZA": {
                    n2 = 235;
                    break;
                }
                case "YT": {
                    n2 = 234;
                    break;
                }
                case "YE": {
                    n2 = 233;
                    break;
                }
                case "XK": {
                    n2 = 232;
                    break;
                }
                case "WS": {
                    n2 = 231;
                    break;
                }
                case "WF": {
                    n2 = 230;
                    break;
                }
                case "VU": {
                    n2 = 229;
                    break;
                }
                case "VN": {
                    n2 = 228;
                    break;
                }
                case "VI": {
                    n2 = 227;
                    break;
                }
                case "VG": {
                    n2 = 226;
                    break;
                }
                case "VE": {
                    n2 = 225;
                    break;
                }
                case "VC": {
                    n2 = 224;
                    break;
                }
                case "UZ": {
                    n2 = 223;
                    break;
                }
                case "UY": {
                    n2 = 222;
                    break;
                }
                case "US": {
                    n2 = 221;
                    break;
                }
                case "UG": {
                    n2 = 220;
                    break;
                }
                case "UA": {
                    n2 = 219;
                    break;
                }
                case "TZ": {
                    n2 = 218;
                    break;
                }
                case "TW": {
                    n2 = 217;
                    break;
                }
                case "TV": {
                    n2 = 216;
                    break;
                }
                case "TT": {
                    n2 = 215;
                    break;
                }
                case "TR": {
                    n2 = 214;
                    break;
                }
                case "TO": {
                    n2 = 213;
                    break;
                }
                case "TN": {
                    n2 = 212;
                    break;
                }
                case "TM": {
                    n2 = 211;
                    break;
                }
                case "TL": {
                    n2 = 210;
                    break;
                }
                case "TJ": {
                    n2 = 209;
                    break;
                }
                case "TH": {
                    n2 = 208;
                    break;
                }
                case "TG": {
                    n2 = 207;
                    break;
                }
                case "TD": {
                    n2 = 206;
                    break;
                }
                case "TC": {
                    n2 = 205;
                    break;
                }
                case "SZ": {
                    n2 = 204;
                    break;
                }
                case "SY": {
                    n2 = 203;
                    break;
                }
                case "SX": {
                    n2 = 202;
                    break;
                }
                case "SV": {
                    n2 = 201;
                    break;
                }
                case "ST": {
                    n2 = 200;
                    break;
                }
                case "SS": {
                    n2 = 199;
                    break;
                }
                case "SR": {
                    n2 = 198;
                    break;
                }
                case "SO": {
                    n2 = 197;
                    break;
                }
                case "SN": {
                    n2 = 196;
                    break;
                }
                case "SM": {
                    n2 = 195;
                    break;
                }
                case "SL": {
                    n2 = 194;
                    break;
                }
                case "SK": {
                    n2 = 193;
                    break;
                }
                case "SJ": {
                    n2 = 192;
                    break;
                }
                case "SI": {
                    n2 = 191;
                    break;
                }
                case "SH": {
                    n2 = 190;
                    break;
                }
                case "SG": {
                    n2 = 189;
                    break;
                }
                case "SE": {
                    n2 = 188;
                    break;
                }
                case "SD": {
                    n2 = 187;
                    break;
                }
                case "SC": {
                    n2 = 186;
                    break;
                }
                case "SB": {
                    n2 = 185;
                    break;
                }
                case "SA": {
                    n2 = 184;
                    break;
                }
                case "RW": {
                    n2 = 183;
                    break;
                }
                case "RU": {
                    n2 = 182;
                    break;
                }
                case "RS": {
                    n2 = 181;
                    break;
                }
                case "RO": {
                    n2 = 180;
                    break;
                }
                case "RE": {
                    n2 = 179;
                    break;
                }
                case "QA": {
                    n2 = 178;
                    break;
                }
                case "PY": {
                    n2 = 177;
                    break;
                }
                case "PW": {
                    n2 = 176;
                    break;
                }
                case "PT": {
                    n2 = 175;
                    break;
                }
                case "PS": {
                    n2 = 174;
                    break;
                }
                case "PR": {
                    n2 = 173;
                    break;
                }
                case "PM": {
                    n2 = 172;
                    break;
                }
                case "PL": {
                    n2 = 171;
                    break;
                }
                case "PK": {
                    n2 = 170;
                    break;
                }
                case "PH": {
                    n2 = 169;
                    break;
                }
                case "PG": {
                    n2 = 168;
                    break;
                }
                case "PF": {
                    n2 = 167;
                    break;
                }
                case "PE": {
                    n2 = 166;
                    break;
                }
                case "PA": {
                    n2 = 165;
                    break;
                }
                case "OM": {
                    n2 = 164;
                    break;
                }
                case "NZ": {
                    n2 = 163;
                    break;
                }
                case "NU": {
                    n2 = 162;
                    break;
                }
                case "NR": {
                    n2 = 161;
                    break;
                }
                case "NP": {
                    n2 = 160;
                    break;
                }
                case "NO": {
                    n2 = 159;
                    break;
                }
                case "NL": {
                    n2 = 158;
                    break;
                }
                case "NI": {
                    n2 = 157;
                    break;
                }
                case "NG": {
                    n2 = 156;
                    break;
                }
                case "NE": {
                    n2 = 155;
                    break;
                }
                case "NC": {
                    n2 = 154;
                    break;
                }
                case "NA": {
                    n2 = 153;
                    break;
                }
                case "MZ": {
                    n2 = 152;
                    break;
                }
                case "MY": {
                    n2 = 151;
                    break;
                }
                case "MX": {
                    n2 = 150;
                    break;
                }
                case "MW": {
                    n2 = 149;
                    break;
                }
                case "MV": {
                    n2 = 148;
                    break;
                }
                case "MU": {
                    n2 = 147;
                    break;
                }
                case "MT": {
                    n2 = 146;
                    break;
                }
                case "MS": {
                    n2 = 145;
                    break;
                }
                case "MR": {
                    n2 = 144;
                    break;
                }
                case "MQ": {
                    n2 = 143;
                    break;
                }
                case "MP": {
                    n2 = 142;
                    break;
                }
                case "MO": {
                    n2 = 141;
                    break;
                }
                case "MN": {
                    n2 = 140;
                    break;
                }
                case "MM": {
                    n2 = 139;
                    break;
                }
                case "ML": {
                    n2 = 138;
                    break;
                }
                case "MK": {
                    n2 = 137;
                    break;
                }
                case "MH": {
                    n2 = 136;
                    break;
                }
                case "MG": {
                    n2 = 135;
                    break;
                }
                case "MF": {
                    n2 = 134;
                    break;
                }
                case "ME": {
                    n2 = 133;
                    break;
                }
                case "MD": {
                    n2 = 132;
                    break;
                }
                case "MC": {
                    n2 = 131;
                    break;
                }
                case "MA": {
                    n2 = 130;
                    break;
                }
                case "LY": {
                    n2 = 129;
                    break;
                }
                case "LV": {
                    n2 = 128;
                    break;
                }
                case "LU": {
                    n2 = 127;
                    break;
                }
                case "LT": {
                    n2 = 126;
                    break;
                }
                case "LS": {
                    n2 = 125;
                    break;
                }
                case "LR": {
                    n2 = 124;
                    break;
                }
                case "LK": {
                    n2 = 123;
                    break;
                }
                case "LI": {
                    n2 = 122;
                    break;
                }
                case "LC": {
                    n2 = 121;
                    break;
                }
                case "LB": {
                    n2 = 120;
                    break;
                }
                case "LA": {
                    n2 = 119;
                    break;
                }
                case "KZ": {
                    n2 = 118;
                    break;
                }
                case "KY": {
                    n2 = 117;
                    break;
                }
                case "KW": {
                    n2 = 116;
                    break;
                }
                case "KR": {
                    n2 = 115;
                    break;
                }
                case "KP": {
                    n2 = 114;
                    break;
                }
                case "KM": {
                    n2 = 113;
                    break;
                }
                case "KI": {
                    n2 = 112;
                    break;
                }
                case "KH": {
                    n2 = 111;
                    break;
                }
                case "KG": {
                    n2 = 110;
                    break;
                }
                case "KE": {
                    n2 = 109;
                    break;
                }
                case "JP": {
                    n2 = 108;
                    break;
                }
                case "JO": {
                    n2 = 107;
                    break;
                }
                case "JM": {
                    n2 = 106;
                    break;
                }
                case "JE": {
                    n2 = 105;
                    break;
                }
                case "IT": {
                    n2 = 104;
                    break;
                }
                case "IS": {
                    n2 = 103;
                    break;
                }
                case "IR": {
                    n2 = 102;
                    break;
                }
                case "IQ": {
                    n2 = 101;
                    break;
                }
                case "IO": {
                    n2 = 100;
                    break;
                }
                case "IN": {
                    n2 = 99;
                    break;
                }
                case "IM": {
                    n2 = 98;
                    break;
                }
                case "IL": {
                    n2 = 97;
                    break;
                }
                case "IE": {
                    n2 = 96;
                    break;
                }
                case "ID": {
                    n2 = 95;
                    break;
                }
                case "HU": {
                    n2 = 94;
                    break;
                }
                case "HT": {
                    n2 = 93;
                    break;
                }
                case "HR": {
                    n2 = 92;
                    break;
                }
                case "HN": {
                    n2 = 91;
                    break;
                }
                case "HK": {
                    n2 = 90;
                    break;
                }
                case "GY": {
                    n2 = 89;
                    break;
                }
                case "GW": {
                    n2 = 88;
                    break;
                }
                case "GU": {
                    n2 = 87;
                    break;
                }
                case "GT": {
                    n2 = 86;
                    break;
                }
                case "GR": {
                    n2 = 85;
                    break;
                }
                case "GQ": {
                    n2 = 84;
                    break;
                }
                case "GP": {
                    n2 = 83;
                    break;
                }
                case "GN": {
                    n2 = 82;
                    break;
                }
                case "GM": {
                    n2 = 81;
                    break;
                }
                case "GL": {
                    n2 = 80;
                    break;
                }
                case "GI": {
                    n2 = 79;
                    break;
                }
                case "GH": {
                    n2 = 78;
                    break;
                }
                case "GG": {
                    n2 = 77;
                    break;
                }
                case "GF": {
                    n2 = 76;
                    break;
                }
                case "GE": {
                    n2 = 75;
                    break;
                }
                case "GD": {
                    n2 = 74;
                    break;
                }
                case "GB": {
                    n2 = 73;
                    break;
                }
                case "GA": {
                    n2 = 72;
                    break;
                }
                case "FR": {
                    n2 = 71;
                    break;
                }
                case "FO": {
                    n2 = 70;
                    break;
                }
                case "FM": {
                    n2 = 69;
                    break;
                }
                case "FK": {
                    n2 = 68;
                    break;
                }
                case "FJ": {
                    n2 = 67;
                    break;
                }
                case "FI": {
                    n2 = 66;
                    break;
                }
                case "ET": {
                    n2 = 65;
                    break;
                }
                case "ES": {
                    n2 = 64;
                    break;
                }
                case "ER": {
                    n2 = 63;
                    break;
                }
                case "EG": {
                    n2 = 62;
                    break;
                }
                case "EE": {
                    n2 = 61;
                    break;
                }
                case "EC": {
                    n2 = 60;
                    break;
                }
                case "DZ": {
                    n2 = 59;
                    break;
                }
                case "DO": {
                    n2 = 58;
                    break;
                }
                case "DM": {
                    n2 = 57;
                    break;
                }
                case "DK": {
                    n2 = 56;
                    break;
                }
                case "DJ": {
                    n2 = 55;
                    break;
                }
                case "DE": {
                    n2 = 54;
                    break;
                }
                case "CZ": {
                    n2 = 53;
                    break;
                }
                case "CY": {
                    n2 = 52;
                    break;
                }
                case "CX": {
                    n2 = 51;
                    break;
                }
                case "CW": {
                    n2 = 50;
                    break;
                }
                case "CV": {
                    n2 = 49;
                    break;
                }
                case "CU": {
                    n2 = 48;
                    break;
                }
                case "CR": {
                    n2 = 47;
                    break;
                }
                case "CO": {
                    n2 = 46;
                    break;
                }
                case "CN": {
                    n2 = 45;
                    break;
                }
                case "CM": {
                    n2 = 44;
                    break;
                }
                case "CL": {
                    n2 = 43;
                    break;
                }
                case "CK": {
                    n2 = 42;
                    break;
                }
                case "CI": {
                    n2 = 41;
                    break;
                }
                case "CH": {
                    n2 = 40;
                    break;
                }
                case "CG": {
                    n2 = 39;
                    break;
                }
                case "CF": {
                    n2 = 38;
                    break;
                }
                case "CD": {
                    n2 = 37;
                    break;
                }
                case "CA": {
                    n2 = 36;
                    break;
                }
                case "BZ": {
                    n2 = 35;
                    break;
                }
                case "BY": {
                    n2 = 34;
                    break;
                }
                case "BW": {
                    n2 = 33;
                    break;
                }
                case "BT": {
                    n2 = 32;
                    break;
                }
                case "BS": {
                    n2 = 31;
                    break;
                }
                case "BR": {
                    n2 = 30;
                    break;
                }
                case "BQ": {
                    n2 = 29;
                    break;
                }
                case "BO": {
                    n2 = 28;
                    break;
                }
                case "BN": {
                    n2 = 27;
                    break;
                }
                case "BM": {
                    n2 = 26;
                    break;
                }
                case "BL": {
                    n2 = 25;
                    break;
                }
                case "BJ": {
                    n2 = 24;
                    break;
                }
                case "BI": {
                    n2 = 23;
                    break;
                }
                case "BH": {
                    n2 = 22;
                    break;
                }
                case "BG": {
                    n2 = 21;
                    break;
                }
                case "BF": {
                    n2 = 20;
                    break;
                }
                case "BE": {
                    n2 = 19;
                    break;
                }
                case "BD": {
                    n2 = 18;
                    break;
                }
                case "BB": {
                    n2 = 17;
                    break;
                }
                case "BA": {
                    n2 = 16;
                    break;
                }
                case "AZ": {
                    n2 = 15;
                    break;
                }
                case "AX": {
                    n2 = 14;
                    break;
                }
                case "AW": {
                    n2 = 13;
                    break;
                }
                case "AU": {
                    n2 = 12;
                    break;
                }
                case "AT": {
                    n2 = 11;
                    break;
                }
                case "AS": {
                    n2 = 10;
                    break;
                }
                case "AR": {
                    n2 = 9;
                    break;
                }
                case "AQ": {
                    n2 = 8;
                    break;
                }
                case "AO": {
                    n2 = 7;
                    break;
                }
                case "AM": {
                    n2 = 6;
                    break;
                }
                case "AL": {
                    n2 = 5;
                    break;
                }
                case "AI": {
                    n2 = 4;
                    break;
                }
                case "AG": {
                    n2 = 3;
                    break;
                }
                case "AF": {
                    n2 = 2;
                    break;
                }
                case "AE": {
                    n2 = 1;
                    break;
                }
                case "AD": {
                    n2 = 0;
                    break;
                }
                default:
                    break;
            }
            int[] array = null;
            switch (n2) {
                default: {
                    final int[] array2;
                    array = (array2 = new int[6]);
                    array2[1] = (array2[0] = 2);
                    array2[3] = (array2[2] = 2);
                    array2[5] = (array2[4] = 2);
                    break;
                }
                case 237: {
                    final int[] array3;
                    array = (array3 = new int[6]);
                    array3[0] = 3;
                    array3[array3[1] = 2] = 4;
                    array3[3] = 3;
                    array3[5] = (array3[4] = 2);
                    break;
                }
                case 236: {
                    final int[] array4;
                    array = (array4 = new int[6]);
                    array4[1] = (array4[0] = 3);
                    array4[2] = 4;
                    array4[3] = 2;
                    array4[5] = (array4[4] = 2);
                    break;
                }
                case 235: {
                    final int[] array5;
                    array = (array5 = new int[6]);
                    array5[1] = (array5[0] = 3);
                    array5[2] = 1;
                    array5[4] = (array5[3] = 1);
                    array5[5] = 2;
                    break;
                }
                case 234: {
                    final int[] array6;
                    array = (array6 = new int[6]);
                    array6[0] = 4;
                    array6[1] = 1;
                    array6[3] = (array6[2] = 1);
                    array6[5] = (array6[4] = 2);
                    break;
                }
                case 232: {
                    final int[] array7;
                    array = (array7 = new int[6]);
                    array7[array7[0] = 1] = 1;
                    array7[3] = (array7[2] = 1);
                    array7[5] = (array7[4] = 2);
                    break;
                }
                case 231: {
                    final int[] array8;
                    array = (array8 = new int[6]);
                    array8[0] = 3;
                    array8[1] = 1;
                    array8[2] = 2;
                    array8[3] = 1;
                    array8[5] = (array8[4] = 2);
                    break;
                }
                case 229: {
                    final int[] array9;
                    array = (array9 = new int[6]);
                    array9[0] = 4;
                    array9[array9[1] = 2] = 2;
                    array9[3] = 1;
                    array9[5] = (array9[4] = 2);
                    break;
                }
                case 228: {
                    final int[] array10;
                    array = (array10 = new int[6]);
                    array10[0] = 0;
                    array10[1] = 3;
                    array10[array10[2] = 3] = 4;
                    array10[5] = (array10[4] = 2);
                    break;
                }
                case 227: {
                    final int[] array11;
                    array = (array11 = new int[6]);
                    array11[0] = 1;
                    array11[array11[1] = 2] = 1;
                    array11[3] = 3;
                    array11[5] = (array11[4] = 2);
                    break;
                }
                case 223: {
                    final int[] array12;
                    array = (array12 = new int[6]);
                    array12[1] = (array12[0] = 2);
                    array12[array12[2] = 3] = 4;
                    array12[5] = (array12[4] = 2);
                    break;
                }
                case 219: {
                    final int[] array13;
                    array = (array13 = new int[6]);
                    array13[0] = 0;
                    array13[array13[1] = 3] = (array13[2] = 1);
                    array13[5] = (array13[4] = 2);
                    break;
                }
                case 217: {
                    final int[] array14;
                    array = (array14 = new int[6]);
                    array14[1] = (array14[0] = 0);
                    array14[3] = (array14[2] = 0);
                    array14[5] = (array14[4] = 0);
                    break;
                }
                case 215: {
                    final int[] array15;
                    array = (array15 = new int[6]);
                    array15[array15[0] = 1] = 4;
                    array15[3] = (array15[2] = 1);
                    array15[5] = (array15[4] = 2);
                    break;
                }
                case 214: {
                    final int[] array16;
                    array = (array16 = new int[6]);
                    array16[array16[0] = 1] = 1;
                    array16[2] = 0;
                    array16[3] = 1;
                    array16[5] = (array16[4] = 2);
                    break;
                }
                case 213: {
                    final int[] array17;
                    array = (array17 = new int[6]);
                    array17[0] = 4;
                    array17[1] = 2;
                    array17[array17[2] = 3] = 3;
                    array17[5] = (array17[4] = 2);
                    break;
                }
                case 211: {
                    final int[] array18;
                    array = (array18 = new int[6]);
                    array18[0] = 4;
                    array18[array18[1] = 2] = 4;
                    array18[3] = 2;
                    array18[5] = (array18[4] = 2);
                    break;
                }
                case 209: {
                    final int[] array19;
                    array = (array19 = new int[6]);
                    array19[0] = 4;
                    array19[1] = 2;
                    array19[3] = (array19[2] = 4);
                    array19[5] = (array19[4] = 2);
                    break;
                }
                case 208: {
                    final int[] array20;
                    array = (array20 = new int[6]);
                    array20[0] = 0;
                    array20[1] = 3;
                    array20[2] = 2;
                    array20[4] = (array20[3] = 3);
                    array20[5] = 0;
                    break;
                }
                case 207: {
                    final int[] array21;
                    array = (array21 = new int[6]);
                    array21[1] = (array21[0] = 3);
                    array21[2] = 2;
                    array21[3] = 0;
                    array21[5] = (array21[4] = 2);
                    break;
                }
                case 204: {
                    final int[] array22;
                    array = (array22 = new int[6]);
                    array22[0] = 4;
                    array22[1] = 3;
                    array22[2] = 2;
                    array22[3] = 4;
                    array22[5] = (array22[4] = 2);
                    break;
                }
                case 202:
                case 205: {
                    final int[] array23;
                    array = (array23 = new int[6]);
                    array23[0] = 2;
                    array23[array23[1] = 2] = 1;
                    array23[3] = 0;
                    array23[5] = (array23[4] = 2);
                    break;
                }
                case 201: {
                    final int[] array24;
                    array = (array24 = new int[6]);
                    array24[1] = (array24[0] = 2);
                    array24[array24[2] = 3] = 3;
                    array24[5] = (array24[4] = 2);
                    break;
                }
                case 194: {
                    final int[] array25;
                    array = (array25 = new int[6]);
                    array25[0] = 4;
                    array25[1] = 3;
                    array25[2] = 4;
                    array25[3] = 1;
                    array25[5] = (array25[4] = 2);
                    break;
                }
                case 189: {
                    final int[] array26;
                    array = (array26 = new int[6]);
                    array26[array26[0] = 1] = 1;
                    array26[2] = 2;
                    array26[3] = 3;
                    array26[4] = 1;
                    array26[5] = 4;
                    break;
                }
                case 186: {
                    final int[] array27;
                    array = (array27 = new int[6]);
                    array27[0] = 4;
                    array27[1] = 3;
                    array27[2] = 0;
                    array27[3] = 2;
                    array27[5] = (array27[4] = 2);
                    break;
                }
                case 184:
                case 212:
                case 226: {
                    final int[] array28;
                    array = (array28 = new int[6]);
                    array28[1] = (array28[0] = 2);
                    array28[3] = (array28[2] = 1);
                    array28[5] = (array28[4] = 2);
                    break;
                }
                case 183: {
                    final int[] array29;
                    array = (array29 = new int[6]);
                    array29[0] = 3;
                    array29[1] = 4;
                    array29[array29[2] = 3] = 0;
                    array29[5] = (array29[4] = 2);
                    break;
                }
                case 182: {
                    final int[] array30;
                    array = (array30 = new int[6]);
                    array30[0] = 0;
                    array30[2] = (array30[1] = 0);
                    array30[3] = 1;
                    array30[5] = (array30[4] = 2);
                    break;
                }
                case 180: {
                    final int[] array31;
                    array = (array31 = new int[6]);
                    array31[1] = (array31[0] = 0);
                    array31[2] = 1;
                    array31[4] = (array31[3] = 1);
                    array31[5] = 2;
                    break;
                }
                case 179: {
                    final int[] array32;
                    array = (array32 = new int[6]);
                    array32[0] = 1;
                    array32[2] = (array32[1] = 1);
                    array32[3] = 2;
                    array32[5] = (array32[4] = 2);
                    break;
                }
                case 178: {
                    final int[] array33;
                    array = (array33 = new int[6]);
                    array33[0] = 2;
                    array33[1] = 4;
                    array33[2] = 2;
                    array33[array33[3] = 4] = 4;
                    array33[5] = 2;
                    break;
                }
                case 177: {
                    final int[] array34;
                    array = (array34 = new int[6]);
                    array34[1] = (array34[0] = 2);
                    array34[array34[2] = 3] = 2;
                    array34[5] = (array34[4] = 2);
                    break;
                }
                case 176: {
                    final int[] array35;
                    array = (array35 = new int[6]);
                    array35[0] = 2;
                    array35[array35[1] = 2] = 4;
                    array35[3] = 1;
                    array35[5] = (array35[4] = 2);
                    break;
                }
                case 175: {
                    final int[] array36;
                    array = (array36 = new int[6]);
                    array36[0] = 0;
                    array36[1] = 1;
                    array36[3] = (array36[2] = 0);
                    array36[5] = (array36[4] = 2);
                    break;
                }
                case 174: {
                    final int[] array37;
                    array = (array37 = new int[6]);
                    array37[0] = 3;
                    array37[1] = 4;
                    array37[2] = 1;
                    array37[3] = 2;
                    array37[5] = (array37[4] = 2);
                    break;
                }
                case 173: {
                    final int[] array38;
                    array = (array38 = new int[6]);
                    array38[0] = 2;
                    array38[array38[1] = 3] = (array38[2] = 2);
                    array38[5] = (array38[4] = 3);
                    break;
                }
                case 169: {
                    final int[] array39;
                    array = (array39 = new int[6]);
                    array39[0] = 2;
                    array39[array39[1] = 2] = 3;
                    array39[4] = (array39[3] = 3);
                    array39[5] = 2;
                    break;
                }
                case 167: {
                    final int[] array40;
                    array = (array40 = new int[6]);
                    array40[0] = 2;
                    array40[1] = 3;
                    array40[array40[2] = 3] = 1;
                    array40[5] = (array40[4] = 2);
                    break;
                }
                case 166: {
                    final int[] array41;
                    array = (array41 = new int[6]);
                    array41[0] = 2;
                    array41[1] = 3;
                    array41[2] = 4;
                    array41[array41[3] = 4] = 4;
                    array41[5] = 2;
                    break;
                }
                case 165: {
                    final int[] array42;
                    array = (array42 = new int[6]);
                    array42[array42[0] = 1] = 3;
                    array42[array42[2] = 3] = 3;
                    array42[5] = (array42[4] = 2);
                    break;
                }
                case 164: {
                    final int[] array43;
                    array = (array43 = new int[6]);
                    array43[0] = 2;
                    array43[1] = 3;
                    array43[2] = 1;
                    array43[3] = 3;
                    array43[4] = 4;
                    array43[5] = 2;
                    break;
                }
                case 163: {
                    final int[] array44;
                    array = (array44 = new int[6]);
                    array44[array44[0] = 1] = 0;
                    array44[2] = 1;
                    array44[3] = 2;
                    array44[4] = 4;
                    array44[5] = 2;
                    break;
                }
                case 161: {
                    final int[] array45;
                    array = (array45 = new int[6]);
                    array45[0] = 3;
                    array45[array45[1] = 2] = 2;
                    array45[3] = 0;
                    array45[5] = (array45[4] = 2);
                    break;
                }
                case 160: {
                    final int[] array46;
                    array = (array46 = new int[6]);
                    array46[0] = 2;
                    array46[1] = 1;
                    array46[2] = 4;
                    array46[3] = 3;
                    array46[5] = (array46[4] = 2);
                    break;
                }
                case 159: {
                    final int[] array47;
                    array = (array47 = new int[6]);
                    array47[1] = (array47[0] = 0);
                    array47[2] = 2;
                    array47[4] = (array47[3] = 0);
                    array47[5] = 2;
                    break;
                }
                case 158: {
                    final int[] array48;
                    array = (array48 = new int[6]);
                    array48[1] = (array48[0] = 0);
                    array48[array48[2] = 3] = 2;
                    array48[4] = 0;
                    array48[5] = 4;
                    break;
                }
                case 157: {
                    final int[] array49;
                    array = (array49 = new int[6]);
                    array49[0] = 2;
                    array49[1] = 3;
                    array49[2] = 4;
                    array49[3] = 3;
                    array49[5] = (array49[4] = 2);
                    break;
                }
                case 156: {
                    final int[] array50;
                    array = (array50 = new int[6]);
                    array50[0] = 3;
                    array50[1] = 4;
                    array50[3] = (array50[2] = 1);
                    array50[5] = (array50[4] = 2);
                    break;
                }
                case 153: {
                    final int[] array51;
                    array = (array51 = new int[6]);
                    array51[0] = 4;
                    array51[array51[1] = 3] = (array51[2] = 2);
                    array51[5] = (array51[4] = 2);
                    break;
                }
                case 149: {
                    final int[] array52;
                    array = (array52 = new int[6]);
                    array52[0] = 4;
                    array52[array52[1] = 2] = 1;
                    array52[3] = 0;
                    array52[5] = (array52[4] = 2);
                    break;
                }
                case 148: {
                    final int[] array53;
                    array = (array53 = new int[6]);
                    array53[0] = 3;
                    array53[1] = 4;
                    array53[2] = 1;
                    array53[3] = 4;
                    array53[5] = (array53[4] = 2);
                    break;
                }
                case 147: {
                    final int[] array54;
                    array = (array54 = new int[6]);
                    array54[0] = 3;
                    array54[2] = (array54[1] = 1);
                    array54[3] = 2;
                    array54[5] = (array54[4] = 2);
                    break;
                }
                case 144: {
                    final int[] array55;
                    array = (array55 = new int[6]);
                    array55[0] = 4;
                    array55[1] = 1;
                    array55[array55[2] = 3] = 4;
                    array55[5] = (array55[4] = 2);
                    break;
                }
                case 141: {
                    final int[] array56;
                    array = (array56 = new int[6]);
                    array56[0] = 0;
                    array56[1] = 2;
                    array56[3] = (array56[2] = 4);
                    array56[5] = (array56[4] = 2);
                    break;
                }
                case 140: {
                    final int[] array57;
                    array = (array57 = new int[6]);
                    array57[0] = 2;
                    array57[1] = 0;
                    array57[2] = 1;
                    array57[3] = 2;
                    array57[5] = (array57[4] = 2);
                    break;
                }
                case 139: {
                    final int[] array58;
                    array = (array58 = new int[6]);
                    array58[0] = 2;
                    array58[1] = 4;
                    array58[array58[2] = 3] = 3;
                    array58[5] = (array58[4] = 2);
                    break;
                }
                case 138: {
                    final int[] array59;
                    array = (array59 = new int[6]);
                    array59[0] = 4;
                    array59[1] = 3;
                    array59[array59[2] = 3] = 1;
                    array59[5] = (array59[4] = 2);
                    break;
                }
                case 136: {
                    final int[] array60;
                    array = (array60 = new int[6]);
                    array60[0] = 3;
                    array60[array60[1] = 2] = 2;
                    array60[3] = 4;
                    array60[5] = (array60[4] = 2);
                    break;
                }
                case 135: {
                    final int[] array61;
                    array = (array61 = new int[6]);
                    array61[0] = 3;
                    array61[1] = 4;
                    array61[3] = (array61[2] = 2);
                    array61[5] = (array61[4] = 2);
                    break;
                }
                case 134: {
                    final int[] array62;
                    array = (array62 = new int[6]);
                    array62[0] = 1;
                    array62[array62[1] = 2] = 1;
                    array62[3] = 0;
                    array62[5] = (array62[4] = 2);
                    break;
                }
                case 131: {
                    final int[] array63;
                    array = (array63 = new int[6]);
                    array63[0] = 0;
                    array63[array63[1] = 2] = 2;
                    array63[3] = 0;
                    array63[5] = (array63[4] = 2);
                    break;
                }
                case 127: {
                    final int[] array64;
                    array = (array64 = new int[6]);
                    array64[array64[0] = 1] = 0;
                    array64[3] = (array64[2] = 2);
                    array64[5] = (array64[4] = 2);
                    break;
                }
                case 125: {
                    final int[] array65;
                    array = (array65 = new int[6]);
                    array65[1] = (array65[0] = 3);
                    array65[2] = 4;
                    array65[3] = 3;
                    array65[5] = (array65[4] = 2);
                    break;
                }
                case 124: {
                    final int[] array66;
                    array = (array66 = new int[6]);
                    array66[0] = 3;
                    array66[2] = (array66[1] = 4);
                    array66[3] = 3;
                    array66[5] = (array66[4] = 2);
                    break;
                }
                case 123: {
                    final int[] array67;
                    array = (array67 = new int[6]);
                    array67[0] = 3;
                    array67[1] = 1;
                    array67[2] = 3;
                    array67[array67[3] = 4] = 4;
                    array67[5] = 2;
                    break;
                }
                case 120: {
                    final int[] array68;
                    array = (array68 = new int[6]);
                    array68[0] = 3;
                    array68[array68[1] = 2] = 1;
                    array68[3] = 4;
                    array68[5] = (array68[4] = 2);
                    break;
                }
                case 119:
                case 222: {
                    final int[] array69;
                    array = (array69 = new int[6]);
                    array69[0] = 2;
                    array69[array69[1] = 2] = 1;
                    array69[3] = 2;
                    array69[5] = (array69[4] = 2);
                    break;
                }
                case 118: {
                    final int[] array70;
                    array = (array70 = new int[6]);
                    array70[array70[0] = 1] = 1;
                    array70[3] = (array70[2] = 2);
                    array70[5] = (array70[4] = 2);
                    break;
                }
                case 116: {
                    final int[] array71;
                    array = (array71 = new int[6]);
                    array71[array71[0] = 1] = 1;
                    array71[2] = 0;
                    array71[4] = (array71[3] = 0);
                    array71[5] = 2;
                    break;
                }
                case 115: {
                    final int[] array72;
                    array = (array72 = new int[6]);
                    array72[1] = (array72[0] = 0);
                    array72[2] = 1;
                    array72[3] = 3;
                    array72[5] = (array72[4] = 4);
                    break;
                }
                case 112:
                case 113:
                case 129:
                case 185: {
                    final int[] array73;
                    array = (array73 = new int[6]);
                    array73[0] = 4;
                    array73[array73[1] = 2] = 4;
                    array73[3] = 3;
                    array73[5] = (array73[4] = 2);
                    break;
                }
                case 111: {
                    final int[] array74;
                    array = (array74 = new int[6]);
                    array74[array74[0] = 1] = 1;
                    array74[2] = 4;
                    array74[3] = 2;
                    array74[5] = (array74[4] = 2);
                    break;
                }
                case 110: {
                    final int[] array75;
                    array = (array75 = new int[6]);
                    array75[0] = 2;
                    array75[1] = 1;
                    array75[3] = (array75[2] = 1);
                    array75[5] = (array75[4] = 2);
                    break;
                }
                case 109: {
                    final int[] array76;
                    array = (array76 = new int[6]);
                    array76[0] = 3;
                    array76[array76[1] = 3] = (array76[2] = 2);
                    array76[5] = (array76[4] = 2);
                    break;
                }
                case 108: {
                    final int[] array77;
                    array = (array77 = new int[6]);
                    array77[0] = 0;
                    array77[1] = 1;
                    array77[2] = 0;
                    array77[3] = 1;
                    array77[5] = (array77[4] = 1);
                    break;
                }
                case 107:
                case 133: {
                    final int[] array78;
                    array = (array78 = new int[6]);
                    array78[0] = 1;
                    array78[2] = (array78[1] = 0);
                    array78[3] = 1;
                    array78[5] = (array78[4] = 2);
                    break;
                }
                case 105: {
                    final int[] array79;
                    array = (array79 = new int[6]);
                    array79[0] = 3;
                    array79[array79[1] = 2] = 1;
                    array79[3] = 2;
                    array79[5] = (array79[4] = 2);
                    break;
                }
                case 104: {
                    final int[] array80;
                    array = (array80 = new int[6]);
                    array80[0] = 0;
                    array80[1] = 1;
                    array80[2] = 0;
                    array80[4] = (array80[3] = 1);
                    array80[5] = 2;
                    break;
                }
                case 102: {
                    final int[] array81;
                    array = (array81 = new int[6]);
                    array81[0] = 3;
                    array81[1] = 0;
                    array81[3] = (array81[2] = 1);
                    array81[4] = 3;
                    array81[5] = 0;
                    break;
                }
                case 101:
                case 220: {
                    final int[] array82;
                    array = (array82 = new int[6]);
                    array82[1] = (array82[0] = 3);
                    array82[array82[2] = 3] = 3;
                    array82[5] = (array82[4] = 2);
                    break;
                }
                case 99: {
                    final int[] array83;
                    array = (array83 = new int[6]);
                    array83[array83[0] = 1] = 1;
                    array83[array83[2] = 3] = 2;
                    array83[4] = 4;
                    array83[5] = 3;
                    break;
                }
                case 98: {
                    final int[] array84;
                    array = (array84 = new int[6]);
                    array84[0] = 0;
                    array84[array84[1] = 2] = 0;
                    array84[3] = 1;
                    array84[5] = (array84[4] = 2);
                    break;
                }
                case 97: {
                    final int[] array85;
                    array = (array85 = new int[6]);
                    array85[array85[0] = 1] = 1;
                    array85[2] = 2;
                    array85[3] = 3;
                    array85[4] = 4;
                    array85[5] = 2;
                    break;
                }
                case 95: {
                    final int[] array86;
                    array = (array86 = new int[6]);
                    array86[0] = 3;
                    array86[array86[1] = 2] = 3;
                    array86[4] = (array86[3] = 3);
                    array86[5] = 2;
                    break;
                }
                case 94: {
                    final int[] array87;
                    array = (array87 = new int[6]);
                    array87[0] = 0;
                    array87[2] = (array87[1] = 0);
                    array87[3] = 1;
                    array87[4] = 3;
                    array87[5] = 2;
                    break;
                }
                case 91:
                case 170:
                case 197: {
                    final int[] array88;
                    array = (array88 = new int[6]);
                    array88[0] = 3;
                    array88[1] = 2;
                    array88[array88[2] = 3] = 3;
                    array88[5] = (array88[4] = 2);
                    break;
                }
                case 90: {
                    final int[] array89;
                    array = (array89 = new int[6]);
                    array89[0] = 0;
                    array89[1] = 1;
                    array89[2] = 2;
                    array89[3] = 3;
                    array89[4] = 2;
                    array89[5] = 0;
                    break;
                }
                case 88:
                case 218: {
                    final int[] array90;
                    array = (array90 = new int[6]);
                    array90[0] = 3;
                    array90[1] = 4;
                    array90[array90[2] = 3] = 3;
                    array90[5] = (array90[4] = 2);
                    break;
                }
                case 86: {
                    final int[] array91;
                    array = (array91 = new int[6]);
                    array91[0] = 2;
                    array91[1] = 3;
                    array91[2] = 2;
                    array91[3] = 1;
                    array91[5] = (array91[4] = 2);
                    break;
                }
                case 85:
                case 92:
                case 132:
                case 137:
                case 181: {
                    final int[] array92;
                    array = (array92 = new int[6]);
                    array92[array92[0] = 1] = 0;
                    array92[3] = (array92[2] = 0);
                    array92[5] = (array92[4] = 2);
                    break;
                }
                case 84: {
                    final int[] array93;
                    array = (array93 = new int[6]);
                    array93[0] = 4;
                    array93[1] = 2;
                    array93[array93[2] = 3] = 4;
                    array93[5] = (array93[4] = 2);
                    break;
                }
                case 82: {
                    final int[] array94;
                    array = (array94 = new int[6]);
                    array94[0] = 4;
                    array94[1] = 3;
                    array94[2] = 4;
                    array94[3] = 2;
                    array94[5] = (array94[4] = 2);
                    break;
                }
                case 81:
                case 230: {
                    final int[] array95;
                    array = (array95 = new int[6]);
                    array95[0] = 4;
                    array95[array95[1] = 2] = 2;
                    array95[3] = 4;
                    array95[5] = (array95[4] = 2);
                    break;
                }
                case 78: {
                    final int[] array96;
                    array = (array96 = new int[6]);
                    array96[0] = 3;
                    array96[1] = 2;
                    array96[array96[2] = 3] = 2;
                    array96[5] = (array96[4] = 2);
                    break;
                }
                case 76:
                case 83:
                case 143: {
                    final int[] array97;
                    array = (array97 = new int[6]);
                    array97[0] = 2;
                    array97[1] = 1;
                    array97[2] = 2;
                    array97[3] = 3;
                    array97[5] = (array97[4] = 2);
                    break;
                }
                case 75: {
                    final int[] array98;
                    array = (array98 = new int[6]);
                    array98[0] = 1;
                    array98[2] = (array98[1] = 1);
                    array98[3] = 3;
                    array98[5] = (array98[4] = 2);
                    break;
                }
                case 73: {
                    final int[] array99;
                    array = (array99 = new int[6]);
                    array99[1] = (array99[0] = 0);
                    array99[3] = (array99[2] = 1);
                    array99[4] = 2;
                    array99[5] = 3;
                    break;
                }
                case 72: {
                    final int[] array100;
                    array = (array100 = new int[6]);
                    array100[0] = 2;
                    array100[array100[1] = 3] = (array100[2] = 1);
                    array100[5] = (array100[4] = 2);
                    break;
                }
                case 71: {
                    final int[] array101;
                    array = (array101 = new int[6]);
                    array101[array101[0] = 1] = 1;
                    array101[2] = 2;
                    array101[3] = 1;
                    array101[5] = (array101[4] = 1);
                    break;
                }
                case 69: {
                    final int[] array102;
                    array = (array102 = new int[6]);
                    array102[0] = 3;
                    array102[array102[1] = 2] = 4;
                    array102[3] = 2;
                    array102[5] = (array102[4] = 2);
                    break;
                }
                case 68:
                case 114:
                case 130:
                case 152:
                case 200: {
                    final int[] array103;
                    array = (array103 = new int[6]);
                    array103[0] = 3;
                    array103[1] = 2;
                    array103[3] = (array103[2] = 2);
                    array103[5] = (array103[4] = 2);
                    break;
                }
                case 67: {
                    final int[] array104;
                    array = (array104 = new int[6]);
                    array104[0] = 3;
                    array104[1] = 1;
                    array104[array104[2] = 3] = 3;
                    array104[5] = (array104[4] = 2);
                    break;
                }
                case 66: {
                    final int[] array105;
                    array = (array105 = new int[6]);
                    array105[0] = 0;
                    array105[2] = (array105[1] = 0);
                    array105[3] = 1;
                    array105[4] = 0;
                    array105[5] = 2;
                    break;
                }
                case 65: {
                    final int[] array106;
                    array = (array106 = new int[6]);
                    array106[1] = (array106[0] = 4);
                    array106[array106[2] = 3] = 1;
                    array106[5] = (array106[4] = 2);
                    break;
                }
                case 64:
                case 96: {
                    final int[] array107;
                    array = (array107 = new int[6]);
                    array107[0] = 0;
                    array107[1] = 1;
                    array107[3] = (array107[2] = 1);
                    array107[5] = (array107[4] = 2);
                    break;
                }
                case 62: {
                    final int[] array108;
                    array = (array108 = new int[6]);
                    array108[0] = 3;
                    array108[1] = 4;
                    array108[2] = 2;
                    array108[3] = 3;
                    array108[5] = (array108[4] = 2);
                    break;
                }
                case 61:
                case 126:
                case 128:
                case 146: {
                    final int[] array109;
                    array = (array109 = new int[6]);
                    array109[1] = (array109[0] = 0);
                    array109[3] = (array109[2] = 0);
                    array109[5] = (array109[4] = 2);
                    break;
                }
                case 60: {
                    final int[] array110;
                    array = (array110 = new int[6]);
                    array110[0] = 2;
                    array110[1] = 4;
                    array110[2] = 2;
                    array110[3] = 1;
                    array110[5] = (array110[4] = 2);
                    break;
                }
                case 58:
                case 106: {
                    final int[] array111;
                    array = (array111 = new int[6]);
                    array111[0] = 3;
                    array111[1] = 4;
                    array111[3] = (array111[2] = 4);
                    array111[5] = (array111[4] = 2);
                    break;
                }
                case 56: {
                    final int[] array112;
                    array = (array112 = new int[6]);
                    array112[1] = (array112[0] = 0);
                    array112[2] = 1;
                    array112[4] = (array112[3] = 0);
                    array112[5] = 2;
                    break;
                }
                case 55: {
                    final int[] array113;
                    array = (array113 = new int[6]);
                    array113[0] = 4;
                    array113[1] = 1;
                    array113[3] = (array113[2] = 4);
                    array113[5] = (array113[4] = 2);
                    break;
                }
                case 54: {
                    final int[] array114;
                    array = (array114 = new int[6]);
                    array114[1] = (array114[0] = 0);
                    array114[3] = (array114[2] = 2);
                    array114[4] = 1;
                    array114[5] = 2;
                    break;
                }
                case 52: {
                    final int[] array115;
                    array = (array115 = new int[6]);
                    array115[array115[0] = 1] = 0;
                    array115[3] = (array115[2] = 0);
                    array115[4] = 1;
                    array115[5] = 2;
                    break;
                }
                case 50: {
                    final int[] array116;
                    array = (array116 = new int[6]);
                    array116[1] = (array116[0] = 2);
                    array116[3] = (array116[2] = 0);
                    array116[5] = (array116[4] = 2);
                    break;
                }
                case 49: {
                    final int[] array117;
                    array = (array117 = new int[6]);
                    array117[0] = 2;
                    array117[1] = 3;
                    array117[2] = 1;
                    array117[3] = 0;
                    array117[5] = (array117[4] = 2);
                    break;
                }
                case 48:
                case 168: {
                    final int[] array118;
                    array = (array118 = new int[6]);
                    array118[1] = (array118[0] = 4);
                    array118[array118[2] = 3] = 2;
                    array118[5] = (array118[4] = 2);
                    break;
                }
                case 47: {
                    final int[] array119;
                    array = (array119 = new int[6]);
                    array119[1] = (array119[0] = 2);
                    array119[3] = (array119[2] = 4);
                    array119[5] = (array119[4] = 2);
                    break;
                }
                case 46: {
                    final int[] array120;
                    array = (array120 = new int[6]);
                    array120[0] = 2;
                    array120[array120[1] = 2] = 4;
                    array120[3] = 2;
                    array120[5] = (array120[4] = 2);
                    break;
                }
                case 45: {
                    final int[] array121;
                    array = (array121 = new int[6]);
                    array121[0] = 2;
                    array121[1] = 0;
                    array121[3] = (array121[2] = 2);
                    array121[4] = 3;
                    array121[5] = 1;
                    break;
                }
                case 43:
                case 171:
                case 221: {
                    final int[] array122;
                    array = (array122 = new int[6]);
                    array122[array122[0] = 1] = 1;
                    array122[3] = (array122[2] = 2);
                    array122[4] = 3;
                    array122[5] = 2;
                    break;
                }
                case 42: {
                    final int[] array123;
                    array = (array123 = new int[6]);
                    array123[0] = 2;
                    array123[array123[1] = 2] = 2;
                    array123[3] = 1;
                    array123[5] = (array123[4] = 2);
                    break;
                }
                case 41: {
                    final int[] array124;
                    array = (array124 = new int[6]);
                    array124[1] = (array124[0] = 3);
                    array124[array124[2] = 3] = 4;
                    array124[5] = (array124[4] = 2);
                    break;
                }
                case 39:
                case 150: {
                    final int[] array125;
                    array = (array125 = new int[6]);
                    array125[0] = 2;
                    array125[1] = 4;
                    array125[array125[2] = 3] = 4;
                    array125[5] = (array125[4] = 2);
                    break;
                }
                case 38: {
                    final int[] array126;
                    array = (array126 = new int[6]);
                    array126[0] = 4;
                    array126[1] = 2;
                    array126[array126[2] = 3] = 2;
                    array126[5] = (array126[4] = 2);
                    break;
                }
                case 37: {
                    final int[] array127;
                    array = (array127 = new int[6]);
                    array127[0] = 4;
                    array127[1] = 2;
                    array127[array127[2] = 3] = 1;
                    array127[5] = (array127[4] = 2);
                    break;
                }
                case 36: {
                    final int[] array128;
                    array = (array128 = new int[6]);
                    array128[0] = 0;
                    array128[array128[1] = 2] = 1;
                    array128[3] = 2;
                    array128[4] = 4;
                    array128[5] = 1;
                    break;
                }
                case 35: {
                    final int[] array129;
                    array = (array129 = new int[6]);
                    array129[0] = 2;
                    array129[1] = 4;
                    array129[3] = (array129[2] = 2);
                    array129[5] = (array129[4] = 2);
                    break;
                }
                case 34: {
                    final int[] array130;
                    array = (array130 = new int[6]);
                    array130[0] = 0;
                    array130[2] = (array130[1] = 1);
                    array130[3] = 3;
                    array130[5] = (array130[4] = 2);
                    break;
                }
                case 33:
                case 89: {
                    final int[] array131;
                    array = (array131 = new int[6]);
                    array131[0] = 3;
                    array131[1] = 4;
                    array131[2] = 1;
                    array131[3] = 0;
                    array131[5] = (array131[4] = 2);
                    break;
                }
                case 32: {
                    final int[] array132;
                    array = (array132 = new int[6]);
                    array132[0] = 3;
                    array132[1] = 1;
                    array132[array132[2] = 3] = 2;
                    array132[5] = (array132[4] = 2);
                    break;
                }
                case 31: {
                    final int[] array133;
                    array = (array133 = new int[6]);
                    array133[0] = 4;
                    array133[array133[1] = 2] = 2;
                    array133[3] = 3;
                    array133[5] = (array133[4] = 2);
                    break;
                }
                case 30:
                case 198: {
                    final int[] array134;
                    array = (array134 = new int[6]);
                    array134[0] = 2;
                    array134[array134[1] = 3] = (array134[2] = 2);
                    array134[5] = (array134[4] = 2);
                    break;
                }
                case 29: {
                    final int[] array135;
                    array = (array135 = new int[6]);
                    array135[0] = 1;
                    array135[array135[1] = 2] = 2;
                    array135[3] = 0;
                    array135[5] = (array135[4] = 2);
                    break;
                }
                case 28: {
                    final int[] array136;
                    array = (array136 = new int[6]);
                    array136[array136[0] = 1] = 3;
                    array136[array136[2] = 3] = 2;
                    array136[5] = (array136[4] = 2);
                    break;
                }
                case 27: {
                    final int[] array137;
                    array = (array137 = new int[6]);
                    array137[0] = 3;
                    array137[1] = 2;
                    array137[3] = (array137[2] = 1);
                    array137[5] = (array137[4] = 2);
                    break;
                }
                case 24: {
                    final int[] array138;
                    array = (array138 = new int[6]);
                    array138[1] = (array138[0] = 4);
                    array138[array138[2] = 3] = 4;
                    array138[5] = (array138[4] = 2);
                    break;
                }
                case 23:
                case 59:
                case 203:
                case 210: {
                    final int[] array139;
                    array = (array139 = new int[6]);
                    array139[0] = 4;
                    array139[array139[1] = 3] = (array139[2] = 4);
                    array139[5] = (array139[4] = 2);
                    break;
                }
                case 22: {
                    final int[] array140;
                    array = (array140 = new int[6]);
                    array140[0] = 1;
                    array140[array140[1] = 2] = 2;
                    array140[array140[3] = 4] = 4;
                    array140[5] = 2;
                    break;
                }
                case 21:
                case 53:
                case 191: {
                    final int[] array141;
                    array = (array141 = new int[6]);
                    array141[1] = (array141[0] = 0);
                    array141[3] = (array141[2] = 0);
                    array141[4] = 1;
                    array141[5] = 2;
                    break;
                }
                case 20: {
                    final int[] array142;
                    array = (array142 = new int[6]);
                    array142[0] = 4;
                    array142[1] = 3;
                    array142[2] = 4;
                    array142[3] = 3;
                    array142[5] = (array142[4] = 2);
                    break;
                }
                case 19: {
                    final int[] array143;
                    array = (array143 = new int[6]);
                    array143[1] = (array143[0] = 0);
                    array143[array143[2] = 3] = 3;
                    array143[5] = (array143[4] = 2);
                    break;
                }
                case 18:
                case 151: {
                    final int[] array144;
                    array = (array144 = new int[6]);
                    array144[0] = 2;
                    array144[1] = 1;
                    array144[array144[2] = 3] = 3;
                    array144[5] = (array144[4] = 2);
                    break;
                }
                case 17:
                case 70:
                case 77: {
                    final int[] array145;
                    array = (array145 = new int[6]);
                    array145[0] = 0;
                    array145[1] = 2;
                    array145[3] = (array145[2] = 0);
                    array145[5] = (array145[4] = 2);
                    break;
                }
                case 15:
                case 154: {
                    final int[] array146;
                    array = (array146 = new int[6]);
                    array146[0] = 3;
                    array146[1] = 2;
                    array146[3] = (array146[2] = 4);
                    array146[5] = (array146[4] = 2);
                    break;
                }
                case 14:
                case 79:
                case 122:
                case 142:
                case 172:
                case 192:
                case 195: {
                    final int[] array147;
                    array = (array147 = new int[6]);
                    array147[0] = 0;
                    array147[1] = 2;
                    array147[3] = (array147[2] = 2);
                    array147[5] = (array147[4] = 2);
                    break;
                }
                case 13:
                case 87: {
                    final int[] array148;
                    array = (array148 = new int[6]);
                    array148[array148[0] = 1] = 2;
                    array148[3] = (array148[2] = 4);
                    array148[5] = (array148[4] = 2);
                    break;
                }
                case 12: {
                    final int[] array149;
                    array = (array149 = new int[6]);
                    array149[0] = 0;
                    array149[1] = 1;
                    array149[2] = 0;
                    array149[3] = 1;
                    array149[5] = (array149[4] = 2);
                    break;
                }
                case 11:
                case 40:
                case 103:
                case 188:
                case 193: {
                    final int[] array150;
                    array = (array150 = new int[6]);
                    array150[0] = 0;
                    array150[2] = (array150[1] = 0);
                    array150[4] = (array150[3] = 0);
                    array150[5] = 2;
                    break;
                }
                case 10: {
                    final int[] array151;
                    array = (array151 = new int[6]);
                    array151[0] = 2;
                    array151[array151[1] = 2] = 2;
                    array151[3] = 3;
                    array151[5] = (array151[4] = 2);
                    break;
                }
                case 9: {
                    final int[] array152;
                    array = (array152 = new int[6]);
                    array152[0] = 2;
                    array152[1] = 4;
                    array152[3] = (array152[2] = 1);
                    array152[5] = (array152[4] = 2);
                    break;
                }
                case 8:
                case 63:
                case 100:
                case 162:
                case 190:
                case 199:
                case 216: {
                    final int[] array153;
                    array = (array153 = new int[6]);
                    array153[0] = 4;
                    array153[1] = 2;
                    array153[3] = (array153[2] = 2);
                    array153[5] = (array153[4] = 2);
                    break;
                }
                case 7:
                case 44: {
                    final int[] array154;
                    array = (array154 = new int[6]);
                    array154[0] = 3;
                    array154[1] = 4;
                    array154[array154[2] = 3] = 2;
                    array154[5] = (array154[4] = 2);
                    break;
                }
                case 6: {
                    final int[] array155;
                    array = (array155 = new int[6]);
                    array155[0] = 2;
                    array155[1] = 3;
                    array155[2] = 2;
                    array155[3] = 4;
                    array155[5] = (array155[4] = 2);
                    break;
                }
                case 5:
                case 16:
                case 117: {
                    final int[] array156;
                    array = (array156 = new int[6]);
                    array156[0] = 1;
                    array156[array156[1] = 2] = 0;
                    array156[3] = 1;
                    array156[5] = (array156[4] = 2);
                    break;
                }
                case 4:
                case 25:
                case 51:
                case 57:
                case 74:
                case 145:
                case 224: {
                    final int[] array157;
                    array = (array157 = new int[6]);
                    array157[array157[0] = 1] = 2;
                    array157[3] = (array157[2] = 2);
                    array157[5] = (array157[4] = 2);
                    break;
                }
                case 3: {
                    final int[] array158;
                    array = (array158 = new int[6]);
                    array158[0] = 2;
                    array158[1] = 3;
                    array158[2] = 1;
                    array158[3] = 2;
                    array158[5] = (array158[4] = 2);
                    break;
                }
                case 2:
                case 93:
                case 155:
                case 187:
                case 196:
                case 206:
                case 225:
                case 233: {
                    final int[] array159;
                    array = (array159 = new int[6]);
                    array159[1] = (array159[0] = 4);
                    array159[3] = (array159[2] = 4);
                    array159[5] = (array159[4] = 2);
                    break;
                }
                case 1: {
                    final int[] array160;
                    array = (array160 = new int[6]);
                    array160[0] = 1;
                    array160[2] = (array160[1] = 4);
                    array160[array160[3] = 4] = 3;
                    array160[5] = 2;
                    break;
                }
                case 0:
                case 26:
                case 80:
                case 121: {
                    final int[] array161;
                    array = (array161 = new int[6]);
                    array161[array161[0] = 1] = 2;
                    array161[3] = (array161[2] = 0);
                    array161[5] = (array161[4] = 2);
                    break;
                }
            }
            final HashMap<Integer, Long> b = new HashMap<Integer, Long>(8);
            b.put(0, 1000000L);
            final ImmutableList<Long> n3 = l.n;
            b.put(2, n3.get(array[0]));
            b.put(3, ((List<Long>)l.o).get(array[1]));
            b.put(4, ((List<Long>)l.p).get(array[2]));
            b.put(5, ((List<Long>)l.q).get(array[3]));
            b.put(10, ((List<Long>)l.r).get(array[4]));
            b.put(9, ((List<Long>)l.s).get(array[5]));
            b.put(7, n3.get(array[0]));
            this.b = b;
            this.c = 2000;
            this.d = c.a;
            this.e = true;
        }
    }
}
