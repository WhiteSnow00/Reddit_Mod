// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import com.reddit.domain.model.BlockedAccountSearchResult;
import java.util.Set;
import af2.c0;
import af2.a;
import gg2.c;
import io.reactivex.subjects.PublishSubject;

public interface d
{
    PublishSubject a();
    
    Object b(final String p0, final c p1);
    
    a blockUser(final String p0);
    
    a c(final String p0);
    
    c0<Set<String>> d();
    
    Object e(final String p0, final c<? super Boolean> p1);
    
    Object f(final String p0, final c<? super BlockedAccountSearchResult> p1);
}
