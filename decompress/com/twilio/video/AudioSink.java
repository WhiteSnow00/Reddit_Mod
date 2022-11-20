// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.nio.ByteBuffer;

public interface AudioSink
{
    void renderSample(final ByteBuffer p0, final int p1, final int p2, final int p3);
}
