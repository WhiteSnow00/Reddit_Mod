// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import v0.r;
import a80.a;
import o1.f;
import o2.i;
import pg2.j;
import androidx.compose.ui.text.input.TextFieldValue;
import c2.l;
import z0.l0;
import o2.w;
import o2.e;
import z0.q0;
import v0.k;

public final class TextFieldState
{
    public k a;
    public final q0 b;
    public final e c;
    public w d;
    public final l0 e;
    public l f;
    public final l0 g;
    public final l0 h;
    public boolean i;
    public final l0 j;
    public final l0 k;
    public final l0 l;
    public final v0.e m;
    public zg2.l<? super TextFieldValue, j> n;
    public final zg2.l<TextFieldValue, j> o;
    public final zg2.l<i, j> p;
    public final f q;
    
    public TextFieldState(final k a, final q0 b) {
        this.a = a;
        this.b = b;
        this.c = new e();
        final Boolean false = Boolean.FALSE;
        this.e = a80.a.n0(false);
        this.g = a80.a.n0(null);
        this.h = a80.a.n0(HandleState.None);
        this.j = a80.a.n0(false);
        this.k = a80.a.n0(false);
        this.l = a80.a.n0(false);
        this.m = new v0.e();
        this.n = (zg2.l<? super TextFieldValue, j>)TextFieldState$onValueChangeOriginal.TextFieldState$onValueChangeOriginal$1.INSTANCE;
        this.o = (zg2.l<TextFieldValue, j>)new TextFieldState$onValueChange.TextFieldState$onValueChange$1(this);
        this.p = (zg2.l<i, j>)new TextFieldState$onImeActionPerformed.TextFieldState$onImeActionPerformed$1(this);
        this.q = new f();
    }
    
    public final HandleState a() {
        return ((SnapshotMutableStateImpl<HandleState>)this.h).getValue();
    }
    
    public final boolean b() {
        return ((SnapshotMutableStateImpl<Boolean>)this.e).getValue();
    }
    
    public final r c() {
        return ((SnapshotMutableStateImpl<r>)this.g).getValue();
    }
}
