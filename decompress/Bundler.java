// 
// Decompiled by Procyon v0.6.0
// 

package com.evernote.android.state;

import android.os.Bundle;

public interface Bundler<T>
{
    T get(final String p0, final Bundle p1);
    
    void put(final String p0, final T p1, final Bundle p2);
}
