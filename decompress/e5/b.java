// 
// Decompiled by Procyon v0.6.0
// 

package e5;

import java.util.Arrays;
import q3.e;
import android.graphics.Color;
import android.graphics.Bitmap;
import java.util.ArrayList;
import android.util.SparseBooleanArray;
import java.util.List;

public final class b
{
    public static final b$a f;
    public final List<e> a;
    public final List<e5.d> b;
    public final b c;
    public final SparseBooleanArray d;
    public final e e;
    
    static {
        f = new c() {
            @Override
            public final boolean a(final float[] array) {
                final float n = array[2];
                boolean b = true;
                if (n < 0.95f && n > 0.05f) {
                    final float n2 = array[0];
                    if (n2 < 10.0f || n2 > 37.0f || array[1] > 0.82f) {
                        return b;
                    }
                }
                b = false;
                return b;
            }
        };
    }
    
    public b(final ArrayList a, final ArrayList b) {
        this.a = a;
        this.b = b;
        this.d = new SparseBooleanArray();
        this.c = new b();
        final int size = a.size();
        int n = Integer.MIN_VALUE;
        e e = null;
        int n2;
        for (int i = 0; i < size; ++i, n = n2) {
            final e e2 = this.a.get(i);
            final int e3 = e2.e;
            if (e3 > (n2 = n)) {
                e = e2;
                n2 = e3;
            }
        }
        this.e = e;
    }
    
    public static final class b
    {
        public final Bitmap a;
        public final ArrayList b;
        public int c;
        public int d;
        public int e;
        public final ArrayList f;
        
        public b(final Bitmap a) {
            final ArrayList b = new ArrayList();
            this.b = b;
            this.c = 16;
            this.d = 12544;
            this.e = -1;
            final ArrayList f = new ArrayList();
            this.f = f;
            if (a != null && !a.isRecycled()) {
                f.add(e5.b.f);
                this.a = a;
                b.add(e5.d.e);
                b.add(e5.d.f);
                b.add(e5.d.g);
                b.add(e5.d.h);
                b.add(e5.d.i);
                b.add(e5.d.j);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        
        public final e5.b a() {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                final int d = this.d;
                final double n = -1.0;
                double sqrt;
                if (d > 0) {
                    final int n2 = bitmap.getHeight() * bitmap.getWidth();
                    final int d2 = this.d;
                    sqrt = n;
                    if (n2 > d2) {
                        sqrt = Math.sqrt(d2 / (double)n2);
                    }
                }
                else {
                    sqrt = n;
                    if (this.e > 0) {
                        final int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
                        final int e = this.e;
                        sqrt = n;
                        if (max > e) {
                            sqrt = e / (double)max;
                        }
                    }
                }
                if (sqrt > 0.0) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int)Math.ceil(bitmap.getWidth() * sqrt), (int)Math.ceil(bitmap.getHeight() * sqrt), false);
                }
                final int width = bitmap.getWidth();
                final int height = bitmap.getHeight();
                final int[] array = new int[width * height];
                bitmap.getPixels(array, 0, width, 0, 0, width, height);
                final int c = this.c;
                c[] array2;
                if (this.f.isEmpty()) {
                    array2 = null;
                }
                else {
                    final ArrayList f = this.f;
                    array2 = f.toArray(new c[f.size()]);
                }
                final a a = new a(array, c, array2);
                if (bitmap != this.a) {
                    bitmap.recycle();
                }
                final ArrayList c2 = a.c;
                final ArrayList b = this.b;
                final e5.b b2 = new e5.b(c2, b);
                for (int size = b.size(), i = 0; i < size; ++i) {
                    final e5.d d3 = b2.b.get(i);
                    final int length = d3.c.length;
                    final float n3 = 0.0f;
                    int j = 0;
                    float n4 = 0.0f;
                    while (j < length) {
                        final float n5 = d3.c[j];
                        float n6 = n4;
                        if (n5 > 0.0f) {
                            n6 = n4 + n5;
                        }
                        ++j;
                        n4 = n6;
                    }
                    if (n4 != 0.0f) {
                        for (int length2 = d3.c.length, k = 0; k < length2; ++k) {
                            final float[] c3 = d3.c;
                            final float n7 = c3[k];
                            if (n7 > 0.0f) {
                                c3[k] = n7 / n4;
                            }
                        }
                    }
                    final j0.b c4 = b2.c;
                    final int size2 = b2.a.size();
                    int l = 0;
                    float n8 = 0.0f;
                    e e2 = null;
                    float n9 = n3;
                    while (l < size2) {
                        final e e3 = b2.a.get(l);
                        final float[] b3 = e3.b();
                        final float n10 = b3[1];
                        final float[] a2 = d3.a;
                        boolean b5 = false;
                        Label_0579: {
                            if (n10 >= a2[0] && n10 <= a2[2]) {
                                final float n11 = b3[2];
                                final float[] b4 = d3.b;
                                if (n11 >= b4[0] && n11 <= b4[2] && !b2.d.get(e3.d)) {
                                    b5 = true;
                                    break Label_0579;
                                }
                            }
                            b5 = false;
                        }
                        float n12 = n9;
                        e e4 = e2;
                        float n13 = n8;
                        Label_0803: {
                            if (b5) {
                                final float[] b6 = e3.b();
                                final e e5 = b2.e;
                                int e6;
                                if (e5 != null) {
                                    e6 = e5.e;
                                }
                                else {
                                    e6 = 1;
                                }
                                final float n14 = d3.c[0];
                                float n15;
                                if (n14 > n9) {
                                    n15 = (1.0f - Math.abs(b6[1] - d3.a[1])) * n14;
                                }
                                else {
                                    n15 = n9;
                                }
                                final float n16 = d3.c[1];
                                float n17;
                                if (n16 > n9) {
                                    n17 = (1.0f - Math.abs(b6[2] - d3.b[1])) * n16;
                                }
                                else {
                                    n17 = 0.0f;
                                }
                                final float n18 = d3.c[2];
                                final float n19 = 0.0f;
                                float n20;
                                if (n18 > 0.0f) {
                                    n20 = e3.e / (float)e6 * n18;
                                }
                                else {
                                    n20 = 0.0f;
                                }
                                final float n21 = n15 + n17 + n20;
                                if (e2 != null) {
                                    n12 = n19;
                                    e4 = e2;
                                    n13 = n8;
                                    if (n21 <= n8) {
                                        break Label_0803;
                                    }
                                }
                                n13 = n21;
                                e4 = e3;
                                n12 = n19;
                            }
                        }
                        ++l;
                        n9 = n12;
                        e2 = e4;
                        n8 = n13;
                    }
                    if (e2 != null && d3.d) {
                        b2.d.append(e2.d, true);
                    }
                    c4.put((Object)d3, (Object)e2);
                }
                b2.d.clear();
                return b2;
            }
            throw new AssertionError();
        }
    }
    
    public interface c
    {
        boolean a(final float[] p0);
    }
    
    public interface d
    {
    }
    
    public static final class e
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public boolean f;
        public int g;
        public int h;
        public float[] i;
        
        public e(final int d, final int e) {
            this.a = Color.red(d);
            this.b = Color.green(d);
            this.c = Color.blue(d);
            this.d = d;
            this.e = e;
        }
        
        public final void a() {
            if (!this.f) {
                final int f = q3.e.f(4.5f, -1, this.d);
                final int f2 = q3.e.f(3.0f, -1, this.d);
                if (f != -1 && f2 != -1) {
                    this.h = q3.e.h(-1, f);
                    this.g = q3.e.h(-1, f2);
                    this.f = true;
                    return;
                }
                final int f3 = q3.e.f(4.5f, -16777216, this.d);
                final int f4 = q3.e.f(3.0f, -16777216, this.d);
                if (f3 != -1 && f4 != -1) {
                    this.h = q3.e.h(-16777216, f3);
                    this.g = q3.e.h(-16777216, f4);
                    this.f = true;
                    return;
                }
                int h;
                if (f != -1) {
                    h = q3.e.h(-1, f);
                }
                else {
                    h = q3.e.h(-16777216, f3);
                }
                this.h = h;
                int g;
                if (f2 != -1) {
                    g = q3.e.h(-1, f2);
                }
                else {
                    g = q3.e.h(-16777216, f4);
                }
                this.g = g;
                this.f = true;
            }
        }
        
        public final float[] b() {
            if (this.i == null) {
                this.i = new float[3];
            }
            q3.e.a(this.a, this.b, this.c, this.i);
            return this.i;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && e.class == o.getClass()) {
                final e e = (e)o;
                if (this.e != e.e || this.d != e.d) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return this.d * 31 + this.e;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder(e.class.getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(this.d));
            sb.append(']');
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(this.b()));
            sb.append(']');
            sb.append(" [Population: ");
            sb.append(this.e);
            sb.append(']');
            sb.append(" [Title Text: #");
            this.a();
            sb.append(Integer.toHexString(this.g));
            sb.append(']');
            sb.append(" [Body Text: #");
            this.a();
            sb.append(Integer.toHexString(this.h));
            sb.append(']');
            return sb.toString();
        }
    }
}
