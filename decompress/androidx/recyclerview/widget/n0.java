// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.View;

public final class n0
{
    public final b a;
    public a b;
    
    public n0(final b a) {
        this.a = a;
        this.b = new a();
    }
    
    public final View a(int i, final int n, final int n2, final int n3) {
        final int a = this.a.a();
        final int b = this.a.b();
        int n4;
        if (n > i) {
            n4 = 1;
        }
        else {
            n4 = -1;
        }
        View view = null;
        while (i != n) {
            final View c = this.a.c(i);
            final int d = this.a.d(c);
            final int e = this.a.e(c);
            final a b2 = this.b;
            b2.b = a;
            b2.c = b;
            b2.d = d;
            b2.e = e;
            if (n2 != 0) {
                b2.a = (n2 | 0x0);
                if (b2.a()) {
                    return c;
                }
            }
            View view2 = view;
            if (n3 != 0) {
                final a b3 = this.b;
                b3.a = (n3 | 0x0);
                view2 = view;
                if (b3.a()) {
                    view2 = c;
                }
            }
            i += n4;
            view = view2;
        }
        return view;
    }
    
    public final boolean b(final View view) {
        final a b = this.b;
        final int a = this.a.a();
        final int b2 = this.a.b();
        final int d = this.a.d(view);
        final int e = this.a.e(view);
        b.b = a;
        b.c = b2;
        b.d = d;
        b.e = e;
        final a b3 = this.b;
        b3.a = (0x6003 | 0x0);
        return b3.a();
    }
    
    public static final class a
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        
        public a() {
            this.a = 0;
        }
        
        public final boolean a() {
            final int a = this.a;
            final int n = 2;
            if ((a & 0x7) != 0x0) {
                final int d = this.d;
                final int b = this.b;
                int n2;
                if (d > b) {
                    n2 = 1;
                }
                else if (d == b) {
                    n2 = 2;
                }
                else {
                    n2 = 4;
                }
                if ((n2 << 0 & a) == 0x0) {
                    return false;
                }
            }
            if ((a & 0x70) != 0x0) {
                final int d2 = this.d;
                final int c = this.c;
                int n3;
                if (d2 > c) {
                    n3 = 1;
                }
                else if (d2 == c) {
                    n3 = 2;
                }
                else {
                    n3 = 4;
                }
                if ((n3 << 4 & a) == 0x0) {
                    return false;
                }
            }
            if ((a & 0x700) != 0x0) {
                final int e = this.e;
                final int b2 = this.b;
                int n4;
                if (e > b2) {
                    n4 = 1;
                }
                else if (e == b2) {
                    n4 = 2;
                }
                else {
                    n4 = 4;
                }
                if ((n4 << 8 & a) == 0x0) {
                    return false;
                }
            }
            if ((a & 0x7000) != 0x0) {
                final int e2 = this.e;
                final int c2 = this.c;
                int n5;
                if (e2 > c2) {
                    n5 = 1;
                }
                else if (e2 == c2) {
                    n5 = n;
                }
                else {
                    n5 = 4;
                }
                if ((a & n5 << 12) == 0x0) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public interface b
    {
        int a();
        
        int b();
        
        View c(final int p0);
        
        int d(final View p0);
        
        int e(final View p0);
    }
}
