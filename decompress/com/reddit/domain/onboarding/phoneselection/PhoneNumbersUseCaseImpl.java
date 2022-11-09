// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.onboarding.phoneselection;

import javax.inject.Inject;
import kotlin.a;
import pg2.f;
import android.content.Context;

public final class PhoneNumbersUseCaseImpl
{
    public final Context a;
    public final f b;
    
    @Inject
    public PhoneNumbersUseCaseImpl(final Context a) {
        ah2.f.f((Object)a, "context");
        this.a = a;
        this.b = kotlin.a.b((zg2.a)new PhoneNumbersUseCaseImpl$phoneNumberUtil$2(this));
    }
}
