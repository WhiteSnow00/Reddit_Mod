// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import cj2.s;
import af2.g;
import com.reddit.domain.model.Account;
import com.reddit.domain.model.SocialLinkDeleteResponse;
import gg2.c;
import java.util.List;
import af2.c0;
import java.util.ArrayList;
import af2.a;

public interface b
{
    a a(final String p0);
    
    c0 b(final ArrayList p0);
    
    Object c(final List<String> p0, final c<? super y<SocialLinkDeleteResponse>> p1);
    
    c0<Account> d(final String p0);
    
    Object e(final ArrayList p0, final c p1);
    
    g<Account> f(final String p0, final boolean p1);
    
    s g(final String p0);
    
    c0<Account> getAccount(final String p0);
    
    c0<Account> h(final String p0);
    
    c0<y<SocialLinkDeleteResponse>> i(final List<String> p0);
    
    c0<Boolean> j(final String p0);
}
