// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import af2.a;
import cg2.j;
import ku2.w;
import gg2.c;
import com.reddit.domain.model.mod.PostResponseWithErrors;
import af2.c0;

public interface n
{
    c0<PostResponseWithErrors> a(final String p0);
    
    c0<PostResponseWithErrors> b(final String p0, final String p1);
    
    Object c(final String p0, final String p1, final c<? super w<PostResponseWithErrors>> p2);
    
    c0<PostResponseWithErrors> d(final String p0, final String p1);
    
    Object e(final c<? super j> p0);
    
    a sendVerificationEmail();
}
