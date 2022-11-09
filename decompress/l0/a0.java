// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;
import mj2.z0;
import androidx.compose.animation.core.MutatePriority;
import n02.r;
import kotlinx.coroutines.sync.MutexImpl;
import java.util.concurrent.atomic.AtomicReference;

public final class a0
{
    public final AtomicReference<a> a;
    public final MutexImpl b;
    
    public a0() {
        this.a = new AtomicReference<a>(null);
        this.b = r.d();
    }
    
    public static final class a
    {
        public final MutatePriority a;
        public final z0 b;
        
        public a(final MutatePriority a, final z0 b) {
            f.f((Object)a, "priority");
            this.a = a;
            this.b = b;
        }
    }
}
