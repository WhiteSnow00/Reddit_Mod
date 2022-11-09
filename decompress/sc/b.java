// 
// Decompiled by Procyon v0.6.0
// 

package sc;

import mk2.e;
import android.text.TextUtils;
import bd.d0;

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
    
    public static b a(String o) {
        d0.c(o.startsWith("Format:"));
        final String[] split = TextUtils.split(o.substring(7), ",");
        final int n2;
        int n = n2 = -1;
        int n4;
        final int n3 = n4 = n2;
        final int n5 = 0;
        int n6 = n3;
        int n7 = n2;
        for (int i = n5; i < split.length; ++i) {
            o = e.O(split[i].trim());
            o.getClass();
            int n8 = 0;
            Label_0187: {
                switch (o) {
                    case "style": {
                        n8 = 3;
                        break Label_0187;
                    }
                    case "start": {
                        n8 = 2;
                        break Label_0187;
                    }
                    case "text": {
                        n8 = 1;
                        break Label_0187;
                    }
                    case "end": {
                        n8 = 0;
                        break Label_0187;
                    }
                    default:
                        break;
                }
                n8 = -1;
            }
            switch (n8) {
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
                    n7 = i;
                    break;
                }
            }
        }
        b b;
        if (n != -1 && n7 != -1 && n4 != -1) {
            b = new b(n, n7, n6, n4, split.length);
        }
        else {
            b = null;
        }
        return b;
    }
}
