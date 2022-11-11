// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import java.util.ArrayList;
import android.view.inputmethod.BaseInputConnection;
import sg2.e;
import android.view.KeyEvent;
import androidx.compose.ui.text.input.TextInputServiceAndroid;

public final class v implements k
{
    public final /* synthetic */ TextInputServiceAndroid a;
    
    public v(final TextInputServiceAndroid a) {
        this.a = a;
    }
    
    @Override
    public final void a(final KeyEvent keyEvent) {
        e.f((Object)keyEvent, "event");
        this.a.i.getValue().sendKeyEvent(keyEvent);
    }
    
    @Override
    public final void b(final ArrayList list) {
        this.a.d.invoke(list);
    }
    
    @Override
    public final void c(final int n) {
        this.a.e.invoke(new i(n));
    }
}
