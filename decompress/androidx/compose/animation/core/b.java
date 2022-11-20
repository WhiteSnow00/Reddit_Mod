// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation.core;

import mg2.l;
import l0.k;
import kotlin.Pair;
import vl.a;
import l0.d0;
import l0.u;

public final class b implements u
{
    public final float a;
    public final d0 b;
    
    public b() {
        this(0.0f, 0.0f, 7);
    }
    
    public b(final float g, final float n, final float a) {
        this.a = a;
        final d0 b = new d0();
        if (g < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        b.g = g;
        b.c = false;
        final double b2 = b.b;
        if ((float)(b2 * b2) > 0.0f) {
            b.b = Math.sqrt(n);
            b.c = false;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }
    
    public b(float n, float n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = 1.0f;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 1500.0f;
        }
        float n4;
        if ((n3 & 0x4) != 0x0) {
            n4 = 0.01f;
        }
        else {
            n4 = 0.0f;
        }
        this(n, n2, n4);
    }
    
    @Override
    public final long b(float n, float n2, final float n3) {
        final d0 b = this.b;
        final double b2 = b.b;
        final float n4 = (float)(b2 * b2);
        final float g = b.g;
        final float a = this.a;
        n = (n - n2) / a;
        n2 = n3 / a;
        final double n5 = n4;
        final double n6 = g;
        final double n7 = n2;
        final double n8 = n;
        final double n9 = 1.0f;
        final double n10 = n6 * 2.0 * Math.sqrt(n5);
        final double n11 = -n10;
        final double n12 = n10 * n10 - n5 * 4.0;
        final k v1 = vl.a.v1(n12);
        v1.a = (v1.a + n11) / 2.0;
        v1.b /= 2.0;
        final k v2 = vl.a.v1(n12);
        final double a2 = v2.a;
        final double n13 = -1;
        final double b3 = v2.b;
        v2.a = (a2 * n13 + n11) / 2.0;
        v2.b = b3 * n13 / 2.0;
        final Pair pair = new Pair((Object)v1, (Object)v2);
        final double n14 = dcmpg(n8, 0.0);
        long n15;
        if (n14 == 0 && n7 == 0.0) {
            n15 = 0L;
        }
        else {
            double n16 = n7;
            if (n14 < 0) {
                n16 = -n7;
            }
            final double abs = Math.abs(n8);
            double n17 = Double.MAX_VALUE;
            double max;
            if (n6 > 1.0) {
                final double a3 = ((k)pair.getFirst()).a;
                final double a4 = ((k)pair.getSecond()).a;
                final double n18 = a3 - a4;
                final double n19 = (a3 * abs - n16) / n18;
                final double n20 = abs - n19;
                max = Math.log(Math.abs(n9 / n20)) / a3;
                final double n21 = Math.log(Math.abs(n9 / n19)) / a4;
                if ((!Double.isInfinite(max) && !Double.isNaN(max)) ^ true) {
                    max = n21;
                }
                else if (!((!Double.isInfinite(n21) && !Double.isNaN(n21)) ^ true)) {
                    max = Math.max(max, n21);
                }
                final double n22 = n20 * a3;
                final double n23 = Math.log(n22 / (-n19 * a4)) / (a4 - a3);
                double n24 = 0.0;
                Label_0602: {
                    if (!Double.isNaN(n23)) {
                        if (n23 > 0.0) {
                            if (n23 <= 0.0 || -(Math.exp(n23 * a4) * n19 + Math.exp(a3 * n23) * n20) >= n9) {
                                max = Math.log(-(n19 * a4 * a4) / (n22 * a3)) / n18;
                                n24 = n9;
                                break Label_0602;
                            }
                            if (n19 > 0.0 && n20 < 0.0) {
                                max = 0.0;
                            }
                        }
                    }
                    n24 = -n9;
                }
                final SpringEstimationKt$estimateOverDamped$fn$1 springEstimationKt$estimateOverDamped$fn$1 = new SpringEstimationKt$estimateOverDamped$fn$1(n20, a3, n19, a4, n24);
                final SpringEstimationKt$estimateOverDamped$fnPrime$1 springEstimationKt$estimateOverDamped$fnPrime$1 = new SpringEstimationKt$estimateOverDamped$fnPrime$1(n20, a3, n19, a4);
                if (Math.abs(((Number)((l)springEstimationKt$estimateOverDamped$fn$1).invoke((Object)max)).doubleValue()) >= 1.0E-4) {
                    int n25 = 0;
                    double n26 = max;
                    while (true) {
                        max = n26;
                        if (n17 <= 0.001) {
                            break;
                        }
                        max = n26;
                        if (n25 >= 100) {
                            break;
                        }
                        ++n25;
                        final double n27 = n26 - ((Number)((l)springEstimationKt$estimateOverDamped$fn$1).invoke((Object)n26)).doubleValue() / ((Number)((l)springEstimationKt$estimateOverDamped$fnPrime$1).invoke((Object)n26)).doubleValue();
                        n17 = Math.abs(n26 - n27);
                        n26 = n27;
                    }
                }
            }
            else if (n6 < 1.0) {
                final double a5 = ((k)pair.getFirst()).a;
                final double n28 = (n16 - a5 * abs) / ((k)pair.getFirst()).b;
                max = Math.log(n9 / Math.sqrt(n28 * n28 + abs * abs)) / a5;
            }
            else {
                final double a6 = ((k)pair.getFirst()).a;
                final double n29 = a6 * abs;
                final double n30 = n16 - n29;
                final double n31 = Math.log(Math.abs(n9 / abs)) / a6;
                double log;
                final double n32 = log = Math.log(Math.abs(n9 / n30));
                for (int i = 0; i < 6; ++i) {
                    log = n32 - Math.log(Math.abs(log / a6));
                }
                double max2 = log / a6;
                if (!((!Double.isInfinite(n31) && !Double.isNaN(n31)) ^ true)) {
                    if ((!Double.isInfinite(max2) && !Double.isNaN(max2)) ^ true) {
                        max2 = n31;
                    }
                    else {
                        max2 = Math.max(n31, max2);
                    }
                }
                final double n33 = -(n29 + n30) / (a6 * n30);
                double n34 = max2;
                double n36 = 0.0;
                double n37 = 0.0;
                Label_1162: {
                    Label_1149: {
                        if (!Double.isNaN(n33)) {
                            if (n33 > 0.0) {
                                if (n33 > 0.0) {
                                    final double n35 = a6 * n33;
                                    if (-(Math.exp(n35) * (n33 * n30) + Math.exp(n35) * abs) < n9) {
                                        n34 = max2;
                                        if (n30 >= 0.0) {
                                            break Label_1149;
                                        }
                                        n34 = max2;
                                        if (abs > 0.0) {
                                            n34 = 0.0;
                                        }
                                        break Label_1149;
                                    }
                                }
                                n36 = -(2.0 / a6) - abs / n30;
                                n37 = n9;
                                break Label_1162;
                            }
                            n34 = max2;
                        }
                    }
                    final double n38 = -n9;
                    n36 = n34;
                    n37 = n38;
                }
                final SpringEstimationKt$estimateCriticallyDamped$fn$1 springEstimationKt$estimateCriticallyDamped$fn$1 = new SpringEstimationKt$estimateCriticallyDamped$fn$1(abs, n30, a6, n37);
                final SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 springEstimationKt$estimateCriticallyDamped$fnPrime$1 = new SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(n30, a6, abs);
                int n39 = 0;
                double n40 = n36;
                while (true) {
                    max = n40;
                    if (n17 <= 0.001) {
                        break;
                    }
                    max = n40;
                    if (n39 >= 100) {
                        break;
                    }
                    ++n39;
                    final double n41 = n40 - ((Number)((l)springEstimationKt$estimateCriticallyDamped$fn$1).invoke((Object)n40)).doubleValue() / ((Number)((l)springEstimationKt$estimateCriticallyDamped$fnPrime$1).invoke((Object)n40)).doubleValue();
                    n17 = Math.abs(n40 - n41);
                    n40 = n41;
                }
            }
            n15 = (long)(max * 1000.0);
        }
        return n15 * 1000000L;
    }
    
    @Override
    public final float c(final float n, final float a, final float n2, long n3) {
        n3 /= 1000000L;
        final d0 b = this.b;
        b.a = a;
        return Float.intBitsToFloat((int)(b.a(n, n2, n3) >> 32));
    }
    
    @Override
    public final float d(final float n, final float a, final float n2, long n3) {
        n3 /= 1000000L;
        final d0 b = this.b;
        b.a = a;
        return Float.intBitsToFloat((int)(b.a(n, n2, n3) & 0xFFFFFFFFL));
    }
    
    @Override
    public final float e(final float n, final float n2, final float n3) {
        return 0.0f;
    }
}
