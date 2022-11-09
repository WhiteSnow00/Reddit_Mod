// 
// Decompiled by Procyon v0.6.0
// 

package k1;

import ah2.f;
import android.view.ViewStructure;

public final class d
{
    public static final d a;
    
    static {
        a = new d();
    }
    
    public final int a(final ViewStructure viewStructure, final int n) {
        f.f((Object)viewStructure, "structure");
        return viewStructure.addChildCount(n);
    }
    
    public final ViewStructure b(final ViewStructure viewStructure, final int n) {
        f.f((Object)viewStructure, "structure");
        return viewStructure.newChild(n);
    }
    
    public final void c(final ViewStructure viewStructure, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        f.f((Object)viewStructure, "structure");
        viewStructure.setDimens(n, n2, n3, n4, n5, n6);
    }
    
    public final void d(final ViewStructure viewStructure, final int n, final String s, final String s2, final String s3) {
        f.f((Object)viewStructure, "structure");
        viewStructure.setId(n, s, s2, s3);
    }
}
