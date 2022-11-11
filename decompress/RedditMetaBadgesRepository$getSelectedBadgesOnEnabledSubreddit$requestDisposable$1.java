// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.repository;

import java.util.LinkedHashMap;
import ah2.f;
import nc0.g;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import pg2.j;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "", "it", "Lpg2/j;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class RedditMetaBadgesRepository$getSelectedBadgesOnEnabledSubreddit$requestDisposable$1 extends Lambda implements l<Throwable, j>
{
    public final /* synthetic */ PublishSubject<g> $requestErrorSubject;
    public final /* synthetic */ String $subredditId;
    
    public RedditMetaBadgesRepository$getSelectedBadgesOnEnabledSubreddit$requestDisposable$1(final PublishSubject<g> $requestErrorSubject, final String $subredditId) {
        this.$requestErrorSubject = $requestErrorSubject;
        this.$subredditId = $subredditId;
        super(1);
    }
    
    public final void invoke(final Throwable t) {
        f.f((Object)t, "it");
        this.$requestErrorSubject.onNext((Object)new g(t, this.$subredditId, (LinkedHashMap)null));
    }
}
