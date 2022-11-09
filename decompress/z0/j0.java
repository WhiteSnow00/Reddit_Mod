// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import androidx.compose.runtime.ComposerKt;
import ah2.f;

public final class j0<N> implements c<N>
{
    public final c<N> a;
    public final int b;
    public int c;
    
    public j0(final c<N> a, final int b) {
        f.f((Object)a, "applier");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final int n, final int n2) {
        final c<N> a = this.a;
        int b;
        if (this.c == 0) {
            b = this.b;
        }
        else {
            b = 0;
        }
        a.a(n + b, n2);
    }
    
    public final void c(final int n, final int n2, final int n3) {
        int b;
        if (this.c == 0) {
            b = this.b;
        }
        else {
            b = 0;
        }
        this.a.c(n + b, n2 + b, n3);
    }
    
    public final void clear() {
        ComposerKt.c("Clear is not valid on OffsetApplier".toString());
        throw null;
    }
    
    public final void d(final int n, final N n2) {
        final c<N> a = this.a;
        int b;
        if (this.c == 0) {
            b = this.b;
        }
        else {
            b = 0;
        }
        a.d(n + b, (Object)n2);
    }
    
    public final N e() {
        return (N)this.a.e();
    }
    
    public final void f(final int n, final N n2) {
        final c<N> a = this.a;
        int b;
        if (this.c == 0) {
            b = this.b;
        }
        else {
            b = 0;
        }
        a.f(n + b, (Object)n2);
    }
    
    public final void g(final N n) {
        ++this.c;
        this.a.g((Object)n);
    }
    
    public final void h() {
        final int c = this.c;
        if (c > 0) {
            this.c = c - 1;
            this.a.h();
            return;
        }
        ComposerKt.c("OffsetApplier up called with no corresponding down".toString());
        throw null;
    }
}
