// 
// Decompiled by Procyon v0.6.0
// 

package tc;

import android.text.Spanned;
import java.util.Arrays;
import nc.a$a;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import bd.s;
import nc.f;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.regex.Pattern;
import nc.e;

public final class a extends e
{
    public static final Pattern o;
    public static final Pattern p;
    public final StringBuilder m;
    public final ArrayList<String> n;
    
    static {
        o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
        p = Pattern.compile("\\{\\\\.*?\\}");
    }
    
    public a() {
        this.m = new StringBuilder();
        this.n = new ArrayList<String>();
    }
    
    public static long h(final Matcher matcher, final int n) {
        final String group = matcher.group(n + 1);
        long n2;
        if (group != null) {
            n2 = Long.parseLong(group) * 60L * 60L * 1000L;
        }
        else {
            n2 = 0L;
        }
        final String group2 = matcher.group(n + 2);
        group2.getClass();
        final long long1 = Long.parseLong(group2);
        final String group3 = matcher.group(n + 3);
        group3.getClass();
        final long n3 = Long.parseLong(group3) * 1000L + (long1 * 60L * 1000L + n2);
        final String group4 = matcher.group(n + 4);
        long n4 = n3;
        if (group4 != null) {
            n4 = n3 + Long.parseLong(group4);
        }
        return n4 * 1000L;
    }
    
    @Override
    public final f g(byte[] array, int n, final boolean b) {
        final ArrayList list = new ArrayList();
        final kc.f f = new kc.f();
        array = (byte[])(Object)new s(array, n);
        while (true) {
            Object o = ((s)(Object)array).d();
            if (o == null) {
                break;
            }
            if (((String)o).length() == 0) {
                continue;
            }
            try {
                Integer.parseInt((String)o);
                final String d = ((s)(Object)array).d();
                if (d == null) {
                    Log.w("SubripDecoder", "Unexpected end");
                    break;
                }
                o = a.o.matcher(d);
                if (((Matcher)o).matches()) {
                    f.a(h((Matcher)o, 1));
                    f.a(h((Matcher)o, 6));
                    this.m.setLength(0);
                    this.n.clear();
                    for (o = ((s)(Object)array).d(); !TextUtils.isEmpty((CharSequence)o); o = ((s)(Object)array).d()) {
                        if (this.m.length() > 0) {
                            this.m.append("<br>");
                        }
                        final StringBuilder m = this.m;
                        final ArrayList<String> n2 = this.n;
                        final String trim = ((String)o).trim();
                        o = new StringBuilder(trim);
                        final Matcher matcher = a.p.matcher(trim);
                        n = 0;
                        while (matcher.find()) {
                            final String group = matcher.group();
                            n2.add(group);
                            final int n3 = matcher.start() - n;
                            final int length = group.length();
                            ((StringBuilder)o).replace(n3, n3 + length, "");
                            n += length;
                        }
                        m.append(((StringBuilder)o).toString());
                    }
                    final Spanned fromHtml = Html.fromHtml(this.m.toString());
                    final Matcher matcher2 = null;
                    n = 0;
                    while (true) {
                        o = matcher2;
                        if (n >= this.n.size()) {
                            break;
                        }
                        o = this.n.get(n);
                        if (((String)o).matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        }
                        ++n;
                    }
                    final a$a a$a = new a$a();
                    a$a.a = (CharSequence)fromHtml;
                    if (o == null) {
                        o = a$a.a();
                    }
                    else {
                        Label_0631: {
                            switch (((String)o).hashCode()) {
                                case -685620462: {
                                    if (((String)o).equals("{\\an9}")) {
                                        n = 5;
                                        break Label_0631;
                                    }
                                    break;
                                }
                                case -685620493: {
                                    if (((String)o).equals("{\\an8}")) {
                                        n = 8;
                                        break Label_0631;
                                    }
                                    break;
                                }
                                case -685620524: {
                                    if (((String)o).equals("{\\an7}")) {
                                        n = 2;
                                        break Label_0631;
                                    }
                                    break;
                                }
                                case -685620555: {
                                    if (((String)o).equals("{\\an6}")) {
                                        n = 4;
                                        break Label_0631;
                                    }
                                    break;
                                }
                                case -685620586: {
                                    if (((String)o).equals("{\\an5}")) {
                                        n = 7;
                                        break Label_0631;
                                    }
                                    break;
                                }
                                case -685620617: {
                                    if (((String)o).equals("{\\an4}")) {
                                        n = 1;
                                        break Label_0631;
                                    }
                                    break;
                                }
                                case -685620648: {
                                    if (((String)o).equals("{\\an3}")) {
                                        n = 3;
                                        break Label_0631;
                                    }
                                    break;
                                }
                                case -685620679: {
                                    if (((String)o).equals("{\\an2}")) {
                                        n = 6;
                                        break Label_0631;
                                    }
                                    break;
                                }
                                case -685620710: {
                                    if (((String)o).equals("{\\an1}")) {
                                        n = 0;
                                        break Label_0631;
                                    }
                                    break;
                                }
                            }
                            n = -1;
                        }
                        if (n != 0 && n != 1 && n != 2) {
                            if (n != 3 && n != 4 && n != 5) {
                                a$a.i = 1;
                            }
                            else {
                                a$a.i = 2;
                            }
                        }
                        else {
                            a$a.i = 0;
                        }
                        Label_0915: {
                            switch (((String)o).hashCode()) {
                                case -685620462: {
                                    if (((String)o).equals("{\\an9}")) {
                                        n = 5;
                                        break Label_0915;
                                    }
                                    break;
                                }
                                case -685620493: {
                                    if (((String)o).equals("{\\an8}")) {
                                        n = 4;
                                        break Label_0915;
                                    }
                                    break;
                                }
                                case -685620524: {
                                    if (((String)o).equals("{\\an7}")) {
                                        n = 3;
                                        break Label_0915;
                                    }
                                    break;
                                }
                                case -685620555: {
                                    if (((String)o).equals("{\\an6}")) {
                                        n = 8;
                                        break Label_0915;
                                    }
                                    break;
                                }
                                case -685620586: {
                                    if (((String)o).equals("{\\an5}")) {
                                        n = 7;
                                        break Label_0915;
                                    }
                                    break;
                                }
                                case -685620617: {
                                    if (((String)o).equals("{\\an4}")) {
                                        n = 6;
                                        break Label_0915;
                                    }
                                    break;
                                }
                                case -685620648: {
                                    if (((String)o).equals("{\\an3}")) {
                                        n = 2;
                                        break Label_0915;
                                    }
                                    break;
                                }
                                case -685620679: {
                                    if (((String)o).equals("{\\an2}")) {
                                        n = 1;
                                        break Label_0915;
                                    }
                                    break;
                                }
                                case -685620710: {
                                    if (((String)o).equals("{\\an1}")) {
                                        n = 0;
                                        break Label_0915;
                                    }
                                    break;
                                }
                            }
                            n = -1;
                        }
                        if (n != 0 && n != 1 && n != 2) {
                            if (n != 3 && n != 4 && n != 5) {
                                a$a.g = 1;
                            }
                            else {
                                a$a.g = 0;
                            }
                        }
                        else {
                            a$a.g = 2;
                        }
                        n = a$a.i;
                        final float n4 = 0.92f;
                        float h;
                        if (n != 0) {
                            if (n != 1) {
                                if (n != 2) {
                                    throw new IllegalArgumentException();
                                }
                                h = 0.92f;
                            }
                            else {
                                h = 0.5f;
                            }
                        }
                        else {
                            h = 0.08f;
                        }
                        a$a.h = h;
                        n = a$a.g;
                        float e;
                        if (n != 0) {
                            if (n != 1) {
                                if (n != 2) {
                                    throw new IllegalArgumentException();
                                }
                                e = n4;
                            }
                            else {
                                e = 0.5f;
                            }
                        }
                        else {
                            e = 0.08f;
                        }
                        a$a.e = e;
                        a$a.f = 0;
                        o = a$a.a();
                    }
                    list.add(o);
                    list.add(nc.a.w);
                }
                else {
                    if (d.length() != 0) {
                        o = "Skipping invalid timing: ".concat(d);
                    }
                    else {
                        o = new String("Skipping invalid timing: ");
                    }
                    Log.w("SubripDecoder", (String)o);
                }
            }
            catch (final NumberFormatException ex) {
                String concat;
                if (((String)o).length() != 0) {
                    concat = "Skipping invalid index: ".concat((String)o);
                }
                else {
                    concat = new String("Skipping invalid index: ");
                }
                Log.w("SubripDecoder", concat);
            }
        }
        return (f)new b(list.toArray(new nc.a[0]), Arrays.copyOf((long[])f.g, f.f));
    }
}
