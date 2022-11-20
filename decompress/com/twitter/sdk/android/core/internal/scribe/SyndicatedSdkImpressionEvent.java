// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.util.List;
import java.util.Collections;
import ij.a;

public class SyndicatedSdkImpressionEvent extends ScribeEvent
{
    public static final String CLIENT_NAME = "android";
    private static final String SCRIBE_CATEGORY = "syndicated_sdk_impression";
    @a("device_id_created_at")
    public final long deviceIdCreatedAt;
    @a("external_ids")
    public final SyndicatedSdkImpressionEvent.SyndicatedSdkImpressionEvent$ExternalIds externalIds;
    @a("language")
    public final String language;
    
    public SyndicatedSdkImpressionEvent(final EventNamespace eventNamespace, final long n, final String s, final String s2) {
        this(eventNamespace, n, s, s2, Collections.emptyList());
    }
    
    public SyndicatedSdkImpressionEvent(final EventNamespace eventNamespace, final long n, final String language, final String s, final List<ScribeItem> list) {
        super("syndicated_sdk_impression", eventNamespace, n, (List)list);
        this.language = language;
        this.externalIds = new SyndicatedSdkImpressionEvent.SyndicatedSdkImpressionEvent$ExternalIds(this, s);
        this.deviceIdCreatedAt = 0L;
    }
}
