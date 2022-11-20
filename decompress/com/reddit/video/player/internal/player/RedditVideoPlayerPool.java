// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal.player;

import com.google.android.exoplayer2.w;
import j0.g;
import java.util.Iterator;
import java.util.Set;
import kotlin.text.b;
import android.support.v4.media.a;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.net.Uri;
import ng2.e;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\b\u0005*\u0001\u001b\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u0016J\u001e\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\f\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002J,\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0018\u001a\u00020\u0010R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f" }, d2 = { "Lcom/reddit/video/player/internal/player/RedditVideoPlayerPool;", "", "Ljavax/inject/Provider;", "Lcom/reddit/video/player/internal/player/RedditVideoPlayer;", "provider", "", "key", "newPlayer", "Landroid/net/Uri;", "sanitize", "url", "id", "getPlayer", "player", "Lcg2/j;", "detachPlayer", "", "newSize", "resize$player_release", "(I)V", "resize", "clear$player_release", "()V", "clear", "size", "DEFAULT_LRU_SIZE", "I", "com/reddit/video/player/internal/player/RedditVideoPlayerPool$lruCache$1", "lruCache", "Lcom/reddit/video/player/internal/player/RedditVideoPlayerPool$lruCache$1;", "<init>", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideoPlayerPool
{
    private static final int DEFAULT_LRU_SIZE = 5;
    public static final RedditVideoPlayerPool INSTANCE;
    private static final RedditVideoPlayerPool$lruCache$1 lruCache;
    
    static {
        INSTANCE = new RedditVideoPlayerPool();
        lruCache = new RedditVideoPlayerPool$lruCache$1();
    }
    
    private RedditVideoPlayerPool() {
    }
    
    public static void detachPlayer$default(final RedditVideoPlayerPool redditVideoPlayerPool, final RedditVideoPlayer redditVideoPlayer, String s, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            s = null;
        }
        redditVideoPlayerPool.detachPlayer(redditVideoPlayer, s);
    }
    
    public static RedditVideoPlayer getPlayer$default(final RedditVideoPlayerPool redditVideoPlayerPool, final Provider provider, String s, String s2, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            s = null;
        }
        if ((n & 0x4) != 0x0) {
            s2 = null;
        }
        return redditVideoPlayerPool.getPlayer((Provider<RedditVideoPlayer>)provider, s, s2);
    }
    
    private final RedditVideoPlayer newPlayer(final Provider<RedditVideoPlayer> provider, final String s) {
        final RedditVideoPlayer redditVideoPlayer = (RedditVideoPlayer)provider.get();
        ((g)RedditVideoPlayerPool.lruCache).put((Object)s, (Object)redditVideoPlayer);
        e.e((Object)redditVideoPlayer, "player");
        return redditVideoPlayer;
    }
    
    private final String sanitize(final Uri uri) {
        final StringBuilder sb = new StringBuilder();
        Set queryParameterNames = uri.getQueryParameterNames();
        e.e((Object)queryParameterNames, "it");
        final boolean empty = queryParameterNames.isEmpty();
        final int n = 1;
        final String s = null;
        if (!(empty ^ true)) {
            queryParameterNames = null;
        }
        if (queryParameterNames != null) {
            sb.append("?");
            for (final String s2 : CollectionsKt___CollectionsKt.w5((Collection)queryParameterNames)) {
                final StringBuilder n2 = a.n(s2, '=');
                n2.append(uri.getQueryParameter(s2));
                n2.append('&');
                sb.append(n2.toString());
            }
            e.e((Object)sb.deleteCharAt(b.P0((CharSequence)sb)), "this.deleteCharAt(index)");
        }
        final StringBuilder sb2 = new StringBuilder();
        final String encodedFragment = uri.getEncodedFragment();
        int n3;
        if (encodedFragment != null && encodedFragment.length() > 0) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        String s3 = s;
        if (n3 != 0) {
            s3 = "#";
        }
        final String s4 = "";
        String s5;
        if ((s5 = s3) == null) {
            s5 = "";
        }
        sb2.append(s5);
        String encodedFragment2 = uri.getEncodedFragment();
        if (encodedFragment2 == null) {
            encodedFragment2 = s4;
        }
        sb2.append(encodedFragment2);
        final String string = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(uri.getScheme());
        sb3.append("://");
        sb3.append(uri.getAuthority());
        sb3.append(uri.getPath());
        sb3.append((Object)sb);
        sb3.append(string);
        return sb3.toString();
    }
    
    public final void clear$player_release() {
        ((g)RedditVideoPlayerPool.lruCache).evictAll();
    }
    
    public final void detachPlayer(RedditVideoPlayer redditVideoPlayer, String currentUrl) {
        e.f((Object)redditVideoPlayer, "player");
        if (!redditVideoPlayer.getShouldRetain()) {
            ((w)redditVideoPlayer.getExoPlayer$player_release()).stop();
            ((w)redditVideoPlayer.getExoPlayer$player_release()).release();
            String sanitize;
            if ((sanitize = currentUrl) == null) {
                currentUrl = redditVideoPlayer.getCurrentUrl();
                if (currentUrl != null) {
                    final RedditVideoPlayerPool instance = RedditVideoPlayerPool.INSTANCE;
                    final Uri parse = Uri.parse(currentUrl);
                    e.e((Object)parse, "parse(it)");
                    sanitize = instance.sanitize(parse);
                }
                else {
                    sanitize = null;
                }
            }
            if (sanitize != null) {
                redditVideoPlayer = (RedditVideoPlayer)((g)RedditVideoPlayerPool.lruCache).remove((Object)sanitize);
            }
        }
    }
    
    public final RedditVideoPlayer getPlayer(final Provider<RedditVideoPlayer> provider, final String s, final String s2) {
        e.f((Object)provider, "provider");
        String sanitize = s2;
        if (s2 == null) {
            final Uri parse = Uri.parse(s);
            e.e((Object)parse, "parse(url)");
            sanitize = this.sanitize(parse);
        }
        RedditVideoPlayer player;
        if ((player = (RedditVideoPlayer)((g)RedditVideoPlayerPool.lruCache).get((Object)sanitize)) == null) {
            player = this.newPlayer(provider, sanitize);
        }
        return player;
    }
    
    public final void resize$player_release(final int n) {
        ((g)RedditVideoPlayerPool.lruCache).resize(n);
    }
    
    public final int size() {
        return ((g)RedditVideoPlayerPool.lruCache).size();
    }
}
