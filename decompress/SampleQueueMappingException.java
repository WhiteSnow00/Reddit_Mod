// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.hls;

import a81.e;
import java.io.IOException;

public final class SampleQueueMappingException extends IOException
{
    public SampleQueueMappingException(final String s) {
        super(a.j(e.h(s, 60), "Unable to bind a sample queue to TrackGroup with mime type ", s, "."));
    }
}
