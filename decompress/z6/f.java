// 
// Decompiled by Procyon v0.6.0
// 

package z6;

import android.graphics.drawable.Drawable;
import x6.j;
import android.graphics.Typeface;
import y6.k;
import java.util.ArrayList;
import java.util.Arrays;
import t6.o;
import q6.g0;
import d7.c;
import android.graphics.Path;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.Canvas;
import com.airbnb.lottie.model.DocumentData$Justification;
import j6.g;
import x6.b;
import com.airbnb.lottie.model.DocumentData;
import java.util.List;
import com.airbnb.lottie.model.layer.Layer;
import t6.d;
import t6.r;
import q6.h;
import com.airbnb.lottie.LottieDrawable;
import t6.p;
import java.util.HashMap;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.a;

public final class f extends a
{
    public final StringBuilder C;
    public final RectF D;
    public final Matrix E;
    public final f$a F;
    public final f$b G;
    public final HashMap H;
    public final j0.f<String> I;
    public final p J;
    public final LottieDrawable K;
    public final h L;
    public t6.a<Integer, Integer> M;
    public r N;
    public t6.a<Integer, Integer> O;
    public r P;
    public d Q;
    public r R;
    public d S;
    public r T;
    public r U;
    public r V;
    
    public f(final LottieDrawable k, final Layer layer) {
        super(k, layer);
        this.C = new StringBuilder(2);
        this.D = new RectF();
        this.E = new Matrix();
        this.F = new f$a();
        this.G = new f$b();
        this.H = new HashMap();
        this.I = (j0.f<String>)new j0.f();
        this.K = k;
        this.L = layer.b;
        final p j = new p((List<d7.a<DocumentData>>)((j)layer.q).b);
        ((t6.a)(this.J = j)).a((t6.a.a)this);
        this.c((t6.a<?, ?>)j);
        final g r = layer.r;
        if (r != null) {
            final x6.a a = (x6.a)r.f;
            if (a != null) {
                (this.M = a.a()).a((t6.a.a)this);
                this.c(this.M);
            }
        }
        if (r != null) {
            final x6.a a2 = (x6.a)r.g;
            if (a2 != null) {
                (this.O = a2.a()).a((t6.a.a)this);
                this.c(this.O);
            }
        }
        if (r != null) {
            final b b = (b)r.h;
            if (b != null) {
                final t6.a a3 = b.a();
                this.Q = (d)a3;
                a3.a((t6.a.a)this);
                this.c((t6.a<?, ?>)this.Q);
            }
        }
        if (r != null) {
            final b b2 = (b)r.i;
            if (b2 != null) {
                final t6.a a4 = b2.a();
                this.S = (d)a4;
                a4.a((t6.a.a)this);
                this.c((t6.a<?, ?>)this.S);
            }
        }
    }
    
    public static void t(final DocumentData$Justification documentData$Justification, final Canvas canvas, final float n) {
        final int n2 = f$c.a[((Enum)documentData$Justification).ordinal()];
        if (n2 != 2) {
            if (n2 == 3) {
                canvas.translate(-n / 2.0f, 0.0f);
            }
        }
        else {
            canvas.translate(-n, 0.0f);
        }
    }
    
    public static void u(final String s, final Paint paint, final Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint$Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(s, 0, s.length(), 0.0f, 0.0f, paint);
    }
    
    public static void v(final Path path, final Paint paint, final Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint$Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }
    
    @Override
    public final void a(final d7.c c, final Object o) {
        super.a(c, o);
        if (o == g0.a) {
            final r n = this.N;
            if (n != null) {
                this.p((t6.a<?, ?>)n);
            }
            if (c == null) {
                this.N = null;
            }
            else {
                ((t6.a)(this.N = new r(c, (Object)null))).a((t6.a.a)this);
                this.c((t6.a<?, ?>)this.N);
            }
        }
        else if (o == g0.b) {
            final r p2 = this.P;
            if (p2 != null) {
                this.p((t6.a<?, ?>)p2);
            }
            if (c == null) {
                this.P = null;
            }
            else {
                ((t6.a)(this.P = new r(c, (Object)null))).a((t6.a.a)this);
                this.c((t6.a<?, ?>)this.P);
            }
        }
        else if (o == g0.s) {
            final r r = this.R;
            if (r != null) {
                this.p((t6.a<?, ?>)r);
            }
            if (c == null) {
                this.R = null;
            }
            else {
                ((t6.a)(this.R = new r(c, (Object)null))).a((t6.a.a)this);
                this.c((t6.a<?, ?>)this.R);
            }
        }
        else if (o == g0.t) {
            final r t = this.T;
            if (t != null) {
                this.p((t6.a<?, ?>)t);
            }
            if (c == null) {
                this.T = null;
            }
            else {
                ((t6.a)(this.T = new r(c, (Object)null))).a((t6.a.a)this);
                this.c((t6.a<?, ?>)this.T);
            }
        }
        else if (o == g0.F) {
            final r u = this.U;
            if (u != null) {
                this.p((t6.a<?, ?>)u);
            }
            if (c == null) {
                this.U = null;
            }
            else {
                ((t6.a)(this.U = new r(c, (Object)null))).a((t6.a.a)this);
                this.c((t6.a<?, ?>)this.U);
            }
        }
        else if (o == g0.M) {
            final r v = this.V;
            if (v != null) {
                this.p((t6.a<?, ?>)v);
            }
            if (c == null) {
                this.V = null;
            }
            else {
                ((t6.a)(this.V = new r(c, (Object)null))).a((t6.a.a)this);
                this.c((t6.a<?, ?>)this.V);
            }
        }
        else if (o == g0.O) {
            final p j = this.J;
            j.getClass();
            ((t6.a)j).k((d7.c)new o(new d7.b(), c, new DocumentData()));
        }
    }
    
    @Override
    public final void b(final RectF rectF, final Matrix matrix, final boolean b) {
        super.b(rectF, matrix, b);
        rectF.set(0.0f, 0.0f, (float)this.L.j.width(), (float)this.L.j.height());
    }
    
    @Override
    public final void k(final Canvas canvas, final Matrix matrix, int i) {
        canvas.save();
        if (this.K.f.g.h() > 0) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i == 0) {
            canvas.concat(matrix);
        }
        final DocumentData documentData = ((t6.a<K, DocumentData>)this.J).f();
        final w6.b b = this.L.e.get(documentData.b);
        if (b == null) {
            canvas.restore();
            return;
        }
        final r n = this.N;
        if (n != null) {
            ((Paint)this.F).setColor((int)n.f());
        }
        else {
            final t6.a<Integer, Integer> m = this.M;
            if (m != null) {
                ((Paint)this.F).setColor((int)m.f());
            }
            else {
                ((Paint)this.F).setColor(documentData.h);
            }
        }
        final r p3 = this.P;
        if (p3 != null) {
            ((Paint)this.G).setColor((int)p3.f());
        }
        else {
            final t6.a<Integer, Integer> o = this.O;
            if (o != null) {
                ((Paint)this.G).setColor((int)o.f());
            }
            else {
                ((Paint)this.G).setColor(documentData.i);
            }
        }
        final t6.a<Integer, Integer> j = super.w.j;
        if (j == null) {
            i = 100;
        }
        else {
            i = j.f();
        }
        i = i * 255 / 100;
        ((Paint)this.F).setAlpha(i);
        ((Paint)this.G).setAlpha(i);
        final r r = this.R;
        if (r != null) {
            ((Paint)this.G).setStrokeWidth((float)r.f());
        }
        else {
            final d q = this.Q;
            if (q != null) {
                ((Paint)this.G).setStrokeWidth((float)((t6.a<K, Float>)q).f());
            }
            else {
                ((Paint)this.G).setStrokeWidth(c7.g.c() * documentData.j * c7.g.d(matrix));
            }
        }
        if (this.K.f.g.h() > 0) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i != 0) {
            final r u = this.U;
            float n2;
            if (u != null) {
                n2 = (float)u.f();
            }
            else {
                n2 = documentData.c;
            }
            final float n3 = n2 / 100.0f;
            final float d = c7.g.d(matrix);
            final String a = documentData.a;
            final float n4 = c7.g.c() * documentData.f;
            final List<String> list = Arrays.asList(a.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
            int size;
            String s;
            float n5;
            int k;
            int n6;
            w6.c c;
            int l;
            w6.c c2;
            List<?> list2;
            List a2;
            int size2;
            ArrayList list3;
            int n7;
            int n8;
            Path t0;
            float n9;
            float c3;
            float n10;
            r t2;
            float n11;
            d s2;
            float n12 = 0.0f;
            for (size = list.size(), i = 0; i < size; size = i, i = n6) {
                s = list.get(i);
                n5 = 0.0f;
                k = 0;
                n6 = i;
                while (k < s.length()) {
                    i = w6.c.a(s.charAt(k), b.a, b.b);
                    c = (w6.c)this.L.g.f(i, (Integer)null);
                    if (c != null) {
                        n5 += (float)(c.c * n3 * c7.g.c() * d);
                    }
                    ++k;
                }
                canvas.save();
                t(documentData.d, canvas, n5);
                canvas.translate(0.0f, n6 * n4 - (size - 1) * n4 / 2.0f);
                l = 0;
                i = size;
                while (l < s.length()) {
                    c2 = (w6.c)this.L.g.f(w6.c.a(s.charAt(l), b.a, b.b), (Integer)null);
                    if (c2 != null) {
                        if (this.H.containsKey(c2)) {
                            list2 = this.H.get(c2);
                        }
                        else {
                            a2 = c2.a;
                            size2 = a2.size();
                            list3 = new ArrayList<s6.d>(size2);
                            for (n7 = 0; n7 < size2; ++n7) {
                                list3.add(new s6.d(this.K, this, (k)a2.get(n7)));
                            }
                            this.H.put(c2, list3);
                            list2 = list3;
                        }
                        for (n8 = 0; n8 < list2.size(); ++n8) {
                            t0 = ((s6.d)list2.get(n8)).T0();
                            t0.computeBounds(this.D, false);
                            this.E.set(matrix);
                            this.E.preTranslate(0.0f, -documentData.g * c7.g.c());
                            this.E.preScale(n3, n3);
                            t0.transform(this.E);
                            if (documentData.k) {
                                v(t0, (Paint)this.F, canvas);
                                v(t0, (Paint)this.G, canvas);
                            }
                            else {
                                v(t0, (Paint)this.G, canvas);
                                v(t0, (Paint)this.F, canvas);
                            }
                        }
                        n9 = (float)c2.c;
                        c3 = c7.g.c();
                        n10 = documentData.e / 10.0f;
                        t2 = this.T;
                        Label_1107: {
                            if (t2 != null) {
                                n11 = (float)t2.f();
                            }
                            else {
                                s2 = this.S;
                                n12 = n10;
                                if (s2 == null) {
                                    break Label_1107;
                                }
                                n11 = ((t6.a<K, Float>)s2).f();
                            }
                            n12 = n10 + n11;
                        }
                        canvas.translate(n12 * d + c3 * (n9 * n3) * d, 0.0f);
                    }
                    ++l;
                }
                canvas.restore();
                ++n6;
            }
        }
        else {
            final r v = this.V;
            Typeface typeface = null;
            Label_1452: {
                if (v != null) {
                    typeface = (Typeface)v.f();
                    if (typeface != null) {
                        break Label_1452;
                    }
                }
                final LottieDrawable k2 = this.K;
                final String a3 = b.a;
                final String b2 = b.b;
                v6.a p4;
                if (((Drawable)k2).getCallback() == null) {
                    p4 = null;
                }
                else {
                    if (k2.p == null) {
                        k2.p = new v6.a(((Drawable)k2).getCallback());
                    }
                    p4 = k2.p;
                }
                if (p4 != null) {
                    final w6.h a4 = p4.a;
                    a4.g = a3;
                    a4.h = b2;
                    typeface = (Typeface)p4.b.get(a4);
                    if (typeface == null) {
                        typeface = (Typeface)p4.c.get(a3);
                        if (typeface == null) {
                            final StringBuilder q2 = d.q("fonts/", a3);
                            q2.append(p4.e);
                            typeface = Typeface.createFromAsset(p4.d, q2.toString());
                            p4.c.put(a3, typeface);
                        }
                        final boolean contains = b2.contains("Italic");
                        final boolean contains2 = b2.contains("Bold");
                        if (contains && contains2) {
                            i = 3;
                        }
                        else if (contains) {
                            i = 2;
                        }
                        else if (contains2) {
                            i = 1;
                        }
                        else {
                            i = 0;
                        }
                        if (typeface.getStyle() != i) {
                            typeface = Typeface.create(typeface, i);
                        }
                        p4.b.put(p4.a, typeface);
                    }
                }
                else {
                    typeface = null;
                }
                if (typeface == null) {
                    typeface = b.c;
                }
            }
            if (typeface != null) {
                final String a5 = documentData.a;
                this.K.getClass();
                ((Paint)this.F).setTypeface(typeface);
                final r u2 = this.U;
                float n13;
                if (u2 != null) {
                    n13 = (float)u2.f();
                }
                else {
                    n13 = documentData.c;
                }
                ((Paint)this.F).setTextSize(c7.g.c() * n13);
                ((Paint)this.G).setTypeface(((Paint)this.F).getTypeface());
                ((Paint)this.G).setTextSize(((Paint)this.F).getTextSize());
                final float n14 = c7.g.c() * documentData.f;
                final float n15 = documentData.e / 10.0f;
                final r t3 = this.T;
                float n17 = 0.0f;
                Label_1639: {
                    float n16;
                    if (t3 != null) {
                        n16 = (float)t3.f();
                    }
                    else {
                        final d s3 = this.S;
                        n17 = n15;
                        if (s3 == null) {
                            break Label_1639;
                        }
                        n16 = ((t6.a<K, Float>)s3).f();
                    }
                    n17 = n15 + n16;
                }
                final float n18 = c7.g.c() * n17 * n13 / 100.0f;
                final List<String> list4 = Arrays.asList(a5.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
                for (int size3 = list4.size(), n19 = 0; n19 < size3; ++n19) {
                    final String s4 = list4.get(n19);
                    final float measureText = ((Paint)this.G).measureText(s4);
                    final float n20 = (float)(s4.length() - 1);
                    canvas.save();
                    t(documentData.d, canvas, n20 * n18 + measureText);
                    canvas.translate(0.0f, n19 * n14 - (size3 - 1) * n14 / 2.0f);
                    i = 0;
                    while (i < s4.length()) {
                        int codePoint;
                        int n21;
                        int codePoint2;
                        for (codePoint = s4.codePointAt(i), n21 = Character.charCount(codePoint) + i; n21 < s4.length(); n21 += Character.charCount(codePoint2), codePoint = codePoint * 31 + codePoint2) {
                            codePoint2 = s4.codePointAt(n21);
                            if (Character.getType(codePoint2) != 16 && Character.getType(codePoint2) != 27 && Character.getType(codePoint2) != 6 && Character.getType(codePoint2) != 28 && Character.getType(codePoint2) != 8 && Character.getType(codePoint2) != 19) {
                                break;
                            }
                        }
                        final j0.f<String> i2 = this.I;
                        final long n22 = codePoint;
                        if (i2.f) {
                            i2.d();
                        }
                        String string;
                        if (aa1.a.H(i2.i, n22, i2.g) >= 0) {
                            string = (String)this.I.e(n22, (Long)null);
                        }
                        else {
                            this.C.setLength(0);
                            int codePoint3;
                            for (int n23 = i; n23 < n21; n23 += Character.charCount(codePoint3)) {
                                codePoint3 = s4.codePointAt(n23);
                                this.C.appendCodePoint(codePoint3);
                            }
                            string = this.C.toString();
                            this.I.g(n22, (Object)string);
                        }
                        i += string.length();
                        if (documentData.k) {
                            u(string, (Paint)this.F, canvas);
                            u(string, (Paint)this.G, canvas);
                        }
                        else {
                            u(string, (Paint)this.G, canvas);
                            u(string, (Paint)this.F, canvas);
                        }
                        canvas.translate(((Paint)this.F).measureText(string) + n18, 0.0f);
                    }
                    canvas.restore();
                }
            }
        }
        canvas.restore();
    }
}
