// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import k3.a;
import java.util.Iterator;

public final class t implements Iterable, p
{
    public final String f;
    
    public t(final String f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }
    
    public final p a() {
        return (p)new t(this.f);
    }
    
    public final String c() {
        return this.f;
    }
    
    public final Boolean d() {
        return this.f.isEmpty() ^ true;
    }
    
    public final Iterator e() {
        return (Iterator)new r(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof t && this.f.equals(((t)o).f));
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    public final p i(String s, final a a, final ArrayList list) {
        if (!"charAt".equals(s) && !"concat".equals(s) && !"hasOwnProperty".equals(s) && !"indexOf".equals(s) && !"lastIndexOf".equals(s) && !"match".equals(s) && !"replace".equals(s) && !"search".equals(s) && !"slice".equals(s) && !"split".equals(s) && !"substring".equals(s) && !"toLowerCase".equals(s) && !"toLocaleLowerCase".equals(s) && !"toString".equals(s) && !"toUpperCase".equals(s) && !"toLocaleUpperCase".equals(s) && !"trim".equals(s)) {
            throw new IllegalArgumentException(String.format("%s is not a String function", s));
        }
        int n = 0;
        Label_0603: {
            Label_0582: {
                Label_0532: {
                    switch (s.hashCode()) {
                        case 1943291465: {
                            if (s.equals("indexOf")) {
                                n = 3;
                                break Label_0532;
                            }
                            break;
                        }
                        case 1094496948: {
                            if (s.equals("replace")) {
                                n = 6;
                                break Label_0532;
                            }
                            break;
                        }
                        case 530542161: {
                            if (s.equals("substring")) {
                                n = 10;
                                break Label_0532;
                            }
                            break;
                        }
                        case 109648666: {
                            if (s.equals("split")) {
                                n = 9;
                                break Label_0532;
                            }
                            break;
                        }
                        case 109526418: {
                            if (s.equals("slice")) {
                                n = 8;
                                break Label_0532;
                            }
                            break;
                        }
                        case 103668165: {
                            if (s.equals("match")) {
                                n = 5;
                                break Label_0532;
                            }
                            break;
                        }
                        case 3568674: {
                            if (s.equals("trim")) {
                                n = 16;
                                break Label_0532;
                            }
                            break;
                        }
                        case -399551817: {
                            if (s.equals("toUpperCase")) {
                                n = 15;
                                break Label_0532;
                            }
                            break;
                        }
                        case -467511597: {
                            if (s.equals("lastIndexOf")) {
                                n = 4;
                                break Label_0532;
                            }
                            break;
                        }
                        case -726908483: {
                            if (s.equals("toLocaleUpperCase")) {
                                n = 11;
                                break Label_0532;
                            }
                            break;
                        }
                        case -906336856: {
                            if (s.equals("search")) {
                                n = 7;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1137582698: {
                            if (s.equals("toLowerCase")) {
                                n = 13;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1354795244: {
                            if (s.equals("concat")) {
                                n = 1;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1361633751: {
                            if (s.equals("charAt")) {
                                n = 0;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1464939364: {
                            if (s.equals("toLocaleLowerCase")) {
                                n = 12;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1776922004: {
                            if (s.equals("toString")) {
                                n = 14;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1789698943: {
                            if (s.equals("hasOwnProperty")) {
                                n = 2;
                                break Label_0603;
                            }
                            break;
                        }
                    }
                    break Label_0582;
                }
                break Label_0603;
            }
            n = -1;
        }
        s = "undefined";
        Object o = null;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
            case 16: {
                h4.h("toUpperCase", 0, (List)list);
                o = new t(this.f.trim());
                break;
            }
            case 15: {
                h4.h("toUpperCase", 0, (List)list);
                o = new t(this.f.toUpperCase(Locale.ENGLISH));
                break;
            }
            case 14: {
                h4.h("toString", 0, (List)list);
                return (p)this;
            }
            case 13: {
                h4.h("toLowerCase", 0, (List)list);
                o = new t(this.f.toLowerCase(Locale.ENGLISH));
                break;
            }
            case 12: {
                h4.h("toLocaleLowerCase", 0, (List)list);
                o = new t(this.f.toLowerCase());
                break;
            }
            case 11: {
                h4.h("toLocaleUpperCase", 0, (List)list);
                o = new t(this.f.toUpperCase());
                break;
            }
            case 10: {
                h4.j("substring", 2, list);
                s = this.f;
                int n2;
                if (!list.isEmpty()) {
                    n2 = (int)h4.a((double)a.d((p)list.get(0)).u());
                }
                else {
                    n2 = 0;
                }
                int length;
                if (list.size() > 1) {
                    length = (int)h4.a((double)a.d((p)list.get(1)).u());
                }
                else {
                    length = s.length();
                }
                final int min = Math.min(Math.max(n2, 0), s.length());
                final int min2 = Math.min(Math.max(length, 0), s.length());
                o = new t(s.substring(Math.min(min, min2), Math.max(min, min2)));
                break;
            }
            case 9: {
                h4.j("split", 2, list);
                final String f = this.f;
                if (f.length() == 0) {
                    o = new f((List)Arrays.asList((p)this));
                    break;
                }
                final ArrayList<t> list2 = new ArrayList<t>();
                if (list.isEmpty()) {
                    list2.add(this);
                }
                else {
                    s = a.d((p)list.get(0)).c();
                    long d;
                    if (list.size() > 1) {
                        d = h4.d((double)a.d((p)list.get(1)).u());
                    }
                    else {
                        d = 2147483647L;
                    }
                    if (d == 0L) {
                        o = new f();
                        break;
                    }
                    final String[] split = f.split(Pattern.quote(s), (int)d + 1);
                    final int length2 = split.length;
                    int n4 = 0;
                    int n5 = 0;
                    Label_1219: {
                        if (s.isEmpty() && length2 > 0) {
                            final boolean empty = split[0].isEmpty();
                            final int n3 = length2 - 1;
                            n4 = (empty ? 1 : 0);
                            n5 = n3;
                            if (split[n3].isEmpty()) {
                                break Label_1219;
                            }
                            n4 = (empty ? 1 : 0);
                        }
                        else {
                            n4 = 0;
                        }
                        n5 = length2;
                    }
                    int i = n4;
                    int n6 = n5;
                    if (length2 > d) {
                        n6 = n5 - 1;
                        i = n4;
                    }
                    while (i < n6) {
                        list2.add(new t(split[i]));
                        ++i;
                    }
                }
                o = new f((List)list2);
                break;
            }
            case 8: {
                h4.j("slice", 2, list);
                s = this.f;
                double doubleValue;
                if (!list.isEmpty()) {
                    doubleValue = a.d((p)list.get(0)).u();
                }
                else {
                    doubleValue = 0.0;
                }
                final double a2 = h4.a(doubleValue);
                double n7;
                if (a2 < 0.0) {
                    n7 = Math.max(s.length() + a2, 0.0);
                }
                else {
                    n7 = Math.min(a2, s.length());
                }
                final int n8 = (int)n7;
                double doubleValue2;
                if (list.size() > 1) {
                    doubleValue2 = a.d((p)list.get(1)).u();
                }
                else {
                    doubleValue2 = s.length();
                }
                final double a3 = h4.a(doubleValue2);
                double n9;
                if (a3 < 0.0) {
                    n9 = Math.max(s.length() + a3, 0.0);
                }
                else {
                    n9 = Math.min(a3, s.length());
                }
                o = new t(s.substring(n8, Math.max(0, (int)n9 - n8) + n8));
                break;
            }
            case 7: {
                h4.j("search", 1, list);
                if (!list.isEmpty()) {
                    s = a.d((p)list.get(0)).c();
                }
                final Matcher matcher = Pattern.compile(s).matcher(this.f);
                if (matcher.find()) {
                    o = new i(Double.valueOf(matcher.start()));
                    break;
                }
                o = new i(Double.valueOf(-1.0));
                break;
            }
            case 6: {
                h4.j("replace", 2, list);
                Object o2;
                final u u = (u)(o2 = p.L3);
                if (!list.isEmpty()) {
                    final String c = a.d((p)list.get(0)).c();
                    o2 = u;
                    s = c;
                    if (list.size() > 1) {
                        o2 = a.d((p)list.get(1));
                        s = c;
                    }
                }
                final String f2 = this.f;
                final int index = f2.indexOf(s);
                if (index >= 0) {
                    Object f3 = o2;
                    if (o2 instanceof j) {
                        f3 = ((j)o2).f(a, (List)Arrays.asList((p)new t(s), (p)new i(Double.valueOf(index)), (p)this));
                    }
                    o = new t(a.k(f2.substring(0, index), ((p)f3).c(), f2.substring(s.length() + index)));
                    break;
                }
                return (p)this;
            }
            case 5: {
                h4.j("match", 1, list);
                final String f4 = this.f;
                if (list.size() <= 0) {
                    s = "";
                }
                else {
                    s = a.d((p)list.get(0)).c();
                }
                final Matcher matcher2 = Pattern.compile(s).matcher(f4);
                if (matcher2.find()) {
                    o = new f((List)Arrays.asList((p)new t(matcher2.group())));
                    break;
                }
                o = p.M3;
                break;
            }
            case 4: {
                h4.j("lastIndexOf", 2, list);
                final String f5 = this.f;
                if (list.size() > 0) {
                    s = a.d((p)list.get(0)).c();
                }
                double doubleValue3;
                if (list.size() < 2) {
                    doubleValue3 = Double.NaN;
                }
                else {
                    doubleValue3 = a.d((p)list.get(1)).u();
                }
                double a4;
                if (Double.isNaN(doubleValue3)) {
                    a4 = Double.POSITIVE_INFINITY;
                }
                else {
                    a4 = h4.a(doubleValue3);
                }
                o = new i(Double.valueOf(f5.lastIndexOf(s, (int)a4)));
                break;
            }
            case 3: {
                double doubleValue4 = 0.0;
                h4.j("indexOf", 2, list);
                final String f6 = this.f;
                if (list.size() > 0) {
                    s = a.d((p)list.get(0)).c();
                }
                if (list.size() >= 2) {
                    doubleValue4 = a.d((p)list.get(1)).u();
                }
                o = new i(Double.valueOf(f6.indexOf(s, (int)h4.a(doubleValue4))));
                break;
            }
            case 2: {
                h4.h("hasOwnProperty", 1, (List)list);
                s = this.f;
                final p d2 = a.d((p)list.get(0));
                if ("length".equals(d2.c())) {
                    o = p.Q3;
                    break;
                }
                final double doubleValue5 = d2.u();
                if (doubleValue5 == Math.floor(doubleValue5)) {
                    final int n10 = (int)doubleValue5;
                    if (n10 >= 0 && n10 < s.length()) {
                        o = p.Q3;
                        break;
                    }
                }
                o = p.R3;
                break;
            }
            case 1: {
                if (!list.isEmpty()) {
                    final StringBuilder sb = new StringBuilder(this.f);
                    for (int j = 0; j < list.size(); ++j) {
                        sb.append(a.d((p)list.get(j)).c());
                    }
                    o = new t(sb.toString());
                    break;
                }
                return (p)this;
            }
            case 0: {
                h4.j("charAt", 1, list);
                int n11;
                if (!list.isEmpty()) {
                    n11 = (int)h4.a((double)a.d((p)list.get(0)).u());
                }
                else {
                    n11 = 0;
                }
                s = this.f;
                if (n11 >= 0 && n11 < s.length()) {
                    o = new t(String.valueOf(s.charAt(n11)));
                    break;
                }
                o = p.S3;
                break;
            }
        }
        return (p)o;
        o = this;
        return (p)o;
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new s(this);
    }
    
    @Override
    public final String toString() {
        return a.k("\"", this.f, "\"");
    }
    
    public final Double u() {
        if (this.f.isEmpty()) {
            return 0.0;
        }
        try {
            return Double.valueOf(this.f);
        }
        catch (final NumberFormatException ex) {
            return Double.NaN;
        }
    }
}
