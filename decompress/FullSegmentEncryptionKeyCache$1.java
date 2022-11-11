// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.hls;

import java.util.Map;
import android.net.Uri;
import java.util.LinkedHashMap;

class FullSegmentEncryptionKeyCache$1 extends LinkedHashMap<Uri, byte[]>
{
    public final /* synthetic */ int val$maxSize;
    
    public FullSegmentEncryptionKeyCache$1(final a a, final int n, final float n2, final boolean b, final int val$maxSize) {
        this.val$maxSize = val$maxSize;
        super(n, n2, b);
    }
    
    public boolean removeEldestEntry(final Map.Entry<Uri, byte[]> entry) {
        return this.size() > this.val$maxSize;
    }
}
