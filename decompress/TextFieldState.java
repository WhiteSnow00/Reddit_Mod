// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import v0.q;
import o1.f;
import o2.i;
import androidx.compose.ui.text.input.TextFieldValue;
import v0.d;
import c2.l;
import z0.l0;
import o2.w;
import o2.e;
import z0.q0;
import v0.j;

public final class TextFieldState
{
    public j a;
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
    public final d m;
    public rg2.l<? super TextFieldValue, hg2.j> n;
    public final rg2.l<TextFieldValue, hg2.j> o;
    public final rg2.l<i, hg2.j> p;
    public final f q;
    
    public TextFieldState(final j a, final q0 b) {
        this.a = a;
        this.b = b;
        this.c = new e();
        final Boolean false = Boolean.FALSE;
        this.e = bg.d.t0((Object)false);
        this.g = bg.d.t0((Object)null);
        this.h = bg.d.t0((Object)HandleState.None);
        this.j = bg.d.t0((Object)false);
        this.k = bg.d.t0((Object)false);
        this.l = bg.d.t0((Object)false);
        this.m = new d();
        this.n = (rg2.l<? super TextFieldValue, hg2.j>)TextFieldState$onValueChangeOriginal$1.INSTANCE;
        this.o = (rg2.l<TextFieldValue, hg2.j>)new TextFieldState$onValueChange$1(this);
        this.p = (rg2.l<i, hg2.j>)new TextFieldState$onImeActionPerformed$1(this);
        this.q = new f();
    }
    
    public final HandleState a() {
        return (HandleState)((SnapshotMutableStateImpl)this.h).getValue();
    }
    
    public final boolean b() {
        return (boolean)((SnapshotMutableStateImpl)this.e).getValue();
    }
    
    public final q c() {
        return (q)((SnapshotMutableStateImpl)this.g).getValue();
    }
}
