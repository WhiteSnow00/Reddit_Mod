// 
// Decompiled by Procyon v0.6.0
// 

package c50;

import nf2.n;
import com.reddit.domain.model.Comment;
import com.reddit.domain.model.IComment;
import java.util.List;
import nf2.c0;
import java.util.ArrayList;
import com.reddit.listing.model.sort.CommentSortType;
import nf2.a;

public interface f0
{
    a e(final String p0, final boolean p1);
    
    a f();
    
    c0 g(final CommentSortType p0, final String p1, final ArrayList p2);
    
    a h();
    
    a i(final String p0);
    
    a j(final List<? extends IComment> p0, final CommentSortType p1);
    
    a k(final Comment p0);
    
    c0<List<IComment>> l(final String p0, final CommentSortType p1, final Integer p2);
    
    a m(final CommentSortType p0, final String p1, final List p2);
    
    n<IComment> n(final String p0);
    
    a o(final Comment p0, final CommentSortType p1);
}
