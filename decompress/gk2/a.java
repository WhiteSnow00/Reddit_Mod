// 
// Decompiled by Procyon v0.6.0
// 

package gk2;

import net.sourceforge.jaad.aac.syntax.ICSInfo;
import zj2.f;
import net.sourceforge.jaad.aac.syntax.b;

public final class a
{
    public boolean a;
    public int b;
    public boolean[] c;
    public a[] d;
    
    public a() {
        this.d = new a[672];
        for (int i = 0; i < this.d.length; ++i) {
            this.b(i);
        }
    }
    
    public static float c(final float n) {
        return Float.intBitsToFloat(Float.floatToIntBits(n) & 0xFFFF0000);
    }
    
    public final void a(final b b, final float[] array, final f f) {
        final ICSInfo d = b.d;
        final boolean b2 = d.b();
        int i = 0;
        final int n = 0;
        if (b2) {
            for (int j = n; j < this.d.length; ++j) {
                this.b(j);
            }
        }
        else {
            final int min = Math.min(f.c[0], d.h);
            final int[] s = d.s;
            while (i < min) {
                int n2 = s[i];
                int n3;
                while (true) {
                    n3 = i + 1;
                    if (n2 >= s[n3]) {
                        break;
                    }
                    final boolean b3 = this.c[i];
                    final a[] d2 = this.d;
                    if (d2[n2] == null) {
                        d2[n2] = new a();
                    }
                    final a a = d2[n2];
                    final float e = a.e;
                    final float f2 = a.f;
                    final float a2 = a.a;
                    final float b4 = a.b;
                    final float c = a.c;
                    final float d3 = a.d;
                    float n4;
                    if (c > 1.0f) {
                        final int floatToIntBits = Float.floatToIntBits(0.953125f / c);
                        n4 = Float.intBitsToFloat(floatToIntBits + 32767 + (floatToIntBits & 0x1) & 0xFFFF0000) * a2;
                    }
                    else {
                        n4 = 0.0f;
                    }
                    float n5;
                    if (d3 > 1.0f) {
                        final int floatToIntBits2 = Float.floatToIntBits(0.953125f / d3);
                        n5 = Float.intBitsToFloat(floatToIntBits2 + 32767 + (floatToIntBits2 & 0x1) & 0xFFFF0000) * b4;
                    }
                    else {
                        n5 = 0.0f;
                    }
                    final float n6 = n4 * e;
                    final float intBitsToFloat = Float.intBitsToFloat(Float.floatToIntBits(n5 * f2 + n6) + 32768 & 0xFFFF0000);
                    if (b3) {
                        array[n2] += intBitsToFloat * -9.765625E-4f;
                    }
                    final float n7 = array[n2] * -1024.0f;
                    final float n8 = n7 - n6;
                    a.b = c(f2 * n8 + b4 * 0.90625f);
                    a.d = c((n8 * n8 + f2 * f2) * 0.5f + d3 * 0.90625f);
                    a.a = c(e * n7 + a2 * 0.90625f);
                    a.c = c((n7 * n7 + e * e) * 0.5f + c * 0.90625f);
                    a.f = c((e - n4 * n7) * 0.953125f);
                    a.e = c(n7 * 0.953125f);
                    ++n2;
                }
                i = n3;
            }
            if (this.a) {
                for (int k = this.b - 1; k < this.d.length; k += 30) {
                    this.b(k);
                }
            }
        }
    }
    
    public final void b(final int n) {
        final a[] d = this.d;
        if (d[n] == null) {
            d[n] = new a();
        }
        final a a = d[n];
        a.e = 0.0f;
        a.f = 0.0f;
        a.a = 0.0f;
        a.b = 0.0f;
        a.c = 16256.0f;
        a.d = 16256.0f;
    }
    
    public static final class a
    {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        
        public a() {
            this.a = 0.0f;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 1.0f;
            this.f = 1.0f;
        }
    }
}
