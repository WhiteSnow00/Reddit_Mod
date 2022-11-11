// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.mapper;

import ah2.f;
import kotlin.Metadata;
import java.util.List;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "<anonymous>", "", "it", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class RedditAccessoryTagResolver$parseAccessoryExpiryModel$2 extends Lambda implements l<List<? extends String>, Boolean>
{
    public static final RedditAccessoryTagResolver$parseAccessoryExpiryModel$2 INSTANCE;
    
    static {
        INSTANCE = new RedditAccessoryTagResolver$parseAccessoryExpiryModel$2();
    }
    
    public RedditAccessoryTagResolver$parseAccessoryExpiryModel$2() {
        super(1);
    }
    
    public final Boolean invoke(final List<String> list) {
        f.f((Object)list, "it");
        return list.size() == 3;
    }
}
