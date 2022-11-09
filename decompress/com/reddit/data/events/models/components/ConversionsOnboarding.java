// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class ConversionsOnboarding
{
    public static final a<ConversionsOnboarding, ConversionsOnboarding.ConversionsOnboarding$Builder> ADAPTER;
    public final String advertiser_id;
    public final String campaign_goal_cta;
    public final String campaign_goal_objective;
    public final String help_article;
    public final Boolean pixel_cta;
    public final String setup_option;
    public final String setup_step;
    
    static {
        ADAPTER = (a)new ConversionsOnboarding.ConversionsOnboarding$ConversionsOnboardingAdapter((ConversionsOnboarding$1)null);
    }
    
    private ConversionsOnboarding(final ConversionsOnboarding.ConversionsOnboarding$Builder conversionsOnboarding$Builder) {
        this.campaign_goal_objective = ConversionsOnboarding.ConversionsOnboarding$Builder.access$100(conversionsOnboarding$Builder);
        this.campaign_goal_cta = ConversionsOnboarding.ConversionsOnboarding$Builder.access$200(conversionsOnboarding$Builder);
        this.advertiser_id = ConversionsOnboarding.ConversionsOnboarding$Builder.access$300(conversionsOnboarding$Builder);
        this.help_article = ConversionsOnboarding.ConversionsOnboarding$Builder.access$400(conversionsOnboarding$Builder);
        this.setup_step = ConversionsOnboarding.ConversionsOnboarding$Builder.access$500(conversionsOnboarding$Builder);
        this.setup_option = ConversionsOnboarding.ConversionsOnboarding$Builder.access$600(conversionsOnboarding$Builder);
        this.pixel_cta = ConversionsOnboarding.ConversionsOnboarding$Builder.access$700(conversionsOnboarding$Builder);
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
        if (!(o instanceof ConversionsOnboarding)) {
            return false;
        }
        final ConversionsOnboarding conversionsOnboarding = (ConversionsOnboarding)o;
        final String campaign_goal_objective = this.campaign_goal_objective;
        final String campaign_goal_objective2 = conversionsOnboarding.campaign_goal_objective;
        if (campaign_goal_objective == campaign_goal_objective2 || (campaign_goal_objective != null && campaign_goal_objective.equals(campaign_goal_objective2))) {
            final String campaign_goal_cta = this.campaign_goal_cta;
            final String campaign_goal_cta2 = conversionsOnboarding.campaign_goal_cta;
            if (campaign_goal_cta == campaign_goal_cta2 || (campaign_goal_cta != null && campaign_goal_cta.equals(campaign_goal_cta2))) {
                final String advertiser_id = this.advertiser_id;
                final String advertiser_id2 = conversionsOnboarding.advertiser_id;
                if (advertiser_id == advertiser_id2 || (advertiser_id != null && advertiser_id.equals(advertiser_id2))) {
                    final String help_article = this.help_article;
                    final String help_article2 = conversionsOnboarding.help_article;
                    if (help_article == help_article2 || (help_article != null && help_article.equals(help_article2))) {
                        final String setup_step = this.setup_step;
                        final String setup_step2 = conversionsOnboarding.setup_step;
                        if (setup_step == setup_step2 || (setup_step != null && setup_step.equals(setup_step2))) {
                            final String setup_option = this.setup_option;
                            final String setup_option2 = conversionsOnboarding.setup_option;
                            if (setup_option == setup_option2 || (setup_option != null && setup_option.equals(setup_option2))) {
                                final Boolean pixel_cta = this.pixel_cta;
                                final Boolean pixel_cta2 = conversionsOnboarding.pixel_cta;
                                boolean b2 = b;
                                if (pixel_cta == pixel_cta2) {
                                    return b2;
                                }
                                if (pixel_cta != null && pixel_cta.equals(pixel_cta2)) {
                                    b2 = b;
                                    return b2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String campaign_goal_objective = this.campaign_goal_objective;
        int hashCode = 0;
        int hashCode2;
        if (campaign_goal_objective == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = campaign_goal_objective.hashCode();
        }
        final String campaign_goal_cta = this.campaign_goal_cta;
        int hashCode3;
        if (campaign_goal_cta == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = campaign_goal_cta.hashCode();
        }
        final String advertiser_id = this.advertiser_id;
        int hashCode4;
        if (advertiser_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = advertiser_id.hashCode();
        }
        final String help_article = this.help_article;
        int hashCode5;
        if (help_article == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = help_article.hashCode();
        }
        final String setup_step = this.setup_step;
        int hashCode6;
        if (setup_step == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = setup_step.hashCode();
        }
        final String setup_option = this.setup_option;
        int hashCode7;
        if (setup_option == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = setup_option.hashCode();
        }
        final Boolean pixel_cta = this.pixel_cta;
        if (pixel_cta != null) {
            hashCode = pixel_cta.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ConversionsOnboarding{campaign_goal_objective=");
        k.append(this.campaign_goal_objective);
        k.append(", campaign_goal_cta=");
        k.append(this.campaign_goal_cta);
        k.append(", advertiser_id=");
        k.append(this.advertiser_id);
        k.append(", help_article=");
        k.append(this.help_article);
        k.append(", setup_step=");
        k.append(this.setup_step);
        k.append(", setup_option=");
        k.append(this.setup_option);
        k.append(", pixel_cta=");
        k.append(this.pixel_cta);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        ConversionsOnboarding.ADAPTER.write(e, (Object)this);
    }
}
