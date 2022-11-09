// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import ak0.m;
import java.util.ArrayList;

public class MimeMatcher<T>
{
    private final ArrayList<MimeMatcherRule> mRuleMap;
    
    public MimeMatcher() {
        this.mRuleMap = new ArrayList<MimeMatcherRule>();
    }
    
    public void addRule(final String s, final T t) {
        this.mRuleMap.add(new MimeMatcherRule(s, t));
    }
    
    public void clear() {
        this.mRuleMap.clear();
    }
    
    public T match(final String s) {
        for (int size = this.mRuleMap.size(), i = 0; i < size; ++i) {
            final MimeMatcherRule mimeMatcherRule = this.mRuleMap.get(i);
            if (mimeMatcherRule.match(s)) {
                return mimeMatcherRule.getResultIfMatched();
            }
        }
        return null;
    }
    
    public class MimeMatcherRule
    {
        private final boolean mHasWildcard;
        private final String mMatchPrefix;
        private final T mResultIfMatched;
        
        public MimeMatcherRule(final String mMatchPrefix, final T mResultIfMatched) {
            if (mMatchPrefix.endsWith("*")) {
                this.mHasWildcard = true;
                this.mMatchPrefix = mMatchPrefix.substring(0, mMatchPrefix.length() - 1);
            }
            else {
                this.mHasWildcard = false;
                this.mMatchPrefix = mMatchPrefix;
            }
            if (!this.mMatchPrefix.contains("*")) {
                this.mResultIfMatched = mResultIfMatched;
                return;
            }
            throw new IllegalArgumentException(m.l("Multiple wildcards present in rule expression ", mMatchPrefix));
        }
        
        public T getResultIfMatched() {
            return this.mResultIfMatched;
        }
        
        public boolean match(final String s) {
            final boolean startsWith = s.startsWith(this.mMatchPrefix);
            boolean b = false;
            if (!startsWith) {
                return false;
            }
            if (this.mHasWildcard || s.length() == this.mMatchPrefix.length()) {
                b = true;
            }
            return b;
        }
    }
}
