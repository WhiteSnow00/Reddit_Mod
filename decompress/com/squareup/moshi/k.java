// 
// Decompiled by Procyon v0.6.0
// 

package com.squareup.moshi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public final class k extends CollectionJsonAdapter<Collection<Object>, Object>
{
    public k(final JsonAdapter jsonAdapter) {
        super(jsonAdapter, (CollectionJsonAdapter$a)null);
    }
    
    public final Collection<Object> b() {
        return new ArrayList<Object>();
    }
}
