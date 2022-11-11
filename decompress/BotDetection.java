// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class BotDetection
{
    public static final a<BotDetection, BotDetection.BotDetection$Builder> ADAPTER;
    public final String provider;
    public final Double recaptcha_score;
    public final String website_action;
    
    static {
        ADAPTER = (a)new BotDetection.BotDetection$BotDetectionAdapter((BotDetection$1)null);
    }
    
    private BotDetection(final BotDetection.BotDetection$Builder botDetection$Builder) {
        this.provider = BotDetection.BotDetection$Builder.access$100(botDetection$Builder);
        this.website_action = BotDetection.BotDetection$Builder.access$200(botDetection$Builder);
        this.recaptcha_score = BotDetection.BotDetection$Builder.access$300(botDetection$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof BotDetection)) {
            return false;
        }
        final BotDetection botDetection = (BotDetection)o;
        final String provider = this.provider;
        final String provider2 = botDetection.provider;
        if (provider == provider2 || (provider != null && provider.equals(provider2))) {
            final String website_action = this.website_action;
            final String website_action2 = botDetection.website_action;
            if (website_action == website_action2 || (website_action != null && website_action.equals(website_action2))) {
                final Double recaptcha_score = this.recaptcha_score;
                final Double recaptcha_score2 = botDetection.recaptcha_score;
                boolean b2 = b;
                if (recaptcha_score == recaptcha_score2) {
                    return b2;
                }
                if (recaptcha_score != null && recaptcha_score.equals(recaptcha_score2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String provider = this.provider;
        int hashCode = 0;
        int hashCode2;
        if (provider == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = provider.hashCode();
        }
        final String website_action = this.website_action;
        int hashCode3;
        if (website_action == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = website_action.hashCode();
        }
        final Double recaptcha_score = this.recaptcha_score;
        if (recaptcha_score != null) {
            hashCode = recaptcha_score.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("BotDetection{provider=");
        k.append(this.provider);
        k.append(", website_action=");
        k.append(this.website_action);
        k.append(", recaptcha_score=");
        k.append(this.recaptcha_score);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        BotDetection.ADAPTER.write(e, (Object)this);
    }
}
