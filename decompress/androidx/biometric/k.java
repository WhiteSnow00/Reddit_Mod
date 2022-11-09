// 
// Decompiled by Procyon v0.6.0
// 

package androidx.biometric;

import androidx.lifecycle.y;

public final class k implements y<Boolean>
{
    public final /* synthetic */ e a;
    
    public k(final e a) {
        this.a = a;
    }
    
    public final void a(final Object o) {
        if (o) {
            if (this.a.p0()) {
                this.a.r0();
            }
            else {
                final e a = this.a;
                CharSequence charSequence = a.g.d();
                if (charSequence == null) {
                    charSequence = a.getString(2131953048);
                }
                a.s0(13, charSequence);
                a.n0(2);
            }
            this.a.g.h(false);
        }
    }
}
