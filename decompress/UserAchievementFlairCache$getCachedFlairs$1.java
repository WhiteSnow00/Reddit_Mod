// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups;

import w50.a;
import ah2.f;
import kotlin.Metadata;
import kd0.r;
import kotlin.Pair;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0014\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "", "Lcom/reddit/frontpage/types/UserKindWithId;", "userId", "Lkotlin/Pair;", "Lkd0/r;", "invoke", "(Ljava/lang/String;)Lkotlin/Pair;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class UserAchievementFlairCache$getCachedFlairs$1 extends Lambda implements l<String, Pair<? extends String, ? extends r>>
{
    public final /* synthetic */ String $subredditName;
    public final /* synthetic */ w50.l this$0;
    
    public UserAchievementFlairCache$getCachedFlairs$1(final String $subredditName, final w50.l this$0) {
        this.$subredditName = $subredditName;
        this.this$0 = this$0;
        super(1);
    }
    
    public final Pair<String, r> invoke(final String s) {
        f.f((Object)s, "userId");
        final r r = (r)this.this$0.a.get(new a(this.$subredditName, s));
        if (r == null) {
            return null;
        }
        return (Pair<String, r>)new Pair((Object)s, (Object)r);
    }
}
