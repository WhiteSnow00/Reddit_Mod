// 
// Decompiled by Procyon v0.6.0
// 

package re2;

import androidx.fragment.app.Fragment;
import android.content.Context;
import javax.inject.Inject;
import dagger.android.DispatchingAndroidInjector;
import androidx.fragment.app.n;

public abstract class a extends n implements qe2.a
{
    @Inject
    public DispatchingAndroidInjector<Object> androidInjector;
    
    public dagger.android.a<Object> androidInjector() {
        return (dagger.android.a<Object>)this.androidInjector;
    }
    
    @Override
    public void onAttach(final Context context) {
        ml0.a.T((Fragment)this);
        super.onAttach(context);
    }
}
