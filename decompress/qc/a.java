// 
// Decompiled by Procyon v0.6.0
// 

package qc;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;
import java.util.Collections;
import nc.a$a;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.Arrays;
import java.util.ArrayList;
import bd.c0;
import nc.f;
import java.util.zip.Inflater;
import bd.s;
import nc.e;

public final class a extends e
{
    public final s m;
    public final s n;
    public final a.a$a o;
    public Inflater p;
    
    public a() {
        this.m = new s();
        this.n = new s();
        this.o = new a.a$a();
    }
    
    @Override
    public final f g(final byte[] array, int i, final boolean b) throws SubtitleDecoderException {
        this.m.z(i, array);
        final s m = this.m;
        final int c = m.c;
        final int b2 = m.b;
        i = 255;
        if (c - b2 > 0 && (m.a[b2] & 0xFF) == 0x78) {
            if (this.p == null) {
                this.p = new Inflater();
            }
            if (c0.G(m, this.n, this.p)) {
                final s n = this.n;
                m.z(n.c, n.a);
            }
        }
        final a.a$a o = this.o;
        o.d = 0;
        o.e = 0;
        o.f = 0;
        o.g = 0;
        o.h = 0;
        o.i = 0;
        o.a.y(0);
        o.c = false;
        final ArrayList<nc.a> list = new ArrayList<nc.a>();
        while (true) {
            final s j = this.m;
            final int c2 = j.c;
            if (c2 - j.b < 3) {
                break;
            }
            final a.a$a o2 = this.o;
            final int r = j.r();
            final int w = j.w();
            final int n2 = j.b + w;
            nc.a a;
            if (n2 > c2) {
                j.B(c2);
                a = null;
            }
            else {
                s s;
                if (r != 128) {
                    switch (r) {
                        case 22: {
                            o2.getClass();
                            if (w < 19) {
                                break;
                            }
                            o2.d = j.w();
                            o2.e = j.w();
                            j.C(11);
                            o2.f = j.w();
                            o2.g = j.w();
                            break;
                        }
                        case 21: {
                            o2.getClass();
                            if (w < 4) {
                                break;
                            }
                            j.C(3);
                            final boolean b3 = (0x80 & j.r()) != 0x0;
                            int n4;
                            final int n3 = n4 = w - 4;
                            if (b3) {
                                if (n3 < 7) {
                                    break;
                                }
                                final int t = j.t();
                                if (t < 4) {
                                    break;
                                }
                                o2.h = j.w();
                                o2.i = j.w();
                                o2.a.y(t - 4);
                                n4 = n3 - 7;
                            }
                            final s a2 = o2.a;
                            final int b4 = a2.b;
                            final int c3 = a2.c;
                            if (b4 < c3 && n4 > 0) {
                                final int min = Math.min(n4, c3 - b4);
                                j.b(b4, min, o2.a.a);
                                o2.a.B(b4 + min);
                                break;
                            }
                            break;
                        }
                        case 20: {
                            o2.getClass();
                            if (w % 5 != 2) {
                                break;
                            }
                            j.C(2);
                            Arrays.fill(o2.b, 0);
                            for (int n5 = w / 5, k = 0; k < n5; ++k) {
                                i = j.r();
                                final int r2 = j.r();
                                final int r3 = j.r();
                                final int r4 = j.r();
                                final int r5 = j.r();
                                final double n6 = r2;
                                final double n7 = r3 - 128;
                                final int n8 = (int)(1.402 * n7 + n6);
                                final double n9 = r4 - 128;
                                o2.b[i] = (c0.i((int)(n6 - 0.34414 * n9 - n7 * 0.71414), 0, 255) << 8 | (c0.i(n8, 0, 255) << 16 | r5 << 24) | c0.i((int)(n9 * 1.772 + n6), 0, 255));
                                i = 255;
                            }
                            o2.c = true;
                            break;
                        }
                    }
                    final nc.a a3 = null;
                    s = j;
                    a = a3;
                }
                else {
                    s = j;
                    final int n10 = i;
                    Label_1142: {
                        if (o2.d != 0 && o2.e != 0 && o2.h != 0 && o2.i != 0) {
                            final s a4 = o2.a;
                            i = a4.c;
                            if (i != 0 && a4.b == i) {
                                if (o2.c) {
                                    a4.B(0);
                                    final int n11 = o2.h * o2.i;
                                    final int[] array2 = new int[n11];
                                    i = 0;
                                    while (i < n11) {
                                        final int r6 = o2.a.r();
                                        if (r6 != 0) {
                                            final int n12 = i + 1;
                                            array2[i] = o2.b[r6];
                                            i = n12;
                                        }
                                        else {
                                            final int r7 = o2.a.r();
                                            if (r7 == 0) {
                                                continue;
                                            }
                                            int n13;
                                            if ((r7 & 0x40) == 0x0) {
                                                n13 = (r7 & 0x3F);
                                            }
                                            else {
                                                n13 = ((r7 & 0x3F) << 8 | o2.a.r());
                                            }
                                            int n14;
                                            if ((r7 & 0x80) == 0x0) {
                                                n14 = 0;
                                            }
                                            else {
                                                n14 = o2.b[o2.a.r()];
                                            }
                                            final int n15 = n13 + i;
                                            Arrays.fill(array2, i, n15, n14);
                                            i = n15;
                                        }
                                    }
                                    final Bitmap bitmap = Bitmap.createBitmap(array2, o2.h, o2.i, Bitmap$Config.ARGB_8888);
                                    final a$a a$a = new a$a();
                                    a$a.b = bitmap;
                                    final float n16 = (float)o2.f;
                                    final float n17 = (float)o2.d;
                                    a$a.h = n16 / n17;
                                    a$a.i = 0;
                                    final float n18 = (float)o2.g;
                                    final float n19 = (float)o2.e;
                                    a$a.e = n18 / n19;
                                    a$a.f = 0;
                                    a$a.g = 0;
                                    a$a.l = o2.h / n17;
                                    a$a.m = o2.i / n19;
                                    a = a$a.a();
                                    break Label_1142;
                                }
                            }
                        }
                        a = null;
                    }
                    o2.d = 0;
                    o2.e = 0;
                    o2.f = 0;
                    o2.g = 0;
                    o2.h = 0;
                    o2.i = 0;
                    o2.a.y(0);
                    o2.c = false;
                    i = n10;
                }
                s.B(n2);
            }
            if (a == null) {
                continue;
            }
            list.add(a);
        }
        return (f)new b(Collections.unmodifiableList((List<?>)list), 0);
    }
}
