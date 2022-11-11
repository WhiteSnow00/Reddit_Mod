// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.util.List;
import java.util.Collections;

public class ScribeEventFactory
{
    public static ScribeEvent newScribeEvent(final EventNamespace eventNamespace, final long n, final String s, final String s2) {
        return newScribeEvent(eventNamespace, "", n, s, s2, Collections.emptyList());
    }
    
    public static ScribeEvent newScribeEvent(final EventNamespace eventNamespace, final String s, final long n, final String s2, final String s3, final List<ScribeItem> list) {
        final String client = eventNamespace.client;
        client.getClass();
        if (!client.equals("tfw")) {
            return (ScribeEvent)new SyndicatedSdkImpressionEvent(eventNamespace, n, s2, s3, (List)list);
        }
        return (ScribeEvent)new SyndicationClientEvent(eventNamespace, s, n, s2, s3, (List)list);
    }
}
