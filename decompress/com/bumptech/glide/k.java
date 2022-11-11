// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import i9.c;
import i9.e;

public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType> implements Cloneable
{
    public e<? super TranscodeType> f;
    
    public k() {
        this.f = (e<? super TranscodeType>)c.b;
    }
    
    public final CHILD b() {
        try {
            return (CHILD)super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
