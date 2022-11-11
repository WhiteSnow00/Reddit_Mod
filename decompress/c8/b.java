// 
// Decompiled by Procyon v0.6.0
// 

package c8;

import androidx.lifecycle.Lifecycle;
import android.os.Bundle;
import androidx.lifecycle.q;
import com.bluelinelabs.conductor.Controller;

public abstract class b extends Controller implements q
{
    public final a K;
    
    public b() {
        this.K = new a((T)this);
    }
    
    public b(final Bundle bundle) {
        super(bundle);
        this.K = new a((T)this);
    }
    
    @Override
    public final Lifecycle getLifecycle() {
        return (Lifecycle)this.K.f;
    }
}
