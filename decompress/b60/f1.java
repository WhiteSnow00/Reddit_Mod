// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import com.reddit.listing.model.sort.CommentSortType$a;
import com.reddit.listing.model.sort.CommentSortType;
import ng2.e;
import com.reddit.data.repository.RedditPreferenceRepository;
import java.util.concurrent.Callable;

public final class f1 implements Callable
{
    public final RedditPreferenceRepository f;
    
    public f1(final RedditPreferenceRepository f) {
        this.f = f;
    }
    
    @Override
    public final Object call() {
        final RedditPreferenceRepository f = this.f;
        e.f((Object)f, "this$0");
        final String defaultCommentSort = f.a.a().getDefaultCommentSort();
        CommentSortType.Companion.getClass();
        CommentSortType commentSortType;
        if ((commentSortType = CommentSortType$a.a(defaultCommentSort)) == null) {
            commentSortType = CommentSortType.CONFIDENCE;
        }
        return commentSortType;
    }
}
