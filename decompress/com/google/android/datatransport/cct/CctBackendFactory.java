// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.cct;

import ia.d;
import la.k;
import la.f;
import androidx.annotation.Keep;
import la.c;

@Keep
public class CctBackendFactory implements c
{
    public k create(final f f) {
        return (k)new d(f.a(), f.d(), f.c());
    }
}
