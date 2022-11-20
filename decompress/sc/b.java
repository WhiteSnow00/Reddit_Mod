// 
// Decompiled by Procyon v0.6.0
// 

package sc;

import android.text.TextUtils;

public final class b
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    public b(final int a, final int b, final int c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static b a(final String s) {
        ah0.b.C(s.startsWith("Format:"));
        final String[] split = TextUtils.split(s.substring(7), ",");
        int n = -1;
        int n2 = -1;
        int n4;
        final int n3 = n4 = n2;
        final int n5 = 0;
        int n6 = n3;
        for (int i = n5; i < split.length; ++i) {
            final String p = zd.b.p1(split[i].trim());
            p.getClass();
            int n7 = 0;
            Label_0182: {
                switch (p) {
                    case "style": {
                        n7 = 3;
                        break Label_0182;
                    }
                    case "start": {
                        n7 = 2;
                        break Label_0182;
                    }
                    case "text": {
                        n7 = 1;
                        break Label_0182;
                    }
                    case "end": {
                        n7 = 0;
                        break Label_0182;
                    }
                    default:
                        break;
                }
                n7 = -1;
            }
            switch (n7) {
                case 3: {
                    n6 = i;
                    break;
                }
                case 2: {
                    n = i;
                    break;
                }
                case 1: {
                    n4 = i;
                    break;
                }
                case 0: {
                    n2 = i;
                    break;
                }
            }
        }
        b b;
        if (n != -1 && n2 != -1 && n4 != -1) {
            b = new b(n, n2, n6, n4, split.length);
        }
        else {
            b = null;
        }
        return b;
    }
}
