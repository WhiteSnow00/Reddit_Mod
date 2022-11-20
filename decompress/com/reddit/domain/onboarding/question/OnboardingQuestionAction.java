// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.onboarding.question;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/onboarding/question/OnboardingQuestionAction;", "", "(Ljava/lang/String;I)V", "ACTION_SKIP", "ACTION_NEXT", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum OnboardingQuestionAction
{
    private static final OnboardingQuestionAction[] $VALUES;
    
    ACTION_NEXT, 
    ACTION_SKIP;
    
    private static final OnboardingQuestionAction[] $values() {
        return new OnboardingQuestionAction[] { OnboardingQuestionAction.ACTION_SKIP, OnboardingQuestionAction.ACTION_NEXT };
    }
    
    static {
        $VALUES = $values();
    }
}
