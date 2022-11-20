// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.channels;

import gg2.c;
import bj2.h$b;
import bj2.t;
import dg2.j;
import java.math.BigInteger;
import com.squareup.moshi.y;
import org.matrix.android.sdk.api.session.events.model.UnsignedData;
import java.util.Map;
import org.matrix.android.sdk.internal.database.mapper.ContentMapper;
import org.matrix.android.sdk.api.session.room.send.SendState;
import ug2.d;
import kotlinx.serialization.SerializationException;
import ug2.n;
import b6.h;
import java.lang.reflect.Array;
import mm2.b;
import java.util.concurrent.CancellationException;
import bj2.p;
import org.matrix.android.sdk.api.session.events.model.Event;
import fq2.g;
import java.util.Arrays;
import kotlinx.serialization.json.internal.JsonEncodingException;
import ng2.e;
import kotlinx.serialization.json.internal.JsonDecodingException;

public final class a
{
    public static void a(int n, final int[] array, final int[] array2, final int[] array3, final int[] array4) {
        System.arraycopy(array, array.length - 16, array2, 0, 16);
        final int length = array.length;
        int i = n * 2;
        int n2 = 0;
        n = 0;
        while (i > 0) {
            int length2 = array3.length;
            while (--length2 >= 0) {
                array3[length2] = (array2[length2] ^ array[n2 + length2]);
            }
            final int a = cl2.a.a;
            if (array3.length != 16) {
                throw new IllegalArgumentException();
            }
            if (array2.length != 16) {
                throw new IllegalArgumentException();
            }
            int n3 = array3[0];
            int n4 = array3[1];
            int n5 = array3[2];
            int n6 = array3[3];
            int n7 = array3[4];
            int n8 = array3[5];
            int n9 = array3[6];
            int n10 = array3[7];
            int n11 = array3[8];
            int n12 = array3[9];
            int n13 = array3[10];
            int n14 = array3[11];
            int n15 = array3[12];
            int n16 = array3[13];
            int n17 = array3[14];
            int n18 = array3[15];
            for (int j = 8; j > 0; j -= 2) {
                final int n19 = n3 + n15;
                final int n20 = n7 ^ (n19 >>> -7 | n19 << 7);
                final int n21 = n20 + n3;
                final int n22 = n11 ^ (n21 >>> -9 | n21 << 9);
                final int n23 = n22 + n20;
                final int n24 = n15 ^ (n23 >>> -13 | n23 << 13);
                final int n25 = n24 + n22;
                final int n26 = n3 ^ (n25 >>> -18 | n25 << 18);
                final int n27 = n8 + n4;
                final int n28 = n12 ^ (n27 >>> -7 | n27 << 7);
                final int n29 = n28 + n8;
                final int n30 = n16 ^ (n29 >>> -9 | n29 << 9);
                final int n31 = n30 + n28;
                final int n32 = n4 ^ (n31 >>> -13 | n31 << 13);
                final int n33 = n32 + n30;
                final int n34 = n8 ^ (n33 >>> -18 | n33 << 18);
                final int n35 = n13 + n9;
                final int n36 = n17 ^ (n35 >>> -7 | n35 << 7);
                final int n37 = n36 + n13;
                final int n38 = n5 ^ (n37 >>> -9 | n37 << 9);
                final int n39 = n38 + n36;
                final int n40 = n9 ^ (n39 >>> -13 | n39 << 13);
                final int n41 = n40 + n38;
                final int n42 = n13 ^ (n41 >>> -18 | n41 << 18);
                final int n43 = n18 + n14;
                final int n44 = n6 ^ (n43 >>> -7 | n43 << 7);
                final int n45 = n44 + n18;
                final int n46 = n10 ^ (n45 >>> -9 | n45 << 9);
                final int n47 = n46 + n44;
                final int n48 = n14 ^ (n47 >>> -13 | n47 << 13);
                final int n49 = n48 + n46;
                final int n50 = n18 ^ (n49 >>> -18 | n49 << 18);
                final int n51 = n26 + n44;
                n4 = (n32 ^ (n51 >>> -7 | n51 << 7));
                final int n52 = n4 + n26;
                n5 = (n38 ^ (n52 >>> -9 | n52 << 9));
                final int n53 = n5 + n4;
                n6 = (n44 ^ (n53 >>> -13 | n53 << 13));
                final int n54 = n6 + n5;
                n3 = (n26 ^ (n54 >>> -18 | n54 << 18));
                final int n55 = n34 + n20;
                n9 = (n40 ^ (n55 >>> -7 | n55 << 7));
                final int n56 = n9 + n34;
                n10 = (n46 ^ (n56 >>> -9 | n56 << 9));
                final int n57 = n10 + n9;
                n7 = (n20 ^ (n57 >>> -13 | n57 << 13));
                final int n58 = n7 + n10;
                n8 = (n34 ^ (n58 >>> -18 | n58 << 18));
                final int n59 = n42 + n28;
                n14 = (n48 ^ (n59 >>> -7 | n59 << 7));
                final int n60 = n14 + n42;
                n11 = (n22 ^ (n60 >>> -9 | n60 << 9));
                final int n61 = n11 + n14;
                n12 = (n28 ^ (n61 >>> -13 | n61 << 13));
                final int n62 = n12 + n11;
                n13 = (n42 ^ (n62 >>> -18 | n62 << 18));
                final int n63 = n50 + n36;
                n15 = (n24 ^ (n63 >>> -7 | n63 << 7));
                final int n64 = n15 + n50;
                n16 = (n30 ^ (n64 >>> -9 | n64 << 9));
                final int n65 = n16 + n15;
                n17 = (n36 ^ (n65 >>> -13 | n65 << 13));
                final int n66 = n17 + n16;
                n18 = (n50 ^ (n66 >>> -18 | n66 << 18));
            }
            array2[0] = n3 + array3[0];
            array2[1] = n4 + array3[1];
            array2[2] = n5 + array3[2];
            array2[3] = n6 + array3[3];
            array2[4] = n7 + array3[4];
            array2[5] = n8 + array3[5];
            array2[6] = n9 + array3[6];
            array2[7] = n10 + array3[7];
            array2[8] = n11 + array3[8];
            array2[9] = n12 + array3[9];
            array2[10] = n13 + array3[10];
            array2[11] = n14 + array3[11];
            array2[12] = n15 + array3[12];
            array2[13] = n16 + array3[13];
            array2[14] = n17 + array3[14];
            array2[15] = n18 + array3[15];
            System.arraycopy(array2, 0, array4, n, 16);
            n = (length >>> 1) + n2 - n;
            n2 += 16;
            --i;
        }
    }
    
    public static final JsonDecodingException b(final Number n, final String s, final String s2) {
        e.f((Object)n, "value");
        e.f((Object)s, "key");
        e.f((Object)s2, "output");
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(n);
        sb.append(" with key ");
        sb.append(s);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sb.append((Object)k(-1, s2));
        return e(-1, sb.toString());
    }
    
    public static final JsonEncodingException c(final String s, final Number n) {
        e.f((Object)n, "value");
        e.f((Object)s, "output");
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(n);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sb.append((Object)k(-1, s));
        return new JsonEncodingException(sb.toString());
    }
    
    public static final JsonEncodingException d(final mj2.e e) {
        final StringBuilder t = a.t("Value of type '");
        t.append(e.h());
        t.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        t.append(e.getKind());
        t.append("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        return new JsonEncodingException(t.toString());
    }
    
    public static final JsonDecodingException e(final int n, final String s) {
        e.f((Object)s, "message");
        String string = s;
        if (n >= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected JSON token at offset ");
            sb.append(n);
            sb.append(": ");
            sb.append(s);
            string = sb.toString();
        }
        return new JsonDecodingException(string);
    }
    
    public static final JsonDecodingException f(final CharSequence charSequence, final int n, final String s) {
        e.f((Object)s, "message");
        e.f((Object)charSequence, "input");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("\nJSON input: ");
        sb.append((Object)k(n, charSequence));
        return e(n, sb.toString());
    }
    
    public static void g(int i, final int n, final int n2, int[] array) {
        final int n3 = n2 * 32;
        final int[] array2 = new int[16];
        final int[] array3 = new int[16];
        final int[] array4 = new int[n3];
        final int[] array5 = new int[n3];
        final int[] array6 = new int[n * n3];
    Block_8_Outer:
        while (true) {
            Label_0217: {
                try {
                    System.arraycopy(array, i, array5, 0, n3);
                    int n4 = 0;
                    for (int j = 0; j < n; j += 2) {
                        System.arraycopy(array5, 0, array6, n4, n3);
                        final int n5 = n4 + n3;
                        a(n2, array5, array2, array3, array4);
                        System.arraycopy(array4, 0, array6, n5, n3);
                        n4 = n5 + n3;
                        a(n2, array4, array2, array3, array5);
                    }
                    final int n6 = 0;
                    if (n6 < n) {
                        System.arraycopy(array6, (array5[n3 - 16] & n - 1) * n3, array4, 0, n3);
                        int n7 = n3;
                        while (--n7 >= 0) {
                            array4[n7] ^= array5[0 + n7];
                        }
                        break Label_0217;
                    }
                    break Label_0217;
                }
                finally {
                    Arrays.fill(array6, 0);
                    int[] array7;
                    for (i = 0; i < 4; ++i) {
                        array7 = (new int[][] { array5, array2, array3, array4 })[i];
                        if (array7 != null) {
                            Arrays.fill(array7, 0);
                        }
                    }
                    while (true) {
                        Arrays.fill(array, 0);
                        Label_0276: {
                            ++i;
                        }
                        Label_0235: {
                            break Label_0235;
                            Label_0282:
                            return;
                            System.arraycopy(array5, 0, array, i, n3);
                            Arrays.fill(array6, 0);
                            i = 0;
                            break Label_0235;
                            a(n2, array4, array2, array3, array5);
                            int n6 = 0;
                            ++n6;
                            continue Block_8_Outer;
                        }
                        iftrue(Label_0282:)(i >= 4);
                        array = (new int[][] { array5, array2, array3, array4 })[i];
                        iftrue(Label_0276:)(array == null);
                        continue;
                    }
                }
            }
            break;
        }
    }
    
    public static final Event h(final g g, final boolean b) {
        e.f((Object)g, "<this>");
        return a01.a.P(g, b);
    }
    
    public static final void i(final p p2, final Throwable t) {
        CancellationException d = null;
        CancellationException ex = null;
        if (t != null) {
            if (t instanceof CancellationException) {
                ex = (CancellationException)t;
            }
            if ((d = ex) == null) {
                d = zg.a.d("Channel was consumed, consumer had failed", t);
            }
        }
        p2.a(d);
    }
    
    public static mm2.a j(final b b, final mm2.e e) {
        final int a = b.a;
        final int n = 1 << a;
        final int[] c = e.c;
        int n2;
        if (c[n2 = c.length - 1] == 0) {
            n2 = -1;
        }
        final Class<Integer> type = Integer.TYPE;
        final int[][] array = (int[][])Array.newInstance(type, n2, n);
        final int[][] array2 = (int[][])Array.newInstance(type, n2, n);
        for (int i = 0; i < n; ++i) {
            final int[] array3 = array2[0];
            final int[] c2 = e.c;
            int b2 = e.b;
            int n3 = c2[b2];
            while (--b2 >= 0) {
                n3 = (e.a.c(n3, i) ^ e.c[b2]);
            }
            array3[i] = b.a(n3);
        }
        for (int j = 1; j < n2; ++j) {
            for (int k = 0; k < n; ++k) {
                array2[j][k] = b.c(array2[j - 1][k], k);
            }
        }
        for (int l = 0; l < n2; ++l) {
            for (int n4 = 0; n4 < n; ++n4) {
                for (int n5 = 0; n5 <= l; ++n5) {
                    final int[] array4 = array[l];
                    array4[n4] ^= b.c(array2[n5][n4], e.d(n2 + n5 - l));
                }
            }
        }
        final int[][] array5 = new int[n2 * a][n + 31 >>> 5];
        for (int n6 = 0; n6 < n; ++n6) {
            final int n7 = n6 >>> 5;
            for (int n8 = 0; n8 < n2; ++n8) {
                final int n9 = array[n8][n6];
                for (int n10 = 0; n10 < a; ++n10) {
                    if ((n9 >>> n10 & 0x1) != 0x0) {
                        final int[] array6 = array5[(n8 + 1) * a - n10 - 1];
                        array6[n7] ^= 1 << (n6 & 0x1F);
                    }
                }
            }
        }
        return new mm2.a(array5, n);
    }
    
    public static final CharSequence k(int n, final CharSequence charSequence) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String s = ".....";
        if (n != -1) {
            final int n2 = n - 30;
            final int n3 = n + 30;
            String s2;
            if (n2 <= 0) {
                s2 = "";
            }
            else {
                s2 = ".....";
            }
            if (n3 >= charSequence.length()) {
                s = "";
            }
            final StringBuilder t = a.t(s2);
            if ((n = n2) < 0) {
                n = 0;
            }
            final int length = charSequence.length();
            int n4;
            if ((n4 = n3) > length) {
                n4 = length;
            }
            t.append(charSequence.subSequence(n, n4).toString());
            t.append(s);
            return t.toString();
        }
        n = charSequence.length() - 60;
        if (n <= 0) {
            return charSequence;
        }
        final StringBuilder t2 = a.t(".....");
        t2.append(charSequence.subSequence(n, charSequence.length()).toString());
        return t2.toString();
    }
    
    public static final lj2.b l(final h h, final n n) {
        e.f((Object)h, "<this>");
        e.f((Object)n, "type");
        final lj2.b p2 = ah0.b.p1(h, n, true);
        if (p2 != null) {
            return p2;
        }
        final d k = if0.a.K(n);
        e.f((Object)k, "<this>");
        final StringBuilder t = a.t("Serializer for class '");
        t.append(k.n());
        t.append("' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
        throw new SerializationException(t.toString());
    }
    
    public static final void m(final qj2.a a, final Number n) {
        e.f((Object)a, "<this>");
        e.f((Object)n, "result");
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(n);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification");
        qj2.a.p(a, sb.toString(), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }
    
    public static final g n(final Event event, String a, final SendState sendState, final Long n) {
        e.f((Object)event, "<this>");
        e.f((Object)a, "roomId");
        e.f((Object)sendState, "sendState");
        final y a2 = ContentMapper.a;
        final String a3 = ContentMapper.a(event.c);
        final boolean b = false;
        final boolean b2 = a3 != null && kotlin.text.b.J0((CharSequence)a3, (CharSequence)"\"m.relates_to\"", false);
        final String s = null;
        boolean j0;
        boolean j2;
        if (b2 && kotlin.text.b.J0((CharSequence)a3, (CharSequence)"\"rel_type\"", false)) {
            j0 = kotlin.text.b.J0((CharSequence)a3, (CharSequence)"\"m.replace\"", false);
            j2 = kotlin.text.b.J0((CharSequence)a3, (CharSequence)"\"org.matrix.response\"", false);
        }
        else {
            j0 = false;
            j2 = false;
        }
        final g g = new g("", "", "", (String)null, (String)null, false, (String)null, (Long)null, (String)null, (String)null, Long.valueOf(0L), (String)null, (String)null, (Long)null, 0L, j0, j2);
        String a4;
        if ((a4 = event.b) == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append('$');
            sb.append(a);
            sb.append('-');
            sb.append(System.currentTimeMillis());
            sb.append('-');
            sb.append(event.hashCode());
            a4 = sb.toString();
        }
        e.f((Object)a4, "<set-?>");
        g.a = a4;
        final String h = event.h;
        if (h != null) {
            a = h;
        }
        g.b = a;
        g.d = a3;
        g.e = ContentMapper.a(event.d());
        boolean f = b;
        if (e.a((Object)event.a, (Object)"m.room.member")) {
            final Map c = event.c;
            f = b;
            if (c != null) {
                final y a5 = hq2.d.a;
                final Object jsonValue = a5.a((Class)Map.class).toJsonValue((Object)c);
                if (jsonValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, @[JvmSuppressWildcards(suppress = <null>)] kotlin.Any>{ org.matrix.android.sdk.api.session.events.model.EventKt.Content }");
                }
                final Map map = (Map)jsonValue;
                final Map d = event.d();
                Map map2;
                if (d != null) {
                    final Object jsonValue2 = a5.a((Class)Map.class).toJsonValue((Object)d);
                    if (jsonValue2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, @[JvmSuppressWildcards(suppress = <null>)] kotlin.Any>{ org.matrix.android.sdk.api.session.events.model.EventKt.Content }");
                    }
                    map2 = (Map)jsonValue2;
                }
                else {
                    map2 = null;
                }
                f = b;
                if (e.a((Object)map, (Object)map2)) {
                    f = true;
                }
            }
        }
        g.f = f;
        g.g = event.g;
        if ((a = event.a) == null) {
            a = "org.matrix.android.sdk.missing_type";
        }
        g.c = a;
        g.i = event.f;
        final Long e = event.e;
        g.h = e;
        g.m = event.j;
        final UnsignedData i = event.i;
        Long a6 = e;
        if (i != null) {
            a6 = i.a;
            if (a6 == null) {
                a6 = e;
            }
        }
        g.k = a6;
        String json = s;
        if (i != null) {
            json = hq2.d.a.a((Class)UnsignedData.class).toJson((Object)i);
        }
        g.l = json;
        g.r = ((Enum)sendState).name();
        g.n = n;
        return g;
    }
    
    public static final fn2.a o(final BigInteger bigInteger) {
        e.g((Object)bigInteger, "$this$toRLP");
        final byte[] byteArray = bigInteger.toByteArray();
        e.b((Object)byteArray, "toByteArray()");
        byte[] s1 = byteArray;
        if (kotlin.collections.b.f2(byteArray) == (byte)0) {
            s1 = j.S1(1, byteArray.length, byteArray);
        }
        return new fn2.a(s1);
    }
    
    public static final void p(final t t, final Object o) {
        final Object i = t.i(o);
        if (!(i instanceof h$b)) {
            final cg2.j j = (cg2.j)i;
            final cg2.j a = cg2.j.a;
        }
        else {
            final Object a2 = ((bj2.h)zi2.g.i((mg2.p)new ChannelsKt__ChannelsKt$trySendBlocking$2(t, o, (c)null))).a;
        }
    }
}
