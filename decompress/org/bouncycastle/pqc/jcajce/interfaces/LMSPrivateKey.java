// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

public interface LMSPrivateKey extends LMSKey, PrivateKey
{
    LMSPrivateKey extractKeyShard(final int p0);
    
    long getIndex();
    
    int getLevels();
    
    long getUsagesRemaining();
}
