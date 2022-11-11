// 
// Decompiled by Procyon v0.6.0
// 

package ca;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.NoWhenBranchMatchedException;
import androidx.compose.ui.unit.LayoutDirection;
import bg.d;
import z0.l0;
import u2.b;
import p0.z;

public final class f implements z
{
    public final e a;
    public final b b;
    public final l0 c;
    public final l0 d;
    public final l0 e;
    public final l0 f;
    public final l0 g;
    public final l0 h;
    public final l0 i;
    public final l0 j;
    
    public f(final k.b a, final b b) {
        sg2.e.f((Object)a, "insets");
        sg2.e.f((Object)b, "density");
        this.a = a;
        this.b = b;
        final Boolean false = Boolean.FALSE;
        this.c = bg.d.t0((Object)false);
        this.d = bg.d.t0((Object)false);
        this.e = bg.d.t0((Object)false);
        this.f = bg.d.t0((Object)false);
        final float n = 0;
        this.g = bg.d.t0((Object)new u2.d(n));
        this.h = bg.d.t0((Object)new u2.d(n));
        this.i = bg.d.t0((Object)new u2.d(n));
        this.j = bg.d.t0((Object)new u2.d(n));
    }
    
    public final float a() {
        final float f = ((u2.d)((SnapshotMutableStateImpl)this.j).getValue()).f;
        float r;
        if (((SnapshotMutableStateImpl)this.f).getValue()) {
            r = this.b.r(this.a.c());
        }
        else {
            r = 0;
        }
        return f + r;
    }
    
    public final float b(final LayoutDirection layoutDirection) {
        sg2.e.f((Object)layoutDirection, "layoutDirection");
        final int n = ca.f.a.a[layoutDirection.ordinal()];
        float n3;
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            final float n2 = n3 = ((u2.d)((SnapshotMutableStateImpl)this.i).getValue()).f;
            if (((SnapshotMutableStateImpl)this.e).getValue()) {
                final float n4 = this.b.r(this.a.b());
                return n2 + n4;
            }
        }
        else {
            final float n2 = n3 = ((u2.d)((SnapshotMutableStateImpl)this.g).getValue()).f;
            if (((SnapshotMutableStateImpl)this.c).getValue()) {
                final float n4 = this.b.r(this.a.b());
                return n2 + n4;
            }
        }
        final float n5 = 0;
        final float n2 = n3;
        final float n4 = n5;
        return n2 + n4;
    }
    
    public final float c(final LayoutDirection layoutDirection) {
        sg2.e.f((Object)layoutDirection, "layoutDirection");
        final int n = ca.f.a.a[layoutDirection.ordinal()];
        float n3;
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            final float n2 = n3 = ((u2.d)((SnapshotMutableStateImpl)this.g).getValue()).f;
            if (((SnapshotMutableStateImpl)this.c).getValue()) {
                final float n4 = this.b.r(this.a.a());
                return n2 + n4;
            }
        }
        else {
            final float n2 = n3 = ((u2.d)((SnapshotMutableStateImpl)this.i).getValue()).f;
            if (((SnapshotMutableStateImpl)this.e).getValue()) {
                final float n4 = this.b.r(this.a.a());
                return n2 + n4;
            }
        }
        final float n5 = 0;
        final float n2 = n3;
        final float n4 = n5;
        return n2 + n4;
    }
    
    public final float d() {
        final float f = ((u2.d)((SnapshotMutableStateImpl)this.h).getValue()).f;
        float r;
        if (((SnapshotMutableStateImpl)this.d).getValue()) {
            r = this.b.r(this.a.e());
        }
        else {
            r = 0;
        }
        return f + r;
    }
}
