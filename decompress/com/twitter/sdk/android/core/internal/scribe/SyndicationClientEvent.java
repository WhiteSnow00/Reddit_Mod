// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.util.List;
import ij.a;

public class SyndicationClientEvent extends ScribeEvent
{
    public static final String CLIENT_NAME = "tfw";
    private static final String SCRIBE_CATEGORY = "tfw_client_event";
    @a("event_info")
    public final String eventInfo;
    @a("external_ids")
    public final SyndicationClientEvent.SyndicationClientEvent$ExternalIds externalIds;
    @a("language")
    public final String language;
    
    public SyndicationClientEvent(final EventNamespace eventNamespace, final String eventInfo, final long n, final String language, final String s, final List<ScribeItem> list) {
        super("tfw_client_event", eventNamespace, n, (List)list);
        this.language = language;
        this.eventInfo = eventInfo;
        this.externalIds = new SyndicationClientEvent.SyndicationClientEvent$ExternalIds(this, s);
    }
}
