// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import qd.a;

public final class i4 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ q7 g;
    public final /* synthetic */ u4 h;
    public final /* synthetic */ a i;
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                this.h.a.a();
                if (((j7)this.i).q() == null) {
                    this.h.a.n((j7)this.i, this.g);
                }
                else {
                    this.h.a.r((j7)this.i, this.g);
                }
                return;
            }
            case 0: {
                this.h.a.a();
                if (((c)this.i).h.q() == null) {
                    this.h.a.m((c)this.i, this.g);
                }
                else {
                    this.h.a.p((c)this.i, this.g);
                }
            }
        }
    }
}
