// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import com.google.android.exoplayer2.ParserException;
import android.util.Log;
import bd.d;
import java.util.HashSet;
import java.util.Arrays;
import bd.d0;
import bd.c0;
import java.util.Collection;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import android.text.TextUtils;
import java.util.ArrayList;
import bd.s;
import nc.e;

public final class f extends e
{
    public final s m;
    public final b n;
    
    public f() {
        this.m = new s();
        this.n = new b();
    }
    
    @Override
    public final nc.f g(final byte[] array, int i, final boolean b) throws SubtitleDecoderException {
        this.m.z(i, array);
        final ArrayList list = new ArrayList();
        try {
            wc.g.d(this.m);
            while (!TextUtils.isEmpty((CharSequence)this.m.d())) {}
            final ArrayList list2 = new ArrayList();
            while (true) {
                final s m = this.m;
                final int n = 1;
                i = -1;
                int b2 = 0;
                while (i == -1) {
                    b2 = m.b;
                    final String d = m.d();
                    if (d == null) {
                        i = 0;
                    }
                    else if ("STYLE".equals(d)) {
                        i = 2;
                    }
                    else if (d.startsWith("NOTE")) {
                        i = 1;
                    }
                    else {
                        i = 3;
                    }
                }
                m.B(b2);
                if (i == 0) {
                    return (nc.f)new h(list2);
                }
                if (i == 1) {
                    while (!TextUtils.isEmpty((CharSequence)this.m.d())) {}
                }
                else if (i == 2) {
                    if (!list2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.m.d();
                    final b n2 = this.n;
                    final s j = this.m;
                    n2.b.setLength(0);
                    i = j.b;
                    while (!TextUtils.isEmpty((CharSequence)j.d())) {}
                    n2.a.z(j.b, j.a);
                    n2.a.B(i);
                    final ArrayList<c> list3 = new ArrayList<c>();
                    i = n;
                    while (true) {
                        final s a = n2.a;
                        final StringBuilder b3 = n2.b;
                        b.c(a);
                        String trim = null;
                        Label_0465: {
                            if (a.c - a.b >= 5) {
                                if ("::cue".equals(a.o(5))) {
                                    final int b4 = a.b;
                                    final String b5 = b.b(a, b3);
                                    if (b5 != null) {
                                        if ("{".equals(b5)) {
                                            a.B(b4);
                                            trim = "";
                                            break Label_0465;
                                        }
                                        if ("(".equals(b5)) {
                                            int b6 = a.b;
                                            for (int c = a.c, n3 = 0; b6 < c && n3 == 0; ++b6) {
                                                if ((char)a.a[b6] == ')') {
                                                    n3 = i;
                                                }
                                                else {
                                                    n3 = 0;
                                                }
                                            }
                                            trim = a.o(b6 - 1 - a.b).trim();
                                        }
                                        else {
                                            trim = null;
                                        }
                                        if (")".equals(b.b(a, b3))) {
                                            break Label_0465;
                                        }
                                    }
                                }
                            }
                            trim = null;
                        }
                        if (trim == null || !"{".equals(b.b(n2.a, n2.b))) {
                            list.addAll(list3);
                            break;
                        }
                        final c c2 = new c();
                        if (!"".equals(trim)) {
                            final int index = trim.indexOf(91);
                            String substring = trim;
                            if (index != -1) {
                                final Matcher matcher = b.c.matcher(trim.substring(index));
                                if (matcher.matches()) {
                                    final String group = matcher.group(i);
                                    group.getClass();
                                    c2.d = group;
                                }
                                substring = trim.substring(0, index);
                            }
                            final int a2 = c0.a;
                            final String[] split = substring.split("\\.", -1);
                            final String b7 = split[0];
                            final int index2 = b7.indexOf(35);
                            if (index2 != -1) {
                                c2.b = b7.substring(0, index2);
                                c2.a = b7.substring(index2 + 1);
                            }
                            else {
                                c2.b = b7;
                            }
                            if (split.length > i) {
                                final int length = split.length;
                                d0.c(length <= split.length && i);
                                c2.c = new HashSet(Arrays.asList((Object[])Arrays.copyOfRange((T[])split, i, length)));
                            }
                        }
                        int k = 0;
                        Object b8 = null;
                    Label_0942_Outer:
                        while (k == 0) {
                            final s a3 = n2.a;
                            final int b9 = a3.b;
                            b8 = b.b(a3, n2.b);
                            if (b8 != null && !"}".equals(b8)) {
                                k = 0;
                            }
                            else {
                                k = i;
                            }
                            if (k != 0) {
                                continue Label_0942_Outer;
                            }
                            n2.a.B(b9);
                            final s a4 = n2.a;
                            final StringBuilder b10 = n2.b;
                            b.c(a4);
                            final String a5 = b.a(a4, b10);
                            if ("".equals(a5)) {
                                continue Label_0942_Outer;
                            }
                            if (!":".equals(b.b(a4, b10))) {
                                continue Label_0942_Outer;
                            }
                            b.c(a4);
                            final StringBuilder sb = new StringBuilder();
                            i = 0;
                            while (true) {
                                while (i == 0) {
                                    final int b11 = a4.b;
                                    final String b12 = b.b(a4, b10);
                                    if (b12 == null) {
                                        final String string = null;
                                        Label_1544: {
                                            if (string != null) {
                                                if (!"".equals(string)) {
                                                    i = a4.b;
                                                    final String b13 = b.b(a4, b10);
                                                    if (!";".equals(b13)) {
                                                        if (!"}".equals(b13)) {
                                                            break Label_1544;
                                                        }
                                                        a4.B(i);
                                                    }
                                                    if ("color".equals(a5)) {
                                                        c2.f = d.a(string, true);
                                                        c2.g = true;
                                                    }
                                                    else if ("background-color".equals(a5)) {
                                                        c2.h = d.a(string, true);
                                                        c2.i = true;
                                                    }
                                                    else if ("ruby-position".equals(a5)) {
                                                        if ("over".equals(string)) {
                                                            c2.p = 1;
                                                        }
                                                        else if ("under".equals(string)) {
                                                            c2.p = 2;
                                                            i = 1;
                                                            continue Label_1546;
                                                        }
                                                    }
                                                    else if ("text-combine-upright".equals(a5)) {
                                                        c2.q = ("all".equals(string) || string.startsWith("digits"));
                                                    }
                                                    else if ("text-decoration".equals(a5)) {
                                                        if ("underline".equals(string)) {
                                                            i = 1;
                                                            c2.k = 1;
                                                            continue Label_1546;
                                                        }
                                                    }
                                                    else if ("font-family".equals(a5)) {
                                                        c2.e = mk2.e.O(string);
                                                    }
                                                    else if ("font-weight".equals(a5)) {
                                                        if ("bold".equals(string)) {
                                                            c2.l = 1;
                                                        }
                                                    }
                                                    else if ("font-style".equals(a5)) {
                                                        if ("italic".equals(string)) {
                                                            c2.m = 1;
                                                        }
                                                    }
                                                    else if ("font-size".equals(a5)) {
                                                        final Matcher matcher2 = b.d.matcher(mk2.e.O(string));
                                                        if (matcher2.matches()) {
                                                            final String group2 = matcher2.group(2);
                                                            group2.getClass();
                                                            i = group2.hashCode();
                                                            Label_1469: {
                                                                if (i != 37) {
                                                                    if (i != 3240) {
                                                                        if (i == 3592) {
                                                                            if (group2.equals("px")) {
                                                                                i = 2;
                                                                                break Label_1469;
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (group2.equals("em")) {
                                                                        i = 1;
                                                                        break Label_1469;
                                                                    }
                                                                }
                                                                else if (group2.equals("%")) {
                                                                    i = 0;
                                                                    break Label_1469;
                                                                }
                                                                i = -1;
                                                            }
                                                            if (i != 0) {
                                                                if (i != 1) {
                                                                    if (i != 2) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    c2.n = 1;
                                                                }
                                                                else {
                                                                    c2.n = 2;
                                                                }
                                                            }
                                                            else {
                                                                c2.n = 3;
                                                            }
                                                            i = 1;
                                                            final String group3 = matcher2.group(1);
                                                            group3.getClass();
                                                            c2.o = Float.parseFloat(group3);
                                                            continue Label_1546;
                                                        }
                                                        final StringBuilder sb2 = new StringBuilder(string.length() + 22);
                                                        sb2.append("Invalid font-size: '");
                                                        sb2.append(string);
                                                        sb2.append("'.");
                                                        Log.w("WebvttCssParser", sb2.toString());
                                                    }
                                                }
                                            }
                                        }
                                        i = 1;
                                        continue Label_1546;
                                    }
                                    if (!"}".equals(b12) && !";".equals(b12)) {
                                        sb.append(b12);
                                    }
                                    else {
                                        a4.B(b11);
                                        i = 1;
                                    }
                                }
                                final String string = sb.toString();
                                continue;
                            }
                            Label_1546:;
                        }
                        if (!"}".equals(b8)) {
                            continue;
                        }
                        list3.add(c2);
                    }
                }
                else {
                    if (i != 3) {
                        continue;
                    }
                    final s l = this.m;
                    final Pattern a6 = wc.e.a;
                    final String d2 = l.d();
                    wc.d d3 = null;
                    Label_1710: {
                        if (d2 == null) {
                            d3 = null;
                        }
                        else {
                            final Pattern a7 = wc.e.a;
                            final Matcher matcher3 = a7.matcher(d2);
                            if (matcher3.matches()) {
                                d3 = wc.e.d(null, matcher3, l, list);
                            }
                            else {
                                final String d4 = l.d();
                                if (d4 != null) {
                                    final Matcher matcher4 = a7.matcher(d4);
                                    if (matcher4.matches()) {
                                        d3 = wc.e.d(d2.trim(), matcher4, l, list);
                                        break Label_1710;
                                    }
                                }
                                d3 = null;
                            }
                        }
                    }
                    if (d3 == null) {
                        continue;
                    }
                    list2.add(d3);
                }
            }
        }
        catch (final ParserException ex) {
            throw new SubtitleDecoderException((Throwable)ex);
        }
    }
}
