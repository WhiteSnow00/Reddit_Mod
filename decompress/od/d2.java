// 
// Decompiled by Procyon v0.6.0
// 

package od;

import sg2.e;
import rg2.a;
import h.t;
import com.google.android.gms.oss.licenses.OssLicensesActivity;

public final class d2 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    
    @Override
    public final void run() {
        switch (this.f) {
            case 1: {
                ((OssLicensesActivity)((t)this.g).g).h.scrollTo(0, ((OssLicensesActivity)((t)this.g).g).i.getLayout().getLineTop(((OssLicensesActivity)((t)this.g).g).i.getLayout().getLineForOffset(((OssLicensesActivity)((t)this.g).g).j)));
                return;
            }
            case 0: {
                ((q)this.g).m.lock();
                try {
                    q.k((q)this.g);
                    return;
                }
                finally {
                    ((q)this.g).m.unlock();
                }
                break;
            }
        }
        e.b(((a)this.g).invoke(), "invoke(...)");
    }
}
