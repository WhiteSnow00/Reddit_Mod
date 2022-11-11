// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.insets;

import rg2.a;
import bg.d;
import sg2.e;
import androidx.compose.runtime.DerivedSnapshotState;
import ca.k;

public final class CalculatedWindowInsetsType implements b
{
    public final DerivedSnapshotState c;
    public final DerivedSnapshotState d;
    public final DerivedSnapshotState e;
    public final DerivedSnapshotState f;
    public final DerivedSnapshotState g;
    
    public CalculatedWindowInsetsType(final b... array) {
        sg2.e.f((Object)array, "types");
        this.c = bg.d.V((rg2.a)new CalculatedWindowInsetsType$layoutInsets$2(array));
        this.d = bg.d.V((rg2.a)new CalculatedWindowInsetsType$animatedInsets$2(array));
        this.e = bg.d.V((rg2.a)new CalculatedWindowInsetsType$isVisible$2(array));
        this.f = bg.d.V((rg2.a)new CalculatedWindowInsetsType$animationInProgress$2(array));
        this.g = bg.d.V((rg2.a)new CalculatedWindowInsetsType$animationFraction$2(array));
    }
    
    @Override
    public final e d() {
        return (e)this.c.getValue();
    }
    
    @Override
    public final float f() {
        return ((Number)this.g.getValue()).floatValue();
    }
    
    @Override
    public final e g() {
        return (e)this.d.getValue();
    }
    
    @Override
    public final boolean h() {
        return (boolean)this.f.getValue();
    }
    
    @Override
    public final boolean isVisible() {
        return (boolean)this.e.getValue();
    }
}
