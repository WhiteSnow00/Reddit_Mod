// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.insets;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import ca.e;
import rg2.a;
import bg.d;
import androidx.compose.runtime.DerivedSnapshotState;
import ca.g;
import z0.l0;
import ca.k;

public final class MutableWindowInsetsType implements b
{
    public final l0 c;
    public final g d;
    public final g e;
    public final l0 f;
    public final DerivedSnapshotState g;
    public final l0 h;
    
    public MutableWindowInsetsType() {
        this.c = bg.d.t0((Object)0);
        this.d = new g(0, 0, 0, 0);
        this.e = new g(0, 0, 0, 0);
        this.f = bg.d.t0((Object)Boolean.TRUE);
        this.g = bg.d.V((rg2.a)new MutableWindowInsetsType$animationInProgress$2(this));
        this.h = bg.d.t0((Object)0.0f);
    }
    
    @Override
    public final e d() {
        return this.d;
    }
    
    @Override
    public final float f() {
        return ((Number)((SnapshotMutableStateImpl)this.h).getValue()).floatValue();
    }
    
    @Override
    public final e g() {
        return this.e;
    }
    
    @Override
    public final boolean h() {
        return (boolean)this.g.getValue();
    }
    
    public final int i() {
        return ((Number)((SnapshotMutableStateImpl)this.c).getValue()).intValue();
    }
    
    @Override
    public final boolean isVisible() {
        return (boolean)((SnapshotMutableStateImpl)this.f).getValue();
    }
    
    public final void j() {
        ((SnapshotMutableStateImpl)this.c).setValue((Object)(this.i() - 1));
        if (this.i() == 0) {
            final g e = this.e;
            ((SnapshotMutableStateImpl)e.c).setValue((Object)0);
            ((SnapshotMutableStateImpl)e.d).setValue((Object)0);
            ((SnapshotMutableStateImpl)e.e).setValue((Object)0);
            ((SnapshotMutableStateImpl)e.f).setValue((Object)0);
            ((SnapshotMutableStateImpl)this.h).setValue((Object)0.0f);
        }
    }
    
    public final void k(final boolean b) {
        ((SnapshotMutableStateImpl)this.f).setValue((Object)b);
    }
}
