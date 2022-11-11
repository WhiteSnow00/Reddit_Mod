// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import androidx.work.WorkerParameters$a;
import d6.j;

public final class m implements Runnable
{
    public j f;
    public String g;
    public WorkerParameters$a h;
    
    public m(final j f, final String g, final WorkerParameters$a h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        this.f.f.f(this.g, this.h);
    }
}
