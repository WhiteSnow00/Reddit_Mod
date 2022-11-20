// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import com.reddit.domain.model.UpdateResponse;
import com.reddit.domain.model.GeoAutocompleteSuggestion;
import cg2.j;
import java.io.Serializable;
import gg2.c;

public interface f
{
    Serializable a(final c p0);
    
    Object b(final String p0, final int p1, final c p2);
    
    Object c(final String p0, final c<? super j> p1);
    
    Object d(final String p0, final c<? super GeoAutocompleteSuggestion> p1);
    
    Object e(final String p0, final String p1, final String p2, final c<? super UpdateResponse> p3);
    
    Object f(final String p0, final String p1, final GeoAutocompleteSuggestion p2, final c<? super UpdateResponse> p3);
}
