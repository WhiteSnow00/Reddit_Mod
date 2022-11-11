// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.content.Intent;
import z3.a;

public interface OnNewIntentProvider
{
    void addOnNewIntentListener(final a<Intent> p0);
    
    void removeOnNewIntentListener(final a<Intent> p0);
}
