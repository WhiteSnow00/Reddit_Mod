// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.util.LinkedHashMap;

public final class a
{
    public final LinkedHashMap<Uri, byte[]> a;
    
    public a() {
        this.a = new FullSegmentEncryptionKeyCache$1(this, 5, 1.0f, false, 4);
    }
}
