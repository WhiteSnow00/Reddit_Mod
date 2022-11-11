// 
// Decompiled by Procyon v0.6.0
// 

package pc0;

import com.reddit.session.n;
import com.reddit.domain.onboardingflow.OnboardingFlowType;
import com.reddit.domain.onboarding.question.OnboardingSignalType;
import javax.inject.Inject;
import sg2.e;
import us0.j;
import com.reddit.session.p;

public final class d implements c
{
    public final p a;
    public final j b;
    
    @Inject
    public d(final p a, final j b) {
        e.f((Object)a, "sessionView");
        e.f((Object)b, "onboardingSettings");
        this.a = a;
        this.b = b;
    }
    
    public final OnboardingSignalType a() {
        if (this.b.V()) {
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
        final n n = this.a.d().invoke();
        boolean b3 = b2;
        if (n != null) {
            b3 = b2;
            if (n.getCanEditName()) {
                b3 = true;
            }
        }
        return b3;
    }
}
