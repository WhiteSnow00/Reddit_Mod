// 
// Decompiled by Procyon v0.6.0
// 

package da;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.NoWhenBranchMatchedException;
import androidx.compose.ui.unit.LayoutDirection;
import u2.d;
import z0.k0;
import u2.b;
import p0.z;

public final class f implements z
{
    public final e a;
    public final b b;
    public final k0 c;
    public final k0 d;
    public final k0 e;
    public final k0 f;
    public final k0 g;
    public final k0 h;
    public final k0 i;
    public final k0 j;
    
    public f(final k.b a, final b b) {
        ng2.e.f((Object)a, "insets");
        ng2.e.f((Object)b, "density");
        this.a = (e)a;
        this.b = b;
        final Boolean false = Boolean.FALSE;
        this.c = ah0.b.Z0((Object)false);
        this.d = ah0.b.Z0((Object)false);
        this.e = ah0.b.Z0((Object)false);
        this.f = ah0.b.Z0((Object)false);
        final float n = 0;
        this.g = ah0.b.Z0((Object)new d(n));
        this.h = ah0.b.Z0((Object)new d(n));
        this.i = ah0.b.Z0((Object)new d(n));
        this.j = ah0.b.Z0((Object)new d(n));
    }
    
    @Override
    public final float a() {
        final float f = ((d)((SnapshotMutableStateImpl)this.j).getValue()).f;
        float y;
        if (((SnapshotMutableStateImpl)this.f).getValue()) {
            y = this.b.Y(this.a.c());
        }
        else {
            y = 0;
        }
        return f + y;
    }
    
    @Override
    public final float b(final LayoutDirection layoutDirection) {
        ng2.e.f((Object)layoutDirection, "layoutDirection");
        final int n = da.f.f$a.a[((Enum)layoutDirection).ordinal()];
        float n3;
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            final float n2 = n3 = ((d)((SnapshotMutableStateImpl)this.i).getValue()).f;
            if (((SnapshotMutableStateImpl)this.e).getValue()) {
                final float n4 = this.b.Y(this.a.b());
                return n2 + n4;
            }
        }
        else {
            final float n2 = n3 = ((d)((SnapshotMutableStateImpl)this.g).getValue()).f;
            if (((SnapshotMutableStateImpl)this.c).getValue()) {
                final float n4 = this.b.Y(this.a.b());
                return n2 + n4;
            }
        }
        final float n5 = 0;
        final float n2 = n3;
        final float n4 = n5;
        return n2 + n4;
    }
    
    @Override
    public final float c(final LayoutDirection layoutDirection) {
        ng2.e.f((Object)layoutDirection, "layoutDirection");
        final int n = da.f.f$a.a[((Enum)layoutDirection).ordinal()];
        float n3;
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            final float n2 = n3 = ((d)((SnapshotMutableStateImpl)this.g).getValue()).f;
            if (((SnapshotMutableStateImpl)this.c).getValue()) {
                final float n4 = this.b.Y(this.a.a());
                return n2 + n4;
            }
        }
        else {
            final float n2 = n3 = ((d)((SnapshotMutableStateImpl)this.i).getValue()).f;
            if (((SnapshotMutableStateImpl)this.e).getValue()) {
                final float n4 = this.b.Y(this.a.a());
                return n2 + n4;
            }
        }
        final float n5 = 0;
        final float n2 = n3;
        final float n4 = n5;
        return n2 + n4;
    }
    
    @Override
    public final float d() {
        final float f = ((d)((SnapshotMutableStateImpl)this.h).getValue()).f;
        float y;
        if (((SnapshotMutableStateImpl)this.d).getValue()) {
            y = this.b.Y(this.a.e());
        }
        else {
            y = 0;
        }
        return f + y;
    }
}
