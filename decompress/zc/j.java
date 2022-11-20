// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.util.Arrays;
import bd.c0;

public final class j implements b
{
    public final boolean a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public a[] f;
    
    public j() {
        this.a = true;
        this.b = 65536;
        this.e = 0;
        this.f = new a[100];
    }
    
    public final void a(final int c) {
        synchronized (this) {
            final boolean b = c < this.c;
            this.c = c;
            if (b) {
                this.b();
            }
        }
    }
    
    public final void b() {
        synchronized (this) {
            final int c = this.c;
            final int b = this.b;
            final int a = c0.a;
            final int max = Math.max(0, (c + b - 1) / b - this.d);
            final int e = this.e;
            if (max >= e) {
                return;
            }
            Arrays.fill(this.f, max, e, null);
            this.e = max;
        }
    }
}
