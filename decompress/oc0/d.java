// 
// Decompiled by Procyon v0.6.0
// 

package oc0;

import com.reddit.session.m;
import com.reddit.domain.onboardingflow.OnboardingFlowType;
import com.reddit.domain.onboarding.question.OnboardingSignalType;
import javax.inject.Inject;
import ng2.e;
import ws0.k;
import com.reddit.session.o;

public final class d implements c
{
    public final o a;
    public final k b;
    
    @Inject
    public d(final o a, final k b) {
        e.f((Object)a, "sessionView");
        e.f((Object)b, "onboardingSettings");
        this.a = a;
        this.b = b;
    }
    
    public final OnboardingSignalType a() {
        if (this.b.U()) {
            return null;
        }
        return OnboardingSignalType.GENDER;
    }
    
    public final OnboardingSignalType b() {
        return OnboardingSignalType.GENDER;
    }
    
    public final b c(final boolean b) {
        Integer value = 3;
        value.intValue();
        if (!b) {
            value = null;
        }
        return new b(b, false, b ^ true, false, b, (String)null, value, OnboardingFlowType.ONBOARDING, 3456);
    }
    
    public final boolean d(final boolean b) {
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final m m = (m)this.a.d().invoke();
        boolean b3 = b2;
        if (m != null) {
            b3 = b2;
            if (m.getCanEditName()) {
                b3 = true;
            }
        }
        return b3;
    }
}
