// 
// Decompiled by Procyon v0.6.0
// 

package d5;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import hg2.j;
import lg2.c;
import c5.b;
import hj2.f;

public final class a implements f<b>
{
    public final /* synthetic */ d5.b f;
    
    public a(final d5.b f) {
        this.f = f;
    }
    
    @Override
    public final Object emit(b value, final c<? super j> c) {
        value = value;
        ((SnapshotMutableStateImpl)this.f.d).setValue((Object)value);
        return j.a;
    }
}
