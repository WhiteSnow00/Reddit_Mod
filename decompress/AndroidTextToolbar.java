// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ActionMode$Callback;
import pg2.j;
import n1.d;
import zg2.a;
import ah2.f;
import f2.b;
import android.view.ActionMode;
import android.view.View;

public final class AndroidTextToolbar implements d1
{
    public final View a;
    public ActionMode b;
    public final b c;
    public TextToolbarStatus d;
    
    public AndroidTextToolbar(final View a) {
        f.f((Object)a, "view");
        this.a = a;
        this.c = new b((a)new AndroidTextToolbar$textActionModeCallback.AndroidTextToolbar$textActionModeCallback$1(this));
        this.d = TextToolbarStatus.Hidden;
    }
    
    public final void K0() {
        this.d = TextToolbarStatus.Hidden;
        final ActionMode b = this.b;
        if (b != null) {
            b.finish();
        }
        this.b = null;
    }
    
    public final void a(final d b, final a<j> c, final a<j> d, final a<j> e, final a<j> f) {
        final b c2 = this.c;
        c2.getClass();
        c2.b = b;
        final b c3 = this.c;
        c3.c = c;
        c3.e = e;
        c3.d = d;
        c3.f = f;
        final ActionMode b2 = this.b;
        if (b2 == null) {
            this.d = TextToolbarStatus.Shown;
            this.b = e1.a.b(this.a, (ActionMode$Callback)new f2.a(this.c), 1);
        }
        else {
            b2.invalidate();
        }
    }
    
    public final TextToolbarStatus getStatus() {
        return this.d;
    }
}
