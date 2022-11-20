// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import af2.a;
import java.util.List;
import com.reddit.domain.model.Multireddit$Visibility;
import com.reddit.domain.model.Multireddit;
import af2.c0;

public interface l
{
    c0<Multireddit> a(final String p0, final String p1);
    
    c0<Multireddit> b(final Multireddit p0, final String p1, final String p2, final Multireddit$Visibility p3);
    
    c0<Multireddit> c(final Multireddit p0, final List<String> p1);
    
    a d(final Multireddit p0, final boolean p1);
    
    c0<Multireddit> e(final String p0, final boolean p1);
    
    c0<Multireddit> f(final String p0, final String p1, final String p2);
    
    c0 g(final String p0, final boolean p1);
}
