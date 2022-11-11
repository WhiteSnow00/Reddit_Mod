// 
// Decompiled by Procyon v0.6.0
// 

package com.squareup.moshi;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Set;

public final class l extends CollectionJsonAdapter<Set<Object>, Object>
{
    public l(final JsonAdapter jsonAdapter) {
        super(jsonAdapter, (CollectionJsonAdapter$a)null);
    }
    
    public final Collection b() {
        return new LinkedHashSet();
    }
}
