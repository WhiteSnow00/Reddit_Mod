// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import android.util.Log;
import al0.f0;
import com.google.android.exoplayer2.ParserException;
import ad.r;

public final class a
{
    public static final int[] a;
    public static final int[] b;
    
    static {
        a = new int[] { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
        b = new int[] { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
    }
    
    public static byte[] a(final int n, final int n2) {
        final int n3 = 0;
        int n4 = 0;
        int n5 = -1;
        while (true) {
            final int[] a = xa.a.a;
            if (n4 >= 13) {
                break;
            }
            if (n == a[n4]) {
                n5 = n4;
            }
            ++n4;
        }
        int n6 = -1;
        int n7 = n3;
        while (true) {
            final int[] b = xa.a.b;
            if (n7 >= 16) {
                break;
            }
            if (n2 == b[n7]) {
                n6 = n7;
            }
            ++n7;
        }
        if (n != -1 && n6 != -1) {
            return b(2, n5, n6);
        }
        final StringBuilder sb = new StringBuilder(67);
        sb.append("Invalid sample rate or number of channels: ");
        sb.append(n);
        sb.append(", ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static byte[] b(final int n, final int n2, final int n3) {
        return new byte[] { (byte)((n << 3 & 0xF8) | (n2 >> 1 & 0x7)), (byte)((n2 << 7 & 0x80) | (n3 << 3 & 0x78)) };
    }
    
    public static int c(final r r) throws ParserException {
        final int g = r.g(4);
        int g2;
        if (g == 15) {
            g2 = r.g(24);
        }
        else {
            if (g >= 13) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            g2 = xa.a.a[g];
        }
        return g2;
    }
    
    public static a d(final r r, final boolean b) throws ParserException {
        int g;
        if ((g = r.g(5)) == 31) {
            g = r.g(6) + 32;
        }
        int c = c(r);
        final int g2 = r.g(4);
        final String f = f0.f(19, "mp4a.40.", g);
        int n = 0;
        int g3 = 0;
        Label_0123: {
            if (g != 5) {
                n = g;
                g3 = g2;
                if (g != 29) {
                    break Label_0123;
                }
            }
            final int c2 = c(r);
            int g4;
            if ((g4 = r.g(5)) == 31) {
                g4 = r.g(6) + 32;
            }
            n = g4;
            c = c2;
            g3 = g2;
            if (g4 == 22) {
                g3 = r.g(4);
                c = c2;
                n = g4;
            }
        }
        if (b) {
            if (n != 1 && n != 2 && n != 3 && n != 4 && n != 6 && n != 7 && n != 17) {
                switch (n) {
                    default: {
                        final StringBuilder sb = new StringBuilder(42);
                        sb.append("Unsupported audio object type: ");
                        sb.append(n);
                        throw ParserException.createForUnsupportedContainerFeature(sb.toString());
                    }
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23: {
                        break;
                    }
                }
            }
            if (r.f()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (r.f()) {
                r.m(14);
            }
            final boolean f2 = r.f();
            if (g3 == 0) {
                throw new UnsupportedOperationException();
            }
            if (n == 6 || n == 20) {
                r.m(3);
            }
            if (f2) {
                if (n == 22) {
                    r.m(16);
                }
                if (n == 17 || n == 19 || n == 20 || n == 23) {
                    r.m(3);
                }
                r.m(1);
            }
            switch (n) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23: {
                    final int g5 = r.g(2);
                    if (g5 != 2 && g5 != 3) {
                        break;
                    }
                    final StringBuilder sb2 = new StringBuilder(33);
                    sb2.append("Unsupported epConfig: ");
                    sb2.append(g5);
                    throw ParserException.createForUnsupportedContainerFeature(sb2.toString());
                }
            }
        }
        final int n2 = xa.a.b[g3];
        if (n2 != -1) {
            return new a(c, n2, f);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        public final String c;
        
        public a(final int a, final int b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
