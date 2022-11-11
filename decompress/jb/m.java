// 
// Decompiled by Procyon v0.6.0
// 

package jb;

import android.util.Log;
import ad.d0;
import cb.w$a;

public final class m
{
    public final boolean a;
    public final String b;
    public final w$a c;
    public final int d;
    public final byte[] e;
    
    public m(final boolean a, final String b, int d, final byte[] array, final int n, final int n2, final byte[] e) {
        final int n3 = 1;
        final int n4 = 0;
        d0.c(d == 0 ^ e == null);
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        int n5;
        if (b == null) {
            n5 = n3;
        }
        else {
            Label_0195: {
                switch (b.hashCode()) {
                    case 3049895: {
                        if (!b.equals("cens")) {
                            break;
                        }
                        d = 3;
                        break Label_0195;
                    }
                    case 3049879: {
                        if (!b.equals("cenc")) {
                            break;
                        }
                        d = 2;
                        break Label_0195;
                    }
                    case 3046671: {
                        if (!b.equals("cbcs")) {
                            break;
                        }
                        d = 1;
                        break Label_0195;
                    }
                    case 3046605: {
                        d = n4;
                        if (!b.equals("cbc1")) {
                            break;
                        }
                        break Label_0195;
                    }
                }
                d = -1;
            }
            n5 = n3;
            switch (d) {
                default: {
                    final StringBuilder sb = new StringBuilder(b.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(b);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    Log.w("TrackEncryptionBox", sb.toString());
                    n5 = n3;
                    break;
                }
                case 0:
                case 1: {
                    n5 = 2;
                }
                case 2:
                case 3: {
                    break;
                }
            }
        }
        this.c = new w$a(n5, array, n, n2);
    }
}
