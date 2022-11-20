// 
// Decompiled by Procyon v0.6.0
// 

package com.caverock.androidsvg;

import android.util.Log;
import java.util.Locale;
import java.util.Iterator;
import java.util.ArrayList;

public final class CSSParser
{
    public CSSParser.CSSParser$MediaType a;
    public CSSParser$Source b;
    public boolean c;
    
    public CSSParser(final CSSParser.CSSParser$MediaType a, final CSSParser$Source b) {
        this.c = false;
        this.a = a;
        this.b = b;
    }
    
    public static int a(final ArrayList list, int n, final SVG$j0 svg$j0) {
        final int n2 = 0;
        if (n < 0) {
            return 0;
        }
        final SVG.h0 value = list.get(n);
        final SVG.h0 b = ((SVG.l0)svg$j0).b;
        if (value != b) {
            return -1;
        }
        final Iterator<SVG.l0> iterator = b.h().iterator();
        n = n2;
        while (iterator.hasNext()) {
            if ((SVG.l0)iterator.next() == svg$j0) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    public static ArrayList c(final CSSParser.CSSParser$c cssParser$c) {
        final ArrayList list = new ArrayList();
    Label_0147_Outer:
        while (true) {
            if (((SVGParser.g)cssParser$c).f()) {
                return list;
            }
            final boolean f = ((SVGParser.g)cssParser$c).f();
            String substring = null;
            if (!f) {
                final int b = ((SVGParser.g)cssParser$c).b;
                final char char1 = ((SVGParser.g)cssParser$c).a.charAt(b);
                if ((char1 >= 'A' && char1 <= 'Z') || (char1 >= 'a' && char1 <= 'z')) {
                    for (int n = ((SVGParser.g)cssParser$c).a(); (n >= 65 && n <= 90) || (n >= 97 && n <= 122); n = ((SVGParser.g)cssParser$c).a()) {}
                    substring = ((SVGParser.g)cssParser$c).a.substring(b, ((SVGParser.g)cssParser$c).b);
                }
                else {
                    ((SVGParser.g)cssParser$c).b = b;
                }
            }
            if (substring == null) {
                return list;
            }
            while (true) {
                try {
                    list.add(CSSParser.CSSParser$MediaType.valueOf(substring));
                    if (!((SVGParser.g)cssParser$c).p()) {
                        return list;
                    }
                    continue Label_0147_Outer;
                }
                catch (final IllegalArgumentException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public static boolean f(final n n, final int n2, final ArrayList list, int i, final SVG$j0 svg$j0) {
        final o o = n.a.get(n2);
        if (!i(o, svg$j0)) {
            return false;
        }
        final CSSParser$Combinator a = o.a;
        if (a == CSSParser$Combinator.DESCENDANT) {
            if (n2 == 0) {
                return true;
            }
            while (i >= 0) {
                if (h(n, n2 - 1, list, i)) {
                    return true;
                }
                --i;
            }
            return false;
        }
        else {
            if (a == CSSParser$Combinator.CHILD) {
                return h(n, n2 - 1, list, i);
            }
            final int a2 = a(list, i, svg$j0);
            return a2 > 0 && f(n, n2 - 1, list, i, (SVG$j0)((SVG.l0)svg$j0).b.h().get(a2 - 1));
        }
    }
    
    public static boolean g(final n n, final SVG$j0 svg$j0) {
        final ArrayList list = new ArrayList();
        SVG.h0 h0 = ((SVG.l0)svg$j0).b;
        int n2;
        while (true) {
            n2 = 0;
            if (h0 == null) {
                break;
            }
            list.add(0, h0);
            h0 = ((SVG.l0)h0).b;
        }
        final int size = list.size();
        final ArrayList a = n.a;
        int size2;
        if (a == null) {
            size2 = 0;
        }
        else {
            size2 = a.size();
        }
        if (size2 == 1) {
            return i(n.a.get(0), svg$j0);
        }
        final ArrayList a2 = n.a;
        int size3;
        if (a2 == null) {
            size3 = n2;
        }
        else {
            size3 = a2.size();
        }
        return f(n, size3 - 1, list, size - 1, svg$j0);
    }
    
    public static boolean h(final n n, final int n2, final ArrayList list, int i) {
        final o o = n.a.get(n2);
        final SVG$j0 svg$j0 = list.get(i);
        if (!i(o, svg$j0)) {
            return false;
        }
        final CSSParser$Combinator a = o.a;
        if (a == CSSParser$Combinator.DESCENDANT) {
            if (n2 == 0) {
                return true;
            }
            while (i > 0) {
                if (h(n, n2 - 1, list, --i)) {
                    return true;
                }
            }
            return false;
        }
        else {
            if (a == CSSParser$Combinator.CHILD) {
                return h(n, n2 - 1, list, i - 1);
            }
            final int a2 = a(list, i, svg$j0);
            return a2 > 0 && f(n, n2 - 1, list, i, (SVG$j0)((SVG.l0)svg$j0).b.h().get(a2 - 1));
        }
    }
    
    public static boolean i(final o o, final SVG$j0 svg$j0) {
        final String b = o.b;
        if (b != null && !b.equals(((SVG.l0)svg$j0).o().toLowerCase(Locale.US))) {
            return false;
        }
        final ArrayList c = o.c;
        if (c != null) {
            for (final b b2 : c) {
                final String a = b2.a;
                a.getClass();
                if (!a.equals("id")) {
                    if (!a.equals("class")) {
                        return false;
                    }
                    final ArrayList g = svg$j0.g;
                    if (g == null) {
                        return false;
                    }
                    if (!g.contains(b2.c)) {
                        return false;
                    }
                    continue;
                }
                else {
                    if (!b2.c.equals(svg$j0.c)) {
                        return false;
                    }
                    continue;
                }
            }
        }
        final ArrayList d = o.d;
        if (d != null) {
            final Iterator iterator2 = d.iterator();
            while (iterator2.hasNext()) {
                if (!((d)iterator2.next()).a(svg$j0)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final void b(final m m, final CSSParser.CSSParser$c cssParser$c) throws CSSParseException {
        final String t = cssParser$c.t();
        ((SVGParser.g)cssParser$c).q();
        if (t != null) {
            final boolean c = this.c;
            int n = 0;
            Label_0738: {
                if (!c && t.equals("media")) {
                    final ArrayList c2 = c(cssParser$c);
                    if (((SVGParser.g)cssParser$c).d('{')) {
                        ((SVGParser.g)cssParser$c).q();
                        final CSSParser.CSSParser$MediaType a = this.a;
                        while (true) {
                            for (final CSSParser.CSSParser$MediaType cssParser$MediaType : c2) {
                                if (cssParser$MediaType == CSSParser.CSSParser$MediaType.all || cssParser$MediaType == a) {
                                    final boolean b = true;
                                    if (b) {
                                        this.c = true;
                                        m.b(this.e(cssParser$c));
                                        this.c = false;
                                    }
                                    else {
                                        this.e(cssParser$c);
                                    }
                                    if (((SVGParser.g)cssParser$c).f()) {
                                        break Label_0738;
                                    }
                                    if (((SVGParser.g)cssParser$c).d('}')) {
                                        break Label_0738;
                                    }
                                    throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                                }
                            }
                            final boolean b = false;
                            continue;
                        }
                    }
                    throw new CSSParseException("Invalid @media rule: missing rule set");
                }
                else if (!this.c && t.equals("import")) {
                    final boolean f = ((SVGParser.g)cssParser$c).f();
                    final String s = null;
                    String s2;
                    if (f) {
                        s2 = s;
                    }
                    else {
                        final int b2 = ((SVGParser.g)cssParser$c).b;
                        if (!((SVGParser.g)cssParser$c).e("url(")) {
                            s2 = s;
                        }
                        else {
                            ((SVGParser.g)cssParser$c).q();
                            if ((s2 = cssParser$c.s()) == null) {
                                final StringBuilder sb = new StringBuilder();
                                while (!((SVGParser.g)cssParser$c).f()) {
                                    final char char1 = ((SVGParser.g)cssParser$c).a.charAt(((SVGParser.g)cssParser$c).b);
                                    if (char1 == '\'' || char1 == '\"' || char1 == '(' || char1 == ')' || SVGParser.g.g(char1)) {
                                        break;
                                    }
                                    if (Character.isISOControl((int)char1)) {
                                        break;
                                    }
                                    ++((SVGParser.g)cssParser$c).b;
                                    char char2;
                                    if ((char2 = char1) == '\\') {
                                        if (((SVGParser.g)cssParser$c).f()) {
                                            continue;
                                        }
                                        char2 = ((SVGParser.g)cssParser$c).a.charAt(((SVGParser.g)cssParser$c).b++);
                                        if (char2 == '\n' || char2 == '\r') {
                                            continue;
                                        }
                                        if (char2 == '\f') {
                                            continue;
                                        }
                                        int r = CSSParser.CSSParser$c.r((int)char2);
                                        if (r != -1) {
                                            for (int i = 1; i <= 5; ++i) {
                                                if (((SVGParser.g)cssParser$c).f()) {
                                                    break;
                                                }
                                                final int r2 = CSSParser.CSSParser$c.r((int)((SVGParser.g)cssParser$c).a.charAt(((SVGParser.g)cssParser$c).b));
                                                if (r2 == -1) {
                                                    break;
                                                }
                                                ++((SVGParser.g)cssParser$c).b;
                                                r = r * 16 + r2;
                                            }
                                            sb.append((char)r);
                                            continue;
                                        }
                                    }
                                    sb.append(char2);
                                }
                                if (sb.length() == 0) {
                                    s2 = null;
                                }
                                else {
                                    s2 = sb.toString();
                                }
                            }
                            if (s2 == null) {
                                ((SVGParser.g)cssParser$c).b = b2;
                                s2 = s;
                            }
                            else {
                                ((SVGParser.g)cssParser$c).q();
                                if (!((SVGParser.g)cssParser$c).f()) {
                                    if (!((SVGParser.g)cssParser$c).e(")")) {
                                        ((SVGParser.g)cssParser$c).b = b2;
                                        s2 = s;
                                    }
                                }
                            }
                        }
                    }
                    String s3;
                    if ((s3 = s2) == null) {
                        s3 = cssParser$c.s();
                    }
                    if (s3 == null) {
                        throw new CSSParseException("Invalid @import rule: expected string or url()");
                    }
                    ((SVGParser.g)cssParser$c).q();
                    c(cssParser$c);
                    if (!((SVGParser.g)cssParser$c).f()) {
                        if (!((SVGParser.g)cssParser$c).d(';')) {
                            throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                        }
                    }
                }
                else {
                    Log.w("CSSParser", String.format("Ignoring @%s rule", t));
                    while (!((SVGParser.g)cssParser$c).f()) {
                        final int intValue = ((SVGParser.g)cssParser$c).h();
                        if (intValue == 59 && n == 0) {
                            break;
                        }
                        if (intValue == 123) {
                            ++n;
                        }
                        else {
                            if (intValue == 125 && n > 0 && --n == 0) {
                                break;
                            }
                            continue;
                        }
                    }
                }
            }
            ((SVGParser.g)cssParser$c).q();
            return;
        }
        throw new CSSParseException("Invalid '@' rule");
    }
    
    public final boolean d(final m m, final CSSParser.CSSParser$c cssParser$c) throws CSSParseException {
        final ArrayList u = cssParser$c.u();
        if (u == null || u.isEmpty()) {
            return false;
        }
        if (((SVGParser.g)cssParser$c).d('{')) {
            ((SVGParser.g)cssParser$c).q();
            final SVG.Style style = new SVG.Style();
            do {
                final String t = cssParser$c.t();
                ((SVGParser.g)cssParser$c).q();
                if (!((SVGParser.g)cssParser$c).d(':')) {
                    throw new CSSParseException("Expected ':'");
                }
                ((SVGParser.g)cssParser$c).q();
                final boolean f = ((SVGParser.g)cssParser$c).f();
                String substring = null;
                if (!f) {
                    final int b = ((SVGParser.g)cssParser$c).b;
                    int n = ((SVGParser.g)cssParser$c).a.charAt(b);
                    int n2 = b;
                    while (n != -1 && n != 59 && n != 125 && n != 33 && n != 10 && n != 13) {
                        if (!SVGParser.g.g(n)) {
                            n2 = ((SVGParser.g)cssParser$c).b + 1;
                        }
                        n = ((SVGParser.g)cssParser$c).a();
                    }
                    if (((SVGParser.g)cssParser$c).b > b) {
                        substring = ((SVGParser.g)cssParser$c).a.substring(b, n2);
                    }
                    else {
                        ((SVGParser.g)cssParser$c).b = b;
                    }
                }
                if (substring == null) {
                    throw new CSSParseException("Expected property value");
                }
                ((SVGParser.g)cssParser$c).q();
                if (((SVGParser.g)cssParser$c).d('!')) {
                    ((SVGParser.g)cssParser$c).q();
                    if (!((SVGParser.g)cssParser$c).e("important")) {
                        throw new CSSParseException("Malformed rule set: found unexpected '!'");
                    }
                    ((SVGParser.g)cssParser$c).q();
                }
                ((SVGParser.g)cssParser$c).d(';');
                SVGParser.H(style, t, substring);
                ((SVGParser.g)cssParser$c).q();
            } while (!((SVGParser.g)cssParser$c).f() && !((SVGParser.g)cssParser$c).d('}'));
            ((SVGParser.g)cssParser$c).q();
            final Iterator iterator = u.iterator();
            while (iterator.hasNext()) {
                m.a(new l((n)iterator.next(), style, this.b));
            }
            return true;
        }
        throw new CSSParseException("Malformed rule block: expected '{'");
    }
    
    public final m e(final CSSParser.CSSParser$c cssParser$c) {
        final m m = new m();
        try {
            while (!((SVGParser.g)cssParser$c).f()) {
                if (((SVGParser.g)cssParser$c).e("<!--")) {
                    continue;
                }
                if (((SVGParser.g)cssParser$c).e("-->")) {
                    continue;
                }
                if (((SVGParser.g)cssParser$c).d('@')) {
                    this.b(m, cssParser$c);
                }
                else {
                    if (this.d(m, cssParser$c)) {
                        continue;
                    }
                    break;
                }
            }
        }
        catch (final CSSParseException ex) {
            final StringBuilder t = a.t("CSS parser terminated early due to error: ");
            t.append(((Throwable)ex).getMessage());
            Log.e("CSSParser", t.toString());
        }
        return m;
    }
    
    public static final class b
    {
        public final String a;
        public final CSSParser$AttribOp b;
        public final String c;
        
        public b(final String a, final CSSParser$AttribOp b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public interface d
    {
        boolean a(final SVG$j0 p0);
    }
    
    public static final class l
    {
        public n a;
        public SVG.Style b;
        public CSSParser$Source c;
        
        public l(final n a, final SVG.Style b, final CSSParser$Source c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(this.a));
            sb.append(" {...} (src=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class m
    {
        public ArrayList a;
        
        public m() {
            this.a = null;
        }
        
        public final void a(final l l) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            for (int i = 0; i < this.a.size(); ++i) {
                if (((l)this.a.get(i)).a.b > l.a.b) {
                    this.a.add(i, l);
                    return;
                }
            }
            this.a.add(l);
        }
        
        public final void b(final m m) {
            if (m.a == null) {
                return;
            }
            if (this.a == null) {
                this.a = new ArrayList(m.a.size());
            }
            final Iterator iterator = m.a.iterator();
            while (iterator.hasNext()) {
                this.a((l)iterator.next());
            }
        }
        
        @Override
        public final String toString() {
            if (this.a == null) {
                return "";
            }
            final StringBuilder sb = new StringBuilder();
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                sb.append(((l)iterator.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }
    
    public static final class n
    {
        public ArrayList a;
        public int b;
        
        public n() {
            this.a = null;
            this.b = 0;
        }
        
        public final void a() {
            this.b += 1000;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                sb.append(iterator.next());
                sb.append(' ');
            }
            sb.append('[');
            return d.j(sb, this.b, ']');
        }
    }
    
    public static final class o
    {
        public CSSParser$Combinator a;
        public String b;
        public ArrayList c;
        public ArrayList d;
        
        public o(CSSParser$Combinator descendant, final String b) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            if (descendant == null) {
                descendant = CSSParser$Combinator.DESCENDANT;
            }
            this.a = descendant;
            this.b = b;
        }
        
        public final void a(final String s, final CSSParser$AttribOp cssParser$AttribOp, final String s2) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(new b(s, cssParser$AttribOp, s2));
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            final CSSParser$Combinator a = this.a;
            if (a == CSSParser$Combinator.CHILD) {
                sb.append("> ");
            }
            else if (a == CSSParser$Combinator.FOLLOWS) {
                sb.append("+ ");
            }
            String b;
            if ((b = this.b) == null) {
                b = "*";
            }
            sb.append(b);
            final ArrayList c = this.c;
            if (c != null) {
                for (final b b2 : c) {
                    sb.append('[');
                    sb.append(b2.a);
                    final int n = CSSParser$a.a[((Enum)b2.b).ordinal()];
                    if (n != 1) {
                        if (n != 2) {
                            if (n == 3) {
                                sb.append("|=");
                                sb.append(b2.c);
                            }
                        }
                        else {
                            sb.append("~=");
                            sb.append(b2.c);
                        }
                    }
                    else {
                        sb.append('=');
                        sb.append(b2.c);
                    }
                    sb.append(']');
                }
            }
            final ArrayList d = this.d;
            if (d != null) {
                for (final d d2 : d) {
                    sb.append(':');
                    sb.append(d2);
                }
            }
            return sb.toString();
        }
    }
}
