// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import sg2.e;
import java.util.Iterator;
import android.view.ViewGroup;
import android.view.View;
import bj2.k;

public final class n1 implements k<View>
{
    public final /* synthetic */ ViewGroup a;
    
    public n1(final ViewGroup a) {
        this.a = a;
    }
    
    public final Iterator<View> iterator() {
        final ViewGroup a = this.a;
        e.f((Object)a, "<this>");
        return new o1(a);
    }
}
