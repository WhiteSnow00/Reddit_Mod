// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.io.IOException;

public interface EventTransform<T>
{
    byte[] toBytes(final T p0) throws IOException;
}
