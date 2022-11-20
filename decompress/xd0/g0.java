// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import cg2.j;
import com.reddit.data.repository.RedditSubredditLeaderboardRepository;
import com.reddit.domain.model.SubredditLeaderboardModel;
import java.util.List;
import gg2.c;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

public interface g0
{
    FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 a(final String p0);
    
    Object b(final String p0, final String p1, final c p2);
    
    Object c(final String p0, final Integer p1, final c<? super List<SubredditLeaderboardModel>> p2);
    
    public static final class a
    {
        public static Object a(final RedditSubredditLeaderboardRepository redditSubredditLeaderboardRepository, final String s, final Integer n, String s2, final c c, final int n2) {
            if ((n2 & 0x4) != 0x0) {
                s2 = null;
            }
            return redditSubredditLeaderboardRepository.d(s, n, s2, (n2 & 0x8) != 0x0, (n2 & 0x10) != 0x0, c);
        }
    }
}
