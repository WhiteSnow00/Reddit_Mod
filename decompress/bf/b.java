// 
// Decompiled by Procyon v0.6.0
// 

package bf;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class b extends a
{
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;
    
    public b(final BottomAppBar b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.b.z(this.a));
        floatingActionButton.n(new a() {
            @Override
            public final void b() {
                final BottomAppBar b = bf.b.this.b;
                final int j0 = BottomAppBar.j0;
                b.getClass();
            }
        }, true);
    }
}
