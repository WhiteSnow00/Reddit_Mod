// 
// Decompiled by Procyon v0.6.0
// 

package c8;

import android.content.Context;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import android.view.View;
import com.bluelinelabs.conductor.Controller;
import androidx.lifecycle.r;
import androidx.lifecycle.q;

public final class a implements q
{
    public final r f;
    
    public <T extends Controller & q> a(final T t) {
        this.f = new r((q)t);
        t.vA((Controller.e)new Controller.e() {
            @Override
            public final void i(final Controller controller, final View view) {
                a.this.f.f(Lifecycle.Event.ON_RESUME);
            }
            
            @Override
            public final void j(final Activity activity, final Controller controller) {
                a.this.f.f(Lifecycle.Event.ON_CREATE);
            }
            
            @Override
            public final void l(final Controller controller, final View view) {
                a.this.f.f(Lifecycle.Event.ON_START);
            }
            
            @Override
            public final void r(final Context context, final Controller controller) {
            }
            
            @Override
            public final void t(final Controller controller) {
                a.this.f.f(Lifecycle.Event.ON_DESTROY);
            }
            
            @Override
            public final void u(final Controller controller, final View view) {
                a.this.f.f(Lifecycle.Event.ON_STOP);
            }
            
            @Override
            public final void v(final Controller controller, final View view) {
                a.this.f.f(Lifecycle.Event.ON_PAUSE);
            }
        });
    }
    
    @Override
    public final Lifecycle getLifecycle() {
        return (Lifecycle)this.f;
    }
}
