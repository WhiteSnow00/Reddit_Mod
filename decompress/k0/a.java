// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import sg2.e;

public final class a
{
    public static final float[] a;
    
    static {
        final float[] array = a = new float[101];
        final float[] array2 = new float[101];
        float n = 0.0f;
        int i = 0;
        float n2 = 0.0f;
        while (i < 100) {
            final float n3 = i / (float)100;
            float n4 = 1.0f;
            float n5;
            float n6;
            float n7;
            float n8;
            while (true) {
                n5 = (n4 - n) / 2.0f + n;
                n6 = 1.0f - n5;
                n7 = n5 * 3.0f * n6;
                n8 = n5 * n5 * n5;
                final float n9 = (n5 * 0.35000002f + n6 * 0.175f) * n7 + n8;
                if (Math.abs(n9 - n3) < 1.0E-5) {
                    break;
                }
                if (n9 > n3) {
                    n4 = n5;
                }
                else {
                    n = n5;
                }
            }
            array[i] = (n6 * 0.5f + n5) * n7 + n8;
            float n10 = 1.0f;
            float n11;
            float n12;
            float n13;
            float n14;
            while (true) {
                n11 = (n10 - n2) / 2.0f + n2;
                n12 = 1.0f - n11;
                n13 = n11 * 3.0f * n12;
                n14 = n11 * n11 * n11;
                final float n15 = (n12 * 0.5f + n11) * n13 + n14;
                if (Math.abs(n15 - n3) < 1.0E-5) {
                    break;
                }
                if (n15 > n3) {
                    n10 = n11;
                }
                else {
                    n2 = n11;
                }
            }
            array2[i] = (n11 * 0.35000002f + n12 * 0.175f) * n13 + n14;
            ++i;
        }
        array[100] = 1.0f;
    }
    
    public static a a(float n) {
        final float n2 = 100;
        final int n3 = (int)(n2 * n);
        float n9;
        if (n3 < 100) {
            final float n4 = n3 / n2;
            final int n5 = n3 + 1;
            final float n6 = n5 / n2;
            final float[] a = k0.a.a;
            final float n7 = a[n3];
            final float n8 = (a[n5] - n7) / (n6 - n4);
            final float b = a.b(n, n4, n8, n7);
            n = n8;
            n9 = b;
        }
        else {
            n9 = 1.0f;
            n = 0.0f;
        }
        return new a(n9, n);
    }
    
    public static final class a
    {
        public final float a;
        public final float b;
        
        public a(final float a, final float b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("FlingResult(distanceCoefficient=");
            r.append(this.a);
            r.append(", velocityCoefficient=");
            return b.h(r, this.b, ')');
        }
    }
}
