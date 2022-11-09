// 
// Decompiled by Procyon v0.6.0
// 

package d5;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import pg2.j;
import tg2.c;
import c5.b;
import pj2.f;

public final class a implements f<b>
{
    public final /* synthetic */ d5.b f;
    
    public a(final d5.b f) {
        this.f = f;
    }
    
    public final Object emit(b value, final c<? super j> c) {
        value = value;
        ((SnapshotMutableStateImpl<b>)this.f.d).setValue(value);
        return j.a;
    }
}
