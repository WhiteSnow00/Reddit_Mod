// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import o4.c;
import android.util.SparseArray;
import o4.a;
import mj2.c0;
import android.graphics.Typeface;
import o4.b;

public final class n
{
    public final b a;
    public final char[] b;
    public final a c;
    public final Typeface d;
    
    public n(final Typeface d, final b a) {
        this.d = d;
        this.a = a;
        this.c = new a(1024);
        final int a2 = ((c)a).a(6);
        int int1;
        if (a2 != 0) {
            final int n = a2 + ((c)a).a;
            int1 = ((c)a).b.getInt(((c)a).b.getInt(n) + n);
        }
        else {
            int1 = 0;
        }
        this.b = new char[int1 * 2];
        final int a3 = ((c)a).a(6);
        int int2;
        if (a3 != 0) {
            final int n2 = a3 + ((c)a).a;
            int2 = ((c)a).b.getInt(((c)a).b.getInt(n2) + n2);
        }
        else {
            int2 = 0;
        }
        for (int i = 0; i < int2; ++i) {
            final i j = new i(this, i);
            final o4.a c = j.c();
            final int a4 = ((c)c).a(4);
            int int3;
            if (a4 != 0) {
                int3 = ((c)c).b.getInt(a4 + ((c)c).a);
            }
            else {
                int3 = 0;
            }
            Character.toChars(int3, this.b, i * 2);
            c0.o(j.b() > 0, "invalid metadata codepoint length");
            this.c.a(j, 0, j.b() - 1);
        }
    }
    
    public static final class a
    {
        public final SparseArray<a> a;
        public i b;
        
        public a() {
            this(1);
        }
        
        public a(final int n) {
            this.a = (SparseArray<a>)new SparseArray(n);
        }
        
        public final void a(final i b, final int n, final int n2) {
            final int a = b.a(n);
            final SparseArray<a> a2 = this.a;
            a a3;
            if (a2 == null) {
                a3 = null;
            }
            else {
                a3 = (a)a2.get(a);
            }
            a a4 = a3;
            if (a3 == null) {
                a4 = new a();
                this.a.put(b.a(n), (Object)a4);
            }
            if (n2 > n) {
                a4.a(b, n + 1, n2);
            }
            else {
                a4.b = b;
            }
        }
    }
}
