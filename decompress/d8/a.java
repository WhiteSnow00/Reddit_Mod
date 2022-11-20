// 
// Decompiled by Procyon v0.6.0
// 

package d8;

import androidx.lifecycle.Lifecycle;
import android.content.Context;
import android.app.Activity;
import androidx.lifecycle.Lifecycle$Event;
import android.view.View;
import com.bluelinelabs.conductor.Controller$e;
import com.bluelinelabs.conductor.Controller;
import androidx.lifecycle.r;
import androidx.lifecycle.q;

public final class a implements q
{
    public final r f;
    
    public <T extends Controller & q> a(final T t) {
        this.f = new r((q)t);
        t.HA((Controller$e)new Controller$e(this) {
            public final a f;
            
            public final void i(final Controller controller, final View view) {
                this.f.f.f(Lifecycle$Event.ON_RESUME);
            }
            
            public final void j(final Activity activity, final Controller controller) {
                this.f.f.f(Lifecycle$Event.ON_CREATE);
            }
            
            public final void l(final Controller controller, final View view) {
                this.f.f.f(Lifecycle$Event.ON_START);
            }
            
            public final void r(final Context context, final Controller controller) {
            }
            
            public final void t(final Controller controller) {
                this.f.f.f(Lifecycle$Event.ON_DESTROY);
            }
            
            public final void u(final Controller controller, final View view) {
                this.f.f.f(Lifecycle$Event.ON_STOP);
            }
            
            public final void v(final Controller controller, final View view) {
                this.f.f.f(Lifecycle$Event.ON_PAUSE);
            }
        });
    }
    
    public final Lifecycle getLifecycle() {
        return (Lifecycle)this.f;
    }
}
