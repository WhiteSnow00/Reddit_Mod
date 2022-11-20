// 
// Decompiled by Procyon v0.6.0
// 

package com.caverock.androidsvg;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Stack;
import android.graphics.Picture;
import java.io.IOException;
import android.util.Log;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.HashMap;

public final class SVG
{
    public SVG.SVG$d0 a;
    public float b;
    public CSSParser.m c;
    public HashMap d;
    
    public SVG() {
        this.a = null;
        this.b = 96.0f;
        this.c = new CSSParser.m();
        this.d = new HashMap();
    }
    
    public static SVG.SVG$j0 b(final h0 h0, final String s) {
        final SVG.SVG$j0 svg$j0 = (SVG.SVG$j0)h0;
        if (s.equals(svg$j0.c)) {
            return svg$j0;
        }
        for (final l0 l0 : h0.h()) {
            if (!(l0 instanceof SVG.SVG$j0)) {
                continue;
            }
            final SVG.SVG$j0 svg$j2 = (SVG.SVG$j0)l0;
            if (s.equals(svg$j2.c)) {
                return svg$j2;
            }
            if (!(l0 instanceof h0)) {
                continue;
            }
            final SVG.SVG$j0 b = b((h0)l0, s);
            if (b != null) {
                return b;
            }
        }
        return null;
    }
    
    public static SVG d(ByteArrayInputStream byteArrayInputStream) throws SVGParseException {
        final SVGParser svgParser = new SVGParser();
        InputStream inputStream = byteArrayInputStream;
        if (!byteArrayInputStream.markSupported()) {
            inputStream = new BufferedInputStream(byteArrayInputStream);
        }
        while (true) {
            try {
                inputStream.mark(3);
                final int read = inputStream.read();
                final int read2 = inputStream.read();
                inputStream.reset();
                byteArrayInputStream = (ByteArrayInputStream)inputStream;
                if (read + (read2 << 8) == 35615) {
                    byteArrayInputStream = (ByteArrayInputStream)new BufferedInputStream(new GZIPInputStream(inputStream));
                }
                try {
                    byteArrayInputStream.mark(4096);
                    svgParser.F(byteArrayInputStream);
                    return svgParser.a;
                }
                finally {
                    try {
                        byteArrayInputStream.close();
                    }
                    catch (final IOException ex) {
                        Log.e("SVGParser", "Exception thrown closing input stream");
                    }
                }
            }
            catch (final IOException ex2) {
                byteArrayInputStream = (ByteArrayInputStream)inputStream;
                continue;
            }
            break;
        }
    }
    
    public final b a(float a) {
        final SVG.SVG$d0 a2 = this.a;
        final o s = a2.s;
        final o t = a2.t;
        if (s != null && !s.h()) {
            final Unit g = s.g;
            final Unit percent = Unit.percent;
            if (g != percent) {
                final Unit em = Unit.em;
                if (g != em) {
                    final Unit ex = Unit.ex;
                    if (g != ex) {
                        final float a3 = s.a(a);
                        if (t != null) {
                            if (!t.h()) {
                                final Unit g2 = t.g;
                                if (g2 != percent && g2 != em) {
                                    if (g2 != ex) {
                                        a = t.a(a);
                                        return new b(0.0f, 0.0f, a3, a);
                                    }
                                }
                            }
                            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
                        }
                        final b p = ((SVG.SVG$p0)this.a).p;
                        if (p != null) {
                            a = p.d * a3 / p.c;
                        }
                        else {
                            a = a3;
                        }
                        return new b(0.0f, 0.0f, a3, a);
                    }
                }
            }
        }
        return new b(-1.0f, -1.0f, -1.0f, -1.0f);
    }
    
    public final SVG.SVG$j0 c(final String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        if (s.equals(((SVG.SVG$j0)this.a).c)) {
            return (SVG.SVG$j0)this.a;
        }
        if (this.d.containsKey(s)) {
            return this.d.get(s);
        }
        final SVG.SVG$j0 b = b((h0)this.a, s);
        this.d.put(s, b);
        return b;
    }
    
    public final Picture e(int n, int n2, final a a) {
        final Picture picture = new Picture();
        final Canvas beginRecording = picture.beginRecording(n, n2);
        a a2 = null;
        Label_0076: {
            if (a != null) {
                a2 = a;
                if (a.e != null) {
                    break Label_0076;
                }
            }
            a a3;
            if (a == null) {
                a3 = new a();
            }
            else {
                a3 = new a(a);
            }
            a3.e = new b(0.0f, 0.0f, (float)n, (float)n2);
            a2 = a3;
        }
        final com.caverock.androidsvg.b b = new com.caverock.androidsvg.b(beginRecording, this.b);
        b.c = this;
        final SVG.SVG$d0 a4 = this.a;
        final int n3 = 0;
        Label_0712: {
            if (a4 == null) {
                Log.w("SVGAndroidRenderer", String.format("Nothing to render. Document is empty.", new Object[0]));
            }
            else {
                final String d = a2.d;
                if (d != null) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                Object p3;
                PreserveAspectRatio preserveAspectRatio;
                if (n != 0) {
                    final SVG.SVG$j0 c = this.c(d);
                    if (c == null || !(c instanceof SVG.SVG$c1)) {
                        Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", a2.d));
                        break Label_0712;
                    }
                    final SVG.SVG$c1 svg$c1 = (SVG.SVG$c1)c;
                    p3 = ((SVG.SVG$p0)svg$c1).p;
                    if (p3 == null) {
                        Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", a2.d));
                        break Label_0712;
                    }
                    preserveAspectRatio = ((SVG.SVG$n0)svg$c1).o;
                }
                else {
                    Object o = a2.c;
                    if (o != null) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (n == 0) {
                        o = ((SVG.SVG$p0)a4).p;
                    }
                    p3 = o;
                    preserveAspectRatio = a2.b;
                    if (preserveAspectRatio != null) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (n == 0) {
                        preserveAspectRatio = ((SVG.SVG$n0)a4).o;
                    }
                }
                final CSSParser.m a5 = a2.a;
                Label_0361: {
                    if (a5 != null) {
                        final ArrayList a6 = a5.a;
                        if (a6 != null) {
                            n = a6.size();
                        }
                        else {
                            n = 0;
                        }
                        if (n > 0) {
                            n = 1;
                            break Label_0361;
                        }
                    }
                    n = 0;
                }
                if (n != 0) {
                    this.c.b(a2.a);
                }
                b.d = new com.caverock.androidsvg.b.h();
                b.e = new Stack<com.caverock.androidsvg.b.h>();
                b.S(b.d, Style.a());
                final com.caverock.androidsvg.b.h d2 = b.d;
                d2.f = null;
                d2.h = false;
                b.e.push(new com.caverock.androidsvg.b.h(d2));
                b.g = new Stack<Matrix>();
                b.f = new Stack<h0>();
                final Boolean d3 = ((SVG.SVG$j0)a4).d;
                if (d3 != null) {
                    b.d.h = d3;
                }
                b.P();
                final b b2 = new b(a2.e);
                final o s = a4.s;
                if (s != null) {
                    b2.c = s.c(b, b2.c);
                }
                final o t = a4.t;
                if (t != null) {
                    b2.d = t.c(b, b2.d);
                }
                b.G(a4, b2, (b)p3, preserveAspectRatio);
                b.O();
                final CSSParser.m a7 = a2.a;
                n2 = n3;
                if (a7 != null) {
                    final ArrayList a8 = a7.a;
                    if (a8 != null) {
                        n = a8.size();
                    }
                    else {
                        n = 0;
                    }
                    n2 = n3;
                    if (n > 0) {
                        n2 = 1;
                    }
                }
                if (n2 != 0) {
                    final CSSParser.m c2 = this.c;
                    final CSSParser$Source renderOptions = CSSParser$Source.RenderOptions;
                    final ArrayList a9 = c2.a;
                    if (a9 != null) {
                        final Iterator iterator = a9.iterator();
                        while (iterator.hasNext()) {
                            if (((CSSParser.l)iterator.next()).c == renderOptions) {
                                iterator.remove();
                            }
                        }
                    }
                }
            }
        }
        picture.endRecording();
        return picture;
    }
    
    public final Picture f(final a a) {
        final int n = 1;
        Object o = null;
        Label_0044: {
            if (a != null) {
                o = a.c;
                if (o != null) {
                    break Label_0044;
                }
            }
            o = ((SVG.SVG$p0)this.a).p;
        }
        if (a != null) {
            final b e = a.e;
            int n2;
            if (e != null) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                return this.e((int)Math.ceil(e.a + e.c), (int)Math.ceil(e.b + e.d), a);
            }
        }
        final SVG.SVG$d0 a2 = this.a;
        final o s = a2.s;
        if (s != null) {
            final Unit g = s.g;
            final Unit percent = Unit.percent;
            if (g != percent) {
                final o t = a2.t;
                if (t != null && t.g != percent) {
                    return this.e((int)Math.ceil(s.a(this.b)), (int)Math.ceil(this.a.t.a(this.b)), a);
                }
            }
        }
        if (s != null && o != null) {
            final float a3 = s.a(this.b);
            return this.e((int)Math.ceil(a3), (int)Math.ceil(((b)o).d * a3 / ((b)o).c), a);
        }
        final o t2 = a2.t;
        if (t2 != null && o != null) {
            final float a4 = t2.a(this.b);
            return this.e((int)Math.ceil(((b)o).c * a4 / ((b)o).d), (int)Math.ceil(a4), a);
        }
        return this.e(512, 512, a);
    }
    
    public final SVG.SVG$j0 g(String replace) {
        if (replace == null) {
            return null;
        }
        String s;
        if (replace.startsWith("\"") && replace.endsWith("\"")) {
            s = replace.substring(1, replace.length() - 1).replace("\\\"", "\"");
        }
        else {
            s = replace;
            if (replace.startsWith("'")) {
                s = replace;
                if (replace.endsWith("'")) {
                    s = replace.substring(1, replace.length() - 1).replace("\\'", "'");
                }
            }
        }
        replace = s.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() > 1 && replace.startsWith("#")) {
            return this.c(replace.substring(1));
        }
        return null;
    }
    
    public enum GradientSpread
    {
        private static final GradientSpread[] $VALUES;
        
        pad, 
        reflect, 
        repeat;
    }
    
    public static final class Style implements Cloneable
    {
        public Boolean A;
        public c B;
        public String C;
        public String D;
        public String E;
        public Boolean F;
        public Boolean G;
        public m0 H;
        public Float I;
        public String J;
        public FillRule K;
        public String L;
        public m0 M;
        public Float N;
        public m0 O;
        public Float P;
        public VectorEffect Q;
        public RenderQuality R;
        public long f;
        public m0 g;
        public FillRule h;
        public Float i;
        public m0 j;
        public Float k;
        public o l;
        public LineCap m;
        public LineJoin n;
        public Float o;
        public o[] p;
        public o q;
        public Float r;
        public SVG$f s;
        public List<String> t;
        public o u;
        public Integer v;
        public FontStyle w;
        public TextDecoration x;
        public TextDirection y;
        public TextAnchor z;
        
        public Style() {
            this.f = 0L;
        }
        
        public static Style a() {
            final Style style = new Style();
            style.f = -1L;
            final SVG$f g = SVG$f.g;
            style.g = (m0)g;
            final FillRule nonZero = FillRule.NonZero;
            style.h = nonZero;
            final Float value = 1.0f;
            style.i = value;
            style.j = null;
            style.k = value;
            style.l = new o(1.0f);
            style.m = LineCap.Butt;
            style.n = LineJoin.Miter;
            style.o = 4.0f;
            style.p = null;
            style.q = new o(0.0f);
            style.r = value;
            style.s = g;
            style.t = null;
            style.u = new o(12.0f, Unit.pt);
            style.v = 400;
            style.w = FontStyle.Normal;
            style.x = TextDecoration.None;
            style.y = TextDirection.LTR;
            style.z = TextAnchor.Start;
            final Boolean true = Boolean.TRUE;
            style.A = true;
            style.B = null;
            style.C = null;
            style.D = null;
            style.E = null;
            style.F = true;
            style.G = true;
            style.H = (m0)g;
            style.I = value;
            style.J = null;
            style.K = nonZero;
            style.L = null;
            style.M = null;
            style.N = value;
            style.O = null;
            style.P = value;
            style.Q = VectorEffect.None;
            style.R = RenderQuality.auto;
            return style;
        }
        
        public final Object clone() throws CloneNotSupportedException {
            final Style style = (Style)super.clone();
            final o[] p = this.p;
            if (p != null) {
                style.p = p.clone();
            }
            return style;
        }
        
        public enum FillRule
        {
            private static final FillRule[] $VALUES;
            
            EvenOdd, 
            NonZero;
        }
        
        public enum FontStyle
        {
            private static final FontStyle[] $VALUES;
            
            Italic, 
            Normal, 
            Oblique;
        }
        
        public enum LineCap
        {
            private static final LineCap[] $VALUES;
            
            Butt, 
            Round, 
            Square;
        }
        
        public enum LineJoin
        {
            private static final LineJoin[] $VALUES;
            
            Bevel, 
            Miter, 
            Round;
        }
        
        public enum RenderQuality
        {
            private static final RenderQuality[] $VALUES;
            
            auto, 
            optimizeQuality, 
            optimizeSpeed;
        }
        
        public enum TextAnchor
        {
            private static final TextAnchor[] $VALUES;
            
            End, 
            Middle, 
            Start;
        }
        
        public enum TextDecoration
        {
            private static final TextDecoration[] $VALUES;
            
            Blink, 
            LineThrough, 
            None, 
            Overline, 
            Underline;
        }
        
        public enum TextDirection
        {
            private static final TextDirection[] $VALUES;
            
            LTR, 
            RTL;
        }
        
        public enum VectorEffect
        {
            private static final VectorEffect[] $VALUES;
            
            NonScalingStroke, 
            None;
        }
    }
    
    public enum Unit
    {
        private static final Unit[] $VALUES;
        
        cm, 
        em, 
        ex, 
        in, 
        mm, 
        pc, 
        percent, 
        pt, 
        px;
    }
    
    public static final class b
    {
        public float a;
        public float b;
        public float c;
        public float d;
        
        public b(final float a, final float b, final float c, final float d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public b(final b b) {
            this.a = b.a;
            this.b = b.b;
            this.c = b.c;
            this.d = b.d;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("[");
            t.append(this.a);
            t.append(" ");
            t.append(this.b);
            t.append(" ");
            t.append(this.c);
            t.append(" ");
            t.append(this.d);
            t.append("]");
            return t.toString();
        }
    }
    
    public static final class c
    {
        public o a;
        public o b;
        public o c;
        public o d;
        
        public c(final o a, final o b, final o c, final o d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public interface e0
    {
        String a();
        
        void c(final HashSet p0);
        
        Set<String> d();
        
        Set<String> e();
        
        void f(final HashSet p0);
        
        Set<String> g();
        
        void i(final HashSet p0);
        
        void k(final HashSet p0);
        
        void l(final String p0);
        
        Set<String> n();
    }
    
    public abstract static class f0 extends SVG$i0 implements h0, e0
    {
        public List<l0> i;
        public Set<String> j;
        public String k;
        public Set<String> l;
        public Set<String> m;
        public Set<String> n;
        
        public f0() {
            this.i = new ArrayList<l0>();
            this.j = null;
            this.k = null;
            this.m = null;
            this.n = null;
        }
        
        public final String a() {
            return this.k;
        }
        
        public final void c(final HashSet m) {
            this.m = m;
        }
        
        public final Set<String> d() {
            return this.m;
        }
        
        public final Set<String> e() {
            return null;
        }
        
        public final void f(final HashSet j) {
            this.j = j;
        }
        
        public final Set<String> g() {
            return this.j;
        }
        
        public final List<l0> h() {
            return this.i;
        }
        
        public final void i(final HashSet l) {
            this.l = l;
        }
        
        public void j(final l0 l0) throws SVGParseException {
            this.i.add(l0);
        }
        
        public final void k(final HashSet n) {
            this.n = n;
        }
        
        public final void l(final String k) {
            this.k = k;
        }
        
        public final Set<String> n() {
            return this.n;
        }
    }
    
    public abstract static class g0 extends SVG$i0 implements e0
    {
        public Set<String> i;
        public String j;
        public Set<String> k;
        public Set<String> l;
        public Set<String> m;
        
        public g0() {
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
        }
        
        public final String a() {
            return this.j;
        }
        
        public final void c(final HashSet l) {
            this.l = l;
        }
        
        public final Set<String> d() {
            return this.l;
        }
        
        public final Set<String> e() {
            return this.k;
        }
        
        public final void f(final HashSet i) {
            this.i = i;
        }
        
        public final Set<String> g() {
            return this.i;
        }
        
        public final void i(final HashSet k) {
            this.k = k;
        }
        
        public final void k(final HashSet m) {
            this.m = m;
        }
        
        public final void l(final String j) {
            this.j = j;
        }
        
        public final Set<String> n() {
            return this.m;
        }
    }
    
    public interface h0
    {
        List<l0> h();
        
        void j(final l0 p0) throws SVGParseException;
    }
    
    public static final class k0 extends SVG$j
    {
        public o m;
        public o n;
        public o o;
        public o p;
        
        public final String o() {
            return "linearGradient";
        }
    }
    
    public static class l0
    {
        public SVG a;
        public h0 b;
        
        public String o() {
            return "";
        }
    }
    
    public interface m
    {
        void m(final Matrix p0);
    }
    
    public abstract static class m0 implements Cloneable
    {
    }
    
    public static final class o implements Cloneable
    {
        public float f;
        public Unit g;
        
        public o(final float f) {
            this.f = f;
            this.g = Unit.px;
        }
        
        public o(final float f, final Unit g) {
            this.f = f;
            this.g = g;
        }
        
        public final float a(final float n) {
            final int n2 = SVG$a.a[this.g.ordinal()];
            if (n2 == 1) {
                return this.f;
            }
            switch (n2) {
                default: {
                    return this.f;
                }
                case 8: {
                    return this.f * n / 6.0f;
                }
                case 7: {
                    return this.f * n / 72.0f;
                }
                case 6: {
                    return this.f * n / 25.4f;
                }
                case 5: {
                    return this.f * n / 2.54f;
                }
                case 4: {
                    return this.f * n;
                }
            }
        }
        
        public final float b(final com.caverock.androidsvg.b b) {
            if (this.g != Unit.percent) {
                return this.e(b);
            }
            final com.caverock.androidsvg.b.h d = b.d;
            b b2 = d.g;
            if (b2 == null) {
                b2 = d.f;
            }
            if (b2 == null) {
                return this.f;
            }
            float c = b2.c;
            final float d2 = b2.d;
            float n;
            if (c == d2) {
                n = this.f;
            }
            else {
                c = (float)(Math.sqrt(d2 * d2 + c * c) / 1.414213562373095);
                n = this.f;
            }
            return n * c / 100.0f;
        }
        
        public final float c(final com.caverock.androidsvg.b b, final float n) {
            if (this.g == Unit.percent) {
                return this.f * n / 100.0f;
            }
            return this.e(b);
        }
        
        public final float e(final com.caverock.androidsvg.b b) {
            float n = 0.0f;
            float n2 = 0.0f;
            switch (SVG$a.a[this.g.ordinal()]) {
                default: {
                    return this.f;
                }
                case 9: {
                    final com.caverock.androidsvg.b.h d = b.d;
                    b b2 = d.g;
                    if (b2 == null) {
                        b2 = d.f;
                    }
                    if (b2 == null) {
                        return this.f;
                    }
                    n = this.f * b2.c;
                    n2 = 100.0f;
                    break;
                }
                case 8: {
                    n = b.b * this.f;
                    n2 = 6.0f;
                    break;
                }
                case 7: {
                    n = b.b * this.f;
                    n2 = 72.0f;
                    break;
                }
                case 6: {
                    n = b.b * this.f;
                    n2 = 25.4f;
                    break;
                }
                case 5: {
                    n = b.b * this.f;
                    n2 = 2.54f;
                    break;
                }
                case 4: {
                    return this.f * b.b;
                }
                case 3: {
                    return b.d.d.getTextSize() / 2.0f * this.f;
                }
                case 2: {
                    return b.d.d.getTextSize() * this.f;
                }
                case 1: {
                    return this.f;
                }
            }
            return n / n2;
        }
        
        public final float f(final com.caverock.androidsvg.b b) {
            if (this.g != Unit.percent) {
                return this.e(b);
            }
            final com.caverock.androidsvg.b.h d = b.d;
            b b2 = d.g;
            if (b2 == null) {
                b2 = d.f;
            }
            if (b2 == null) {
                return this.f;
            }
            return this.f * b2.d / 100.0f;
        }
        
        public final boolean g() {
            return this.f < 0.0f;
        }
        
        public final boolean h() {
            return this.f == 0.0f;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(this.f));
            sb.append(this.g);
            return sb.toString();
        }
    }
    
    public static final class o0 extends SVG$j
    {
        public o m;
        public o n;
        public o o;
        public o p;
        public o q;
        
        public final String o() {
            return "radialGradient";
        }
    }
    
    public interface s
    {
    }
    
    public interface v0
    {
        z0 b();
    }
    
    public interface w
    {
        void a(final float p0, final float p1);
        
        void b(final float p0, final float p1);
        
        void c(final float p0, final float p1, final float p2, final float p3, final float p4, final float p5);
        
        void close();
        
        void d(final float p0, final float p1, final float p2, final float p3);
        
        void e(final float p0, final float p1, final float p2, final boolean p3, final boolean p4, final float p5, final float p6);
    }
    
    public interface z0
    {
    }
}
