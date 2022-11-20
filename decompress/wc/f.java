// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import android.text.Layout$Alignment;
import e2.n;
import java.util.HashSet;
import bd.c0;
import ah0.b;
import java.util.ArrayDeque;
import android.text.SpannedString;
import android.util.Log;
import bd.t;
import java.util.regex.Matcher;
import java.util.Set;
import android.text.TextUtils;
import java.util.Iterator;
import rc.c;
import java.util.Comparator;
import java.util.Collection;
import java.util.ArrayList;
import rc.a;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StrikethroughSpan;
import dg.l0;
import android.text.style.StyleSpan;
import java.util.List;
import android.text.SpannableStringBuilder;
import java.util.Collections;
import android.graphics.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class f
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Map<String, Integer> c;
    public static final Map<String, Integer> d;
    
    static {
        a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
        b = Pattern.compile("(\\S+?):(\\S+)");
        final HashMap hashMap = new HashMap();
        hashMap.put("white", Color.rgb(255, 255, 255));
        hashMap.put("lime", Color.rgb(0, 255, 0));
        hashMap.put("cyan", Color.rgb(0, 255, 255));
        hashMap.put("red", Color.rgb(255, 0, 0));
        hashMap.put("yellow", Color.rgb(255, 255, 0));
        hashMap.put("magenta", Color.rgb(255, 0, 255));
        hashMap.put("blue", Color.rgb(0, 0, 255));
        hashMap.put("black", Color.rgb(0, 0, 0));
        c = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Color.rgb(255, 255, 255));
        hashMap2.put("bg_lime", Color.rgb(0, 255, 0));
        hashMap2.put("bg_cyan", Color.rgb(0, 255, 255));
        hashMap2.put("bg_red", Color.rgb(255, 0, 0));
        hashMap2.put("bg_yellow", Color.rgb(255, 255, 0));
        hashMap2.put("bg_magenta", Color.rgb(255, 0, 255));
        hashMap2.put("bg_blue", Color.rgb(0, 0, 255));
        hashMap2.put("bg_black", Color.rgb(0, 0, 0));
        d = Collections.unmodifiableMap((Map<?, ?>)hashMap2);
    }
    
    public static void a(final SpannableStringBuilder spannableStringBuilder, final b b, final String s, final List list, final List list2) {
        final int b2 = b.b;
        final int length = spannableStringBuilder.length();
        final String a = b.a;
        a.getClass();
        final int hashCode = a.hashCode();
        int n = 0;
        Label_0242: {
            if (hashCode != 0) {
                if (hashCode != 105) {
                    if (hashCode != 3314158) {
                        if (hashCode != 3511770) {
                            if (hashCode != 98) {
                                if (hashCode != 99) {
                                    if (hashCode != 117) {
                                        if (hashCode == 118) {
                                            if (a.equals("v")) {
                                                n = 5;
                                                break Label_0242;
                                            }
                                        }
                                    }
                                    else if (a.equals("u")) {
                                        n = 4;
                                        break Label_0242;
                                    }
                                }
                                else if (a.equals("c")) {
                                    n = 2;
                                    break Label_0242;
                                }
                            }
                            else if (a.equals("b")) {
                                n = 1;
                                break Label_0242;
                            }
                        }
                        else if (a.equals("ruby")) {
                            n = 7;
                            break Label_0242;
                        }
                    }
                    else if (a.equals("lang")) {
                        n = 6;
                        break Label_0242;
                    }
                }
                else if (a.equals("i")) {
                    n = 3;
                    break Label_0242;
                }
            }
            else if (a.equals("")) {
                n = 0;
                break Label_0242;
            }
            n = -1;
        }
        while (true) {
            switch (n) {
                default: {
                    return;
                }
                case 0:
                case 5:
                case 6: {
                    final ArrayList b3 = b(list2, s, b);
                    for (int i = 0; i < b3.size(); ++i) {
                        final wc.d g = b3.get(i).g;
                        if (g != null) {
                            final int l = g.l;
                            int n2;
                            if (l == -1 && g.m == -1) {
                                n2 = -1;
                            }
                            else {
                                final boolean b4 = l == 1;
                                int n3;
                                if (g.m == 1) {
                                    n3 = 2;
                                }
                                else {
                                    n3 = 0;
                                }
                                n2 = (n3 | (b4 ? 1 : 0));
                            }
                            if (n2 != -1) {
                                final int j = g.l;
                                int n4;
                                if (j == -1 && g.m == -1) {
                                    n4 = -1;
                                }
                                else {
                                    boolean b5;
                                    if (j == 1) {
                                        b5 = true;
                                    }
                                    else {
                                        b5 = false;
                                    }
                                    int n5;
                                    if (g.m == 1) {
                                        n5 = 2;
                                    }
                                    else {
                                        n5 = 0;
                                    }
                                    n4 = ((b5 ? 1 : 0) | n5);
                                }
                                l0.w(spannableStringBuilder, (Object)new StyleSpan(n4), b2, length);
                            }
                            if (g.j == 1) {
                                spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), b2, length, 33);
                            }
                            if (g.k == 1) {
                                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), b2, length, 33);
                            }
                            if (g.g) {
                                if (!g.g) {
                                    throw new IllegalStateException("Font color not defined");
                                }
                                l0.w(spannableStringBuilder, (Object)new ForegroundColorSpan(g.f), b2, length);
                            }
                            if (g.i) {
                                if (!g.i) {
                                    throw new IllegalStateException("Background color not defined.");
                                }
                                l0.w(spannableStringBuilder, (Object)new BackgroundColorSpan(g.h), b2, length);
                            }
                            if (g.e != null) {
                                l0.w(spannableStringBuilder, (Object)new TypefaceSpan(g.e), b2, length);
                            }
                            final int n6 = g.n;
                            if (n6 != 1) {
                                if (n6 != 2) {
                                    if (n6 == 3) {
                                        l0.w(spannableStringBuilder, (Object)new RelativeSizeSpan(g.o / 100.0f), b2, length);
                                    }
                                }
                                else {
                                    l0.w(spannableStringBuilder, (Object)new RelativeSizeSpan(g.o), b2, length);
                                }
                            }
                            else {
                                l0.w(spannableStringBuilder, (Object)new AbsoluteSizeSpan((int)g.o, true), b2, length);
                            }
                            if (g.q) {
                                spannableStringBuilder.setSpan((Object)new rc.a(), b2, length, 33);
                            }
                        }
                    }
                    return;
                }
                case 7: {
                    final int c = c(list2, s, b);
                    final ArrayList list3 = new ArrayList(list.size());
                    list3.addAll(list);
                    Collections.sort((List<Object>)list3, (Comparator<? super Object>)f.a.c);
                    int b6 = b.b;
                    int k = 0;
                    int n7 = 0;
                    while (k < list3.size()) {
                        if ("rt".equals(((a)list3.get(k)).a.a)) {
                            final a a2 = (a)list3.get(k);
                            int c2 = c(list2, s, a2.a);
                            if (c2 == -1) {
                                if (c != -1) {
                                    c2 = c;
                                }
                                else {
                                    c2 = 1;
                                }
                            }
                            final int n8 = a2.a.b - n7;
                            final int n9 = a2.b - n7;
                            final CharSequence subSequence = spannableStringBuilder.subSequence(n8, n9);
                            spannableStringBuilder.delete(n8, n9);
                            spannableStringBuilder.setSpan((Object)new rc.c(subSequence.toString(), c2), b6, n8, 33);
                            n7 += subSequence.length();
                            b6 = n8;
                        }
                        ++k;
                    }
                    continue;
                }
                case 4: {
                    spannableStringBuilder.setSpan((Object)new UnderlineSpan(), b2, length, 33);
                    continue;
                }
                case 3: {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(2), b2, length, 33);
                    continue;
                }
                case 2: {
                    for (final String s2 : b.d) {
                        final Map<String, Integer> c3 = f.c;
                        if (c3.containsKey(s2)) {
                            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan((int)c3.get(s2)), b2, length, 33);
                        }
                        else {
                            final Map<String, Integer> d = f.d;
                            if (!d.containsKey(s2)) {
                                continue;
                            }
                            spannableStringBuilder.setSpan((Object)new BackgroundColorSpan((int)d.get(s2)), b2, length, 33);
                        }
                    }
                    continue;
                }
                case 1: {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(1), b2, length, 33);
                    continue;
                }
            }
            break;
        }
    }
    
    public static ArrayList b(final List list, final String s, final b b) {
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final wc.d d = list.get(i);
            final String a = b.a;
            final Set<String> d2 = b.d;
            final String c = b.c;
            int empty;
            if (d.a.isEmpty() && d.b.isEmpty() && d.c.isEmpty() && d.d.isEmpty()) {
                empty = (TextUtils.isEmpty((CharSequence)a) ? 1 : 0);
            }
            else {
                final int a2 = wc.d.a(wc.d.a(wc.d.a(0, 1073741824, d.a, s), 2, d.b, a), 4, d.d, c);
                if (a2 != -1 && d2.containsAll(d.c)) {
                    empty = a2 + d.c.size() * 4;
                }
                else {
                    empty = 0;
                }
            }
            if (empty > 0) {
                list2.add(new c(empty, d));
            }
        }
        Collections.sort((List<Comparable>)list2);
        return list2;
    }
    
    public static int c(final List<wc.d> list, final String s, final b b) {
        final ArrayList b2 = b(list, s, b);
        for (int i = 0; i < b2.size(); ++i) {
            final int p3 = b2.get(i).g.p;
            if (p3 != -1) {
                return p3;
            }
        }
        return -1;
    }
    
    public static e d(String s, Matcher matcher, final t t, final ArrayList list) {
        final d d = new d();
        try {
            final String group = matcher.group(1);
            group.getClass();
            d.a = h.c(group);
            final String group2 = matcher.group(2);
            group2.getClass();
            d.b = h.c(group2);
            matcher = (Matcher)matcher.group(3);
            matcher.getClass();
            e((String)matcher, d);
            final StringBuilder sb = new StringBuilder();
            for (matcher = (Matcher)t.d(); !TextUtils.isEmpty((CharSequence)matcher); matcher = (Matcher)t.d()) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(((String)matcher).trim());
            }
            d.c = (CharSequence)f(s, sb.toString(), list);
            return new e(d.a().a(), d.a, d.b);
        }
        catch (final NumberFormatException ex) {
            s = String.valueOf(matcher.group());
            if (s.length() != 0) {
                s = "Skipping cue with bad header: ".concat(s);
            }
            else {
                s = new String("Skipping cue with bad header: ");
            }
            Log.w("WebvttCueParser", s);
            return null;
        }
    }
    
    public static void e(String s, final d d) {
        final Matcher matcher = f.b.matcher(s);
    Label_0355_Outer:
        while (matcher.find()) {
            int k = 1;
            int d2 = 1;
            s = matcher.group(1);
            s.getClass();
            final String group = matcher.group(2);
            group.getClass();
            try {
                if ("line".equals(s)) {
                    g(group, d);
                }
                else if ("align".equals(s)) {
                    int n = -1;
                    switch (group) {
                        case "start": {
                            n = 5;
                            break;
                        }
                        case "right": {
                            n = 4;
                            break;
                        }
                        case "left": {
                            n = 3;
                            break;
                        }
                        case "end": {
                            n = 2;
                            break;
                        }
                        case "middle": {
                            n = 1;
                            break;
                        }
                        case "center": {
                            n = 0;
                            break;
                        }
                        default:
                            break;
                    }
                    while (true) {
                        switch (n) {
                            case 5: {
                                d.d = d2;
                                continue Label_0355_Outer;
                            }
                            case 4: {
                                d2 = 5;
                                continue;
                            }
                            case 3: {
                                d2 = 4;
                                continue;
                            }
                            case 2: {
                                d2 = 3;
                                continue;
                            }
                            default: {
                                if (group.length() != 0) {
                                    s = "Invalid alignment value: ".concat(group);
                                }
                                else {
                                    s = new String("Invalid alignment value: ");
                                }
                                Log.w("WebvttCueParser", s);
                            }
                            case 0:
                            case 1: {
                                d2 = 2;
                                continue;
                            }
                        }
                        break;
                    }
                }
                else if ("position".equals(s)) {
                    h(group, d);
                }
                else if ("size".equals(s)) {
                    d.j = h.b(group);
                }
                else if ("vertical".equals(s)) {
                    if (!group.equals("lr")) {
                        if (!group.equals("rl")) {
                            if (group.length() != 0) {
                                s = "Invalid 'vertical' value: ".concat(group);
                            }
                            else {
                                s = new String("Invalid 'vertical' value: ");
                            }
                            Log.w("WebvttCueParser", s);
                            k = Integer.MIN_VALUE;
                        }
                    }
                    else {
                        k = 2;
                    }
                    d.k = k;
                }
                else {
                    final StringBuilder sb = new StringBuilder(s.length() + 21 + group.length());
                    sb.append("Unknown cue setting ");
                    sb.append(s);
                    sb.append(":");
                    sb.append(group);
                    Log.w("WebvttCueParser", sb.toString());
                }
            }
            catch (final NumberFormatException ex) {
                s = String.valueOf(matcher.group());
                if (s.length() != 0) {
                    s = "Skipping bad cue setting: ".concat(s);
                }
                else {
                    s = new String("Skipping bad cue setting: ");
                }
                Log.w("WebvttCueParser", s);
            }
        }
    }
    
    public static SpannedString f(final String s, final String s2, final List<wc.d> list) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final ArrayDeque arrayDeque = new ArrayDeque();
        final ArrayList list2 = new ArrayList();
        int n = 0;
        while (true) {
            final int length = s2.length();
            String trim = "";
            if (n >= length) {
                break;
            }
            final char char1 = s2.charAt(n);
            if (char1 != '&') {
                if (char1 != '<') {
                    spannableStringBuilder.append(char1);
                    ++n;
                }
                else {
                    final int n2 = n + 1;
                    if (n2 >= s2.length()) {
                        n = n2;
                    }
                    else {
                        final boolean b = s2.charAt(n2) == '/';
                        int n3 = s2.indexOf(62, n2);
                        if (n3 == -1) {
                            n3 = s2.length();
                        }
                        else {
                            ++n3;
                        }
                        int n4 = n3 - 2;
                        final boolean b2 = s2.charAt(n4) == '/';
                        int n5;
                        if (b) {
                            n5 = 2;
                        }
                        else {
                            n5 = 1;
                        }
                        if (!b2) {
                            n4 = n3 - 1;
                        }
                        final String substring = s2.substring(n + n5, n4);
                        if (!substring.trim().isEmpty()) {
                            final String trim2 = substring.trim();
                            ah0.b.C(trim2.isEmpty() ^ true);
                            final int a = c0.a;
                            final String s3 = trim2.split("[ \\.]", 2)[0];
                            s3.getClass();
                            final int hashCode = s3.hashCode();
                            int n6 = 0;
                            Label_0492: {
                                if (hashCode != 98) {
                                    if (hashCode != 99) {
                                        if (hashCode != 105) {
                                            if (hashCode != 3650) {
                                                if (hashCode != 3314158) {
                                                    if (hashCode != 3511770) {
                                                        if (hashCode != 117) {
                                                            if (hashCode == 118) {
                                                                if (s3.equals("v")) {
                                                                    n6 = 4;
                                                                    break Label_0492;
                                                                }
                                                            }
                                                        }
                                                        else if (s3.equals("u")) {
                                                            n6 = 3;
                                                            break Label_0492;
                                                        }
                                                    }
                                                    else if (s3.equals("ruby")) {
                                                        n6 = 7;
                                                        break Label_0492;
                                                    }
                                                }
                                                else if (s3.equals("lang")) {
                                                    n6 = 6;
                                                    break Label_0492;
                                                }
                                            }
                                            else if (s3.equals("rt")) {
                                                n6 = 5;
                                                break Label_0492;
                                            }
                                        }
                                        else if (s3.equals("i")) {
                                            n6 = 2;
                                            break Label_0492;
                                        }
                                    }
                                    else if (s3.equals("c")) {
                                        n6 = 1;
                                        break Label_0492;
                                    }
                                }
                                else if (s3.equals("b")) {
                                    n6 = 0;
                                    break Label_0492;
                                }
                                n6 = -1;
                            }
                            boolean b3 = false;
                            switch (n6) {
                                default: {
                                    b3 = false;
                                    break;
                                }
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7: {
                                    b3 = true;
                                    break;
                                }
                            }
                            if (b3) {
                                if (b) {
                                    while (!arrayDeque.isEmpty()) {
                                        final b b4 = arrayDeque.pop();
                                        a(spannableStringBuilder, b4, s, list2, list);
                                        if (!arrayDeque.isEmpty()) {
                                            list2.add(new a(b4, spannableStringBuilder.length()));
                                        }
                                        else {
                                            list2.clear();
                                        }
                                        if (b4.a.equals(s3)) {
                                            n = n3;
                                            continue Label_0810;
                                        }
                                    }
                                    n = n3;
                                    continue;
                                }
                                n = n3;
                                if (!b2) {
                                    final int length2 = spannableStringBuilder.length();
                                    String s4 = substring.trim();
                                    ah0.b.C(s4.isEmpty() ^ true);
                                    final int index = s4.indexOf(" ");
                                    if (index != -1) {
                                        trim = s4.substring(index).trim();
                                        s4 = s4.substring(0, index);
                                    }
                                    final String[] split = s4.split("\\.", -1);
                                    final String s5 = split[0];
                                    final HashSet<String> set = new HashSet<String>();
                                    for (int i = 1; i < split.length; ++i) {
                                        set.add(split[i]);
                                    }
                                    arrayDeque.push(new b(s5, length2, trim, set));
                                    n = n3;
                                    continue;
                                }
                                continue;
                            }
                        }
                        n = n3;
                    }
                    Label_0810:;
                }
            }
            else {
                final int n7 = n + 1;
                int n8 = s2.indexOf(59, n7);
                final int index2 = s2.indexOf(32, n7);
                int n9 = -1;
                if (n8 == -1) {
                    n8 = index2;
                }
                else if (index2 != -1) {
                    n8 = Math.min(n8, index2);
                }
                if (n8 != -1) {
                    final String substring2 = s2.substring(n7, n8);
                    substring2.getClass();
                    switch (substring2) {
                        case "nbsp": {
                            n9 = 3;
                            break;
                        }
                        case "amp": {
                            n9 = 2;
                            break;
                        }
                        case "lt": {
                            n9 = 1;
                            break;
                        }
                        case "gt": {
                            n9 = 0;
                            break;
                        }
                        default:
                            break;
                    }
                    switch (n9) {
                        default: {
                            final StringBuilder sb = new StringBuilder(substring2.length() + 33);
                            sb.append("ignoring unsupported entity: '&");
                            sb.append(substring2);
                            sb.append(";'");
                            Log.w("WebvttCueParser", sb.toString());
                            break;
                        }
                        case 3: {
                            spannableStringBuilder.append(' ');
                            break;
                        }
                        case 2: {
                            spannableStringBuilder.append('&');
                            break;
                        }
                        case 1: {
                            spannableStringBuilder.append('<');
                            break;
                        }
                        case 0: {
                            spannableStringBuilder.append('>');
                            break;
                        }
                    }
                    if (n8 == index2) {
                        spannableStringBuilder.append((CharSequence)" ");
                    }
                    n = n8 + 1;
                }
                else {
                    spannableStringBuilder.append(char1);
                    n = n7;
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(spannableStringBuilder, arrayDeque.pop(), s, list2, list);
        }
        a(spannableStringBuilder, new b("", 0, "", Collections.emptySet()), s, Collections.emptyList(), list);
        return SpannedString.valueOf((CharSequence)spannableStringBuilder);
    }
    
    public static void g(final String s, final d d) {
        final int index = s.indexOf(44);
        int n = -1;
        String substring = s;
        if (index != -1) {
            final String substring2 = s.substring(index + 1);
            substring2.getClass();
            final int hashCode = substring2.hashCode();
            int g = 2;
            switch (hashCode) {
                case 109757538: {
                    if (!substring2.equals("start")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 100571: {
                    if (!substring2.equals("end")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1074341483: {
                    if (!substring2.equals("middle")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1364013995: {
                    if (!substring2.equals("center")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            while (true) {
                switch (n) {
                    default: {
                        String concat;
                        if (substring2.length() != 0) {
                            concat = "Invalid anchor value: ".concat(substring2);
                        }
                        else {
                            concat = new String("Invalid anchor value: ");
                        }
                        Log.w("WebvttCueParser", concat);
                        g = Integer.MIN_VALUE;
                    }
                    case 2: {
                        d.g = g;
                        substring = s.substring(0, index);
                        break;
                    }
                    case 3: {
                        g = 0;
                        continue;
                    }
                    case 0:
                    case 1: {
                        g = 1;
                        continue;
                    }
                }
                break;
            }
        }
        if (substring.endsWith("%")) {
            d.e = h.b(substring);
            d.f = 0;
        }
        else {
            d.e = (float)Integer.parseInt(substring);
            d.f = 1;
        }
    }
    
    public static void h(final String s, final d d) {
        final int index = s.indexOf(44);
        int n = -1;
        String substring = s;
        if (index != -1) {
            final String substring2 = s.substring(index + 1);
            substring2.getClass();
            final int hashCode = substring2.hashCode();
            int i = 2;
            switch (hashCode) {
                case 109757538: {
                    if (!substring2.equals("start")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case 100571: {
                    if (!substring2.equals("end")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case -1074341483: {
                    if (!substring2.equals("middle")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -1276788989: {
                    if (!substring2.equals("line-right")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1364013995: {
                    if (!substring2.equals("center")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1842484672: {
                    if (!substring2.equals("line-left")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            while (true) {
                switch (n) {
                    default: {
                        String concat;
                        if (substring2.length() != 0) {
                            concat = "Invalid anchor value: ".concat(substring2);
                        }
                        else {
                            concat = new String("Invalid anchor value: ");
                        }
                        Log.w("WebvttCueParser", concat);
                        i = Integer.MIN_VALUE;
                    }
                    case 2:
                    case 4: {
                        d.i = i;
                        substring = s.substring(0, index);
                        break;
                    }
                    case 1:
                    case 3: {
                        i = 1;
                        continue;
                    }
                    case 0:
                    case 5: {
                        i = 0;
                        continue;
                    }
                }
                break;
            }
        }
        d.h = h.b(substring);
    }
    
    public static final class a
    {
        public static final n c;
        public final b a;
        public final int b;
        
        static {
            c = new n(3);
        }
        
        public a(final b a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class b
    {
        public final String a;
        public final int b;
        public final String c;
        public final Set<String> d;
        
        public b(final String a, final int b, final String c, final Set<String> d) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class c implements Comparable<c>
    {
        public final int f;
        public final wc.d g;
        
        public c(final int f, final wc.d g) {
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final int compareTo(final Object o) {
            return Integer.compare(this.f, ((c)o).f);
        }
    }
    
    public static final class d
    {
        public long a;
        public long b;
        public CharSequence c;
        public int d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public float j;
        public int k;
        
        public d() {
            this.a = 0L;
            this.b = 0L;
            this.d = 2;
            this.e = -3.4028235E38f;
            this.f = 1;
            this.g = 0;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = 1.0f;
            this.k = Integer.MIN_VALUE;
        }
        
        public final nc.a.a a() {
            float h = this.h;
            float e = -3.4028235E38f;
            if (h == -3.4028235E38f) {
                final int d = this.d;
                if (d != 4) {
                    if (d != 5) {
                        h = 0.5f;
                    }
                    else {
                        h = 1.0f;
                    }
                }
                else {
                    h = 0.0f;
                }
            }
            int i = this.i;
            Label_0110: {
                if (i == Integer.MIN_VALUE) {
                    final int d2 = this.d;
                    Label_0107: {
                        if (d2 != 1) {
                            if (d2 != 3) {
                                if (d2 == 4) {
                                    break Label_0107;
                                }
                                if (d2 != 5) {
                                    i = 1;
                                    break Label_0110;
                                }
                            }
                            i = 2;
                            break Label_0110;
                        }
                    }
                    i = 0;
                }
            }
            final nc.a.a a = new nc.a.a();
            final int d3 = this.d;
            Layout$Alignment c = null;
            Label_0193: {
                Label_0188: {
                    if (d3 != 1) {
                        if (d3 != 2) {
                            if (d3 != 3) {
                                if (d3 == 4) {
                                    break Label_0188;
                                }
                                if (d3 != 5) {
                                    ph0.a.h(34, "Unknown textAlignment: ", d3, "WebvttCueParser");
                                    c = null;
                                    break Label_0193;
                                }
                            }
                            c = Layout$Alignment.ALIGN_OPPOSITE;
                            break Label_0193;
                        }
                        c = Layout$Alignment.ALIGN_CENTER;
                        break Label_0193;
                    }
                }
                c = Layout$Alignment.ALIGN_NORMAL;
            }
            a.c = c;
            final float e2 = this.e;
            final int f = this.f;
            final float n = fcmpl(e2, -3.4028235E38f);
            Label_0259: {
                Label_0257: {
                    if (n != 0 && f == 0) {
                        if (e2 < 0.0f) {
                            break Label_0257;
                        }
                        if (e2 > 1.0f) {
                            break Label_0257;
                        }
                    }
                    if (n != 0) {
                        e = e2;
                        break Label_0259;
                    }
                    if (f != 0) {
                        break Label_0259;
                    }
                }
                e = 1.0f;
            }
            a.e = e;
            a.f = f;
            a.g = this.g;
            a.h = h;
            a.i = i;
            final float j = this.j;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException(String.valueOf(i));
                    }
                }
                else if (h <= 0.5f) {
                    h *= 2.0f;
                }
                else {
                    h = (1.0f - h) * 2.0f;
                }
            }
            else {
                h = 1.0f - h;
            }
            a.l = Math.min(j, h);
            a.p = this.k;
            final CharSequence c2 = this.c;
            if (c2 != null) {
                a.a = c2;
            }
            return a;
        }
    }
}
