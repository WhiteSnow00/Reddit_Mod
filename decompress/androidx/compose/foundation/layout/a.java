// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import u2.b;
import androidx.compose.ui.unit.LayoutDirection;
import zg2.p;
import ah2.f;

public final class a
{
    public static final a$i a;
    public static final a$c b;
    public static final a$j c;
    public static final a$a d;
    public static final a$b e;
    public static final a$g f;
    public static final a$f g;
    public static final a$e h;
    
    static {
        a = new a$i();
        b = new a$c();
        c = new a$j();
        d = new a$a();
        e = new a$b();
        f = new a$g();
        g = new a$f();
        h = new a$e();
    }
    
    public static void a(int i, final int[] array, final int[] array2, final boolean b) {
        ah2.f.f((Object)array, "size");
        ah2.f.f((Object)array2, "outPosition");
        final int length = array.length;
        final int n = 0;
        int n2;
        for (int j = n2 = 0; j < length; ++j) {
            n2 += array[j];
        }
        float n3 = (i - n2) / (float)2;
        if (!b) {
            int length2;
            int n4;
            int n5;
            for (length2 = array.length, n4 = 0, i = n; i < length2; ++i, ++n4) {
                n5 = array[i];
                array2[n4] = at1.a.D1(n3);
                n3 += n5;
            }
        }
        else {
            int n6;
            for (i = array.length - 1; -1 < i; --i) {
                n6 = array[i];
                array2[i] = at1.a.D1(n3);
                n3 += n6;
            }
        }
    }
    
    public static void b(final int[] array, final int[] array2, final boolean b) {
        ah2.f.f((Object)array, "size");
        ah2.f.f((Object)array2, "outPosition");
        final int n = 0;
        int i = 0;
        if (!b) {
            int n3;
            for (int length = array.length, n2 = n3 = 0; i < length; ++i, ++n2) {
                final int n4 = array[i];
                array2[n2] = n3;
                n3 += n4;
            }
        }
        else {
            int n5 = array.length - 1;
            int n6 = n;
            while (-1 < n5) {
                final int n7 = array[n5];
                array2[n5] = n6;
                n6 += n7;
                --n5;
            }
        }
    }
    
    public static void c(int n, final int[] array, final int[] array2, final boolean b) {
        ah2.f.f((Object)array, "size");
        ah2.f.f((Object)array2, "outPosition");
        final int length = array.length;
        final int n2 = 0;
        int n3;
        for (int i = n3 = 0; i < length; ++i) {
            n3 += array[i];
        }
        int n4 = n - n3;
        if (!b) {
            final int length2 = array.length;
            n = 0;
            for (int j = n2; j < length2; ++j, ++n) {
                final int n5 = array[j];
                array2[n] = n4;
                n4 += n5;
            }
        }
        else {
            int n6;
            for (n = array.length - 1; -1 < n; --n) {
                n6 = array[n];
                array2[n] = n4;
                n4 += n6;
            }
        }
    }
    
    public static void d(int n, final int[] array, final int[] array2, final boolean b) {
        ah2.f.f((Object)array, "size");
        ah2.f.f((Object)array2, "outPosition");
        final int length = array.length;
        final int n2 = 0;
        int n3;
        for (int i = n3 = 0; i < length; ++i) {
            n3 += array[i];
        }
        float n4;
        if (array.length == 0 ^ true) {
            n4 = (n - n3) / (float)array.length;
        }
        else {
            n4 = 0.0f;
        }
        float n5 = n4 / 2;
        if (!b) {
            final int length2 = array.length;
            n = 0;
            for (int j = n2; j < length2; ++j, ++n) {
                final int n6 = array[j];
                array2[n] = at1.a.D1(n5);
                n5 += n6 + n4;
            }
        }
        else {
            int n7;
            for (n = array.length - 1; -1 < n; --n) {
                n7 = array[n];
                array2[n] = at1.a.D1(n5);
                n5 += n7 + n4;
            }
        }
    }
    
    public static void e(int i, final int[] array, final int[] array2, final boolean b) {
        ah2.f.f((Object)array, "size");
        ah2.f.f((Object)array2, "outPosition");
        final int length = array.length;
        final int n = 0;
        int n2;
        for (int j = n2 = 0; j < length; ++j) {
            n2 += array[j];
        }
        final int length2 = array.length;
        final float n3 = 0.0f;
        float n4 = 0.0f;
        float n5;
        if (length2 > 1) {
            n5 = (i - n2) / (float)(array.length - 1);
        }
        else {
            n5 = 0.0f;
        }
        if (!b) {
            int length3;
            int n6;
            int n7;
            for (length3 = array.length, n6 = 0, i = n; i < length3; ++i, ++n6) {
                n7 = array[i];
                array2[n6] = at1.a.D1(n4);
                n4 += n7 + n5;
            }
        }
        else {
            i = array.length - 1;
            float n8 = n3;
            while (-1 < i) {
                final int n9 = array[i];
                array2[i] = at1.a.D1(n8);
                n8 += n9 + n5;
                --i;
            }
        }
    }
    
    public static void f(int n, final int[] array, final int[] array2, final boolean b) {
        ah2.f.f((Object)array, "size");
        ah2.f.f((Object)array2, "outPosition");
        final int length = array.length;
        final int n2 = 0;
        int n3;
        for (int i = n3 = 0; i < length; ++i) {
            n3 += array[i];
        }
        final float n4 = (n - n3) / (float)(array.length + 1);
        if (!b) {
            final int length2 = array.length;
            float n5 = n4;
            n = 0;
            for (int j = n2; j < length2; ++j, ++n) {
                final int n6 = array[j];
                array2[n] = at1.a.D1(n5);
                n5 += n6 + n4;
            }
        }
        else {
            n = array.length - 1;
            float n7 = n4;
            while (-1 < n) {
                final int n8 = array[n];
                array2[n] = at1.a.D1(n7);
                n7 += n8 + n4;
                --n;
            }
        }
    }
    
    public static a.a$h g(final float n) {
        return new a.a$h(n, true, (p)Arrangement$spacedBy$1.INSTANCE);
    }
    
    public static a.a$h h(final float n, final j1.a$b a$b) {
        ah2.f.f((Object)a$b, "alignment");
        return new a.a$h(n, true, (p)new Arrangement$spacedBy$2(a$b));
    }
    
    public static a.a$h i(final float n, final j1.a$c a$c) {
        ah2.f.f((Object)a$c, "alignment");
        return new a.a$h(n, false, (p)new Arrangement$spacedBy$3(a$c));
    }
    
    public interface d
    {
        default float a() {
            return 0;
        }
        
        void c(final int p0, final int[] p1, final LayoutDirection p2, final b p3, final int[] p4);
    }
    
    public interface k
    {
        default float a() {
            return 0;
        }
        
        void b(final b p0, final int p1, final int[] p2, final int[] p3);
    }
}
