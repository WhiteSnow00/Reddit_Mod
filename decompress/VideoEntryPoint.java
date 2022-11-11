// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import com.reddit.listing.common.ListingType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n" }, d2 = { "Lcom/reddit/domain/model/streaming/VideoEntryPoint;", "", "(Ljava/lang/String;I)V", "HOME", "POPULAR", "SUBREDDIT", "ALL", "SEARCH", "DISCOVER", "Companion", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum VideoEntryPoint
{
    ALL;
    
    public static final Companion Companion;
    
    DISCOVER, 
    HOME, 
    POPULAR, 
    SEARCH, 
    SUBREDDIT;
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/streaming/VideoEntryPoint$Companion;", "", "()V", "fromListingType", "Lcom/reddit/domain/model/streaming/VideoEntryPoint;", "listingType", "Lcom/reddit/listing/common/ListingType;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final VideoEntryPoint fromListingType(final ListingType listingType) {
            int n;
            if (listingType == null) {
                n = -1;
            }
            else {
                n = WhenMappings.$EnumSwitchMapping$0[((Enum)listingType).ordinal()];
            }
            VideoEntryPoint videoEntryPoint;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                videoEntryPoint = VideoEntryPoint.ALL;
                            }
                            else {
                                videoEntryPoint = VideoEntryPoint.DISCOVER;
                            }
                        }
                        else {
                            videoEntryPoint = VideoEntryPoint.SEARCH;
                        }
                    }
                    else {
                        videoEntryPoint = VideoEntryPoint.SUBREDDIT;
                    }
                }
                else {
                    videoEntryPoint = VideoEntryPoint.POPULAR;
                }
            }
            else {
                videoEntryPoint = VideoEntryPoint.HOME;
            }
            return videoEntryPoint;
        }
    }
}
