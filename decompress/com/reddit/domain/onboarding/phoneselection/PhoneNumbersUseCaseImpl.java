// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.onboarding.phoneselection;

import javax.inject.Inject;
import kotlin.a;
import ng2.e;
import cg2.f;
import android.content.Context;

public final class PhoneNumbersUseCaseImpl
{
    public final Context a;
    public final f b;
    
    @Inject
    public PhoneNumbersUseCaseImpl(final Context a) {
        e.f((Object)a, "context");
        this.a = a;
        this.b = kotlin.a.b((mg2.a)new PhoneNumbersUseCaseImpl$phoneNumberUtil$2(this));
    }
}
