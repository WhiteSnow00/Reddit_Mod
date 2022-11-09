// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

interface ResponseCallback
{
    void onError(final Exception p0);
    
    void onResponse(final Response p0);
}
