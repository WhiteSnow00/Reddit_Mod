// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

import java.nio.ByteBuffer;

interface WriteCallback
{
    void onBuffer(final ByteBuffer p0, final int p1);
    
    void onError(final Exception p0);
}
