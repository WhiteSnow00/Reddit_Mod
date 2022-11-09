// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006¨\u0006\b" }, d2 = { "Lcom/reddit/domain/chat/model/DownToChat;", "", "showBanner", "", "isExperimentEnabled", "(ZZ)V", "()Z", "getShowBanner", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class DownToChat
{
    private final boolean isExperimentEnabled;
    private final boolean showBanner;
    
    public DownToChat(@n(name = "feature_enabled") final boolean showBanner, @n(name = "experiment_enabled") final boolean isExperimentEnabled) {
        this.showBanner = showBanner;
        this.isExperimentEnabled = isExperimentEnabled;
    }
    
    public final boolean getShowBanner() {
        return this.showBanner;
    }
    
    public final boolean isExperimentEnabled() {
        return this.isExperimentEnabled;
    }
}
