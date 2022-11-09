// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.username;

import java.util.LinkedList;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LocalSuggestedUsernamesCache$getSuggestedUsernames$1$1 extends Lambda implements a<String>
{
    public final /* synthetic */ LocalSuggestedUsernamesCache this$0;
    
    public LocalSuggestedUsernamesCache$getSuggestedUsernames$1$1(final LocalSuggestedUsernamesCache this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final String invoke() {
        final LocalSuggestedUsernamesCache this$0 = this.this$0;
        final int f = LocalSuggestedUsernamesCache.f;
        return (String)((LinkedList)this$0.c.getValue()).poll();
    }
}
