// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.mapper;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kj2.j;
import ah2.f;
import kotlin.Metadata;
import re0.b;
import java.util.List;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "", "", "it", "Lre0/b;", "invoke", "(Ljava/util/List;)Lre0/b;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class RedditAccessoryTagResolver$parseAccessoryExpiryModel$4 extends Lambda implements l<List<? extends String>, b>
{
    public final /* synthetic */ a this$0;
    
    public RedditAccessoryTagResolver$parseAccessoryExpiryModel$4(final a this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final b invoke(final List<String> list) {
        f.f((Object)list, "it");
        final boolean v1 = j.V1((String)list.get(1), "urgent", true);
        final boolean v2 = j.V1((String)list.get(1), "normal", true);
        if (!v1 && !v2) {
            this.this$0.b.h((zg2.a)new zg2.a<String>() {
                public final String invoke() {
                    return b.k(a.k("Cannot parse time_label in \""), CollectionsKt___CollectionsKt.y1((Iterable)list, (CharSequence)":", (String)null, (String)null, (l)null, 62), '\"');
                }
            });
            return null;
        }
        return new b(v1, (String)list.get(2));
    }
}
