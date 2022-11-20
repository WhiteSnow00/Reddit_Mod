// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import ij.a;

public class SymbolEntity extends Entity
{
    @a("text")
    public final String text;
    
    public SymbolEntity(final String text, final int n, final int n2) {
        super(n, n2);
        this.text = text;
    }
    
    public /* bridge */ int getEnd() {
        return super.getEnd();
    }
    
    public /* bridge */ int getStart() {
        return super.getStart();
    }
}
