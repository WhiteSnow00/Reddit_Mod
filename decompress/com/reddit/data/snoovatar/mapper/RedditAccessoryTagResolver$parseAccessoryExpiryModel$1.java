// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.mapper;

import kotlin.text.b;
import ah2.f;
import kotlin.Metadata;
import java.util.List;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "", "it", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class RedditAccessoryTagResolver$parseAccessoryExpiryModel$1 extends Lambda implements l<String, List<? extends String>>
{
    public static final RedditAccessoryTagResolver$parseAccessoryExpiryModel$1 INSTANCE;
    
    static {
        INSTANCE = new RedditAccessoryTagResolver$parseAccessoryExpiryModel$1();
    }
    
    public RedditAccessoryTagResolver$parseAccessoryExpiryModel$1() {
        super(1);
    }
    
    public final List<String> invoke(final String s) {
        f.f((Object)s, "it");
        return b.D2(0, 6, (CharSequence)s, new char[] { ':' });
    }
}
