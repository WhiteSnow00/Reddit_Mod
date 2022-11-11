// 
// Decompiled by Procyon v0.6.0
// 

package e5;

import java.util.Iterator;
import java.util.Arrays;
import java.util.PriorityQueue;
import q3.e;
import android.graphics.Color;
import java.util.Comparator;
import java.util.ArrayList;

public final class a
{
    public static final a$a f;
    public final int[] a;
    public final int[] b;
    public final ArrayList c;
    public final e5.b.c[] d;
    public final float[] e;
    
    static {
        f = new Comparator<b>() {
            @Override
            public final int compare(final Object o, final Object o2) {
                final b b = (b)o;
                final b b2 = (b)o2;
                return (b2.i - b2.h + 1) * ((b2.g - b2.f + 1) * (b2.e - b2.d + 1)) - (b.i - b.h + 1) * ((b.g - b.f + 1) * (b.e - b.d + 1));
            }
        };
    }
    
    public a(int[] a, int i, final e5.b.c[] d) {
        this.e = new float[3];
        this.d = d;
        final int[] b = new int[32768];
        this.b = b;
        final int n = 0;
        for (int j = 0; j < a.length; ++j) {
            final int n2 = a[j];
            final int n3 = b(Color.blue(n2), 8, 5) | (b(Color.red(n2), 8, 5) << 10 | b(Color.green(n2), 8, 5) << 5);
            b[a[j] = n3] = b[n3] + 1;
        }
        int n4;
        int n5;
        for (int k = n4 = 0; k < 32768; ++k, n4 = n5) {
            if (b[k] > 0) {
                final int rgb = Color.rgb(b(k >> 10 & 0x1F, 5, 8), b(k >> 5 & 0x1F, 5, 8), b(k & 0x1F, 5, 8));
                final float[] e = this.e;
                final ThreadLocal a2 = q3.e.a;
                q3.e.a(Color.red(rgb), Color.green(rgb), Color.blue(rgb), e);
                final float[] e2 = this.e;
                final e5.b.c[] d2 = this.d;
                boolean b2 = false;
                Label_0276: {
                    if (d2 != null && d2.length > 0) {
                        for (int length = d2.length, l = 0; l < length; ++l) {
                            if (!this.d[l].a(e2)) {
                                b2 = true;
                                break Label_0276;
                            }
                        }
                    }
                    b2 = false;
                }
                if (b2) {
                    b[k] = 0;
                }
            }
            n5 = n4;
            if (b[k] > 0) {
                n5 = n4 + 1;
            }
        }
        a = new int[n4];
        this.a = a;
        int n7;
        int n8;
        for (int n6 = n7 = 0; n6 < 32768; ++n6, n7 = n8) {
            n8 = n7;
            if (b[n6] > 0) {
                a[n7] = n6;
                n8 = n7 + 1;
            }
        }
        if (n4 <= i) {
            this.c = new ArrayList();
            int n9;
            for (i = n; i < n4; ++i) {
                n9 = a[i];
                this.c.add(new e5.b.e(Color.rgb(b(n9 >> 10 & 0x1F, 5, 8), b(n9 >> 5 & 0x1F, 5, 8), b(n9 & 0x1F, 5, 8)), b[n9]));
            }
        }
        else {
            final PriorityQueue<b> priorityQueue = new PriorityQueue<b>(i, (Comparator<? super b>)e5.a.f);
            priorityQueue.offer(new b(0, this.a.length - 1));
            while (priorityQueue.size() < i) {
                final b b3 = priorityQueue.poll();
                if (b3 == null) {
                    break;
                }
                final int b4 = b3.b;
                final int a3 = b3.a;
                if (b4 + 1 - a3 <= 1) {
                    break;
                }
                if (b4 + 1 - a3 <= 1) {
                    throw new IllegalStateException("Can not split a box with only 1 color");
                }
                final int n10 = b3.e - b3.d;
                final int n11 = b3.g - b3.f;
                final int n12 = b3.i - b3.h;
                int n13;
                if (n10 >= n11 && n10 >= n12) {
                    n13 = -3;
                }
                else if (n11 >= n10 && n11 >= n12) {
                    n13 = -2;
                }
                else {
                    n13 = -1;
                }
                final a m = b3.j;
                final int[] a4 = m.a;
                final int[] b5 = m.b;
                a(n13, a3, b4, a4);
                Arrays.sort(a4, b3.a, b3.b + 1);
                a(n13, b3.a, b3.b, a4);
                final int n14 = b3.c / 2;
                int a5 = b3.a;
                int n15 = 0;
                int b7;
                while (true) {
                    final int b6 = b3.b;
                    if (a5 > b6) {
                        b7 = b3.a;
                        break;
                    }
                    n15 += b5[a4[a5]];
                    if (n15 >= n14) {
                        b7 = Math.min(b6 - 1, a5);
                        break;
                    }
                    ++a5;
                }
                final b b8 = b3.j.new b(b7 + 1, b3.b);
                b3.b = b7;
                b3.a();
                priorityQueue.offer(b8);
                priorityQueue.offer(b3);
            }
            final ArrayList c = new ArrayList<e5.b.e>(priorityQueue.size());
            for (final b b9 : priorityQueue) {
                final a j2 = b9.j;
                final int[] a6 = j2.a;
                final int[] b10 = j2.b;
                int a7 = b9.a;
                int n16 = i = 0;
                int n18;
                int n17 = n18 = i;
                while (a7 <= b9.b) {
                    final int n19 = a6[a7];
                    final int n20 = b10[n19];
                    i += n20;
                    n16 += (n19 >> 10 & 0x1F) * n20;
                    n17 += (n19 >> 5 & 0x1F) * n20;
                    n18 += n20 * (n19 & 0x1F);
                    ++a7;
                }
                final float n21 = (float)n16;
                final float n22 = (float)i;
                final e5.b.e e3 = new e5.b.e(Color.rgb(b(Math.round(n21 / n22), 5, 8), b(Math.round(n17 / n22), 5, 8), b(Math.round(n18 / n22), 5, 8)), i);
                final float[] b11 = e3.b();
                final e5.b.c[] d3 = this.d;
                Label_1155: {
                    if (d3 != null && d3.length > 0) {
                        int length2;
                        for (length2 = d3.length, i = 0; i < length2; ++i) {
                            if (!this.d[i].a(b11)) {
                                i = 1;
                                break Label_1155;
                            }
                        }
                    }
                    i = 0;
                }
                if (i == 0) {
                    c.add(e3);
                }
            }
            this.c = c;
        }
    }
    
    public static void a(int n, int i, final int n2, final int[] array) {
        int j = i;
        if (n != -2) {
            if (n == -1) {
                while (i <= n2) {
                    n = array[i];
                    array[i] = ((n >> 10 & 0x1F) | ((n & 0x1F) << 10 | (n >> 5 & 0x1F) << 5));
                    ++i;
                }
            }
        }
        else {
            while (j <= n2) {
                n = array[j];
                array[j] = ((n & 0x1F) | ((n >> 5 & 0x1F) << 10 | (n >> 10 & 0x1F) << 5));
                ++j;
            }
        }
    }
    
    public static int b(int n, final int n2, final int n3) {
        if (n3 > n2) {
            n <<= n3 - n2;
        }
        else {
            n >>= n2 - n3;
        }
        return n & (1 << n3) - 1;
    }
    
    public final class b
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public final /* synthetic */ a j;
        
        public b(final int a, final int b) {
            this.a = a;
            this.b = b;
            this.a();
        }
        
        public final void a() {
            final a j = e5.a.this;
            final int[] a = j.a;
            final int[] b = j.b;
            final int a2 = this.a;
            int d = Integer.MAX_VALUE;
            int e = Integer.MIN_VALUE;
            int i;
            final int n = i = e;
            int c = 0;
            final int n2;
            int f = n2 = Integer.MAX_VALUE;
            int g = n;
            int h = n2;
            int n4;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            for (int k = a2; k <= this.b; ++k, d = n9, f = n11, h = n13, e = n8, g = n10, i = n12, c = n4) {
                final int n3 = a[k];
                n4 = c + b[n3];
                final int n5 = n3 >> 10 & 0x1F;
                final int n6 = n3 >> 5 & 0x1F;
                final int n7 = n3 & 0x1F;
                if (n5 > (n8 = e)) {
                    n8 = n5;
                }
                if (n5 < (n9 = d)) {
                    n9 = n5;
                }
                if (n6 > (n10 = g)) {
                    n10 = n6;
                }
                if (n6 < (n11 = f)) {
                    n11 = n6;
                }
                if (n7 > (n12 = i)) {
                    n12 = n7;
                }
                if (n7 < (n13 = h)) {
                    n13 = n7;
                }
            }
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.c = c;
        }
    }
}
