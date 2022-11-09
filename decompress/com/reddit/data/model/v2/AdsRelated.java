// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v2;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n" }, d2 = { "Lcom/reddit/data/model/v2/AdsRelated;", "", "isBrandSafe", "", "()Z", "isNsfw", "subreddit", "", "getSubreddit", "()Ljava/lang/String;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface AdsRelated
{
    String getSubreddit();
    
    boolean isBrandSafe();
    
    boolean isNsfw();
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class DefaultImpls
    {
        public static String getSubreddit(final AdsRelated adsRelated) {
            return null;
        }
        
        public static boolean isBrandSafe(final AdsRelated adsRelated) {
            return false;
        }
        
        public static boolean isNsfw(final AdsRelated adsRelated) {
            return false;
        }
    }
}
